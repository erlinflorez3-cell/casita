package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.MaxBytesExceededException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.SkippingStreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int[] f27904x;

    public Salsa20Engine() {
        this(20);
    }

    public Salsa20Engine(int i2) {
        this.index = 0;
        this.engineState = new int[16];
        this.f27904x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i2 <= 0 || (-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = i2;
    }

    private boolean limitExceeded() {
        int i2 = this.cW0 + 1;
        this.cW0 = i2;
        if (i2 == 0) {
            int i3 = this.cW1 + 1;
            this.cW1 = i3;
            if (i3 == 0) {
                int i4 = this.cW2 + 1;
                this.cW2 = i4;
                return (-1) - (((-1) - i4) | ((-1) - 32)) != 0;
            }
        }
        return false;
    }

    private boolean limitExceeded(int i2) {
        int i3 = this.cW0 + i2;
        this.cW0 = i3;
        if (i3 >= i2 || i3 < 0) {
            return false;
        }
        int i4 = this.cW1 + 1;
        this.cW1 = i4;
        if (i4 != 0) {
            return false;
        }
        int i5 = this.cW2 + 1;
        this.cW2 = i5;
        return (i5 & 32) != 0;
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    protected static int rotl(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    public static void salsaCore(int i2, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i2 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        char c2 = 0;
        int i3 = iArr[0];
        int iRotl = iArr[1];
        int iRotl2 = iArr[2];
        int iRotl3 = iArr[3];
        int iRotl4 = iArr[4];
        int iRotl5 = iArr[5];
        int iRotl6 = iArr[6];
        int i4 = 7;
        int iRotl7 = iArr[7];
        int i5 = iArr[8];
        int i6 = 9;
        int iRotl8 = iArr[9];
        int iRotl9 = iArr[10];
        int iRotl10 = iArr[11];
        int iRotl11 = iArr[12];
        int i7 = 13;
        int iRotl12 = iArr[13];
        int iRotl13 = iArr[14];
        int iRotl14 = iArr[15];
        while (i2 > 0) {
            int iRotl15 = rotl(i3 + iRotl11, i4) ^ iRotl4;
            int iRotl16 = i5 ^ rotl(iRotl15 + i3, i6);
            int iRotl17 = iRotl11 ^ rotl(iRotl16 + iRotl15, i7);
            int iRotl18 = rotl(iRotl17 + iRotl16, 18) ^ i3;
            int iRotl19 = iRotl8 ^ rotl(iRotl5 + iRotl, i4);
            int iRotl20 = iRotl12 ^ rotl(iRotl19 + iRotl5, i6);
            int iRotl21 = iRotl ^ rotl(iRotl20 + iRotl19, i7);
            int iRotl22 = rotl(iRotl21 + iRotl20, 18) ^ iRotl5;
            int iRotl23 = iRotl13 ^ rotl(iRotl9 + iRotl6, 7);
            int iRotl24 = iRotl2 ^ rotl(iRotl23 + iRotl9, 9);
            int iRotl25 = iRotl6 ^ rotl(iRotl24 + iRotl23, 13);
            int iRotl26 = iRotl9 ^ rotl(iRotl25 + iRotl24, 18);
            int iRotl27 = iRotl3 ^ rotl(iRotl14 + iRotl10, 7);
            int iRotl28 = iRotl7 ^ rotl(iRotl27 + iRotl14, 9);
            int iRotl29 = iRotl10 ^ rotl(iRotl28 + iRotl27, 13);
            int iRotl30 = iRotl14 ^ rotl(iRotl29 + iRotl28, 18);
            iRotl = iRotl21 ^ rotl(iRotl18 + iRotl27, 7);
            iRotl2 = iRotl24 ^ rotl(iRotl + iRotl18, 9);
            iRotl3 = iRotl27 ^ rotl(iRotl2 + iRotl, 13);
            int iRotl31 = iRotl18 ^ rotl(iRotl3 + iRotl2, 18);
            iRotl6 = iRotl25 ^ rotl(iRotl22 + iRotl15, 7);
            iRotl7 = iRotl28 ^ rotl(iRotl6 + iRotl22, 9);
            iRotl4 = rotl(iRotl7 + iRotl6, 13) ^ iRotl15;
            iRotl5 = iRotl22 ^ rotl(iRotl4 + iRotl7, 18);
            iRotl10 = iRotl29 ^ rotl(iRotl26 + iRotl19, 7);
            int iRotl32 = rotl(iRotl10 + iRotl26, 9) ^ iRotl16;
            iRotl8 = iRotl19 ^ rotl(iRotl32 + iRotl10, 13);
            iRotl9 = iRotl26 ^ rotl(iRotl8 + iRotl32, 18);
            iRotl11 = iRotl17 ^ rotl(iRotl30 + iRotl23, 7);
            iRotl12 = iRotl20 ^ rotl(iRotl11 + iRotl30, 9);
            iRotl13 = iRotl23 ^ rotl(iRotl12 + iRotl11, 13);
            iRotl14 = iRotl30 ^ rotl(iRotl13 + iRotl12, 18);
            i2 -= 2;
            i5 = iRotl32;
            i3 = iRotl31;
            c2 = 0;
            i7 = 13;
            i6 = 9;
            i4 = 7;
        }
        iArr2[c2] = i3 + iArr[c2];
        iArr2[1] = iRotl + iArr[1];
        iArr2[2] = iRotl2 + iArr[2];
        iArr2[3] = iRotl3 + iArr[3];
        iArr2[4] = iRotl4 + iArr[4];
        iArr2[5] = iRotl5 + iArr[5];
        iArr2[6] = iRotl6 + iArr[6];
        iArr2[7] = iRotl7 + iArr[7];
        iArr2[8] = i5 + iArr[8];
        iArr2[9] = iRotl8 + iArr[9];
        iArr2[10] = iRotl9 + iArr[10];
        iArr2[11] = iRotl10 + iArr[11];
        iArr2[12] = iRotl11 + iArr[12];
        iArr2[13] = iRotl12 + iArr[13];
        iArr2[14] = iRotl13 + iArr[14];
        iArr2[15] = iRotl14 + iArr[15];
    }

    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i2 = iArr[8] + 1;
        iArr[8] = i2;
        if (i2 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    protected void advanceCounter(long j2) {
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) j2;
        if (i2 > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i2;
        }
        int[] iArr2 = this.engineState;
        int i4 = iArr2[8];
        int i5 = i3 + i4;
        iArr2[8] = i5;
        if (i4 == 0 || i5 >= i4) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    protected void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f27904x);
        Pack.intToLittleEndian(this.f27904x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return this.rounds != 20 ? "Salsa20/" + this.rounds : "Salsa20";
    }

    protected long getCounter() {
        int[] iArr = this.engineState;
        return (-1) - (((-1) - (((long) iArr[9]) << 32)) & ((-1) - (((long) iArr[8]) & 4294967295L)));
    }

    protected int getNonceSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + ((long) this.index);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.initialised) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            setKey(null, iv);
        } else {
            if (!(parameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            setKey(((KeyParameter) parameters).getKey(), iv);
        }
        reset();
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i2 + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i4 + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (limitExceeded(i3)) {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i5 = 0; i5 < i3; i5++) {
            byte[] bArr3 = this.keyStream;
            int i6 = this.index;
            bArr2[i5 + i4] = (byte) (bArr3[i6] ^ bArr[i5 + i2]);
            int i7 = i6 + 1;
            int i8 = (i7 + 63) - (i7 | 63);
            this.index = i8;
            if (i8 == 0) {
                advanceCounter();
                generateKeyStream(this.keyStream);
            }
        }
        return i3;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    protected void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    protected void retreatCounter() {
        int[] iArr = this.engineState;
        int i2 = iArr[8];
        if (i2 == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i3 = i2 - 1;
        iArr[8] = i3;
        if (i3 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }

    protected void retreatCounter(long j2) {
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) j2;
        if (i2 != 0) {
            int[] iArr = this.engineState;
            int i4 = iArr[9];
            long j3 = i4;
            if ((j3 + 4294967295L) - (j3 | 4294967295L) < (((long) i2) & 4294967295L)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[9] = i4 - i2;
        }
        int[] iArr2 = this.engineState;
        int i5 = iArr2[8];
        if ((((long) i5) & 4294967295L) >= (-1) - (((-1) - 4294967295L) | ((-1) - ((long) i3)))) {
            iArr2[8] = i5 - i3;
            return;
        }
        int i6 = iArr2[9];
        if (i6 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[9] = i6 - 1;
        iArr2[8] = i5 - i3;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        if (limitExceeded()) {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        byte[] bArr = this.keyStream;
        int i2 = this.index;
        byte b3 = (byte) (b2 ^ bArr[i2]);
        int i3 = (i2 + 1) & 63;
        this.index = i3;
        if (i3 == 0) {
            advanceCounter();
            generateKeyStream(this.keyStream);
        }
        return b3;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long seekTo(long j2) {
        reset();
        return skip(j2);
    }

    protected void setKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (bArr != null) {
            int i2 = 16;
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            this.engineState[1] = Pack.littleEndianToInt(bArr, 0);
            this.engineState[2] = Pack.littleEndianToInt(bArr, 4);
            this.engineState[3] = Pack.littleEndianToInt(bArr, 8);
            this.engineState[4] = Pack.littleEndianToInt(bArr, 12);
            if (bArr.length == 32) {
                bArr3 = sigma;
            } else {
                bArr3 = tau;
                i2 = 0;
            }
            this.engineState[11] = Pack.littleEndianToInt(bArr, i2);
            this.engineState[12] = Pack.littleEndianToInt(bArr, i2 + 4);
            this.engineState[13] = Pack.littleEndianToInt(bArr, i2 + 8);
            this.engineState[14] = Pack.littleEndianToInt(bArr, i2 + 12);
            this.engineState[0] = Pack.littleEndianToInt(bArr3, 0);
            this.engineState[5] = Pack.littleEndianToInt(bArr3, 4);
            this.engineState[10] = Pack.littleEndianToInt(bArr3, 8);
            this.engineState[15] = Pack.littleEndianToInt(bArr3, 12);
        }
        this.engineState[6] = Pack.littleEndianToInt(bArr2, 0);
        this.engineState[7] = Pack.littleEndianToInt(bArr2, 4);
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long skip(long j2) {
        long j3;
        if (j2 >= 0) {
            if (j2 >= 64) {
                long j4 = j2 / 64;
                advanceCounter(j4);
                j3 = j2 - (j4 * 64);
            } else {
                j3 = j2;
            }
            int i2 = this.index;
            int i3 = ((int) j3) + i2;
            int i4 = (i3 + 63) - (i3 | 63);
            this.index = i4;
            if (i4 < i2) {
                advanceCounter();
            }
        } else {
            long j5 = -j2;
            if (j5 >= 64) {
                long j6 = j5 / 64;
                retreatCounter(j6);
                j5 -= j6 * 64;
            }
            for (long j7 = 0; j7 < j5; j7++) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
            }
        }
        generateKeyStream(this.keyStream);
        return j2;
    }
}
