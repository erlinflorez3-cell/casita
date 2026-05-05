package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SerpentEngineBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;
    protected int X0;
    protected int X1;
    protected int X2;
    protected int X3;
    protected boolean encrypting;
    protected int[] wKey;

    SerpentEngineBase() {
    }

    protected static int rotateLeft(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    protected static int rotateRight(int i2, int i3) {
        int i4 = i2 >>> i3;
        int i5 = i2 << (-i3);
        return (i5 + i4) - (i5 & i4);
    }

    protected final void LT() {
        int iRotateLeft = rotateLeft(this.X0, 13);
        int iRotateLeft2 = rotateLeft(this.X2, 3);
        int i2 = (this.X1 ^ iRotateLeft) ^ iRotateLeft2;
        int i3 = (this.X3 ^ iRotateLeft2) ^ (iRotateLeft << 3);
        this.X1 = rotateLeft(i2, 1);
        int iRotateLeft3 = rotateLeft(i3, 7);
        this.X3 = iRotateLeft3;
        this.X0 = rotateLeft((iRotateLeft ^ this.X1) ^ iRotateLeft3, 5);
        this.X2 = rotateLeft((this.X3 ^ iRotateLeft2) ^ (this.X1 << 7), 22);
    }

    protected abstract void decryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3);

    protected abstract void encryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3);

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    protected final void ib0(int i2, int i3, int i4, int i5) {
        int i6 = ~i2;
        int i7 = i3 ^ i2;
        int i8 = ((-1) - (((-1) - i6) & ((-1) - i7))) ^ i5;
        int i9 = i4 ^ i8;
        int i10 = i7 ^ i9;
        this.X2 = i10;
        int i11 = (i7 & i5) ^ i6;
        int i12 = (i10 & i11) ^ i8;
        this.X1 = i12;
        int i13 = ((-1) - (((-1) - i2) | ((-1) - i8))) ^ ((-1) - (((-1) - i12) & ((-1) - i9)));
        this.X3 = i13;
        this.X0 = i13 ^ (i11 ^ i9);
    }

    protected final void ib1(int i2, int i3, int i4, int i5) {
        int i6 = i5 ^ i3;
        int i7 = i2 ^ (i3 & i6);
        int i8 = i6 ^ i7;
        int i9 = i4 ^ i8;
        this.X3 = i9;
        int i10 = i3 ^ ((-1) - (((-1) - i6) | ((-1) - i7)));
        int i11 = i7 ^ ((-1) - (((-1) - i9) & ((-1) - i10)));
        this.X1 = i11;
        int i12 = ~i11;
        int i13 = i10 ^ i9;
        this.X0 = i12 ^ i13;
        this.X2 = ((i12 + i13) - (i12 & i13)) ^ i8;
    }

    protected final void ib2(int i2, int i3, int i4, int i5) {
        int i6 = i3 ^ i5;
        int i7 = ~i6;
        int i8 = i2 ^ i4;
        int i9 = i4 ^ i6;
        int i10 = ((i3 + i9) - (i3 | i9)) ^ i8;
        this.X0 = i10;
        int i11 = (((i2 | i7) ^ i5) | i8) ^ i6;
        this.X3 = i11;
        int i12 = ~i9;
        int i13 = (i11 + i10) - (i11 & i10);
        this.X1 = i12 ^ i13;
        this.X2 = (i13 ^ i8) ^ ((-1) - (((-1) - i5) | ((-1) - i12)));
    }

    protected final void ib3(int i2, int i3, int i4, int i5) {
        int i6 = i2 | i3;
        int i7 = i3 ^ i4;
        int i8 = i2 ^ ((-1) - (((-1) - i3) | ((-1) - i7)));
        int i9 = i5 | i8;
        int i10 = i7 ^ i9;
        this.X0 = i10;
        int i11 = (i9 | i7) ^ i5;
        this.X2 = (i4 ^ i8) ^ i11;
        int i12 = i6 ^ i11;
        int i13 = i8 ^ (i10 & i12);
        this.X3 = i13;
        this.X1 = i13 ^ (i12 ^ i10);
    }

    protected final void ib4(int i2, int i3, int i4, int i5) {
        int i6 = i3 ^ (((i4 + i5) - (i4 & i5)) & i2);
        int i7 = i4 ^ (i2 & i6);
        int i8 = i5 ^ i7;
        this.X1 = i8;
        int i9 = ~i2;
        int i10 = ((-1) - (((-1) - i7) | ((-1) - i8))) ^ i6;
        this.X3 = i10;
        int i11 = i5 ^ (i8 | i9);
        this.X0 = i10 ^ i11;
        this.X2 = (i9 ^ i8) ^ ((i6 + i11) - (i6 | i11));
    }

    protected final void ib5(int i2, int i3, int i4, int i5) {
        int i6 = ~i4;
        int i7 = ((-1) - (((-1) - i3) | ((-1) - i6))) ^ i5;
        int i8 = (-1) - (((-1) - i2) | ((-1) - i7));
        int i9 = (i3 ^ i6) ^ i8;
        this.X3 = i9;
        int i10 = (i9 + i3) - (i9 & i3);
        this.X1 = i7 ^ (i2 & i10);
        int i11 = (i5 + i2) - (i5 & i2);
        this.X0 = (i6 ^ i10) ^ i11;
        this.X2 = ((-1) - (((-1) - (i2 ^ i4)) & ((-1) - i8))) ^ ((-1) - (((-1) - i3) | ((-1) - i11)));
    }

    protected final void ib6(int i2, int i3, int i4, int i5) {
        int i6 = ~i2;
        int i7 = i2 ^ i3;
        int i8 = i4 ^ i7;
        int i9 = ((-1) - (((-1) - i4) & ((-1) - i6))) ^ i5;
        this.X1 = i8 ^ i9;
        int i10 = i7 ^ (i8 & i9);
        int i11 = i9 ^ ((i3 + i10) - (i3 & i10));
        this.X3 = i11;
        int i12 = i3 | i11;
        this.X0 = i10 ^ i12;
        this.X2 = (i5 & i6) ^ (i12 ^ i8);
    }

    protected final void ib7(int i2, int i3, int i4, int i5) {
        int i6 = ((-1) - (((-1) - i2) | ((-1) - i3))) | i4;
        int i7 = (-1) - (((-1) - i2) & ((-1) - i3));
        int i8 = (i7 + i5) - (i7 | i5);
        int i9 = i6 ^ i8;
        this.X3 = i9;
        int i10 = i3 ^ i8;
        int i11 = (~i5) ^ i9;
        int i12 = ((i11 + i10) - (i11 & i10)) ^ i2;
        this.X1 = i12;
        int i13 = (i10 ^ i4) ^ ((-1) - (((-1) - i5) & ((-1) - i12)));
        this.X0 = i13;
        this.X2 = (((i2 + i9) - (i2 | i9)) ^ i13) ^ (i6 ^ i12);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + cipherParameters.getClass().getName());
        }
        this.encrypting = z2;
        this.wKey = makeWorkingKey(((KeyParameter) cipherParameters).getKey());
    }

    protected final void inverseLT() {
        int iRotateRight = (rotateRight(this.X2, 22) ^ this.X3) ^ (this.X1 << 7);
        int iRotateRight2 = rotateRight(this.X0, 5) ^ this.X1;
        int i2 = this.X3;
        int i3 = iRotateRight2 ^ i2;
        int iRotateRight3 = rotateRight(i2, 7);
        int iRotateRight4 = rotateRight(this.X1, 1);
        this.X3 = (iRotateRight3 ^ iRotateRight) ^ (i3 << 3);
        this.X1 = (iRotateRight4 ^ i3) ^ iRotateRight;
        this.X2 = rotateRight(iRotateRight, 3);
        this.X0 = rotateRight(i3, 13);
    }

    protected abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (this.wKey == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i2 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i2, bArr2, i3);
            return 16;
        }
        decryptBlock(bArr, i2, bArr2, i3);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    protected final void sb0(int i2, int i3, int i4, int i5) {
        int i6 = i2 ^ i5;
        int i7 = i4 ^ i6;
        int i8 = i3 ^ i7;
        int i9 = ((i5 + i2) - (i5 | i2)) ^ i8;
        this.X3 = i9;
        int i10 = i2 ^ ((i3 + i6) - (i3 | i6));
        this.X2 = ((i4 + i10) - (i4 & i10)) ^ i8;
        int i11 = (i7 ^ i10) & i9;
        this.X1 = (~i7) ^ i11;
        this.X0 = (~i10) ^ i11;
    }

    protected final void sb1(int i2, int i3, int i4, int i5) {
        int i6 = (~i2) ^ i3;
        int i7 = ((i2 + i6) - (i2 & i6)) ^ i4;
        int i8 = i5 ^ i7;
        this.X2 = i8;
        int i9 = i3 ^ ((i5 + i6) - (i5 & i6));
        int i10 = i8 ^ i6;
        int i11 = (i7 & i9) ^ i10;
        this.X3 = i11;
        int i12 = i9 ^ i7;
        this.X1 = i11 ^ i12;
        this.X0 = i7 ^ (i12 & i10);
    }

    protected final void sb2(int i2, int i3, int i4, int i5) {
        int i6 = ~i2;
        int i7 = i3 ^ i5;
        int i8 = (i4 & i6) ^ i7;
        this.X0 = i8;
        int i9 = i4 ^ i6;
        int i10 = i4 ^ i8;
        int i11 = (i3 + i10) - (i3 | i10);
        int i12 = i9 ^ i11;
        this.X3 = i12;
        int i13 = (-1) - (((-1) - i11) & ((-1) - i5));
        int i14 = (i8 + i9) - (i8 & i9);
        int i15 = i2 ^ ((i13 + i14) - (i13 | i14));
        this.X2 = i15;
        this.X1 = (i15 ^ ((i5 + i6) - (i5 & i6))) ^ (i7 ^ i12);
    }

    protected final void sb3(int i2, int i3, int i4, int i5) {
        int i6 = i2 ^ i3;
        int i7 = i2 & i4;
        int i8 = (-1) - (((-1) - i2) & ((-1) - i5));
        int i9 = i4 ^ i5;
        int i10 = (-1) - (((-1) - i7) & ((-1) - ((-1) - (((-1) - i6) | ((-1) - i8)))));
        int i11 = i9 ^ i10;
        this.X2 = i11;
        int i12 = (i8 ^ i3) ^ i10;
        int i13 = i6 ^ (i9 & i12);
        this.X0 = i13;
        int i14 = i13 & i11;
        this.X1 = i12 ^ i14;
        this.X3 = (i3 | i5) ^ (i9 ^ i14);
    }

    protected final void sb4(int i2, int i3, int i4, int i5) {
        int i6 = i2 ^ i5;
        int i7 = i4 ^ (i5 & i6);
        int i8 = i3 | i7;
        this.X3 = i6 ^ i8;
        int i9 = ~i3;
        int i10 = (i6 | i9) ^ i7;
        this.X0 = i10;
        int i11 = i9 ^ i6;
        int i12 = ((-1) - (((-1) - i8) | ((-1) - i11))) ^ ((-1) - (((-1) - i10) | ((-1) - i2)));
        this.X2 = i12;
        this.X1 = (i2 ^ i7) ^ ((-1) - (((-1) - i11) | ((-1) - i12)));
    }

    protected final void sb5(int i2, int i3, int i4, int i5) {
        int i6 = ~i2;
        int i7 = i2 ^ i3;
        int i8 = i2 ^ i5;
        int i9 = (i4 ^ i6) ^ (i7 | i8);
        this.X0 = i9;
        int i10 = i5 & i9;
        int i11 = (i7 ^ i9) ^ i10;
        this.X1 = i11;
        int i12 = i8 ^ (i9 | i6);
        this.X2 = ((i7 + i10) - (i7 & i10)) ^ i12;
        this.X3 = ((i12 + i11) - (i12 | i11)) ^ (i3 ^ i10);
    }

    protected final void sb6(int i2, int i3, int i4, int i5) {
        int i6 = ~i2;
        int i7 = i2 ^ i5;
        int i8 = i3 ^ i7;
        int i9 = i4 ^ ((i6 + i7) - (i6 & i7));
        int i10 = i3 ^ i9;
        this.X1 = i10;
        int i11 = (i7 | i10) ^ i5;
        int i12 = ((i9 + i11) - (i9 | i11)) ^ i8;
        this.X2 = i12;
        int i13 = i11 ^ i9;
        this.X0 = i12 ^ i13;
        this.X3 = (i13 & i8) ^ (~i9);
    }

    protected final void sb7(int i2, int i3, int i4, int i5) {
        int i6 = i3 ^ i4;
        int i7 = ((i4 + i6) - (i4 | i6)) ^ i5;
        int i8 = i2 ^ i7;
        int i9 = (-1) - (((-1) - i5) & ((-1) - i6));
        int i10 = i3 ^ ((i9 + i8) - (i9 | i8));
        this.X1 = i10;
        int i11 = ((i2 + i8) - (i2 | i8)) ^ i6;
        this.X3 = i11;
        int i12 = (i10 | i7) ^ i8;
        int i13 = i7 ^ ((-1) - (((-1) - i11) | ((-1) - i12)));
        this.X2 = i13;
        this.X0 = ((-1) - (((-1) - i11) | ((-1) - i13))) ^ (~i12);
    }
}
