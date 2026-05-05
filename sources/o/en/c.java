package o.en;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.WalletProvisioningCallback;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Random;
import o.a.l;
import o.a.o;
import o.bd.c;
import o.bf.a;
import o.ea.m;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements c.e, a.InterfaceC0340a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int A = 0;
    public static int B = 0;
    public static int C = 0;
    public static int D = 0;
    public static int E = 0;
    public static int F = 0;
    public static int G = 0;
    public static int H = 0;
    public static int I = 0;
    public static int J = 0;
    public static int K = 0;
    public static int L = 0;
    public static int M = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f24131a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f24132b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f24133c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f24134d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f24135f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f24136h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f24137j = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f24138q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static char[] f24139r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static long f24140s = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static int f24141u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f24142v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f24143w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f24144x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f24145y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f24146z = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    WalletProvisioningCallback f24147e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f24148g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24149i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o.bd.c f24150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f24151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o.bf.a f24152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f24153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o.c.a f24154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private HandlerThread f24155p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Handler f24156t;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r7, byte r8, short r9) {
        /*
            int r7 = 105 - r7
            byte[] r6 = o.en.c.$$c
            int r5 = r8 * 4
            int r1 = r5 + 1
            int r0 = r9 * 3
            int r4 = 4 - r0
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r6 != 0) goto L27
            r1 = r4
            r0 = r2
        L13:
            int r4 = r4 + 1
            int r7 = r7 + r1
            r1 = r0
        L17:
            byte r0 = (byte) r7
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r5) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L24:
            r1 = r6[r4]
            goto L13
        L27:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.c.$$g(int, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        M = 1667328039;
        L = -98652131;
        K = 1303571277;
        J = -417367709;
        I = -170641061;
        H = 1469224294;
        G = 1581967658;
        F = 2105475783;
        E = -852981877;
        D = -1842366697;
        C = 466942011;
        B = 46492264;
        A = -987026695;
        f24146z = -1110494514;
        f24144x = 1707464384;
        f24142v = -1872350791;
        init$0();
        f24136h = -849663788;
        f24137j = 1095076087;
        f24135f = -1464452091;
        f24131a = -149675773;
        f24134d = 605030958;
        f24133c = 899730971;
        f24132b = -792735903;
        f24143w = 0;
        f24141u = 1;
        f24138q = 0;
        f24145y = 1;
        d();
        ExpandableListView.getPackedPositionForChild(0, 0);
        Process.myPid();
        ViewConfiguration.getScrollBarSize();
        Color.blue(0);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getZoomControlsTimeout();
        View.MeasureSpec.getMode(0);
        Color.blue(0);
        Color.red(0);
        ViewConfiguration.getMaximumFlingVelocity();
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        int i2 = f24143w + 83;
        f24141u = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public c(Context context, WalletProvisioningCallback walletProvisioningCallback) throws Throwable {
        if (context == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr = new Object[1];
            N((char) (8028 - (KeyEvent.getMaxKeyCode() >> 16)), ViewConfiguration.getTouchSlop() >> 8, 7 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        this.f24148g = context;
        this.f24149i = false;
        this.f24147e = walletProvisioningCallback;
        this.f24154o = new o.c.a(context);
        b bVarC = b.c();
        this.f24151l = bVarC;
        if (bVarC.a()) {
            return;
        }
        bVarC.b(context);
    }

    private static void N(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $10 + 3;
            $11 = i6 % 128;
            if (i6 % i4 == 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f24139r[i2 << i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(KeyEvent.keyCodeFromString("") + 742, (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, 632508977, false, $$g((byte) ((-1) - (((-1) - $$f) | ((-1) - 30))), b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f24140s), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 766;
                        char cNormalizeMetaState = (char) (12470 - KeyEvent.normalizeMetaState(0));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 12;
                        byte b3 = (byte) ($$f & 29);
                        byte b4 = (byte) (b3 - 5);
                        objA2 = o.d.d.a(maximumFlingVelocity, cNormalizeMetaState, offsetBefore, 1946853218, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA3 = o.d.d.a(388 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, 39570797, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
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
                Object[] objArr5 = {Integer.valueOf(f24139r[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 741;
                    char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int mode = 12 - View.MeasureSpec.getMode(0);
                    int i10 = $$f;
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a(i9, c3, mode, 632508977, false, $$g((byte) ((i10 + 30) - (i10 | 30)), b7, b7), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f24140s), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 766;
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 12471);
                    int iRed = Color.red(0) + 12;
                    byte b8 = (byte) ($$f & 29);
                    byte b9 = (byte) (b8 - 5);
                    objA5 = o.d.d.a(fadingEdgeLength, cIndexOf, iRed, 1946853218, false, $$g(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA6 = o.d.d.a(387 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getEdgeSlop() >> 16), 18 - (KeyEvent.getMaxKeyCode() >> 16), 39570797, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            int i11 = $10 + 15;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objA7 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 388, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), 39570797, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private static void O(int i2, short s2, short s3, Object[] objArr) {
        int i3 = i2 * 4;
        int i4 = (s2 * 2) + 4;
        byte[] bArr = $$a;
        int i5 = 106 - s3;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i5 = i4 + i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i4];
                i4++;
                i5 += b2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void P(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r1 = r9 + 1
            int r7 = r7 + 97
            byte[] r6 = o.en.c.$$d
            int r0 = 60 - r8
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L28
            r1 = r0
            r7 = r9
            r3 = r4
        L10:
            int r0 = -r0
            int r7 = r7 + r0
            r0 = r1
            r2 = r3
        L14:
            int r1 = r0 + 1
            byte r0 = (byte) r7
            r5[r2] = r0
            int r3 = r2 + 1
            if (r2 != r9) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r10[r4] = r0
            return
        L25:
            r0 = r6[r1]
            goto L10
        L28:
            r2 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.c.P(short, short, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        Handler handler;
        final c cVar = (c) objArr[0];
        final o.bg.c cVar2 = (o.bg.c) objArr[1];
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24138q + 25;
            f24145y = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr2 = new Object[1];
            N((char) (35659 - View.MeasureSpec.getSize(0)), 7 - (ViewConfiguration.getPressedStateDuration() >> 16), 23 - TextUtils.indexOf("", "", 0, 0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            N((char) (30799 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2038, Gravity.getAbsoluteGravity(0, 0) + 23, objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
        }
        if (cVar.f24147e != null && (handler = cVar.f24153n) != null) {
            int i5 = f24138q + 115;
            f24145y = i5 % 128;
            if (i5 % 2 == 0) {
                Runnable runnable = new Runnable() { // from class: o.en.c$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(cVar2);
                    }
                };
                Class<?> cls = Class.forName(C1561oA.Qd("x\u0005y\u0007\u0003{u>~\u0002;Tlxmtlx", (short) (C1580rY.Xd() ^ (-15848))));
                Class<?>[] clsArr = {Class.forName(C1593ug.zd("\u0011\t\u001f\u000bX\u0018\u000e\u001c\u0016]\u0003'!\"\u0016\u0018#\u001d", (short) (FB.Xd() ^ 30253), (short) (FB.Xd() ^ 21742)))};
                Object[] objArr4 = {runnable};
                short sXd = (short) (C1499aX.Xd() ^ (-4165));
                int[] iArr = new int["a_bb".length()];
                QB qb = new QB("a_bb");
                int i6 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i6] = xuXd.fK(sXd + sXd + i6 + xuXd.CK(iKK));
                    i6++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i6), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr4);
                    throw null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Object[] objArr5 = {new Runnable() { // from class: o.en.c$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(cVar2);
                }
            }};
            Method method2 = Class.forName(C1626yg.Ud("\u0007cpwwt,?=#\u0001[a}R(xV", (short) (C1580rY.Xd() ^ (-11815)), (short) (C1580rY.Xd() ^ (-30601)))).getMethod(EO.Od("\f0h\f", (short) (C1499aX.Xd() ^ (-10019))), Class.forName(Ig.wd("S\u001c=J\u0006va=\u000b_\u0004K\u0015\u0019\u0006'{d", (short) (C1607wl.Xd() ^ 15568))));
            try {
                method2.setAccessible(true);
                method2.invoke(handler, objArr5);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(fr.antelop.sdk.EligibilityDenialReason r25, java.lang.String r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.c.a(fr.antelop.sdk.EligibilityDenialReason, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(o.bg.c cVar) {
        int i2 = 2 % 2;
        int i3 = f24138q + 57;
        f24145y = i3 % 128;
        int i4 = i3 % 2;
        this.f24147e.onCheckEligibilityError(o.by.c.b(cVar).a(), null);
        int i5 = f24138q + 47;
        f24145y = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(o.bg.c cVar) {
        int i2 = 2 % 2;
        int i3 = f24138q + 77;
        f24145y = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f24147e.onProvisioningError(o.by.c.b(cVar).a(), null);
            obj.hashCode();
            throw null;
        }
        this.f24147e.onProvisioningError(o.by.c.b(cVar).a(), null);
        int i4 = f24145y + 47;
        f24138q = i4 % 128;
        int i5 = i4 % 2;
    }

    private static boolean b(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24138q + 73;
        f24145y = i3 % 128;
        int i4 = i3 % 2;
        int i5 = m.f23563d * 691068131;
        m.f23563d = i5;
        int i6 = m.f23561b * (-1916120846);
        m.f23561b = i6;
        String str2 = (String) m.c(new Object[]{str}, (int) SystemClock.uptimeMillis(), i6, -327535505, i5, 327535505, Process.myUid());
        Object[] objArr = new Object[1];
        N((char) KeyEvent.getDeadChar(0, 0), 1495 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 9, objArr);
        boolean zMatches = str2.matches(((String) objArr[0]).intern());
        int i7 = f24138q + 33;
        f24145y = i7 % 128;
        int i8 = i7 % 2;
        return zMatches;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0a12, code lost:
    
        if ((r13 + 1998) >= ((java.lang.Long) java.lang.Class.forName(r26).getDeclaredMethod(r4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0da2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0b38  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object c(java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.c.c(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        c cVar = (c) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        List list = (List) objArr[2];
        int i2 = 2 % 2;
        int i3 = f24138q + 69;
        f24145y = i3 % 128;
        if (i3 % 2 == 0) {
            WalletProvisioningCallback walletProvisioningCallback = cVar.f24147e;
            int i4 = m.f23562c * (-1965719327);
            m.f23562c = i4;
            int iMyPid = Process.myPid();
            int iNextInt = new Random().nextInt();
            int i5 = m.f23560a * 1927323341;
            m.f23560a = i5;
            walletProvisioningCallback.onDeviceEligible(zBooleanValue, (List) m.c(new Object[]{list}, i5, iMyPid, -1045353435, i4, 1045353437, iNextInt), null);
            int i6 = 31 / 0;
        } else {
            WalletProvisioningCallback walletProvisioningCallback2 = cVar.f24147e;
            int i7 = m.f23562c * (-1965719327);
            m.f23562c = i7;
            int iMyPid2 = Process.myPid();
            int iNextInt2 = new Random().nextInt();
            int i8 = m.f23560a * 1927323341;
            m.f23560a = i8;
            walletProvisioningCallback2.onDeviceEligible(zBooleanValue, (List) m.c(new Object[]{list}, i8, iMyPid2, -1045353435, i7, 1045353437, iNextInt2), null);
        }
        int i9 = f24138q + 85;
        f24145y = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    static void d() {
        char[] cArr = new char[2151];
        ByteBuffer.wrap("\u008bí\u009d!¦\u0000ÏzÐKù¶\u0002\u009a\u001fð\t72\u0017[|DKm\u008e\u0096\u0098¿õ¨ÕÒ<û\räI\rK6¶_\u008fHðqÊ\u009b0\u0084\u0016\u00adwÖPÿ·è\u009e\u0094\u009b\u0082|¹[Ð&Ï\u001bæó\u001dÞ4»#\u0088Yw~\fhãSÙ:¨%\u0081\fb÷]ÞcÉ$³ã\u009aÃ\u0085¨l\u009fWZ>L)!\u0010\u0001úèåÙÌ\u009d·\u009f\u009eb\u0089[p$[\u001eEä,Â\u0017£þ\u0084écÐJÕ`Ã\u008fø¥\u0091Ó\u008eî§\b\\%u\u000fbn\u0018\u00921ï.òÇøü\u0012\u00955\u0082D»lQ¢N\u00adgÎ\u001câ5\nüâê\u000bÑ&¸W§t\u008e\u0082u£\\õKâ1\u0006\u0018+\u0007SînÕ\u008a¼¢\u0094\u0098\u0082s¹DÐ3Ï\\æþ\u001dÓ4¼#\u0095Y<pao+\u0086\u0001½æÔ×Ã¿\u0094\u009b\u0082v¹WÐ<Ï\u0006æû\u001dÆ4«#ºYspAo:\u00861½ýÔÖÃ·;©-F\u0016l\u007f\u001a`'IÁ²ì\u009bÆ\u008c©öXßxÀF)\t\u0012Ë{ül\u0081U¾¿A |\u0089\u0011ò\u001cÛÀÌú5\u008d\u001e©\u0000L\u0094\u0091\u0082g¹@Ð Ï\u0017æü\u001dÆ4\u0093#\u0082Ybp^o;\u0086\u0011½óÔÆÃ»ú\u009d\u0010|\u009dÇ\u008b3°OÙ`ÆOïµ\u0014\u0084=í*ÎP1yOfr\u008fE´ªÝÏÊåóÈ\u0019&\u0006\b/uT@}\u00adj\u0082\u0093à¸Ó¦%ÏOôR\u001dD\n¢3\u0094XóAÄo\u0015\u0094\u000e½jªDÓ¯ø³áä\u000eÒ44]\fJd\u0094\u0094\u0082`¹\u001cÐ3Ï\u001cææ\u001d×4¾#\u009dYbp\u001co!\u0086\u0016½ùÔ\u009cÃ¶ú\u009b\u0010u\u000f[&&]\u0013tþcÑ\u009a³±\u0080¯vÆ\u001cý\u0001\u0014\u0017\u0003ñ:ÇQ H\u0097fQ\u009dS´ £\u0016ÚÂñÇè¡\u0007\u009a=FT]C\u001bz\u0001\u0091á\u0088Ç§·Þ\u0080ô\\ãT\u001a11%(óGÞ~¾\u0095\u0097\u0083f\u0013z\u0005\u0098>³\u0094\u0091\u0082z¹WÐ1Ï\u0019æ×\u001dÞ4»#\u0095Y{pPo;\u0086\u001e½ûÔÆÃ«\u0094À\u0082#¹NÐdÏ\u000eæ \u001d\u00834®#ËYn\u0094Á\u0082\"¹nÐbÏ.æ§\u001dî\u0014\u0007\u0002ì9ÁP§O\u008ffA\u009dH´-£\u0003ÙíðÆï\u00ad\u0006\u0088=mTPC=zD\u0090©\u008f\u0084¦§Ý\u008côaãG\u001a/1\r/êFÃ}ä\u0094\u0081\u0083hºMÑ#È\rææ\u001dÍ4¨#\u008dZpq]hd\u0087\u000b½êÔ\u0084Ã¥úÄ\u0011j\bK'0^DtícÊ\u009a\u00ad±\u0090¨mÇEþ(\u0015\r\u0003þ:ÁQ HÄgi\u009eEµ*¬\u0005ÚãñÁè¶\u0007È>$UEL&{\u000b\u0091ö\u0088Ð§\u00adÞ\u008aõc\u0094\u0091\u0082z¹WÐ1Ï\u0019æ×\u001dÞ4»#\u0095Y{pPo;\u0086\u001e½ûÔÆÃ«úÒ\u0010?\u000f\u0012&?]\u0017tæcÚ\u009a½±\u0096¯2Æeý3\u0014\u001e\u0003þ:×Q¦H¢f`\u009d]´$£\u001bÚáñÛè½\u0007\u009c={T\\C5z\\\u0091û\u0088Ü§»Þ\u0086ô{ãS\u001a>1\u001b(èG×~ò\u0095\u009f\u0083gºAÑ&ÈRçð\u001e×5ò,\u0091Zsq^h>\u0087\u0017¾öÕ\u0092Ì°û\u0097\u0011t\b]' ^\u0017\u001f¢\tt2Y[9D\u0010má\u0096å¿§¨\u009aÒcû\\ä&\r\u001c6ú_ÛH¼q\u009b\u009brF\u008bP]kp\u0002\u0010\u001d94ÈÏÌæ\u008eñ³\u008bJ¢u½\u000fT5oÓ\u0006ò\u0011\u0095(²Â[Ý<ô\u0015\u008f/¦\u009c±òH\u0093c¨}\u001c\u0014u/\u0012Æ5ÑÈèõ\u0083\u009d\u009a°´UOff\u0019q8±j§\u0089\u009c´õÊêáÃ\u0014\u0094\u0091\u0082z¹WÐ1Ï\u0019æ×\u001dÞ4»#\u0095Y{pPo;\u0086\u001e½ûÔÆÃ«úÒ\u0010?\u000f\u0012&\u0013]\u001etàc×\u009a³±\u0096¯kÆ\u0012ý;\u0014\u001c\u0003²:ÂQ H\u009dfu\u009d@´7£\u0001Úáñ\u0092èÿ\u0007Ò=STPC=z\u0000\u0091æ÷Eá±ÚÍ³â¬Í\u00857~\u0006Wo@L:³\u0013Í\fðåÇÞ(·M g\u0099Js¤l\u008aE÷>Â\u0017/\u0000\u0000ùbÒQÌ§¥Í\u009eÇwÊ`$Y\n2w+B\u0005¯þ ×âÀÑ¹'\u0092G\u008b2ÜÂÊ/ñ\u001b\u0098`\u0087M®¦UÎ|£k\u008e\u0011\u000f8\r'zÎGõ¸\u009c\u008f\u008bú²ÇX!G\u0000n.\u0015m<¡+\u008aÒëù\u008eç\u0003\u008e\u0001µj\\KQ\u008eGL|{\u0015\u0006\n9#ÎØûñ\u0086æ \u009cAµLª\u0000C+xÊ\u0098L\u008e\u008eµ¹ÜÄÃûê\f\u001198D/bU\u0083|ícÎ\u008aâ±\tØ(Ï\rö~\u001c\u0085\u0003¢*ØQáx\tom\u0096O½h£ÍÊ¹ñÅ\u0018è\u000fM6|]\u001bD j\u008f\u0091´¸Ù¯èÖMý!äB\u000bc1\u008aXíOÌvÿ\u009d\u001f\u0084,«TÒ-ø\u009fï¨\u0016Ý=ÿ$\bK>rH\u0099c\u008f\u0099¶¤ÝÃÄêëM\u001299E hVÍ}¬dÎ\u008bù²\u0004Ù;ÀL÷y\u001d\u0084\u0004¢+ÃR\u00ady\u000e`\"\u0097I¾h¤ÍË¢òË\u0019\u00ad\u0000\f7m^ZElk\u0081\u0092¡¹È ù×Mþ.å_\fh2\u008cY¹@Èwé\u009eM\u0085\"¬CÓ-ù\u0099à¥\u0017È>\u00ad%\u000fL,sN\u009af\u0080\u0088·£ÞÉÅ\u00adì\u001d\u0013!:L!yW\u008b~¢eß\u008cà\u0094¿\u0082a¹[Ð!Ï\u0016æü\u008a-\u009cõ§ÒÎ³Ñ\u0098ø=\u0003S*(=\u0010GÿnØq¯\u0098Ý£pÊHÝ.ä\t\u000e½\u0011Î8©C\u009cjo}I\u0084}¯\n±ôØÉãµ\nÝ\u001d|$\u001dO\u007fVVx¿\u0083\u009dª¼½\u0093Äyï\u001dö0\u0019\b#îJÉ]ýd\u009e\u008fr\u0096S¹)À\u001cêôýÓ\u0004ý/\u009f6xYI`*\u008b\u0018\u009dø¤ÓÏýÖËù=\u0000\\+32\u0019D½o\u008cvè\u0099Ý yËTÒ:å\u0014\u000fé\u0016Î9ñ@ÝktrS\u0085}¬\u001b¶òÙÏà°\u000b\u009c\u0012i%\u001dL\u001bW\u0012yï\u0080Ð«¼²\u0089Å=ìx÷s\u001eL «K\u0089\u0094\u0094\u0082`¹\u001cÐ3Ï\u001cææ\u001d×4¾#\u009dYbp\u001co!\u0086\u0016½ùÔ\u009cÃ¶ú\u009b\u0010u\u000f[&&]\u0013tþcÑ\u009a³±\u0080¯vÆ\u001cý\u0011\u0014\u0013\u0003à:ÖQ\u0096H\u009bfa\u009dB´>£\u0013Úëñáè·\u0007\u0080=dT[C1z\u0017þ\u0003èùÓÄº¦¥\u0099\u008ccwY[³M^vj\u001f\u0011\u0000<)×Ò¿ûÒìÿ\u0096~¿j \u000bI0rÒ\u001bþ\f\u008b5¶ß\\À?é(\u0092>»Ó¬óU\u009a~«`\u001f\t\\2\rÛ:ÌÞõë\u009e\u0096\u0087°©QR?{2l0\u0015Û>ú\u0094±\u0082~¹[Ð7Ï\u001cææ\u001dû4¶\u000fä\u0019+\"\u000eKbTI}³\u0086Ç¯î¸ÃÂgë\nôr\u001dT&³OÇXäaÈ\u008b)\u0094\u0013½fÆNï©øÇ\u0001å*Â43]\u0010fb\u008fB\u0098©¡ÇÊ·Ó\u0087ý&\u0006\t/c8\u0007AôjÕs§\u009cÆ¦+Ï\u0017ØoáF\n©\u0013\u0092<êEÂo5x\u000e\u0081dª\u0007³¤Ü\u008fåæ\u000eÕ\u0018&!\u0004JsSB|µ\u0085\u0094®©õÔã\u0002Ø/±O®f\u0087\u0097|\u008aUÇÖ\u0010ÀÆûë\u0092\u008b\u008d¢¤S_'v\u000ea#\u001b\u00872ê-\u0092Ä´ÿS\u0096'\u0081\u0004¸(RÉMód\u0086\u001f®6I!'Ø\u0005ó\"íÓ\u0084ð¿\u0082V¢AIx'\u0013W\ng$Æßéö\u0083áç\u0098\u0014³5ªGE&\u007fË\u0016÷\u0001\u008f8¦ÓIÊrå\n\u009c\"¶Õ¡îX\u0084sçjD\u0005o<\u0006×5ÁÆøä\u0093\u0093\u008a¢¥U\\twI:¹,o\u0017^~>a\u0003Hä³Í\u009a¹\u008dº÷xÞEÁ,(\u0003\u0013æzÏm\u0083T\u008e.©8J\u0003tj\tu*\\Ô§ê\u008e\u008b\u0099´ãKÊt\u0094¡\u0082w¹FÐ&Ï\u001bæü\u001dÕ4¡#ÒYbp@o=\u0086\u0014½ûÔÞÃ·úÒ\u0010{\u000fV&r]\u001ftçcÁ\u009a¦±Ò¯qÆ]ý<\u0014\u0006\u0003ó:ÛQ¼HÒfp\u009dW´&£\u0005Ú÷ñ×è¼\u0007Ò=\"T\u0012C3z\u001c\u0091ö\u0088\u0092§áÞÀô2ãS\u001a>1\u0002(úGÓ~¼\u0095\u0087\u0083\u007fºWÑ È\u001bçñ\u001e\u00925±,\u009aZsq@h3\u0087\u0011¾æÕ×Ì û\u0081\u0011<\u0094\u0094\u0082`¹\u001cÐ3Ï\u001cææ\u001d×4¾#\u009dYbp\u001co!\u0086\u0016½ùÔ\u009cÃ¶ú\u009b\u0010u\u000f[&&]\u0013tþcÑ\u009a³±\u0080¯vÆ\u001cý\u0004\u0014\u001b\u0003à:ÆQ§H\u0093f~\u009dq´3£\u0000Úöñüè§\u0007\u009f=pTWC z=\u0091â\u0088Æ§»Þ\u009dô|ã\u0016\u001a\u00101\u0007(ûGÞ~¶\u0095\u0097\u0083`ºw¬\u009a\u0097®þÕáøÈ\u00133{\u001a\u0016\r;w²^¨AÈ¨î\u0093\u001eú)í\u001bÔz>\u0098!¯\bÒsíZ\u001aM/´R\u009ft\u0081\u0095èûÓÒ:ÿ-\u001e\u00145\u007fOfrH\u009d³²\u009aÞ\u008déô[ß:ÆU)\u007f\u0013Ûz¸mÔTÿ¿\u001e\u0094»\u0082a¹AÐ'Ï\u0017æà\u001dó4±#\u0086Y{pDo3\u0086\u0006½ûÔÝÃ¼ú»\u0010v\u0094»\u0082a¹AÐ'Ï\u0017æà\u001d\u00924\u0093#\u0091Yfp[o$\u0086\u0013½æÔÛÃ½ú\u009c\u00102\u000f{&6]RtÿcÇ\u009a¡±\u0086¯2ÆQý=\u0014\u001c\u0003æ:ÓQ»H\u009cf2\u009dP´7£\u0006Úåñ×è·\u0007\u009c=2T\u0002Crz\u0013\u0091ü\u0088Ö§òÞÃô\"ã\u0000\u001af1R(ðGË~¦\u0095\u0097\u0083<¸\u0000®Ú\u0095úü\u009cã¬Ê[1H\u0018\n\u000f=uÀ\\ÿC\u0088ª½\u0091@øfï\u0007Ö\n<Æ#í\n\u008c\u00834\u0095î®ÎÇ¨Ø\u0098ño\n\u001d#\u001c4\u001eNégÔx«\u0091\u009cªiÃTÔ2í\u0013\u0007½\u0018þ1²J\u0099cxt\u001d\u008d0¦\b¸îÑÉêý\u0003\u009e\u0014r-SF)_\u001cqô\u008aÓ£ý´\u009fÍxæIÿ*\u0010\u0018*øCÓTýmÍ\u0086=\u009f\\°3É\u0019ã½ô\u008c\rí&Ï?)P\u001di?\u0082\u0004\u0094é\u00adØÆó\u0094¬\u0082<¹IÐbÏ^æ¡\u001d\u00804¯#Ö\u0094\u0086\u0082`¹[Ð5Ï\u0015æ÷\u001dÀ4\u0082#\u0080Y}pDo;\u0086\u0001½ûÔÝÃ¼ú\u009b\u0010|\u000fU=\u0092+t\u0010Oy!f\u0001Oã´Ô\u009d\u0096\u008a\u0094ðiÙPÆ//\u0015\u0014ï}Éj¨S\u008f¹h¦A\u008ffôKÝ¦ÊÖ3´\u0018\u0089\u0006poOT5½\u000fªé\u0093Èø¯á\u0088Ïa4\u0006\u001d*\n\u0007sóXÈA¥®\u008e\u0094cýBêfÓ\t8è!\u0086\u000e§wÆ]hJI³2\u0098F\u0081ïîÈ×¯<\u0092*o\u0013Gx*a\u000fNü·Ã\u009c¢\u0085ÆókØGÁ(.\u0007\u0017á|Ãe´RÊ¸&¡G\u008e$÷\tÜôÅÒ2¯\u001b\u0088\u0001a\u0094\u0086\u0082`¹[Ð5Ï\u0015æ÷\u001dÀ4\u0082#\u0080Y}pDo;\u0086\u0001½ûÔÝÃ¼ú\u009b\u0010|\u000fU&r]_t²cß\u009a·±\u0086¯zÆ]ý6\u0014R\u0003Å:ÓQ¾H\u009efw\u009dF´\u0002£\u0000ÚýñÄè»\u0007\u0081={T]C<z\u001b\u0091ü\u0088Õ§üÞ\u009bô|ã[\u001a&1\u001b(óGÞ~»\u0095\u0088\u0083wº\u0012Ñ?È\u0007çá\u001eÆ5ò,\u0090Zwq\u0012h1\u0087\u0013¾þÕÞÌ·û\u0096\u00112\bP'7^\u0014uýlÀ\u009b·\u0094\u0082\u0082`¹]Ð$Ï\u001bæá\u001dÛ4½#\u009cY{p\\o5\u0086R½þÔÓÃ§ú\u009c\u0010q\u000fZ&7]\u0016t²cÅ\u009aº±\u009b¯~ÆWýr\u0014\u0013\u0003²:ÅQ³H\u009ef~\u009dW´&£RÚûñÁèò\u0007\u0093=~T@C7z\u0013\u0091ö\u0088Ë§òÞ\u0082ô`ã]\u001a$1\u001b(áGÛ~½\u0095\u009c\u0083wºVÑ~ÈRçó\u001eÐ5½,\u0080Zfq[h<\u0087\u0015\u0094¥\u0082s¹^Ð>Ï\u0017ææ\bÝ\u001e\u000b%&LFSoz\u009e\u0081ê¨Ã¿ùÅJì+óF\u001ax!\u008fH«_Îfó\u008cJ\u0093:ºXÁeè\u009cÿ£\u0006Ù-ã3\u0005Z$aO\u0088nÍ\u007fÛ\u0099à¢\u0089Ì\u0096ì¿\u000eD9m{zy\u0000\u0084)½6Âßøä\u0002\u008d$\u009aE£bI\u0085V¬\u007f\u008b\u0004¦-K:\nÃGèyö\u008e\u009fª¤ÏMòZKc\"\bE\u0011+?\u009bÄ¹íÄúì\u0083\u0019¨.±X^xdË\ræ\u001a\u008b#ÊÈ\tÑ$þY\u0087\u007f\"É4(\u000f6ftyIP°«\u008f\u0082õ\u0095Ïï)Æ\bÙo0H\u000b¡bµuãLÔ¦0¹\u000f\u0090eëCÂ\u0096Õ\u0083,è\u0007Â\u0019/p\bKaØèÎ\tõ\u0017\u009cU\u0083hª\u0091Q®xÔoî\u0015\b<)#NÊiñ\u0080\u0098\u0094\u008fÂ¶õ\\\u0011C.jD\u0011b8¤/¨ÖÊý÷ã\u000b\u008a\"±SXbO\u0083v\u0084\u001dÆ\u0004ë*\u000bÑ%øFïd\u0096\u008c\u0018\u008b\u000ej5t\\6C\u000bjò\u0091Í¸·¯\u008dÕküJã-\n\n1ãX÷O¡v\u0096\u009cr\u0083Mª'Ñ\u0001øÂïÅ\u0016\u00ad=\u0088#qJVq!\u0098'\u008få¶ÈÝ¨Ä\u0086êe\u0011G8//LV\u00ad}\u0084dé\u008bÄ±aØVÏ6ö\u000b\u001dö\u0004\u0099+\u009f(\u0006>êÝï±Ô§5\u009c?õ~êMÃ²8\u0098\u0011þ\u0006þ|7U\u0012J|£R\u0098¹ñ\u0097æþß\u00975{*\u001d\u0003|xKQûF\u009a¿î\u0094Ï\u008a3ã\u0014Øi1R&¡\u001f\u009etÿm\u009bC{\u0094\u009d\u0082|¹vÐ7Ï\u0004æû\u001dÑ4·#¼Y}pFo\u0017\u0086\u001e½ûÔÕÃ»ú\u0090\u0010~\u000fW&~]Rtàc×\u009a³±\u0081¯}Æ\\ýr\u0014H\u0003²\u0094Ò\u00822¹\u0012ÐrÏ\u0016æ÷\u001dÜ4»#\u0093Y~p`o7\u0086\u0014½÷ÔÀÃ·ú\u009c\u0010q\u000fW&h]RìÒú3Á>¨u·X\u009e¾e\u0096LØ[Ñ!4\b\u001a\u0017tþ_Å´¬\u0091»ô\u0082Éh$w8^o%O\f²\u001b\u008fn\u0001xõC\u0089*¦5\u0089\u001csçBÎ+Ù\b£÷\u008a\u0089\u0095´|\u0083Gl.\t9#\u0000\u000eêàõÎÜ³§\u0086\u008ek\u0099D`&K\u0015Uã<\u0089\u0007\u0091î\u008eùuÀS«2²\u0006\u009cëgäN¦Y\u0095 c\u000bi\u00122ý\nÇå®Â¹µ\u0080 kbrI]\"$\u0015\u000eæ\u0019Óà¨Ë\u0095ïKù¬Â\u0099«ê´Ì\u009d1f\u0016O\u007fX\u0018\"¹\u000b\u008b\u0014áýÖÆ;¯\u0010¸j\u0081Wk¶t\u0097]í&Ë\u000fx\u0018\u0011ávÊQÔ¬½\u0091\u0086ùoÔx1A\u0002*y3L\u001d±æ\u0097Ïö".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2151);
        f24139r = cArr;
        f24140s = 7264623659396727314L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z2, List list) {
        Object[] objArr = {this, Boolean.valueOf(z2), list};
        int iMyUid = Process.myUid();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = f24136h * 191892572;
        f24136h = i2;
        e(iMyUid, iFreeMemory, 673922520, i2, new Random().nextInt(), -673922517, objArr);
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~((-1) - (((-1) - (~i7)) & ((-1) - i4)));
        int i9 = ~i2;
        int i10 = ~((i9 + i4) - (i9 & i4));
        int i11 = (i8 + i10) - (i8 & i10);
        int i12 = ~((-1) - (((-1) - (~i4)) & ((-1) - i7)));
        int i13 = (-1) - (((-1) - i10) & ((-1) - ((i12 + i8) - (i12 & i8))));
        int i14 = i4 + i7 + i3 + ((-1814252664) * i5) + (2073254503 * i6);
        int i15 = i14 * i14;
        int i16 = ((-223937157) * i4) + 1943797760 + (1745420935 * i7) + (i11 * 1162804602) + (1162804602 * i8) + ((-1162804602) * i13) + ((-1386741760) * i3) + ((-1631584256) * i5) + ((-1368915968) * i6) + ((-1053032448) * i15);
        int i17 = (i4 * (-1919122223)) + 1408767311 + (i7 * (-1919121035)) + (i11 * (-594)) + (i8 * (-594)) + (i13 * 594) + (i3 * (-1919121629)) + (i5 * (-390511720)) + (i6 * 1804971285) + (i15 * 255066112);
        int i18 = i16 + (i17 * i17 * 379846656);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? c(objArr) : d(objArr) : a(objArr) : e(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x115b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x12f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x133a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.c.e(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004f A[PHI: r3
  0x004f: PHI (r3v9 java.lang.String) = (r3v2 java.lang.String), (r3v13 java.lang.String) binds: [B:15:0x0159, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(o.be.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.c.e(o.be.c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        int i2 = 2 % 2;
        int i3 = f24145y + 53;
        f24138q = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f24147e.onProvisioningSuccess(null);
            obj.hashCode();
            throw null;
        }
        this.f24147e.onProvisioningSuccess(null);
        int i4 = f24138q + 49;
        f24145y = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        int i2 = 2 % 2;
        int i3 = f24138q + 51;
        f24145y = i3 % 128;
        int i4 = i3 % 2;
        this.f24147e.onProvisioningPending(null);
        int i5 = f24138q + 101;
        f24145y = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24138q + 117;
            f24145y = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            N((char) (35658 - ImageFormat.getBitsPerPixel(0)), 7 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - ExpandableListView.getPackedPositionType(0L), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            N((char) (31690 - (ViewConfiguration.getPressedStateDuration() >> 16)), TextUtils.getOffsetBefore("", 0) + 2115, 36 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f24145y + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f24138q = i5 % 128;
            int i6 = i5 % 2;
        }
        if (o.bw.a.a(this.f24148g).isEmpty()) {
            this.f24149i = true;
            Handler handler = this.f24153n;
            Object[] objArr3 = {new Runnable() { // from class: o.en.c.3
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f24163a = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int[] f24164c = null;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f24165d = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0018). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(byte r6, int r7, int r8) {
                    /*
                        int r2 = r8 * 4
                        int r1 = 1 - r2
                        int r0 = r7 * 2
                        int r8 = 121 - r0
                        int r0 = r6 * 4
                        int r7 = r0 + 4
                        byte[] r6 = o.en.c.AnonymousClass3.$$a
                        byte[] r5 = new byte[r1]
                        r4 = 0
                        int r3 = 0 - r2
                        if (r6 != 0) goto L30
                        r1 = r7
                        r0 = r3
                        r2 = r4
                    L18:
                        int r7 = r7 + r0
                        int r0 = r1 + 1
                        r1 = r2
                        r8 = r7
                        r7 = r0
                    L1e:
                        byte r0 = (byte) r8
                        r5[r1] = r0
                        int r2 = r1 + 1
                        if (r1 != r3) goto L2b
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        return r0
                    L2b:
                        r0 = r6[r7]
                        r1 = r7
                        r7 = r8
                        goto L18
                    L30:
                        r1 = r4
                        goto L1e
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.en.c.AnonymousClass3.$$c(byte, int, int):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f24163a = 0;
                    f24165d = 1;
                    f24164c = new int[]{267960821, -237254446, 1832419500, 1760878540, 962787718, -548691370, 1465018667, -470844155, -1384491893, -1541388862, -139855692, 2035214369, 844130348, 1699395301, -424252273, 1756656365, -1913785166, 469119108};
                }

                private static void e(int[] iArr, int i7, Object[] objArr4) throws Throwable {
                    int length;
                    int[] iArr2;
                    int i8;
                    int i9 = 2 % 2;
                    l lVar = new l();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr3 = f24164c;
                    char c2 = '0';
                    int i10 = 989264422;
                    long j2 = 0;
                    int i11 = 0;
                    if (iArr3 != null) {
                        int i12 = $11 + 73;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            length = iArr3.length;
                            iArr2 = new int[length];
                            i8 = 1;
                        } else {
                            length = iArr3.length;
                            iArr2 = new int[length];
                            i8 = 0;
                        }
                        while (i8 < length) {
                            try {
                                Object[] objArr5 = {Integer.valueOf(iArr3[i8])};
                                Object objA = o.d.d.a(i10);
                                if (objA == null) {
                                    byte b2 = (byte) i11;
                                    byte b3 = b2;
                                    objA = o.d.d.a(ExpandableListView.getPackedPositionGroup(j2) + 675, (char) (TextUtils.indexOf("", c2) + 1), 12 - (ExpandableListView.getPackedPositionForGroup(i11) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(i11) == j2 ? 0 : -1)), -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                iArr2[i8] = ((Integer) ((Method) objA).invoke(null, objArr5)).intValue();
                                i8++;
                                c2 = '0';
                                i10 = 989264422;
                                j2 = 0;
                                i11 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        int i13 = $11 + 5;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        iArr3 = iArr2;
                    }
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = f24164c;
                    if (iArr5 != null) {
                        int i15 = $11 + 87;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        for (int i17 = 0; i17 < length3; i17++) {
                            Object[] objArr6 = {Integer.valueOf(iArr5[i17])};
                            Object objA2 = o.d.d.a(989264422);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 674, (char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.getCapsMode("", 0, 0) + 12, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            iArr6[i17] = ((Integer) ((Method) objA2).invoke(null, objArr6)).intValue();
                        }
                        iArr5 = iArr6;
                    }
                    char c3 = 0;
                    System.arraycopy(iArr5, 0, iArr4, 0, length2);
                    lVar.f19941d = 0;
                    while (lVar.f19941d < iArr.length) {
                        cArr[c3] = (char) (iArr[lVar.f19941d] >> 16);
                        cArr[1] = (char) iArr[lVar.f19941d];
                        cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                        cArr[3] = (char) iArr[lVar.f19941d + 1];
                        lVar.f19942e = (cArr[0] << 16) + cArr[1];
                        lVar.f19940a = (cArr[2] << 16) + cArr[3];
                        l.a(iArr4);
                        for (int i18 = 0; i18 < 16; i18++) {
                            lVar.f19942e ^= iArr4[i18];
                            Object[] objArr7 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                            Object objA3 = o.d.d.a(2098218801);
                            if (objA3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                objA3 = o.d.d.a(302 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 52696), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1416256172, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr7)).intValue();
                            lVar.f19942e = lVar.f19940a;
                            lVar.f19940a = iIntValue;
                        }
                        int i19 = lVar.f19942e;
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = i19;
                        lVar.f19940a ^= iArr4[16];
                        lVar.f19942e ^= iArr4[17];
                        int i20 = lVar.f19942e;
                        int i21 = lVar.f19940a;
                        cArr[0] = (char) (lVar.f19942e >>> 16);
                        cArr[1] = (char) lVar.f19942e;
                        cArr[2] = (char) (lVar.f19940a >>> 16);
                        cArr[3] = (char) lVar.f19940a;
                        l.a(iArr4);
                        cArr2[lVar.f19941d * 2] = cArr[0];
                        cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                        cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                        cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                        Object[] objArr8 = {lVar, lVar};
                        Object objA4 = o.d.d.a(986820978);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 2);
                            objA4 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 229, (char) (51003 - TextUtils.indexOf((CharSequence) "", '0', 0)), Drawable.resolveOpacity(0, 0) + 9, -330018025, false, $$c(b8, b9, (byte) (b9 - 2)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr8);
                        c3 = 0;
                    }
                    objArr4[0] = new String(cArr2, 0, i7);
                }

                static void init$0() {
                    $$a = new byte[]{17, -84, -78, -70};
                    $$b = 238;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i7 = 2 % 2;
                    int i8 = f24163a + 15;
                    f24165d = i8 % 128;
                    Object obj = null;
                    if (i8 % 2 == 0) {
                        o.ea.f.a();
                        obj.hashCode();
                        throw null;
                    }
                    if (o.ea.f.a()) {
                        Object[] objArr4 = new Object[1];
                        e(new int[]{665011009, -2094926086, 125966559, -150200469, -648240099, -650997042, 1840646740, 714935948, -1259211297, -802336209, -1579903991, -1992552421}, 23 - Color.green(0), objArr4);
                        String strIntern2 = ((String) objArr4[0]).intern();
                        Object[] objArr5 = new Object[1];
                        e(new int[]{2963899, 1302774883, -257393090, 2071033070, -1584230774, 2039223527, -254322224, 1537265420, -345365447, -1028690964, 763432550, 1680741650, 820082564, 1330091109, -109280707, -2120010905, -374339799, -395756303}, 34 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
                        o.ea.f.c(strIntern2, ((String) objArr5[0]).intern());
                        int i9 = f24165d + 23;
                        f24163a = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    if (c.this.f24147e != null) {
                        c.this.f24147e.onInitializationSuccess(null);
                    }
                }
            }};
            Method method = Class.forName(EO.Od(")\u000e\u00064j\tg\u001a\u000e6`bKL@0no", (short) (C1499aX.Xd() ^ (-10473)))).getMethod(C1593ug.zd("\u0015\u0015\u001a\u001c", (short) (OY.Xd() ^ 32640), (short) (OY.Xd() ^ 7242)), Class.forName(C1561oA.Qd("XNbL\u0018UIUM\u00136XPOAAJB", (short) (Od.Xd() ^ (-12517)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr3);
                this.f24155p.quitSafely();
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Handler handler2 = this.f24153n;
        Runnable runnable = new Runnable() { // from class: o.en.c.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static final int $$f = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f24157a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char f24158b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f24159c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long f24160d = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f24161g = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0011). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$g(short r9, short r10, byte r11) {
                /*
                    byte[] r8 = o.en.c.AnonymousClass1.$$c
                    int r7 = r11 + 65
                    int r6 = r9 + 4
                    int r0 = r10 * 4
                    int r5 = 1 - r0
                    byte[] r4 = new byte[r5]
                    r3 = 0
                    if (r8 != 0) goto L26
                    r0 = r5
                    r2 = r3
                L11:
                    int r0 = -r0
                    int r7 = r7 + r0
                    r1 = r2
                L14:
                    int r2 = r1 + 1
                    byte r0 = (byte) r7
                    r4[r1] = r0
                    int r6 = r6 + 1
                    if (r2 != r5) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L23:
                    r0 = r8[r6]
                    goto L11
                L26:
                    r1 = r3
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: o.en.c.AnonymousClass1.$$g(short, short, byte):java.lang.String");
            }

            static {
                init$2();
                $10 = 0;
                $11 = 1;
                init$1();
                init$0();
                f24157a = 0;
                f24161g = 1;
                f24160d = 1516421522616174L;
                f24159c = 1564493270;
                f24158b = (char) 17878;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void f(int r8, int r9, byte r10, java.lang.Object[] r11) {
                /*
                    byte[] r7 = o.en.c.AnonymousClass1.$$a
                    int r0 = r10 * 3
                    int r6 = r0 + 98
                    int r2 = r9 * 2
                    int r1 = 1 - r2
                    int r0 = r8 * 3
                    int r5 = 4 - r0
                    byte[] r4 = new byte[r1]
                    r3 = 0
                    int r2 = 0 - r2
                    if (r7 != 0) goto L2d
                    r0 = r6
                    r1 = r3
                    r6 = r2
                L18:
                    int r5 = r5 + 1
                    int r6 = r6 + r0
                L1b:
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    if (r1 != r2) goto L28
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r11[r3] = r0
                    return
                L28:
                    int r1 = r1 + 1
                    r0 = r7[r5]
                    goto L18
                L2d:
                    r1 = r3
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: o.en.c.AnonymousClass1.f(int, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void h(char r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 588
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.en.c.AnonymousClass1.h(char, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void i(short r8, byte r9, short r10, java.lang.Object[] r11) {
                /*
                    byte[] r7 = o.en.c.AnonymousClass1.$$d
                    int r2 = r8 * 7
                    int r1 = 8 - r2
                    int r0 = r9 * 7
                    int r6 = 10 - r0
                    int r5 = r10 + 99
                    byte[] r4 = new byte[r1]
                    int r3 = 7 - r2
                    r2 = 0
                    if (r7 != 0) goto L2d
                    r0 = r3
                    r1 = r2
                L15:
                    int r0 = -r0
                    int r5 = r5 + r0
                    int r5 = r5 + (-5)
                L19:
                    byte r0 = (byte) r5
                    int r6 = r6 + 1
                    r4[r1] = r0
                    if (r1 != r3) goto L28
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r2)
                    r11[r2] = r0
                    return
                L28:
                    int r1 = r1 + 1
                    r0 = r7[r6]
                    goto L15
                L2d:
                    r1 = r2
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.en.c.AnonymousClass1.i(short, byte, short, java.lang.Object[]):void");
            }

            static void init$0() {
                $$a = new byte[]{Ascii.EM, -77, -1, MessagePack.Code.INT8};
                $$b = 240;
            }

            static void init$1() {
                $$d = new byte[]{34, -117, -98, -86, 60, MessagePack.Code.BIN8, -15, 60, MessagePack.Code.EXT16, 56, -21};
                $$e = 33;
            }

            static void init$2() {
                $$c = new byte[]{116, 109, 87, -103};
                $$f = JfifUtil.MARKER_RST7;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x02c9  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x091f  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2741
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.en.c.AnonymousClass1.run():void");
            }
        };
        Class<?> cls = Class.forName(C1561oA.od("DPERNGA\nJM\u0007 8D9@8D", (short) (OY.Xd() ^ 12183)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (OY.Xd() ^ 27013);
        int[] iArr = new int["ME[G\u0015TJXR\u001a?c]^RT_Y".length()];
        QB qb = new QB("ME[G\u0015TJXR\u001a?c]^RT_Y");
        int i7 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i7] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i7));
            i7++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i7));
        Object[] objArr4 = {runnable};
        Method method2 = cls.getMethod(Wg.Zd(" \u0016\u0013g", (short) (OY.Xd() ^ 23235), (short) (OY.Xd() ^ 10015)), clsArr);
        try {
            method2.setAccessible(true);
            method2.invoke(handler2, objArr4);
            this.f24155p.quitSafely();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static void init$0() {
        $$a = new byte[]{Ascii.EM, -93, 95, -122};
        $$b = 36;
    }

    static void init$1() {
        $$d = new byte[]{47, MessagePack.Code.BIN8, Ascii.FS, 43, 65, MessagePack.Code.UINT16, 0, 51, MessagePack.Code.UINT8, 62, -16, 65, -75, 75, MessagePack.Code.EXT32, 65, -14, 65, MessagePack.Code.UINT16, 0, 51, MessagePack.Code.UINT8, 62, -13, 65, MessagePack.Code.EXT32, -13, 68, MessagePack.Code.FLOAT32, 64, -16, 65, MessagePack.Code.UINT16, -15, 66, MessagePack.Code.BIN32, 68, -65, 65, MessagePack.Code.FLOAT32, 2, 52, MessagePack.Code.FLOAT64, 65, MessagePack.Code.EXT32, -11, 66, MessagePack.Code.BIN16, 69, -13, 65, -75, 75, -65, 75, -14, 65, MessagePack.Code.EXT32, -19, 74, MessagePack.Code.UINT8, 65, MessagePack.Code.UINT16, -15, 66, MessagePack.Code.EXT32, 65, MessagePack.Code.FALSE};
        $$e = 120;
    }

    static void init$2() {
        $$c = new byte[]{100, 68, -66, 16};
        $$f = 39;
    }

    @Override // o.bd.c.e
    public final void a() throws Throwable {
        Handler handler;
        int i2 = 2 % 2;
        int i3 = f24145y + 51;
        f24138q = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            int i4 = f24138q + 49;
            f24145y = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            N((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 35659), View.MeasureSpec.getMode(0) + 7, 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            N((char) ((-16730540) - Color.rgb(0, 0, 0)), Color.red(0) + 1837, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (this.f24147e != null && (handler = this.f24153n) != null) {
            Object[] objArr3 = {new Runnable() { // from class: o.en.c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.g();
                }
            }};
            Method method = Class.forName(C1561oA.Xd("\u001f-$31,(r5:u\u0011+9093A", (short) (C1607wl.Xd() ^ 28847))).getMethod(Qg.kd("NLOO", (short) (OY.Xd() ^ 23878), (short) (OY.Xd() ^ 11778)), Class.forName(Wg.vd("*\"4 q1#1\u001ff\b,*+\u001b\u001d<6", (short) (C1633zX.Xd() ^ (-24962)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr3);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        int i6 = f24145y + 103;
        f24138q = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0da7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.c.a(boolean):void");
    }

    @Override // o.bd.c.e
    public final void b() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24145y + 9;
            f24138q = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            N((char) ((Process.myTid() >> 22) + 35659), 7 - TextUtils.getOffsetBefore("", 0), 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            N((char) (19573 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 1866, TextUtils.lastIndexOf("", '0', 0, 0) + 39, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f24145y + 31;
            f24138q = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f24150k = null;
        if (this.f24147e != null) {
            int i7 = f24138q + 99;
            int i8 = i7 % 128;
            f24145y = i8;
            int i9 = i7 % 2;
            Handler handler = this.f24153n;
            if (handler != null) {
                int i10 = i8 + 69;
                f24138q = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr3 = {new Runnable() { // from class: o.en.c$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.f();
                    }
                }};
                Method method = Class.forName(ZO.xd("\u0018F= \u0017p4u\u0010z6&\n\u007f0j'\u0003", (short) (C1499aX.Xd() ^ (-5214)), (short) (C1499aX.Xd() ^ (-12155)))).getMethod(Ig.wd("\u0016G=\"", (short) (C1580rY.Xd() ^ (-746))), Class.forName(C1626yg.Ud("z\fvE)I]\rqFvxdnD\u0010\u0010C", (short) (ZN.Xd() ^ 17904), (short) (ZN.Xd() ^ 24323))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr3);
                    int i12 = f24145y + 87;
                    f24138q = i12 % 128;
                    int i13 = i12 % 2;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        int i14 = f24138q + 45;
        f24145y = i14 % 128;
        int i15 = i14 % 2;
    }

    public final void b(String str, String str2, String str3, String str4) throws WalletValidationException {
        int i2 = f24132b * (-1890353728);
        f24132b = i2;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int id = (int) Thread.currentThread().getId();
        int i3 = f24133c * 956349974;
        f24133c = i3;
        e(i2, iUptimeMillis, 1608409044, id, i3, -1608409044, new Object[]{this, str, str2, str3, str4});
    }

    public final void c() throws Throwable {
        int i2 = 2 % 2;
        boolean zA = o.ea.f.a();
        String strOd = EO.Od("L\u001e7HK\u000e`z\u000b'W8r", (short) (C1633zX.Xd() ^ (-24494)));
        String strQd = C1561oA.Qd("=_V\u000e:MYKPMY", (short) (C1580rY.Xd() ^ (-28436)));
        if (zA) {
            o.ea.f.c(strQd, strOd);
        }
        int i3 = o.ea.f.f23511d * (-498977415);
        o.ea.f.f23511d = i3;
        int i4 = o.ea.f.f23512e * 620257954;
        o.ea.f.f23512e = i4;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = o.ea.f.f23515h * 1539730836;
        o.ea.f.f23515h = i5;
        o.ea.f.d(i3, i4, new Object[0], 1138136590, iFreeMemory, -1138136589, i5);
        if (o.ea.f.a()) {
            int i6 = f24138q + 7;
            f24145y = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            N((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35658), 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            N((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 30, ExpandableListView.getPackedPositionChild(0L) + 11, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i8 = f24138q + 113;
            f24145y = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 5;
            }
        }
        if (o.ea.f.a()) {
            o.ea.f.c(strQd, strOd);
            int i10 = f24145y + 121;
            f24138q = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = o.ea.f.f23511d * (-498977415);
        o.ea.f.f23511d = i12;
        int i13 = o.ea.f.f23512e * 620257954;
        o.ea.f.f23512e = i13;
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i14 = o.ea.f.f23515h * 1539730836;
        o.ea.f.f23515h = i14;
        o.ea.f.d(i12, i13, new Object[0], 1138136590, iFreeMemory2, -1138136589, i14);
        this.f24153n = new o.ea.e();
        Object[] objArr3 = new Object[1];
        N((char) (60063 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.MeasureSpec.getSize(0) + 40, (ViewConfiguration.getPressedStateDuration() >> 16) + 31, objArr3);
        HandlerThread handlerThread = new HandlerThread(((String) objArr3[0]).intern());
        this.f24155p = handlerThread;
        handlerThread.start();
        o.ea.e eVar = new o.ea.e(this.f24155p.getLooper());
        this.f24156t = eVar;
        Object[] objArr4 = {new Runnable() { // from class: o.en.c$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.h();
            }
        }};
        Method method = Class.forName(C1593ug.zd("`netrmi4v{7Rlzqzt\u0003", (short) (ZN.Xd() ^ 27136), (short) (ZN.Xd() ^ 21496))).getMethod(C1561oA.Kd("NNSU", (short) (OY.Xd() ^ 16360)), Class.forName(C1561oA.od("(\u001e2\u001cg%\u0019%\u001db\u0006( \u001f\u0011\u0011\u001a\u0012", (short) (OY.Xd() ^ 31314))));
        try {
            method.setAccessible(true);
            method.invoke(eVar, objArr4);
            int i15 = f24138q + 51;
            f24145y = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 63 / 0;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @Override // o.bf.a.InterfaceC0340a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final fr.antelop.sdk.EligibilityDenialReason r17, final java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.c.c(fr.antelop.sdk.EligibilityDenialReason, java.lang.String):void");
    }

    @Override // o.bd.c.e
    public final void d(final o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24145y + 23;
        f24138q = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            N((char) (35659 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 7, 23 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            N((char) ((-16741354) - Color.rgb(0, 0, 0)), TextUtils.indexOf("", "") + 1903, TextUtils.getOffsetAfter("", 0) + 48, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(cVar.c());
            Object[] objArr3 = new Object[1];
            N((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48343), KeyEvent.normalizeMetaState(0) + 1951, TextUtils.getOffsetAfter("", 0) + 2, objArr3);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr3[0]).intern()).append(cVar.a());
            Object[] objArr4 = new Object[1];
            N((char) (18752 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1953 - TextUtils.getOffsetAfter("", 0), -TextUtils.indexOf((CharSequence) "", '0', 0), objArr4);
            o.ea.f.c(strIntern, sbAppend2.append(((String) objArr4[0]).intern()).toString());
        }
        b.c().d(this.f24148g);
        this.f24150k = null;
        if (this.f24147e != null) {
            int i5 = f24138q + 101;
            f24145y = i5 % 128;
            int i6 = i5 % 2;
            Handler handler = this.f24153n;
            if (handler != null) {
                Object[] objArr5 = {new Runnable() { // from class: o.en.c$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(cVar);
                    }
                }};
                Method method = Class.forName(Qg.kd("\r\u0019\u000e\u001b\u0017\u0010\nR\u0013\u0016Oh\u0001\r\u0002\t\u0001\r", (short) (C1633zX.Xd() ^ (-18431)), (short) (C1633zX.Xd() ^ (-19434)))).getMethod(C1561oA.ud("rpss", (short) (C1499aX.Xd() ^ (-14930))), Class.forName(hg.Vd("6,@*u3'3+p\u00146.-\u001f\u001f( ", (short) (C1607wl.Xd() ^ 9301), (short) (C1607wl.Xd() ^ 15500))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr5);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x11aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x11b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(byte[] r33, java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.c.d(byte[], java.lang.String):void");
    }

    public final void d(byte[] bArr, byte[] bArr2, String str) throws WalletValidationException {
        int i2 = f24134d * 1983697243;
        f24134d = i2;
        int i3 = f24131a * 371408299;
        f24131a = i3;
        int i4 = f24135f * 1312754674;
        f24135f = i4;
        int i5 = f24137j * 1205498855;
        f24137j = i5;
        e(i2, i3, 85554313, i4, i5, -85554312, new Object[]{this, bArr, bArr2, str});
    }

    public final void e() throws Throwable {
        int i2 = 2 % 2;
        this.f24147e = null;
        o.bd.c cVar = this.f24150k;
        if (cVar != null) {
            int i3 = f24138q + 95;
            f24145y = i3 % 128;
            int i4 = i3 % 2;
            cVar.f();
        }
        o.bf.a aVar = this.f24152m;
        if (aVar != null) {
            int i5 = f24145y + 21;
            f24138q = i5 % 128;
            int i6 = i5 % 2;
            aVar.o();
        }
        HandlerThread handlerThread = this.f24155p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    @Override // o.bf.a.InterfaceC0340a
    public final void e(o.bg.c cVar) {
        e(Thread.activeCount(), (int) Runtime.getRuntime().freeMemory(), -2002549625, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 2002549627, new Object[]{this, cVar});
    }

    @Override // o.bf.a.InterfaceC0340a
    public final void e(final boolean z2, final List<e> list) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            N((char) (35659 - View.MeasureSpec.getMode(0)), 6 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            N((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 9545), Drawable.resolveOpacity(0, 0) + 1954, 34 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(z2).toString());
        }
        if (this.f24147e != null) {
            int i3 = f24138q + 61;
            f24145y = i3 % 128;
            int i4 = i3 % 2;
            Handler handler = this.f24153n;
            if (handler != null) {
                Runnable runnable = new Runnable() { // from class: o.en.c$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(z2, list);
                    }
                };
                short sXd = (short) (C1580rY.Xd() ^ (-23812));
                int[] iArr = new int["\u0012Qs,v\u001b<,&\r?E\u000f\u00188!@Y".length()];
                QB qb = new QB("\u0012Qs,v\u001b<,&\r?E\u000f\u00188!@Y");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd + i5)));
                    i5++;
                }
                Object[] objArr3 = {runnable};
                Method method = Class.forName(new String(iArr, 0, i5)).getMethod(C1561oA.Qd("\u0017\u0015\u0018\u0018", (short) (C1580rY.Xd() ^ (-16240))), Class.forName(EO.Od("\u0004S,rVjw\u001cX~\u0019&npS:\u001a\u0011", (short) (C1580rY.Xd() ^ (-27938)))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr3);
                    int i6 = f24145y + 105;
                    f24138q = i6 % 128;
                    int i7 = i6 % 2;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }
}
