package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.dynatrace.android.agent.AdkSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements Quirk {
    private static final String TAG = "ExcludedSupportedSizesQuirk";
    private static final int UNKNOWN_IMAGE_FORMAT = -1;

    static boolean load() {
        return isOnePlus6() || isOnePlus6T() || isHuaweiP20Lite() || isSamsungJ7PrimeApi27Above() || isSamsungJ7Api27Above() || isRedmiNote9Pro();
    }

    private static boolean isOnePlus6() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isOnePlus6T() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isHuaweiP20Lite() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isSamsungJ7PrimeApi27Above() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean isSamsungJ7Api27Above() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean isRedmiNote9Pro() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    public List<Size> getExcludedSizes(String str, int i2) {
        if (isOnePlus6()) {
            return getOnePlus6ExcludedSizes(str, i2);
        }
        if (isOnePlus6T()) {
            return getOnePlus6TExcludedSizes(str, i2);
        }
        if (isHuaweiP20Lite()) {
            return getHuaweiP20LiteExcludedSizes(str, i2, null);
        }
        if (isSamsungJ7PrimeApi27Above()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, i2, null);
        }
        if (isSamsungJ7Api27Above()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, i2, null);
        }
        if (isRedmiNote9Pro()) {
            return getRedmiNote9ProExcludedSizes(str, i2);
        }
        Logger.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }

    public List<Size> getExcludedSizes(String str, Class<?> cls) {
        if (isHuaweiP20Lite()) {
            return getHuaweiP20LiteExcludedSizes(str, -1, cls);
        }
        if (isSamsungJ7PrimeApi27Above()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, -1, cls);
        }
        if (isSamsungJ7Api27Above()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, -1, cls);
        }
        Logger.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }

    private List<Size> getOnePlus6ExcludedSizes(String str, int i2) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(AdkSettings.PLATFORM_TYPE_MOBILE) && i2 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List<Size> getOnePlus6TExcludedSizes(String str, int i2) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(AdkSettings.PLATFORM_TYPE_MOBILE) && i2 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List<Size> getHuaweiP20LiteExcludedSizes(String str, int i2, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(AdkSettings.PLATFORM_TYPE_MOBILE) && (i2 == 34 || i2 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    private List<Size> getSamsungJ7PrimeApi27AboveExcludedSizes(String str, int i2, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(AdkSettings.PLATFORM_TYPE_MOBILE)) {
            if (i2 != 34 && cls == null) {
                if (i2 == 35) {
                    arrayList.add(new Size(4128, 2322));
                    arrayList.add(new Size(3088, 3088));
                    arrayList.add(new Size(3264, 2448));
                    arrayList.add(new Size(3264, 1836));
                    arrayList.add(new Size(2048, 1536));
                    arrayList.add(new Size(2048, 1152));
                    arrayList.add(new Size(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION));
                }
            } else {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION));
            }
        } else if (str.equals("1") && (i2 == 34 || i2 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION));
        }
        return arrayList;
    }

    private List<Size> getSamsungJ7Api27AboveExcludedSizes(String str, int i2, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(AdkSettings.PLATFORM_TYPE_MOBILE)) {
            if (i2 != 34 && cls == null) {
                if (i2 == 35) {
                    arrayList.add(new Size(2048, 1536));
                    arrayList.add(new Size(2048, 1152));
                    arrayList.add(new Size(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION));
                }
            } else {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION));
            }
        } else if (str.equals("1") && (i2 == 34 || i2 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION));
        }
        return arrayList;
    }

    private List<Size> getRedmiNote9ProExcludedSizes(String str, int i2) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(AdkSettings.PLATFORM_TYPE_MOBILE) && i2 == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }
}
