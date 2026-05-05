package org.spongycastle.openpgp.operator;

import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
public interface PGPContentVerifierBuilderProvider {
    PGPContentVerifierBuilder get(int i2, int i3) throws PGPException;
}
