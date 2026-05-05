package com.facetec.sdk;

import cz.msebera.android.httpclient.message.TokenParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class hg {
    static final ib B = ib.V("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] Z = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static String[] I = new String[64];
    private static String[] V = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = V;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = gg.Code("%8s", Integer.toBinaryString(i3)).replace(TokenParser.SP, '0');
            i3++;
        }
        String[] strArr2 = I;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i4 = 0; i4 <= 0; i4++) {
            int i5 = iArr[i4];
            I[(i5 + 8) - (8 & i5)] = new StringBuilder().append(I[i5]).append("|PADDED").toString();
        }
        String[] strArr3 = I;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            for (int i8 = 0; i8 <= 0; i8++) {
                int i9 = iArr[i8];
                int i10 = (i9 + i7) - (i9 & i7);
                I[i10] = new StringBuilder().append(I[i9]).append('|').append(I[i7]).toString();
                I[(-1) - (((-1) - i10) & ((-1) - 8))] = new StringBuilder().append(I[i9]).append('|').append(I[i7]).append("|PADDED").toString();
            }
        }
        while (true) {
            String[] strArr4 = I;
            if (i2 >= strArr4.length) {
                return;
            }
            if (strArr4[i2] == null) {
                strArr4[i2] = V[i2];
            }
            i2++;
        }
    }

    private hg() {
    }

    static IOException Code(String str, Object... objArr) throws IOException {
        throw new IOException(gg.Code(str, objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String Code(boolean r5, int r6, int r7, byte r8, byte r9) {
        /*
            java.lang.String[] r1 = com.facetec.sdk.hg.Z
            int r0 = r1.length
            if (r8 >= r0) goto L81
            r3 = r1[r8]
        L7:
            if (r9 != 0) goto L25
            java.lang.String r4 = ""
        Lb:
            if (r5 == 0) goto L22
            java.lang.String r2 = "<<"
        Lf:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0, r3, r4}
            java.lang.String r0 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r0 = com.facetec.sdk.gg.Code(r0, r1)
            return r0
        L22:
            java.lang.String r2 = ">>"
            goto Lf
        L25:
            r0 = 2
            if (r8 == r0) goto L7c
            r0 = 3
            if (r8 == r0) goto L7c
            r0 = 4
            if (r8 == r0) goto L71
            r0 = 6
            if (r8 == r0) goto L71
            r0 = 7
            if (r8 == r0) goto L7c
            r0 = 8
            if (r8 == r0) goto L7c
            java.lang.String[] r1 = com.facetec.sdk.hg.I
            int r0 = r1.length
            if (r9 >= r0) goto L55
            r4 = r1[r9]
        L3f:
            r0 = 5
            if (r8 != r0) goto L5a
            r0 = 4
            int r1 = (-1) - r9
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L5a
            java.lang.String r1 = "HEADERS"
            java.lang.String r0 = "PUSH_PROMISE"
            java.lang.String r4 = r4.replace(r1, r0)
            goto Lb
        L55:
            java.lang.String[] r0 = com.facetec.sdk.hg.V
            r4 = r0[r9]
            goto L3f
        L5a:
            if (r8 != 0) goto L70
            r0 = 32
            int r1 = (-1) - r9
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L70
            java.lang.String r1 = "PRIORITY"
            java.lang.String r0 = "COMPRESSED"
            java.lang.String r4 = r4.replace(r1, r0)
            goto Lb
        L70:
            goto Lb
        L71:
            r0 = 1
            if (r9 != r0) goto L77
            java.lang.String r4 = "ACK"
            goto Lb
        L77:
            java.lang.String[] r0 = com.facetec.sdk.hg.V
            r4 = r0[r9]
            goto Lb
        L7c:
            java.lang.String[] r0 = com.facetec.sdk.hg.V
            r4 = r0[r9]
            goto Lb
        L81:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "0x%02x"
            java.lang.String r3 = com.facetec.sdk.gg.Code(r0, r1)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.hg.Code(boolean, int, int, byte, byte):java.lang.String");
    }

    static IllegalArgumentException Z(String str, Object... objArr) {
        throw new IllegalArgumentException(gg.Code(str, objArr));
    }
}
