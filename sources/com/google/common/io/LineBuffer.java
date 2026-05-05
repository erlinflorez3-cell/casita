package com.google.common.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
abstract class LineBuffer {
    private StringBuilder line = new StringBuilder();
    private boolean sawReturn;

    LineBuffer() {
    }

    private boolean finishLine(boolean sawNewline) throws IOException {
        handleLine(this.line.toString(), this.sawReturn ? sawNewline ? "\r\n" : "\r" : sawNewline ? "\n" : "");
        this.line = new StringBuilder();
        this.sawReturn = false;
        return sawNewline;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void add(char[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.sawReturn
            r6 = 0
            r4 = 10
            r3 = 1
            if (r0 == 0) goto L50
            if (r10 <= 0) goto L50
            char r0 = r8[r9]
            if (r0 != r4) goto L4e
            r0 = r3
        Lf:
            boolean r0 = r7.finishLine(r0)
            if (r0 == 0) goto L50
            int r2 = r9 + 1
        L17:
            int r9 = r9 + r10
            r5 = r2
        L19:
            if (r2 >= r9) goto L52
            char r1 = r8[r2]
            if (r1 == r4) goto L25
            r0 = 13
            if (r1 == r0) goto L30
        L23:
            int r2 = r2 + r3
            goto L19
        L25:
            java.lang.StringBuilder r1 = r7.line
            int r0 = r2 - r5
            r1.append(r8, r5, r0)
            r7.finishLine(r3)
            goto L49
        L30:
            java.lang.StringBuilder r1 = r7.line
            int r0 = r2 - r5
            r1.append(r8, r5, r0)
            r7.sawReturn = r3
            int r1 = r2 + 1
            if (r1 >= r9) goto L49
            char r0 = r8[r1]
            if (r0 != r4) goto L4c
            r0 = r3
        L42:
            boolean r0 = r7.finishLine(r0)
            if (r0 == 0) goto L49
            r2 = r1
        L49:
            int r5 = r2 + 1
            goto L23
        L4c:
            r0 = r6
            goto L42
        L4e:
            r0 = r6
            goto Lf
        L50:
            r2 = r9
            goto L17
        L52:
            java.lang.StringBuilder r0 = r7.line
            int r9 = r9 - r5
            r0.append(r8, r5, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.LineBuffer.add(char[], int, int):void");
    }

    protected void finish() throws IOException {
        if (this.sawReturn || this.line.length() > 0) {
            finishLine(false);
        }
    }

    protected abstract void handleLine(String line, String end) throws IOException;
}
