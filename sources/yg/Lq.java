package yg;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes9.dex */
public class Lq implements EnsuresNonNull {
    private EnsuresNonNull Aq;

    public Lq(EnsuresNonNull ensuresNonNull) {
        this.Aq = ensuresNonNull;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return EnsuresNonNull.class;
    }

    @Override // org.checkerframework.checker.nullness.qual.EnsuresNonNull
    public String[] value() {
        String[] strArrValue = this.Aq.value();
        int length = strArrValue.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrValue[i2];
            short sXd = (short) (OY.Xd() ^ ((1923548406 ^ 1646614666) ^ 276974915));
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }
}
