package com.facetec.sdk;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class bi extends Exception {

    enum Z {
        UNKNOWN(0),
        PERMISSION_DENIED(1),
        OPEN_TIMEOUT(2),
        LOCK_OPEN_TIMEOUT(3),
        CLOSE_ERROR(4),
        FRONT_FACING_NOT_FOUND(5),
        NO_OUTPUT_SIZES(6),
        ACCESS_ERROR(7);

        final int C;

        Z(int i2) {
            this.C = i2;
        }
    }

    bi(Z z2) {
        this(z2, "");
    }

    bi(Z z2, String str) {
        super(Code(z2, str));
    }

    bi(Z z2, Throwable th) {
        super(Code(z2, ""), th);
    }

    bi(Throwable th) {
        super(Code(Z.UNKNOWN, ""), th);
    }

    private static String Code(Z z2, String str) {
        String str2 = String.format(Locale.US, "Camera error (%d)", Integer.valueOf(z2.C));
        return !str.isEmpty() ? new StringBuilder().append(str2).append(": ").append(str).toString() : str2;
    }
}
