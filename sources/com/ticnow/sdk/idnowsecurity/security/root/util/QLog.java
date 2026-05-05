package com.ticnow.sdk.idnowsecurity.security.root.util;

import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public final class QLog {
    public static final int FALL = 5;
    public static final int FERRORS_ONLY = 1;
    public static final int FERRORS_WARNINGS = 2;
    public static final int FERRORS_WARNINGS_INFO = 3;
    public static final int FERRORS_WARNINGS_INFO_DEBUG = 4;
    public static final int FNONE = 0;
    public static int LOGGING_LEVEL = 5;
    private static final String TAG = "RootBeer";
    private static final String TAG_GENERAL_OUTPUT = "QLog";

    private QLog() {
    }

    public static boolean FisDLoggable() {
        return LOGGING_LEVEL > 3;
    }

    public static boolean FisELoggable() {
        return LOGGING_LEVEL > 0;
    }

    public static boolean FisILoggable() {
        return LOGGING_LEVEL > 2;
    }

    public static boolean FisVLoggable() {
        return LOGGING_LEVEL > 4;
    }

    public static boolean FisWLoggable() {
        return LOGGING_LEVEL > 1;
    }

    public static void d(Object obj) {
        FisDLoggable();
    }

    public static void e(Object obj) {
        FisELoggable();
    }

    public static void e(Object obj, Throwable th) {
        FisELoggable();
    }

    private static String getThrowableTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static String getTrace() throws Throwable {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[2];
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("vn\u0005p>}s\u0002{Ci\fy|\u0006o\u000f~\u0002\u0005e\u000e\b\u0011\n\u0014\u001b", (short) (C1633zX.Xd() ^ (-24910)))).getMethod(Xg.qd("A@P*CSHPF1ERK", (short) (Od.Xd() ^ (-5993)), (short) (Od.Xd() ^ (-5955))), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(stackTraceElement, objArr);
            StackTraceElement stackTraceElement2 = stackTrace[2];
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("uGFk\u0002;ZBeeUp\tdWy\"\f8\u0015^@\u0003\u0006hK<", (short) (Od.Xd() ^ (-31858)), (short) (Od.Xd() ^ (-11983)))).getMethod(ZO.xd("#=daQ=)|->o7", (short) (OY.Xd() ^ 10035), (short) (OY.Xd() ^ 10861)), new Class[0]);
            try {
                method2.setAccessible(true);
                String str2 = (String) method2.invoke(stackTraceElement2, objArr2);
                StackTraceElement stackTraceElement3 = stackTrace[2];
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1626yg.Ud("1N?vo\u00022T\u0015M[\u000bQU\u000f\u0012zGo[\u0010m\u000eQ\\M#", (short) (C1633zX.Xd() ^ (-26467)), (short) (C1633zX.Xd() ^ (-14446)))).getMethod(Ig.wd(",\u0002#\u0012_ rK 72S.", (short) (OY.Xd() ^ 29999)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    return str2.substring(str2.lastIndexOf(46) + 1) + EO.Od("D|", (short) (Od.Xd() ^ (-5974))) + str + C1561oA.Qd("ppf!", (short) (FB.Xd() ^ PhotoshopDirectory.TAG_EXIF_DATA_3)) + ((Integer) method3.invoke(stackTraceElement3, objArr3)).intValue() + C1593ug.zd("(kym", (short) (C1607wl.Xd() ^ 22229), (short) (C1607wl.Xd() ^ 11370));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static void handleException(Exception exc) {
        exc.printStackTrace();
    }

    public static void i(Object obj) {
        FisILoggable();
    }

    public static void v(Object obj) {
        if (FisVLoggable()) {
            String str = getTrace() + String.valueOf(obj);
        }
    }

    public static void w(Object obj) {
        if (FisWLoggable()) {
            String str = getTrace() + String.valueOf(obj);
            String str2 = getTrace() + String.valueOf(obj);
        }
    }

    public static void w(Object obj, Throwable th) {
        if (FisWLoggable()) {
            String str = getTrace() + String.valueOf(obj);
            getThrowableTrace(th);
            String str2 = getTrace() + String.valueOf(obj);
            getThrowableTrace(th);
        }
    }
}
