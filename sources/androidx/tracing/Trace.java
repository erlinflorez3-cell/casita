package androidx.tracing;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class Trace {
    static final int MAX_TRACE_LABEL_LENGTH = 127;
    static final String TAG = "Trace";
    private static Method sAsyncTraceBeginMethod = null;
    private static Method sAsyncTraceEndMethod = null;
    private static boolean sHasAppTracingEnabled = false;
    private static Method sIsTagEnabledMethod = null;
    private static Method sTraceCounterMethod = null;
    private static long sTraceTagApp = 0;

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return TraceApi29Impl.isEnabled();
        }
        return isEnabledFallback();
    }

    public static void forceEnableAppTracing() {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                if (sHasAppTracingEnabled) {
                    return;
                }
                sHasAppTracingEnabled = true;
                android.os.Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, true);
            } catch (Exception e2) {
                handleException("setAppTracingAllowed", e2);
            }
        }
    }

    public static void beginSection(String str) {
        TraceApi18Impl.beginSection(truncatedTraceSectionLabel(str));
    }

    public static void endSection() {
        TraceApi18Impl.endSection();
    }

    public static void beginAsyncSection(String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.beginAsyncSection(truncatedTraceSectionLabel(str), i2);
        } else {
            beginAsyncSectionFallback(truncatedTraceSectionLabel(str), i2);
        }
    }

    public static void endAsyncSection(String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.endAsyncSection(truncatedTraceSectionLabel(str), i2);
        } else {
            endAsyncSectionFallback(truncatedTraceSectionLabel(str), i2);
        }
    }

    public static void setCounter(String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.setCounter(truncatedTraceSectionLabel(str), i2);
        } else {
            setCounterFallback(truncatedTraceSectionLabel(str), i2);
        }
    }

    private static boolean isEnabledFallback() {
        try {
            if (sIsTagEnabledMethod == null) {
                sTraceTagApp = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                sIsTagEnabledMethod = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) sIsTagEnabledMethod.invoke(null, Long.valueOf(sTraceTagApp))).booleanValue();
        } catch (Exception e2) {
            handleException("isTagEnabled", e2);
            return false;
        }
    }

    private static void beginAsyncSectionFallback(String str, int i2) {
        try {
            if (sAsyncTraceBeginMethod == null) {
                sAsyncTraceBeginMethod = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            sAsyncTraceBeginMethod.invoke(null, Long.valueOf(sTraceTagApp), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            handleException("asyncTraceBegin", e2);
        }
    }

    private static void endAsyncSectionFallback(String str, int i2) {
        try {
            if (sAsyncTraceEndMethod == null) {
                sAsyncTraceEndMethod = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            sAsyncTraceEndMethod.invoke(null, Long.valueOf(sTraceTagApp), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            handleException("asyncTraceEnd", e2);
        }
    }

    private static void setCounterFallback(String str, int i2) {
        try {
            if (sTraceCounterMethod == null) {
                sTraceCounterMethod = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            sTraceCounterMethod.invoke(null, Long.valueOf(sTraceTagApp), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            handleException("traceCounter", e2);
        }
    }

    private static void handleException(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        String str2 = "Unable to call " + str + " via reflection";
    }

    private static String truncatedTraceSectionLabel(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    private Trace() {
    }
}
