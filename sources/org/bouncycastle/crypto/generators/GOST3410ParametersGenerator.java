package org.bouncycastle.crypto.generators;

import com.dynatrace.android.agent.AdkSettings;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;

/* JADX INFO: loaded from: classes6.dex */
public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    private int procedure_A(int i2, int i3, BigInteger[] bigIntegerArr, int i4) {
        BigInteger bigInteger;
        int iNextInt = i3;
        int iNextInt2 = i2;
        while (true) {
            if (iNextInt2 >= 0 && iNextInt2 <= 65536) {
                break;
            }
            iNextInt2 = this.init_random.nextInt() / 32768;
        }
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536 && iNextInt / 2 != 0) {
                break;
            }
            iNextInt = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger2 = new BigInteger(Integer.toString(iNextInt));
        BigInteger bigInteger3 = new BigInteger("19381");
        int i5 = 0;
        BigInteger[] bigIntegerArr2 = {new BigInteger(Integer.toString(iNextInt2))};
        int[] iArr = {i4};
        int i6 = 0;
        int i7 = 0;
        while (iArr[i6] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i7 = i6 + 1;
            iArr[i7] = iArr[i6] / 2;
            i6 = i7;
        }
        BigInteger[] bigIntegerArr3 = new BigInteger[i7 + 1];
        int i8 = 16;
        bigIntegerArr3[i7] = new BigInteger("8003", 16);
        int i9 = i7 - 1;
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
                bigInteger = bigIntegerArr2[i5];
                break;
            }
            int i11 = iArr[i9] / i8;
            while (true) {
                int length2 = bigIntegerArr2.length;
                BigInteger[] bigIntegerArr4 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr2, i5, bigIntegerArr4, i5, bigIntegerArr2.length);
                bigIntegerArr2 = new BigInteger[i11 + 1];
                System.arraycopy(bigIntegerArr4, i5, bigIntegerArr2, i5, length2);
                int i12 = i5;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    bigIntegerArr2[i13] = bigIntegerArr2[i12].multiply(bigInteger3).add(bigInteger2).mod(TWO.pow(i8));
                    i12 = i13;
                }
                BigInteger bigInteger4 = new BigInteger(AdkSettings.PLATFORM_TYPE_MOBILE);
                for (int i14 = i5; i14 < i11; i14++) {
                    bigInteger4 = bigInteger4.add(bigIntegerArr2[i14].multiply(TWO.pow(i14 * 16)));
                }
                bigIntegerArr2[i5] = bigIntegerArr2[i11];
                BigInteger bigInteger5 = TWO;
                int i15 = i9 + 1;
                BigInteger bigIntegerAdd = bigInteger5.pow(iArr[i9] - 1).divide(bigIntegerArr3[i15]).add(bigInteger5.pow(iArr[i9] - 1).multiply(bigInteger4).divide(bigIntegerArr3[i15].multiply(bigInteger5.pow(i11 * 16))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger5);
                BigInteger bigInteger6 = ONE;
                if (bigIntegerMod.compareTo(bigInteger6) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger6);
                }
                int i16 = 0;
                while (true) {
                    long j2 = i16;
                    BigInteger bigIntegerMultiply = bigIntegerArr3[i15].multiply(bigIntegerAdd.add(BigInteger.valueOf(j2)));
                    BigInteger bigInteger7 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger7);
                    bigIntegerArr3[i9] = bigIntegerAdd2;
                    BigInteger bigInteger8 = TWO;
                    if (bigIntegerAdd2.compareTo(bigInteger8.pow(iArr[i9])) == 1) {
                        break;
                    }
                    if (bigInteger8.modPow(bigIntegerArr3[i15].multiply(bigIntegerAdd.add(BigInteger.valueOf(j2))), bigIntegerArr3[i9]).compareTo(bigInteger7) == 0 && bigInteger8.modPow(bigIntegerAdd.add(BigInteger.valueOf(j2)), bigIntegerArr3[i9]).compareTo(bigInteger7) != 0) {
                        break;
                    }
                    i16 += 2;
                }
                i5 = 0;
                i8 = 16;
            }
            i9--;
            if (i9 < 0) {
                bigIntegerArr[0] = bigIntegerArr3[0];
                bigIntegerArr[1] = bigIntegerArr3[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i10++;
            i5 = 0;
            i8 = 16;
        }
        return bigInteger.intValue();
    }

    private long procedure_Aa(long j2, long j3, BigInteger[] bigIntegerArr, int i2) {
        BigInteger bigInteger;
        long jNextInt = j3;
        long jNextInt2 = j2;
        while (true) {
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L) {
                break;
            }
            jNextInt2 = this.init_random.nextInt() * 2;
        }
        while (true) {
            if (jNextInt >= 0 && jNextInt <= 4294967296L && jNextInt / 2 != 0) {
                break;
            }
            jNextInt = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger2 = new BigInteger(Long.toString(jNextInt));
        BigInteger bigInteger3 = new BigInteger("97781173");
        int i3 = 0;
        BigInteger[] bigIntegerArr2 = {new BigInteger(Long.toString(jNextInt2))};
        int[] iArr = {i2};
        int i4 = 0;
        int i5 = 0;
        while (iArr[i4] >= 33) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i5 = i4 + 1;
            iArr[i5] = iArr[i4] / 2;
            i4 = i5;
        }
        BigInteger[] bigIntegerArr3 = new BigInteger[i5 + 1];
        bigIntegerArr3[i5] = new BigInteger("8000000B", 16);
        int i6 = i5 - 1;
        int i7 = 0;
        while (true) {
            if (i7 >= i5) {
                bigInteger = bigIntegerArr2[i3];
                break;
            }
            int i8 = 32;
            int i9 = iArr[i6] / 32;
            while (true) {
                int length2 = bigIntegerArr2.length;
                BigInteger[] bigIntegerArr4 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr2, i3, bigIntegerArr4, i3, bigIntegerArr2.length);
                bigIntegerArr2 = new BigInteger[i9 + 1];
                System.arraycopy(bigIntegerArr4, i3, bigIntegerArr2, i3, length2);
                int i10 = i3;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    bigIntegerArr2[i11] = bigIntegerArr2[i10].multiply(bigInteger3).add(bigInteger2).mod(TWO.pow(i8));
                    i10 = i11;
                }
                BigInteger bigInteger4 = new BigInteger(AdkSettings.PLATFORM_TYPE_MOBILE);
                for (int i12 = i3; i12 < i9; i12++) {
                    bigInteger4 = bigInteger4.add(bigIntegerArr2[i12].multiply(TWO.pow(i12 * 32)));
                }
                bigIntegerArr2[i3] = bigIntegerArr2[i9];
                BigInteger bigInteger5 = TWO;
                int i13 = i6 + 1;
                BigInteger bigIntegerAdd = bigInteger5.pow(iArr[i6] - 1).divide(bigIntegerArr3[i13]).add(bigInteger5.pow(iArr[i6] - 1).multiply(bigInteger4).divide(bigIntegerArr3[i13].multiply(bigInteger5.pow(i9 * 32))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger5);
                BigInteger bigInteger6 = ONE;
                if (bigIntegerMod.compareTo(bigInteger6) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger6);
                }
                int i14 = 0;
                while (true) {
                    long j4 = i14;
                    BigInteger bigIntegerMultiply = bigIntegerArr3[i13].multiply(bigIntegerAdd.add(BigInteger.valueOf(j4)));
                    BigInteger bigInteger7 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger7);
                    bigIntegerArr3[i6] = bigIntegerAdd2;
                    BigInteger bigInteger8 = TWO;
                    if (bigIntegerAdd2.compareTo(bigInteger8.pow(iArr[i6])) == 1) {
                        break;
                    }
                    if (bigInteger8.modPow(bigIntegerArr3[i13].multiply(bigIntegerAdd.add(BigInteger.valueOf(j4))), bigIntegerArr3[i6]).compareTo(bigInteger7) == 0 && bigInteger8.modPow(bigIntegerAdd.add(BigInteger.valueOf(j4)), bigIntegerArr3[i6]).compareTo(bigInteger7) != 0) {
                        break;
                    }
                    i14 += 2;
                }
                i3 = 0;
                i8 = 32;
            }
            i6--;
            if (i6 < 0) {
                bigIntegerArr[0] = bigIntegerArr3[0];
                bigIntegerArr[1] = bigIntegerArr3[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i7++;
            i3 = 0;
        }
        return bigInteger.longValue();
    }

    private void procedure_B(int i2, int i3, BigInteger[] bigIntegerArr) {
        int iNextInt = i3;
        int iNextInt2 = i2;
        while (true) {
            if (iNextInt2 >= 0 && iNextInt2 <= 65536) {
                break;
            } else {
                iNextInt2 = this.init_random.nextInt() / 32768;
            }
        }
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536 && iNextInt / 2 != 0) {
                break;
            } else {
                iNextInt = (this.init_random.nextInt() / 32768) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(iNextInt));
        BigInteger bigInteger2 = new BigInteger("19381");
        int iProcedure_A = procedure_A(iNextInt2, iNextInt, bigIntegerArr2, 256);
        int i4 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int iProcedure_A2 = procedure_A(iProcedure_A, iNextInt, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(iProcedure_A2));
        while (true) {
            int i5 = i4;
            while (i5 < 64) {
                int i6 = i5 + 1;
                bigIntegerArr3[i6] = bigIntegerArr3[i5].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i5 = i6;
            }
            BigInteger bigInteger5 = new BigInteger(AdkSettings.PLATFORM_TYPE_MOBILE);
            for (int i7 = i4; i7 < 64; i7++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i7].multiply(TWO.pow(i7 * 16)));
            }
            bigIntegerArr3[i4] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            int i8 = 1024;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            while (true) {
                long j2 = i4;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j2)));
                BigInteger bigInteger8 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                if (bigIntegerAdd2.compareTo(bigInteger9.pow(i8)) == 1) {
                    break;
                }
                if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j2))), bigIntegerAdd2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(bigIntegerAdd.add(BigInteger.valueOf(j2))), bigIntegerAdd2).compareTo(bigInteger8) != 0) {
                    bigIntegerArr[0] = bigIntegerAdd2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i4 += 2;
                    i8 = 1024;
                }
            }
            i4 = 0;
        }
    }

    private void procedure_Bb(long j2, long j3, BigInteger[] bigIntegerArr) {
        long jNextInt = j3;
        long jNextInt2 = j2;
        while (true) {
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L) {
                break;
            } else {
                jNextInt2 = this.init_random.nextInt() * 2;
            }
        }
        while (true) {
            if (jNextInt >= 0 && jNextInt <= 4294967296L && jNextInt / 2 != 0) {
                break;
            } else {
                jNextInt = (this.init_random.nextInt() * 2) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(jNextInt));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long jProcedure_Aa = procedure_Aa(jNextInt2, jNextInt, bigIntegerArr2, 256);
        int i2 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long jProcedure_Aa2 = procedure_Aa(jProcedure_Aa, jNextInt, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(jProcedure_Aa2));
        while (true) {
            int i3 = i2;
            while (i3 < 32) {
                int i4 = i3 + 1;
                bigIntegerArr3[i4] = bigIntegerArr3[i3].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i3 = i4;
            }
            BigInteger bigInteger5 = new BigInteger(AdkSettings.PLATFORM_TYPE_MOBILE);
            for (int i5 = i2; i5 < 32; i5++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i5].multiply(TWO.pow(i5 * 32)));
            }
            bigIntegerArr3[i2] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            int i6 = 1024;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            while (true) {
                long j4 = i2;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j4)));
                BigInteger bigInteger8 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                if (bigIntegerAdd2.compareTo(bigInteger9.pow(i6)) == 1) {
                    break;
                }
                if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j4))), bigIntegerAdd2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(bigIntegerAdd.add(BigInteger.valueOf(j4))), bigIntegerAdd2).compareTo(bigInteger8) != 0) {
                    bigIntegerArr[0] = bigIntegerAdd2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i2 += 2;
                    i6 = 1024;
                }
            }
            i2 = 0;
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerDivide = bigIntegerSubtract.divide(bigInteger2);
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigInteger3 = new BigInteger(iBitLength, this.init_random);
            BigInteger bigInteger4 = ONE;
            if (bigInteger3.compareTo(bigInteger4) > 0 && bigInteger3.compareTo(bigIntegerSubtract) < 0) {
                BigInteger bigIntegerModPow = bigInteger3.modPow(bigIntegerDivide, bigInteger);
                if (bigIntegerModPow.compareTo(bigInteger4) != 0) {
                    return bigIntegerModPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int iNextInt = this.init_random.nextInt();
            int iNextInt2 = this.init_random.nextInt();
            int i2 = this.size;
            if (i2 == 512) {
                procedure_A(iNextInt, iNextInt2, bigIntegerArr, 512);
            } else {
                if (i2 != 1024) {
                    throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
                }
                procedure_B(iNextInt, iNextInt2, bigIntegerArr);
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(iNextInt, iNextInt2));
        }
        long jNextLong = this.init_random.nextLong();
        long jNextLong2 = this.init_random.nextLong();
        int i3 = this.size;
        if (i3 == 512) {
            procedure_Aa(jNextLong, jNextLong2, bigIntegerArr, 512);
        } else {
            if (i3 != 1024) {
                throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
            }
            procedure_Bb(jNextLong, jNextLong2, bigIntegerArr);
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(jNextLong, jNextLong2));
    }

    public void init(int i2, int i3, SecureRandom secureRandom) {
        this.size = i2;
        this.typeproc = i3;
        this.init_random = secureRandom;
    }
}
