package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes6.dex */
public class Grain128Engine implements StreamCipher {
    private static final int STATE_SIZE = 4;
    private int index = 4;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 3) {
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
        int i3 = i2 >>> 2;
        int i4 = iArr[1];
        int i5 = i4 << 30;
        int i6 = (i3 + i5) - (i3 & i5);
        int i7 = i2 >>> 12;
        int i8 = i4 << 20;
        int i9 = (i7 + i8) - (i7 & i8);
        int i10 = (i2 >>> 15) | (i4 << 17);
        int i11 = i4 >>> 4;
        int i12 = iArr[2];
        int i13 = i12 << 28;
        int i14 = (i11 + i13) - (i11 & i13);
        int i15 = (i4 >>> 13) | (i12 << 19);
        int i16 = i12 >>> 9;
        int i17 = iArr[3];
        int i18 = i17 << 23;
        int i19 = (i16 + i18) - (i16 & i18);
        int i20 = i12 >>> 25;
        int i21 = i17 << 7;
        int i22 = (i20 + i21) - (i20 & i21);
        int i23 = i12 >>> 31;
        int i24 = i17 << 1;
        int i25 = (i24 + i23) - (i24 & i23);
        int[] iArr2 = this.lfsr;
        int i26 = iArr2[0];
        int i27 = iArr2[1];
        int i28 = (i26 >>> 8) | (i27 << 24);
        int i29 = (-1) - (((-1) - (i26 >>> 13)) & ((-1) - (i27 << 19)));
        int i30 = (i26 >>> 20) | (i27 << 12);
        int i31 = iArr2[2];
        int i32 = (-1) - (((-1) - (i27 >>> 10)) & ((-1) - (i31 << 22)));
        int i33 = i27 >>> 28;
        int i34 = i31 << 4;
        int i35 = (i33 + i34) - (i33 & i34);
        int i36 = iArr2[3];
        int i37 = (i31 >>> 15) | (i36 << 17);
        int i38 = i31 >>> 29;
        int i39 = i36 << 3;
        return ((((((((((i25 & i9) & ((i36 << 1) | (i31 >>> 31))) ^ (((((-1) - (((-1) - i29) | ((-1) - i30))) ^ ((i9 + i28) - (i9 | i28))) ^ (i25 & i32)) ^ (i35 & i37))) ^ ((i38 + i39) - (i38 & i39))) ^ i6) ^ i10) ^ i14) ^ i15) ^ i12) ^ i19) ^ i22;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i2 = iArr[0];
        int i3 = i2 >>> 7;
        int i4 = iArr[1];
        int i5 = i4 << 25;
        int i6 = (i3 + i5) - (i3 & i5);
        int i7 = iArr[2];
        int i8 = (-1) - (((-1) - (i4 >>> 6)) & ((-1) - (i7 << 26)));
        int i9 = iArr[3];
        int i10 = (i7 >>> 6) | (i9 << 26);
        int i11 = i7 >>> 17;
        int i12 = i9 << 15;
        return i9 ^ ((((i2 ^ i6) ^ i8) ^ i10) ^ ((i11 + i12) - (i11 & i12)));
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = (i2 >>> 3) | (i3 << 29);
        int i5 = (-1) - (((-1) - (i2 >>> 11)) & ((-1) - (i3 << 21)));
        int i6 = i2 >>> 13;
        int i7 = i3 << 19;
        int i8 = (i6 + i7) - (i6 & i7);
        int i9 = i2 >>> 17;
        int i10 = i3 << 15;
        int i11 = (i9 + i10) - (i9 & i10);
        int i12 = (-1) - (((-1) - (i2 >>> 18)) & ((-1) - (i3 << 14)));
        int i13 = i2 >>> 26;
        int i14 = i3 << 6;
        int i15 = (i13 + i14) - (i13 & i14);
        int i16 = (-1) - (((-1) - (i2 >>> 27)) & ((-1) - (i3 << 5)));
        int i17 = iArr[2];
        int i18 = (-1) - (((-1) - (i3 >>> 8)) & ((-1) - (i17 << 24)));
        int i19 = i3 >>> 16;
        int i20 = i17 << 16;
        int i21 = (i19 + i20) - (i19 & i20);
        int i22 = (-1) - (((-1) - (i3 >>> 24)) & ((-1) - (i17 << 8)));
        int i23 = (i3 >>> 27) | (i17 << 5);
        int i24 = (-1) - (((-1) - (i3 >>> 29)) & ((-1) - (i17 << 3)));
        int i25 = iArr[3];
        int i26 = i17 >>> 3;
        int i27 = i25 << 29;
        int i28 = (i26 + i27) - (i26 & i27);
        int i29 = i17 >>> 20;
        int i30 = i25 << 12;
        return (((((((i25 ^ (((i2 ^ i15) ^ i22) ^ ((i17 >>> 27) | (i25 << 5)))) ^ ((-1) - (((-1) - i4) | ((-1) - i28)))) ^ ((i5 + i8) - (i5 | i8))) ^ ((i11 + i12) - (i11 | i12))) ^ ((i16 + i23) - (i16 | i23))) ^ (i18 & i21)) ^ (i24 & ((i17 >>> 1) | (i25 << 31)))) ^ (((i17 >>> 4) | (i25 << 28)) & ((i29 + i30) - (i29 & i30)));
    }

    private void initGrain() {
        for (int i2 = 0; i2 < 8; i2++) {
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
        bArr[2] = (byte) (output >> 16);
        bArr[3] = (byte) (output >> 24);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
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
            int i4 = i3 + 3;
            int i5 = bArr3[i4] << Ascii.CAN;
            int i6 = i3 + 2;
            int i7 = bArr3[i6] << 16;
            int i8 = i3 + 1;
            iArr[i2] = ((-1) - (((-1) - bArr3[i3]) | ((-1) - 255))) | i5 | ((i7 + 16711680) - (i7 | 16711680)) | ((-1) - (((-1) - (bArr3[i8] << 8)) | ((-1) - 65280)));
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            int i9 = (-1) - (((-1) - ((-1) - (((-1) - (bArr4[i4] << Ascii.CAN)) & ((-1) - ((bArr4[i6] << 16) & 16711680))))) & ((-1) - ((bArr4[i8] << 8) & 65280)));
            byte b2 = bArr4[i3];
            iArr2[i2] = (-1) - (((-1) - ((b2 + 255) - (b2 | 255))) & ((-1) - i9));
            i3 += 4;
            i2++;
        }
    }

    private int[] shift(int[] iArr, int i2) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i2;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.workingIV = new byte[keyParameter.getKey().length];
        this.workingKey = new byte[keyParameter.getKey().length];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.out = new byte[4];
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
        this.index = 4;
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
