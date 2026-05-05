package org.spongycastle.pqc.math.linearalgebra;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.common.primitives.Longs;
import cz.msebera.android.httpclient.impl.client.cache.CacheValidityPolicy;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlin.time.DurationKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.WebSocketProtocol;
import yg.C1521gK;

/* JADX INFO: loaded from: classes2.dex */
public class GF2nONBElement extends GF2nElement {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    private long[] mPol;
    private static final long[] mBitmask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, Http2Stream.EMIT_BUFFER_SIZE, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, CacheValidityPolicy.MAX_AGE, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, LockFreeTaskQueueCore.FROZEN_MASK, LockFreeTaskQueueCore.CLOSED_MASK, Longs.MAX_POWER_OF_TWO, Long.MIN_VALUE};
    private static final long[] mMaxmask = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, WebSocketProtocol.PAYLOAD_SHORT_MAX, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, LockFreeTaskQueueCore.HEAD_MASK, 2147483647L, 4294967295L, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, C1521gK.Yd, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, DurationKt.MAX_MILLIS, Long.MAX_VALUE, -1};
    private static final int[] mIBY64 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        this.mField = gF2nONBElement.mField;
        this.mDegree = this.mField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = this.mField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = this.mField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i2 = this.mLength;
        long[] jArr = new long[i2];
        this.mPol = jArr;
        if (i2 <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.mPol;
            jArr2[0] = jArr2[0] >>> (64 - this.mBit);
        } else {
            for (int i3 = 0; i3 < this.mLength - 1; i3++) {
                this.mPol[i3] = secureRandom.nextLong();
            }
            this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
        }
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = this.mField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = this.mField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength = gF2nONBField.getONBLength();
        long[] jArr = new long[oNBLength];
        int i2 = 0;
        while (true) {
            int i3 = oNBLength - 1;
            if (i2 >= i3) {
                jArr[i3] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i2] = -1;
            i2++;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
    }

    private void assign(BigInteger bigInteger) {
        assign(bigInteger.toByteArray());
    }

    private void assign(byte[] bArr) {
        this.mPol = new long[this.mLength];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            long[] jArr = this.mPol;
            int i3 = i2 >>> 3;
            jArr[i3] = jArr[i3] | (((-1) - (((-1) - ((long) bArr[(bArr.length - 1) - i2])) | ((-1) - 255))) << ((7 & i2) << 3));
        }
    }

    private void assign(long[] jArr) {
        System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
    }

    private long[] getElement() {
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    private long[] getElementReverseOrder() {
        long[] jArr = new long[this.mPol.length];
        for (int i2 = 0; i2 < this.mDegree; i2++) {
            if (testBit((this.mDegree - i2) - 1)) {
                int i3 = i2 >>> 6;
                long j2 = jArr[i3];
                long j3 = mBitmask[(i2 + 63) - (63 | i2)];
                jArr[i3] = (j2 + j3) - (j2 & j3);
            }
        }
        return jArr;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException();
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        for (int i2 = 0; i2 < this.mLength; i2++) {
            long[] jArr = this.mPol;
            jArr[i2] = jArr[i2] ^ gF2nONBElement.mPol[i2];
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    void assignOne() {
        int i2 = 0;
        while (true) {
            int i3 = this.mLength;
            if (i2 >= i3 - 1) {
                this.mPol[i3 - 1] = mMaxmask[this.mBit - 1];
                return;
            } else {
                this.mPol[i2] = -1;
                i2++;
            }
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    void assignZero() {
        this.mPol = new long[this.mLength];
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement, org.spongycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i2 = 0; i2 < this.mLength; i2++) {
            if (this.mPol[i2] != gF2nONBElement.mPol[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return this.mPol.hashCode();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() throws ArithmeticException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i2 = 31;
        boolean z2 = false;
        while (!z2 && i2 >= 0) {
            if ((((long) (this.mDegree - 1)) & mBitmask[i2]) != 0) {
                z2 = true;
            }
            i2--;
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i3 = 1;
        while (i2 >= 0) {
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i4 = 1; i4 <= i3; i4++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i3 <<= 1;
            if ((-1) - (((-1) - ((long) (this.mDegree - 1))) | ((-1) - mBitmask[i2])) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i3++;
            }
            i2--;
        }
        gF2nONBElement.squareThis();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0040  */
    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isOne() {
        /*
            r14 = this;
            r13 = 1
            r12 = 0
            r2 = r13
            r5 = r12
        L4:
            int r1 = r14.mLength
            int r0 = r1 + (-1)
            if (r5 >= r0) goto L1e
            if (r2 == 0) goto L1e
            if (r2 == 0) goto L1c
            long[] r0 = r14.mPol
            r3 = r0[r5]
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L1c
            r2 = r13
        L19:
            int r5 = r5 + 1
            goto L4
        L1c:
            r2 = r12
            goto L19
        L1e:
            if (r2 == 0) goto L3f
            if (r2 == 0) goto L40
            long[] r0 = r14.mPol
            int r1 = r1 - r13
            r10 = r0[r1]
            long[] r9 = org.spongycastle.pqc.math.linearalgebra.GF2nONBElement.mMaxmask
            int r8 = r14.mBit
            int r0 = r8 + (-1)
            r6 = r9[r0]
            r4 = -1
            long r2 = r4 - r10
            long r0 = r4 - r6
            long r2 = r2 | r0
            long r4 = r4 - r2
            int r8 = r8 - r13
            r1 = r9[r8]
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L40
        L3e:
            r2 = r13
        L3f:
            return r2
        L40:
            r13 = r12
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.pqc.math.linearalgebra.GF2nONBElement.isOne():boolean");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z2 = true;
        for (int i2 = 0; i2 < this.mLength && z2; i2++) {
            z2 = z2 && this.mPol[i2] == 0;
        }
        return z2;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) throws RuntimeException {
        boolean z2;
        char c2;
        boolean z3;
        char c3;
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException("The elements have different representation: not yet implemented");
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.mPol;
        long[] jArr2 = gF2nONBElement.mPol;
        long[] jArr3 = new long[this.mLength];
        int[][] iArr = ((GF2nONBField) this.mField).mMult;
        int i2 = this.mLength;
        int i3 = i2 - 1;
        int i4 = this.mBit - 1;
        long[] jArr4 = mBitmask;
        long j2 = jArr4[63];
        long j3 = jArr4[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < this.mDegree; i6++) {
            int i7 = i5;
            int i8 = i7;
            while (i7 < this.mDegree) {
                int[] iArr2 = mIBY64;
                int i9 = iArr2[i7];
                int[] iArr3 = iArr[i7];
                int i10 = iArr3[i5];
                int i11 = iArr2[i10];
                int i12 = (-1) - (((-1) - i10) | ((-1) - 63));
                long j4 = jArr[i9];
                long[] jArr5 = mBitmask;
                if ((-1) - (((-1) - j4) | ((-1) - jArr5[(i7 + 63) - (63 | i7)])) != 0) {
                    long j5 = jArr2[i11];
                    long j6 = jArr5[i12];
                    if ((j5 + j6) - (j5 | j6) != 0) {
                        i8 ^= 1;
                    }
                    int i13 = iArr3[1];
                    if (i13 != -1) {
                        if ((jArr2[iArr2[i13]] & jArr5[i13 & 63]) != 0) {
                            i8 ^= 1;
                        }
                    }
                }
                i7++;
                i5 = 0;
            }
            int i14 = mIBY64[i6];
            int i15 = (-1) - (((-1) - i6) | ((-1) - 63));
            if (i8 != 0) {
                jArr3[i14] = jArr3[i14] ^ mBitmask[i15];
            }
            if (this.mLength > 1) {
                long j7 = jArr[i3];
                boolean z4 = (j7 + 1) - (j7 | 1) == 1;
                int i16 = i2 - 2;
                int i17 = i16;
                while (i17 >= 0) {
                    long j8 = jArr[i17];
                    boolean z5 = (-1) - (((-1) - j8) | ((-1) - 1)) != 0;
                    long j9 = j8 >>> 1;
                    jArr[i17] = j9;
                    if (z4) {
                        jArr[i17] = j9 ^ j2;
                    }
                    i17--;
                    z4 = z5;
                }
                long j10 = jArr[i3] >>> 1;
                jArr[i3] = j10;
                if (z4) {
                    jArr[i3] = j10 ^ j3;
                }
                long j11 = jArr2[i3];
                boolean z6 = (j11 + 1) - (j11 | 1) == 1;
                while (i16 >= 0) {
                    long j12 = jArr2[i16];
                    boolean z7 = (-1) - (((-1) - j12) | ((-1) - 1)) != 0;
                    long j13 = j12 >>> 1;
                    jArr2[i16] = j13;
                    if (z6) {
                        jArr2[i16] = j13 ^ j2;
                    }
                    i16--;
                    z6 = z7;
                }
                long j14 = jArr2[i3] >>> 1;
                jArr2[i3] = j14;
                if (z6) {
                    jArr2[i3] = j14 ^ j3;
                }
                i5 = 0;
            } else {
                i5 = 0;
                long j15 = jArr[0];
                if ((j15 + 1) - (j15 | 1) == 1) {
                    c2 = 1;
                    z2 = true;
                } else {
                    z2 = false;
                    c2 = 1;
                }
                long j16 = j15 >>> c2;
                jArr[0] = j16;
                if (z2) {
                    jArr[0] = j16 ^ j3;
                }
                long j17 = jArr2[0];
                if ((j17 & 1) == 1) {
                    c3 = 1;
                    z3 = true;
                } else {
                    z3 = false;
                    c3 = 1;
                }
                long j18 = j17 >>> c3;
                jArr2[0] = j18;
                if (z3) {
                    jArr2[0] = j18 ^ j3;
                }
            }
        }
        assign(jArr3);
    }

    void reverseOrder() {
        this.mPol = getElementReverseOrder();
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bf  */
    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.spongycastle.pqc.math.linearalgebra.GF2nElement solveQuadraticEquation() throws java.lang.RuntimeException {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.pqc.math.linearalgebra.GF2nONBElement.solveQuadraticEquation():org.spongycastle.pqc.math.linearalgebra.GF2nElement");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] element = getElement();
        int i2 = this.mLength - 1;
        int i3 = this.mBit - 1;
        long j2 = mBitmask[63];
        boolean z2 = (element[0] & 1) != 0;
        int i4 = i2;
        while (i4 >= 0) {
            long j3 = element[i4];
            boolean z3 = (j3 + 1) - (j3 | 1) != 0;
            long j4 = j3 >>> 1;
            element[i4] = j4;
            if (z2) {
                if (i4 == i2) {
                    element[i4] = j4 ^ mBitmask[i3];
                } else {
                    element[i4] = j4 ^ j2;
                }
            }
            i4--;
            z2 = z3;
        }
        assign(element);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] element = getElement();
        int i2 = this.mLength - 1;
        int i3 = this.mBit;
        int i4 = i3 - 1;
        long[] jArr = mBitmask;
        long j2 = jArr[63];
        boolean z2 = (-1) - (((-1) - element[i2]) | ((-1) - jArr[i4])) != 0;
        int i5 = 0;
        while (i5 < i2) {
            long j3 = element[i5];
            boolean z3 = (j3 & j2) != 0;
            long j4 = j3 << 1;
            element[i5] = j4;
            if (z2) {
                element[i5] = 1 ^ j4;
            }
            i5++;
            z2 = z3;
        }
        long j5 = element[i2];
        long[] jArr2 = mBitmask;
        boolean z4 = (-1) - (((-1) - jArr2[i4]) | ((-1) - j5)) != 0;
        long j6 = j5 << 1;
        element[i2] = j6;
        if (z2) {
            element[i2] = j6 ^ 1;
        }
        if (z4) {
            element[i2] = jArr2[i3] ^ element[i2];
        }
        assign(element);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    boolean testBit(int i2) {
        if (i2 < 0 || i2 > this.mDegree) {
            return false;
        }
        return (-1) - (((-1) - this.mPol[i2 >>> 6]) | ((-1) - mBitmask[i2 & 63])) != 0;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        long j2 = this.mPol[this.mLength - 1];
        long j3 = mBitmask[this.mBit - 1];
        return (j2 + j3) - (j2 | j3) != 0;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i2 = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = this.mPol[i3 >>> 3];
            long j3 = 255 << ((7 & i3) << 3);
            bArr[(i2 - i3) - 1] = (byte) (((j2 + j3) - (j2 | j3)) >>> r0);
        }
        return bArr;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public String toString(int i2) {
        long[] element = getElement();
        int i3 = this.mBit;
        String str = "";
        if (i2 == 2) {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                long j2 = element[element.length - 1];
                long j3 = 1 << i4;
                str = (j2 + j3) - (j2 | j3) == 0 ? str + AdkSettings.PLATFORM_TYPE_MOBILE : str + "1";
            }
            for (int length = element.length - 2; length >= 0; length--) {
                for (int i5 = 63; i5 >= 0; i5--) {
                    long j4 = element[length];
                    long j5 = mBitmask[i5];
                    str = (j4 + j5) - (j4 | j5) == 0 ? str + AdkSettings.PLATFORM_TYPE_MOBILE : str + "1";
                }
            }
        } else if (i2 == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int length2 = element.length - 1; length2 >= 0; length2--) {
                StringBuilder sbAppend = new StringBuilder().append(str + cArr[((int) (element[length2] >>> 60)) & 15]);
                int i6 = (int) (element[length2] >>> 56);
                StringBuilder sbAppend2 = new StringBuilder().append(((sbAppend.append(cArr[(i6 + 15) - (i6 | 15)]).toString() + cArr[((int) (element[length2] >>> 52)) & 15]) + cArr[((int) (element[length2] >>> 48)) & 15]) + cArr[(-1) - (((-1) - ((int) (element[length2] >>> 44))) | ((-1) - 15))]);
                int i7 = (int) (element[length2] >>> 40);
                StringBuilder sbAppend3 = new StringBuilder().append(((sbAppend2.append(cArr[(i7 + 15) - (i7 | 15)]).toString() + cArr[((int) (element[length2] >>> 36)) & 15]) + cArr[(-1) - (((-1) - ((int) (element[length2] >>> 32))) | ((-1) - 15))]) + cArr[((int) (element[length2] >>> 28)) & 15]);
                int i8 = (int) (element[length2] >>> 24);
                StringBuilder sbAppend4 = new StringBuilder().append(sbAppend3.append(cArr[(i8 + 15) - (i8 | 15)]).toString());
                int i9 = (int) (element[length2] >>> 20);
                StringBuilder sbAppend5 = new StringBuilder().append((((sbAppend4.append(cArr[(i9 + 15) - (i9 | 15)]).toString() + cArr[(-1) - (((-1) - ((int) (element[length2] >>> 16))) | ((-1) - 15))]) + cArr[(-1) - (((-1) - ((int) (element[length2] >>> 12))) | ((-1) - 15))]) + cArr[((int) (element[length2] >>> 8)) & 15]) + cArr[((int) (element[length2] >>> 4)) & 15]);
                int i10 = (int) element[length2];
                str = sbAppend5.append(cArr[(i10 + 15) - (i10 | 15)]).toString() + Global.BLANK;
            }
        }
        return str;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        int i2 = this.mLength - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < 64; i5++) {
                long j2 = this.mPol[i4];
                long j3 = mBitmask[i5];
                if ((j2 + j3) - (j2 | j3) != 0) {
                    i3 ^= 1;
                }
            }
        }
        int i6 = this.mBit;
        for (int i7 = 0; i7 < i6; i7++) {
            if ((-1) - (((-1) - this.mPol[i2]) | ((-1) - mBitmask[i7])) != 0) {
                i3 ^= 1;
            }
        }
        return i3;
    }
}
