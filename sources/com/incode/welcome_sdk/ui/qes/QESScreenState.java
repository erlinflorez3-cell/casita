package com.incode.welcome_sdk.ui.qes;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class QESScreenState {

    public static final class UploadDocument extends QESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UploadDocument f17113a = new UploadDocument();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17114c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17115d = 0;

        private UploadDocument() {
            super(null);
        }

        static {
            int i2 = f17114c + 61;
            f17115d = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    private QESScreenState() {
    }

    public static final class GeneratingUploadLink extends QESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GeneratingUploadLink f17086a = new GeneratingUploadLink();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17087c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17088e = 1;

        private GeneratingUploadLink() {
            super(null);
        }

        static {
            int i2 = f17087c + 107;
            f17088e = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class GeneratingUploadLinkSuccess extends QESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GeneratingUploadLinkSuccess f17092a = new GeneratingUploadLinkSuccess();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17093c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17094d = 1;

        private GeneratingUploadLinkSuccess() {
            super(null);
        }

        static {
            int i2 = f17094d + 17;
            f17093c = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 51 / 0;
            }
        }
    }

    public static final class GeneratingUploadLinkFailed extends QESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17089b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17090d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final GeneratingUploadLinkFailed f17091e = new GeneratingUploadLinkFailed();

        private GeneratingUploadLinkFailed() {
            super(null);
        }

        static {
            int i2 = f17090d + 75;
            f17089b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class UploadingDocument extends QESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17116c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17117d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final UploadingDocument f17118e = new UploadingDocument();

        private UploadingDocument() {
            super(null);
        }

        static {
            int i2 = f17117d + 45;
            f17116c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class UploadingSuccess extends QESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17122a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final UploadingSuccess f17123c = new UploadingSuccess();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17124d = 0;

        private UploadingSuccess() {
            super(null);
        }

        static {
            int i2 = f17124d + 33;
            f17122a = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class UploadingFailed extends QESScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17119a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UploadingFailed f17120b = new UploadingFailed();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17121e = 0;

        private UploadingFailed() {
            super(null);
        }

        static {
            int i2 = f17119a + 125;
            f17121e = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class FetchingUnsignedDocuments extends QESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17080b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FetchingUnsignedDocuments f17081c = new FetchingUnsignedDocuments();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17082d = 0;

        private FetchingUnsignedDocuments() {
            super(null);
        }

        static {
            int i2 = f17080b + 3;
            f17082d = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 96 / 0;
            }
        }
    }

    public static final class FetchingUnsignedDocumentsFailed extends QESScreenState {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17083c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17084d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FetchingUnsignedDocumentsFailed f17085e = new FetchingUnsignedDocumentsFailed();

        private FetchingUnsignedDocumentsFailed() {
            super(null);
        }

        static {
            int i2 = f17083c + 29;
            f17084d = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 98 / 0;
            }
        }
    }

    public static final class UnsignedDocumentsFetched extends QESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17110b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17111c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final UnsignedDocumentsFetched f17112e = new UnsignedDocumentsFetched();

        private UnsignedDocumentsFetched() {
            super(null);
        }

        static {
            int i2 = f17110b + 5;
            f17111c = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class SigningDocument extends QESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SigningDocument f17101a = new SigningDocument();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17102b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17103e = 0;

        private SigningDocument() {
            super(null);
        }

        static {
            int i2 = f17103e + 15;
            f17102b = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class SigningSuccess extends QESScreenState {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17107c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final SigningSuccess f17108d = new SigningSuccess();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17109e = 0;

        private SigningSuccess() {
            super(null);
        }

        static {
            int i2 = f17107c + 125;
            f17109e = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class SigningFailed extends QESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17104b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17105c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final SigningFailed f17106d = new SigningFailed();

        private SigningFailed() {
            super(null);
        }

        static {
            int i2 = f17104b + 27;
            f17105c = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class FetchingSignedDocuments extends QESScreenState implements LastAPICallState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17074b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FetchingSignedDocuments f17075c = new FetchingSignedDocuments();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17076d = 1;

        private FetchingSignedDocuments() {
            super(null);
        }

        static {
            int i2 = f17076d + 125;
            f17074b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 66 / 0;
            }
        }
    }

    public static final class FetchingSignedDocumentsFailed extends QESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FetchingSignedDocumentsFailed f17077b = new FetchingSignedDocumentsFailed();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17078c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17079e = 0;

        private FetchingSignedDocumentsFailed() {
            super(null);
        }

        static {
            int i2 = f17079e + 81;
            f17078c = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class SignedDocumentsFetched extends QESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17098b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SignedDocumentsFetched f17099c = new SignedDocumentsFetched();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17100e = 0;

        private SignedDocumentsFetched() {
            super(null);
        }

        static {
            int i2 = f17098b + 13;
            f17100e = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class NoInternetConnection extends QESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17095b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17096d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LastAPICallState f17097a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoInternetConnection(LastAPICallState lastAPICallState) {
            super(null);
            Intrinsics.checkNotNullParameter(lastAPICallState, "");
            this.f17097a = lastAPICallState;
        }

        public final LastAPICallState getLastAPICall() {
            LastAPICallState lastAPICallState;
            int i2 = 2 % 2;
            int i3 = f17096d + 37;
            int i4 = i3 % 128;
            f17095b = i4;
            if (i3 % 2 != 0) {
                lastAPICallState = this.f17097a;
                int i5 = 38 / 0;
            } else {
                lastAPICallState = this.f17097a;
            }
            int i6 = i4 + 71;
            f17096d = i6 % 128;
            int i7 = i6 % 2;
            return lastAPICallState;
        }
    }

    public static final class EmptyState extends QESScreenState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17071b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EmptyState f17072d = new EmptyState();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17073e = 0;

        private EmptyState() {
            super(null);
        }

        static {
            int i2 = f17073e + 89;
            f17071b = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public /* synthetic */ QESScreenState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
