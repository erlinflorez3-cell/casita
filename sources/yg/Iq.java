package yg;

import retrofit2.http.POST;

/* JADX INFO: loaded from: classes9.dex */
public class Iq implements POST {
    private POST yq;

    public Iq(POST post) {
        this.yq = post;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return POST.class;
    }

    @Override // retrofit2.http.POST
    public String value() {
        String strValue = this.yq.value();
        short sXd = (short) (ZN.Xd() ^ ((54687436 ^ 1863973422) ^ 1817951144));
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
