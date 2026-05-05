package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class FaceAuthenticationErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FaceAuthenticationErrorCode[] $VALUES;
    public static final b Companion;
    private final boolean isFatal;
    public static final FaceAuthenticationErrorCode INACTIVE_SESSION = new FaceAuthenticationErrorCode("INACTIVE_SESSION", 0, true);
    public static final FaceAuthenticationErrorCode NONEXISTENT_CUSTOMER = new FaceAuthenticationErrorCode("NONEXISTENT_CUSTOMER", 1, true);
    public static final FaceAuthenticationErrorCode LENSES_DETECTED = new FaceAuthenticationErrorCode("LENSES_DETECTED", 2, false);
    public static final FaceAuthenticationErrorCode FACE_MASK_DETECTED = new FaceAuthenticationErrorCode("FACE_MASK_DETECTED", 3, false);
    public static final FaceAuthenticationErrorCode HEAD_COVER_DETECTED = new FaceAuthenticationErrorCode("HEAD_COVER_DETECTED", 4, false);
    public static final FaceAuthenticationErrorCode CLOSED_EYES_DETECTED = new FaceAuthenticationErrorCode("CLOSED_EYES_DETECTED", 5, false);
    public static final FaceAuthenticationErrorCode FACE_TOO_DARK = new FaceAuthenticationErrorCode("FACE_TOO_DARK", 6, false);
    public static final FaceAuthenticationErrorCode SPOOF_ATTEMPT_DETECTED = new FaceAuthenticationErrorCode("SPOOF_ATTEMPT_DETECTED", 7, false);
    public static final FaceAuthenticationErrorCode USER_IS_NOT_RECOGNIZED = new FaceAuthenticationErrorCode("USER_IS_NOT_RECOGNIZED", 8, false);
    public static final FaceAuthenticationErrorCode SELFIE_IMAGE_LOW_QUALITY = new FaceAuthenticationErrorCode("SELFIE_IMAGE_LOW_QUALITY", 9, false);
    public static final FaceAuthenticationErrorCode HINT_NOT_PROVIDED = new FaceAuthenticationErrorCode("HINT_NOT_PROVIDED", 10, true);
    public static final FaceAuthenticationErrorCode FACE_NOT_FOUND = new FaceAuthenticationErrorCode("FACE_NOT_FOUND", 11, false);
    public static final FaceAuthenticationErrorCode FACE_CROPPING_FAILED = new FaceAuthenticationErrorCode("FACE_CROPPING_FAILED", 12, false);
    public static final FaceAuthenticationErrorCode FACE_TOO_SMALL = new FaceAuthenticationErrorCode("FACE_TOO_SMALL", 13, false);
    public static final FaceAuthenticationErrorCode FACE_TOO_BLURRY = new FaceAuthenticationErrorCode("FACE_TOO_BLURRY", 14, false);
    public static final FaceAuthenticationErrorCode BAD_PHOTO_QUALITY = new FaceAuthenticationErrorCode("BAD_PHOTO_QUALITY", 15, false);
    public static final FaceAuthenticationErrorCode PROCESSING_ERROR = new FaceAuthenticationErrorCode("PROCESSING_ERROR", 16, false);
    public static final FaceAuthenticationErrorCode BAD_REQUEST = new FaceAuthenticationErrorCode("BAD_REQUEST", 17, true);
    public static final FaceAuthenticationErrorCode NETWORK_ERROR = new FaceAuthenticationErrorCode("NETWORK_ERROR", 18, false);
    public static final FaceAuthenticationErrorCode UNKNOWN = new FaceAuthenticationErrorCode("UNKNOWN", 19, true);

    private static final /* synthetic */ FaceAuthenticationErrorCode[] $values() {
        return new FaceAuthenticationErrorCode[]{INACTIVE_SESSION, NONEXISTENT_CUSTOMER, LENSES_DETECTED, FACE_MASK_DETECTED, HEAD_COVER_DETECTED, CLOSED_EYES_DETECTED, FACE_TOO_DARK, SPOOF_ATTEMPT_DETECTED, USER_IS_NOT_RECOGNIZED, SELFIE_IMAGE_LOW_QUALITY, HINT_NOT_PROVIDED, FACE_NOT_FOUND, FACE_CROPPING_FAILED, FACE_TOO_SMALL, FACE_TOO_BLURRY, BAD_PHOTO_QUALITY, PROCESSING_ERROR, BAD_REQUEST, NETWORK_ERROR, UNKNOWN};
    }

    public static EnumEntries<FaceAuthenticationErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static FaceAuthenticationErrorCode valueOf(String str) {
        return (FaceAuthenticationErrorCode) Enum.valueOf(FaceAuthenticationErrorCode.class, str);
    }

    public static FaceAuthenticationErrorCode[] values() {
        return (FaceAuthenticationErrorCode[]) $VALUES.clone();
    }

    private FaceAuthenticationErrorCode(String str, int i2, boolean z2) {
        this.isFatal = z2;
    }

    public final boolean isFatal() {
        return this.isFatal;
    }

    static {
        FaceAuthenticationErrorCode[] faceAuthenticationErrorCodeArr$values = $values();
        $VALUES = faceAuthenticationErrorCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(faceAuthenticationErrorCodeArr$values);
        Companion = new b(null);
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
