package com.incode.welcome_sdk.ui.camera.id_validation.base;

import com.incode.welcome_sdk.commons.utils.ac;
import io.sentry.SentryLockReason;

/* JADX INFO: loaded from: classes5.dex */
public enum DocumentType {
    NONE("", ""),
    FRONT_ID("id_front", "rounded_front_id"),
    BACK_ID("id_back", "rounded_back_id"),
    ADDRESS_STATEMENT(true, SentryLockReason.JsonKeys.ADDRESS, "rounded_address_statement"),
    PAYMENT_PROOF(true, "payment_proof", "rounded_payment_proof"),
    MEDICAL_DOC("medical_doc", "rounded_medical_doc"),
    OTHER_DOCUMENT_1(true, "other_doc_1", "rounded_other_doc_1"),
    OTHER_DOCUMENT_2(true, "other_doc_2", "rounded_other_doc_2"),
    OTHER_DOCUMENT_3(true, "other_doc_3", "rounded_other_doc_3"),
    PASSPORT("passport", "rounded_passport");

    private String imageFilename;
    private boolean pdfSupported;
    private String roundedImageFilename;

    DocumentType(String str, String str2) {
        this(false, str, str2);
    }

    DocumentType(boolean z2, String str, String str2) {
        this.pdfSupported = z2;
        this.imageFilename = str;
        this.roundedImageFilename = str2;
    }

    public final boolean isPdfSupported() {
        return this.pdfSupported;
    }

    public final String getImageFilename() {
        return this.imageFilename;
    }

    public final String getRoundedImageFilename() {
        return this.roundedImageFilename;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11813c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f11814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11815e = 0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            f11814d = iArr;
            try {
                iArr[DocumentType.ADDRESS_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11814d[DocumentType.PAYMENT_PROOF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11814d[DocumentType.MEDICAL_DOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11814d[DocumentType.OTHER_DOCUMENT_1.ordinal()] = 4;
                int i2 = f11815e + 9;
                f11813c = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 3 % 5;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11814d[DocumentType.OTHER_DOCUMENT_2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11814d[DocumentType.OTHER_DOCUMENT_3.ordinal()] = 6;
                int i5 = f11815e + 111;
                f11813c = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final String getDocumentTypeString() {
        switch (AnonymousClass3.f11814d[ordinal()]) {
            case 1:
                return "document";
            case 2:
                return "paymentProof";
            case 3:
                return "medicalDoc";
            case 4:
                return "otherDocument1";
            case 5:
                return "otherDocument2";
            case 6:
                return "otherDocument3";
            default:
                return null;
        }
    }

    public final String getSubtypeString(String str) {
        int i2 = AnonymousClass3.f11814d[ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6) {
            return ac.d(str);
        }
        return null;
    }
}
