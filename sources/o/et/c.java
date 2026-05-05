package o.et;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.card.emvapplication.EmvApplication;
import fr.antelop.sdk.card.emvapplication.EmvApplicationType;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.a.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends o.eq.b {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$m = null;
    private static final int $$n = 0;
    private static final byte[] $$s = null;
    private static final int $$t = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int G = 0;
    private static long H = 0;
    private static char I = 0;
    private static char[] J = null;
    private static long K = 0;
    private static int L = 0;
    private static int M = 0;
    private static int N = 0;
    private static int P = 0;
    public static int Z = 0;
    public static int aa = 0;

    /* JADX INFO: renamed from: f */
    public static int f25341f = 0;

    /* JADX INFO: renamed from: k */
    public static int f25342k = 0;

    /* JADX INFO: renamed from: l */
    public static int f25343l = 0;

    /* JADX INFO: renamed from: m */
    public static int f25344m = 0;

    /* JADX INFO: renamed from: n */
    public static int f25345n = 0;

    /* JADX INFO: renamed from: o */
    public static int f25346o = 0;

    /* JADX INFO: renamed from: p */
    public static int f25347p = 0;

    /* JADX INFO: renamed from: q */
    public static int f25348q = 0;

    /* JADX INFO: renamed from: r */
    public static int f25349r = 0;

    /* JADX INFO: renamed from: s */
    public static int f25350s = 0;

    /* JADX INFO: renamed from: t */
    public static int f25351t = 0;

    /* JADX INFO: renamed from: u */
    public static int f25352u = 0;

    /* JADX INFO: renamed from: v */
    public static int f25353v = 0;

    /* JADX INFO: renamed from: w */
    public static int f25354w = 0;

    /* JADX INFO: renamed from: y */
    public static int f25355y = 0;
    private final HashMap<Integer, byte[]> A;
    private byte[] B;
    private byte[] C;
    private boolean D;
    private byte[] E;
    private String F;

    /* JADX INFO: renamed from: g */
    private final String f25356g;

    /* JADX INFO: renamed from: h */
    private o.dp.b f25357h;

    /* JADX INFO: renamed from: i */
    private final int f25358i;

    /* JADX INFO: renamed from: j */
    private final String f25359j;

    /* JADX INFO: renamed from: x */
    private short f25360x;

    /* JADX INFO: renamed from: z */
    private byte[] f25361z;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$u(byte r7, short r8, int r9) {
        /*
            int r0 = r7 * 3
            int r7 = r0 + 4
            byte[] r6 = o.et.c.$$s
            int r5 = 122 - r8
            int r0 = r9 * 2
            int r4 = 1 - r0
            byte[] r3 = new byte[r4]
            r2 = 0
            if (r6 != 0) goto L26
            r0 = r4
            r1 = r2
        L13:
            int r5 = r5 + r0
            int r7 = r7 + 1
        L16:
            byte r0 = (byte) r5
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r4) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            r0 = r6[r7]
            goto L13
        L26:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.c.$$u(byte, short, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        aa = 894092922;
        Z = 639691109;
        init$0();
        f25355y = -1144888503;
        f25352u = -611818838;
        f25354w = 710139616;
        f25353v = -210009539;
        f25351t = 1987806162;
        f25350s = -1546848530;
        f25349r = -1502061504;
        f25347p = -1212304216;
        f25348q = 740551381;
        f25343l = -1908894668;
        f25342k = 1300927159;
        f25346o = 686093357;
        f25344m = -815983258;
        f25345n = 1494446762;
        f25341f = -93740539;
        N = 0;
        P = 1;
        M = 0;
        L = 1;
        E();
        ViewConfiguration.getPressedStateDuration();
        MotionEvent.axisFromString("");
        AudioTrack.getMinVolume();
        ViewConfiguration.getWindowTouchSlop();
        ExpandableListView.getPackedPositionType(0L);
        Process.getThreadPriority(0);
        int i2 = P + 5;
        N = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
    }

    public c(String str, o.dp.b bVar, String str2, int i2, String str3) {
        super(str);
        this.A = new HashMap<>();
        this.f25357h = bVar;
        this.f25356g = str2;
        this.f25358i = i2;
        this.f25359j = str3;
    }

    static void E() {
        H = -6066146789641611856L;
        G = 1564493270;
        I = (char) 17878;
        J = new char[]{38039, 51034, 13083, 28622, 56209, 13891, 25102, 57084, 2743, 25975, 53558, 3562, 31147, 54379, '/', 38040, 51031, 13068, 28639, 56268, 13898, 25099, 57024, 2741, 25912, 53513, 3559, 31153, 54386, '/', 31971, 15036, 26999, 40241, 49635, 30114, 39008, 52257, 28847, 42140, 52041, 32517, 41887, 55212, 31306, 44561, 53960, 1771, 43696, 55649, 3368, 45529, 58785, 2167, 48164, 57564, 5277};
        K = -2773774829093730506L;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = L + 105;
        int i4 = i3 % 128;
        M = i4;
        int i5 = i3 % 2;
        String str = cVar.f25359j;
        int i6 = i4 + 67;
        L = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static String a(String str) {
        int i2 = 2 % 2;
        int i3 = M + 31;
        L = i3 % 128;
        return a(str, i3 % 2 == 0 ? 0 : 1);
    }

    public static String a(String str, int i2) throws Throwable {
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        ai((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "Ἡ칔惀蠼\uf536\ue08b哟恞鐝ౕ", "偦╉鈁ꆗ", "ᘊ䋣锶\u1aea", View.resolveSizeAndState(0, 0, 0), objArr);
        String string = sb.append(((String) objArr[0]).intern()).append(str).toString();
        if (i2 >= 2) {
            return string;
        }
        StringBuilder sbAppend = new StringBuilder().append(string);
        Object[] objArr2 = new Object[1];
        ai((char) (33066 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "깶", "偦╉鈁ꆗ", "ⶔ鋓⫉\udb81", (-913124563) - TextUtils.getTrimmedLength(""), objArr2);
        String string2 = sbAppend.append(((String) objArr2[0]).intern()).append(i2).toString();
        int i4 = M + 125;
        L = i4 % 128;
        int i5 = i4 % 2;
        return string2;
    }

    private static void ai(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 67;
        $10 = i5 % 128;
        Object obj = null;
        Object charArray = str6;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str6 != null) {
            int i6 = i4 + 13;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str6.toCharArray();
                throw null;
            }
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            int i7 = $11 + 121;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str5.toCharArray();
                throw null;
            }
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i8 = $11 + 87;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            charArray3 = str4.toCharArray();
        }
        o.a.i iVar = new o.a.i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 106, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -155898465, false, $$u(b2, (byte) ((b2 + 57) - (57 & b2)), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(847 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.getTrimmedLength("") + 6488), 11 - MotionEvent.axisFromString(""), -694521287, false, $$u(b3, (byte) ((b3 + 54) - (54 & b3)), b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(Color.red(0) + 458, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 11 - (KeyEvent.getMaxKeyCode() >> 16), 1804962841, false, $$u(b4, (byte) (56 | b4), b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA4 = o.d.d.a(640 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 65100), 12 - (ViewConfiguration.getEdgeSlop() >> 16), 1636969060, false, $$u(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) ((((long) ((int) (((long) G) ^ 740602047300126166L))) ^ (((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (H ^ 740602047300126166L))) ^ ((long) ((char) (((long) I) ^ 740602047300126166L))));
                iVar.f19932b++;
                obj = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void aj(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r3 = r8 * 2
            int r2 = 1 - r3
            int r1 = 101 - r7
            byte[] r8 = o.et.c.$$d
            int r0 = r6 * 2
            int r0 = r0 + 4
            byte[] r7 = new byte[r2]
            r6 = 0
            int r5 = 0 - r3
            if (r8 != 0) goto L30
            r3 = r0
            r2 = r5
            r4 = r6
        L16:
            int r1 = -r0
            int r1 = r1 + r2
            int r0 = r3 + 1
            r3 = r4
        L1b:
            byte r2 = (byte) r1
            r7[r3] = r2
            int r4 = r3 + 1
            if (r3 != r5) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            r9[r6] = r0
            return
        L2a:
            r2 = r8[r0]
            r3 = r0
            r0 = r2
            r2 = r1
            goto L16
        L30:
            r3 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.c.aj(byte, short, byte, java.lang.Object[]):void");
    }

    private static void ak(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(J[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(743 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) Color.green(0), 12 - (ViewConfiguration.getTouchSlop() >> 8), 632508977, false, $$u(b2, (byte) (23 | b2), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(K), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(Color.rgb(0, 0, 0) + 16777982, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 12470), 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1946853218, false, $$u(b3, (byte) (22 | b3), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(388 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 39570797, false, $$u(b4, (byte) (17 | b4), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i6 = $10 + 19;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $11 + 69;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 387, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, 39570797, false, $$u(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 17))), b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i9 = 74 / 0;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr6 = {oVar, oVar};
                Object objA5 = o.d.d.a(-723636472);
                if (objA5 == null) {
                    byte b6 = (byte) 0;
                    objA5 = o.d.d.a(386 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, 39570797, false, $$u(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 17))), b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void al(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 * 10
            int r0 = 111 - r0
            int r1 = r8 * 7
            int r8 = 8 - r1
            byte[] r7 = o.et.c.$$m
            int r6 = r6 + 4
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L2e
            r2 = r0
            r3 = r4
            r1 = r6
        L14:
            int r6 = r6 + r2
            int r0 = r6 + (-6)
            r2 = r3
            r6 = r1
        L19:
            int r3 = r2 + 1
            byte r1 = (byte) r0
            r5[r2] = r1
            if (r3 != r8) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L28:
            int r1 = r6 + 1
            r2 = r7[r1]
            r6 = r0
            goto L14
        L2e:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.c.al(short, int, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = L + 81;
        M = i3 % 128;
        int i4 = i3 % 2;
        o.en.e eVar = o.en.e.f24190c;
        if (i4 != 0) {
            int i5 = 58 / 0;
        }
        return eVar;
    }

    private o.dp.b b() {
        int i2 = 2 % 2;
        int i3 = L + 1;
        int i4 = i3 % 128;
        M = i4;
        int i5 = i3 % 2;
        o.dp.b bVar = this.f25357h;
        int i6 = i4 + 105;
        L = i6 % 128;
        int i7 = i6 % 2;
        return bVar;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        c cVar = (c) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i2 = 2 % 2;
        int i3 = L + 53;
        int i4 = i3 % 128;
        M = i4;
        int i5 = i3 % 2;
        cVar.C = bArr;
        int i6 = i4 + 117;
        L = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void c(int i2, int i3, byte[] bArr) {
        int i4 = 2 % 2;
        int i5 = M + 69;
        L = i5 % 128;
        int i6 = i5 % 2;
        this.A.put(Integer.valueOf((i2 * 100) + i3), bArr);
        int i7 = L + 81;
        M = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fr.antelop.sdk.card.emvapplication.EmvApplication d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.c.d():fr.antelop.sdk.card.emvapplication.EmvApplication");
    }

    public static /* synthetic */ Object d(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~((i8 + i2) - (i8 & i2));
        int i10 = ~i2;
        int i11 = ~((-1) - (((-1) - (~i3)) & ((-1) - i10)));
        int i12 = ~((i10 + i4) - (i10 & i4));
        int i13 = (i11 + i12) - (i11 & i12);
        int i14 = i12 | i9;
        int i15 = ~((-1) - (((-1) - i3) & ((-1) - i8)));
        int i16 = (i15 + i14) - (i15 & i14);
        int i17 = i2 + i4 + i5 + ((-168536539) * i6) + (1787681333 * i7);
        int i18 = i17 * i17;
        int i19 = ((-1349843359) * i2) + 1460535296 + ((-923239215) * i4) + ((-1716058528) * i9) + (i13 * (-1289454384)) + ((-1289454384) * i16) + (366215168 * i5) + (1604583424 * i6) + (216268800 * i7) + (1778253824 * i18);
        int i20 = (i2 * (-925914073)) + 175428941 + (i4 * (-925912777)) + (i9 * (-864)) + (i13 * 432) + (i16 * 432) + (i5 * (-925913209)) + (i6 * 1252505731) + (i7 * 30625011) + (i18 * (-2030960640));
        switch (i19 + (i20 * i20 * 899809280)) {
            case 1:
                return d(objArr);
            case 2:
                return b(objArr);
            case 3:
                return a(objArr);
            case 4:
                c cVar = (c) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i21 = 2 % 2;
                int i22 = L + 53;
                int i23 = i22 % 128;
                M = i23;
                int i24 = i22 % 2;
                cVar.B = bArr;
                int i25 = i23 + 59;
                L = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 5:
                c cVar2 = (c) objArr[0];
                int i27 = 2 % 2;
                int i28 = M;
                int i29 = i28 + 11;
                L = i29 % 128;
                int i30 = i29 % 2;
                byte[] bArr2 = cVar2.f25361z;
                int i31 = i28 + 67;
                L = i31 % 128;
                int i32 = i31 % 2;
                return bArr2;
            case 6:
                return e(objArr);
            default:
                return c(objArr);
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = L + 51;
        int i4 = i3 % 128;
        M = i4;
        int i5 = i3 % 2;
        short s2 = cVar.f25360x;
        int i6 = i4 + 55;
        L = i6 % 128;
        if (i6 % 2 != 0) {
            return Short.valueOf(s2);
        }
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = M + 113;
        int i4 = i3 % 128;
        L = i4;
        int i5 = i3 % 2;
        byte[] bArr = cVar.E;
        if (i5 == 0) {
            int i6 = 9 / 0;
        }
        int i7 = i4 + 81;
        M = i7 % 128;
        int i8 = i7 % 2;
        return bArr;
    }

    public static String e(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = M + 109;
        L = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        ai((char) Color.blue(0), "Ἡ칔惀蠼\uf536\ue08b哟恞鐝ౕ", "偦╉鈁ꆗ", "ᘊ䋣锶\u1aea", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr);
        String strReplace = str.replace(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        ai((char) (33066 - (Process.myPid() >> 22)), "깶", "偦╉鈁ꆗ", "ⶔ鋓⫉\udb81", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 913124564, objArr2);
        String str2 = strReplace.split(((String) objArr2[0]).intern())[0];
        int i5 = M + 17;
        L = i5 % 128;
        int i6 = i5 % 2;
        return str2;
    }

    static void init$0() {
        $$d = new byte[]{103, 35, 47, 90};
        $$e = JfifUtil.MARKER_SOS;
    }

    static void init$1() {
        $$m = new byte[]{92, 54, -72, -111, MessagePack.Code.BIN16, 57, 6, MessagePack.Code.INT64, 58, MessagePack.Code.EXT16, 19};
        $$n = 195;
    }

    static void init$2() {
        $$s = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
        $$t = 66;
    }

    public final byte[] B() {
        int i2 = 2 % 2;
        int i3 = L + 17;
        M = i3 % 128;
        if (i3 % 2 == 0) {
            return this.C;
        }
        throw null;
    }

    public final byte[] C() {
        int i2 = 2 % 2;
        int i3 = M;
        int i4 = i3 + 79;
        L = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = this.B;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        L = i6 % 128;
        if (i6 % 2 != 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eq.b
    public final o.en.e D() {
        int i2 = (-1587392681) * f25342k;
        f25342k = i2;
        return (o.en.e) d(-687807208, new Object[]{this}, i2, 687807210, (int) Runtime.getRuntime().freeMemory(), new Random().nextInt(691283095), new Random().nextInt(216167276));
    }

    public abstract byte[] F();

    public final byte[] G() {
        int i2 = (-461147492) * f25352u;
        f25352u = i2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = f25355y * 1590723469;
        f25355y = i3;
        return (byte[]) d(-2031214237, new Object[]{this}, i2, 2031214243, elapsedCpuTime, iElapsedRealtime, i3);
    }

    public final String I() {
        int i2 = 2 % 2;
        int i3 = M + 5;
        int i4 = i3 % 128;
        L = i4;
        int i5 = i3 % 2;
        String str = this.F;
        int i6 = i4 + 25;
        M = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public abstract EmvApplicationType a();

    public final void a(List<o.cl.b> list) {
        int i2 = 2 % 2;
        int i3 = L + 87;
        M = i3 % 128;
        if (i3 % 2 != 0) {
            list.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Iterator<o.cl.b> it = list.iterator();
        while (it.hasNext()) {
            int i4 = M + 63;
            L = i4 % 128;
            if (i4 % 2 == 0) {
                o.cl.b next = it.next();
                c(next.d(), next.b(), next.e());
                int i5 = 56 / 0;
            } else {
                o.cl.b next2 = it.next();
                c(next2.d(), next2.b(), next2.e());
            }
        }
    }

    public final void a(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = M;
        int i4 = i3 + 69;
        L = i4 % 128;
        int i5 = i4 % 2;
        this.E = bArr;
        int i6 = i3 + 109;
        L = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.eq.b
    public final o.eq.b b(String str) {
        int i2 = 2 % 2;
        int i3 = L + 83;
        M = i3 % 128;
        int i4 = i3 % 2;
        String str2 = this.f25356g;
        if (i4 == 0) {
            return b(str, str2, this.f25358i, this.f25359j);
        }
        int i5 = 36 / 0;
        return b(str, str2, this.f25358i, this.f25359j);
    }

    protected abstract c b(String str, String str2, int i2, String str3);

    public final void b(short s2) {
        int i2 = 2 % 2;
        int i3 = L + 19;
        M = i3 % 128;
        if (i3 % 2 == 0) {
            this.f25360x = s2;
        } else {
            this.f25360x = s2;
            throw null;
        }
    }

    public final void c(byte[] bArr) {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int id = (int) Thread.currentThread().getId();
        int i3 = f25341f * 1595628892;
        f25341f = i3;
        d(-1863692548, new Object[]{this, bArr}, i2, 1863692548, id, i3, Process.myUid());
    }

    public final void d(boolean z2) {
        int i2 = 2 % 2;
        int i3 = L;
        int i4 = i3 + 77;
        M = i4 % 128;
        int i5 = i4 % 2;
        this.D = z2;
        int i6 = i3 + 5;
        M = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void d(byte[] bArr) {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = f25349r * 1770900040;
        f25349r = i2;
        int i3 = f25350s * 1440287991;
        f25350s = i3;
        int i4 = f25351t * 985966497;
        f25351t = i4;
        d(486595506, new Object[]{this, bArr}, iUptimeMillis, -486595502, i2, i3, i4);
    }

    @Override // o.ea.a
    public final /* synthetic */ EmvApplication e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = L + 75;
        M = i3 % 128;
        if (i3 % 2 != 0) {
            d();
            throw null;
        }
        EmvApplication emvApplicationD = d();
        int i4 = M + 5;
        L = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return emvApplicationD;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0646  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(o.cl.b r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.c.e(o.cl.b):void");
    }

    protected final void e(o.dp.b bVar) {
        int i2 = 2 % 2;
        int i3 = L + 5;
        int i4 = i3 % 128;
        M = i4;
        int i5 = i3 % 2;
        this.f25357h = bVar;
        int i6 = i4 + 57;
        L = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 36 / 0;
        }
    }

    public final void e(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = M + 87;
        int i4 = i3 % 128;
        L = i4;
        int i5 = i3 % 2;
        this.f25361z = bArr;
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        M = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int f() {
        int i2 = 2 % 2;
        int i3 = M + 69;
        int i4 = i3 % 128;
        L = i4;
        int i5 = i3 % 2;
        int i6 = this.f25358i;
        int i7 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        M = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 82 / 0;
        }
        return i6;
    }

    public final void f(String str) {
        int i2 = 2 % 2;
        int i3 = M + 71;
        L = i3 % 128;
        if (i3 % 2 != 0) {
            this.F = str;
            return;
        }
        this.F = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = M;
        int i4 = i3 + 39;
        L = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f25356g;
        int i6 = i3 + 77;
        L = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
        return str;
    }

    public final byte[] h() {
        int iMyPid = Process.myPid();
        int i2 = f25353v * 1073314991;
        f25353v = i2;
        int iMyTid = Process.myTid();
        int i3 = f25354w * 1986112249;
        f25354w = i3;
        return (byte[]) d(-1168717246, new Object[]{this}, iMyPid, 1168717251, i2, iMyTid, i3);
    }

    public final String i() throws Throwable {
        int i2 = 2 % 2;
        int i3 = L + 111;
        M = i3 % 128;
        int i4 = i3 % 2;
        if (!l()) {
            return k();
        }
        int i5 = M + 63;
        L = i5 % 128;
        int i6 = i5 % 2;
        String strK = k();
        Object[] objArr = new Object[1];
        ai((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "Ἡ칔惀蠼\uf536\ue08b哟恞鐝ౕ", "偦╉鈁ꆗ", "ᘊ䋣锶\u1aea", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        String strReplace = strK.replace(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        ai((char) (MotionEvent.axisFromString("") + 33067), "깶", "偦╉鈁ꆗ", "ⶔ鋓⫉\udb81", (-913124562) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
        String str = strReplace.split(((String) objArr2[0]).intern())[0];
        int i7 = L + 55;
        M = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = M + 29;
        L = i3 % 128;
        int i4 = i3 % 2;
        String strE = o.dl.d.e(this.f25361z);
        int i5 = L + 79;
        M = i5 % 128;
        int i6 = i5 % 2;
        return strE;
    }

    public final boolean l() {
        int i2 = 2 % 2;
        int i3 = M + 73;
        int i4 = i3 % 128;
        L = i4;
        int i5 = i3 % 2;
        boolean z2 = this.D;
        int i6 = i4 + 23;
        M = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final byte[] m() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = L + 87;
            M = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            ai((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 41133), "\ue541鑛⛏〴レ蹎ṉ⫡懍\ude61臨훓\ue483漫", "偦╉鈁ꆗ", "ꅲ\ue5ac굴媠", ViewConfiguration.getEdgeSlop() >> 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            ai((char) (ExpandableListView.getPackedPositionChild(0L) + 39781), "܍猪\uddbb㕑\ue3adᜲ春\ud856㾋ขᇒ嚭엷\ud998襵ﻳ㫍湊⌀鞙ᷭꖟ휪漣땤ꝸＥ㡃⹄䅑蹲", "偦╉鈁ꆗ", "貗瓦擐誛", (-797645173) - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.ff.e eVarD = o.en.b.c().e().f().d(this);
        if (eVarD == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(eVarD.i());
        byte[] bArrArray = byteBufferAllocate.array();
        if (o.ea.f.a()) {
            Object[] objArr3 = new Object[1];
            ai((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41133), "\ue541鑛⛏〴レ蹎ṉ⫡懍\ude61臨훓\ue483漫", "偦╉鈁ꆗ", "ꅲ\ue5ac굴媠", ViewConfiguration.getScrollBarSize() >> 8, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = new Object[1];
            ai((char) (ViewConfiguration.getTouchSlop() >> 8), "泔笚矓聑\udd68뺛ᗤ殫餼\uef7eꌰ氽윊ø拈栣➿ꥻ颖╂㪒ꏈ鴃ឝ", "偦╉鈁ꆗ", "헂❹엠驈", View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
            o.ea.f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(o.dl.d.e(new byte[]{bArrArray[2], bArrArray[3]})).toString());
            int i5 = L + 97;
            M = i5 % 128;
            int i6 = i5 % 2;
        }
        return new byte[]{bArrArray[2], bArrArray[3]};
    }

    public final short n() {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = f25345n * 655284246;
        f25345n = i2;
        int i3 = f25344m * 705755884;
        f25344m = i3;
        int i4 = f25346o * (-100553870);
        f25346o = i4;
        return ((Short) d(1163887627, new Object[]{this}, elapsedCpuTime, -1163887626, i2, i3, i4)).shortValue();
    }

    public final String o() {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = f25343l * (-1658435610);
        f25343l = i2;
        int i3 = f25348q * 740487534;
        f25348q = i3;
        int i4 = f25347p * (-1494696993);
        f25347p = i4;
        return (String) d(-1396987465, new Object[]{this}, iUptimeMillis, 1396987468, i2, i3, i4);
    }

    @Override // o.eq.b
    public final String q() {
        int i2 = 2 % 2;
        int i3 = L + 9;
        M = i3 % 128;
        int i4 = i3 % 2;
        String strA = b().a();
        int i5 = M + 59;
        L = i5 % 128;
        int i6 = i5 % 2;
        return strA;
    }

    @Override // o.eq.b
    public final boolean s() {
        int i2 = 2 % 2;
        int i3 = M;
        int i4 = i3 + 111;
        L = i4 % 128;
        int i5 = i4 % 2;
        if (this.D) {
            return false;
        }
        int i6 = i3 + 105;
        L = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public final short z() throws Throwable {
        int i2 = 2 % 2;
        int i3 = M + 65;
        L = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = M + 41;
            L = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            ai((char) (41133 - (ViewConfiguration.getEdgeSlop() >> 16)), "\ue541鑛⛏〴レ蹎ṉ⫡懍\ude61臨훓\ue483漫", "偦╉鈁ꆗ", "ꅲ\ue5ac굴媠", View.getDefaultSize(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            ai((char) (30144 - MotionEvent.axisFromString("")), "쇌퉻黗⾢癎鶍䣜갏텔陑筿\udabc\uf41eॼ廸萫ꮕ뱺\uf69e㇇\ue1b5ᥢ\uddd9ꜰ꼵붣ൖꂼ휦", "偦╉鈁ꆗ", "੯憰솢챵", (-1570656246) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        short sB = o.en.b.c().e().f().b(this);
        int i7 = M + 103;
        L = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 97 / 0;
        }
        return sB;
    }
}
