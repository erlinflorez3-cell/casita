package org.spongycastle.crypto.macs;

import com.dynatrace.android.agent.Global;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class SipHash implements Mac {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f27922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f27923d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected long f27924k0;
    protected long k1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f27925m;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected long f27926v0;
    protected long v1;
    protected long v2;
    protected long v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f27925m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f27922c = 2;
        this.f27923d = 4;
    }

    public SipHash(int i2, int i3) {
        this.f27925m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f27922c = i2;
        this.f27923d = i3;
    }

    protected static long rotateLeft(long j2, int i2) {
        return (-1) - (((-1) - (j2 >>> (-i2))) & ((-1) - (j2 << i2)));
    }

    protected void applySipRounds(int i2) {
        long jRotateLeft = this.f27926v0;
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
        this.f27926v0 = jRotateLeft;
        this.v1 = jRotateLeft2;
        this.v2 = jRotateLeft3;
        this.v3 = jRotateLeft4;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, DataLengthException {
        Pack.longToLittleEndian(doFinal(), bArr, i2);
        return 8;
    }

    public long doFinal() throws IllegalStateException, DataLengthException {
        long j2 = this.f27925m;
        int i2 = this.wordPos;
        this.f27925m = (-1) - (((-1) - ((j2 >>> ((7 - i2) << 3)) >>> 8)) & ((-1) - ((((long) ((this.wordCount << 3) + i2)) & 255) << 56)));
        processMessageWord();
        this.v2 ^= 255;
        applySipRounds(this.f27923d);
        long j3 = ((this.f27926v0 ^ this.v1) ^ this.v2) ^ this.v3;
        reset();
        return j3;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f27922c + Global.HYPHEN + this.f27923d;
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f27924k0 = Pack.littleEndianToLong(key, 0);
        this.k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    protected void processMessageWord() {
        this.wordCount++;
        this.v3 ^= this.f27925m;
        applySipRounds(this.f27922c);
        this.f27926v0 ^= this.f27925m;
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        long j2 = this.f27924k0;
        this.f27926v0 = 8317987319222330741L ^ j2;
        long j3 = this.k1;
        this.v1 = 7237128888997146477L ^ j3;
        this.v2 = j2 ^ 7816392313619706465L;
        this.v3 = 8387220255154660723L ^ j3;
        this.f27925m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        long j2 = this.f27925m >>> 8;
        long j3 = ((-1) - (((-1) - ((long) b2)) | ((-1) - 255))) << 56;
        this.f27925m = (j2 + j3) - (j2 & j3);
        int i2 = this.wordPos + 1;
        this.wordPos = i2;
        if (i2 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i2, int i3) throws IllegalStateException, DataLengthException {
        int i4 = i3 & (-8);
        int i5 = this.wordPos;
        int i6 = 0;
        if (i5 == 0) {
            while (i6 < i4) {
                this.f27925m = Pack.littleEndianToLong(bArr, i2 + i6);
                processMessageWord();
                i6 += 8;
            }
            while (i6 < i3) {
                long j2 = this.f27925m >>> 8;
                this.f27925m = j2;
                long j3 = bArr[i2 + i6];
                this.f27925m = (-1) - (((-1) - j2) & ((-1) - (((j3 + 255) - (j3 | 255)) << 56)));
                i6++;
            }
            this.wordPos = i3 - i4;
            return;
        }
        int i7 = i5 << 3;
        int i8 = 0;
        while (i8 < i4) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i2 + i8);
            long j4 = jLittleEndianToLong << i7;
            long j5 = this.f27925m >>> (-i7);
            this.f27925m = (j5 + j4) - (j5 & j4);
            processMessageWord();
            this.f27925m = jLittleEndianToLong;
            i8 += 8;
        }
        while (i8 < i3) {
            long j6 = this.f27925m >>> 8;
            this.f27925m = j6;
            this.f27925m = j6 | (((-1) - (((-1) - ((long) bArr[i2 + i8])) | ((-1) - 255))) << 56);
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
