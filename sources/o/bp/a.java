package o.bp;

import android.content.Context;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.huawei.hms.api.HuaweiApiAvailability;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21493b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21494d = 0;

    public static int b(Context context) {
        int i2 = 2 % 2;
        int i3 = f21494d;
        int i4 = ((i3 + 37) - (37 | i3)) + ((i3 + 37) - (i3 & 37));
        f21493b = i4 % 128;
        int i5 = i4 % 2;
        int iIsHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context);
        int i6 = f21493b;
        int i7 = (i6 & PanasonicMakernoteDirectory.TAG_BURST_SPEED) + ((-1) - (((-1) - i6) & ((-1) - PanasonicMakernoteDirectory.TAG_BURST_SPEED)));
        f21494d = i7 % 128;
        int i8 = i7 % 2;
        return iIsHuaweiMobileServicesAvailable;
    }
}
