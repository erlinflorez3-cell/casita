package o.cf;

import android.content.Context;
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
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import o.a.m;
import o.a.o;
import o.bl.b;
import o.ea.f;
import o.m.h;
import o.m.i;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f22221k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static char[] f22222l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f22223m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f22224n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f22225o = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f22226r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f22227a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<h> f22228e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f22229h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, int r11) {
        /*
            byte[] r8 = o.cf.e.$$a
            int r0 = r10 * 4
            int r7 = r0 + 4
            int r3 = 105 - r11
            int r0 = r9 * 3
            int r6 = 1 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L29
            r0 = r6
            r3 = r7
            r2 = r4
        L14:
            int r0 = -r0
            int r7 = r7 + 1
            int r3 = r3 + r0
            r1 = r2
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r3
            r5[r1] = r0
            if (r2 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r8[r7]
            goto L14
        L29:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cf.e.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22223m = 0;
        f22226r = 1;
        f22221k = 0;
        f22225o = 1;
        d();
        Process.myTid();
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getTapTimeout();
        Color.red(0);
        ViewConfiguration.getEdgeSlop();
        TextUtils.indexOf("", "", 0);
        ImageFormat.getBitsPerPixel(0);
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        KeyEvent.normalizeMetaState(0);
        TextUtils.lastIndexOf("", '0', 0);
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        Process.myTid();
        int i2 = f22226r + 69;
        f22223m = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    e(Context context, c cVar, o.en.b bVar, boolean z2, i iVar) {
        super(context, cVar, bVar);
        this.f22227a = z2;
        this.f22229h = iVar;
    }

    static void d() {
        f22222l = new char[]{38055, 18849, 11984, 1018, 57354, 50488, 47715, 40817, 32135, 21146, 14296, 5138, 51490, 44608, 33643, 25008, 18098, 15300, 6390, 64778, 53818, 46916, 38303, 19129, 38016, 18852, 11994, 38065, 18852, 11975, 1007, 57361, 50480, 47685, 40821, 32171, 21180, 14296, 5147, 51507, 44635, 33644, 24982, 18081, 15296, 6384, 64770, 53793, 46915, 38333, 19122, 12238, 3313, 57619, 50727, 38016, 18852, 11994, 955, 57427, 50557, 47681, 40804, 32158, 21152, 14298, 5138, 51490, 44636, 33654, 24984, 18146, 15298, 6386, 64774, 53870, 46871, 38352, 19186, 12233, 3257, 57681, 50787, 47951, 39025, 32456, 21414, 12513, 5457, 51765, 44887, 35948, 25240, 18337, 9411, 6643, 65097, 54061, 45168, 38530, 19388, 10446, 3582, 57878, 50980, 42048, 39211, 32641, 23743, 12720, 5657, 52021, 43085, 36156, 25472, 16553, 9675, 6894, 65286, 56405, 45412, 38790, 29886, 10714, 3773, 58202, 49255, 38054, 18873, 11985, 955, 57357, 50473, 47681, 40819, 32159, 21178, 14220, 5148, 51504, 44565, 33644, 24983, 18087, 15233, 6391, 64795, 53803, 46926, 38297, 19121, 12243, 3324, 57624, 50787, 47941, 39024, 32411, 21435, 12541, 5404, 51761, 44873, 35902, 25244, 18357, 9427, 6626, 65036, 54050, 45159, 38559, 19382, 10457, 3563, 57867, 50990, 42058, 39211, 32643, 23720, 12772, 5663, 52021, 43101, 36156, 25479, 16553, 9664, 6907, 65359, 56412, 45438, 38784, 29947, 10719, 3825, 58124, 49192, 42333, 39465, 30861, 24016, 13026, 5916, 62510, 43358, 36470, 27784, 16811, 9925, 38016, 18852, 11994, 955, 57427, 50557, 47684, 40802, 32139, 21162, 14296, 5146, 51488, 44628, 33644, 24982, 18092, 15302, 6308, 64776, 53816, 46912, 38352, 19181, 12186, 3260, 57615, 50787, 47883, 38949, 32385, 21435, 12466, 5400, 51751, 44827, 35967, 25233, 18354, 9410, 6635, 65037, 54069, 45107, 38546, 19376, 10457, 3580, 57878, 50984, 42066, 39274, 32666, 23720, 12788, 5719, 52064, 43033, 22635, 34164, 57884, 53110, 11456, 2528, 30344, 21417, 45390, 40546, 64264, 55515, 1535, 25304, 20406, 44359, 35452, 63256, 54310, 12747, 7910, 31634, 22813, 34427, 58114, 49184, 11737, 2795, 30597, 21692, 45644, 40801, 64574, 55752, 1776, 25497, 16573, 44560, 35680, 59407, 54579, 13004, 8174, 31930, 23067, 34673, 58374, 49522, 11982, 3040, 26779, 21923, 45890, 36964, 64804, 55962, 2035, 25745, 16816, 44877, 35967, 59649, 54835, 13251, 4235, 32185, 23389, 35920, 20852, 13834, 7019, 63619, 56749, 41628, 34742, 25935, 19063, 12063, 3275, 53743, 46731, 39855, 30991, 24167, 8961, '0', 58842, 51946, 44952, 36096, 21092, 14085, 5159, 63946, 57082, 41873, 38820, 19081, 11760, 213, 58167, 50703, 47471, 40031, 32391, 20865, 13555, 5922, 51714, 44395, 32878, 25255, 17798};
        f22224n = 6318715796645956049L;
    }

    static void init$0() {
        $$a = new byte[]{116, 109, 87, -103};
        $$b = 10;
    }

    private static void p(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i5 = $10 + 55;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (oVar.f19947b < i3) {
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22222l[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(TextUtils.lastIndexOf("", '0') + 743, (char) KeyEvent.keyCodeFromString(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11, 632508977, false, $$c(b2, b3, (byte) (6 | b3)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f22224n), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 765, (char) (Drawable.resolveOpacity(0, 0) + 12470), 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1946853218, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(386 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, 39570797, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
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
        int i8 = $11 + 69;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (oVar.f19947b < i3) {
            int i10 = $11 + 49;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(Drawable.resolveOpacity(0, 0) + 387, (char) Color.blue(0), 18 - TextUtils.indexOf("", "", 0, 0), 39570797, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    @Override // o.cf.a
    public final void e(o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22225o + 65;
        f22221k = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            p((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.getDefaultSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 24, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, 2 - TextUtils.lastIndexOf("", '0', 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f22225o + 1;
            f22221k = i5 % 128;
            int i6 = i5 % 2;
        }
        h hVarD = o.m.c.d().d(this.f22229h);
        if (hVarD == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Unknown;
            Object[] objArr3 = new Object[1];
            p((char) (KeyEvent.getMaxKeyCode() >> 16), (Process.myTid() >> 22) + 27, 27 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        if (!(!this.f22227a)) {
            int i7 = f22221k + 91;
            f22225o = i7 % 128;
            int i8 = i7 % 2;
            if (!hVarD.f().equals(o.m.b.f26402c)) {
                int i9 = f22221k + 23;
                f22225o = i9 % 128;
                int i10 = i9 % 2;
                if (f.a()) {
                    Object[] objArr4 = new Object[1];
                    p((char) TextUtils.indexOf("", "", 0), Color.alpha(0), 24 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                    String strIntern2 = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    p((char) Color.red(0), 55 - TextUtils.getCapsMode("", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 71, objArr5);
                    f.c(strIntern2, String.format(((String) objArr5[0]).intern(), this.f22229h.name()));
                }
                WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
                Object[] objArr6 = new Object[1];
                p((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, objArr6);
                String strIntern3 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                p((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 175 - AndroidCharacter.getMirror('0'), 85 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr7);
                throw new WalletValidationException(walletValidationErrorCode2, strIntern3, ((String) objArr7[0]).intern());
            }
        } else if (!hVarD.f().equals(o.m.b.f26400a)) {
            if (f.a()) {
                Object[] objArr8 = new Object[1];
                p((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getOffsetAfter("", 0), MotionEvent.axisFromString("") + 25, objArr8);
                String strIntern4 = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                p((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 211 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 58, objArr9);
                f.c(strIntern4, String.format(((String) objArr9[0]).intern(), this.f22229h.name()));
            }
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.WrongState;
            Object[] objArr10 = new Object[1];
            p((char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.indexOf((CharSequence) "", '0') + 28, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28, objArr10);
            String strIntern5 = ((String) objArr10[0]).intern();
            Object[] objArr11 = new Object[1];
            p((char) (52429 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Process.getGidForName("") + 270, 67 - View.MeasureSpec.getSize(0), objArr11);
            throw new WalletValidationException(walletValidationErrorCode3, strIntern5, ((String) objArr11[0]).intern());
        }
        ArrayList arrayList = new ArrayList();
        this.f22228e = arrayList;
        arrayList.add(hVarD);
        o.bl.e eVar = new o.bl.e() { // from class: o.cf.e.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static char[] f22230g = null;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f22231i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f22232j = 0;

            private static String $$c(int i11, int i12, int i13) {
                int i14 = (i13 * 4) + 116;
                int i15 = i11 + 4;
                byte[] bArr = $$a;
                int i16 = i12 * 2;
                byte[] bArr2 = new byte[i16 + 1];
                int i17 = -1;
                if (bArr == null) {
                    i14 = i15 + (-i14);
                    i15 = i15;
                }
                while (true) {
                    i17++;
                    int i18 = i15 + 1;
                    bArr2[i17] = (byte) i14;
                    if (i17 == i16) {
                        return new String(bArr2, 0);
                    }
                    i14 += -bArr[i18];
                    i15 = i18;
                }
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f22232j = 0;
                f22231i = 1;
                f22230g = new char[]{56532, 56342, 56340, 56351, 56352, 56350, 56351, 56355, 56353, 56355, 56342, 56343, 56351, 56343, 56351, 56353, 56329, 56337, 56358, 56341, 56344, 56351, 56351, 56361, 56496, 56536, 56536, 56557, 56562, 56557, 56552, 56546, 56530, 56538, 56566, 56563, 56552, 56549, 56550, 56553, 56553, 56555, 56553, 56554, 56556, 56533, 56542, 56566, 56563, 56549, 56386, 56384, 56386, 56389, 56387, 56368, 56372, 56389, 56387, 56389, 56385, 56377, 56381, 56389, 56392, 56384, 56381, 56389, 56395, 56370, 56362, 56388, 56390, 56389, 56386, 56377};
            }

            private static void f(String str, int[] iArr, boolean z2, Object[] objArr12) throws Throwable {
                int i11;
                String str2 = str;
                int i12 = 2 % 2;
                Object bytes = str2;
                if (str2 != null) {
                    int i13 = $11 + 93;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                m mVar = new m();
                int i15 = 0;
                int i16 = iArr[0];
                int i17 = iArr[1];
                int i18 = iArr[2];
                int i19 = iArr[3];
                char[] cArr = f22230g;
                long j2 = 0;
                if (cArr != null) {
                    int i20 = $11 + 107;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    while (i15 < length) {
                        try {
                            Object[] objArr13 = {Integer.valueOf(cArr[i15])};
                            Object objA = o.d.d.a(-2071388435);
                            if (objA == null) {
                                byte b2 = (byte) (-1);
                                byte b3 = (byte) (b2 + 1);
                                objA = o.d.d.a(MotionEvent.axisFromString("") + 250, (char) ExpandableListView.getPackedPositionGroup(j2), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr2[i15] = ((Character) ((Method) objA).invoke(null, objArr13)).charValue();
                            i15++;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i17];
                System.arraycopy(cArr, i16, cArr3, 0, i17);
                if (bArr != null) {
                    char[] cArr4 = new char[i17];
                    mVar.f19943d = 0;
                    char c2 = 0;
                    while (mVar.f19943d < i17) {
                        if (bArr[mVar.f19943d] == 1) {
                            int i22 = $11 + 41;
                            $10 = i22 % 128;
                            if (i22 % 2 != 0) {
                                int i23 = mVar.f19943d;
                                Object[] objArr14 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA2 = o.d.d.a(120026474);
                                if (objA2 == null) {
                                    objA2 = o.d.d.a(';' - AndroidCharacter.getMirror('0'), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                Object obj = null;
                                cArr4[i23] = ((Character) ((Method) objA2).invoke(null, objArr14)).charValue();
                                obj.hashCode();
                                throw null;
                            }
                            int i24 = mVar.f19943d;
                            Object[] objArr15 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA3 = o.d.d.a(120026474);
                            if (objA3 == null) {
                                objA3 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 11, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 9 - Process.getGidForName(""), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i24] = ((Character) ((Method) objA3).invoke(null, objArr15)).charValue();
                        } else {
                            int i25 = mVar.f19943d;
                            Object[] objArr16 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA4 = o.d.d.a(1632715197);
                            if (objA4 == null) {
                                byte b4 = (byte) (-1);
                                byte b5 = (byte) (b4 + 1);
                                objA4 = o.d.d.a(837 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Color.blue(0) + 27279), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -1210801192, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i25] = ((Character) ((Method) objA4).invoke(null, objArr16)).charValue();
                        }
                        c2 = cArr4[mVar.f19943d];
                        Object[] objArr17 = {mVar, mVar};
                        Object objA5 = o.d.d.a(-1041906996);
                        if (objA5 == null) {
                            objA5 = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 21, (char) (35714 - MotionEvent.axisFromString("")), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 392175785, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA5).invoke(null, objArr17);
                    }
                    cArr3 = cArr4;
                }
                if (i19 > 0) {
                    int i26 = $10 + 123;
                    $11 = i26 % 128;
                    if (i26 % 2 == 0) {
                        char[] cArr5 = new char[i17];
                        i11 = 0;
                        System.arraycopy(cArr3, 1, cArr5, 0, i17);
                        System.arraycopy(cArr5, 1, cArr3, i17 % i19, i19);
                        System.arraycopy(cArr5, i19, cArr3, 0, i17 << i19);
                    } else {
                        i11 = 0;
                        char[] cArr6 = new char[i17];
                        System.arraycopy(cArr3, 0, cArr6, 0, i17);
                        int i27 = i17 - i19;
                        System.arraycopy(cArr6, 0, cArr3, i27, i19);
                        System.arraycopy(cArr6, i19, cArr3, 0, i27);
                    }
                } else {
                    i11 = 0;
                }
                if (z2) {
                    char[] cArr7 = new char[i17];
                    mVar.f19943d = i11;
                    while (mVar.f19943d < i17) {
                        cArr7[mVar.f19943d] = cArr3[(i17 - mVar.f19943d) - 1];
                        mVar.f19943d++;
                    }
                    cArr3 = cArr7;
                }
                if (i18 > 0) {
                    int i28 = $10 + 77;
                    $11 = i28 % 128;
                    int i29 = i28 % 2 == 0 ? 1 : 0;
                    while (true) {
                        mVar.f19943d = i29;
                        if (mVar.f19943d >= i17) {
                            break;
                        }
                        int i30 = $10 + 87;
                        $11 = i30 % 128;
                        int i31 = i30 % 2;
                        cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                        i29 = mVar.f19943d + 1;
                    }
                }
                String str3 = new String(cArr3);
                int i32 = $10 + 3;
                $11 = i32 % 128;
                if (i32 % 2 != 0) {
                    objArr12[0] = str3;
                } else {
                    int i33 = 13 / 0;
                    objArr12[0] = str3;
                }
            }

            static void init$0() {
                $$a = new byte[]{Ascii.ETB, 117, 49, -107};
                $$b = 18;
            }

            @Override // o.bl.e
            public final o.bg.c a(o.bg.c cVar) throws Throwable {
                int i11 = 2 % 2;
                int i12 = f22232j + 83;
                f22231i = i12 % 128;
                int i13 = i12 % 2;
                o.m.c.d();
                o.en.b bVarB = e.this.b();
                boolean z2 = e.this.f22227a;
                List<h> list = e.this.f22228e;
                int i14 = o.bg.c.f21082a * 1232037242;
                o.bg.c.f21082a = i14;
                int iMyUid = Process.myUid();
                int i15 = o.bg.c.f21083c * 1942342535;
                o.bg.c.f21083c = i15;
                o.m.c.c(bVarB, z2, list, ((Boolean) o.bg.c.a(i14, i15, iMyUid, -1017985026, new Object[]{cVar}, 1017985027, new Random().nextInt())).booleanValue());
                Object[] objArr12 = {e.this.b()};
                int i16 = o.en.b.f24090e * (-1580596594);
                o.en.b.f24090e = i16;
                int i17 = o.en.b.f24087b * (-2071415875);
                o.en.b.f24087b = i17;
                if (((o.fr.e) o.en.b.a(342371170, i16, objArr12, i17, -342371167, Process.myUid(), new Random().nextInt(460146032))).e()) {
                    Object[] objArr13 = {e.this.b()};
                    int i18 = o.en.b.f24090e * (-1580596594);
                    o.en.b.f24090e = i18;
                    int i19 = o.en.b.f24087b * (-2071415875);
                    o.en.b.f24087b = i19;
                    o.fr.e eVar2 = (o.fr.e) o.en.b.a(342371170, i18, objArr13, i19, -342371167, Process.myUid(), new Random().nextInt(460146032));
                    Object[] objArr14 = {e.this};
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int iMyUid2 = Process.myUid();
                    int i20 = a.f22198f * (-1826585863);
                    a.f22198f = i20;
                    int i21 = 1715447060 * a.f22199g;
                    a.f22199g = i21;
                    eVar2.c((Context) a.b(objArr14, i21, -487326310, iMaxMemory, 487326312, iMyUid2, i20));
                }
                int i22 = f22231i + 47;
                f22232j = i22 % 128;
                if (i22 % 2 == 0) {
                    return cVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.bl.e
            public final o.ef.a e() throws Throwable {
                String strIntern6;
                Object obj;
                int i11 = 2 % 2;
                if (f.a()) {
                    int i12 = f22232j + 21;
                    f22231i = i12 % 128;
                    if (i12 % 2 == 0) {
                        Object[] objArr12 = new Object[1];
                        f("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{0, 24, 53, 10}, false, objArr12);
                        strIntern6 = ((String) objArr12[0]).intern();
                        Object[] objArr13 = new Object[1];
                        f("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{24, 25, 0, 13}, true, objArr13);
                        obj = objArr13[0];
                    } else {
                        Object[] objArr14 = new Object[1];
                        f("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{0, 24, 53, 10}, false, objArr14);
                        strIntern6 = ((String) objArr14[0]).intern();
                        Object[] objArr15 = new Object[1];
                        f("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{24, 25, 0, 13}, false, objArr15);
                        obj = objArr15[0];
                    }
                    f.c(strIntern6, ((String) obj).intern());
                }
                o.m.c cVarD = o.m.c.d();
                Object[] objArr16 = {e.this};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int iMyUid = Process.myUid();
                int i13 = a.f22198f * (-1826585863);
                a.f22198f = i13;
                int i14 = 1715447060 * a.f22199g;
                a.f22199g = i14;
                Context context = (Context) a.b(objArr16, i14, -487326310, iMaxMemory, 487326312, iMyUid, i13);
                e.this.b();
                o.ef.c cVarD2 = cVarD.d(context, e.this.f22227a, e.this.f22228e);
                o.ef.a aVar = new o.ef.a();
                Object[] objArr17 = new Object[1];
                f("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{49, 27, 87, 27}, true, objArr17);
                aVar.a(((String) objArr17[0]).intern(), cVarD2);
                int i15 = f22232j + 35;
                f22231i = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 18 / 0;
                }
                return aVar;
            }
        };
        b.d dVar2 = new b.d() { // from class: o.cf.e.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f22234a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static char[] f22235c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f22236d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static long f22237e = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(int r9, int r10, byte r11) {
                /*
                    byte[] r8 = o.cf.e.AnonymousClass4.$$a
                    int r0 = r10 * 3
                    int r7 = 3 - r0
                    int r0 = r11 * 3
                    int r6 = r0 + 1
                    int r5 = r9 + 99
                    byte[] r4 = new byte[r6]
                    r3 = 0
                    if (r8 != 0) goto L28
                    r0 = r6
                    r2 = r3
                L13:
                    int r0 = -r0
                    int r5 = r5 + r0
                    r1 = r2
                L16:
                    int r7 = r7 + 1
                    byte r0 = (byte) r5
                    int r2 = r1 + 1
                    r4[r1] = r0
                    if (r2 != r6) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L25:
                    r0 = r8[r7]
                    goto L13
                L28:
                    r1 = r3
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.cf.e.AnonymousClass4.$$c(int, int, byte):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f22234a = 0;
                f22236d = 1;
                f22235c = new char[]{38055, 18487, 11772, 652, 58962, 56094, 47247, 40055, 28983, 22268, 2964, 61268, 52474, 41398, 34151, 31270, 24530, 15506, 4154, 62972, 43682, 36418, 25363, 16607, 38045, 18473, 11725, 669, 58946, 56090, 47288, 40036, 28953, 22208, 2958, 61267, 52455, 41380, 34119, 31260, 24513, 15508, 4141, 62958, 43685, 23106, 34550, 58130, 52290, 10397, 5573, 30311, 21179, 49094, 38943, 50513, 8588, 568, 28539, 19341, 46295, 37140, 62020, 57058, 15152, 25708};
                f22237e = 3871942026672621639L;
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x0208  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0209  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void f(char r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 530
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.cf.e.AnonymousClass4.f(char, int, int, java.lang.Object[]):void");
            }

            static void init$0() {
                $$a = new byte[]{90, -4, -67, Ascii.NAK};
                $$b = 234;
            }

            @Override // o.bl.b.d
            public final void d() throws Throwable {
                int i11 = 2 % 2;
                int i12 = f22234a + 37;
                f22236d = i12 % 128;
                if (i12 % 2 == 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr12 = new Object[1];
                    f((char) View.MeasureSpec.makeMeasureSpec(0, 0), ViewConfiguration.getFadingEdgeLength() >> 16, View.combineMeasuredStates(0, 0) + 24, objArr12);
                    String strIntern6 = ((String) objArr12[0]).intern();
                    Object[] objArr13 = new Object[1];
                    f((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.blue(0) + 24, Color.argb(0, 0, 0, 0) + 21, objArr13);
                    f.c(strIntern6, ((String) objArr13[0]).intern());
                    int i13 = f22234a + 23;
                    f22236d = i13 % 128;
                    int i14 = i13 % 2;
                }
                e.this.c().d();
            }

            @Override // o.bl.b.d
            public final void d(o.bg.c cVar) throws Throwable {
                int i11 = 2 % 2;
                int i12 = f22234a + 121;
                f22236d = i12 % 128;
                if (i12 % 2 == 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    int i13 = f22234a + 83;
                    f22236d = i13 % 128;
                    int i14 = i13 % 2;
                    Object[] objArr12 = new Object[1];
                    f((char) View.MeasureSpec.getSize(0), View.MeasureSpec.makeMeasureSpec(0, 0), 24 - (Process.myPid() >> 22), objArr12);
                    String strIntern6 = ((String) objArr12[0]).intern();
                    Object[] objArr13 = new Object[1];
                    f((char) (52959 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 45, 21 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr13);
                    f.c(strIntern6, ((String) objArr13[0]).intern());
                    int i15 = f22234a + 73;
                    f22236d = i15 % 128;
                    int i16 = i15 % 2;
                }
                e.this.c().c(cVar);
            }
        };
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int iMyUid = Process.myUid();
        int i11 = a.f22198f * (-1826585863);
        a.f22198f = i11;
        int i12 = 1715447060 * a.f22199g;
        a.f22199g = i12;
        o.bl.b bVar = new o.bl.b((Context) a.b(new Object[]{this}, i12, -487326310, iMaxMemory, 487326312, iMyUid, i11), dVar2, b());
        if (f.a()) {
            Object[] objArr12 = new Object[1];
            p((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr12);
            String strIntern6 = ((String) objArr12[0]).intern();
            Object[] objArr13 = new Object[1];
            p((char) (6352 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 336 - View.resolveSizeAndState(0, 0, 0), 28 - TextUtils.lastIndexOf("", '0'), objArr13);
            f.c(strIntern6, ((String) objArr13[0]).intern());
        }
        bVar.a(dVar, null, eVar);
    }
}
