package com.incode.welcome_sdk.listeners;

import android.os.SystemClock;
import com.incode.welcome_sdk.IncodeWelcome;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class CommonBaseListener implements BaseListener {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f10419b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f10420e = 0;
    private final IncodeWelcome.OnboardingListener onboardingListener;

    @Override // com.incode.welcome_sdk.listeners.ErrorListener
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.onboardingListener.onError(error);
    }

    @Override // com.incode.welcome_sdk.listeners.UserCancelledListener
    public void onUserCancelled() {
        this.onboardingListener.onUserCancelled();
    }

    public CommonBaseListener(IncodeWelcome.OnboardingListener onboardingListener) {
        Intrinsics.checkNotNullParameter(onboardingListener, "onboardingListener");
        this.onboardingListener = onboardingListener;
    }

    public static int e() {
        int i2 = f10420e;
        int i3 = i2 % 7912769;
        f10420e = i2 + 1;
        if (i3 != 0) {
            return f10419b;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        f10419b = iUptimeMillis;
        return iUptimeMillis;
    }
}
