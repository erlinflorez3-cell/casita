package o.x;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26893a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static short[] f26894b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26895c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26896d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f26897e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f26898f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f26899g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26900h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f26901i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f26902j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26903l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26904m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f26905o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, byte r10, int r11) {
        /*
            byte[] r8 = o.x.e.$$a
            int r0 = 104 - r10
            int r7 = r11 + 4
            int r1 = r9 * 2
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L29
            r2 = r6
            r1 = r7
            r3 = r4
        L12:
            int r7 = r7 + r2
            r2 = r3
            r0 = r7
            r7 = r1
        L16:
            int r3 = r2 + 1
            byte r1 = (byte) r0
            r5[r2] = r1
            if (r3 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            int r1 = r7 + 1
            r2 = r8[r1]
            r7 = r0
            goto L12
        L29:
            r2 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.e.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26905o = 0;
        f26903l = 1;
        f26898f = 0;
        f26904m = 1;
        c();
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        View.getDefaultSize(0, 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        Color.green(0);
        Process.myTid();
        ViewConfiguration.getKeyRepeatTimeout();
        AudioTrack.getMaxVolume();
        KeyEvent.getMaxKeyCode();
        Process.getThreadPriority(0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Gravity.getAbsoluteGravity(0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getScrollFriction();
        Color.rgb(0, 0, 0);
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getKeyRepeatDelay();
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getKeyRepeatTimeout();
        Process.getElapsedCpuTime();
        Color.red(0);
        View.resolveSize(0, 0);
        ViewConfiguration.getZoomControlsTimeout();
        SystemClock.currentThreadTimeMillis();
        View.combineMeasuredStates(0, 0);
        Process.myPid();
        ExpandableListView.getPackedPositionForGroup(0);
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getJumpTapTimeout();
        SystemClock.elapsedRealtimeNanos();
        ViewConfiguration.getJumpTapTimeout();
        View.getDefaultSize(0, 0);
        TextUtils.indexOf("", "", 0, 0);
        Color.red(0);
        ViewConfiguration.getFadingEdgeLength();
        Color.rgb(0, 0, 0);
        View.getDefaultSize(0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        Process.myPid();
        int i2 = f26905o + 83;
        f26903l = i2 % 128;
        int i3 = i2 % 2;
    }

    public static b c(String str) throws o.ef.b, IllegalArgumentException {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        k((short) ((-115) - TextUtils.indexOf("", "", 0)), 1680054112 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-2087434141) - TextUtils.lastIndexOf("", '0', 0), ((byte) KeyEvent.getModifierMetaStateMask()) - 80, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr);
        String[] strArrSplit = str.split(((String) objArr[0]).intern());
        if (strArrSplit.length < 2) {
            Object[] objArr2 = new Object[1];
            k((short) ((ViewConfiguration.getTapTimeout() >> 16) + 116), (KeyEvent.getMaxKeyCode() >> 16) + 1680054182, KeyEvent.keyCodeFromString("") - 2087434135, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 82, (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr2);
            throw new IllegalArgumentException(((String) objArr2[0]).intern());
        }
        String str2 = strArrSplit[1];
        short sXd = (short) (C1633zX.Xd() ^ (-10424));
        int[] iArr = new int["DPERNGA\nPNBD\u0005\u00186G8\b\u0005".length()];
        QB qb = new QB("DPERNGA\nPNBD\u0005\u00186G8\b\u0005");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr3 = {str2, 0};
        Method declaredMethod = Class.forName(new String(iArr, 0, i3)).getDeclaredMethod(C1561oA.Yd("\u001e \u001f,\"$", (short) (C1580rY.Xd() ^ (-10892))), Class.forName(C1561oA.yd("PFZD\u0010MAMU\u001b?_\\RVN", (short) (C1607wl.Xd() ^ 30029))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            o.ef.a aVar = new o.ef.a(new String((byte[]) declaredMethod.invoke(null, objArr3), StandardCharsets.UTF_8));
            int iMyTid = 127 - (Process.myTid() >> 22);
            Object[] objArr4 = new Object[1];
            short sXd2 = (short) (C1580rY.Xd() ^ (-28751));
            short sXd3 = (short) (C1580rY.Xd() ^ (-48));
            int[] iArr2 = new int["֖֙֘֞֞֞֞֞֞".length()];
            QB qb2 = new QB("֖֙֘֞֞֞֞֞֞");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) + sXd3);
                i4++;
            }
            n(iMyTid, null, null, new String(iArr2, 0, i4), objArr4);
            Object[] objArr5 = {aVar, ((String) objArr4[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            o.ef.a aVar2 = new o.ef.a((String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority()));
            Object[] objArr6 = new Object[1];
            k((short) (79 - Color.red(0)), View.MeasureSpec.getSize(0) + 1680054113, ExpandableListView.getPackedPositionGroup(0L) - 2087434135, (-82) - TextUtils.lastIndexOf("", '0'), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr6);
            Object[] objArr7 = {aVar2, ((String) objArr6[0]).intern()};
            int i6 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i6;
            o.ef.c cVar = new o.ef.c((String) o.ef.a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority()));
            ArrayList arrayList = new ArrayList();
            int i7 = f26904m + 1;
            f26898f = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i10 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i10;
                int i11 = 1136425123 * o.ef.c.f23798a;
                o.ef.c.f23798a = i11;
                if (i9 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i11, i10, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                    break;
                }
                int i12 = f26898f + 105;
                f26904m = i12 % 128;
                if (i12 % 2 == 0) {
                    arrayList.add(o.m.i.b(cVar.e(i9)));
                    i9 += 48;
                } else {
                    arrayList.add(o.m.i.b(cVar.e(i9)));
                    i9++;
                }
            }
            Object[] objArr8 = new Object[1];
            k((short) ((-64) - KeyEvent.normalizeMetaState(0)), 1680054134 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-2104211337) - Color.rgb(0, 0, 0), KeyEvent.getDeadChar(0, 0) - 81, (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr8);
            String strS = aVar2.s(((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            k((short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 19), 1680054148 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.rgb(0, 0, 0) - 2070656901, Color.alpha(0) - 81, (byte) ((-1) - TextUtils.lastIndexOf("", '0')), objArr9);
            String strS2 = aVar.s(((String) objArr9[0]).intern());
            Object[] objArr10 = new Object[1];
            k((short) ((-50) - ExpandableListView.getPackedPositionType(0L)), 1680054154 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.red(0) - 2087434127, (-81) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) Gravity.getAbsoluteGravity(0, 0), objArr10);
            String strS3 = aVar.s(((String) objArr10[0]).intern());
            Object[] objArr11 = new Object[1];
            n(TextUtils.indexOf("", "") + 127, null, null, Jg.Wd("Ⱥ߹ـ", (short) (C1580rY.Xd() ^ (-28125)), (short) (C1580rY.Xd() ^ (-3167))), objArr11);
            String strS4 = aVar2.s(((String) objArr11[0]).intern());
            int i13 = 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            Object[] objArr12 = new Object[1];
            short sXd4 = (short) (C1499aX.Xd() ^ (-17038));
            short sXd5 = (short) (C1499aX.Xd() ^ (-22507));
            int[] iArr3 = new int["£ݾԢ".length()];
            QB qb3 = new QB("£ݾԢ");
            int i14 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i14] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i14 % C1561oA.Xd.length] ^ ((i14 * sXd5) + sXd4)));
                i14++;
            }
            n(i13, null, null, new String(iArr3, 0, i14), objArr12);
            String strS5 = aVar.s(((String) objArr12[0]).intern());
            Object[] objArr13 = new Object[1];
            k((short) ((-75) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1680054155, (-2087434135) - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 81, (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr13);
            String strS6 = aVar.s(((String) objArr13[0]).intern());
            Object[] objArr14 = new Object[1];
            k((short) (Color.green(0) + 56), 1680054168 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-2087434163) - Color.blue(0), (-81) - Color.blue(0), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr14);
            Long lK = aVar.k(((String) objArr14[0]).intern());
            Object[] objArr15 = new Object[1];
            k((short) ((-87) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1680054175, Color.argb(0, 0, 0, 0) - 2087434159, (ViewConfiguration.getTapTimeout() >> 16) - 81, (byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr15);
            return new b(strS, arrayList, strS2, strS3, strS4, strS5, strS6, lK, aVar.k(((String) objArr15[0]).intern()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void c() {
        f26896d = -548510420;
        f26893a = 1150422493;
        f26895c = 955890293;
        f26897e = new byte[]{Utf8.REPLACEMENT_BYTE, MessagePack.Code.EXT16, 72, 77, 43, 53, 40, 77, 68, Ascii.GS, Base64.padSymbol, 58, 43, 73, 34, 38, 43, 58, 55, 35, 40, Base64.padSymbol, 72, 51, -78, MessagePack.Code.EXT16, MessagePack.Code.UINT64, -24, -106, -78, MessagePack.Code.FLOAT64, -72, MessagePack.Code.MAP16, -94, MessagePack.Code.NIL, -72, MessagePack.Code.UINT8, 56, -123, -103, -110, -114, 62, -65, -79, 49, MessagePack.Code.BIN16, MessagePack.Code.FIXEXT1, -80, MessagePack.Code.NEVER_USED, MessagePack.Code.INT32, -80, MessagePack.Code.INT8, MessagePack.Code.UINT32, MessagePack.Code.UINT16, MessagePack.Code.BIN32, -19, 58, 81, 79, 57, 90, 77, 86, 58, -31, MessagePack.Code.MAP32, MessagePack.Code.EXT32, -18, -26, MessagePack.Code.ARRAY32, 92, 6, -16, Ascii.GS, 10, 2, 1, 2, Ascii.NAK, 66, -76, Ascii.ESC, 88, -77, Ascii.CAN, Ascii.VT, 5, 10, 109, -77, 6, Ascii.US, Ascii.FF, Ascii.DC2, 7, Ascii.VT, Ascii.FF, Ascii.US, Ascii.CAN, 4, Ascii.CR, 6, 45};
        f26902j = new char[]{2171, 2135, 2134, 2146, 2173, 2150, 2144, 2147, 2153, 2168};
        f26900h = 2040400346;
        f26899g = true;
        f26901i = true;
    }

    static void init$0() {
        $$a = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
        $$b = 29;
    }

    private static void k(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        int i5;
        long j2;
        int i6;
        int i7;
        int i8 = 2 % 2;
        o.a.j jVar = new o.a.j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f26893a)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = o.d.d.a(TextUtils.getOffsetBefore("", 0) + 238, (char) (44531 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 35969549, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10 + 19;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i5 = 1;
            } else {
                int i11 = $11 + 79;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i5 = 0;
            }
            if (i5 != 0) {
                int i13 = $11 + 19;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                byte[] bArr = f26897e;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i15 = 0; i15 < length; i15++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i15])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 1);
                            objA2 = o.d.d.a(627 - ImageFormat.getBitsPerPixel(0), (char) (View.MeasureSpec.getMode(0) + 28649), 11 - View.MeasureSpec.getMode(0), 1621469864, false, $$c(b5, b6, (byte) (-b6)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i15] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i16 = $10 + 45;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        byte[] bArr3 = f26897e;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f26896d)};
                        Object objA3 = o.d.d.a(-727631768);
                        if (objA3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objA3 = o.d.d.a(238 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44531), (Process.myTid() >> 22) + 11, 35969549, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        long j3 = f26893a;
                        i7 = ((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) % (-7649639543924978291L))) / ((int) ((j3 - 7649639543924978291L) - (j3 & (-7649639543924978291L))));
                    } else {
                        byte[] bArr4 = f26897e;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(f26896d)};
                        Object objA4 = o.d.d.a(-727631768);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objA4 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 237, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 44531), ExpandableListView.getPackedPositionChild(0L) + 12, 35969549, false, $$c(b9, b10, (byte) (b10 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i7 = ((byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f26893a) ^ (-7649639543924978291L)));
                    }
                    iIntValue = (byte) i7;
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f26894b[i2 + ((int) (((long) f26896d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f26893a) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f26896d) ^ j2)) + i5;
                Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f26895c), sb};
                Object objA5 = o.d.d.a(1819197256);
                if (objA5 == null) {
                    objA5 = o.d.d.a(MotionEvent.axisFromString("") + 1, (char) (5359 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr5 = f26897e;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr6[i17] = (byte) (((long) bArr5[i17]) ^ (-7649639543924978291L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        int i18 = $11 + 105;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            byte[] bArr7 = f26897e;
                            jVar.f19936d = jVar.f19936d - 1;
                            i6 = jVar.f19935c % (((byte) (((byte) (((long) bArr7[r2]) * (-7649639543924978291L))) % s2)) ^ b2);
                        } else {
                            byte[] bArr8 = f26897e;
                            jVar.f19936d = jVar.f19936d - 1;
                            i6 = jVar.f19935c + (((byte) (((byte) (((long) bArr8[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2);
                        }
                        jVar.f19937e = (char) i6;
                    } else {
                        short[] sArr = f26894b;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
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

    private static void n(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i3;
        String str3 = str;
        String str4 = str2;
        int i4 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr3 = f26902j;
        int i5 = 0;
        if (cArr3 != null) {
            int i6 = $10 + 61;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        objA = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)) + 593, (char) (13181 - KeyEvent.keyCodeFromString("")), 11 - Color.alpha(i5), -1225586509, false, $$c(b2, (byte) ((b2 + 37) - (37 & b2)), (byte) (-1)), new Class[]{Integer.TYPE});
                    }
                    cArr[i3] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i3++;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f26900h)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - KeyEvent.normalizeMetaState(0), (char) ((-1) - MotionEvent.axisFromString("")), 10 - Process.getGidForName(""), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f26901i) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b3 = (byte) 0;
                    objA3 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 458, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1923924106, false, $$c(b3, (byte) (31 | b3), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f26899g) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
                int i7 = $11 + 3;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr2.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i9 = $11 + 61;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr6[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = o.d.d.a(1540807955);
            if (objA4 == null) {
                byte b4 = (byte) 0;
                objA4 = o.d.d.a(458 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 11, -1923924106, false, $$c(b4, (byte) (31 | b4), (byte) (-1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }
}
