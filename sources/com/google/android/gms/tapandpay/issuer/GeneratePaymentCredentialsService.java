package com.google.android.gms.tapandpay.issuer;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* JADX INFO: loaded from: classes8.dex */
public final class GeneratePaymentCredentialsService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Binder();
    }
}
