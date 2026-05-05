package yg;

import kotlin.DeprecatedSinceKotlin;

/* JADX INFO: loaded from: classes9.dex */
public class Jq implements DeprecatedSinceKotlin {
    private DeprecatedSinceKotlin Fq;

    public Jq(DeprecatedSinceKotlin deprecatedSinceKotlin) {
        this.Fq = deprecatedSinceKotlin;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return DeprecatedSinceKotlin.class;
    }

    @Override // kotlin.DeprecatedSinceKotlin
    public String errorSince() {
        String strErrorSince = this.Fq.errorSince();
        int iXd = ZN.Xd() ^ 864687409;
        short sXd = (short) (ZN.Xd() ^ (817619989 ^ 817600711));
        short sXd2 = (short) (ZN.Xd() ^ iXd);
        int[] iArr = new int[strErrorSince.length()];
        QB qb = new QB(strErrorSince);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // kotlin.DeprecatedSinceKotlin
    public String hiddenSince() {
        String strHiddenSince = this.Fq.hiddenSince();
        int iXd = ZN.Xd() ^ (1646634244 ^ 1370468586);
        short sXd = (short) (ZN.Xd() ^ (1468973503 ^ 1468960699));
        short sXd2 = (short) (ZN.Xd() ^ iXd);
        int[] iArr = new int[strHiddenSince.length()];
        QB qb = new QB(strHiddenSince);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // kotlin.DeprecatedSinceKotlin
    public String warningSince() {
        String strWarningSince = this.Fq.warningSince();
        int iXd = Od.Xd() ^ 1207798200;
        short sXd = (short) (C1607wl.Xd() ^ (374437947 ^ 374415387));
        short sXd2 = (short) (C1607wl.Xd() ^ iXd);
        int[] iArr = new int[strWarningSince.length()];
        QB qb = new QB(strWarningSince);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
