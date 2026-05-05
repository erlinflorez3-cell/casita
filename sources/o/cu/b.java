package o.cu;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.o;
import o.ef.a;
import o.fg.d;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b<T extends d> implements o.cr.d<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f22658b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f22659c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22660d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22661e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, byte r11) {
        /*
            int r8 = r10 + 99
            int r0 = r11 + 4
            byte[] r7 = o.cu.b.$$a
            int r1 = r9 * 4
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L27
            r1 = r0
            r3 = r4
        L11:
            int r0 = -r0
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L15:
            int r3 = r2 + 1
            byte r1 = (byte) r8
            r5[r2] = r1
            int r1 = r0 + 1
            if (r3 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r0 = r7[r1]
            goto L11
        L27:
            r2 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cu.b.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22660d = 0;
        f22661e = 1;
        f22659c = new char[]{38035, 38519, 37235, 38043, 38509, 37236, 40004, 40782, 38043, 38503, 37246, 12889, 12453, 14268, 15075, 14777, 15568, 9157, 9971, 9656, 10251, 12063, 4715, 4413, 5209, 6942, 7779, 7525, 'p', 1681, 1415, 2276, 4077, 29323, 29141, 29937, 31725, 32271, 32091, 24608, 26418, 27200, 26968};
        f22658b = -2110024850003356157L;
    }

    private T d(a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22660d + 123;
        f22661e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        k((char) (MotionEvent.axisFromString("") + 1), View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2, objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i5 = a.f23778l * 493926616;
        a.f23778l = i5;
        int i6 = a.f23779m * 1131312688;
        a.f23779m = i6;
        int iIntValue = ((Integer) a.a(1122077797, objArr2, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i5, i6)).intValue();
        Object[] objArr3 = new Object[1];
        k((char) View.combineMeasuredStates(0, 0), 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, objArr3);
        short sShortValue = aVar.l(((String) objArr3[0]).intern()).shortValue();
        Object[] objArr4 = new Object[1];
        k((char) Color.green(0), 8 - Drawable.resolveOpacity(0, 0), 3 - KeyEvent.getDeadChar(0, 0), objArr4);
        byte[] bArrD = aVar.D(((String) objArr4[0]).intern());
        if (bArrD.length >= 8) {
            T t2 = (T) c(sShortValue, iIntValue, bArrD);
            int i7 = f22660d + 115;
            f22661e = i7 % 128;
            if (i7 % 2 != 0) {
                return t2;
            }
            throw null;
        }
        Object[] objArr5 = new Object[1];
        k((char) (42722 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31, objArr5);
        throw new o.ef.b(((String) objArr5[0]).intern());
    }

    static void init$0() {
        $$a = new byte[]{53, 102, 82, Ascii.ETB};
        $$b = 96;
    }

    private static void k(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22659c[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(741 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ImageFormat.getBitsPerPixel(0) + 1), '<' - AndroidCharacter.getMirror('0'), 632508977, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f22658b), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 766, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12469), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, 1946853218, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(387 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 18 - ((Process.getThreadPriority(0) + 20) >> 6), 39570797, false, $$c(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i6 = $10 + 15;
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
        int i8 = $11 + 63;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (oVar.f19947b < i3) {
            int i10 = $11 + 71;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a(387 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 39570797, false, $$c(b7, (byte) ((b7 + 6) - (6 & b7)), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = o.d.d.a(-723636472);
            if (objA5 == null) {
                byte b8 = (byte) 0;
                objA5 = o.d.d.a(387 - Color.green(0), (char) (KeyEvent.getMaxKeyCode() >> 16), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), 39570797, false, $$c(b8, (byte) ((-1) - (((-1) - b8) & ((-1) - 6))), (byte) (-1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    protected abstract T c(short s2, int i2, byte[] bArr);

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    @Override // o.cr.d
    public final /* synthetic */ o.ff.a e(a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22661e + 65;
        f22660d = i3 % 128;
        int i4 = i3 % 2;
        d dVarD = d(aVar);
        int i5 = f22661e + 13;
        f22660d = i5 % 128;
        int i6 = i5 % 2;
        return dVarD;
    }
}
