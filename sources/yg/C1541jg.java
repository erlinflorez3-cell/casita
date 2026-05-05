package yg;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: renamed from: yg.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1541jg implements SafeParcelable.Field {
    private SafeParcelable.Field zg;

    public C1541jg(SafeParcelable.Field field) {
        this.zg = field;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return SafeParcelable.Field.class;
    }

    @Override // com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field
    public String defaultValue() {
        String strDefaultValue = this.zg.defaultValue();
        int iXd = ZN.Xd() ^ 864699392;
        int iXd2 = OY.Xd() ^ (289969034 ^ 358866428);
        short sXd = (short) (C1607wl.Xd() ^ iXd);
        short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr = new int[strDefaultValue.length()];
        QB qb = new QB(strDefaultValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field
    public String defaultValueUnchecked() {
        String strDefaultValueUnchecked = this.zg.defaultValueUnchecked();
        short sXd = (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831068499));
        int[] iArr = new int[strDefaultValueUnchecked.length()];
        QB qb = new QB(strDefaultValueUnchecked);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field
    public String getter() {
        String str = this.zg.getter();
        short sXd = (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609525381)));
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field
    public int id() {
        return this.zg.id();
    }

    @Override // com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field
    public String type() {
        String strType = this.zg.type();
        short sXd = (short) (ZN.Xd() ^ (1298885614 ^ 1298864853));
        int[] iArr = new int[strType.length()];
        QB qb = new QB(strType);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
