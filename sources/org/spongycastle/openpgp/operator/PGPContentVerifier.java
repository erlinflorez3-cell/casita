package org.spongycastle.openpgp.operator;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface PGPContentVerifier {
    int getHashAlgorithm();

    int getKeyAlgorithm();

    long getKeyID();

    OutputStream getOutputStream();

    boolean verify(byte[] bArr);
}
