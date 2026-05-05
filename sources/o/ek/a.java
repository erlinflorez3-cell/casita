package o.ek;

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
import o.a.i;
import o.eq.d;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f23979f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23980g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23981h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f23982i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f23983k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f23984l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f23985m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f23989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f23990e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23991j;

    static final class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f23992a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f23993b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static byte[] f23994c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f23995d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static short[] f23996e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f23997f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f23998g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f23999i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f24000j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r7, byte r8, short r9) {
            /*
                byte[] r6 = o.ek.a.c.$$a
                int r5 = r7 * 3
                int r1 = r5 + 1
                int r0 = r9 * 2
                int r4 = 4 - r0
                int r0 = 104 - r8
                byte[] r3 = new byte[r1]
                r2 = -1
                if (r6 != 0) goto L27
                r0 = r5
                r1 = r4
            L13:
                int r4 = r4 + r0
                int r1 = r1 + 1
            L16:
                int r2 = r2 + 1
                byte r0 = (byte) r4
                r3[r2] = r0
                if (r2 != r5) goto L24
                java.lang.String r1 = new java.lang.String
                r0 = 0
                r1.<init>(r3, r0)
                return r1
            L24:
                r0 = r6[r1]
                goto L13
            L27:
                r1 = r4
                r4 = r0
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ek.a.c.$$c(int, byte, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f23997f = 0;
            f24000j = 1;
            f23998g = 0;
            f23999i = 1;
            b();
            MotionEvent.axisFromString("");
            ViewConfiguration.getZoomControlsTimeout();
            View.MeasureSpec.getMode(0);
            TextUtils.getOffsetAfter("", 0);
            TypedValue.complexToFloat(0);
            TextUtils.getOffsetAfter("", 0);
            MotionEvent.axisFromString("");
            ExpandableListView.getPackedPositionType(0L);
            Color.rgb(0, 0, 0);
            ViewConfiguration.getGlobalActionKeyTimeout();
            SystemClock.uptimeMillis();
            Process.getGidForName("");
            TextUtils.lastIndexOf("", '0');
            ViewConfiguration.getFadingEdgeLength();
            ViewConfiguration.getMaximumDrawingCacheSize();
            ViewConfiguration.getMaximumDrawingCacheSize();
            TypedValue.complexToFloat(0);
            Color.alpha(0);
            MotionEvent.axisFromString("");
            TextUtils.indexOf((CharSequence) "", '0');
            Color.argb(0, 0, 0, 0);
            ViewConfiguration.getScrollDefaultDelay();
            KeyEvent.normalizeMetaState(0);
            KeyEvent.getDeadChar(0, 0);
            TypedValue.complexToFloat(0);
            SystemClock.currentThreadTimeMillis();
            View.MeasureSpec.makeMeasureSpec(0, 0);
            Color.red(0);
            ExpandableListView.getPackedPositionType(0L);
            TextUtils.indexOf((CharSequence) "", '0');
            int i2 = f24000j + 27;
            f23997f = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 0;
            }
        }

        c() {
        }

        static void b() {
            f23993b = -1406528847;
            f23992a = 1150422418;
            f23995d = -1153283732;
            f23994c = new byte[]{-86, 104, -127, -74, 90, -104, -103, -73, -119, -100, -67, MessagePack.Code.FIXARRAY_PREFIX, Utf8.REPLACEMENT_BYTE, 17, 39, 32, Ascii.US, 38, 41, 92, -30, 52, 50, -15, 38, 35, 16, Ascii.DC4, 48, 59, Ascii.GS, Ascii.NAK, 35, Ascii.DC4, 36, 60, Ascii.NAK, -72, -75, MessagePack.Code.EXT8, -87, -75, MessagePack.Code.UINT32, -128, MessagePack.Code.FIXARRAY_PREFIX, -94, -111, -70, MessagePack.Code.UINT16, -118, -86, -93, MessagePack.Code.FIXARRAY_PREFIX, -74, -98, -72, MessagePack.Code.FIXARRAY_PREFIX, -76, MessagePack.Code.EXT8, -120, -86, -108, -76, -85, -84, -94, -105, -78, -88, -70, -87, -78, MessagePack.Code.BIN16, -128, MessagePack.Code.BIN32, -104, -74, -84, MessagePack.Code.ARRAY16, -98, -95, MessagePack.Code.FIXEXT16, -105, -81, MessagePack.Code.TRUE, -101, MessagePack.Code.BIN32, -83, -94, -109, -75, -66, -67, -74, 39, 83, -7, 73, 94, -120, -29, 64, 65, -124, -1, 74, 64, -121, -4, 79, 72, 90, 60, 72, -102, Ascii.CR, 50, 76, 66, 34, 65, 68, 2, Ascii.VT, Ascii.ESC, -115, -115, -115, -115, -115, -115, -115, -115};
        }

        static a c(o.ef.a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            try {
                Object[] objArr = new Object[1];
                h((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 13), 390586564 + (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 3128196 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-23) - KeyEvent.getDeadChar(0, 0), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr);
                Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
                int i3 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i3;
                String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority());
                Object[] objArr3 = new Object[1];
                h((short) ((Process.myPid() >> 22) - 31), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 390586570, ExpandableListView.getPackedPositionType(0L) + 3128194, (ViewConfiguration.getTouchSlop() >> 8) - 25, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr3);
                Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
                int i4 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i4;
                String str2 = (String) o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority());
                Object[] objArr5 = new Object[1];
                h((short) ((Process.myPid() >> 22) + 91), KeyEvent.getDeadChar(0, 0) + 390586576, Drawable.resolveOpacity(0, 0) + 3128209, ((byte) KeyEvent.getModifierMetaStateMask()) - 4, (byte) (Process.getGidForName("") + 1), objArr5);
                boolean zBooleanValue = aVar.h(((String) objArr5[0]).intern()).booleanValue();
                Object[] objArr6 = new Object[1];
                h((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 56), KeyEvent.keyCodeFromString("") + 390586601, ExpandableListView.getPackedPositionGroup(0L) + 3128210, (-25) - ExpandableListView.getPackedPositionType(0L), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
                Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
                int i5 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i5;
                d dVarD = d.d((String) o.ef.a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority()));
                Object[] objArr8 = new Object[1];
                h((short) (TextUtils.getCapsMode("", 0, 0) - 40), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 390586606, 3128210 - Color.green(0), (-16777221) - Color.rgb(0, 0, 0), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr8);
                String strS = aVar.s(((String) objArr8[0]).intern());
                Object[] objArr9 = new Object[1];
                h((short) ((ViewConfiguration.getScrollBarSize() >> 8) - 48), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 390586630, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3128191, KeyEvent.getDeadChar(0, 0) - 3, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
                a aVar2 = new a(str, str2, dVarD, zBooleanValue, strS, aVar.h(((String) objArr9[0]).intern()).booleanValue());
                int i6 = f23999i + 39;
                f23998g = i6 % 128;
                if (i6 % 2 == 0) {
                    return aVar2;
                }
                throw null;
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr10 = new Object[1];
                h((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 59), 390586658 - KeyEvent.getDeadChar(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3128199, (-2) - Color.red(0), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr10);
                StringBuilder sbAppend = sb.append(((String) objArr10[0]).intern());
                Object[] objArr11 = new Object[1];
                h((short) (TextUtils.lastIndexOf("", '0', 0) - 54), 390586601 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 3128209 - ExpandableListView.getPackedPositionChild(0L), (-26) - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr11);
                String strIntern = ((String) objArr11[0]).intern();
                Object[] objArr12 = new Object[1];
                h((short) (113 - TextUtils.getOffsetBefore("", 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 390586685, 3128205 - TextUtils.getCapsMode("", 0, 0), (-27) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr12);
                throw new o.ef.b(sbAppend.append(aVar.a(strIntern, ((String) objArr12[0]).intern())).toString());
            }
        }

        static o.ef.a d(a aVar) throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr = new Object[1];
            h((short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 12), Gravity.getAbsoluteGravity(0, 0) + 390586564, 3128196 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) - 23, (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            aVar2.a(((String) objArr[0]).intern(), (Object) aVar.b());
            Object[] objArr2 = new Object[1];
            h((short) ((-31) - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 390586572, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3128193, Process.getGidForName("") - 24, (byte) ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
            aVar2.a(((String) objArr2[0]).intern(), (Object) aVar.c());
            Object[] objArr3 = new Object[1];
            h((short) (TextUtils.indexOf("", "") + 91), (ViewConfiguration.getWindowTouchSlop() >> 8) + 390586576, 3128209 - View.MeasureSpec.getSize(0), (-6) - ExpandableListView.getPackedPositionChild(0L), (byte) Color.alpha(0), objArr3);
            aVar2.b(((String) objArr3[0]).intern(), aVar.a());
            Object[] objArr4 = new Object[1];
            h((short) ((-55) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 390586600, 3128210 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) - 25, (byte) Color.blue(0), objArr4);
            aVar2.a(((String) objArr4[0]).intern(), (Object) aVar.d().c());
            Object[] objArr5 = new Object[1];
            h((short) (TextUtils.indexOf((CharSequence) "", '0') - 39), (ViewConfiguration.getWindowTouchSlop() >> 8) + 390586606, 3128210 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), '+' - AndroidCharacter.getMirror('0'), (byte) (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
            aVar2.a(((String) objArr5[0]).intern(), (Object) aVar.e());
            Object[] objArr6 = new Object[1];
            h((short) (View.MeasureSpec.makeMeasureSpec(0, 0) - 48), 390586631 - View.resolveSizeAndState(0, 0, 0), Color.blue(0) + 3128192, TextUtils.indexOf((CharSequence) "", '0') - 2, (byte) View.combineMeasuredStates(0, 0), objArr6);
            aVar2.b(((String) objArr6[0]).intern(), aVar.h());
            int i3 = f23998g + 123;
            f23999i = i3 % 128;
            int i4 = i3 % 2;
            return aVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x025e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x029d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void h(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 718
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ek.a.c.h(short, int, int, int, byte, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{75, Utf8.REPLACEMENT_BYTE, 5, -84};
            $$b = 45;
        }
    }

    private static String $$g(byte b2, byte b3, byte b4) {
        int i2 = 122 - b4;
        byte[] bArr = $$c;
        int i3 = 4 - (b3 * 2);
        int i4 = b2 * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = (-i2) + i5;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 = (-bArr[i3]) + i2;
            i3++;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f23985m = 73266201;
        f23983k = -1615710527;
        init$0();
        f23981h = 0;
        f23984l = 1;
        f23979f = 740602047300126166L;
        f23980g = 1564493270;
        f23982i = (char) 38265;
    }

    a(String str, String str2, d dVar, boolean z2, String str3, boolean z3) {
        this.f23987b = str;
        this.f23988c = str2;
        this.f23986a = z2;
        this.f23989d = dVar;
        this.f23990e = str3;
        this.f23991j = z3;
    }

    static void init$0() {
        $$a = new byte[]{42, MessagePack.Code.FLOAT64, -71, 92};
        $$b = 22;
    }

    static void init$1() {
        $$d = new byte[]{93, 121, -117, 60, 65, MessagePack.Code.EXT32, 0, 55, MessagePack.Code.EXT32, 65, MessagePack.Code.NIL};
        $$e = 145;
    }

    static void init$2() {
        $$c = new byte[]{82, -6, -97, -22};
        $$f = 24;
    }

    private static void n(short s2, byte b2, short s3, Object[] objArr) {
        int i2 = b2 + 99;
        byte[] bArr = $$a;
        int i3 = 3 - (s2 * 3);
        int i4 = s3 * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = (-i3) + i2;
            i3 = i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            int i6 = i3 + 1;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (-bArr[i6]) + i2;
                i3 = i6;
            }
        }
    }

    private static void o(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object obj = null;
        Object charArray3 = str4;
        if (str4 != null) {
            int i7 = $10 + 39;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
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
        int i8 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i9 = $11 + 1;
            $10 = i9 % 128;
            int i10 = i9 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int packedPositionGroup = 106 - ExpandableListView.getPackedPositionGroup(0L);
                    char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int maximumFlingVelocity = 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b2 = (byte) i8;
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, (byte) (57 | b3));
                    Class[] clsArr = new Class[1];
                    clsArr[i8] = Object.class;
                    objA = o.d.d.a(packedPositionGroup, packedPositionGroup2, maximumFlingVelocity, -155898465, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int scrollBarFadeDuration = 847 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    char deadChar = (char) (KeyEvent.getDeadChar(i8, i8) + 6488);
                    int deadChar2 = 12 - KeyEvent.getDeadChar(i8, i8);
                    byte b4 = (byte) i8;
                    byte b5 = b4;
                    String str$$g2 = $$g(b4, b5, (byte) ((b5 + 54) - (54 & b5)));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i8] = Object.class;
                    objA2 = o.d.d.a(scrollBarFadeDuration, deadChar, deadChar2, -694521287, false, str$$g2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i11 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i11);
                objArr4[i8] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) i8;
                    byte b7 = b6;
                    objA3 = o.d.d.a(459 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), 11 - TextUtils.indexOf("", "", i8), 1804962841, false, $$g(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 56)))), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    int iCombineMeasuredStates = 639 - View.combineMeasuredStates(0, 0);
                    char capsMode = (char) (65100 - TextUtils.getCapsMode("", 0, 0));
                    int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11;
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    String str$$g3 = $$g(b8, b9, b9);
                    i3 = 2;
                    objA4 = o.d.d.a(iCombineMeasuredStates, capsMode, i12, 1636969060, false, str$$g3, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                obj = null;
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f23979f ^ 740602047300126166L)) ^ ((long) ((int) (((long) f23980g) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f23982i) ^ 740602047300126166L))));
                iVar.f19932b++;
                i8 = 0;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 7
            int r8 = 11 - r0
            int r0 = r7 * 10
            int r3 = r0 + 101
            int r1 = r6 * 7
            int r0 = 8 - r1
            byte[] r7 = o.ek.a.$$d
            byte[] r6 = new byte[r0]
            int r5 = 7 - r1
            r4 = 0
            if (r7 != 0) goto L2f
            r0 = r5
            r3 = r8
            r2 = r4
        L18:
            int r0 = -r0
            int r8 = r8 + 1
            int r3 = r3 + r0
            r1 = r2
        L1d:
            byte r0 = (byte) r3
            r6[r1] = r0
            int r2 = r1 + 1
            if (r1 != r5) goto L2c
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r4)
            r9[r4] = r0
            return
        L2c:
            r0 = r7[r8]
            goto L18
        L2f:
            r1 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.a.p(byte, byte, short, java.lang.Object[]):void");
    }

    public final void a(String str) {
        int i2 = 2 % 2;
        int i3 = f23981h + 45;
        int i4 = i3 % 128;
        f23984l = i4;
        int i5 = i3 % 2;
        this.f23990e = str;
        int i6 = i4 + 63;
        f23981h = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f23984l + 43;
        int i4 = i3 % 128;
        f23981h = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f23986a;
        int i6 = i4 + 117;
        f23984l = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f23981h;
        int i4 = i3 + 53;
        f23984l = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f23987b;
        int i6 = i3 + 89;
        f23984l = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f23984l + 125;
        f23981h = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f23988c;
        }
        throw null;
    }

    public final void c(d dVar) {
        int i2 = 2 % 2;
        int i3 = f23984l + 13;
        int i4 = i3 % 128;
        f23981h = i4;
        int i5 = i3 % 2;
        this.f23989d = dVar;
        int i6 = i4 + 49;
        f23984l = i6 % 128;
        int i7 = i6 % 2;
    }

    public final d d() {
        int i2 = 2 % 2;
        int i3 = f23981h + 7;
        int i4 = i3 % 128;
        f23984l = i4;
        int i5 = i3 % 2;
        d dVar = this.f23989d;
        int i6 = i4 + 61;
        f23981h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 48 / 0;
        }
        return dVar;
    }

    public final String e() {
        String str;
        int i2 = 2 % 2;
        int i3 = f23981h + 41;
        int i4 = i3 % 128;
        f23984l = i4;
        if (i3 % 2 == 0) {
            str = this.f23990e;
            int i5 = 11 / 0;
        } else {
            str = this.f23990e;
        }
        int i6 = i4 + 75;
        f23981h = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void g() {
        int i2 = 2 % 2;
        int i3 = f23984l;
        int i4 = i3 + 45;
        f23981h = i4 % 128;
        this.f23991j = i4 % 2 != 0;
        int i5 = i3 + 35;
        f23981h = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063 A[PHI: r19
  0x0063: PHI (r19v10 long) = (r19v0 long), (r19v12 long) binds: [B:17:0x00ed, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ek.a.h():boolean");
    }
}
