package org.spongycastle.openpgp.operator;

import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
public interface PBEProtectionRemoverFactory {
    PBESecretKeyDecryptor createDecryptor(String str) throws PGPException;
}
