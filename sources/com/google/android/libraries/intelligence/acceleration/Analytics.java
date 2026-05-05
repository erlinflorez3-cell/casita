package com.google.android.libraries.intelligence.acceleration;

/* JADX INFO: loaded from: classes8.dex */
public final class Analytics {
    private static native boolean nativeIsProcessInBackground();

    private static native void nativeNotifyProcessLifecycleState(boolean z2);

    public static void zza(boolean z2) {
        nativeNotifyProcessLifecycleState(z2);
    }

    static boolean zzb() {
        return nativeIsProcessInBackground();
    }
}
