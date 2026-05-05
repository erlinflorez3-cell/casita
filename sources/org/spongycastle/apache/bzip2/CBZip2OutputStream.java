package org.spongycastle.apache.bzip2;

import androidx.core.view.InputDeviceCompat;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class CBZip2OutputStream extends OutputStream implements BZip2Constants {
    protected static final int CLEARMASK = -2097153;
    protected static final int DEPTH_THRESH = 10;
    protected static final int GREATER_ICOST = 15;
    protected static final int LESSER_ICOST = 0;
    protected static final int QSORT_STACK_SIZE = 1000;
    protected static final int SETMASK = 2097152;
    protected static final int SMALL_THRESH = 20;
    private int allowableBlockSize;
    private char[] block;
    private int blockCRC;
    boolean blockRandomised;
    int blockSize100k;
    int bsBuff;
    int bsLive;
    private OutputStream bsStream;
    int bytesOut;
    boolean closed;
    private int combinedCRC;
    private int currentChar;
    private boolean finished;
    private boolean firstAttempt;
    private int[] ftab;
    private boolean[] inUse;
    private int[] incs;
    int last;
    CRC mCrc;
    private int[] mtfFreq;
    private int nBlocksRandomised;
    private int nInUse;
    private int nMTF;
    int origPtr;
    private int[] quadrant;
    private int runLength;
    private char[] selector;
    private char[] selectorMtf;
    private char[] seqToUnseq;
    private short[] szptr;
    private char[] unseqToSeq;
    private int workDone;
    private int workFactor;
    private int workLimit;
    private int[] zptr;

    private static class StackElem {
        int dd;
        int hh;
        int ll;

        private StackElem() {
        }
    }

    public CBZip2OutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, 9);
    }

    public CBZip2OutputStream(OutputStream outputStream, int i2) throws IOException {
        this.mCrc = new CRC();
        this.inUse = new boolean[256];
        this.seqToUnseq = new char[256];
        this.unseqToSeq = new char[256];
        this.selector = new char[BZip2Constants.MAX_SELECTORS];
        this.selectorMtf = new char[BZip2Constants.MAX_SELECTORS];
        this.mtfFreq = new int[258];
        this.currentChar = -1;
        this.runLength = 0;
        this.closed = false;
        this.incs = new int[]{1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161, 2391484};
        this.block = null;
        this.quadrant = null;
        this.zptr = null;
        this.ftab = null;
        outputStream.write(66);
        outputStream.write(90);
        bsSetStream(outputStream);
        this.workFactor = 50;
        i2 = i2 > 9 ? 9 : i2;
        this.blockSize100k = i2 < 1 ? 1 : i2;
        allocateCompressStructures();
        initialize();
        initBlock();
    }

    private void allocateCompressStructures() {
        int i2 = this.blockSize100k;
        int i3 = 100000 * i2;
        this.block = new char[i3 + 21];
        this.quadrant = new int[i3 + 20];
        this.zptr = new int[i3];
        this.ftab = new int[65537];
        this.szptr = new short[i2 * 200000];
    }

    private void bsFinishedWithStream() throws IOException {
        while (this.bsLive > 0) {
            this.bsStream.write(this.bsBuff >> 24);
            this.bsBuff <<= 8;
            this.bsLive -= 8;
            this.bytesOut++;
        }
    }

    private void bsPutIntVS(int i2, int i3) throws IOException {
        bsW(i2, i3);
    }

    private void bsPutUChar(int i2) throws IOException {
        bsW(8, i2);
    }

    private void bsPutint(int i2) throws IOException {
        bsW(8, (i2 >> 24) & 255);
        bsW(8, (-1) - (((-1) - (i2 >> 16)) | ((-1) - 255)));
        int i3 = i2 >> 8;
        bsW(8, (i3 + 255) - (i3 | 255));
        bsW(8, (i2 + 255) - (i2 | 255));
    }

    private void bsSetStream(OutputStream outputStream) {
        this.bsStream = outputStream;
        this.bsLive = 0;
        this.bsBuff = 0;
        this.bytesOut = 0;
    }

    private void bsW(int i2, int i3) throws IOException {
        while (true) {
            int i4 = this.bsLive;
            if (i4 < 8) {
                this.bsBuff = (i3 << ((32 - i4) - i2)) | this.bsBuff;
                this.bsLive = i4 + i2;
                return;
            } else {
                this.bsStream.write(this.bsBuff >> 24);
                this.bsBuff <<= 8;
                this.bsLive -= 8;
                this.bytesOut++;
            }
        }
    }

    private void doReversibleTransformation() {
        this.workLimit = this.workFactor * this.last;
        int i2 = 0;
        this.workDone = 0;
        this.blockRandomised = false;
        this.firstAttempt = true;
        mainSort();
        if (this.workDone > this.workLimit && this.firstAttempt) {
            randomiseBlock();
            this.workDone = 0;
            this.workLimit = 0;
            this.blockRandomised = true;
            this.firstAttempt = false;
            mainSort();
        }
        this.origPtr = -1;
        while (true) {
            if (i2 > this.last) {
                break;
            }
            if (this.zptr[i2] == 0) {
                this.origPtr = i2;
                break;
            }
            i2++;
        }
        if (this.origPtr == -1) {
            panic();
        }
    }

    private void endBlock() throws IOException {
        int finalCRC = this.mCrc.getFinalCRC();
        this.blockCRC = finalCRC;
        int i2 = this.combinedCRC;
        int i3 = i2 << 1;
        int i4 = i2 >>> 31;
        this.combinedCRC = finalCRC ^ ((i4 + i3) - (i4 & i3));
        doReversibleTransformation();
        bsPutUChar(49);
        bsPutUChar(65);
        bsPutUChar(89);
        bsPutUChar(38);
        bsPutUChar(83);
        bsPutUChar(89);
        bsPutint(this.blockCRC);
        if (this.blockRandomised) {
            bsW(1, 1);
            this.nBlocksRandomised++;
        } else {
            bsW(1, 0);
        }
        moveToFrontCodeAndSend();
    }

    private void endCompression() throws IOException {
        bsPutUChar(23);
        bsPutUChar(114);
        bsPutUChar(69);
        bsPutUChar(56);
        bsPutUChar(80);
        bsPutUChar(144);
        bsPutint(this.combinedCRC);
        bsFinishedWithStream();
    }

    private boolean fullGtU(int i2, int i3) {
        char[] cArr = this.block;
        char c2 = cArr[i2 + 1];
        char c3 = cArr[i3 + 1];
        if (c2 != c3) {
            return c2 > c3;
        }
        char c4 = cArr[i2 + 2];
        char c5 = cArr[i3 + 2];
        if (c4 != c5) {
            return c4 > c5;
        }
        char c6 = cArr[i2 + 3];
        char c7 = cArr[i3 + 3];
        if (c6 != c7) {
            return c6 > c7;
        }
        char c8 = cArr[i2 + 4];
        char c9 = cArr[i3 + 4];
        if (c8 != c9) {
            return c8 > c9;
        }
        char c10 = cArr[i2 + 5];
        char c11 = cArr[i3 + 5];
        if (c10 != c11) {
            return c10 > c11;
        }
        int i4 = i2 + 6;
        char c12 = cArr[i4];
        int i5 = i3 + 6;
        char c13 = cArr[i5];
        if (c12 != c13) {
            return c12 > c13;
        }
        int i6 = this.last + 1;
        do {
            char[] cArr2 = this.block;
            int i7 = i4 + 1;
            char c14 = cArr2[i7];
            int i8 = i5 + 1;
            char c15 = cArr2[i8];
            if (c14 != c15) {
                return c14 > c15;
            }
            int[] iArr = this.quadrant;
            int i9 = iArr[i4];
            int i10 = iArr[i5];
            if (i9 != i10) {
                return i9 > i10;
            }
            int i11 = i4 + 2;
            char c16 = cArr2[i11];
            int i12 = i5 + 2;
            char c17 = cArr2[i12];
            if (c16 != c17) {
                return c16 > c17;
            }
            int i13 = iArr[i7];
            int i14 = iArr[i8];
            if (i13 != i14) {
                return i13 > i14;
            }
            int i15 = i4 + 3;
            char c18 = cArr2[i15];
            int i16 = i5 + 3;
            char c19 = cArr2[i16];
            if (c18 != c19) {
                return c18 > c19;
            }
            int i17 = iArr[i11];
            int i18 = iArr[i12];
            if (i17 != i18) {
                return i17 > i18;
            }
            i4 += 4;
            char c20 = cArr2[i4];
            i5 += 4;
            char c21 = cArr2[i5];
            if (c20 != c21) {
                return c20 > c21;
            }
            int i19 = iArr[i15];
            int i20 = iArr[i16];
            if (i19 != i20) {
                return i19 > i20;
            }
            int i21 = this.last;
            if (i4 > i21) {
                i4 = (i4 - i21) - 1;
            }
            if (i5 > i21) {
                i5 = (i5 - i21) - 1;
            }
            i6 -= 4;
            this.workDone++;
        } while (i6 >= 0);
        return false;
    }

    private void generateMTFValues() {
        char[] cArr = new char[256];
        makeMaps();
        int i2 = this.nInUse + 1;
        for (int i3 = 0; i3 <= i2; i3++) {
            this.mtfFreq[i3] = 0;
        }
        for (int i4 = 0; i4 < this.nInUse; i4++) {
            cArr[i4] = (char) i4;
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 <= this.last; i7++) {
            char c2 = this.unseqToSeq[this.block[this.zptr[i7]]];
            char c3 = cArr[0];
            int i8 = 0;
            while (c2 != c3) {
                i8++;
                char c4 = cArr[i8];
                cArr[i8] = c3;
                c3 = c4;
            }
            cArr[0] = c3;
            if (i8 == 0) {
                i5++;
            } else {
                if (i5 > 0) {
                    int i9 = i5 - 1;
                    while (true) {
                        int i10 = i9 % 2;
                        if (i10 == 0) {
                            this.szptr[i6] = 0;
                            i6++;
                            int[] iArr = this.mtfFreq;
                            iArr[0] = iArr[0] + 1;
                        } else if (i10 == 1) {
                            this.szptr[i6] = 1;
                            i6++;
                            int[] iArr2 = this.mtfFreq;
                            iArr2[1] = iArr2[1] + 1;
                        }
                        if (i9 < 2) {
                            break;
                        } else {
                            i9 = (i9 - 2) / 2;
                        }
                    }
                    i5 = 0;
                }
                int i11 = i8 + 1;
                this.szptr[i6] = (short) i11;
                i6++;
                int[] iArr3 = this.mtfFreq;
                iArr3[i11] = iArr3[i11] + 1;
            }
        }
        if (i5 > 0) {
            int i12 = i5 - 1;
            while (true) {
                int i13 = i12 % 2;
                if (i13 == 0) {
                    this.szptr[i6] = 0;
                    i6++;
                    int[] iArr4 = this.mtfFreq;
                    iArr4[0] = iArr4[0] + 1;
                } else if (i13 == 1) {
                    this.szptr[i6] = 1;
                    i6++;
                    int[] iArr5 = this.mtfFreq;
                    iArr5[1] = iArr5[1] + 1;
                }
                if (i12 < 2) {
                    break;
                } else {
                    i12 = (i12 - 2) / 2;
                }
            }
        }
        this.szptr[i6] = (short) i2;
        int[] iArr6 = this.mtfFreq;
        iArr6[i2] = iArr6[i2] + 1;
        this.nMTF = i6 + 1;
    }

    private void hbAssignCodes(int[] iArr, char[] cArr, int i2, int i3, int i4) {
        int i5 = 0;
        while (i2 <= i3) {
            for (int i6 = 0; i6 < i4; i6++) {
                if (cArr[i6] == i2) {
                    iArr[i6] = i5;
                    i5++;
                }
            }
            i5 <<= 1;
            i2++;
        }
    }

    protected static void hbMakeCodeLengths(char[] cArr, int[] iArr, int i2, int i3) {
        int i4 = 260;
        int[] iArr2 = new int[260];
        int i5 = 516;
        int[] iArr3 = new int[516];
        int[] iArr4 = new int[516];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                break;
            }
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            if (i10 != 0) {
                i8 = i10;
            }
            iArr3[i9] = i8 << 8;
            i7 = i9;
        }
        while (true) {
            iArr2[i6] = i6;
            iArr3[i6] = i6;
            iArr4[i6] = -2;
            for (int i11 = 1; i11 <= i2; i11++) {
                iArr4[i11] = -1;
                i6++;
                iArr2[i6] = i11;
                int i12 = i6;
                while (true) {
                    int i13 = iArr3[i11];
                    int i14 = i12 >> 1;
                    int i15 = iArr2[i14];
                    if (i13 < iArr3[i15]) {
                        iArr2[i12] = i15;
                        i12 = i14;
                    }
                }
                iArr2[i12] = i11;
            }
            if (i6 >= i4) {
                panic();
            }
            int i16 = i2;
            while (i6 > 1) {
                int i17 = iArr2[1];
                int i18 = iArr2[i6];
                iArr2[1] = i18;
                int i19 = i6 - 1;
                int i20 = 1;
                while (true) {
                    int i21 = i20 << 1;
                    if (i21 > i19) {
                        break;
                    }
                    if (i21 < i19) {
                        int i22 = i21 + 1;
                        if (iArr3[iArr2[i22]] < iArr3[iArr2[i21]]) {
                            i21 = i22;
                        }
                    }
                    int i23 = iArr3[i18];
                    int i24 = iArr2[i21];
                    if (i23 < iArr3[i24]) {
                        break;
                    }
                    iArr2[i20] = i24;
                    i20 = i21;
                }
                iArr2[i20] = i18;
                int i25 = iArr2[1];
                int i26 = iArr2[i19];
                iArr2[1] = i26;
                int i27 = i6 - 2;
                int i28 = 1;
                while (true) {
                    int i29 = i28 << 1;
                    if (i29 > i27) {
                        break;
                    }
                    if (i29 < i27) {
                        int i30 = i29 + 1;
                        if (iArr3[iArr2[i30]] < iArr3[iArr2[i29]]) {
                            i29 = i30;
                        }
                    }
                    int i31 = iArr3[i26];
                    int i32 = iArr2[i29];
                    if (i31 < iArr3[i32]) {
                        break;
                    }
                    iArr2[i28] = i32;
                    i28 = i29;
                }
                iArr2[i28] = i26;
                i16++;
                iArr4[i25] = i16;
                iArr4[i17] = i16;
                int i33 = iArr3[i17];
                int i34 = (-1) - (((-1) - i33) | ((-1) - InputDeviceCompat.SOURCE_ANY));
                int i35 = iArr3[i25];
                iArr3[i16] = (((i33 & 255) > (i35 + 255) - (255 | i35) ? (i33 + 255) - (i33 | 255) : (i35 + 255) - (i35 | 255)) + 1) | (i34 + ((i35 + InputDeviceCompat.SOURCE_ANY) - ((-256) | i35)));
                iArr4[i16] = -1;
                i6--;
                iArr2[i6] = i16;
                int i36 = i6;
                while (true) {
                    int i37 = iArr3[i16];
                    int i38 = i36 >> 1;
                    int i39 = iArr2[i38];
                    if (i37 < iArr3[i39]) {
                        iArr2[i36] = i39;
                        i36 = i38;
                    }
                }
                iArr2[i36] = i16;
                i5 = 516;
            }
            if (i16 >= i5) {
                panic();
            }
            boolean z2 = false;
            for (int i40 = 1; i40 <= i2; i40++) {
                int i41 = i40;
                int i42 = 0;
                while (true) {
                    i41 = iArr4[i41];
                    if (i41 < 0) {
                        break;
                    } else {
                        i42++;
                    }
                }
                cArr[i40 - 1] = (char) i42;
                if (i42 > i3) {
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
            for (int i43 = 1; i43 < i2; i43++) {
                iArr3[i43] = (((iArr3[i43] >> 8) / 2) + 1) << 8;
            }
            i4 = 260;
            i6 = 0;
        }
    }

    private void initBlock() {
        this.mCrc.initialiseCRC();
        this.last = -1;
        for (int i2 = 0; i2 < 256; i2++) {
            this.inUse[i2] = false;
        }
        this.allowableBlockSize = (this.blockSize100k * 100000) - 20;
    }

    private void initialize() throws IOException {
        this.bytesOut = 0;
        this.nBlocksRandomised = 0;
        bsPutUChar(104);
        bsPutUChar(this.blockSize100k + 48);
        this.combinedCRC = 0;
    }

    private void mainSort() {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        boolean[] zArr = new boolean[256];
        int i6 = 0;
        while (true) {
            i2 = 2;
            if (i6 >= 20) {
                break;
            }
            char[] cArr = this.block;
            int i7 = this.last;
            cArr[i7 + i6 + 2] = cArr[(i6 % (i7 + 1)) + 1];
            i6++;
        }
        int i8 = 0;
        while (true) {
            i3 = this.last;
            if (i8 > i3 + 20) {
                break;
            }
            this.quadrant[i8] = 0;
            i8++;
        }
        char[] cArr2 = this.block;
        cArr2[0] = cArr2[i3 + 1];
        if (i3 >= 4000) {
            for (int i9 = 0; i9 <= 255; i9++) {
                zArr[i9] = false;
            }
            for (int i10 = 0; i10 <= 65536; i10++) {
                this.ftab[i10] = 0;
            }
            char c2 = this.block[0];
            int i11 = 0;
            while (i11 <= this.last) {
                i11++;
                char c3 = this.block[i11];
                int[] iArr3 = this.ftab;
                int i12 = (c2 << '\b') + c3;
                iArr3[i12] = iArr3[i12] + 1;
                c2 = c3;
            }
            for (int i13 = 1; i13 <= 65536; i13++) {
                int[] iArr4 = this.ftab;
                iArr4[i13] = iArr4[i13] + iArr4[i13 - 1];
            }
            char c4 = this.block[1];
            int i14 = 0;
            while (true) {
                i4 = this.last;
                if (i14 >= i4) {
                    break;
                }
                char c5 = this.block[i14 + 2];
                int i15 = (c4 << '\b') + c5;
                int[] iArr5 = this.ftab;
                int i16 = iArr5[i15] - 1;
                iArr5[i15] = i16;
                this.zptr[i16] = i14;
                i14++;
                c4 = c5;
            }
            char[] cArr3 = this.block;
            int i17 = (cArr3[i4 + 1] << '\b') + cArr3[1];
            int[] iArr6 = this.ftab;
            int i18 = iArr6[i17] - 1;
            iArr6[i17] = i18;
            this.zptr[i18] = i4;
            for (int i19 = 0; i19 <= 255; i19++) {
                iArr[i19] = i19;
            }
            int i20 = 1;
            do {
                i20 = (i20 * 3) + 1;
            } while (i20 <= 256);
            do {
                i20 /= 3;
                for (int i21 = i20; i21 <= 255; i21++) {
                    int i22 = iArr[i21];
                    int i23 = i21;
                    do {
                        int[] iArr7 = this.ftab;
                        i5 = i23 - i20;
                        int i24 = iArr[i5];
                        if (iArr7[(i24 + 1) << 8] - iArr7[i24 << 8] > iArr7[(i22 + 1) << 8] - iArr7[i22 << 8]) {
                            iArr[i23] = i24;
                            i23 = i5;
                        }
                        iArr[i23] = i22;
                    } while (i5 > i20 - 1);
                    iArr[i23] = i22;
                }
            } while (i20 != 1);
            int i25 = 0;
            while (i25 <= 255) {
                int i26 = iArr[i25];
                for (int i27 = 0; i27 <= 255; i27++) {
                    int i28 = (i26 << 8) + i27;
                    int[] iArr8 = this.ftab;
                    int i29 = iArr8[i28];
                    if ((-1) - (((-1) - i29) | ((-1) - 2097152)) != 2097152) {
                        int i30 = (i29 + CLEARMASK) - (i29 | CLEARMASK);
                        int i31 = (CLEARMASK & iArr8[i28 + 1]) - 1;
                        if (i31 > i30) {
                            qSort3(i30, i31, i2);
                            if (this.workDone > this.workLimit && this.firstAttempt) {
                                return;
                            }
                        }
                        int[] iArr9 = this.ftab;
                        int i32 = iArr9[i28];
                        iArr9[i28] = (2097152 + i32) - (2097152 & i32);
                    }
                }
                zArr[i26] = true;
                if (i25 < 255) {
                    int[] iArr10 = this.ftab;
                    int i33 = iArr10[i26 << 8] & CLEARMASK;
                    int i34 = (iArr10[(i26 + 1) << 8] & CLEARMASK) - i33;
                    int i35 = 0;
                    while ((i34 >> i35) > 65534) {
                        i35++;
                    }
                    for (int i36 = 0; i36 < i34; i36++) {
                        int i37 = this.zptr[i33 + i36];
                        int i38 = i36 >> i35;
                        int[] iArr11 = this.quadrant;
                        iArr11[i37] = i38;
                        if (i37 < 20) {
                            iArr11[i37 + this.last + 1] = i38;
                        }
                    }
                    if (((i34 - 1) >> i35) > 65535) {
                        panic();
                    }
                }
                for (int i39 = 0; i39 <= 255; i39++) {
                    iArr2[i39] = (-1) - (((-1) - this.ftab[(i39 << 8) + i26]) | ((-1) - CLEARMASK));
                }
                int i40 = this.ftab[i26 << 8] & CLEARMASK;
                while (true) {
                    int i41 = this.ftab[(i26 + 1) << 8];
                    if (i40 >= (i41 + CLEARMASK) - (i41 | CLEARMASK)) {
                        break;
                    }
                    char[] cArr4 = this.block;
                    int[] iArr12 = this.zptr;
                    int i42 = iArr12[i40];
                    char c6 = cArr4[i42];
                    if (!zArr[c6]) {
                        iArr12[iArr2[c6]] = i42 == 0 ? this.last : i42 - 1;
                        iArr2[c6] = iArr2[c6] + 1;
                    }
                    i40++;
                }
                for (int i43 = 0; i43 <= 255; i43++) {
                    int[] iArr13 = this.ftab;
                    int i44 = (i43 << 8) + i26;
                    iArr13[i44] = iArr13[i44] | 2097152;
                }
                i25++;
                i2 = 2;
            }
            return;
        }
        int i45 = 0;
        while (true) {
            int i46 = this.last;
            if (i45 > i46) {
                this.firstAttempt = false;
                this.workLimit = 0;
                this.workDone = 0;
                simpleSort(0, i46, 0);
                return;
            }
            this.zptr[i45] = i45;
            i45++;
        }
    }

    private void makeMaps() {
        this.nInUse = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (this.inUse[i2]) {
                char[] cArr = this.seqToUnseq;
                int i3 = this.nInUse;
                cArr[i3] = (char) i2;
                this.unseqToSeq[i2] = (char) i3;
                this.nInUse = i3 + 1;
            }
        }
    }

    private char med3(char c2, char c3, char c4) {
        if (c2 <= c3) {
            c3 = c2;
            c2 = c3;
        }
        if (c2 <= c4) {
            c4 = c2;
        }
        return c3 > c4 ? c3 : c4;
    }

    private void moveToFrontCodeAndSend() throws IOException {
        bsPutIntVS(24, this.origPtr);
        generateMTFValues();
        sendMTFValues();
    }

    private static void panic() {
        System.out.println("panic");
    }

    private void qSort3(int i2, int i3, int i4) {
        StackElem[] stackElemArr = new StackElem[1000];
        for (int i5 = 0; i5 < 1000; i5++) {
            stackElemArr[i5] = new StackElem();
        }
        stackElemArr[0].ll = i2;
        stackElemArr[0].hh = i3;
        stackElemArr[0].dd = i4;
        int i6 = 1;
        while (i6 > 0) {
            if (i6 >= 1000) {
                panic();
            }
            int i7 = i6 - 1;
            int i8 = stackElemArr[i7].ll;
            int i9 = stackElemArr[i7].hh;
            int i10 = stackElemArr[i7].dd;
            if (i9 - i8 < 20 || i10 > 10) {
                simpleSort(i8, i9, i10);
                if (this.workDone > this.workLimit && this.firstAttempt) {
                    return;
                } else {
                    i6 = i7;
                }
            } else {
                char[] cArr = this.block;
                int[] iArr = this.zptr;
                char cMed3 = med3(cArr[iArr[i8] + i10 + 1], cArr[iArr[i9] + i10 + 1], cArr[iArr[(i8 + i9) >> 1] + i10 + 1]);
                int i11 = i8;
                int i12 = i11;
                int i13 = i9;
                int i14 = i13;
                while (true) {
                    if (i11 <= i13) {
                        char[] cArr2 = this.block;
                        int[] iArr2 = this.zptr;
                        int i15 = iArr2[i11];
                        int i16 = cArr2[(i15 + i10) + 1] - cMed3;
                        if (i16 == 0) {
                            iArr2[i11] = iArr2[i12];
                            iArr2[i12] = i15;
                            i12++;
                        } else if (i16 > 0) {
                        }
                        i11++;
                    }
                    while (i11 <= i13) {
                        char[] cArr3 = this.block;
                        int[] iArr3 = this.zptr;
                        int i17 = iArr3[i13];
                        int i18 = cArr3[(i17 + i10) + 1] - cMed3;
                        if (i18 != 0) {
                            if (i18 < 0) {
                                break;
                            }
                        } else {
                            iArr3[i13] = iArr3[i14];
                            iArr3[i14] = i17;
                            i14--;
                        }
                        i13--;
                    }
                    if (i11 > i13) {
                        break;
                    }
                    int[] iArr4 = this.zptr;
                    int i19 = iArr4[i11];
                    iArr4[i11] = iArr4[i13];
                    iArr4[i13] = i19;
                    i11++;
                    i13--;
                }
                if (i14 < i12) {
                    stackElemArr[i7].ll = i8;
                    stackElemArr[i7].hh = i9;
                    stackElemArr[i7].dd = i10 + 1;
                } else {
                    int i20 = i12 - i8;
                    int i21 = i11 - i12;
                    if (i20 >= i21) {
                        i20 = i21;
                    }
                    vswap(i8, i11 - i20, i20);
                    int i22 = i9 - i14;
                    int i23 = i14 - i13;
                    if (i22 >= i23) {
                        i22 = i23;
                    }
                    vswap(i11, (i9 - i22) + 1, i22);
                    int i24 = (i11 + i8) - i12;
                    int i25 = i9 - i23;
                    int i26 = i25 + 1;
                    stackElemArr[i7].ll = i8;
                    stackElemArr[i7].hh = i24 - 1;
                    stackElemArr[i7].dd = i10;
                    stackElemArr[i6].ll = i24;
                    stackElemArr[i6].hh = i25;
                    stackElemArr[i6].dd = i10 + 1;
                    int i27 = i6 + 1;
                    stackElemArr[i27].ll = i26;
                    stackElemArr[i27].hh = i9;
                    stackElemArr[i27].dd = i10;
                    i6 += 2;
                }
            }
        }
    }

    private void randomiseBlock() {
        for (int i2 = 0; i2 < 256; i2++) {
            this.inUse[i2] = false;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 <= this.last) {
            if (i4 == 0) {
                i4 = (char) rNums[i5];
                i5++;
                if (i5 == 512) {
                    i5 = 0;
                }
            }
            i4--;
            char[] cArr = this.block;
            i3++;
            char c2 = (char) (cArr[i3] ^ (i4 == 1 ? (char) 1 : (char) 0));
            cArr[i3] = c2;
            char c3 = (char) ((-1) - ((65535 - c2) | ((-1) - 255)));
            cArr[i3] = c3;
            this.inUse[c3] = true;
        }
    }

    private void sendMTFValues() throws IOException {
        char c2 = 2;
        char c3 = 1;
        short s2 = 0;
        int i2 = 6;
        char[][] cArr = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
        int i3 = this.nInUse;
        int i4 = i3 + 2;
        for (int i5 = 0; i5 < 6; i5++) {
            for (int i6 = 0; i6 < i4; i6++) {
                cArr[i5][i6] = 15;
            }
        }
        if (this.nMTF <= 0) {
            panic();
        }
        int i7 = this.nMTF;
        if (i7 < 200) {
            i2 = 2;
        } else if (i7 < 600) {
            i2 = 3;
        } else if (i7 < 1200) {
            i2 = 4;
        } else if (i7 < 2400) {
            i2 = 5;
        }
        int i8 = 0;
        int i9 = i2;
        while (i9 > 0) {
            int i10 = i7 / i9;
            int i11 = i8 - 1;
            int i12 = 0;
            while (i12 < i10 && i11 < i3 + 1) {
                i11++;
                i12 += this.mtfFreq[i11];
            }
            if (i11 > i8 && i9 != i2 && i9 != 1 && (i2 - i9) % 2 == 1) {
                i12 -= this.mtfFreq[i11];
                i11--;
            }
            for (int i13 = 0; i13 < i4; i13++) {
                if (i13 < i8 || i13 > i11) {
                    cArr[i9 - 1][i13] = 15;
                } else {
                    cArr[i9 - 1][i13] = 0;
                }
            }
            i9--;
            i8 = i11 + 1;
            i7 -= i12;
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 258);
        int[] iArr2 = new int[6];
        short[] sArr = new short[6];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = 20;
            if (i14 >= 4) {
                break;
            }
            for (int i17 = s2; i17 < i2; i17++) {
                iArr2[i17] = s2;
            }
            for (int i18 = s2; i18 < i2; i18++) {
                for (int i19 = s2; i19 < i4; i19++) {
                    iArr[i18][i19] = s2;
                }
            }
            int i20 = s2;
            i15 = i20;
            while (true) {
                int i21 = this.nMTF;
                if (i20 >= i21) {
                    break;
                }
                int i22 = i20 + 49;
                if (i22 >= i21) {
                    i22 = i21 - 1;
                }
                for (int i23 = s2; i23 < i2; i23++) {
                    sArr[i23] = s2;
                }
                if (i2 == 6) {
                    int i24 = i20;
                    short s3 = s2;
                    short s4 = s3;
                    short s5 = s4;
                    short s6 = s5;
                    short s7 = s6;
                    short s8 = s7;
                    while (i24 <= i22) {
                        short s9 = this.szptr[i24];
                        s3 = (short) (s3 + cArr[s2][s9]);
                        s4 = (short) (s4 + cArr[c3][s9]);
                        s5 = (short) (s5 + cArr[c2][s9]);
                        s6 = (short) (s6 + cArr[3][s9]);
                        s7 = (short) (s7 + cArr[4][s9]);
                        s8 = (short) (s8 + cArr[5][s9]);
                        i24++;
                        c2 = 2;
                        s2 = 0;
                        c3 = 1;
                    }
                    sArr[s2] = s3;
                    sArr[1] = s4;
                    sArr[2] = s5;
                    sArr[3] = s6;
                    sArr[4] = s7;
                    sArr[5] = s8;
                } else {
                    for (int i25 = i20; i25 <= i22; i25++) {
                        short s10 = this.szptr[i25];
                        for (int i26 = 0; i26 < i2; i26++) {
                            sArr[i26] = (short) (sArr[i26] + cArr[i26][s10]);
                        }
                    }
                }
                int i27 = -1;
                short s11 = 999999999;
                for (int i28 = 0; i28 < i2; i28++) {
                    short s12 = sArr[i28];
                    if (s12 < s11) {
                        i27 = i28;
                        s11 = s12;
                    }
                }
                iArr2[i27] = iArr2[i27] + 1;
                this.selector[i15] = (char) i27;
                i15++;
                while (i20 <= i22) {
                    int[] iArr3 = iArr[i27];
                    short s13 = this.szptr[i20];
                    iArr3[s13] = iArr3[s13] + 1;
                    i20++;
                }
                i20 = i22 + 1;
                c2 = 2;
                c3 = 1;
                s2 = 0;
                i16 = 20;
            }
            for (int i29 = s2; i29 < i2; i29++) {
                hbMakeCodeLengths(cArr[i29], iArr[i29], i4, i16);
            }
            i14++;
        }
        if (i2 >= 8) {
            panic();
        }
        if (i15 >= 32768 || i15 > 18002) {
            panic();
        }
        char[] cArr2 = new char[6];
        for (int i30 = 0; i30 < i2; i30++) {
            cArr2[i30] = (char) i30;
        }
        for (int i31 = 0; i31 < i15; i31++) {
            char c4 = this.selector[i31];
            char c5 = cArr2[0];
            int i32 = 0;
            while (c4 != c5) {
                i32++;
                char c6 = cArr2[i32];
                cArr2[i32] = c5;
                c5 = c6;
            }
            cArr2[0] = c5;
            this.selectorMtf[i31] = (char) i32;
        }
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 258);
        for (int i33 = 0; i33 < i2; i33++) {
            char c7 = TokenParser.SP;
            char c8 = 0;
            for (int i34 = 0; i34 < i4; i34++) {
                char c9 = cArr[i33][i34];
                if (c9 > c8) {
                    c8 = c9;
                }
                if (c9 < c7) {
                    c7 = c9;
                }
            }
            if (c8 > 20) {
                panic();
            }
            if (c7 < 1) {
                panic();
            }
            hbAssignCodes(iArr4[i33], cArr[i33], c7 == true ? 1 : 0 ? 1 : 0, c8 == true ? 1 : 0 ? 1 : 0, i4);
        }
        boolean[] zArr = new boolean[16];
        for (int i35 = 0; i35 < 16; i35++) {
            zArr[i35] = false;
            for (int i36 = 0; i36 < 16; i36++) {
                if (this.inUse[(i35 * 16) + i36]) {
                    zArr[i35] = true;
                }
            }
        }
        for (int i37 = 0; i37 < 16; i37++) {
            if (zArr[i37]) {
                bsW(1, 1);
            } else {
                bsW(1, 0);
            }
        }
        for (int i38 = 0; i38 < 16; i38++) {
            if (zArr[i38]) {
                for (int i39 = 0; i39 < 16; i39++) {
                    if (this.inUse[(i38 * 16) + i39]) {
                        bsW(1, 1);
                    } else {
                        bsW(1, 0);
                    }
                }
            }
        }
        bsW(3, i2);
        bsW(15, i15);
        for (int i40 = 0; i40 < i15; i40++) {
            for (int i41 = 0; i41 < this.selectorMtf[i40]; i41++) {
                bsW(1, 1);
            }
            bsW(1, 0);
        }
        int i42 = 0;
        for (int i43 = 0; i43 < i2; i43++) {
            char c10 = cArr[i43][i42];
            bsW(5, c10);
            int i44 = 0;
            int i45 = c10;
            while (i44 < i4) {
                while (i45 < cArr[i43][i44]) {
                    bsW(2, 2);
                    i45++;
                }
                int i46 = i45;
                while (i46 > cArr[i43][i44]) {
                    bsW(2, 3);
                    i46--;
                }
                bsW(1, 0);
                i44++;
                i45 = i46;
            }
            i42 = 0;
        }
        int i47 = i42;
        while (true) {
            int i48 = this.nMTF;
            if (i42 >= i48) {
                break;
            }
            int i49 = i42 + 49;
            if (i49 >= i48) {
                i49 = i48 - 1;
            }
            while (i42 <= i49) {
                char c11 = this.selector[i47];
                char[] cArr3 = cArr[c11];
                short s14 = this.szptr[i42];
                bsW(cArr3[s14], iArr4[c11][s14]);
                i42++;
            }
            i42 = i49 + 1;
            i47++;
        }
        if (i47 != i15) {
            panic();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0012, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0012, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void simpleSort(int r10, int r11, int r12) {
        /*
            r9 = this;
            int r0 = r11 - r10
            int r1 = r0 + 1
            r0 = 2
            if (r1 >= r0) goto L8
            return
        L8:
            r8 = 0
        L9:
            int[] r0 = r9.incs
            r0 = r0[r8]
            if (r0 >= r1) goto L12
            int r8 = r8 + 1
            goto L9
        L12:
            int r8 = r8 + (-1)
            if (r8 < 0) goto L9d
            int[] r0 = r9.incs
            r7 = r0[r8]
            int r6 = r10 + r7
            r3 = r6
        L1d:
            if (r3 <= r11) goto L20
            goto L12
        L20:
            int[] r0 = r9.zptr
            r5 = r0[r3]
            r4 = r3
        L25:
            int[] r0 = r9.zptr
            int r2 = r4 - r7
            r1 = r0[r2]
            int r1 = r1 + r12
            int r0 = r5 + r12
            boolean r0 = r9.fullGtU(r1, r0)
            if (r0 == 0) goto L3f
            int[] r1 = r9.zptr
            r0 = r1[r2]
            r1[r4] = r0
            int r0 = r6 + (-1)
            if (r2 > r0) goto L48
            r4 = r2
        L3f:
            int[] r0 = r9.zptr
            r0[r4] = r5
            int r5 = r3 + 1
            if (r5 <= r11) goto L4a
            goto L12
        L48:
            r4 = r2
            goto L25
        L4a:
            r4 = r0[r5]
        L4c:
            int[] r0 = r9.zptr
            int r2 = r5 - r7
            r1 = r0[r2]
            int r1 = r1 + r12
            int r0 = r4 + r12
            boolean r0 = r9.fullGtU(r1, r0)
            if (r0 == 0) goto L66
            int[] r1 = r9.zptr
            r0 = r1[r2]
            r1[r5] = r0
            int r0 = r6 + (-1)
            if (r2 > r0) goto L6f
            r5 = r2
        L66:
            int[] r0 = r9.zptr
            r0[r5] = r4
            int r5 = r3 + 2
            if (r5 <= r11) goto L71
            goto L12
        L6f:
            r5 = r2
            goto L4c
        L71:
            r4 = r0[r5]
        L73:
            int[] r0 = r9.zptr
            int r2 = r5 - r7
            r1 = r0[r2]
            int r1 = r1 + r12
            int r0 = r4 + r12
            boolean r0 = r9.fullGtU(r1, r0)
            if (r0 == 0) goto L8d
            int[] r1 = r9.zptr
            r0 = r1[r2]
            r1[r5] = r0
            int r0 = r6 + (-1)
            if (r2 > r0) goto L9e
            r5 = r2
        L8d:
            int[] r0 = r9.zptr
            r0[r5] = r4
            int r3 = r3 + 3
            int r1 = r9.workDone
            int r0 = r9.workLimit
            if (r1 <= r0) goto L1d
            boolean r0 = r9.firstAttempt
            if (r0 == 0) goto L1d
        L9d:
            return
        L9e:
            r5 = r2
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.apache.bzip2.CBZip2OutputStream.simpleSort(int, int, int):void");
    }

    private void vswap(int i2, int i3, int i4) {
        while (i4 > 0) {
            int[] iArr = this.zptr;
            int i5 = iArr[i2];
            iArr[i2] = iArr[i3];
            iArr[i3] = i5;
            i2++;
            i3++;
            i4--;
        }
    }

    private void writeRun() throws IOException {
        int i2;
        if (this.last >= this.allowableBlockSize) {
            endBlock();
            initBlock();
            writeRun();
            return;
        }
        this.inUse[this.currentChar] = true;
        int i3 = 0;
        while (true) {
            i2 = this.runLength;
            if (i3 >= i2) {
                break;
            }
            this.mCrc.updateCRC((char) this.currentChar);
            i3++;
        }
        if (i2 == 1) {
            int i4 = this.last;
            this.last = i4 + 1;
            this.block[i4 + 2] = (char) this.currentChar;
            return;
        }
        if (i2 == 2) {
            int i5 = this.last;
            this.last = i5 + 1;
            char[] cArr = this.block;
            int i6 = this.currentChar;
            cArr[i5 + 2] = (char) i6;
            this.last = i5 + 2;
            cArr[i5 + 3] = (char) i6;
            return;
        }
        if (i2 == 3) {
            int i7 = this.last;
            this.last = i7 + 1;
            char[] cArr2 = this.block;
            int i8 = this.currentChar;
            cArr2[i7 + 2] = (char) i8;
            this.last = i7 + 2;
            cArr2[i7 + 3] = (char) i8;
            this.last = i7 + 3;
            cArr2[i7 + 4] = (char) i8;
            return;
        }
        this.inUse[i2 - 4] = true;
        int i9 = this.last;
        this.last = i9 + 1;
        char[] cArr3 = this.block;
        int i10 = this.currentChar;
        cArr3[i9 + 2] = (char) i10;
        this.last = i9 + 2;
        cArr3[i9 + 3] = (char) i10;
        this.last = i9 + 3;
        cArr3[i9 + 4] = (char) i10;
        this.last = i9 + 4;
        cArr3[i9 + 5] = (char) i10;
        this.last = i9 + 5;
        cArr3[i9 + 6] = (char) (i2 - 4);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        finish();
        this.closed = true;
        super.close();
        this.bsStream.close();
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public void finish() throws IOException {
        if (this.finished) {
            return;
        }
        if (this.runLength > 0) {
            writeRun();
        }
        this.currentChar = -1;
        endBlock();
        endCompression();
        this.finished = true;
        flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        super.flush();
        this.bsStream.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        int i3 = (i2 + 256) % 256;
        int i4 = this.currentChar;
        if (i4 == -1) {
            this.currentChar = i3;
            this.runLength++;
            return;
        }
        if (i4 != i3) {
            writeRun();
            this.runLength = 1;
            this.currentChar = i3;
            return;
        }
        int i5 = this.runLength + 1;
        this.runLength = i5;
        if (i5 > 254) {
            writeRun();
            this.currentChar = -1;
            this.runLength = 0;
        }
    }
}
