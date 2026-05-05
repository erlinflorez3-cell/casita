package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class EmbeddedSignature extends SignatureSubpacket {
    public EmbeddedSignature(boolean z2, boolean z3, byte[] bArr) {
        super(32, z2, z3, bArr);
    }
}
