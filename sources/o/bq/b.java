package o.bq;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.q;
import o.d.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21531a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21532b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21533c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f21534d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21535e = 0;

    private static String $$c(byte b2, byte b3, int i2) {
        int i3 = 78 - (i2 * 7);
        byte[] bArr = $$a;
        int i4 = 4 - (b3 * 4);
        int i5 = b2 * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
            i4++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            int i8 = i4;
            i3 += bArr[i4];
            i4 = i8 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21532b = 0;
        f21531a = 1;
        f21533c = 0;
        f21535e = 1;
        d();
        Process.getThreadPriority(0);
        int i2 = f21532b + 43;
        f21531a = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d A[PHI: r4
  0x002d: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:8:0x0061, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bq.b.c(android.content.Context):boolean");
    }

    static void d() {
        f21534d = 4398491062431455835L;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 105;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        if (str2 != null) {
            int i7 = i5 + 49;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i8 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(730 - MotionEvent.axisFromString(""), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7932), (-16777205) - Color.rgb(0, 0, 0), 355847088, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f21534d ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(TextUtils.indexOf("", "") + 836, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27278), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2145994442, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = d.a(837 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (27279 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 11 - View.resolveSizeAndState(0, 0, 0), -2145994442, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{121, -71, 80, 66};
        $$b = 227;
    }
}
