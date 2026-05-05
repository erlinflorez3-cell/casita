package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes2.dex */
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
        int i3 = i2 >>> 1;
        int i4 = iArr[1];
        int i5 = i4 << 15;
        int i6 = (i3 + i5) - (i3 & i5);
        int i7 = (i2 >>> 2) | (i4 << 14);
        int i8 = (-1) - (((-1) - (i2 >>> 4)) & ((-1) - (i4 << 12)));
        int i9 = (i2 >>> 10) | (i4 << 6);
        int i10 = i4 >>> 15;
        int i11 = iArr[2];
        int i12 = (-1) - (((-1) - i10) & ((-1) - (i11 << 1)));
        int i13 = iArr[3];
        int i14 = (-1) - (((-1) - (i11 >>> 11)) & ((-1) - (i13 << 5)));
        int i15 = iArr[4];
        int i16 = (-1) - (((-1) - (i13 >>> 8)) & ((-1) - (i15 << 8)));
        int i17 = i13 >>> 15;
        int i18 = i15 << 1;
        int i19 = (i18 + i17) - (i18 & i17);
        int[] iArr2 = this.lfsr;
        int i20 = iArr2[0] >>> 3;
        int i21 = iArr2[1];
        int i22 = (-1) - (((-1) - i20) & ((-1) - (i21 << 13)));
        int i23 = i21 >>> 9;
        int i24 = iArr2[2];
        int i25 = (-1) - (((-1) - i23) & ((-1) - (i24 << 7)));
        int i26 = (-1) - (((-1) - (iArr2[3] << 2)) & ((-1) - (i24 >>> 14)));
        int i27 = iArr2[4];
        int i28 = (-1) - (((-1) - i26) | ((-1) - i27));
        int i29 = ((((i25 ^ i19) ^ ((-1) - (((-1) - i22) | ((-1) - i27)))) ^ i28) ^ ((-1) - (((-1) - i27) | ((-1) - i19)))) ^ (((i22 + i25) - (i22 | i25)) & i26);
        int i30 = i22 & i26;
        int i31 = (i25 + i26) - (i25 | i26);
        return ((((((((((-1) - (((-1) - i19) | ((-1) - i28))) ^ ((((i30 + i19) - (i30 | i19)) ^ (((i27 + i30) - (i27 | i30)) ^ i29)) ^ ((i31 + i19) - (i31 | i19)))) ^ i6) ^ i7) ^ i8) ^ i9) ^ i12) ^ i14) ^ i16) & 65535;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = (i2 >>> 13) | (i3 << 3);
        int i5 = i3 >>> 7;
        int i6 = iArr[2];
        int i7 = i6 << 9;
        int i8 = (i5 + i7) - (i5 & i7);
        int i9 = i6 >>> 6;
        int i10 = iArr[3];
        int i11 = i10 << 10;
        int i12 = (i9 + i11) - (i9 & i11);
        int i13 = iArr[4];
        return (((-1) - (((-1) - (i13 << 2)) & ((-1) - (i10 >>> 14)))) ^ ((((i2 ^ i4) ^ i8) ^ i12) ^ ((-1) - (((-1) - (i10 >>> 3)) & ((-1) - (i13 << 13)))))) & 65535;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i2 = iArr[0];
        int i3 = i2 >>> 9;
        int i4 = iArr[1];
        int i5 = i4 << 7;
        int i6 = (i3 + i5) - (i3 & i5);
        int i7 = i2 >>> 14;
        int i8 = i4 << 2;
        int i9 = (i7 + i8) - (i7 & i8);
        int i10 = i2 >>> 15;
        int i11 = i4 << 1;
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = i4 >>> 5;
        int i14 = iArr[2];
        int i15 = i14 << 11;
        int i16 = (i13 + i15) - (i13 & i15);
        int i17 = (-1) - (((-1) - (i4 >>> 12)) & ((-1) - (i14 << 4)));
        int i18 = iArr[3];
        int i19 = (-1) - (((-1) - (i14 >>> 1)) & ((-1) - (i18 << 15)));
        int i20 = (i14 >>> 5) | (i18 << 11);
        int i21 = i14 >>> 13;
        int i22 = i18 << 3;
        int i23 = (i21 + i22) - (i21 & i22);
        int i24 = iArr[4];
        int i25 = (-1) - (((-1) - (i18 >>> 4)) & ((-1) - (i24 << 12)));
        int i26 = (i18 >>> 12) | (i24 << 4);
        int i27 = i18 >>> 14;
        int i28 = i24 << 2;
        int i29 = (i24 << 1) | (i18 >>> 15);
        int i30 = i2 ^ (((((((((((i27 + i28) - (i27 & i28)) ^ i26) ^ i25) ^ i23) ^ i20) ^ i19) ^ i17) ^ i16) ^ i9) ^ i6);
        int i31 = (i29 + i26) - (i29 | i26);
        int i32 = (-1) - (((-1) - i26) | ((-1) - i25));
        int i33 = (-1) - (((-1) - (i19 & i17)) | ((-1) - i16));
        int i34 = (-1) - (((-1) - (((-1) - (((-1) - i29) | ((-1) - i23))) & i17)) | ((-1) - i6));
        int i35 = (-1) - (((-1) - ((-1) - (((-1) - i31) | ((-1) - i25)))) | ((-1) - i23));
        int i36 = ((((i34 ^ (((((i30 ^ i31) ^ ((-1) - (((-1) - i20) | ((-1) - i19)))) ^ ((i12 + i6) - (i12 | i6))) ^ (i32 & i23)) ^ i33)) ^ ((-1) - (((-1) - ((i32 + i20) - (i32 | i20))) | ((-1) - i19)))) ^ ((i31 & i16) & i12)) ^ ((i35 + i20) - (i35 | i20))) ^ (((i33 + i12) - (i33 | i12)) & i6);
        int i37 = i25 & i23;
        int i38 = ((i37 + i20) - (i37 | i20)) & i19;
        return (-1) - (((-1) - (i36 ^ (((i38 + i17) - (i38 | i17)) & i16))) | ((-1) - 65535));
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
            iArr[i2] = (((-1) - (((-1) - bArr3[i3]) | ((-1) - 255))) | (bArr3[i4] << 8)) & 65535;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            int i5 = bArr4[i4] << 8;
            byte b2 = bArr4[i3];
            iArr2[i2] = (-1) - (((-1) - (((b2 + 255) - (b2 | 255)) | i5)) | ((-1) - 65535));
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

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.spongycastle.crypto.StreamCipher
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
        this.index = 2;
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
