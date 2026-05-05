package co.com.rbm.sdkqrcode.result;

/* JADX INFO: loaded from: classes4.dex */
public interface QrErrorCallback {

    public class IOException extends RuntimeException {
    }

    void onErrorShow(int i2, String str);
}
