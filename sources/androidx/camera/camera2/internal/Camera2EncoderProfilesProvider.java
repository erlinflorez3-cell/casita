package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.compat.EncoderProfilesProxyCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Camera2EncoderProfilesProvider implements EncoderProfilesProvider {
    private static final String TAG = "Camera2EncoderProfilesProvider";
    private final String mCameraId;
    private final Quirks mCameraQuirks;
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final boolean mHasValidCameraId;
    private final int mIntCameraId;

    public Camera2EncoderProfilesProvider(String str, Quirks quirks) {
        boolean z2;
        int i2;
        this.mCameraId = str;
        try {
            i2 = Integer.parseInt(str);
            z2 = true;
        } catch (NumberFormatException unused) {
            Logger.w(TAG, "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z2 = false;
            i2 = -1;
        }
        this.mHasValidCameraId = z2;
        this.mIntCameraId = i2;
        this.mCameraQuirks = quirks;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i2) {
        return this.mHasValidCameraId && getAll(i2) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i2) {
        EncoderProfilesProxy encoderProfilesProxyFindLowestQualityProfiles = null;
        if (!this.mHasValidCameraId || !CamcorderProfile.hasProfile(this.mIntCameraId, i2)) {
            return null;
        }
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i2))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i2));
        }
        EncoderProfilesProxy profilesInternal = getProfilesInternal(i2);
        if (profilesInternal == null || isEncoderProfilesResolutionValidInQuirk(profilesInternal)) {
            encoderProfilesProxyFindLowestQualityProfiles = profilesInternal;
        } else if (i2 == 1) {
            encoderProfilesProxyFindLowestQualityProfiles = findHighestQualityProfiles();
        } else if (i2 == 0) {
            encoderProfilesProxyFindLowestQualityProfiles = findLowestQualityProfiles();
        }
        this.mEncoderProfilesCache.put(Integer.valueOf(i2), encoderProfilesProxyFindLowestQualityProfiles);
        return encoderProfilesProxyFindLowestQualityProfiles;
    }

    private EncoderProfilesProxy findHighestQualityProfiles() {
        Iterator<Integer> it = QUALITY_HIGH_TO_LOW.iterator();
        while (it.hasNext()) {
            EncoderProfilesProxy all = getAll(it.next().intValue());
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    private EncoderProfilesProxy findLowestQualityProfiles() {
        for (int size = QUALITY_HIGH_TO_LOW.size() - 1; size >= 0; size--) {
            EncoderProfilesProxy all = getAll(size);
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    private EncoderProfilesProxy getProfilesInternal(int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles all = Api31Impl.getAll(this.mCameraId, i2);
            if (all == null) {
                return null;
            }
            if (DeviceQuirks.get(InvalidVideoProfilesQuirk.class) != null) {
                Logger.d(TAG, "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return EncoderProfilesProxyCompat.from(all);
                } catch (NullPointerException e2) {
                    Logger.w(TAG, "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e2);
                }
            }
        }
        return createProfilesFromCamcorderProfile(i2);
    }

    private EncoderProfilesProxy createProfilesFromCamcorderProfile(int i2) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.mIntCameraId, i2);
        } catch (RuntimeException e2) {
            Logger.w(TAG, "Unable to get CamcorderProfile by quality: " + i2, e2);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return EncoderProfilesProxyCompat.from(camcorderProfile);
        }
        return null;
    }

    private boolean isEncoderProfilesResolutionValidInQuirk(EncoderProfilesProxy encoderProfilesProxy) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.mCameraQuirks.get(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = encoderProfilesProxy.getVideoProfiles();
        if (videoProfiles.isEmpty()) {
            return true;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = videoProfiles.get(0);
        return camcorderProfileResolutionQuirk.getSupportedResolutions().contains(new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight()));
    }

    static class Api31Impl {
        static EncoderProfiles getAll(String str, int i2) {
            return CamcorderProfile.getAll(str, i2);
        }

        private Api31Impl() {
        }
    }
}
