package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class SignerUserID extends SignatureSubpacket {
    public SignerUserID(boolean z2, String str) {
        super(28, z2, false, Strings.toUTF8ByteArray(str));
    }

    public SignerUserID(boolean z2, boolean z3, byte[] bArr) {
        super(28, z2, z3, bArr);
    }

    public String getID() {
        return Strings.fromUTF8ByteArray(this.data);
    }

    public byte[] getRawID() {
        return Arrays.clone(this.data);
    }
}
