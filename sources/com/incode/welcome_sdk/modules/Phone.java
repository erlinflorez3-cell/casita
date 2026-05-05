package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Phone extends BaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10622a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10623c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10625e;

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f10622a + 77;
        f10623c = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f10624d;
        if (i4 == 0) {
            int i5 = 40 / 0;
        }
        return z2;
    }

    public final int d() {
        int i2 = 2 % 2;
        int i3 = f10623c;
        int i4 = i3 + 35;
        f10622a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f10625e;
        int i7 = i3 + 1;
        f10622a = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Phone(boolean z2, int i2) {
        super(Modules.PHONE);
        this.f10624d = z2;
        this.f10625e = i2;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<? extends Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10623c + 73;
        f10622a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        verifyAddAndProcessDataNotAfterApprove(list);
        int i5 = f10623c + 13;
        f10622a = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10626a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10627b = 109 % 128;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10628d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10629e = 1;
        private int defaultRegionPrefix = -1;
        private boolean otpVerificationEnabled;

        public final Builder setOtpVerificationEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10626a + 11;
            f10629e = i3 % 128;
            if (i3 % 2 == 0) {
                this.otpVerificationEnabled = z2;
                int i4 = 76 / 0;
            } else {
                this.otpVerificationEnabled = z2;
            }
            return this;
        }

        public final Builder setDefaultRegionPrefix(int i2) {
            int i3 = 2 % 2;
            if (i2 > 9999) {
                int i4 = f10626a + 89;
                f10629e = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.defaultRegionPrefix = i2;
            int i6 = f10629e + 33;
            f10626a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Phone build() {
            int i2 = 2 % 2;
            Phone phone = new Phone(this.otpVerificationEnabled, this.defaultRegionPrefix, (byte) 0);
            int i3 = f10626a + 3;
            f10629e = i3 % 128;
            int i4 = i3 % 2;
            return phone;
        }

        static {
            if (109 % 2 == 0) {
                throw null;
            }
        }
    }

    public /* synthetic */ Phone(boolean z2, int i2, byte b2) {
        this(z2, i2);
    }
}
