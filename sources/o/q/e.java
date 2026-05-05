package o.q;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import o.a.n;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26728a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26729b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26730c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26731d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26732e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, byte r10) {
        /*
            byte[] r7 = o.q.e.$$a
            int r6 = r9 + 4
            int r5 = r10 * 2
            int r1 = r5 + 1
            int r0 = r8 * 2
            int r4 = 115 - r0
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r7 != 0) goto L28
            r1 = r4
            r4 = r5
            r0 = r2
        L14:
            int r4 = r4 + r1
            r1 = r0
        L16:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r6 = r6 + 1
            int r0 = r1 + 1
            if (r1 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r1 = r7[r6]
            goto L14
        L28:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.e.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26728a = 0;
        f26729b = 1;
        f26732e = 0;
        f26731d = 1;
        e();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        Color.blue(0);
        int i2 = f26728a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f26729b = i2 % 128;
        int i3 = i2 % 2;
    }

    static void e() {
        f26730c = -1270219385;
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i6 = $11 + 15;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f26730c)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(270 - KeyEvent.normalizeMetaState(0), (char) View.combineMeasuredStates(0, 0), Process.getGidForName("") + 12, -2071844881, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (-b4);
                    objA2 = o.d.d.a((Process.myPid() >> 22) + 522, (char) ExpandableListView.getPackedPositionType(0L), 12 - View.resolveSizeAndState(0, 0, 0), 627984172, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            int i9 = $10 + 45;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            int i11 = $11 + 101;
            while (true) {
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (nVar.f19944a >= i2) {
                    break;
                }
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (-b6);
                    objA3 = o.d.d.a(522 - TextUtils.getCapsMode("", 0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Color.green(0) + 12, 627984172, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                i11 = $11 + 47;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{83, -90, 91, 36};
        $$b = 86;
    }

    @Override // o.q.a
    public final void a(o.ef.a aVar) {
        int i2 = 2 % 2;
        int i3 = f26732e + 9;
        f26731d = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.q.a
    public final String c() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f26732e + 101;
        f26731d = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            f(11 % TextUtils.getCapsMode("", 0, 0), "￼\u000f￼\u0012￼\u0007\u0007\u0000\u000f￨￼\t￼\u0002\u0000\b\u0000\t\u000f\ufff0\u000e￼\u0002\u0000\uffdf", true, 18711 >>> (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)) * 2, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            f(25 - TextUtils.getCapsMode("", 0, 0), "￼\u000f￼\u0012￼\u0007\u0007\u0000\u000f￨￼\t￼\u0002\u0000\b\u0000\t\u000f\ufff0\u000e￼\u0002\u0000\uffdf", false, 258 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f26731d + 23;
        f26732e = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return strIntern;
    }

    @Override // o.q.a
    public final o.ef.a d() {
        int i2 = 2 % 2;
        int i3 = f26731d;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f26732e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 83;
        f26732e = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // o.q.a
    public final void e(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26732e + 83;
        f26731d = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f26732e;
        int i4 = i3 + 31;
        f26731d = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = obj instanceof e;
        int i6 = i3 + 107;
        f26731d = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
