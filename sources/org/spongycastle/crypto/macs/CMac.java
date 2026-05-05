package org.spongycastle.crypto.macs;

import com.drew.metadata.avi.AviDirectory;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.ISO7816d4Padding;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class CMac implements Mac {
    private byte[] Lu;
    private byte[] Lu2;
    private byte[] ZEROES;
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;
    private byte[] poly;

    public CMac(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    public CMac(BlockCipher blockCipher, int i2) {
        if (i2 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i2 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (blockCipher.getBlockSize() * 8));
        }
        this.cipher = new CBCBlockCipher(blockCipher);
        this.macSize = i2 / 8;
        this.poly = lookupPoly(blockCipher.getBlockSize());
        this.mac = new byte[blockCipher.getBlockSize()];
        this.buf = new byte[blockCipher.getBlockSize()];
        this.ZEROES = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    private byte[] doubleLu(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i2 = (-1) - (((-1) - (-shiftLeft(bArr, bArr2))) | ((-1) - 255));
        int length = bArr.length - 3;
        byte b2 = bArr2[length];
        byte[] bArr3 = this.poly;
        byte b3 = bArr3[1];
        bArr2[length] = (byte) (b2 ^ ((b3 + i2) - (b3 | i2)));
        int length2 = bArr.length - 2;
        byte b4 = bArr2[length2];
        byte b5 = bArr3[2];
        bArr2[length2] = (byte) (((b5 + i2) - (b5 | i2)) ^ b4);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i2 & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    private static byte[] lookupPoly(int i2) {
        int i3 = i2 * 8;
        int i4 = 135;
        switch (i3) {
            case 64:
            case AviDirectory.TAG_DATETIME_ORIGINAL /* 320 */:
                i4 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i4 = 45;
                break;
            case CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY /* 224 */:
                i4 = 777;
                break;
            case 256:
                i4 = PhotoshopDirectory.TAG_CAPTION_DIGEST;
                break;
            case BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT /* 384 */:
                i4 = OlympusMakernoteDirectory.TAG_ZOOM;
                break;
            case 448:
                i4 = 2129;
                break;
            case 512:
                i4 = 293;
                break;
            case 768:
                i4 = 655377;
                break;
            case 1024:
                i4 = 524355;
                break;
            case 2048:
                i4 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + i3);
        }
        return Pack.intToBigEndian(i4);
    }

    private static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            int i3 = bArr[length] & 255;
            int i4 = i3 << 1;
            bArr2[length] = (byte) ((i2 + i4) - (i2 & i4));
            int i5 = i3 >>> 7;
            i2 = (i5 + 1) - (i5 | 1);
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i2) {
        byte[] bArr2;
        if (this.bufOff == this.cipher.getBlockSize()) {
            bArr2 = this.Lu;
        } else {
            new ISO7816d4Padding().addPadding(this.buf, this.bufOff);
            bArr2 = this.Lu2;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.mac;
            if (i3 >= bArr3.length) {
                this.cipher.processBlock(this.buf, 0, bArr3, 0);
                System.arraycopy(this.mac, 0, bArr, i2, this.macSize);
                reset();
                return this.macSize;
            }
            byte[] bArr4 = this.buf;
            bArr4[i3] = (byte) (bArr4[i3] ^ bArr2[i3]);
            i3++;
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        validate(cipherParameters);
        this.cipher.init(true, cipherParameters);
        byte[] bArr = this.ZEROES;
        byte[] bArr2 = new byte[bArr.length];
        this.cipher.processBlock(bArr, 0, bArr2, 0);
        byte[] bArrDoubleLu = doubleLu(bArr2);
        this.Lu = bArrDoubleLu;
        this.Lu2 = doubleLu(bArrDoubleLu);
        reset();
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i2 >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i2] = 0;
                i2++;
            }
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b2) {
        int i2 = this.bufOff;
        byte[] bArr = this.buf;
        if (i2 == bArr.length) {
            this.cipher.processBlock(bArr, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i3 = this.bufOff;
        this.bufOff = i3 + 1;
        bArr2[i3] = b2;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.cipher.getBlockSize();
        int i4 = this.bufOff;
        int i5 = blockSize - i4;
        if (i3 > i5) {
            System.arraycopy(bArr, i2, this.buf, i4, i5);
            this.cipher.processBlock(this.buf, 0, this.mac, 0);
            this.bufOff = 0;
            i3 -= i5;
            i2 += i5;
            while (i3 > blockSize) {
                this.cipher.processBlock(bArr, i2, this.mac, 0);
                i3 -= blockSize;
                i2 += blockSize;
            }
        }
        System.arraycopy(bArr, i2, this.buf, this.bufOff, i3);
        this.bufOff += i3;
    }

    void validate(CipherParameters cipherParameters) {
        if (cipherParameters != null && !(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }
}
