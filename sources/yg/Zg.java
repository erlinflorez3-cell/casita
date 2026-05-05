package yg;

import com.squareup.wire.WireField;

/* JADX INFO: loaded from: classes9.dex */
public class Zg implements WireField {
    private WireField Hg;

    public Zg(WireField wireField) {
        this.Hg = wireField;
    }

    @Override // com.squareup.wire.WireField
    public String adapter() {
        String strAdapter = this.Hg.adapter();
        short sXd = (short) (OY.Xd() ^ (543419007 ^ 543402933));
        short sXd2 = (short) (OY.Xd() ^ ((718707054 ^ 1077958372) ^ 1788254586));
        int[] iArr = new int[strAdapter.length()];
        QB qb = new QB(strAdapter);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return WireField.class;
    }

    @Override // com.squareup.wire.WireField
    public String declaredName() {
        String strDeclaredName = this.Hg.declaredName();
        short sXd = (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951477325)));
        int[] iArr = new int[strDeclaredName.length()];
        QB qb = new QB(strDeclaredName);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.squareup.wire.WireField
    public String jsonName() {
        String strJsonName = this.Hg.jsonName();
        short sXd = (short) (C1607wl.Xd() ^ (FB.Xd() ^ (1646783799 ^ 1036558256)));
        int[] iArr = new int[strJsonName.length()];
        QB qb = new QB(strJsonName);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.squareup.wire.WireField
    public String keyAdapter() {
        String strKeyAdapter = this.Hg.keyAdapter();
        int iXd = Od.Xd() ^ (-1207812417);
        int iXd2 = C1499aX.Xd() ^ (1538872872 ^ 404900058);
        short sXd = (short) (Od.Xd() ^ iXd);
        short sXd2 = (short) (Od.Xd() ^ iXd2);
        int[] iArr = new int[strKeyAdapter.length()];
        QB qb = new QB(strKeyAdapter);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.squareup.wire.WireField
    public WireField.Label label() {
        return this.Hg.label();
    }

    @Override // com.squareup.wire.WireField
    public String oneofName() {
        String strOneofName = this.Hg.oneofName();
        short sXd = (short) (C1633zX.Xd() ^ ((1959588557 ^ 69730013) ^ (-1894474392)));
        int[] iArr = new int[strOneofName.length()];
        QB qb = new QB(strOneofName);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.squareup.wire.WireField
    public boolean redacted() {
        return this.Hg.redacted();
    }

    @Override // com.squareup.wire.WireField
    public int schemaIndex() {
        return this.Hg.schemaIndex();
    }

    @Override // com.squareup.wire.WireField
    public int tag() {
        return this.Hg.tag();
    }
}
