package com.google.crypto.tink.subtle;

import com.google.common.base.Ascii;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes7.dex */
final class Ed25519 {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final CachedXYT CACHED_NEUTRAL = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final PartialXYZT NEUTRAL = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] GROUP_ORDER = {-19, MessagePack.Code.INT64, -11, 92, Ascii.SUB, 99, Ascii.DC2, 88, MessagePack.Code.FIXEXT4, -100, -9, -94, MessagePack.Code.MAP16, -7, MessagePack.Code.MAP16, Ascii.DC4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }

        CachedXYT(CachedXYT other) {
            this.yPlusX = Arrays.copyOf(other.yPlusX, 10);
            this.yMinusX = Arrays.copyOf(other.yMinusX, 10);
            this.t2d = Arrays.copyOf(other.t2d, 10);
        }

        CachedXYT(long[] yPlusX, long[] yMinusX, long[] t2d) {
            this.yPlusX = yPlusX;
            this.yMinusX = yMinusX;
            this.t2d = t2d;
        }

        void copyConditional(CachedXYT other, int icopy) {
            Curve25519.copyConditional(this.yPlusX, other.yPlusX, icopy);
            Curve25519.copyConditional(this.yMinusX, other.yMinusX, icopy);
            Curve25519.copyConditional(this.t2d, other.t2d, icopy);
        }

        void multByZ(long[] output, long[] in) {
            System.arraycopy(in, 0, output, 0, 10);
        }
    }

    private static class CachedXYZT extends CachedXYT {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final long[] f3526z;

        CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        CachedXYZT(XYZT xyzt) {
            this();
            Field25519.sum(this.yPlusX, xyzt.xyz.f3529y, xyzt.xyz.f3528x);
            Field25519.sub(this.yMinusX, xyzt.xyz.f3529y, xyzt.xyz.f3528x);
            System.arraycopy(xyzt.xyz.f3530z, 0, this.f3526z, 0, 10);
            Field25519.mult(this.t2d, xyzt.f3531t, Ed25519Constants.D2);
        }

        CachedXYZT(long[] yPlusX, long[] yMinusX, long[] z2, long[] t2d) {
            super(yPlusX, yMinusX, t2d);
            this.f3526z = z2;
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] output, long[] in) {
            Field25519.mult(output, in, this.f3526z);
        }
    }

    private static class PartialXYZT {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final long[] f3527t;
        final XYZ xyz;

        PartialXYZT() {
            this(new XYZ(), new long[10]);
        }

        PartialXYZT(PartialXYZT other) {
            this.xyz = new XYZ(other.xyz);
            this.f3527t = Arrays.copyOf(other.f3527t, 10);
        }

        PartialXYZT(XYZ xyz, long[] t2) {
            this.xyz = xyz;
            this.f3527t = t2;
        }
    }

    private static class XYZ {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final long[] f3528x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final long[] f3529y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final long[] f3530z;

        XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        XYZ(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        XYZ(XYZ xyz) {
            this.f3528x = Arrays.copyOf(xyz.f3528x, 10);
            this.f3529y = Arrays.copyOf(xyz.f3529y, 10);
            this.f3530z = Arrays.copyOf(xyz.f3530z, 10);
        }

        XYZ(long[] x2, long[] y2, long[] z2) {
            this.f3528x = x2;
            this.f3529y = y2;
            this.f3530z = z2;
        }

        static XYZ fromPartialXYZT(XYZ out, PartialXYZT in) {
            Field25519.mult(out.f3528x, in.xyz.f3528x, in.f3527t);
            Field25519.mult(out.f3529y, in.xyz.f3529y, in.xyz.f3530z);
            Field25519.mult(out.f3530z, in.xyz.f3530z, in.f3527t);
            return out;
        }

        boolean isOnCurve() {
            long[] jArr = new long[10];
            Field25519.square(jArr, this.f3528x);
            long[] jArr2 = new long[10];
            Field25519.square(jArr2, this.f3529y);
            long[] jArr3 = new long[10];
            Field25519.square(jArr3, this.f3530z);
            long[] jArr4 = new long[10];
            Field25519.square(jArr4, jArr3);
            long[] jArr5 = new long[10];
            Field25519.sub(jArr5, jArr2, jArr);
            Field25519.mult(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            Field25519.mult(jArr6, jArr, jArr2);
            Field25519.mult(jArr6, jArr6, Ed25519Constants.D);
            Field25519.sum(jArr6, jArr4);
            Field25519.reduce(jArr6, jArr6);
            return Bytes.equal(Field25519.contract(jArr5), Field25519.contract(jArr6));
        }

        byte[] toBytes() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            Field25519.inverse(jArr, this.f3530z);
            Field25519.mult(jArr2, this.f3528x, jArr);
            Field25519.mult(jArr3, this.f3529y, jArr);
            byte[] bArrContract = Field25519.contract(jArr3);
            bArrContract[31] = (byte) ((Ed25519.getLsb(jArr2) << 7) ^ bArrContract[31]);
            return bArrContract;
        }
    }

    private static class XYZT {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final long[] f3531t;
        final XYZ xyz;

        XYZT() {
            this(new XYZ(), new long[10]);
        }

        XYZT(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        XYZT(XYZ xyz, long[] t2) {
            this.xyz = xyz;
            this.f3531t = t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromBytesNegateVarTime(byte[] s2) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] jArrExpand = Field25519.expand(s2);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            Field25519.square(jArr4, jArrExpand);
            Field25519.mult(jArr5, jArr4, Ed25519Constants.D);
            Field25519.sub(jArr4, jArr4, jArr2);
            Field25519.sum(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            Field25519.square(jArr8, jArr5);
            Field25519.mult(jArr8, jArr8, jArr5);
            Field25519.square(jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr5);
            Field25519.mult(jArr, jArr, jArr4);
            Ed25519.pow2252m3(jArr, jArr);
            Field25519.mult(jArr, jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr4);
            Field25519.square(jArr6, jArr);
            Field25519.mult(jArr6, jArr6, jArr5);
            Field25519.sub(jArr7, jArr6, jArr4);
            if (Ed25519.isNonZeroVarTime(jArr7)) {
                Field25519.sum(jArr7, jArr6, jArr4);
                if (Ed25519.isNonZeroVarTime(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                Field25519.mult(jArr, jArr, Ed25519Constants.SQRTM1);
            }
            if (!Ed25519.isNonZeroVarTime(jArr)) {
                byte b2 = s2[31];
                if ((((b2 + 255) - (b2 | 255)) >> 7) != 0) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                }
            }
            if (Ed25519.getLsb(jArr) == ((s2[31] & 255) >> 7)) {
                Ed25519.neg(jArr, jArr);
            }
            Field25519.mult(jArr3, jArr, jArrExpand);
            return new XYZT(new XYZ(jArr, jArrExpand, jArr2), jArr3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromPartialXYZT(XYZT out, PartialXYZT in) {
            Field25519.mult(out.xyz.f3528x, in.xyz.f3528x, in.f3527t);
            Field25519.mult(out.xyz.f3529y, in.xyz.f3529y, in.xyz.f3530z);
            Field25519.mult(out.xyz.f3530z, in.xyz.f3530z, in.f3527t);
            Field25519.mult(out.f3531t, in.xyz.f3528x, in.xyz.f3529y);
            return out;
        }
    }

    private Ed25519() {
    }

    private static void add(PartialXYZT partialXYZT, XYZT extended, CachedXYT cached) {
        long[] jArr = new long[10];
        Field25519.sum(partialXYZT.xyz.f3528x, extended.xyz.f3529y, extended.xyz.f3528x);
        Field25519.sub(partialXYZT.xyz.f3529y, extended.xyz.f3529y, extended.xyz.f3528x);
        Field25519.mult(partialXYZT.xyz.f3529y, partialXYZT.xyz.f3529y, cached.yMinusX);
        Field25519.mult(partialXYZT.xyz.f3530z, partialXYZT.xyz.f3528x, cached.yPlusX);
        Field25519.mult(partialXYZT.f3527t, extended.f3531t, cached.t2d);
        cached.multByZ(partialXYZT.xyz.f3528x, extended.xyz.f3530z);
        Field25519.sum(jArr, partialXYZT.xyz.f3528x, partialXYZT.xyz.f3528x);
        Field25519.sub(partialXYZT.xyz.f3528x, partialXYZT.xyz.f3530z, partialXYZT.xyz.f3529y);
        Field25519.sum(partialXYZT.xyz.f3529y, partialXYZT.xyz.f3530z, partialXYZT.xyz.f3529y);
        Field25519.sum(partialXYZT.xyz.f3530z, jArr, partialXYZT.f3527t);
        Field25519.sub(partialXYZT.f3527t, jArr, partialXYZT.f3527t);
    }

    private static XYZ doubleScalarMultVarTime(byte[] a2, XYZT pointA, byte[] b2) {
        CachedXYZT[] cachedXYZTArr = new CachedXYZT[8];
        cachedXYZTArr[0] = new CachedXYZT(pointA);
        PartialXYZT partialXYZT = new PartialXYZT();
        doubleXYZT(partialXYZT, pointA);
        XYZT xyzt = new XYZT(partialXYZT);
        for (int i2 = 1; i2 < 8; i2++) {
            add(partialXYZT, xyzt, cachedXYZTArr[i2 - 1]);
            cachedXYZTArr[i2] = new CachedXYZT(new XYZT(partialXYZT));
        }
        byte[] bArrSlide = slide(a2);
        byte[] bArrSlide2 = slide(b2);
        PartialXYZT partialXYZT2 = new PartialXYZT(NEUTRAL);
        XYZT xyzt2 = new XYZT();
        int i3 = 255;
        while (i3 >= 0 && bArrSlide[i3] == 0 && bArrSlide2[i3] == 0) {
            i3--;
        }
        while (i3 >= 0) {
            doubleXYZ(partialXYZT2, new XYZ(partialXYZT2));
            byte b3 = bArrSlide[i3];
            if (b3 > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), cachedXYZTArr[bArrSlide[i3] / 2]);
            } else if (b3 < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), cachedXYZTArr[(-bArrSlide[i3]) / 2]);
            }
            byte b4 = bArrSlide2[i3];
            if (b4 > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), Ed25519Constants.B2[bArrSlide2[i3] / 2]);
            } else if (b4 < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), Ed25519Constants.B2[(-bArrSlide2[i3]) / 2]);
            }
            i3--;
        }
        return new XYZ(partialXYZT2);
    }

    private static void doubleXYZ(PartialXYZT partialXYZT, XYZ p2) {
        long[] jArr = new long[10];
        Field25519.square(partialXYZT.xyz.f3528x, p2.f3528x);
        Field25519.square(partialXYZT.xyz.f3530z, p2.f3529y);
        Field25519.square(partialXYZT.f3527t, p2.f3530z);
        Field25519.sum(partialXYZT.f3527t, partialXYZT.f3527t, partialXYZT.f3527t);
        Field25519.sum(partialXYZT.xyz.f3529y, p2.f3528x, p2.f3529y);
        Field25519.square(jArr, partialXYZT.xyz.f3529y);
        Field25519.sum(partialXYZT.xyz.f3529y, partialXYZT.xyz.f3530z, partialXYZT.xyz.f3528x);
        Field25519.sub(partialXYZT.xyz.f3530z, partialXYZT.xyz.f3530z, partialXYZT.xyz.f3528x);
        Field25519.sub(partialXYZT.xyz.f3528x, jArr, partialXYZT.xyz.f3529y);
        Field25519.sub(partialXYZT.f3527t, partialXYZT.f3527t, partialXYZT.xyz.f3530z);
    }

    private static void doubleXYZT(PartialXYZT partialXYZT, XYZT p2) {
        doubleXYZ(partialXYZT, p2.xyz);
    }

    private static int eq(int a2, int b2) {
        int i2 = (~(a2 ^ b2)) & 255;
        int i3 = i2 & (i2 << 4);
        int i4 = i3 & (i3 << 2);
        int i5 = i4 << 1;
        return (((i4 + i5) - (i4 | i5)) >> 7) & 1;
    }

    static byte[] getHashedScalar(final byte[] privateKey) throws GeneralSecurityException {
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(privateKey, 0, 32);
        byte[] bArrDigest = engineFactory.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b2 = (byte) ((-1) - (((-1) - bArrDigest[31]) | ((-1) - 127)));
        bArrDigest[31] = b2;
        bArrDigest[31] = (byte) ((b2 + 64) - (b2 & 64));
        return bArrDigest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLsb(long[] in) {
        return (-1) - (((-1) - Field25519.contract(in)[0]) | ((-1) - 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNonZeroVarTime(long[] in) {
        long[] jArr = new long[in.length + 1];
        System.arraycopy(in, 0, jArr, 0, in.length);
        Field25519.reduceCoefficients(jArr);
        byte[] bArrContract = Field25519.contract(jArr);
        for (byte b2 : bArrContract) {
            if (b2 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSmallerThanGroupOrder(byte[] s2) {
        for (int i2 = 31; i2 >= 0; i2--) {
            byte b2 = s2[i2];
            int i3 = (b2 + 255) - (b2 | 255);
            byte b3 = GROUP_ORDER[i2];
            int i4 = (b3 + 255) - (b3 | 255);
            if (i3 != i4) {
                return i3 < i4;
            }
        }
        return false;
    }

    private static long load3(byte[] in, int idx) {
        long j2 = in[idx];
        long j3 = (j2 + 255) - (j2 | 255);
        byte b2 = in[idx + 1];
        long j4 = (-1) - (((-1) - j3) & ((-1) - (((long) ((b2 + 255) - (b2 | 255))) << 8)));
        byte b3 = in[idx + 2];
        return (((long) ((b3 + 255) - (b3 | 255))) << 16) | j4;
    }

    private static long load4(byte[] in, int idx) {
        long jLoad3 = load3(in, idx);
        byte b2 = in[idx + 3];
        return (-1) - (((-1) - (((long) ((b2 + 255) - (b2 | 255))) << 24)) & ((-1) - jLoad3));
    }

    private static void mulAdd(byte[] s2, byte[] a2, byte[] b2, byte[] c2) {
        long jLoad3 = (-1) - (((-1) - load3(a2, 0)) | ((-1) - 2097151));
        long jLoad4 = (load4(a2, 2) >> 5) & 2097151;
        long jLoad32 = (load3(a2, 5) >> 2) & 2097151;
        long jLoad42 = load4(a2, 7) >> 7;
        long j2 = (jLoad42 + 2097151) - (jLoad42 | 2097151);
        long jLoad43 = load4(a2, 10) >> 4;
        long j3 = (jLoad43 + 2097151) - (jLoad43 | 2097151);
        long jLoad33 = (load3(a2, 13) >> 1) & 2097151;
        long jLoad44 = (load4(a2, 15) >> 6) & 2097151;
        long jLoad34 = (load3(a2, 18) >> 3) & 2097151;
        long jLoad35 = load3(a2, 21) & 2097151;
        long jLoad45 = load4(a2, 23) >> 5;
        long j4 = (jLoad45 + 2097151) - (jLoad45 | 2097151);
        long jLoad36 = load3(a2, 26) >> 2;
        long j5 = (jLoad36 + 2097151) - (jLoad36 | 2097151);
        long jLoad46 = load4(a2, 28) >> 7;
        long jLoad37 = load3(b2, 0) & 2097151;
        long jLoad47 = (load4(b2, 2) >> 5) & 2097151;
        long jLoad38 = load3(b2, 5) >> 2;
        long j6 = (jLoad38 + 2097151) - (jLoad38 | 2097151);
        long jLoad48 = (-1) - (((-1) - (load4(b2, 7) >> 7)) | ((-1) - 2097151));
        long jLoad49 = (-1) - (((-1) - (load4(b2, 10) >> 4)) | ((-1) - 2097151));
        long jLoad39 = (load3(b2, 13) >> 1) & 2097151;
        long jLoad410 = load4(b2, 15) >> 6;
        long j7 = (jLoad410 + 2097151) - (jLoad410 | 2097151);
        long jLoad310 = (-1) - (((-1) - (load3(b2, 18) >> 3)) | ((-1) - 2097151));
        long jLoad311 = load3(b2, 21) & 2097151;
        long jLoad411 = (load4(b2, 23) >> 5) & 2097151;
        long jLoad312 = load3(b2, 26) >> 2;
        long j8 = (jLoad312 + 2097151) - (jLoad312 | 2097151);
        long jLoad412 = load4(b2, 28) >> 7;
        long jLoad313 = load3(c2, 0) & 2097151;
        long jLoad413 = (load4(c2, 2) >> 5) & 2097151;
        long jLoad314 = (load3(c2, 5) >> 2) & 2097151;
        long jLoad414 = load4(c2, 7) >> 7;
        long j9 = (jLoad414 + 2097151) - (jLoad414 | 2097151);
        long jLoad415 = (-1) - (((-1) - (load4(c2, 10) >> 4)) | ((-1) - 2097151));
        long jLoad315 = load3(c2, 13) >> 1;
        long j10 = (jLoad315 + 2097151) - (jLoad315 | 2097151);
        long jLoad416 = (-1) - (((-1) - (load4(c2, 15) >> 6)) | ((-1) - 2097151));
        long jLoad316 = (-1) - (((-1) - (load3(c2, 18) >> 3)) | ((-1) - 2097151));
        long jLoad317 = (-1) - (((-1) - load3(c2, 21)) | ((-1) - 2097151));
        long j11 = jLoad313 + (jLoad3 * jLoad37);
        long j12 = jLoad413 + (jLoad3 * jLoad47) + (jLoad4 * jLoad37);
        long j13 = jLoad314 + (jLoad3 * j6) + (jLoad4 * jLoad47) + (jLoad32 * jLoad37);
        long j14 = j9 + (jLoad3 * jLoad48) + (jLoad4 * j6) + (jLoad32 * jLoad47) + (j2 * jLoad37);
        long j15 = jLoad415 + (jLoad3 * jLoad49) + (jLoad4 * jLoad48) + (jLoad32 * j6) + (j2 * jLoad47) + (j3 * jLoad37);
        long j16 = j10 + (jLoad3 * jLoad39) + (jLoad4 * jLoad49) + (jLoad32 * jLoad48) + (j2 * j6) + (j3 * jLoad47) + (jLoad33 * jLoad37);
        long j17 = jLoad416 + (jLoad3 * j7) + (jLoad4 * jLoad39) + (jLoad32 * jLoad49) + (j2 * jLoad48) + (j3 * j6) + (jLoad33 * jLoad47) + (jLoad44 * jLoad37);
        long j18 = jLoad316 + (jLoad3 * jLoad310) + (jLoad4 * j7) + (jLoad32 * jLoad39) + (j2 * jLoad49) + (j3 * jLoad48) + (jLoad33 * j6) + (jLoad44 * jLoad47) + (jLoad34 * jLoad37);
        long j19 = jLoad317 + (jLoad3 * jLoad311) + (jLoad4 * jLoad310) + (jLoad32 * j7) + (j2 * jLoad39) + (j3 * jLoad49) + (jLoad33 * jLoad48) + (jLoad44 * j6) + (jLoad34 * jLoad47) + (jLoad35 * jLoad37);
        long jLoad417 = ((-1) - (((-1) - (load4(c2, 23) >> 5)) | ((-1) - 2097151))) + (jLoad3 * jLoad411) + (jLoad4 * jLoad311) + (jLoad32 * jLoad310) + (j2 * j7) + (j3 * jLoad39) + (jLoad33 * jLoad49) + (jLoad44 * jLoad48) + (jLoad34 * j6) + (jLoad35 * jLoad47) + (j4 * jLoad37);
        long jLoad318 = ((-1) - (((-1) - (load3(c2, 26) >> 2)) | ((-1) - 2097151))) + (jLoad3 * j8) + (jLoad4 * jLoad411) + (jLoad32 * jLoad311) + (j2 * jLoad310) + (j3 * j7) + (jLoad33 * jLoad39) + (jLoad44 * jLoad49) + (jLoad34 * jLoad48) + (jLoad35 * j6) + (j4 * jLoad47) + (j5 * jLoad37);
        long jLoad418 = (load4(c2, 28) >> 7) + (jLoad3 * jLoad412) + (jLoad4 * j8) + (jLoad32 * jLoad411) + (j2 * jLoad311) + (j3 * jLoad310) + (jLoad33 * j7) + (jLoad44 * jLoad39) + (jLoad34 * jLoad49) + (jLoad35 * jLoad48) + (j4 * j6) + (j5 * jLoad47) + (jLoad37 * jLoad46);
        long j20 = (jLoad4 * jLoad412) + (jLoad32 * j8) + (j2 * jLoad411) + (j3 * jLoad311) + (jLoad33 * jLoad310) + (jLoad44 * j7) + (jLoad34 * jLoad39) + (jLoad35 * jLoad49) + (j4 * jLoad48) + (j5 * j6) + (jLoad47 * jLoad46);
        long j21 = (jLoad32 * jLoad412) + (j2 * j8) + (j3 * jLoad411) + (jLoad33 * jLoad311) + (jLoad44 * jLoad310) + (jLoad34 * j7) + (jLoad35 * jLoad39) + (j4 * jLoad49) + (j5 * jLoad48) + (j6 * jLoad46);
        long j22 = (j2 * jLoad412) + (j3 * j8) + (jLoad33 * jLoad411) + (jLoad44 * jLoad311) + (jLoad34 * jLoad310) + (jLoad35 * j7) + (j4 * jLoad39) + (j5 * jLoad49) + (jLoad48 * jLoad46);
        long j23 = (j3 * jLoad412) + (jLoad33 * j8) + (jLoad44 * jLoad411) + (jLoad34 * jLoad311) + (jLoad35 * jLoad310) + (j4 * j7) + (j5 * jLoad39) + (jLoad49 * jLoad46);
        long j24 = (jLoad33 * jLoad412) + (jLoad44 * j8) + (jLoad34 * jLoad411) + (jLoad35 * jLoad311) + (j4 * jLoad310) + (j5 * j7) + (jLoad39 * jLoad46);
        long j25 = (jLoad44 * jLoad412) + (jLoad34 * j8) + (jLoad35 * jLoad411) + (j4 * jLoad311) + (j5 * jLoad310) + (j7 * jLoad46);
        long j26 = (jLoad34 * jLoad412) + (jLoad35 * j8) + (j4 * jLoad411) + (j5 * jLoad311) + (jLoad310 * jLoad46);
        long j27 = (jLoad35 * jLoad412) + (j4 * j8) + (j5 * jLoad411) + (jLoad311 * jLoad46);
        long j28 = (j4 * jLoad412) + (j5 * j8) + (jLoad411 * jLoad46);
        long j29 = (j5 * jLoad412) + (j8 * jLoad46);
        long j30 = jLoad46 * jLoad412;
        long j31 = (j11 + 1048576) >> 21;
        long j32 = j12 + j31;
        long j33 = j11 - (j31 << 21);
        long j34 = (j13 + 1048576) >> 21;
        long j35 = j14 + j34;
        long j36 = j13 - (j34 << 21);
        long j37 = (j15 + 1048576) >> 21;
        long j38 = j16 + j37;
        long j39 = j15 - (j37 << 21);
        long j40 = (j17 + 1048576) >> 21;
        long j41 = j18 + j40;
        long j42 = j17 - (j40 << 21);
        long j43 = (j19 + 1048576) >> 21;
        long j44 = jLoad417 + j43;
        long j45 = j19 - (j43 << 21);
        long j46 = (jLoad318 + 1048576) >> 21;
        long j47 = jLoad418 + j46;
        long j48 = jLoad318 - (j46 << 21);
        long j49 = (j20 + 1048576) >> 21;
        long j50 = j21 + j49;
        long j51 = j20 - (j49 << 21);
        long j52 = (j22 + 1048576) >> 21;
        long j53 = j23 + j52;
        long j54 = j22 - (j52 << 21);
        long j55 = (j24 + 1048576) >> 21;
        long j56 = j25 + j55;
        long j57 = j24 - (j55 << 21);
        long j58 = (j26 + 1048576) >> 21;
        long j59 = j27 + j58;
        long j60 = j26 - (j58 << 21);
        long j61 = (j28 + 1048576) >> 21;
        long j62 = j29 + j61;
        long j63 = j28 - (j61 << 21);
        long j64 = (j30 + 1048576) >> 21;
        long j65 = (j32 + 1048576) >> 21;
        long j66 = j36 + j65;
        long j67 = j32 - (j65 << 21);
        long j68 = (j35 + 1048576) >> 21;
        long j69 = j39 + j68;
        long j70 = j35 - (j68 << 21);
        long j71 = (j38 + 1048576) >> 21;
        long j72 = j42 + j71;
        long j73 = j38 - (j71 << 21);
        long j74 = (j41 + 1048576) >> 21;
        long j75 = j45 + j74;
        long j76 = j41 - (j74 << 21);
        long j77 = (j44 + 1048576) >> 21;
        long j78 = j48 + j77;
        long j79 = j44 - (j77 << 21);
        long j80 = (j47 + 1048576) >> 21;
        long j81 = j51 + j80;
        long j82 = j47 - (j80 << 21);
        long j83 = (j50 + 1048576) >> 21;
        long j84 = j54 + j83;
        long j85 = j50 - (j83 << 21);
        long j86 = (j53 + 1048576) >> 21;
        long j87 = j57 + j86;
        long j88 = j53 - (j86 << 21);
        long j89 = (j56 + 1048576) >> 21;
        long j90 = j60 + j89;
        long j91 = j56 - (j89 << 21);
        long j92 = (j59 + 1048576) >> 21;
        long j93 = j63 + j92;
        long j94 = j59 - (j92 << 21);
        long j95 = (j62 + 1048576) >> 21;
        long j96 = (j30 - (j64 << 21)) + j95;
        long j97 = j62 - (j95 << 21);
        long j98 = j87 - (j64 * 683901);
        long j99 = ((j84 - (j64 * 997805)) + (j96 * 136657)) - (j97 * 683901);
        long j100 = ((((j81 + (j64 * 470296)) + (j96 * 654183)) - (j97 * 997805)) + (j93 * 136657)) - (j94 * 683901);
        long j101 = j72 + (j90 * 666643);
        long j102 = j75 + (j93 * 666643) + (j94 * 470296) + (j90 * 654183);
        long j103 = ((((j78 + (j96 * 666643)) + (j97 * 470296)) + (j93 * 654183)) - (j94 * 997805)) + (j90 * 136657);
        long j104 = (j101 + 1048576) >> 21;
        long j105 = j76 + (j94 * 666643) + (j90 * 470296) + j104;
        long j106 = j101 - (j104 << 21);
        long j107 = (j102 + 1048576) >> 21;
        long j108 = ((((j79 + (j97 * 666643)) + (j93 * 470296)) + (j94 * 654183)) - (j90 * 997805)) + j107;
        long j109 = j102 - (j107 << 21);
        long j110 = (j103 + 1048576) >> 21;
        long j111 = ((((((j82 + (j64 * 666643)) + (j96 * 470296)) + (j97 * 654183)) - (j93 * 997805)) + (j94 * 136657)) - (j90 * 683901)) + j110;
        long j112 = j103 - (j110 << 21);
        long j113 = (j100 + 1048576) >> 21;
        long j114 = ((((j85 + (j64 * 654183)) - (j96 * 997805)) + (j97 * 136657)) - (j93 * 683901)) + j113;
        long j115 = j100 - (j113 << 21);
        long j116 = (j99 + 1048576) >> 21;
        long j117 = ((j88 + (j64 * 136657)) - (j96 * 683901)) + j116;
        long j118 = j99 - (j116 << 21);
        long j119 = (j98 + 1048576) >> 21;
        long j120 = j91 + j119;
        long j121 = j98 - (j119 << 21);
        long j122 = (j105 + 1048576) >> 21;
        long j123 = j109 + j122;
        long j124 = j105 - (j122 << 21);
        long j125 = (j108 + 1048576) >> 21;
        long j126 = j112 + j125;
        long j127 = j108 - (j125 << 21);
        long j128 = (j111 + 1048576) >> 21;
        long j129 = j115 + j128;
        long j130 = j111 - (j128 << 21);
        long j131 = (j114 + 1048576) >> 21;
        long j132 = j118 + j131;
        long j133 = j114 - (j131 << 21);
        long j134 = (j117 + 1048576) >> 21;
        long j135 = j121 + j134;
        long j136 = j117 - (j134 << 21);
        long j137 = j126 - (j120 * 683901);
        long j138 = ((j123 - (j120 * 997805)) + (j135 * 136657)) - (j136 * 683901);
        long j139 = ((((j106 + (j120 * 470296)) + (j135 * 654183)) - (j136 * 997805)) + (j132 * 136657)) - (j133 * 683901);
        long j140 = j33 + (j129 * 666643);
        long j141 = j66 + (j132 * 666643) + (j133 * 470296) + (j129 * 654183);
        long j142 = ((((j69 + (j135 * 666643)) + (j136 * 470296)) + (j132 * 654183)) - (j133 * 997805)) + (j129 * 136657);
        long j143 = (j140 + 1048576) >> 21;
        long j144 = j67 + (j133 * 666643) + (j129 * 470296) + j143;
        long j145 = j140 - (j143 << 21);
        long j146 = (j141 + 1048576) >> 21;
        long j147 = ((((j70 + (j136 * 666643)) + (j132 * 470296)) + (j133 * 654183)) - (j129 * 997805)) + j146;
        long j148 = j141 - (j146 << 21);
        long j149 = (j142 + 1048576) >> 21;
        long j150 = ((((((j73 + (j120 * 666643)) + (j135 * 470296)) + (j136 * 654183)) - (j132 * 997805)) + (j133 * 136657)) - (j129 * 683901)) + j149;
        long j151 = j142 - (j149 << 21);
        long j152 = (j139 + 1048576) >> 21;
        long j153 = ((((j124 + (j120 * 654183)) - (j135 * 997805)) + (j136 * 136657)) - (j132 * 683901)) + j152;
        long j154 = j139 - (j152 << 21);
        long j155 = (j138 + 1048576) >> 21;
        long j156 = ((j127 + (j120 * 136657)) - (j135 * 683901)) + j155;
        long j157 = j138 - (j155 << 21);
        long j158 = (j137 + 1048576) >> 21;
        long j159 = j130 + j158;
        long j160 = j137 - (j158 << 21);
        long j161 = (j144 + 1048576) >> 21;
        long j162 = j148 + j161;
        long j163 = j144 - (j161 << 21);
        long j164 = (j147 + 1048576) >> 21;
        long j165 = j151 + j164;
        long j166 = j147 - (j164 << 21);
        long j167 = (j150 + 1048576) >> 21;
        long j168 = j154 + j167;
        long j169 = j150 - (j167 << 21);
        long j170 = (j153 + 1048576) >> 21;
        long j171 = j157 + j170;
        long j172 = j153 - (j170 << 21);
        long j173 = (j156 + 1048576) >> 21;
        long j174 = j160 + j173;
        long j175 = j156 - (j173 << 21);
        long j176 = (1048576 + j159) >> 21;
        long j177 = j145 + (j176 * 666643);
        long j178 = j177 >> 21;
        long j179 = j163 + (j176 * 470296) + j178;
        long j180 = j177 - (j178 << 21);
        long j181 = j179 >> 21;
        long j182 = j162 + (j176 * 654183) + j181;
        long j183 = j179 - (j181 << 21);
        long j184 = j182 >> 21;
        long j185 = (j166 - (j176 * 997805)) + j184;
        long j186 = j182 - (j184 << 21);
        long j187 = j185 >> 21;
        long j188 = j165 + (j176 * 136657) + j187;
        long j189 = j185 - (j187 << 21);
        long j190 = j188 >> 21;
        long j191 = (j169 - (j176 * 683901)) + j190;
        long j192 = j188 - (j190 << 21);
        long j193 = j191 >> 21;
        long j194 = j168 + j193;
        long j195 = j191 - (j193 << 21);
        long j196 = j194 >> 21;
        long j197 = j172 + j196;
        long j198 = j194 - (j196 << 21);
        long j199 = j197 >> 21;
        long j200 = j171 + j199;
        long j201 = j197 - (j199 << 21);
        long j202 = j200 >> 21;
        long j203 = j175 + j202;
        long j204 = j200 - (j202 << 21);
        long j205 = j203 >> 21;
        long j206 = j174 + j205;
        long j207 = j203 - (j205 << 21);
        long j208 = j206 >> 21;
        long j209 = (j159 - (j176 << 21)) + j208;
        long j210 = j206 - (j208 << 21);
        long j211 = j209 >> 21;
        long j212 = j180 + (666643 * j211);
        long j213 = j212 >> 21;
        long j214 = j183 + (470296 * j211) + j213;
        long j215 = j212 - (j213 << 21);
        long j216 = j214 >> 21;
        long j217 = j186 + (654183 * j211) + j216;
        long j218 = j214 - (j216 << 21);
        long j219 = j217 >> 21;
        long j220 = (j189 - (997805 * j211)) + j219;
        long j221 = j217 - (j219 << 21);
        long j222 = j220 >> 21;
        long j223 = j192 + (136657 * j211) + j222;
        long j224 = j220 - (j222 << 21);
        long j225 = j223 >> 21;
        long j226 = (j195 - (j211 * 683901)) + j225;
        long j227 = j223 - (j225 << 21);
        long j228 = j226 >> 21;
        long j229 = j198 + j228;
        long j230 = j226 - (j228 << 21);
        long j231 = j229 >> 21;
        long j232 = j201 + j231;
        long j233 = j229 - (j231 << 21);
        long j234 = j232 >> 21;
        long j235 = j204 + j234;
        long j236 = j232 - (j234 << 21);
        long j237 = j235 >> 21;
        long j238 = j207 + j237;
        long j239 = j235 - (j237 << 21);
        long j240 = j238 >> 21;
        long j241 = j210 + j240;
        long j242 = j238 - (j240 << 21);
        long j243 = j241 >> 21;
        long j244 = (j209 - (j211 << 21)) + j243;
        long j245 = j241 - (j243 << 21);
        s2[0] = (byte) j215;
        s2[1] = (byte) (j215 >> 8);
        s2[2] = (byte) ((j215 >> 16) | (j218 << 5));
        s2[3] = (byte) (j218 >> 3);
        s2[4] = (byte) (j218 >> 11);
        long j246 = j218 >> 19;
        long j247 = j221 << 2;
        s2[5] = (byte) ((j246 + j247) - (j246 & j247));
        s2[6] = (byte) (j221 >> 6);
        s2[7] = (byte) ((j221 >> 14) | (j224 << 7));
        s2[8] = (byte) (j224 >> 1);
        s2[9] = (byte) (j224 >> 9);
        s2[10] = (byte) ((-1) - (((-1) - (j224 >> 17)) & ((-1) - (j227 << 4))));
        s2[11] = (byte) (j227 >> 4);
        s2[12] = (byte) (j227 >> 12);
        long j248 = j227 >> 20;
        long j249 = j230 << 1;
        s2[13] = (byte) ((j248 + j249) - (j248 & j249));
        s2[14] = (byte) (j230 >> 7);
        long j250 = j230 >> 15;
        long j251 = j233 << 6;
        s2[15] = (byte) ((j250 + j251) - (j250 & j251));
        s2[16] = (byte) (j233 >> 2);
        s2[17] = (byte) (j233 >> 10);
        s2[18] = (byte) ((j233 >> 18) | (j236 << 3));
        s2[19] = (byte) (j236 >> 5);
        s2[20] = (byte) (j236 >> 13);
        s2[21] = (byte) j239;
        s2[22] = (byte) (j239 >> 8);
        long j252 = j239 >> 16;
        long j253 = j242 << 5;
        s2[23] = (byte) ((j252 + j253) - (j252 & j253));
        s2[24] = (byte) (j242 >> 3);
        s2[25] = (byte) (j242 >> 11);
        s2[26] = (byte) ((-1) - (((-1) - (j242 >> 19)) & ((-1) - (j245 << 2))));
        s2[27] = (byte) (j245 >> 6);
        s2[28] = (byte) ((-1) - (((-1) - (j245 >> 14)) & ((-1) - (j244 << 7))));
        s2[29] = (byte) (j244 >> 1);
        s2[30] = (byte) (j244 >> 9);
        s2[31] = (byte) (j244 >> 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neg(long[] out, long[] in) {
        for (int i2 = 0; i2 < in.length; i2++) {
            out[i2] = -in[i2];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pow2252m3(long[] out, long[] in) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        Field25519.square(jArr, in);
        Field25519.square(jArr2, jArr);
        Field25519.square(jArr2, jArr2);
        Field25519.mult(jArr2, in, jArr2);
        Field25519.mult(jArr, jArr, jArr2);
        Field25519.square(jArr, jArr);
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr2, jArr);
        for (int i2 = 1; i2 < 5; i2++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr2, jArr);
        for (int i3 = 1; i3 < 10; i3++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr2, jArr2, jArr);
        Field25519.square(jArr3, jArr2);
        for (int i4 = 1; i4 < 20; i4++) {
            Field25519.square(jArr3, jArr3);
        }
        Field25519.mult(jArr2, jArr3, jArr2);
        Field25519.square(jArr2, jArr2);
        for (int i5 = 1; i5 < 10; i5++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr2, jArr);
        for (int i6 = 1; i6 < 50; i6++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr2, jArr2, jArr);
        Field25519.square(jArr3, jArr2);
        for (int i7 = 1; i7 < 100; i7++) {
            Field25519.square(jArr3, jArr3);
        }
        Field25519.mult(jArr2, jArr3, jArr2);
        Field25519.square(jArr2, jArr2);
        for (int i8 = 1; i8 < 50; i8++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr, jArr);
        Field25519.square(jArr, jArr);
        Field25519.mult(out, jArr, in);
    }

    private static void reduce(byte[] s2) {
        long jLoad3 = load3(s2, 0);
        long j2 = (jLoad3 + 2097151) - (jLoad3 | 2097151);
        long jLoad4 = load4(s2, 2) >> 5;
        long j3 = (jLoad4 + 2097151) - (jLoad4 | 2097151);
        long jLoad32 = (-1) - (((-1) - (load3(s2, 5) >> 2)) | ((-1) - 2097151));
        long jLoad42 = load4(s2, 7) >> 7;
        long j4 = (jLoad42 + 2097151) - (jLoad42 | 2097151);
        long jLoad43 = (load4(s2, 10) >> 4) & 2097151;
        long jLoad33 = (load3(s2, 13) >> 1) & 2097151;
        long jLoad44 = (-1) - (((-1) - (load4(s2, 15) >> 6)) | ((-1) - 2097151));
        long jLoad34 = (-1) - (((-1) - (load3(s2, 18) >> 3)) | ((-1) - 2097151));
        long jLoad35 = (-1) - (((-1) - load3(s2, 21)) | ((-1) - 2097151));
        long jLoad45 = (-1) - (((-1) - (load4(s2, 23) >> 5)) | ((-1) - 2097151));
        long jLoad36 = (-1) - (((-1) - (load3(s2, 26) >> 2)) | ((-1) - 2097151));
        long jLoad46 = (load4(s2, 28) >> 7) & 2097151;
        long jLoad47 = (load4(s2, 31) >> 4) & 2097151;
        long jLoad37 = (load3(s2, 34) >> 1) & 2097151;
        long jLoad48 = (-1) - (((-1) - (load4(s2, 36) >> 6)) | ((-1) - 2097151));
        long jLoad38 = load3(s2, 39) >> 3;
        long j5 = (jLoad38 + 2097151) - (jLoad38 | 2097151);
        long jLoad39 = load3(s2, 42);
        long jLoad49 = (-1) - (((-1) - (load4(s2, 44) >> 5)) | ((-1) - 2097151));
        long jLoad310 = (-1) - (((-1) - (load3(s2, 47) >> 2)) | ((-1) - 2097151));
        long jLoad410 = (-1) - (((-1) - (load4(s2, 49) >> 7)) | ((-1) - 2097151));
        long jLoad411 = (-1) - (((-1) - (load4(s2, 52) >> 4)) | ((-1) - 2097151));
        long jLoad311 = (load3(s2, 55) >> 1) & 2097151;
        long jLoad412 = load4(s2, 57) >> 6;
        long j6 = (jLoad412 + 2097151) - (jLoad412 | 2097151);
        long jLoad413 = load4(s2, 60) >> 3;
        long j7 = ((jLoad39 + 2097151) - (jLoad39 | 2097151)) - (jLoad413 * 683901);
        long j8 = ((jLoad48 - (jLoad413 * 997805)) + (j6 * 136657)) - (jLoad311 * 683901);
        long j9 = ((((jLoad47 + (jLoad413 * 470296)) + (j6 * 654183)) - (jLoad311 * 997805)) + (jLoad411 * 136657)) - (jLoad410 * 683901);
        long j10 = jLoad44 + (jLoad310 * 666643);
        long j11 = jLoad35 + (jLoad411 * 666643) + (jLoad410 * 470296) + (jLoad310 * 654183);
        long j12 = ((((jLoad36 + (j6 * 666643)) + (jLoad311 * 470296)) + (jLoad411 * 654183)) - (jLoad410 * 997805)) + (jLoad310 * 136657);
        long j13 = (j10 + 1048576) >> 21;
        long j14 = jLoad34 + (jLoad410 * 666643) + (jLoad310 * 470296) + j13;
        long j15 = j10 - (j13 << 21);
        long j16 = (j11 + 1048576) >> 21;
        long j17 = ((((jLoad45 + (jLoad311 * 666643)) + (jLoad411 * 470296)) + (jLoad410 * 654183)) - (jLoad310 * 997805)) + j16;
        long j18 = j11 - (j16 << 21);
        long j19 = (j12 + 1048576) >> 21;
        long j20 = ((((((jLoad46 + (jLoad413 * 666643)) + (j6 * 470296)) + (jLoad311 * 654183)) - (jLoad411 * 997805)) + (jLoad410 * 136657)) - (jLoad310 * 683901)) + j19;
        long j21 = j12 - (j19 << 21);
        long j22 = (j9 + 1048576) >> 21;
        long j23 = ((((jLoad37 + (jLoad413 * 654183)) - (j6 * 997805)) + (jLoad311 * 136657)) - (jLoad411 * 683901)) + j22;
        long j24 = j9 - (j22 << 21);
        long j25 = (j8 + 1048576) >> 21;
        long j26 = ((j5 + (jLoad413 * 136657)) - (j6 * 683901)) + j25;
        long j27 = j8 - (j25 << 21);
        long j28 = (j7 + 1048576) >> 21;
        long j29 = jLoad49 + j28;
        long j30 = j7 - (j28 << 21);
        long j31 = (j14 + 1048576) >> 21;
        long j32 = j18 + j31;
        long j33 = j14 - (j31 << 21);
        long j34 = (j17 + 1048576) >> 21;
        long j35 = j21 + j34;
        long j36 = j17 - (j34 << 21);
        long j37 = (j20 + 1048576) >> 21;
        long j38 = j24 + j37;
        long j39 = j20 - (j37 << 21);
        long j40 = (j23 + 1048576) >> 21;
        long j41 = j27 + j40;
        long j42 = j23 - (j40 << 21);
        long j43 = (j26 + 1048576) >> 21;
        long j44 = j30 + j43;
        long j45 = j26 - (j43 << 21);
        long j46 = j35 - (j29 * 683901);
        long j47 = ((j32 - (j29 * 997805)) + (j44 * 136657)) - (j45 * 683901);
        long j48 = ((((j15 + (j29 * 470296)) + (j44 * 654183)) - (j45 * 997805)) + (j41 * 136657)) - (j42 * 683901);
        long j49 = j2 + (j38 * 666643);
        long j50 = jLoad32 + (j41 * 666643) + (j42 * 470296) + (j38 * 654183);
        long j51 = ((((jLoad43 + (j44 * 666643)) + (j45 * 470296)) + (j41 * 654183)) - (j42 * 997805)) + (j38 * 136657);
        long j52 = (j49 + 1048576) >> 21;
        long j53 = j3 + (j42 * 666643) + (j38 * 470296) + j52;
        long j54 = j49 - (j52 << 21);
        long j55 = (j50 + 1048576) >> 21;
        long j56 = ((((j4 + (j45 * 666643)) + (j41 * 470296)) + (j42 * 654183)) - (j38 * 997805)) + j55;
        long j57 = j50 - (j55 << 21);
        long j58 = (j51 + 1048576) >> 21;
        long j59 = ((((((jLoad33 + (j29 * 666643)) + (j44 * 470296)) + (j45 * 654183)) - (j41 * 997805)) + (j42 * 136657)) - (j38 * 683901)) + j58;
        long j60 = j51 - (j58 << 21);
        long j61 = (j48 + 1048576) >> 21;
        long j62 = ((((j33 + (j29 * 654183)) - (j44 * 997805)) + (j45 * 136657)) - (j41 * 683901)) + j61;
        long j63 = j48 - (j61 << 21);
        long j64 = (j47 + 1048576) >> 21;
        long j65 = ((j36 + (j29 * 136657)) - (j44 * 683901)) + j64;
        long j66 = j47 - (j64 << 21);
        long j67 = (j46 + 1048576) >> 21;
        long j68 = j39 + j67;
        long j69 = j46 - (j67 << 21);
        long j70 = (j53 + 1048576) >> 21;
        long j71 = j57 + j70;
        long j72 = j53 - (j70 << 21);
        long j73 = (j56 + 1048576) >> 21;
        long j74 = j60 + j73;
        long j75 = j56 - (j73 << 21);
        long j76 = (j59 + 1048576) >> 21;
        long j77 = j63 + j76;
        long j78 = j59 - (j76 << 21);
        long j79 = (j62 + 1048576) >> 21;
        long j80 = j66 + j79;
        long j81 = j62 - (j79 << 21);
        long j82 = (j65 + 1048576) >> 21;
        long j83 = j69 + j82;
        long j84 = j65 - (j82 << 21);
        long j85 = (j68 + 1048576) >> 21;
        long j86 = j54 + (j85 * 666643);
        long j87 = j86 >> 21;
        long j88 = j72 + (j85 * 470296) + j87;
        long j89 = j86 - (j87 << 21);
        long j90 = j88 >> 21;
        long j91 = j71 + (j85 * 654183) + j90;
        long j92 = j88 - (j90 << 21);
        long j93 = j91 >> 21;
        long j94 = (j75 - (j85 * 997805)) + j93;
        long j95 = j91 - (j93 << 21);
        long j96 = j94 >> 21;
        long j97 = j74 + (j85 * 136657) + j96;
        long j98 = j94 - (j96 << 21);
        long j99 = j97 >> 21;
        long j100 = (j78 - (j85 * 683901)) + j99;
        long j101 = j97 - (j99 << 21);
        long j102 = j100 >> 21;
        long j103 = j77 + j102;
        long j104 = j100 - (j102 << 21);
        long j105 = j103 >> 21;
        long j106 = j81 + j105;
        long j107 = j103 - (j105 << 21);
        long j108 = j106 >> 21;
        long j109 = j80 + j108;
        long j110 = j106 - (j108 << 21);
        long j111 = j109 >> 21;
        long j112 = j84 + j111;
        long j113 = j109 - (j111 << 21);
        long j114 = j112 >> 21;
        long j115 = j83 + j114;
        long j116 = j112 - (j114 << 21);
        long j117 = j115 >> 21;
        long j118 = (j68 - (j85 << 21)) + j117;
        long j119 = j115 - (j117 << 21);
        long j120 = j118 >> 21;
        long j121 = j89 + (666643 * j120);
        long j122 = j121 >> 21;
        long j123 = j92 + (470296 * j120) + j122;
        long j124 = j121 - (j122 << 21);
        long j125 = j123 >> 21;
        long j126 = j95 + (654183 * j120) + j125;
        long j127 = j123 - (j125 << 21);
        long j128 = j126 >> 21;
        long j129 = (j98 - (997805 * j120)) + j128;
        long j130 = j126 - (j128 << 21);
        long j131 = j129 >> 21;
        long j132 = j101 + (136657 * j120) + j131;
        long j133 = j129 - (j131 << 21);
        long j134 = j132 >> 21;
        long j135 = (j104 - (j120 * 683901)) + j134;
        long j136 = j132 - (j134 << 21);
        long j137 = j135 >> 21;
        long j138 = j107 + j137;
        long j139 = j135 - (j137 << 21);
        long j140 = j138 >> 21;
        long j141 = j110 + j140;
        long j142 = j138 - (j140 << 21);
        long j143 = j141 >> 21;
        long j144 = j113 + j143;
        long j145 = j141 - (j143 << 21);
        long j146 = j144 >> 21;
        long j147 = j116 + j146;
        long j148 = j144 - (j146 << 21);
        long j149 = j147 >> 21;
        long j150 = j119 + j149;
        long j151 = j147 - (j149 << 21);
        long j152 = j150 >> 21;
        long j153 = (j118 - (j120 << 21)) + j152;
        long j154 = j150 - (j152 << 21);
        s2[0] = (byte) j124;
        s2[1] = (byte) (j124 >> 8);
        long j155 = j124 >> 16;
        long j156 = j127 << 5;
        s2[2] = (byte) ((j155 + j156) - (j155 & j156));
        s2[3] = (byte) (j127 >> 3);
        s2[4] = (byte) (j127 >> 11);
        s2[5] = (byte) ((-1) - (((-1) - (j127 >> 19)) & ((-1) - (j130 << 2))));
        s2[6] = (byte) (j130 >> 6);
        long j157 = j130 >> 14;
        long j158 = j133 << 7;
        s2[7] = (byte) ((j157 + j158) - (j157 & j158));
        s2[8] = (byte) (j133 >> 1);
        s2[9] = (byte) (j133 >> 9);
        s2[10] = (byte) ((-1) - (((-1) - (j133 >> 17)) & ((-1) - (j136 << 4))));
        s2[11] = (byte) (j136 >> 4);
        s2[12] = (byte) (j136 >> 12);
        s2[13] = (byte) ((j136 >> 20) | (j139 << 1));
        s2[14] = (byte) (j139 >> 7);
        s2[15] = (byte) ((-1) - (((-1) - (j139 >> 15)) & ((-1) - (j142 << 6))));
        s2[16] = (byte) (j142 >> 2);
        s2[17] = (byte) (j142 >> 10);
        long j159 = j142 >> 18;
        long j160 = j145 << 3;
        s2[18] = (byte) ((j159 + j160) - (j159 & j160));
        s2[19] = (byte) (j145 >> 5);
        s2[20] = (byte) (j145 >> 13);
        s2[21] = (byte) j148;
        s2[22] = (byte) (j148 >> 8);
        s2[23] = (byte) ((-1) - (((-1) - (j148 >> 16)) & ((-1) - (j151 << 5))));
        s2[24] = (byte) (j151 >> 3);
        s2[25] = (byte) (j151 >> 11);
        long j161 = j151 >> 19;
        long j162 = j154 << 2;
        s2[26] = (byte) ((j161 + j162) - (j161 & j162));
        s2[27] = (byte) (j154 >> 6);
        long j163 = j154 >> 14;
        long j164 = j153 << 7;
        s2[28] = (byte) ((j163 + j164) - (j163 & j164));
        s2[29] = (byte) (j153 >> 1);
        s2[30] = (byte) (j153 >> 9);
        s2[31] = (byte) (j153 >> 17);
    }

    private static XYZ scalarMultWithBase(byte[] a2) {
        int i2;
        byte[] bArr = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 * 2;
            byte b2 = a2[i3];
            bArr[i4] = (byte) ((b2 + Ascii.SI) - (b2 | Ascii.SI));
            int i5 = ((-1) - (((-1) - a2[i3]) | ((-1) - 255))) >> 4;
            bArr[i4 + 1] = (byte) ((i5 + 15) - (i5 | 15));
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 63; i7++) {
            byte b3 = (byte) (bArr[i7] + i6);
            bArr[i7] = b3;
            i6 = (b3 + 8) >> 4;
            bArr[i7] = (byte) (b3 - (i6 << 4));
        }
        bArr[63] = (byte) (bArr[63] + i6);
        PartialXYZT partialXYZT = new PartialXYZT(NEUTRAL);
        XYZT xyzt = new XYZT();
        for (i2 = 1; i2 < 64; i2 += 2) {
            CachedXYT cachedXYT = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT, i2 / 2, bArr[i2]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT);
        }
        XYZ xyz = new XYZ();
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        for (int i8 = 0; i8 < 64; i8 += 2) {
            CachedXYT cachedXYT2 = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT2, i8 / 2, bArr[i8]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT2);
        }
        XYZ xyz2 = new XYZ(partialXYZT);
        if (xyz2.isOnCurve()) {
            return xyz2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    static byte[] scalarMultWithBaseToBytes(byte[] a2) {
        return scalarMultWithBase(a2).toBytes();
    }

    private static void select(CachedXYT t2, int pos, byte b2) {
        int i2 = ((b2 + 255) - (255 | b2)) >> 7;
        int i3 = b2 - (((-1) - (((-1) - (-i2)) | ((-1) - b2))) << 1);
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][0], eq(i3, 1));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][1], eq(i3, 2));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][2], eq(i3, 3));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][3], eq(i3, 4));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][4], eq(i3, 5));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][5], eq(i3, 6));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][6], eq(i3, 7));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][7], eq(i3, 8));
        long[] jArrCopyOf = Arrays.copyOf(t2.yMinusX, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(t2.yPlusX, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(t2.t2d, 10);
        neg(jArrCopyOf3, jArrCopyOf3);
        t2.copyConditional(new CachedXYT(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i2);
    }

    static byte[] sign(final byte[] message, final byte[] publicKey, final byte[] hashedPrivateKey) throws GeneralSecurityException {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(message, 0, message.length);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(hashedPrivateKey, 32, 32);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest = engineFactory.digest();
        reduce(bArrDigest);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(scalarMultWithBase(bArrDigest).toBytes(), 0, 32);
        engineFactory.reset();
        engineFactory.update(bArrCopyOfRange2);
        engineFactory.update(publicKey);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest2 = engineFactory.digest();
        reduce(bArrDigest2);
        byte[] bArr = new byte[32];
        mulAdd(bArr, bArrDigest2, hashedPrivateKey, bArrDigest);
        return Bytes.concat(bArrCopyOfRange2, bArr);
    }

    private static byte[] slide(byte[] a2) {
        int i2;
        byte[] bArr = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            byte b2 = a2[i3 >> 3];
            bArr[i3] = (byte) (1 & (((b2 + 255) - (b2 | 255)) >> ((-1) - (((-1) - i3) | ((-1) - 7)))));
        }
        for (int i4 = 0; i4 < 256; i4++) {
            if (bArr[i4] != 0) {
                for (int i5 = 1; i5 <= 6 && (i2 = i4 + i5) < 256; i5++) {
                    byte b3 = bArr[i2];
                    if (b3 != 0) {
                        byte b4 = bArr[i4];
                        if ((b3 << i5) + b4 <= 15) {
                            bArr[i4] = (byte) (b4 + (b3 << i5));
                            bArr[i2] = 0;
                        } else if (b4 - (b3 << i5) >= -15) {
                            bArr[i4] = (byte) (b4 - (b3 << i5));
                            while (true) {
                                if (i2 >= 256) {
                                    break;
                                }
                                if (bArr[i2] == 0) {
                                    bArr[i2] = 1;
                                    break;
                                }
                                bArr[i2] = 0;
                                i2++;
                            }
                        }
                    }
                }
            }
        }
        return bArr;
    }

    private static void sub(PartialXYZT partialXYZT, XYZT extended, CachedXYT cached) {
        long[] jArr = new long[10];
        Field25519.sum(partialXYZT.xyz.f3528x, extended.xyz.f3529y, extended.xyz.f3528x);
        Field25519.sub(partialXYZT.xyz.f3529y, extended.xyz.f3529y, extended.xyz.f3528x);
        Field25519.mult(partialXYZT.xyz.f3529y, partialXYZT.xyz.f3529y, cached.yPlusX);
        Field25519.mult(partialXYZT.xyz.f3530z, partialXYZT.xyz.f3528x, cached.yMinusX);
        Field25519.mult(partialXYZT.f3527t, extended.f3531t, cached.t2d);
        cached.multByZ(partialXYZT.xyz.f3528x, extended.xyz.f3530z);
        Field25519.sum(jArr, partialXYZT.xyz.f3528x, partialXYZT.xyz.f3528x);
        Field25519.sub(partialXYZT.xyz.f3528x, partialXYZT.xyz.f3530z, partialXYZT.xyz.f3529y);
        Field25519.sum(partialXYZT.xyz.f3529y, partialXYZT.xyz.f3530z, partialXYZT.xyz.f3529y);
        Field25519.sub(partialXYZT.xyz.f3530z, jArr, partialXYZT.f3527t);
        Field25519.sum(partialXYZT.f3527t, jArr, partialXYZT.f3527t);
    }

    static boolean verify(final byte[] message, final byte[] signature, final byte[] publicKey) throws GeneralSecurityException {
        if (signature.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(signature, 32, 64);
        if (!isSmallerThanGroupOrder(bArrCopyOfRange)) {
            return false;
        }
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(signature, 0, 32);
        engineFactory.update(publicKey);
        engineFactory.update(message);
        byte[] bArrDigest = engineFactory.digest();
        reduce(bArrDigest);
        byte[] bytes = doubleScalarMultVarTime(bArrDigest, XYZT.fromBytesNegateVarTime(publicKey), bArrCopyOfRange).toBytes();
        for (int i2 = 0; i2 < 32; i2++) {
            if (bytes[i2] != signature[i2]) {
                return false;
            }
        }
        return true;
    }
}
