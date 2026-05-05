package com.incode.welcome_sdk.ui.id_capture.event;

/* JADX INFO: loaded from: classes5.dex */
public interface IdCaptureUiEvent {

    public static final class HelpClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15004a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15005c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final HelpClicked f15006e = new HelpClicked();

        private HelpClicked() {
        }

        static {
            int i2 = f15004a + 123;
            f15005c = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class HelpCloseClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final HelpCloseClicked f15007b = new HelpCloseClicked();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15008c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15009d = 1;

        private HelpCloseClicked() {
        }

        static {
            int i2 = f15008c + 113;
            f15009d = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 97 / 0;
            }
        }
    }

    public static final class HelpScanClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HelpScanClicked f15013a = new HelpScanClicked();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15014b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15015d = 0;

        private HelpScanClicked() {
        }

        static {
            int i2 = f15014b + 99;
            f15015d = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class HelpManualScanClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15010c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final HelpManualScanClicked f15011d = new HelpManualScanClicked();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15012e = 0;

        private HelpManualScanClicked() {
        }

        static {
            int i2 = f15010c + 109;
            f15012e = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class ManualCaptureClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ManualCaptureClicked f15016b = new ManualCaptureClicked();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15017c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15018d = 1;

        private ManualCaptureClicked() {
        }

        static {
            int i2 = f15017c + 99;
            f15018d = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class ContinueClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15001c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ContinueClicked f15002d = new ContinueClicked();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15003e = 0;

        private ContinueClicked() {
        }

        static {
            int i2 = f15003e + 13;
            f15001c = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class RetakeScanClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RetakeScanClicked f15019b = new RetakeScanClicked();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15020c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15021e = 0;

        private RetakeScanClicked() {
        }

        static {
            int i2 = f15021e + 35;
            f15020c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class ScanTheBackClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15025a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15026b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ScanTheBackClicked f15027c = new ScanTheBackClicked();

        private ScanTheBackClicked() {
        }

        static {
            int i2 = f15025a + 45;
            f15026b = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class ScanTheFrontClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15028a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ScanTheFrontClicked f15029b = new ScanTheFrontClicked();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15030e = 1;

        private ScanTheFrontClicked() {
        }

        static {
            int i2 = f15028a + 125;
            f15030e = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class RetryClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15022b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15023d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final RetryClicked f15024e = new RetryClicked();

        private RetryClicked() {
        }

        static {
            int i2 = f15022b + 59;
            f15023d = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class SmallScreenDeviceDetected implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15031b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15032c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final SmallScreenDeviceDetected f15033e = new SmallScreenDeviceDetected();

        private SmallScreenDeviceDetected() {
        }

        static {
            int i2 = f15031b + 89;
            f15032c = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 11 / 0;
            }
        }
    }

    public static final class CloseClicked implements IdCaptureUiEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14998a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14999c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final CloseClicked f15000d = new CloseClicked();

        private CloseClicked() {
        }

        static {
            int i2 = f14998a + 17;
            f14999c = i2 % 128;
            int i3 = i2 % 2;
        }
    }
}
