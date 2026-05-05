package o.be;

import android.os.Process;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f20954a = 573322708;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f20955b = 2064325564;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f20956c = -1378896929;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f20957d = 947658533;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f20958e = 708807250;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f20959h = 2099714847;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f20960i = 1597254711;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20961n = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f20962s = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f20963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f20964m;

    public static /* synthetic */ Object a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i2;
        int i10 = (-1) - (((-1) - ((~(i8 | i9)) | (~((-1) - (((-1) - i8) & ((-1) - i3)))))) & ((-1) - (~((i9 + i3) - (i9 & i3)))));
        int i11 = ~i3;
        int i12 = (-1) - (((-1) - (~((i11 + i7) - (i11 & i7)))) & ((-1) - (~(i9 | i7))));
        int i13 = i8 | i11;
        int i14 = ~((i9 + i13) - (i9 & i13));
        int i15 = i3 + i7 + i6 + ((-2109949842) * i5) + (2078889904 * i4);
        int i16 = i15 * i15;
        int i17 = ((-1963971821) * i3) + 932184064 + (61854959 * i7) + (1134570258 * i10) + (i12 * (-1134570258)) + ((-1134570258) * i14) + (1196425216 * i6) + (610271232 * i5) + (922746880 * i4) + (671350784 * i16);
        int i18 = (i3 * (-573803825)) + 196542130 + (i7 * (-573802789)) + (i10 * (-518)) + (i12 * 518) + (i14 * 518) + (i6 * (-573803307)) + (i5 * (-843101306)) + (i4 * (-1524517520)) + (i16 * 458489856);
        if (i17 + (i18 * i18 * 64749568) != 1) {
            d dVar = (d) objArr[0];
            int i19 = 2 % 2;
            int i20 = f20962s + 29;
            int i21 = i20 % 128;
            f20961n = i21;
            int i22 = i20 % 2;
            byte[] bArr = dVar.f20963l;
            int i23 = ((i21 + 77) - (77 | i21)) + ((-1) - (((-1) - i21) & ((-1) - 77)));
            f20962s = i23 % 128;
            int i24 = i23 % 2;
            return bArr;
        }
        d dVar2 = (d) objArr[0];
        int i25 = 2 % 2;
        int i26 = f20962s;
        int i27 = ((41 | i26) << 1) - (i26 ^ 41);
        f20961n = i27 % 128;
        int i28 = i27 % 2;
        byte[] bArr2 = dVar2.f20964m;
        int i29 = i26 + 67;
        f20961n = i29 % 128;
        int i30 = i29 % 2;
        return bArr2;
    }

    public final byte[] a() {
        int i2 = f20954a * 1876285600;
        f20954a = i2;
        int i3 = f20956c * 1612249588;
        f20956c = i3;
        int i4 = f20959h * 529832505;
        f20959h = i4;
        int i5 = (-1068154465) * f20960i;
        f20960i = i5;
        return (byte[]) a(new Object[]{this}, i2, 234842887, i5, i4, i3, -234842886);
    }

    public final void b(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f20962s;
        int i4 = ((77 | i3) << 1) - (i3 ^ 77);
        f20961n = i4 % 128;
        if (i4 % 2 == 0) {
            this.f20963l = bArr;
        } else {
            this.f20963l = bArr;
            int i5 = 37 / 0;
        }
    }

    public final void e(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f20961n;
        int i4 = (i3 ^ 7) + (((i3 + 7) - (i3 | 7)) << 1);
        int i5 = i4 % 128;
        f20962s = i5;
        int i6 = i4 % 2;
        this.f20964m = bArr;
        int i7 = i5 + 63;
        f20961n = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final byte[] e() {
        int i2 = f20955b * (-1321914167);
        f20955b = i2;
        int i3 = f20957d * (-71125391);
        f20957d = i3;
        int i4 = f20958e * 68842276;
        f20958e = i4;
        return (byte[]) a(new Object[]{this}, i2, -1734156919, Process.myTid(), i4, i3, 1734156919);
    }
}
