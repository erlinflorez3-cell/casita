package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f3321a;

    IntegrityServiceException(int i2, Throwable th) {
        super(new Status(i2, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i2), com.google.android.play.core.integrity.model.a.a(i2))));
        if (i2 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f3321a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f3321a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
