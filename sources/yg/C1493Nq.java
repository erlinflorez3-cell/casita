package yg;

import retrofit2.http.Path;

/* JADX INFO: renamed from: yg.Nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1493Nq implements Path {
    private Path nq;

    public C1493Nq(Path path) {
        this.nq = path;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Path.class;
    }

    @Override // retrofit2.http.Path
    public boolean encoded() {
        return this.nq.encoded();
    }

    @Override // retrofit2.http.Path
    public String value() {
        String strValue = this.nq.value();
        short sXd = (short) (C1607wl.Xd() ^ (994936462 ^ 994943333));
        short sXd2 = (short) (C1607wl.Xd() ^ ((198751064 ^ 1319084865) ^ 1162297991));
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
}
