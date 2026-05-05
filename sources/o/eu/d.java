package o.eu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.a.k;
import o.a.o;
import o.ea.f;
import o.ff.a;
import o.fn.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d<T extends o.ff.a> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int A = 0;
    public static int B = 0;
    public static int C = 0;

    /* JADX INFO: renamed from: a */
    public static int f25460a = 0;

    /* JADX INFO: renamed from: b */
    public static int f25461b = 0;

    /* JADX INFO: renamed from: c */
    public static int f25462c = 0;

    /* JADX INFO: renamed from: d */
    public static int f25463d = 0;

    /* JADX INFO: renamed from: e */
    public static int f25464e = 0;

    /* JADX INFO: renamed from: i */
    public static int f25465i = 0;

    /* JADX INFO: renamed from: k */
    private static long f25466k = 0;

    /* JADX INFO: renamed from: m */
    private static long f25467m = 0;

    /* JADX INFO: renamed from: n */
    private static int f25468n = 0;

    /* JADX INFO: renamed from: o */
    private static char[] f25469o = null;

    /* JADX INFO: renamed from: r */
    private static int f25470r = 0;

    /* JADX INFO: renamed from: s */
    private static int f25471s = 0;

    /* JADX INFO: renamed from: t */
    private static int f25472t = 0;

    /* JADX INFO: renamed from: z */
    public static int f25473z = 0;

    /* JADX INFO: renamed from: f */
    private c f25474f;

    /* JADX INFO: renamed from: g */
    private final String f25475g;

    /* JADX INFO: renamed from: h */
    private List<T> f25476h;

    /* JADX INFO: renamed from: j */
    private final String f25477j;

    /* JADX INFO: renamed from: l */
    private boolean f25478l;

    private static String $$i(byte b2, int i2, int i3) {
        int i4 = i2 + 99;
        int i5 = b2 + 4;
        byte[] bArr = $$c;
        int i6 = i3 * 3;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i4 = i5 + i7;
            i5 = i5;
        }
        while (true) {
            int i9 = i5 + 1;
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i9];
            i5 = i9;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        C = -1415889371;
        B = -842077802;
        A = -1914738428;
        f25473z = 1397038205;
        init$0();
        f25465i = 1713784839;
        f25464e = 883378031;
        f25462c = 619570555;
        f25461b = 145127289;
        f25463d = -1364996207;
        f25460a = 556983463;
        f25472t = 0;
        f25470r = 1;
        f25468n = 0;
        f25471s = 1;
        q();
        TextUtils.getCapsMode("", 0, 0);
        SystemClock.elapsedRealtimeNanos();
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getFadingEdgeLength();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getScrollDefaultDelay();
        SystemClock.elapsedRealtimeNanos();
        Drawable.resolveOpacity(0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.lastIndexOf("", '0', 0);
        Color.argb(0, 0, 0, 0);
        int i2 = f25470r + 79;
        f25472t = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public d(String str, String str2, boolean z2) {
        this.f25477j = str;
        this.f25475g = str2;
        this.f25478l = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void D(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 3
            int r8 = 101 - r0
            int r0 = r7 * 2
            int r7 = r0 + 1
            int r6 = r6 + 4
            byte[] r5 = o.eu.d.$$a
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L2d
            r0 = r8
            r2 = r3
            r1 = r6
        L14:
            int r0 = -r0
            int r6 = r6 + r0
            r8 = r6
            r6 = r1
        L18:
            int r1 = r6 + 1
            byte r0 = (byte) r8
            r4[r2] = r0
            int r2 = r2 + 1
            if (r2 != r7) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r9[r3] = r0
            return
        L29:
            r0 = r5[r1]
            r6 = r8
            goto L14
        L2d:
            r2 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.d.D(int, int, int, java.lang.Object[]):void");
    }

    private static void E(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 13;
        int i5 = i4 % 128;
        $11 = i5;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i6 = 4;
        if (str2 != null) {
            int i7 = i5 + 113;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] charArray = str2.toCharArray();
            int i9 = $11 + 125;
            $10 = i9 % 128;
            obj = charArray;
            if (i9 % 2 != 0) {
                int i10 = 2 / 4;
                obj = charArray;
            }
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f25467m ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i11 = $11 + 69;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            kVar.f19938a = kVar.f19939c - i6;
            int i13 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i6]), Long.valueOf(kVar.f19938a), Long.valueOf(f25467m)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    objA = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 228, (char) (51004 - (ViewConfiguration.getLongPressTimeout() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, 1749983833, false, $$i(b2, (byte) (8 & b2), (byte) 0), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 676, (char) (TextUtils.lastIndexOf("", '0') + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, 522683165, false, $$i(b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 15))), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                i6 = 4;
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

    private static void F(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f25469o[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(TextUtils.indexOf("", "", 0) + 742, (char) TextUtils.getCapsMode("", 0, 0), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 632508977, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f25466k), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (-b4);
                    objA2 = o.d.d.a(766 - KeyEvent.keyCodeFromString(""), (char) (12470 - (ViewConfiguration.getTapTimeout() >> 16)), 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1946853218, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    objA3 = o.d.d.a(387 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), Color.argb(0, 0, 0, 0) + 18, 39570797, false, $$i(b6, (byte) ((b6 + 6) - (6 | b6)), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
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
        int i6 = $10 + 23;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 45;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) (-1);
                objA4 = o.d.d.a(Color.red(0) + 387, (char) ((Process.getThreadPriority(0) + 20) >> 6), 18 - (ViewConfiguration.getTouchSlop() >> 8), 39570797, false, $$i(b7, (byte) ((-1) - (((-1) - b7) | ((-1) - 6))), (byte) 0), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void G(int i2, byte b2, int i3, Object[] objArr) {
        int i4 = i3 + 98;
        byte[] bArr = $$g;
        int i5 = i2 + 4;
        byte[] bArr2 = new byte[b2 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i4;
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            int i7 = i5 + 1;
            if (i6 == b2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = bArr[i7] + i4;
                i5 = i7;
            }
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25468n + 71;
        f25471s = i3 % 128;
        if (i3 % 2 != 0) {
            return dVar.d().a(dVar);
        }
        int i4 = 51 / 0;
        return dVar.d().a(dVar);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25468n;
        int i4 = i3 + 117;
        f25471s = i4 % 128;
        int i5 = i4 % 2;
        String str = dVar.f25475g;
        int i6 = i3 + 43;
        f25471s = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i4;
        int i9 = ~i7;
        int i10 = (~(i8 | i2)) | (~((-1) - (((-1) - i8) & ((-1) - i9))));
        int i11 = ~i2;
        int i12 = (-1) - (((-1) - i11) & ((-1) - i4));
        int i13 = ~((i7 + i12) - (i7 & i12));
        int i14 = (i13 + i10) - (i13 & i10);
        int i15 = ~((i9 + i11) - (i9 & i11));
        int i16 = i2 + i4 + i3 + ((-1228711472) * i5) + ((-141981132) * i6);
        int i17 = i16 * i16;
        int i18 = (((-639131287) * i2) - 2072313856) + (1118068377 * i4) + (i14 * (-1268883816)) + ((-1757199664) * i10) + ((-1268883816) * i15) + ((-1908015104) * i3) + ((-287309824) * i5) + ((-1573388288) * i6) + ((-2138374144) * i17);
        int i19 = ((i2 * (-646461497)) - 273503129) + (i4 * (-646460521)) + (i14 * 488) + (i10 * (-976)) + (i15 * 488) + (i3 * (-646461009)) + (i5 * 1623110960) + (i6 * (-2035004020)) + (i17 * 33882112);
        int i20 = i18 + (i19 * i19 * (-1051394048));
        if (i20 == 1) {
            return b(objArr);
        }
        if (i20 == 2) {
            return a(objArr);
        }
        d dVar = (d) objArr[0];
        int i21 = 2 % 2;
        int i22 = f25468n + 55;
        int i23 = i22 % 128;
        f25471s = i23;
        int i24 = i22 % 2;
        dVar.f25478l = false;
        int i25 = i23 + 113;
        f25468n = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    static void init$0() {
        $$a = new byte[]{65, 52, MessagePack.Code.UINT64, -121};
        $$b = 220;
    }

    static void init$1() {
        $$g = new byte[]{7, 42, -92, 85, -65, 75, -75, 54, MessagePack.Code.NIL, Ascii.SO, -65, 55, Ascii.CR, -68, 54, MessagePack.Code.NIL, 16, -16, 17, -17, Ascii.SO};
        $$h = 101;
    }

    static void init$2() {
        $$c = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
        $$f = 105;
    }

    static void q() {
        f25467m = -920611903500833779L;
        f25469o = new char[]{38039, 21057, 6445, 49183, 36861, 30412, 15788, 58553, 41583, 26948, 20520, 7955, 50927, 36300, 29861, 38035, 21059, 6440, 49181, 36833, 30400, 15788, 58565, 41579, 26965, 20532, 8009, 50887, 36290, 29876, 13194, 63860, 41044, 28456, 22022, 7626, 50385, 33706, 19102, 12411, 65361, 62722, 13259, 30893, 41358, 61048, 5972, 23599, 34105, 50153, 2246, 12731, 32413, 42870, 60499, 5415, 21017, 39166, 49600, 38036, 21087, 6498, 49166, 36832, 30429, 15789, 58503, 41573, 26965, 20586, 7956, 50914, 36298, 29934, 13191, 63851, 41050, 28469, 22027, 7679, 50389, 33723, 19098, 12392, 65361, 42618, 27939, 21753, 5082, 55989, 33181, 38045, 21059, 6409, 49154, 36856, 30440, 15800, 58523, 41574, 26956, 20519, 7942, 50930, 36296, 29871, 13197, 63814, 41044, 28463, 22046, 7676, 50389, 33725, 19103, 12346, 65304, 42612, 27922, 21728, 5084, 56048, 33202, 20322, 13885, 64768, 42214, 25549, 10920, 4508, 57186, 34373, 19755, 13380, 45124, 30362, 15810, 58583, 43835, 21020, 6516, 49222, 34458, 19858, 29948, 15325, 57899, 43281, 20591, 5983, 56827, 33993, 19365, 29379, 14641, 57357, 42785, 28259, 5299, 56220, 33505, 18887, 28716, 14089, 65149, 42307, 27556, 4858, 55701, 38038, 21060, 6463, 49164, 36847, 30427, 15788, 58542, 41586, 26965, 20525, 7957, 50915, 36293, 29835, 13190, 63867, 41070, 28473, 22027, 7614, 50324, 33784, 19102, 12396, 65368, 42612, 27958, 21734, 5057, 55996, 33178, 20337, 13868, 64792, 42214, 25537, 10919, 4552, 57134, 34393, 19813, 13324, 62438, 47829, 25057, 10377, 5751, 56657, 33917, 17175, 2810, 61895, 47353, 26507, 11646, 5198, 54133, 39441, 16879, 2246, 63416, 48770, 25718, 9046, 38038, 21060, 6463, 49164, 36847, 30427, 15788, 58528, 41583, 26972, 20503, 7938, 50930, 36225, 29933, 13251, 63847, 41035, 28465, 22111, 7647, 50377, 33704, 19095, 12403, 65366, 42549, 27907, 21759, 5086, 55998, 33235, 20279, 13886, 38098, 21061, 6445, 49180, 36782, 30407, 15783, 58571, 41569, 26944, 20541, 8007, 50934, 36288, 29874, 13186, 63855, 41048, 28456, 22042, 7660, 50378, 33784, 19080, 12415, 65345, 43698, 27685, 10061, 65148, 45518, 18600, 966, 55979, 39951, 22333, 28244, 8558, 63636, 45988, 19140, 3491, 50953, 40504, 20805, 26687, 9101, 64188, 48588, 38098, 21005, 6436, 49166, 36861, 30345, 15789, 58501, 41573, 26960, 20515, 7951, 50854, 36295, 29874, 13190, 63857, 41045, 28540, 22036, 7675, 50368, 33707, 19163, 12343, 65301, 42554, 27906, 21755, 5075, 55989, 33153, 20274, 13943, 64844, 42154, 25546, 10985, 4508, 57187, 34392, 19744, 13335, 62447, 47817, 25005, 10372, 5667, 56600, 33917, 17241, 2811, 38098, 21061, 6445, 49180, 36782, 30407, 15783, 58527, 41514, 26944, 20522, 7944, 50931, 36294, 29864, 13251, 63844, 41039, 28473, 22028, 7670, 50329, 33715, 19102, 12387, 65350, 42612, 27994, 21686, 5087, 55973, 33182, 20336, 13864, 64798, 42159, 25492, 10985, 4557, 57199, 34314, 19761, 13324, 62453, 47811, 25010, 10376, 5740, 56654, 33849, 17244, 2725, 61854, 47356, 26524, 38098, 21061, 6445, 49180, 36782, 30407, 15783, 58571, 41569, 26944, 20541, 8007, 50919, 36311, 29857, 13194, 63854, 41052, 28478, 22035, 7675, 38033, 21068, 6462, 49163, 36830, 30427, 15783, 58509, 41571, 26953, 20513, 7982, 50914, 38033, 21087, 6441, 49163, 36843, 30407, 15804, 58498, 41579, 26953, 20535, 7988, 50915, 36309, 29833, 13191, 38043, 21065};
        f25466k = 8207462974082339373L;
    }

    public final String a() {
        int iNextInt = new Random().nextInt();
        int i2 = 883403134 * f25463d;
        f25463d = i2;
        int i3 = f25461b * (-1930243941);
        f25461b = i3;
        return (String) d(-2137010787, i2, 2137010788, i3, (int) Runtime.getRuntime().freeMemory(), new Object[]{this}, iNextInt);
    }

    public final String a(o.ek.e eVar) {
        Iterator<o.et.c> it;
        int i2 = 2 % 2;
        o.ep.d dVar = eVar.e().get(this.f25475g);
        Object obj = null;
        if (dVar != null) {
            int i3 = f25471s + 43;
            f25468n = i3 % 128;
            if (i3 % 2 != 0) {
                dVar.A();
                obj.hashCode();
                throw null;
            }
            if (dVar.A() != null) {
                Iterator<o.ep.a> it2 = dVar.A().values().iterator();
                o.et.c cVar = null;
                while (!(!it2.hasNext())) {
                    int i4 = f25468n + 87;
                    f25471s = i4 % 128;
                    if (i4 % 2 == 0) {
                        it = it2.next().c().iterator();
                        int i5 = 77 / 0;
                    } else {
                        it = it2.next().c().iterator();
                    }
                    while (it.hasNext()) {
                        o.et.c next = it.next();
                        if (next != null && next.k().equals(this.f25477j)) {
                            int i6 = f25471s + 71;
                            f25468n = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 45 / 0;
                            }
                            cVar = next;
                        }
                    }
                }
                if (cVar == null) {
                    int i8 = f25471s + 121;
                    f25468n = i8 % 128;
                    int i9 = i8 % 2;
                    return null;
                }
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i10 = o.et.c.f25343l * (-1658435610);
                o.et.c.f25343l = i10;
                int i11 = o.et.c.f25348q * 740487534;
                o.et.c.f25348q = i11;
                int i12 = o.et.c.f25347p * (-1494696993);
                o.et.c.f25347p = i12;
                return (String) o.et.c.d(-1396987465, new Object[]{cVar}, iUptimeMillis, 1396987468, i10, i11, i12);
            }
        }
        return null;
    }

    public final void a(c cVar) {
        int i2 = 2 % 2;
        int i3 = f25471s + 15;
        int i4 = i3 % 128;
        f25468n = i4;
        int i5 = i3 % 2;
        this.f25474f = cVar;
        int i6 = i4 + 63;
        f25471s = i6 % 128;
        int i7 = i6 % 2;
    }

    public abstract boolean a(Context context, T t2);

    public abstract o.ef.a b(o.ek.e eVar) throws o.ef.b;

    public abstract void b();

    public void b(o.dk.a aVar) throws Throwable {
        c cVar;
        int i2 = 2 % 2;
        int i3 = f25471s;
        int i4 = i3 + 45;
        f25468n = i4 % 128;
        int i5 = i4 % 2;
        if (this.f25476h == null || (cVar = this.f25474f) == null) {
            return;
        }
        int i6 = i3 + 79;
        f25468n = i6 % 128;
        int i7 = i6 % 2;
        Date dateD = cVar.d();
        if (dateD == null || !dateD.before(new Date())) {
            return;
        }
        int i8 = f25468n + 53;
        f25471s = i8 % 128;
        int i9 = i8 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            E("怆콇膖恖∯煑ﴁᤧ馿睺\uf728ᜥ鏛紑\uf173൝跼挸\ueb75િ蜘櫅\ue5ba", -((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            F((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Color.green(0) + 169, 65 - View.getDefaultSize(0, 0), objArr2);
            f.c(strIntern, String.format(((String) objArr2[0]).intern(), this.f25477j));
        }
        Iterator<T> it = this.f25476h.iterator();
        while (it.hasNext()) {
            int i10 = f25471s + 51;
            f25468n = i10 % 128;
            int i11 = i10 % 2;
            it.next().d(this.f25477j, aVar);
        }
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f25468n + 7;
        int i4 = i3 % 128;
        f25471s = i4;
        int i5 = i3 % 2;
        String str = this.f25477j;
        int i6 = i4 + 87;
        f25468n = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void c(List<T> list) {
        int i2 = 2 % 2;
        int i3 = f25468n;
        int i4 = i3 + 113;
        f25471s = i4 % 128;
        int i5 = i4 % 2;
        this.f25476h = list;
        int i6 = i3 + 89;
        f25471s = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x004b A[PHI: r3 r4
  0x004b: PHI (r3v4 java.lang.String) = (r3v1 java.lang.String), (r3v9 java.lang.String) binds: [B:68:0x00bc, B:58:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:68:0x00bc, B:58:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.d.c(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object clone() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.d.clone():java.lang.Object");
    }

    public abstract a d();

    public void d(Context context) {
        int i2 = 2 % 2;
        int i3 = f25471s + 85;
        f25468n = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public abstract o.cr.d<T> e();

    public final void e(o.dk.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25468n + 43;
        f25471s = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.f25476h == null || this.f25474f == null) {
            return;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            E("怆콇膖恖∯煑ﴁᤧ馿睺\uf728ᜥ鏛紑\uf173൝跼挸\ueb75િ蜘櫅\ue5ba", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            F((char) Color.blue(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 233, 34 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
            f.c(strIntern, String.format(((String) objArr2[0]).intern(), this.f25477j));
        }
        Iterator<T> it = this.f25476h.iterator();
        while (it.hasNext()) {
            int i4 = f25468n + 51;
            f25471s = i4 % 128;
            int i5 = i4 % 2;
            it.next().d(this.f25477j, aVar);
        }
    }

    public final void f() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25468n + 59;
        f25471s = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            E("怆콇膖恖∯煑ﴁᤧ馿睺\uf728ᜥ鏛紑\uf173൝跼挸\ueb75િ蜘櫅\ue5ba", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            F((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 91, Process.getGidForName("") + 44, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(this.f25477j).toString());
        }
        this.f25478l = true;
        List<T> list = this.f25476h;
        if (list != null) {
            int i4 = f25468n + 93;
            f25471s = i4 % 128;
            int i5 = i4 % 2;
            Iterator<T> it = list.iterator();
            while (!(!it.hasNext())) {
                it.next().d(this.f25477j, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x047c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<T> g() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.d.g():java.util.List");
    }

    public final o.ef.a h() throws o.ef.b {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = (-2035938118) * f25462c;
        f25462c = i2;
        int i3 = f25464e * (-308944022);
        f25464e = i3;
        int i4 = f25465i * (-1958107180);
        f25465i = i4;
        return (o.ef.a) d(-154057981, i2, 154057983, i3, i4, new Object[]{this}, iMaxMemory);
    }

    public final c i() {
        int i2 = 2 % 2;
        int i3 = f25471s;
        int i4 = i3 + 23;
        f25468n = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        c cVar = this.f25474f;
        int i5 = i3 + 61;
        f25468n = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    public final boolean j() {
        int i2 = 2 % 2;
        int i3 = f25468n + 123;
        int i4 = i3 % 128;
        f25471s = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f25478l;
        int i6 = i4 + 107;
        f25468n = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final void k() throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            E("怆콇膖恖∯煑ﴁᤧ馿睺\uf728ᜥ鏛紑\uf173൝跼挸\ueb75િ蜘櫅\ue5ba", 1 - TextUtils.getOffsetBefore("", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            F((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9433), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 134, 35 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(this.f25477j).toString());
        }
        List<T> list = this.f25476h;
        if (list != null) {
            int i3 = f25471s + 93;
            f25468n = i3 % 128;
            int i4 = i3 % 2;
            Iterator<T> it = list.iterator();
            int i5 = f25471s + 123;
            f25468n = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                it.next().d(this.f25477j, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.eu.d.f25468n
            int r0 = r0 + 97
            int r2 = r0 % 128
            o.eu.d.f25471s = r2
            int r0 = r0 % r3
            if (r0 != 0) goto L2e
            java.util.List<T extends o.ff.a> r1 = r4.f25476h
            r0 = 28
            int r0 = r0 / 0
            if (r1 == 0) goto L24
        L16:
            int r1 = r2 + 5
            int r0 = r1 % 128
            o.eu.d.f25468n = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L33
            java.util.List<T extends o.ff.a> r0 = r4.f25476h
            r0.clear()
        L24:
            int r0 = o.eu.d.f25468n
            int r1 = r0 + 35
            int r0 = r1 % 128
            o.eu.d.f25471s = r0
            int r1 = r1 % r3
            return
        L2e:
            java.util.List<T extends o.ff.a> r0 = r4.f25476h
            if (r0 == 0) goto L24
            goto L16
        L33:
            java.util.List<T extends o.ff.a> r0 = r4.f25476h
            r0.clear()
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.d.l():void");
    }

    public abstract o.ff.e m();

    /* JADX WARN: Removed duplicated region for block: B:63:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.d.n():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0023, code lost:
    
        if (r3.isEmpty() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008e, code lost:
    
        if (r3.isEmpty() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0091, code lost:
    
        r0 = r12.f25474f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0093, code lost:
    
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0099, code lost:
    
        if (o.ea.f.a() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009b, code lost:
    
        r0 = new java.lang.Object[1];
        E("怆콇膖恖∯煑ﴁᤧ馿睺\uf728ᜥ鏛紑\uf173൝跼挸\ueb75િ蜘櫅\ue5ba", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, r0);
        r3 = ((java.lang.String) r0[0]).intern();
        r2 = new java.lang.StringBuilder();
        r0 = new java.lang.Object[1];
        E("敄\u0e72싫攣璿끠빱供鳮뙀둈䆒隝밿눡寇袛ꈜꠐ專艁꯸ꛗ嘏葺醑鳼栮븍鞝骍扞뀩鵪鍸撢ꯍ荊襋绚귂襡", -android.view.MotionEvent.axisFromString(""), r0);
        r9 = r2.append(((java.lang.String) r0[0]).intern()).append(r12.f25477j);
        r0 = new java.lang.Object[1];
        F((char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.CR, 25 - android.text.TextUtils.lastIndexOf("", '0', 0), r0);
        o.ea.f.c(r3, r9.append(((java.lang.String) r0[0]).intern()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fe, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ff, code lost:
    
        r1 = r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0103, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010e, code lost:
    
        if (r1.before(new java.util.Date()) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
    
        r2 = r12.f25476h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0112, code lost:
    
        if (r2 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        r1 = o.eu.d.f25471s + 63;
        o.eu.d.f25468n = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011d, code lost:
    
        if ((r1 % 2) == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011f, code lost:
    
        r2 = r2.iterator();
        r0 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012a, code lost:
    
        if (r2.hasNext() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012d, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0137, code lost:
    
        if (r1.c() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
    
        r6 = (short) (r6 + r1.h());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013f, code lost:
    
        r1 = o.eu.d.f25468n + 59;
        o.eu.d.f25471s = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0149, code lost:
    
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0152, code lost:
    
        if (o.ea.f.a() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0154, code lost:
    
        r0 = new java.lang.Object[1];
        E("怆콇膖恖∯煑ﴁᤧ馿睺\uf728ᜥ鏛紑\uf173൝跼挸\ueb75િ蜘櫅\ue5ba", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1, r0);
        r3 = ((java.lang.String) r0[0]).intern();
        r2 = new java.lang.StringBuilder();
        r0 = new java.lang.Object[1];
        E("敄\u0e72싫攣璿끠빱供鳮뙀둈䆒隝밿눡寇袛ꈜꠐ專艁꯸ꛗ嘏葺醑鳼栮븍鞝骍扞뀩鵪鍸撢ꯍ荊襋绚귂襡", -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), r0);
        r5 = r2.append(((java.lang.String) r0[0]).intern()).append(r12.f25477j);
        r0 = new java.lang.Object[1];
        F((char) (15967 - android.graphics.ImageFormat.getBitsPerPixel(0)), 294 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 23 - (android.view.KeyEvent.getMaxKeyCode() >> 16), r0);
        o.ea.f.c(r3, r5.append(((java.lang.String) r0[0]).intern()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b8, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final short o() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.d.o():short");
    }

    public final void r() {
        int id = (int) Thread.currentThread().getId();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int priority = Thread.currentThread().getPriority();
        int i2 = f25460a * (-766577094);
        f25460a = i2;
        d(263150758, elapsedCpuTime, -263150758, priority, i2, new Object[]{this}, id);
    }
}
