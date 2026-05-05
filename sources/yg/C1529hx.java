package yg;

import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: yg.hx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1529hx implements DebugMetadata {
    private DebugMetadata Lx;

    public C1529hx(DebugMetadata debugMetadata) {
        this.Lx = debugMetadata;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return DebugMetadata.class;
    }

    @Override // kotlin.coroutines.jvm.internal.DebugMetadata
    public String c() {
        String strC = this.Lx.c();
        short sXd = (short) (OY.Xd() ^ ((463571057 ^ 1055008291) ^ 625202126));
        short sXd2 = (short) (OY.Xd() ^ (1343024226 ^ 1343018058));
        int[] iArr = new int[strC.length()];
        QB qb = new QB(strC);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // kotlin.coroutines.jvm.internal.DebugMetadata
    public String f() {
        String strF = this.Lx.f();
        short sXd = (short) (ZN.Xd() ^ ((81830360 ^ 54985734) ^ 128419377));
        int[] iArr = new int[strF.length()];
        QB qb = new QB(strF);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // kotlin.coroutines.jvm.internal.DebugMetadata
    public int[] i() {
        return this.Lx.i();
    }

    @Override // kotlin.coroutines.jvm.internal.DebugMetadata
    public int[] l() {
        return this.Lx.l();
    }

    @Override // kotlin.coroutines.jvm.internal.DebugMetadata
    public String m() {
        String strM = this.Lx.m();
        short sXd = (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134255772)));
        int[] iArr = new int[strM.length()];
        QB qb = new QB(strM);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // kotlin.coroutines.jvm.internal.DebugMetadata
    public String[] n() {
        String[] strArrN = this.Lx.n();
        int length = strArrN.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrN[i2];
            int iXd = OY.Xd() ^ (1569222963 ^ (-1503857674));
            int iXd2 = C1607wl.Xd() ^ (-1849977315);
            short sXd = (short) (C1580rY.Xd() ^ iXd);
            short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.DebugMetadata
    public String[] s() {
        String[] strArrS = this.Lx.s();
        int length = strArrS.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrS[i2];
            short sXd = (short) (C1580rY.Xd() ^ ((1888858218 ^ 1051910503) ^ (-1311187314)));
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.DebugMetadata
    public int v() {
        return this.Lx.v();
    }
}
