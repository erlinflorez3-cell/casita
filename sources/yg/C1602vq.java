package yg;

import com.facebook.react.uimanager.annotations.ReactProp;

/* JADX INFO: renamed from: yg.vq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1602vq implements ReactProp {
    private ReactProp Vq;

    public C1602vq(ReactProp reactProp) {
        this.Vq = reactProp;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return ReactProp.class;
    }

    @Override // com.facebook.react.uimanager.annotations.ReactProp
    public String customType() {
        String strCustomType = this.Vq.customType();
        short sXd = (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134236316));
        int[] iArr = new int[strCustomType.length()];
        QB qb = new QB(strCustomType);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.facebook.react.uimanager.annotations.ReactProp
    public boolean defaultBoolean() {
        return this.Vq.defaultBoolean();
    }

    @Override // com.facebook.react.uimanager.annotations.ReactProp
    public double defaultDouble() {
        return this.Vq.defaultDouble();
    }

    @Override // com.facebook.react.uimanager.annotations.ReactProp
    public float defaultFloat() {
        return this.Vq.defaultFloat();
    }

    @Override // com.facebook.react.uimanager.annotations.ReactProp
    public int defaultInt() {
        return this.Vq.defaultInt();
    }

    @Override // com.facebook.react.uimanager.annotations.ReactProp
    public long defaultLong() {
        return this.Vq.defaultLong();
    }

    @Override // com.facebook.react.uimanager.annotations.ReactProp
    public String name() {
        String strName = this.Vq.name();
        short sXd = (short) (C1580rY.Xd() ^ (FB.Xd() ^ (2004583332 ^ (-680829366))));
        int[] iArr = new int[strName.length()];
        QB qb = new QB(strName);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
