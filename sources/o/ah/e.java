package o.ah;

import android.content.Context;
import android.graphics.Color;
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
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.i;
import o.ab.j;
import o.cg.b;
import o.cg.f;
import o.ef.a;
import o.ef.c;
import o.er.k;
import o.er.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends o.ab.e<InterfaceC0329e> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static short[] f20221k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20222l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20223m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20224n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static byte[] f20225o = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f20226q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20227r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f20228s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f20229t = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    List<String> f20230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    k f20231g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<o> f20232j;

    static final class d extends j<e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20233b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20234c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20235d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20236f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static long f20237g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f20238h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static char[] f20239i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static char f20240j = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static long f20241l = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f20242n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f20243o = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(int r9, int r10, int r11) {
            /*
                byte[] r8 = o.ah.e.d.$$a
                int r0 = r9 * 2
                int r7 = r0 + 1
                int r0 = r10 + 65
                int r1 = r11 * 3
                int r6 = r1 + 4
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r8 != 0) goto L2a
                r2 = r6
                r3 = r4
            L13:
                int r6 = r6 + 1
                int r0 = -r0
                int r0 = r0 + r2
                r2 = r3
            L18:
                int r3 = r2 + 1
                byte r1 = (byte) r0
                r5[r2] = r1
                if (r3 != r7) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L25:
                r1 = r8[r6]
                r2 = r0
                r0 = r1
                goto L13
            L2a:
                r2 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ah.e.d.$$d(int, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20238h = -45537289;
            f20233b = 462750763;
            f20234c = -1146724442;
            f20235d = 456423625;
            f20243o = 0;
            f20242n = 1;
            f20237g = 740602047300126166L;
            f20236f = -1835817990;
            f20240j = (char) 17878;
            f20239i = new char[]{38033, 59039, 28824, 49842, 23729, 38039, 59027, 28811, 49855, 23726, 38047, 59025, 28808, 49855, 23726, 44715, 14580, 35539, 1279, 38652, 57583, 29188, 49361, 45765, 9430, 38635, 2292, 64211, 27804, 56984, 20643, 49832, 46251, 49557, 45972, 9615, 38842, 2492, 64420, 28118, 57288, 20954, 50170, 46565, 10008, 38032, 59031, 28806, 49850, 23723, 44704, 14557, 35559, 1270, 38650, 57592, 29203, 52241, 24093, 45184, 49798, 21647, 59070, 38017, 59018, 28811, 49826, 23719, 38033, 59025, 28831, 49848, 23734, 44732, 14531};
            f20241l = 6550437166439327486L;
        }

        d(e eVar) {
            super(eVar, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
            d dVar = (d) objArr[0];
            int i2 = 2 % 2;
            a aVar = new a();
            c cVar = new c();
            for (String str : ((e) dVar.e()).f20230f) {
                a aVar2 = new a();
                Object[] objArr2 = new Object[1];
                v((char) (35794 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "晈麑聀ݣ\uec47杂", "\u0000\u0000\u0000\u0000", "磀䕙퇗쎋", Color.blue(0), objArr2);
                aVar2.a(((String) objArr2[0]).intern(), (Object) str);
                cVar.a(aVar2);
            }
            Object[] objArr3 = new Object[1];
            z((char) (Color.rgb(0, 0, 0) + 16777216), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), '5' - AndroidCharacter.getMirror('0'), objArr3);
            aVar.a(((String) objArr3[0]).intern(), cVar);
            int i3 = f20242n + 81;
            f20243o = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 32 / 0;
            }
            return aVar;
        }

        public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i6;
            int i9 = ~i5;
            int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
            int i11 = ~(i6 | i5);
            int i12 = (-1) - (((-1) - i10) & ((-1) - i11));
            int i13 = ~((-1) - (((-1) - i6) & ((-1) - i3)));
            int i14 = (i12 + i13) - (i12 & i13);
            int i15 = (-1) - (((-1) - i9) & ((-1) - i6));
            int i16 = (~((~i3) | i6)) | i11;
            int i17 = i6 + i5 + i4 + (111814883 * i2) + (1975835455 * i7);
            int i18 = i17 * i17;
            int i19 = (((-1960851331) * i6) - 1583611904) + (47848387 * i5) + (i14 * (-2101222338)) + ((-92522620) * i15) + ((-2101222338) * i16) + ((-2053373952) * i4) + ((-648806400) * i2) + (1432616960 * i7) + (442957824 * i18);
            int i20 = ((i6 * 961080817) - 60187382) + (i5 * 961079119) + (i14 * 566) + (i15 * (-1132)) + (i16 * 566) + (i4 * 961079685) + (i2 * 1618335983) + (i7 * 193609403) + (i18 * 1988296704);
            if (i19 + (i20 * i20 * 176226304) != 1) {
                return b(objArr);
            }
            int i21 = 2 % 2;
            int i22 = f20243o + 105;
            f20242n = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }

        private static b c(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 24925), "\uf1df쐩夶ᶥ\uf7a9\uf368苗ᔃ㏮济湰됻\uef06潝艘\ue779\uf86b年駺", "\u0000\u0000\u0000\u0000", "⡅⢺岍ѡ", (-1926710744) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            b bVar = new b(context, 51, ((String) objArr[0]).intern());
            int i3 = f20243o + 117;
            f20242n = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
            $$b = 222;
        }

        private static void v(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2 % 2;
            Object obj = null;
            Object charArray = str6;
            if (str6 != null) {
                int i4 = $11 + 107;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    str6.toCharArray();
                    throw null;
                }
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str5;
            if (str5 != null) {
                int i5 = $10 + 117;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    str5.toCharArray();
                    throw null;
                }
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str4;
            if (str4 != null) {
                int i6 = $10 + 67;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
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
            int i7 = 0;
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
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i7) + 106;
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iIndexOf = TextUtils.indexOf("", "", i7, i7) + 11;
                        byte b2 = (byte) i7;
                        byte b3 = b2;
                        String str$$d = $$d(b2, b3, b3);
                        Class[] clsArr = new Class[1];
                        clsArr[i7] = Object.class;
                        objA = o.d.d.a(iNormalizeMetaState, scrollDefaultDelay, iIndexOf, -155898465, false, str$$d, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b4 = (byte) i7;
                        byte b5 = (byte) (b4 + 3);
                        objA2 = o.d.d.a(847 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (6489 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -694521287, false, $$d(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(View.resolveSize(0, 0) + 458, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, 1804962841, false, $$d(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        objA4 = o.d.d.a(AndroidCharacter.getMirror('0') + 591, (char) (Color.blue(0) + 65100), TextUtils.lastIndexOf("", '0', 0) + 13, 1636969060, false, $$d(b8, (byte) ((-1) - (((-1) - b8) & ((-1) - 57))), b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r7[iVar.f19932b])) ^ (f20237g ^ 740602047300126166L)) ^ ((long) ((int) (((long) f20236f) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f20240j) ^ 740602047300126166L))));
                    iVar.f19932b++;
                    i7 = 0;
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

        private static void z(char c2, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            o.a.o oVar = new o.a.o();
            long[] jArr = new long[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i5 = $11 + 81;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = oVar.f19947b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(f20239i[i2 + i6])};
                        Object objA = o.d.d.a(-214519724);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a(742 - View.resolveSizeAndState(0, 0, 0), (char) View.combineMeasuredStates(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 12, 632508977, false, $$d(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 34))), b2), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(f20241l), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(-1567654649);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            objA2 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 765, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12470), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, 1946853218, false, $$d(b3, (byte) ((b3 + 35) - (35 & b3)), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {oVar, oVar};
                        Object objA3 = o.d.d.a(-723636472);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            objA3 = o.d.d.a(387 - Gravity.getAbsoluteGravity(0, 0), (char) (Process.getGidForName("") + 1), 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 39570797, false, $$d(b4, (byte) ((b4 + 40) - (40 & b4)), b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i7 = oVar.f19947b;
                    Object[] objArr5 = {Integer.valueOf(f20239i[i2 + i7])};
                    Object objA4 = o.d.d.a(-214519724);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a(742 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), 12 - TextUtils.getTrimmedLength(""), 632508977, false, $$d(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 34))), b5), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(f20241l), Integer.valueOf(c2)};
                    Object objA5 = o.d.d.a(-1567654649);
                    if (objA5 == null) {
                        byte b6 = (byte) 0;
                        objA5 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 765, (char) (12470 - TextUtils.getOffsetBefore("", 0)), TextUtils.getCapsMode("", 0, 0) + 12, 1946853218, false, $$d(b6, (byte) ((b6 + 35) - (35 & b6)), b6), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {oVar, oVar};
                    Object objA6 = o.d.d.a(-723636472);
                    if (objA6 == null) {
                        byte b7 = (byte) 0;
                        objA6 = o.d.d.a(387 - View.resolveSize(0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 39570797, false, $$d(b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 40))), b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i8 = $10 + 75;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr8 = {oVar, oVar};
                    Object objA7 = o.d.d.a(-723636472);
                    if (objA7 == null) {
                        byte b8 = (byte) 0;
                        objA7 = o.d.d.a(TextUtils.indexOf("", "", 0) + 387, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 18 - ((Process.getThreadPriority(0) + 20) >> 6), 39570797, false, $$d(b8, (byte) (40 | b8), b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA7).invoke(null, objArr8);
                    int i9 = 27 / 0;
                } else {
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr9 = {oVar, oVar};
                    Object objA8 = o.d.d.a(-723636472);
                    if (objA8 == null) {
                        byte b9 = (byte) 0;
                        objA8 = o.d.d.a(386 - TextUtils.lastIndexOf("", '0', 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, 39570797, false, $$d(b9, (byte) (40 | b9), b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA8).invoke(null, objArr9);
                }
            }
            objArr[0] = new String(cArr);
        }

        @Override // o.ab.j
        public final /* synthetic */ f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20243o + 61;
            f20242n = i3 % 128;
            if (i3 % 2 != 0) {
                return c(context);
            }
            c(context);
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(a aVar) throws Throwable {
            o.e eVar;
            int i2 = 2;
            int i3 = 2 % 2;
            Object[] objArr = new Object[1];
            v((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), "၉䰱禠⬏\uf064\ueca7원意구\udb31뵦\uebb9", "\u0000\u0000\u0000\u0000", "蚪뾫ዐ瑪", TextUtils.indexOf("", ""), objArr);
            a aVarX = aVar.x(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            v((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "ㅋ┋῁蘒鴂䂊꓆䓡\u0c5e", "\u0000\u0000\u0000\u0000", "킏\ue6aa繚뫻", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1525066448, objArr2);
            Object[] objArr3 = {aVarX, ((String) objArr2[0]).intern()};
            int i4 = a.f23782p * (-1576737484);
            a.f23782p = i4;
            String str = (String) a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority());
            Object[] objArr4 = new Object[1];
            v((char) (ViewConfiguration.getJumpTapTimeout() >> 16), "냈∘䞡栘ㅊ㸻ۉ倳", "\u0000\u0000\u0000\u0000", "糵鍴鮹軹", TextUtils.indexOf("", ""), objArr4);
            Object[] objArr5 = {aVarX, ((String) objArr4[0]).intern()};
            int i5 = a.f23782p * (-1576737484);
            a.f23782p = i5;
            String str2 = (String) a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
            Object[] objArr6 = new Object[1];
            z((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 5 - TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionGroup(0L) + 5, objArr6);
            Object[] objArr7 = {aVarX, ((String) objArr6[0]).intern()};
            int i6 = a.f23782p * (-1576737484);
            a.f23782p = i6;
            String str3 = (String) a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority());
            Object[] objArr8 = new Object[1];
            z((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr8);
            a aVarX2 = aVarX.x(((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            v((char) KeyEvent.normalizeMetaState(0), "忁꺚螣ꘂ⇂賧冤縓᭻됡役", "\u0000\u0000\u0000\u0000", "䣈䋌뮅曗", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 2059219897, objArr9);
            Object[] objArr10 = {aVarX2, ((String) objArr9[0]).intern()};
            int i7 = a.f23782p * (-1576737484);
            a.f23782p = i7;
            String str4 = (String) a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
            Object[] objArr11 = new Object[1];
            z((char) (21587 - TextUtils.indexOf("", "", 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, 11 - Color.argb(0, 0, 0, 0), objArr11);
            Object[] objArr12 = {aVarX2, ((String) objArr11[0]).intern()};
            int i8 = a.f23782p * (-1576737484);
            a.f23782p = i8;
            String str5 = (String) a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority());
            Object[] objArr13 = new Object[1];
            z((char) (21771 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 12, objArr13);
            Object[] objArr14 = {aVarX, ((String) objArr13[0]).intern()};
            int i9 = a.f23782p * (-1576737484);
            a.f23782p = i9;
            String str6 = (String) a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority());
            Object[] objArr15 = new Object[1];
            v((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), "忁꺚螣ꘂ⇂賧冤縓᭻됡役", "\u0000\u0000\u0000\u0000", "䣈䋌뮅曗", (ViewConfiguration.getPressedStateDuration() >> 16) - 2059219896, objArr15);
            Object[] objArr16 = {aVarX, ((String) objArr15[0]).intern()};
            int i10 = a.f23782p * (-1576737484);
            a.f23782p = i10;
            ((e) e()).f20231g = new k(str, str2, str3, str4, str5, str6, (String) a.a(-781664457, objArr16, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i10, Thread.currentThread().getPriority()));
            Object[] objArr17 = new Object[1];
            z((char) (ViewConfiguration.getLongPressTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 5, objArr17);
            c cVarT = aVar.t(((String) objArr17[0]).intern());
            ArrayList arrayList = new ArrayList();
            if (cVarT != null) {
                int i11 = f20243o + 79;
                f20242n = i11 % 128;
                int i12 = 1136425123;
                int i13 = 1567746851;
                Object obj = null;
                if (i11 % 2 == 0) {
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i14 = c.f23799b * 1567746851;
                    c.f23799b = i14;
                    int i15 = c.f23798a * 1136425123;
                    c.f23798a = i15;
                    ((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i15, i14, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVarT})).intValue();
                    throw null;
                }
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int i16 = c.f23799b * 1567746851;
                c.f23799b = i16;
                int i17 = c.f23798a * 1136425123;
                c.f23798a = i17;
                if (((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i17, i16, -1513293186, elapsedCpuTime2, 1513293186, new Object[]{cVarT})).intValue() > 0) {
                    int i18 = f20243o + 69;
                    f20242n = i18 % 128;
                    int i19 = i18 % 2;
                    int i20 = 0;
                    while (true) {
                        int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                        int i21 = c.f23799b * i13;
                        c.f23799b = i21;
                        int i22 = c.f23798a * i12;
                        c.f23798a = i22;
                        if (i20 >= ((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i22, i21, -1513293186, elapsedCpuTime3, 1513293186, new Object[]{cVarT})).intValue()) {
                            break;
                        }
                        a aVarD = cVarT.d(i20);
                        Object[] objArr18 = new Object[1];
                        v((char) (35841 - AndroidCharacter.getMirror('0')), "晈麑聀ݣ\uec47杂", "\u0000\u0000\u0000\u0000", "磀䕙퇗쎋", View.combineMeasuredStates(0, 0), objArr18);
                        String strS = aVarD.s(((String) objArr18[0]).intern());
                        if (strS == null) {
                            int i23 = f20243o + 105;
                            f20242n = i23 % 128;
                            if (i23 % i2 == 0) {
                                o.ea.f.a();
                                obj.hashCode();
                                throw null;
                            }
                            if (o.ea.f.a()) {
                                String strD = d();
                                Object[] objArr19 = new Object[1];
                                v((char) View.resolveSizeAndState(0, 0, 0), "柡霜쏎罳圳ᬃ簭⟅⭽鴒\uf4bdﬃ\ue465\uda37\uf29c箍묕᭵\uf5c9ᭂ뵈̗\uf4cb襊캶罀ࠗ侟畣ᡨ逩飞흫迼\ue299쮗ꮚ쨹Ԇፎ搫튤喝⁊궗颊", "\u0000\u0000\u0000\u0000", "\ufff6廇㖊觳", TextUtils.lastIndexOf("", '0', 0) + 1, objArr19);
                                o.ea.f.c(strD, ((String) objArr19[0]).intern());
                            }
                        } else {
                            Object[] objArr20 = new Object[1];
                            v((char) (54857 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "曱\ue05eनꠏ釗ᒅ虾㐐폕秬⭥㐚憸ᎈ", "\u0000\u0000\u0000\u0000", "\udaa2晣䣞ꓖ", TextUtils.indexOf("", "", 0, 0), objArr20);
                            String strS2 = aVarD.s(((String) objArr20[0]).intern());
                            Object[] objArr21 = new Object[1];
                            z((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr21);
                            a aVarV = aVarD.v(((String) objArr21[0]).intern());
                            if (aVarV != null) {
                                Object[] objArr22 = new Object[1];
                                v((char) (33336 - (ViewConfiguration.getTapTimeout() >> 16)), "톽樣\ud8baⲾႉ", "\u0000\u0000\u0000\u0000", "\ufdc8㳴㣨ꮂ", 62765 - AndroidCharacter.getMirror('0'), objArr22);
                                String strS3 = aVarV.s(((String) objArr22[0]).intern());
                                Object[] objArr23 = new Object[1];
                                v((char) (MotionEvent.axisFromString("") + 7897), "ᣵ댟泍믽\u0cf0", "\u0000\u0000\u0000\u0000", "듌㯡\ud820팞", 540795317 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr23);
                                String strS4 = aVarV.s(((String) objArr23[0]).intern());
                                Object[] objArr24 = new Object[1];
                                z((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9232), Color.rgb(0, 0, 0) + 16777275, (-16777212) - Color.rgb(0, 0, 0), objArr24);
                                String strS5 = aVarV.s(((String) objArr24[0]).intern());
                                Object[] objArr25 = new Object[1];
                                z((char) Drawable.resolveOpacity(0, 0), (-16777153) - Color.rgb(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 6, objArr25);
                                String strS6 = aVarV.s(((String) objArr25[0]).intern());
                                Object[] objArr26 = new Object[1];
                                v((char) View.getDefaultSize(0, 0), "䜂\u187c▮헻忋ଐ\ue48f搅탩⠇", "\u0000\u0000\u0000\u0000", "⎇켮옘ᮥ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr26);
                                String strS7 = aVarV.s(((String) objArr26[0]).intern());
                                Object[] objArr27 = new Object[1];
                                z((char) Color.alpha(0), 67 - TextUtils.lastIndexOf("", '0', 0, 0), View.resolveSizeAndState(0, 0, 0) + 7, objArr27);
                                eVar = new o.e(strS3, strS4, strS5, strS6, strS7, aVarV.s(((String) objArr27[0]).intern()));
                            } else {
                                eVar = null;
                            }
                            arrayList.add(new o(strS, strS2, eVar));
                        }
                        i20++;
                        i2 = 2;
                        i12 = 1136425123;
                        i13 = 1567746851;
                    }
                }
            }
            ((e) e()).f20232j = arrayList;
            int i24 = f20243o + 1;
            f20242n = i24 % 128;
            int i25 = i24 % 2;
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20243o + 3;
            int i5 = i4 % 128;
            f20242n = i5;
            int i6 = i4 % 2;
            if (i2 != 6000) {
                return super.b(i2);
            }
            int i7 = i5 + 19;
            f20243o = i7 % 128;
            int i8 = i7 % 2;
            return o.bg.a.aI;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20242n + 5;
            f20243o = i3 % 128;
            int i4 = i3 % 2;
            ((e) e()).g().a(cVar);
            int i5 = f20243o + 83;
            f20242n = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20243o + 121;
            f20242n = i3 % 128;
            if (i3 % 2 != 0) {
                ((e) e()).g().a(((e) e()).f20231g, ((e) e()).f20232j);
                return;
            }
            ((e) e()).g().a(((e) e()).f20231g, ((e) e()).f20232j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20242n;
            int i4 = i3 + 41;
            f20243o = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 87;
            f20243o = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // o.ab.j
        public final a m() throws o.ef.b {
            int iNextInt = new Random().nextInt(213081815);
            int i2 = 1758886825 * f20235d;
            f20235d = i2;
            int iMyTid = Process.myTid();
            int i3 = f20234c * (-718003052);
            f20234c = i3;
            return (a) b(new Object[]{this}, iMyTid, iNextInt, i2, 1372295697, -1372295697, i3);
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20242n + 75;
            f20243o = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "켴陒拈ᄽꍙ钙范몿Ⱄ恸ꒂ犻\ud95e᫁鋯蠖\u1738縪캆沍ꏗ\uf31e", "\u0000\u0000\u0000\u0000", "쭱הּ\ue583ָ", ViewConfiguration.getFadingEdgeLength() >> 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20242n + 61;
            f20243o = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20242n;
            int i4 = i3 + 25;
            f20243o = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 107;
            f20243o = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // o.ab.j
        public final void q() {
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i2 = (-632573937) * f20233b;
            f20233b = i2;
            int i3 = f20238h * 505570625;
            f20238h = i3;
            b(new Object[]{this}, i3, iElapsedRealtime, i2, 1830393270, -1830393269, new Random().nextInt(1840224089));
        }

        @Override // o.ab.j
        public final void s() {
            int i2 = 2 % 2;
            int i3 = f20242n + 61;
            f20243o = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX INFO: renamed from: o.ah.e$e, reason: collision with other inner class name */
    public interface InterfaceC0329e {
        void a(o.bg.c cVar);

        void a(k kVar, List<o> list);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r8, int r9, int r10) {
        /*
            byte[] r7 = o.ah.e.$$d
            int r2 = r9 * 3
            int r1 = 1 - r2
            int r0 = r10 + 4
            int r6 = r8 + 103
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L29
            r6 = r3
            r2 = r0
            r1 = r4
        L14:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r2
        L17:
            int r2 = r0 + 1
            byte r0 = (byte) r6
            r5[r1] = r0
            if (r1 != r3) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r7[r2]
            goto L14
        L29:
            r1 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ah.e.$$j(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20227r = 0;
        f20228s = 1;
        f20226q = 0;
        f20229t = 1;
        m();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getMinimumFlingVelocity();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getMaximumFlingVelocity();
        Color.blue(0);
        int i2 = f20227r + 27;
        f20228s = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public e(Context context, InterfaceC0329e interfaceC0329e, o.en.b bVar) {
        super(context, interfaceC0329e, bVar, o.bg.e.B);
    }

    static void init$0() {
        $$d = new byte[]{7, 42, -92, 85};
        $$e = 158;
    }

    private d k() {
        int i2 = 2 % 2;
        d dVar = new d(this);
        int i3 = f20229t + 121;
        f20226q = i3 % 128;
        if (i3 % 2 == 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m() {
        f20223m = 16001760;
        f20224n = 1150422416;
        f20222l = 1874129451;
        f20225o = new byte[]{-115, 60, MessagePack.Code.EXT8, 62, MessagePack.Code.FLOAT32, 52, -26, Ascii.SUB, MessagePack.Code.BIN16, 56, MessagePack.Code.STR32, MessagePack.Code.FIXEXT1, Ascii.NAK, 60, -25, 5, MessagePack.Code.EXT8, 50, 52, 49, MessagePack.Code.FLOAT64, 52, -8, 5, MessagePack.Code.BIN16, MessagePack.Code.FIXEXT1, Base64.padSymbol, MessagePack.Code.FIXEXT1, 37, 118, 99, -98, 125, 114, -77, -102, 65, -93, 97, -108, -110, -105, 109, -110, 94, -97, 114, -125, -93, 99, 114, -76, 103, 116, 43, MessagePack.Code.FIXEXT4, 53, 58, -5, MessagePack.Code.INT32, 9, -21, 41, MessagePack.Code.ARRAY16, MessagePack.Code.STR16, MessagePack.Code.MAP32, 37, MessagePack.Code.STR16, Ascii.SYN, -9, Ascii.SUB, MessagePack.Code.FLOAT64, -21, 43, MessagePack.Code.STR16};
    }

    private static void u(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        int i5;
        boolean z2;
        char c2;
        int i6;
        int length;
        byte[] bArr;
        int i7 = 2 % 2;
        o.a.j jVar = new o.a.j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f20224n)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 1;
                byte b4 = (byte) (b3 - 1);
                objA = o.d.d.a(238 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 44531), 11 - KeyEvent.keyCodeFromString(""), 35969549, false, $$j(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 59;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i5 = 1;
            } else {
                i5 = 0;
            }
            char c3 = '0';
            if (i5 != 0) {
                byte[] bArr2 = f20225o;
                if (bArr2 != null) {
                    int i10 = $10 + 81;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i12 = 0;
                    while (i12 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i12])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a(627 - TextUtils.indexOf("", c3), (char) (28649 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 11 - TextUtils.getOffsetBefore("", 0), 1621469864, false, $$j(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr3[i12] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i12++;
                        c3 = '0';
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = f20225o;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f20223m)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (b7 - 1);
                        objA3 = o.d.d.a(237 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (44530 - TextUtils.lastIndexOf("", '0')), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), 35969549, false, $$j(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f20224n) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) f20221k[i2 + ((int) (((long) f20223m) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f20224n) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = $11 + 103;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f20223m) ^ (-7649639543924978291L))) + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f20222l), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a((Process.getThreadPriority(0) + 20) >> 6, (char) (5358 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 10 - TextUtils.indexOf((CharSequence) "", '0'), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr5 = f20225o;
                if (bArr5 != null) {
                    int i15 = $10 + 113;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i16 = 0; i16 < length; i16++) {
                        int i17 = $11 + 65;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            bArr[i16] = (byte) (((long) bArr5[i16]) * (-7649639543924978291L));
                        } else {
                            bArr[i16] = (byte) (((long) bArr5[i16]) ^ (-7649639543924978291L));
                        }
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    z2 = true;
                } else {
                    int i18 = $10 + 31;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    z2 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        int i20 = $10 + 13;
                        $11 = i20 % 128;
                        if (i20 % 2 == 0) {
                            byte[] bArr6 = f20225o;
                            jVar.f19936d = jVar.f19936d + 1;
                            byte b9 = (byte) (((long) bArr6[r3]) ^ (-7649639543924978291L));
                            c2 = jVar.f19935c;
                            i6 = b9 >>> s2;
                        } else {
                            byte[] bArr7 = f20225o;
                            jVar.f19936d = jVar.f19936d - 1;
                            byte b10 = (byte) (((long) bArr7[r3]) ^ (-7649639543924978291L));
                            c2 = jVar.f19935c;
                            i6 = b10 + s2;
                        }
                        jVar.f19937e = (char) (c2 + (((byte) i6) ^ b2));
                    } else {
                        short[] sArr = f20221k;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20226q + 3;
        f20229t = i3 % 128;
        int i4 = i3 % 2;
        d dVarK = k();
        int i5 = f20226q + 99;
        f20229t = i5 % 128;
        int i6 = i5 % 2;
        return dVarK;
    }

    public final void c(List<String> list) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20226q + 117;
        f20229t = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f20229t + 53;
            f20226q = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            u((short) View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0, 0) - 1147545453, (-723976035) - (ViewConfiguration.getWindowTouchSlop() >> 8), (-31) - MotionEvent.axisFromString(""), (byte) (71 - View.resolveSize(0, 0)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((short) (Color.rgb(0, 0, 0) + 16777216), (-1147545424) - ExpandableListView.getPackedPositionType(0L), (-723976003) - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf((CharSequence) "", '0') - 29, (byte) ((-31) - TextUtils.indexOf("", "", 0, 0)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f20230f = list;
        a();
        int i7 = f20226q + 25;
        f20229t = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20226q + 11;
        f20229t = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        u((short) Color.argb(0, 0, 0, 0), (-1147545453) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-723976034) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") - 30, (byte) ((-16777145) - Color.rgb(0, 0, 0)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20226q + 57;
        f20229t = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }
}
