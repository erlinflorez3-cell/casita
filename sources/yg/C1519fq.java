package yg;

import org.checkerframework.framework.qual.QualifierArgument;

/* JADX INFO: renamed from: yg.fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1519fq implements QualifierArgument {
    private QualifierArgument tq;

    public C1519fq(QualifierArgument qualifierArgument) {
        this.tq = qualifierArgument;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return QualifierArgument.class;
    }

    @Override // org.checkerframework.framework.qual.QualifierArgument
    public String value() {
        String strValue = this.tq.value();
        short sXd = (short) (Od.Xd() ^ (OY.Xd() ^ (748161559 ^ (-682847809))));
        short sXd2 = (short) (Od.Xd() ^ (732869485 ^ (-732862913)));
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
