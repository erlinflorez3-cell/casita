package org.spongycastle.openpgp.operator;

import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPPrivateKey;

/* JADX INFO: loaded from: classes2.dex */
public interface PGPContentSignerBuilder {
    PGPContentSigner build(int i2, PGPPrivateKey pGPPrivateKey) throws PGPException;
}
