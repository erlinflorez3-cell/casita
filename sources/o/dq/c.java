package o.dq;

import android.os.Process;
import android.os.SystemClock;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import fr.antelop.sdk.card.CardDisplay;
import fr.antelop.sdk.transaction.hce.HceTransaction;
import fr.antelop.sdk.transaction.hce.HceTransactionStatus;
import fr.antelop.sdk.transaction.hce.TransactionType;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static int A = 1686024716;
    public static int B = 585393123;
    public static int C = 1865890108;
    public static int D = -234848150;
    public static int E = 724800874;
    public static int F = 347466537;
    public static int G = 1596363370;
    public static int H = -945431747;
    public static int I = 2102153806;
    public static int J = -1445342351;
    public static int K = -1462720621;
    public static int L = 620724745;
    public static int M = -1838901977;
    public static int N = -2007242946;
    public static int O = -1692980316;
    public static int P = -2017968065;
    public static int Q = 2007498057;
    public static int R = 1859910415;
    public static int S = -1245844255;
    public static int T = -616735594;
    public static int U = -1483355607;
    public static int V = 1325924394;
    public static int W = -448391050;
    public static int X = -1218204250;
    public static int Y = 1028768283;
    public static int Z = 1433450751;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23241a = -1658193148;
    private static int aU = 0;
    private static int aW = 1;
    public static int aa = -794173494;
    public static int ab = -1253891529;
    public static int ac = 1628026432;
    public static int ad = -1086250472;
    public static int ae = -1951948679;
    public static int af = -550574493;
    public static int ag = -1307513291;
    public static int ah = 1356140263;
    public static int ai = -2012096003;
    public static int aj = -2100235128;
    public static int ak = 806637086;
    public static int al = 893587592;
    public static int am = -601840814;
    public static int an = 1643911798;
    public static int ao = -1973338475;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23242b = 799713682;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23243c = 1397133291;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23244d = 949407727;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23245e = 1917577020;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f23246f = -58460543;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f23247g = 270217706;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f23248h = 983108773;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f23249i = -1456113605;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f23250j = -1424389444;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f23251k = 1034562988;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f23252l = 857320319;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f23253m = 596610187;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f23254n = 1833350516;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f23255o = -793517858;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f23256p = 1883241664;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f23257q = 44303226;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f23258r = -234888200;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f23259s = 1209301567;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f23260t = -1345395159;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f23261u = -821381113;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f23262v = -385769297;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f23263w = -1295168786;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f23264x = 163095385;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f23265y = 532538442;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f23266z = -894656362;
    private String aC;
    private String aD;
    private String aF;
    private String aH;
    private int aI;
    private Date aJ;
    private String aK;
    private String aL;
    private d aM;
    private e aN;
    private boolean aO;
    private boolean aP;
    private boolean aQ;
    private CardDisplay aR;
    private String aS;
    private boolean aT;
    private boolean aV;
    private BigDecimal ap;
    private String aq;
    private String ar;
    private o.ei.c at;
    private String au;
    private String ax;
    private String ay;
    private String az;
    private String as = null;
    private String av = null;
    private String aw = null;
    private String aA = null;
    private String aB = null;
    private double aG = -1.0d;
    private double aE = -1.0d;

    private static /* synthetic */ Object A(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = (i3 ^ 41) + ((41 & i3) << 1);
        aW = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            cVar.aw = str;
            obj.hashCode();
            throw null;
        }
        cVar.aw = str;
        int i5 = i3 + 41;
        aW = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object B(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aU + 39;
        int i4 = i3 % 128;
        aW = i4;
        int i5 = i3 % 2;
        e eVar = cVar.aN;
        int i6 = i4 + 5;
        aU = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 8 / 0;
        }
        return eVar;
    }

    private static /* synthetic */ Object D(Object[] objArr) {
        c cVar = (c) objArr[0];
        d dVar = (d) objArr[1];
        int i2 = 2 % 2;
        int i3 = aU + 91;
        int i4 = i3 % 128;
        aW = i4;
        int i5 = i3 % 2;
        cVar.aM = dVar;
        int i6 = ((i4 + 29) - (29 | i4)) + ((-1) - (((-1) - i4) & ((-1) - 29)));
        aU = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 33 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 ^ 79) + (((-1) - (((-1) - i3) | ((-1) - 79))) << 1);
        aU = i4 % 128;
        int i5 = i4 % 2;
        String str = cVar.aw;
        int i6 = i3 + 11;
        aU = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW + 17;
        int i4 = i3 % 128;
        aU = i4;
        int i5 = i3 % 2;
        d dVar = cVar.aM;
        int i6 = i4 + 63;
        aW = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
        }
        return dVar;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = i3 + 29;
        aW = i4 % 128;
        int i5 = i4 % 2;
        e eVar = cVar.aN;
        if (eVar == null) {
            int i6 = (i3 ^ 79) + (((i3 + 79) - (i3 | 79)) << 1);
            aW = i6 % 128;
            if (i6 % 2 != 0) {
                return -1;
            }
            throw null;
        }
        int iC = eVar.c();
        int i7 = aW + 41;
        aU = i7 % 128;
        int i8 = i7 % 2;
        return Integer.valueOf(iC);
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aU + 87;
        int i4 = i3 % 128;
        aW = i4;
        int i5 = i3 % 2;
        boolean z2 = cVar.aT;
        int i6 = i4 + 27;
        aU = i6 % 128;
        if (i6 % 2 == 0) {
            return Boolean.valueOf(z2);
        }
        int i7 = 2 / 0;
        return Boolean.valueOf(z2);
    }

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
        int i11 = ~((-1) - (((-1) - i8) & ((-1) - i5)));
        int i12 = ~i4;
        int i13 = (-1) - (((-1) - i9) & ((-1) - i12));
        int i14 = ~((i13 + i6) - (i13 & i6));
        int i15 = (i14 + i11) - (i14 & i11);
        int i16 = (~((-1) - (((-1) - i5) & ((-1) - i12)))) | (~((-1) - (((-1) - i8) & ((-1) - i12))));
        int i17 = i6 + i4 + i7 + (1941422536 * i2) + ((-555707305) * i3);
        int i18 = i17 * i17;
        int i19 = (i6 * (-2131549542)) + 177471488 + ((-2131549542) * i4) + (i10 * (-207299225)) + (i15 * (-207299225)) + ((-207299225) * i16) + (1956118528 * i7) + ((-1363148800) * i2) + (2141716480 * i3) + ((-573308928) * i18);
        int i20 = ((i6 * 487360618) - 1291405921) + (i4 * 487360618) + (i10 * SanyoMakernoteDirectory.TAG_SCENE_SELECT) + (i15 * SanyoMakernoteDirectory.TAG_SCENE_SELECT) + (i16 * SanyoMakernoteDirectory.TAG_SCENE_SELECT) + (i7 * 487361161) + (i2 * (-1188264952)) + (i3 * 624576655) + (i18 * (-25952256));
        switch (i19 + (i20 * i20 * 74186752)) {
            case 1:
                return c(objArr);
            case 2:
                return a(objArr);
            case 3:
                return b(objArr);
            case 4:
                return e(objArr);
            case 5:
                c cVar = (c) objArr[0];
                String str = (String) objArr[1];
                int i21 = 2 % 2;
                int i22 = aW;
                int i23 = ((23 | i22) << 1) - (i22 ^ 23);
                int i24 = i23 % 128;
                aU = i24;
                int i25 = i23 % 2;
                cVar.aF = str;
                int i26 = (i24 & 61) + ((i24 + 61) - (i24 & 61));
                aW = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 6:
                return g(objArr);
            case 7:
                c cVar2 = (c) objArr[0];
                int i28 = 2 % 2;
                int i29 = aU;
                int i30 = ((i29 + 27) - (27 | i29)) + ((i29 + 27) - (27 & i29));
                aW = i30 % 128;
                int i31 = i30 % 2;
                String str2 = cVar2.aA;
                int i32 = i29 + 115;
                aW = i32 % 128;
                int i33 = i32 % 2;
                return str2;
            case 8:
                return i(objArr);
            case 9:
                return j(objArr);
            case 10:
                c cVar3 = (c) objArr[0];
                int i34 = 2 % 2;
                int i35 = aW + 79;
                aU = i35 % 128;
                int i36 = i35 % 2;
                TransactionType transactionTypeB = cVar3.aM.b();
                int i37 = aU;
                int i38 = (i37 ^ 13) + ((i37 & 13) << 1);
                aW = i38 % 128;
                int i39 = i38 % 2;
                return transactionTypeB;
            case 11:
                return f(objArr);
            case 12:
                return h(objArr);
            case 13:
                return l(objArr);
            case 14:
                c cVar4 = (c) objArr[0];
                int i40 = 2 % 2;
                int i41 = aU;
                int i42 = (i41 & 123) + ((i41 + 123) - (123 & i41));
                aW = i42 % 128;
                int i43 = i42 % 2;
                String str3 = cVar4.ar;
                int i44 = i41 + 49;
                aW = i44 % 128;
                int i45 = i44 % 2;
                return str3;
            case 15:
                return m(objArr);
            case 16:
                return n(objArr);
            case 17:
                return k(objArr);
            case 18:
                return o(objArr);
            case 19:
                return r(objArr);
            case 20:
                return t(objArr);
            case 21:
                return q(objArr);
            case 22:
                return p(objArr);
            case 23:
                return s(objArr);
            case 24:
                return y(objArr);
            case 25:
                c cVar5 = (c) objArr[0];
                int i46 = 2 % 2;
                int i47 = aU;
                int i48 = (i47 ^ 83) + ((i47 & 83) << 1);
                int i49 = i48 % 128;
                aW = i49;
                int i50 = i48 % 2;
                String str4 = cVar5.az;
                int i51 = i49 + 111;
                aU = i51 % 128;
                int i52 = i51 % 2;
                return str4;
            case 26:
                return x(objArr);
            case 27:
                return v(objArr);
            case 28:
                c cVar6 = (c) objArr[0];
                int i53 = 2 % 2;
                int i54 = aW;
                int i55 = ((105 | i54) << 1) - (i54 ^ 105);
                int i56 = i55 % 128;
                aU = i56;
                int i57 = i55 % 2;
                String str5 = cVar6.ay;
                int i58 = i56 + 109;
                aW = i58 % 128;
                int i59 = i58 % 2;
                return str5;
            case 29:
                return w(objArr);
            case 30:
                return u(objArr);
            case 31:
                return D(objArr);
            case 32:
                return z(objArr);
            case 33:
                return A(objArr);
            case 34:
                return B(objArr);
            default:
                return d(objArr);
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = aU + 71;
        aW = i3 % 128;
        if (i3 % 2 != 0) {
            cVar.aB = str;
            return null;
        }
        cVar.aB = str;
        int i4 = 32 / 0;
        return null;
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        c cVar = (c) objArr[0];
        o.ei.c cVar2 = (o.ei.c) objArr[1];
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (((i3 + 19) - (19 & i3)) << 1) - (i3 ^ 19);
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        cVar.at = cVar2;
        int i7 = (i5 ^ 49) + (((-1) - (((-1) - i5) | ((-1) - 49))) << 1);
        aW = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 ^ 39) + (((i3 + 39) - (i3 | 39)) << 1);
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        int i7 = cVar.aI;
        int i8 = (((i5 + 35) - (35 & i5)) << 1) - (i5 ^ 35);
        aW = i8 % 128;
        if (i8 % 2 != 0) {
            return Integer.valueOf(i7);
        }
        int i9 = 23 / 0;
        return Integer.valueOf(i7);
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = (i3 ^ 103) + (((i3 + 103) - (103 | i3)) << 1);
        aW = i4 % 128;
        int i5 = i4 % 2;
        cVar.aH = str;
        int i6 = (i3 ^ 39) + (((i3 + 39) - (i3 | 39)) << 1);
        aW = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 57))) + ((-1) - (((-1) - i3) & ((-1) - 57)));
        aU = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = cVar.aO;
        int i6 = i3 + 79;
        aU = i6 % 128;
        if (i6 % 2 == 0) {
            return Boolean.valueOf(z2);
        }
        int i7 = 69 / 0;
        return Boolean.valueOf(z2);
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (((i3 + 33) - (33 & i3)) << 1) - (i3 ^ 33);
        aU = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = cVar.aV;
        if (i5 != 0) {
            throw null;
        }
        int i6 = (((i3 + 45) - (45 & i3)) << 1) - (i3 ^ 45);
        aU = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(z2);
    }

    private static /* synthetic */ Object k(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 91))) << 1) - (i3 ^ 91);
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        String str = cVar.aD;
        if (i6 != 0) {
            throw null;
        }
        int i7 = (i5 ^ 75) + (((i5 + 75) - (i5 | 75)) << 1);
        aW = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    private static /* synthetic */ Object l(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 & 117) + (i3 | 117);
        int i5 = i4 % 128;
        aU = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            o.ei.c cVar2 = cVar.at;
            obj.hashCode();
            throw null;
        }
        o.ei.c cVar3 = cVar.at;
        if (cVar3 == null) {
            int i6 = ((43 | i5) << 1) - (i5 ^ 43);
            aW = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        Currency currency = Currency.getInstance(cVar3.c());
        int i7 = aU;
        int i8 = ((-1) - (((-1) - i7) | ((-1) - 49))) + (i7 | 49);
        aW = i8 % 128;
        if (i8 % 2 != 0) {
            return currency;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object m(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 7))) << 1) - (i3 ^ 7);
        aW = i4 % 128;
        if (i4 % 2 != 0) {
            cVar.aA = str;
            return null;
        }
        cVar.aA = str;
        int i5 = 26 / 0;
        return null;
    }

    private static /* synthetic */ Object n(Object[] objArr) {
        c cVar = (c) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = aW + 29;
        aU = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            cVar.aT = zBooleanValue;
            return null;
        }
        cVar.aT = zBooleanValue;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object o(Object[] objArr) {
        c cVar = (c) objArr[0];
        Date date = (Date) objArr[1];
        int i2 = 2 % 2;
        int i3 = aW + 89;
        int i4 = i3 % 128;
        aU = i4;
        int i5 = i3 % 2;
        cVar.aJ = date;
        int i6 = (i4 ^ 37) + ((i4 & 37) << 1);
        aW = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object p(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = (i3 ^ 83) + ((i3 & 83) << 1);
        int i5 = i4 % 128;
        aW = i5;
        int i6 = i4 % 2;
        if (cVar.aE == -1.0d) {
            int i7 = (i5 ^ 11) + (((-1) - (((-1) - i5) | ((-1) - 11))) << 1);
            int i8 = i7 % 128;
            aU = i8;
            int i9 = i7 % 2;
            if (cVar.aG == -1.0d) {
                int i10 = (((i8 + 55) - (55 & i8)) << 1) - (i8 ^ 55);
                aW = i10 % 128;
                if (i10 % 2 != 0) {
                    return false;
                }
                throw null;
            }
        }
        return true;
    }

    private static /* synthetic */ Object q(Object[] objArr) {
        int i2 = 2 % 2;
        HceTransaction hceTransaction = new HceTransaction((c) objArr[0]);
        int i3 = aU + 25;
        aW = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 90 / 0;
        }
        return hceTransaction;
    }

    private static /* synthetic */ Object r(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = i3 + 27;
        aW = i4 % 128;
        if (i4 % 2 == 0) {
            cVar.au = str;
            int i5 = 52 / 0;
        } else {
            cVar.au = str;
        }
        int i6 = ((i3 | 87) << 1) - (i3 ^ 87);
        aW = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object s(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = (i3 & 93) + (i3 | 93);
        aW = i4 % 128;
        if (i4 % 2 != 0) {
            cVar.ar = str;
            return null;
        }
        cVar.ar = str;
        int i5 = 48 / 0;
        return null;
    }

    private static /* synthetic */ Object t(Object[] objArr) {
        double d2;
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW + 11;
        aU = i3 % 128;
        if (i3 % 2 != 0) {
            d2 = cVar.aG;
            int i4 = 9 / 0;
        } else {
            d2 = cVar.aG;
        }
        return Double.valueOf(d2);
    }

    private static /* synthetic */ Object u(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 & 57) + ((-1) - (((-1) - i3) & ((-1) - 57)));
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        String str = cVar.au;
        if (i6 != 0) {
            int i7 = 73 / 0;
        }
        int i8 = (i5 ^ 27) + (((-1) - (((-1) - i5) | ((-1) - 27))) << 1);
        aW = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object v(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 45))) << 1) - (i3 ^ 45);
        aW = i4 % 128;
        if (i4 % 2 == 0) {
            cVar.aK = str;
            throw null;
        }
        cVar.aK = str;
        int i5 = i3 + 79;
        aW = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object w(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = aU + 69;
        int i4 = i3 % 128;
        aW = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            cVar.ay = str;
            obj.hashCode();
            throw null;
        }
        cVar.ay = str;
        int i5 = i4 + 87;
        aU = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object x(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = aW + 27;
        int i4 = i3 % 128;
        aU = i4;
        int i5 = i3 % 2;
        o.ei.c cVar2 = cVar.at;
        if (i5 != 0) {
            int i6 = 3 / 0;
        }
        int i7 = ((-1) - (((-1) - i4) | ((-1) - 85))) + ((-1) - (((-1) - i4) & ((-1) - 85)));
        aW = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 45 / 0;
        }
        return cVar2;
    }

    private static /* synthetic */ Object y(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = aW + 85;
        int i4 = i3 % 128;
        aU = i4;
        int i5 = i3 % 2;
        cVar.aq = str;
        int i6 = (i4 ^ 45) + ((i4 & 45) << 1);
        aW = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 10 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object z(Object[] objArr) {
        c cVar = (c) objArr[0];
        CardDisplay cardDisplay = (CardDisplay) objArr[1];
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = i3 + 5;
        aU = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        cVar.aR = cardDisplay;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 9;
        aU = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final TransactionType A() {
        int priority = Thread.currentThread().getPriority();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int iNextInt = new Random().nextInt();
        int i2 = f23262v * (-477267446);
        f23262v = i2;
        return (TransactionType) e(iNextInt, i2, new Object[]{this}, -752829482, priority, 752829492, elapsedCpuTime);
    }

    public final HceTransactionStatus B() throws Throwable {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = (i3 ^ 9) + (((i3 + 9) - (i3 | 9)) << 1);
        aW = i4 % 128;
        int i5 = i4 % 2;
        e eVar = this.aN;
        if (i5 != 0) {
            return eVar.d();
        }
        eVar.d();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final e C() {
        int i2 = aj * 2119348037;
        aj = i2;
        int iNextInt = new Random().nextInt();
        int i3 = an * 49505612;
        an = i3;
        int i4 = ao * 1252903114;
        ao = i4;
        return (e) e(i3, i4, new Object[]{this}, -42809608, i2, 42809642, iNextInt);
    }

    public final int D() {
        int i2 = f23243c * (-757789931);
        f23243c = i2;
        int iMyPid = Process.myPid();
        int id = (int) Thread.currentThread().getId();
        int i3 = f23247g * 1964400815;
        f23247g = i3;
        return ((Integer) e(id, i3, new Object[]{this}, -974755526, i2, 974755527, iMyPid)).intValue();
    }

    public final boolean E() {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = ((111 | i3) << 1) - (i3 ^ 111);
        aW = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.aP;
        int i6 = (i3 ^ 49) + (((-1) - (((-1) - i3) | ((-1) - 49))) << 1);
        aW = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean F() {
        int i2 = f23257q * 93949810;
        f23257q = i2;
        int i3 = f23260t * 1875310279;
        f23260t = i3;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i4 = f23256p * (-2084082294);
        f23256p = i4;
        return ((Boolean) e(iUptimeMillis, i4, new Object[]{this}, -339688243, i2, 339688251, i3)).booleanValue();
    }

    public final boolean G() {
        int i2 = 2 % 2;
        int i3 = aW + 61;
        int i4 = i3 % 128;
        aU = i4;
        int i5 = i3 % 2;
        boolean z2 = this.aQ;
        int i6 = (i4 & 71) + ((-1) - (((-1) - i4) & ((-1) - 71)));
        aW = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean H() {
        int id = (int) Thread.currentThread().getId();
        int iMyUid = Process.myUid();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = f23258r * 1296178575;
        f23258r = i2;
        return ((Boolean) e(iUptimeMillis, i2, new Object[]{this}, -623077117, id, 623077126, iMyUid)).booleanValue();
    }

    public final d I() {
        int priority = Thread.currentThread().getPriority();
        int iNextInt = new Random().nextInt(1090238166);
        return (d) e((int) SystemClock.elapsedRealtime(), (int) Runtime.getRuntime().freeMemory(), new Object[]{this}, 1977012666, priority, -1977012663, iNextInt);
    }

    public final String J() {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 125))) + ((-1) - (((-1) - i3) & ((-1) - 125)));
        int i5 = i4 % 128;
        aW = i5;
        int i6 = i4 % 2;
        String str = this.aS;
        int i7 = ((-1) - (((-1) - i5) | ((-1) - 67))) + ((-1) - (((-1) - i5) & ((-1) - 67)));
        aU = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CardDisplay K() {
        int i2 = 2 % 2;
        int i3 = aW + 11;
        int i4 = i3 % 128;
        aU = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        CardDisplay cardDisplay = this.aR;
        int i5 = (i4 & 47) + ((-1) - (((-1) - i4) & ((-1) - 47)));
        aW = i5 % 128;
        int i6 = i5 % 2;
        return cardDisplay;
    }

    public final HceTransaction L() {
        int iMyTid = Process.myTid();
        int i2 = L * (-2097288704);
        L = i2;
        int i3 = S * 302093969;
        S = i3;
        return (HceTransaction) e(i3, (int) Runtime.getRuntime().freeMemory(), new Object[]{this}, 1323051983, iMyTid, -1323051962, i2);
    }

    public final boolean N() {
        int iNextInt = new Random().nextInt(509633913);
        int iMyPid = Process.myPid();
        int i2 = f23241a * (-890089949);
        f23241a = i2;
        int i3 = f23245e * (-1519906128);
        f23245e = i3;
        return ((Boolean) e(i2, i3, new Object[]{this}, -1160227292, iNextInt, 1160227292, iMyPid)).booleanValue();
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 91))) + ((i3 + 91) - (91 & i3));
        aU = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.aq;
        int i5 = (i3 ^ 95) + ((i3 & 95) << 1);
        aU = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void a(double d2) {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 ^ 89) + (((i3 + 89) - (i3 | 89)) << 1);
        aU = i4 % 128;
        int i5 = i4 % 2;
        this.aE = d2;
        int iIdentityHashCode = System.identityHashCode(this);
        int i6 = (-101720098) ^ iIdentityHashCode;
        int i7 = ((-101720098) + iIdentityHashCode) - ((-101720098) | iIdentityHashCode);
        int i8 = ~((i7 + i6) - (i7 & i6));
        int i9 = ~iIdentityHashCode;
        int i10 = (i9 + 372385125) - (i9 & 372385125);
        int i11 = i10 ^ (-950158807);
        int i12 = (i10 - 950158807) - (i10 | (-950158807));
        int i13 = ~((i12 + i11) - (i12 & i11));
        int i14 = (-239949050) + (((-1) - (((-1) - ((i8 + i13) - (i8 | i13))) & ((-1) - (i8 ^ i13)))) * (-318));
        int i15 = 372385125 ^ iIdentityHashCode;
        int i16 = (372385125 + iIdentityHashCode) - (372385125 | iIdentityHashCode);
        int i17 = ~((i15 + i16) - (i15 & i16));
        int i18 = (i14 - (~(-(-(((-1) - (((-1) - ((i17 - 1051878904) - (i17 | (-1051878904)))) & ((-1) - ((-1051878904) ^ i17)))) * (-318)))))) - 1;
        int i19 = ~(((-1) - (((-1) - iIdentityHashCode) | ((-1) - (-372385126)))) | ((-372385126) ^ iIdentityHashCode));
        int i20 = 950158806 ^ i19;
        int i21 = (i19 + 950158806) - (i19 | 950158806);
        int i22 = -(-(((i21 + i20) - (i21 & i20)) * 318));
        int i23 = ((-1) - (((-1) - i18) | ((-1) - i22))) + ((-1) - (((-1) - i22) & ((-1) - i18)));
        int i24 = f23244d * 1451277785;
        f23244d = i24;
        int i25 = (-801758065) ^ i24;
        int i26 = ((-801758065) + i24) - ((-801758065) | i24);
        int i27 = (-1390583172) - (~(-(-(((i25 + i26) - (i25 & i26)) * 140))));
        int i28 = ~i24;
        int i29 = i28 ^ (-801758065);
        int i30 = (-1) - (((-1) - (-801758065)) | ((-1) - i28));
        int i31 = ~((i30 + i29) - (i30 & i29));
        int i32 = (i27 - (~(((i31 & 541180192) | (541180192 ^ i31)) * (-280)))) - 1;
        int i33 = i28 ^ (-530193106);
        int i34 = ((-530193106) + i28) - ((-530193106) | i28);
        int i35 = ~((i34 + i33) - (i34 & i33));
        int i36 = (i35 + 269615233) - (i35 & 269615233);
        int i37 = ~((-1) - (((-1) - i24) & ((-1) - (-541180193))));
        int i38 = -(-(((i37 & i36) | (i36 ^ i37)) * 140));
        if (i23 <= ((i32 | i38) << 1) - (i38 ^ i32)) {
            throw null;
        }
    }

    public final void a(String str) {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = ((i3 + 25) - (25 | i3)) + ((i3 + 25) - (i3 & 25));
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        this.av = str;
        int i7 = (i5 ^ 13) + (((-1) - (((-1) - i5) | ((-1) - 13))) << 1);
        aW = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 51 / 0;
        }
    }

    public final void a(o.ei.c cVar) throws Throwable {
        int iNextInt = new Random().nextInt();
        int priority = Thread.currentThread().getPriority();
        int iNextInt2 = new Random().nextInt(394647635);
        int i2 = (-1625678718) * f23265y;
        f23265y = i2;
        e(iNextInt2, i2, new Object[]{this, cVar}, 2100515447, iNextInt, -2100515436, priority);
    }

    public final void a(boolean z2) {
        int i2 = 2 % 2;
        int i3 = aU + 121;
        aW = i3 % 128;
        if (i3 % 2 != 0) {
            this.aO = z2;
        } else {
            this.aO = z2;
            throw null;
        }
    }

    public final String b() {
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt(423703607);
        int i2 = f23266z * 773153646;
        f23266z = i2;
        int i3 = B * (-1800485676);
        B = i3;
        return (String) e(i2, i3, new Object[]{this}, -1705658359, iNextInt, 1705658373, iNextInt2);
    }

    public final void b(int i2) {
        int i3 = 2 % 2;
        int i4 = aU;
        int i5 = (((-1) - (((-1) - i4) & ((-1) - 45))) << 1) - (i4 ^ 45);
        aW = i5 % 128;
        if (i5 % 2 != 0) {
            this.aI = i2;
        } else {
            this.aI = i2;
            int i6 = 39 / 0;
        }
    }

    public final void b(String str) throws Throwable {
        int iMyTid = Process.myTid();
        int i2 = I * (-1080485619);
        I = i2;
        int i3 = 1126145498 * G;
        G = i3;
        int i4 = 1706398790 * N;
        N = i4;
        e(i3, i4, new Object[]{this, str}, 1732468454, iMyTid, -1732468435, i2);
    }

    public final void b(d dVar) throws Throwable {
        int iNextInt = new Random().nextInt(1759596137);
        int iMyTid = Process.myTid();
        int i2 = 1555996728 * ag;
        ag = i2;
        int i3 = (-805012015) * ah;
        ah = i3;
        e(i2, i3, new Object[]{this, dVar}, 1891140439, iNextInt, -1891140408, iMyTid);
    }

    public final void b(boolean z2) {
        int i2 = 2 % 2;
        int i3 = aW + 125;
        int i4 = i3 % 128;
        aU = i4;
        int i5 = i3 % 2;
        this.aV = z2;
        int i6 = ((51 | i4) << 1) - (i4 ^ 51);
        aW = i6 % 128;
        int i7 = i6 % 2;
    }

    public final Currency c() {
        int i2 = C * (-896593574);
        C = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt();
        int i3 = D * (-204835228);
        D = i3;
        return (Currency) e(iNextInt, i3, new Object[]{this}, -2143875984, i2, 2143875997, iFreeMemory);
    }

    public final void c(double d2) {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 ^ PanasonicMakernoteDirectory.TAG_BURST_SPEED) + ((i3 & PanasonicMakernoteDirectory.TAG_BURST_SPEED) << 1);
        int i5 = i4 % 128;
        aU = i5;
        if (i4 % 2 != 0) {
            this.aG = d2;
            throw null;
        }
        this.aG = d2;
        int i6 = ((25 | i5) << 1) - (i5 ^ 25);
        aW = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 76 / 0;
        }
    }

    public final void c(String str) {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = ((i3 + 59) - (59 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 59)));
        aW = i4 % 128;
        int i5 = i4 % 2;
        this.aC = str;
        int i6 = i3 + 53;
        aW = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void c(boolean z2) {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = i3 + 95;
        aW = i4 % 128;
        int i5 = i4 % 2;
        this.aQ = z2;
        int i6 = i3 + 83;
        aW = i6 % 128;
        int i7 = i6 % 2;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = i3 + 47;
        int i5 = i4 % 128;
        aU = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.aC;
        if (str == null) {
            int i6 = (i3 ^ 91) + (((i3 + 91) - (i3 | 91)) << 1);
            aU = i6 % 128;
            if (i6 % 2 == 0) {
                return "";
            }
            throw null;
        }
        int i7 = (i5 ^ 77) + (((-1) - (((-1) - i5) | ((-1) - 77))) << 1);
        aW = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void d(String str) throws Throwable {
        int iMyTid = Process.myTid();
        int iMyUid = Process.myUid();
        int i2 = 2054036048 * V;
        V = i2;
        int i3 = 702719824 * W;
        W = i3;
        e(i2, i3, new Object[]{this, str}, -1624624042, iMyTid, 1624624066, iMyUid);
    }

    public final void d(BigDecimal bigDecimal) {
        int i2 = 2 % 2;
        System.identityHashCode(this);
        f23242b *= -73528193;
        this.ap = bigDecimal;
        int i3 = aW + 73;
        aU = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void d(Date date) throws Throwable {
        int id = (int) Thread.currentThread().getId();
        int priority = Thread.currentThread().getPriority();
        int iMyUid = Process.myUid();
        int i2 = 1706170942 * F;
        F = i2;
        e(iMyUid, i2, new Object[]{this, date}, -2081493663, id, 2081493681, priority);
    }

    public final void d(boolean z2) throws Throwable {
        Object[] objArr = {this, Boolean.valueOf(z2)};
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = (-529545878) * E;
        E = i3;
        e(i3, new Random().nextInt(), objArr, -1584129099, i2, 1584129115, iFreeMemory);
    }

    public final BigDecimal e() {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 & 101) + ((-1) - (((-1) - i3) & ((-1) - 101)));
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        BigDecimal bigDecimal = this.ap;
        int i7 = i5 + 5;
        aW = i7 % 128;
        if (i7 % 2 != 0) {
            return bigDecimal;
        }
        throw null;
    }

    public final void e(CardDisplay cardDisplay) throws Throwable {
        int i2 = am * (-158355433);
        am = i2;
        int i3 = al * 1614002803;
        al = i3;
        e(Thread.currentThread().getPriority(), Thread.currentThread().getPriority(), new Object[]{this, cardDisplay}, -815328174, i2, 815328206, i3);
    }

    public final void e(String str) {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 111))) << 1) - (i3 ^ 111);
        aU = i4 % 128;
        if (i4 % 2 == 0) {
            this.as = str;
            return;
        }
        this.as = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void e(e eVar) {
        int i2 = 2 % 2;
        int i3 = aU + 63;
        int i4 = i3 % 128;
        aW = i4;
        int i5 = i3 % 2;
        this.aN = eVar;
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        aU = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String f() {
        int priority = Thread.currentThread().getPriority();
        int iNextInt = new Random().nextInt(1277365266);
        int iMyUid = Process.myUid();
        int i2 = af * (-682706040);
        af = i2;
        return (String) e(iMyUid, i2, new Object[]{this}, 1073598465, priority, -1073598435, iNextInt);
    }

    public final void f(String str) throws Throwable {
        int priority = Thread.currentThread().getPriority();
        int i2 = f23248h * (-815798093);
        f23248h = i2;
        e((int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().freeMemory(), new Object[]{this, str}, 294276602, priority, -294276598, i2);
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = i3 + 109;
        aU = i4 % 128;
        int i5 = i4 % 2;
        String str = this.as;
        int i6 = i3 + 45;
        aU = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void g(String str) throws Throwable {
        int i2 = aa * 1028486063;
        aa = i2;
        int iMyPid = Process.myPid();
        int i3 = 1511617071 * ad;
        ad = i3;
        int i4 = (-456636140) * ae;
        ae = i4;
        e(i3, i4, new Object[]{this, str}, -1484062829, i2, 1484062858, iMyPid);
    }

    public final double h() {
        int i2 = J * (-224016517);
        J = i2;
        int iMyPid = Process.myPid();
        int i3 = K * 1241218984;
        K = i3;
        int i4 = M * (-727703704);
        M = i4;
        return ((Double) e(i3, i4, new Object[]{this}, 1215566857, i2, -1215566837, iMyPid)).doubleValue();
    }

    public final void h(String str) {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = (i3 ^ 69) + (((-1) - (((-1) - i3) | ((-1) - 69))) << 1);
        aW = i4 % 128;
        if (i4 % 2 != 0) {
            this.az = str;
            return;
        }
        this.az = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void i(String str) throws Throwable {
        int i2 = ak * (-2064707720);
        ak = i2;
        int iNextInt = new Random().nextInt();
        int priority = Thread.currentThread().getPriority();
        int i3 = 706525032 * ai;
        ai = i3;
        e(priority, i3, new Object[]{this, str}, 1490363620, i2, -1490363587, iNextInt);
    }

    public final boolean i() {
        int i2 = O * (-1924594492);
        O = i2;
        int i3 = Q * (-1945472441);
        Q = i3;
        int i4 = P * (-1688934401);
        P = i4;
        return ((Boolean) e(i4, Process.myPid(), new Object[]{this}, -1111667539, i2, 1111667561, i3)).booleanValue();
    }

    public final double j() {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 ^ 125) + ((i3 & 125) << 1);
        int i5 = i4 % 128;
        aU = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        double d2 = this.aE;
        int i6 = (i5 & 97) + ((i5 + 97) - (i5 & 97));
        aW = i6 % 128;
        int i7 = i6 % 2;
        return d2;
    }

    public final void j(String str) throws Throwable {
        int iNextInt = new Random().nextInt(1179011416);
        int iMyPid = Process.myPid();
        int i2 = (-1589156953) * A;
        A = i2;
        int i3 = (-1913514185) * H;
        H = i3;
        e(i2, i3, new Object[]{this, str}, -223877226, iNextInt, 223877241, iMyPid);
    }

    public final String k() {
        int i2 = f23251k * (-1834325944);
        f23251k = i2;
        int i3 = f23259s * 1781278996;
        f23259s = i3;
        return (String) e((int) Runtime.getRuntime().freeMemory(), Process.myUid(), new Object[]{this}, 1671682430, i2, -1671682423, i3);
    }

    public final void k(String str) {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 ^ 73) + (((-1) - (((-1) - i3) | ((-1) - 73))) << 1);
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        this.ax = str;
        int i7 = i5 + 51;
        aW = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 8 / 0;
        }
    }

    public final String l() {
        int i2 = 2 % 2;
        int i3 = aW + 51;
        aU = i3 % 128;
        int i4 = i3 % 2;
        String str = this.aB;
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
        return str;
    }

    public final void l(String str) throws Throwable {
        int i2 = f23261u * (-248101015);
        f23261u = i2;
        int i3 = f23264x * (-1173840984);
        f23264x = i3;
        int iMyTid = Process.myTid();
        int i4 = (-23964688) * f23263w;
        f23263w = i4;
        e(iMyTid, i4, new Object[]{this, str}, 497708874, i2, -497708862, i3);
    }

    public final String m() {
        int i2 = f23250j * 1134023255;
        f23250j = i2;
        int i3 = f23249i * (-1454896920);
        f23249i = i3;
        int priority = Thread.currentThread().getPriority();
        int i4 = f23246f * (-59414795);
        f23246f = i4;
        return (String) e(priority, i4, new Object[]{this}, 2016821132, i2, -2016821130, i3);
    }

    public final void m(String str) {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (i3 & 93) + ((-1) - (((-1) - i3) & ((-1) - 93)));
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        this.aL = str;
        int i7 = (i5 ^ 85) + (((i5 + 85) - (i5 | 85)) << 1);
        aW = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final String n() {
        int i2 = 2 % 2;
        int i3 = aW + 91;
        aU = i3 % 128;
        if (i3 % 2 == 0) {
            return this.av;
        }
        throw null;
    }

    public final void n(String str) throws Throwable {
        int i2 = f23255o * (-1462558457);
        f23255o = i2;
        int i3 = f23252l * (-431129044);
        f23252l = i3;
        e(Thread.currentThread().getPriority(), (int) Runtime.getRuntime().maxMemory(), new Object[]{this, str}, 561374006, i2, -561374001, i3);
    }

    public final String o() {
        int i2 = ab * (-349012037);
        ab = i2;
        int iNextInt = new Random().nextInt(1939314254);
        int i3 = Y * 1430505636;
        Y = i3;
        return (String) e(i3, new Random().nextInt(1203971282), new Object[]{this}, 1142185313, i2, -1142185285, iNextInt);
    }

    public final void o(String str) {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = ((i3 + 75) - (75 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 75)));
        int i5 = i4 % 128;
        aW = i5;
        int i6 = i4 % 2;
        this.aD = str;
        int i7 = i5 + 85;
        aU = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 19 / 0;
        }
    }

    public final String p() {
        int id = (int) Thread.currentThread().getId();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        return (String) e((int) SystemClock.uptimeMillis(), new Random().nextInt(300912412), new Object[]{this}, 2098923982, id, -2098923965, iFreeMemory);
    }

    public final o.ei.c q() {
        int iActiveCount = Thread.activeCount();
        int id = (int) Thread.currentThread().getId();
        int i2 = U * (-320049133);
        U = i2;
        return (o.ei.c) e(i2, (int) Runtime.getRuntime().freeMemory(), new Object[]{this}, -189024806, iActiveCount, 189024832, id);
    }

    public final void q(String str) throws Throwable {
        int i2 = R * 165990070;
        R = i2;
        int iMyUid = Process.myUid();
        int i3 = 56027633 * T;
        T = i3;
        e(i3, Process.myTid(), new Object[]{this, str}, -872378002, i2, 872378025, iMyUid);
    }

    public final String r() {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = X * (-1846170485);
        X = i2;
        return (String) e(Process.myPid(), Thread.currentThread().getPriority(), new Object[]{this}, 191638324, elapsedCpuTime, -191638299, i2);
    }

    public final void r(String str) throws Throwable {
        int i2 = ac * 1323193544;
        ac = i2;
        int iNextInt = new Random().nextInt();
        int id = (int) Thread.currentThread().getId();
        int i3 = (-636728898) * Z;
        Z = i3;
        e(id, i3, new Object[]{this, str}, 295617363, i2, -295617336, iNextInt);
    }

    public final Date s() {
        int i2 = 2 % 2;
        Date date = new Date(this.aJ.getTime());
        int i3 = aW;
        int i4 = (i3 ^ 113) + ((i3 & 113) << 1);
        aU = i4 % 128;
        int i5 = i4 % 2;
        return date;
    }

    public final void s(String str) {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 43))) + ((-1) - (((-1) - i3) & ((-1) - 43)));
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        this.aS = str;
        int i7 = i5 + 47;
        aW = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final String t() {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 69))) + (69 | i3);
        aW = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ax;
        int i6 = i3 + 73;
        aW = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String u() {
        String str;
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 81))) << 1) - (i3 ^ 81);
        int i5 = i4 % 128;
        aU = i5;
        if (i4 % 2 != 0) {
            str = this.aK;
            int i6 = 92 / 0;
        } else {
            str = this.aK;
        }
        int i7 = (((i5 + 121) - (121 & i5)) << 1) - (i5 ^ 121);
        aW = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public final String v() {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = (i3 ^ 111) + (((-1) - (((-1) - i3) | ((-1) - 111))) << 1);
        aW = i4 % 128;
        if (i4 % 2 != 0) {
            return this.aL;
        }
        throw null;
    }

    public final String w() {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = ((97 | i3) << 1) - (i3 ^ 97);
        aU = i4 % 128;
        int i5 = i4 % 2;
        String str = this.aH;
        int i6 = (((-1) - (((-1) - i3) & ((-1) - 105))) << 1) - (i3 ^ 105);
        aU = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return str;
    }

    public final String x() {
        int i2 = 2 % 2;
        int i3 = aU;
        int i4 = i3 + 21;
        aW = i4 % 128;
        int i5 = i4 % 2;
        String str = this.aF;
        int i6 = i3 + 111;
        aW = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String y() {
        int i2 = 2 % 2;
        int i3 = aW;
        int i4 = (((i3 + 91) - (91 & i3)) << 1) - (i3 ^ 91);
        int i5 = i4 % 128;
        aU = i5;
        int i6 = i4 % 2;
        String str = this.ar;
        int i7 = i5 + 95;
        aW = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public final int z() {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = f23254n * (-377402477);
        f23254n = i2;
        int i3 = f23253m * (-1415752980);
        f23253m = i3;
        return ((Integer) e(i3, (int) Runtime.getRuntime().maxMemory(), new Object[]{this}, 1034189197, iMaxMemory, -1034189191, i2)).intValue();
    }
}
