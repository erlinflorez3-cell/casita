package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureExpirationTime extends SignatureSubpacket {
    public SignatureExpirationTime(boolean z2, long j2) {
        super(3, z2, false, timeToBytes(j2));
    }

    public SignatureExpirationTime(boolean z2, boolean z3, byte[] bArr) {
        super(3, z2, z3, bArr);
    }

    protected static byte[] timeToBytes(long j2) {
        return new byte[]{(byte) (j2 >> 24), (byte) (j2 >> 16), (byte) (j2 >> 8), (byte) j2};
    }

    public long getTime() {
        byte b2 = this.data[0];
        long j2 = (((long) ((b2 + 255) - (b2 | 255))) << 24) | ((long) (((-1) - (((-1) - this.data[1]) | ((-1) - 255))) << 16)) | ((long) ((this.data[2] & 255) << 8));
        byte b3 = this.data[3];
        return (-1) - (((-1) - j2) & ((-1) - ((long) ((b3 + 255) - (b3 | 255)))));
    }
}
