package org.bouncycastle.crypto.macs;

import com.dynatrace.android.agent.Global;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes6.dex */
public class SipHash implements Mac {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f27560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f27561d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected long f27562k0;
    protected long k1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f27563m;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected long f27564v0;
    protected long v1;
    protected long v2;
    protected long v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f27563m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f27560c = 2;
        this.f27561d = 4;
    }

    public SipHash(int i2, int i3) {
        this.f27563m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f27560c = i2;
        this.f27561d = i3;
    }

    protected static long rotateLeft(long j2, int i2) {
        return (-1) - (((-1) - (j2 >>> (-i2))) & ((-1) - (j2 << i2)));
    }

    protected void applySipRounds(int i2) {
        long jRotateLeft = this.f27564v0;
        long jRotateLeft2 = this.v1;
        long jRotateLeft3 = this.v2;
        long jRotateLeft4 = this.v3;
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = jRotateLeft + jRotateLeft2;
            long j3 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j2;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j3;
            long j4 = j3 + jRotateLeft5;
            jRotateLeft = rotateLeft(j2, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j4;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j4, 32);
        }
        this.f27564v0 = jRotateLeft;
        this.v1 = jRotateLeft2;
        this.v2 = jRotateLeft3;
        this.v3 = jRotateLeft4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, DataLengthException {
        Pack.longToLittleEndian(doFinal(), bArr, i2);
        return 8;
    }

    public long doFinal() throws IllegalStateException, DataLengthException {
        long j2 = this.f27563m;
        int i2 = this.wordPos;
        long j3 = (j2 >>> ((7 - i2) << 3)) >>> 8;
        long j4 = (this.wordCount << 3) + i2;
        long j5 = ((j4 + 255) - (j4 | 255)) << 56;
        this.f27563m = (j3 + j5) - (j3 & j5);
        processMessageWord();
        this.v2 ^= 255;
        applySipRounds(this.f27561d);
        long j6 = ((this.f27564v0 ^ this.v1) ^ this.v2) ^ this.v3;
        reset();
        return j6;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f27560c + Global.HYPHEN + this.f27561d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f27562k0 = Pack.littleEndianToLong(key, 0);
        this.k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    protected void processMessageWord() {
        this.wordCount++;
        this.v3 ^= this.f27563m;
        applySipRounds(this.f27560c);
        this.f27564v0 ^= this.f27563m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j2 = this.f27562k0;
        this.f27564v0 = 8317987319222330741L ^ j2;
        long j3 = this.k1;
        this.v1 = 7237128888997146477L ^ j3;
        this.v2 = j2 ^ 7816392313619706465L;
        this.v3 = 8387220255154660723L ^ j3;
        this.f27563m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        this.f27563m = (this.f27563m >>> 8) | (((-1) - (((-1) - ((long) b2)) | ((-1) - 255))) << 56);
        int i2 = this.wordPos + 1;
        this.wordPos = i2;
        if (i2 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i2, int i3) throws IllegalStateException, DataLengthException {
        int i4 = (-1) - (((-1) - i3) | ((-1) - (-8)));
        int i5 = this.wordPos;
        int i6 = 0;
        if (i5 == 0) {
            while (i6 < i4) {
                this.f27563m = Pack.littleEndianToLong(bArr, i2 + i6);
                processMessageWord();
                i6 += 8;
            }
            while (i6 < i3) {
                long j2 = this.f27563m >>> 8;
                this.f27563m = j2;
                long j3 = bArr[i2 + i6];
                this.f27563m = j2 | (((j3 + 255) - (j3 | 255)) << 56);
                i6++;
            }
            this.wordPos = i3 - i4;
            return;
        }
        int i7 = i5 << 3;
        int i8 = 0;
        while (i8 < i4) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i2 + i8);
            this.f27563m = (-1) - (((-1) - (this.f27563m >>> (-i7))) & ((-1) - (jLittleEndianToLong << i7)));
            processMessageWord();
            this.f27563m = jLittleEndianToLong;
            i8 += 8;
        }
        while (i8 < i3) {
            long j4 = this.f27563m >>> 8;
            this.f27563m = j4;
            long j5 = bArr[i2 + i8];
            this.f27563m = (-1) - (((-1) - j4) & ((-1) - (((j5 + 255) - (j5 | 255)) << 56)));
            int i9 = this.wordPos + 1;
            this.wordPos = i9;
            if (i9 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i8++;
        }
    }
}
