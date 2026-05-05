package o.cn;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.i;
import o.d.d;
import o.en.f;
import o.et.c;
import o.et.g;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b<T extends g> extends e<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f22497a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f22498b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f22499c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f22500d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f22501e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22502f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f22503g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22504h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22505i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22506j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f22507k = 0;

    private static String $$j(byte b2, short s2, int i2) {
        int i3 = 122 - s2;
        int i4 = 4 - (i2 * 2);
        int i5 = b2 * 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += i4;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i4;
            i3 += bArr[i4];
            i4 = i7 + 1;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f22505i = 0;
        f22507k = 1;
        f22502f = 0;
        f22506j = 1;
        d();
        TextUtils.lastIndexOf("", '0', 0);
        AudioTrack.getMinVolume();
        int i2 = f22507k + 27;
        f22505i = i2 % 128;
        int i3 = i2 % 2;
    }

    private T c(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22502f + 39;
        f22506j = i4 % 128;
        int i5 = i4 % 2;
        T t2 = (T) e(str, str2, i2, str3);
        int i6 = f22502f + 43;
        f22506j = i6 % 128;
        int i7 = i6 % 2;
        return t2;
    }

    static void d() {
        f22499c = (char) 13907;
        f22497a = (char) 59809;
        f22501e = (char) 42641;
        f22500d = (char) 3481;
        f22498b = 740602047300126166L;
        f22504h = 1564493270;
        f22503g = (char) 19799;
    }

    static void init$0() {
        $$a = new byte[]{76, -81, MessagePack.Code.EXT16, -107};
        $$b = 39;
    }

    static void init$1() {
        $$d = new byte[]{101, -87, 81, 90, MessagePack.Code.BIN32, 58, 8, MessagePack.Code.INT64, 58};
        $$e = 247;
    }

    static void init$2() {
        $$c = new byte[]{49, 53, Ascii.ETB, 7};
        $$i = 101;
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $10 + 15;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr3[i6] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d];
            } else {
                cArr3[i6] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
            }
            int i8 = 58224;
            int i9 = i6;
            while (i9 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) f22501e) ^ (-7511683281764982996L))));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f22500d);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        int minimumFlingVelocity = 270 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        int i12 = (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11;
                        byte b2 = (byte) i6;
                        String str$$j = $$j(b2, $$c[1], b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = d.a(minimumFlingVelocity, cAxisFromString, i12, -1995022631, false, str$$j, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f22499c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22497a)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 270, (char) KeyEvent.getDeadChar(0, 0), Drawable.resolveOpacity(0, 0) + 11, -1995022631, false, $$j(b3, $$c[1], b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = d.a(1390051551);
            if (objA3 == null) {
                byte b4 = (byte) 0;
                objA3 = d.a(View.MeasureSpec.getSize(0) + 270, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2074123590, false, $$j(b4, (byte) ((b4 + 50) - (50 & b4)), b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        String str3 = new String(cArr2, 0, i2);
        int i13 = $10 + 101;
        $11 = i13 % 128;
        int i14 = i13 % 2;
        objArr[0] = str3;
    }

    private static void n(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $10 + 105;
        $11 = i4 % 128;
        Object obj = null;
        Object obj2 = str6;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str6 != null) {
            char[] charArray = str6.toCharArray();
            int i5 = $10 + 109;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            obj2 = charArray;
        }
        char[] cArr = (char[]) obj2;
        Object obj3 = str5;
        if (str5 != null) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                str5.toCharArray();
                throw null;
            }
            char[] charArray2 = str5.toCharArray();
            int i8 = $11 + 41;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            obj3 = charArray2;
        }
        char[] cArr2 = (char[]) obj3;
        Object charArray3 = str4;
        if (str4 != null) {
            int i10 = $10 + 113;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                str4.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray3 = str4.toCharArray();
        }
        i iVar = new i();
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
                Object objA = d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(107 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - KeyEvent.normalizeMetaState(0), -155898465, false, $$j(b2, (byte) (57 | b2), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = d.a((ViewConfiguration.getTouchSlop() >> 8) + 847, (char) (Color.green(0) + 6488), '<' - AndroidCharacter.getMirror('0'), -694521287, false, $$j(b3, (byte) (54 | b3), b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = d.a(458 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) TextUtils.indexOf("", "", 0), 10 - MotionEvent.axisFromString(""), 1804962841, false, $$j(b4, (byte) (56 | b4), b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA4 = d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 638, (char) (65101 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777228, 1636969060, false, $$j(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f22498b ^ 740602047300126166L)) ^ ((long) ((int) (((long) f22504h) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f22503g) ^ 740602047300126166L))));
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(byte r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.cn.b.$$a
            int r7 = r9 + 4
            int r0 = r10 * 3
            int r6 = r0 + 97
            int r1 = r11 * 3
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r8 != 0) goto L2c
            r2 = r7
            r0 = r3
            r1 = r4
        L16:
            int r0 = -r0
            int r7 = r7 + r0
        L18:
            int r2 = r2 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L27:
            r0 = r8[r2]
            int r1 = r1 + 1
            goto L16
        L2c:
            r1 = r4
            r2 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cn.b.p(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r2 = r6 * 5
            int r1 = 6 - r2
            int r0 = r8 * 13
            int r8 = 111 - r0
            int r0 = r7 * 5
            int r7 = r0 + 4
            byte[] r6 = o.cn.b.$$d
            byte[] r5 = new byte[r1]
            int r4 = 5 - r2
            r3 = 0
            if (r6 != 0) goto L31
            r8 = r4
            r2 = r7
            r1 = r3
        L18:
            int r8 = r8 + r7
            int r7 = r2 + 1
            int r8 = r8 + (-7)
        L1d:
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r1 != r4) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r3)
            r9[r3] = r0
            return
        L2a:
            r0 = r6[r7]
            int r1 = r1 + 1
            r2 = r7
            r7 = r0
            goto L18
        L31:
            r1 = r3
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cn.b.q(int, int, int, java.lang.Object[]):void");
    }

    @Override // o.cl.c
    public final /* synthetic */ o.eq.b a(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22506j + 67;
        f22502f = i4 % 128;
        if (i4 % 2 == 0) {
            return c(str, str2, i2, str3);
        }
        c(str, str2, i2, str3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f3, code lost:
    
        if (r10 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013c, code lost:
    
        if (r10 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        if (o.ea.f.a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
    
        r3 = new java.lang.Object[1];
        n((char) (android.view.View.MeasureSpec.getSize(0) + 18206), "趼圴櫹碋\u0ff8얐构岥瘕燕ᇺ㡺㊤悰倱쇳柆磓\uda68⍰뤵\uf071䛀跕౬㓓녉乘ꂓ鏏禡", "\u0000\u0000\u0000\u0000", "켅聖Ṭ慇", 1820350159 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), r3);
        r11 = ((java.lang.String) r3[0]).intern();
        r9 = new java.lang.Object[1];
        l("׃ṯ\ue2ae貇駝㲔釥띑ﵯॽ䰲ﺘ㪂\ue2b8\ue889\ueca5짱ꤾ垓✸莫竧Ҡ郕\udde8泾ￛ\ue432\uf6f9醳淏俱켷鵖莫竧Ҡ郕짱ꤾ釥띑ﵯॽ䰲ﺘ㪂\ue2b8짱ꤾ쨛쏳齟媊뚭㱡ꟲ놝붦桖짱ꤾோ⫼窓흵妱誨භຉ了㌽㪂\ue2b8䱅悍쒣龜\ue467\uedba\uda6f戄袎ꉾ蛻ﳝ쒣龜禛㽕惍萞뚭㱡惍萞塙ኸ懙ꠠ鍎鬒釥띑", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 103, r9);
        o.ea.f.c(r11, ((java.lang.String) r9[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0187, code lost:
    
        r3 = (T) e(o.et.c.a(r23.k()), r23.g(), r23.f(), r26);
        r3.e(r2);
        r9 = new java.lang.Object[1];
        l("\ud7ab矷꼔좂嘹\ue6df훧麰巐ਆ峭⹍郞\ufb10", 13 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), r9);
        r9 = r27.x(((java.lang.String) r9[0]).intern());
        r2 = new java.lang.Object[1];
        n((char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))), "즥澽䛈劗\uea1c쬆녥䯳䒇蜤澀ᾠ奥\u2d7b㞝\uf8b9䈷油ၕ긹ᯎ浠", "\u0000\u0000\u0000\u0000", "⁌玱뮃豾", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), r2);
        r2 = r9.x(((java.lang.String) r2[0]).intern());
        r11 = android.os.Process.myPid();
        r13 = o.et.c.f25353v * 1073314991;
        o.et.c.f25353v = r13;
        r14 = android.os.Process.myTid();
        r15 = o.et.c.f25354w * 1986112249;
        o.et.c.f25354w = r15;
        r9 = (byte[]) o.et.c.d(-1168717246, new java.lang.Object[]{r3}, r11, 1168717251, r13, r14, r15);
        r15 = new java.lang.Object[1];
        n((char) android.text.TextUtils.getOffsetAfter("", 0), "咳㱌ᄏꨗ圲꽼ა", "\u0000\u0000\u0000\u0000", "鄭\uf3ee┤뼫", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 619966097, r15);
        r10 = new java.lang.Object[]{r3, o.dl.b.e(r9, r2.D(((java.lang.String) r15[0]).intern()))};
        r11 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r13 = (int) java.lang.Thread.currentThread().getId();
        r14 = o.et.c.f25341f * 1595628892;
        o.et.c.f25341f = r14;
        o.et.c.d(-1863692548, r10, r11, 1863692548, r13, r14, android.os.Process.myUid());
        r11 = (int) android.os.SystemClock.uptimeMillis();
        r13 = o.et.c.f25349r * 1770900040;
        o.et.c.f25349r = r13;
        r14 = o.et.c.f25350s * 1440287991;
        o.et.c.f25350s = r14;
        r15 = o.et.c.f25351t * 985966497;
        o.et.c.f25351t = r15;
        o.et.c.d(486595506, new java.lang.Object[]{r3, r6}, r11, -486595502, r13, r14, r15);
        r3.b(r7);
        r3.j(r8);
        r9 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r7 = android.os.Process.myUid();
        r10 = o.et.g.D * 1890576045;
        o.et.g.D = r10;
        r8 = new java.lang.Object[]{r3, (java.lang.String) o.et.g.b(1844286791, (int) android.os.SystemClock.elapsedRealtime(), r7, new java.lang.Object[]{r23}, r9, r10, -1844286790)};
        r9 = o.et.g.f25370x * 1529702424;
        o.et.g.f25370x = r9;
        r7 = o.et.g.C * 24801271;
        o.et.g.C = r7;
        r10 = o.et.g.A * 1514048028;
        o.et.g.A = r10;
        r6 = o.et.g.B * (-1276446810);
        o.et.g.B = r6;
        o.et.g.b(1622000802, r6, r7, r8, r9, r10, -1622000802);
        r3.g((byte[]) r23.M().clone());
        r3.c(r23.L());
        r3.i((byte[]) r23.K().clone());
        r7 = (int) android.os.Process.getElapsedCpuTime();
        r9 = o.et.c.f25345n * 655284246;
        o.et.c.f25345n = r9;
        r10 = o.et.c.f25344m * 705755884;
        o.et.c.f25344m = r10;
        r11 = o.et.c.f25346o * (-100553870);
        o.et.c.f25346o = r11;
        r3.b(((java.lang.Short) o.et.c.d(1163887627, new java.lang.Object[]{r23}, r7, -1163887626, r9, r10, r11)).shortValue());
        r3.d(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0345, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    @Override // o.cn.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T a(o.et.g r23, o.ef.a r24, int r25, java.lang.String r26, o.ef.a r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cn.b.a(o.et.g, o.ef.a, int, java.lang.String, o.ef.a):o.et.g");
    }

    @Override // o.cn.e
    public final T b(String str, String str2, int i2, String str3, o.ef.a aVar) throws Throwable {
        int iIntValue;
        int i3 = 2 % 2;
        int i4 = f22506j + 87;
        f22502f = i4 % 128;
        int i5 = i4 % 2;
        T t2 = (T) e(str, str2, i2, str3);
        Object[] objArr = new Object[1];
        l("\ud7ab矷꼔좂嘹\ue6df훧麰巐ਆ峭⹍郞\ufb10", 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        o.ef.a aVarX = aVar.x(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        n((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "즥澽䛈劗\uea1c쬆녥䯳䒇蜤澀ᾠ奥\u2d7b㞝\uf8b9䈷油ၕ긹ᯎ浠", "\u0000\u0000\u0000\u0000", "⁌玱뮃豾", View.resolveSize(0, 0), objArr2);
        o.ef.a aVarX2 = aVarX.x(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        n((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), "\u0083ꋋ镛\uefa7鏌胻镶\ud8f2ꭡ킬࿌⁰鷮碕鳰㪃\udebf긕\uf1eb톯\udc4c㒉", "\u0000\u0000\u0000\u0000", "㢸\u0c11ԥｑ", ViewConfiguration.getDoubleTapTimeout() >> 16, objArr3);
        o.ef.a aVarX3 = aVarX.x(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        n((char) (View.resolveSize(0, 0) + 38038), "Ώ碎᷊", "\u0000\u0000\u0000\u0000", "ꈭ鼠阚檔", AndroidCharacter.getMirror('0') + 8306, objArr4);
        t2.e(aVarX2.D(((String) objArr4[0]).intern()));
        Object[] objArr5 = new Object[1];
        l("׃ṯҭ䔫ᚒ蟮ڣ癸≘暖", 9 - ExpandableListView.getPackedPositionChild(0L), objArr5);
        Object[] objArr6 = {t2, aVarX2.D(((String) objArr5[0]).intern())};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i6 = c.f25349r * 1770900040;
        c.f25349r = i6;
        int i7 = c.f25350s * 1440287991;
        c.f25350s = i7;
        int i8 = c.f25351t * 985966497;
        c.f25351t = i8;
        c.d(486595506, objArr6, iUptimeMillis, -486595502, i6, i7, i8);
        Object[] objArr7 = new Object[1];
        n((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), "㩍Ⰽ臫\udbe5ອቋ㎭薧뙈耿㍺", "\u0000\u0000\u0000\u0000", "\uf5d2㺺娷谴", Color.blue(0) + 926857973, objArr7);
        t2.b(aVarX2.D(((String) objArr7[0]).intern()));
        Object[] objArr8 = new Object[1];
        n((char) (ImageFormat.getBitsPerPixel(0) + 1), "穟弿骃呼睞\ue071㝓鴅뀫斑", "\u0000\u0000\u0000\u0000", "\udc10\u18ae\uf254㫼", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr8);
        t2.j(aVarX2.z(((String) objArr8[0]).intern()));
        Object[] objArr9 = new Object[1];
        l("饌\ud7a5〓\ue0a9ꟲ놝歫⣭‛뙃䥩⧠\ue891Ҵ亊萵", 15 - View.combineMeasuredStates(0, 0), objArr9);
        Object[] objArr10 = {aVar, ((String) objArr9[0]).intern()};
        int i9 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i9;
        Object[] objArr11 = {t2, (String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority())};
        int i10 = g.f25370x * 1529702424;
        g.f25370x = i10;
        int i11 = g.C * 24801271;
        g.C = i11;
        int i12 = g.A * 1514048028;
        g.A = i12;
        int i13 = g.B * (-1276446810);
        g.B = i13;
        g.b(1622000802, i13, i11, objArr11, i10, i12, -1622000802);
        Object[] objArr12 = new Object[1];
        l("ᩑꃌ㢩֧ﴨ鶈䄗瓈蚹ﳣ側룟໊喘", 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr12);
        t2.g(aVarX3.D(((String) objArr12[0]).intern()));
        int iMyPid = Process.myPid();
        int i14 = c.f25353v * 1073314991;
        c.f25353v = i14;
        int iMyTid = Process.myTid();
        int i15 = c.f25354w * 1986112249;
        c.f25354w = i15;
        byte[] bArr = (byte[]) c.d(-1168717246, new Object[]{t2}, iMyPid, 1168717251, i14, iMyTid, i15);
        Object[] objArr13 = new Object[1];
        n((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), "咳㱌ᄏꨗ圲꽼ა", "\u0000\u0000\u0000\u0000", "鄭\uf3ee┤뼫", 619966097 - KeyEvent.keyCodeFromString(""), objArr13);
        Object[] objArr14 = {t2, o.dl.b.e(bArr, aVarX2.D(((String) objArr13[0]).intern()))};
        int i16 = (int) Runtime.getRuntime().totalMemory();
        int id = (int) Thread.currentThread().getId();
        int i17 = c.f25341f * 1595628892;
        c.f25341f = i17;
        c.d(-1863692548, objArr14, i16, 1863692548, id, i17, Process.myUid());
        Object[] objArr15 = new Object[1];
        n((char) KeyEvent.getDeadChar(0, 0), "局\u192c荞︖ᆧ⽎쿌\ue328媋苑\uf5e4שּ띡㖕⿳朔ᾱ\udb18瀅耚㉴ꊋ", "\u0000\u0000\u0000\u0000", "浻ꣿዸ纡", TextUtils.indexOf("", "", 0), objArr15);
        Object objA = aVarX2.a(((String) objArr15[0]).intern());
        if (objA instanceof String) {
            try {
                iIntValue = Integer.valueOf((String) objA, 16).intValue();
                int i18 = f22502f + 113;
                f22506j = i18 % 128;
                int i19 = i18 % 2;
            } catch (NumberFormatException unused) {
                Object[] objArr16 = new Object[1];
                l("鋻棸徳↘齟媊럒䱮\uf8cc籐噕뒱椫许\uf622꒷쒣龜⩴뷘鵢\uf20b쒣龜蠐픕২僿\udd30セ斉ݡ싗ൣ了㌽锾㚜짱ꤾ淏俱蠐픕ᶢ\u0ef3쬌襫\udd30セ", 50 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr16);
                throw new f(((String) objArr16[0]).intern());
            }
        } else {
            if (!(objA instanceof Integer)) {
                Object[] objArr17 = new Object[1];
                n((char) (38915 - ExpandableListView.getPackedPositionType(0L)), "\ue729\ud947碪嶾网㕉\uee08ᦉ뜒ᰢ앪廑貳꩗啐헨냗⭺ᱴᣧڋ櫹\uf1b9䗗ݠ墍临痝괟\udc5f禝ֿ鐴淏\udeef祂缚拼㸎첿벫៕䇱좮僁㎠\ue8b9ὀ\ue16e싡\uf762켻焾脩", "\u0000\u0000\u0000\u0000", "춪拣τ\ue198", Color.alpha(0), objArr17);
                throw new f(((String) objArr17[0]).intern());
            }
            iIntValue = ((Integer) objA).intValue();
        }
        Object[] objArr18 = new Object[1];
        n((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "䕻咊䊹\uf03b⛓䇘餳붚\udea9嚗飛\ude4dᴉǿⓃ莅ꍒࡒ蟗株ꂇ", "\u0000\u0000\u0000\u0000", "鐮\uf1f4ἆ䫆", 116520084 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr18);
        byte[] bArrD = aVarX2.D(((String) objArr18[0]).intern());
        t2.c(iIntValue);
        t2.i(bArrD);
        int iMyPid2 = Process.myPid();
        int i20 = c.f25353v * 1073314991;
        c.f25353v = i20;
        int iMyTid2 = Process.myTid();
        int i21 = c.f25354w * 1986112249;
        c.f25354w = i21;
        short sA = o.dl.b.a((byte[]) c.d(-1168717246, new Object[]{t2}, iMyPid2, 1168717251, i20, iMyTid2, i21), t2.B());
        if (sA != 0) {
            t2.b(sA);
            return t2;
        }
        Object[] objArr19 = new Object[1];
        n((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 15878), "㨻ᨩ⚡뵪櫇⭝\ue7e9ፑﯺ\uf0f0ꈔ経酹\ue517㗹⭟뽄\uf4a7馉鈺솎㚮ံ\uda8f뛔鵎蓼콂", "\u0000\u0000\u0000\u0000", "㗡ዋ۱樾", ViewConfiguration.getFadingEdgeLength() >> 16, objArr19);
        throw new f(((String) objArr19[0]).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05f7  */
    @Override // o.cn.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r29, o.ef.a r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cn.b.b(int, o.ef.a):boolean");
    }

    @Override // o.cn.e
    public final o.ef.a c(int i2, o.ef.a aVar) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22506j;
        int i5 = i4 + 49;
        f22502f = i5 % 128;
        int i6 = i5 % 2;
        if (i2 != 0) {
            int i7 = i4 + 103;
            f22502f = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 16 / 0;
            }
            return null;
        }
        Object[] objArr = new Object[1];
        l("\ud7ab矷꼔좂嘹\ue6df훧麰巐ਆ峭⹍郞\ufb10", View.resolveSizeAndState(0, 0, 0) + 13, objArr);
        o.ef.a aVarX = aVar.x(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        n((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), "즥澽䛈劗\uea1c쬆녥䯳䒇蜤澀ᾠ奥\u2d7b㞝\uf8b9䈷油ၕ긹ᯎ浠", "\u0000\u0000\u0000\u0000", "⁌玱뮃豾", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr2);
        o.ef.a aVarX2 = aVarX.x(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        n((char) (54196 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "㕌匫\u1289⨹錟\uf725\uf8ee\uee0d鍂\uea31\ude7c埍᧒\ud8b0ӊ鋤\uef33\ua635ᕪ㢊\uf78f눸\uf0f1ꔋﾭſ㐉⏂疘롚㨃", "\u0000\u0000\u0000\u0000", "咁ὢ뗖\udad3", (-702586285) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        return aVarX2.x(((String) objArr3[0]).intern());
    }

    @Override // o.cn.e
    public final o.ef.c d(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22506j + 57;
        f22502f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        l("\ud7ab矷꼔좂嘹\ue6df훧麰巐ਆ峭⹍郞\ufb10", TextUtils.getCapsMode("", 0, 0) + 13, objArr);
        o.ef.a aVarX = aVar.x(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        n((char) (ViewConfiguration.getLongPressTimeout() >> 16), "즥澽䛈劗\uea1c쬆녥䯳䒇蜤澀ᾠ奥\u2d7b㞝\uf8b9䈷油ၕ긹ᯎ浠", "\u0000\u0000\u0000\u0000", "⁌玱뮃豾", '0' - AndroidCharacter.getMirror('0'), objArr2);
        o.ef.a aVarX2 = aVarX.x(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        l("ோ⫼ᕎ\udc17鼟⣱妋㍍", KeyEvent.keyCodeFromString("") + 7, objArr3);
        Object[] objArr4 = {aVarX2, ((String) objArr3[0]).intern()};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i5 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = i5;
        o.ef.c cVar = (o.ef.c) o.ef.a.a(-1398121910, objArr4, iMyUid, i5, 1398121917, iUptimeMillis, iElapsedRealtime);
        int i6 = f22506j + 111;
        f22502f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
        return cVar;
    }

    public abstract T e(String str, String str2, int i2, String str3);

    @Override // o.cn.e
    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f22502f + 59;
        int i4 = i3 % 128;
        f22506j = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 67;
        f22502f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 79 / 0;
        }
        return false;
    }
}
