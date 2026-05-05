package o.r;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.a.h;
import o.a.j;
import o.a.q;
import o.ea.f;
import o.ea.m;
import o.l.c;
import o.l.d;
import o.m.n;
import o.o.c$$ExternalSyntheticBackport0;
import o.r.a;
import o.r.e;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int B = 0;
    private static char[] D = null;
    private static int E = 0;
    private static short[] F = null;
    private static int G = 0;
    private static int H = 0;
    private static byte[] I = null;
    public static int J = 0;
    private static int K = 0;
    private static int N = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f26733k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f26734l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f26735m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f26736n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f26737p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f26738q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f26739r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f26740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f26741t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f26742u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f26743v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f26744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f26745z = 0;
    private final n A;
    private final String C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f26746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f26747x;

    /* JADX INFO: renamed from: o.r.a$2, reason: invalid class name */
    final class AnonymousClass2 implements o.l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f26748a = -181397931;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f26749b = -1118633713;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f26750c = -2145512299;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f26751d = -1591163344;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f26752e = 1378433451;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f26753i = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f26754n = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Handler f26755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ o.l.a f26756g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ HandlerThread f26757h;

        AnonymousClass2(Handler handler, o.l.a aVar, HandlerThread handlerThread) {
            this.f26755f = handler;
            this.f26756g = aVar;
            this.f26757h = handlerThread;
        }

        public static /* synthetic */ Object a(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i7;
            int i9 = ~((-1) - (((-1) - ((-1) - (((-1) - (~i6)) & ((-1) - i8)))) & ((-1) - i3)));
            int i10 = ~i3;
            int i11 = (~((i8 + i10) - (i8 & i10))) | (~(i3 | i6));
            int i12 = (~(i6 | i7)) | i3;
            int i13 = i3 + i7 + i4 + ((-407681510) * i5) + ((-298114539) * i2);
            int i14 = i13 * i13;
            int i15 = ((-1498977624) * i3) + 672923648 + (2103481690 * i7) + (i9 * 346253991) + (346253991 * i11) + ((-346253991) * i12) + ((-1845231616) * i4) + ((-328728576) * i5) + ((-2108424192) * i2) + ((-1296629760) * i14);
            int i16 = ((i3 * 57881544) - 1472685786) + (i7 * 57881954) + (i9 * (-205)) + (i11 * (-205)) + (i12 * 205) + (i4 * 57881749) + (i5 * 289608994) + (i2 * 969284153) + (i14 * 813891584);
            int i17 = i15 + (i16 * i16 * 454098944);
            return i17 != 1 ? i17 != 2 ? a(objArr) : c(objArr) : e(objArr);
        }

        private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) objArr[0];
            final c cVar = (c) objArr[1];
            int i2 = 2 % 2;
            int i3 = f26754n;
            int i4 = (((-1) - (((-1) - i3) & ((-1) - 55))) << 1) - (i3 ^ 55);
            f26753i = i4 % 128;
            if (i4 % 2 == 0) {
                Handler handler = anonymousClass2.f26755f;
                final o.l.a aVar = anonymousClass2.f26756g;
                Object[] objArr2 = {new Runnable() { // from class: o.r.a$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.AnonymousClass2.d(aVar, cVar);
                    }
                }};
                Method method = Class.forName(Wg.vd(")5.;;42z?B\u007f\u00195A:A=I", (short) (Od.Xd() ^ (-10037)))).getMethod(hg.Vd("-+..", (short) (C1580rY.Xd() ^ (-1313)), (short) (C1580rY.Xd() ^ (-30212))), Class.forName(Qg.kd("\u0014\n\u001e\bS\u0011\u0005\u0011\tNq\u0014\f\u000b||\u0006}", (short) (C1580rY.Xd() ^ (-23613)), (short) (C1580rY.Xd() ^ (-28281)))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                    anonymousClass2.f26757h.quitSafely();
                    return null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Handler handler2 = anonymousClass2.f26755f;
            final o.l.a aVar2 = anonymousClass2.f26756g;
            Object[] objArr3 = {new Runnable() { // from class: o.r.a$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass2.d(aVar2, cVar);
                }
            }};
            Method method2 = Class.forName(C1561oA.ud("P\\Q^ZSM\u0016VY\u0013,DPELDP", (short) (OY.Xd() ^ 26916))).getMethod(C1561oA.Yd("WW\\^", (short) (C1499aX.Xd() ^ (-7226))), Class.forName(C1561oA.yd("B:P<\u0002A7EG\u000f4XJK?ATN", (short) (C1607wl.Xd() ^ 6686))));
            try {
                method2.setAccessible(true);
                method2.invoke(handler2, objArr3);
                anonymousClass2.f26757h.quitSafely();
                throw null;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(o.l.a aVar, o.g.a aVar2, c cVar) {
            int i2 = 2 % 2;
            int i3 = f26754n;
            int i4 = (i3 ^ 93) + ((i3 & 93) << 1);
            f26753i = i4 % 128;
            int i5 = i4 % 2;
            aVar.b(aVar2, cVar);
            int i6 = f26754n;
            int i7 = (((-1) - (((-1) - i6) & ((-1) - 87))) << 1) - (i6 ^ 87);
            f26753i = i7 % 128;
            int i8 = i7 % 2;
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            o.l.a aVar = (o.l.a) objArr[0];
            c cVar = (c) objArr[1];
            int i2 = 2 % 2;
            int i3 = f26753i;
            int i4 = (i3 ^ 125) + ((i3 & 125) << 1);
            f26754n = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            aVar.c(cVar);
            if (i5 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(o.l.a aVar, d dVar, c cVar) {
            Object[] objArr = {aVar, dVar, cVar};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i2 = (int) Runtime.getRuntime().totalMemory();
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i3 = f26750c * 296470944;
            f26750c = i3;
            a(i3, objArr, -2022994273, i2, iFreeMemory2, iFreeMemory, 2022994274);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(o.l.a aVar, c cVar) {
            Object[] objArr = {aVar, cVar};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iActiveCount = Thread.activeCount();
            int i2 = f26752e * 1541796764;
            f26752e = i2;
            a(i2, objArr, 448953522, iElapsedRealtime, iActiveCount, iUptimeMillis, -448953520);
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            o.l.a aVar = (o.l.a) objArr[0];
            d dVar = (d) objArr[1];
            c cVar = (c) objArr[2];
            int i2 = 2 % 2;
            int i3 = f26753i;
            int i4 = (i3 ^ 17) + ((i3 & 17) << 1);
            f26754n = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            aVar.c(dVar, cVar);
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = f26753i + 11;
            f26754n = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // o.l.a
        public final void b(final o.g.a aVar, final c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26754n;
            int i4 = (i3 & 21) + (i3 | 21);
            f26753i = i4 % 128;
            int i5 = i4 % 2;
            Handler handler = this.f26755f;
            final o.l.a aVar2 = this.f26756g;
            Object[] objArr = {new Runnable() { // from class: o.r.a$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass2.b(aVar2, aVar, cVar);
                }
            }};
            Method method = Class.forName(Xg.qd("\u0013!\u0018'% \u001cf).i\u0005\u001f-$-'5", (short) (Od.Xd() ^ (-20465)), (short) (Od.Xd() ^ (-15077)))).getMethod(ZO.xd("mZII", (short) (C1499aX.Xd() ^ (-5510)), (short) (C1499aX.Xd() ^ (-5026))), Class.forName(Jg.Wd("X\u001d}E.8\f%y\u001dM<$0nLrG", (short) (ZN.Xd() ^ 7510), (short) (ZN.Xd() ^ 27546))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
                this.f26757h.quitSafely();
                int i6 = f26754n;
                int i7 = ((115 | i6) << 1) - (i6 ^ 115);
                f26753i = i7 % 128;
                int i8 = i7 % 2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // o.l.a
        public final void c(c cVar) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i2 = f26749b * 1873480631;
            f26749b = i2;
            int i3 = f26748a * (-1785547425);
            f26748a = i3;
            int i4 = (-123699174) * f26751d;
            f26751d = i4;
            a(i4, new Object[]{this, cVar}, -812955387, i2, i3, elapsedCpuTime, 812955387);
        }

        @Override // o.l.a
        public final void c(final d dVar, final c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26754n + 59;
            f26753i = i3 % 128;
            if (i3 % 2 != 0) {
                Handler handler = this.f26755f;
                final o.l.a aVar = this.f26756g;
                Object[] objArr = {new Runnable() { // from class: o.r.a$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.AnonymousClass2.c(aVar, dVar, cVar);
                    }
                }};
                Method method = Class.forName(C1561oA.Qd("\b\u0014\t\u0016\u0012\u000b\u0005M\u000e\u0011Jc{\b|\u0004{\b", (short) (Od.Xd() ^ (-3412)))).getMethod(C1561oA.od("6477", (short) (C1607wl.Xd() ^ 1333)), Class.forName(C1593ug.zd("c[q]+j`nh0Uysthjuo", (short) (ZN.Xd() ^ 8908), (short) (ZN.Xd() ^ 25145))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                    this.f26757h.quitSafely();
                    throw null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Handler handler2 = this.f26755f;
            final o.l.a aVar2 = this.f26756g;
            Runnable runnable = new Runnable() { // from class: o.r.a$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass2.c(aVar2, dVar, cVar);
                }
            };
            Class<?> cls = Class.forName(C1626yg.Ud("iU(\u001ah\u0007\u000ewPNw^\u0018\u0003|lY\u0003", (short) (C1499aX.Xd() ^ (-12283)), (short) (C1499aX.Xd() ^ (-16340))));
            Class<?>[] clsArr = {Class.forName(Ig.wd("\u0004HkyWI.\u000bY/U\u0017ag2T*\u0015", (short) (C1633zX.Xd() ^ (-767))))};
            Object[] objArr2 = {runnable};
            short sXd = (short) (OY.Xd() ^ 16317);
            int[] iArr = new int["g\u0019Ok".length()];
            QB qb = new QB("g\u0019Ok");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + i4)) + xuXd.CK(iKK));
                i4++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i4), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(handler2, objArr2);
                this.f26757h.quitSafely();
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: o.r.a$4, reason: invalid class name */
    final class AnonymousClass4 implements e.b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f26768c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long f26769d = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f26770i = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Handler f26772b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ o.l.a f26773e;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r8, int r9, int r10) {
            /*
                int r2 = r10 * 4
                int r1 = 1 - r2
                int r0 = r8 * 7
                int r8 = r0 + 71
                byte[] r7 = o.r.a.AnonymousClass4.$$a
                int r0 = r9 * 4
                int r0 = 3 - r0
                byte[] r6 = new byte[r1]
                r5 = 0
                int r4 = 0 - r2
                if (r7 != 0) goto L2c
                r1 = r0
                r3 = r5
            L17:
                int r8 = r8 + r0
                r0 = r1
                r2 = r3
            L1a:
                int r1 = r0 + 1
                byte r0 = (byte) r8
                r6[r2] = r0
                int r3 = r2 + 1
                if (r2 != r4) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L29:
                r0 = r7[r1]
                goto L17
            L2c:
                r2 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.r.a.AnonymousClass4.$$c(byte, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f26768c = 0;
            f26770i = 1;
            f26769d = 8395794961536016362L;
        }

        AnonymousClass4(o.l.a aVar, Handler handler) {
            this.f26773e = aVar;
            this.f26772b = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(o.l.a aVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26768c + 63;
            f26770i = i3 % 128;
            if (i3 % 2 == 0) {
                a.this.b(aVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            a.this.b(aVar);
            int i4 = f26770i + 115;
            f26768c = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void f(String str, int i2, Object[] objArr) throws Throwable {
            Object obj;
            String str2 = str;
            int i3 = 2 % 2;
            Object obj2 = null;
            if (str2 != null) {
                int i4 = $10 + 11;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    str2.toCharArray();
                    obj2.hashCode();
                    throw null;
                }
                char[] charArray = str2.toCharArray();
                int i5 = $10 + 5;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                obj = charArray;
            } else {
                obj = str2;
            }
            char[] cArr = (char[]) obj;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i7 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 730, (char) (7933 - Color.blue(0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f26769d ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 836, (char) ((-16749937) - Color.rgb(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, -2145994442, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                int i8 = $11 + 35;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                    Object[] objArr4 = {qVar, qVar};
                    Object objA3 = o.d.d.a(1452497747);
                    if (objA3 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 836, (char) ((Process.myTid() >> 22) + 27279), AndroidCharacter.getMirror('0') - '%', -2145994442, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    int i9 = 34 / 0;
                } else {
                    cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                    Object[] objArr5 = {qVar, qVar};
                    Object objA4 = o.d.d.a(1452497747);
                    if (objA4 == null) {
                        byte b8 = (byte) 1;
                        byte b9 = (byte) (b8 - 1);
                        objA4 = o.d.d.a(835 - Process.getGidForName(""), (char) (27278 - TextUtils.indexOf((CharSequence) "", '0')), 11 - Color.red(0), -2145994442, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr2);
        }

        static void init$0() {
            $$a = new byte[]{108, -115, 75, MessagePack.Code.EXT32};
            $$b = 150;
        }

        @Override // o.r.e.b
        public final void a() throws Throwable {
            String strIntern;
            Object obj;
            int i2 = 2 % 2;
            int i3 = f26770i + 35;
            f26768c = i3 % 128;
            int i4 = i3 % 2;
            if (!(!f.a())) {
                int i5 = f26770i + 111;
                f26768c = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    f("勬譊\ue1c9\ude43㓓浳䯀ꁐ黈\uf749ⷁ\u0a7b惇奄럄\uec49쫞⍽᧙癘곔蕂\ue3f2\ud847㛉潔䗚ꉐ飍\uf151\u2fd8ћ拱孭뇨\uee68쓑㵲ᯬ灯껽蝸", 55680 - (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)), objArr);
                    strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    f("勶賍\ueec1죡⫬Ӽ暲䂆ꊑ鲩ﺨ\ud8b7㩢ᑅ癒偰뉴\uec6a츥⠆ਘ搥䘺ꀽ菃ﷂ\udff8㧭᯽痶垍놑鎦춥⿳उ欉䕝ꝩ腛\ue378\udd05㼞ᤎ笤唟뜱雌\uf0da틝೨滗䣸ꪌ蒔\ue69d삡⊺Ჾ繈", 56843 / Drawable.resolveOpacity(0, 0), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    f("勬譊\ue1c9\ude43㓓浳䯀ꁐ黈\uf749ⷁ\u0a7b惇奄럄\uec49쫞⍽᧙癘곔蕂\ue3f2\ud847㛉潔䗚ꉐ飍\uf151\u2fd8ћ拱孭뇨\uee68쓑㵲ᯬ灯껽蝸", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 55680, objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    f("勶賍\ueec1죡⫬Ӽ暲䂆ꊑ鲩ﺨ\ud8b7㩢ᑅ癒偰뉴\uec6a츥⠆ਘ搥䘺ꀽ菃ﷂ\udff8㧭᯽痶垍놑鎦춥⿳उ欉䕝ꝩ腛\ue378\udd05㼞ᤎ笤唟뜱雌\uf0da틝೨滗䣸ꪌ蒔\ue69d삡⊺Ჾ繈", 56843 - Drawable.resolveOpacity(0, 0), objArr4);
                    obj = objArr4[0];
                }
                f.c(strIntern, ((String) obj).intern());
            }
            this.f26773e.c(d.f26353b, a.this);
        }

        @Override // o.r.e.b
        public final void a(d dVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26768c + 57;
            f26770i = i3 % 128;
            int i4 = i3 % 2;
            if (f.a()) {
                int i5 = f26768c + 13;
                f26770i = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                f("勬譊\ue1c9\ude43㓓浳䯀ꁐ黈\uf749ⷁ\u0a7b惇奄럄\uec49쫞⍽᧙癘곔蕂\ue3f2\ud847㛉潔䗚ꉐ飍\uf151\u2fd8ћ拱孭뇨\uee68쓑㵲ᯬ灯껽蝸", 55681 - TextUtils.indexOf("", ""), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f("勶␝뽡㙑覬\u008c鯒洶\ue411罹\uf648䦧삢寕ⴲꐀ㽴뙚অ肖ᯘ\ued35搚ｭ癃즲䃘\udbdd괽␆뽭㙁覦õ鮓浹\ue449罭\uf649䦫샸寕ⴾꐞ㽤뚏\u0991胼ᯚ\ued2d搈ａ皫즀䃸\udbda", 30427 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            this.f26773e.c(dVar, a.this);
        }

        @Override // o.r.e.b
        public final void d() throws Throwable {
            String strIntern;
            Object obj;
            int i2 = 2 % 2;
            if (f.a()) {
                int i3 = f26770i + 13;
                f26768c = i3 % 128;
                int i4 = i3 % 2;
                short sXd = (short) (C1499aX.Xd() ^ (-13694));
                int[] iArr = new int["\uf7d2鳐춛ሾ勴趣\ue2b0⮛桅ꃼ\udbba⁰㦂癤꼘\ue9b9⺀潁쑇ﴧ䟐蒌딸姶鬧췱ቺ半追\ue2c1⯫梪ꅢ혘₍㦶盱꽤\uec17⻨澌쓀ﵨ䈷蓤떪婗魽큆ደ厢選\ue11e♂植ꆽ홬ἱ㧘眍".length()];
                QB qb = new QB("\uf7d2鳐춛ሾ勴趣\ue2b0⮛桅ꃼ\udbba⁰㦂癤꼘\ue9b9⺀潁쑇ﴧ䟐蒌딸姶鬧췱ቺ半追\ue2c1⯫梪ꅢ혘₍㦶盱꽤\uec17⻨澌쓀ﵨ䈷蓤떪婗魽큆ደ厢選\ue11e♂植ꆽ홬ἱ㧘眍");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i5));
                    i5++;
                }
                String str = new String(iArr, 0, i5);
                String strZd = Wg.Zd("\ud93a祜タ薝㐑쳵ࠦ딚፶첻宗逵䋥鰦嬊\ue773♬폏⨏\udef2癒꼄涘뙑涷ฆ㳰\uf24a䔫ﵳ鑞ř肿\ud8ff豞⥂垏ぴ柒ᢹ꼫\ue86a", (short) (OY.Xd() ^ 31066), (short) (OY.Xd() ^ 26804));
                if (i4 != 0) {
                    Object[] objArr = new Object[1];
                    f(strZd, 55681 % TextUtils.indexOf("", "", 0, 1), objArr);
                    strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    f(str, 48437 >>> ExpandableListView.getPackedPositionGroup(0L), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    f(strZd, TextUtils.indexOf("", "", 0, 0) + 55681, objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    f(str, ExpandableListView.getPackedPositionGroup(0L) + 48437, objArr4);
                    obj = objArr4[0];
                }
                f.c(strIntern, ((String) obj).intern());
                int i6 = f26770i + 115;
                f26768c = i6 % 128;
                int i7 = i6 % 2;
            }
            Handler handler = this.f26772b;
            final o.l.a aVar = this.f26773e;
            Object[] objArr5 = {new Runnable() { // from class: o.r.a$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.e(aVar);
                }
            }};
            Method method = Class.forName(C1561oA.Xd("FTKZXSO\u001a\\a\u001d8R`W`Zh", (short) (C1633zX.Xd() ^ (-18751)))).getMethod(Qg.kd("\u001a\u0018\u001b\u001b", (short) (Od.Xd() ^ (-18182)), (short) (Od.Xd() ^ (-20045))), Class.forName(Wg.vd("+!9#j( ,0u\u001d?32((\u001d\u0015", (short) (C1633zX.Xd() ^ (-32447)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr5);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: o.r.a$5, reason: invalid class name */
    final class AnonymousClass5 extends KeyguardManager.KeyguardDismissCallback {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static char f26774b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static char[] f26775e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f26776f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f26777g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ o.l.a f26778a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Handler f26780d;

        private static String $$c(short s2, short s3, short s4) {
            int i2 = s3 * 2;
            int i3 = s4 + 102;
            int i4 = s2 + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            int i6 = -1;
            if (bArr == null) {
                i3 = i4 + i3;
                i4 = i4;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i5) {
                    return new String(bArr2, 0);
                }
                int i7 = i4 + 1;
                i3 += bArr[i7];
                i4 = i7;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f26776f = 0;
            f26777g = 1;
            f26775e = new char[]{64577, 65466, 64590, 64604, 65467, 64580, 64520, 64598, 64589, 64593, 64587, 64585, 64582, 64599, 64578, 64609, 65470, 64576, 64612, 64620, 64592, 64584, 64588, 64517, 64596, 64614, 64586, 64630, 65471, 65469, 64622, 64597, 64624, 65468, 64629, 64608};
            f26774b = (char) 51641;
        }

        AnonymousClass5(o.l.a aVar, Handler handler) {
            this.f26778a = aVar;
            this.f26780d = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(o.l.a aVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26776f + 89;
            f26777g = i3 % 128;
            int i4 = i3 % 2;
            a.this.b(aVar);
            int i5 = f26777g + 75;
            f26776f = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        private static void h(int i2, String str, byte b2, Object[] objArr) throws Throwable {
            int i3;
            int length;
            char[] cArr;
            String str2 = str;
            int i4 = 2;
            int i5 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                charArray = str2.toCharArray();
            }
            char[] cArr2 = (char[]) charArray;
            h hVar = new h();
            char[] cArr3 = f26775e;
            int i6 = 421932776;
            int i7 = 1;
            if (cArr3 != null) {
                int i8 = $11 + 31;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    length = cArr3.length;
                    cArr = new char[length];
                } else {
                    length = cArr3.length;
                    cArr = new char[length];
                }
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $10 + 59;
                    $11 = i10 % 128;
                    if (i10 % i4 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i9])};
                            Object objA = o.d.d.a(i6);
                            if (objA == null) {
                                byte b3 = (byte) (-1);
                                byte b4 = (byte) (b3 + 1);
                                objA = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i9 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i9])};
                        Object objA2 = o.d.d.a(421932776);
                        if (objA2 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            objA2 = o.d.d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 270, (char) Color.red(0), Color.rgb(0, 0, 0) + 16777227, -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        cArr[i9] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i9++;
                    }
                    i4 = 2;
                    i6 = 421932776;
                }
                int i11 = $10 + 61;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr3 = cArr;
            }
            Object[] objArr4 = {Integer.valueOf(f26774b)};
            Object objA3 = o.d.d.a(421932776);
            if (objA3 == null) {
                byte b7 = (byte) (-1);
                byte b8 = (byte) (b7 + 1);
                objA3 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 269, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 11 - View.getDefaultSize(0, 0), -811348851, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                int i13 = $11 + 25;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr2[i3] - b2);
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                hVar.f19926b = 0;
                while (hVar.f19926b < i3) {
                    hVar.f19927c = cArr2[hVar.f19926b];
                    hVar.f19925a = cArr2[hVar.f19926b + i7];
                    if (hVar.f19927c == hVar.f19925a) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + i7] = (char) (hVar.f19925a - b2);
                    } else {
                        Object[] objArr5 = new Object[13];
                        objArr5[12] = hVar;
                        objArr5[11] = Integer.valueOf(cCharValue);
                        objArr5[10] = hVar;
                        objArr5[9] = hVar;
                        objArr5[8] = Integer.valueOf(cCharValue);
                        objArr5[7] = hVar;
                        objArr5[6] = hVar;
                        objArr5[5] = Integer.valueOf(cCharValue);
                        objArr5[4] = hVar;
                        objArr5[3] = hVar;
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[i7] = hVar;
                        objArr5[0] = hVar;
                        Object objA4 = o.d.d.a(219124184);
                        if (objA4 == null) {
                            byte b9 = (byte) (-1);
                            byte b10 = (byte) (b9 + 1);
                            objA4 = o.d.d.a(TextUtils.getOffsetAfter("", 0) + 825, (char) ((Process.getThreadPriority(0) + 20) >> 6), 11 - Color.alpha(0), -611683395, false, $$c(b9, b10, (byte) (9 | b10)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                            int i15 = $11 + 81;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA5 = o.d.d.a(-634864343);
                            if (objA5 == null) {
                                byte b11 = (byte) (-1);
                                byte b12 = (byte) (b11 + 1);
                                objA5 = o.d.d.a((Process.myTid() >> 22) + JfifUtil.MARKER_SOS, (char) KeyEvent.keyCodeFromString(""), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), 212688716, false, $$c(b11, b12, (byte) (7 | b12)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                            int i17 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr3[iIntValue];
                            cArr4[hVar.f19926b + 1] = cArr3[i17];
                        } else if (hVar.f19928d == hVar.f19929e) {
                            int i18 = $10 + 51;
                            $11 = i18 % 128;
                            int i19 = i18 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i20 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i21 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr3[i20];
                            cArr4[hVar.f19926b + 1] = cArr3[i21];
                        } else {
                            int i22 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i23 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr3[i22];
                            i7 = 1;
                            cArr4[hVar.f19926b + 1] = cArr3[i23];
                        }
                        i7 = 1;
                    }
                    hVar.f19926b += 2;
                }
            }
            for (int i24 = 0; i24 < i2; i24++) {
                cArr4[i24] = (char) (cArr4[i24] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        static void init$0() {
            $$a = new byte[]{53, 97, -95, 41};
            $$b = 156;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
        @Override // android.app.KeyguardManager.KeyguardDismissCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onDismissCancelled() throws java.lang.Throwable {
            /*
                r8 = this;
                r7 = 2
                int r0 = r7 % r7
                int r0 = o.r.a.AnonymousClass5.f26776f
                int r1 = r0 + 7
                int r0 = r1 % 128
                o.r.a.AnonymousClass5.f26777g = r0
                int r1 = r1 % r7
                r5 = 0
                if (r1 != 0) goto L74
                boolean r1 = o.ea.f.a()
                r0 = 3
                int r0 = r0 / r5
                if (r1 == 0) goto L6a
            L17:
                int r1 = o.r.a.AnonymousClass5.f26777g
                r6 = 1
                int r1 = r1 + r6
                int r0 = r1 % 128
                o.r.a.AnonymousClass5.f26776f = r0
                int r1 = r1 % r7
                r1 = 0
                float r0 = android.util.TypedValue.complexToFraction(r5, r1, r1)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                int r3 = 42 - r0
                java.lang.String r0 = ""
                int r0 = android.view.KeyEvent.keyCodeFromString(r0)
                int r0 = r0 + 52
                byte r2 = (byte) r0
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "\u0016\u0007\u000b\u0010\u000f\u0019\r\u000e㘳㘳\b\"\u000b\u0006\u0018\u000e\u0001\u0014㘨㘨\f\u000e\u0013\u0015\n\t\u0010\u000b\n\u0015\u0011\u0000\n\u0015\u001c\b\u001f\u0010\u001b\u0014!\u0007"
                h(r3, r0, r2, r1)
                r0 = r1[r5]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r4 = r0.intern()
                int r0 = android.os.Process.myTid()
                int r0 = r0 >> 22
                int r3 = 43 - r0
                int r0 = android.graphics.Color.red(r5)
                int r0 = r0 + r6
                byte r2 = (byte) r0
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "\u000e\f\u001a\u0012\r\u000b\u000f\u0015\u0013\n\u0016\u0017㗪㗪#\f\u0002\u000f\u0017\u0002\f\u0001\u0012\u000b\u0014\u001d\t\u0010\u0013\n\u0016\u0017㗪㗪\u001d\u0001\u0006\u0010\u0017\u0011\u0011\u0017㗿"
                h(r3, r0, r2, r1)
                r0 = r1[r5]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                o.ea.f.d(r4, r0)
                int r0 = o.r.a.AnonymousClass5.f26777g
                int r1 = r0 + 9
                int r0 = r1 % 128
                o.r.a.AnonymousClass5.f26776f = r0
                int r1 = r1 % r7
            L6a:
                o.l.a r2 = r8.f26778a
                o.l.d r1 = o.l.d.f26353b
                o.r.a r0 = o.r.a.this
                r2.c(r1, r0)
                return
            L74:
                boolean r0 = o.ea.f.a()
                if (r0 != 0) goto L17
                goto L6a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.r.a.AnonymousClass5.onDismissCancelled():void");
        }

        @Override // android.app.KeyguardManager.KeyguardDismissCallback
        public final void onDismissError() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26776f + 113;
            f26777g = i3 % 128;
            if (i3 % 2 == 0) {
                f.a();
                throw null;
            }
            if (f.a()) {
                Object[] objArr = new Object[1];
                h(TextUtils.indexOf("", "") + 42, "\u0016\u0007\u000b\u0010\u000f\u0019\r\u000e㘳㘳\b\"\u000b\u0006\u0018\u000e\u0001\u0014㘨㘨\f\u000e\u0013\u0015\n\t\u0010\u000b\n\u0015\u0011\u0000\n\u0015\u001c\b\u001f\u0010\u001b\u0014!\u0007", (byte) (53 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                h(40 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u000e\f\u001a\u0012\r\u000b\u000f\u0015\u0013\n\u0016\u0017㙌㙌#\f\u0002\u000f\u0017\u0002\f\u0001\u0012\u000b\u0014\u001d\t\u0010\u0013\n\u0016\u0017㙌㙌\u001f\u0011\u000e\u0019㙋", (byte) (99 - (Process.myTid() >> 22)), objArr2);
                f.d(strIntern, ((String) objArr2[0]).intern());
                int i4 = f26777g + 85;
                f26776f = i4 % 128;
                int i5 = i4 % 2;
            }
            this.f26778a.c(d.f26354c, a.this);
        }

        @Override // android.app.KeyguardManager.KeyguardDismissCallback
        public final void onDismissSucceeded() throws Throwable {
            int i2 = 2 % 2;
            if (f.a()) {
                Object[] objArr = new Object[1];
                h(42 - (ViewConfiguration.getEdgeSlop() >> 16), hg.Vd("/\u001f\"&$-  柔染\u00170\u0018\u0012#\u0018\n\u001c枿枾\u0011\u0012\u0016\u0017\u000b\t\u000f\t\u0007\u0011\fҤ\u0003\r\u0013}\u0014\u0004\u000e\u0006\u0012v", (short) (FB.Xd() ^ 8472), (short) (FB.Xd() ^ 5919)), (byte) (52 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                h(43 - (ViewConfiguration.getScrollBarSize() >> 8), C1561oA.ud("\u0014\u0011\u001e\u0015\u000f\f\u000f\u0014\u0011\u0007\u0012\u0012\uf4ef\uf4ee\u001b\u0003w\u0004\u000bt}q\u0002y\u0002\ntz|r}}\uf4db\uf4da}w\uf4e7\uf4e6\uf4eb\uf4eabh\uf4e6", (short) (ZN.Xd() ^ 2039)), (byte) (TextUtils.lastIndexOf("", '0') + 26), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
                int i3 = f26776f + 31;
                f26777g = i3 % 128;
                int i4 = i3 % 2;
            }
            Handler handler = this.f26780d;
            final o.l.a aVar = this.f26778a;
            Runnable runnable = new Runnable() { // from class: o.r.a$5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.d(aVar);
                }
            };
            short sXd = (short) (C1499aX.Xd() ^ (-18493));
            int[] iArr = new int["o{p}yrl5ux2Kcodk\u0004\u0010".length()];
            QB qb = new QB("o{p}yrl5ux2Kcodk\u0004\u0010");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i5));
                i5++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i5));
            Class<?>[] clsArr = new Class[1];
            short sXd2 = (short) (C1633zX.Xd() ^ (-24816));
            int[] iArr2 = new int["\u0019\u0011'\u0013` \u0016$\u001ee\u000b/)*\u001e +%".length()];
            QB qb2 = new QB("\u0019\u0011'\u0013` \u0016$\u001ee\u000b/)*\u001e +%");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i6));
                i6++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i6));
            Object[] objArr3 = {runnable};
            Method method = cls.getMethod(Xg.qd("//46", (short) (ZN.Xd() ^ 28551), (short) (ZN.Xd() ^ 22908)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr3);
                int i7 = f26777g + 33;
                f26776f = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
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
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r2 = r8 * 3
            int r1 = 1 - r2
            byte[] r8 = o.r.a.$$c
            int r7 = r7 + 103
            int r0 = r6 * 3
            int r6 = r0 + 4
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2e
            r2 = r6
            r0 = r3
            r1 = r4
        L16:
            int r0 = -r0
            int r6 = r6 + r0
            int r0 = r2 + 1
            r7 = r6
            r6 = r0
        L1c:
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            int r1 = r1 + 1
            r0 = r8[r6]
            r2 = r6
            r6 = r7
            goto L16
        L2e:
            r1 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r.a.$$g(byte, short, int):java.lang.String");
    }

    public static /* synthetic */ boolean $r8$lambda$mCEi04OcFi8gu0FD463twzV2nG8(Handler handler, Runnable runnable) throws Throwable {
        Object[] objArr = {runnable};
        Method method = Class.forName(Jg.Wd("?d0\u0004T0\u0001\u0010%\u000f#\u0003ob.wD7", (short) (Od.Xd() ^ (-22878)), (short) (Od.Xd() ^ (-17511)))).getMethod(C1626yg.Ud("\u001a\u0014J\u0005", (short) (C1607wl.Xd() ^ 10136), (short) (C1607wl.Xd() ^ 14256)), Class.forName(ZO.xd("o\\\u001a<S,TZ/\u007f\u001b/;j\t\u0010&h", (short) (FB.Xd() ^ 28470), (short) (FB.Xd() ^ 30370))));
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(handler, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        J = -858906931;
        init$0();
        f26737p = -743482418;
        f26741t = 1853947469;
        f26739r = -336990909;
        f26734l = 133062760;
        f26735m = 1792998350;
        f26736n = 2084453017;
        f26733k = 1979051221;
        K = 0;
        N = 1;
        G = 0;
        H = 1;
        f();
        f26740s = R.string.antelopScreenUnlockPromptName;
        f26738q = R.string.antelopScreenUnlockPromptDefaultTitle;
        f26744y = R.string.antelopScreenUnlockPromptDefaultSubtitle;
        f26742u = R.string.antelopScreenUnlockPromptSubmitButtonLabel;
        f26743v = R.drawable.antelopScreenUnlockPromptIcon;
        int i2 = N + 11;
        K = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
    }

    public a(Context context, String str, String str2, n nVar) {
        super(e(context), f26743v);
        if (str == null || c$$ExternalSyntheticBackport0.m(str)) {
            int i2 = f26739r * (-2103697993);
            f26739r = i2;
            int i3 = (-756149956) * f26741t;
            f26741t = i3;
            int i4 = f26737p * (-91466120);
            f26737p = i4;
            Object[] objArr = {(String) b(i3, Process.myUid(), new Object[]{context}, i4, i2, 650336903, -650336901)};
            int i5 = m.f23563d * 691068131;
            m.f23563d = i5;
            int i6 = m.f23561b * (-1916120846);
            m.f23561b = i6;
            this.f26747x = (String) m.c(objArr, (int) SystemClock.uptimeMillis(), i6, -327535505, i5, 327535505, Process.myUid());
        } else {
            int i7 = m.f23563d * 691068131;
            m.f23563d = i7;
            int i8 = m.f23561b * (-1916120846);
            m.f23561b = i8;
            this.f26747x = (String) m.c(new Object[]{str}, (int) SystemClock.uptimeMillis(), i8, -327535505, i7, 327535505, Process.myUid());
        }
        if (str2 == null) {
            Object[] objArr2 = {c(context)};
            int i9 = m.f23563d * 691068131;
            m.f23563d = i9;
            int i10 = m.f23561b * (-1916120846);
            m.f23561b = i10;
            this.f26746w = (String) m.c(objArr2, (int) SystemClock.uptimeMillis(), i10, -327535505, i9, 327535505, Process.myUid());
        } else {
            int i11 = m.f23563d * 691068131;
            m.f23563d = i11;
            int i12 = m.f23561b * (-1916120846);
            m.f23561b = i12;
            this.f26746w = (String) m.c(new Object[]{str2}, (int) SystemClock.uptimeMillis(), i12, -327535505, i11, 327535505, Process.myUid());
        }
        Object[] objArr3 = {a(context)};
        int i13 = m.f23563d * 691068131;
        m.f23563d = i13;
        int i14 = m.f23561b * (-1916120846);
        m.f23561b = i14;
        this.C = (String) m.c(objArr3, (int) SystemClock.uptimeMillis(), i14, -327535505, i13, 327535505, Process.myUid());
        this.A = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void L(java.lang.String r24, int[] r25, boolean r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r.a.L(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    private static void M(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        int i5;
        int i6 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(B)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 1);
                objA = o.d.d.a(238 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 44531), ((Process.getThreadPriority(0) + 20) >> 6) + 11, 35969549, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 49;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (i5 != 0) {
                int i9 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = I;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - (Process.myTid() >> 22)), ((Process.getThreadPriority(0) + 20) >> 6) + 11, 1621469864, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $11 + 89;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    byte[] bArr3 = I;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f26745z)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objA3 = o.d.d.a((-16776978) - Color.rgb(0, 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 44532), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 35969549, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) B) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) F[i2 + ((int) (((long) f26745z) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) B) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f26745z) ^ (-7649639543924978291L))) + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(E), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) ((Process.myPid() >> 22) + 5358), Color.alpha(0) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = I;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = $11 + 59;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = I;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = F;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void O(int r8, int r9, int r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 3
            int r8 = 1 - r0
            int r7 = r10 + 4
            byte[] r6 = o.r.a.$$a
            int r5 = 101 - r9
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r6 != 0) goto L27
            r0 = r8
            r2 = r3
        L11:
            int r5 = r5 + r0
            r1 = r2
        L13:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r8) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L22:
            int r7 = r7 + 1
            r0 = r6[r7]
            goto L11
        L27:
            r1 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r.a.O(int, int, int, java.lang.Object[]):void");
    }

    private static void P(int i2, short s2, byte b2, Object[] objArr) {
        int i3 = (b2 * 7) + 4;
        int i4 = s2 * 7;
        int i5 = 111 - (i2 * 10);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[8 - i4];
        int i6 = 7 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i5 = (i5 + i6) - 6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i3];
                i3++;
                i5 = (i5 + b3) - 6;
            }
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Exception {
        boolean zIsDeviceLocked;
        String strIntern;
        Object obj;
        a aVar = (a) objArr[0];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CancellationSignal cancellationSignal = (CancellationSignal) objArr[3];
        o.l.a aVar2 = (o.l.a) objArr[4];
        int i2 = 2 % 2;
        Object[] objArr2 = new Object[1];
        L(Ig.wd("˅݅2ʀΤϟ̺ҭ", (short) (FB.Xd() ^ 28021)), new int[]{0, 8, 0, 0}, true, objArr2);
        Object[] objArr3 = {((String) objArr2[0]).intern()};
        Method method = Class.forName(EO.Od("=\"&PX(=\u0018\u0015\u0003\u0006c 1)>1Y\"]&r>", (short) (ZN.Xd() ^ 30606))).getMethod(C1593ug.zd("\u001d\u001c,\f3.0\"+\u0012%38,'*", (short) (C1633zX.Xd() ^ (-11091)), (short) (C1633zX.Xd() ^ (-31176))), Class.forName(C1561oA.Qd("D:N8\u0004A5A9~#C@6:2", (short) (C1633zX.Xd() ^ (-23055)))));
        try {
            method.setAccessible(true);
            KeyguardManager keyguardManager = (KeyguardManager) method.invoke(fragmentActivity, objArr3);
            String strOd = C1561oA.od("۾۽\u001aۻ\u0018۹۸\u0015۶\u0013\u0012۳۲\u000f۰\r\fۭ\n۫\b\u0007\u0006ۧ\u0004ۥۣۤ\u007fۡ}|{\u06ddyxۚvutۖr", (short) (C1607wl.Xd() ^ 1246));
            if (keyguardManager == null) {
                int i3 = H + 109;
                G = i3 % 128;
                int i4 = i3 % 2;
                if (f.a()) {
                    int i5 = G + 33;
                    H = i5 % 128;
                    int i6 = i5 % 2;
                    short sXd = (short) (C1499aX.Xd() ^ (-8430));
                    int[] iArr = new int["Ǩ Ǫǫ#$Ǯ&ǰ(ǲǳǴǵǶ.Ǹǹ12Ǽ456789:;<Ȇ>?ȉȊBȌDȎF".length()];
                    QB qb = new QB("Ǩ Ǫǫ#$Ǯ&ǰ(ǲǳǴǵǶ.Ǹǹ12Ǽ456789:;<Ȇ>?ȉȊBȌDȎF");
                    int i7 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i7] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i7));
                        i7++;
                    }
                    String str = new String(iArr, 0, i7);
                    if (i6 == 0) {
                        Object[] objArr4 = new Object[1];
                        L(strOd, new int[]{8, 42, 0, 0}, true, objArr4);
                        strIntern = ((String) objArr4[0]).intern();
                        Object[] objArr5 = new Object[1];
                        L(str, new int[]{50, 40, 188, 0}, false, objArr5);
                        obj = objArr5[0];
                    } else {
                        Object[] objArr6 = new Object[1];
                        L(strOd, new int[]{8, 42, 0, 0}, true, objArr6);
                        strIntern = ((String) objArr6[0]).intern();
                        Object[] objArr7 = new Object[1];
                        L(str, new int[]{50, 40, 188, 0}, true, objArr7);
                        obj = objArr7[0];
                    }
                    f.d(strIntern, ((String) obj).intern());
                }
                aVar2.c(d.f26356e, aVar);
                return null;
            }
            Object[] objArr8 = new Object[1];
            L(Wg.Zd("sU\u0004\u001cѕ\\Ͱç̪߲\u001aۭb,ɮ<Ǩް\u000f+ҭ\"ψɮvƉ^ظnvϵG\u000e.Vޒ\u0005ڝM\u0017", (short) (C1633zX.Xd() ^ (-21918)), (short) (C1633zX.Xd() ^ (-19186))), new int[]{90, 40, 0, 28}, false, objArr8);
            HandlerThread handlerThread = new HandlerThread(((String) objArr8[0]).intern());
            handlerThread.start();
            o.ea.e eVar = new o.ea.e(Looper.myLooper());
            int i8 = G + 47;
            H = i8 % 128;
            if (i8 % 2 == 0) {
                zIsDeviceLocked = keyguardManager.isDeviceLocked();
                int i9 = 67 / 0;
            } else {
                zIsDeviceLocked = keyguardManager.isDeviceLocked();
            }
            if (f.a()) {
                Object[] objArr9 = new Object[1];
                L(strOd, new int[]{8, 42, 0, 0}, true, objArr9);
                String strIntern2 = ((String) objArr9[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr10 = new Object[1];
                M((short) (KeyEvent.getMaxKeyCode() >> 16), (-718048172) - TextUtils.getTrimmedLength(""), (KeyEvent.getMaxKeyCode() >> 16) + 394305006, 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
                f.c(strIntern2, sb.append(((String) objArr10[0]).intern()).append(zIsDeviceLocked).toString());
            }
            AnonymousClass2 anonymousClass2 = aVar.new AnonymousClass2(eVar, aVar2, handlerThread);
            if (zIsDeviceLocked) {
                aVar.c(fragmentActivity, anonymousClass2, new o.ea.e(handlerThread.getLooper()));
                return null;
            }
            if (Build.VERSION.SDK_INT < 30) {
                aVar.c(fragmentActivity, iIntValue, anonymousClass2, new o.ea.e(handlerThread.getLooper()));
                return null;
            }
            aVar.a(fragmentActivity, cancellationSignal, anonymousClass2, new o.ea.e(handlerThread.getLooper()));
            int i10 = H + 53;
            G = i10 % 128;
            Object obj2 = null;
            if (i10 % 2 == 0) {
                return null;
            }
            obj2.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = G + 45;
        H = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("R`Wfd_[&\\iipbls.Dqqxj~{", (short) (C1607wl.Xd() ^ 27556))).getMethod(Wg.vd("VSeBP]\\aYIN[", (short) (FB.Xd() ^ 28769)), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(f26742u);
            int i5 = G + 9;
            H = i5 % 128;
            int i6 = i5 % 2;
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(BiometricPrompt biometricPrompt, FragmentActivity fragmentActivity) {
        int i2 = f26733k * 956395943;
        f26733k = i2;
        int i3 = f26736n * (-56979822);
        f26736n = i3;
        int i4 = f26735m * 684207856;
        f26735m = i4;
        b(i3, Thread.currentThread().getPriority(), new Object[]{biometricPrompt, fragmentActivity}, i4, i2, 343538363, -343538363);
    }

    private void a(final FragmentActivity fragmentActivity, CancellationSignal cancellationSignal, final o.l.a aVar, final Handler handler) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            L("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{8, 42, 0, 0}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            M((short) (ExpandableListView.getPackedPositionChild(0L) + 1), (-718048125) + (ViewConfiguration.getDoubleTapTimeout() >> 16), 394305021 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i3 = G + 63;
            H = i3 % 128;
            int i4 = i3 % 2;
        }
        Objects.requireNonNull(handler);
        Executor executor = new Executor() { // from class: o.r.a$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) throws Throwable {
                a.$r8$lambda$mCEi04OcFi8gu0FD463twzV2nG8(handler, runnable);
            }
        };
        BiometricPrompt.PromptInfo promptInfoBuild = new BiometricPrompt.PromptInfo.Builder().setTitle(this.f26747x).setSubtitle(this.f26746w).setAllowedAuthenticators(32783).build();
        final BiometricPrompt biometricPrompt = new BiometricPrompt(fragmentActivity, executor, new BiometricPrompt.AuthenticationCallback() { // from class: o.r.a.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f26759a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f26760c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f26761d = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f26762f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f26763g = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static byte[] f26764i = null;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static short[] f26765j = null;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(short r7, int r8, byte r9) {
                /*
                    int r0 = r8 * 2
                    int r8 = r0 + 4
                    int r7 = 104 - r7
                    byte[] r6 = o.r.a.AnonymousClass3.$$a
                    int r0 = r9 * 3
                    int r5 = 1 - r0
                    byte[] r4 = new byte[r5]
                    r3 = 0
                    if (r6 != 0) goto L28
                    r0 = r7
                    r7 = r5
                    r2 = r3
                L14:
                    int r8 = r8 + 1
                    int r7 = r7 + r0
                    r1 = r2
                L18:
                    byte r0 = (byte) r7
                    int r2 = r1 + 1
                    r4[r1] = r0
                    if (r2 != r5) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L25:
                    r0 = r6[r8]
                    goto L14
                L28:
                    r1 = r3
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.r.a.AnonymousClass3.$$c(short, int, byte):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f26763g = 0;
                f26762f = 1;
                f26761d = 1468209546;
                f26760c = 1150422475;
                f26759a = -818058510;
                f26764i = new byte[]{MessagePack.Code.INT64, MessagePack.Code.INT8, MessagePack.Code.FIXEXT2, MessagePack.Code.STR16, -15, -79, MessagePack.Code.FIXEXT1, -19, MessagePack.Code.FALSE, MessagePack.Code.NEGFIXINT_PREFIX, MessagePack.Code.FIXEXT2, MessagePack.Code.STR8, MessagePack.Code.FALSE, -19, -18, MessagePack.Code.STR16, MessagePack.Code.TRUE, MessagePack.Code.FIXEXT1, 3, -92, -22, MessagePack.Code.ARRAY16, MessagePack.Code.FIXEXT8, -14, -75, -17, MessagePack.Code.TRUE, MessagePack.Code.INT8, MessagePack.Code.FIXEXT2, -2, MessagePack.Code.UINT8, -18, MessagePack.Code.FIXEXT8, MessagePack.Code.NIL, -28, -25, -74, -22, MessagePack.Code.ARRAY16, MessagePack.Code.FIXEXT8, -14, 79, 49, 50, 97, Ascii.ESC, 51, 72, 57, 95, 48, 52, 57, 72, 69, 49, 62, 51, 126, Ascii.US, 51, -125, Utf8.REPLACEMENT_BYTE, 65, -26, 78, 79, 48, 49, 108, 42, 73, 57, 53, 94, 57, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.US, Ascii.EM, Ascii.US, Ascii.CR, 57, -6, Ascii.FS, Ascii.NAK, 10, 40, Ascii.GS, 1, 10, Ascii.NAK, Ascii.SYN, 2, Ascii.VT, Ascii.FS, 75, -24, Ascii.FS, 108, 8, Ascii.DC2, -77, Ascii.ESC, Ascii.CAN, Ascii.GS, 2, 57, -9, Ascii.SUB, 10, 6, 43, 10, -115, -115, -115};
            }

            private static void h(short s2, int i5, int i6, int i7, byte b2, Object[] objArr3) throws Throwable {
                boolean z2;
                int i8;
                int i9;
                int i10 = 2;
                int i11 = 2 % 2;
                j jVar = new j();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr4 = {Integer.valueOf(i7), Integer.valueOf(f26760c)};
                    Object objA = o.d.d.a(-727631768);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(237 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (44531 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, 35969549, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr4)).intValue();
                    if (iIntValue == -1) {
                        z2 = true;
                    } else {
                        int i12 = $11 + 89;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        z2 = false;
                    }
                    if (z2) {
                        byte[] bArr = f26764i;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            for (int i14 = 0; i14 < length; i14++) {
                                Object[] objArr5 = {Integer.valueOf(bArr[i14])};
                                Object objA2 = o.d.d.a(-1239398195);
                                if (objA2 == null) {
                                    int maxKeyCode = 628 - (KeyEvent.getMaxKeyCode() >> 16);
                                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 28649);
                                    int gidForName = 10 - Process.getGidForName("");
                                    int i15 = $$b;
                                    byte b5 = (byte) ((i15 + 7) - (i15 | 7));
                                    byte b6 = (byte) (b5 - 1);
                                    objA2 = o.d.d.a(maxKeyCode, longPressTimeout, gidForName, 1621469864, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                                }
                                bArr2[i14] = ((Byte) ((Method) objA2).invoke(null, objArr5)).byteValue();
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            int i16 = $11 + 23;
                            $10 = i16 % 128;
                            if (i16 % 2 != 0) {
                                byte[] bArr3 = f26764i;
                                Object[] objArr6 = {Integer.valueOf(i5), Integer.valueOf(f26761d)};
                                Object objA3 = o.d.d.a(-727631768);
                                if (objA3 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objA3 = o.d.d.a(View.getDefaultSize(0, 0) + 238, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44531), (ViewConfiguration.getTouchSlop() >> 8) + 11, 35969549, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i9 = ((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr6)).intValue()]) & (-7649639543924978291L))) % ((int) (((long) f26760c) % (-7649639543924978291L)));
                            } else {
                                byte[] bArr4 = f26764i;
                                Object[] objArr7 = {Integer.valueOf(i5), Integer.valueOf(f26761d)};
                                Object objA4 = o.d.d.a(-727631768);
                                if (objA4 == null) {
                                    byte b9 = (byte) 0;
                                    byte b10 = b9;
                                    objA4 = o.d.d.a(238 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf("", "") + 44531), 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 35969549, false, $$c(b9, b10, b10), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i9 = ((byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr7)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f26760c) ^ (-7649639543924978291L)));
                            }
                            iIntValue = (byte) i9;
                            i10 = 2;
                        } else {
                            iIntValue = (short) (((short) (((long) f26765j[i5 + ((int) (((long) f26761d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f26760c) ^ (-7649639543924978291L))));
                            int i17 = $11 + 103;
                            $10 = i17 % 128;
                            i10 = 2;
                            int i18 = i17 % 2;
                        }
                    }
                    if (iIntValue > 0) {
                        int i19 = ((i5 + iIntValue) - i10) + ((int) (((long) f26761d) ^ (-7649639543924978291L)));
                        if (z2) {
                            int i20 = $10 + 29;
                            $11 = i20 % 128;
                            int i21 = i20 % 2;
                            i8 = 1;
                        } else {
                            i8 = 0;
                        }
                        jVar.f19936d = i19 + i8;
                        Object[] objArr8 = {jVar, Integer.valueOf(i6), Integer.valueOf(f26759a), sb};
                        Object objA5 = o.d.d.a(1819197256);
                        if (objA5 == null) {
                            objA5 = o.d.d.a((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (5359 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 11 - (ViewConfiguration.getTapTimeout() >> 16), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objA5).invoke(null, objArr8)).append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        byte[] bArr5 = f26764i;
                        if (bArr5 != null) {
                            int length2 = bArr5.length;
                            byte[] bArr6 = new byte[length2];
                            for (int i22 = 0; i22 < length2; i22++) {
                                bArr6[i22] = (byte) (((long) bArr5[i22]) ^ (-7649639543924978291L));
                            }
                            bArr5 = bArr6;
                        }
                        boolean z3 = bArr5 != null;
                        jVar.f19934b = 1;
                        while (jVar.f19934b < iIntValue) {
                            if (z3) {
                                byte[] bArr7 = f26764i;
                                jVar.f19936d = jVar.f19936d - 1;
                                jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr7[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                                int i23 = $11 + 75;
                                $10 = i23 % 128;
                                int i24 = i23 % 2;
                            } else {
                                short[] sArr = f26765j;
                                jVar.f19936d = jVar.f19936d - 1;
                                jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                            }
                            sb.append(jVar.f19937e);
                            jVar.f19935c = jVar.f19937e;
                            jVar.f19934b++;
                        }
                    }
                    objArr3[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            static void init$0() {
                $$a = new byte[]{90, -73, MessagePack.Code.BIN8, 52};
                $$b = 201;
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationError(int i5, CharSequence charSequence) throws Throwable {
                d dVar;
                int i6 = 2 % 2;
                if (f.a()) {
                    int i7 = f26762f + 33;
                    f26763g = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr3 = new Object[1];
                    h((short) ((-91) - TextUtils.lastIndexOf("", '0', 0)), (-319886343) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf("", "", 0, 0) + 1951439050, (-29) - MotionEvent.axisFromString(""), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    h((short) (65 - (Process.myPid() >> 22)), (-319886302) - Color.red(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1951439084, Color.alpha(0) - 34, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
                    f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                switch (i5) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 8:
                    case 12:
                        dVar = d.f26354c;
                        break;
                    case 3:
                        dVar = d.f26352a;
                        break;
                    case 6:
                    default:
                        dVar = d.f26360i;
                        break;
                    case 7:
                    case 9:
                        dVar = d.f26355d;
                        break;
                    case 10:
                        dVar = d.f26353b;
                        break;
                    case 11:
                    case 13:
                    case 14:
                        dVar = d.f26360i;
                        int i9 = f26762f + 15;
                        f26763g = i9 % 128;
                        int i10 = i9 % 2;
                        break;
                }
                aVar.c(dVar, a.this);
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationFailed() {
                int i5 = 2 % 2;
                int i6 = f26763g + 79;
                f26762f = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) throws Throwable {
                int i5 = 2 % 2;
                if (f.a()) {
                    int i6 = f26763g + 111;
                    f26762f = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr3 = new Object[1];
                    h((short) ((-90) - (Process.myTid() >> 22)), (-319886343) + KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 1951439050, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 28, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    h((short) (110 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.combineMeasuredStates(0, 0) - 319886267, 1951439085 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.getSize(0) - 30, (byte) View.MeasureSpec.getMode(0), objArr4);
                    f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                a.this.b(aVar);
                int i8 = f26763g + 103;
                f26762f = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: o.r.a$$ExternalSyntheticLambda1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                a.a(biometricPrompt, fragmentActivity);
            }
        });
        biometricPrompt.authenticate(promptInfoBuild);
        int i5 = H + 103;
        G = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
    }

    public static /* synthetic */ Object b(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i6;
        int i10 = ~i5;
        int i11 = ~((-1) - (((-1) - i9) & ((-1) - i10)));
        int i12 = (i11 + i8) - (i11 & i8);
        int i13 = ~((-1) - (((-1) - i6) & ((-1) - i7)));
        int i14 = (i5 + i13) - (i5 & i13);
        int i15 = i8 | i9;
        int i16 = (~(i5 | i7)) | ((-1) - (((-1) - (~((i15 + i10) - (i15 & i10)))) & ((-1) - i13))) | (~((-1) - (((-1) - i6) & ((-1) - i5))));
        int i17 = i6 + i7 + i2 + (1272450877 * i4) + ((-51365948) * i3);
        int i18 = i17 * i17;
        int i19 = ((-261444822) * i6) + 922746880 + ((-1437248296) * i7) + ((-1175803474) * i12) + (i14 * 587901737) + (587901737 * i16) + ((-849346560) * i2) + ((-1881145344) * i4) + ((-578813952) * i3) + ((-124846080) * i18);
        int i20 = (i6 * 1187242746) + 1002376400 + (i7 * 1187242392) + (i12 * (-354)) + (i14 * 177) + (i16 * 177) + (i2 * 1187242569) + (i4 * (-1484311963)) + (i3 * 1141305060) + (i18 * 516358144);
        int i21 = i19 + (i20 * i20 * (-861863936));
        return i21 != 1 ? i21 != 2 ? c(objArr) : d(objArr) : a(objArr);
    }

    private static String b(Context context) {
        int i2 = f26739r * (-2103697993);
        f26739r = i2;
        int i3 = (-756149956) * f26741t;
        f26741t = i3;
        int i4 = f26737p * (-91466120);
        f26737p = i4;
        return (String) b(i3, Process.myUid(), new Object[]{context}, i4, i2, 650336903, -650336901);
    }

    private void b(FragmentActivity fragmentActivity, int i2, o.l.a aVar, Handler handler) throws Exception {
        int i3 = 2 % 2;
        int i4 = H + 111;
        G = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            f.a();
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            L("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{8, 42, 0, 0}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            M((short) (ViewConfiguration.getFadingEdgeLength() >> 16), (-718048038) - TextUtils.getCapsMode("", 0, 0), 394305021 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 34, (byte) KeyEvent.normalizeMetaState(0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        e eVar = new e(this, true, c(aVar, handler));
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        CX.ud();
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        CX.ud();
        fragmentTransactionBeginTransaction.replace(i2, eVar).addToBackStack(null).commit();
        int i5 = G + 19;
        H = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        BiometricPrompt biometricPrompt = (BiometricPrompt) objArr[0];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        int i2 = 2 % 2;
        int i3 = G + 117;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            biometricPrompt.cancelAuthentication();
            fragmentActivity.finish();
            return null;
        }
        biometricPrompt.cancelAuthentication();
        fragmentActivity.finish();
        throw null;
    }

    private static String c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = G + 75;
        H = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("Zf[hd]W T_]bRZ_\u0018,WUZJ\\W", (short) (C1607wl.Xd() ^ 8829), (short) (C1607wl.Xd() ^ 4570))).getMethod(hg.Vd("OLZ7IVQVRBCP", (short) (C1633zX.Xd() ^ (-26835)), (short) (C1633zX.Xd() ^ (-14832))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int i5 = f26744y;
            if (i4 != 0) {
                return resources.getString(i5);
            }
            resources.getString(i5);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private e.b c(o.l.a aVar, Handler handler) {
        int i2 = 2 % 2;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(aVar, handler);
        int i3 = G + 47;
        H = i3 % 128;
        int i4 = i3 % 2;
        return anonymousClass4;
    }

    private void c(Activity activity, o.l.a aVar, Handler handler) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        boolean zA = f.a();
        String strUd = C1561oA.ud("Ҏҍ4ҋ2҉҈/҆-,҃҂)Ҁ'&ѽ$ѻ\"! ѷ\u001eѵѴѳ\u001aѱ\u0018\u0017\u0016ѭ\u0014\u0013Ѫ\u0011\u0010\u000fѦ\r", (short) (C1633zX.Xd() ^ (-204)));
        if (zA) {
            Object[] objArr = new Object[1];
            L(strUd, new int[]{8, 42, 0, 0}, true, objArr);
            String strIntern2 = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            L(C1561oA.yd("ҕ\u000fҗ\u0011\fҐ\u000e\rҍҌҏ\t\u0004҈\u0006Ҋ\u007f҄҇\u0001ҁz}|ѽѼѿѾs", (short) (C1580rY.Xd() ^ (-11396))), new int[]{130, 29, 0, 0}, true, objArr2);
            f.c(strIntern2, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        L(C1561oA.Yd("ԉԊfԌԍԎԏԐ", (short) (C1607wl.Xd() ^ 7647)), new int[]{0, 8, 0, 0}, true, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Class<?> cls = Class.forName(Xg.qd("6D;JHC?\n@MMTFPW\u0012(UU\\Nb_", (short) (Od.Xd() ^ (-22749)), (short) (Od.Xd() ^ (-18331))));
        Class<?>[] clsArr = {Class.forName(Jg.Wd("^Gv{B\u0013!(;\u00143.E>M`", (short) (C1607wl.Xd() ^ 16401), (short) (C1607wl.Xd() ^ 4689)))};
        Object[] objArr4 = {strIntern3};
        short sXd = (short) (C1499aX.Xd() ^ (-5988));
        short sXd2 = (short) (C1499aX.Xd() ^ (-9431));
        int[] iArr = new int[":6\u007f\u0006?!6?O\u0001\u0007\u0017\u001fG]\u001e".length()];
        QB qb = new QB(":6\u007f\u0006?!6?O\u0001\u0007\u0017\u001fG]\u001e");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            KeyguardManager keyguardManager = (KeyguardManager) method.invoke(activity, objArr4);
            if (keyguardManager != null) {
                keyguardManager.requestDismissKeyguard(activity, new AnonymousClass5(aVar, handler));
                return;
            }
            int i4 = G + 87;
            H = i4 % 128;
            int i5 = i4 % 2;
            if (f.a()) {
                int i6 = H + 17;
                G = i6 % 128;
                int i7 = i6 % 2;
                String strUd2 = C1626yg.Ud("̆\u001dǺߝ-DԘ\u000eѕ\tȂӁٔƴЫ\tÓٹ9V;9'Հ\rђ+%܆U]ֆևڤs\fǨRݧZ\u0095̚\u0002̑\u001bZwדǃ˴қ#", (short) (C1633zX.Xd() ^ (-19384)), (short) (C1633zX.Xd() ^ (-23791)));
                if (i7 != 0) {
                    Object[] objArr5 = new Object[1];
                    L(strUd, new int[]{8, 42, 0, 0}, false, objArr5);
                    strIntern = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    L(strUd2, new int[]{159, 52, 0, 0}, true, objArr6);
                    obj = objArr6[0];
                } else {
                    Object[] objArr7 = new Object[1];
                    L(strUd, new int[]{8, 42, 0, 0}, true, objArr7);
                    strIntern = ((String) objArr7[0]).intern();
                    Object[] objArr8 = new Object[1];
                    L(strUd2, new int[]{159, 52, 0, 0}, true, objArr8);
                    obj = objArr8[0];
                }
                f.d(strIntern, ((String) obj).intern());
            }
            aVar.c(d.f26354c, this);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void c(FragmentActivity fragmentActivity, int i2, o.l.a aVar, Handler handler) throws Exception {
        int i3 = 2 % 2;
        int i4 = G + 63;
        H = i4 % 128;
        if (i4 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i5 = G + 61;
            H = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            L("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{8, 42, 0, 0}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            M((short) TextUtils.getOffsetAfter("", 0), (-718048096) + (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 394305019 - TextUtils.lastIndexOf("", '0', 0), 36 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = G + 103;
            H = i7 % 128;
            int i8 = i7 % 2;
        }
        e eVar = new e(this, false, c(aVar, handler));
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        CX.ud();
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        CX.ud();
        fragmentTransactionBeginTransaction.replace(i2, eVar).addToBackStack(null).commit();
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        int i3 = G + 109;
        H = i3 % 128;
        int i4 = i3 % 2;
        short sXd = (short) (C1580rY.Xd() ^ (-13680));
        int[] iArr = new int["\u0016^@({9b90\u000e\rv96.p<r\u001a(Y\u00157".length()];
        QB qb = new QB("\u0016^@({9b90\u000e\rv96.p<r\u001a(Y\u00157");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd + i5)));
            i5++;
        }
        Object[] objArr2 = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(EO.Od("P\u001d<38sUE!`^P", (short) (OY.Xd() ^ 24564)), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr2)).getString(f26738q);
            int i6 = G + 9;
            H = i6 % 128;
            if (i6 % 2 != 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = H + 101;
        G = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\u0010\u001c\u0011\u001e\u001a\u0013\rU\n\u0015\u0013\u0018\b\u0010\u0015Ma\r\u000b\u0010\u007f\u0012\r", (short) (C1633zX.Xd() ^ (-1134)))).getMethod(C1593ug.zd("~}\u000el\u0001\u0010\r\u0014\u0012\u0004\u0007\u0016", (short) (C1607wl.Xd() ^ 13406), (short) (C1607wl.Xd() ^ 3166)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int i5 = f26740s;
            if (i4 == 0) {
                return resources.getString(i5);
            }
            resources.getString(i5);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void f() {
        D = new char[]{56498, 56555, 56553, 56555, 56558, 56560, 56559, 56552, 56506, 56562, 56558, 56558, 56560, 56545, 56543, 56558, 56556, 56558, 56554, 56546, 56550, 56558, 56561, 56553, 56550, 56558, 56564, 56539, 56537, 56555, 56553, 56558, 56539, 56538, 56551, 56553, 56557, 56557, 56545, 56545, 56553, 56549, 56555, 56554, 56539, 56546, 56555, 56553, 56558, 56539, 56343, 56743, 56738, 56736, 56739, 56739, 56723, 56724, 56743, 56741, 56743, 56746, 56748, 56747, 56724, 56433, 56706, 56744, 56748, 56733, 56435, 56418, 56418, 56712, 56754, 56746, 56747, 56747, 56746, 56743, 56718, 56723, 56730, 56736, 56745, 56738, 56746, 56749, 56746, 56738, 56498, 56553, 56545, 56545, 56557, 56557, 56553, 56551, 56534, 56539, 56564, 56558, 56550, 56553, 56561, 56558, 56550, 56546, 56554, 56558, 56556, 56558, 56543, 56545, 56560, 56558, 56558, 56562, 56554, 56551, 56561, 56556, 56552, 56557, 56559, 56527, 56512, 56539, 56554, 56555, 56503, 56553, 56549, 56555, 56554, 56539, 56539, 56548, 56552, 56551, 56553, 56541, 56540, 56558, 56560, 56540, 56536, 56551, 56553, 56557, 56557, 56545, 56548, 56563, 56556, 56557, 56563, 56555, 56555, 56505, 56555, 56550, 56548, 56551, 56551, 56535, 56536, 56555, 56553, 56555, 56558, 56560, 56559, 56536, 56501, 56518, 56556, 56560, 56561, 56519, 56486, 56486, 56519, 56553, 56549, 56555, 56554, 56539, 56539, 56548, 56552, 56551, 56553, 56541, 56540, 56558, 56560, 56540, 56536, 56551, 56553, 56557, 56557, 56545, 56548, 56563, 56556, 56557, 56563, 56555, 56555, 56536, 56375, 56377, 56379, 56384, 56380, 56374, 56345, 56350, 56385, 56352, 56336, 56374, 56390, 56387, 56380, 56377, 56360, 56359, 56381, 56377, 56375, 56498, 56553, 56555, 56558, 56560, 56550, 56547, 56539, 56539, 56548, 56556, 56561, 56552, 56550, 56552, 56533, 56359, 56330, 56328, 56361, 56369, 56336, 56568, 56339, 56364, 56367, 56368, 56368, 56367, 56375, 56359, 56351, 56366, 56364, 56356, 56355, 56355, 56360, 56362, 56364, 56369, 56529, 56354, 56376, 56376, 56358, 56380, 56499, 56515, 56514, 56546, 56554, 56554, 56545, 56555, 56559, 56554, 56552, 56531, 56538, 56555, 56548, 56548, 56553, 56561, 56558, 56549, 56550, 56559, 56521, 56486, 56486, 56514, 56558, 56557, 56548, 56554, 56562, 56558, 56556, 56558, 56519, 56523, 56559, 56552, 56554, 56552, 56514, 56514, 56548, 56548, 56554, 56565, 56564, 56562, 56558, 56555};
        f26745z = 1851688481;
        B = 1150422427;
        E = -1393725445;
        I = new byte[]{-110, 49, 114, 119, -123, 121, -114, MessagePack.Code.NEVER_USED, 42, -128, 117, -117, -124, 126, -115, 112, -97, MessagePack.Code.UINT32, 54, -113, 119, 126, -100, -116, MessagePack.Code.EXT32, 32, -121, MessagePack.Code.BIN8, 126, -128, 42, -120, -122, 126, -128, 120, -100, -81, 94, -110, 91, -107, 120, 113, 112, -121, -120, -124, -115, 126, -126, -99, 98, 114, 119, -123, 121, -114, 115, -108, 101, 115, 112, -95, 86, -123, 121, -114, 115, -108, 108, -116, -125, 125, -119, -127, 126, -117, -124, 117, -117, -117, 98, -127, MessagePack.Code.FLOAT64, 52, 116, -120, -116, -120, 120, 116, -103, 120, MessagePack.Code.NEVER_USED, 126, -128, 33, -98, 124, -114, 115, -95, 88, -124, -115, 126, -126, -99, 98, 114, 119, -123, 121, -114, 115, -108, 101, 115, 112, -95, 86, -123, 121, -114, 115, -108, 108, -116, -125, 125, -119, -127, 126, -117, -124, 117, -117, -117, 98, -127, MessagePack.Code.FLOAT64, 52, 116, -120, -116, -120, 120, 116, -103, 120, MessagePack.Code.NEVER_USED, 126, -128, 33, -98, 124, -114, 115, -95, 88, -124, -115, 126, -126, -99, 98, 114, 119, -123, 121, -82, 82, 115, 112, -95, 86, -123, 121, -114, 115, -108, 108, -116, -125, 125, -119, -127, 126, -123, 124, -116, 119, -85, -88, 74, 116, -128, 120, -77, 64, 102, -104, 122, -116, 120, -95, 86, 120, -97, -108, 66, -120, -122, 120, -117, -124, -116, 118, 114, -117, 120, -98, 115, 119, 112, 113, -115, -94, 64, -117, -124, 126, -115, 112, -97, -115, -125, -113, -115, 99, -113, MessagePack.Code.MAP16, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -119, 122, -118, -126, 115, -116, MessagePack.Code.EXT32, 126, -128, 32, -118, -122, 117, 120, -117, -124, -116, 114, 126, -94, 82, 117, -114, 121, -98, 114, 124, -113, -114, 114, -115, 118, -113, MessagePack.Code.MAP16, 33, -120, -116, MessagePack.Code.TRUE, 49, 120, -118, 121, -126, 117, MessagePack.Code.NIL, 56, -123, 121, -114, 115, 116, MessagePack.Code.FIXEXT16, 107, -105, 49, 114, 124, -98, 115, 119, 120, -117, -124, 112, 121, 114, -103, MessagePack.Code.UINT8, 33, -120, -116, MessagePack.Code.TRUE, 35, -128, 127, 115, MessagePack.Code.FIXEXT16, 107, -105, 50, 96, -98, 112, MessagePack.Code.EXT32, 52, 116, -120, 120, -119, 122, -118, -126, 115, -116, MessagePack.Code.EXT32, 54, 116, -114, -116, 124, MessagePack.Code.STR16, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -119, -122, -113, 102, -98, MessagePack.Code.EXT16, 126, -128, 32, -118, -122, 117, 120, -117, -124, -116, 114, 126, -94, 82, 117, -114, 121, -98, -115, -115, -115, -115, -115, -115, -115, -115, -115};
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
        $$b = 222;
    }

    static void init$1() {
        $$d = new byte[]{100, 68, -66, 16, MessagePack.Code.BIN16, 57, 6, MessagePack.Code.INT64, 58, MessagePack.Code.EXT16, 19};
        $$e = 235;
    }

    static void init$2() {
        $$c = new byte[]{42, MessagePack.Code.FLOAT64, -71, 92};
        $$f = 94;
    }

    @Override // o.l.c
    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 107;
        G = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 15;
        G = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f6 A[Catch: c -> 0x0999, d -> 0x09f6, TRY_ENTER, TRY_LEAVE, TryCatch #8 {c -> 0x0999, d -> 0x09f6, blocks: (B:3:0x001b, B:5:0x002f, B:7:0x003a, B:8:0x0069, B:15:0x00c3, B:38:0x02ff, B:40:0x032a, B:42:0x0333, B:43:0x0362, B:44:0x0414, B:46:0x0423, B:87:0x0869, B:101:0x08a1, B:47:0x0559, B:49:0x05aa, B:51:0x060d, B:55:0x061d, B:59:0x0629, B:60:0x062f, B:61:0x0632, B:65:0x064b, B:67:0x0663, B:68:0x0668, B:72:0x0676, B:70:0x0671, B:71:0x0675, B:73:0x0678, B:78:0x068c, B:84:0x06f4, B:90:0x088a, B:92:0x0890, B:93:0x0891, B:17:0x00f6, B:22:0x01e6, B:24:0x01ec, B:25:0x0225, B:31:0x0264, B:33:0x028d, B:34:0x02b4, B:36:0x02c1, B:37:0x02f7, B:94:0x0892, B:95:0x0897, B:97:0x0899, B:99:0x089f, B:100:0x08a0, B:102:0x0980, B:18:0x0176, B:20:0x0197, B:21:0x01db, B:83:0x06a4), top: B:127:0x001b, inners: #1, #3, #4, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void b(o.l.a r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r.a.b(o.l.a):void");
    }

    @Override // o.l.c
    public final void e(FragmentActivity fragmentActivity, int i2, CancellationSignal cancellationSignal, o.l.a aVar) {
        Object[] objArr = {this, fragmentActivity, Integer.valueOf(i2), cancellationSignal, aVar};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iActiveCount = Thread.activeCount();
        int i3 = f26734l * (-1689694738);
        f26734l = i3;
        b(iElapsedRealtime, i3, objArr, iActiveCount, elapsedCpuTime, 741410348, -741410347);
    }

    @Override // o.l.c
    public final boolean e(c cVar) {
        int i2 = 2 % 2;
        int i3 = H + 5;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        if (cVar != null) {
            return false;
        }
        int i6 = i4 + 77;
        H = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
        return true;
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 89;
        H = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f26747x;
        int i5 = i3 + 61;
        H = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String i() {
        int i2 = 2 % 2;
        int i3 = H + 67;
        G = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f26746w;
        if (i4 != 0) {
            int i5 = 71 / 0;
        }
        return str;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = H + 59;
        int i4 = i3 % 128;
        G = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.C;
        int i5 = i4 + 73;
        H = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
