package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import com.facetec.sdk.ad;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;
import org.msgpack.core.MessagePack;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
abstract class be {
    static bu B = null;
    static boolean Code = false;
    static float D = 1.7f;
    static float F = -1.0f;
    static String I = "";
    static float L = -1.0f;
    static ad S = null;
    static float Z = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f2975a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static bu f2976b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f2977d = -1;
    protected WeakReference<ad> V = new WeakReference<>(null);
    protected boolean C = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ad.B f2978c = new cc() { // from class: com.facetec.sdk.be.3
        private Boolean I = Boolean.FALSE;

        @Override // com.facetec.sdk.cc, com.facetec.sdk.ad.B
        public final void Code(ah ahVar, ac acVar) {
            if (this.I.booleanValue() || acVar == ac.FACE_NOT_FOUND) {
                return;
            }
            this.I = Boolean.TRUE;
            be.this.V();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ad.Z f2979e = new am() { // from class: com.facetec.sdk.be.5
        @Override // com.facetec.sdk.am, com.facetec.sdk.ad.Z
        public final void Code(al alVar, aj ajVar, ak akVar, an anVar) {
        }
    };

    static final class I {
        private static int B = 0;
        private static short[] C = null;
        static final String[] Code;
        private static int D = 0;
        private static int F = 1;
        private static int I = 0;
        private static int V = 0;
        private static byte[] Z = null;

        static {
            V();
            Code = new String[]{Z((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28784189, (short) ((-57) - View.MeasureSpec.getMode(0)), (-27) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((-53) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-1902149347) - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), Z(View.getDefaultSize(0, 0) + 28784190, (short) (103 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getPressedStateDuration() >> 16) - 24, (byte) (122 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-1902149344) - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), Z((ViewConfiguration.getPressedStateDuration() >> 16) + 28784190, (short) ((-104) - ((byte) KeyEvent.getModifierMetaStateMask())), (-24) - (ViewConfiguration.getTouchSlop() >> 8), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 88), (-1902149338) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), Z((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28784190, (short) ((-6) - (KeyEvent.getMaxKeyCode() >> 16)), (-24) - ExpandableListView.getPackedPositionGroup(0L), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 121), Process.getGidForName("") - 1902149331).intern(), Z((ViewConfiguration.getFadingEdgeLength() >> 16) + 28784190, (short) ((-8) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (-24) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 38), (-1902149326) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), Z(View.getDefaultSize(0, 0) + 28784190, (short) (122 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 23, (byte) ((-49) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.resolveSizeAndState(0, 0, 0) - 1902149320).intern(), Z(28784191 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (TextUtils.getCapsMode("", 0, 0) + 46), ExpandableListView.getPackedPositionChild(0L) - 23, (byte) (66 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.getDefaultSize(0, 0) - 1902149314).intern(), Z(28784182 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) ((-92) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-24) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (74 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1902149309).intern(), Z((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28784189, (short) (30 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Process.getGidForName("") - 21, (byte) (Color.red(0) + 75), (-1902149302) - TextUtils.getOffsetBefore("", 0)).intern()};
            int i2 = D + 111;
            F = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        I() {
        }

        static void V() {
            B = -28784107;
            Z = new byte[]{16, 99, 105, Ascii.EM, Ascii.DC4, 48, -4, 50, Ascii.FS, -65, 10, Ascii.RS, -87, Ascii.US, 9, 125, 120, -126, -92, 110, 120, 42, -27, MessagePack.Code.INT16, 68, MessagePack.Code.UINT32, -28, -73, -72, -88, 92, -74, -68, MessagePack.Code.FIXARRAY_PREFIX, -116, -128, 45, 115, -115, -90, Ascii.EM, Ascii.DC4, -84, 6, -89, -97, 54, 44, -106, -111, 79, -115, -109, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            V = 1902149347;
            I = 31;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[PHI: r14
  0x0051: PHI (r14v8 int) = (r14v3 int), (r14v11 int) binds: [B:30:0x0097, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String Z(int r10, short r11, int r12, byte r13, int r14) {
            /*
                r9 = 2
                int r0 = r9 % r9
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int r6 = com.facetec.sdk.be.I.I
                int r12 = r12 + r6
                r8 = 0
                r0 = -1
                r7 = 1
                if (r12 != r0) goto Lab
                int r0 = com.facetec.sdk.be.I.D
                int r1 = r0 + 5
                int r0 = r1 % 128
                com.facetec.sdk.be.I.F = r0
                int r1 = r1 % r9
                r5 = r7
            L1a:
                if (r5 == 0) goto L3c
                int r4 = com.facetec.sdk.be.I.F
                int r1 = r4 + 101
                int r0 = r1 % 128
                com.facetec.sdk.be.I.D = r0
                int r1 = r1 % r9
                if (r1 != 0) goto Lbc
                byte[] r2 = com.facetec.sdk.be.I.Z
                if (r2 == 0) goto La1
                int r1 = r4 + 29
                int r0 = r1 % 128
                com.facetec.sdk.be.I.D = r0
                int r1 = r1 % r9
                if (r1 == 0) goto L9a
                int r0 = com.facetec.sdk.be.I.V
                int r0 = r14 >>> r0
                r0 = r2[r0]
                int r0 = r0 << r6
            L3b:
                byte r12 = (byte) r0
            L3c:
                if (r12 <= 0) goto Lb7
                int r0 = com.facetec.sdk.be.I.D
                int r1 = r0 + 61
                int r0 = r1 % 128
                com.facetec.sdk.be.I.F = r0
                int r1 = r1 % r9
                r6 = 4
                if (r1 != 0) goto L92
                int r14 = r14 % r12
                int r14 = r14 * r6
                int r0 = com.facetec.sdk.be.I.V
                int r14 = r14 + r0
                if (r5 == 0) goto L52
            L51:
                r8 = r7
            L52:
                int r14 = r14 + r8
                int r0 = com.facetec.sdk.be.I.B
                int r10 = r10 + r0
                char r4 = (char) r10
                r3.append(r4)
                r2 = r7
            L5b:
                if (r2 >= r12) goto Lb7
                byte[] r0 = com.facetec.sdk.be.I.Z
                if (r0 == 0) goto L7e
                int r5 = r14 + (-1)
                r0 = r0[r14]
                int r0 = r0 + r11
                byte r0 = (byte) r0
                r0 = r0 ^ r13
                int r4 = r4 + r0
                char r4 = (char) r4
            L6a:
                r14 = r5
                r3.append(r4)
                int r2 = r2 + 1
                int r0 = com.facetec.sdk.be.I.F
                int r1 = r0 + 57
                int r0 = r1 % 128
                com.facetec.sdk.be.I.D = r0
                int r1 = r1 % r9
                if (r1 == 0) goto L5b
                int r0 = r6 % 3
                goto L5b
            L7e:
                short[] r0 = com.facetec.sdk.be.I.C
                int r5 = r14 + (-1)
                short r0 = r0[r14]
                int r0 = r0 + r11
                short r0 = (short) r0
                r0 = r0 ^ r13
                int r4 = r4 + r0
                char r4 = (char) r4
                int r1 = com.facetec.sdk.be.I.D
                int r1 = r1 + r7
                int r0 = r1 % 128
                com.facetec.sdk.be.I.F = r0
                int r1 = r1 % r9
                goto L6a
            L92:
                int r14 = r14 + r12
                int r14 = r14 - r9
                int r0 = com.facetec.sdk.be.I.V
                int r14 = r14 + r0
                if (r5 == 0) goto L52
                goto L51
            L9a:
                int r0 = com.facetec.sdk.be.I.V
                int r0 = r0 + r14
                r0 = r2[r0]
                int r0 = r0 + r6
                goto L3b
            La1:
                short[] r1 = com.facetec.sdk.be.I.C
                int r0 = com.facetec.sdk.be.I.V
                int r0 = r0 + r14
                short r0 = r1[r0]
                int r0 = r0 + r6
                short r12 = (short) r0
                goto L3c
            Lab:
                int r0 = com.facetec.sdk.be.I.F
                int r1 = r0 + 107
                int r0 = r1 % 128
                com.facetec.sdk.be.I.D = r0
                int r1 = r1 % r9
                r5 = r8
                goto L1a
            Lb7:
                java.lang.String r0 = r3.toString()
                return r0
            Lbc:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.I.Z(int, short, int, byte, int):java.lang.String");
        }
    }

    be() {
    }

    static synchronized bu B() {
        return f2976b;
    }

    static synchronized void Code(Context context) {
        if (f2976b == null) {
            try {
                f2976b = !Code ? bl.B(context) : bm.C();
                D = r0.B / f2976b.I;
            } catch (Exception unused) {
            }
        }
    }

    private static Boolean L() {
        try {
            return Boolean.FALSE;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    static Boolean V(Context context) throws bi {
        for (String str : I.Code) {
            if (Build.MODEL.contains(str)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.valueOf(bl.I(context));
    }

    static float Z(Activity activity) throws bi {
        return bl.V(activity);
    }

    static be Z(ViewGroup viewGroup, Activity activity, boolean z2) throws bi {
        Code = z2;
        f2976b = null;
        B = null;
        Code(activity);
        be bmVar = L().booleanValue() ? new bj() : (!z2 && V(activity).booleanValue()) ? new bl(activity) : new bm(activity);
        View viewCode = bmVar.Code();
        viewGroup.addView(viewCode);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        viewCode.setLayoutParams(layoutParams);
        return bmVar;
    }

    public abstract View Code();

    abstract void Code(MotionEvent motionEvent, ViewGroup viewGroup);

    abstract void Code(boolean z2);

    public abstract void I();

    public final void I(final Runnable runnable) throws Throwable {
        final Timer timer = new Timer();
        short sXd = (short) (Od.Xd() ^ (-29036));
        short sXd2 = (short) (Od.Xd() ^ (-30667));
        int[] iArr = new int["?MDSQLH\u0013UZ\u00165YZ\\R`".length()];
        QB qb = new QB("?MDSQLH\u0013UZ\u00165YZ\\R`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Jg.Wd("\u007f'm\u001ei=\u0016/,o,x=", (short) (ZN.Xd() ^ 31225), (short) (ZN.Xd() ^ 2470)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            final Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            final TimerTask timerTask = new TimerTask() { // from class: com.facetec.sdk.be.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    if (be.this.C) {
                        synchronized (timer) {
                            cancel();
                            handler.removeCallbacksAndMessages(null);
                            Handler handler2 = handler;
                            Runnable runnable2 = new Runnable() { // from class: com.facetec.sdk.be.1.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    runnable.run();
                                }
                            };
                            Class<?> cls = Class.forName(C1561oA.ud("\u0012\u001e\u0013 \u001c\u0015\u000fW\u0018\u001bTm\u0006\u0012\u0007\u000e\u0006\u0012", (short) (OY.Xd() ^ 17630)));
                            Class<?>[] clsArr = new Class[1];
                            short sXd3 = (short) (ZN.Xd() ^ 29102);
                            int[] iArr2 = new int["h`r^(gYg]%Fj`aQSZT".length()];
                            QB qb2 = new QB("h`r^(gYg]%Fj`aQSZT");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                                i3++;
                            }
                            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                            Object[] objArr2 = {runnable2};
                            Method method = cls.getMethod(C1561oA.Yd("$$)+", (short) (Od.Xd() ^ (-8529))), clsArr);
                            try {
                                method.setAccessible(true);
                                method.invoke(handler2, objArr2);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                    }
                }
            };
            timer.scheduleAtFixedRate(timerTask, 0L, 100L);
            Runnable runnable2 = new Runnable() { // from class: com.facetec.sdk.be.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (timer) {
                        timerTask.cancel();
                        runnable.run();
                    }
                }
            };
            Class<?> cls = Class.forName(ZO.xd("TG$\u001dy\u00185\u007fyFsb?\u0011Y{Md", (short) (C1607wl.Xd() ^ 23689), (short) (C1607wl.Xd() ^ 29323)));
            Class<?>[] clsArr = new Class[2];
            short sXd3 = (short) (OY.Xd() ^ 6053);
            short sXd4 = (short) (OY.Xd() ^ 20958);
            int[] iArr2 = new int["R.-\n%\u0010m\u0019N_\u001a1q*xcS+".length()];
            QB qb2 = new QB("R.-\n%\u0010m\u0019N_\u001a1q*xcS+");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr[1] = Long.TYPE;
            Object[] objArr2 = {runnable2, 8000L};
            Method method = cls.getMethod(Ig.wd("7\f\u001e7@\u0004n\\\u001912", (short) (FB.Xd() ^ 3761)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    abstract void I(boolean z2);

    protected abstract void V();

    final void V(ad adVar) {
        S = adVar;
        this.V = new WeakReference<>(adVar);
        adVar.V(this.f2979e);
        adVar.B(this.f2978c);
    }

    abstract void Z();

    abstract void Z(boolean z2);
}
