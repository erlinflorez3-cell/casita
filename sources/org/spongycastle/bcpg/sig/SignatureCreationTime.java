package org.spongycastle.bcpg.sig;

import java.util.Date;
import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureCreationTime extends SignatureSubpacket {
    public SignatureCreationTime(boolean z2, Date date) {
        super(2, z2, false, timeToBytes(date));
    }

    public SignatureCreationTime(boolean z2, boolean z3, byte[] bArr) {
        super(2, z2, z3, bArr);
    }

    protected static byte[] timeToBytes(Date date) {
        return new byte[]{(byte) (r4 >> 24), (byte) (r4 >> 16), (byte) (r4 >> 8), (byte) (date.getTime() / 1000)};
    }

    public Date getTime() {
        long j2 = ((long) (this.data[0] & 255)) << 24;
        byte b2 = this.data[1];
        long j3 = j2 | ((long) (((b2 + 255) - (b2 | 255)) << 16));
        long j4 = (this.data[2] & 255) << 8;
        return new Date((((j3 + j4) - (j3 & j4)) | ((long) (this.data[3] & 255))) * 1000);
    }
}
