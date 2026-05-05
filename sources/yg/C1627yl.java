package yg;

/* JADX INFO: renamed from: yg.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1627yl extends Xu {
    private static final int Kd = 1921;
    private static final int Xd = 127;
    private static final int Yd = 2048;

    @Override // yg.Xu
    public int CK(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return i2 - 127;
    }

    @Override // yg.Xu
    public int RK() {
        return ZN.Xd() ^ 864696689;
    }

    @Override // yg.Xu
    public int fK(int i2) {
        int i3 = i2 % Kd;
        if (i3 == 0) {
            return 0;
        }
        if (i3 < 0) {
            i3 += Kd;
        }
        return i3 + 127;
    }

    @Override // yg.Xu
    public boolean zK(int i2) {
        return i2 >= 0 && (i2 <= 0 || i2 >= (C1499aX.Xd() ^ (-1134258068))) && i2 < (1060655601 ^ 1060657649);
    }
}
