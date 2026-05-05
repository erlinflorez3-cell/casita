package com.valid.emvqr.manager;

/* JADX INFO: loaded from: classes5.dex */
public interface EmvQrManagerCallback {
    void initiatedScanEmvQr();

    void onErrorEmvQr(Integer num, String str);

    void onScanResponse(String str);
}
