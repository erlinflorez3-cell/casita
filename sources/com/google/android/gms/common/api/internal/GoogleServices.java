package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzah;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class GoogleServices {
    private static final Object zza = new Object();
    private static GoogleServices zzb = null;
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    GoogleServices(Context context) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-1801));
        short sXd2 = (short) (Od.Xd() ^ (-24670));
        int[] iArr = new int["s\u007ft\u0002}vp9mxv{ksx1Epnscup".length()];
        QB qb = new QB("s\u007ft\u0002}vp9mxv{ksx1Epnscup");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("|y\bdv\u0004~\u0004\u007fop}", (short) (FB.Xd() ^ 14227), (short) (FB.Xd() ^ 22683)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            String strUd = C1561oA.ud("NUTKOG@AON<I@;LMI;B9AF05=//80", (short) (OY.Xd() ^ 18067));
            short sXd3 = (short) (C1607wl.Xd() ^ 19872);
            int[] iArr2 = new int["\"(+\u001d$#-".length()];
            QB qb2 = new QB("\"(+\u001d$#-");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                i3++;
            }
            int identifier = resources.getIdentifier(strUd, new String(iArr2, 0, i3), resourcePackageName);
            if (identifier != 0) {
                int integer = resources.getInteger(identifier);
                boolean z2 = integer == 0;
                z = integer != 0;
                this.zzf = z2;
            } else {
                this.zzf = false;
            }
            this.zze = z;
            String strZzb = zzah.zzb(context);
            strZzb = strZzb == null ? new StringResourceValueReader(context).getString(C1561oA.Yd("enohnhcfvwgrn", (short) (C1580rY.Xd() ^ (-14823)))) : strZzb;
            if (TextUtils.isEmpty(strZzb)) {
                this.zzd = new Status(10, Xg.qd("*GRSJPJ\u0004LUVOUO\u000bM]^\u000fYU\u0012iUak\\\u0018_lji\u001ddqon\"vxwouo)|p\u007f|\u0004\u0002sv\u00063\f~\u000b\u007f8\b{\t\u0002=\u0006\u000f\u0010\t\u000f\t\u0004\u0007\u0017\u0018\b\u0013\u000fY", (short) (Od.Xd() ^ (-5291)), (short) (Od.Xd() ^ (-30157))));
                this.zzc = null;
            } else {
                this.zzc = strZzb;
                this.zzd = Status.RESULT_SUCCESS;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    GoogleServices(String str, boolean z2) {
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z2;
        this.zzf = !z2;
    }

    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        synchronized (zza) {
            googleServices = zzb;
            if (googleServices == null) {
                throw new IllegalStateException("Initialize must be called before " + str + ".");
            }
        }
        return googleServices;
    }

    static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    public static Status initialize(Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (zza) {
            if (zzb == null) {
                zzb = new GoogleServices(context);
            }
            status = zzb.zzd;
        }
        return status;
    }

    public static Status initialize(Context context, String str, boolean z2) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (zza) {
            GoogleServices googleServices = zzb;
            if (googleServices != null) {
                return googleServices.checkGoogleAppId(str);
            }
            GoogleServices googleServices2 = new GoogleServices(str, z2);
            zzb = googleServices2;
            return googleServices2.zzd;
        }
    }

    public static boolean isMeasurementEnabled() {
        GoogleServices googleServicesCheckInitialized = checkInitialized("isMeasurementEnabled");
        return googleServicesCheckInitialized.zzd.isSuccess() && googleServicesCheckInitialized.zze;
    }

    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    Status checkGoogleAppId(String str) {
        String str2 = this.zzc;
        if (str2 == null || str2.equals(str)) {
            return Status.RESULT_SUCCESS;
        }
        return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + this.zzc + "'.");
    }
}
