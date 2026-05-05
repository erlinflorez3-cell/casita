package org.spongycastle.jce.provider;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes2.dex */
class OldPKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f28015v;

    public OldPKCS12ParametersGenerator(Digest digest) {
        this.digest = digest;
        if (digest instanceof MD5Digest) {
            this.f28014u = 16;
            this.f28015v = 64;
        } else if (digest instanceof SHA1Digest) {
            this.f28014u = 20;
            this.f28015v = 64;
        } else {
            if (!(digest instanceof RIPEMD160Digest)) {
                throw new IllegalArgumentException("Digest " + digest.getAlgorithmName() + " unsupported");
            }
            this.f28014u = 20;
            this.f28015v = 64;
        }
    }

    private void adjust(byte[] bArr, int i2, byte[] bArr2) {
        int i3 = (bArr2[bArr2.length - 1] & 255) + ((-1) - (((-1) - bArr[(bArr2.length + i2) - 1]) | ((-1) - 255))) + 1;
        bArr[(bArr2.length + i2) - 1] = (byte) i3;
        int i4 = i3 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            byte b2 = bArr2[length];
            int i5 = i2 + length;
            byte b3 = bArr[i5];
            int i6 = i4 + ((b2 + 255) - (b2 | 255)) + ((b3 + 255) - (b3 | 255));
            bArr[i5] = (byte) i6;
            i4 = i6 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i2, int i3) {
        byte[] bArr;
        byte[] bArr2;
        int i4 = this.f28015v;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[i3];
        int i5 = 0;
        for (int i6 = 0; i6 != i4; i6++) {
            bArr3[i6] = (byte) i2;
        }
        int i7 = 1;
        if (this.salt == null || this.salt.length == 0) {
            bArr = new byte[0];
        } else {
            int i8 = this.f28015v;
            int length = this.salt.length;
            int i9 = this.f28015v;
            int i10 = i8 * (((length + i9) - 1) / i9);
            bArr = new byte[i10];
            for (int i11 = 0; i11 != i10; i11++) {
                bArr[i11] = this.salt[i11 % this.salt.length];
            }
        }
        if (this.password == null || this.password.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i12 = this.f28015v;
            int length2 = this.password.length;
            int i13 = this.f28015v;
            int i14 = i12 * (((length2 + i13) - 1) / i13);
            bArr2 = new byte[i14];
            for (int i15 = 0; i15 != i14; i15++) {
                bArr2[i15] = this.password[i15 % this.password.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr5 = new byte[length3];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        int i16 = this.f28015v;
        byte[] bArr6 = new byte[i16];
        int i17 = this.f28014u;
        int i18 = ((i3 + i17) - 1) / i17;
        int i19 = 1;
        while (i19 <= i18) {
            int i20 = this.f28014u;
            byte[] bArr7 = new byte[i20];
            this.digest.update(bArr3, i5, i4);
            this.digest.update(bArr5, i5, length3);
            this.digest.doFinal(bArr7, i5);
            while (i7 != this.iterationCount) {
                this.digest.update(bArr7, i5, i20);
                this.digest.doFinal(bArr7, i5);
                i7++;
            }
            for (int i21 = i5; i21 != i16; i21++) {
                bArr6[i19] = bArr7[i21 % i20];
            }
            while (true) {
                int i22 = this.f28015v;
                if (i5 == length3 / i22) {
                    break;
                }
                adjust(bArr5, i22 * i5, bArr6);
                i5++;
            }
            if (i19 == i18) {
                int i23 = i19 - 1;
                int i24 = this.f28014u;
                int i25 = i23 * i24;
                int i26 = i3 - (i23 * i24);
                i5 = 0;
                System.arraycopy(bArr7, 0, bArr4, i25, i26);
            } else {
                i5 = 0;
                System.arraycopy(bArr7, 0, bArr4, (i19 - 1) * this.f28014u, i20);
            }
            i19++;
            i7 = 1;
        }
        return bArr4;
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i2) {
        int i3 = i2 / 8;
        return new KeyParameter(generateDerivedKey(3, i3), 0, i3);
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i2) {
        int i3 = i2 / 8;
        return new KeyParameter(generateDerivedKey(1, i3), 0, i3);
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i2, int i3) {
        int i4 = i2 / 8;
        int i5 = i3 / 8;
        byte[] bArrGenerateDerivedKey = generateDerivedKey(1, i4);
        return new ParametersWithIV(new KeyParameter(bArrGenerateDerivedKey, 0, i4), generateDerivedKey(2, i5), 0, i5);
    }
}
