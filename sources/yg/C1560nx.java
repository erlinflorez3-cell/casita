package yg;

import kotlin.Metadata;

/* JADX INFO: renamed from: yg.nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1560nx implements Metadata {
    private Metadata Jx;

    public C1560nx(Metadata metadata) {
        this.Jx = metadata;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Metadata.class;
    }

    @Override // kotlin.Metadata
    public int[] bv() {
        return this.Jx.bv();
    }

    @Override // kotlin.Metadata
    public String[] d1() {
        String[] strArrD1 = this.Jx.d1();
        int length = strArrD1.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrD1[i2];
            short sXd = (short) (Od.Xd() ^ (731895255 ^ (-731896140)));
            short sXd2 = (short) (Od.Xd() ^ (631685809 ^ (-631676876)));
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }

    @Override // kotlin.Metadata
    public String[] d2() {
        String[] strArrD2 = this.Jx.d2();
        int length = strArrD2.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrD2[i2];
            short sXd = (short) (C1580rY.Xd() ^ (Od.Xd() ^ (307774002 ^ (-1436921355))));
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }

    @Override // kotlin.Metadata
    public int k() {
        return this.Jx.k();
    }

    @Override // kotlin.Metadata
    public int[] mv() {
        return this.Jx.mv();
    }

    @Override // kotlin.Metadata
    public String pn() {
        String strPn = this.Jx.pn();
        short sXd = (short) (OY.Xd() ^ ((1891399548 ^ 2053714577) ^ 181755786));
        int[] iArr = new int[strPn.length()];
        QB qb = new QB(strPn);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // kotlin.Metadata
    public int xi() {
        return this.Jx.xi();
    }

    @Override // kotlin.Metadata
    public String xs() {
        String strXs = this.Jx.xs();
        short sXd = (short) (FB.Xd() ^ ((501492935 ^ 1024935968) ^ 552803895));
        int[] iArr = new int[strXs.length()];
        QB qb = new QB(strXs);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
