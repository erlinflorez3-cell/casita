package org.spongycastle.bcpg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.io.Streams;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyEncSessionPacket extends ContainedPacket implements PublicKeyAlgorithmTags {
    private int algorithm;
    private byte[][] data;
    private long keyID;
    private int version;

    public PublicKeyEncSessionPacket(long j2, int i2, byte[][] bArr) {
        this.version = 3;
        this.keyID = j2;
        this.algorithm = i2;
        this.data = new byte[bArr.length][];
        for (int i3 = 0; i3 != bArr.length; i3++) {
            this.data[i3] = Arrays.clone(bArr[i3]);
        }
    }

    PublicKeyEncSessionPacket(BCPGInputStream bCPGInputStream) throws IOException {
        this.version = bCPGInputStream.read();
        long j2 = this.keyID;
        long j3 = ((long) bCPGInputStream.read()) << 56;
        long j4 = (j2 + j3) - (j2 & j3);
        this.keyID = j4;
        long j5 = (-1) - (((-1) - j4) & ((-1) - (((long) bCPGInputStream.read()) << 48)));
        this.keyID = j5;
        long j6 = j5 | (((long) bCPGInputStream.read()) << 40);
        this.keyID = j6;
        long j7 = ((long) bCPGInputStream.read()) << 32;
        long j8 = (j6 + j7) - (j6 & j7);
        this.keyID = j8;
        long j9 = j8 | (((long) bCPGInputStream.read()) << 24);
        this.keyID = j9;
        long j10 = j9 | (((long) bCPGInputStream.read()) << 16);
        this.keyID = j10;
        long j11 = (-1) - (((-1) - j10) & ((-1) - (((long) bCPGInputStream.read()) << 8)));
        this.keyID = j11;
        long j12 = bCPGInputStream.read();
        this.keyID = (j11 + j12) - (j11 & j12);
        int i2 = bCPGInputStream.read();
        this.algorithm = i2;
        if (i2 == 1 || i2 == 2) {
            this.data = new byte[][]{new MPInteger(bCPGInputStream).getEncoded()};
            return;
        }
        if (i2 != 16) {
            if (i2 == 18) {
                this.data = new byte[][]{Streams.readAll(bCPGInputStream)};
                return;
            } else if (i2 != 20) {
                throw new IOException("unknown PGP public key algorithm encountered");
            }
        }
        byte[][] bArr = new byte[2][];
        this.data = bArr;
        bArr[0] = new MPInteger(bCPGInputStream).getEncoded();
        this.data[1] = new MPInteger(bCPGInputStream).getEncoded();
    }

    @Override // org.spongycastle.bcpg.ContainedPacket
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BCPGOutputStream bCPGOutputStream2 = new BCPGOutputStream(byteArrayOutputStream);
        bCPGOutputStream2.write(this.version);
        bCPGOutputStream2.write((byte) (this.keyID >> 56));
        bCPGOutputStream2.write((byte) (this.keyID >> 48));
        bCPGOutputStream2.write((byte) (this.keyID >> 40));
        bCPGOutputStream2.write((byte) (this.keyID >> 32));
        bCPGOutputStream2.write((byte) (this.keyID >> 24));
        bCPGOutputStream2.write((byte) (this.keyID >> 16));
        bCPGOutputStream2.write((byte) (this.keyID >> 8));
        bCPGOutputStream2.write((byte) this.keyID);
        bCPGOutputStream2.write(this.algorithm);
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.data;
            if (i2 == bArr.length) {
                bCPGOutputStream2.close();
                bCPGOutputStream.writePacket(1, byteArrayOutputStream.toByteArray(), true);
                return;
            } else {
                bCPGOutputStream2.write(bArr[i2]);
                i2++;
            }
        }
    }

    public int getAlgorithm() {
        return this.algorithm;
    }

    public byte[][] getEncSessionKey() {
        return this.data;
    }

    public long getKeyID() {
        return this.keyID;
    }

    public int getVersion() {
        return this.version;
    }
}
