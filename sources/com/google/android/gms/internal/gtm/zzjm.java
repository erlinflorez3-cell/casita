package com.google.android.gms.internal.gtm;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
final class zzjm implements ThreadFactory {
    zzjm() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "google-tag-manager-background-thread");
    }
}
