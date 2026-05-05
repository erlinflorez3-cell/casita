package yg;

import androidx.annotation.ReplaceWith;

/* JADX INFO: renamed from: yg.kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1550kq implements ReplaceWith {
    private ReplaceWith Kq;

    public C1550kq(ReplaceWith replaceWith) {
        this.Kq = replaceWith;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return ReplaceWith.class;
    }

    @Override // androidx.annotation.ReplaceWith
    public String expression() {
        String strExpression = this.Kq.expression();
        short sXd = (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849971636));
        short sXd2 = (short) (C1607wl.Xd() ^ (489071426 ^ 489086487));
        int[] iArr = new int[strExpression.length()];
        QB qb = new QB(strExpression);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // androidx.annotation.ReplaceWith
    public String[] imports() {
        String[] strArrImports = this.Kq.imports();
        int length = strArrImports.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrImports[i2];
            short sXd = (short) (OY.Xd() ^ (C1633zX.Xd() ^ (1278399423 ^ (-946062785))));
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
}
