package com.incode.welcome_sdk.ui.camera.qr_code;

/* JADX INFO: loaded from: classes5.dex */
public enum QRScanState {
    NOT_OPERATIONAL,
    PROCESSING_TOO_DARK,
    PROCESSING_BLURRED,
    QR_DETECTED,
    NO_QR_DETECTED,
    QR_VALIDATION_IN_PROGRESS,
    QR_VALIDATION_COMPLETED,
    QR_VALIDATION_ERROR,
    QR_VALIDATION_TOTAL_FAILURE
}
