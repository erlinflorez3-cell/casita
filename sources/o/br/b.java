package o.br;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f21564a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21565c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f21566d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21567e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21568g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21569j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21570b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            int r0 = r7 * 4
            int r7 = 4 - r0
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r5 = o.br.b.$$a
            int r0 = 105 - r8
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L28
            r0 = r6
            r2 = r7
            r1 = r3
        L14:
            int r0 = -r0
            int r7 = r7 + r0
            int r2 = r2 + 1
        L18:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            int r1 = r1 + 1
            r0 = r5[r2]
            goto L14
        L28:
            r1 = r3
            r2 = r7
            r7 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.br.b.$$c(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21568g = 0;
        f21569j = 1;
        f21567e = 0;
        f21565c = 1;
        j();
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.lastIndexOf("", '0', 0);
        View.MeasureSpec.getMode(0);
        Process.getGidForName("");
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.lastIndexOf("", '0', 0);
        int i2 = f21568g + 107;
        f21569j = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(Context context) {
        this.f21570b = context;
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i5 = $10 + 83;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (oVar.f19947b < i3) {
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21566d[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 742, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-16777204) - Color.rgb(0, 0, 0), 632508977, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 6)))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f21564a), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 765, (char) (KeyEvent.normalizeMetaState(0) + 12470), 12 - Color.red(0), 1946853218, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(388 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 39570797, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i8 = $10 + 13;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 3 / 5;
                }
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
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(388 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, 39570797, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i10 = $10 + 13;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{119, -27, 45, 98};
        $$b = 66;
    }

    static void j() {
        f21566d = new char[]{41427, 23423, 21720, 19976, 19335, 17645, 32341, 31679, 29983, 28260, 27588, 25966, 7841, 6149, 5474, 3784, 2085, 1418, 16106, 14420, 13730, 12058, 10371, 9703, 57210, 55477, 53775, 53099, 51415, 49727, 65425, 63715, 9540, 57293, 53302, 51860, 53048, 49223, 64233, 65285, 61861, 60119, 61230, 57852, 39438, 40107, 37336, 35448, 35985, 33070, 47708, 48364, 45321, 43949, 44035, 41296, 23550, 701, 63540, 63439, 60781, 59585, 59326, 56592, 55548, 54876, 52526, 51415, 50701, 48628, 47953, 46648, 44429, 43897, 42729, 40376, 39704};
        f21564a = 4217655225577008751L;
    }

    @Override // o.br.c
    public final String a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21567e + 37;
        f21565c = i3 % 128;
        int i4 = i3 % 2;
        o.ea.c.a();
        Context context = this.f21570b;
        Object[] objArr = new Object[1];
        f((char) (View.resolveSize(0, 0) + 45520), 32 - Color.blue(0), 24 - TextUtils.lastIndexOf("", '0'), objArr);
        String strB = o.ea.b.b(context, ((String) objArr[0]).intern());
        int i5 = f21567e + 91;
        f21565c = i5 % 128;
        if (i5 % 2 != 0) {
            return strB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.br.c
    public final String b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21565c + 103;
        f21567e = i3 % 128;
        int i4 = i3 % 2;
        o.ea.c.a();
        Context context = this.f21570b;
        Object[] objArr = new Object[1];
        f((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 38441), 58 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 19 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        String strB = o.ea.b.b(context, ((String) objArr[0]).intern());
        if (strB != null && (!strB.isEmpty())) {
            return strB;
        }
        int i5 = f21565c + 37;
        f21567e = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // o.br.c
    public final o.bk.c c() {
        int i2 = 2 % 2;
        int i3 = f21565c;
        int i4 = i3 + 47;
        f21567e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 39;
        f21567e = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // o.br.c
    public final String d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21565c + 87;
        f21567e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f((char) (13664 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 32 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f21567e + 37;
        f21565c = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    @Override // o.br.c
    public final void d(Context context) {
        int i2 = 2 % 2;
        int i3 = f21565c + 39;
        f21567e = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.br.c
    public final o.bk.a e() {
        int i2 = 2 % 2;
        int i3 = f21567e;
        int i4 = i3 + 71;
        f21565c = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = i3 + 9;
        f21565c = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }
}
