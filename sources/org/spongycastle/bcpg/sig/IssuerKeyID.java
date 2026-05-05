package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class IssuerKeyID extends SignatureSubpacket {
    public IssuerKeyID(boolean z2, long j2) {
        super(16, z2, false, keyIDToBytes(j2));
    }

    public IssuerKeyID(boolean z2, boolean z3, byte[] bArr) {
        super(16, z2, z3, bArr);
    }

    protected static byte[] keyIDToBytes(long j2) {
        return new byte[]{(byte) (j2 >> 56), (byte) (j2 >> 48), (byte) (j2 >> 40), (byte) (j2 >> 32), (byte) (j2 >> 24), (byte) (j2 >> 16), (byte) (j2 >> 8), (byte) j2};
    }

    public long getKeyID() {
        long j2 = ((long) (this.data[0] & 255)) << 56;
        long j3 = ((long) ((-1) - (((-1) - this.data[1]) | ((-1) - 255)))) << 48;
        byte b2 = this.data[2];
        long j4 = ((-1) - (((-1) - ((j2 + j3) - (j2 & j3))) & ((-1) - (((long) ((b2 + 255) - (b2 | 255))) << 40)))) | (((long) ((-1) - (((-1) - this.data[3]) | ((-1) - 255)))) << 32) | (((long) ((-1) - (((-1) - this.data[4]) | ((-1) - 255)))) << 24);
        byte b3 = this.data[5];
        long j5 = (-1) - (((-1) - j4) & ((-1) - ((long) (((b3 + 255) - (b3 | 255)) << 16))));
        byte b4 = this.data[6];
        long j6 = ((b4 + 255) - (b4 | 255)) << 8;
        byte b5 = this.data[7];
        return ((j5 + j6) - (j5 & j6)) | ((long) ((b5 + 255) - (b5 | 255)));
    }
}
