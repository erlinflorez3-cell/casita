package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes6.dex */
public class Poly1305KeyGenerator extends CipherKeyGenerator {
    private static final byte R_MASK_HIGH_4 = 15;
    private static final byte R_MASK_LOW_2 = -4;

    public static void checkKey(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        checkMask(bArr[3], (byte) 15);
        checkMask(bArr[7], (byte) 15);
        checkMask(bArr[11], (byte) 15);
        checkMask(bArr[15], (byte) 15);
        checkMask(bArr[4], R_MASK_LOW_2);
        checkMask(bArr[8], R_MASK_LOW_2);
        checkMask(bArr[12], R_MASK_LOW_2);
    }

    private static void checkMask(byte b2, byte b3) {
        if ((-1) - (((-1) - b2) | ((-1) - (~b3))) != 0) {
            throw new IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
    }

    public static void clamp(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        bArr[3] = (byte) (bArr[3] & 15);
        bArr[7] = (byte) ((-1) - (((-1) - bArr[7]) | ((-1) - 15)));
        bArr[11] = (byte) ((-1) - (((-1) - bArr[11]) | ((-1) - 15)));
        bArr[15] = (byte) (bArr[15] & 15);
        bArr[4] = (byte) ((-1) - (((-1) - bArr[4]) | ((-1) - (-4))));
        bArr[8] = (byte) (bArr[8] & R_MASK_LOW_2);
        byte b2 = bArr[12];
        bArr[12] = (byte) ((b2 + R_MASK_LOW_2) - (b2 | R_MASK_LOW_2));
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() throws Throwable {
        byte[] bArrGenerateKey = super.generateKey();
        clamp(bArrGenerateKey);
        return bArrGenerateKey;
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(new KeyGenerationParameters(keyGenerationParameters.getRandom(), 256));
    }
}
