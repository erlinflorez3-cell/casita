package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes6.dex */
public class Grainv1Engine implements StreamCipher {
    private static final int STATE_SIZE = 5;
    private int index = 2;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 1) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i2 = this.index;
        this.index = i2 + 1;
        return bArr[i2];
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = (-1) - (((-1) - (i2 >>> 1)) & ((-1) - (i3 << 15)));
        int i5 = (i2 >>> 2) | (i3 << 14);
        int i6 = (-1) - (((-1) - (i2 >>> 4)) & ((-1) - (i3 << 12)));
        int i7 = (-1) - (((-1) - (i2 >>> 10)) & ((-1) - (i3 << 6)));
        int i8 = i3 >>> 15;
        int i9 = iArr[2];
        int i10 = i9 << 1;
        int i11 = (i8 + i10) - (i8 & i10);
        int i12 = iArr[3];
        int i13 = (-1) - (((-1) - (i9 >>> 11)) & ((-1) - (i12 << 5)));
        int i14 = iArr[4];
        int i15 = (i12 >>> 8) | (i14 << 8);
        int i16 = (i14 << 1) | (i12 >>> 15);
        int[] iArr2 = this.lfsr;
        int i17 = iArr2[0] >>> 3;
        int i18 = iArr2[1];
        int i19 = i17 | (i18 << 13);
        int i20 = iArr2[2];
        int i21 = (-1) - (((-1) - (i18 >>> 9)) & ((-1) - (i20 << 7)));
        int i22 = i20 >>> 14;
        int i23 = iArr2[3] << 2;
        int i24 = (i23 + i22) - (i23 & i22);
        int i25 = iArr2[4];
        int i26 = (-1) - (((-1) - i24) | ((-1) - i25));
        int i27 = (-1) - (((-1) - i19) | ((-1) - i24));
        int i28 = (((((((((i16 + i26) - (i16 | i26)) ^ ((((-1) - (((-1) - i27) | ((-1) - i16))) ^ ((i25 & i27) ^ (((((i21 ^ i16) ^ (i19 & i25)) ^ i26) ^ (i25 & i16)) ^ ((-1) - (((-1) - ((-1) - (((-1) - i19) | ((-1) - i21)))) | ((-1) - i24)))))) ^ ((i21 & i24) & i16))) ^ i4) ^ i5) ^ i6) ^ i7) ^ i11) ^ i13) ^ i15;
        return (i28 + 65535) - (i28 | 65535);
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = (-1) - (((-1) - (i2 >>> 13)) & ((-1) - (i3 << 3)));
        int i5 = iArr[2];
        int i6 = (i3 >>> 7) | (i5 << 9);
        int i7 = i5 >>> 6;
        int i8 = iArr[3];
        int i9 = i8 << 10;
        int i10 = (i7 + i9) - (i7 & i9);
        int i11 = iArr[4];
        int i12 = (i8 >>> 3) | (i11 << 13);
        int i13 = i8 >>> 14;
        int i14 = i11 << 2;
        return (-1) - (((-1) - (((i14 + i13) - (i14 & i13)) ^ ((((i2 ^ i4) ^ i6) ^ i10) ^ i12))) | ((-1) - 65535));
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = (i2 >>> 9) | (i3 << 7);
        int i5 = (-1) - (((-1) - (i2 >>> 14)) & ((-1) - (i3 << 2)));
        int i6 = (i2 >>> 15) | (i3 << 1);
        int i7 = iArr[2];
        int i8 = (i3 >>> 5) | (i7 << 11);
        int i9 = (-1) - (((-1) - (i3 >>> 12)) & ((-1) - (i7 << 4)));
        int i10 = i7 >>> 1;
        int i11 = iArr[3];
        int i12 = i11 << 15;
        int i13 = (i10 + i12) - (i10 & i12);
        int i14 = (i7 >>> 5) | (i11 << 11);
        int i15 = (-1) - (((-1) - (i7 >>> 13)) & ((-1) - (i11 << 3)));
        int i16 = i11 >>> 4;
        int i17 = iArr[4];
        int i18 = i17 << 12;
        int i19 = (i16 + i18) - (i16 & i18);
        int i20 = i11 >>> 12;
        int i21 = i17 << 4;
        int i22 = (i20 + i21) - (i20 & i21);
        int i23 = i11 >>> 14;
        int i24 = i17 << 2;
        int i25 = (-1) - (((-1) - (i17 << 1)) & ((-1) - (i11 >>> 15)));
        int i26 = (-1) - (((-1) - i25) | ((-1) - i22));
        int i27 = (((i2 ^ (((((((((((i23 + i24) - (i23 & i24)) ^ i22) ^ i19) ^ i15) ^ i14) ^ i13) ^ i9) ^ i8) ^ i5) ^ i4)) ^ i26) ^ ((i14 + i13) - (i14 | i13))) ^ (i6 & i4);
        int i28 = (i22 + i19) - (i22 | i19);
        int i29 = i13 & i9 & i8;
        int i30 = ((i25 + i15) - (i25 | i15)) & i9;
        int i31 = (((i30 + i4) - (i30 | i4)) ^ ((i27 ^ (i28 & i15)) ^ i29)) ^ (((i28 + i14) - (i28 | i14)) & i13);
        int i32 = i26 & i8;
        int i33 = i31 ^ ((i32 + i6) - (i32 | i6));
        int i34 = (-1) - (((-1) - ((i26 + i19) - (i26 | i19))) | ((-1) - i15));
        int i35 = (i33 ^ ((i34 + i14) - (i34 | i14))) ^ (((i29 + i6) - (i29 | i6)) & i4);
        int i36 = (i19 + i15) - (i19 | i15);
        int i37 = (i36 + i14) - (i36 | i14);
        int i38 = i35 ^ ((-1) - (((-1) - ((-1) - (((-1) - ((i37 + i13) - (i37 | i13))) | ((-1) - i9)))) | ((-1) - i8)));
        return (i38 + 65535) - (i38 | 65535);
    }

    private void initGrain() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i2 >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i4 = i3 + 1;
            int i5 = bArr3[i4] << 8;
            byte b2 = bArr3[i3];
            int i6 = (b2 + 255) - (b2 | 255);
            iArr[i2] = ((i6 + i5) - (i6 & i5)) & 65535;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            int i7 = bArr4[i4] << 8;
            byte b3 = bArr4[i3];
            iArr2[i2] = (-1) - (((-1) - (((b3 + 255) - (b3 | 255)) | i7)) | ((-1) - 65535));
            i3 += 2;
            i2++;
        }
    }

    private int[] shift(int[] iArr, int i2) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i2;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.workingIV = new byte[keyParameter.getKey().length];
        this.workingKey = new byte[keyParameter.getKey().length];
        this.lfsr = new int[5];
        this.nfsr = new int[5];
        this.out = new byte[2];
        System.arraycopy(iv, 0, this.workingIV, 0, iv.length);
        System.arraycopy(keyParameter.getKey(), 0, this.workingKey, 0, keyParameter.getKey().length);
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i2 + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i4 + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4 + i5] = (byte) (bArr[i2 + i5] ^ getKeyStream());
        }
        return i3;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 2;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        if (this.initialised) {
            return (byte) (b2 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}
