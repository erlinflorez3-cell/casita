package com.incode.welcome_sdk.ui.permission_onboarding.event;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes5.dex */
public interface PermissionOnboardingEvent {

    public static final class OnIntroAllowPermissionClicked implements PermissionOnboardingEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnIntroAllowPermissionClicked f16506a = new OnIntroAllowPermissionClicked();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16507c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16508d = 0;

        private OnIntroAllowPermissionClicked() {
        }

        static {
            int i2 = f16508d + 49;
            f16507c = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class OnIntroDoNotAllowPermissionClicked implements PermissionOnboardingEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16509a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16510b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final OnIntroDoNotAllowPermissionClicked f16511c = new OnIntroDoNotAllowPermissionClicked();

        private OnIntroDoNotAllowPermissionClicked() {
        }

        static {
            int i2 = f16510b + 93;
            f16509a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class OnIntroLearnMoreClicked implements PermissionOnboardingEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OnIntroLearnMoreClicked f16512b = new OnIntroLearnMoreClicked();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16513c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16514e = 1;

        private OnIntroLearnMoreClicked() {
        }

        static {
            int i2 = f16513c + 19;
            f16514e = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class OnLearnMoreAllowPermissionClicked implements PermissionOnboardingEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16515b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final OnLearnMoreAllowPermissionClicked f16516d = new OnLearnMoreAllowPermissionClicked();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16517e = 0;

        private OnLearnMoreAllowPermissionClicked() {
        }

        static {
            int i2 = f16515b + 21;
            f16517e = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 90 / 0;
            }
        }
    }

    public static final class OnOpenSystemSettingsClicked implements PermissionOnboardingEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16518a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OnOpenSystemSettingsClicked f16519b = new OnOpenSystemSettingsClicked();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16520c = 0;

        private OnOpenSystemSettingsClicked() {
        }

        static {
            int i2 = f16518a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f16520c = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 22 / 0;
            }
        }
    }

    public static final class OnQuitClicked implements PermissionOnboardingEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16524a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16525c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final OnQuitClicked f16526e = new OnQuitClicked();

        private OnQuitClicked() {
        }

        static {
            int i2 = f16524a + 7;
            f16525c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class OnPermissionResult implements PermissionOnboardingEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16521a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16522d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f16523e;

        public OnPermissionResult(boolean z2) {
            this.f16523e = z2;
        }

        public final boolean getGranted() {
            int i2 = 2 % 2;
            int i3 = f16522d + 121;
            int i4 = i3 % 128;
            f16521a = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f16523e;
            int i6 = i4 + 39;
            f16522d = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16521a + 83;
            int i4 = i3 % 128;
            f16522d = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof OnPermissionResult) {
                return this.f16523e == ((OnPermissionResult) obj).f16523e;
            }
            int i5 = i4 + 69;
            f16521a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f16522d + 101;
            f16521a = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = this.f16523e;
            if (i4 == 0) {
                return Boolean.hashCode(z2);
            }
            Boolean.hashCode(z2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f16521a + 1;
            f16522d = i3 % 128;
            if (i3 % 2 != 0) {
                return "OnPermissionResult(granted=" + this.f16523e + ")";
            }
            String str = "OnPermissionResult(granted=" + this.f16523e + ")";
            throw null;
        }

        public static /* synthetic */ OnPermissionResult copy$default(OnPermissionResult onPermissionResult, boolean z2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f16522d + 105;
            int i5 = i4 % 128;
            f16521a = i5;
            if (i4 % 2 == 0 && (i2 & 1) != 0) {
                int i6 = i5 + 99;
                f16522d = i6 % 128;
                int i7 = i6 % 2;
                z2 = onPermissionResult.f16523e;
            }
            OnPermissionResult onPermissionResultCopy = onPermissionResult.copy(z2);
            int i8 = f16521a + 17;
            f16522d = i8 % 128;
            int i9 = i8 % 2;
            return onPermissionResultCopy;
        }

        public final OnPermissionResult copy(boolean z2) {
            int i2 = 2 % 2;
            OnPermissionResult onPermissionResult = new OnPermissionResult(z2);
            int i3 = f16522d + 93;
            f16521a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 54 / 0;
            }
            return onPermissionResult;
        }

        public final boolean component1() {
            int i2 = 2 % 2;
            int i3 = f16521a;
            int i4 = i3 + 9;
            f16522d = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f16523e;
            int i6 = i3 + 57;
            f16522d = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }
    }
}
