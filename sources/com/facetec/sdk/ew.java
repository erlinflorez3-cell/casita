package com.facetec.sdk;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class ew implements ey {
    private static final Map<String, Integer> Code;
    private static byte[] I = null;
    public static final int V = 0;

    static {
        V();
        HashMap map = new HashMap();
        byte[] bArr = I;
        map.put(I(bArr[36], bArr[32], bArr[21]), 5);
        byte b2 = I[6];
        map.put(I(b2, (byte) (b2 - 1), r3[33]), 3);
        int i2 = V;
        byte[] bArr2 = I;
        map.put(I((byte) ((i2 + 51) - (51 | i2)), bArr2[1], bArr2[33]), 7);
        byte[] bArr3 = I;
        map.put(I((byte) 45, bArr3[1], bArr3[14]), 6);
        byte[] bArr4 = I;
        map.put(I((byte) 56, bArr4[33], bArr4[12]), 1);
        map.put(I((byte) (i2 >>> 2), (byte) (I[6] - 1), r2[14]), 2);
        byte[] bArr5 = I;
        map.put(I((byte) 77, bArr5[12], bArr5[21]), 0);
        map.put(I((byte) (I[0] + 1), r3[33], r3[6]), 4);
        Code = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String I(byte r9, byte r10, short r11) {
        /*
            int r8 = r11 + 100
            int r7 = r9 + 4
            byte[] r6 = com.facetec.sdk.ew.I
            int r0 = r10 + 4
            byte[] r5 = new byte[r0]
            int r4 = r10 + 3
            r3 = 0
            if (r6 != 0) goto L28
            r2 = r7
            r0 = r4
            r1 = r3
        L12:
            int r7 = r7 + r0
            r8 = r7
            r7 = r2
        L15:
            byte r0 = (byte) r8
            r5[r1] = r0
            int r2 = r7 + 1
            if (r1 != r4) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r3)
            return r0
        L22:
            r0 = r6[r2]
            int r1 = r1 + 1
            r7 = r8
            goto L12
        L28:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ew.I(byte, byte, short):java.lang.String");
    }

    static void V() {
        I = new byte[]{85, 8, 82, MessagePack.Code.BIN32, -5, -17, 16, -2, Ascii.CR, MessagePack.Code.FIXEXT4, 37, -8, 6, 7, 1, 4, 1, -11, -6, -26, Ascii.ESC, 5, -8, 6, 7, 1, 4, 1, -11, -6, -16, Ascii.DC2, Ascii.SO, 0, -10, 6, -1, MessagePack.Code.STR32, Ascii.ESC, 5, -8, 6, 7, 1, 4, 1, -11, -6, -26, Ascii.ESC, Ascii.CR, 0, -3, 3, MessagePack.Code.STR32, Ascii.CAN, Ascii.SO, 0, -18, 6, -2, 9, -4, -1, 9, 4, -3, -3, 0, 1, -8, 9, 6, MessagePack.Code.MAP32, Ascii.DC2, Ascii.SO, 0, -10, 6, -1, MessagePack.Code.STR32, Ascii.ESC, -5, -17, 16, -2, Ascii.CR, MessagePack.Code.ARRAY16, 41, -4, -1, -19, 6, Ascii.FF};
        V = 238;
    }

    @Override // com.facetec.sdk.ey
    public final int V(ei eiVar) throws IOException {
        Integer num = Code.get(eiVar.C());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
