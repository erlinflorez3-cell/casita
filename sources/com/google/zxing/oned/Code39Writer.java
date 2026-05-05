package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    private static void toIntArray(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if ((-1) - (((-1) - (1 << (8 - i3))) | ((-1) - i2)) != 0) {
                i4 = 2;
            }
            iArr[i3] = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String tryToConvertToExtendedMode(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code39Writer.tryToConvertToExtendedMode(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r8 = new int[9];
        r7 = new boolean[(r10 * 13) + 25];
        toIntArray(148, r8);
        r4 = appendPattern(r7, 0, r8, true);
        r3 = new int[]{1};
        r4 = r4 + appendPattern(r7, r4, r3, false);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r2 >= r10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        toIntArray(com.google.zxing.oned.Code39Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(r13.charAt(r2))], r8);
        r4 = r4 + appendPattern(r7, r4, r8, true);
        r4 = r4 + appendPattern(r7, r4, r3, false);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        toIntArray(148, r8);
        appendPattern(r7, r4, r8, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        return r7;
     */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean[] encode(java.lang.String r13) {
        /*
            r12 = this;
            int r10 = r13.length()
            java.lang.String r3 = "Requested contents should be less than 80 digits long, but got "
            r2 = 80
            if (r10 > r2) goto L83
            r11 = 0
            r1 = r11
        Lc:
            java.lang.String r9 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%"
            if (r1 >= r10) goto L24
            char r0 = r13.charAt(r1)
            int r0 = r9.indexOf(r0)
            if (r0 >= 0) goto L60
            java.lang.String r13 = tryToConvertToExtendedMode(r13)
            int r10 = r13.length()
            if (r10 > r2) goto L6a
        L24:
            r0 = 9
            int[] r8 = new int[r0]
            int r0 = r10 * 13
            int r0 = r0 + 25
            boolean[] r7 = new boolean[r0]
            r6 = 148(0x94, float:2.07E-43)
            toIntArray(r6, r8)
            r5 = 1
            int r4 = appendPattern(r7, r11, r8, r5)
            int[] r3 = new int[]{r5}
            int r0 = appendPattern(r7, r4, r3, r11)
            int r4 = r4 + r0
            r2 = r11
        L42:
            if (r2 >= r10) goto L63
            char r0 = r13.charAt(r2)
            int r1 = r9.indexOf(r0)
            int[] r0 = com.google.zxing.oned.Code39Reader.CHARACTER_ENCODINGS
            r0 = r0[r1]
            toIntArray(r0, r8)
            int r0 = appendPattern(r7, r4, r8, r5)
            int r4 = r4 + r0
            int r0 = appendPattern(r7, r4, r3, r11)
            int r4 = r4 + r0
            int r2 = r2 + 1
            goto L42
        L60:
            int r1 = r1 + 1
            goto Lc
        L63:
            toIntArray(r6, r8)
            appendPattern(r7, r4, r8, r5)
            return r7
        L6a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.StringBuilder r1 = r0.append(r10)
            java.lang.String r0 = " (extended full ASCII mode)"
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L83:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r10)
            java.lang.String r0 = r3.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code39Writer.encode(java.lang.String):boolean[]");
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    protected Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_39);
    }
}
