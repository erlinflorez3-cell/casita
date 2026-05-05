package com.incode.welcome_sdk.ui.aes;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AESScreenState {

    public static final class UploadDocument extends AESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10913a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10914b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final UploadDocument f10915e = new UploadDocument();

        private UploadDocument() {
            super(null);
        }

        static {
            int i2 = f10913a + 57;
            f10914b = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    private AESScreenState() {
    }

    public static final class GeneratingUploadLink extends AESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GeneratingUploadLink f10886a = new GeneratingUploadLink();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10887b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10888e = 1;

        private GeneratingUploadLink() {
            super(null);
        }

        static {
            int i2 = f10887b + 57;
            f10888e = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class GeneratingUploadLinkSuccess extends AESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10892b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final GeneratingUploadLinkSuccess f10893c = new GeneratingUploadLinkSuccess();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10894d = 1;

        private GeneratingUploadLinkSuccess() {
            super(null);
        }

        static {
            int i2 = f10892b + 49;
            f10894d = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class GeneratingUploadLinkFailed extends AESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final GeneratingUploadLinkFailed f10889b = new GeneratingUploadLinkFailed();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10890c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10891d = 1;

        private GeneratingUploadLinkFailed() {
            super(null);
        }

        static {
            int i2 = f10890c + 39;
            f10891d = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 43 / 0;
            }
        }
    }

    public static final class UploadingDocument extends AESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UploadingDocument f10916a = new UploadingDocument();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10917b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10918d = 1;

        private UploadingDocument() {
            super(null);
        }

        static {
            int i2 = f10918d + 7;
            f10917b = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class UploadingSuccess extends AESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10922a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UploadingSuccess f10923b = new UploadingSuccess();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10924c = 1;

        private UploadingSuccess() {
            super(null);
        }

        static {
            int i2 = f10924c + 57;
            f10922a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class UploadingFailed extends AESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10919a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10920d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final UploadingFailed f10921e = new UploadingFailed();

        private UploadingFailed() {
            super(null);
        }

        static {
            int i2 = f10919a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10920d = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class FetchingUnsignedDocuments extends AESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FetchingUnsignedDocuments f10880b = new FetchingUnsignedDocuments();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10881c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10882e = 0;

        private FetchingUnsignedDocuments() {
            super(null);
        }

        static {
            int i2 = f10882e + 63;
            f10881c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class FetchingUnsignedDocumentsFailed extends AESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10883a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FetchingUnsignedDocumentsFailed f10884c = new FetchingUnsignedDocumentsFailed();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10885e = 0;

        private FetchingUnsignedDocumentsFailed() {
            super(null);
        }

        static {
            int i2 = f10885e + 17;
            f10883a = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class UnsignedDocumentsFetched extends AESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UnsignedDocumentsFetched f10910b = new UnsignedDocumentsFetched();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10911c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10912d = 0;

        private UnsignedDocumentsFetched() {
            super(null);
        }

        static {
            int i2 = f10912d + 93;
            f10911c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class SigningDocument extends AESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10901a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10902d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final SigningDocument f10903e = new SigningDocument();

        private SigningDocument() {
            super(null);
        }

        static {
            int i2 = f10902d + 79;
            f10901a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class SigningSuccess extends AESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10907a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10908c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final SigningSuccess f10909d = new SigningSuccess();

        private SigningSuccess() {
            super(null);
        }

        static {
            int i2 = f10907a + 117;
            f10908c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class SigningFailed extends AESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10904a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10905b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SigningFailed f10906c = new SigningFailed();

        private SigningFailed() {
            super(null);
        }

        static {
            int i2 = f10905b + 91;
            f10904a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class FetchingSignedDocuments extends AESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10874b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10875d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FetchingSignedDocuments f10876e = new FetchingSignedDocuments();

        private FetchingSignedDocuments() {
            super(null);
        }

        static {
            int i2 = f10874b + 21;
            f10875d = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class FetchingSignedDocumentsFailed extends AESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10877b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FetchingSignedDocumentsFailed f10878c = new FetchingSignedDocumentsFailed();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10879e = 1;

        private FetchingSignedDocumentsFailed() {
            super(null);
        }

        static {
            int i2 = f10879e + 73;
            f10877b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 1 / 0;
            }
        }
    }

    public static final class SignedDocumentsFetched extends AESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SignedDocumentsFetched f10898b = new SignedDocumentsFetched();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10899c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10900d = 1;

        private SignedDocumentsFetched() {
            super(null);
        }

        static {
            int i2 = f10900d + 95;
            f10899c = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class NoInternetConnection extends AESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10895a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10896d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LastAPICallState f10897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoInternetConnection(LastAPICallState lastAPICallState) {
            super(null);
            Intrinsics.checkNotNullParameter(lastAPICallState, "");
            this.f10897b = lastAPICallState;
        }

        public final LastAPICallState getLastAPICall() {
            int i2 = 2 % 2;
            int i3 = f10896d + 125;
            int i4 = i3 % 128;
            f10895a = i4;
            int i5 = i3 % 2;
            LastAPICallState lastAPICallState = this.f10897b;
            int i6 = i4 + 93;
            f10896d = i6 % 128;
            if (i6 % 2 == 0) {
                return lastAPICallState;
            }
            throw null;
        }
    }

    public static final class EmptyState extends AESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EmptyState f10871b = new EmptyState();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10872c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10873e = 1;

        private EmptyState() {
            super(null);
        }

        static {
            int i2 = f10873e + 1;
            f10872c = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    public /* synthetic */ AESScreenState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
