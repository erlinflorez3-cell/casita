package yg;

import retrofit2.http.GET;

/* JADX INFO: loaded from: classes9.dex */
public class cq implements GET {
    private GET Wq;

    public cq(GET get) {
        this.Wq = get;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return GET.class;
    }

    @Override // retrofit2.http.GET
    public String value() {
        String strValue = this.Wq.value();
        short sXd = (short) (ZN.Xd() ^ (ZN.Xd() ^ 864712422));
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
