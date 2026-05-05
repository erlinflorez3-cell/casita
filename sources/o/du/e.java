package o.du;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes6.dex */
final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23361a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f23362b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23363c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23364d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23365e = 1;

    static {
        d();
        ViewConfiguration.getGlobalActionKeyTimeout();
        int i2 = f23361a + 9;
        f23364d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    e() {
    }

    static void d() {
        f23362b = -5014718685470023335L;
    }

    @Override // o.du.a
    public final h b() {
        int i2 = 2 % 2;
        int i3 = f23363c + 115;
        f23365e = i3 % 128;
        int i4 = i3 % 2;
        h hVar = h.f23366a;
        int i5 = f23365e + 11;
        f23363c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return hVar;
    }
}
