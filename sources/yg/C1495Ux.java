package yg;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;

/* JADX INFO: renamed from: yg.Ux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1495Ux implements Deprecated {
    private Deprecated Nx;

    public C1495Ux(Deprecated deprecated) {
        this.Nx = deprecated;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Deprecated.class;
    }

    @Override // kotlin.Deprecated
    public DeprecationLevel level() {
        return this.Nx.level();
    }

    @Override // kotlin.Deprecated
    public String message() {
        String strMessage = this.Nx.message();
        int iXd = Od.Xd() ^ (1479880737 ^ 533239200);
        int iXd2 = Od.Xd() ^ (675051120 ^ 1874953470);
        short sXd = (short) (ZN.Xd() ^ iXd);
        short sXd2 = (short) (ZN.Xd() ^ iXd2);
        int[] iArr = new int[strMessage.length()];
        QB qb = new QB(strMessage);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // kotlin.Deprecated
    public ReplaceWith replaceWith() {
        return this.Nx.replaceWith();
    }
}
