package o.ey;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopErrorCode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.a.o;
import o.ap.a;
import o.d.d;
import o.ea.f;
import o.ea.h;
import o.ea.j;
import o.ef.b;
import o.es.c;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import yg.C1561oA;
import yg.FB;
import yg.Jg;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements o.es.a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;
    private static int B = 0;
    public static int C = 0;
    private static int D = 0;
    public static int E = 0;
    public static int F = 0;
    public static int G = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25588a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25589b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25590c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25591d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25592e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f25593f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25594g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f25595h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f25596i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f25597j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f25598k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f25599l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f25600m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f25601o = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static char[] f25602u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f25603v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static long f25604w = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f25605z = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private c.e f25607p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TapAndPayClient f25606n = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f25609r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f25611t = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f25610s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f25608q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List<a> f25612x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<o.es.e> f25613y = new ArrayList();

    interface a {
        void onDone();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r8, byte r9, short r10) {
        /*
            int r0 = r8 * 3
            int r8 = r0 + 1
            int r0 = 105 - r10
            int r1 = r9 * 2
            int r7 = 3 - r1
            byte[] r6 = o.ey.c.$$c
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r6 != 0) goto L29
            r3 = r8
            r2 = r4
        L13:
            int r0 = -r0
            int r0 = r0 + r3
        L15:
            int r7 = r7 + 1
            byte r1 = (byte) r0
            r5[r2] = r1
            int r2 = r2 + 1
            if (r2 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r1 = r6[r7]
            r3 = r0
            r0 = r1
            goto L13
        L29:
            r2 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.$$g(byte, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        G = 521405947;
        F = 1962678703;
        E = 1620371573;
        C = -1319342159;
        f25605z = -687505667;
        init$0();
        f25598k = -1313343518;
        f25601o = 1745635198;
        f25600m = 1639632239;
        f25599l = 277458665;
        f25596i = -1794007008;
        f25593f = -1874657371;
        f25594g = -2030395992;
        f25597j = 1351222117;
        f25595h = -1922095060;
        f25591d = -1544007069;
        f25592e = 171495463;
        f25590c = -233122993;
        f25589b = 1978423706;
        f25588a = -2047569505;
        D = 0;
        B = 1;
        f25603v = 0;
        A = 1;
        d();
        ViewConfiguration.getDoubleTapTimeout();
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getTapTimeout();
        SystemClock.elapsedRealtimeNanos();
        KeyEvent.keyCodeFromString("");
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        ViewConfiguration.getDoubleTapTimeout();
        ExpandableListView.getPackedPositionGroup(0L);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getMinimumFlingVelocity();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.getOffsetAfter("", 0);
        TextUtils.lastIndexOf("", '0', 0);
        KeyEvent.normalizeMetaState(0);
        AudioTrack.getMinVolume();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getPressedStateDuration();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ViewConfiguration.getScrollBarSize();
        AndroidCharacter.getMirror('0');
        SystemClock.currentThreadTimeMillis();
        int i2 = B + 25;
        D = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public c(Context context) throws Throwable {
        e(context);
    }

    private static void H(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f25602u[i2 + i5])};
                Object objA = d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 743, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 632508977, false, $$g(b2, b3, (byte) ((b3 + 6) - (6 & b3))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f25604w), Integer.valueOf(c2)};
                Object objA2 = d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a((ViewConfiguration.getEdgeSlop() >> 16) + 766, (char) (View.resolveSizeAndState(0, 0, 0) + 12470), Color.red(0) + 12, 1946853218, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = d.a(TextUtils.getTrimmedLength("") + 387, (char) Color.argb(0, 0, 0, 0), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 39570797, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 9;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = d.a(-723636472);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 387, (char) Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") + 18, 39570797, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i7 = 83 / 0;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr6 = {oVar, oVar};
                Object objA5 = d.a(-723636472);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = d.a(MotionEvent.axisFromString("") + 388, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 39570797, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i8 = $11 + 111;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void I(short r8, short r9, int r10, java.lang.Object[] r11) {
        /*
            int r3 = r8 * 4
            int r2 = 1 - r3
            byte[] r8 = o.ey.c.$$a
            int r0 = 101 - r9
            int r1 = r10 * 4
            int r7 = 4 - r1
            byte[] r6 = new byte[r2]
            r5 = 0
            int r4 = 0 - r3
            if (r8 != 0) goto L2f
            r3 = r4
            r1 = r7
            r2 = r5
        L16:
            int r7 = r7 + r3
            int r1 = r1 + 1
            r0 = r7
            r7 = r1
        L1b:
            byte r1 = (byte) r0
            r6[r2] = r1
            if (r2 != r4) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r11[r5] = r0
            return
        L28:
            r3 = r8[r7]
            int r2 = r2 + 1
            r1 = r7
            r7 = r0
            goto L16
        L2f:
            r2 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.I(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void J(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r0 = r8 + 1
            int r6 = 111 - r9
            byte[] r5 = o.ey.c.$$d
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r5 != 0) goto L28
            r0 = r7
            r2 = r3
        Lf:
            int r7 = r7 + 1
            int r0 = -r0
            int r6 = r6 + r0
            int r6 = r6 + (-2)
            r1 = r2
        L16:
            byte r0 = (byte) r6
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r10[r3] = r0
            return
        L25:
            r0 = r5[r7]
            goto Lf
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.J(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b9, code lost:
    
        if (r6 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c1, code lost:
    
        if (r6 != (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
    
        if (r11 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        r5 = r12 + 35;
        o.ey.c.A = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d0, code lost:
    
        if ((r5 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d2, code lost:
    
        H((char) android.view.View.combineMeasuredStates(0, 1), android.text.TextUtils.lastIndexOf("", 21, 0, 1) * 26157, 29 >> (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), new java.lang.Object[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f8, code lost:
    
        if ((!r11.hasExtra(((java.lang.String) r5[0]).intern())) == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fa, code lost:
    
        r5 = new java.lang.Object[1];
        H((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.lastIndexOf("", '0', 0) + 1096, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 21, r5);
        r20 = r11.getStringExtra(((java.lang.String) r5[0]).intern());
        r13 = new java.lang.Object[]{r10.s()};
        r9 = o.ep.c.f24438e * 574268897;
        o.ep.c.f24438e = r9;
        r10 = (int) java.lang.Thread.currentThread().getId();
        r15 = o.ep.c.f24436c * 1169734117;
        o.ep.c.f24436c = r15;
        r11 = o.ep.c.f24434a * (-2104816085);
        o.ep.c.f24434a = r11;
        r9 = r8.e(r7, r20, (java.lang.String) o.ep.c.c(r9, r10, r11, 1241915024, r13, -1241915024, r15), java.lang.Integer.valueOf(r18), o.es.d.f25311c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0168, code lost:
    
        if (o.ea.f.a() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x016a, code lost:
    
        r5 = new java.lang.Object[1];
        H((char) (32954 - android.view.View.getDefaultSize(0, 0)), 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), 19 - android.view.KeyEvent.normalizeMetaState(0), r5);
        r6 = ((java.lang.String) r5[0]).intern();
        r8 = new java.lang.StringBuilder();
        r0 = new java.lang.Object[1];
        H((char) (55929 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 1188 - android.text.TextUtils.lastIndexOf("", '0'), 39 - android.view.KeyEvent.normalizeMetaState(0), r0);
        o.ea.f.c(r6, r8.append(((java.lang.String) r0[0]).intern()).append(r9.c()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01ca, code lost:
    
        r2.c(r9.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01d1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01d3, code lost:
    
        r5 = new java.lang.Object[1];
        H((char) android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 1096, 22 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01f7, code lost:
    
        if (r11.hasExtra(((java.lang.String) r5[0]).intern()) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01fd, code lost:
    
        if (o.ea.f.a() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01ff, code lost:
    
        r0 = new java.lang.Object[1];
        H((char) (32954 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, 19 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), r0);
        r8 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        H((char) (android.os.Process.getGidForName("") + 1), 1116 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 74, r0);
        o.ea.f.d(r8, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x024a, code lost:
    
        r2.d(new o.by.c(fr.antelop.sdk.AntelopErrorCode.GooglePayWalletNotAvailable));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x025a, code lost:
    
        if (o.ea.f.a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x025c, code lost:
    
        r0 = new java.lang.Object[1];
        H((char) (32954 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, 20 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), r0);
        r7 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        H((char) ((-16737786) - android.graphics.Color.rgb(0, 0, 0)), 1228 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 67 - android.os.Process.getGidForName(""), r0);
        o.ea.f.d(r7, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02a9, code lost:
    
        r2.d(new o.by.c(fr.antelop.sdk.AntelopErrorCode.GooglePayWalletNotAvailable));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r6 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        if (o.ea.f.a() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        r1 = o.ey.c.f25603v + 77;
        o.ey.c.A = r1 % 128;
        r1 = r1 % 2;
        r0 = new java.lang.Object[1];
        H((char) (32954 - (android.os.Process.myTid() >> 22)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, 19 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), r0);
        r6 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        H((char) (49609 - android.view.View.getDefaultSize(0, 0)), 1062 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 33, r0);
        o.ea.f.c(r6, java.lang.String.format(((java.lang.String) r0[0]).intern(), r11));
        r1 = o.ey.c.A + 77;
        o.ey.c.f25603v = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ae, code lost:
    
        r2.d(new o.by.c(fr.antelop.sdk.AntelopErrorCode.UserCancelled));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object a(java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.a(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 3;
        f25603v = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = A + 31;
            f25603v = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            H((char) (32955 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ViewConfiguration.getJumpTapTimeout() >> 16, (ViewConfiguration.getTouchSlop() >> 8) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46411), 951 - (Process.myPid() >> 22), TextUtils.indexOf((CharSequence) "", '0') + 36, objArr2);
            f.d(strIntern, ((String) objArr2[0]).intern());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, o.ep.d dVar, o.es.e eVar, a.d dVar2, int i2, h hVar) throws Throwable {
        int i3 = 2 % 2;
        int i4 = A + 113;
        f25603v = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArrB = dVar2.b();
        String strE = dVar2.e();
        if (i5 != 0) {
            d(activity, dVar, eVar, bArrB, strE, i2, hVar);
            int i6 = 98 / 0;
        } else {
            d(activity, dVar, eVar, bArrB, strE, i2, hVar);
        }
        int i7 = f25603v + 49;
        A = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c.InterfaceC0350c interfaceC0350c, Activity activity, o.ep.d dVar, int i2, int i3, Intent intent) throws Throwable {
        e((int) Runtime.getRuntime().maxMemory(), new Object[]{this, interfaceC0350c, activity, dVar, Integer.valueOf(i2), Integer.valueOf(i3), intent}, Thread.activeCount(), Process.myPid(), 751778511, -751778510, (int) Thread.currentThread().getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task b(String str) throws Exception {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f25591d * 1124566410;
        f25591d = i2;
        int i3 = 2090903222 * f25595h;
        f25595h = i3;
        int i4 = 525463581 * f25597j;
        f25597j = i4;
        return (Task) e(i3, new Object[]{this, str}, i4, iElapsedRealtime, 1030165111, -1030165109, i2);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        c cVar = (c) objArr[0];
        Activity activity = (Activity) objArr[1];
        c.InterfaceC0350c interfaceC0350c = (c.InterfaceC0350c) objArr[2];
        j jVar = (j) objArr[3];
        o.ep.d dVar = (o.ep.d) objArr[4];
        o.es.e eVar = (o.es.e) objArr[5];
        Object obj = objArr[6];
        h hVar = (h) objArr[7];
        int i2 = 2 % 2;
        int i3 = A + 117;
        f25603v = i3 % 128;
        int i4 = i3 % 2;
        cVar.c(activity, interfaceC0350c, jVar, dVar, eVar, (a.d) obj, hVar);
        if (i4 == 0) {
            return null;
        }
        int i5 = 20 / 0;
        return null;
    }

    private void b(Context context) throws Throwable {
        int i2 = f25594g * (-802960734);
        f25594g = i2;
        int i3 = f25593f * 1170571071;
        f25593f = i3;
        e((int) SystemClock.elapsedRealtime(), new Object[]{this, context}, (int) Thread.currentThread().getId(), i2, -1203810944, 1203810947, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0471  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void b(android.content.Context r26, java.util.List r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.b(android.content.Context, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c.a aVar) {
        int i2 = 2 % 2;
        if (this.f25607p != c.e.f25300d) {
            aVar.d(new o.by.c(AntelopErrorCode.GooglePayWalletNotAvailable));
            int i3 = f25603v + 43;
            A = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 31 / 0;
                return;
            }
            return;
        }
        int i5 = f25603v + 107;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            aVar.a(this.f25613y);
        } else {
            aVar.a(this.f25613y);
            int i6 = 81 / 0;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = A + 93;
        f25603v = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr2 = new Object[1];
            H((char) (32954 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.indexOf("", "", 0, 0), 19 - Drawable.resolveOpacity(0, 0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            H((char) (TextUtils.getTrimmedLength("") + 20098), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1725, (ViewConfiguration.getFadingEdgeLength() >> 16) + 43, objArr3);
            f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(str).toString());
        }
        if (str.length() <= 24) {
            cVar.f25609r = str;
            cVar.f25607p = c.e.f25300d;
            return cVar.f25606n.getStableHardwareId();
        }
        int i4 = f25603v + 83;
        A = i4 % 128;
        int i5 = i4 % 2;
        if (f.a()) {
            Object[] objArr4 = new Object[1];
            H((char) (TextUtils.getCapsMode("", 0, 0) + 32954), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            H((char) (37116 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1767 - MotionEvent.axisFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 50, objArr5);
            f.c(strIntern2, ((String) objArr5[0]).intern());
            int i6 = f25603v + 121;
            A = i6 % 128;
            int i7 = i6 % 2;
        }
        Object[] objArr6 = new Object[1];
        H((char) (56058 - KeyEvent.keyCodeFromString("")), View.resolveSize(0, 0) + 1818, 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
        throw new RuntimeException(((String) objArr6[0]).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(final android.app.Activity r32, final o.es.c.InterfaceC0350c r33, o.ea.j r34, final o.ep.d r35, final o.es.e r36, final o.ap.a.d r37, final o.ea.h r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.c(android.app.Activity, o.es.c$c, o.ea.j, o.ep.d, o.es.e, o.ap.a$d, o.ea.h):void");
    }

    private void c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25603v + 101;
        A = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = A + 9;
            f25603v = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            H((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 32954), Color.blue(0), 'C' - AndroidCharacter.getMirror('0'), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H((char) Color.alpha(0), 812 - KeyEvent.keyCodeFromString(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, objArr2);
            f.d(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        H((char) (9958 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 832 - Color.red(0), 47 - Color.blue(0), objArr3);
        Object[] objArr4 = {((String) objArr3[0]).intern(), 0};
        Method method = Class.forName(C1561oA.Yd("]kbqojf1gtt{mw~9O||\u0004u\n\u0007", (short) (ZN.Xd() ^ 15343))).getMethod(Jg.Wd("6e\u001d\u001dF\tZ\u0006*6m%f\u001fLd\u0006<\u0003I", (short) (FB.Xd() ^ 1476), (short) (FB.Xd() ^ 7563)), Class.forName(Xg.qd("iawc1pftn6\\~}u{u", (short) (FB.Xd() ^ 15431), (short) (FB.Xd() ^ 14))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr4);
            Object[] objArr5 = new Object[1];
            H((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Color.red(0) + 879, 17 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
            Iterator<String> it = sharedPreferences.getStringSet(((String) objArr5[0]).intern(), new HashSet()).iterator();
            int i7 = f25603v + 27;
            A = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 3;
            }
            while (it.hasNext()) {
                try {
                    this.f25613y.add(b(new o.ef.a(it.next())));
                } catch (b e2) {
                    if (f.a()) {
                        Object[] objArr6 = new Object[1];
                        H((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 32954), ExpandableListView.getPackedPositionType(0L), 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr6);
                        String strIntern2 = ((String) objArr6[0]).intern();
                        Object[] objArr7 = new Object[1];
                        H((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 896 - (Process.myPid() >> 22), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 25, objArr7);
                        f.e(strIntern2, ((String) objArr7[0]).intern(), e2);
                    }
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, Exception exc) throws Throwable {
        int i2 = f25588a * (-1315792979);
        f25588a = i2;
        int i3 = f25589b * 951888094;
        f25589b = i3;
        int i4 = f25590c * (-1624132731);
        f25590c = i4;
        int i5 = f25592e * 1386890380;
        f25592e = i5;
        e(i4, new Object[]{this, context, exc}, i5, i2, -1310507114, 1310507114, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) throws Throwable {
        Object[] objArr = {exc};
        int i2 = f25601o * 2078572688;
        f25601o = i2;
        int iMyUid = Process.myUid();
        int i3 = (-1501687749) * f25598k;
        f25598k = i3;
        e(i3, objArr, Process.myUid(), i2, -955221387, 955221392, iMyUid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task d(String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = A + 97;
        f25603v = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            H((char) (TextUtils.getCapsMode("", 0, 0) + 32954), Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 20, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            H((char) TextUtils.getOffsetBefore("", 0), KeyEvent.getDeadChar(0, 0) + 1567, (ViewConfiguration.getFadingEdgeLength() >> 16) + 38, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
        }
        Task<List<TokenInfo>> taskListTokens = this.f25606n.listTokens();
        int i4 = A + 125;
        f25603v = i4 % 128;
        int i5 = i4 % 2;
        return taskListTokens;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        final c cVar = (c) objArr[0];
        final Context context = (Context) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25603v;
        int i4 = i3 + 91;
        A = i4 % 128;
        int i5 = i4 % 2;
        if (cVar.f25606n == null) {
            int i6 = i3 + 125;
            A = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 76 / 0;
            }
            return null;
        }
        if (f.a()) {
            Object[] objArr2 = new Object[1];
            H((char) (32955 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 19, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            H((char) (425 - ExpandableListView.getPackedPositionChild(0L)), 25 - (Process.myTid() >> 22), 9 - TextUtils.indexOf("", "", 0), objArr3);
            f.c(strIntern, ((String) objArr3[0]).intern());
        }
        cVar.f25608q.set(true);
        cVar.f25606n.getActiveWalletId().onSuccessTask(new SuccessContinuation() { // from class: o.ey.c$$ExternalSyntheticLambda15
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f$0.b((String) obj);
            }
        }).onSuccessTask(new SuccessContinuation() { // from class: o.ey.c$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f$0.e((String) obj);
            }
        }).onSuccessTask(new SuccessContinuation() { // from class: o.ey.c$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f$0.d((String) obj);
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: o.ey.c$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) throws Throwable {
                this.f$0.b(context, (List) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.ey.c$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) throws Throwable {
                this.f$0.c(context, exc);
            }
        });
        return null;
    }

    static void d() {
        char[] cArr = new char[1901];
        ByteBuffer.wrap("\u0014\u000fÙ\u0098\u008fY}\u0012\"Ø\u0010\u0096Æb´\u0010yÉ/¨\u001d_Ã\u0011°Ðf\u009eTN\u001a0ÏÕ½\u0097cJ\u0094\u009bY#\u000fåý»¢&\u0090`\u0095*X\u0082\u000e@ü\u0017£Á\u0091\u0090GJ5Iø\u0089:f÷Ü¡\u001bSC\f©>Ìè\u001e\u009aKWÆ\u0001\u0088\u0094\u0082Y8\u000fÿý§¢M\u0090(Fú4¯ù\"¯l\u009d¤Cê0&æ Ôã\u009a·Ok=+ãõÑ«\u0086gty:ùèµÝ~\u0083uqõ'´\u0014bÚ8\u0088æ~º#f\u0011\u0014Çþµ\u008az](\u001c\u001eÄÌ\u009f±ig\u0004UÈ\u001b\u008bÈD¾\u0000lÃR\u0088\u0007\u0002õ\u001c»Îi\u009a^\u001e\f\u000bòÝ \u008a\u0095O[\u001c\tÆÿ\u0092¬Re\u001f¨»þ~\f3Sùa¯·aÅ \bü^ªlt²:Áú\u0017ª%fk7¾úÌ·\u0012q #wõ\u0085£Ë`\u00190,ç\u0094¦Y\u0002\u000fÇý\u008a¢@\u0090\u0016FØ4\u0099ùE¯\u0013\u009dÍC\u00830Cæ\u0013Ôß\u009a\u0095OK=\u000eãÝ\u0094¦Y\u0002\u000fÇý\u008a¢@\u0090\u0016FØ4\u0099ùE¯\u0013\u009dÍC\u00830Cæ\u0013Ôß\u009a\u0087OK=\u000eãßÑ\u0090\u0086Ht\u001c:Ê\u0094§Y#\u000féý·¢~\u0090,Fë4¿ùo¯!\u009d¤C\u00910gæ-Ôõ\u009a¦O8=}Ë\u0004\u0006¾Py¢!ýÜÏ \u0019ek(¦âðªÂx\u001c$o¨¹î\u0094\u0082Y8\u000fÿý§¢Z\u0090&Fã4®ùd¯,\u009dþC¢0.æhÔ \u009aîO\"=>ãýÑ\u00ad\u0086zt\u0017:ýè¯Ým\u0083:qæ'¼\u00146Úk\u0088°a©¬\u0014úÆ\b\u0093WIe\u001f³ÕÁ\u0087\fEZ\u0012hÎ¶\u0094ÅA\u0013\u0014!Ùo\u0088ºNÈ\u0000\u0016Ö$\u0084sG\u0081\u0013ÏÄ°\u0081}<+îÙ»\u0086a´7bý\u0010¯Ým\u008b:¹æg¼\u0014iÂ'ðù¾ ks\u0094±Y\f\u000fÞý\u008b¢Q\u0090\u0007FÍ4\u009fù]¯\n\u009dÖC\u008c0Yæ\u0005ÔÉ\u009a\u0090OA=\u0012ãÊÑ\u009a\u0086L\u0094\u0082Y8\u000fÿý§¢Z\u0090&Fã4®ùd¯,\u009dþC¢0.æhÔ \u009aîO\"=\tãýÑ¯\u0086_t7:üè\u008bÝ{\u0083,q×'»\u0014\u007fÚ4\u0088þ~§#<\u0011\u0001ÇÅµ\u009czZ(=\u001eÇÌ\u0080±Og\u000bU×\u0094\u0082Y8\u000fÿý§¢Z\u0090&Fã4®ùd¯,\u009dþC¢0.æhÔ \u009aîO\"=\tãýÑ¯\u0086_t7:üè\u008bÝ{\u0083,qº'»\u0014\u007fÚ\"\u0088ä~\u0087#}\u0011\u0006ÇÉµ\u0081z](G\u001eÇÌ\u0085±yg\u0010UÇ\u001b\u0084ÈC¾\u0012lÓRÃ\u0007\u000fõ]»òi\u0090^\u001e\f\u0014òÙ \u008f\u0095Y[\u001d\tÝÿ\u0099¬Q\u0092Q@Ä6\u009cûY©è\u009f¢LF2 àïÖ§\u009b+I:?ðí·Òo\u0080fvè$®éwß-\u008d½s» p\u00161Äþ\u008a´\u007f~-\n\u0013ôÁ\u00ad\u0094\u0082Y8\u000fÿý§¢Z\u0090&Fã4®ùd¯,\u009dþC¢0.æhÔ \u009aîO\"=\tãýÑ¯\u0086_t7:üè\u008bÝ{\u0083,qº'»\u0014\u007fÚ\"\u0088ä~\u0087#}\u0011\u0006ÇÉµ\u0081z](G\u001eÇÌ\u0085±yg\u0010UÇ\u001b\u0084ÈC¾\u0012lÓRÃ\u0007\u000fõ]»ñi\u009e^J\f\u001aòÐ \u0092\u0095T[\u0012\t\u0094ÿ\u0083¬Y\u0092\u001a@Õ6\u009dû{©ã\u009fªL`2nààÖ¦\u009b+I??ëí°Òh\u0080-vä$®éjß8\u008døs¸ ?\u0016-Äí\u008a¹\u007fo-?\u0094\u0082Y8\u000fÿý§¢Z\u0090&Fã4®ùd¯,\u009dþC¢0.æhÔ \u009aîO\"=\tãýÑ¯\u0086_t7:üè\u008bÝ{\u0083,qº'»\u0014\u007fÚ\"\u0088ä~\u0087#}\u0011\u0006ÇÉµ\u0081z](G\u001eÇÌ\u0085±yg\u0010UÇ\u001b\u0084ÈC¾\u0012lÓRÃ\u0007\u000fõ]»èi\u009e^N\f8òÖ \u009f\u0095j[\u0014\tÍÿÙ¬F\u0092\u0004@Ã6\u009bûf©â\u009f§Lj2 ààÖ²\u009bnI.óo>Õh\u0012\u009aJÅ·÷Ë!\u000eSC\u009e\u0089ÈÁú\u0013$OWÃ\u0081\u0085³Mý\u0003(ÏZä\u0084\u0010¶Bá²\u0013Ú]\u0011\u008ffº\u0096äÁ\u0016W@Vs\u0092½Ïï\t\u0019jD\u0090vë $Òl\u001d°Oªy*«hÖ\u0094\u0000ý2*|i¯®Ùÿ\u000b>5.`â\u0092°Ü\u001c\u000es9§k÷\u0095=Ç\u007fò¹<ÿny\u0098nË´õ÷'8Qp\u009c\u0096Î\u000eøG+\u008dU\u0083\u0087\r±KüÆ.\u0085X\u001d\u008aGµ\u009cçÎ\u0011\u001eCD\u008e\u0088¸Æê\u0015\u0014UGÐq\u0093£\u0007íA\u0018\u0097JÃt\u001d¦\u0015ÑÚ\u0003ØM\u001d\u007fQª\u0092Ô\u009f\u0006\u00140`c²\u00adÂß*\ta4\u0096fæ\u00901Â'\r¾?äi'\u009bhÆ ðæ\"*lt\u0094\u0091Y?\u000féý®¢z\u0090,Fß4ªùf¯)\u009dáC³0.æh\u0094\u0091Y?\u000féý®¢z\u0090,Fß4ªùf¯)\u009dáC³0.æhÔ \u009aîO\"=<ãÿÑ«\u0086wt/:ñè¯Ýc\u0083\u0007qñ'¤\u0014cÚ=\u0088ä~\u0090#s\u0011\u0001ÇÀµ\u008dzO(\n\u001eÃÌË±Cg\u0016U\u0084\u001b\u0095ÈC¾\u0010lÕR\u008a\u0007Põ\u0018»Ø¬`aÉ7\u0019Åo\u009a\u009c¨ì~\f\fLÁ\u008a\u0097Ñ¥\t{R\b¤ÞÁì\u0013¢FwË\u0005\u0095\u0094\u0096Y(\u000fàýª¢z\u0090,FË4ªùx¯!\u009d¬Cî:¯÷\u000b¡ÍS\u0096\fc>\u0006èÔ\u009a\u0081W\f\u0001B\u0094\u0095Y(\u000føý\u009f¢k\u0090;Fû4¢ùy¯1\u009dáC£0Ræ.Ôë\u009a¦Ol=.ã´Ñö²r\u007fÙ)DÛH\u0084\u0086¶Û`\u000b\u0012Aß\u0083\u0089Ó»Le@\u0016\u008eÀÓò\u0003¼Ii\u008b\u001bËÅ\u0012÷Z \u009dRÓ\u001c\u0017Î_û\u008e¥ÒW\u0000\u0001H2¯üÄ®\u001eXT\u0005\u00867îá.\u0093V\\¸\u000eý8+êk\u0097©Añs'=oî£\u0098âJ5\u0094µY\u0002\u000fÃý\u0088¢B\u0090\fF×4\u009bùK¯\u001c\u009dÛC\u00930Iæ\nÔÅ\u009a\u008dOQ\u0094\u009bY#\u000fåý»¢&\u0090`F¨4æù*¯!\u009dáC´0cæ3Ôé\u009a¢On=4ãæÑº\u0086Jt6:óè¾Ýt\u0094\u0093Y)\u000fèý\u0081¢k\u0090>FÜ4¤ùa¯ \u009dêCï0/æaÔ\u00ad\u009aãOn=<ãïÑ«\u0086>t=:ñè¼Ýs\u0083!qç'÷\u0014,Úq!Êìnº¨Hó\u0017\u0006%có±\u0081äLi\u001a'(ïö¡\u0085mS\\a¢/íú>\u00886V\u0083dû3>Áw\u008f½]°h|6>Ä\u009c\u0092ý¡3oy=¾Ëô\u00965¤Cr\u0083T×\u0099sÏµ=îb\u001bP~\u0086¬ôù9to:]ò\u0083¼ðp&A\u0014¿Zð\u008f#ý+#\u009e\u0011æF#´jú (\u00ad\u001daC#±\u0084çàÔ)\u001akH³¾÷ã!Í,\u0000\u0088VN¤\u0015ûàÉ\u0085\u001fWm\u0002 \u008föÁÄ\t\u001aGi\u008b¿º\u008dDÃ\u000b\u0016ØdÐºe\u0088\u001dßØ-\u0091c[±V\u0084\u009aÚØ(j~\u001fMÕ\u0083\u0098Ñ\u001d'\u0017zÑH´\u009edì,#÷qäG`\u00954èõ>§\f{UK\u0098ñÎ6<nc\u0093Qï\u0087*õg8\u00adnå\\7\u0082kñï'ë\u0015([d\u008e¨üñ\"9\u0010sG³µ°û|)2\u001c·Bý°)æ\u007fÕÿ\u001b¢Iy¿?â¨\u0094\u0097Y5\u000føý½¢o\u0090\u0016Fá4¸ùy¯0\u009dáCµ0Yæ5Ôï\u009a¨Og=3ãÃÑ¶\u0086z\u0094\u0082Y8\u000fÿý§¢M\u0090(Fú4¯ù*¯h\u009d¤C¨0hæ\u0000Ôã\u009a·Ok=+ãõÑ«\u0086gt\u000b:ýè¨Ýo\u00839qà'÷\u0014;Úq\u0088Å~½#s\u0011\u000fÇÀµ\u008az\u000e(\u001d\u001eÇÌË±Lg\u0000UÐ\u001b\u0084ÈN¾AlÉR\u0090\u0007Qõ\b»Ùi\u008d^\u001e\f\rò× \u0090\u0095_[\u001b\t\u0094ÿ\u009e¬R\u0092Q@Ö6\u0081û]©à\u009fìL}2+àúÖ½\u009bgI>Nû\u0083AÕ\u0086'Þx4JQ\u009c\u0083îÖ#Su\u0011GÝ\u0099Ñê\u0011<y\u000e\u009a@Î\u0095\u0012çR9\u008c\u000bÒ\\\u001e®rà\u00842Ñ\u0007\u0016Y@«\u0099ý\u008eÎB\u0000\bR\u009d¤Åù\u0000Ëq\u001d»oß 3ò*Äñ\u000e\u0084Ã>\u0095ùg¡8K\n.Üü®©c,5n\u0007¢Ù®ªn|\u0006Nå\u0000±Õm§-yóK\u00ad\u001caî\r ûr®Gi\u0019?ëæ½ñ\u008e=@w\u0012Ãä»¹\u007f\u008b\u0005]Å/\u009eàF²O\u0084ËV\u009f+^ý\fÏÐ\u0081ÁRR$\u0002öÒÈ\u0090\u009dVo\u0015!ßó\u009dÄ\u0018\u0096\u0019hÌ:\u0092\u000fQÁS\u0093Õe\u009e6_\b\u0010ÚÚ¬\u0090a\u00143û\u0005«Öp\u0094\u0093Y#\u000fèý½¢a\u0090 Fì4åùe¯6\u009dªC\u00940\u007fæ2Ôô\u009a¦Oo=\u001eãðÑ°\u0086}t2g\u0019ª¯üc\u000e1Qóc¢µbÇ\u0017\ná\\ªnf°=Ãá\u0015¢'k\u0094\u0093Y#\u000fèý½¢a\u0090 Fì4åùk¯5\u009dôCé0Gæ\"Ôô\u009aªOt=4ãèÑ¦\u0086Jt1:êè¾Ý{\u00831\u0094\u0091Y8\u000fþý½¢k\u0090'Fü4\u008aùz¯5\u009dèC®0eæ Ôô\u009aªOm=3\u0088äEP\u0013\u0086áÒ¾\\\u008cYZ\u0095(Ùå\u0011³\u0017\u0081«_Â,\túIÈ\u0099\u0086ÒdÇ©uÿµ\rýR&`|¶ Äî\t\u001e_xm«³óÀ\u0019\u0016r$¸júÓW\u001eÿH=ºjå¼×í\u00017s4¾ôè²Ú~\u00040w\u009e¡ø\u0093wÝr\b´zã¤'\u0096}Á»3ë}u¯,\u0094\u0080Y(\u000fêý½¢k\u0090:Fà4ãù#¯e\u009d©Cç0Iæ/Ô \u009a¥Oc=4ãðÑª\u0086lt<:¸èöÝ:\u0083\u001bqû'£\u0014EÚ$\u0088à~£#}\u0011\u001fÇØµ\u008azJ(+\u001eÑÌ¯±Og\u0013UÍ\u001b\u0084ÈC\u0094\u0080Y(\u000fêý½¢k\u0090:Fà4ãù#¯e\u009d©Cç0Iæ/Ô \u009a¥Oc=4ãðÑª\u0086lt<:¸èöÝ:\u0083\u001bqû'£\u0014UÚ>\u0088þ~µ#{\u0011\nÇÙµ\u009dzK(\r\u0094\u0080Y(\u000fêý½¢k\u0090:Fà4ãù#¯e\u009d©Cç0jæ(Ôó\u009a·OV=2ã÷Ñº\u0086pt*\u007fb²Êä\b\u0016_I\u0089{Ø\u00ad\u0002ß\u0001\u0012ÁD\u0087vK¨\u0005Û \rÌ?\fqD¤ÀÖÈ\b\u0017:Im\u0094\u009f\u009bÑ)\u0003L6\u009bhÔ\u009a\u0013ÌFÿ\u0087\u0094\u0080Y(\u000fêý½¢k\u0090:Fà4ãù#¯e\u009d©Cç0aæ$Ôô\u009a\u0086Ol=+ãõÑ\u00ad\u0086qt7:õè¾Ýt\u0083!q´'¸\u0014xÚ\u0002\u0088å~°#q\u0011\bÇßµ\u009cz\u0014(Ig@ªèü*\u000e}Q«cúµ Ç#\nã\\¥ni°'Ã¡\u0015ä'4iP¼¶Îü\u0010>\"su»\u0087ÑÉ9\u001bi.¾pâ\u00825Ôeç³)Ø{4\u008d3Ðÿâ\u008d4\u0005FK\u0089ÔÛ\u0089Âþ\u000f(Y\u0086«ªô\u0002Æ,\u0010\u0080bË¯o\u0094\u0080Y(\u000fêý½¢k\u0090:Fà4ãù#¯e\u009d©Cç0aæ$Ôô\u009a\u0090Ov=<ãþÑ³\u0086{t\u0011:ùè©Ý~\u0083\"qõ'¥\u0014sÚ\u0018\u0088ô~ó#?\u0011MÇÅµ\u008bz\u000e(\u001d\u001eÇÌ\u0084±\ng\tUË\u001b\u0089ÈA½\u008fp7&ãÔ£\u008bl¹\"oÎ\u001d¤Ðv\u0086/´ýj¨\u0019zÏ*ýÇ³©f,\u0014:Êöøñ¯d]8\u0013ùÁõôxª4Xô\u000e¾Ú\u0002\u0017ªAh³?ìéÞ¸\bbza·¡áçÓ+\re~ã¨¦\u009avÔ\u0000\u0001ãs«\u00adw\u009f+Èù:\u008ct{¦5\u0093ôÍ²?bi\u001cZð\u0094óÆ?0qmÇ_\u008e\u0089Bû\u00014Éf\u009fP\n\u0082\u0000ÿÌ)Ý\u001b\u0006\u0004|ÉÔ\u009f\u0016mA2\u0097\u0000ÆÖ\u001c¤\u001fiß?\u0099\rUÓ\u001b \u009dvØD\b\n~ß\u009d\u00adÕs\tAU\u0016\u0087äòª\u0005xKM\u008a\u0013Ìá\u001c·b\u0084\u008eJ\u008d\u0018Aî\u000f³¹\u0081ðW<%\u007fê·¸á\u008et\\~!²÷¹Å,\u008btXµ.½ü0Âp\u0097°eæN_\u0083ÖÕ\u001a'Yx\u0091JÇ\u009cRîX#\u0094u\u009fG\n\u0099Rê\u0093<\u009b\u000e\u0016@V\u0095\u0096çÀµ×x].\u008dÜÿ\u0083\u0011±\\g©\u0015ÛØ\u0002\u008e\u0014¼Øb\u0096\u0011\u0018Ç^õµ»Ón\u0007\u001cMÂ®ðÆ§\u000eUF\u001b\u008eÉÏü\u000f¢\fPÌ}\u0018°³æ.\u0014\"Kìy±¯aÝ+\u0010éF¹t&ª8Ùî\u000f¦=\"s<¦ëÔ¥\nd8:oü\u009d²Óg\u0001y4Áj¸\u0098tÎ7ýÿ3©aO\u0097:Êêø\u0095.I\\\r\u0093ÅÁ\u0096".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1901);
        f25602u = cArr;
        f25604w = 6119659706795383117L;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(android.app.Activity r24, o.ep.d r25, o.es.e r26, byte[] r27, java.lang.String r28, int r29, o.ea.h r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.d(android.app.Activity, o.ep.d, o.es.e, byte[], java.lang.String, int, o.ea.h):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0502  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void d(android.content.Context r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.d(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x047f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ com.google.android.gms.tasks.Task e(java.lang.String r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.e(java.lang.String):com.google.android.gms.tasks.Task");
    }

    public static /* synthetic */ Object e(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i6;
        int i9 = ~((-1) - (((-1) - i8) & ((-1) - i4)));
        int i10 = (i9 + i5) - (i9 & i5);
        int i11 = (-1) - (((-1) - i4) & ((-1) - i5));
        int i12 = (i11 + i8) - (i11 & i8);
        int i13 = i5 + i6 + i7 + (1159740906 * i2) + ((-617157175) * i3);
        int i14 = i13 * i13;
        int i15 = ((i5 * 934236018) - 2089811968) + (934236018 * i6) + (i10 * (-953110385)) + ((-953110385) * i12) + (953110385 * i8) + ((-18874368) * i7) + (1488977920 * i2) + (2111832064 * i3) + (2070937600 * i14);
        int i16 = (i5 * (-824977050)) + 1921657099 + (i6 * (-824977050)) + (i10 * (-923)) + (i12 * (-923)) + (i8 * 923) + (i7 * (-824977973)) + (i2 * (-135083378)) + (i3 * 1125239651) + (i14 * 298844160);
        int i17 = i15 + (i16 * i16 * 2098200576);
        if (i17 == 1) {
            return a(objArr);
        }
        if (i17 == 2) {
            return c(objArr);
        }
        if (i17 == 3) {
            return d(objArr);
        }
        if (i17 == 4) {
            return b(objArr);
        }
        if (i17 == 5) {
            return e(objArr);
        }
        c cVar = (c) objArr[0];
        Context context = (Context) objArr[1];
        Exception exc = (Exception) objArr[2];
        int i18 = 2 % 2;
        int i19 = A + 53;
        f25603v = i19 % 128;
        int i20 = i19 % 2;
        if (f.a()) {
            int i21 = f25603v + 103;
            A = i21 % 128;
            int i22 = i21 % 2;
            Object[] objArr2 = new Object[1];
            H((char) (32955 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ViewConfiguration.getTouchSlop() >> 8, TextUtils.getOffsetAfter("", 0) + 19, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            H((char) (18391 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1457 - AndroidCharacter.getMirror('0'), KeyEvent.keyCodeFromString("") + 24, objArr3);
            f.e(strIntern, ((String) objArr3[0]).intern(), exc);
        }
        if (!(exc instanceof ApiException)) {
            cVar.f25607p = c.e.f25298b;
        } else {
            int statusCode = ((ApiException) exc).getStatusCode();
            if (statusCode == 15005 || statusCode == 15009) {
                if (f.a()) {
                    int i23 = f25603v + 95;
                    A = i23 % 128;
                    int i24 = i23 % 2;
                    Object[] objArr4 = new Object[1];
                    H((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32953), TextUtils.lastIndexOf("", '0') + 1, 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
                    String strIntern2 = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    H((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 1433, ExpandableListView.getPackedPositionGroup(0L) + 45, objArr5);
                    f.c(strIntern2, ((String) objArr5[0]).intern());
                    int i25 = A + 23;
                    f25603v = i25 % 128;
                    int i26 = i25 % 2;
                }
                cVar.f25607p = c.e.f25298b;
            } else {
                if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    H((char) (Color.blue(0) + 32954), ViewConfiguration.getKeyRepeatDelay() >> 16, (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, objArr6);
                    String strIntern3 = ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    H((char) (Color.rgb(0, 0, 0) + 16777216), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1477, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 38, objArr7);
                    f.c(strIntern3, ((String) objArr7[0]).intern());
                }
                cVar.f25607p = c.e.f25299c;
            }
        }
        cVar.f25609r = null;
        cVar.f25611t = null;
        List<o.es.e> list = cVar.f25613y;
        Object[] objArr8 = new Object[1];
        H((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 879 - Color.alpha(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr8);
        cVar.c(context, list, ((String) objArr8[0]).intern());
        cVar.f25610s.set(true);
        cVar.f25608q.set(false);
        Iterator<a> it = cVar.f25612x.iterator();
        while (it.hasNext()) {
            int i27 = f25603v + 7;
            A = i27 % 128;
            int i28 = i27 % 2;
            it.next().onDone();
        }
        cVar.f25612x.clear();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r11) throws java.lang.Throwable {
        /*
            r9 = 0
            r8 = r11[r9]
            java.lang.Exception r8 = (java.lang.Exception) r8
            r11 = 2
            int r0 = r11 % r11
            int r0 = o.ey.c.f25603v
            int r1 = r0 + 45
            int r0 = r1 % 128
            o.ey.c.A = r0
            int r1 = r1 % r11
            r10 = 1
            if (r1 != 0) goto L28
            boolean r1 = o.ea.f.a()
            r0 = 49
            int r0 = r0 / r9
            if (r1 == r10) goto L2e
        L1d:
            int r0 = o.ey.c.f25603v
            int r1 = r0 + 11
            int r0 = r1 % 128
            o.ey.c.A = r0
            int r1 = r1 % r11
            r0 = 0
            return r0
        L28:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L1d
        L2e:
            r1 = 32954(0x80ba, float:4.6178E-41)
            int r0 = android.graphics.Color.blue(r9)
            int r1 = r1 - r0
            char r3 = (char) r1
            java.lang.String r0 = ""
            int r2 = android.os.Process.getGidForName(r0)
            int r2 = r2 + r10
            float r1 = android.media.AudioTrack.getMaxVolume()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r1 = r0 + 18
            java.lang.Object[] r0 = new java.lang.Object[r10]
            H(r3, r2, r1, r0)
            r0 = r0[r9]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = r0.intern()
            r1 = 16826454(0x100c056, float:2.364788E-38)
            int r0 = android.graphics.Color.rgb(r9, r9, r9)
            int r0 = r0 + r1
            char r6 = (char) r0
            long r1 = android.os.Process.getElapsedCpuTime()
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            int r3 = 987 - r0
            long r1 = android.os.SystemClock.uptimeMillis()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            int r1 = r0 + 32
            java.lang.Object[] r0 = new java.lang.Object[r10]
            H(r6, r3, r1, r0)
            r0 = r0[r9]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.e(r7, r0, r8)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.e(java.lang.Object[]):java.lang.Object");
    }

    private o.es.e e(Context context, String str, String str2, Integer num, o.es.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25603v + 123;
        A = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            H((char) (TextUtils.indexOf("", "", 0) + 32954), Color.alpha(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            H((char) Drawable.resolveOpacity(0, 0), MotionEvent.axisFromString("") + 922, 31 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            f.d(strIntern, sb.append(((String) objArr2[0]).intern()).append(str2).toString());
            int i5 = f25603v + 55;
            A = i5 % 128;
            int i6 = i5 % 2;
        }
        o.es.e eVar = new o.es.e(str, Long.valueOf(new Date().getTime()), str2, num, dVar);
        this.f25613y.add(eVar);
        List<o.es.e> list = this.f25613y;
        Object[] objArr3 = new Object[1];
        H((char) KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 878, 17 - View.getDefaultSize(0, 0), objArr3);
        e(context, list, ((String) objArr3[0]).intern());
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(PendingIntent pendingIntent) throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 105;
        f25603v = i3 % 128;
        int i4 = i3 % 2;
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e2) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                H((char) (32953 - ExpandableListView.getPackedPositionChild(0L)), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DC4, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                H((char) (23005 - AndroidCharacter.getMirror('0')), 1019 - View.resolveSizeAndState(0, 0, 0), 44 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                f.e(strIntern, ((String) objArr2[0]).intern(), e2);
                int i5 = f25603v + 21;
                A = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    private void e(final Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 45;
        f25603v = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f25603v + 111;
            A = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            H((char) (32954 - Color.blue(0)), ViewConfiguration.getTapTimeout() >> 16, 19 - TextUtils.indexOf("", ""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 19 - (ViewConfiguration.getEdgeSlop() >> 16), 6 - TextUtils.getOffsetAfter("", 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f25603v + 87;
            A = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f25607p = c.e.f25298b;
        this.f25606n = TapAndPay.getClient(context);
        c(context);
        this.f25606n.registerDataChangedListener(new TapAndPay.DataChangedListener() { // from class: o.ey.c$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tapandpay.TapAndPay.DataChangedListener
            public final void onDataChanged() throws Throwable {
                this.f$0.d(context);
            }
        });
        int i9 = f25594g * (-802960734);
        f25594g = i9;
        int i10 = f25593f * 1170571071;
        f25593f = i10;
        e((int) SystemClock.elapsedRealtime(), new Object[]{this, context}, (int) Thread.currentThread().getId(), i9, -1203810944, 1203810947, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(c.a aVar, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = A + 15;
        f25603v = i4 % 128;
        int i5 = i4 % 2;
        if (i2 == 0) {
            aVar.d(new o.by.c(AntelopErrorCode.UserCancelled));
            return;
        }
        if (i2 == -1) {
            aVar.a(new Object());
            return;
        }
        aVar.d(new o.by.c(AntelopErrorCode.GooglePayWalletNotAvailable));
        int i6 = A + 9;
        f25603v = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(c.a aVar) {
        int i2 = 2 % 2;
        c.e eVar = this.f25607p;
        Object obj = null;
        if (eVar != null) {
            int i3 = f25603v + 7;
            A = i3 % 128;
            if (i3 % 2 == 0) {
                aVar.a(eVar);
                throw null;
            }
            aVar.a(eVar);
        }
        int i4 = A + 69;
        f25603v = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(c.a aVar) {
        int i2 = 2 % 2;
        int i3 = f25603v + 3;
        A = i3 % 128;
        int i4 = i3 % 2;
        if (this.f25607p != c.e.f25300d) {
            aVar.d(new o.by.c(AntelopErrorCode.GooglePayWalletNotAvailable));
            return;
        }
        int i5 = f25603v + 79;
        A = i5 % 128;
        int i6 = i5 % 2;
        String str = this.f25609r;
        if (str != null) {
            aVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void h(o.es.c.a r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.c.h(o.es.c$a):void");
    }

    static void init$0() {
        $$a = new byte[]{37, 121, MessagePack.Code.MAP32, 74};
        $$b = 68;
    }

    static void init$1() {
        $$d = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32, Utf8.REPLACEMENT_BYTE, MessagePack.Code.EXT32, -6, 55, MessagePack.Code.FALSE, 68, -67, Utf8.REPLACEMENT_BYTE, MessagePack.Code.FLOAT64, -2, 49, MessagePack.Code.FLOAT32, 60, -19, Utf8.REPLACEMENT_BYTE, MessagePack.Code.EXT8, -3, 54, MessagePack.Code.FALSE, Utf8.REPLACEMENT_BYTE, MessagePack.Code.BIN32, -6, 58, MessagePack.Code.EXT8, Utf8.REPLACEMENT_BYTE, MessagePack.Code.FLOAT64, -2, 49, MessagePack.Code.FLOAT32, 60, -16};
        $$e = 10;
    }

    static void init$2() {
        $$c = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$f = 36;
    }

    @Override // o.es.c
    public final void a(final c.a<String> aVar) {
        int i2 = 2 % 2;
        a aVar2 = new a() { // from class: o.ey.c$$ExternalSyntheticLambda10
            @Override // o.ey.c.a
            public final void onDone() throws Throwable {
                this.f$0.h(aVar);
            }
        };
        if (!(!this.f25610s.get()) && !this.f25608q.get()) {
            int i3 = A + 3;
            f25603v = i3 % 128;
            int i4 = i3 % 2;
            aVar2.onDone();
            return;
        }
        this.f25612x.add(aVar2);
        int i5 = f25603v + 109;
        A = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.es.a
    public final void a(o.es.e eVar) throws Throwable {
        int i2 = 2 % 2;
        if (this.f25606n == null) {
            return;
        }
        if (f.a()) {
            int i3 = f25603v + 125;
            A = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            H((char) (32954 - (ViewConfiguration.getPressedStateDuration() >> 16)), ViewConfiguration.getScrollBarSize() >> 8, TextUtils.indexOf("", "") + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 44590), 802 - (Process.myTid() >> 22), 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f25606n.viewToken(new ViewTokenRequest.Builder().setIssuerTokenId(eVar.c()).setTokenServiceProvider(eVar.b().intValue()).build()).addOnSuccessListener(new OnSuccessListener() { // from class: o.ey.c$$ExternalSyntheticLambda11
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) throws Throwable {
                c.e((PendingIntent) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.ey.c$$ExternalSyntheticLambda12
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) throws Throwable {
                c.c(exc);
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: o.ey.c$$ExternalSyntheticLambda13
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() throws Throwable {
                c.a();
            }
        });
        int i5 = A + 63;
        f25603v = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.es.c
    public final void b(Activity activity) throws Throwable {
        int i2 = 2 % 2;
        int i3 = A;
        int i4 = i3 + 75;
        f25603v = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.f25606n == null) {
            int i5 = i3 + 45;
            f25603v = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 6 / 0;
                return;
            }
            return;
        }
        if (f.a()) {
            int i7 = A + 79;
            f25603v = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr = new Object[1];
            H((char) (32953 - ExpandableListView.getPackedPositionChild(0L)), ExpandableListView.getPackedPositionGroup(0L), 19 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H((char) TextUtils.getTrimmedLength(""), ImageFormat.getBitsPerPixel(0) + 708, 14 - Gravity.getAbsoluteGravity(0, 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f25606n.createWallet(activity, 51);
    }

    @Override // o.es.a
    public final void b(Activity activity, o.es.e eVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 47;
        f25603v = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
            if (this.f25606n == null) {
                return;
            }
        } else if (this.f25606n == null) {
            return;
        }
        if (f.a()) {
            int i5 = A + 9;
            f25603v = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            H((char) (32954 - (ViewConfiguration.getScrollBarSize() >> 8)), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.red(0) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H((char) (14562 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 771 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = A + 103;
            f25603v = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f25606n.requestSelectToken(activity, eVar.c(), eVar.b().intValue(), 53);
    }

    @Override // o.es.c
    public final void c(final c.a<List<o.es.e>> aVar) {
        int i2 = 2 % 2;
        a aVar2 = new a() { // from class: o.ey.c$$ExternalSyntheticLambda8
            @Override // o.ey.c.a
            public final void onDone() {
                this.f$0.b(aVar);
            }
        };
        if (!this.f25610s.get() || this.f25608q.get()) {
            this.f25612x.add(aVar2);
            return;
        }
        int i3 = A + 115;
        f25603v = i3 % 128;
        int i4 = i3 % 2;
        aVar2.onDone();
        int i5 = A + 77;
        f25603v = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.es.c
    public final void d(Activity activity, final c.a<Object> aVar, j jVar) throws Throwable {
        int i2 = 2 % 2;
        if (this.f25606n == null) {
            return;
        }
        if (f.a()) {
            int i3 = f25603v + 39;
            A = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            H((char) (TextUtils.indexOf("", "", 0, 0) + 32954), TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getEdgeSlop() >> 16) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 707 - ExpandableListView.getPackedPositionType(0L), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = A + 49;
            f25603v = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 5;
            }
        }
        if (jVar != null) {
            jVar.e(51, new j.e() { // from class: o.ey.c$$ExternalSyntheticLambda14
                @Override // o.ea.j.e
                public final void onActivityResult(int i7, Intent intent) {
                    c.e(aVar, i7, intent);
                }
            });
            this.f25606n.createWallet(activity, 51);
            return;
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            H((char) (Drawable.resolveOpacity(0, 0) + 32954), Drawable.resolveOpacity(0, 0), 19 - View.resolveSize(0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            H((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 721, (ViewConfiguration.getTouchSlop() >> 8) + 51, objArr4);
            f.d(strIntern2, ((String) objArr4[0]).intern());
            int i7 = f25603v + 101;
            A = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // o.es.a
    public final void d(Activity activity, o.es.e eVar) throws Throwable {
        int i2 = 2 % 2;
        Object obj = null;
        if (this.f25606n == null) {
            int i3 = A + 47;
            f25603v = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (!(!f.a())) {
            int i4 = f25603v + 103;
            A = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            H((char) (32954 - Color.blue(0)), ViewConfiguration.getTapTimeout() >> 16, 18 - Process.getGidForName(""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H((char) Color.green(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 790, 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f25606n.requestDeleteToken(activity, eVar.c(), eVar.b().intValue(), 54);
        int i6 = f25603v + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        A = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.es.c
    public final void d(final c.a<c.e> aVar) {
        int i2 = 2 % 2;
        int i3 = A + 113;
        f25603v = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            new a() { // from class: o.ey.c$$ExternalSyntheticLambda9
                @Override // o.ey.c.a
                public final void onDone() {
                    this.f$0.f(aVar);
                }
            };
            this.f25610s.get();
            throw null;
        }
        a aVar2 = new a() { // from class: o.ey.c$$ExternalSyntheticLambda9
            @Override // o.ey.c.a
            public final void onDone() {
                this.f$0.f(aVar);
            }
        };
        if (this.f25610s.get()) {
            int i4 = f25603v + 23;
            A = i4 % 128;
            if (i4 % 2 == 0) {
                this.f25608q.get();
                obj.hashCode();
                throw null;
            }
            if (!this.f25608q.get()) {
                aVar2.onDone();
                int i5 = f25603v + 39;
                A = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        this.f25612x.add(aVar2);
    }

    @Override // o.es.c
    public final /* synthetic */ void e(Activity activity, c.InterfaceC0350c interfaceC0350c, j jVar, o.ep.d dVar, o.es.e eVar, a.d dVar2, h hVar) throws Throwable {
        Object[] objArr = {this, activity, interfaceC0350c, jVar, dVar, eVar, dVar2, hVar};
        int i2 = f25596i * 1224533683;
        f25596i = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = f25599l * (-1893606999);
        f25599l = i3;
        int i4 = f25600m * 1109451091;
        f25600m = i4;
        e(i3, objArr, i4, i2, -1758152557, 1758152561, iFreeMemory);
    }

    @Override // o.es.c
    public final void e(final c.a<String> aVar) {
        int i2 = 2 % 2;
        a aVar2 = new a() { // from class: o.ey.c$$ExternalSyntheticLambda7
            @Override // o.ey.c.a
            public final void onDone() {
                this.f$0.g(aVar);
            }
        };
        if (this.f25610s.get()) {
            int i3 = A + 95;
            f25603v = i3 % 128;
            if (i3 % 2 != 0) {
                this.f25608q.get();
                throw null;
            }
            if (!this.f25608q.get()) {
                aVar2.onDone();
                int i4 = A + 49;
                f25603v = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                    return;
                }
                return;
            }
        }
        this.f25612x.add(aVar2);
    }
}
