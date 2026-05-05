package org.spongycastle.openpgp.operator;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface PGPDigestCalculator {
    int getAlgorithm();

    byte[] getDigest();

    OutputStream getOutputStream();

    void reset();
}
