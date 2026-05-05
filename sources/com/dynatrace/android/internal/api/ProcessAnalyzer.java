package com.dynatrace.android.internal.api;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class ProcessAnalyzer {
    private static final String DYNATRACE_REPLAY_SERVICE = ":dynatrace_replay_service";

    static String getProcessNameOrNull() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isInternalProcess() {
        String processNameOrNull = getProcessNameOrNull();
        return processNameOrNull != null && processNameOrNull.contains(DYNATRACE_REPLAY_SERVICE);
    }

    public static boolean isMainProcess(Context context) throws Throwable {
        Object obj;
        String processNameOrNull = getProcessNameOrNull();
        if (processNameOrNull == null) {
            return true;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("3A8GE@<\u0007=JJQCMT\u000f%RRYK_\\", (short) (FB.Xd() ^ 29851), (short) (FB.Xd() ^ 1674))).getMethod(Jg.Wd("_n\u0013b'uvFE\u0011;1N];qpK", (short) (C1580rY.Xd() ^ (-15112)), (short) (C1580rY.Xd() ^ (-2086))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strXd = ZO.xd("-tblU\u001fsWUza\fS\u0007Fk]\u0018\u001d\u007f?r\u0005.4l~\u001fD \u0005.w4", (short) (OY.Xd() ^ 19497), (short) (OY.Xd() ^ 13953));
            String strUd = C1626yg.Ud("\u001fx\t\"T\r~\u0016N\u00123", (short) (C1580rY.Xd() ^ (-26142)), (short) (C1580rY.Xd() ^ (-20722)));
            try {
                Class<?> cls = Class.forName(strXd);
                Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return processNameOrNull.equals((String) obj);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
