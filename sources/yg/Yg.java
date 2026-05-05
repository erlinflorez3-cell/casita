package yg;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes9.dex */
public class Yg implements EnsuresNonNullIf {
    private EnsuresNonNullIf ig;

    public Yg(EnsuresNonNullIf ensuresNonNullIf) {
        this.ig = ensuresNonNullIf;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return EnsuresNonNullIf.class;
    }

    @Override // org.checkerframework.checker.nullness.qual.EnsuresNonNullIf
    public String[] expression() {
        String[] strArrExpression = this.ig.expression();
        int length = strArrExpression.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrExpression[i2];
            short sXd = (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134253477));
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }

    @Override // org.checkerframework.checker.nullness.qual.EnsuresNonNullIf
    public boolean result() {
        return this.ig.result();
    }
}
