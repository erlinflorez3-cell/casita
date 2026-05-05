package org.spongycastle.openpgp.operator;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface PGPDataDecryptor {
    int getBlockSize();

    InputStream getInputStream(InputStream inputStream);

    PGPDigestCalculator getIntegrityCalculator();
}
