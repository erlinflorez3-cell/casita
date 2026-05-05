package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class DocumentScan extends BaseModule {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10460c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f10461g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentType f10463b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10465e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10469a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10470e = 0;
        private DocumentType documentType = DocumentType.ADDRESS_STATEMENT;
        private boolean showTutorials = true;
        private boolean waitForTutorials = false;
        private boolean showDocumentProviderOptions = true;

        public final Builder setDocumentType(DocumentType documentType) {
            int i2 = 2 % 2;
            int i3 = f10470e + 43;
            f10469a = i3 % 128;
            int i4 = i3 % 2;
            if (DocumentScan.a(documentType)) {
                Timber.e("Unsupported document type: %s. Replacing with default, OTHER_DOCUMENT_1", documentType);
                this.documentType = DocumentType.OTHER_DOCUMENT_1;
            } else {
                this.documentType = documentType;
                int i5 = f10470e + 11;
                f10469a = i5 % 128;
                int i6 = i5 % 2;
            }
            return this;
        }

        public final Builder setShowTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10469a;
            int i4 = i3 + 97;
            f10470e = i4 % 128;
            int i5 = i4 % 2;
            this.showTutorials = z2;
            int i6 = i3 + 111;
            f10470e = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setWaitForTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10469a + 57;
            f10470e = i3 % 128;
            if (i3 % 2 == 0) {
                this.waitForTutorials = z2;
                return this;
            }
            this.waitForTutorials = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setShowDocumentProviderOptions(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10469a + 33;
            int i4 = i3 % 128;
            f10470e = i4;
            int i5 = i3 % 2;
            this.showDocumentProviderOptions = z2;
            int i6 = i4 + 57;
            f10469a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 77 / 0;
            }
            return this;
        }

        public final DocumentScan build() {
            int i2 = 2 % 2;
            DocumentScan documentScan = new DocumentScan(this.documentType, this.showTutorials, this.waitForTutorials, this.showDocumentProviderOptions);
            int i3 = f10469a + 59;
            f10470e = i3 % 128;
            int i4 = i3 % 2;
            return documentScan;
        }
    }

    DocumentScan(DocumentType documentType, boolean z2, boolean z3, boolean z4) {
        super(Modules.DOCUMENT_CAPTURE);
        this.f10463b = documentType;
        this.f10465e = z2;
        this.f10462a = z3;
        this.f10464d = z4;
    }

    public final DocumentType c() {
        int i2 = 2 % 2;
        int i3 = f10460c + 25;
        int i4 = i3 % 128;
        f10461g = i4;
        int i5 = i3 % 2;
        DocumentType documentType = this.f10463b;
        int i6 = i4 + 33;
        f10460c = i6 % 128;
        if (i6 % 2 == 0) {
            return documentType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean b() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10461g + 57;
        int i4 = i3 % 128;
        f10460c = i4;
        if (i3 % 2 != 0) {
            z2 = this.f10465e;
            int i5 = 90 / 0;
        } else {
            z2 = this.f10465e;
        }
        int i6 = i4 + 59;
        f10461g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 74 / 0;
        }
        return z2;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f10460c + 59;
        f10461g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f10462a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f10460c + 109;
        f10461g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f10464d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10461g + 29;
        f10460c = i3 % 128;
        int i4 = i3 % 2;
        if (a(this.f10463b)) {
            throw new ModuleConfigurationException("Unsupported DocumentType");
        }
        verifyAddAndProcessDataNotAfterApprove(list);
        int i5 = f10461g + 29;
        f10460c = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.modules.DocumentScan$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10466a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f10467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10468e = 1;

        static {
            int[] iArr = new int[DocumentType.values().length];
            f10467d = iArr;
            try {
                iArr[DocumentType.ADDRESS_STATEMENT.ordinal()] = 1;
                int i2 = f10468e + 83;
                f10466a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10467d[DocumentType.PAYMENT_PROOF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10467d[DocumentType.MEDICAL_DOC.ordinal()] = 3;
                int i5 = f10466a + 109;
                f10468e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10467d[DocumentType.OTHER_DOCUMENT_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10467d[DocumentType.OTHER_DOCUMENT_2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10467d[DocumentType.OTHER_DOCUMENT_3.ordinal()] = 6;
                int i7 = f10468e + 53;
                f10466a = i7 % 128;
                int i8 = i7 % 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static boolean a(DocumentType documentType) {
        int i2 = 2 % 2;
        switch (AnonymousClass4.f10467d[documentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                int i3 = f10460c + 77;
                f10461g = i3 % 128;
                int i4 = i3 % 2;
                return false;
            default:
                int i5 = f10460c + 125;
                f10461g = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 39 / 0;
                }
                return true;
        }
    }
}
