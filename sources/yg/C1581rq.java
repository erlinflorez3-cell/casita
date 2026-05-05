package yg;

import retrofit2.http.Header;

/* JADX INFO: renamed from: yg.rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1581rq implements Header {
    private Header Uq;

    public C1581rq(Header header) {
        this.Uq = header;
    }

    @Override // retrofit2.http.Header
    public boolean allowUnsafeNonAsciiValues() {
        return this.Uq.allowUnsafeNonAsciiValues();
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Header.class;
    }

    @Override // retrofit2.http.Header
    public String value() {
        String strValue = this.Uq.value();
        short sXd = (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (1015497672 ^ 1222006669)));
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
