package yg;

import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: loaded from: classes9.dex */
public class Zq implements DoNotMock {
    private DoNotMock Cq;

    public Zq(DoNotMock doNotMock) {
        this.Cq = doNotMock;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return DoNotMock.class;
    }

    @Override // com.google.errorprone.annotations.DoNotMock
    public String value() {
        String strValue = this.Cq.value();
        short sXd = (short) (OY.Xd() ^ ((826424162 ^ 1464067694) ^ 1711406290));
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
