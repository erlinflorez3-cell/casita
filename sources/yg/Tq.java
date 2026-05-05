package yg;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes9.dex */
public class Tq implements RequiresNonNull {
    private RequiresNonNull uq;

    public Tq(RequiresNonNull requiresNonNull) {
        this.uq = requiresNonNull;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return RequiresNonNull.class;
    }

    @Override // org.checkerframework.checker.nullness.qual.RequiresNonNull
    public String[] value() {
        String[] strArrValue = this.uq.value();
        int length = strArrValue.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrValue[i2];
            short sXd = (short) (C1633zX.Xd() ^ ((1300419432 ^ 701928017) ^ (-1683236876)));
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }
}
