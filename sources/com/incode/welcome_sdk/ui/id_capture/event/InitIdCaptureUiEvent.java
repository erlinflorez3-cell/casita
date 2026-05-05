package com.incode.welcome_sdk.ui.id_capture.event;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public interface InitIdCaptureUiEvent {

    public static final class PermissionGranted implements InitIdCaptureUiEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15043a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PermissionGranted f15044b = new PermissionGranted();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15045c = 0;

        private PermissionGranted() {
        }

        static {
            int i2 = f15043a + 19;
            f15045c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class ContinueFromTutorial implements InitIdCaptureUiEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15034b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15035d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ContinueFromTutorial f15036e = new ContinueFromTutorial();

        private ContinueFromTutorial() {
        }

        static {
            int i2 = f15034b + 53;
            f15035d = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    public static abstract class DocumentSelectionUiEventInit implements InitIdCaptureUiEvent {

        public static final class IdentityCardSelected extends DocumentSelectionUiEventInit {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f15037a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f15038c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final IdentityCardSelected f15039d = new IdentityCardSelected();

            private IdentityCardSelected() {
                super(null);
            }

            static {
                int i2 = f15038c + 39;
                f15037a = i2 % 128;
                int i3 = i2 % 2;
            }
        }

        private DocumentSelectionUiEventInit() {
        }

        public static final class PassportSelected extends DocumentSelectionUiEventInit {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f15040b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final PassportSelected f15041d = new PassportSelected();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f15042e = 1;

            private PassportSelected() {
                super(null);
            }

            static {
                int i2 = f15040b + 107;
                f15042e = i2 % 128;
                int i3 = i2 % 2;
            }
        }

        public /* synthetic */ DocumentSelectionUiEventInit(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
