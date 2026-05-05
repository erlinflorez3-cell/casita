package org.spongycastle.apache.bzip2;

import cz.msebera.android.httpclient.message.TokenParser;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class CBZip2InputStream extends InputStream implements BZip2Constants {
    private static final int NO_RAND_PART_A_STATE = 5;
    private static final int NO_RAND_PART_B_STATE = 6;
    private static final int NO_RAND_PART_C_STATE = 7;
    private static final int RAND_PART_A_STATE = 2;
    private static final int RAND_PART_B_STATE = 3;
    private static final int RAND_PART_C_STATE = 4;
    private static final int START_BLOCK_STATE = 1;
    private boolean blockRandomised;
    private int blockSize100k;
    private int bsBuff;
    private int bsLive;
    private InputStream bsStream;
    int ch2;
    int chPrev;
    private int computedBlockCRC;
    private int computedCombinedCRC;
    int count;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f27797i;
    int i2;
    int j2;
    private int last;
    private int nInUse;
    private int origPtr;
    private int storedBlockCRC;
    private int storedCombinedCRC;
    int tPos;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    char f27798z;
    private CRC mCrc = new CRC();
    private boolean[] inUse = new boolean[256];
    private char[] seqToUnseq = new char[256];
    private char[] unseqToSeq = new char[256];
    private char[] selector = new char[BZip2Constants.MAX_SELECTORS];
    private char[] selectorMtf = new char[BZip2Constants.MAX_SELECTORS];
    private int[] unzftab = new int[256];
    private int[][] limit = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 258);
    private int[][] base = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 258);
    private int[][] perm = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 258);
    private int[] minLens = new int[6];
    private boolean streamEnd = false;
    private int currentChar = -1;
    private int currentState = 1;
    int rNToGo = 0;
    int rTPos = 0;
    private char[] ll8 = null;
    private int[] tt = null;

    public CBZip2InputStream(InputStream inputStream) throws IOException {
        bsSetStream(inputStream);
        initialize();
        initBlock();
        setupBlock();
    }

    private static void badBlockHeader() {
        cadvise();
    }

    private static void blockOverrun() {
        cadvise();
    }

    private void bsFinishedWithStream() {
        try {
            InputStream inputStream = this.bsStream;
            if (inputStream == null || inputStream == System.in) {
                return;
            }
            this.bsStream.close();
            this.bsStream = null;
        } catch (IOException unused) {
        }
    }

    private int bsGetInt32() {
        return bsGetint();
    }

    private int bsGetIntVS(int i2) {
        return bsR(i2);
    }

    private char bsGetUChar() {
        return (char) bsR(8);
    }

    private int bsGetint() {
        return bsR(8) | (((-1) - (((-1) - (((-1) - (((-1) - (bsR(8) << 8)) & ((-1) - bsR(8)))) << 8)) & ((-1) - bsR(8)))) << 8);
    }

    private int bsR(int i2) {
        char c2;
        while (true) {
            int i3 = this.bsLive;
            if (i3 >= i2) {
                int i4 = (this.bsBuff >> (i3 - i2)) & ((1 << i2) - 1);
                this.bsLive = i3 - i2;
                return i4;
            }
            try {
                c2 = (char) this.bsStream.read();
            } catch (IOException unused) {
                compressedStreamEOF();
                c2 = 0;
            }
            if (c2 == 65535) {
                compressedStreamEOF();
            }
            this.bsBuff = (-1) - (((-1) - (c2 & 255)) & ((-1) - (this.bsBuff << 8)));
            this.bsLive += 8;
        }
    }

    private void bsSetStream(InputStream inputStream) {
        this.bsStream = inputStream;
        this.bsLive = 0;
        this.bsBuff = 0;
    }

    private static void cadvise() {
        System.out.println("CRC Error");
    }

    private void complete() {
        int iBsGetInt32 = bsGetInt32();
        this.storedCombinedCRC = iBsGetInt32;
        if (iBsGetInt32 != this.computedCombinedCRC) {
            crcError();
        }
        bsFinishedWithStream();
        this.streamEnd = true;
    }

    private static void compressedStreamEOF() {
        cadvise();
    }

    private static void crcError() {
        cadvise();
    }

    private void endBlock() {
        int finalCRC = this.mCrc.getFinalCRC();
        this.computedBlockCRC = finalCRC;
        if (this.storedBlockCRC != finalCRC) {
            crcError();
        }
        int i2 = this.computedCombinedCRC;
        int i3 = i2 << 1;
        int i4 = i2 >>> 31;
        this.computedCombinedCRC = ((i4 + i3) - (i4 & i3)) ^ this.computedBlockCRC;
    }

    private void getAndMoveToFrontDecode() {
        char c2;
        int i2;
        char c3;
        int i3;
        char c4;
        int i4;
        char c5;
        char[] cArr = new char[256];
        int i5 = this.blockSize100k * 100000;
        this.origPtr = bsGetIntVS(24);
        recvDecodingTables();
        int i6 = this.nInUse + 1;
        int i7 = 0;
        while (true) {
            c2 = 255;
            if (i7 > 255) {
                break;
            }
            this.unzftab[i7] = 0;
            i7++;
        }
        for (int i8 = 0; i8 <= 255; i8++) {
            cArr[i8] = (char) i8;
        }
        int i9 = -1;
        this.last = -1;
        char c6 = this.selector[0];
        int i10 = this.minLens[c6];
        int iBsR = bsR(i10);
        while (iBsR > this.limit[c6][i10]) {
            i10++;
            while (true) {
                i4 = this.bsLive;
                if (i4 < 1) {
                    try {
                        c5 = (char) this.bsStream.read();
                    } catch (IOException unused) {
                        compressedStreamEOF();
                        c5 = 0;
                    }
                    if (c5 == 65535) {
                        compressedStreamEOF();
                    }
                    this.bsBuff = (c5 & 255) | (this.bsBuff << 8);
                    this.bsLive += 8;
                }
            }
            int i11 = (-1) - (((-1) - (this.bsBuff >> (i4 - 1))) | ((-1) - 1));
            this.bsLive = i4 - 1;
            iBsR = (iBsR << 1) | i11;
        }
        int i12 = this.perm[c6][iBsR - this.base[c6][i10]];
        int i13 = 49;
        int i14 = 0;
        while (i12 != i6) {
            if (i12 == 0 || i12 == 1) {
                int i15 = 1;
                int i16 = i9;
                while (true) {
                    if (i12 == 0) {
                        i16 += i15;
                    } else if (i12 == 1) {
                        i16 += i15 * 2;
                    }
                    i15 *= 2;
                    if (i13 == 0) {
                        i14++;
                        i13 = 50;
                    }
                    i13 += i9;
                    char c7 = this.selector[i14];
                    int i17 = this.minLens[c7];
                    int iBsR2 = bsR(i17);
                    while (iBsR2 > this.limit[c7][i17]) {
                        i17++;
                        while (true) {
                            i2 = this.bsLive;
                            if (i2 < 1) {
                                try {
                                    c3 = (char) this.bsStream.read();
                                } catch (IOException unused2) {
                                    compressedStreamEOF();
                                    c3 = 0;
                                }
                                if (c3 == i9) {
                                    compressedStreamEOF();
                                }
                                int i18 = this.bsBuff << 8;
                                int i19 = (-1) - ((65535 - c3) | ((-1) - 255));
                                this.bsBuff = (i18 + i19) - (i18 & i19);
                                this.bsLive += 8;
                                i9 = -1;
                            }
                        }
                        int i20 = (-1) - (((-1) - (this.bsBuff >> (i2 - 1))) | ((-1) - 1));
                        this.bsLive = i2 - 1;
                        iBsR2 = (iBsR2 << 1) | i20;
                        i9 = -1;
                    }
                    i12 = this.perm[c7][iBsR2 - this.base[c7][i17]];
                    if (i12 != 0 && i12 != 1) {
                        break;
                    } else {
                        i9 = -1;
                    }
                }
                int i21 = i16 + 1;
                char c8 = this.seqToUnseq[cArr[0]];
                int[] iArr = this.unzftab;
                iArr[c8] = iArr[c8] + i21;
                while (i21 > 0) {
                    int i22 = this.last + 1;
                    this.last = i22;
                    this.ll8[i22] = c8;
                    i21--;
                }
                if (this.last >= i5) {
                    blockOverrun();
                }
                i9 = -1;
                c2 = 255;
            } else {
                int i23 = this.last + 1;
                this.last = i23;
                if (i23 >= i5) {
                    blockOverrun();
                }
                int i24 = i12 - 1;
                char c9 = cArr[i24];
                int[] iArr2 = this.unzftab;
                char c10 = this.seqToUnseq[c9];
                iArr2[c10] = iArr2[c10] + 1;
                this.ll8[this.last] = c10;
                while (i24 > 3) {
                    int i25 = i24 - 1;
                    cArr[i24] = cArr[i25];
                    int i26 = i24 - 2;
                    cArr[i25] = cArr[i26];
                    int i27 = i24 - 3;
                    cArr[i26] = cArr[i27];
                    cArr[i27] = cArr[i24 - 4];
                    i24 -= 4;
                }
                while (i24 > 0) {
                    cArr[i24] = cArr[i24 - 1];
                    i24--;
                }
                cArr[0] = c9;
                if (i13 == 0) {
                    i14++;
                    i13 = 50;
                }
                i13 += i9;
                char c11 = this.selector[i14];
                int i28 = this.minLens[c11];
                int iBsR3 = bsR(i28);
                while (iBsR3 > this.limit[c11][i28]) {
                    i28++;
                    while (true) {
                        i3 = this.bsLive;
                        if (i3 < 1) {
                            try {
                                c4 = (char) this.bsStream.read();
                            } catch (IOException unused3) {
                                compressedStreamEOF();
                                c4 = 0;
                            }
                            this.bsBuff = (c4 & c2) | (this.bsBuff << 8);
                            this.bsLive += 8;
                        }
                    }
                    int i29 = this.bsBuff >> (i3 - 1);
                    this.bsLive = i3 - 1;
                    iBsR3 = (-1) - (((-1) - (iBsR3 << 1)) & ((-1) - ((i29 + 1) - (i29 | 1))));
                }
                i12 = this.perm[c11][iBsR3 - this.base[c11][i28]];
            }
        }
    }

    private void hbCreateDecodeTables(int[] iArr, int[] iArr2, int[] iArr3, char[] cArr, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = i2; i7 <= i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                if (cArr[i8] == i7) {
                    iArr3[i6] = i8;
                    i6++;
                }
            }
        }
        for (int i9 = 0; i9 < 23; i9++) {
            iArr2[i9] = 0;
        }
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = cArr[i10] + 1;
            iArr2[i11] = iArr2[i11] + 1;
        }
        for (int i12 = 1; i12 < 23; i12++) {
            iArr2[i12] = iArr2[i12] + iArr2[i12 - 1];
        }
        for (int i13 = 0; i13 < 23; i13++) {
            iArr[i13] = 0;
        }
        int i14 = i2;
        while (i14 <= i3) {
            int i15 = i14 + 1;
            int i16 = i5 + (iArr2[i15] - iArr2[i14]);
            iArr[i14] = i16 - 1;
            i5 = i16 << 1;
            i14 = i15;
        }
        for (int i17 = i2 + 1; i17 <= i3; i17++) {
            iArr2[i17] = ((iArr[i17 - 1] + 1) << 1) - iArr2[i17];
        }
    }

    private void initBlock() {
        char cBsGetUChar = bsGetUChar();
        char cBsGetUChar2 = bsGetUChar();
        char cBsGetUChar3 = bsGetUChar();
        char cBsGetUChar4 = bsGetUChar();
        char cBsGetUChar5 = bsGetUChar();
        char cBsGetUChar6 = bsGetUChar();
        if (cBsGetUChar == 23 && cBsGetUChar2 == 'r' && cBsGetUChar3 == 'E' && cBsGetUChar4 == '8' && cBsGetUChar5 == 'P' && cBsGetUChar6 == 144) {
            complete();
            return;
        }
        if (cBsGetUChar != '1' || cBsGetUChar2 != 'A' || cBsGetUChar3 != 'Y' || cBsGetUChar4 != '&' || cBsGetUChar5 != 'S' || cBsGetUChar6 != 'Y') {
            badBlockHeader();
            this.streamEnd = true;
            return;
        }
        this.storedBlockCRC = bsGetInt32();
        if (bsR(1) == 1) {
            this.blockRandomised = true;
        } else {
            this.blockRandomised = false;
        }
        getAndMoveToFrontDecode();
        this.mCrc.initialiseCRC();
        this.currentState = 1;
    }

    private void initialize() throws IOException {
        char cBsGetUChar = bsGetUChar();
        char cBsGetUChar2 = bsGetUChar();
        if (cBsGetUChar != 'B' && cBsGetUChar2 != 'Z') {
            throw new IOException("Not a BZIP2 marked stream");
        }
        char cBsGetUChar3 = bsGetUChar();
        char cBsGetUChar4 = bsGetUChar();
        if (cBsGetUChar3 != 'h' || cBsGetUChar4 < '1' || cBsGetUChar4 > '9') {
            bsFinishedWithStream();
            this.streamEnd = true;
        } else {
            setDecompressStructureSizes(cBsGetUChar4 - '0');
            this.computedCombinedCRC = 0;
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

    private void recvDecodingTables() {
        char[][] cArr = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
        boolean[] zArr = new boolean[16];
        for (int i2 = 0; i2 < 16; i2++) {
            if (bsR(1) == 1) {
                zArr[i2] = true;
            } else {
                zArr[i2] = false;
            }
        }
        for (int i3 = 0; i3 < 256; i3++) {
            this.inUse[i3] = false;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            if (zArr[i4]) {
                for (int i5 = 0; i5 < 16; i5++) {
                    if (bsR(1) == 1) {
                        this.inUse[(i4 * 16) + i5] = true;
                    }
                }
            }
        }
        makeMaps();
        int i6 = this.nInUse + 2;
        int iBsR = bsR(3);
        int iBsR2 = bsR(15);
        for (int i7 = 0; i7 < iBsR2; i7++) {
            int i8 = 0;
            while (bsR(1) == 1) {
                i8++;
            }
            this.selectorMtf[i7] = (char) i8;
        }
        char[] cArr2 = new char[6];
        for (char c2 = 0; c2 < iBsR; c2 = (char) (c2 + 1)) {
            cArr2[c2] = c2;
        }
        for (int i9 = 0; i9 < iBsR2; i9++) {
            char c3 = this.selectorMtf[i9];
            char c4 = cArr2[c3];
            while (c3 > 0) {
                int i10 = c3 - 1;
                cArr2[c3] = cArr2[i10];
                c3 = (char) i10;
            }
            cArr2[0] = c4;
            this.selector[i9] = c4;
        }
        for (int i11 = 0; i11 < iBsR; i11++) {
            int iBsR3 = bsR(5);
            for (int i12 = 0; i12 < i6; i12++) {
                while (bsR(1) == 1) {
                    iBsR3 = bsR(1) == 0 ? iBsR3 + 1 : iBsR3 - 1;
                }
                cArr[i11][i12] = (char) iBsR3;
            }
        }
        for (int i13 = 0; i13 < iBsR; i13++) {
            char c5 = TokenParser.SP;
            char c6 = 0;
            for (int i14 = 0; i14 < i6; i14++) {
                char c7 = cArr[i13][i14];
                if (c7 > c6) {
                    c6 = c7;
                }
                if (c7 < c5) {
                    c5 = c7;
                }
            }
            hbCreateDecodeTables(this.limit[i13], this.base[i13], this.perm[i13], cArr[i13], c5, c6, i6);
            this.minLens[i13] = c5;
        }
    }

    private void setDecompressStructureSizes(int i2) {
        this.blockSize100k = i2;
        if (i2 == 0) {
            return;
        }
        int i3 = i2 * 100000;
        this.ll8 = new char[i3];
        this.tt = new int[i3];
    }

    private void setupBlock() {
        int[] iArr = new int[257];
        iArr[0] = 0;
        this.f27797i = 1;
        while (true) {
            int i2 = this.f27797i;
            if (i2 > 256) {
                break;
            }
            iArr[i2] = this.unzftab[i2 - 1];
            this.f27797i = i2 + 1;
        }
        this.f27797i = 1;
        while (true) {
            int i3 = this.f27797i;
            if (i3 > 256) {
                break;
            }
            iArr[i3] = iArr[i3] + iArr[i3 - 1];
            this.f27797i = i3 + 1;
        }
        this.f27797i = 0;
        while (true) {
            int i4 = this.f27797i;
            if (i4 > this.last) {
                break;
            }
            char c2 = this.ll8[i4];
            this.tt[iArr[c2]] = i4;
            iArr[c2] = iArr[c2] + 1;
            this.f27797i = i4 + 1;
        }
        this.tPos = this.tt[this.origPtr];
        this.count = 0;
        this.i2 = 0;
        this.ch2 = 256;
        if (!this.blockRandomised) {
            setupNoRandPartA();
            return;
        }
        this.rNToGo = 0;
        this.rTPos = 0;
        setupRandPartA();
    }

    private void setupNoRandPartA() {
        int i2 = this.i2;
        if (i2 > this.last) {
            endBlock();
            initBlock();
            setupBlock();
            return;
        }
        this.chPrev = this.ch2;
        char[] cArr = this.ll8;
        int i3 = this.tPos;
        char c2 = cArr[i3];
        this.ch2 = c2;
        this.tPos = this.tt[i3];
        this.i2 = i2 + 1;
        this.currentChar = c2;
        this.currentState = 6;
        this.mCrc.updateCRC(c2);
    }

    private void setupNoRandPartB() {
        if (this.ch2 != this.chPrev) {
            this.currentState = 5;
            this.count = 1;
            setupNoRandPartA();
            return;
        }
        int i2 = this.count + 1;
        this.count = i2;
        if (i2 < 4) {
            this.currentState = 5;
            setupNoRandPartA();
            return;
        }
        char[] cArr = this.ll8;
        int i3 = this.tPos;
        this.f27798z = cArr[i3];
        this.tPos = this.tt[i3];
        this.currentState = 7;
        this.j2 = 0;
        setupNoRandPartC();
    }

    private void setupNoRandPartC() {
        if (this.j2 < this.f27798z) {
            int i2 = this.ch2;
            this.currentChar = i2;
            this.mCrc.updateCRC(i2);
            this.j2++;
            return;
        }
        this.currentState = 5;
        this.i2++;
        this.count = 0;
        setupNoRandPartA();
    }

    private void setupRandPartA() {
        if (this.i2 > this.last) {
            endBlock();
            initBlock();
            setupBlock();
            return;
        }
        this.chPrev = this.ch2;
        char[] cArr = this.ll8;
        int i2 = this.tPos;
        this.ch2 = cArr[i2];
        this.tPos = this.tt[i2];
        if (this.rNToGo == 0) {
            int[] iArr = rNums;
            int i3 = this.rTPos;
            this.rNToGo = iArr[i3];
            int i4 = i3 + 1;
            this.rTPos = i4;
            if (i4 == 512) {
                this.rTPos = 0;
            }
        }
        int i5 = this.rNToGo - 1;
        this.rNToGo = i5;
        int i6 = this.ch2 ^ (i5 == 1 ? 1 : 0);
        this.ch2 = i6;
        this.i2++;
        this.currentChar = i6;
        this.currentState = 3;
        this.mCrc.updateCRC(i6);
    }

    private void setupRandPartB() {
        if (this.ch2 != this.chPrev) {
            this.currentState = 2;
            this.count = 1;
            setupRandPartA();
            return;
        }
        int i2 = this.count + 1;
        this.count = i2;
        if (i2 < 4) {
            this.currentState = 2;
            setupRandPartA();
            return;
        }
        char[] cArr = this.ll8;
        int i3 = this.tPos;
        this.f27798z = cArr[i3];
        this.tPos = this.tt[i3];
        if (this.rNToGo == 0) {
            int[] iArr = rNums;
            int i4 = this.rTPos;
            this.rNToGo = iArr[i4];
            int i5 = i4 + 1;
            this.rTPos = i5;
            if (i5 == 512) {
                this.rTPos = 0;
            }
        }
        int i6 = this.rNToGo - 1;
        this.rNToGo = i6;
        this.f27798z = (char) (this.f27798z ^ (i6 != 1 ? (char) 0 : (char) 1));
        this.j2 = 0;
        this.currentState = 4;
        setupRandPartC();
    }

    private void setupRandPartC() {
        if (this.j2 < this.f27798z) {
            int i2 = this.ch2;
            this.currentChar = i2;
            this.mCrc.updateCRC(i2);
            this.j2++;
            return;
        }
        this.currentState = 2;
        this.i2++;
        this.count = 0;
        setupRandPartA();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.streamEnd) {
            return -1;
        }
        int i2 = this.currentChar;
        int i3 = this.currentState;
        if (i3 == 3) {
            setupRandPartB();
        } else if (i3 == 4) {
            setupRandPartC();
        } else if (i3 == 6) {
            setupNoRandPartB();
        } else if (i3 == 7) {
            setupNoRandPartC();
        }
        return i2;
    }
}
