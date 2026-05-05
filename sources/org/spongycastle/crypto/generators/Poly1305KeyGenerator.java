package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class Poly1305KeyGenerator extends CipherKeyGenerator {
    private static final byte R_MASK_HIGH_4 = 15;
    private static final byte R_MASK_LOW_2 = -4;

    public static void checkKey(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        checkMask(bArr[19], (byte) 15);
        checkMask(bArr[23], (byte) 15);
        checkMask(bArr[27], (byte) 15);
        checkMask(bArr[31], (byte) 15);
        checkMask(bArr[20], R_MASK_LOW_2);
        checkMask(bArr[24], R_MASK_LOW_2);
        checkMask(bArr[28], R_MASK_LOW_2);
    }

    private static void checkMask(byte b2, byte b3) {
        int i2 = ~b3;
        if ((b2 + i2) - (b2 | i2) != 0) {
            throw new IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
    }

    public static void clamp(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        bArr[19] = (byte) ((-1) - (((-1) - bArr[19]) | ((-1) - 15)));
        byte b2 = bArr[23];
        bArr[23] = (byte) ((b2 + 15) - (b2 | 15));
        bArr[27] = (byte) (bArr[27] & 15);
        bArr[31] = (byte) ((-1) - (((-1) - bArr[31]) | ((-1) - 15)));
        bArr[20] = (byte) ((-1) - (((-1) - bArr[20]) | ((-1) - (-4))));
        byte b3 = bArr[24];
        bArr[24] = (byte) ((b3 + R_MASK_LOW_2) - (b3 | R_MASK_LOW_2));
        bArr[28] = (byte) ((-1) - (((-1) - bArr[28]) | ((-1) - (-4))));
    }

    @Override // org.spongycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() throws Throwable {
        byte[] bArrGenerateKey = super.generateKey();
        clamp(bArrGenerateKey);
        return bArrGenerateKey;
    }

    @Override // org.spongycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(new KeyGenerationParameters(keyGenerationParameters.getRandom(), 256));
    }
}
