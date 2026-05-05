package com.incode.welcome_sdk.modules;

/* JADX INFO: loaded from: classes5.dex */
public class CurpValidation extends BaseModule {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10456c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10457d = 0;
    private final boolean validationEnabled;

    public boolean isValidationEnabled() {
        int i2 = 2 % 2;
        int i3 = f10457d + 53;
        int i4 = i3 % 128;
        f10456c = i4;
        int i5 = i3 % 2;
        boolean z2 = this.validationEnabled;
        int i6 = i4 + 113;
        f10457d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10458b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10459c = 1;
        private boolean validationEnabled = true;

        public final Builder setValidationEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10458b + 59;
            int i4 = i3 % 128;
            f10459c = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                this.validationEnabled = z2;
                int i5 = i4 + 45;
                f10458b = i5 % 128;
                if (i5 % 2 == 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            }
            this.validationEnabled = z2;
            throw null;
        }

        public final CurpValidation build() {
            int i2 = 2 % 2;
            CurpValidation curpValidation = new CurpValidation(this.validationEnabled);
            int i3 = f10459c + 43;
            f10458b = i3 % 128;
            if (i3 % 2 == 0) {
                return curpValidation;
            }
            throw null;
        }
    }

    CurpValidation(boolean z2) {
        super(Modules.CURP_VALIDATION);
        this.validationEnabled = z2;
    }
}
