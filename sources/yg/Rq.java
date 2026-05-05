package yg;

import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.QualifierForLiterals;

/* JADX INFO: loaded from: classes9.dex */
public class Rq implements QualifierForLiterals {
    private QualifierForLiterals Yq;

    public Rq(QualifierForLiterals qualifierForLiterals) {
        this.Yq = qualifierForLiterals;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return QualifierForLiterals.class;
    }

    @Override // org.checkerframework.framework.qual.QualifierForLiterals
    public String[] stringPatterns() {
        String[] strArrStringPatterns = this.Yq.stringPatterns();
        int length = strArrStringPatterns.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrStringPatterns[i2];
            int iXd = C1607wl.Xd() ^ (1926665590 ^ (-479392004));
            short sXd = (short) (C1499aX.Xd() ^ ((992551762 ^ 1694233898) ^ (-1607662681)));
            short sXd2 = (short) (C1499aX.Xd() ^ iXd);
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }

    @Override // org.checkerframework.framework.qual.QualifierForLiterals
    public LiteralKind[] value() {
        return this.Yq.value();
    }
}
