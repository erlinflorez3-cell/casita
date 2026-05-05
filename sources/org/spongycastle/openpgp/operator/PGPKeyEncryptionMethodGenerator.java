package org.spongycastle.openpgp.operator;

import org.spongycastle.bcpg.ContainedPacket;
import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PGPKeyEncryptionMethodGenerator {
    public abstract ContainedPacket generate(int i2, byte[] bArr) throws PGPException;
}
