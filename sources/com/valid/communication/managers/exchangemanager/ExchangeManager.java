package com.valid.communication.managers.exchangemanager;

import com.valid.communication.managers.httprequestmanager.HttpRequestManager;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface ExchangeManager {

    public class Exception extends RuntimeException {
    }

    void getExchangeKeyServiceWithURL(String str, String str2);

    void getExchangeKeyServiceWithURL(String str, String str2, Map<String, Object> map);

    void getExchangeKeyServiceWithURL(String str, String str2, Map<String, Object> map, Map<String, String> map2);

    void setCallback(ExchangeManagerCallback exchangeManagerCallback);

    void setHttRequestManager(HttpRequestManager httpRequestManager);
}
