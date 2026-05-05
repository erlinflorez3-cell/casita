package yg;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: yg.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1616xg implements SerializedName {
    private SerializedName qg;

    public C1616xg(SerializedName serializedName) {
        this.qg = serializedName;
    }

    @Override // com.google.gson.annotations.SerializedName
    public String[] alternate() {
        String[] strArrAlternate = this.qg.alternate();
        int length = strArrAlternate.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrAlternate[i2];
            short sXd = (short) (C1607wl.Xd() ^ (721625659 ^ 721629066));
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

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return SerializedName.class;
    }

    @Override // com.google.gson.annotations.SerializedName
    public String value() {
        String strValue = this.qg.value();
        short sXd = (short) (C1607wl.Xd() ^ ((669144768 ^ 754999804) ^ 182604453));
        short sXd2 = (short) (C1607wl.Xd() ^ ((844911683 ^ 417113481) ^ 713071943));
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
