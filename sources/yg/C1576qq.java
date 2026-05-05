package yg;

import javax.annotation.Syntax;
import javax.annotation.meta.When;

/* JADX INFO: renamed from: yg.qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1576qq implements Syntax {
    private Syntax gq;

    public C1576qq(Syntax syntax) {
        this.gq = syntax;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Syntax.class;
    }

    @Override // javax.annotation.Syntax
    public String value() {
        String strValue = this.gq.value();
        int iXd = C1607wl.Xd() ^ (2010031416 ^ (-428513064));
        int iXd2 = C1499aX.Xd() ^ (6737474 ^ 1140715515);
        short sXd = (short) (Od.Xd() ^ iXd);
        short sXd2 = (short) (Od.Xd() ^ iXd2);
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // javax.annotation.Syntax
    public When when() {
        return this.gq.when();
    }
}
