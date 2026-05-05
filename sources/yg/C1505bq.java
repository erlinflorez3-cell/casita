package yg;

import retrofit2.http.Part;

/* JADX INFO: renamed from: yg.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1505bq implements Part {
    private Part Pq;

    public C1505bq(Part part) {
        this.Pq = part;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Part.class;
    }

    @Override // retrofit2.http.Part
    public String encoding() {
        String strEncoding = this.Pq.encoding();
        short sXd = (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849976114)));
        short sXd2 = (short) (C1499aX.Xd() ^ (1615845905 ^ (-1615835642)));
        int[] iArr = new int[strEncoding.length()];
        QB qb = new QB(strEncoding);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // retrofit2.http.Part
    public String value() {
        String strValue = this.Pq.value();
        short sXd = (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (1156427360 ^ (-715779825))));
        short sXd2 = (short) (C1633zX.Xd() ^ ((1035080495 ^ 1920204701) ^ (-1338097123)));
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
