package com.valid.communication.managers.communicationmanager;

import com.valid.communication.models.CertificateModel;
import com.valid.communication.models.ExchangeRequestData;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface CommunicationManager {

    public class Exception extends RuntimeException {
    }

    void addSessionIdInEncryptedData(boolean z2);

    void clearSession();

    void consumeVsshService(int i2, String str, Map<String, String> map, Map<String, Object> map2);

    void consumeWebServiceWithTypeMethod(int i2, String str, Map<String, String> map, Map<String, Object> map2);

    void disableSecureRequest(boolean z2);

    void doGetCertificate(String str, String str2);

    String getSessionId();

    void initExchangeKey(String str, ExchangeRequestData exchangeRequestData);

    void initExchangeKey(String str, String str2, ExchangeRequestData exchangeRequestData);

    void initExchangeKey(String str, String str2, ExchangeRequestData exchangeRequestData, Map<String, Object> map);

    void initExchangeKey(String str, String str2, ExchangeRequestData exchangeRequestData, Map<String, Object> map, Map<String, String> map2);

    void isResponseEncrypted(boolean z2);

    void setAdditionalEncryptedData(Map<String, String> map);

    void setBaseUrl(String str);

    void setCallback(CommunicationManagerCallback communicationManagerCallback);

    void setCertificates(List<CertificateModel> list);

    void setEnableRequestWithSSLPinning(boolean z2);
}
