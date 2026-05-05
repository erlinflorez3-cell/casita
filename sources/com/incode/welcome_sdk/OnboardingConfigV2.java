package com.incode.welcome_sdk;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = "Replace with FlowConfig or SessionConfig", replaceWith = @ReplaceWith(expression = "SessionConfig", imports = {"com.incode.welcome_sdk.FlowConfig"}))
public final class OnboardingConfigV2 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4384a = 105 % 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4385d = 0;

    @Deprecated(message = "Replace with FlowConfig.Builder or SessionConfig.Builder", replaceWith = @ReplaceWith(expression = "Builder", imports = {"com.incode.welcome_sdk.FlowConfig.Builder"}))
    public static final class OnboardingConfigBuilderV2 {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4386a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f4387b = 0;

        static {
            int i2 = 1 + 51;
            f4387b = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    static {
        int i2 = 105 % 2;
    }
}
