package o.du;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes6.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23351a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f23352b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23353c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23354d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23355e = 0;

    static {
        c();
        ViewConfiguration.getScrollFriction();
        int i2 = f23355e + 47;
        f23353c = i2 % 128;
        int i3 = i2 % 2;
    }

    c() {
    }

    static void c() {
        f23352b = new int[]{1178102747, -1529267285, -1047712354, 799438973, 1947252962, -648040905, -1767799441, 581804036, -1549073527, 709039242, -176814630, -758868249, -958974817, -1816218833, 715396435, -21014859, 1162260260, 1437524068};
    }

    @Override // o.du.a
    public final h b() {
        int i2 = 2 % 2;
        int i3 = f23351a + 29;
        f23354d = i3 % 128;
        int i4 = i3 % 2;
        h hVar = h.f23367b;
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
        return hVar;
    }
}
