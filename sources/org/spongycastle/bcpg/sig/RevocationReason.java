package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class RevocationReason extends SignatureSubpacket {
    public RevocationReason(boolean z2, byte b2, String str) {
        super(29, z2, false, createData(b2, str));
    }

    public RevocationReason(boolean z2, boolean z3, byte[] bArr) {
        super(29, z2, z3, bArr);
    }

    private static byte[] createData(byte b2, String str) {
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(str);
        byte[] bArr = new byte[uTF8ByteArray.length + 1];
        bArr[0] = b2;
        System.arraycopy(uTF8ByteArray, 0, bArr, 1, uTF8ByteArray.length);
        return bArr;
    }

    public String getRevocationDescription() {
        byte[] data = getData();
        if (data.length == 1) {
            return "";
        }
        int length = data.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(data, 1, bArr, 0, length);
        return Strings.fromUTF8ByteArray(bArr);
    }

    public byte getRevocationReason() {
        return getData()[0];
    }
}
