package yg;

import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.TypeKind;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: renamed from: yg.Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1490Ax implements DefaultFor {
    private DefaultFor ux;

    public C1490Ax(DefaultFor defaultFor) {
        this.ux = defaultFor;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return DefaultFor.class;
    }

    @Override // org.checkerframework.framework.qual.DefaultFor
    public String[] names() {
        String[] strArrNames = this.ux.names();
        int length = strArrNames.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrNames[i2];
            short sXd = (short) (Od.Xd() ^ (FB.Xd() ^ (-1609530174)));
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }

    @Override // org.checkerframework.framework.qual.DefaultFor
    public String[] namesExceptions() {
        String[] strArrNamesExceptions = this.ux.namesExceptions();
        int length = strArrNamesExceptions.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrNamesExceptions[i2];
            int iXd = C1607wl.Xd() ^ 1849960524;
            int iXd2 = C1633zX.Xd() ^ (506948537 ^ (-1785096132));
            short sXd = (short) (C1607wl.Xd() ^ iXd);
            short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }

    @Override // org.checkerframework.framework.qual.DefaultFor
    public TypeKind[] typeKinds() {
        return this.ux.typeKinds();
    }

    @Override // org.checkerframework.framework.qual.DefaultFor
    public Class[] types() {
        return this.ux.types();
    }

    @Override // org.checkerframework.framework.qual.DefaultFor
    public TypeUseLocation[] value() {
        return this.ux.value();
    }
}
