package com.google.zxing.aztec.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP;
    static final int MODE_DIGIT = 2;
    static final int MODE_LOWER = 1;
    static final int MODE_MIXED = 3;
    static final int MODE_PUNCT = 4;
    static final int MODE_UPPER = 0;
    static final int[][] SHIFT_TABLE;
    private final byte[] text;
    static final String[] MODE_NAMES = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] LATCH_TABLE = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: com.google.zxing.aztec.encoder.HighLevelEncoder$1 */
    class AnonymousClass1 implements Comparator<State> {
        AnonymousClass1() {
        }

        @Override // java.util.Comparator
        public int compare(State state, State state2) {
            return state.getBitCount() - state2.getBitCount();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        CHAR_MAP = iArr;
        iArr[0][32] = 1;
        for (int i2 = 65; i2 <= 90; i2++) {
            CHAR_MAP[0][i2] = i2 - 63;
        }
        CHAR_MAP[1][32] = 1;
        for (int i3 = 97; i3 <= 122; i3++) {
            CHAR_MAP[1][i3] = i3 - 95;
        }
        CHAR_MAP[2][32] = 1;
        for (int i4 = 48; i4 <= 57; i4++) {
            CHAR_MAP[2][i4] = i4 - 46;
        }
        int[] iArr2 = CHAR_MAP[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i5 = 0; i5 < 28; i5++) {
            CHAR_MAP[3][iArr3[i5]] = i5;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i6 = 0; i6 < 31; i6++) {
            int i7 = iArr4[i6];
            if (i7 > 0) {
                CHAR_MAP[4][i7] = i6;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        SHIFT_TABLE = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = SHIFT_TABLE;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.text = bArr;
    }

    private static Collection<State> simplifyStates(Iterable<State> iterable) {
        LinkedList linkedList = new LinkedList();
        for (State state : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.add(state);
                    break;
                }
                State state2 = (State) it.next();
                if (state2.isBetterThanOrEqualTo(state)) {
                    break;
                }
                if (state.isBetterThanOrEqualTo(state2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    private void updateStateForChar(State state, int i2, Collection<State> collection) {
        char c2 = (char) (this.text[i2] & 255);
        boolean z2 = CHAR_MAP[state.getMode()][c2] > 0;
        State stateEndBinaryShift = null;
        for (int i3 = 0; i3 <= 4; i3++) {
            int i4 = CHAR_MAP[i3][c2];
            if (i4 > 0) {
                if (stateEndBinaryShift == null) {
                    stateEndBinaryShift = state.endBinaryShift(i2);
                }
                if (!z2 || i3 == state.getMode() || i3 == 2) {
                    collection.add(stateEndBinaryShift.latchAndAppend(i3, i4));
                }
                if (!z2 && SHIFT_TABLE[state.getMode()][i3] >= 0) {
                    collection.add(stateEndBinaryShift.shiftAndAppend(i3, i4));
                }
            }
        }
        if (state.getBinaryShiftByteCount() > 0 || CHAR_MAP[state.getMode()][c2] == 0) {
            collection.add(state.addBinaryShiftChar(i2));
        }
    }

    private static void updateStateForPair(State state, int i2, int i3, Collection<State> collection) {
        State stateEndBinaryShift = state.endBinaryShift(i2);
        collection.add(stateEndBinaryShift.latchAndAppend(4, i3));
        if (state.getMode() != 4) {
            collection.add(stateEndBinaryShift.shiftAndAppend(4, i3));
        }
        if (i3 == 3 || i3 == 4) {
            collection.add(stateEndBinaryShift.latchAndAppend(2, 16 - i3).latchAndAppend(2, 1));
        }
        if (state.getBinaryShiftByteCount() > 0) {
            collection.add(state.addBinaryShiftChar(i2).addBinaryShiftChar(i2 + 1));
        }
    }

    private Collection<State> updateStateListForChar(Iterable<State> iterable, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator<State> it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForChar(it.next(), i2, linkedList);
        }
        return simplifyStates(linkedList);
    }

    private static Collection<State> updateStateListForPair(Iterable<State> iterable, int i2, int i3) {
        LinkedList linkedList = new LinkedList();
        Iterator<State> it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForPair(it.next(), i2, i3, linkedList);
        }
        return simplifyStates(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.zxing.common.BitArray encode() {
        /*
            r8 = this;
            com.google.zxing.aztec.encoder.State r0 = com.google.zxing.aztec.encoder.State.INITIAL_STATE
            java.util.List r5 = java.util.Collections.singletonList(r0)
            r7 = 0
            r6 = r7
        L8:
            byte[] r1 = r8.text
            int r0 = r1.length
            if (r6 >= r0) goto L4c
            int r4 = r6 + 1
            int r0 = r1.length
            if (r4 >= r0) goto L4a
            r3 = r1[r4]
        L14:
            r2 = r1[r6]
            r0 = 13
            if (r2 == r0) goto L44
            r0 = 44
            r1 = 32
            if (r2 == r0) goto L40
            r0 = 46
            if (r2 == r0) goto L3c
            r0 = 58
            if (r2 == r0) goto L38
        L28:
            r0 = r7
        L29:
            if (r0 <= 0) goto L33
            java.util.Collection r5 = updateStateListForPair(r5, r6, r0)
            r6 = r4
        L30:
            int r6 = r6 + 1
            goto L8
        L33:
            java.util.Collection r5 = r8.updateStateListForChar(r5, r6)
            goto L30
        L38:
            if (r3 != r1) goto L28
            r0 = 5
            goto L29
        L3c:
            if (r3 != r1) goto L28
            r0 = 3
            goto L29
        L40:
            if (r3 != r1) goto L28
            r0 = 4
            goto L29
        L44:
            r0 = 10
            if (r3 != r0) goto L28
            r0 = 2
            goto L29
        L4a:
            r3 = r7
            goto L14
        L4c:
            com.google.zxing.aztec.encoder.HighLevelEncoder$1 r0 = new com.google.zxing.aztec.encoder.HighLevelEncoder$1
            r0.<init>()
            java.lang.Object r1 = java.util.Collections.min(r5, r0)
            com.google.zxing.aztec.encoder.State r1 = (com.google.zxing.aztec.encoder.State) r1
            byte[] r0 = r8.text
            com.google.zxing.common.BitArray r0 = r1.toBitArray(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.encoder.HighLevelEncoder.encode():com.google.zxing.common.BitArray");
    }
}
