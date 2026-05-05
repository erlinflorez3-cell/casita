package yg;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yg.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1504bX implements AutoCloseable {
    private AY Kd;
    private final String Qd;
    private AY Xd;
    private C1590uX Yd;
    private C1590uX od;
    private C1590uX ud;
    private final C1538jN vd;
    private final VF wd;
    private final List<IY> yd = new ArrayList();

    public C1504bX(String str) throws IOException {
        this.Qd = str;
        this.wd = new VF(new File(this.Qd));
        this.vd = new C1538jN(this.wd);
        this.wd.seek(this.vd.Qd);
        for (int i2 = 0; i2 < this.vd.kd; i2++) {
            this.yd.add(new IY(this.wd));
        }
        this.ud = new C1590uX(eY(this.yd.get(this.vd.zd)));
        for (IY iy : this.yd) {
            switch (NF.Xd[EnumC1621yK.Xd(iy.ud).ordinal()]) {
                case 1:
                    this.Xd = new AY(eY(iy), (int) (iy.Od / iy.yd), this.wd.oX(), this.wd.uX());
                    break;
                case 2:
                    this.Kd = new AY(eY(iy), (int) (iy.Od / iy.yd), this.wd.oX(), this.wd.uX());
                    break;
                case 3:
                    String strLY = this.ud.LY(iy.Yd);
                    short sXd = (short) (ZN.Xd() ^ (FB.Xd() ^ 1609504489));
                    short sXd2 = (short) (ZN.Xd() ^ (547223387 ^ 547192836));
                    int[] iArr = new int["8||yzff".length()];
                    QB qb = new QB("8||yzff");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
                        i3++;
                    }
                    if (strLY.equals(new String(iArr, 0, i3))) {
                        this.od = new C1590uX(eY(iy));
                    }
                    if (strLY.equals(hg.Vd("Y\u000f#\u0017\u001b\u001b\u0018", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (937360987 ^ 1133484997))), (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (520860649 ^ (-746693428))))))) {
                        this.Yd = new C1590uX(eY(iy));
                    }
                    break;
            }
        }
    }

    private UF Kd(String str, AY ay, C1590uX c1590uX) throws IOException {
        if (ay == null || c1590uX == null) {
            return null;
        }
        for (UF uf : ay.Xd) {
            String strLY = c1590uX.LY(uf.Xd);
            if (strLY != null && strLY.equals(str)) {
                return uf;
            }
        }
        return null;
    }

    private UF Xd(String str) throws IOException {
        UF ufKd = Kd(str, this.Xd, this.Yd);
        return ufKd != null ? ufKd : Kd(str, this.Kd, this.od);
    }

    public boolean EK() {
        return this.wd.oX();
    }

    public boolean JK() {
        return this.wd.uX();
    }

    public int TK() {
        return this.wd.oX() ? 2026794401 ^ 2026794409 : (2063616123 ^ 2109802618) ^ 113328133;
    }

    public long ZK(String str) throws IOException {
        UF ufXd = Xd(str);
        if (ufXd == null) {
            return 0L;
        }
        return ufXd.Kd;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        try {
            this.wd.close();
        } catch (IOException e2) {
        }
    }

    public byte[] eY(IY iy) throws IOException {
        byte[] bArr = new byte[(int) iy.Od];
        this.wd.seek(iy.vd);
        if (this.wd.read(bArr) == iy.Od) {
            return bArr;
        }
        throw new IOException(C1561oA.ud(";U\\^VT\u000fb\\\f[K[[L\u0006XIFVJOM}A=O;", (short) (C1499aX.Xd() ^ (681842959 ^ (-681862219)))));
    }

    public IY nK(String str) throws IOException {
        for (IY iy : this.yd) {
            String strLY = this.ud.LY(iy.Yd);
            if (strLY != null && strLY.equals(str)) {
                return iy;
            }
        }
        return null;
    }
}
