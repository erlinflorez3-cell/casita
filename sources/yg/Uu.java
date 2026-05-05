package yg;

/* JADX INFO: loaded from: classes.dex */
public final class Uu extends Xu {
    private static final int Qd = 128;
    private static final int od = 127;
    private static final int ud = 1;

    @Override // yg.Xu
    public int CK(int i2) {
        return i2 - 1;
    }

    @Override // yg.Xu
    public int RK() {
        return 843528039 ^ 843527960;
    }

    @Override // yg.Xu
    public int fK(int i2) {
        int i3 = i2 % 127;
        if (i3 < 0) {
            i3 += 127;
        }
        return i3 + 1;
    }

    @Override // yg.Xu
    public boolean zK(int i2) {
        return i2 >= 1 && i2 < (C1580rY.Xd() ^ (-831067295));
    }
}
