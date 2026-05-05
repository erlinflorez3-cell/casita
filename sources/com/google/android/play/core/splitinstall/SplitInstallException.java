package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes9.dex */
public class SplitInstallException extends ApiException {
    public SplitInstallException(int i2) {
        super(new Status(i2, String.format("Split Install Error(%d): %s", Integer.valueOf(i2), com.google.android.play.core.splitinstall.model.zza.zzb(i2))));
        if (i2 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
