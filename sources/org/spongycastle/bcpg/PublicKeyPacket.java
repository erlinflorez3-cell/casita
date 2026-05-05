package org.spongycastle.bcpg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyPacket extends ContainedPacket implements PublicKeyAlgorithmTags {
    private int algorithm;
    private BCPGKey key;
    private long time;
    private int validDays;
    private int version;

    public PublicKeyPacket(int i2, Date date, BCPGKey bCPGKey) {
        this.version = 4;
        this.time = date.getTime() / 1000;
        this.algorithm = i2;
        this.key = bCPGKey;
    }

    PublicKeyPacket(BCPGInputStream bCPGInputStream) throws IOException {
        this.version = bCPGInputStream.read();
        long j2 = ((long) bCPGInputStream.read()) << 24;
        long j3 = bCPGInputStream.read() << 16;
        long j4 = ((j2 + j3) - (j2 & j3)) | ((long) (bCPGInputStream.read() << 8));
        long j5 = bCPGInputStream.read();
        this.time = (j4 + j5) - (j4 & j5);
        if (this.version <= 3) {
            int i2 = bCPGInputStream.read() << 8;
            int i3 = bCPGInputStream.read();
            this.validDays = (i2 + i3) - (i2 & i3);
        }
        byte b2 = (byte) bCPGInputStream.read();
        this.algorithm = b2;
        if (b2 == 1 || b2 == 2 || b2 == 3) {
            this.key = new RSAPublicBCPGKey(bCPGInputStream);
            return;
        }
        switch (b2) {
            case 16:
            case 20:
                this.key = new ElGamalPublicBCPGKey(bCPGInputStream);
                return;
            case 17:
                this.key = new DSAPublicBCPGKey(bCPGInputStream);
                return;
            case 18:
                this.key = new ECDHPublicBCPGKey(bCPGInputStream);
                return;
            case 19:
                this.key = new ECDSAPublicBCPGKey(bCPGInputStream);
                return;
            default:
                throw new IOException("unknown PGP public key algorithm encountered");
        }
    }

    @Override // org.spongycastle.bcpg.ContainedPacket
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writePacket(6, getEncodedContents(), true);
    }

    public int getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncodedContents() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BCPGOutputStream bCPGOutputStream = new BCPGOutputStream(byteArrayOutputStream);
        bCPGOutputStream.write(this.version);
        bCPGOutputStream.write((byte) (this.time >> 24));
        bCPGOutputStream.write((byte) (this.time >> 16));
        bCPGOutputStream.write((byte) (this.time >> 8));
        bCPGOutputStream.write((byte) this.time);
        if (this.version <= 3) {
            bCPGOutputStream.write((byte) (this.validDays >> 8));
            bCPGOutputStream.write((byte) this.validDays);
        }
        bCPGOutputStream.write(this.algorithm);
        bCPGOutputStream.writeObject((BCPGObject) this.key);
        bCPGOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public BCPGKey getKey() {
        return this.key;
    }

    public Date getTime() {
        return new Date(this.time * 1000);
    }

    public int getValidDays() {
        return this.validDays;
    }

    public int getVersion() {
        return this.version;
    }
}
