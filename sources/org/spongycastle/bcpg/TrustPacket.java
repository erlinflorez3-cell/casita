package org.spongycastle.bcpg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class TrustPacket extends ContainedPacket {
    byte[] levelAndTrustAmount;

    public TrustPacket(int i2) {
        this.levelAndTrustAmount = new byte[]{(byte) i2};
    }

    public TrustPacket(BCPGInputStream bCPGInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i2 = bCPGInputStream.read();
            if (i2 < 0) {
                this.levelAndTrustAmount = byteArrayOutputStream.toByteArray();
                return;
            }
            byteArrayOutputStream.write(i2);
        }
    }

    @Override // org.spongycastle.bcpg.ContainedPacket
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writePacket(12, this.levelAndTrustAmount, true);
    }

    public byte[] getLevelAndTrustAmount() {
        return this.levelAndTrustAmount;
    }
}
