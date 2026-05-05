package yg;

import com.google.firebase.encoders.annotations.Encodable;

/* JADX INFO: renamed from: yg.Bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1491Bq implements Encodable.Field {
    private Encodable.Field Dq;

    public C1491Bq(Encodable.Field field) {
        this.Dq = field;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return Encodable.Field.class;
    }

    @Override // com.google.firebase.encoders.annotations.Encodable.Field
    public boolean inline() {
        return this.Dq.inline();
    }

    @Override // com.google.firebase.encoders.annotations.Encodable.Field
    public String name() {
        String strName = this.Dq.name();
        short sXd = (short) (ZN.Xd() ^ ((863267040 ^ 1225323550) ^ 2054991346));
        int[] iArr = new int[strName.length()];
        QB qb = new QB(strName);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
