package org.springframework.core;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NestedExceptionUtils {
    public static String buildMessage(String str, Throwable th) {
        if (th == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str).append("; ");
        }
        sb.append("nested exception is ").append(th);
        return sb.toString();
    }
}
