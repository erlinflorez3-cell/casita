package com.incode.welcome_sdk.commons.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class BiometricConsentNotReceived extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5008d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5009e = 123 % 128;

    public /* synthetic */ BiometricConsentNotReceived(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "The user's biometric consent was not received by Incode. Any biometric data stored locally has been removed since Incode can't determine the user's consent status." : str);
    }

    public BiometricConsentNotReceived(String str) {
        super(str);
    }

    static {
        if (123 % 2 == 0) {
            throw null;
        }
    }

    public BiometricConsentNotReceived() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
