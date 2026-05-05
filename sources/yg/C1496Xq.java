package yg;

import javax.inject.Named;

/* JADX INFO: renamed from: yg.Xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1496Xq implements Named {
    private Named oq;

    public C1496Xq(Named named) {
        this.oq = named;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Named.class;
    }

    @Override // javax.inject.Named
    public String value() {
        String strValue = this.oq.value();
        short sXd = (short) (FB.Xd() ^ (FB.Xd() ^ (1175324618 ^ 434190047)));
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
