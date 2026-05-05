package org.spongycastle.crypto.engines;

import com.google.common.base.Ascii;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes2.dex */
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
        int i3 = iArr[1];
        int i4 = (i2 >>> 2) | (i3 << 30);
        int i5 = (-1) - (((-1) - (i2 >>> 12)) & ((-1) - (i3 << 20)));
        int i6 = (i2 >>> 15) | (i3 << 17);
        int i7 = iArr[2];
        int i8 = (i3 >>> 4) | (i7 << 28);
        int i9 = i3 >>> 13;
        int i10 = i7 << 19;
        int i11 = (i9 + i10) - (i9 & i10);
        int i12 = i7 >>> 9;
        int i13 = iArr[3];
        int i14 = i13 << 23;
        int i15 = (i12 + i14) - (i12 & i14);
        int i16 = (-1) - (((-1) - (i7 >>> 25)) & ((-1) - (i13 << 7)));
        int i17 = (-1) - (((-1) - (i13 << 1)) & ((-1) - (i7 >>> 31)));
        int[] iArr2 = this.lfsr;
        int i18 = iArr2[0];
        int i19 = iArr2[1];
        int i20 = (i18 >>> 8) | (i19 << 24);
        int i21 = i18 >>> 13;
        int i22 = i19 << 19;
        int i23 = (i21 + i22) - (i21 & i22);
        int i24 = i18 >>> 20;
        int i25 = i19 << 12;
        int i26 = (i24 + i25) - (i24 & i25);
        int i27 = i19 >>> 10;
        int i28 = iArr2[2];
        int i29 = i28 << 22;
        int i30 = (i27 + i29) - (i27 & i29);
        int i31 = i19 >>> 28;
        int i32 = i28 << 4;
        int i33 = (i31 + i32) - (i31 & i32);
        int i34 = iArr2[3];
        int i35 = (-1) - (((-1) - (i28 >>> 15)) & ((-1) - (i34 << 17)));
        int i36 = i28 >>> 31;
        int i37 = i34 << 1;
        return ((((((((((-1) - (((-1) - ((-1) - (((-1) - i17) | ((-1) - i5)))) | ((-1) - ((i37 + i36) - (i37 & i36))))) ^ (((((-1) - (((-1) - i23) | ((-1) - i26))) ^ ((-1) - (((-1) - i5) | ((-1) - i20)))) ^ ((i17 + i30) - (i17 | i30))) ^ (i33 & i35))) ^ ((-1) - (((-1) - (i28 >>> 29)) & ((-1) - (i34 << 3))))) ^ i4) ^ i6) ^ i8) ^ i11) ^ i7) ^ i15) ^ i16;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i2 = iArr[0];
        int i3 = i2 >>> 7;
        int i4 = iArr[1];
        int i5 = i4 << 25;
        int i6 = (i3 + i5) - (i3 & i5);
        int i7 = iArr[2];
        int i8 = (i4 >>> 6) | (i7 << 26);
        int i9 = iArr[3];
        int i10 = (-1) - (((-1) - (i7 >>> 6)) & ((-1) - (i9 << 26)));
        int i11 = i7 >>> 17;
        int i12 = i9 << 15;
        return i9 ^ ((((i2 ^ i6) ^ i8) ^ i10) ^ ((i11 + i12) - (i11 & i12)));
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i2 = iArr[0];
        int i3 = i2 >>> 3;
        int i4 = iArr[1];
        int i5 = i4 << 29;
        int i6 = (i3 + i5) - (i3 & i5);
        int i7 = i2 >>> 11;
        int i8 = i4 << 21;
        int i9 = (i7 + i8) - (i7 & i8);
        int i10 = (-1) - (((-1) - (i2 >>> 13)) & ((-1) - (i4 << 19)));
        int i11 = (i2 >>> 17) | (i4 << 15);
        int i12 = i2 >>> 18;
        int i13 = i4 << 14;
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = i2 >>> 26;
        int i16 = i4 << 6;
        int i17 = (i15 + i16) - (i15 & i16);
        int i18 = i2 >>> 27;
        int i19 = i4 << 5;
        int i20 = (i18 + i19) - (i18 & i19);
        int i21 = i4 >>> 8;
        int i22 = iArr[2];
        int i23 = i22 << 24;
        int i24 = (i21 + i23) - (i21 & i23);
        int i25 = (-1) - (((-1) - (i4 >>> 16)) & ((-1) - (i22 << 16)));
        int i26 = (-1) - (((-1) - (i4 >>> 24)) & ((-1) - (i22 << 8)));
        int i27 = (i4 >>> 27) | (i22 << 5);
        int i28 = (i4 >>> 29) | (i22 << 3);
        int i29 = iArr[3];
        int i30 = i22 >>> 3;
        int i31 = i29 << 29;
        int i32 = (i30 + i31) - (i30 & i31);
        int i33 = i22 >>> 27;
        int i34 = i29 << 5;
        return (((((((i29 ^ (((i2 ^ i17) ^ i26) ^ ((i33 + i34) - (i33 & i34)))) ^ ((i6 + i32) - (i6 | i32))) ^ ((i9 + i10) - (i9 | i10))) ^ (i11 & i14)) ^ ((i20 + i27) - (i20 | i27))) ^ (i24 & i25)) ^ ((-1) - (((-1) - i28) | ((-1) - ((-1) - (((-1) - (i22 >>> 1)) & ((-1) - (i29 << 31)))))))) ^ ((-1) - (((-1) - ((i22 >>> 4) | (i29 << 28))) | ((-1) - ((i22 >>> 20) | (i29 << 12)))));
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
            int i8 = (i7 + 16711680) - (i7 | 16711680);
            int i9 = (i5 + i8) - (i5 & i8);
            int i10 = i3 + 1;
            int i11 = (-1) - (((-1) - (bArr3[i10] << 8)) | ((-1) - 65280));
            iArr[i2] = ((-1) - (((-1) - bArr3[i3]) | ((-1) - 255))) | ((i9 + i11) - (i9 & i11));
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            int i12 = bArr4[i4] << Ascii.CAN;
            int i13 = (bArr4[i6] << 16) & 16711680;
            int i14 = ((i12 + i13) - (i12 & i13)) | ((-1) - (((-1) - (bArr4[i10] << 8)) | ((-1) - 65280)));
            int i15 = (-1) - (((-1) - bArr4[i3]) | ((-1) - 255));
            iArr2[i2] = (i15 + i14) - (i15 & i14);
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

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.spongycastle.crypto.StreamCipher
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

    @Override // org.spongycastle.crypto.StreamCipher
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

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 4;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        if (this.initialised) {
            return (byte) (b2 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}
