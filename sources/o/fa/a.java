package o.fa;

import android.os.Process;
import o.cr.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.eu.e<o.fh.a> {

    /* JADX INFO: renamed from: f */
    public static int f25719f = 831300586;

    /* JADX INFO: renamed from: g */
    public static int f25720g = 318917860;

    /* JADX INFO: renamed from: h */
    public static int f25721h = -653199727;

    /* JADX INFO: renamed from: j */
    public static int f25722j = -2077501004;

    /* JADX INFO: renamed from: k */
    private static int f25723k = 1;

    /* JADX INFO: renamed from: l */
    private static int f25724l = 0;

    /* JADX INFO: renamed from: m */
    public static int f25725m = -1850471278;

    /* JADX INFO: renamed from: o */
    public static int f25726o = -779454280;

    public a(String str, String str2, boolean z2) {
        super(str, str2, z2);
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = i5 | i6 | i8;
        int i10 = ~i5;
        int i11 = ~i6;
        int i12 = (i11 + i8) - (i11 & i8);
        int i13 = ~i12;
        int i14 = (i13 + i10) - (i13 & i10);
        int i15 = (~(i6 | ((-1) - (((-1) - i8) & ((-1) - i10))))) | (~((-1) - (((-1) - i12) & ((-1) - i5))));
        int i16 = i4 + i5 + i2 + (2053704882 * i7) + ((-167119771) * i3);
        int i17 = i16 * i16;
        int i18 = (((-385660469) * i4) - 1543503872) + (1501345335 * i5) + (1203980746 * i9) + (i14 * (-1203980746)) + ((-1203980746) * i15) + ((-1589641216) * i2) + (511705088 * i7) + ((-1639972864) * i3) + (1278279680 * i17);
        int i19 = ((i4 * (-1228230693)) - 288632672) + (i5 * (-1228230521)) + (i9 * (-86)) + (i14 * 86) + (i15 * 86) + (i2 * (-1228230607)) + (i7 * 927583762) + (i3 * (-1784727723)) + (i17 * 1163984896);
        return i18 + ((i19 * i19) * 992935936) != 1 ? b(objArr) : c(objArr);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i2 = 2 % 2;
        o.cz.a aVar = new o.cz.a();
        int i3 = f25723k + 51;
        f25724l = i3 % 128;
        if (i3 % 2 == 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f25723k;
        int i4 = ((i3 + 41) - (41 | i3)) + ((i3 + 41) - (i3 & 41));
        f25724l = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            t();
            throw null;
        }
        e eVarT = t();
        int i5 = f25724l + 3;
        f25723k = i5 % 128;
        if (i5 % 2 != 0) {
            return eVarT;
        }
        obj.hashCode();
        throw null;
    }

    private static o.cz.a s() {
        int i2 = f25721h * 858543758;
        f25721h = i2;
        int iMyTid = Process.myTid();
        int i3 = f25719f * (-1556700877);
        f25719f = i3;
        int i4 = 1936771672 * f25722j;
        f25722j = i4;
        return (o.cz.a) a(iMyTid, i4, -520009122, new Object[0], 520009122, i2, i3);
    }

    private static e t() {
        int i2 = 2 % 2;
        e eVar = new e();
        int i3 = f25724l;
        int i4 = (i3 ^ 7) + ((i3 & 7) << 1);
        f25723k = i4 % 128;
        if (i4 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.d
    public final /* synthetic */ o.eu.a d() {
        int iMyTid = Process.myTid();
        int i2 = f25720g * (-566517500);
        f25720g = i2;
        int i3 = f25726o * 198339778;
        f25726o = i3;
        int i4 = f25725m * (-2005969814);
        f25725m = i4;
        return (o.eu.a) a(i2, i4, -1481350500, new Object[]{this}, 1481350501, iMyTid, i3);
    }

    @Override // o.eu.d
    public final /* synthetic */ d e() {
        int i2 = 2 % 2;
        int i3 = f25724l + 115;
        f25723k = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = f25721h * 858543758;
            f25721h = i4;
            int iMyTid = Process.myTid();
            int i5 = f25719f * (-1556700877);
            f25719f = i5;
            int i6 = f25722j * 1936771672;
            f25722j = i6;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = f25721h * 858543758;
        f25721h = i7;
        int iMyTid2 = Process.myTid();
        int i8 = f25719f * (-1556700877);
        f25719f = i8;
        int i9 = f25722j * 1936771672;
        f25722j = i9;
        o.cz.a aVar = (o.cz.a) a(iMyTid2, i9, -520009122, new Object[0], 520009122, i7, i8);
        int i10 = f25723k + 125;
        f25724l = i10 % 128;
        int i11 = i10 % 2;
        return aVar;
    }
}
