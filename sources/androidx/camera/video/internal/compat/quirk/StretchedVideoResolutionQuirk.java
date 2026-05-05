package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;

/* JADX INFO: loaded from: classes.dex */
public class StretchedVideoResolutionQuirk implements Quirk {
    static boolean load() {
        return isMotoE5Play();
    }

    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public Size getAlternativeResolution(int i2) {
        if (i2 == 4) {
            return new Size(OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, 480);
        }
        if (i2 == 5) {
            return new Size(960, 720);
        }
        if (i2 != 6) {
            return null;
        }
        return new Size(1440, PhotoshopDirectory.TAG_COUNT_INFORMATION);
    }
}
