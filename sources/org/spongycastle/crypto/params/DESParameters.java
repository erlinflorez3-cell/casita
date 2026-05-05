package org.spongycastle.crypto.params;

import com.google.common.base.Ascii;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes2.dex */
public class DESParameters extends KeyParameter {
    public static final int DES_KEY_LENGTH = 8;
    private static byte[] DES_weak_keys = {1, 1, 1, 1, 1, 1, 1, 1, Ascii.US, Ascii.US, Ascii.US, Ascii.US, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, MessagePack.Code.NEGFIXINT_PREFIX, MessagePack.Code.NEGFIXINT_PREFIX, MessagePack.Code.NEGFIXINT_PREFIX, MessagePack.Code.NEGFIXINT_PREFIX, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, Ascii.US, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.US, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.SO, -15, Ascii.SO, -15, 1, MessagePack.Code.NEGFIXINT_PREFIX, 1, MessagePack.Code.NEGFIXINT_PREFIX, 1, -15, 1, -15, Ascii.US, -2, Ascii.US, -2, Ascii.SO, -2, Ascii.SO, -2, 1, Ascii.US, 1, Ascii.US, 1, Ascii.SO, 1, Ascii.SO, MessagePack.Code.NEGFIXINT_PREFIX, -2, MessagePack.Code.NEGFIXINT_PREFIX, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.US, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.US, -15, Ascii.SO, -15, Ascii.SO, MessagePack.Code.NEGFIXINT_PREFIX, 1, MessagePack.Code.NEGFIXINT_PREFIX, 1, -15, 1, -15, 1, -2, Ascii.US, -2, Ascii.US, -2, Ascii.SO, -2, Ascii.SO, Ascii.US, 1, Ascii.US, 1, Ascii.SO, 1, Ascii.SO, 1, -2, MessagePack.Code.NEGFIXINT_PREFIX, -2, MessagePack.Code.NEGFIXINT_PREFIX, -2, -15, -2, -15};
    private static final int N_DES_WEAK_KEYS = 16;

    public DESParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0)) {
            throw new IllegalArgumentException("attempt to create weak DES key");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isWeakKey(byte[] r7, int r8) {
        /*
            int r0 = r7.length
            int r0 = r0 - r8
            r6 = 8
            if (r0 < r6) goto L25
            r5 = 0
            r4 = r5
        L8:
            r0 = 16
            if (r4 >= r0) goto L24
            r3 = r5
        Ld:
            if (r3 >= r6) goto L22
            int r0 = r3 + r8
            r2 = r7[r0]
            byte[] r1 = org.spongycastle.crypto.params.DESParameters.DES_weak_keys
            int r0 = r4 * 8
            int r0 = r0 + r3
            r0 = r1[r0]
            if (r2 == r0) goto L1f
            int r4 = r4 + 1
            goto L8
        L1f:
            int r3 = r3 + 1
            goto Ld
        L22:
            r0 = 1
            return r0
        L24:
            return r5
        L25:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key material too short."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.params.DESParameters.isWeakKey(byte[], int):boolean");
    }

    public static void setOddParity(byte[] bArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            bArr[i2] = (byte) (((-1) - (((-1) - (((b2 >> 7) ^ ((((((b2 >> 1) ^ (b2 >> 2)) ^ (b2 >> 3)) ^ (b2 >> 4)) ^ (b2 >> 5)) ^ (b2 >> 6))) ^ 1)) | ((-1) - 1))) | ((-1) - (((-1) - b2) | ((-1) - 254))));
        }
    }
}
