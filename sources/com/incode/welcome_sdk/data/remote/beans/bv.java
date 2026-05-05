package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.remote.beans.DynamicFormsResponseParser;
import com.incode.welcome_sdk.data.remote.beans.h;
import com.incode.welcome_sdk.modules.DynamicForms;
import com.incode.welcome_sdk.modules.EKYC;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.MachineLearningConsent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bv {
    private static int aA = 1;
    private static int aB = 0;
    private static int ay = 1;
    private static int az = 0;

    /* JADX INFO: renamed from: b */
    public static final e f9576b = new e((byte) 0);
    private final int A;
    private final boolean B;
    private final boolean C;
    private final boolean D;
    private final boolean E;
    private final h F;
    private final boolean G;
    private final FaceMatch.MatchType H;
    private final boolean I;
    private final boolean J;
    private final boolean K;
    private final boolean L;
    private final boolean M;
    private final int N;
    private final boolean O;
    private final boolean P;
    private final boolean Q;
    private final boolean R;
    private final boolean S;
    private final boolean T;
    private final boolean U;
    private final boolean V;
    private final boolean W;
    private final EKYC.DataInputSource X;
    private final EKYC.DataInputSource Y;
    private final boolean Z;

    /* JADX INFO: renamed from: a */
    private final boolean f9577a;
    private final EKYC.DataInputSource aa;
    private final EKYC.DataInputSource ab;
    private final boolean ac;
    private final boolean ad;
    private final boolean ae;
    private final EKYC.DataInputSource af;
    private final boolean ag;
    private final EKYC.DataInputSource ah;
    private final EKYC.DataInputSource ai;
    private final boolean aj;
    private final boolean ak;
    private final boolean al;
    private final boolean am;
    private final boolean an;
    private final boolean ao;
    private final boolean ap;
    private final int aq;
    private final List<DynamicForms.Screen> ar;
    private final boolean as;
    private final int at;
    private final boolean au;
    private final boolean av;
    private final boolean aw;
    private final h ax;

    /* JADX INFO: renamed from: c */
    private final String f9578c;

    /* JADX INFO: renamed from: d */
    private final String f9579d;

    /* JADX INFO: renamed from: e */
    private final String f9580e;

    /* JADX INFO: renamed from: f */
    private final MachineLearningConsent.ConsentType f9581f;

    /* JADX INFO: renamed from: g */
    private final boolean f9582g;

    /* JADX INFO: renamed from: h */
    private final boolean f9583h;

    /* JADX INFO: renamed from: i */
    private final boolean f9584i;

    /* JADX INFO: renamed from: j */
    private final boolean f9585j;

    /* JADX INFO: renamed from: k */
    private final boolean f9586k;

    /* JADX INFO: renamed from: l */
    private final int f9587l;

    /* JADX INFO: renamed from: m */
    private final int f9588m;

    /* JADX INFO: renamed from: n */
    private final int f9589n;

    /* JADX INFO: renamed from: o */
    private final m f9590o;

    /* JADX INFO: renamed from: p */
    private final boolean f9591p;

    /* JADX INFO: renamed from: q */
    private final boolean f9592q;

    /* JADX INFO: renamed from: r */
    private final boolean f9593r;

    /* JADX INFO: renamed from: s */
    private final boolean f9594s;

    /* JADX INFO: renamed from: t */
    private final boolean f9595t;

    /* JADX INFO: renamed from: u */
    private final int f9596u;

    /* JADX INFO: renamed from: v */
    private final boolean f9597v;

    /* JADX INFO: renamed from: w */
    private final boolean f9598w;

    /* JADX INFO: renamed from: x */
    private final boolean f9599x;

    /* JADX INFO: renamed from: y */
    private final boolean f9600y;

    /* JADX INFO: renamed from: z */
    private final boolean f9601z;

    public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i5;
        int i10 = (~(i8 | i6)) | (~(i8 | i9));
        int i11 = ~i6;
        int i12 = (~(i5 | i11 | i2)) | i10;
        int i13 = ~(i9 | i11);
        int i14 = i6 + i2 + i3 + ((-1228711472) * i4) + ((-141981132) * i7);
        int i15 = i14 * i14;
        int i16 = (((-639131287) * i6) - 2072313856) + (1118068377 * i2) + (i12 * (-1268883816)) + ((-1757199664) * i10) + ((-1268883816) * i13) + ((-1908015104) * i3) + ((-287309824) * i4) + ((-1573388288) * i7) + ((-2138374144) * i15);
        int i17 = ((i6 * (-646461497)) - 273503129) + (i2 * (-646460521)) + (i12 * 488) + (i10 * (-976)) + (i13 * 488) + (i3 * (-646461009)) + (i4 * 1623110960) + (i7 * (-2035004020)) + (i15 * 33882112);
        switch (i16 + (i17 * i17 * (-1051394048))) {
            case 1:
                return d(objArr);
            case 2:
                return e(objArr);
            case 3:
                return a(objArr);
            case 4:
                return b(objArr);
            case 5:
                bv bvVar = (bv) objArr[0];
                int i18 = 2 % 2;
                int i19 = aB + 115;
                int i20 = i19 % 128;
                ay = i20;
                int i21 = i19 % 2;
                int i22 = bvVar.f9589n;
                int i23 = i20 + 117;
                aB = i23 % 128;
                int i24 = i23 % 2;
                return Integer.valueOf(i22);
            case 6:
                return c(objArr);
            case 7:
                bv bvVar2 = (bv) objArr[0];
                int i25 = 2 % 2;
                int i26 = aB;
                int i27 = i26 + 53;
                ay = i27 % 128;
                int i28 = i27 % 2;
                boolean z2 = bvVar2.J;
                int i29 = i26 + 41;
                ay = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.valueOf(z2);
            case 8:
                return g(objArr);
            case 9:
                return f(objArr);
            case 10:
                bv bvVar3 = (bv) objArr[0];
                int i31 = 2 % 2;
                int i32 = ay;
                int i33 = i32 + 63;
                aB = i33 % 128;
                int i34 = i33 % 2;
                h hVar = bvVar3.F;
                int i35 = i32 + 41;
                aB = i35 % 128;
                int i36 = i35 % 2;
                return hVar;
            case 11:
                bv bvVar4 = (bv) objArr[0];
                int i37 = 2 % 2;
                int i38 = aB + 89;
                int i39 = i38 % 128;
                ay = i39;
                int i40 = i38 % 2;
                boolean z3 = bvVar4.ae;
                int i41 = i39 + 113;
                aB = i41 % 128;
                int i42 = i41 % 2;
                return Boolean.valueOf(z3);
            case 12:
                bv bvVar5 = (bv) objArr[0];
                int i43 = 2 % 2;
                int i44 = aB;
                int i45 = i44 + 25;
                ay = i45 % 128;
                int i46 = i45 % 2;
                boolean z4 = bvVar5.E;
                int i47 = i44 + 73;
                ay = i47 % 128;
                int i48 = i47 % 2;
                return Boolean.valueOf(z4);
            default:
                bv bvVar6 = (bv) objArr[0];
                int i49 = 2 % 2;
                int i50 = ay;
                int i51 = i50 + 63;
                aB = i51 % 128;
                int i52 = i51 % 2;
                boolean z5 = bvVar6.U;
                int i53 = i50 + 89;
                aB = i53 % 128;
                int i54 = i53 % 2;
                return Boolean.valueOf(z5);
        }
    }

    public bv(boolean z2, String str, String str2, String str3, MachineLearningConsent.ConsentType consentType, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, int i3, int i4, m mVar, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i5, int i6, boolean z17, boolean z18, boolean z19, boolean z20, h hVar, FaceMatch.MatchType matchType, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, int i7, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, EKYC.DataInputSource dataInputSource, boolean z36, EKYC.DataInputSource dataInputSource2, boolean z37, EKYC.DataInputSource dataInputSource3, boolean z38, EKYC.DataInputSource dataInputSource4, boolean z39, EKYC.DataInputSource dataInputSource5, boolean z40, EKYC.DataInputSource dataInputSource6, boolean z41, EKYC.DataInputSource dataInputSource7, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, boolean z47, List<DynamicForms.Screen> list, boolean z48, int i8, int i9, boolean z49, boolean z50, boolean z51, boolean z52, h hVar2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(consentType, "");
        Intrinsics.checkNotNullParameter(matchType, "");
        Intrinsics.checkNotNullParameter(dataInputSource, "");
        Intrinsics.checkNotNullParameter(dataInputSource2, "");
        Intrinsics.checkNotNullParameter(dataInputSource3, "");
        Intrinsics.checkNotNullParameter(dataInputSource4, "");
        Intrinsics.checkNotNullParameter(dataInputSource5, "");
        Intrinsics.checkNotNullParameter(dataInputSource6, "");
        Intrinsics.checkNotNullParameter(dataInputSource7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f9577a = z2;
        this.f9578c = str;
        this.f9579d = str2;
        this.f9580e = str3;
        this.f9581f = consentType;
        this.f9585j = z3;
        this.f9583h = z4;
        this.f9584i = z5;
        this.f9582g = z6;
        this.f9586k = z7;
        this.f9587l = i2;
        this.f9589n = i3;
        this.f9588m = i4;
        this.f9590o = mVar;
        this.f9591p = z8;
        this.f9592q = z9;
        this.f9593r = z10;
        this.f9595t = z11;
        this.f9594s = z12;
        this.f9598w = z13;
        this.f9599x = z14;
        this.f9600y = z15;
        this.f9597v = z16;
        this.f9596u = i5;
        this.A = i6;
        this.D = z17;
        this.B = z18;
        this.C = z19;
        this.f9601z = z20;
        this.F = hVar;
        this.H = matchType;
        this.I = z21;
        this.E = z22;
        this.G = z23;
        this.L = z24;
        this.J = z25;
        this.M = z26;
        this.K = z27;
        this.N = i7;
        this.P = z28;
        this.Q = z29;
        this.O = z30;
        this.R = z31;
        this.S = z32;
        this.U = z33;
        this.W = z34;
        this.V = z35;
        this.X = dataInputSource;
        this.T = z36;
        this.ab = dataInputSource2;
        this.ac = z37;
        this.Y = dataInputSource3;
        this.Z = z38;
        this.aa = dataInputSource4;
        this.ad = z39;
        this.ah = dataInputSource5;
        this.ag = z40;
        this.af = dataInputSource6;
        this.ae = z41;
        this.ai = dataInputSource7;
        this.am = z42;
        this.ak = z43;
        this.al = z44;
        this.aj = z45;
        this.ao = z46;
        this.an = z47;
        this.ar = list;
        this.ap = z48;
        this.aq = i8;
        this.at = i9;
        this.au = z49;
        this.as = z50;
        this.av = z51;
        this.aw = z52;
        this.ax = hVar2;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = ay;
        int i4 = i3 + 67;
        aB = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f9577a;
        int i5 = i3 + 87;
        aB = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        obj.hashCode();
        throw null;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = ay;
        int i4 = i3 + 69;
        aB = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9578c;
        int i6 = i3 + 105;
        aB = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = ay + 109;
        aB = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9579d;
        }
        throw null;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = ay + 17;
        int i4 = i3 % 128;
        aB = i4;
        int i5 = i3 % 2;
        String str = this.f9580e;
        int i6 = i4 + 85;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final MachineLearningConsent.ConsentType a() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 61;
        ay = i4 % 128;
        int i5 = i4 % 2;
        MachineLearningConsent.ConsentType consentType = this.f9581f;
        int i6 = i3 + 113;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return consentType;
    }

    public final boolean h() {
        int i2 = 2 % 2;
        int i3 = ay;
        int i4 = i3 + 81;
        aB = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f9585j;
        int i5 = i3 + 69;
        aB = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean g() {
        int i2 = 2 % 2;
        int i3 = ay;
        int i4 = i3 + 75;
        aB = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f9583h;
        int i6 = i3 + 37;
        aB = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        bv bvVar = (bv) objArr[0];
        int i2 = 2 % 2;
        int i3 = aB + 19;
        ay = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = bvVar.f9584i;
        if (i4 == 0) {
            int i5 = 43 / 0;
        }
        return Boolean.valueOf(z2);
    }

    public final int j() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 79;
        ay = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f9587l;
        int i7 = i3 + 59;
        ay = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int n() {
        int i2 = 2 % 2;
        int i3 = ay + 101;
        aB = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9588m;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final m l() {
        int i2 = 2 % 2;
        int i3 = aB + 91;
        int i4 = i3 % 128;
        ay = i4;
        int i5 = i3 % 2;
        m mVar = this.f9590o;
        int i6 = i4 + 31;
        aB = i6 % 128;
        if (i6 % 2 == 0) {
            return mVar;
        }
        throw null;
    }

    public final boolean k() {
        int i2 = 2 % 2;
        int i3 = ay + 51;
        int i4 = i3 % 128;
        aB = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f9591p;
        int i5 = i4 + 73;
        ay = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return z2;
    }

    public final boolean o() {
        int i2 = 2 % 2;
        int i3 = aB + 57;
        int i4 = i3 % 128;
        ay = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f9593r;
        int i6 = i4 + 85;
        aB = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final boolean m() {
        int i2 = 2 % 2;
        int i3 = ay;
        int i4 = i3 + 11;
        aB = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f9595t;
        int i6 = i3 + 101;
        aB = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        bv bvVar = (bv) objArr[0];
        int i2 = 2 % 2;
        int i3 = ay + 49;
        aB = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = bvVar.f9594s;
        if (i4 == 0) {
            return Boolean.valueOf(z2);
        }
        throw null;
    }

    public final boolean s() {
        int i2 = 2 % 2;
        int i3 = ay + 61;
        aB = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9598w;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean t() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 91;
        ay = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.f9599x;
            int i5 = 66 / 0;
        } else {
            z2 = this.f9599x;
        }
        int i6 = i3 + 61;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        bv bvVar = (bv) objArr[0];
        int i2 = 2 % 2;
        int i3 = ay + 41;
        int i4 = i3 % 128;
        aB = i4;
        int i5 = i3 % 2;
        boolean z2 = bvVar.f9600y;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 123;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(z2);
    }

    public final int p() {
        int i2 = 2 % 2;
        int i3 = aB + 79;
        ay = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9596u;
        }
        throw null;
    }

    public final int w() {
        int i2 = 2 % 2;
        int i3 = ay + 51;
        int i4 = i3 % 128;
        aB = i4;
        int i5 = i3 % 2;
        int i6 = this.A;
        int i7 = i4 + 101;
        ay = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public final boolean v() {
        int i2 = 2 % 2;
        int i3 = ay + 47;
        int i4 = i3 % 128;
        aB = i4;
        int i5 = i3 % 2;
        boolean z2 = this.D;
        int i6 = i4 + 75;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean x() {
        int i2 = 2 % 2;
        int i3 = ay + 27;
        int i4 = i3 % 128;
        aB = i4;
        int i5 = i3 % 2;
        boolean z2 = this.C;
        int i6 = i4 + 5;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean y() {
        int i2 = 2 % 2;
        int i3 = ay;
        int i4 = i3 + 45;
        aB = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f9601z;
        int i6 = i3 + 23;
        aB = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 38 / 0;
        }
        return z2;
    }

    public final FaceMatch.MatchType B() {
        int i2 = 2 % 2;
        int i3 = aB + 115;
        ay = i3 % 128;
        int i4 = i3 % 2;
        FaceMatch.MatchType matchType = this.H;
        if (i4 == 0) {
            int i5 = 22 / 0;
        }
        return matchType;
    }

    public final boolean C() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 3;
        ay = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.I;
        int i5 = i3 + 113;
        ay = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean z() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 5;
        ay = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.G;
            int i5 = 68 / 0;
        } else {
            z2 = this.G;
        }
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean A() {
        int i2 = 2 % 2;
        int i3 = ay + 87;
        aB = i3 % 128;
        if (i3 % 2 == 0) {
            return this.L;
        }
        int i4 = 2 / 0;
        return this.L;
    }

    public final boolean I() {
        int i2 = 2 % 2;
        int i3 = ay + 25;
        int i4 = i3 % 128;
        aB = i4;
        int i5 = i3 % 2;
        boolean z2 = this.M;
        int i6 = i4 + 13;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean G() {
        int i2 = 2 % 2;
        int i3 = ay + 51;
        int i4 = i3 % 128;
        aB = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.K;
        int i5 = i4 + 111;
        ay = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        bv bvVar = (bv) objArr[0];
        int i2 = 2 % 2;
        int i3 = aB + 59;
        ay = i3 % 128;
        int i4 = i3 % 2;
        int i5 = bvVar.N;
        if (i4 != 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    public final boolean E() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 17;
        ay = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.P;
        int i5 = i3 + 63;
        ay = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return z2;
    }

    public final boolean M() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 95;
        ay = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.Q;
        int i6 = i3 + 85;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean J() {
        int i2 = 2 % 2;
        int i3 = aB + 69;
        ay = i3 % 128;
        if (i3 % 2 != 0) {
            return this.O;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        bv bvVar = (bv) objArr[0];
        int i2 = 2 % 2;
        int i3 = aB + 29;
        int i4 = i3 % 128;
        ay = i4;
        int i5 = i3 % 2;
        Object obj = null;
        boolean z2 = bvVar.R;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 113;
        aB = i6 % 128;
        if (i6 % 2 == 0) {
            return Boolean.valueOf(z2);
        }
        obj.hashCode();
        throw null;
    }

    public final boolean L() {
        int i2 = 2 % 2;
        int i3 = ay + 59;
        aB = i3 % 128;
        if (i3 % 2 == 0) {
            return this.S;
        }
        throw null;
    }

    public final boolean S() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ay + 105;
        int i4 = i3 % 128;
        aB = i4;
        if (i3 % 2 != 0) {
            z2 = this.W;
            int i5 = 0 / 0;
        } else {
            z2 = this.W;
        }
        int i6 = i4 + 29;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean Q() {
        int i2 = 2 % 2;
        int i3 = aB + 39;
        ay = i3 % 128;
        if (i3 % 2 != 0) {
            return this.V;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EKYC.DataInputSource O() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 69;
        ay = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EKYC.DataInputSource dataInputSource = this.X;
        int i5 = i3 + 107;
        ay = i5 % 128;
        int i6 = i5 % 2;
        return dataInputSource;
    }

    public final boolean P() {
        int i2 = 2 % 2;
        int i3 = aB + 21;
        ay = i3 % 128;
        if (i3 % 2 != 0) {
            return this.T;
        }
        throw null;
    }

    public final boolean R() {
        int i2 = 2 % 2;
        int i3 = aB + 125;
        ay = i3 % 128;
        if (i3 % 2 != 0) {
            return this.ac;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EKYC.DataInputSource X() {
        int i2 = 2 % 2;
        int i3 = aB + 89;
        int i4 = i3 % 128;
        ay = i4;
        int i5 = i3 % 2;
        EKYC.DataInputSource dataInputSource = this.Y;
        int i6 = i4 + 5;
        aB = i6 % 128;
        int i7 = i6 % 2;
        return dataInputSource;
    }

    public final boolean V() {
        int i2 = 2 % 2;
        int i3 = ay;
        int i4 = i3 + 75;
        aB = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.Z;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        aB = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean T() {
        int i2 = 2 % 2;
        int i3 = aB + 65;
        int i4 = i3 % 128;
        ay = i4;
        int i5 = i3 % 2;
        boolean z2 = this.ad;
        int i6 = i4 + 73;
        aB = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean W() {
        int i2 = 2 % 2;
        int i3 = ay + 17;
        int i4 = i3 % 128;
        aB = i4;
        int i5 = i3 % 2;
        boolean z2 = this.ag;
        int i6 = i4 + 5;
        ay = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
        return z2;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        bv bvVar = (bv) objArr[0];
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 63;
        ay = i4 % 128;
        int i5 = i4 % 2;
        EKYC.DataInputSource dataInputSource = bvVar.af;
        int i6 = i3 + 51;
        ay = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 97 / 0;
        }
        return dataInputSource;
    }

    public final boolean Y() {
        int i2 = 2 % 2;
        int i3 = ay;
        int i4 = i3 + 65;
        aB = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.am;
        int i6 = i3 + 65;
        aB = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 66 / 0;
        }
        return z2;
    }

    public final boolean aa() {
        int i2 = 2 % 2;
        int i3 = ay + 67;
        int i4 = i3 % 128;
        aB = i4;
        int i5 = i3 % 2;
        boolean z2 = this.ak;
        int i6 = i4 + 123;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean Z() {
        int i2 = 2 % 2;
        int i3 = aB + 69;
        ay = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.al;
        if (i4 == 0) {
            int i5 = 70 / 0;
        }
        return z2;
    }

    public final boolean ab() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 39;
        ay = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.aj;
        int i6 = i3 + 115;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean ag() {
        int i2 = 2 % 2;
        int i3 = aB + 125;
        ay = i3 % 128;
        if (i3 % 2 != 0) {
            return this.ao;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean ah() {
        int i2 = 2 % 2;
        int i3 = aB + 55;
        int i4 = i3 % 128;
        ay = i4;
        int i5 = i3 % 2;
        boolean z2 = this.an;
        int i6 = i4 + 47;
        aB = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final List<DynamicForms.Screen> af() {
        int i2 = 2 % 2;
        int i3 = ay;
        int i4 = i3 + 23;
        aB = i4 % 128;
        int i5 = i4 % 2;
        List<DynamicForms.Screen> list = this.ar;
        int i6 = i3 + 117;
        aB = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final boolean ae() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 125;
        ay = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.ap;
        int i6 = i3 + 45;
        ay = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        bv bvVar = (bv) objArr[0];
        int i2 = 2 % 2;
        int i3 = aB + 41;
        ay = i3 % 128;
        int i4 = i3 % 2;
        int i5 = bvVar.aq;
        if (i4 == 0) {
            int i6 = 97 / 0;
        }
        return Integer.valueOf(i5);
    }

    public final int aj() {
        int i2 = 2 % 2;
        int i3 = aB + 63;
        ay = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.at;
        if (i4 == 0) {
            int i6 = 78 / 0;
        }
        return i5;
    }

    public final boolean am() {
        int i2 = 2 % 2;
        int i3 = aB + 47;
        int i4 = i3 % 128;
        ay = i4;
        int i5 = i3 % 2;
        boolean z2 = this.au;
        int i6 = i4 + 21;
        aB = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean ai() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 59;
        ay = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.as;
        int i6 = i3 + 23;
        ay = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 5 / 0;
        }
        return z2;
    }

    public final boolean al() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ay + 91;
        int i4 = i3 % 128;
        aB = i4;
        if (i3 % 2 != 0) {
            z2 = this.av;
            int i5 = 47 / 0;
        } else {
            z2 = this.av;
        }
        int i6 = i4 + 45;
        ay = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return z2;
    }

    public final boolean ak() {
        int i2 = 2 % 2;
        int i3 = ay + 7;
        int i4 = i3 % 128;
        aB = i4;
        int i5 = i3 % 2;
        boolean z2 = this.aw;
        int i6 = i4 + 75;
        ay = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final h ar() {
        int i2 = 2 % 2;
        int i3 = aB;
        int i4 = i3 + 115;
        ay = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        h hVar = this.ax;
        int i5 = i3 + 7;
        ay = i5 % 128;
        int i6 = i5 % 2;
        return hVar;
    }

    public static final class e {

        /* JADX INFO: renamed from: b */
        private static int f9602b = 1;

        /* JADX INFO: renamed from: c */
        private static int f9603c = 0;

        private e() {
        }

        public static bv c(JSONObject jSONObject) {
            m mVarValueOf;
            List<DynamicForms.Screen> listEmptyList;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            boolean zOptBoolean = jSONObject.optBoolean("otpVerification");
            String strOptString = jSONObject.optString("combinedConsents");
            String strOptString2 = jSONObject.optString("title");
            String strOptString3 = jSONObject.optString("text");
            MachineLearningConsent.ConsentType.e eVar = MachineLearningConsent.ConsentType.Companion;
            String strOptString4 = jSONObject.optString("consentType");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
            MachineLearningConsent.ConsentType consentTypeD = MachineLearningConsent.ConsentType.e.d(strOptString4);
            boolean zOptBoolean2 = jSONObject.optBoolean("showTutorial");
            boolean zOptBoolean3 = jSONObject.optBoolean("enableId");
            boolean zOptBoolean4 = jSONObject.optBoolean("enablePassport");
            boolean zOptBoolean5 = jSONObject.optBoolean("secondId");
            boolean zOptBoolean6 = jSONObject.optBoolean("thirdId");
            int iOptInt = jSONObject.optInt("autoCaptureTimeout", -1);
            int iOptInt2 = jSONObject.optInt("idDetectionTimeout", -1);
            int iOptInt3 = jSONObject.optInt("captureAttempts", -1);
            String strOptString5 = jSONObject.optString("idRank");
            String str = strOptString5;
            boolean z2 = true;
            if (str != null && str.length() != 0) {
                z2 = false;
            }
            Object obj = null;
            if (z2) {
                int i3 = f9603c + 3;
                f9602b = i3 % 128;
                int i4 = i3 % 2;
                mVarValueOf = null;
            } else {
                Intrinsics.checkNotNull(strOptString5);
                mVarValueOf = m.valueOf(strOptString5);
            }
            boolean zOptBoolean7 = jSONObject.optBoolean("enableIdRecording");
            boolean zOptBoolean8 = jSONObject.optBoolean("ageAssurance");
            boolean zOptBoolean9 = jSONObject.optBoolean("showDocumentChooserScreen");
            boolean zOptBoolean10 = jSONObject.optBoolean("onlyFront");
            boolean zOptBoolean11 = jSONObject.optBoolean("onlyBack");
            boolean zOptBoolean12 = jSONObject.optBoolean("editableOcr");
            boolean zOptBoolean13 = jSONObject.optBoolean("showTutorial");
            boolean zOptBoolean14 = jSONObject.optBoolean("assistedOnboarding");
            boolean zOptBoolean15 = jSONObject.optBoolean("enableFaceRecording");
            int iOptInt4 = jSONObject.optInt("autoCaptureTimeout", -1);
            int iOptInt5 = jSONObject.optInt("captureAttempts", -1);
            boolean zOptBoolean16 = jSONObject.optBoolean("enableFaceRecording");
            boolean zOptBoolean17 = jSONObject.optBoolean("livenessEnabled");
            boolean zOptBoolean18 = jSONObject.optBoolean("validateLenses");
            boolean zOptBoolean19 = jSONObject.optBoolean("validateFaceMask");
            h.d dVar = h.f9677e;
            String strOptString6 = jSONObject.optString("deepsightLiveness");
            Intrinsics.checkNotNullExpressionValue(strOptString6, "");
            h hVarA = h.d.a(strOptString6);
            FaceMatch.MatchType.c cVar = FaceMatch.MatchType.Companion;
            FaceMatch.MatchType matchTypeE = FaceMatch.MatchType.c.e(jSONObject.optString("matchingType"));
            boolean z3 = !jSONObject.optBoolean("disableFaceMatchAnimation");
            boolean zOptBoolean20 = jSONObject.optBoolean("useAsSelfie");
            boolean zOptBoolean21 = jSONObject.optBoolean("showTutorials");
            boolean zOptBoolean22 = jSONObject.optBoolean("checkLiveness");
            boolean zOptBoolean23 = jSONObject.optBoolean("checkIdScan");
            boolean zOptBoolean24 = jSONObject.optBoolean("checkDocumentScan");
            boolean zOptBoolean25 = jSONObject.optBoolean("checkVoiceConsent");
            int iOptInt6 = jSONObject.optInt("voiceConsentQuestions");
            boolean zOptBoolean26 = jSONObject.optBoolean("compareIdEnabled");
            boolean zOptBoolean27 = jSONObject.optBoolean("compareOcrEnabled");
            boolean zOptBoolean28 = jSONObject.optBoolean("compareBackIdEnabled");
            boolean zOptBoolean29 = jSONObject.optBoolean("compareBackOcrEnabled");
            boolean zOptBoolean30 = jSONObject.optBoolean("checkBusinessName");
            boolean zOptBoolean31 = jSONObject.optBoolean("checkAddress");
            boolean zOptBoolean32 = jSONObject.optBoolean("checkTaxId");
            boolean zOptBoolean33 = jSONObject.optBoolean("checkName");
            String strOptString7 = jSONObject.optString("nameSource");
            boolean zOptBoolean34 = jSONObject.optBoolean("checkEmail");
            String strOptString8 = jSONObject.optString("emailSource");
            boolean zOptBoolean35 = jSONObject.optBoolean("checkAddress");
            String strOptString9 = jSONObject.optString("addressSource");
            boolean zOptBoolean36 = jSONObject.optBoolean("checkPhone");
            String strOptString10 = jSONObject.optString("phoneSource");
            boolean zOptBoolean37 = jSONObject.optBoolean("checkSsn");
            String strOptString11 = jSONObject.optString("ssnSource");
            boolean zOptBoolean38 = jSONObject.optBoolean("checkDob");
            String strOptString12 = jSONObject.optString("dobSource");
            boolean zOptBoolean39 = jSONObject.optBoolean("checkNationality");
            String strOptString13 = jSONObject.optString("nationalitySource");
            boolean zOptBoolean40 = jSONObject.optBoolean("nfcAvailability");
            boolean zOptBoolean41 = jSONObject.optBoolean("nfcValidation");
            boolean zOptBoolean42 = jSONObject.optBoolean("showInitialDataConfirmationScreen");
            boolean zOptBoolean43 = jSONObject.optBoolean("uploadDocument");
            boolean zOptBoolean44 = jSONObject.optBoolean("downloadDocument");
            boolean zOptBoolean45 = jSONObject.optBoolean("backgroundExecution");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("screens");
            if (jSONArrayOptJSONArray != null) {
                int i5 = f9603c + 77;
                f9602b = i5 % 128;
                if (i5 % 2 == 0) {
                    DynamicFormsResponseParser.e eVar2 = DynamicFormsResponseParser.Companion;
                    DynamicFormsResponseParser.e.b(jSONArrayOptJSONArray);
                    obj.hashCode();
                    throw null;
                }
                DynamicFormsResponseParser.e eVar3 = DynamicFormsResponseParser.Companion;
                listEmptyList = DynamicFormsResponseParser.e.b(jSONArrayOptJSONArray);
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            boolean zOptBoolean46 = jSONObject.optBoolean("showTutorial");
            int iOptInt7 = jSONObject.optInt("autoCaptureTimeout");
            int iOptInt8 = jSONObject.optInt("numberOfAttempts");
            boolean zOptBoolean47 = jSONObject.optBoolean("validateLenses");
            boolean zOptBoolean48 = jSONObject.optBoolean("validateFaceMask");
            boolean zOptBoolean49 = jSONObject.optBoolean("validateHeadCover");
            boolean zOptBoolean50 = jSONObject.optBoolean("validateEyesClosed");
            h.d dVar2 = h.f9677e;
            String strOptString14 = jSONObject.optString("deepsightLiveness");
            Intrinsics.checkNotNullExpressionValue(strOptString14, "");
            h hVarA2 = h.d.a(strOptString14);
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            Intrinsics.checkNotNull(strOptString3);
            EKYC.DataInputSource.b bVar = EKYC.DataInputSource.Companion;
            EKYC.DataInputSource dataInputSourceB = EKYC.DataInputSource.b.b(strOptString7);
            EKYC.DataInputSource.b bVar2 = EKYC.DataInputSource.Companion;
            EKYC.DataInputSource dataInputSourceB2 = EKYC.DataInputSource.b.b(strOptString8);
            EKYC.DataInputSource.b bVar3 = EKYC.DataInputSource.Companion;
            EKYC.DataInputSource dataInputSourceB3 = EKYC.DataInputSource.b.b(strOptString9);
            EKYC.DataInputSource.b bVar4 = EKYC.DataInputSource.Companion;
            EKYC.DataInputSource dataInputSourceB4 = EKYC.DataInputSource.b.b(strOptString10);
            EKYC.DataInputSource.b bVar5 = EKYC.DataInputSource.Companion;
            EKYC.DataInputSource dataInputSourceB5 = EKYC.DataInputSource.b.b(strOptString11);
            EKYC.DataInputSource.b bVar6 = EKYC.DataInputSource.Companion;
            EKYC.DataInputSource dataInputSourceB6 = EKYC.DataInputSource.b.b(strOptString12);
            EKYC.DataInputSource.b bVar7 = EKYC.DataInputSource.Companion;
            return new bv(zOptBoolean, strOptString, strOptString2, strOptString3, consentTypeD, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean6, iOptInt, iOptInt2, iOptInt3, mVarValueOf, zOptBoolean7, zOptBoolean8, zOptBoolean9, zOptBoolean10, zOptBoolean11, zOptBoolean12, zOptBoolean13, zOptBoolean14, zOptBoolean15, iOptInt4, iOptInt5, zOptBoolean16, zOptBoolean17, zOptBoolean18, zOptBoolean19, hVarA, matchTypeE, z3, zOptBoolean20, zOptBoolean21, zOptBoolean22, zOptBoolean23, zOptBoolean24, zOptBoolean25, iOptInt6, zOptBoolean26, zOptBoolean27, zOptBoolean28, zOptBoolean29, zOptBoolean30, zOptBoolean31, zOptBoolean32, zOptBoolean33, dataInputSourceB, zOptBoolean34, dataInputSourceB2, zOptBoolean35, dataInputSourceB3, zOptBoolean36, dataInputSourceB4, zOptBoolean37, dataInputSourceB5, zOptBoolean38, dataInputSourceB6, zOptBoolean39, EKYC.DataInputSource.b.b(strOptString13), zOptBoolean40, zOptBoolean41, zOptBoolean42, zOptBoolean43, zOptBoolean44, zOptBoolean45, listEmptyList, zOptBoolean46, iOptInt7, iOptInt8, zOptBoolean47, zOptBoolean48, zOptBoolean49, zOptBoolean50, hVarA2);
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        int i2 = aA + 55;
        az = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv)) {
            return false;
        }
        bv bvVar = (bv) obj;
        if (this.f9577a != bvVar.f9577a || !Intrinsics.areEqual(this.f9578c, bvVar.f9578c)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f9579d, bvVar.f9579d)) {
            int i3 = ay + 97;
            aB = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.f9580e, bvVar.f9580e) || this.f9581f != bvVar.f9581f || this.f9585j != bvVar.f9585j || this.f9583h != bvVar.f9583h || this.f9584i != bvVar.f9584i || this.f9582g != bvVar.f9582g || this.f9586k != bvVar.f9586k || this.f9587l != bvVar.f9587l || this.f9589n != bvVar.f9589n) {
            return false;
        }
        if (this.f9588m != bvVar.f9588m) {
            int i4 = aB + 39;
            ay = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.f9590o != bvVar.f9590o) {
            return false;
        }
        if (this.f9591p != bvVar.f9591p) {
            int i6 = ay + 125;
            aB = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.f9592q != bvVar.f9592q) {
            int i8 = ay + 99;
            aB = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.f9593r != bvVar.f9593r || this.f9595t != bvVar.f9595t || this.f9594s != bvVar.f9594s || this.f9598w != bvVar.f9598w || this.f9599x != bvVar.f9599x || this.f9600y != bvVar.f9600y || this.f9597v != bvVar.f9597v || this.f9596u != bvVar.f9596u || this.A != bvVar.A || this.D != bvVar.D || this.B != bvVar.B || this.C != bvVar.C) {
            return false;
        }
        if (this.f9601z != bvVar.f9601z) {
            int i10 = aB + 73;
            ay = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.F != bvVar.F || this.H != bvVar.H || this.I != bvVar.I || this.E != bvVar.E || this.G != bvVar.G || this.L != bvVar.L || this.J != bvVar.J) {
            return false;
        }
        if (this.M != bvVar.M) {
            int i12 = aB + 81;
            ay = i12 % 128;
            return i12 % 2 == 0;
        }
        if (this.K != bvVar.K || this.N != bvVar.N || this.P != bvVar.P || this.Q != bvVar.Q || this.O != bvVar.O || this.R != bvVar.R || this.S != bvVar.S || this.U != bvVar.U || this.W != bvVar.W || this.V != bvVar.V || this.X != bvVar.X || this.T != bvVar.T || this.ab != bvVar.ab || this.ac != bvVar.ac || this.Y != bvVar.Y || this.Z != bvVar.Z || this.aa != bvVar.aa || this.ad != bvVar.ad || this.ah != bvVar.ah || this.ag != bvVar.ag || this.af != bvVar.af) {
            return false;
        }
        if (this.ae != bvVar.ae) {
            int i13 = aB + 41;
            ay = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (this.ai != bvVar.ai) {
            int i15 = aB + 59;
            ay = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (this.am != bvVar.am) {
            int i17 = aB + 81;
            ay = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (this.ak != bvVar.ak || this.al != bvVar.al || this.aj != bvVar.aj || this.ao != bvVar.ao || this.an != bvVar.an || !Intrinsics.areEqual(this.ar, bvVar.ar) || this.ap != bvVar.ap || this.aq != bvVar.aq || this.at != bvVar.at || this.au != bvVar.au || this.as != bvVar.as || this.av != bvVar.av) {
            return false;
        }
        if (this.aw == bvVar.aw) {
            return this.ax == bvVar.ax;
        }
        int i19 = ay + 33;
        aB = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int iHashCode2 = ((((((((((((((((((((((((Boolean.hashCode(this.f9577a) * 31) + this.f9578c.hashCode()) * 31) + this.f9579d.hashCode()) * 31) + this.f9580e.hashCode()) * 31) + this.f9581f.hashCode()) * 31) + Boolean.hashCode(this.f9585j)) * 31) + Boolean.hashCode(this.f9583h)) * 31) + Boolean.hashCode(this.f9584i)) * 31) + Boolean.hashCode(this.f9582g)) * 31) + Boolean.hashCode(this.f9586k)) * 31) + Integer.hashCode(this.f9587l)) * 31) + Integer.hashCode(this.f9589n)) * 31) + Integer.hashCode(this.f9588m)) * 31;
        m mVar = this.f9590o;
        int iHashCode3 = 0;
        int iHashCode4 = (((((((((((((((((((((((((((((((iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31) + Boolean.hashCode(this.f9591p)) * 31) + Boolean.hashCode(this.f9592q)) * 31) + Boolean.hashCode(this.f9593r)) * 31) + Boolean.hashCode(this.f9595t)) * 31) + Boolean.hashCode(this.f9594s)) * 31) + Boolean.hashCode(this.f9598w)) * 31) + Boolean.hashCode(this.f9599x)) * 31) + Boolean.hashCode(this.f9600y)) * 31) + Boolean.hashCode(this.f9597v)) * 31) + Integer.hashCode(this.f9596u)) * 31) + Integer.hashCode(this.A)) * 31) + Boolean.hashCode(this.D)) * 31) + Boolean.hashCode(this.B)) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.f9601z)) * 31;
        h hVar = this.F;
        if (hVar == null) {
            int i3 = ay + 101;
            int i4 = i3 % 128;
            aB = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 115;
            ay = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = hVar.hashCode();
        }
        int iHashCode5 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode4 + iHashCode) * 31) + this.H.hashCode()) * 31) + Boolean.hashCode(this.I)) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.G)) * 31) + Boolean.hashCode(this.L)) * 31) + Boolean.hashCode(this.J)) * 31) + Boolean.hashCode(this.M)) * 31) + Boolean.hashCode(this.K)) * 31) + Integer.hashCode(this.N)) * 31) + Boolean.hashCode(this.P)) * 31) + Boolean.hashCode(this.Q)) * 31) + Boolean.hashCode(this.O)) * 31) + Boolean.hashCode(this.R)) * 31) + Boolean.hashCode(this.S)) * 31) + Boolean.hashCode(this.U)) * 31) + Boolean.hashCode(this.W)) * 31) + Boolean.hashCode(this.V)) * 31) + this.X.hashCode()) * 31) + Boolean.hashCode(this.T)) * 31) + this.ab.hashCode()) * 31) + Boolean.hashCode(this.ac)) * 31) + this.Y.hashCode()) * 31) + Boolean.hashCode(this.Z)) * 31) + this.aa.hashCode()) * 31) + Boolean.hashCode(this.ad)) * 31) + this.ah.hashCode()) * 31) + Boolean.hashCode(this.ag)) * 31) + this.af.hashCode()) * 31) + Boolean.hashCode(this.ae)) * 31) + this.ai.hashCode()) * 31) + Boolean.hashCode(this.am)) * 31) + Boolean.hashCode(this.ak)) * 31) + Boolean.hashCode(this.al)) * 31) + Boolean.hashCode(this.aj)) * 31) + Boolean.hashCode(this.ao)) * 31) + Boolean.hashCode(this.an)) * 31) + this.ar.hashCode()) * 31) + Boolean.hashCode(this.ap)) * 31) + Integer.hashCode(this.aq)) * 31) + Integer.hashCode(this.at)) * 31) + Boolean.hashCode(this.au)) * 31) + Boolean.hashCode(this.as)) * 31) + Boolean.hashCode(this.av)) * 31) + Boolean.hashCode(this.aw)) * 31;
        h hVar2 = this.ax;
        if (hVar2 == null) {
            int i8 = aB + 65;
            ay = i8 % 128;
            int i9 = i8 % 2;
        } else {
            iHashCode3 = hVar2.hashCode();
        }
        return iHashCode5 + iHashCode3;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = aB + 45;
        ay = i3 % 128;
        int i4 = i3 % 2;
        String str = "WorkflowModuleConfiguration(otpVerification=" + this.f9577a + ", combinedConsents=" + this.f9578c + ", consentTitle=" + this.f9579d + ", consentText=" + this.f9580e + ", mlConsentType=" + this.f9581f + ", idShowTutorial=" + this.f9585j + ", enabledId=" + this.f9583h + ", enablePassport=" + this.f9584i + ", secondId=" + this.f9582g + ", thirdId=" + this.f9586k + ", idAutoCaptureTimeout=" + this.f9587l + ", idDetectionTimeout=" + this.f9589n + ", idCaptureAttempts=" + this.f9588m + ", idRank=" + this.f9590o + ", idStreamFramesEnabled=" + this.f9591p + ", idAgeAssuranceUXEnabled=" + this.f9592q + ", showDocumentChooserScreen=" + this.f9593r + ", idOnlyFront=" + this.f9595t + ", idOnlyBack=" + this.f9594s + ", editableOCR=" + this.f9598w + ", selfieShowTutorial=" + this.f9599x + ", selfieAssistedOnboarding=" + this.f9600y + ", selfieEnableFaceRecording=" + this.f9597v + ", selfieAutoCaptureTimeout=" + this.f9596u + ", selfieAutoCaptureAttempts=" + this.A + ", selfieStreamFramesEnabled=" + this.D + ", selfieLivenessEnabled=" + this.B + ", selfieValidateLenses=" + this.C + ", selfieValidateFaceMask=" + this.f9601z + ", selfieDeepsightLiveness=" + this.F + ", faceMatchMatchingType=" + this.H + ", enableFaceMatchAnimation=" + this.I + ", videoSelfieUseAsSelfie=" + this.E + ", videoSelfieShowTutorials=" + this.G + ", videoSelfieLivenessEnabled=" + this.L + ", videoSelfieIdScanEnabled=" + this.J + ", videoSelfieDocumentScanEnabled=" + this.M + ", videoSelfieVoiceConsentEnabled=" + this.K + ", videoSelfieQuestionsCount=" + this.N + ", videoSelfieCompareIdEnabled=" + this.P + ", videoSelfieCompareOcrEnabled=" + this.Q + ", videoSelfieCompareBackIdEnabled=" + this.O + ", videoSelfieCompareBackOcrEnabled=" + this.R + ", ekybCheckBusinessName=" + this.S + ", ekybCheckAddress=" + this.U + ", ekybCheckTaxId=" + this.W + ", ekycVerifyName=" + this.V + ", ekycNameSource=" + this.X + ", ekycVerifyEmail=" + this.T + ", ekycEmailSource=" + this.ab + ", ekycVerifyAddress=" + this.ac + ", ekycAddressSource=" + this.Y + ", ekycVerifyPhone=" + this.Z + ", ekycPhoneSource=" + this.aa + ", ekycVerifyTaxId=" + this.ad + ", ekycTaxIdSource=" + this.ah + ", ekycVerifyDateOfBirth=" + this.ag + ", ekycDateOfBirthSource=" + this.af + ", ekycVerifyNationality=" + this.ae + ", ekycNationalitySource=" + this.ai + ", nfcSymbolAvailabilityCheckScreen=" + this.am + ", nfcValidation=" + this.ak + ", showInitialDataConfirmationScreen=" + this.al + ", aesAllowUserToUploadDocument=" + this.aj + ", aesAllowUserToDownloadDocument=" + this.ao + ", govtValidationSkipAnimation=" + this.an + ", dynamicFormsScreens=" + this.ar + ", faceAuthenticationShowTutorial=" + this.ap + ", faceAuthenticationAutoCaptureTimeout=" + this.aq + ", faceAuthenticationNumberOfAttempts=" + this.at + ", faceAuthenticationValidateLenses=" + this.au + ", faceAuthenticationValidateFaceMask=" + this.as + ", faceAuthenticationValidateHeadCover=" + this.av + ", faceAuthenticationValidateEyesClosed=" + this.aw + ", faceAuthenticationDeepsightLiveness=" + this.ax + ")";
        int i5 = ay + 111;
        aB = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final int ad() {
        return ((Integer) b(new Object[]{this}, -254919471, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), 254919474, com.incode.welcome_sdk.data.e.c.c())).intValue();
    }

    public final boolean ac() {
        return ((Boolean) b(new Object[]{this}, -1589532798, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), 1589532809, com.incode.welcome_sdk.data.e.c.c())).booleanValue();
    }

    public final EKYC.DataInputSource U() {
        return (EKYC.DataInputSource) b(new Object[]{this}, -613675420, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), 613675421, com.incode.welcome_sdk.data.e.c.c());
    }

    public final boolean N() {
        return ((Boolean) b(new Object[]{this}, -267659794, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), 267659794, com.incode.welcome_sdk.data.e.c.c())).booleanValue();
    }

    public final boolean K() {
        return ((Boolean) b(new Object[]{this}, 731527212, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), -731527206, com.incode.welcome_sdk.data.e.c.c())).booleanValue();
    }

    public final int H() {
        return ((Integer) b(new Object[]{this}, -1872686104, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), 1872686106, com.incode.welcome_sdk.data.e.c.c())).intValue();
    }

    public final boolean F() {
        return ((Boolean) b(new Object[]{this}, 783691070, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), -783691063, com.incode.welcome_sdk.data.e.c.c())).booleanValue();
    }

    public final boolean D() {
        return ((Boolean) b(new Object[]{this}, 1503985793, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), -1503985781, com.incode.welcome_sdk.data.e.c.c())).booleanValue();
    }

    public final h u() {
        return (h) b(new Object[]{this}, -1878166243, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), 1878166253, com.incode.welcome_sdk.data.e.c.c());
    }

    public final boolean q() {
        return ((Boolean) b(new Object[]{this}, 1192628714, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), -1192628705, com.incode.welcome_sdk.data.e.c.c())).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) b(new Object[]{this}, -1617815267, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), 1617815275, com.incode.welcome_sdk.data.e.c.c())).booleanValue();
    }

    public final int f() {
        return ((Integer) b(new Object[]{this}, 69957733, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), -69957728, com.incode.welcome_sdk.data.e.c.c())).intValue();
    }

    public final boolean i() {
        return ((Boolean) b(new Object[]{this}, 394469491, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), -394469487, com.incode.welcome_sdk.data.e.c.c())).booleanValue();
    }
}
