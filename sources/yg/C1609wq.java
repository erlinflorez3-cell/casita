package yg;

import com.facebook.react.uimanager.annotations.ReactPropGroup;

/* JADX INFO: renamed from: yg.wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1609wq implements ReactPropGroup {
    private ReactPropGroup mq;

    public C1609wq(ReactPropGroup reactPropGroup) {
        this.mq = reactPropGroup;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return ReactPropGroup.class;
    }

    @Override // com.facebook.react.uimanager.annotations.ReactPropGroup
    public String customType() {
        String strCustomType = this.mq.customType();
        short sXd = (short) (FB.Xd() ^ ((1381554684 ^ 1071514705) ^ 1837533403));
        int[] iArr = new int[strCustomType.length()];
        QB qb = new QB(strCustomType);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.facebook.react.uimanager.annotations.ReactPropGroup
    public double defaultDouble() {
        return this.mq.defaultDouble();
    }

    @Override // com.facebook.react.uimanager.annotations.ReactPropGroup
    public float defaultFloat() {
        return this.mq.defaultFloat();
    }

    @Override // com.facebook.react.uimanager.annotations.ReactPropGroup
    public int defaultInt() {
        return this.mq.defaultInt();
    }

    @Override // com.facebook.react.uimanager.annotations.ReactPropGroup
    public long defaultLong() {
        return this.mq.defaultLong();
    }

    @Override // com.facebook.react.uimanager.annotations.ReactPropGroup
    public String[] names() {
        String[] strArrNames = this.mq.names();
        int length = strArrNames.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrNames[i2];
            int iXd = ZN.Xd() ^ (687181430 ^ 461356580);
            int iXd2 = OY.Xd() ^ 69929349;
            short sXd = (short) (FB.Xd() ^ iXd);
            short sXd2 = (short) (FB.Xd() ^ iXd2);
            int[] iArr = new int[str.length()];
            QB qb = new QB(str);
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                i3++;
            }
            strArr[i2] = new String(iArr, 0, i3);
        }
        return strArr;
    }
}
