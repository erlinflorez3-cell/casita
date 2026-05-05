package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.security.SecureRandom;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class TlsBlockCipher implements TlsCipher {
    protected TlsContext context;
    protected BlockCipher decryptCipher;
    protected BlockCipher encryptCipher;
    protected boolean encryptThenMAC;
    protected byte[] randomData = new byte[256];
    protected TlsMac readMac;
    protected boolean useExplicitIV;
    protected TlsMac writeMac;

    public TlsBlockCipher(TlsContext tlsContext, BlockCipher blockCipher, BlockCipher blockCipher2, Digest digest, Digest digest2, int i2) throws IOException {
        byte[] bArrCopyOfRange;
        byte[] bArrCopyOfRange2;
        ParametersWithIV parametersWithIV;
        ParametersWithIV parametersWithIV2;
        this.context = tlsContext;
        tlsContext.getNonceRandomGenerator().nextBytes(this.randomData);
        this.useExplicitIV = TlsUtils.isTLSv11(tlsContext);
        this.encryptThenMAC = tlsContext.getSecurityParameters().encryptThenMAC;
        int digestSize = (i2 * 2) + digest.getDigestSize() + digest2.getDigestSize();
        digestSize = this.useExplicitIV ? digestSize : digestSize + blockCipher.getBlockSize() + blockCipher2.getBlockSize();
        byte[] bArrCalculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, digestSize);
        TlsMac tlsMac = new TlsMac(tlsContext, digest, bArrCalculateKeyBlock, 0, digest.getDigestSize());
        int digestSize2 = digest.getDigestSize();
        TlsMac tlsMac2 = new TlsMac(tlsContext, digest2, bArrCalculateKeyBlock, digestSize2, digest2.getDigestSize());
        int digestSize3 = digestSize2 + digest2.getDigestSize();
        KeyParameter keyParameter = new KeyParameter(bArrCalculateKeyBlock, digestSize3, i2);
        int i3 = digestSize3 + i2;
        KeyParameter keyParameter2 = new KeyParameter(bArrCalculateKeyBlock, i3, i2);
        int blockSize = i3 + i2;
        if (this.useExplicitIV) {
            bArrCopyOfRange = new byte[blockCipher.getBlockSize()];
            bArrCopyOfRange2 = new byte[blockCipher2.getBlockSize()];
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArrCalculateKeyBlock, blockSize, blockCipher.getBlockSize() + blockSize);
            int blockSize2 = blockSize + blockCipher.getBlockSize();
            bArrCopyOfRange2 = Arrays.copyOfRange(bArrCalculateKeyBlock, blockSize2, blockCipher2.getBlockSize() + blockSize2);
            blockSize = blockSize2 + blockCipher2.getBlockSize();
        }
        if (blockSize != digestSize) {
            throw new TlsFatalAlert((short) 80);
        }
        if (tlsContext.isServer()) {
            this.writeMac = tlsMac2;
            this.readMac = tlsMac;
            this.encryptCipher = blockCipher2;
            this.decryptCipher = blockCipher;
            parametersWithIV = new ParametersWithIV(keyParameter2, bArrCopyOfRange2);
            parametersWithIV2 = new ParametersWithIV(keyParameter, bArrCopyOfRange);
        } else {
            this.writeMac = tlsMac;
            this.readMac = tlsMac2;
            this.encryptCipher = blockCipher;
            this.decryptCipher = blockCipher2;
            parametersWithIV = new ParametersWithIV(keyParameter, bArrCopyOfRange);
            parametersWithIV2 = new ParametersWithIV(keyParameter2, bArrCopyOfRange2);
        }
        this.encryptCipher.init(true, parametersWithIV);
        this.decryptCipher.init(false, parametersWithIV2);
    }

    protected int checkPaddingConstantTime(byte[] bArr, int i2, int i3, int i4, int i5) {
        byte b2;
        int i6;
        int i7 = i2 + i3;
        byte b3 = bArr[i7 - 1];
        int i8 = ((b3 + 255) - (255 | b3)) + 1;
        if ((!TlsUtils.isSSL(this.context) || i8 <= i4) && i5 + i8 <= i3) {
            int i9 = i7 - i8;
            b2 = 0;
            while (true) {
                int i10 = i9 + 1;
                int i11 = bArr[i9] ^ b3;
                b2 = (byte) ((i11 + b2) - (i11 & b2));
                if (i10 >= i7) {
                    break;
                }
                i9 = i10;
            }
            i6 = i8;
            if (b2 != 0) {
                i8 = 0;
            }
        } else {
            i6 = 0;
            b2 = 0;
            i8 = 0;
        }
        byte[] bArr2 = this.randomData;
        while (i6 < 256) {
            b2 = (byte) ((-1) - (((-1) - (bArr2[i6] ^ b3)) & ((-1) - b2)));
            i6++;
        }
        bArr2[0] = (byte) (bArr2[0] ^ b2);
        return i8;
    }

    protected int chooseExtraPadBlocks(SecureRandom secureRandom, int i2) {
        return Math.min(lowestBitSet(secureRandom.nextInt()), i2);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j2, short s2, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = i2;
        int blockSize = this.decryptCipher.getBlockSize();
        int size = this.readMac.getSize();
        int iMax = this.encryptThenMAC ? blockSize + size : Math.max(blockSize, size + 1);
        if (this.useExplicitIV) {
            iMax += blockSize;
        }
        if (i3 < iMax) {
            throw new TlsFatalAlert((short) 50);
        }
        boolean z2 = this.encryptThenMAC;
        int i6 = z2 ? i3 - size : i3;
        if (i6 % blockSize != 0) {
            throw new TlsFatalAlert((short) 21);
        }
        if (z2) {
            int i7 = i5 + i3;
            if (!Arrays.constantTimeAreEqual(this.readMac.calculateMac(j2, s2, bArr, i5, i3 - size), Arrays.copyOfRange(bArr, i7 - size, i7))) {
                throw new TlsFatalAlert((short) 20);
            }
        }
        if (this.useExplicitIV) {
            this.decryptCipher.init(false, new ParametersWithIV(null, bArr, i5, blockSize));
            i5 += blockSize;
            i6 -= blockSize;
        }
        for (int i8 = 0; i8 < i6; i8 += blockSize) {
            int i9 = i5 + i8;
            this.decryptCipher.processBlock(bArr, i9, bArr, i9);
        }
        int iCheckPaddingConstantTime = checkPaddingConstantTime(bArr, i5, i6, blockSize, this.encryptThenMAC ? 0 : size);
        boolean zConstantTimeAreEqual = iCheckPaddingConstantTime == 0;
        int i10 = i6 - iCheckPaddingConstantTime;
        if (this.encryptThenMAC) {
            i4 = i5;
        } else {
            i10 -= size;
            int i11 = i5 + i10;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i11, i11 + size);
            i4 = i5;
            zConstantTimeAreEqual |= true ^ Arrays.constantTimeAreEqual(this.readMac.calculateMacConstantTime(j2, s2, bArr, i5, i10, i6 - size, this.randomData), bArrCopyOfRange);
        }
        if (zConstantTimeAreEqual) {
            throw new TlsFatalAlert((short) 20);
        }
        return Arrays.copyOfRange(bArr, i4, i4 + i10);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j2, short s2, byte[] bArr, int i2, int i3) {
        int i4;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        ProtocolVersion serverVersion = this.context.getServerVersion();
        int iChooseExtraPadBlocks = (blockSize - 1) - ((!this.encryptThenMAC ? i3 + size : i3) % blockSize);
        if (!serverVersion.isDTLS() && !serverVersion.isSSL()) {
            iChooseExtraPadBlocks += chooseExtraPadBlocks(this.context.getSecureRandom(), (255 - iChooseExtraPadBlocks) / blockSize) * blockSize;
        }
        int i5 = size + i3 + iChooseExtraPadBlocks + 1;
        boolean z2 = this.useExplicitIV;
        if (z2) {
            i5 += blockSize;
        }
        byte[] bArr2 = new byte[i5];
        if (z2) {
            byte[] bArr3 = new byte[blockSize];
            this.context.getNonceRandomGenerator().nextBytes(bArr3);
            this.encryptCipher.init(true, new ParametersWithIV(null, bArr3));
            System.arraycopy(bArr3, 0, bArr2, 0, blockSize);
            i4 = blockSize;
        } else {
            i4 = 0;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i3);
        int length = i4 + i3;
        if (!this.encryptThenMAC) {
            byte[] bArrCalculateMac = this.writeMac.calculateMac(j2, s2, bArr, i2, i3);
            System.arraycopy(bArrCalculateMac, 0, bArr2, length, bArrCalculateMac.length);
            length += bArrCalculateMac.length;
        }
        int i6 = 0;
        while (i6 <= iChooseExtraPadBlocks) {
            bArr2[length] = (byte) iChooseExtraPadBlocks;
            i6++;
            length++;
        }
        while (i4 < length) {
            this.encryptCipher.processBlock(bArr2, i4, bArr2, i4);
            i4 += blockSize;
        }
        if (!this.encryptThenMAC) {
            return bArr2;
        }
        byte[] bArrCalculateMac2 = this.writeMac.calculateMac(j2, s2, bArr2, 0, length);
        System.arraycopy(bArrCalculateMac2, 0, bArr2, length, bArrCalculateMac2.length);
        int length2 = bArrCalculateMac2.length;
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i2) {
        int i3;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        if (this.useExplicitIV) {
            i2 -= blockSize;
        }
        if (this.encryptThenMAC) {
            int i4 = i2 - size;
            i3 = i4 - (i4 % blockSize);
        } else {
            i3 = (i2 - (i2 % blockSize)) - size;
        }
        return i3 - 1;
    }

    public TlsMac getReadMac() {
        return this.readMac;
    }

    public TlsMac getWriteMac() {
        return this.writeMac;
    }

    protected int lowestBitSet(int i2) {
        if (i2 == 0) {
            return 32;
        }
        int i3 = 0;
        while ((1 & i2) == 0) {
            i3++;
            i2 >>= 1;
        }
        return i3;
    }
}
