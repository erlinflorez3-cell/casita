package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes2.dex */
public class TBCPadding implements BlockCipherPadding {
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int addPadding(byte[] r7, int r8) {
        /*
            r6 = this;
            int r3 = r7.length
            int r3 = r3 - r8
            r5 = 255(0xff, float:3.57E-43)
            r4 = 0
            if (r8 <= 0) goto L1e
            int r0 = r8 + (-1)
            r1 = r7[r0]
            r0 = 1
            int r1 = (-1) - r1
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 != 0) goto L2b
        L15:
            byte r1 = (byte) r5
        L16:
            int r0 = r7.length
            if (r8 >= r0) goto L2d
            r7[r8] = r1
            int r8 = r8 + 1
            goto L16
        L1e:
            int r0 = r7.length
            int r0 = r0 + (-1)
            r2 = r7[r0]
            r1 = 1
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 != 0) goto L2b
            goto L15
        L2b:
            r5 = r4
            goto L15
        L2d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.paddings.TBCPadding.addPadding(byte[], int):int");
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "TBC";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        byte b2 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        while (length > 0 && bArr[length - 1] == b2) {
            length--;
        }
        return bArr.length - length;
    }
}
