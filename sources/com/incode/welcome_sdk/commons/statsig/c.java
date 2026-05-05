package com.incode.welcome_sdk.commons.statsig;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ c[] f5434k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f5436m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f5439r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f5440s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f5441t = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5442f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f5426b = new c("ID_CAPTURE_MODULE_STARTED", 0, "id_capture_module_started");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5425a = new c("ID_CAPTURE_MODULE_FINISHED", 1, "id_capture_module_finished");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f5428d = new c("BACK_ID_UPLOAD_SUCCESS", 2, "back_id_upload_success");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f5427c = new c("FRONT_ID_UPLOAD_SUCCESS", 3, "front_id_upload_success");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f5429e = new c("ID_CAPTURE_MANUAL_MODE_STARTED", 4, "id_capture_manual_mode_started");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f5430g = new c("ID_CAPTURE_VALIDATION_SCORE_OK", 5, "id_capture_validation_ok");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f5432i = new c("ID_CAPTURE_VALIDATION_SCORE_FAILED", 6, "id_capture_validation_failed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static c f5438o = new c("ID_OCR_CONFIDENCE_STATUS_OK", 7, "id_ocr_confidence_status_ok");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static c f5435l = new c("ID_OCR_CONFIDENCE_STATUS_FAIL", 8, "id_ocr_confidence_status_fail");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static c f5437n = new c("ID_OCR_CONFIDENCE_STATUS_WARN", 9, "id_ocr_confidence_status_warn");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f5431h = new c("FACE_MATCH_STATUS_SUCCESS", 10, "face_match_status_success");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f5433j = new c("FACE_MATCH_STATUS_FAIL", 11, "face_match_status_fail");

    private c(String str, int i2, String str2) {
        this.f5442f = str2;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f5441t + 25;
        f5436m = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f5442f;
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        return str;
    }

    static {
        c[] cVarArrA = a();
        f5434k = cVarArrA;
        EnumEntriesKt.enumEntries(cVarArrA);
        int i2 = f5440s + 43;
        f5439r = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final /* synthetic */ c[] a() {
        int i2 = 2 % 2;
        int i3 = f5436m;
        int i4 = i3 + 103;
        f5441t = i4 % 128;
        int i5 = i4 % 2;
        c[] cVarArr = {f5426b, f5425a, f5428d, f5427c, f5429e, f5430g, f5432i, f5438o, f5435l, f5437n, f5431h, f5433j};
        int i6 = i3 + 65;
        f5441t = i6 % 128;
        int i7 = i6 % 2;
        return cVarArr;
    }

    public static c valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f5441t + 125;
        f5436m = i3 % 128;
        int i4 = i3 % 2;
        c cVar = (c) Enum.valueOf(c.class, str);
        int i5 = f5441t + 63;
        f5436m = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    public static c[] values() {
        int i2 = 2 % 2;
        int i3 = f5436m + 57;
        f5441t = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = f5434k;
        if (i4 != 0) {
            return (c[]) cVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
