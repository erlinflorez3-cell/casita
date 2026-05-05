package co.com.rbm.sdkqrcode.model;

import android.app.Activity;

/* JADX INFO: loaded from: classes4.dex */
public interface QrModelInterface {

    public class IOException extends RuntimeException {
    }

    void init(String str, String str2, String str3);

    void startScan(int i2, Activity activity);

    void transformData(String str);
}
