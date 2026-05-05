package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
final class State {
    static final State INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token, int i2, int i3, int i4) {
        this.token = token;
        this.mode = i2;
        this.binaryShiftByteCount = i3;
        this.bitCount = i4;
    }

    private static int calculateBinaryShiftCost(State state) {
        int i2 = state.binaryShiftByteCount;
        if (i2 > 62) {
            return 21;
        }
        if (i2 > 31) {
            return 20;
        }
        return i2 > 0 ? 10 : 0;
    }

    State addBinaryShiftChar(int i2) {
        Token tokenAdd = this.token;
        int i3 = this.mode;
        int i4 = this.bitCount;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = HighLevelEncoder.LATCH_TABLE[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = i5 >> 16;
            tokenAdd = tokenAdd.add((65535 + i5) - (65535 | i5), i6);
            i4 += i6;
        }
        int i7 = this.binaryShiftByteCount;
        State state = new State(tokenAdd, i3, i7 + 1, i4 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return state.binaryShiftByteCount == 2078 ? state.endBinaryShift(i2 + 1) : state;
    }

    State endBinaryShift(int i2) {
        int i3 = this.binaryShiftByteCount;
        return i3 == 0 ? this : new State(this.token.addBinaryShift(i2 - i3, i3), this.mode, 0, this.bitCount);
    }

    int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    int getBitCount() {
        return this.bitCount;
    }

    int getMode() {
        return this.mode;
    }

    Token getToken() {
        return this.token;
    }

    boolean isBetterThanOrEqualTo(State state) {
        int iCalculateBinaryShiftCost = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i2 = this.binaryShiftByteCount;
        int i3 = state.binaryShiftByteCount;
        if (i2 < i3) {
            iCalculateBinaryShiftCost += calculateBinaryShiftCost(state) - calculateBinaryShiftCost(this);
        } else if (i2 > i3 && i3 > 0) {
            iCalculateBinaryShiftCost += 10;
        }
        return iCalculateBinaryShiftCost <= state.bitCount;
    }

    State latchAndAppend(int i2, int i3) {
        int i4 = this.bitCount;
        Token tokenAdd = this.token;
        if (i2 != this.mode) {
            int i5 = HighLevelEncoder.LATCH_TABLE[this.mode][i2];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            tokenAdd = tokenAdd.add(i6, i7);
            i4 += i7;
        }
        int i8 = i2 == 2 ? 4 : 5;
        return new State(tokenAdd.add(i3, i8), i2, 0, i4 + i8);
    }

    State shiftAndAppend(int i2, int i3) {
        Token token = this.token;
        int i4 = this.mode == 2 ? 4 : 5;
        return new State(token.add(HighLevelEncoder.SHIFT_TABLE[this.mode][i2], i4).add(i3, 5), this.mode, 0, this.bitCount + i4 + 5);
    }

    BitArray toBitArray(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (Token previous = endBinaryShift(bArr.length).token; previous != null; previous = previous.getPrevious()) {
            linkedList.addFirst(previous);
        }
        BitArray bitArray = new BitArray();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((Token) it.next()).appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount));
    }
}
