package org.spongycastle.bcpg;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class S2K extends BCPGObject {
    private static final int EXPBIAS = 6;
    public static final int GNU_DUMMY_S2K = 101;
    public static final int GNU_PROTECTION_MODE_DIVERT_TO_CARD = 2;
    public static final int GNU_PROTECTION_MODE_NO_PRIVATE_KEY = 1;
    public static final int SALTED = 1;
    public static final int SALTED_AND_ITERATED = 3;
    public static final int SIMPLE = 0;
    int algorithm;
    int itCount;
    byte[] iv;
    int protectionMode;
    int type;

    public S2K(int i2) {
        this.itCount = -1;
        this.protectionMode = -1;
        this.type = 0;
        this.algorithm = i2;
    }

    public S2K(int i2, byte[] bArr) {
        this.itCount = -1;
        this.protectionMode = -1;
        this.type = 1;
        this.algorithm = i2;
        this.iv = bArr;
    }

    public S2K(int i2, byte[] bArr, int i3) {
        this.protectionMode = -1;
        this.type = 3;
        this.algorithm = i2;
        this.iv = bArr;
        this.itCount = i3;
    }

    S2K(InputStream inputStream) throws IOException {
        this.itCount = -1;
        this.protectionMode = -1;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.type = dataInputStream.read();
        this.algorithm = dataInputStream.read();
        int i2 = this.type;
        if (i2 == 101) {
            dataInputStream.read();
            dataInputStream.read();
            dataInputStream.read();
            this.protectionMode = dataInputStream.read();
            return;
        }
        if (i2 != 0) {
            byte[] bArr = new byte[8];
            this.iv = bArr;
            dataInputStream.readFully(bArr, 0, bArr.length);
            if (this.type == 3) {
                this.itCount = dataInputStream.read();
            }
        }
    }

    @Override // org.spongycastle.bcpg.BCPGObject
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.write(this.type);
        bCPGOutputStream.write(this.algorithm);
        int i2 = this.type;
        if (i2 == 101) {
            bCPGOutputStream.write(71);
            bCPGOutputStream.write(78);
            bCPGOutputStream.write(85);
            bCPGOutputStream.write(this.protectionMode);
            return;
        }
        if (i2 != 0) {
            bCPGOutputStream.write(this.iv);
        }
        if (this.type == 3) {
            bCPGOutputStream.write(this.itCount);
        }
    }

    public int getHashAlgorithm() {
        return this.algorithm;
    }

    public byte[] getIV() {
        return this.iv;
    }

    public long getIterationCount() {
        int i2 = this.itCount;
        return (((-1) - (((-1) - i2) | ((-1) - 15))) + 16) << ((i2 >> 4) + 6);
    }

    public int getProtectionMode() {
        return this.protectionMode;
    }

    public int getType() {
        return this.type;
    }
}
