package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultJSExceptionHandler implements JSExceptionHandler {
    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        if (!(exc instanceof RuntimeException)) {
            throw new RuntimeException(exc);
        }
        throw ((RuntimeException) exc);
    }
}
