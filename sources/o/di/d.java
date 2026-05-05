package o.di;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$f = null;
    private static final int $$g = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f23046a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23047b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23048c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f23049e = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f23050l = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$h(short r8, byte r9, short r10) {
        /*
            int r0 = r8 * 2
            int r8 = r0 + 1
            byte[] r7 = o.di.d.$$f
            int r6 = 105 - r9
            int r0 = r10 * 4
            int r5 = r0 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L2a
            r0 = r5
            r2 = r3
        L13:
            int r6 = r6 + r5
            int r5 = r0 + 1
            r1 = r2
        L17:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r1 = r7[r5]
            r0 = r5
            r5 = r6
            r6 = r1
            goto L13
        L2a:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.di.d.$$h(short, byte, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f23050l = 411550838;
        init$0();
        f23048c = 0;
        f23047b = 1;
        f23049e = new char[]{6259, 19905, 45836, 6487, 20105, 46282, 6680, 16407, 46489, 7128, 16670, 46969, 7339, 17125, 43056, 7727, 17281, 43504, 7990, 17761, 43699, 4331, 18008, 38037, 49450, 16380, 38276, 49782, 14387, 38640, 52400, 14713, 38710, 52708, 15236, 36929, 52741, 9453, 37519, 53060, 9488, 42129, 61731, 4078, 42421, 62059, 2088, 42746, 64757, 2427, 42810, 65020, 2971, 41033, 65031, 5330, 41677, 65360, 5392, 41876, 63926, 5700, 44033, 64162, 5986, 44331, 64484, 4534, 44662, 50227, 4855, 43167, 50557, 4918, 43458, 48809, 60190, 5588, 49055, 59464, 1748, 21283, 44533, 1967, 20512, 43555, 1275, 24249, 43879, 1393, 24565, 43400, 588, 23558, 46720, 140, 23886, 46868, 452, 23451, 46168, 3611, 22695, 46444, 3878, 22944, 46011, 3191, 55879, 36839, 29025, 56166, 36004, 30438, 55342, 33401, 30650, 55793, 33589, 30022, 56972, 56949};
        f23046a = 1389209887908610383L;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] a(android.content.Context r28, int r29, int r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.di.d.a(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{0, -128, Ascii.EM, 70, MessagePack.Code.FIXEXT4};
        $$b = 32;
    }

    static void init$1() {
        $$f = new byte[]{67, Ascii.SI, 99, -76};
        $$g = 248;
    }

    private static void n(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $11 + 109;
            $10 = i6 % 128;
            if (i6 % i4 != 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f23049e[i2 >> i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 741, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, 632508977, false, $$h(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 6))), b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f23046a), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 5);
                        objA2 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + 766, (char) (Color.red(0) + 12470), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 1946853218, false, $$h(b3, b4, (byte) (b4 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA3 = o.d.d.a(TextUtils.indexOf("", "", 0) + 387, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, 39570797, false, $$h(b5, b6, b6), new Class[]{Object.class, Object.class});
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
                int i8 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f23049e[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 743, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12, 632508977, false, $$h(b7, (byte) (6 | b7), b7), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f23046a), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 5);
                    objA5 = o.d.d.a(765 - Process.getGidForName(""), (char) (AndroidCharacter.getMirror('0') + 12422), MotionEvent.axisFromString("") + 13, 1946853218, false, $$h(b8, b9, (byte) (b9 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA6 = o.d.d.a(387 - View.getDefaultSize(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), 18 - (Process.myTid() >> 22), 39570797, false, $$h(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i9 = $10 + 35;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objA7 = o.d.d.a(386 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 39570797, false, $$h(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(int r9, int r10, short r11, java.lang.Object[] r12) {
        /*
            int r0 = r10 * 4
            int r8 = 5 - r0
            byte[] r7 = o.di.d.$$a
            int r6 = 101 - r11
            int r0 = r9 * 3
            int r5 = r0 + 1
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L2d
            r2 = r3
            r1 = r8
        L13:
            int r8 = r8 + r6
            int r0 = r1 + 1
            r1 = r2
            r6 = r8
            r8 = r0
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r5) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L28:
            r0 = r7[r8]
            r1 = r8
            r8 = r0
            goto L13
        L2d:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.di.d.o(int, int, short, java.lang.Object[]):void");
    }

    public abstract b a(Context context, o.ef.a aVar);

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23047b + 125;
        f23048c = i3 % 128;
        if (i3 % 2 == 0) {
            return super.equals(obj);
        }
        super.equals(obj);
        throw null;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23047b + 29;
        f23048c = i3 % 128;
        int i4 = i3 % 2;
        super.finalize();
        int i5 = f23047b + 63;
        f23048c = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f23047b + 79;
        f23048c = i3 % 128;
        if (i3 % 2 == 0) {
            return super.hashCode();
        }
        super.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f23048c + 25;
        f23047b = i3 % 128;
        if (i3 % 2 != 0) {
            return super.toString();
        }
        super.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
