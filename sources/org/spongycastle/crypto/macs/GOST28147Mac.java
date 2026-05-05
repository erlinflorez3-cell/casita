package org.spongycastle.crypto.macs;

import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithSBox;

/* JADX INFO: loaded from: classes2.dex */
public class GOST28147Mac implements Mac {
    private int blockSize = 8;
    private int macSize = 4;
    private boolean firstStep = true;
    private int[] workingKey = null;
    private byte[] S = {9, 6, 3, 2, 8, Ascii.VT, 1, 7, 10, 4, Ascii.SO, Ascii.SI, Ascii.FF, 0, Ascii.CR, 5, 3, 7, Ascii.SO, 9, 8, 10, Ascii.SI, 0, 5, 2, 6, Ascii.FF, Ascii.VT, 4, Ascii.CR, 1, Ascii.SO, 4, 6, 2, Ascii.VT, 3, Ascii.CR, 8, Ascii.FF, Ascii.SI, 5, 10, 0, 7, 1, 9, Ascii.SO, 7, 10, Ascii.FF, Ascii.CR, 1, 3, 9, 0, 2, Ascii.VT, 4, Ascii.SI, 8, 5, 6, Ascii.VT, 5, 1, 9, 8, Ascii.CR, Ascii.SI, 0, Ascii.SO, 4, 2, 3, Ascii.FF, 7, 10, 6, 3, 10, Ascii.CR, Ascii.FF, 1, 2, 0, Ascii.VT, 7, 5, 9, 4, 8, Ascii.SI, Ascii.SO, 6, 1, Ascii.CR, 2, 9, 7, 10, 6, 0, 8, Ascii.FF, 4, 5, Ascii.SI, 3, Ascii.VT, Ascii.SO, Ascii.VT, 10, Ascii.SI, 5, 0, Ascii.FF, Ascii.SO, 8, 6, 2, 3, 9, 1, 7, Ascii.CR, 4};
    private byte[] mac = new byte[8];
    private byte[] buf = new byte[8];
    private int bufOff = 0;

    private byte[] CM5func(byte[] bArr, int i2, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i2];
        System.arraycopy(bArr, i2, bArr3, 0, bArr2.length);
        for (int i3 = 0; i3 != bArr2.length; i3++) {
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr2[i3]);
        }
        return bArr3;
    }

    private int bytesToint(byte[] bArr, int i2) {
        int i3 = (bArr[i2 + 3] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK;
        int i4 = bArr[i2 + 2] << 16;
        return i3 + ((i4 + 16711680) - (i4 | 16711680)) + ((-1) - (((-1) - (bArr[i2 + 1] << 8)) | ((-1) - 65280))) + ((-1) - (((-1) - bArr[i2]) | ((-1) - 255)));
    }

    private int[] generateWorkingKey(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i2 = 0; i2 != 8; i2++) {
            iArr[i2] = bytesToint(bArr, i2 * 4);
        }
        return iArr;
    }

    private void gost28147MacFunc(int[] iArr, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int iBytesToint = bytesToint(bArr, i2);
        int iBytesToint2 = bytesToint(bArr, i2 + 4);
        for (int i4 = 0; i4 < 2; i4++) {
            int i5 = 0;
            while (i5 < 8) {
                int iGost28147_mainStep = iBytesToint2 ^ gost28147_mainStep(iBytesToint, iArr[i5]);
                i5++;
                int i6 = iBytesToint;
                iBytesToint = iGost28147_mainStep;
                iBytesToint2 = i6;
            }
        }
        intTobytes(iBytesToint, bArr2, i3);
        intTobytes(iBytesToint2, bArr2, i3 + 4);
    }

    private int gost28147_mainStep(int i2, int i3) {
        int i4 = i3 + i2;
        byte[] bArr = this.S;
        int i5 = i4 >> 16;
        int i6 = bArr[15 & i4] + (bArr[((i4 >> 4) & 15) + 16] << 4) + (bArr[((i4 >> 8) & 15) + 32] << 8) + (bArr[((i4 >> 12) & 15) + 48] << Ascii.FF) + (bArr[((i5 + 15) - (i5 | 15)) + 64] << 16) + (bArr[((i4 >> 20) & 15) + 80] << Ascii.DC4);
        int i7 = i4 >> 24;
        int i8 = i6 + (bArr[((i7 + 15) - (i7 | 15)) + 96] << Ascii.CAN) + (bArr[((-1) - (((-1) - (i4 >> 28)) | ((-1) - 15))) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION] << Ascii.FS);
        int i9 = i8 << 11;
        int i10 = i8 >>> 21;
        return (i9 + i10) - (i9 & i10);
    }

    private void intTobytes(int i2, byte[] bArr, int i3) {
        bArr[i3 + 3] = (byte) (i2 >>> 24);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3] = (byte) i2;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, DataLengthException {
        while (true) {
            int i3 = this.bufOff;
            if (i3 >= this.blockSize) {
                break;
            }
            this.buf[i3] = 0;
            this.bufOff = i3 + 1;
        }
        byte[] bArr2 = this.buf;
        byte[] bArrCM5func = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArrCM5func, 0, this.mac.length);
        if (this.firstStep) {
            this.firstStep = false;
        } else {
            bArrCM5func = CM5func(this.buf, 0, this.mac);
        }
        gost28147MacFunc(this.workingKey, bArrCM5func, 0, this.mac, 0);
        byte[] bArr3 = this.mac;
        int length = bArr3.length / 2;
        int i4 = this.macSize;
        System.arraycopy(bArr3, length - i4, bArr, i2, i4);
        reset();
        return this.macSize;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        reset();
        this.buf = new byte[this.blockSize];
        if (!(cipherParameters instanceof ParametersWithSBox)) {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + cipherParameters.getClass().getName());
            }
            this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
        } else {
            ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
            System.arraycopy(parametersWithSBox.getSBox(), 0, this.S, 0, parametersWithSBox.getSBox().length);
            if (parametersWithSBox.getParameters() != null) {
                this.workingKey = generateWorkingKey(((KeyParameter) parametersWithSBox.getParameters()).getKey());
            }
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i2 >= bArr.length) {
                this.bufOff = 0;
                this.firstStep = true;
                return;
            } else {
                bArr[i2] = 0;
                i2++;
            }
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        int i2 = this.bufOff;
        byte[] bArr = this.buf;
        if (i2 == bArr.length) {
            byte[] bArrCM5func = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArrCM5func, 0, this.mac.length);
            if (this.firstStep) {
                this.firstStep = false;
            } else {
                bArrCM5func = CM5func(this.buf, 0, this.mac);
            }
            gost28147MacFunc(this.workingKey, bArrCM5func, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i3 = this.bufOff;
        this.bufOff = i3 + 1;
        bArr2[i3] = b2;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i2, int i3) throws IllegalStateException, DataLengthException {
        if (i3 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i4 = this.blockSize;
        int i5 = this.bufOff;
        int i6 = i4 - i5;
        if (i3 > i6) {
            System.arraycopy(bArr, i2, this.buf, i5, i6);
            byte[] bArr2 = this.buf;
            byte[] bArrCM5func = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArrCM5func, 0, this.mac.length);
            if (this.firstStep) {
                this.firstStep = false;
            } else {
                bArrCM5func = CM5func(this.buf, 0, this.mac);
            }
            gost28147MacFunc(this.workingKey, bArrCM5func, 0, this.mac, 0);
            this.bufOff = 0;
            while (true) {
                i3 -= i6;
                i2 += i6;
                if (i3 <= this.blockSize) {
                    break;
                }
                gost28147MacFunc(this.workingKey, CM5func(bArr, i2, this.mac), 0, this.mac, 0);
                i6 = this.blockSize;
            }
        }
        System.arraycopy(bArr, i2, this.buf, this.bufOff, i3);
        this.bufOff += i3;
    }
}
