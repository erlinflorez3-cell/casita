package yg;

/* JADX INFO: loaded from: classes.dex */
public abstract class Xu {
    public static final Xu Kd = new Uu();
    public static final Xu Xd = new C1627yl();
    public static final Xu Yd = new C1497Zo();

    public static Xu Xd(int i2) {
        if (i2 == 0) {
            return Xd;
        }
        int iXd = C1580rY.Xd() ^ (-831122463);
        return (iXd + i2) - (iXd | i2) != 0 ? Yd : (-1) - (((-1) - i2) | ((-1) - 1920)) != 0 ? Xd : Kd;
    }

    public abstract int CK(int i2);

    public abstract int RK();

    public abstract int fK(int i2);

    public abstract boolean zK(int i2);
}
