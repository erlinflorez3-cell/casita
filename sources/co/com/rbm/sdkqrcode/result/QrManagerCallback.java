package co.com.rbm.sdkqrcode.result;

import co.com.rbm.sdkqrcode.data.QrEntity;

/* JADX INFO: loaded from: classes4.dex */
public interface QrManagerCallback extends QrErrorCallback {

    public class NullPointerException extends RuntimeException {
    }

    void onScanResponse(String str, QrEntity qrEntity, Object obj);
}
