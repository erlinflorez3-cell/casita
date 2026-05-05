package o.et;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.card.emvapplication.EmvApplicationType;
import java.lang.reflect.Method;
import java.util.Random;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends g {
    private static final byte[] $$l = null;
    private static final int $$o = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char[] H = null;
    private static int J = 0;
    private static boolean K = false;
    private static int L = 0;
    private static boolean M = false;
    private static int N = 0;

    /* JADX INFO: renamed from: g */
    public static int f25337g = 0;

    /* JADX INFO: renamed from: h */
    public static int f25338h = 0;

    /* JADX INFO: renamed from: i */
    public static int f25339i = 0;

    /* JADX INFO: renamed from: j */
    public static int f25340j = 0;
    private int F;
    private byte G;
    private int I;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(byte r8, int r9, byte r10) {
        /*
            int r0 = r8 * 4
            int r8 = 1 - r0
            int r0 = r9 * 2
            int r2 = 3 - r0
            int r0 = r10 * 6
            int r1 = r0 + 67
            byte[] r7 = o.et.b.$$l
            byte[] r6 = new byte[r8]
            r5 = 0
            if (r7 != 0) goto L2d
            r3 = r8
            r0 = r2
            r4 = r5
        L16:
            int r1 = -r2
            int r1 = r1 + r3
            r3 = r4
            r2 = r0
        L1a:
            int r0 = r2 + 1
            byte r2 = (byte) r1
            int r4 = r3 + 1
            r6[r3] = r2
            if (r4 != r8) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L29:
            r2 = r7[r0]
            r3 = r1
            goto L16
        L2d:
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.b.$$r(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25338h = 621466727;
        f25340j = -1297036589;
        f25337g = 1031990878;
        f25339i = -775311848;
        L = 0;
        N = 1;
        H = new char[]{2344, 2345, 2324, 2306};
        J = 2040400216;
        K = true;
        M = true;
    }

    public b(String str, String str2, int i2, String str3) throws Throwable {
        super(str, str2, i2, str3);
        e(o.dp.b.f23216d);
        Object[] objArr = new Object[1];
        ah(((byte) KeyEvent.getModifierMetaStateMask()) + 128, null, null, "\u0084\u0084\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0081\u0083\u0082\u0082\u0081", objArr);
        i(o.dl.d.e(((String) objArr[0]).intern()));
    }

    private static void ah(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            int i4 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
                charArray = str3.toCharArray();
            } else {
                charArray = str3.toCharArray();
            }
        }
        char[] cArr2 = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr3 = H;
        long j2 = 0;
        if (cArr3 != null) {
            int i6 = $11 + 61;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(ExpandableListView.getPackedPositionGroup(j2) + 593, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13181), 12 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)), -1225586509, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(J)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33, (char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (M) {
            fVar.f19923e = bArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 457, (char) (Process.myPid() >> 22), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, -1923924106, false, $$r(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!K) {
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $10 + 101;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
            fVar.f19922a = 1;
        } else {
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
            fVar.f19922a = 0;
        }
        int i10 = $11 + 113;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        while (fVar.f19922a < fVar.f19923e) {
            cArr[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = o.d.d.a(1540807955);
            if (objA4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA4 = o.d.d.a(458 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), 11 - Color.red(0), -1923924106, false, $$r(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i2;
        int i9 = ~i7;
        int i10 = ~((-1) - (((-1) - (~i5)) & ((-1) - i9)));
        int i11 = i5 | i9;
        int i12 = i7 + i2 + i4 + ((-189913888) * i6) + ((-1809372279) * i3);
        int i13 = i12 * i12;
        int i14 = (((-554582804) * i7) - 1671495680) + (10634006 * i2) + (i8 * 282608405) + (282608405 * i10) + ((-282608405) * i11) + ((-271974400) * i4) + (952107008 * i6) + (1092222976 * i3) + ((-70844416) * i13);
        int i15 = (i7 * 986545540) + 223666697 + (i2 * 986543778) + (i8 * (-881)) + (i10 * (-881)) + (i11 * 881) + (i4 * 986544659) + (i6 * 1843362976) + (i3 * (-1872984789)) + (i13 * (-2050686976));
        if (i14 + (i15 * i15 * 1179713536) == 1) {
            return b(objArr);
        }
        b bVar = (b) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i16 = 2 % 2;
        int i17 = L + 5;
        int i18 = i17 % 128;
        N = i18;
        int i19 = i17 % 2;
        bVar.F = iIntValue;
        int i20 = i18 + 7;
        L = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = L + 125;
        N = i3 % 128;
        int i4 = i3 % 2;
        byte b2 = bVar.G;
        if (i4 == 0) {
            int i5 = 27 / 0;
        }
        return Byte.valueOf(b2);
    }

    private o.ez.a h(String str) {
        int i2 = 2 % 2;
        o.ez.a aVar = new o.ez.a(k(), str, false);
        int i3 = N + 13;
        L = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    static void init$0() {
        $$l = new byte[]{54, MessagePack.Code.BIN8, MessagePack.Code.UINT64, -16};
        $$o = 9;
    }

    @Override // o.et.g, o.et.c
    public final EmvApplicationType a() {
        int i2 = 2 % 2;
        int i3 = N + 123;
        L = i3 % 128;
        int i4 = i3 % 2;
        EmvApplicationType emvApplicationType = EmvApplicationType.HceIdemiaMchip;
        if (i4 == 0) {
            return emvApplicationType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = L + 61;
        N = i3 % 128;
        if (i3 % 2 != 0) {
            return this.I;
        }
        throw null;
    }

    @Override // o.et.g, o.et.c
    protected final c b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        b bVar = new b(str, str2, i2, str3);
        int i4 = N + 39;
        L = i4 % 128;
        int i5 = i4 % 2;
        return bVar;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = L;
        int i4 = i3 + 103;
        N = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.F;
        int i7 = i3 + 39;
        N = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 94 / 0;
        }
        return i6;
    }

    @Override // o.et.g, o.eq.b
    public final /* synthetic */ o.eu.d c(String str) {
        int i2 = 2 % 2;
        int i3 = L + 115;
        N = i3 % 128;
        int i4 = i3 % 2;
        o.ez.a aVarH = h(str);
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        int i6 = N + 25;
        L = i6 % 128;
        int i7 = i6 % 2;
        return aVarH;
    }

    public final byte d() {
        int i2 = f25340j * (-1575480416);
        f25340j = i2;
        int i3 = f25338h * 718567752;
        f25338h = i3;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        return ((Byte) b(-1231883028, new Random().nextInt(), i3, i2, iMaxMemory, 1231883029, new Object[]{this})).byteValue();
    }

    @Override // o.et.g
    public final /* synthetic */ o.eu.e d(String str) {
        int i2 = 2 % 2;
        int i3 = L + 125;
        N = i3 % 128;
        int i4 = i3 % 2;
        o.ez.a aVarH = h(str);
        if (i4 == 0) {
            int i5 = 97 / 0;
        }
        int i6 = L + 1;
        N = i6 % 128;
        int i7 = i6 % 2;
        return aVarH;
    }

    public final void d(byte b2) {
        int i2 = 2 % 2;
        int i3 = L + 61;
        N = i3 % 128;
        if (i3 % 2 != 0) {
            this.G = b2;
        } else {
            this.G = b2;
            throw null;
        }
    }

    public final void d(int i2) {
        Object[] objArr = {this, Integer.valueOf(i2)};
        int iMyTid = Process.myTid();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = f25339i * (-1021380914);
        f25339i = i3;
        int i4 = f25337g * (-1997134821);
        f25337g = i4;
        b(1126453636, i4, iElapsedRealtime, iMyTid, i3, -1126453636, objArr);
    }

    public final void e(int i2) {
        int i3 = 2 % 2;
        int i4 = L + 73;
        N = i4 % 128;
        if (i4 % 2 != 0) {
            this.I = i2;
            return;
        }
        this.I = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
