package co.com.rbm.sdkqrcode.manager;

import android.app.Activity;
import co.com.rbm.sdkqrcode.data.DataAmount;
import co.com.rbm.sdkqrcode.data.QrEntity;
import co.com.rbm.sdkqrcode.result.QrLicenseCallback;
import co.com.rbm.sdkqrcode.result.QrManagerCallback;

/* JADX INFO: loaded from: classes4.dex */
public interface QrManagerInterface {

    public class ParseException extends RuntimeException {
    }

    DataAmount calculateTaxDynamic(QrEntity qrEntity, String str);

    DataAmount calculateTaxHybrid(QrEntity qrEntity, String str);

    DataAmount calculateTaxStatic(QrEntity qrEntity, String str, String str2, String str3, String str4);

    void initializeLibrary(String str, String str2, String str3, QrLicenseCallback qrLicenseCallback);

    void startScan(int i2, Activity activity, QrManagerCallback qrManagerCallback);

    void transformData(String str, QrManagerCallback qrManagerCallback);
}
