package o.ct;

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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.k;
import o.a.l;
import o.a.m;
import o.a.q;
import o.ea.g;
import o.en.f;
import o.et.i;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.msgpack.core.MessagePack;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements o.cl.c<i> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static long f22604a = 0;

    /* JADX INFO: renamed from: b */
    private static int f22605b = 0;

    /* JADX INFO: renamed from: c */
    private static int f22606c = 0;

    /* JADX INFO: renamed from: d */
    private static char[] f22607d = null;

    /* JADX INFO: renamed from: e */
    private static int f22608e = 0;

    /* JADX INFO: renamed from: f */
    private static int f22609f = 0;

    public static final class a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: k */
        private static int f22610k = 0;

        /* JADX INFO: renamed from: m */
        private static char f22611m = 0;

        /* JADX INFO: renamed from: n */
        private static int[] f22612n = null;

        /* JADX INFO: renamed from: o */
        private static long f22613o = 0;

        /* JADX INFO: renamed from: q */
        private static int f22614q = 0;

        /* JADX INFO: renamed from: r */
        private static int f22615r = 0;

        /* JADX INFO: renamed from: a */
        final o.dm.b f22616a;

        /* JADX INFO: renamed from: b */
        final byte[] f22617b;

        /* JADX INFO: renamed from: c */
        final o.dm.b f22618c;

        /* JADX INFO: renamed from: d */
        final o.dm.b f22619d;

        /* JADX INFO: renamed from: e */
        final byte f22620e;

        /* JADX INFO: renamed from: f */
        final byte[] f22621f;

        /* JADX INFO: renamed from: g */
        final byte[] f22622g;

        /* JADX INFO: renamed from: h */
        final byte f22623h;

        /* JADX INFO: renamed from: i */
        final byte[] f22624i;

        /* JADX INFO: renamed from: j */
        final o.dm.b f22625j;

        /* JADX INFO: renamed from: l */
        final o.dm.b f22626l;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:17:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r8, byte r9, byte r10) {
            /*
                int r8 = r8 + 4
                int r0 = r9 * 2
                int r7 = 1 - r0
                int r0 = r10 + 65
                byte[] r6 = o.ct.b.a.$$c
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r6 != 0) goto L26
                r3 = r8
                r2 = r4
            L11:
                int r0 = -r0
                int r8 = r8 + r0
                r1 = r2
            L14:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r5[r1] = r0
                if (r2 != r7) goto L21
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L21:
                int r3 = r3 + 1
                r0 = r6[r3]
                goto L11
            L26:
                r1 = r4
                r3 = r8
                r8 = r0
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.a.$$e(int, byte, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            f22615r = 0;
            f22614q = 1;
            f22612n = new int[]{-1499570848, -1812441387, -1998902793, 1056119397, -2107620989, -1585668405, -1747663325, 15042148, -828202656, 1815311663, 264332147, 468132012, 1221025061, -1312904809, 1634970966, -275786331, -1932620771, -845836887};
            f22613o = 6851558496061881660L;
            f22610k = 1564493270;
            f22611m = (char) 17878;
        }

        a(o.ef.a aVar, o.ef.a aVar2) throws Throwable {
            aVar = aVar2 != null ? aVar2 : aVar;
            if (aVar == null) {
                Object[] objArr = new Object[1];
                p(new int[]{-76288165, -293849302, 1497176442, -2068442354, -334156349, 1942113955, -1255637693, -1919575245, -1475592344, -603015254, 1069145340, 1361992570, -1006712603, 1945058010, -1034317789, 116414444, -1195303611, -1097691103, 151989977, 6240874, -747650877, 1490952249, 423043847, 1539284374, -668548578, 214841061, 839393356, -473586019, 1781219149, 1615855829, 181699807, 1385564686, 497927423, -1733940401, 1230359126, 794502205, -2124104116, -917031017, -2021642280, -425824260}, 80 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                throw new f(((String) objArr[0]).intern());
            }
            Object[] objArr2 = new Object[1];
            p(new int[]{342496354, 1987896451}, ExpandableListView.getPackedPositionGroup(0L) + 3, objArr2);
            this.f22617b = aVar.D(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            s((char) (TextUtils.indexOf("", "", 0, 0) + 64369), "츩᪷慃ꃓ", "룪\uf6d3薅啒", "鳋㏥焃嗻", Process.myPid() >> 22, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            s((char) (51329 - View.MeasureSpec.getMode(0)), "\u139d誸눓", "룪\uf6d3薅啒", "\uf874猜膒\ue8c8", (-1837949704) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
            this.f22616a = new o.dm.b(strIntern, aVar.z(((String) objArr4[0]).intern()));
            Object[] objArr5 = new Object[1];
            p(new int[]{2130710455, 1875127531}, 3 - MotionEvent.axisFromString(""), objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            s((char) (TextUtils.indexOf("", "", 0) + 13909), "媤꯴\ueb7a", "룪\uf6d3薅啒", "鎵굯問㤶", 1336766355 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr6);
            this.f22619d = new o.dm.b(strIntern2, aVar.D(((String) objArr6[0]).intern()));
            Object[] objArr7 = new Object[1];
            p(new int[]{819279877, 1963533119}, Color.rgb(0, 0, 0) + 16777220, objArr7);
            String strIntern3 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            p(new int[]{-949307016, -179345151}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, objArr8);
            this.f22618c = new o.dm.b(strIntern3, new byte[]{aVar.B(((String) objArr8[0]).intern()).byteValue()});
            Object[] objArr9 = new Object[1];
            p(new int[]{-754361218, -1325873552}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, objArr9);
            this.f22620e = aVar.B(((String) objArr9[0]).intern()).byteValue();
            Object[] objArr10 = new Object[1];
            p(new int[]{1441391112, 960822945, -1961919225, -286822592, 542966655, -1221081767, 1105666503, 847222396}, TextUtils.indexOf((CharSequence) "", '0') + 16, objArr10);
            this.f22622g = aVar.D(((String) objArr10[0]).intern());
            Object[] objArr11 = new Object[1];
            s((char) (ViewConfiguration.getLongPressTimeout() >> 16), "鴙䰨\udeaf䀤\ufae3\ue8fc\udf94潢䠿\u0dcd嚸", "룪\uf6d3薅啒", "훬砮\u244e捺", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1316499158, objArr11);
            this.f22621f = aVar.D(((String) objArr11[0]).intern());
            Object[] objArr12 = new Object[1];
            s((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 34514), "⸉\ue055ⴎ", "룪\uf6d3薅啒", "\uda02涃퇴ஆ", (-194149414) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr12);
            this.f22623h = aVar.B(((String) objArr12[0]).intern()).byteValue();
            Object[] objArr13 = new Object[1];
            s((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 52766), "谓硺鼍", "룪\uf6d3薅啒", "씾퓕Ṙ탎", 1490343365 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr13);
            this.f22624i = aVar.D(((String) objArr13[0]).intern());
            Object[] objArr14 = new Object[1];
            s((char) (26721 - (ViewConfiguration.getPressedStateDuration() >> 16)), "䚪柶鐟\ue55b묞摸簋書䘧맭헌ᶛ釉揑₷", "룪\uf6d3薅啒", "祰ॅ憈周", (-2012658311) - TextUtils.indexOf("", "", 0, 0), objArr14);
            o.ef.a aVarX = aVar.x(((String) objArr14[0]).intern());
            Object[] objArr15 = new Object[1];
            s((char) (Gravity.getAbsoluteGravity(0, 0) + 2952), "逮\uef7f", "룪\uf6d3薅啒", "踷蕔蠞㼋", (-1) - ImageFormat.getBitsPerPixel(0), objArr15);
            String strIntern4 = ((String) objArr15[0]).intern();
            Object[] objArr16 = new Object[1];
            p(new int[]{-907430092, 1623429193}, TextUtils.indexOf((CharSequence) "", '0', 0) + 4, objArr16);
            this.f22625j = new o.dm.b(strIntern4, aVarX.D(((String) objArr16[0]).intern()));
            Object[] objArr17 = new Object[1];
            p(new int[]{-875128542, -314316555}, 1 - TextUtils.lastIndexOf("", '0', 0, 0), objArr17);
            String strIntern5 = ((String) objArr17[0]).intern();
            Object[] objArr18 = new Object[1];
            s((char) (((Process.getThreadPriority(0) + 20) >> 6) + 16988), "久\ue169쐗", "룪\uf6d3薅啒", "\udfe6짰尪챂", 717877471 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr18);
            this.f22626l = new o.dm.b(strIntern5, aVarX.D(((String) objArr18[0]).intern()));
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] b(android.content.Context r27, int r28, int r29, int r30) {
            /*
                Method dump skipped, instruction units count: 1812
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.a.b(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
            $$b = 139;
        }

        static void init$1() {
            $$c = new byte[]{40, 101, 74, -30};
            $$d = 47;
        }

        private static void p(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f22612n;
            int i4 = 989264422;
            int i5 = -1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i4);
                        if (objA == null) {
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a(TextUtils.getOffsetAfter("", i6) + 675, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -328001469, false, $$e(b2, b3, (byte) (56 | b3)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i7++;
                        i4 = 989264422;
                        i5 = -1;
                        i6 = 0;
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
            int[] iArr5 = f22612n;
            if (iArr5 != null) {
                int i8 = $11 + 99;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 675, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (ViewConfiguration.getTapTimeout() >> 16), -328001469, false, $$e(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 56)))), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i10++;
                    int i11 = $11 + 113;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            lVar.f19941d = 0;
            int i13 = $11 + 53;
            $10 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            while (lVar.f19941d < iArr.length) {
                int i16 = $11 + 53;
                $10 = i16 % 128;
                int i17 = i16 % i14;
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i18 = 0;
                for (int i19 = 16; i18 < i19; i19 = 16) {
                    int i20 = $11 + 115;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    lVar.f19942e ^= iArr4[i18];
                    Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA3 = o.d.d.a(2098218801);
                    if (objA3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(301 - Color.blue(0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 52697), TextUtils.getTrimmedLength("") + 11, -1416256172, false, $$e(b6, b7, (byte) (54 | b7)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i18++;
                }
                int i22 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i22;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i23 = lVar.f19942e;
                int i24 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr5 = {lVar, lVar};
                Object objA4 = o.d.d.a(986820978);
                if (objA4 == null) {
                    int iMyTid = 229 - (Process.myTid() >> 22);
                    char c2 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 51003);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 9;
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    String str$$e = $$e(b8, b9, (byte) (52 | b9));
                    i14 = 2;
                    objA4 = o.d.d.a(iMyTid, c2, deadChar, -330018025, false, str$$e, new Class[]{Object.class, Object.class});
                } else {
                    i14 = 2;
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        private static void s(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2 % 2;
            Object charArray = str6;
            if (str6 != null) {
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object obj = str5;
            if (str5 != null) {
                int i4 = $11 + 101;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                char[] charArray2 = str5.toCharArray();
                int i6 = $10 + 31;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray2;
            }
            char[] cArr2 = (char[]) obj;
            Object obj2 = null;
            Object obj3 = str4;
            if (str4 != null) {
                int i8 = $11 + 23;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    str4.toCharArray();
                    obj2.hashCode();
                    throw null;
                }
                char[] charArray3 = str4.toCharArray();
                int i9 = $11 + 109;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                obj3 = charArray3;
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
            int length3 = ((char[]) obj3).length;
            char[] cArr5 = new char[length3];
            iVar.f19932b = 0;
            int i11 = $10 + 77;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (iVar.f19932b < length3) {
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = o.d.d.a(540069882);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(107 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, -155898465, false, $$e(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(obj2, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 846, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6488), Process.getGidForName("") + 13, -694521287, false, $$e(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj2, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(458 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, 1804962841, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        objA4 = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 639, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 65100), 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1636969060, false, $$e(b8, b9, (byte) ((b9 + 57) - (57 & b9))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    obj2 = null;
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f22613o ^ 740602047300126166L)) ^ ((long) ((int) (((long) f22610k) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f22611m) ^ 740602047300126166L))));
                    iVar.f19932b++;
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

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void t(int r8, short r9, short r10, java.lang.Object[] r11) {
            /*
                int r8 = 101 - r8
                int r0 = r9 * 4
                int r7 = 1 - r0
                byte[] r6 = o.ct.b.a.$$a
                int r0 = r10 * 3
                int r5 = 4 - r0
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r6 != 0) goto L2a
                r0 = r7
                r2 = r3
            L13:
                int r0 = -r0
                int r5 = r5 + 1
                int r8 = r8 + r0
                r1 = r2
            L18:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r4[r1] = r0
                if (r2 != r7) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r11[r3] = r0
                return
            L27:
                r0 = r6[r5]
                goto L13
            L2a:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.a.t(int, short, short, java.lang.Object[]):void");
        }
    }

    /* JADX INFO: renamed from: o.ct.b$b */
    static final class C0348b {

        /* JADX INFO: renamed from: b */
        final byte[] f22627b;

        /* JADX INFO: renamed from: c */
        final byte[] f22628c;

        /* JADX INFO: renamed from: d */
        final byte[] f22629d;

        C0348b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.f22628c = bArr;
            this.f22629d = bArr2;
            this.f22627b = bArr3;
        }
    }

    public static final class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static int f22630b = 0;

        /* JADX INFO: renamed from: d */
        private static long f22631d = 0;

        /* JADX INFO: renamed from: e */
        private static long f22632e = 0;

        /* JADX INFO: renamed from: a */
        final o.dm.b f22633a;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r9, int r10, int r11) {
            /*
                int r8 = r11 + 71
                int r0 = r9 * 2
                int r7 = 3 - r0
                int r0 = r10 * 4
                int r6 = r0 + 1
                byte[] r5 = o.ct.b.c.$$a
                byte[] r4 = new byte[r6]
                r3 = 0
                if (r5 != 0) goto L2b
                r1 = r8
                r2 = r3
                r0 = r7
            L14:
                int r7 = r7 + r1
                r1 = r2
                r8 = r7
                r7 = r0
            L18:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r4[r1] = r0
                if (r2 != r6) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                int r0 = r7 + 1
                r1 = r5[r0]
                r7 = r8
                goto L14
            L2b:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.c.$$c(short, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f22630b = -1872726018;
            f22632e = 7432468855600165174L;
            f22631d = 4887314102668050072L;
        }

        c(String str, String str2, o.ef.a aVar, o.ef.a aVar2, o.ef.a aVar3, o.ef.a aVar4) throws Throwable {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('D');
            sb.append(str2.substring(0, 4));
            if (aVar3 != null) {
                Object[] objArr = new Object[1];
                f("\ue533㥬\ue540ᩖ⣝믑渦퉶桬襴ﭰ", Process.myPid() >> 22, objArr);
                Object[] objArr2 = {aVar3, ((String) objArr[0]).intern()};
                int i2 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i2;
                sb.append((String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i2, Thread.currentThread().getPriority()));
                Object[] objArr3 = new Object[1];
                g("㎧\u1fff欻띂芶\ueee0㨗ٹ冺뷲褹", 11329 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                Object[] objArr4 = {aVar3, ((String) objArr3[0]).intern()};
                int i3 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i3;
                sb.append((String) o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority()));
                Object[] objArr5 = new Object[1];
                g("㎣㕠㸼⟻⢨ሼᬍ᳝\u058cཙ瀡私抟殷", 1733 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
                Object[] objArr6 = {aVar3, ((String) objArr5[0]).intern()};
                int i4 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i4;
                sb.append((String) o.ef.a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority()));
            } else if (aVar4 != null) {
                Object[] objArr7 = new Object[1];
                f("\ue533㥬\ue540ᩖ⣝믑渦퉶桬襴ﭰ", ViewConfiguration.getDoubleTapTimeout() >> 16, objArr7);
                Object[] objArr8 = {aVar4, ((String) objArr7[0]).intern()};
                int i5 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i5;
                sb.append((String) o.ef.a.a(-781664457, objArr8, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority()));
            } else if (aVar != null) {
                Object[] objArr9 = new Object[1];
                f("\ue533㥬\ue540ᩖ⣝믑渦퉶桬襴ﭰ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr9);
                Object[] objArr10 = {aVar, ((String) objArr9[0]).intern()};
                int i6 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i6;
                sb.append((String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority()));
                Object[] objArr11 = new Object[1];
                g("㎧\u1fff欻띂芶\ueee0㨗ٹ冺뷲褹", 11328 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr11);
                Object[] objArr12 = {aVar, ((String) objArr11[0]).intern()};
                int i7 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i7;
                sb.append((String) o.ef.a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority()));
                Object[] objArr13 = new Object[1];
                g("㎣㕠㸼⟻⢨ሼᬍ᳝\u058cཙ瀡私抟殷", ExpandableListView.getPackedPositionGroup(0L) + 1733, objArr13);
                Object[] objArr14 = {aVar, ((String) objArr13[0]).intern()};
                int i8 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i8;
                sb.append((String) o.ef.a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority()));
            } else {
                if (aVar2 == null) {
                    Object[] objArr15 = new Object[1];
                    g("㎃蘞壀ኅ\ue550뽐熇쯪鹫倥⫭ﲿ뜳৬쎈陁桇⋓\uf483伖ą\udbef궱恞㨺賷䜉ᤇ폐ꗘ硓㈝蓃廬ᅥ\ueb23뷽瞹쩻鳏嚋⤄\ue310뗐࿓쉸鐿滭₡ﭵ䴽߳\uda0b걚暅㢔\uf35a䔝´톦ꑦ縪ソ誳嵣ឌ\ue983뱇瘈죕苕啤⼠\ue1f6믹\u0e7f쀧髈浌✒輪뎐٘\ud815鋪撴㽬\uf135䯱ᷴ퀅\uaacb粕㝝褑", 46523 - (ViewConfiguration.getScrollBarSize() >> 8), objArr15);
                    throw new f(((String) objArr15[0]).intern());
                }
                Object[] objArr16 = new Object[1];
                f("\ue533㥬\ue540ᩖ⣝믑渦퉶桬襴ﭰ", MotionEvent.axisFromString("") + 1, objArr16);
                Object[] objArr17 = {aVar2, ((String) objArr16[0]).intern()};
                int i9 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i9;
                sb.append((String) o.ef.a.a(-781664457, objArr17, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority()));
            }
            String string = sb.toString();
            string = string.length() % 2 != 0 ? new StringBuilder().append(string).append('F').toString() : string;
            Object[] objArr18 = new Object[1];
            g("㏢㶋", KeyEvent.normalizeMetaState(0) + 3691, objArr18);
            this.f22633a = new o.dm.b(((String) objArr18[0]).intern(), o.dl.d.e(string));
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] c(android.content.Context r18, int r19, int r20) {
            /*
                Method dump skipped, instruction units count: 1104
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.c.c(android.content.Context, int, int):java.lang.Object[]");
        }

        private static void f(String str, int i2, Object[] objArr) throws Throwable {
            Object obj;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 61;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            if (str2 != null) {
                char[] charArray = str2.toCharArray();
                int i6 = $11 + 9;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray;
            } else {
                obj = str2;
            }
            k kVar = new k();
            char[] cArrC = k.c(f22632e ^ (-5882309809461882246L), (char[]) obj, i2);
            kVar.f19939c = 4;
            int i8 = $11 + 89;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (kVar.f19939c < cArrC.length) {
                int i10 = $10 + 103;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                kVar.f19938a = kVar.f19939c - 4;
                int i12 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22632e)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 229, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + Base64.padSymbol), 8 - TextUtils.lastIndexOf("", '0'), 1749983833, false, $$c(b2, b3, (byte) ((b3 + 36) - (36 & b3))), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(675 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 12 - Color.alpha(0), 522683165, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 43)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrC, 4, cArrC.length - 4);
        }

        private static void g(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i4 = $10 + 67;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 732, (char) (Color.argb(0, 0, 0, 0) + 7933), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f22631d ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 836, (char) (Color.blue(0) + 27279), (ViewConfiguration.getScrollBarSize() >> 8) + 11, -2145994442, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 7)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i7 = $11 + 75;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                    Object[] objArr4 = {qVar, qVar};
                    Object objA3 = o.d.d.a(1452497747);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(836 - View.resolveSize(0, 0), (char) (Drawable.resolveOpacity(0, 0) + 27279), Gravity.getAbsoluteGravity(0, 0) + 11, -2145994442, false, $$c(b6, b7, (byte) (7 | b7)), new Class[]{Object.class, Object.class});
                    }
                    Object obj = null;
                    ((Method) objA3).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                }
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(837 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 27279), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2145994442, false, $$c(b8, b9, (byte) (7 | b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i8 = $10 + 51;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        static void init$0() {
            $$a = new byte[]{54, -126, MessagePack.Code.INT32, 96};
            $$b = JfifUtil.MARKER_SOI;
        }
    }

    public static final class d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char f22634a = 0;

        /* JADX INFO: renamed from: c */
        private static char f22635c = 0;

        /* JADX INFO: renamed from: d */
        private static char f22636d = 0;

        /* JADX INFO: renamed from: e */
        private static char f22637e = 0;

        /* JADX INFO: renamed from: f */
        private static int f22638f = 0;

        /* JADX INFO: renamed from: g */
        public static int f22639g = 0;

        /* JADX INFO: renamed from: h */
        public static int f22640h = 0;

        /* JADX INFO: renamed from: i */
        public static int f22641i = 0;

        /* JADX INFO: renamed from: j */
        private static int f22642j = 0;

        /* JADX INFO: renamed from: b */
        final o.dm.b f22643b;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r9, byte r10, int r11) {
            /*
                byte[] r8 = o.ct.b.d.$$c
                int r0 = r11 * 3
                int r1 = r0 + 69
                int r0 = r10 * 2
                int r2 = 3 - r0
                int r0 = r9 * 3
                int r7 = r0 + 1
                byte[] r6 = new byte[r7]
                r5 = 0
                if (r8 != 0) goto L2c
                r4 = r7
                r0 = r2
                r3 = r5
            L16:
                int r1 = -r2
                int r1 = r1 + r4
                r2 = r0
            L19:
                byte r0 = (byte) r1
                r6[r3] = r0
                int r3 = r3 + 1
                int r0 = r2 + 1
                if (r3 != r7) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L28:
                r2 = r8[r0]
                r4 = r1
                goto L16
            L2c:
                r3 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.d.$$e(byte, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f22641i = 451199823;
            f22640h = 1116552804;
            f22639g = 1408472017;
            init$0();
            f22638f = 0;
            f22642j = 1;
            f22635c = (char) 42829;
            f22636d = (char) 7576;
            f22634a = (char) 19973;
            f22637e = (char) 21957;
        }

        d(String str, String str2) throws Throwable {
            if (str2 != null && !str2.isEmpty()) {
                Object[] objArr = new Object[1];
                k("ཝ깃\ue082㺚", 4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                this.f22643b = new o.dm.b(((String) objArr[0]).intern(), a(str2));
                return;
            }
            if (str == null || str.isEmpty()) {
                Object[] objArr2 = new Object[1];
                k("ཝ깃\ue082㺚", AndroidCharacter.getMirror('0') - ',', objArr2);
                this.f22643b = new o.dm.b(((String) objArr2[0]).intern(), null);
                return;
            }
            Object[] objArr3 = new Object[1];
            k("ཝ깃\ue082㺚", 4 - TextUtils.getTrimmedLength(""), objArr3);
            this.f22643b = new o.dm.b(((String) objArr3[0]).intern(), a(str));
        }

        private static byte[] a(String str) {
            int i2 = 2 % 2;
            int i3 = f22642j + 107;
            f22638f = i3 % 128;
            return (i3 % 2 != 0 ? str.substring(1, Math.min(str.length(), 0)) : str.substring(0, Math.min(str.length(), 26))).getBytes(g.c());
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:(2:214|143)|(1:145)(5:146|212|147|(1:149)(1:152)|(2:151|153)(4:154|215|159|(5:161|171|(6:202|173|(1:175)(6:176|205|177|178|183|(3:(1:188)(1:193)|189|(2:191|192)))|182|183|(0))|185|186)(9:162|209|163|207|164|165|(0)|185|186)))|158|215|159|(0)(0)) */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0487  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x0488 A[Catch: Exception -> 0x04c1, TRY_LEAVE, TryCatch #8 {Exception -> 0x04c1, blocks: (B:159:0x0463, B:162:0x0488, B:165:0x04b0, B:169:0x04ba, B:170:0x04c0), top: B:215:0x0463 }] */
        /* JADX WARN: Removed duplicated region for block: B:187:0x059e  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x04c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] b(int r25, int r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1564
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.d.b(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{49, 53, Ascii.ETB, 7};
            $$b = 222;
        }

        static void init$1() {
            $$c = new byte[]{Ascii.CR, Ascii.ESC, 39, 17};
            $$d = 46;
        }

        private static void k(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            o.a.g gVar = new o.a.g();
            char[] cArr2 = new char[cArr.length];
            int i4 = 0;
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            while (gVar.f19924d < cArr.length) {
                cArr3[i4] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                int i5 = 58224;
                int i6 = i4;
                while (i6 < 16) {
                    int i7 = $10 + 123;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[i4];
                    int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) f22634a) ^ (-7511683281764982996L))));
                    int i10 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(f22637e);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[1] = Integer.valueOf(i9);
                        objArr2[i4] = Integer.valueOf(c2);
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 269;
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 11;
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            String str$$e = $$e(b2, b3, b3);
                            Class[] clsArr = new Class[4];
                            clsArr[i4] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objA = o.d.d.a(i11, packedPositionType, jumpTapTimeout, -1995022631, false, str$$e, clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) f22635c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22636d)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(270 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 11, -1995022631, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6++;
                        i4 = 0;
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
                Object objA3 = o.d.d.a(1390051551);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + 270, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2074123590, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                i4 = 0;
            }
            String str3 = new String(cArr2, 0, i2);
            int i12 = $10 + 57;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            objArr[0] = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void l(byte r9, short r10, int r11, java.lang.Object[] r12) {
            /*
                byte[] r8 = o.ct.b.d.$$a
                int r0 = r9 * 4
                int r7 = r0 + 4
                int r0 = r11 * 2
                int r6 = 1 - r0
                int r0 = r10 * 2
                int r5 = r0 + 100
                byte[] r4 = new byte[r6]
                r3 = 0
                if (r8 != 0) goto L2c
                r0 = r6
                r2 = r3
            L15:
                int r0 = -r0
                int r5 = r5 + r0
                int r7 = r7 + 1
                r1 = r2
            L1a:
                int r2 = r1 + 1
                byte r0 = (byte) r5
                r4[r1] = r0
                if (r2 != r6) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r12[r3] = r0
                return
            L29:
                r0 = r8[r7]
                goto L15
            L2c:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.d.l(byte, short, int, java.lang.Object[]):void");
        }
    }

    public static final class e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: f */
        private static int f22644f = 0;

        /* JADX INFO: renamed from: g */
        private static char[] f22645g = null;

        /* JADX INFO: renamed from: i */
        private static int f22646i = 0;

        /* JADX INFO: renamed from: j */
        private static long f22647j = 0;

        /* JADX INFO: renamed from: k */
        public static int f22648k = 0;

        /* JADX INFO: renamed from: l */
        public static int f22649l = 0;

        /* JADX INFO: renamed from: m */
        public static int f22650m = 0;

        /* JADX INFO: renamed from: n */
        public static int f22651n = 0;

        /* JADX INFO: renamed from: a */
        final boolean f22652a;

        /* JADX INFO: renamed from: b */
        final byte f22653b;

        /* JADX INFO: renamed from: c */
        final o.dm.b f22654c;

        /* JADX INFO: renamed from: d */
        final C0348b f22655d;

        /* JADX INFO: renamed from: e */
        final o.dm.b f22656e;

        /* JADX INFO: renamed from: h */
        final C0348b f22657h;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r8, byte r9, int r10) {
            /*
                byte[] r7 = o.ct.b.e.$$c
                int r6 = r8 + 4
                int r5 = r9 + 107
                int r4 = r10 * 4
                int r0 = r4 + 1
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r7 != 0) goto L25
                r1 = r4
                r0 = r2
            L11:
                int r5 = r5 + r1
                r1 = r0
            L13:
                byte r0 = (byte) r5
                r3[r1] = r0
                int r6 = r6 + 1
                int r0 = r1 + 1
                if (r1 != r4) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L22:
                r1 = r7[r6]
                goto L11
            L25:
                r1 = r2
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.e.$$e(int, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f22651n = 2005947540;
            f22650m = -123699174;
            f22649l = -1396052228;
            f22648k = -1390389046;
            init$0();
            f22644f = 0;
            f22646i = 1;
            f22645g = new char[]{56484, 56517, 56502, 56554, 56551, 56554, 56560, 56545, 56544, 56560, 56552, 56547, 56505, 56560, 56561, 56554, 56546, 56553, 56541, 56536, 56552, 56554, 56535, 56539, 56560, 56552, 56499, 56551, 56550, 56546, 56554, 56556, 56548, 56548, 56555, 56563, 56558, 56334, 56741, 56747, 56742, 56741, 56736, 56736, 56744, 56546, 56392, 56390, 56388, 56394, 56392, 56387, 56394, 56401, 56508, 56559, 56547, 56553, 56496, 56551, 56553, 56555, 56560, 56556, 56550, 56521, 56520, 56553, 56558, 56561, 56556, 56553, 56561, 56529, 56504, 56537, 56558, 56561, 56556, 56558, 56566, 56326, 56711, 56711, 56440, 56440, 56715, 56713, 56715, 56711, 56447, 56707, 56711, 56715, 56717, 56437, 56439, 56713, 56707, 56505, 56555, 56552, 56551, 56545, 56548, 56551, 56558, 56555, 56547, 56548, 56521, 56526};
            f22647j = 7364415785463509852L;
        }

        e(o.ef.a aVar) throws Throwable {
            if (aVar == null) {
                this.f22652a = false;
                this.f22654c = null;
                this.f22656e = null;
                this.f22653b = (byte) 0;
                this.f22655d = null;
                this.f22657h = null;
                return;
            }
            this.f22652a = true;
            Object[] objArr = new Object[1];
            o("\u0000\u0000", new int[]{0, 2, 16, 2}, false, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            o("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new int[]{2, 10, 0, 9}, true, objArr2);
            this.f22654c = new o.dm.b(strIntern, aVar.D(((String) objArr2[0]).intern()));
            Object[] objArr3 = new Object[1];
            p("퐆퐿귺쳨뙅慔", TextUtils.getTrimmedLength(""), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            o("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{12, 14, 0, 0}, true, objArr4);
            this.f22656e = new o.dm.b(strIntern2, aVar.D(((String) objArr4[0]).intern()));
            Object[] objArr5 = new Object[1];
            p("珠玃뜕홒㛮\uf4f2꽣豤\uf71a㎧灯ܐ窙뱪ﷶ莤﹐", ExpandableListView.getPackedPositionType(0L), objArr5);
            this.f22653b = aVar.B(((String) objArr5[0]).intern()).byteValue();
            Object[] objArr6 = new Object[1];
            p("浤洍繾Ἳ\udcc0ữ⊲Ɛ\ue989\ufae7驯諝搭甮៙\u0e62\ue0d8", TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr6);
            this.f22655d = e(aVar.x(((String) objArr6[0]).intern()));
            Object[] objArr7 = new Object[1];
            p("\uf33d\uf349葋\ue502䜅蔢㵥Ṳ矋þƈ锁艹輡谛ᆌ纐கᝒ谺\ue12f雰", TextUtils.getCapsMode("", 0, 0), objArr7);
            this.f22657h = e(aVar.x(((String) objArr7[0]).intern()));
        }

        private static C0348b e(o.ef.a aVar) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            o(C1561oA.Qd("\u038b.ΉΈ+*΅΄'\u0382%", (short) (Od.Xd() ^ (-8621))), new int[]{26, 11, 0, 6}, false, objArr);
            Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
            int i3 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i3;
            String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority());
            int[] iArr = {37, 8, 183, 8};
            Object[] objArr3 = new Object[1];
            short sXd = (short) (C1607wl.Xd() ^ 11175);
            short sXd2 = (short) (C1607wl.Xd() ^ 28752);
            int[] iArr2 = new int["ٲCٴEFGHٹ".length()];
            QB qb = new QB("ٲCٴEFGHٹ");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) - sXd2);
                i4++;
            }
            o(new String(iArr2, 0, i4), iArr, false, objArr3);
            byte[] bArrD = aVar.D(((String) objArr3[0]).intern());
            int[] iArr3 = {45, 9, 95, 8};
            Object[] objArr4 = new Object[1];
            short sXd3 = (short) (Od.Xd() ^ (-11479));
            int[] iArr4 = new int["ޛޚޙޘdޖbaޓ".length()];
            QB qb2 = new QB("ޛޚޙޘdޖbaޓ");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr4[i5] = xuXd2.fK(sXd3 + sXd3 + i5 + xuXd2.CK(iKK2));
                i5++;
            }
            o(new String(iArr4, 0, i5), iArr3, false, objArr4);
            Object[] objArr5 = {aVar, ((String) objArr4[0]).intern(), ""};
            int i6 = o.ef.a.f23773g * 1081559339;
            o.ef.a.f23773g = i6;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i7 = o.ef.a.f23772f * (-1705304066);
            o.ef.a.f23772f = i7;
            String str2 = (String) o.ef.a.a(1581939473, objArr5, i7, (int) SystemClock.uptimeMillis(), -1581939469, i6, iMaxMemory);
            Object[] objArr6 = new Object[1];
            p(C1561oA.Kd("クか㽍麘뫲胗䓽⟳곍돓ﲈꔟ㥼㒺觤⣃똣꤯", (short) (Od.Xd() ^ (-10123))), TextUtils.indexOf("", "", 0), objArr6);
            o.ef.a aVarX = aVar.x(((String) objArr6[0]).intern());
            int iLastIndexOf = (-1) - TextUtils.lastIndexOf("", '0');
            Object[] objArr7 = new Object[1];
            short sXd4 = (short) (Od.Xd() ^ (-23848));
            short sXd5 = (short) (Od.Xd() ^ (-24781));
            int[] iArr5 = new int["롥내\uf628橡㑲缲ꐴ뫔\uf445".length()];
            QB qb3 = new QB("롥내\uf628橡㑲缲ꐴ뫔\uf445");
            int i8 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr5[i8] = xuXd3.fK(((i8 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
                i8++;
            }
            p(new String(iArr5, 0, i8), iLastIndexOf, objArr7);
            Object[] objArr8 = {aVarX, ((String) objArr7[0]).intern()};
            int i9 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i9;
            int i10 = Integer.parseInt((String) o.ef.a.a(-781664457, objArr8, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority()));
            int[] iArr6 = {54, 4, 0, 0};
            Object[] objArr9 = new Object[1];
            short sXd6 = (short) (Od.Xd() ^ (-13827));
            int[] iArr7 = new int["eМНh".length()];
            QB qb4 = new QB("eМНh");
            int i11 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr7[i11] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd6 + i11));
                i11++;
            }
            o(new String(iArr7, 0, i11), iArr6, false, objArr9);
            Object[] objArr10 = {aVarX, ((String) objArr9[0]).intern()};
            int i12 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i12;
            o.dl.d.b(i10, Integer.parseInt((String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i12, Thread.currentThread().getPriority())));
            Object[] objArr11 = {str, 2};
            Method declaredMethod = Class.forName(Wg.vd("\u001a&\u001f,$\u001d\u001bc&$\u001c\u001eZm\u0010!.}~", (short) (C1580rY.Xd() ^ (-32237)))).getDeclaredMethod(hg.Vd("\u0019\u0019\u0016!\u0015\u0015", (short) (FB.Xd() ^ 22565), (short) (FB.Xd() ^ 7144)), Class.forName(Qg.kd("* 4\u001ei'\u001b'\u001fd\t)&\u001c \u0018", (short) (Od.Xd() ^ (-24884)), (short) (Od.Xd() ^ (-31458)))), Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr11);
                Object[] objArr12 = {str2, 2};
                Method declaredMethod2 = Class.forName(C1561oA.ud("\t\u0015\n\u0017\u0013\f\u0006N\u0015\u0013\u0007\tI\\z\f|LI", (short) (FB.Xd() ^ 19751))).getDeclaredMethod(C1561oA.Yd("LNMZPR", (short) (C1607wl.Xd() ^ 7553)), Class.forName(C1561oA.yd("+!5\u001fr0$0 e\n*/%)!", (short) (C1607wl.Xd() ^ 18897))), Integer.TYPE);
                try {
                    declaredMethod2.setAccessible(true);
                    C0348b c0348b = new C0348b(bArr, bArrD, (byte[]) declaredMethod2.invoke(null, objArr12));
                    int i13 = f22644f + 45;
                    f22646i = i13 % 128;
                    if (i13 % 2 != 0) {
                        return c0348b;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] e(android.content.Context r26, int r27, int r28, int r29) {
            /*
                Method dump skipped, instruction units count: 1596
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ct.b.e.e(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{39, 50, 101, -97};
            $$b = 132;
        }

        static void init$1() {
            $$c = new byte[]{101, -87, 81, 90};
            $$d = 5;
        }

        private static void o(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
            int i2;
            char[] cArr;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 51;
            $10 = i4 % 128;
            Object bytes = str2;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            m mVar = new m();
            int i5 = 0;
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            char[] cArr2 = f22645g;
            int i10 = -1;
            long j2 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i11 = 0;
                while (i11 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            byte b2 = (byte) i10;
                            objA = o.d.d.a((ExpandableListView.getPackedPositionForChild(i5, i5) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == j2 ? 0 : -1)) + 250, (char) (Process.myPid() >> 22), 11 - (ViewConfiguration.getTapTimeout() >> 16), 1376582792, false, $$e(b2, (byte) ((-1) - (((-1) - b2) | ((-1) - 9))), (byte) ($$d - 5)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i11++;
                        i5 = 0;
                        i10 = -1;
                        j2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i7];
            char c2 = 0;
            System.arraycopy(cArr2, i6, cArr4, 0, i7);
            if (bArr != null) {
                int i12 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr = new char[i7];
                    mVar.f19943d = 0;
                } else {
                    cArr = new char[i7];
                    mVar.f19943d = 0;
                    c2 = 0;
                }
                while (mVar.f19943d < i7) {
                    if (bArr[mVar.f19943d] == 1) {
                        int i13 = $10 + 73;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i14 = mVar.f19943d;
                            Object[] objArr3 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA2 = o.d.d.a(120026474);
                            if (objA2 == null) {
                                objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 12, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.blue(0) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            int i15 = 41 / 0;
                        } else {
                            int i16 = mVar.f19943d;
                            Object[] objArr4 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA3 = o.d.d.a(120026474);
                            if (objA3 == null) {
                                objA3 = o.d.d.a(11 - TextUtils.getTrimmedLength(""), (char) TextUtils.indexOf("", "", 0, 0), 10 - (ViewConfiguration.getPressedStateDuration() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr[i16] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                        }
                    } else {
                        int i17 = mVar.f19943d;
                        Object[] objArr5 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA4 = o.d.d.a(1632715197);
                        if (objA4 == null) {
                            byte b3 = (byte) (-1);
                            objA4 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 835, (char) (TextUtils.lastIndexOf("", '0') + 27280), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1210801192, false, $$e(b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 13))), (byte) ($$d - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i17] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    }
                    c2 = cArr[mVar.f19943d];
                    Object[] objArr6 = {mVar, mVar};
                    Object objA5 = o.d.d.a(-1041906996);
                    if (objA5 == null) {
                        objA5 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 22, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 35716), ImageFormat.getBitsPerPixel(0) + 12, 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
                int i18 = $10 + 33;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 3 % 3;
                }
                cArr4 = cArr;
            }
            if (i9 > 0) {
                int i20 = $11 + 9;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    char[] cArr5 = new char[i7];
                    i2 = 0;
                    System.arraycopy(cArr4, 1, cArr5, 0, i7);
                    System.arraycopy(cArr5, 1, cArr4, i7 * i9, i9);
                    System.arraycopy(cArr5, i9, cArr4, 1, i7 + i9);
                } else {
                    i2 = 0;
                    char[] cArr6 = new char[i7];
                    System.arraycopy(cArr4, 0, cArr6, 0, i7);
                    int i21 = i7 - i9;
                    System.arraycopy(cArr6, 0, cArr4, i21, i9);
                    System.arraycopy(cArr6, i9, cArr4, 0, i21);
                }
            } else {
                i2 = 0;
            }
            if (z2) {
                char[] cArr7 = new char[i7];
                mVar.f19943d = i2;
                while (mVar.f19943d < i7) {
                    cArr7[mVar.f19943d] = cArr4[(i7 - mVar.f19943d) - 1];
                    mVar.f19943d++;
                }
                cArr4 = cArr7;
            }
            if (i8 > 0) {
                int i22 = 0;
                while (true) {
                    mVar.f19943d = i22;
                    if (mVar.f19943d >= i7) {
                        break;
                    }
                    cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                    i22 = mVar.f19943d + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private static void p(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            Object obj = null;
            if (str2 != null) {
                int i4 = $10 + 47;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    str2.toCharArray();
                    obj.hashCode();
                    throw null;
                }
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            k kVar = new k();
            char[] cArrC = k.c(f22647j ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                int i5 = $11 + 107;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                kVar.f19938a = kVar.f19939c - 4;
                int i7 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22647j)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 229, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51003), 9 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1749983833, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        objA2 = o.d.d.a(675 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 12 - (Process.myTid() >> 22), 522683165, false, $$e(b4, (byte) ((-1) - (((-1) - b4) | ((-1) - 7))), (byte) ($$d - 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrC, 4, cArrC.length - 4);
        }

        private static void q(short s2, short s3, short s4, Object[] objArr) {
            int i2 = 3 - (s2 * 4);
            byte[] bArr = $$a;
            int i3 = 101 - s4;
            int i4 = s3 * 2;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 += -i4;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i2++;
                    i3 += -bArr[i2];
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            int r0 = r7 * 2
            int r7 = r0 + 4
            byte[] r6 = o.ct.b.$$a
            int r5 = 120 - r9
            int r4 = r8 * 4
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r6 != 0) goto L27
            r0 = r4
            r1 = r2
        L13:
            int r7 = r7 + 1
            int r0 = -r0
            int r5 = r5 + r0
        L17:
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r4) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r6[r7]
            goto L13
        L27:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ct.b.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22605b = 0;
        f22609f = 1;
        f22608e = 0;
        f22606c = 1;
        e();
        ViewConfiguration.getJumpTapTimeout();
        int i2 = f22605b + 87;
        f22609f = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static i c(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        i iVar = new i(str, str2, i2, str3);
        int i4 = f22608e + 107;
        f22606c = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return iVar;
    }

    static void e() {
        f22604a = 6737622312448893492L;
        f22607d = new char[]{56554, 56406, 56391, 56384, 56392, 56393, 56401, 56367, 56339, 56339, 56360, 56398, 56400, 56397, 56525, 56344, 56336, 56336, 56344, 56346, 56346, 56346, 56343, 56322, 56325, 56344, 56336, 56336, 56346, 56340, 56335, 56427, 56428, 56427, 56408, 56442, 56436, 56443, 56437, 56425, 56425, 56391, 56442, 56436, 56427, 56435, 56447, 56423, 56438, 56427, 56425, 56436, 56427, 56440, 56530, 56359, 56359, 56355, 56350, 56351, 56337, 56337, 56352, 56500, 56549, 56548, 56532, 56530, 56554, 56554, 56497, 56546, 56554, 56506, 56563, 56553, 56546, 56551, 56526, 56507, 56530, 56554, 56554, 56535, 56542, 56561, 56540, 56532, 56548, 56505, 56555, 56551, 56551, 56551, 56558, 56561, 56553, 56548, 56534, 56538, 56552, 56553, 56560, 56555, 56552, 56482, 56514, 56514, 56521, 56536, 56554, 56554, 56551, 56396, 56392, 56387, 56388, 56379, 56374, 56390, 56398, 56392, 56391, 56398, 56396, 56395, 56376, 56353, 56472, 56532, 56361, 56361, 56357, 56361, 56504, 56564, 56566, 56558, 56557, 56560, 56556, 56557, 56492, 56333, 56736, 56735, 56496, 56554, 56562, 56561, 56554, 56500, 56551, 56551, 56551, 56555, 56521, 56515, 56551, 56551, 56552, 56552, 56536, 56539, 56558, 56563, 56558, 56555, 56554, 56515, 56517, 56552, 56555, 56560, 56553, 56552, 56538, 56534, 56548, 56553, 56561, 56485, 56542, 56561, 56558, 56519, 56514, 56558, 56557, 56548, 56554, 56562, 56558, 56556, 56558, 56519, 56514, 56553, 56552, 56553, 56562, 56561, 56561, 56556, 56555, 56555, 56548, 56514, 56523, 56559, 56552, 56554, 56552, 56514, 56521, 56555, 56547, 56546, 56550, 56555, 56554, 56515, 56507, 56543, 56558, 56554, 56512, 56512, 56552, 56560, 56558, 56554, 56550, 56546, 56554, 56558, 56556, 56558, 56519, 56502, 56538, 56558, 56563, 56522, 56493, 56493};
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 5;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i5 = $11 + 107;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 731, (char) (7981 - AndroidCharacter.getMirror('0')), 11 - TextUtils.indexOf("", "", 0, 0), 355847088, false, $$c(b2, b3, (byte) (49 | b3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() % (f22604a ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(836 - View.resolveSize(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 27280), 11 - View.resolveSizeAndState(0, 0, 0), -2145994442, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 42)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = qVar.f19948a;
                Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA3 = o.d.d.a(-1011865131);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(730 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (KeyEvent.normalizeMetaState(0) + 7933), 11 - ((Process.getThreadPriority(0) + 20) >> 6), 355847088, false, $$c(b6, b7, (byte) ((b7 + 49) - (49 & b7))), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f22604a ^ 4743694005979712847L);
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(View.resolveSize(0, 0) + 836, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27279), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2145994442, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 42)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr6 = {qVar, qVar};
            Object objA5 = o.d.d.a(1452497747);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objA5 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 836, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27279), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2145994442, false, $$c(b10, b11, (byte) ((b11 + 42) - (42 & b11))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private static void h(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4;
        int length;
        char[] cArr;
        String str2 = str;
        int i5 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = 1;
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr2 = f22607d;
        long j2 = 0;
        if (cArr2 != null) {
            int i12 = $10 + 113;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i8 = 0;
            }
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        objA = o.d.d.a(ExpandableListView.getPackedPositionChild(j2) + 250, (char) KeyEvent.keyCodeFromString(""), 11 - KeyEvent.getDeadChar(i6, i6), 1376582792, false, $$c(b2, b2, (byte) $$a.length), new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i6 = 0;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i9];
        System.arraycopy(cArr2, i7, cArr3, 0, i9);
        if (bArr != null) {
            char[] cArr4 = new char[i9];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i9) {
                int i13 = $11 + 103;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                if (bArr[mVar.f19943d] == 1) {
                    int i15 = $10 + 7;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 11, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 9 - TextUtils.indexOf((CharSequence) "", '0'), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i18 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA3 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 835, (char) (27279 - (Process.myPid() >> 22)), ';' - AndroidCharacter.getMirror('0'), -1210801192, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(20 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.lastIndexOf("", '0') + 35716), 11 - Color.alpha(0), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            int i19 = $10 + 125;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 2 % 5;
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            char[] cArr5 = new char[i9];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i9);
            int i21 = i9 - i11;
            System.arraycopy(cArr5, 0, cArr3, i21, i11);
            System.arraycopy(cArr5, i11, cArr3, 0, i21);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i9];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i9) {
                    break;
                }
                int i22 = $10 + 49;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr6[mVar.f19943d] = cArr3[i9 >>> mVar.f19943d];
                    i2 = mVar.f19943d;
                } else {
                    cArr6[mVar.f19943d] = cArr3[(i9 - mVar.f19943d) - 1];
                    i2 = mVar.f19943d + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i23 = 0;
            while (true) {
                mVar.f19943d = i23;
                if (mVar.f19943d >= i9) {
                    break;
                }
                int i24 = $10 + 29;
                $11 = i24 % 128;
                if (i24 % 2 == 0) {
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] >>> iArr[3]);
                    i4 = mVar.f19943d;
                    i3 = 1;
                } else {
                    i3 = 1;
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                    i4 = mVar.f19943d;
                }
                i23 = i4 + i3;
            }
        }
        String str3 = new String(cArr3);
        int i25 = $11 + 33;
        $10 = i25 % 128;
        if (i25 % 2 == 0) {
            objArr[0] = str3;
        } else {
            int i26 = 96 / 0;
            objArr[0] = str3;
        }
    }

    static void init$0() {
        $$a = new byte[]{78, MessagePack.Code.UINT16, MessagePack.Code.FALSE, 123};
        $$b = 56;
    }

    @Override // o.cl.c
    public final /* synthetic */ o.eq.b a(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22608e + 125;
        f22606c = i4 % 128;
        int i5 = i4 % 2;
        i iVarC = c(str, str2, i2, str3);
        int i6 = f22608e + 85;
        f22606c = i6 % 128;
        if (i6 % 2 != 0) {
            return iVarC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.cl.c
    public final List<i> d(String str, String str2, int i2, String str3, o.ef.a aVar) throws Throwable {
        String string;
        i iVar;
        boolean z2;
        String str4 = "⼏\udd12쬬雷\ue77c闎莝놧뿗귩娱䠷癜";
        int i3 = 2 % 2;
        int i4 = f22606c + 21;
        f22608e = i4 % 128;
        int i5 = i4 % 2;
        try {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                g("⼭瞅鸦⛟䵷闺㲞䌼\uebaa㉘嫸\ue154ࠊ傱\uf75dῇꙹ", 22679 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                h("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{0, 14, 102, 7}, true, objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVar).toString());
            }
            Object[] objArr3 = new Object[1];
            h("\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{14, 17, 39, 0}, true, objArr3);
            o.ef.a aVarX = aVar.x(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            h(null, new int[]{31, 23, 134, 18}, true, objArr4);
            Object[] objArr5 = {aVarX, ((String) objArr4[0]).intern(), ""};
            int i6 = o.ef.a.f23773g * 1081559339;
            o.ef.a.f23773g = i6;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i7 = o.ef.a.f23772f * (-1705304066);
            o.ef.a.f23772f = i7;
            String str5 = (String) o.ef.a.a(1581939473, objArr5, i7, (int) SystemClock.uptimeMillis(), -1581939469, i6, iMaxMemory);
            Object[] objArr6 = new Object[1];
            h("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{54, 9, 54, 1}, false, objArr6);
            o.ef.a aVarX2 = aVar.x(((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            h("\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{63, 7, 0, 7}, false, objArr7);
            o.ef.a aVarX3 = aVarX2.x(((String) objArr7[0]).intern());
            Object[] objArr8 = new Object[1];
            h("\u0001\u0000\u0001", new int[]{70, 3, 0, 1}, false, objArr8);
            String strS = aVarX2.s(((String) objArr8[0]).intern());
            Integer numValueOf = strS != null ? Integer.valueOf(strS) : null;
            Object[] objArr9 = new Object[1];
            g("⼈앲ﯠ選蛦뭩凅䙱糡ᅿߴ㱗", Color.red(0) + 60029, objArr9);
            o.ef.a aVarX4 = aVarX3.x(((String) objArr9[0]).intern());
            Object[] objArr10 = new Object[1];
            g("⼚탋킭킹큱퀠퀂", (ViewConfiguration.getFadingEdgeLength() >> 16) + 65497, objArr10);
            Object[] objArr11 = {aVarX4, ((String) objArr10[0]).intern()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i8 = o.ef.a.f23780n * (-1229108307);
            o.ef.a.f23780n = i8;
            o.ef.c cVar = (o.ef.c) o.ef.a.a(-1398121910, objArr11, iMyUid, i8, 1398121917, iUptimeMillis, iElapsedRealtime);
            Object[] objArr12 = {cVar};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i9 = o.ef.c.f23799b * 1567746851;
            o.ef.c.f23799b = i9;
            int i10 = o.ef.c.f23798a * 1136425123;
            o.ef.c.f23798a = i10;
            if (((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i10, i9, -1513293186, elapsedCpuTime, 1513293186, objArr12)).intValue() == 0) {
                Object[] objArr13 = new Object[1];
                g("⼒화\udd89쓍쨋\uf11e\uf8b7\uffef\ue53c\uec7c鏑體耘蝓躆뗚뭌ꉞ꧉僚嘊嵝䒝䯉焀硖翁曶氎ፕ᪄Ƅܟ\u0e7f㖿㳱∱⥻킹ힼ\udd15쑽쮣\uf2fd\uf836｢", View.combineMeasuredStates(0, 0) + 63809, objArr13);
                throw new f(((String) objArr13[0]).intern());
            }
            ArrayList<i> arrayList = new ArrayList();
            Object[] objArr14 = new Object[1];
            g("⼊䃎\uf0ee悖邴P끈›倂", 28643 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr14);
            o.ef.a aVarV = aVarX4.v(((String) objArr14[0]).intern());
            Object[] objArr15 = new Object[1];
            h("\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{73, 16, 0, 0}, false, objArr15);
            o.ef.a aVarV2 = aVarX4.v(((String) objArr15[0]).intern());
            Object[] objArr16 = new Object[1];
            g("⼏\udd12쬬雷\ue77c闎莝놧뿗귩娱䠷癜", 61979 - View.MeasureSpec.getSize(0), objArr16);
            o.ef.a aVarV3 = aVarX4.v(((String) objArr16[0]).intern());
            Object[] objArr17 = new Object[1];
            g("⼘縯赣\udc80毧뤝젩ᝬꚶ\uf5d4̧剝\ue16aク忋\ued23㱻䮽骒", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20789, objArr17);
            String strS2 = aVarX4.s(((String) objArr17[0]).intern());
            Object[] objArr18 = new Object[1];
            h("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{89, 16, 0, 0}, true, objArr18);
            byte[] bArrZ = aVarX4.z(((String) objArr18[0]).intern());
            Object[] objArr19 = new Object[1];
            g("⼋㷢૮០", KeyEvent.keyCodeFromString("") + 4861, objArr19);
            byte[] bArrZ2 = aVarX4.z(((String) objArr19[0]).intern());
            Object[] objArr20 = new Object[1];
            g("⼘ちᇤ煊勛뉀鎼\uf32b풼㐂ᖌ畉噁랿霨", Color.rgb(0, 0, 0) + 16785269, objArr20);
            aVarX4.z(((String) objArr20[0]).intern());
            Object[] objArr21 = new Object[1];
            g("⼒\uf50d鬂ꄁ䜊洐㌬\ud93cＶ蔸ꬽ焥ᜡ㵓썞\ue951轟啇筎Ŋ❑쵧鍸륪彦整", 55813 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr21);
            aVarX4.s(((String) objArr21[0]).intern());
            Object[] objArr22 = new Object[1];
            h("\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{105, 7, 0, 4}, true, objArr22);
            e eVar = new e(aVar.v(((String) objArr22[0]).intern()));
            Object[] objArr23 = new Object[1];
            g("⼚\u1fdc亥붮\uec55\udb2fਃ竷ꦊ颰", View.combineMeasuredStates(0, 0) + 12503, objArr23);
            byte[] bArrD = aVarX2.D(((String) objArr23[0]).intern());
            Object[] objArr24 = new Object[1];
            h("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 16, 91, 0}, false, objArr24);
            Object[] objArr25 = {aVarX2, ((String) objArr24[0]).intern()};
            int i11 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i11;
            String string2 = (String) o.ef.a.a(-781664457, objArr25, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i11, Thread.currentThread().getPriority());
            if (string2.length() % 2 != 0) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr26 = new Object[1];
                h(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{128, 1, 0, 0}, true, objArr26);
                string2 = sb2.append(((String) objArr26[0]).intern()).append(string2).toString();
            }
            Object[] objArr27 = new Object[1];
            g("⼞鵎䮮㠾\ue678哗ļ콨뷪樦\ud893蛽", 45659 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr27);
            Object[] objArr28 = {aVarX2, ((String) objArr27[0]).intern()};
            int i12 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i12;
            String str6 = (String) o.ef.a.a(-781664457, objArr28, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i12, Thread.currentThread().getPriority());
            if (str6.length() % 2 != 0) {
                StringBuilder sbAppend = new StringBuilder().append(str6);
                Object[] objArr29 = new Object[1];
                g("⼽", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 48157, objArr29);
                string = sbAppend.append(((String) objArr29[0]).intern()).toString();
            } else {
                string = str6;
            }
            Object[] objArr30 = new Object[1];
            g("⼞䪎\ue411\u1fb5뤽퓛乁\ue9c9ͼ뻠\ud8bd爕\ued93ܷ", TextUtils.indexOf((CharSequence) "", '0', 0) + 25998, objArr30);
            o.ef.a aVarX5 = aVarX2.x(((String) objArr30[0]).intern());
            Object[] objArr31 = new Object[1];
            h("\u0001\u0001\u0000\u0001\u0000", new int[]{129, 5, 59, 3}, true, objArr31);
            Object[] objArr32 = {aVarX5, ((String) objArr31[0]).intern()};
            int i13 = o.ef.a.f23778l * 493926616;
            o.ef.a.f23778l = i13;
            int i14 = o.ef.a.f23779m * 1131312688;
            o.ef.a.f23779m = i14;
            int iIntValue = ((Integer) o.ef.a.a(1122077797, objArr32, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i13, i14)).intValue();
            Object[] objArr33 = new Object[1];
            g("⼂䅫\uf3f0摖", 28277 - TextUtils.indexOf("", ""), objArr33);
            Object[] objArr34 = {aVarX5, ((String) objArr33[0]).intern()};
            int i15 = o.ef.a.f23778l * 493926616;
            o.ef.a.f23778l = i15;
            int i16 = o.ef.a.f23779m * 1131312688;
            o.ef.a.f23779m = i16;
            String strB = o.dl.d.b(iIntValue, ((Integer) o.ef.a.a(1122077797, objArr34, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i15, i16)).intValue());
            byte[] bArrE = o.dl.d.e(strB);
            int i17 = 0;
            while (true) {
                Object[] objArr35 = {cVar};
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int i18 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i18;
                int i19 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i19;
                if (i17 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i19, i18, -1513293186, elapsedCpuTime2, 1513293186, objArr35)).intValue()) {
                    for (i iVar2 : arrayList) {
                        Object[] objArr36 = new Object[1];
                        g("⼞鵎䮮㠾\ue678哗ļ콨뷪樦\ud893蛽", 45659 - (ViewConfiguration.getEdgeSlop() >> 16), objArr36);
                        Object[] objArr37 = {aVarX2, ((String) objArr36[0]).intern()};
                        int i20 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i20;
                        iVar2.f(o.dl.d.d((String) o.ef.a.a(-781664457, objArr37, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i20, Thread.currentThread().getPriority())));
                    }
                    return arrayList;
                }
                o.ef.a aVarD = cVar.d(i17);
                if (i17 == 0) {
                    iVar = new i(str, str2, i2, str3);
                    iVar.d(false);
                } else {
                    iVar = new i(i.a(str, i17), str2, i2, str3);
                    iVar.d(true);
                }
                Object[] objArr38 = new Object[1];
                g("⼚裚悩\ud864끖栍쇼릸ᆚ쥍ꄿᫌ\uf2d6ꪄɰ﨨", (ViewConfiguration.getPressedStateDuration() >> 16) + 42961, objArr38);
                byte[] bArrD2 = aVarD.D(((String) objArr38[0]).intern());
                Object[] objArr39 = new Object[1];
                g("⼚뇧ድ", 40693 - View.MeasureSpec.getSize(0), objArr39);
                byte[] bArrD3 = aVarD.D(((String) objArr39[0]).intern());
                Object[] objArr40 = new Object[1];
                h("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{134, 8, 0, 1}, true, objArr40);
                byte bByteValue = aVarD.B(((String) objArr40[0]).intern()).byteValue();
                Object[] objArr41 = new Object[1];
                g("⼸搜륔캚Ϛ壿\uec28ⅅ皁讧샵", Gravity.getAbsoluteGravity(0, 0) + 19249, objArr41);
                Object[] objArr42 = {aVarD, ((String) objArr41[0]).intern()};
                int i21 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i21;
                String str7 = (String) o.ef.a.a(-781664457, objArr42, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i21, Thread.currentThread().getPriority());
                Object[] objArr43 = new Object[1];
                h("\u0001", new int[]{142, 1, 0, 1}, true, objArr43);
                str7.equals(((String) objArr43[0]).intern());
                Object[] objArr44 = new Object[1];
                h("\u0000\u0001\u0001", new int[]{143, 3, 183, 1}, true, objArr44);
                byte[] bArrD4 = aVarD.D(((String) objArr44[0]).intern());
                Object[] objArr45 = new Object[1];
                h("\u0001\u0000\u0001\u0000\u0000", new int[]{146, 5, 0, 0}, false, objArr45);
                byte[] bArrZ3 = aVarD.z(((String) objArr45[0]).intern());
                Object[] objArr46 = new Object[1];
                g("⼊䃎\uf0ee悖邴P끈›倂", View.MeasureSpec.getSize(0) + 28643, objArr46);
                a aVar2 = new a(aVarV, aVarD.v(((String) objArr46[0]).intern()));
                Object[] objArr47 = new Object[1];
                h("\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{73, 16, 0, 0}, false, objArr47);
                o.ef.a aVarV4 = aVarD.v(((String) objArr47[0]).intern());
                Object[] objArr48 = new Object[1];
                str4 = str4;
                g(str4, 61980 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr48);
                c cVar2 = new c(str6, strB, aVarV2, aVarV3, aVarV4, aVarD.v(((String) objArr48[0]).intern()));
                Object[] objArr49 = new Object[1];
                g("⼘縯赣\udc80毧뤝젩ᝬꚶ\uf5d4̧剝\ue16aク忋\ued23㱻䮽骒", 20789 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr49);
                d dVar = new d(strS2, aVarD.s(((String) objArr49[0]).intern()));
                Object[] objArr50 = new Object[1];
                h("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{89, 16, 0, 0}, true, objArr50);
                byte[] bArrZ4 = aVarD.z(((String) objArr50[0]).intern());
                if (bArrZ4 != null) {
                    int i22 = f22608e + 75;
                    f22606c = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    bArrZ4 = bArrZ;
                }
                if (bArrZ4 == null) {
                    Object[] objArr51 = new Object[1];
                    h("\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{151, 30, 0, 11}, false, objArr51);
                    throw new f(((String) objArr51[0]).intern());
                }
                Object[] objArr52 = new Object[1];
                g("⼋㷢૮០", 4861 - Color.green(0), objArr52);
                byte[] bArrZ5 = aVarD.z(((String) objArr52[0]).intern());
                if (bArrZ5 == null) {
                    bArrZ5 = bArrZ2;
                }
                if (bArrZ5 == null) {
                    Object[] objArr53 = new Object[1];
                    g("⼶襃措\uddfb뙖ႀ쫺ꍬᶃ\uf7c6倾੬\ue497崀㝼醡䨇⑾", TextUtils.lastIndexOf("", '0', 0, 0) + 42578, objArr53);
                    throw new f(((String) objArr53[0]).intern());
                }
                o.ei.d.b(bArrZ5);
                Object[] objArr54 = new Object[1];
                g("⼘ちᇤ煊勛뉀鎼\uf32b풼㐂ᖌ畉噁랿霨", TextUtils.indexOf("", "") + 8053, objArr54);
                aVarD.z(((String) objArr54[0]).intern());
                Object[] objArr55 = new Object[1];
                g("⼒\uf50d鬂ꄁ䜊洐㌬\ud93cＶ蔸ꬽ焥ᜡ㵓썞\ue951轟啇筎Ŋ❑쵧鍸륪彦整", 55813 - KeyEvent.keyCodeFromString(""), objArr55);
                aVarD.s(((String) objArr55[0]).intern());
                Object[] objArr56 = new Object[1];
                g("⼚\u1fdc亥붮\uec55\udb2fਃ竷ꦊ颰", 12504 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr56);
                byte[] bArrZ6 = aVarD.z(((String) objArr56[0]).intern());
                if (bArrZ6 != null) {
                    int i24 = f22608e + 41;
                    f22606c = i24 % 128;
                    int i25 = i24 % 2;
                } else {
                    bArrZ6 = bArrD;
                }
                iVar.e(bArrD3);
                iVar.b(bByteValue);
                new o.p002do.d(bArrD4);
                byte[] bArr = aVar2.f22617b;
                o.dm.b bVar = aVar2.f22616a;
                o.dm.b bVar2 = aVar2.f22619d;
                o.dm.b bVar3 = aVar2.f22618c;
                iVar.b(aVar2.f22620e);
                byte[] bArr2 = aVar2.f22622g;
                byte[] bArr3 = aVar2.f22621f;
                o.dm.b bVar4 = aVar2.f22625j;
                o.dm.b bVar5 = aVar2.f22626l;
                byte b2 = aVar2.f22623h;
                boolean z3 = eVar.f22652a;
                o.dm.b bVar6 = eVar.f22654c;
                o.dm.b bVar7 = eVar.f22656e;
                o.dm.b bVar8 = dVar.f22643b;
                o.dm.b bVar9 = cVar2.f22633a;
                Object[] objArr57 = {iVar, o.p002do.e.d(bArrD3, bArrD2, bByteValue, bArrZ3, bArrZ4)};
                int i26 = (int) Runtime.getRuntime().totalMemory();
                int id = (int) Thread.currentThread().getId();
                int i27 = o.et.c.f25341f * 1595628892;
                o.et.c.f25341f = i27;
                o.et.c.d(-1863692548, objArr57, i26, 1863692548, id, i27, Process.myUid());
                Object[] objArr58 = {iVar, o.p002do.e.a(bArrD3, bArrD2, bArrZ5, bArrZ3, bArrZ6)};
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int i28 = o.et.c.f25349r * 1770900040;
                o.et.c.f25349r = i28;
                int i29 = o.et.c.f25350s * 1440287991;
                o.et.c.f25350s = i29;
                int i30 = o.et.c.f25351t * 985966497;
                o.et.c.f25351t = i30;
                o.et.c.d(486595506, objArr58, iUptimeMillis2, -486595502, i28, i29, i30);
                iVar.d(numValueOf);
                ArrayList arrayList2 = new ArrayList();
                if (eVar.f22652a) {
                    arrayList2.add(new o.cl.b(1, 3, o.p002do.e.a(aVar2.f22624i, dVar.f22643b.c(), aVar2.f22616a.c(), aVar2.f22621f, o.dl.d.e(string2), str5.getBytes(g.c()))));
                    arrayList2.add(new o.cl.b(2, 2, o.p002do.e.e(eVar.f22653b, eVar.f22657h.f22628c, eVar.f22657h.f22629d, eVar.f22657h.f22627b)));
                    arrayList2.add(new o.cl.b(2, 3, o.p002do.e.b(eVar.f22655d.f22628c, eVar.f22655d.f22629d, eVar.f22655d.f22627b)));
                    o.p002do.e.b(bArrE, o.dl.d.e(string), aVar2.f22624i, aVar2.f22621f, o.dl.d.e(string2), str5.getBytes(g.c()));
                    z2 = true;
                } else {
                    z2 = true;
                    arrayList2.add(new o.cl.b(1, 3, o.p002do.e.a(aVar2.f22624i, dVar.f22643b.c(), aVar2.f22616a.c(), aVar2.f22621f, o.dl.d.e(string2), str5.getBytes(g.c()))));
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext() == z2) {
                    iVar.e((o.cl.b) it.next());
                    z2 = true;
                }
                arrayList.add(iVar);
                i17++;
            }
        } catch (IllegalArgumentException | o.ef.b e2) {
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr59 = new Object[1];
            h("\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000", new int[]{181, 65, 0, 0}, false, objArr59);
            throw new f(sb3.append(((String) objArr59[0]).intern()).append(e2.getMessage()).toString());
        }
    }
}
