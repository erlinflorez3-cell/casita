package o.er;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.card.emvapplication.EmvApplication;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o.eq.e {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f24805f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f24806g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f24807h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f24808i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f24809j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f24810k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f24811l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f24812m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f24813n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f24814o = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int[] f24815s = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f24816v = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f24817y = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final i f24818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j f24819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o.ep.e f24820r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f24821t;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r5, int r6, byte r7) {
        /*
            int r0 = r7 * 2
            int r7 = 4 - r0
            int r2 = r5 * 2
            int r1 = 1 - r2
            int r0 = r6 * 2
            int r0 = r0 + 117
            byte[] r6 = o.er.b.$$d
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            r1 = -1
            if (r6 != 0) goto L2b
            r2 = r7
        L17:
            int r0 = -r0
            int r7 = r7 + r0
            int r2 = r2 + 1
        L1b:
            int r1 = r1 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r6[r2]
            goto L17
        L2b:
            r2 = r7
            r7 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.b.$$g(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24812m = -1567977966;
        f24811l = 1418428382;
        f24813n = 1857794451;
        f24814o = -29102245;
        f24810k = -689488784;
        f24808i = 2023244082;
        f24805f = 1814387994;
        f24806g = 1581354244;
        f24807h = 863738301;
        f24809j = -1356713873;
        f24816v = 0;
        f24817y = 1;
        f24815s = new int[]{286415920, -1087751507, 674201743, 1946598035, 748788030, -143104956, 1084204371, -1748206494, 1468952108, 2087866315, 340718574, 213090819, -187662758, -786393267, -600087148, 517102659, 1934316638, 838515426};
    }

    private b(String str) {
        super(str);
        this.f24821t = new j(false, null);
        this.f24819q = new j(false, null);
        this.f24818p = new i(false, null);
        this.f24820r = null;
    }

    public b(String str, j jVar, j jVar2, i iVar, o.ep.e eVar) {
        super(str);
        this.f24821t = jVar;
        this.f24819q = jVar2;
        this.f24818p = iVar;
        this.f24820r = eVar;
    }

    private static EmvApplication C() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        z(new int[]{-545499164, -2094443396, -502473993, -1901335497, -302228251, -1462225654, 1762463050, -1578578661, -1655325937, -1514127018, -1152188002, 1137588034, -1597281165, 1038946861, 1229093281, -287478598, 1888810011, 147895715, 2117716421, -2072159884, 1696401783, -1004596922, 1466353119, 1376592143, 291395507, -1763844303, -296107384, -894372440, 86128485, 85106517, -934569779, 870756718}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63, objArr);
        throw new RuntimeException(((String) objArr[0]).intern());
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        EmvApplication emvApplicationC;
        int i2 = 2 % 2;
        int i3 = f24817y + 47;
        f24816v = i3 % 128;
        if (i3 % 2 != 0) {
            emvApplicationC = C();
            int i4 = 18 / 0;
        } else {
            emvApplicationC = C();
        }
        int i5 = f24817y + 57;
        f24816v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return emvApplicationC;
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = (-1) - (((-1) - i8) & ((-1) - i9));
        int i11 = ~i3;
        int i12 = (~((i10 + i11) - (i10 & i11))) | (~(i5 | i6));
        int i13 = ~((i3 + i6) - (i3 & i6));
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = ~(i8 | i6);
        int i16 = ~(i9 | i11);
        int i17 = i13 | ((i8 + i16) - (i8 & i16));
        int i18 = i5 + i6 + i4 + (1349231875 * i7) + (1735201104 * i2);
        int i19 = i18 * i18;
        int i20 = ((-413510627) * i5) + 1558183936 + (237349861 * i6) + (i14 * 325430244) + (325430244 * i15) + ((-325430244) * i17) + ((-88080384) * i4) + ((-1337982976) * i7) + (469762048 * i2) + (1272971264 * i19);
        int i21 = ((i5 * 236314795) - 374860141) + (i6 * 236313123) + (i14 * (-836)) + (i15 * (-836)) + (i17 * 836) + (i4 * 236313959) + (i7 * (-66979019)) + (i2 * (-1872492752)) + (i19 * (-417333248));
        int i22 = i20 + (i21 * i21 * 639631360);
        if (i22 == 1) {
            return d(objArr);
        }
        if (i22 == 2) {
            return a(objArr);
        }
        if (i22 != 3) {
            int i23 = 2 % 2;
            j jVar = new j(false, null);
            int i24 = f24817y + 33;
            f24816v = i24 % 128;
            int i25 = i24 % 2;
            return jVar;
        }
        int i26 = 2 % 2;
        int i27 = f24817y + 53;
        int i28 = i27 % 128;
        f24816v = i28;
        boolean z2 = i27 % 2 != 0;
        int i29 = i28 + 51;
        f24817y = i29 % 128;
        int i30 = i29 % 2;
        return Boolean.valueOf(z2);
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f24817y + 49;
        f24816v = i3 % 128;
        if (i3 % 2 != 0) {
            o.en.e eVar = o.en.e.f24191e;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.en.e eVar2 = o.en.e.f24191e;
        int i4 = f24816v + 71;
        f24817y = i4 % 128;
        int i5 = i4 % 2;
        return eVar2;
    }

    static void init$0() {
        $$d = new byte[]{85, MessagePack.Code.BIN32, -28, 50};
        $$e = 60;
    }

    private static void z(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        o.a.l lVar = new o.a.l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f24815s;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11 + 31;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 2);
                        objA = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 675, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, -328001469, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f24815s;
        char c2 = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 + 2);
                    objA2 = o.d.d.a(675 - View.MeasureSpec.getSize(i5), (char) (TextUtils.lastIndexOf("", c2, i5, i5) + 1), 11 - TextUtils.indexOf((CharSequence) "", '0', i5), -328001469, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i9++;
                int i10 = $10 + 97;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                c2 = '0';
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            int i12 = $10 + 5;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            o.a.l.a(iArr4);
            for (int i14 = 0; i14 < 16; i14++) {
                int i15 = $11 + 95;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                lVar.f19942e ^= iArr4[i14];
                Object[] objArr4 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a(300 - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.indexOf("", "", 0, 0) + 52697), Drawable.resolveOpacity(0, 0) + 11, -1416256172, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i17 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i17;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i18 = lVar.f19942e;
            int i19 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            o.a.l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(229 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 51004), 8 - ImageFormat.getBitsPerPixel(0), -330018025, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final o.ep.e B() {
        int i2 = 2 % 2;
        int i3 = f24817y + 105;
        f24816v = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f24820r;
        }
        throw null;
    }

    @Override // o.eq.b
    public final o.en.e D() {
        int i2 = (-384560724) * f24806g;
        f24806g = i2;
        int i3 = (-1205977772) * f24805f;
        f24805f = i3;
        int i4 = f24808i * (-653596775);
        f24808i = i4;
        return (o.en.e) d(new Random().nextInt(), i2, i3, -1396441893, new Object[]{this}, 1396441894, i4);
    }

    @Override // o.eq.e
    public final j a() {
        int i2 = 2 % 2;
        j jVar = new j(false, null);
        int i3 = f24817y + 65;
        f24816v = i3 % 128;
        int i4 = i3 % 2;
        return jVar;
    }

    @Override // o.eq.b
    public final o.eq.b b(String str) {
        int i2 = 2 % 2;
        b bVar = new b(str);
        int i3 = f24816v + 67;
        f24817y = i3 % 128;
        int i4 = i3 % 2;
        return bVar;
    }

    @Override // o.eq.e
    public final j b() {
        int i2 = 2 % 2;
        int i3 = f24816v + 91;
        int i4 = i3 % 128;
        f24817y = i4;
        int i5 = i3 % 2;
        j jVar = this.f24819q;
        int i6 = i4 + 19;
        f24816v = i6 % 128;
        if (i6 % 2 == 0) {
            return jVar;
        }
        throw null;
    }

    @Override // o.eq.e
    public final j c() {
        int i2 = 2 % 2;
        int i3 = f24817y + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f24816v = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f24821t;
        }
        throw null;
    }

    @Override // o.eq.b
    public final o.eu.d<? extends o.ff.a> c(String str) {
        int i2 = 2 % 2;
        int i3 = f24816v + 101;
        int i4 = i3 % 128;
        f24817y = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 113;
        f24816v = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
        return null;
    }

    @Override // o.eq.e
    public final j d() {
        int i2 = 2 % 2;
        j jVar = new j(false, null);
        int i3 = f24816v + 89;
        f24817y = i3 % 128;
        int i4 = i3 % 2;
        return jVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fr.antelop.sdk.card.emvapplication.EmvApplication, java.lang.Object] */
    @Override // o.ea.a
    public final /* synthetic */ EmvApplication e() {
        int iNextInt = new Random().nextInt();
        int i2 = (-846334597) * f24810k;
        f24810k = i2;
        int i3 = f24814o * 100811197;
        f24814o = i3;
        int i4 = f24813n * (-317810752);
        f24813n = i4;
        ?? D = d(i4, iNextInt, i2, -1402577444, new Object[]{this}, 1402577446, i3);
        return D;
    }

    @Override // o.eq.e
    public final i f() {
        int i2 = 2 % 2;
        i iVar = new i(false, null);
        int i3 = f24817y + 87;
        f24816v = i3 % 128;
        int i4 = i3 % 2;
        return iVar;
    }

    @Override // o.eq.e
    public final j g() {
        int i2 = 1196766946 * f24809j;
        f24809j = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = f24807h * (-606072762);
        f24807h = i3;
        return (j) d((int) Process.getElapsedCpuTime(), i2, iElapsedRealtime, -2051147579, new Object[]{this}, 2051147579, i3);
    }

    @Override // o.eq.e
    public final i h() {
        int i2 = 2 % 2;
        int i3 = f24817y;
        int i4 = i3 + 41;
        f24816v = i4 % 128;
        int i5 = i4 % 2;
        i iVar = this.f24818p;
        int i6 = i3 + 111;
        f24816v = i6 % 128;
        if (i6 % 2 == 0) {
            return iVar;
        }
        throw null;
    }

    @Override // o.eq.e
    public final j i() {
        int i2 = 2 % 2;
        Object obj = null;
        j jVar = new j(false, null);
        int i3 = f24816v + 7;
        f24817y = i3 % 128;
        if (i3 % 2 != 0) {
            return jVar;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.eq.e
    public final e j() {
        int i2 = 2 % 2;
        e eVar = new e(false, null, false);
        int i3 = f24817y + 107;
        f24816v = i3 % 128;
        int i4 = i3 % 2;
        return eVar;
    }

    @Override // o.eq.e
    public final j l() {
        int i2 = 2 % 2;
        j jVar = new j(false, null);
        int i3 = f24816v + 83;
        f24817y = i3 % 128;
        int i4 = i3 % 2;
        return jVar;
    }

    @Override // o.eq.e
    public final ac m() {
        int i2 = 2 % 2;
        ac acVar = new ac(false, null, new ArrayList());
        int i3 = f24816v + 23;
        f24817y = i3 % 128;
        int i4 = i3 % 2;
        return acVar;
    }

    @Override // o.eq.e
    public final j n() {
        int i2 = 2 % 2;
        j jVar = new j(false, null);
        int i3 = f24816v + 59;
        f24817y = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
        return jVar;
    }

    @Override // o.eq.e
    public final j o() {
        int i2 = 2 % 2;
        j jVar = new j(false, null);
        int i3 = f24817y + 125;
        f24816v = i3 % 128;
        int i4 = i3 % 2;
        return jVar;
    }

    @Override // o.eq.b
    public final String q() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        z(new int[]{-147870040, 729705598, 478593295, 255733817, 1999049, 277806998, 372858931, -470897243, -1230843364, 1826735381, -172929143, 660482155, 1432020263, 1602728046, 559495837, 444684948, -83235015, -81820820, -1651188678, 2039193730, -1022626099, 1043864732, 1532068626, -515534500, -2060900863, 1146455138, 862685364, -78102798, 982233006, -1530190682, -294927836, 1162323362}, 62 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        throw new RuntimeException(((String) objArr[0]).intern());
    }

    @Override // o.eq.b
    public final boolean s() {
        int id = (int) Thread.currentThread().getId();
        int i2 = (-103264016) * f24811l;
        f24811l = i2;
        int i3 = f24812m * 344235778;
        f24812m = i3;
        return ((Boolean) d((int) Process.getElapsedCpuTime(), id, i2, 1508218159, new Object[]{this}, -1508218156, i3)).booleanValue();
    }
}
