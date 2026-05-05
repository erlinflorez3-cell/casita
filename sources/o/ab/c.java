package o.ab;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.f;
import o.ab.e;
import o.by.g;
import o.dc.b;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c<C extends e<?>> implements Runnable {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f20077a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f20078e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f20079f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char[] f20080g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f20081h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f20082i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f20083j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f20084k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20085l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20086n = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f20087b = new o.ea.e(Looper.myLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C f20089d;

    /* JADX INFO: renamed from: o.ab.c$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f20090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f20091d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f20092e = 0;

        static {
            int[] iArr = new int[b.d.values().length];
            f20090c = iArr;
            try {
                iArr[b.d.f22767b.ordinal()] = 1;
                int i2 = f20092e + 95;
                f20091d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20090c[b.d.f22766a.ordinal()] = 2;
                int i5 = f20092e;
                int i6 = (i5 ^ 43) + (((i5 + 43) - (i5 | 43)) << 1);
                f20091d = i6 % 128;
                int i7 = i6 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r9, int r10, byte r11) {
        /*
            int r0 = r10 * 3
            int r8 = r0 + 1
            byte[] r7 = o.ab.c.$$c
            int r0 = r11 * 2
            int r6 = 4 - r0
            int r0 = r9 * 6
            int r0 = r0 + 67
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L2a
            r0 = r8
            r1 = r6
            r3 = r4
        L16:
            int r6 = r6 + r0
            int r1 = r1 + 1
            r2 = r3
        L1a:
            int r3 = r2 + 1
            byte r0 = (byte) r6
            r5[r2] = r0
            if (r3 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r7[r1]
            goto L16
        L2a:
            r2 = r4
            r1 = r6
            r6 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ab.c.$$g(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20078e = 346016079;
        f20077a = -1540051535;
        f20086n = 0;
        f20085l = 1;
        f20083j = 0;
        f20084k = 1;
        n();
        MotionEvent.axisFromString("");
        int i2 = f20085l + 77;
        f20086n = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
    }

    public c(C c2, boolean z2) {
        this.f20089d = c2;
        this.f20088c = z2;
    }

    private static void C(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object obj = null;
        Object bytes = str4;
        if (str4 != null) {
            int i4 = $10 + 11;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str4.getBytes("ISO-8859-1");
                obj.hashCode();
                throw null;
            }
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f20080g;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(593 - Color.alpha(0), (char) (13181 - View.resolveSizeAndState(0, 0, 0)), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1225586509, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f20082i)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (!f20079f) {
            if (!f20081h) {
                fVar.f19923e = iArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr4[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    fVar.f19922a++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i6 = $10 + 47;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    int iAlpha = 458 - Color.alpha(0);
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iAlpha2 = Color.alpha(0) + 11;
                    byte b4 = (byte) ((-1) - (((-1) - $$f) | ((-1) - 3)));
                    byte b5 = (byte) (b4 - 1);
                    objA3 = o.d.d.a(iAlpha, maximumDrawingCacheSize, iAlpha2, -1923924106, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i8 = $11 + 11;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        fVar.f19923e = bArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i10 = $10 + 93;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) >> fVar.f19922a] + i2] % iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    int scrollBarFadeDuration = 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b6 = (byte) ((-1) - (((-1) - $$f) | ((-1) - 3)));
                    byte b7 = (byte) (b6 - 1);
                    objA4 = o.d.d.a(458 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), scrollBarFadeDuration, -1923924106, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    int iAlpha3 = Color.alpha(0) + 458;
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iMyPid = 11 - (Process.myPid() >> 22);
                    byte b8 = (byte) ((-1) - (((-1) - $$f) | ((-1) - 3)));
                    byte b9 = (byte) (b8 - 1);
                    objA5 = o.d.d.a(iAlpha3, scrollDefaultDelay, iMyPid, -1923924106, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i5;
        int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
        int i11 = ~((-1) - (((-1) - i8) & ((-1) - i4)));
        int i12 = (i11 + i10) - (i11 & i10);
        int i13 = ~((-1) - (((-1) - i9) & ((-1) - i2)));
        int i14 = ~i4;
        int i15 = (~((-1) - (((-1) - ((i14 + i8) - (i14 & i8))) & ((-1) - i5)))) | i13;
        int i16 = i2 + i5 + i7 + (531708263 * i3) + ((-608630064) * i6);
        int i17 = i16 * i16;
        int i18 = (i2 * (-228234701)) + 730857472 + ((-228234701) * i5) + (i10 * (-1010133554)) + (i12 * (-1010133554)) + ((-1010133554) * i15) + ((-1238368256) * i7) + ((-45088768) * i3) + ((-419430400) * i6) + ((-1471938560) * i17);
        int i19 = ((i2 * (-1679524527)) - 150938974) + (i5 * (-1679524527)) + (i10 * 282) + (i12 * 282) + (i15 * 282) + (i7 * (-1679524245)) + (i3 * (-166744051)) + (i6 * 2062148848) + (i17 * (-865337344));
        return i18 + ((i19 * i19) * (-1617166336)) != 1 ? e(objArr) : d(objArr);
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f20084k;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f20083j = i4 % 128;
        int i5 = i4 % 2;
        C c2 = cVar.f20089d;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 49;
        f20083j = i6 % 128;
        int i7 = i6 % 2;
        return c2;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f20084k + 35;
        f20083j = i3 % 128;
        if (i3 % 2 == 0) {
            o.dc.d.a().b(cVar.h(), cVar.f(), cVar.i());
            return null;
        }
        o.dc.d.a().b(cVar.h(), cVar.f(), cVar.i());
        throw null;
    }

    static void init$0() {
        $$c = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$f = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = {f()};
        int i3 = 1232037242 * o.bg.c.f21082a;
        o.bg.c.f21082a = i3;
        int iMyUid = Process.myUid();
        int i4 = 1942342535 * o.bg.c.f21083c;
        o.bg.c.f21083c = i4;
        if (((Boolean) o.bg.c.a(i3, i4, iMyUid, -1017985026, objArr, 1017985027, new Random().nextInt())).booleanValue()) {
            if (o.ea.f.a()) {
                String strD = d();
                Object[] objArr2 = new Object[1];
                C(127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, "\u0096\u0096\u0087\u008e\u008e\u0082\u0096\u0088\u0089\u0088\u008f\u008e\u0084\u0085\u0086\u0086\u0084\u0098\u0097\u008e\u0094\u0084\u0093\u0096\u0095\u008a\u0088\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr2);
                o.ea.f.c(strD, ((String) objArr2[0]).intern());
            }
            c(f());
            return;
        }
        int i5 = f20083j + 59;
        f20084k = i5 % 128;
        int i6 = i5 % 2;
        if (o.ea.f.a()) {
            String strD2 = d();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            C(127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, null, "\u0088\u009a\u0088\u0087\u0091\u0082\u0086\u0095\u0084\u0099\u0088\u0089\u0088\u008f\u008e\u0084\u0085\u0086\u0086\u0084\u0098\u0097\u008e\u0094\u0084\u0093\u0096\u0095\u008a\u0088\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr3);
            o.ea.f.c(strD2, sb.append(((String) objArr3[0]).intern()).append(f().c()).toString());
        }
        b(f());
        int i7 = f20084k + 55;
        f20083j = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 6 / 0;
        }
    }

    static void n() {
        f20080g = new char[]{2323, 2558, 2551, 2306, 2307, 2313, 2318, 2373, 2358, 2305, 2548, 2346, 2339, 2304, 2312, 2316, 2547, 2550, 2549, 2545, 2314, 2544, 2317, 2336, 2319, 2363, 2546, 2368, 2321};
        f20082i = 2040400229;
        f20081h = true;
        f20079f = true;
    }

    protected final void a() {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int iMyUid = Process.myUid();
        int i2 = (-1030821920) * f20077a;
        f20077a = i2;
        c(1916818744, i2, elapsedCpuTime, -1916818744, new Object[]{this}, Thread.currentThread().getPriority(), iMyUid);
    }

    protected abstract void b(o.bg.c cVar);

    protected final boolean b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20084k + 57;
        f20083j = i3 % 128;
        try {
            (i3 % 2 != 0 ? o.dc.d.a() : o.dc.d.a()).d();
            return true;
        } catch (o.dc.b e2) {
            if (o.ea.f.a()) {
                String strD = d();
                Object[] objArr = new Object[1];
                C(127 - (ViewConfiguration.getTapTimeout() >> 16), null, null, "\u0083\u0087\u008a\u008a\u0095\u0085\u0091\u008b\u0099\u0088\u0096\u0095\u0088\u0094\u0096\u0087\u0082\u009b\u0087\u0091\u0088\u0094\u0083\u0087\u0092\u0087\u0090\u0084\u0083\u0084\u0092\u0088\u0087\u0094\u008b\u0092\u0087\u0091\u0088\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
                o.ea.f.e(strD, ((String) objArr[0]).intern(), e2);
            }
            int i4 = AnonymousClass4.f20090c[e2.c().ordinal()];
            if (i4 == 1) {
                f().d(o.bg.a.f21049r);
            } else if (i4 == 2) {
                f().d(o.bg.a.f21051t);
            }
            return false;
        }
    }

    public void c() {
        int i2 = 2 % 2;
        int i3 = f20084k + 21;
        f20083j = i3 % 128;
        int i4 = i3 % 2;
    }

    protected abstract void c(o.bg.c cVar);

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public String d() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int id = (int) Thread.currentThread().getId();
        int i3 = f20078e * (-1702348494);
        f20078e = i3;
        StringBuilder sbAppend = sb.append(((e) c(1416314057, new Random().nextInt(), id, -1416314056, new Object[]{this}, (int) Runtime.getRuntime().freeMemory(), i3)).e());
        Object[] objArr = new Object[1];
        C((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u008f\u0096\u0084\u009d\u009c", objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i4 = f20083j + 71;
        f20084k = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final C e() {
        int id = (int) Thread.currentThread().getId();
        int i2 = f20078e * (-1702348494);
        f20078e = i2;
        return (C) c(1416314057, new Random().nextInt(), id, -1416314056, new Object[]{this}, (int) Runtime.getRuntime().freeMemory(), i2);
    }

    public final o.bg.c f() {
        int i2 = 2 % 2;
        int i3 = f20084k + 73;
        f20083j = i3 % 128;
        int i4 = i3 % 2;
        int id = (int) Thread.currentThread().getId();
        int i5 = f20078e * (-1702348494);
        f20078e = i5;
        o.bg.c cVarD = ((e) c(1416314057, new Random().nextInt(), id, -1416314056, new Object[]{this}, (int) Runtime.getRuntime().freeMemory(), i5)).d();
        int i6 = f20083j + 55;
        f20084k = i6 % 128;
        if (i6 % 2 != 0) {
            return cVarD;
        }
        throw null;
    }

    protected abstract void g();

    public final Context h() {
        int i2 = 2 % 2;
        int i3 = f20083j + 7;
        f20084k = i3 % 128;
        int i4 = i3 % 2;
        int id = (int) Thread.currentThread().getId();
        int i5 = f20078e * (-1702348494);
        f20078e = i5;
        Object[] objArr = {(e) c(1416314057, new Random().nextInt(), id, -1416314056, new Object[]{this}, (int) Runtime.getRuntime().freeMemory(), i5)};
        int i6 = 516688844 * e.f20096d;
        e.f20096d = i6;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i7 = 899848972 * e.f20095c;
        e.f20095c = i7;
        int i8 = 1346498534 * e.f20094b;
        e.f20094b = i8;
        Context context = (Context) e.e(i6, objArr, i7, elapsedCpuTime, i8, -353890328, 353890328);
        int i9 = f20083j + 5;
        f20084k = i9 % 128;
        if (i9 % 2 != 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final g i() {
        int i2 = 2 % 2;
        int i3 = f20083j + 99;
        f20084k = i3 % 128;
        int i4 = i3 % 2;
        int id = (int) Thread.currentThread().getId();
        int i5 = f20078e * (-1702348494);
        f20078e = i5;
        g gVarJ = ((e) c(1416314057, new Random().nextInt(), id, -1416314056, new Object[]{this}, (int) Runtime.getRuntime().freeMemory(), i5)).j();
        int i6 = f20084k + 61;
        f20083j = i6 % 128;
        if (i6 % 2 == 0) {
            return gVarJ;
        }
        throw null;
    }

    public final o.en.b j() {
        int i2 = 2 % 2;
        int i3 = f20084k + 105;
        f20083j = i3 % 128;
        int i4 = i3 % 2;
        int id = (int) Thread.currentThread().getId();
        int i5 = f20078e * (-1702348494);
        f20078e = i5;
        o.en.b bVarH = ((e) c(1416314057, new Random().nextInt(), id, -1416314056, new Object[]{this}, (int) Runtime.getRuntime().freeMemory(), i5)).h();
        int i6 = f20083j + 101;
        f20084k = i6 % 128;
        int i7 = i6 % 2;
        return bVarH;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strD;
        Object obj;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f20083j + 15;
            f20084k = i3 % 128;
            int i4 = i3 % 2;
            String strVd = hg.Vd("ޭޥޣޫްޮެުޟާޜޤޢޠޝޝޛޙޗޕޓޑސގތ", (short) (ZN.Xd() ^ 987), (short) (ZN.Xd() ^ 22201));
            if (i4 == 0) {
                strD = d();
                Object[] objArr = new Object[1];
                C(82 / TextUtils.getOffsetAfter("", 1), null, null, strVd, objArr);
                obj = objArr[0];
            } else {
                strD = d();
                Object[] objArr2 = new Object[1];
                C(127 - TextUtils.getOffsetAfter("", 0), null, null, strVd, objArr2);
                obj = objArr2[0];
            }
            o.ea.f.c(strD, ((String) obj).intern());
        }
        if (this.f20088c) {
            int i5 = f20084k + 37;
            f20083j = i5 % 128;
            int i6 = i5 % 2;
            if (!b()) {
                return;
            }
        }
        c();
        try {
            g();
        } catch (Exception e2) {
            if (o.ea.f.a()) {
                String strD2 = d();
                Object[] objArr3 = new Object[1];
                C((ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, null, C1561oA.ud("ҢқҠҟҔҔҔҒғҋ҉ґҖҔҒҐ҅ҍ҂Ҋ҈҆҃҃ҁѿѽѻѹѷѶѴѲ", (short) (C1499aX.Xd() ^ (-2926))), objArr3);
                o.ea.f.e(strD2, ((String) objArr3[0]).intern(), e2);
            }
            f().d(o.bg.a.f21053v);
            int i7 = f20084k + 49;
            f20083j = i7 % 128;
            int i8 = i7 % 2;
        }
        if (this.f20088c) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int iMyUid = Process.myUid();
            int i9 = f20077a * (-1030821920);
            f20077a = i9;
            c(1916818744, i9, elapsedCpuTime, -1916818744, new Object[]{this}, Thread.currentThread().getPriority(), iMyUid);
        }
        if (o.ea.f.a()) {
            String strD3 = d();
            Object[] objArr4 = new Object[1];
            C(128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, C1561oA.yd("ڦڢڮڠڦڲڰڨڢڛڕړکڟڟڝڳڱگڭڳڲڰڮ", (short) (C1580rY.Xd() ^ (-25270))), objArr4);
            o.ea.f.c(strD3, ((String) objArr4[0]).intern());
        }
        Handler handler = this.f20087b;
        Object[] objArr5 = {new Runnable() { // from class: o.ab.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.k();
            }
        }};
        Method method = Class.forName(C1561oA.Yd("Zh_nlgc.pu1Lftktn|", (short) (C1580rY.Xd() ^ (-31706)))).getMethod(Jg.Wd("\u000e5Jc", (short) (FB.Xd() ^ 6912), (short) (FB.Xd() ^ 28249)), Class.forName(Xg.qd("'\u001f5!n.$2,s\u0019=78,.93", (short) (Od.Xd() ^ (-7278)), (short) (Od.Xd() ^ (-20910)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr5);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
