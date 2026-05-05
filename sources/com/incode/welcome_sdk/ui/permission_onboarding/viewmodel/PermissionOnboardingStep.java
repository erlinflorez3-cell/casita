package com.incode.welcome_sdk.ui.permission_onboarding.viewmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PermissionOnboardingStep {

    public static final class Intro extends PermissionOnboardingStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16841a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16842c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Intro f16843d = new Intro();

        private Intro() {
            super(null);
        }

        static {
            int i2 = f16841a + 35;
            f16842c = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    private PermissionOnboardingStep() {
    }

    public static final class DoNotAllow extends PermissionOnboardingStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DoNotAllow f16835a = new DoNotAllow();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16836c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16837e = 0;

        private DoNotAllow() {
            super(null);
        }

        static {
            int i2 = f16836c + 99;
            f16837e = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class LearnMore extends PermissionOnboardingStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16844a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16845c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final LearnMore f16846d = new LearnMore();

        private LearnMore() {
            super(null);
        }

        static {
            int i2 = f16844a + 41;
            f16845c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class AskForRealPermission extends PermissionOnboardingStep {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16832b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16833c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AskForRealPermission f16834e = new AskForRealPermission();

        private AskForRealPermission() {
            super(null);
        }

        static {
            int i2 = f16832b + 19;
            f16833c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class DoNotAllowRealPermission extends PermissionOnboardingStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16838a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16839c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final DoNotAllowRealPermission f16840e = new DoNotAllowRealPermission();

        private DoNotAllowRealPermission() {
            super(null);
        }

        static {
            int i2 = f16838a + 87;
            f16839c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class OpenSettingsFallback extends PermissionOnboardingStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16847a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OpenSettingsFallback f16848b = new OpenSettingsFallback();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16849d = 0;

        private OpenSettingsFallback() {
            super(null);
        }

        static {
            int i2 = f16849d + 121;
            f16847a = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class Terminal extends PermissionOnboardingStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16850a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Terminal f16851c = new Terminal();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16852d = 0;

        private Terminal() {
            super(null);
        }

        static {
            int i2 = f16852d + 105;
            f16850a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public /* synthetic */ PermissionOnboardingStep(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
