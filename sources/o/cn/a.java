package o.cn;

import android.os.Process;
import o.et.g;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f22489a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f22490b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22491c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f22492d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22493e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22494f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22495h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22496j = 0;

    static {
        b();
        Process.getThreadPriority(0);
        int i2 = f22495h + 107;
        f22496j = i2 % 128;
        int i3 = i2 % 2;
    }

    static void b() {
        f22489a = new char[]{2129, 2110, 2095, 2092, 2094, 2097, 2111, 2117, 2109, 2108, 2112, 2083, 2106, 2105, 2084, 2126};
        f22491c = 2040400272;
        f22490b = true;
        f22492d = true;
    }

    @Override // o.cn.b
    public final g e(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        g gVar = new g(str, str2, i2, str3);
        int i4 = f22493e + 81;
        f22494f = i4 % 128;
        int i5 = i4 % 2;
        return gVar;
    }
}
