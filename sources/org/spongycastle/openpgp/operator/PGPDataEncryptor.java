package org.spongycastle.openpgp.operator;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface PGPDataEncryptor {
    int getBlockSize();

    PGPDigestCalculator getIntegrityCalculator();

    OutputStream getOutputStream(OutputStream outputStream);
}
