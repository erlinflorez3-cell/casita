package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Email extends BaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10520b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10521c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10522a;

    private Email(boolean z2) {
        super(Modules.EMAIL);
        this.f10522a = z2;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f10520b + 67;
        int i4 = i3 % 128;
        f10521c = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10522a;
        int i6 = i4 + 115;
        f10520b = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<? extends Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10520b + 81;
        f10521c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        verifyAddAndProcessDataNotAfterApprove(list);
        int i5 = f10521c + 75;
        f10520b = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10523b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10524c = 23 % 128;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10525d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10526e = 1;
        private boolean otpVerificationEnabled;

        public final Builder setOtpVerificationEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10526e;
            int i4 = i3 + 73;
            f10525d = i4 % 128;
            int i5 = i4 % 2;
            this.otpVerificationEnabled = z2;
            int i6 = i3 + 63;
            f10525d = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Email build() {
            int i2 = 2 % 2;
            Email email = new Email(this.otpVerificationEnabled, (byte) 0);
            int i3 = f10526e + 61;
            f10525d = i3 % 128;
            int i4 = i3 % 2;
            return email;
        }

        static {
            int i2 = 23 % 2;
        }
    }

    public /* synthetic */ Email(boolean z2, byte b2) {
        this(z2);
    }
}
