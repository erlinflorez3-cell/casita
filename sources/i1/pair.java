package i1;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pair {
    public static String a() {
        String str = Build.HARDWARE;
        return str == null ? "" : str;
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
