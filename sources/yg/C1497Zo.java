package yg;

/* JADX INFO: renamed from: yg.Zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1497Zo extends Xu {
    private static final int Qd = 65536;
    private static final int od = 63488;
    private static final int ud = 2048;

    private static int Kd(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 < 0 ? i4 + i3 : i4;
    }

    @Override // yg.Xu
    public int CK(int i2) {
        return i2 - 2048;
    }

    @Override // yg.Xu
    public int RK() {
        return (235620840 ^ 303395234) ^ 471777354;
    }

    @Override // yg.Xu
    public int fK(int i2) {
        return Kd(i2, ZN.Xd() ^ (1731455452 ^ 1421422380)) + 2048;
    }

    @Override // yg.Xu
    public boolean zK(int i2) {
        return i2 >= ((1265955740 ^ 236007537) ^ 1164299245) && i2 < ((1923314300 ^ 84049402) ^ 2006978438);
    }
}
