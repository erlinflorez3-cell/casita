package com.upokecenter.numbers;

import com.dynatrace.android.agent.AdkSettings;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes5.dex */
final class FastInteger implements Comparable<FastInteger> {
    private static final String Digits = "0123456789ABCDEF";
    private static final EInteger ValueInt32MaxValue;
    private static final EInteger ValueInt32MinValue;
    private static final EInteger ValueNegativeInt32MinValue;
    private boolean frozen;
    private int integerMode;
    private EInteger largeValue;
    private MutableNumber mnum;
    private int smallValue;

    private static final class MutableNumber {
        private int[] data;
        private int wordCount;

        MutableNumber(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("val(" + i2 + ") is less than 0 ");
            }
            int[] iArr = new int[4];
            this.data = iArr;
            this.wordCount = i2 == 0 ? 0 : 1;
            iArr[0] = i2;
        }

        static MutableNumber FromEInteger(EInteger eInteger) {
            MutableNumber mutableNumber = new MutableNumber(0);
            if (eInteger.signum() < 0) {
                throw new IllegalArgumentException("bigintVal's sign(" + eInteger.signum() + ") is less than 0 ");
            }
            byte[] bArrToBytes = eInteger.ToBytes(true);
            int length = bArrToBytes.length;
            int iMax = Math.max(4, (length / 4) + 1);
            if (iMax > mutableNumber.data.length) {
                mutableNumber.data = new int[iMax];
            }
            mutableNumber.wordCount = iMax;
            for (int i2 = 0; i2 < length; i2 += 4) {
                int i3 = (-1) - (((-1) - bArrToBytes[i2]) | ((-1) - 255));
                int i4 = i2 + 1;
                if (i4 < length) {
                    i3 |= ((-1) - (((-1) - bArrToBytes[i4]) | ((-1) - 255))) << 8;
                }
                int i5 = i2 + 2;
                if (i5 < length) {
                    int i6 = (bArrToBytes[i5] & 255) << 16;
                    i3 = (i3 + i6) - (i3 & i6);
                }
                int i7 = i2 + 3;
                if (i7 < length) {
                    i3 = (-1) - (((-1) - i3) & ((-1) - ((bArrToBytes[i7] & 255) << 24)));
                }
                mutableNumber.data[i2 >> 2] = i3;
            }
            while (true) {
                int i8 = mutableNumber.wordCount;
                if (i8 == 0 || mutableNumber.data[i8 - 1] != 0) {
                    break;
                }
                mutableNumber.wordCount = i8 - 1;
            }
            return mutableNumber;
        }

        public static MutableNumber FromInt64(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("longVal");
            }
            if (j2 == 0) {
                return new MutableNumber(0);
            }
            MutableNumber mutableNumber = new MutableNumber(0);
            int[] iArr = mutableNumber.data;
            iArr[0] = (int) j2;
            int i2 = (int) (j2 >> 32);
            iArr[1] = i2;
            mutableNumber.wordCount = i2 != 0 ? 2 : 1;
            return mutableNumber;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        com.upokecenter.numbers.FastInteger.MutableNumber Add(int r10) {
            /*
                r9 = this;
                if (r10 < 0) goto L74
                if (r10 == 0) goto L62
                int r0 = r9.wordCount
                r4 = 1
                r6 = 0
                if (r0 != 0) goto L1a
                int[] r0 = r9.data
                int r0 = r0.length
                if (r0 != 0) goto L14
                r0 = 4
                int[] r0 = new int[r0]
                r9.data = r0
            L14:
                int[] r0 = r9.data
                r0[r6] = r6
                r9.wordCount = r4
            L1a:
                r8 = r6
                r7 = r8
            L1c:
                int r1 = r9.wordCount
                if (r8 >= r1) goto L48
                int[] r5 = r9.data
                r3 = r5[r8]
                int r2 = r3 + r10
                int r2 = r2 + r7
                int r1 = r2 >> 31
                int r0 = r3 >> 31
                if (r1 != r0) goto L3f
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0 = r2 & r1
                r1 = r1 & r3
                if (r0 >= r1) goto L41
            L35:
                r7 = r4
            L36:
                r5[r8] = r2
                if (r7 != 0) goto L3b
                return r9
            L3b:
                int r8 = r8 + 1
                r10 = r6
                goto L1c
            L3f:
                if (r1 == 0) goto L35
            L41:
                if (r2 != r3) goto L46
                if (r10 == 0) goto L46
                goto L35
            L46:
                r7 = r6
                goto L36
            L48:
                if (r7 == 0) goto L62
                int[] r2 = r9.data
                int r0 = r2.length
                if (r1 < r0) goto L59
                int r0 = r1 + 20
                int[] r1 = new int[r0]
                int r0 = r2.length
                java.lang.System.arraycopy(r2, r6, r1, r6, r0)
                r9.data = r1
            L59:
                int[] r1 = r9.data
                int r0 = r9.wordCount
                r1[r0] = r7
                int r0 = r0 + r4
                r9.wordCount = r0
            L62:
                int r2 = r9.wordCount
                if (r2 == 0) goto L73
                int[] r1 = r9.data
                int r0 = r2 + (-1)
                r0 = r1[r0]
                if (r0 != 0) goto L73
                int r0 = r2 + (-1)
                r9.wordCount = r0
                goto L62
            L73:
                return r9
            L74:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "augend("
                r1.<init>(r0)
                java.lang.StringBuilder r1 = r1.append(r10)
                java.lang.String r0 = ") is less than 0 "
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.FastInteger.MutableNumber.Add(int):com.upokecenter.numbers.FastInteger$MutableNumber");
        }

        boolean CanFitInInt32() {
            int i2 = this.wordCount;
            if (i2 != 0) {
                return i2 == 1 && (this.data[0] >> 31) == 0;
            }
            return true;
        }

        int CompareToInt(int i2) {
            int i3;
            if (i2 < 0 || (i3 = this.wordCount) > 1) {
                return 1;
            }
            if (i3 == 0) {
                return i2 == 0 ? 0 : -1;
            }
            int i4 = this.data[0];
            if (i4 == i2) {
                return 0;
            }
            if ((i4 >> 31) == (i2 >> 31)) {
                if ((i4 + Integer.MAX_VALUE) - (i4 | Integer.MAX_VALUE) >= (i2 & Integer.MAX_VALUE)) {
                    return 1;
                }
            } else if ((i4 >> 31) != 0) {
                return 1;
            }
            return -1;
        }

        MutableNumber Copy() {
            MutableNumber mutableNumber = new MutableNumber(0);
            int i2 = this.wordCount;
            if (i2 > mutableNumber.data.length) {
                mutableNumber.data = new int[i2];
            }
            System.arraycopy(this.data, 0, mutableNumber.data, 0, i2);
            mutableNumber.wordCount = this.wordCount;
            return mutableNumber;
        }

        int[] GetLastWordsInternal(int i2) {
            int[] iArr = new int[i2];
            System.arraycopy(this.data, 0, iArr, 0, Math.min(i2, this.wordCount));
            return iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01f0 A[ADDED_TO_REGION, EDGE_INSN: B:65:0x01f0->B:62:0x01f0 BREAK  A[LOOP:0: B:24:0x006c->B:28:0x0078], REMOVE, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        com.upokecenter.numbers.FastInteger.MutableNumber Multiply(int r20) {
            /*
                Method dump skipped, instruction units count: 524
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.FastInteger.MutableNumber.Multiply(int):com.upokecenter.numbers.FastInteger$MutableNumber");
        }

        MutableNumber SetInt(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("val(" + i2 + ") is less than 0 ");
            }
            this.wordCount = i2 == 0 ? 0 : 1;
            this.data[0] = i2;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        com.upokecenter.numbers.FastInteger.MutableNumber Subtract(com.upokecenter.numbers.FastInteger.MutableNumber r12) {
            /*
                r11 = this;
                int r1 = r11.wordCount
                int r0 = r12.wordCount
                if (r1 <= r0) goto L4b
            L6:
                int[] r2 = r11.data
                int r0 = r2.length
                r8 = 0
                if (r0 >= r1) goto L16
                int r0 = r1 + 20
                int[] r1 = new int[r0]
                int r0 = r2.length
                java.lang.System.arraycopy(r2, r8, r1, r8, r0)
                r11.data = r1
            L16:
                int r7 = r11.wordCount
                int r0 = r12.wordCount
                if (r7 >= r0) goto L49
            L1c:
                r10 = r8
                r1 = r10
            L1e:
                r6 = 2147483647(0x7fffffff, float:NaN)
                r9 = 1
                if (r10 >= r7) goto L4d
                int[] r5 = r11.data
                r4 = r5[r10]
                int[] r0 = r12.data
                r3 = r0[r10]
                int r2 = r4 - r3
                int r2 = r2 - r1
                int r1 = r4 >> 31
                int r0 = r2 >> 31
                if (r1 != r0) goto L40
                r0 = r4 & r6
                r6 = r6 & r2
                if (r0 >= r6) goto L42
            L3a:
                r1 = r9
            L3b:
                r5[r10] = r2
                int r10 = r10 + 1
                goto L1e
            L40:
                if (r1 == 0) goto L3a
            L42:
                if (r4 != r2) goto L47
                if (r3 == 0) goto L47
                goto L3a
            L47:
                r1 = r8
                goto L3b
            L49:
                r7 = r0
                goto L1c
            L4b:
                r1 = r0
                goto L6
            L4d:
                if (r1 == 0) goto L84
            L4f:
                int r0 = r11.wordCount
                if (r7 >= r0) goto L84
                int[] r5 = r11.data
                r4 = r5[r7]
                int r0 = r12.wordCount
                if (r7 < r0) goto L7f
                r3 = r8
            L5c:
                int r2 = r4 - r3
                int r2 = r2 - r1
                int r1 = r4 >> 31
                int r0 = r2 >> 31
                if (r1 != r0) goto L76
                int r1 = (-1) - r4
                int r0 = (-1) - r6
                r1 = r1 | r0
                int r1 = (-1) - r1
                r0 = r2 & r6
                if (r1 >= r0) goto L78
            L70:
                r1 = r9
            L71:
                r5[r7] = r2
                int r7 = r7 + 1
                goto L4f
            L76:
                if (r1 == 0) goto L70
            L78:
                if (r4 != r2) goto L7d
                if (r3 == 0) goto L7d
                goto L70
            L7d:
                r1 = r8
                goto L71
            L7f:
                int[] r0 = r12.data
                r3 = r0[r7]
                goto L5c
            L84:
                int r2 = r11.wordCount
                if (r2 == 0) goto L95
                int[] r1 = r11.data
                int r0 = r2 + (-1)
                r0 = r1[r0]
                if (r0 != 0) goto L95
                int r0 = r2 + (-1)
                r11.wordCount = r0
                goto L84
            L95:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.FastInteger.MutableNumber.Subtract(com.upokecenter.numbers.FastInteger$MutableNumber):com.upokecenter.numbers.FastInteger$MutableNumber");
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        com.upokecenter.numbers.FastInteger.MutableNumber SubtractInt(int r10) {
            /*
                r9 = this;
                if (r10 < 0) goto L7f
                if (r10 == 0) goto L7e
                int r0 = r9.wordCount
                r8 = 0
                r6 = 1
                if (r0 != 0) goto L1a
                int[] r0 = r9.data
                int r0 = r0.length
                if (r0 != 0) goto L14
                r0 = 4
                int[] r0 = new int[r0]
                r9.data = r0
            L14:
                int[] r0 = r9.data
                r0[r8] = r8
                r9.wordCount = r6
            L1a:
                int[] r5 = r9.data
                r4 = r5[r8]
                int r3 = r4 - r10
                int r1 = r4 >> 31
                int r0 = r3 >> 31
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r1 != r0) goto L64
                int r2 = r4 + r7
                r0 = r4 | r7
                int r2 = r2 - r0
                int r1 = (-1) - r3
                int r0 = (-1) - r7
                r1 = r1 | r0
                int r0 = (-1) - r1
                if (r2 >= r0) goto L66
            L37:
                r0 = r6
            L38:
                r5[r8] = r3
                if (r0 == 0) goto L6d
                r5 = r6
            L3d:
                int r1 = r9.wordCount
                if (r5 >= r1) goto L6d
                int[] r4 = r9.data
                r3 = r4[r5]
                int r2 = r3 - r0
                int r1 = r3 >> 31
                int r0 = r2 >> 31
                if (r1 != r0) goto L5d
                r3 = r3 & r7
                int r1 = (-1) - r2
                int r0 = (-1) - r7
                r1 = r1 | r0
                int r0 = (-1) - r1
                if (r3 >= r0) goto L62
            L57:
                r0 = r6
            L58:
                r4[r5] = r2
                int r5 = r5 + 1
                goto L3d
            L5d:
                int r0 = r3 >> 31
                if (r0 != 0) goto L62
                goto L57
            L62:
                r0 = r8
                goto L58
            L64:
                if (r1 == 0) goto L37
            L66:
                if (r4 != r3) goto L6b
                if (r10 == 0) goto L6b
                goto L37
            L6b:
                r0 = r8
                goto L38
            L6d:
                int r2 = r9.wordCount
                if (r2 == 0) goto L7e
                int[] r1 = r9.data
                int r0 = r2 + (-1)
                r0 = r1[r0]
                if (r0 != 0) goto L7e
                int r0 = r2 + (-1)
                r9.wordCount = r0
                goto L6d
            L7e:
                return r9
            L7f:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "other("
                r1.<init>(r0)
                java.lang.StringBuilder r1 = r1.append(r10)
                java.lang.String r0 = ") is less than 0 "
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.FastInteger.MutableNumber.SubtractInt(int):com.upokecenter.numbers.FastInteger$MutableNumber");
        }

        EInteger ToEInteger() {
            int i2 = this.wordCount;
            if (i2 == 1) {
                int i3 = this.data[0];
                if ((i3 >> 31) == 0) {
                    return EInteger.FromInt64(i3);
                }
            }
            if (i2 == 2) {
                int[] iArr = this.data;
                int i4 = iArr[1];
                if ((i4 >> 31) == 0) {
                    return EInteger.FromInt64(((-1) - (((-1) - ((long) iArr[0])) | ((-1) - 4294967295L))) | (((long) i4) << 32));
                }
            }
            return EInteger.FromInts(this.data, i2);
        }

        int ToInt32() {
            if (this.wordCount == 0) {
                return 0;
            }
            return this.data[0];
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[LOOP:0: B:7:0x000c->B:18:0x0030, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x002f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compareTo(com.upokecenter.numbers.FastInteger.MutableNumber r9) {
            /*
                r8 = this;
                int r1 = r8.wordCount
                int r0 = r9.wordCount
                r7 = 1
                r6 = -1
                if (r1 == r0) goto Lc
                if (r1 >= r0) goto Lb
                r7 = r6
            Lb:
                return r7
            Lc:
                int r5 = r1 + (-1)
                if (r1 == 0) goto L32
                int[] r0 = r8.data
                r4 = r0[r5]
                int[] r0 = r9.data
                r3 = r0[r5]
                int r1 = r4 >> 31
                int r0 = r3 >> 31
                if (r1 != r0) goto L2a
                r2 = 2147483647(0x7fffffff, float:NaN)
                r1 = r4 & r2
                int r0 = r2 + r3
                r2 = r2 | r3
                int r0 = r0 - r2
                if (r1 >= r0) goto L2d
            L29:
                return r6
            L2a:
                if (r1 != 0) goto L2d
                goto L29
            L2d:
                if (r4 == r3) goto L30
                return r7
            L30:
                r1 = r5
                goto Lc
            L32:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.FastInteger.MutableNumber.compareTo(com.upokecenter.numbers.FastInteger$MutableNumber):int");
        }

        final boolean isEvenNumber() {
            if (this.wordCount == 0) {
                return true;
            }
            int i2 = this.data[0];
            return (i2 + 1) - (i2 | 1) == 0;
        }

        final int signum() {
            return this.wordCount == 0 ? 0 : 1;
        }
    }

    static {
        EInteger eIntegerFromInt64 = EInteger.FromInt64(-2147483648L);
        ValueInt32MinValue = eIntegerFromInt64;
        ValueInt32MaxValue = EInteger.FromInt64(2147483647L);
        ValueNegativeInt32MinValue = eIntegerFromInt64.Negate();
    }

    FastInteger(int i2) {
        this.smallValue = i2;
    }

    static FastInteger CopyFrozen(FastInteger fastInteger) {
        FastInteger fastInteger2 = new FastInteger(fastInteger.smallValue);
        fastInteger2.integerMode = fastInteger.integerMode;
        fastInteger2.largeValue = fastInteger.largeValue;
        MutableNumber mutableNumber = fastInteger.mnum;
        fastInteger2.mnum = (mutableNumber == null || fastInteger.integerMode != 1) ? null : mutableNumber.Copy();
        fastInteger2.frozen = true;
        return fastInteger2;
    }

    static FastInteger FromBig(EInteger eInteger) {
        if (eInteger.CanFitInInt32()) {
            return new FastInteger(eInteger.ToInt32Unchecked());
        }
        if (eInteger.signum() <= 0 || eInteger.GetUnsignedBitLengthAsInt64() >= 2048) {
            FastInteger fastInteger = new FastInteger(0);
            fastInteger.integerMode = 2;
            fastInteger.largeValue = eInteger;
            return fastInteger;
        }
        FastInteger fastInteger2 = new FastInteger(0);
        fastInteger2.integerMode = 1;
        fastInteger2.mnum = MutableNumber.FromEInteger(eInteger);
        return fastInteger2;
    }

    static FastInteger FromInt64(long j2) {
        return (j2 < -2147483648L || j2 > 2147483647L) ? FromBig(EInteger.FromInt64(j2)) : new FastInteger((int) j2);
    }

    static int[] GetLastWords(EInteger eInteger, int i2) {
        return MutableNumber.FromEInteger(eInteger).GetLastWordsInternal(i2);
    }

    public static String IntToString(int i2) {
        char[] cArr;
        if (i2 == 0) {
            return AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return "-2147483648";
        }
        boolean z2 = i2 < 0;
        if (z2) {
            i2 = -i2;
        }
        if (i2 < 100000) {
            int i3 = 5;
            if (z2) {
                cArr = new char[6];
            } else {
                cArr = new char[5];
                i3 = 4;
            }
            while (i2 > 9) {
                int i4 = ((i2 >> 1) * 52429) >> 18;
                int i5 = (i4 + 16383) - (i4 | 16383);
                cArr[i3] = Digits.charAt(i2 - (i5 * 10));
                i2 = i5;
                i3--;
            }
            if (i2 != 0) {
                cArr[i3] = Digits.charAt(i2);
                i3--;
            }
            if (z2) {
                cArr[i3] = Soundex.SILENT_MARKER;
            } else {
                i3++;
            }
            return new String(cArr, i3, cArr.length - i3);
        }
        char[] cArr2 = new char[12];
        int i6 = 11;
        while (i2 >= 163840) {
            int i7 = i2 / 10;
            cArr2[i6] = Digits.charAt(i2 - (i7 * 10));
            i2 = i7;
            i6--;
        }
        while (i2 > 9) {
            int i8 = (((i2 >> 1) * 52429) >> 18) & 16383;
            cArr2[i6] = Digits.charAt(i2 - (i8 * 10));
            i2 = i8;
            i6--;
        }
        if (i2 != 0) {
            cArr2[i6] = Digits.charAt(i2);
            i6--;
        }
        if (z2) {
            cArr2[i6] = Soundex.SILENT_MARKER;
        } else {
            i6++;
        }
        return new String(cArr2, i6, 12 - i6);
    }

    public static String LongToString(long j2) {
        long j3 = j2;
        if (j3 == Long.MIN_VALUE) {
            return "-9223372036854775808";
        }
        if (j3 == 0) {
            return AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        boolean z2 = j3 < 0;
        int i2 = (int) j3;
        if (i2 == j3) {
            return IntToString(i2);
        }
        char[] cArr = new char[24];
        int i3 = 23;
        if (z2) {
            j3 = -j3;
        }
        while (j3 >= 163840) {
            long j4 = j3 / 10;
            cArr[i3] = Digits.charAt((int) (j3 - (10 * j4)));
            i3--;
            j3 = j4;
        }
        while (j3 > 9) {
            long j5 = (-1) - (((-1) - (((j3 >> 1) * 52429) >> 18)) | ((-1) - 16383));
            cArr[i3] = Digits.charAt((int) (j3 - (j5 * 10)));
            i3--;
            j3 = j5;
        }
        if (j3 != 0) {
            cArr[i3] = Digits.charAt((int) j3);
            i3--;
        }
        if (z2) {
            cArr[i3] = Soundex.SILENT_MARKER;
        } else {
            i3++;
        }
        return new String(cArr, i3, 24 - i3);
    }

    FastInteger Abs() {
        if (this.frozen) {
            throw new IllegalStateException();
        }
        if (this.integerMode != 0) {
            return signum() < 0 ? Negate() : this;
        }
        int i2 = this.smallValue;
        if (i2 == Integer.MIN_VALUE) {
            return Negate();
        }
        this.smallValue = Math.abs(i2);
        return this;
    }

    FastInteger Add(FastInteger fastInteger) {
        int i2;
        int i3 = this.integerMode;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException();
                }
                this.largeValue = this.largeValue.Add(fastInteger.ToEInteger());
            } else if (fastInteger.integerMode != 0 || (i2 = fastInteger.smallValue) < 0) {
                this.integerMode = 2;
                this.largeValue = this.mnum.ToEInteger();
                this.largeValue = this.largeValue.Add(fastInteger.ToEInteger());
            } else {
                this.mnum.Add(i2);
            }
        } else if (fastInteger.integerMode == 0) {
            int i4 = this.smallValue;
            if ((i4 >= 0 || fastInteger.smallValue >= Integer.MIN_VALUE - i4) && (i4 <= 0 || fastInteger.smallValue <= Integer.MAX_VALUE - i4)) {
                this.smallValue = i4 + fastInteger.smallValue;
            } else if (fastInteger.smallValue >= 0) {
                this.integerMode = 1;
                MutableNumber mutableNumber = new MutableNumber(this.smallValue);
                this.mnum = mutableNumber;
                mutableNumber.Add(fastInteger.smallValue);
            } else {
                this.integerMode = 2;
                EInteger eIntegerFromInt32 = EInteger.FromInt32(i4);
                this.largeValue = eIntegerFromInt32;
                this.largeValue = eIntegerFromInt32.Add(EInteger.FromInt64(fastInteger.smallValue));
            }
        } else {
            this.integerMode = 2;
            this.largeValue = EInteger.FromInt32(this.smallValue);
            this.largeValue = this.largeValue.Add(fastInteger.ToEInteger());
        }
        return this;
    }

    FastInteger AddBig(EInteger eInteger) {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return eInteger.CanFitInInt32() ? AddInt(eInteger.ToInt32Checked()) : Add(FromBig(eInteger));
        }
        if (i2 == 1) {
            this.integerMode = 2;
            EInteger eIntegerToEInteger = this.mnum.ToEInteger();
            this.largeValue = eIntegerToEInteger;
            this.largeValue = eIntegerToEInteger.Add(eInteger);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            this.largeValue = this.largeValue.Add(eInteger);
        }
        return this;
    }

    FastInteger AddInt(int i2) {
        int i3 = this.integerMode;
        if (i3 == 0) {
            int i4 = this.smallValue;
            if ((i4 >= 0 || i2 >= Integer.MIN_VALUE - i4) && (i4 <= 0 || i2 <= Integer.MAX_VALUE - i4)) {
                this.smallValue = i4 + i2;
            } else if (i2 >= 0) {
                this.integerMode = 1;
                MutableNumber mutableNumber = new MutableNumber(this.smallValue);
                this.mnum = mutableNumber;
                mutableNumber.Add(i2);
            } else {
                this.integerMode = 2;
                EInteger eIntegerFromInt32 = EInteger.FromInt32(i4);
                this.largeValue = eIntegerFromInt32;
                this.largeValue = eIntegerFromInt32.Add(EInteger.FromInt32(i2));
            }
        } else if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException();
            }
            this.largeValue = this.largeValue.Add(EInteger.FromInt32(i2));
        } else if (i2 >= 0) {
            this.mnum.Add(i2);
        } else {
            this.integerMode = 2;
            this.largeValue = this.mnum.ToEInteger();
            this.largeValue = this.largeValue.Add(EInteger.FromInt32(i2));
        }
        return this;
    }

    FastInteger AddInt64(long j2) {
        return (j2 < -2147483648L || j2 > 2147483647L) ? AddBig(EInteger.FromInt64(j2)) : AddInt((int) j2);
    }

    boolean CanFitInInt32() {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return true;
        }
        if (i2 == 1) {
            return this.mnum.CanFitInInt32();
        }
        if (i2 == 2) {
            return this.largeValue.CanFitInInt32();
        }
        throw new IllegalStateException();
    }

    boolean CanFitInInt64() {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return true;
        }
        if (i2 == 1) {
            return ToEInteger().CanFitInInt64();
        }
        if (i2 == 2) {
            return this.largeValue.CanFitInInt64();
        }
        throw new IllegalStateException();
    }

    int CompareToInt(int i2) {
        int i3 = this.integerMode;
        if (i3 == 0) {
            int i4 = this.smallValue;
            if (i2 == i4) {
                return 0;
            }
            return i4 < i2 ? -1 : 1;
        }
        if (i3 == 1) {
            return this.mnum.ToEInteger().compareTo(EInteger.FromInt32(i2));
        }
        if (i3 == 2) {
            return this.largeValue.compareTo(EInteger.FromInt32(i2));
        }
        throw new IllegalStateException();
    }

    FastInteger Copy() {
        FastInteger fastInteger = new FastInteger(this.smallValue);
        fastInteger.integerMode = this.integerMode;
        fastInteger.largeValue = this.largeValue;
        MutableNumber mutableNumber = this.mnum;
        fastInteger.mnum = (mutableNumber == null || this.integerMode != 1) ? null : mutableNumber.Copy();
        return fastInteger;
    }

    FastInteger Decrement() {
        if (this.integerMode != 0) {
            return SubtractInt(1);
        }
        int i2 = this.smallValue;
        if (i2 != Integer.MIN_VALUE) {
            this.smallValue = i2 - 1;
        } else {
            this.integerMode = 1;
            MutableNumber mutableNumberFromEInteger = MutableNumber.FromEInteger(ValueInt32MinValue);
            this.mnum = mutableNumberFromEInteger;
            mutableNumberFromEInteger.SubtractInt(1);
        }
        return this;
    }

    FastInteger Divide(int i2) {
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        int i3 = this.integerMode;
        if (i3 != 0) {
            if (i3 == 1) {
                this.integerMode = 2;
                EInteger eIntegerToEInteger = this.mnum.ToEInteger();
                this.largeValue = eIntegerToEInteger;
                EInteger eIntegerDivide = eIntegerToEInteger.Divide(EInteger.FromInt64(i2));
                this.largeValue = eIntegerDivide;
                if (eIntegerDivide.isZero()) {
                    this.integerMode = 0;
                    this.smallValue = 0;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException();
                }
                EInteger eIntegerDivide2 = this.largeValue.Divide(EInteger.FromInt64(i2));
                this.largeValue = eIntegerDivide2;
                if (eIntegerDivide2.isZero()) {
                    this.integerMode = 0;
                    this.smallValue = 0;
                }
            }
        } else if (i2 == -1 && this.smallValue == Integer.MIN_VALUE) {
            this.integerMode = 1;
            this.mnum = MutableNumber.FromEInteger(ValueNegativeInt32MinValue);
        } else {
            this.smallValue /= i2;
        }
        return this;
    }

    FastInteger Increment() {
        if (this.integerMode != 0) {
            return AddInt(1);
        }
        int i2 = this.smallValue;
        if (i2 != Integer.MAX_VALUE) {
            this.smallValue = i2 + 1;
        } else {
            this.integerMode = 1;
            this.mnum = MutableNumber.FromEInteger(ValueNegativeInt32MinValue);
        }
        return this;
    }

    FastInteger Multiply(int i2) {
        if (i2 == 0) {
            this.smallValue = 0;
            this.integerMode = 0;
        } else {
            int i3 = this.integerMode;
            if (i3 == 0) {
                long j2 = i2;
                int i4 = this.smallValue;
                long j3 = ((long) i4) * j2;
                if (j3 > 2147483647L || j3 < -2147483648L) {
                    boolean z2 = ((long) i4) > 0;
                    boolean z3 = j2 > 0;
                    if (z2 && z3) {
                        this.integerMode = 1;
                        this.mnum = MutableNumber.FromInt64(j3);
                    } else {
                        this.integerMode = 2;
                        this.largeValue = EInteger.FromInt64(j3);
                    }
                } else {
                    this.smallValue = (int) j3;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException();
                }
                this.largeValue = this.largeValue.Multiply(EInteger.FromInt32(i2));
            } else if (i2 < 0) {
                this.integerMode = 2;
                EInteger eIntegerToEInteger = this.mnum.ToEInteger();
                this.largeValue = eIntegerToEInteger;
                this.largeValue = eIntegerToEInteger.Multiply(EInteger.FromInt32(i2));
            } else {
                this.mnum.Multiply(i2);
            }
        }
        return this;
    }

    FastInteger Negate() {
        int i2 = this.integerMode;
        if (i2 == 0) {
            int i3 = this.smallValue;
            if (i3 == Integer.MIN_VALUE) {
                this.integerMode = 1;
                this.mnum = MutableNumber.FromEInteger(ValueNegativeInt32MinValue);
            } else {
                this.smallValue = -i3;
            }
        } else if (i2 == 1) {
            this.integerMode = 2;
            EInteger eIntegerToEInteger = this.mnum.ToEInteger();
            this.largeValue = eIntegerToEInteger;
            this.largeValue = eIntegerToEInteger.Negate();
        } else {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            this.largeValue = this.largeValue.Negate();
        }
        return this;
    }

    FastInteger Remainder(int i2) {
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        int i3 = this.integerMode;
        if (i3 == 0) {
            this.smallValue %= i2;
        } else if (i3 == 1) {
            EInteger eIntegerToEInteger = this.mnum.ToEInteger();
            this.largeValue = eIntegerToEInteger;
            EInteger eIntegerRemainder = eIntegerToEInteger.Remainder(EInteger.FromInt64(i2));
            this.largeValue = eIntegerRemainder;
            this.smallValue = eIntegerRemainder.ToInt32Checked();
            this.integerMode = 0;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException();
            }
            EInteger eIntegerRemainder2 = this.largeValue.Remainder(EInteger.FromInt64(i2));
            this.largeValue = eIntegerRemainder2;
            this.smallValue = eIntegerRemainder2.ToInt32Checked();
            this.integerMode = 0;
        }
        return this;
    }

    FastInteger SetInt(int i2) {
        this.smallValue = i2;
        this.integerMode = 0;
        return this;
    }

    EInteger ShiftEIntegerLeftByThis(EInteger eInteger) {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return eInteger.ShiftLeft(this.smallValue);
        }
        if (i2 == 1) {
            return eInteger.ShiftLeft(this.mnum.ToEInteger());
        }
        if (i2 == 2) {
            return eInteger.ShiftLeft(this.largeValue);
        }
        throw new IllegalStateException();
    }

    FastInteger Subtract(FastInteger fastInteger) {
        int i2;
        int i3 = this.integerMode;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException();
                }
                this.largeValue = this.largeValue.Subtract(fastInteger.ToEInteger());
            } else if (fastInteger.integerMode == 1 && this.mnum.compareTo(fastInteger.mnum) >= 0 && fastInteger.mnum.CompareToInt(0) >= 0) {
                this.mnum.Subtract(fastInteger.mnum);
            } else if (fastInteger.integerMode != 0 || (i2 = fastInteger.smallValue) < 0 || this.mnum.CompareToInt(i2) < 0) {
                this.integerMode = 2;
                this.largeValue = this.mnum.ToEInteger();
                this.largeValue = this.largeValue.Subtract(fastInteger.ToEInteger());
            } else {
                this.mnum.SubtractInt(fastInteger.smallValue);
            }
        } else if (fastInteger.integerMode == 0) {
            int i4 = fastInteger.smallValue;
            if ((i4 >= 0 || Integer.MAX_VALUE + i4 >= this.smallValue) && (i4 <= 0 || Integer.MIN_VALUE + i4 <= this.smallValue)) {
                this.smallValue -= i4;
            } else {
                this.integerMode = 2;
                EInteger eIntegerFromInt32 = EInteger.FromInt32(this.smallValue);
                this.largeValue = eIntegerFromInt32;
                this.largeValue = eIntegerFromInt32.Subtract(EInteger.FromInt32(i4));
            }
        } else {
            this.integerMode = 2;
            this.largeValue = EInteger.FromInt32(this.smallValue);
            this.largeValue = this.largeValue.Subtract(fastInteger.ToEInteger());
        }
        return this;
    }

    FastInteger SubtractBig(EInteger eInteger) {
        if (this.integerMode == 2) {
            this.largeValue = this.largeValue.Subtract(eInteger);
            return this;
        }
        int iSignum = eInteger.signum();
        return iSignum == 0 ? this : (iSignum >= 0 || eInteger.compareTo(ValueInt32MinValue) <= 0) ? (iSignum <= 0 || eInteger.compareTo(ValueInt32MaxValue) > 0) ? AddBig(eInteger.Negate()) : SubtractInt(eInteger.ToInt32Checked()) : AddInt(-eInteger.ToInt32Checked());
    }

    FastInteger SubtractInt(int i2) {
        if (i2 == Integer.MIN_VALUE) {
            return AddBig(ValueNegativeInt32MinValue);
        }
        if (this.integerMode != 0) {
            return AddInt(-i2);
        }
        if ((i2 >= 0 || Integer.MAX_VALUE + i2 >= this.smallValue) && (i2 <= 0 || Integer.MIN_VALUE + i2 <= this.smallValue)) {
            this.smallValue -= i2;
        } else {
            this.integerMode = 2;
            EInteger eIntegerFromInt32 = EInteger.FromInt32(this.smallValue);
            this.largeValue = eIntegerFromInt32;
            this.largeValue = eIntegerFromInt32.Subtract(EInteger.FromInt32(i2));
        }
        return this;
    }

    FastInteger SubtractInt64(long j2) {
        return (j2 < -2147483648L || j2 > 2147483647L) ? SubtractBig(EInteger.FromInt64(j2)) : SubtractInt((int) j2);
    }

    EInteger ToEInteger() {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return EInteger.FromInt32(this.smallValue);
        }
        if (i2 == 1) {
            return this.mnum.ToEInteger();
        }
        if (i2 == 2) {
            return this.largeValue;
        }
        throw new IllegalStateException();
    }

    int ToInt32() {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return this.smallValue;
        }
        if (i2 == 1) {
            return this.mnum.ToInt32();
        }
        if (i2 == 2) {
            return this.largeValue.ToInt32Checked();
        }
        throw new IllegalStateException();
    }

    long ToInt64() {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return this.smallValue;
        }
        if (i2 == 1) {
            return ToEInteger().ToInt64Unchecked();
        }
        if (i2 == 2) {
            return this.largeValue.ToInt64Unchecked();
        }
        throw new IllegalStateException();
    }

    public int compareTo(EInteger eInteger) {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return -eInteger.compareTo(this.smallValue);
        }
        if (i2 == 1) {
            return ToEInteger().compareTo(eInteger);
        }
        if (i2 == 2) {
            return this.largeValue.compareTo(eInteger);
        }
        throw new IllegalStateException();
    }

    @Override // java.lang.Comparable
    public int compareTo(FastInteger fastInteger) {
        switch ((-1) - (((-1) - (this.integerMode << 2)) & ((-1) - fastInteger.integerMode))) {
            case 0:
                int i2 = fastInteger.smallValue;
                int i3 = this.smallValue;
                if (i3 == i2) {
                    return 0;
                }
                return i3 < i2 ? -1 : 1;
            case 1:
                return -fastInteger.mnum.CompareToInt(this.smallValue);
            case 2:
                return -fastInteger.largeValue.compareTo(this.smallValue);
            case 3:
            case 7:
            default:
                throw new IllegalStateException();
            case 4:
                return this.mnum.CompareToInt(fastInteger.smallValue);
            case 5:
                return this.mnum.compareTo(fastInteger.mnum);
            case 6:
                return ToEInteger().compareTo(fastInteger.largeValue);
            case 8:
            case 9:
            case 10:
                return this.largeValue.compareTo(fastInteger.ToEInteger());
        }
    }

    final boolean isEvenNumber() {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return (-1) - (((-1) - this.smallValue) | ((-1) - 1)) == 0;
        }
        if (i2 == 1) {
            return this.mnum.isEvenNumber();
        }
        if (i2 == 2) {
            return this.largeValue.isEven();
        }
        throw new IllegalStateException();
    }

    final boolean isValueZero() {
        int i2 = this.integerMode;
        if (i2 == 0) {
            return this.smallValue == 0;
        }
        if (i2 == 1) {
            return this.mnum.signum() == 0;
        }
        if (i2 == 2) {
            return this.largeValue.isZero();
        }
        throw new IllegalStateException();
    }

    final int signum() {
        int i2 = this.integerMode;
        if (i2 == 0) {
            int i3 = this.smallValue;
            if (i3 == 0) {
                return 0;
            }
            return i3 < 0 ? -1 : 1;
        }
        if (i2 == 1) {
            return this.mnum.signum();
        }
        if (i2 != 2) {
            return 0;
        }
        return this.largeValue.signum();
    }

    public String toString() {
        int i2 = this.integerMode;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "" : this.largeValue.toString() : this.mnum.ToEInteger().toString() : IntToString(this.smallValue);
    }
}
