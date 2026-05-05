package yg;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: renamed from: yg.zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1639zq implements SafeParcelable.Class {
    private SafeParcelable.Class lq;

    public C1639zq(SafeParcelable.Class r1) {
        this.lq = r1;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return SafeParcelable.Class.class;
    }

    @Override // com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class
    public String creator() {
        String strCreator = this.lq.creator();
        int iXd = C1633zX.Xd() ^ (1060502698 ^ 1264886592);
        int iXd2 = Od.Xd() ^ (-1207797438);
        short sXd = (short) (C1633zX.Xd() ^ iXd);
        short sXd2 = (short) (C1633zX.Xd() ^ iXd2);
        int[] iArr = new int[strCreator.length()];
        QB qb = new QB(strCreator);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class
    public boolean creatorIsFinal() {
        return this.lq.creatorIsFinal();
    }

    @Override // com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class
    public boolean doNotParcelTypeDefaultValues() {
        return this.lq.doNotParcelTypeDefaultValues();
    }

    @Override // com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class
    public boolean validate() {
        return this.lq.validate();
    }
}
