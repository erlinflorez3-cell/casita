package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbh {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r3 < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r3 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (((1 & r6) & (r9 != java.math.RoundingMode.HALF_EVEN ? 0 : 1)) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (r1 > 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(int r7, int r8, java.math.RoundingMode r9) {
        /*
            r9.getClass()
            if (r8 == 0) goto L52
            int r6 = r7 / r8
            int r0 = r8 * r6
            int r5 = r7 - r0
            if (r5 != 0) goto Le
            return r6
        Le:
            r7 = r7 ^ r8
            int[] r1 = com.google.android.gms.internal.fido.zzbg.zza
            int r0 = r9.ordinal()
            r1 = r1[r0]
            int r0 = r7 >> 31
            r4 = 1
            int r3 = r0 + r4
            r0 = r0 & r4
            int r3 = r3 - r0
            r2 = 0
            switch(r1) {
                case 1: goto L4e;
                case 2: goto L51;
                case 3: goto L28;
                case 4: goto L47;
                case 5: goto L2b;
                case 6: goto L2e;
                case 7: goto L2e;
                case 8: goto L2e;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L28:
            if (r3 >= 0) goto L51
            goto L47
        L2b:
            if (r3 <= 0) goto L51
            goto L47
        L2e:
            int r1 = java.lang.Math.abs(r5)
            int r0 = java.lang.Math.abs(r8)
            int r0 = r0 - r1
            int r1 = r1 - r0
            if (r1 != 0) goto L4b
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            if (r9 == r0) goto L47
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            if (r9 != r0) goto L49
        L42:
            r0 = 1
            r0 = r0 & r6
            r0 = r0 & r4
            if (r0 == 0) goto L51
        L47:
            int r6 = r6 + r3
            return r6
        L49:
            r4 = r2
            goto L42
        L4b:
            if (r1 <= 0) goto L51
            goto L47
        L4e:
            com.google.android.gms.internal.fido.zzbi.zza(r2)
        L51:
            return r6
        L52:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "/ by zero"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbh.zza(int, int, java.math.RoundingMode):int");
    }

    public static int zzb(int i2, RoundingMode roundingMode) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzbg.zza[roundingMode.ordinal()]) {
            case 1:
                zzbi.zza(((i2 + (-1)) & i2) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i2) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }
}
