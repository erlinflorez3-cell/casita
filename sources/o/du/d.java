package o.du;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes6.dex */
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23356a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f23357b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23358c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23359d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23360e = 0;

    static {
        e();
        KeyEvent.getModifierMetaStateMask();
        int i2 = f23360e + 111;
        f23356a = i2 % 128;
        int i3 = i2 % 2;
    }

    d() {
    }

    static void e() {
        f23357b = new int[]{-1662640172, -1523843453, 2062785849, -1981731748, -192352141, 358878455, 654762343, 644336191, 1398573596, 1179443542, -1722761533, 1465631259, -864769645, 1569230049, 773677704, 133006998, -439759378, 1494725232};
    }

    @Override // o.du.a
    public final h b() {
        int i2 = 2 % 2;
        int i3 = f23359d + 89;
        f23358c = i3 % 128;
        int i4 = i3 % 2;
        h hVar = h.f23368c;
        int i5 = f23358c + 37;
        f23359d = i5 % 128;
        if (i5 % 2 != 0) {
            return hVar;
        }
        throw null;
    }
}
