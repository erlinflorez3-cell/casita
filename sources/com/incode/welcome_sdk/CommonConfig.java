package com.incode.welcome_sdk;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ThemeConfiguration;
import com.incode.welcome_sdk.commons.IncodeUXConfig;
import com.incode.welcome_sdk.commons.theme.IncodeThemeConfig;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a */
    private static int f3660a = 0;

    /* JADX INFO: renamed from: b */
    private static int f3661b = 9 % 128;

    /* JADX INFO: renamed from: c */
    private static int f3662c = 1;

    /* JADX INFO: renamed from: d */
    private static int f3663d = 0;
    private final float idBlurThreshold;
    private final float idGlareThreshold;
    private final String localizationLanguage;
    private final float recognitionThreshold;
    private final boolean showCloseButton;
    private final boolean showDelayedOnboardingIntroScreen;
    private final boolean showExitConfirmation;
    private final float spoofThreshold;
    private final IncodeThemeConfig themeConfig;
    private final ThemeConfiguration themeConfiguration;
    private final IncodeUXConfig uxConfig;

    private CommonConfig(Builder builder) {
        this.recognitionThreshold = builder.getRecognitionThreshold$onboard_release();
        this.spoofThreshold = builder.getSpoofThreshold$onboard_release();
        this.idGlareThreshold = builder.getIdGlareThreshold$onboard_release();
        this.idBlurThreshold = builder.getIdBlurThreshold$onboard_release();
        this.showCloseButton = builder.getShowCloseButton$onboard_release();
        this.showExitConfirmation = builder.getShowExitConfirmation$onboard_release();
        this.localizationLanguage = builder.getLocalizationLanguage$onboard_release();
        this.themeConfiguration = builder.getThemeConfiguration$onboard_release();
        this.themeConfig = builder.getThemeConfig$onboard_release();
        this.uxConfig = builder.getUxConfig$onboard_release();
        this.showDelayedOnboardingIntroScreen = builder.getShowDelayedOnboardingIntroScreen$onboard_release();
    }

    public static final /* synthetic */ float access$getIdBlurThreshold$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3663d;
        int i4 = i3 + 71;
        f3662c = i4 % 128;
        int i5 = i4 % 2;
        float f2 = commonConfig.idBlurThreshold;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 19;
        f3662c = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public static final /* synthetic */ float access$getIdGlareThreshold$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3662c + 81;
        int i4 = i3 % 128;
        f3663d = i4;
        int i5 = i3 % 2;
        float f2 = commonConfig.idGlareThreshold;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 29;
        f3662c = i6 % 128;
        if (i6 % 2 != 0) {
            return f2;
        }
        throw null;
    }

    public static final /* synthetic */ String access$getLocalizationLanguage$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3662c + 9;
        int i4 = i3 % 128;
        f3663d = i4;
        int i5 = i3 % 2;
        String str = commonConfig.localizationLanguage;
        int i6 = i4 + 11;
        f3662c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final /* synthetic */ float access$getRecognitionThreshold$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3662c;
        int i4 = i3 + 111;
        f3663d = i4 % 128;
        int i5 = i4 % 2;
        float f2 = commonConfig.recognitionThreshold;
        int i6 = i3 + 93;
        f3663d = i6 % 128;
        if (i6 % 2 == 0) {
            return f2;
        }
        throw null;
    }

    public static final /* synthetic */ boolean access$getShowCloseButton$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3663d + 93;
        f3662c = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = commonConfig.showCloseButton;
        if (i4 != 0) {
            return z2;
        }
        throw null;
    }

    public static final /* synthetic */ boolean access$getShowDelayedOnboardingIntroScreen$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3663d + 55;
        f3662c = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = commonConfig.showDelayedOnboardingIntroScreen;
        if (i4 == 0) {
            int i5 = 50 / 0;
        }
        return z2;
    }

    public static final /* synthetic */ boolean access$getShowExitConfirmation$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3662c + 103;
        int i4 = i3 % 128;
        f3663d = i4;
        int i5 = i3 % 2;
        boolean z2 = commonConfig.showExitConfirmation;
        int i6 = i4 + 65;
        f3662c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public static final /* synthetic */ float access$getSpoofThreshold$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3663d + 3;
        f3662c = i3 % 128;
        int i4 = i3 % 2;
        float f2 = commonConfig.spoofThreshold;
        if (i4 != 0) {
            return f2;
        }
        throw null;
    }

    public static final /* synthetic */ IncodeThemeConfig access$getThemeConfig$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3662c;
        int i4 = i3 + 55;
        f3663d = i4 % 128;
        int i5 = i4 % 2;
        IncodeThemeConfig incodeThemeConfig = commonConfig.themeConfig;
        int i6 = i3 + 111;
        f3663d = i6 % 128;
        int i7 = i6 % 2;
        return incodeThemeConfig;
    }

    public static final /* synthetic */ ThemeConfiguration access$getThemeConfiguration$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3662c + 99;
        int i4 = i3 % 128;
        f3663d = i4;
        int i5 = i3 % 2;
        ThemeConfiguration themeConfiguration = commonConfig.themeConfiguration;
        int i6 = i4 + 73;
        f3662c = i6 % 128;
        int i7 = i6 % 2;
        return themeConfiguration;
    }

    public static final /* synthetic */ IncodeUXConfig access$getUxConfig$p(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f3662c + 65;
        f3663d = i3 % 128;
        int i4 = i3 % 2;
        IncodeUXConfig incodeUXConfig = commonConfig.uxConfig;
        if (i4 == 0) {
            return incodeUXConfig;
        }
        throw null;
    }

    public final float getRecognitionThreshold() {
        int i2 = 2 % 2;
        int i3 = f3663d;
        int i4 = i3 + 89;
        f3662c = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.recognitionThreshold;
        int i6 = i3 + 47;
        f3662c = i6 % 128;
        if (i6 % 2 != 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getSpoofThreshold() {
        int i2 = 2 % 2;
        int i3 = f3662c;
        int i4 = i3 + 49;
        f3663d = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.spoofThreshold;
        int i6 = i3 + 89;
        f3663d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 56 / 0;
        }
        return f2;
    }

    @Deprecated(message = "Not used anymore")
    public final float getMaskThreshold() {
        int i2 = 2 % 2;
        int i3 = f3662c + 85;
        f3663d = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.Forest.e("CommonConfig.getMaskThreshold() is deprecated. The maskThreshold returned is meaningless.", new Object[1]);
        } else {
            Timber.Forest.e("CommonConfig.getMaskThreshold() is deprecated. The maskThreshold returned is meaningless.", new Object[0]);
        }
        int i4 = f3663d + 49;
        f3662c = i4 % 128;
        if (i4 % 2 != 0) {
            return -1.0f;
        }
        throw null;
    }

    public final float getIdGlareThreshold() {
        int i2 = 2 % 2;
        int i3 = f3662c + 117;
        int i4 = i3 % 128;
        f3663d = i4;
        int i5 = i3 % 2;
        float f2 = this.idGlareThreshold;
        int i6 = i4 + 115;
        f3662c = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final float getIdBlurThreshold() {
        int i2 = 2 % 2;
        int i3 = f3662c + 109;
        int i4 = i3 % 128;
        f3663d = i4;
        int i5 = i3 % 2;
        float f2 = this.idBlurThreshold;
        int i6 = i4 + 65;
        f3662c = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final boolean isShowCloseButton() {
        int i2 = 2 % 2;
        int i3 = f3663d;
        int i4 = i3 + 23;
        f3662c = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.showCloseButton;
        int i5 = i3 + 77;
        f3662c = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean isShowExitConfirmation() {
        int i2 = 2 % 2;
        int i3 = f3663d + 49;
        int i4 = i3 % 128;
        f3662c = i4;
        int i5 = i3 % 2;
        boolean z2 = this.showExitConfirmation;
        int i6 = i4 + 51;
        f3663d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String getLocalizationLanguage() {
        int i2 = 2 % 2;
        int i3 = f3663d;
        int i4 = i3 + 5;
        f3662c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.localizationLanguage;
        int i6 = i3 + 7;
        f3662c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final ThemeConfiguration getThemeConfiguration() {
        int i2 = 2 % 2;
        int i3 = f3662c + 69;
        f3663d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.themeConfiguration;
        }
        throw null;
    }

    public final IncodeThemeConfig getThemeConfig() {
        int i2 = 2 % 2;
        int i3 = f3662c + 117;
        f3663d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.themeConfig;
        }
        throw null;
    }

    public final IncodeUXConfig getUXConfig() {
        int i2 = 2 % 2;
        int i3 = f3662c + 41;
        int i4 = i3 % 128;
        f3663d = i4;
        int i5 = i3 % 2;
        IncodeUXConfig incodeUXConfig = this.uxConfig;
        int i6 = i4 + 111;
        f3662c = i6 % 128;
        if (i6 % 2 != 0) {
            return incodeUXConfig;
        }
        throw null;
    }

    public final boolean isShowDelayedOnboardingIntroScreen() {
        int i2 = 2 % 2;
        int i3 = f3662c + 81;
        int i4 = i3 % 128;
        f3663d = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.showDelayedOnboardingIntroScreen;
        int i5 = i4 + 79;
        f3662c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return z2;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f3664a = 0;

        /* JADX INFO: renamed from: b */
        private static int f3665b = 1;

        /* JADX INFO: renamed from: d */
        private static int f3666d = 0;

        /* JADX INFO: renamed from: e */
        private static int f3667e = 1;
        private boolean showCloseButton;
        private IncodeThemeConfig themeConfig;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private float recognitionThreshold = 0.6f;
        private float spoofThreshold = 0.5f;
        private float idGlareThreshold = 0.3f;
        private float idBlurThreshold = 0.3f;
        private boolean showExitConfirmation = true;
        private String localizationLanguage = "";
        private ThemeConfiguration themeConfiguration = new ThemeConfiguration.Builder().build();
        private IncodeUXConfig uxConfig = new IncodeUXConfig.Builder().build();
        private boolean showDelayedOnboardingIntroScreen = true;

        public final float getRecognitionThreshold$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3666d + 125;
            f3665b = i3 % 128;
            int i4 = i3 % 2;
            float f2 = this.recognitionThreshold;
            if (i4 == 0) {
                int i5 = 64 / 0;
            }
            return f2;
        }

        public final void setRecognitionThreshold$onboard_release(float f2) {
            int i2 = 2 % 2;
            int i3 = f3666d;
            int i4 = i3 + 7;
            f3665b = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            this.recognitionThreshold = f2;
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i3 + 105;
            f3665b = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        public final float getSpoofThreshold$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3666d;
            int i4 = i3 + 77;
            f3665b = i4 % 128;
            int i5 = i4 % 2;
            float f2 = this.spoofThreshold;
            int i6 = i3 + 51;
            f3665b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 17 / 0;
            }
            return f2;
        }

        public final void setSpoofThreshold$onboard_release(float f2) {
            int i2 = 2 % 2;
            int i3 = f3665b + 41;
            f3666d = i3 % 128;
            int i4 = i3 % 2;
            this.spoofThreshold = f2;
            if (i4 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float getIdGlareThreshold$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3665b + 1;
            f3666d = i3 % 128;
            if (i3 % 2 == 0) {
                return this.idGlareThreshold;
            }
            throw null;
        }

        public final void setIdGlareThreshold$onboard_release(float f2) {
            int i2 = 2 % 2;
            int i3 = f3666d + 101;
            int i4 = i3 % 128;
            f3665b = i4;
            int i5 = i3 % 2;
            this.idGlareThreshold = f2;
            int i6 = i4 + 71;
            f3666d = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float getIdBlurThreshold$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3665b + 31;
            int i4 = i3 % 128;
            f3666d = i4;
            int i5 = i3 % 2;
            float f2 = this.idBlurThreshold;
            int i6 = i4 + 113;
            f3665b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 87 / 0;
            }
            return f2;
        }

        public final void setIdBlurThreshold$onboard_release(float f2) {
            int i2 = 2 % 2;
            int i3 = f3666d + 79;
            f3665b = i3 % 128;
            int i4 = i3 % 2;
            this.idBlurThreshold = f2;
            if (i4 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean getShowCloseButton$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3665b;
            int i4 = i3 + 79;
            f3666d = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            boolean z2 = this.showCloseButton;
            int i5 = i3 + 37;
            f3666d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 7 / 0;
            }
            return z2;
        }

        public final void setShowCloseButton$onboard_release(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3665b + 111;
            f3666d = i3 % 128;
            int i4 = i3 % 2;
            this.showCloseButton = z2;
            if (i4 != 0) {
                throw null;
            }
        }

        public final boolean getShowExitConfirmation$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3666d;
            int i4 = i3 + 73;
            f3665b = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.showExitConfirmation;
            int i6 = i3 + 67;
            f3665b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 78 / 0;
            }
            return z2;
        }

        public final void setShowExitConfirmation$onboard_release(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3666d + 33;
            int i4 = i3 % 128;
            f3665b = i4;
            int i5 = i3 % 2;
            this.showExitConfirmation = z2;
            int i6 = i4 + 69;
            f3666d = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getLocalizationLanguage$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3665b;
            int i4 = i3 + 63;
            f3666d = i4 % 128;
            int i5 = i4 % 2;
            String str = this.localizationLanguage;
            int i6 = i3 + 5;
            f3666d = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 44 / 0;
            }
            return str;
        }

        public final void setLocalizationLanguage$onboard_release(String str) {
            int i2 = 2 % 2;
            int i3 = f3665b + 15;
            f3666d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.localizationLanguage = str;
            int i5 = f3666d + 87;
            f3665b = i5 % 128;
            int i6 = i5 % 2;
        }

        public final ThemeConfiguration getThemeConfiguration$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3666d + 5;
            int i4 = i3 % 128;
            f3665b = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ThemeConfiguration themeConfiguration = this.themeConfiguration;
            int i5 = i4 + 99;
            f3666d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 0;
            }
            return themeConfiguration;
        }

        public final void setThemeConfiguration$onboard_release(ThemeConfiguration themeConfiguration) {
            int i2 = 2 % 2;
            int i3 = f3666d + 75;
            f3665b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(themeConfiguration, "");
            this.themeConfiguration = themeConfiguration;
            int i5 = f3665b + 39;
            f3666d = i5 % 128;
            int i6 = i5 % 2;
        }

        public final IncodeThemeConfig getThemeConfig$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3665b + 117;
            f3666d = i3 % 128;
            if (i3 % 2 == 0) {
                return this.themeConfig;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setThemeConfig$onboard_release(IncodeThemeConfig incodeThemeConfig) {
            int i2 = 2 % 2;
            int i3 = f3666d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            int i4 = i3 % 128;
            f3665b = i4;
            int i5 = i3 % 2;
            this.themeConfig = incodeThemeConfig;
            int i6 = i4 + 123;
            f3666d = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IncodeUXConfig getUxConfig$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3665b;
            int i4 = i3 + 107;
            f3666d = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            IncodeUXConfig incodeUXConfig = this.uxConfig;
            int i5 = i3 + 63;
            f3666d = i5 % 128;
            if (i5 % 2 == 0) {
                return incodeUXConfig;
            }
            throw null;
        }

        public final void setUxConfig$onboard_release(IncodeUXConfig incodeUXConfig) {
            int i2 = 2 % 2;
            int i3 = f3666d + 7;
            f3665b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(incodeUXConfig, "");
            this.uxConfig = incodeUXConfig;
            int i5 = f3666d + 61;
            f3665b = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean getShowDelayedOnboardingIntroScreen$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3665b;
            int i4 = i3 + 63;
            f3666d = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.showDelayedOnboardingIntroScreen;
            int i6 = i3 + 29;
            f3666d = i6 % 128;
            if (i6 % 2 == 0) {
                return z2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setShowDelayedOnboardingIntroScreen$onboard_release(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3665b + 1;
            f3666d = i3 % 128;
            int i4 = i3 % 2;
            this.showDelayedOnboardingIntroScreen = z2;
            if (i4 != 0) {
                int i5 = 31 / 0;
            }
        }

        public static final class Companion {

            /* JADX INFO: renamed from: b */
            private static int f3668b = 0;

            /* JADX INFO: renamed from: c */
            private static int f3669c = 1;

            private Companion() {
            }

            @JvmStatic
            public final Builder from(CommonConfig commonConfig) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(commonConfig, "");
                Builder builder = new Builder();
                builder.setRecognitionThreshold$onboard_release(CommonConfig.access$getRecognitionThreshold$p(commonConfig));
                builder.setSpoofThreshold$onboard_release(CommonConfig.access$getSpoofThreshold$p(commonConfig));
                builder.setIdGlareThreshold$onboard_release(CommonConfig.access$getIdGlareThreshold$p(commonConfig));
                builder.setIdBlurThreshold$onboard_release(CommonConfig.access$getIdBlurThreshold$p(commonConfig));
                builder.setShowCloseButton$onboard_release(CommonConfig.access$getShowCloseButton$p(commonConfig));
                builder.setShowExitConfirmation$onboard_release(CommonConfig.access$getShowExitConfirmation$p(commonConfig));
                builder.setLocalizationLanguage$onboard_release(CommonConfig.access$getLocalizationLanguage$p(commonConfig));
                builder.setThemeConfiguration$onboard_release(CommonConfig.access$getThemeConfiguration$p(commonConfig));
                builder.setThemeConfig$onboard_release(CommonConfig.access$getThemeConfig$p(commonConfig));
                builder.setUxConfig$onboard_release(CommonConfig.access$getUxConfig$p(commonConfig));
                builder.setShowDelayedOnboardingIntroScreen$onboard_release(CommonConfig.access$getShowDelayedOnboardingIntroScreen$p(commonConfig));
                int i3 = f3668b + 9;
                f3669c = i3 % 128;
                int i4 = i3 % 2;
                return builder;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final Builder setRecognitionThreshold(float f2) {
            int i2 = 2 % 2;
            int i3 = f3665b + 47;
            f3666d = i3 % 128;
            if (i3 % 2 == 0) {
                this.recognitionThreshold = f2;
                return this;
            }
            this.recognitionThreshold = f2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setSpoofThreshold(float f2) {
            int i2 = 2 % 2;
            int i3 = f3665b + 23;
            f3666d = i3 % 128;
            if (i3 % 2 != 0) {
                this.spoofThreshold = f2;
                int i4 = 4 / 0;
            } else {
                this.spoofThreshold = f2;
            }
            return this;
        }

        @Deprecated(message = "Not used anymore")
        public final Builder setMaskThreshold(float f2) {
            int i2 = 2 % 2;
            int i3 = f3665b + 53;
            f3666d = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.e("CommonConfig.Builder.setMaskThreshold() is deprecated. The maskThreshold: " + f2 + " will be ignored.", new Object[0]);
            } else {
                Timber.Forest.e("CommonConfig.Builder.setMaskThreshold() is deprecated. The maskThreshold: " + f2 + " will be ignored.", new Object[0]);
            }
            int i4 = f3666d + 79;
            f3665b = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder setIdGlareThreshold(float f2) {
            int i2 = 2 % 2;
            int i3 = f3665b;
            int i4 = i3 + 69;
            f3666d = i4 % 128;
            int i5 = i4 % 2;
            this.idGlareThreshold = f2;
            int i6 = i3 + 43;
            f3666d = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setIdBlurThreshold(float f2) {
            int i2 = 2 % 2;
            int i3 = f3665b;
            int i4 = i3 + 107;
            f3666d = i4 % 128;
            int i5 = i4 % 2;
            this.idBlurThreshold = f2;
            int i6 = i3 + 105;
            f3666d = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setShowCloseButton(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3666d + 115;
            int i4 = i3 % 128;
            f3665b = i4;
            int i5 = i3 % 2;
            this.showCloseButton = z2;
            int i6 = i4 + 39;
            f3666d = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setShowExitConfirmation(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3665b + 117;
            int i4 = i3 % 128;
            f3666d = i4;
            int i5 = i3 % 2;
            this.showExitConfirmation = z2;
            int i6 = i4 + 65;
            f3665b = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder setLocalizationLanguage(String str) {
            int i2 = 2 % 2;
            int i3 = f3665b + 35;
            f3666d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.localizationLanguage = str;
            int i5 = f3665b + 65;
            f3666d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return this;
        }

        public final Builder setThemeConfiguration(ThemeConfiguration themeConfiguration) {
            int i2 = 2 % 2;
            int i3 = f3665b + 109;
            f3666d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(themeConfiguration, "");
            this.themeConfiguration = themeConfiguration;
            int i5 = f3665b + 117;
            f3666d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setThemeConfig(IncodeThemeConfig incodeThemeConfig) {
            int i2 = 2 % 2;
            int i3 = f3666d + 95;
            f3665b = i3 % 128;
            if (i3 % 2 != 0) {
                this.themeConfig = incodeThemeConfig;
                return this;
            }
            this.themeConfig = incodeThemeConfig;
            throw null;
        }

        public final Builder setUXConfig(IncodeUXConfig incodeUXConfig) {
            int i2 = 2 % 2;
            int i3 = f3665b + 3;
            f3666d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(incodeUXConfig, "");
            this.uxConfig = incodeUXConfig;
            int i5 = f3666d + 111;
            f3665b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 87 / 0;
            }
            return this;
        }

        public final Builder setShowDelayedOnboardingIntroScreen(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3666d;
            int i4 = i3 + 27;
            f3665b = i4 % 128;
            if (i4 % 2 == 0) {
                this.showDelayedOnboardingIntroScreen = z2;
                int i5 = 39 / 0;
            } else {
                this.showDelayedOnboardingIntroScreen = z2;
            }
            int i6 = i3 + 7;
            f3665b = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final CommonConfig build() {
            int i2 = 2 % 2;
            CommonConfig commonConfig = new CommonConfig(this, null);
            int i3 = f3665b + 111;
            f3666d = i3 % 128;
            int i4 = i3 % 2;
            return commonConfig;
        }

        static {
            int i2 = f3664a + 113;
            f3667e = i2 % 128;
            int i3 = i2 % 2;
        }

        @JvmStatic
        public static final Builder from(CommonConfig commonConfig) {
            int i2 = 2 % 2;
            int i3 = f3665b + 59;
            f3666d = i3 % 128;
            int i4 = i3 % 2;
            Builder builderFrom = Companion.from(commonConfig);
            if (i4 != 0) {
                int i5 = 99 / 0;
            }
            return builderFrom;
        }
    }

    static {
        int i2 = 9 % 2;
    }

    public /* synthetic */ CommonConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
