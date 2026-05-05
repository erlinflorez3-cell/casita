package o.dg;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import o.a.h;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f22960d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22961f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f22962g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char[] f22963h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22964i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22965j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f22966n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22967a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f22969c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22968b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22970e = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, int r9, byte r10) {
        /*
            int r0 = r8 + 102
            int r1 = r10 * 4
            int r8 = r1 + 4
            byte[] r7 = o.dg.b.$$a
            int r6 = r9 * 3
            int r1 = r6 + 1
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r7 != 0) goto L2a
            r3 = r4
            r2 = r6
        L13:
            int r0 = -r0
            int r8 = r8 + 1
            int r0 = r0 + r2
            r2 = r3
        L18:
            byte r1 = (byte) r0
            r5[r2] = r1
            int r3 = r2 + 1
            if (r2 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r1 = r7[r8]
            r2 = r0
            r0 = r1
            goto L13
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dg.b.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22965j = 0;
        f22966n = 1;
        f22964i = 0;
        f22961f = 1;
        j();
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getKeyRepeatTimeout();
        f22960d = new b();
        int i2 = f22966n + 63;
        f22965j = i2 % 128;
        int i3 = i2 % 2;
    }

    private b() {
    }

    public static synchronized b e() {
        b bVar;
        int i2 = 2 % 2;
        int i3 = f22961f;
        int i4 = i3 + 7;
        f22964i = i4 % 128;
        int i5 = i4 % 2;
        bVar = f22960d;
        int i6 = i3 + 25;
        f22964i = i6 % 128;
        int i7 = i6 % 2;
        return bVar;
    }

    static void init$0() {
        $$a = new byte[]{60, -17, 3, Ascii.NAK};
        $$b = 31;
    }

    static void j() {
        f22963h = new char[]{64630, 64608, 64611, 64543, 64520, 64590, 64576, 64598, 64619, 64629, 64588, 64586, 64579, 64584, 64593, 64587, 64625, 64599, 64612, 64578, 64589, 64594, 64618, 64592, 64614, 64620, 64580, 64585, 64577, 64617, 64583, 64517, 64631, 64582, 64595, 64596};
        f22962g = (char) 51641;
    }

    private static void k(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $10 + 55;
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i8 = i6 + 61;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f22963h;
        int i9 = 421932776;
        int i10 = 1;
        if (cArr2 != null) {
            int i11 = $11 + 61;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    Object objA = o.d.d.a(i9);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(Color.argb(0, 0, 0, 0) + 270, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 11, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i13++;
                    i9 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f22962g)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = '\b';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(269 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (AndroidCharacter.getMirror('0') - '0'), 11 - (ViewConfiguration.getScrollBarSize() >> 8), -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i10];
                if (hVar.f19927c == hVar.f19925a) {
                    int i14 = $11 + 91;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i10] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i10] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        objA3 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 826, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 11, -611683395, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 41))), b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            c2 = '\b';
                            objA4 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + JfifUtil.MARKER_SOS, (char) Color.red(0), AndroidCharacter.getMirror('0') - '%', 212688716, false, $$c((byte) ($$b >>> 2), b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i16 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i16];
                    } else {
                        c2 = '\b';
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i17 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i18 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i17];
                            cArr4[hVar.f19926b + 1] = cArr2[i18];
                        } else {
                            int i19 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i20 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i19];
                            i10 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i20];
                        }
                    }
                    i10 = 1;
                }
                hVar.f19926b += 2;
            }
        }
        for (int i21 = 0; i21 < i2; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    final boolean a() throws Throwable {
        boolean z2;
        this.f22967a = true;
        synchronized (this.f22968b) {
            if (!this.f22970e) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    k(19 - View.combineMeasuredStates(0, 0), "\u0011\f\u001b\u000e\b\u0019 \u000f\u000b\u0006\u000e\u0003\u001d\t\u0017\u001b\t#㘍", (byte) (ExpandableListView.getPackedPositionGroup(0L) + 28), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    k(TextUtils.indexOf((CharSequence) "", '0') + 88, "!\u0018\t#\u0004\u0017\u0010\u0011\u000e\u001d\r\t\u001b \u0010\b\t\u0011\u0002\f\u001d\u000e\r \u0001\"\t\u0006 \u0019\u0014\u0011\u0012\b\u0010\u000f\t\" \u0014\u000b\u0006\r!\u000b\b#\r\u000b\u001e\u0016\u000b\f\u000b\u0019\"\u0001!\u0011\t\r !\u0018\t#\u0004\u000b\r\u0015 \r\u000e\u001d\r\t\u001b \u0010\b\t\u0011\u001e\r\u001d\t㘵", (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 72), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                return true;
            }
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                k((ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, "\u0011\f\u001b\u000e\b\u0019 \u000f\u000b\u0006\u000e\u0003\u001d\t\u0017\u001b\t#㘍", (byte) (View.combineMeasuredStates(0, 0) + 28), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k(83 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "!\u0018\t#\u0004\u0017\u0010\u0011\u000e\u001d\r\t\u001b \u0010\b\t\u0011\u0002\f\u001d\u000e\r \u0001\"\u0015\f \u0019\u0014\u0011\u0012\b\u0010\u000f\t\" \u0014\u000b\u0006\r!\u000b\b#\r\u000b\u001e\u0016\u000b\f\u000b\u0019\"\u0001!!\u0018\t#\u0004\u000b\r\u0015 \r\u000e\u001d\r\t\u001b \u0010\b\t\u0011\u001e\r\u001d\t㙄", (byte) (87 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr4);
                f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            this.f22970e = false;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f22969c = countDownLatch;
            try {
                countDownLatch.await();
                synchronized (this.f22968b) {
                    z2 = this.f22967a;
                }
                return z2;
            } catch (InterruptedException e2) {
                if (f.a()) {
                    Object[] objArr5 = new Object[1];
                    k(18 - TextUtils.lastIndexOf("", '0'), "\u0011\f\u001b\u000e\b\u0019 \u000f\u000b\u0006\u000e\u0003\u001d\t\u0017\u001b\t#㘍", (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27), objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    k(23 - (ViewConfiguration.getEdgeSlop() >> 16), "!\u0018\t#\u0004\u0017\u0010\u0011\u000e\u001d\r\t\u001b \u0010\b\t\u0011\u0002\f\u001d\u000e㙀", (byte) (82 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr6);
                    f.e(strIntern3, ((String) objArr6[0]).intern(), e2);
                }
                return false;
            }
        }
    }

    final void b() {
        synchronized (this.f22968b) {
            if (this.f22969c != null) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    k((ViewConfiguration.getScrollBarSize() >> 8) + 19, "\u0011\f\u001b\u000e\b\u0019 \u000f\u000b\u0006\u000e\u0003\u001d\t\u0017\u001b\t#㘍", (byte) (KeyEvent.getDeadChar(0, 0) + 28), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    k(57 - (ViewConfiguration.getLongPressTimeout() >> 16), "\f\u000b\u0018\t\u0019\b\n\u0012\u0010\u0011\u000e\u001d\r\t\u001b \u0010\b\t\u0011\u0003\r\u0019\"\u0001\"\f\u000b\u0018\t\u0019\b\u0007\u001e\u000f\u0018\t\u0017#\u0007\r!\u000f\f\u001b\u000e\b\u0019 \u000f\u000b\u0006\r!\t\f㙞", (byte) (AndroidCharacter.getMirror('0') + '0'), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                this.f22967a = false;
                this.f22969c.countDown();
                this.f22969c = null;
            }
        }
    }

    final void b(boolean z2) {
        synchronized (this.f22968b) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                k(View.resolveSizeAndState(0, 0, 0) + 19, "\u0011\f\u001b\u000e\b\u0019 \u000f\u000b\u0006\u000e\u0003\u001d\t\u0017\u001b\t#㘍", (byte) (View.getDefaultSize(0, 0) + 28), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                k(60 - View.resolveSize(0, 0), "\b\u0007\r\u001a\u0006\u0013\u0014\u0011\u0012\b\u0010\u000f\t\" \u0014\u000b\u0006\u000e!\u000b\u001e\u0016\u000b\f\u000b\u001a\u0004\u0011\u0017\u000b\u000f\n\u001e\u000b\u0006\u0013\u000b\u0011\f\u001b\u000e\b\u0019 \u000f\u000b\u0006\r!\u0001\" \u001c\u001d\u0015\u0007\u001e\u0001!", (byte) (TextUtils.getOffsetAfter("", 0) + 96), objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(z2).toString());
            }
            this.f22970e = z2;
        }
    }

    public final void c() {
        synchronized (this.f22968b) {
            this.f22970e = false;
            if (this.f22969c != null) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    k(KeyEvent.getDeadChar(0, 0) + 19, "\u0011\f\u001b\u000e\b\u0019 \u000f\u000b\u0006\u000e\u0003\u001d\t\u0017\u001b\t#㘍", (byte) (28 - Gravity.getAbsoluteGravity(0, 0)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    k(65 - TextUtils.indexOf("", "", 0, 0), "\f\u000b\u0018\t\u0019\b\n\u0012\f\u0015\u0014\u0011\u0012\b\u0010\u000f\t\" \u0014\u000b\u0006\u0015\u000f\u000b\f\u0011\u0006\f\u000e\n\u0018\"\u0001#\r\t\u0018\b\u0018\b\u0007\u001e\r\u001d\t\u0013!\t\u0011 \u0019\u0014\u0011\u0012\b\u0010\u000f\t\" \u0014\u000b\u0006㙛", (byte) ((Process.myTid() >> 22) + 103), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                this.f22967a = true;
                this.f22969c.countDown();
                this.f22969c = null;
            }
        }
    }

    public final void d() {
        synchronized (this.f22968b) {
            this.f22970e = false;
            if (this.f22969c != null) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    k(19 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0011\f\u001b\u000e\b\u0019 \u000f\u000b\u0006\u000e\u0003\u001d\t\u0017\u001b\t#㘍", (byte) (27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    k(View.MeasureSpec.getSize(0) + 63, "\f\u000b\u0018\t\u0019\b\n\u0012\u0010\u0011\u000e\u001d\r\t\u001b \u0010\b\t\u0011\u0019\u001b\u0015\u0003\t\u0018\"\u0001#\r\t\u0018\b\u0018\b\u0007\u001e\r\u001d\t\u0013!\t\u0011 \r\u000e\u001d\r\t\u001b \u0010\b\t\u0011 \"\u001b\u000e\u001e\t㙉", (byte) (Gravity.getAbsoluteGravity(0, 0) + 83), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                this.f22967a = false;
                this.f22969c.countDown();
                this.f22969c = null;
            }
        }
    }
}
