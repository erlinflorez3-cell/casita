package org.bouncycastle.crypto.prng.drbg;

import java.math.BigInteger;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes6.dex */
public class DualECSP800DRBG implements SP80090DRBG {
    private static final int MAX_ADDITIONAL_INPUT = 4096;
    private static final int MAX_ENTROPY_LENGTH = 4096;
    private static final int MAX_PERSONALIZATION_STRING = 4096;
    private static final long RESEED_MAX = 2147483648L;
    private static final DualECPoints[] nistPoints;
    private static final BigInteger p256_Px;
    private static final BigInteger p256_Py;
    private static final BigInteger p256_Qx;
    private static final BigInteger p256_Qy;
    private static final BigInteger p384_Px;
    private static final BigInteger p384_Py;
    private static final BigInteger p384_Qx;
    private static final BigInteger p384_Qy;
    private static final BigInteger p521_Px;
    private static final BigInteger p521_Py;
    private static final BigInteger p521_Qx;
    private static final BigInteger p521_Qy;
    private ECPoint _P;
    private ECPoint _Q;
    private ECCurve.Fp _curve;
    private Digest _digest;
    private EntropySource _entropySource;
    private ECMultiplier _fixedPointMultiplier;
    private int _outlen;
    private long _reseedCounter;
    private byte[] _s;
    private int _sLength;
    private int _securityStrength;
    private int _seedlen;

    static {
        BigInteger bigInteger = new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16);
        p256_Px = bigInteger;
        BigInteger bigInteger2 = new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16);
        p256_Py = bigInteger2;
        BigInteger bigInteger3 = new BigInteger("c97445f45cdef9f0d3e05e1e585fc297235b82b5be8ff3efca67c59852018192", 16);
        p256_Qx = bigInteger3;
        BigInteger bigInteger4 = new BigInteger("b28ef557ba31dfcbdd21ac46e2a91e3c304f44cb87058ada2cb815151e610046", 16);
        p256_Qy = bigInteger4;
        BigInteger bigInteger5 = new BigInteger("aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", 16);
        p384_Px = bigInteger5;
        BigInteger bigInteger6 = new BigInteger("3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f", 16);
        p384_Py = bigInteger6;
        BigInteger bigInteger7 = new BigInteger("8e722de3125bddb05580164bfe20b8b432216a62926c57502ceede31c47816edd1e89769124179d0b695106428815065", 16);
        p384_Qx = bigInteger7;
        BigInteger bigInteger8 = new BigInteger("023b1660dd701d0839fd45eec36f9ee7b32e13b315dc02610aa1b636e346df671f790f84c5e09b05674dbb7e45c803dd", 16);
        p384_Qy = bigInteger8;
        BigInteger bigInteger9 = new BigInteger("c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", 16);
        p521_Px = bigInteger9;
        BigInteger bigInteger10 = new BigInteger("11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650", 16);
        p521_Py = bigInteger10;
        BigInteger bigInteger11 = new BigInteger("1b9fa3e518d683c6b65763694ac8efbaec6fab44f2276171a42726507dd08add4c3b3f4c1ebc5b1222ddba077f722943b24c3edfa0f85fe24d0c8c01591f0be6f63", 16);
        p521_Qx = bigInteger11;
        BigInteger bigInteger12 = new BigInteger("1f3bdba585295d9a1110d1df1f9430ef8442c5018976ff3437ef91b81dc0b8132c8d5c39c32d0e004a3092b7d327c0e7a4d26d2c7b69b58f9066652911e457779de", 16);
        p521_Qy = bigInteger12;
        nistPoints = new DualECPoints[]{new DualECPoints(128, fp.createPoint(bigInteger, bigInteger2), fp.createPoint(bigInteger3, bigInteger4), 1), new DualECPoints(192, fp.createPoint(bigInteger5, bigInteger6), fp.createPoint(bigInteger7, bigInteger8), 1), new DualECPoints(256, fp.createPoint(bigInteger9, bigInteger10), fp.createPoint(bigInteger11, bigInteger12), 1)};
        ECCurve.Fp fp = (ECCurve.Fp) NISTNamedCurves.getByName("P-256").getCurve();
        ECCurve.Fp fp2 = (ECCurve.Fp) NISTNamedCurves.getByName("P-384").getCurve();
        ECCurve.Fp fp3 = (ECCurve.Fp) NISTNamedCurves.getByName("P-521").getCurve();
    }

    public DualECSP800DRBG(Digest digest, int i2, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this(nistPoints, digest, i2, entropySource, bArr, bArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r4._P == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        r0 = org.bouncycastle.crypto.prng.drbg.Utils.hash_df(r4._digest, r2, r4._seedlen);
        r4._s = r0;
        r4._sLength = r0.length;
        r4._reseedCounter = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        throw new java.lang.IllegalArgumentException("security strength cannot be greater than 256 bits");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DualECSP800DRBG(org.bouncycastle.crypto.prng.drbg.DualECPoints[] r5, org.bouncycastle.crypto.Digest r6, int r7, org.bouncycastle.crypto.prng.EntropySource r8, byte[] r9, byte[] r10) {
        /*
            r4 = this;
            r4.<init>()
            org.bouncycastle.math.ec.FixedPointCombMultiplier r0 = new org.bouncycastle.math.ec.FixedPointCombMultiplier
            r0.<init>()
            r4._fixedPointMultiplier = r0
            r4._digest = r6
            r4._entropySource = r8
            r4._securityStrength = r7
            r0 = 512(0x200, float:7.17E-43)
            boolean r0 = org.bouncycastle.crypto.prng.drbg.Utils.isTooLarge(r9, r0)
            if (r0 != 0) goto Lac
            int r0 = r8.entropySize()
            if (r0 < r7) goto L91
            int r1 = r8.entropySize()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 > r0) goto L91
            byte[] r0 = r4.getEntropy()
            byte[] r2 = org.bouncycastle.util.Arrays.concatenate(r0, r10, r9)
            r3 = 0
        L2f:
            int r0 = r5.length
            if (r3 == r0) goto L68
            r0 = r5[r3]
            int r0 = r0.getSecurityStrength()
            if (r7 > r0) goto L7e
            int r1 = org.bouncycastle.crypto.prng.drbg.Utils.getMaxSecurityStrength(r6)
            r0 = r5[r3]
            int r0 = r0.getSecurityStrength()
            if (r1 < r0) goto L89
            r0 = r5[r3]
            int r0 = r0.getSeedLen()
            r4._seedlen = r0
            r0 = r5[r3]
            int r0 = r0.getMaxOutlen()
            int r0 = r0 / 8
            r4._outlen = r0
            r0 = r5[r3]
            org.bouncycastle.math.ec.ECPoint r0 = r0.getP()
            r4._P = r0
            r0 = r5[r3]
            org.bouncycastle.math.ec.ECPoint r0 = r0.getQ()
            r4._Q = r0
        L68:
            org.bouncycastle.math.ec.ECPoint r0 = r4._P
            if (r0 == 0) goto L81
            org.bouncycastle.crypto.Digest r1 = r4._digest
            int r0 = r4._seedlen
            byte[] r0 = org.bouncycastle.crypto.prng.drbg.Utils.hash_df(r1, r2, r0)
            r4._s = r0
            int r0 = r0.length
            r4._sLength = r0
            r0 = 0
            r4._reseedCounter = r0
            return
        L7e:
            int r3 = r3 + 1
            goto L2f
        L81:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "security strength cannot be greater than 256 bits"
            r1.<init>(r0)
            throw r1
        L89:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Requested security strength is not supported by digest"
            r1.<init>(r0)
            throw r1
        L91:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "EntropySource must provide between "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r0 = " and 4096 bits"
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        Lac:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Personalization string too large"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.drbg.DualECSP800DRBG.<init>(org.bouncycastle.crypto.prng.drbg.DualECPoints[], org.bouncycastle.crypto.Digest, int, org.bouncycastle.crypto.prng.EntropySource, byte[], byte[]):void");
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private BigInteger getScalarMultipleXCoord(ECPoint eCPoint, BigInteger bigInteger) {
        return this._fixedPointMultiplier.multiply(eCPoint, bigInteger).normalize().getAffineXCoord().toBigInteger();
    }

    private byte[] pad8(byte[] bArr, int i2) {
        int i3 = i2 % 8;
        if (i3 == 0) {
            return bArr;
        }
        int i4 = 8 - i3;
        int length = bArr.length - 1;
        int i5 = 0;
        while (length >= 0) {
            int i6 = (-1) - (((-1) - bArr[length]) | ((-1) - 255));
            bArr[length] = (byte) ((i5 >> (8 - i4)) | (i6 << i4));
            length--;
            i5 = i6;
        }
        return bArr;
    }

    private byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return bArr;
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z2) {
        int length = bArr.length * 8;
        int length2 = bArr.length / this._outlen;
        if (Utils.isTooLarge(bArr2, 512)) {
            throw new IllegalArgumentException("Additional input too large");
        }
        if (this._reseedCounter + ((long) length2) > 2147483648L) {
            return -1;
        }
        if (z2) {
            reseed(bArr2);
            bArr2 = null;
        }
        BigInteger bigInteger = bArr2 != null ? new BigInteger(1, xor(this._s, Utils.hash_df(this._digest, bArr2, this._seedlen))) : new BigInteger(1, this._s);
        int length3 = 0;
        Arrays.fill(bArr, (byte) 0);
        int length4 = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            bigInteger = getScalarMultipleXCoord(this._P, bigInteger);
            byte[] byteArray = getScalarMultipleXCoord(this._Q, bigInteger).toByteArray();
            int length5 = byteArray.length;
            int i3 = this._outlen;
            if (length5 > i3) {
                System.arraycopy(byteArray, byteArray.length - i3, bArr, length4, i3);
            } else {
                System.arraycopy(byteArray, 0, bArr, (i3 - byteArray.length) + length4, byteArray.length);
            }
            length4 += this._outlen;
            this._reseedCounter++;
        }
        if (length4 < bArr.length) {
            bigInteger = getScalarMultipleXCoord(this._P, bigInteger);
            byte[] byteArray2 = getScalarMultipleXCoord(this._Q, bigInteger).toByteArray();
            int length6 = bArr.length - length4;
            int length7 = byteArray2.length;
            int i4 = this._outlen;
            if (length7 > i4) {
                length3 = byteArray2.length - i4;
            } else {
                length4 += i4 - byteArray2.length;
            }
            System.arraycopy(byteArray2, length3, bArr, length4, length6);
            this._reseedCounter++;
        }
        this._s = BigIntegers.asUnsignedByteArray(this._sLength, getScalarMultipleXCoord(this._P, bigInteger));
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._outlen * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        if (Utils.isTooLarge(bArr, 512)) {
            throw new IllegalArgumentException("Additional input string too large");
        }
        this._s = Utils.hash_df(this._digest, Arrays.concatenate(pad8(this._s, this._seedlen), getEntropy(), bArr), this._seedlen);
        this._reseedCounter = 0L;
    }
}
