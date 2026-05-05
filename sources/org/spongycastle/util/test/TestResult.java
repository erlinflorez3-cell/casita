package org.spongycastle.util.test;

/* JADX INFO: loaded from: classes2.dex */
public interface TestResult {
    Throwable getException();

    boolean isSuccessful();

    String toString();
}
