package com.dynatrace.android.agent;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public interface DTXAction {
    void cancel();

    String getRequestTag();

    String getRequestTagHeader();

    boolean isFinished();

    void leaveAction();

    void reportError(String str, int i2);

    void reportError(String str, Throwable th);

    void reportEvent(String str);

    void reportValue(String str, double d2);

    void reportValue(String str, int i2);

    void reportValue(String str, long j2);

    void reportValue(String str, String str2);

    @Deprecated
    void tagRequest(HttpURLConnection httpURLConnection);
}
