package yg;

import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes9.dex */
public class Oq implements Immutable {
    private Immutable jq;

    public Oq(Immutable immutable) {
        this.jq = immutable;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Immutable.class;
    }

    @Override // com.google.errorprone.annotations.Immutable
    public String[] containerOf() {
        String[] strArrContainerOf = this.jq.containerOf();
        int length = strArrContainerOf.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrContainerOf[i2];
            int iXd = C1580rY.Xd() ^ 831066254;
            int iXd2 = C1499aX.Xd() ^ (1457950109 ^ 360555069);
            short sXd = (short) (C1580rY.Xd() ^ iXd);
            short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }
}
