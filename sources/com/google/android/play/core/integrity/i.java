package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements k {
    i() {
    }

    @Override // com.google.android.play.core.integrity.k
    public final ApiException a(Bundle bundle) {
        int i2 = bundle.getInt("error");
        if (i2 == 0) {
            return null;
        }
        return new IntegrityServiceException(i2, null);
    }
}
