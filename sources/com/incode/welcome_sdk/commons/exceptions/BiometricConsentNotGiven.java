package com.incode.welcome_sdk.commons.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class BiometricConsentNotGiven extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5006b = 15 % 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5007d = 0;

    public /* synthetic */ BiometricConsentNotGiven(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "The user did not give consent to storing biometric data. Any biometric data stored locally has been removed." : str);
    }

    public BiometricConsentNotGiven(String str) {
        super(str);
    }

    static {
        if (15 % 2 == 0) {
            int i2 = 36 / 0;
        }
    }

    public BiometricConsentNotGiven() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
