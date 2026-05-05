package org.spongycastle.openpgp;

import org.spongycastle.bcpg.BCPGKey;
import org.spongycastle.bcpg.PublicKeyPacket;

/* JADX INFO: loaded from: classes2.dex */
public class PGPPrivateKey {
    private long keyID;
    private BCPGKey privateKeyDataPacket;
    private PublicKeyPacket publicKeyPacket;

    public PGPPrivateKey(long j2, PublicKeyPacket publicKeyPacket, BCPGKey bCPGKey) {
        this.keyID = j2;
        this.publicKeyPacket = publicKeyPacket;
        this.privateKeyDataPacket = bCPGKey;
    }

    public long getKeyID() {
        return this.keyID;
    }

    public BCPGKey getPrivateKeyDataPacket() {
        return this.privateKeyDataPacket;
    }

    public PublicKeyPacket getPublicKeyPacket() {
        return this.publicKeyPacket;
    }
}
