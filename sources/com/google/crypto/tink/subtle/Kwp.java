package com.google.crypto.tink.subtle;

import com.google.crypto.tink.KeyWrap;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class Kwp implements KeyWrap {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MAX_WRAP_KEY_SIZE = 4096;
    static final int MIN_WRAP_KEY_SIZE = 16;
    static final byte[] PREFIX = {-90, 89, 89, -90};
    static final int ROUNDS = 6;
    private final SecretKey aesKey;

    public Kwp(final byte[] key) throws GeneralSecurityException {
        if (key.length != 16 && key.length != 32) {
            throw new GeneralSecurityException("Unsupported key length");
        }
        this.aesKey = new SecretKeySpec(key, "AES");
    }

    private byte[] computeW(final byte[] iv, final byte[] key) throws GeneralSecurityException {
        if (key.length <= 8 || key.length > 2147483631 || iv.length != 8) {
            throw new GeneralSecurityException("computeW called with invalid parameters");
        }
        int iWrappingSize = wrappingSize(key.length);
        byte[] bArr = new byte[iWrappingSize];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(key, 0, bArr, 8, key.length);
        int i2 = 1;
        int i3 = (iWrappingSize / 8) - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(1, this.aesKey);
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        int i4 = 0;
        while (i4 < 6) {
            int i5 = 0;
            while (i5 < i3) {
                int i6 = i5 + 1;
                int i7 = i6 * 8;
                System.arraycopy(bArr, i7, bArr2, 8, 8);
                engineFactory.doFinal(bArr2, 0, 16, bArr2);
                int i8 = (i4 * i3) + i5 + i2;
                for (int i9 = 0; i9 < 4; i9++) {
                    int i10 = 7 - i9;
                    bArr2[i10] = (byte) (((byte) ((i8 + 255) - (255 | i8))) ^ bArr2[i10]);
                    i8 >>>= 8;
                }
                System.arraycopy(bArr2, 8, bArr, i7, 8);
                i5 = i6;
                i2 = 1;
            }
            i4++;
            i2 = 1;
        }
        System.arraycopy(bArr2, 0, bArr, 0, 8);
        return bArr;
    }

    private byte[] invertW(final byte[] wrapped) throws GeneralSecurityException {
        if (wrapped.length < 24 || wrapped.length % 8 != 0) {
            throw new GeneralSecurityException("Incorrect data size");
        }
        byte[] bArrCopyOf = Arrays.copyOf(wrapped, wrapped.length);
        int length = bArrCopyOf.length / 8;
        int i2 = length - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(2, this.aesKey);
        byte[] bArr = new byte[16];
        System.arraycopy(bArrCopyOf, 0, bArr, 0, 8);
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = length - 2; i4 >= 0; i4--) {
                int i5 = (i4 + 1) * 8;
                System.arraycopy(bArrCopyOf, i5, bArr, 8, 8);
                int i6 = (i3 * i2) + i4 + 1;
                for (int i7 = 0; i7 < 4; i7++) {
                    int i8 = 7 - i7;
                    bArr[i8] = (byte) (bArr[i8] ^ ((byte) (255 & i6)));
                    i6 >>>= 8;
                }
                engineFactory.doFinal(bArr, 0, 16, bArr);
                System.arraycopy(bArr, 8, bArrCopyOf, i5, 8);
            }
        }
        System.arraycopy(bArr, 0, bArrCopyOf, 0, 8);
        return bArrCopyOf;
    }

    private int wrappingSize(int inputSize) {
        return inputSize + (7 - ((inputSize + 7) % 8)) + 8;
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] unwrap(final byte[] data) throws GeneralSecurityException {
        int i2;
        if (data.length < wrappingSize(16)) {
            throw new GeneralSecurityException("Wrapped key size is too small");
        }
        if (data.length > wrappingSize(4096)) {
            throw new GeneralSecurityException("Wrapped key size is too large");
        }
        if (data.length % 8 != 0) {
            throw new GeneralSecurityException("Wrapped key size must be a multiple of 8 bytes");
        }
        byte[] bArrInvertW = invertW(data);
        boolean z2 = true;
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            if (PREFIX[i3] != bArrInvertW[i3]) {
                z2 = false;
            }
            i3++;
        }
        int i4 = 0;
        for (i2 = 4; i2 < 8; i2++) {
            byte b2 = bArrInvertW[i2];
            i4 = (i4 << 8) + ((b2 + 255) - (b2 | 255));
        }
        if (wrappingSize(i4) == bArrInvertW.length) {
            for (int i5 = i4 + 8; i5 < bArrInvertW.length; i5++) {
                if (bArrInvertW[i5] != 0) {
                    z2 = false;
                }
            }
            z3 = z2;
        }
        if (z3) {
            return Arrays.copyOfRange(bArrInvertW, 8, i4 + 8);
        }
        throw new BadPaddingException("Invalid padding");
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] wrap(final byte[] data) throws GeneralSecurityException {
        if (data.length < 16) {
            throw new GeneralSecurityException("Key size of key to wrap too small");
        }
        if (data.length > 4096) {
            throw new GeneralSecurityException("Key size of key to wrap too large");
        }
        byte[] bArr = new byte[8];
        byte[] bArr2 = PREFIX;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        for (int i2 = 0; i2 < 4; i2++) {
            int length = data.length >> ((3 - i2) * 8);
            bArr[i2 + 4] = (byte) ((length + 255) - (length | 255));
        }
        return computeW(bArr, data);
    }
}
