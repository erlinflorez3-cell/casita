package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ECFieldElement implements ECConstants {

    public static class F2m extends ECFieldElement {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;
        private int[] ks;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f27678m;
        private int representation;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private LongArray f27679x;

        public F2m(int i2, int i3, int i4, int i5, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i2) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i4 == 0 && i5 == 0) {
                this.representation = 2;
                this.ks = new int[]{i3};
            } else {
                if (i4 >= i5) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i4 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.representation = 3;
                this.ks = new int[]{i3, i4, i5};
            }
            this.f27678m = i2;
            this.f27679x = new LongArray(bigInteger);
        }

        public F2m(int i2, int i3, BigInteger bigInteger) {
            this(i2, i3, 0, 0, bigInteger);
        }

        private F2m(int i2, int[] iArr, LongArray longArray) {
            this.f27678m = i2;
            this.representation = iArr.length == 1 ? 2 : 3;
            this.ks = iArr;
            this.f27679x = longArray;
        }

        public static void checkFieldElements(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            if (!(eCFieldElement instanceof F2m) || !(eCFieldElement2 instanceof F2m)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            F2m f2m = (F2m) eCFieldElement;
            F2m f2m2 = (F2m) eCFieldElement2;
            if (f2m.representation != f2m2.representation) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (f2m.f27678m != f2m2.f27678m || !Arrays.areEqual(f2m.ks, f2m2.ks)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            LongArray longArray = (LongArray) this.f27679x.clone();
            longArray.addShiftedByWords(((F2m) eCFieldElement).f27679x, 0);
            return new F2m(this.f27678m, this.ks, longArray);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            return new F2m(this.f27678m, this.ks, this.f27679x.addOne());
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int bitLength() {
            return this.f27679x.degree();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return multiply(eCFieldElement.invert());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof F2m)) {
                return false;
            }
            F2m f2m = (F2m) obj;
            return this.f27678m == f2m.f27678m && this.representation == f2m.representation && Arrays.areEqual(this.ks, f2m.ks) && this.f27679x.equals(f2m.f27679x);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "F2m";
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f27678m;
        }

        public int getK1() {
            return this.ks[0];
        }

        public int getK2() {
            int[] iArr = this.ks;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.ks;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f27678m;
        }

        public int getRepresentation() {
            return this.representation;
        }

        public int hashCode() {
            return (this.f27679x.hashCode() ^ this.f27678m) ^ Arrays.hashCode(this.ks);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            int i2 = this.f27678m;
            int[] iArr = this.ks;
            return new F2m(i2, iArr, this.f27679x.modInverse(i2, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isOne() {
            return this.f27679x.isOne();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isZero() {
            return this.f27679x.isZero();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i2 = this.f27678m;
            int[] iArr = this.ks;
            return new F2m(i2, iArr, this.f27679x.modMultiply(((F2m) eCFieldElement).f27679x, i2, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            LongArray longArray = this.f27679x;
            LongArray longArray2 = ((F2m) eCFieldElement).f27679x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f27679x;
            LongArray longArray4 = ((F2m) eCFieldElement3).f27679x;
            LongArray longArrayMultiply = longArray.multiply(longArray2, this.f27678m, this.ks);
            LongArray longArrayMultiply2 = longArray3.multiply(longArray4, this.f27678m, this.ks);
            if (longArrayMultiply == longArray || longArrayMultiply == longArray2) {
                longArrayMultiply = (LongArray) longArrayMultiply.clone();
            }
            longArrayMultiply.addShiftedByWords(longArrayMultiply2, 0);
            longArrayMultiply.reduce(this.f27678m, this.ks);
            return new F2m(this.f27678m, this.ks, longArrayMultiply);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            return (this.f27679x.isZero() || this.f27679x.isOne()) ? this : squarePow(this.f27678m - 1);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            int i2 = this.f27678m;
            int[] iArr = this.ks;
            return new F2m(i2, iArr, this.f27679x.modSquare(i2, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            LongArray longArray = this.f27679x;
            LongArray longArray2 = ((F2m) eCFieldElement).f27679x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f27679x;
            LongArray longArraySquare = longArray.square(this.f27678m, this.ks);
            LongArray longArrayMultiply = longArray2.multiply(longArray3, this.f27678m, this.ks);
            if (longArraySquare == longArray) {
                longArraySquare = (LongArray) longArraySquare.clone();
            }
            longArraySquare.addShiftedByWords(longArrayMultiply, 0);
            longArraySquare.reduce(this.f27678m, this.ks);
            return new F2m(this.f27678m, this.ks, longArraySquare);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePow(int i2) {
            if (i2 < 1) {
                return this;
            }
            int i3 = this.f27678m;
            int[] iArr = this.ks;
            return new F2m(i3, iArr, this.f27679x.modSquareN(i2, i3, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean testBitZero() {
            return this.f27679x.testBitZero();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f27679x.toBigInteger();
        }
    }

    public static class Fp extends ECFieldElement {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        BigInteger f27680q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        BigInteger f27681r;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        BigInteger f27682x;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, calculateResidue(bigInteger), bigInteger2);
        }

        Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f27680q = bigInteger;
            this.f27681r = bigInteger2;
            this.f27682x = bigInteger3;
        }

        static BigInteger calculateResidue(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return ONE.shiftLeft(iBitLength).subtract(bigInteger);
        }

        private ECFieldElement checkSqrt(ECFieldElement eCFieldElement) {
            if (eCFieldElement.square().equals(this)) {
                return eCFieldElement;
            }
            return null;
        }

        private BigInteger[] lucasSequence(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int iBitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigIntegerModReduce = ECConstants.ONE;
            BigInteger bigIntegerModReduce2 = ECConstants.TWO;
            BigInteger bigIntegerModMult = ECConstants.ONE;
            BigInteger bigIntegerModMult2 = ECConstants.ONE;
            BigInteger bigIntegerModReduce3 = bigInteger;
            for (int i2 = iBitLength - 1; i2 >= lowestSetBit + 1; i2--) {
                bigIntegerModMult = modMult(bigIntegerModMult, bigIntegerModMult2);
                if (bigInteger3.testBit(i2)) {
                    bigIntegerModMult2 = modMult(bigIntegerModMult, bigInteger2);
                    bigIntegerModReduce = modMult(bigIntegerModReduce, bigIntegerModReduce3);
                    bigIntegerModReduce2 = modReduce(bigIntegerModReduce3.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult)));
                    bigIntegerModReduce3 = modReduce(bigIntegerModReduce3.multiply(bigIntegerModReduce3).subtract(bigIntegerModMult2.shiftLeft(1)));
                } else {
                    bigIntegerModReduce = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult));
                    bigIntegerModReduce3 = modReduce(bigIntegerModReduce3.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult)));
                    bigIntegerModReduce2 = modReduce(bigIntegerModReduce2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult.shiftLeft(1)));
                    bigIntegerModMult2 = bigIntegerModMult;
                }
            }
            BigInteger bigIntegerModMult3 = modMult(bigIntegerModMult, bigIntegerModMult2);
            BigInteger bigIntegerModMult4 = modMult(bigIntegerModMult3, bigInteger2);
            BigInteger bigIntegerModReduce4 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult3));
            BigInteger bigIntegerModReduce5 = modReduce(bigIntegerModReduce3.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult3)));
            BigInteger bigIntegerModMult5 = modMult(bigIntegerModMult3, bigIntegerModMult4);
            for (int i3 = 1; i3 <= lowestSetBit; i3++) {
                bigIntegerModReduce4 = modMult(bigIntegerModReduce4, bigIntegerModReduce5);
                bigIntegerModReduce5 = modReduce(bigIntegerModReduce5.multiply(bigIntegerModReduce5).subtract(bigIntegerModMult5.shiftLeft(1)));
                bigIntegerModMult5 = modMult(bigIntegerModMult5, bigIntegerModMult5);
            }
            return new BigInteger[]{bigIntegerModReduce4, bigIntegerModReduce5};
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new Fp(this.f27680q, this.f27681r, modAdd(this.f27682x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger bigIntegerAdd = this.f27682x.add(ECConstants.ONE);
            if (bigIntegerAdd.compareTo(this.f27680q) == 0) {
                bigIntegerAdd = ECConstants.ZERO;
            }
            return new Fp(this.f27680q, this.f27681r, bigIntegerAdd);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new Fp(this.f27680q, this.f27681r, modMult(this.f27682x, modInverse(eCFieldElement.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Fp)) {
                return false;
            }
            Fp fp = (Fp) obj;
            return this.f27680q.equals(fp.f27680q) && this.f27682x.equals(fp.f27682x);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "Fp";
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f27680q.bitLength();
        }

        public BigInteger getQ() {
            return this.f27680q;
        }

        public int hashCode() {
            return this.f27680q.hashCode() ^ this.f27682x.hashCode();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            return new Fp(this.f27680q, this.f27681r, modInverse(this.f27682x));
        }

        protected BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            return bigIntegerAdd.compareTo(this.f27680q) >= 0 ? bigIntegerAdd.subtract(this.f27680q) : bigIntegerAdd;
        }

        protected BigInteger modDouble(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.f27680q) >= 0 ? bigIntegerShiftLeft.subtract(this.f27680q) : bigIntegerShiftLeft;
        }

        protected BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f27680q.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        protected BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f27680q.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        protected BigInteger modInverse(BigInteger bigInteger) {
            int fieldSize = getFieldSize();
            int i2 = (fieldSize + 31) >> 5;
            int[] iArrFromBigInteger = Nat.fromBigInteger(fieldSize, this.f27680q);
            int[] iArrFromBigInteger2 = Nat.fromBigInteger(fieldSize, bigInteger);
            int[] iArrCreate = Nat.create(i2);
            Mod.invert(iArrFromBigInteger, iArrFromBigInteger2, iArrCreate);
            return Nat.toBigInteger(i2, iArrCreate);
        }

        protected BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        protected BigInteger modReduce(BigInteger bigInteger) {
            if (this.f27681r == null) {
                return bigInteger.mod(this.f27680q);
            }
            boolean z2 = bigInteger.signum() < 0;
            if (z2) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.f27680q.bitLength();
            boolean zEquals = this.f27681r.equals(ECConstants.ONE);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.f27681r);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.f27680q) >= 0) {
                bigInteger = bigInteger.subtract(this.f27680q);
            }
            return (!z2 || bigInteger.signum() == 0) ? bigInteger : this.f27680q.subtract(bigInteger);
        }

        protected BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.f27680q) : bigIntegerSubtract;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new Fp(this.f27680q, this.f27681r, modMult(this.f27682x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f27682x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f27680q, this.f27681r, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f27682x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f27680q, this.f27681r, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            if (this.f27682x.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f27680q;
            return new Fp(bigInteger, this.f27681r, bigInteger.subtract(this.f27682x));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            if (isZero() || isOne()) {
                return this;
            }
            if (!this.f27680q.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.f27680q.testBit(1)) {
                BigInteger bigIntegerAdd = this.f27680q.shiftRight(2).add(ECConstants.ONE);
                BigInteger bigInteger = this.f27680q;
                return checkSqrt(new Fp(bigInteger, this.f27681r, this.f27682x.modPow(bigIntegerAdd, bigInteger)));
            }
            if (this.f27680q.testBit(2)) {
                BigInteger bigIntegerModPow = this.f27682x.modPow(this.f27680q.shiftRight(3), this.f27680q);
                BigInteger bigIntegerModMult = modMult(bigIntegerModPow, this.f27682x);
                if (modMult(bigIntegerModMult, bigIntegerModPow).equals(ECConstants.ONE)) {
                    return checkSqrt(new Fp(this.f27680q, this.f27681r, bigIntegerModMult));
                }
                return checkSqrt(new Fp(this.f27680q, this.f27681r, modMult(bigIntegerModMult, ECConstants.TWO.modPow(this.f27680q.shiftRight(2), this.f27680q))));
            }
            BigInteger bigIntegerShiftRight = this.f27680q.shiftRight(1);
            if (!this.f27682x.modPow(bigIntegerShiftRight, this.f27680q).equals(ECConstants.ONE)) {
                return null;
            }
            BigInteger bigInteger2 = this.f27682x;
            BigInteger bigIntegerModDouble = modDouble(modDouble(bigInteger2));
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(ECConstants.ONE);
            BigInteger bigIntegerSubtract = this.f27680q.subtract(ECConstants.ONE);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger3 = new BigInteger(this.f27680q.bitLength(), random);
                if (bigInteger3.compareTo(this.f27680q) < 0 && modReduce(bigInteger3.multiply(bigInteger3).subtract(bigIntegerModDouble)).modPow(bigIntegerShiftRight, this.f27680q).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrLucasSequence = lucasSequence(bigInteger3, bigInteger2, bigIntegerAdd2);
                    BigInteger bigInteger4 = bigIntegerArrLucasSequence[0];
                    BigInteger bigInteger5 = bigIntegerArrLucasSequence[1];
                    if (modMult(bigInteger5, bigInteger5).equals(bigIntegerModDouble)) {
                        return new Fp(this.f27680q, this.f27681r, modHalfAbs(bigInteger5));
                    }
                    if (!bigInteger4.equals(ECConstants.ONE) && !bigInteger4.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f27680q;
            BigInteger bigInteger2 = this.f27681r;
            BigInteger bigInteger3 = this.f27682x;
            return new Fp(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f27682x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f27680q, this.f27681r, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f27682x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f27680q, this.f27681r, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new Fp(this.f27680q, this.f27681r, modSubtract(this.f27682x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f27682x;
        }
    }

    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public byte[] getEncoded() {
        return BigIntegers.asUnsignedByteArray((getFieldSize() + 7) / 8, toBigInteger());
    }

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public boolean isOne() {
        return bitLength() == 1;
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract ECFieldElement multiply(ECFieldElement eCFieldElement);

    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).subtract(eCFieldElement2.multiply(eCFieldElement3));
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).add(eCFieldElement2.multiply(eCFieldElement3));
    }

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().subtract(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().add(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePow(int i2) {
        ECFieldElement eCFieldElementSquare = this;
        for (int i3 = 0; i3 < i2; i3++) {
            eCFieldElementSquare = eCFieldElementSquare.square();
        }
        return eCFieldElementSquare;
    }

    public abstract ECFieldElement subtract(ECFieldElement eCFieldElement);

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }
}
