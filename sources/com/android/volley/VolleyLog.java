package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class VolleyLog {
    public static String TAG = "Volley";
    public static boolean DEBUG = Log.isLoggable("Volley", 2);
    private static final String CLASS_NAME = VolleyLog.class.getName();

    static class MarkerLog {
        public static final boolean ENABLED = VolleyLog.DEBUG;
        private static final long MIN_DURATION_FOR_LOGGING_MS = 0;
        private final List<Marker> mMarkers = new ArrayList();
        private boolean mFinished = false;

        private static class Marker {
            public final String name;
            public final long thread;
            public final long time;

            public Marker(String str, long j2, long j3) {
                this.name = str;
                this.thread = j2;
                this.time = j3;
            }
        }

        MarkerLog() {
        }

        private long getTotalDuration() {
            if (this.mMarkers.size() == 0) {
                return 0L;
            }
            return this.mMarkers.get(r1.size() - 1).time - this.mMarkers.get(0).time;
        }

        public synchronized void add(String str, long j2) {
            if (this.mFinished) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.mMarkers.add(new Marker(str, j2, SystemClock.elapsedRealtime()));
        }

        protected void finalize() throws Throwable {
            if (this.mFinished) {
                return;
            }
            finish("Request on the loose");
            VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        public synchronized void finish(String str) {
            this.mFinished = true;
            long totalDuration = getTotalDuration();
            if (totalDuration <= 0) {
                return;
            }
            long j2 = this.mMarkers.get(0).time;
            VolleyLog.d("(%-4d ms) %s", Long.valueOf(totalDuration), str);
            for (Marker marker : this.mMarkers) {
                long j3 = marker.time;
                VolleyLog.d("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(marker.thread), marker.name);
                j2 = j3;
            }
        }
    }

    private static String buildMessage(String str, Object... objArr) throws Throwable {
        String strYd;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i2 = 2;
        while (true) {
            if (i2 >= stackTrace.length) {
                strYd = C1561oA.Yd("K\u0006\u007f}\u0002\u0004\r\u0005U", (short) (OY.Xd() ^ 25666));
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            Object[] objArr2 = new Object[0];
            Method method = Class.forName(Wg.Zd("w\"dpzj|;A1\n\u00157b\u0010\u0012Mm-R_8~0M\u0010K", (short) (FB.Xd() ^ 10965), (short) (FB.Xd() ^ 5648))).getMethod(C1561oA.Xd("yx\tX\u0003x\f\rh|\n\u0003", (short) (Od.Xd() ^ (-26080))), new Class[0]);
            try {
                method.setAccessible(true);
                if (((String) method.invoke(stackTraceElement, objArr2)).equals(CLASS_NAME)) {
                    i2++;
                } else {
                    StackTraceElement stackTraceElement2 = stackTrace[i2];
                    short sXd = (short) (C1499aX.Xd() ^ (-11052));
                    int[] iArr = new int["\u0019\u000f#\rX\u0016\n\u0016\u001ec\b(\u0014\u0015\u001c\u00041\u001f !\u007f&\u001e%,49".length()];
                    QB qb = new QB("\u0019\u000f#\rX\u0016\n\u0016\u001ec\b(\u0014\u0015\u001c\u00041\u001f !\u007f&\u001e%,49");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
                        i3++;
                    }
                    Object[] objArr3 = new Object[0];
                    Method method2 = Class.forName(new String(iArr, 0, i3)).getMethod(Qg.kd("\r\n\u0018e\u000e\u0002\u0013\u0012k}\t\u007f", (short) (C1633zX.Xd() ^ (-23026)), (short) (C1633zX.Xd() ^ (-9941))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        String str2 = (String) method2.invoke(stackTraceElement2, objArr3);
                        String strSubstring = str2.substring(str2.lastIndexOf(46) + 1);
                        StringBuilder sbAppend = new StringBuilder().append(strSubstring.substring(strSubstring.lastIndexOf(36) + 1)).append(hg.Vd("L", (short) (C1633zX.Xd() ^ (-23685)), (short) (C1633zX.Xd() ^ (-8711))));
                        StackTraceElement stackTraceElement3 = stackTrace[i2];
                        Object[] objArr4 = new Object[0];
                        Method method3 = Class.forName(C1561oA.ud("aWkU!^R^V\u001c@`LMT<YGHI(NFMDLQ", (short) (ZN.Xd() ^ 8864))).getMethod(C1561oA.yd("\u0001\u007f\u0010i\u0003\u0013\b\u0010u`t\u0002z", (short) (C1607wl.Xd() ^ 9186)), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            strYd = sbAppend.append((String) method3.invoke(stackTraceElement3, objArr4)).toString();
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        return String.format(Locale.US, Xg.qd("-w82u{K\u0013y\u007fO", (short) (OY.Xd() ^ 10053), (short) (OY.Xd() ^ 9527)), Long.valueOf(Thread.currentThread().getId()), strYd, str);
    }

    public static void d(String str, Object... objArr) throws Throwable {
        String str2 = TAG;
        buildMessage(str, objArr);
    }

    public static void e(String str, Object... objArr) throws Throwable {
        String str2 = TAG;
        buildMessage(str, objArr);
    }

    public static void e(Throwable th, String str, Object... objArr) throws Throwable {
        String str2 = TAG;
        buildMessage(str, objArr);
    }

    public static void setTag(String str) throws Throwable {
        d("Changing log tag to %s", str);
        TAG = str;
        DEBUG = Log.isLoggable(str, 2);
    }

    public static void v(String str, Object... objArr) throws Throwable {
        if (DEBUG) {
            String str2 = TAG;
            buildMessage(str, objArr);
        }
    }

    public static void wtf(String str, Object... objArr) throws Throwable {
        String str2 = TAG;
        buildMessage(str, objArr);
    }

    public static void wtf(Throwable th, String str, Object... objArr) throws Throwable {
        String str2 = TAG;
        buildMessage(str, objArr);
    }
}
