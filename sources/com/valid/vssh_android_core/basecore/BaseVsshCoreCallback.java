package com.valid.vssh_android_core.basecore;

/* JADX INFO: loaded from: classes5.dex */
public interface BaseVsshCoreCallback {

    public class ParseException extends RuntimeException {
    }

    void onCoreError(Integer num, Integer num2, String str);

    void onGenericResponse(String str, Integer num, String str2);

    void onGenericResponse(String str, Integer num, String str2, String str3);
}
