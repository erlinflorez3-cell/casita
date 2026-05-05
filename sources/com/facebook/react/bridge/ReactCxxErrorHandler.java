package com.facebook.react.bridge;

import com.facebook.common.logging.FLog;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc = null;
    private static Object mObject = null;

    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e2) {
                FLog.e("ReactCxxErrorHandler", "Failed to invoke error handler function", e2);
            }
        }
    }

    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}
