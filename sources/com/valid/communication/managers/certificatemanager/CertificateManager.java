package com.valid.communication.managers.certificatemanager;

import com.valid.communication.models.CertificateModel;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface CertificateManager {

    public class NullPointerException extends RuntimeException {
    }

    void enableSslPinning(boolean z2);

    void getCertificates(String str);

    void processPinningCertificate(String str);

    void publishSuccess();

    void setSslContext(List<CertificateModel> list) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException;
}
