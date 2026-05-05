package co.com.rbm.sdkqrcode.model;

import co.com.rbm.sdkqrcode.data.QrEntity;

/* JADX INFO: loaded from: classes4.dex */
public interface EmvqrCallback {

    public class NullPointerException extends RuntimeException {
    }

    void checkInitializeScan(boolean z2);

    void onErrorCallback(int i2, String str);

    void onScanResponseCallback(String str, QrEntity qrEntity, Object obj);
}
