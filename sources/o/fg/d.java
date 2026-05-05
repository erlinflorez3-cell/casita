package o.fg;

import com.drew.metadata.iptc.IptcDirectory;
import o.ff.b;
import o.ff.e;

/* JADX INFO: loaded from: classes6.dex */
public class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25865c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25866e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f25867b;

    public d(boolean z2, b bVar, short s2) {
        super(z2, bVar, s2);
    }

    public final void c(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f25865c;
        int i4 = (i3 ^ 75) + ((75 & i3) << 1);
        f25866e = i4 % 128;
        if (i4 % 2 != 0) {
            this.f25867b = bArr;
            throw null;
        }
        this.f25867b = bArr;
        int i5 = i3 + 21;
        f25866e = i5 % 128;
        int i6 = i5 % 2;
    }

    public final byte[] g() {
        int i2 = 2 % 2;
        int iIdentityHashCode = System.identityHashCode(this);
        int i3 = ~iIdentityHashCode;
        int i4 = ~((i3 ^ 484549563) | ((-1) - (((-1) - i3) | ((-1) - 484549563))));
        int i5 = 1124467776 ^ i4;
        int i6 = (1124467776 + i4) - (1124467776 | i4);
        int i7 = ((i6 + i5) - (i6 & i5)) * (-712);
        int i8 = (((-1579582810) + i7) - ((-1579582810) | i7)) + ((-1) - (((-1) - i7) & ((-1) - (-1579582810))));
        int i9 = i3 | (-1336354156);
        int i10 = ~(((i9 + 484549563) - (i9 | 484549563)) | (i9 ^ 484549563));
        int i11 = 1609017339 ^ iIdentityHashCode;
        int i12 = (iIdentityHashCode + 1609017339) - (iIdentityHashCode | 1609017339);
        int i13 = ~((i12 + i11) - (i12 & i11));
        int i14 = ((i8 + ((((i13 + i10) - (i13 | i10)) | (i10 ^ i13)) * (-712))) - (~(((-1336354156) | i4) * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT))) - 1;
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i15 = ~iIdentityHashCode2;
        int i16 = (-1) - (((-1) - (~((-1) - (((-1) - (i15 & (-2098136461))) & ((-1) - ((-2098136461) ^ i15)))))) & ((-1) - 1024196608));
        int i17 = (-44077601) ^ iIdentityHashCode2;
        int i18 = ((-44077601) + iIdentityHashCode2) - ((-44077601) | iIdentityHashCode2);
        int i19 = ~((i17 + i18) - (i17 & i18));
        int i20 = -(-(((i16 + i19) - (i16 & i19)) * (-713)));
        int i21 = (1961337368 ^ i20) + (((-1) - (((-1) - i20) | ((-1) - 1961337368))) << 1) + ((~(((-44077601) + iIdentityHashCode2) - ((-44077601) & iIdentityHashCode2))) * 1426);
        int i22 = ~iIdentityHashCode2;
        int i23 = (-1118017453) ^ i22;
        int i24 = (i22 - 1118017453) - (i22 | (-1118017453));
        int i25 = -(-((~((i24 + i23) - (i24 & i23))) * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION));
        int i26 = (((i21 + i25) - (i21 & i25)) << 1) - (i25 ^ i21);
        Object obj = null;
        if (i14 <= i26) {
            throw null;
        }
        byte[] bArr = this.f25867b;
        int i27 = f25866e;
        int i28 = ((i27 + 89) - (89 | i27)) + ((-1) - (((-1) - i27) & ((-1) - 89)));
        f25865c = i28 % 128;
        if (i28 % 2 != 0) {
            return bArr;
        }
        obj.hashCode();
        throw null;
    }
}
