package org.spongycastle.bcpg;

import java.io.IOException;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class LiteralDataPacket extends InputStreamPacket {
    byte[] fileName;
    int format;
    long modDate;

    LiteralDataPacket(BCPGInputStream bCPGInputStream) throws IOException {
        super(bCPGInputStream);
        this.format = bCPGInputStream.read();
        this.fileName = new byte[bCPGInputStream.read()];
        int i2 = 0;
        while (true) {
            byte[] bArr = this.fileName;
            if (i2 == bArr.length) {
                this.modDate = (((long) bCPGInputStream.read()) << 24) | ((long) (bCPGInputStream.read() << 16)) | ((long) (bCPGInputStream.read() << 8)) | ((long) bCPGInputStream.read());
                return;
            } else {
                bArr[i2] = (byte) bCPGInputStream.read();
                i2++;
            }
        }
    }

    public String getFileName() {
        return Strings.fromUTF8ByteArray(this.fileName);
    }

    public int getFormat() {
        return this.format;
    }

    public long getModificationTime() {
        return this.modDate * 1000;
    }

    public byte[] getRawFileName() {
        return Arrays.clone(this.fileName);
    }
}
