package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public final class AesEaxJce implements Aead {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BLOCK_SIZE_IN_BYTES = 16;
    static final int TAG_SIZE_IN_BYTES = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3524b;
    private final int ivSizeInBytes;
    private final SecretKeySpec keySpec;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f3525p;
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final ThreadLocal<Cipher> localEcbCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    };
    private static final ThreadLocal<Cipher> localCtrCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    };

    public AesEaxJce(final byte[] key, int ivSizeInBytes) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (ivSizeInBytes != 12 && ivSizeInBytes != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.ivSizeInBytes = ivSizeInBytes;
        Validators.validateAesKeySize(key.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        this.keySpec = secretKeySpec;
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrMultiplyByX = multiplyByX(cipher.doFinal(new byte[16]));
        this.f3524b = bArrMultiplyByX;
        this.f3525p = multiplyByX(bArrMultiplyByX);
    }

    private static byte[] multiplyByX(final byte[] block) {
        byte[] bArr = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            int i3 = block[i2] << 1;
            int i4 = i2 + 1;
            byte b2 = block[i4];
            bArr[i2] = (byte) ((i3 ^ (((b2 + 255) - (b2 | 255)) >>> 7)) & 255);
            i2 = i4;
        }
        int i5 = block[15] << 1;
        int i6 = block[0] >> 7;
        bArr[15] = (byte) (((i6 + 135) - (i6 | 135)) ^ i5);
        return bArr;
    }

    private byte[] omac(Cipher ecb, int tag, final byte[] data, int offset, int length) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr = new byte[16];
        bArr[15] = (byte) tag;
        if (length == 0) {
            return ecb.doFinal(xor(bArr, this.f3524b));
        }
        byte[] bArrDoFinal = ecb.doFinal(bArr);
        int i2 = 0;
        while (length - i2 > 16) {
            for (int i3 = 0; i3 < 16; i3++) {
                bArrDoFinal[i3] = (byte) (bArrDoFinal[i3] ^ data[(offset + i2) + i3]);
            }
            bArrDoFinal = ecb.doFinal(bArrDoFinal);
            i2 += 16;
        }
        return ecb.doFinal(xor(bArrDoFinal, pad(Arrays.copyOfRange(data, i2 + offset, offset + length))));
    }

    private byte[] pad(final byte[] data) {
        if (data.length == 16) {
            return xor(data, this.f3524b);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f3525p, 16);
        for (int i2 = 0; i2 < data.length; i2++) {
            bArrCopyOf[i2] = (byte) (bArrCopyOf[i2] ^ data[i2]);
        }
        bArrCopyOf[data.length] = (byte) (bArrCopyOf[data.length] ^ 128);
        return bArrCopyOf;
    }

    private static byte[] xor(final byte[] x2, final byte[] y2) {
        int length = x2.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (x2[i2] ^ y2[i2]);
        }
        return bArr;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        byte[] bArr = associatedData;
        int length = (ciphertext.length - this.ivSizeInBytes) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, this.keySpec);
        byte[] bArrOmac = omac(cipher, 0, ciphertext, 0, this.ivSizeInBytes);
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] bArrOmac2 = omac(cipher, 1, bArr, 0, bArr.length);
        byte[] bArrOmac3 = omac(cipher, 2, ciphertext, this.ivSizeInBytes, length);
        int length2 = ciphertext.length - 16;
        byte b2 = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            b2 = (byte) ((-1) - (((-1) - b2) & ((-1) - (((ciphertext[length2 + i2] ^ bArrOmac2[i2]) ^ bArrOmac[i2]) ^ bArrOmac3[i2]))));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = localCtrCipher.get();
        cipher2.init(1, this.keySpec, new IvParameterSpec(bArrOmac));
        return cipher2.doFinal(ciphertext, this.ivSizeInBytes, length);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws Throwable {
        byte[] bArr = associatedData;
        int length = plaintext.length;
        int i2 = this.ivSizeInBytes;
        if (length > 2147483631 - i2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr2 = new byte[plaintext.length + i2 + 16];
        byte[] bArrRandBytes = Random.randBytes(i2);
        System.arraycopy(bArrRandBytes, 0, bArr2, 0, this.ivSizeInBytes);
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, this.keySpec);
        byte[] bArrOmac = omac(cipher, 0, bArrRandBytes, 0, bArrRandBytes.length);
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] bArrOmac2 = omac(cipher, 1, bArr, 0, bArr.length);
        Cipher cipher2 = localCtrCipher.get();
        cipher2.init(1, this.keySpec, new IvParameterSpec(bArrOmac));
        cipher2.doFinal(plaintext, 0, plaintext.length, bArr2, this.ivSizeInBytes);
        byte[] bArrOmac3 = omac(cipher, 2, bArr2, this.ivSizeInBytes, plaintext.length);
        int length2 = plaintext.length + this.ivSizeInBytes;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr2[length2 + i3] = (byte) ((bArrOmac2[i3] ^ bArrOmac[i3]) ^ bArrOmac3[i3]);
        }
        return bArr2;
    }
}
