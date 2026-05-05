package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class KeyExpirationTime extends SignatureSubpacket {
    public KeyExpirationTime(boolean z2, long j2) {
        super(9, z2, false, timeToBytes(j2));
    }

    public KeyExpirationTime(boolean z2, boolean z3, byte[] bArr) {
        super(9, z2, z3, bArr);
    }

    protected static byte[] timeToBytes(long j2) {
        return new byte[]{(byte) (j2 >> 24), (byte) (j2 >> 16), (byte) (j2 >> 8), (byte) j2};
    }

    public long getTime() {
        byte b2 = this.data[0];
        return (-1) - (((-1) - ((-1) - (((-1) - ((((long) ((b2 + 255) - (b2 | 255))) << 24) | ((long) (((-1) - (((-1) - this.data[1]) | ((-1) - 255))) << 16)))) & ((-1) - ((long) ((this.data[2] & 255) << 8)))))) & ((-1) - ((long) (this.data[3] & 255))));
    }
}
