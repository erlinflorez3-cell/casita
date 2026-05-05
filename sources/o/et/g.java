package o.et;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.card.emvapplication.EmvApplicationType;
import java.util.Random;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public class g extends c {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static final byte[] $$p = null;
    private static final int $$q = 0;
    private static final byte[] $$v = null;
    private static final int $$w = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int A = 0;
    public static int B = 0;
    public static int C = 0;
    public static int D = 0;
    public static int E = 0;
    private static int J = 0;
    private static int L = 0;
    private static int O = 0;
    private static short[] P = null;
    private static int Q = 0;
    private static byte[] R = null;
    private static int S = 0;
    private static int T = 0;
    private static int X = 0;
    public static int ab = 0;
    public static int ac = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f25370x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f25371z = 0;
    private byte[] F;
    private boolean G;
    private int H;
    private byte[] I;
    private boolean K;
    private boolean M;
    private String N;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f25372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f25373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f25374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25375j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$x(byte r7, byte r8, int r9) {
        /*
            int r1 = r7 * 4
            int r0 = 1 - r1
            int r8 = r8 + 4
            byte[] r7 = o.et.g.$$v
            int r6 = r9 + 103
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r7 != 0) goto L29
            r1 = r4
            r0 = r8
        L13:
            int r8 = r8 + r6
            r2 = r1
            r6 = r8
            r8 = r0
        L17:
            int r0 = r8 + 1
            byte r1 = (byte) r6
            r5[r2] = r1
            int r1 = r2 + 1
            if (r2 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r8 = r7[r0]
            goto L13
        L29:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.g.$$x(byte, byte, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        ac = -1433895593;
        ab = -1719523712;
        init$0();
        E = -1721339452;
        f25371z = -643243260;
        D = -1398546951;
        B = -775733716;
        A = -862109965;
        C = 1427809489;
        f25370x = -1943593535;
        T = 0;
        X = 1;
        S = 0;
        O = 1;
        Q();
        Process.getGidForName("");
        TextUtils.getCapsMode("", 0, 0);
        Color.alpha(0);
        MotionEvent.axisFromString("");
        Color.blue(0);
        int i2 = T + 63;
        X = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
    }

    public g(String str, String str2, int i2, String str3) {
        super(str, o.dp.b.f23215c, str2, i2, str3);
        this.G = false;
        this.M = true;
        this.K = true;
    }

    static void Q() {
        L = -160038673;
        J = 1150422425;
        Q = 401625977;
        R = new byte[]{92, 72, 91, 125, 46, 92, 69, 85, 50, 126, 121, -13, 88, -107, 2, 51, 50, 49, 70, 78, 65, 95, -93, 82, -81, -84, 91, -76, 73, 88, 85, -92, -88, 82, MessagePack.Code.FIXSTR_PREFIX, -123, -14, -11, -100, -102, -19, -117, -99, -11, -125, -5, -105, -92, -107, 48, -122, -127, -75, MessagePack.Code.ARRAY16, Ascii.CR, Ascii.FF, -13, -128, -8, -125, 110, 97, 84, 114, 105, 101, 108, 111, 99, -98, 60, 97, 120, 82, 99, 108, -115, 54, 105, 60, 90, 49, 77, 52, 55, 107, -122, Ascii.DC4, 53, 88, 49, 56, 100, 56, 104, 85, 95, 87, -122, Ascii.DC4, -71, -119, 126, -126, Ascii.ESC, MessagePack.Code.BIN8, -124, 80, -98, 87, -120, -119, 91, -98, Utf8.REPLACEMENT_BYTE, -98, 88, MessagePack.Code.MAP32, 87, 102, MessagePack.Code.FIXSTR_PREFIX, -119, 126, 98, -89, 90, -117, -103, 77, -27, Base64.padSymbol, -110, -4, MessagePack.Code.TRUE, -109, 74, -82, -31, -103, 77, -27, Base64.padSymbol, 50, -120, -109, 74, 78, -115, 38, -111, -115, -115, -115, -115, -115, -115, -115};
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c8 A[PHI: r4
  0x01c8: PHI (r4v18 int) = (r4v3 int), (r4v21 int) binds: [B:45:0x01dd, B:41:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e0 A[PHI: r4
  0x01e0: PHI (r4v4 int) = (r4v3 int), (r4v21 int) binds: [B:45:0x01dd, B:41:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void am(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.g.am(short, int, int, int, byte, java.lang.Object[]):void");
    }

    private static void an(short s2, byte b2, byte b3, Object[] objArr) {
        int i2 = s2 * 4;
        int i3 = 98 - b2;
        byte[] bArr = $$g;
        int i4 = (b3 * 3) + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 += i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b4 = bArr[i4];
                i4++;
                i3 = b4 + i3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ao(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 * 7
            int r7 = 11 - r0
            int r2 = r8 * 7
            int r1 = 8 - r2
            int r0 = r6 * 10
            int r6 = 111 - r0
            byte[] r5 = o.et.g.$$p
            byte[] r4 = new byte[r1]
            int r3 = 7 - r2
            r2 = 0
            if (r5 != 0) goto L2f
            r0 = r7
            r6 = r3
            r1 = r2
        L18:
            int r7 = r7 + 1
            int r6 = r6 + r0
            int r6 = r6 + (-2)
        L1d:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r3) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2)
            r9[r2] = r0
            return
        L2a:
            int r1 = r1 + 1
            r0 = r5[r7]
            goto L18
        L2f:
            r1 = r2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.g.ao(short, byte, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~(((-1) - (((-1) - i7) & ((-1) - i2))) | i5);
        int i9 = ~i2;
        int i10 = ~(i9 | i5);
        int i11 = ~i5;
        int i12 = i10 | (~((i11 + i7) - (i11 & i7)));
        int i13 = ~i7;
        int i14 = ~((i5 + i13) - (i5 & i13));
        int i15 = (i14 + i9) - (i14 & i9);
        int i16 = i7 + i2 + i4 + ((-2044576983) * i6) + (1743660113 * i3);
        int i17 = i16 * i16;
        int i18 = ((1047202342 * i7) - 713031680) + (164951516 * i2) + (i8 * 441125413) + (441125413 * i12) + ((-441125413) * i15) + (606076928 * i4) + (689963008 * i6) + ((-299892736) * i3) + ((-1081737216) * i17);
        int i19 = ((i7 * 2048727874) - 782056376) + (i2 * 2048728756) + (i8 * (-441)) + (i12 * (-441)) + (i15 * 441) + (i4 * 2048728315) + (i6 * 2142076211) + (i3 * (-1448904853)) + (i17 * 1885470720);
        int i20 = i18 + (i19 * i19 * (-1618345984));
        return i20 != 1 ? i20 != 2 ? d(objArr) : e(objArr) : c(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = S + 95;
        int i4 = i3 % 128;
        O = i4;
        int i5 = i3 % 2;
        String str = gVar.f25373h;
        int i6 = i4 + 15;
        S = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        g gVar = (g) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = S + 9;
        O = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            gVar.f25373h = str;
            return null;
        }
        gVar.f25373h = str;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.g.e(java.lang.Object[]):java.lang.Object");
    }

    static void init$0() {
        $$g = new byte[]{93, 121, -117, 60};
        $$h = Mp4VideoDirectory.TAG_COLOR_TABLE;
    }

    static void init$1() {
        $$p = new byte[]{67, Ascii.SI, 99, -76, MessagePack.Code.NEVER_USED, 55, 19, -68, 54, MessagePack.Code.BIN8, 67};
        $$q = 222;
    }

    static void init$2() {
        $$v = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$w = 163;
    }

    @Override // o.et.c
    public final byte[] F() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = O + 117;
            S = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            am((short) ((ViewConfiguration.getTouchSlop() >> 8) - 81), 1293677291 - (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1398955687, KeyEvent.keyCodeFromString("") + 1, (byte) ((Process.myPid() >> 22) - 107), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            am((short) (ImageFormat.getBitsPerPixel(0) - 115), 1293677310 - ImageFormat.getBitsPerPixel(0), (-1398955661) - Drawable.resolveOpacity(0, 0), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (Color.blue(0) + 108), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.ff.e eVarD = o.en.b.c().e().f().d(this);
        if (eVarD != null) {
            int i5 = S + 37;
            O = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z2 = eVarD instanceof o.fg.d;
                throw null;
            }
            if (eVarD instanceof o.fg.d) {
                o.fg.d dVar = (o.fg.d) eVarD;
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    am((short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 81), 1293677291 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getPressedStateDuration() >> 16) - 1398955687, 1 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((-108) - Process.getGidForName("")), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr4 = new Object[1];
                    am((short) (Color.rgb(0, 0, 0) + 16777237), View.MeasureSpec.getMode(0) + 1293677341, Color.alpha(0) - 1398955661, 3 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 49), objArr4);
                    o.ea.f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(o.dl.d.e(dVar.g())).toString());
                }
                return dVar.g();
            }
        }
        return null;
    }

    public final String H() {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int iMyUid = Process.myUid();
        int i2 = D * 1890576045;
        D = i2;
        return (String) b(1844286791, (int) SystemClock.elapsedRealtime(), iMyUid, new Object[]{this}, iMaxMemory, i2, -1844286790);
    }

    public final byte[] J() {
        int i2 = 2 % 2;
        int i3 = O + 61;
        int i4 = i3 % 128;
        S = i4;
        int i5 = i3 % 2;
        byte[] bArr = this.f25374i;
        int i6 = i4 + 85;
        O = i6 % 128;
        int i7 = i6 % 2;
        return bArr;
    }

    public final byte[] K() {
        int i2 = 2 % 2;
        int i3 = S + 43;
        int i4 = i3 % 128;
        O = i4;
        int i5 = i3 % 2;
        byte[] bArr = this.F;
        int i6 = i4 + 93;
        S = i6 % 128;
        int i7 = i6 % 2;
        return bArr;
    }

    public final int L() {
        int i2 = 2 % 2;
        int i3 = S;
        int i4 = i3 + 71;
        O = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f25375j;
        int i7 = i3 + 115;
        O = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final byte[] M() {
        int i2 = 2 % 2;
        int i3 = S + 79;
        O = i3 % 128;
        if (i3 % 2 != 0) {
            return this.I;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final byte[] N() {
        int i2 = 2 % 2;
        int i3 = O;
        int i4 = i3 + 95;
        S = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = this.f25372g;
        int i6 = i3 + 1;
        S = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 53 / 0;
        }
        return bArr;
    }

    public final String O() {
        String str;
        int i2 = 2 % 2;
        int i3 = O + 75;
        int i4 = i3 % 128;
        S = i4;
        if (i3 % 2 != 0) {
            str = this.N;
            int i5 = 32 / 0;
        } else {
            str = this.N;
        }
        int i6 = i4 + 7;
        O = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    @Override // o.et.c
    public EmvApplicationType a() {
        int i2 = 2 % 2;
        int i3 = O + 95;
        S = i3 % 128;
        int i4 = i3 % 2;
        EmvApplicationType emvApplicationType = EmvApplicationType.HceIssuerMastercard;
        int i5 = S + 111;
        O = i5 % 128;
        if (i5 % 2 != 0) {
            return emvApplicationType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void a(int i2) {
        Object[] objArr = {this, Integer.valueOf(i2)};
        int iMyPid = Process.myPid();
        int i3 = f25371z * 380718461;
        f25371z = i3;
        int i4 = E * 328893739;
        E = i4;
        b(1497116191, new Random().nextInt(), i3, objArr, iMyPid, i4, -1497116189);
    }

    @Override // o.et.c
    protected c b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        g gVar = new g(str, str2, i2, str3);
        int i4 = O + 61;
        S = i4 % 128;
        int i5 = i4 % 2;
        return gVar;
    }

    public final void b(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = S;
        int i4 = i3 + 83;
        O = i4 % 128;
        int i5 = i4 % 2;
        this.f25374i = bArr;
        int i6 = i3 + 61;
        O = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eq.b
    public /* synthetic */ o.eu.d c(String str) {
        int i2 = 2 % 2;
        int i3 = S + 37;
        O = i3 % 128;
        int i4 = i3 % 2;
        o.eu.e<? extends o.fg.d> eVarD = d(str);
        int i5 = O + 73;
        S = i5 % 128;
        int i6 = i5 % 2;
        return eVarD;
    }

    public final void c(int i2) {
        int i3 = 2 % 2;
        int i4 = S + 23;
        O = i4 % 128;
        if (i4 % 2 != 0) {
            this.f25375j = i2;
            return;
        }
        this.f25375j = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public o.eu.e<? extends o.fg.d> d(String str) {
        int i2 = 2 % 2;
        o.ez.a aVar = new o.ez.a(k(), str, false);
        int i3 = S + 37;
        O = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    public final void g(String str) {
        int i2 = f25370x * 1529702424;
        f25370x = i2;
        int i3 = C * 24801271;
        C = i3;
        int i4 = A * 1514048028;
        A = i4;
        int i5 = B * (-1276446810);
        B = i5;
        b(1622000802, i5, i3, new Object[]{this, str}, i2, i4, -1622000802);
    }

    public final void g(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = S + 115;
        int i4 = i3 % 128;
        O = i4;
        if (i3 % 2 == 0) {
            this.I = bArr;
            int i5 = 29 / 0;
        } else {
            this.I = bArr;
        }
        int i6 = i4 + 33;
        S = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void i(String str) {
        int i2 = 2 % 2;
        int i3 = S + 13;
        O = i3 % 128;
        int i4 = i3 % 2;
        this.N = str.toLowerCase(o.ea.g.d());
        f(o.dl.d.d(str));
        int i5 = O + 51;
        S = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void i(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = O + 95;
        int i4 = i3 % 128;
        S = i4;
        int i5 = i3 % 2;
        this.F = bArr;
        int i6 = i4 + 111;
        O = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
    }

    public final void j(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = S + 33;
        int i4 = i3 % 128;
        O = i4;
        int i5 = i3 % 2;
        this.f25372g = bArr;
        int i6 = i4 + 93;
        S = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }
}
