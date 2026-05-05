package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes8.dex */
public interface Clock {

    /* JADX INFO: renamed from: com.google.android.gms.common.util.Clock$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    long currentThreadTimeMillis();

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();
}
