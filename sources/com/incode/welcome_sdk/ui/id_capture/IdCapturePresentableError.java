package com.incode.welcome_sdk.ui.id_capture;

import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.ui.id_capture.CaptureUiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCapturePresentableError extends Throwable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f14783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f14784f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f14785g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f14786h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f14787j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CaptureUiState.BottomButton f14789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Throwable f14791d;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        int i2 = 2 % 2;
        int i3 = f14786h + 45;
        int i4 = i3 % 128;
        f14787j = i4;
        int i5 = i3 % 2;
        Throwable th = this.f14791d;
        int i6 = i4 + 117;
        f14786h = i6 % 128;
        int i7 = i6 % 2;
        return th;
    }

    public /* synthetic */ IdCapturePresentableError(Throwable th, int i2, int i3, CaptureUiState.BottomButton bottomButton, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i4 & 2) != 0 ? R.string.onboard_sdk_id_capture_error_title : i2, i3, (i4 & 8) != 0 ? CaptureUiState.BottomButton.f14602b : bottomButton);
    }

    public final int getTitle() {
        int i2 = 2 % 2;
        int i3 = f14787j;
        int i4 = i3 + 103;
        f14786h = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f14790c;
        int i7 = i3 + 23;
        f14786h = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getSubtitle() {
        int i2 = 2 % 2;
        int i3 = f14787j + 55;
        f14786h = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f14788a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CaptureUiState.BottomButton getActionButton() {
        int i2 = 2 % 2;
        int i3 = f14786h;
        int i4 = i3 + 59;
        f14787j = i4 % 128;
        int i5 = i4 % 2;
        CaptureUiState.BottomButton bottomButton = this.f14789b;
        int i6 = i3 + 81;
        f14787j = i6 % 128;
        if (i6 % 2 != 0) {
            return bottomButton;
        }
        throw null;
    }

    public IdCapturePresentableError(Throwable th, int i2, int i3, CaptureUiState.BottomButton bottomButton) {
        Intrinsics.checkNotNullParameter(bottomButton, "");
        this.f14791d = th;
        this.f14790c = i2;
        this.f14788a = i3;
        this.f14789b = bottomButton;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14792b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14793d = 1;

        private Companion() {
        }

        public final IdCapturePresentableError from(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            if (th instanceof IdCaptureUploadError) {
                IdCaptureUploadError idCaptureUploadError = (IdCaptureUploadError) th;
                IdCapturePresentableError idCapturePresentableError = new IdCapturePresentableError(th, b(idCaptureUploadError), c(idCaptureUploadError), null, 8, null);
                int i3 = f14792b + 109;
                f14793d = i3 % 128;
                int i4 = i3 % 2;
                return idCapturePresentableError;
            }
            if (!ThrowableExtensionsKt.isNoConnectivityException(th)) {
                return new IdCapturePresentableError(th, 0, R.string.onboard_sdk_unknown_server_error, null, 10, null);
            }
            IdCapturePresentableError idCapturePresentableError2 = new IdCapturePresentableError(th, 0, R.string.onboard_sdk_no_internet_connection, CaptureUiState.BottomButton.f14604d, 2, null);
            int i5 = f14793d + 65;
            f14792b = i5 % 128;
            if (i5 % 2 == 0) {
                return idCapturePresentableError2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        
            if ((r4 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.UnacceptableId) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            return com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_title;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if ((r4 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.UnacceptableId) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        
            r2 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_unacceptable_title;
            r1 = com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14792b + 121;
            com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14793d = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        
            if ((r1 % 2) != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            r0 = 41 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int b(com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError r4) {
            /*
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14793d
                int r1 = r0 + 37
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14792b = r0
                int r1 = r1 % r3
                if (r1 == 0) goto L28
                boolean r1 = r4 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.UnacceptableId
                r0 = 72
                int r0 = r0 / 0
                if (r1 == 0) goto L2d
            L16:
                int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_unacceptable_title
                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14792b
                int r1 = r0 + 121
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14793d = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L27
                r0 = 41
                int r0 = r0 / 0
            L27:
                return r2
            L28:
                boolean r0 = r4 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.UnacceptableId
                if (r0 == 0) goto L2d
                goto L16
            L2d:
                int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_title
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.b(com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            if ((r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Blur) == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        
            return com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_blur;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if ((r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.NoDocumentDetected) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
        
            r1 = r2 + 107;
            com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14793d = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        
            return com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_missing_document;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        
            if ((!(r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.WrongSide)) == true) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        
            r1 = r3 + 117;
            com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14792b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        
            return com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_side;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            if ((r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.UnacceptableId) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        
            r1 = r2 + 49;
            com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14793d = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        
            if ((r1 % 2) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        
            r0 = 22 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
        
            return com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_unacceptable;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            if ((r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Shadow) == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        
            return com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_shadow;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if ((r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Readability) == true) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
        
            if ((r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.RetryCountLimit) == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
        
            r2 = r3 + 91;
            com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14792b = r2 % 128;
            r2 = r2 % 2;
            r1 = com.incode.welcome_sdk.R.string.onboard_sdk_unknown_server_error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
        
            if (r2 == 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
        
            r0 = 15 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0078, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x007e, code lost:
        
            throw new kotlin.NoWhenBranchMatchedException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
        
            return com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_readability;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_unacceptable;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if ((r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Glare) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        
            return com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_glare;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            if ((r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Glare) != false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int c(com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError r5) {
            /*
                r4 = 2
                int r0 = r4 % r4
                int r3 = com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14793d
                int r0 = r3 + 113
                int r2 = r0 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14792b = r2
                int r0 = r0 % r4
                if (r0 == 0) goto L19
                boolean r1 = r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Glare
                r0 = 19
                int r0 = r0 / 0
                if (r1 == 0) goto L1e
            L16:
                int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_glare
                return r0
            L19:
                boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Glare
                if (r0 == 0) goto L1e
                goto L16
            L1e:
                boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Blur
                if (r0 == 0) goto L25
                int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_blur
                return r0
            L25:
                boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.NoDocumentDetected
                if (r0 == 0) goto L33
                int r1 = r2 + 107
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14793d = r0
                int r1 = r1 % r4
                int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_missing_document
                return r0
            L33:
                boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.WrongSide
                r1 = 1
                r0 = r0 ^ r1
                if (r0 == r1) goto L43
                int r1 = r3 + 117
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14792b = r0
                int r1 = r1 % r4
                int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_side
                return r0
            L43:
                boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.UnacceptableId
                if (r0 == 0) goto L5a
                int r1 = r2 + 49
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14793d = r0
                int r1 = r1 % r4
                if (r1 != 0) goto L57
                int r1 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_unacceptable
                r0 = 22
                int r0 = r0 / 0
            L56:
                return r1
            L57:
                int r1 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_unacceptable
                goto L56
            L5a:
                boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Shadow
                if (r0 == 0) goto L61
                int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_shadow
                return r0
            L61:
                boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.Readability
                if (r0 == r1) goto L7f
                boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError.RetryCountLimit
                if (r0 == 0) goto L79
                int r2 = r3 + 91
                int r0 = r2 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.f14792b = r0
                int r2 = r2 % r4
                int r1 = com.incode.welcome_sdk.R.string.onboard_sdk_unknown_server_error
                if (r2 == 0) goto L78
                r0 = 15
                int r0 = r0 / 0
            L78:
                return r1
            L79:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L7f:
                int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_error_readability
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError.Companion.c(com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError):int");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f14783e = new Companion(defaultConstructorMarker);
        int i2 = f14784f + 21;
        f14785g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
