package com.facebook.react.bridge;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNoCrashSoftException extends RuntimeException {
    public ReactNoCrashSoftException(String str) {
        super(str);
    }

    public ReactNoCrashSoftException(String str, @Nullable Throwable th) {
        super(str, th);
    }

    public ReactNoCrashSoftException(Throwable th) {
        super(th);
    }
}
