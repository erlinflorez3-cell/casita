package yg;

import retrofit2.http.Headers;

/* JADX INFO: renamed from: yg.Qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1494Qq implements Headers {
    private Headers Gq;

    public C1494Qq(Headers headers) {
        this.Gq = headers;
    }

    @Override // retrofit2.http.Headers
    public boolean allowUnsafeNonAsciiValues() {
        return this.Gq.allowUnsafeNonAsciiValues();
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Headers.class;
    }

    @Override // retrofit2.http.Headers
    public String[] value() {
        String[] strArrValue = this.Gq.value();
        int length = strArrValue.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrValue[i2];
            short sXd = (short) (Od.Xd() ^ (52718269 ^ (-52714939)));
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }
}
