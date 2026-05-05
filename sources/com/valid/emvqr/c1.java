package com.valid.emvqr;

import android.app.Activity;
import android.content.Context;
import com.valid.emvqr.entities.MerchantEmvQrEntity;
import com.valid.emvqr.exceptions.EmvQrException;
import com.valid.emvqr.manager.EmvQrManagerCallback;

/* JADX INFO: loaded from: classes5.dex */
public interface c1 {
    void init(Context context, String str, String str2, String str3, EmvQrManagerCallback emvQrManagerCallback);

    MerchantEmvQrEntity processEmvQrData(String str) throws EmvQrException;

    void startScan(Activity activity, int i2);
}
