package com.incode.welcome_sdk.ui.id_capture;

import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DocumentTypeExtensionsKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f14637b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14638e = 0;

    public static final ValidationPhase toValidationPhase(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f14637b + 103;
        f14638e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(documentType, "");
        int i5 = WhenMappings.f14639b[documentType.ordinal()];
        if (i5 != 1) {
            return i5 != 2 ? ValidationPhase.SCAN_ID_FRONT : ValidationPhase.SCAN_PASSPORT;
        }
        ValidationPhase validationPhase = ValidationPhase.SCAN_ID_BACK;
        int i6 = f14638e + 25;
        f14637b = i6 % 128;
        int i7 = i6 % 2;
        return validationPhase;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14640c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14641e = 0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.BACK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 2;
                int i2 = f14641e + 35;
                f14640c = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14639b = iArr;
            int i5 = f14641e + 1;
            f14640c = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }
}
