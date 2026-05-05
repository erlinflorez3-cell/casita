package com.facetec.sdk;

import com.google.common.base.Ascii;
import java.io.IOException;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class ex implements ev {
    private static final String[] I;
    public static final int V = 0;
    private static byte[] Z = null;

    static {
        Code();
        byte[] bArr = Z;
        byte[] bArr2 = Z;
        byte b2 = bArr2[33];
        byte b3 = bArr2[30];
        byte[] bArr3 = Z;
        byte b4 = (byte) (-Z[13]);
        byte[] bArr4 = Z;
        byte b5 = Z[33];
        String[] strArr = {Code(b5, (byte) (15 | b5), (short) 59), Code(b, b, (byte) (86 | b)), Code((byte) (-bArr3[13]), bArr3[30], (byte) (bArr3[73] + 1)), Code(b4, (byte) ((b4 + 8) - (8 & b4)), (short) 45), Code((byte) (bArr4[30] - 1), bArr4[34], (short) 56), Code(bArr[36], bArr[17], bArr[14]), Code(b2, b3, b3), Code((byte) (-Z[61]), r1[17], (short) 77)};
        byte[] bArr5 = Z;
        byte b6 = (byte) (bArr5[30] - 1);
        byte b7 = bArr5[33];
        I = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String Code(short r9, short r10, short r11) {
        /*
            byte[] r8 = com.facetec.sdk.ex.Z
            int r1 = 19 - r9
            int r7 = r11 + 4
            int r0 = 116 - r10
            byte[] r6 = new byte[r1]
            int r5 = 18 - r9
            r4 = 0
            if (r8 != 0) goto L29
            r3 = r5
            r2 = r7
            r1 = r4
        L12:
            int r7 = r7 - r3
            r3 = r1
            r0 = r7
            r7 = r2
        L16:
            int r2 = r7 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            int r1 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r4)
            return r0
        L25:
            r3 = r8[r2]
            r7 = r0
            goto L12
        L29:
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ex.Code(short, short, short):java.lang.String");
    }

    static void Code() {
        Z = new byte[]{53, 62, MessagePack.Code.TRUE, 81, 5, 17, -16, 2, -13, 42, MessagePack.Code.STR32, 8, -6, -7, -1, -4, -1, Ascii.VT, 6, Ascii.SUB, -27, -5, 8, -6, -7, -1, -4, -1, Ascii.VT, 6, 16, -18, -14, 0, 10, -6, 1, 37, -27, -5, 8, -6, -7, -1, -4, -1, Ascii.VT, 6, Ascii.SUB, -27, -13, 0, 3, -3, 37, -24, -14, 0, Ascii.DC2, -6, 2, -9, 4, 1, -9, -4, 3, 3, 0, -1, 8, -9, -6, 33, -18, -14, 0, 10, -6, 1, 37, -27, 5, 17, -16, 2, -13, 36, MessagePack.Code.FIXEXT8, 4, 1, 19, -6, -12};
        V = 135;
    }

    @Override // com.facetec.sdk.ev
    public final void I(ek ekVar, int i2) throws IOException {
        ekVar.Code(I[i2]);
    }
}
