package o.de;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.work.BackoffPolicy;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.o;
import o.dd.g;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f22914a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f22915b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22916c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22917d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22918e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22919f = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, int r10) {
        /*
            int r8 = 105 - r8
            int r0 = r10 * 4
            int r7 = 1 - r0
            byte[] r6 = o.de.c.$$a
            int r0 = r9 * 3
            int r0 = 3 - r0
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L29
            r1 = r0
            r3 = r4
        L13:
            int r0 = -r0
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L17:
            int r1 = r0 + 1
            int r3 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r3 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r6[r1]
            goto L13
        L29:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.de.c.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22916c = 0;
        f22919f = 1;
        f22917d = 0;
        f22918e = 1;
        d();
        ViewConfiguration.getTouchSlop();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.indexOf("", "");
        int i2 = f22916c + 123;
        f22919f = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void d() {
        f22914a = new char[]{38076, 48146, 50590, 60722, 13999, 24149, 26618, 36734, 53502, 63879, 285, 10884, 29234, 39875, 41793, 62695, 7271, 9706, 20101};
        f22915b = -3273699023491318659L;
    }

    private static void g(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 105;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22914a[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(742 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Color.argb(0, 0, 0, 0), Color.green(0) + 12, 632508977, false, $$c((byte) (-$$a[1]), b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f22915b), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    int pressedStateDuration = 766 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    char packedPositionChild = (char) (12469 - ExpandableListView.getPackedPositionChild(0L));
                    int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11;
                    byte b3 = (byte) ($$b & 7);
                    byte b4 = (byte) (b3 - 5);
                    objA2 = o.d.d.a(pressedStateDuration, packedPositionChild, i8, 1946853218, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + 387, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), View.combineMeasuredStates(0, 0) + 18, 39570797, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
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
        while (oVar.f19947b < i3) {
            int i9 = $10 + 89;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objA4 = o.d.d.a(386 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 18 - (ViewConfiguration.getLongPressTimeout() >> 16), 39570797, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i11 = $11 + 25;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    static void init$0() {
        $$a = new byte[]{82, -6, -97, -22};
        $$b = 125;
    }

    @Override // o.de.d
    public final int a() {
        int i2 = 2 % 2;
        int i3 = f22917d;
        int i4 = i3 + 57;
        f22918e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 11;
        f22918e = i6 % 128;
        int i7 = i6 % 2;
        return 120;
    }

    @Override // o.de.d
    public final String b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22918e + 67;
        f22917d = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        g((char) (Process.myTid() >> 22), AndroidCharacter.getMirror('0') - '0', 19 - Color.red(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f22917d + 63;
        f22918e = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    @Override // o.de.d
    public final BackoffPolicy c() {
        int i2 = 2 % 2;
        int i3 = f22917d + 7;
        f22918e = i3 % 128;
        int i4 = i3 % 2;
        BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
        if (i4 != 0) {
            return backoffPolicy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.de.d
    public final boolean c(g gVar) {
        int i2 = 2 % 2;
        int i3 = f22917d + 1;
        f22918e = i3 % 128;
        if (i3 % 2 == 0) {
            g gVar2 = g.f22869n;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (gVar == g.f22869n) {
            int i4 = f22917d + 75;
            f22918e = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = f22917d + 25;
        f22918e = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // o.de.d
    public final g d(o.bg.c cVar) {
        int i2 = 2 % 2;
        o.bg.c.f21082a = 1232037242 * o.bg.c.f21082a;
        int iMyUid = Process.myUid();
        o.bg.c.f21083c = 1942342535 * o.bg.c.f21083c;
        if (!((Boolean) o.bg.c.a(r4, r5, iMyUid, -1017985026, new Object[]{cVar}, 1017985027, new Random().nextInt())).booleanValue()) {
            int i3 = f22917d + 91;
            f22918e = i3 % 128;
            int i4 = i3 % 2;
            if (cVar.c() == o.bg.a.f21038g) {
                int i5 = f22917d + 81;
                f22918e = i5 % 128;
                if (i5 % 2 == 0) {
                    g gVar = g.f22867l;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                g gVar2 = g.f22867l;
                int i6 = f22918e + 85;
                f22917d = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 41 / 0;
                }
                return gVar2;
            }
        }
        return g.f22869n;
    }

    @Override // o.de.d
    public final int e(int i2) {
        int i3 = 2 % 2;
        int i4 = f22918e + 41;
        f22917d = i4 % 128;
        int i5 = i4 % 2;
        int iPow = ((int) Math.pow(2.0d, i2 - 1)) * 120;
        int i6 = f22917d + 19;
        f22918e = i6 % 128;
        if (i6 % 2 != 0) {
            return iPow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.de.d
    public final boolean e(o.bg.c cVar, o.dd.c cVar2) {
        int i2 = 2 % 2;
        int i3 = 1232037242 * o.bg.c.f21082a;
        o.bg.c.f21082a = i3;
        int iMyUid = Process.myUid();
        int i4 = 1942342535 * o.bg.c.f21083c;
        o.bg.c.f21083c = i4;
        if (((Boolean) o.bg.c.a(i3, i4, iMyUid, -1017985026, new Object[]{cVar}, 1017985027, new Random().nextInt())).booleanValue() || cVar.c() == o.bg.a.f21050s) {
            int i5 = f22917d + 47;
            f22918e = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = f22918e + 107;
        int i8 = i7 % 128;
        f22917d = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 25;
        f22918e = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 50 / 0;
        }
        return true;
    }
}
