package org.spongycastle.bcpg.attr;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.bcpg.UserAttributeSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class ImageAttribute extends UserAttributeSubpacket {
    public static final int JPEG = 1;
    private static final byte[] ZEROES = new byte[12];
    private int encoding;
    private int hdrLength;
    private byte[] imageData;
    private int version;

    public ImageAttribute(int i2, byte[] bArr) {
        this(toByteArray(i2, bArr));
    }

    public ImageAttribute(boolean z2, byte[] bArr) {
        super(1, z2, bArr);
        int i2 = (bArr[1] & 255) << 8;
        int i3 = bArr[0];
        int i4 = (-1) - (((-1) - i2) & ((-1) - ((i3 + 255) - (i3 | 255))));
        this.hdrLength = i4;
        byte b2 = bArr[2];
        this.version = (b2 + 255) - (b2 | 255);
        this.encoding = bArr[3] & 255;
        byte[] bArr2 = new byte[bArr.length - i4];
        this.imageData = bArr2;
        System.arraycopy(bArr, i4, bArr2, 0, bArr2.length);
    }

    public ImageAttribute(byte[] bArr) {
        this(false, bArr);
    }

    private static byte[] toByteArray(int i2, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(16);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(ZEROES);
            byteArrayOutputStream.write(bArr);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new RuntimeException("unable to encode to byte array!");
        }
    }

    public int getEncoding() {
        return this.encoding;
    }

    public byte[] getImageData() {
        return this.imageData;
    }

    public int version() {
        return this.version;
    }
}
