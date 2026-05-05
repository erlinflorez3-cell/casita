package com.ts.coresdk.crypto;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public /* synthetic */ class TSCryptographyManagerImp$e$a$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[com.ts.coresdk.crypto.biometrcis.b.values().length];
        try {
            iArr[com.ts.coresdk.crypto.biometrcis.b.BIOMETRIC_ERROR_NO_HARDWARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.ts.coresdk.crypto.biometrcis.b.BIOMETRIC_ERROR_HW_UNAVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.ts.coresdk.crypto.biometrcis.b.BIOMETRIC_ERROR_NONE_ENROLLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.ts.coresdk.crypto.biometrcis.b.BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.ts.coresdk.crypto.biometrcis.b.BIOMETRIC_ERROR_UNSUPPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[com.ts.coresdk.crypto.biometrcis.b.BIOMETRIC_STATUS_UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
