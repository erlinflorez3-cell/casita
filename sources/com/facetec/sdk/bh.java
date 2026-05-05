package com.facetec.sdk;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
final class bh extends bk {
    private static int B = 1;
    private static int Code = 0;
    private static char[] V = {'A', 58766, 52165, 'A', 58766, 52165, 45390, 38767, 31925, 25217, 18594, 11784, 5224, 63917, 57322, 50609, 43807, 37243, 30337, 23764, 16914, 10280, 3702};
    private static long Z = -4621947141448604213L;
    private final SecretKeySpec I;

    public bh(byte[] bArr) throws Exception {
        this.I = new SecretKeySpec(bArr, V((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ViewConfiguration.getJumpTapTimeout() >> 16, 3 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
    }

    private static String V(char c2, int i2, int i3) {
        int i4 = 2 % 2;
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = Code + 113;
            B = i6 % 128;
            int i7 = i6 % 2;
            cArr[i5] = (char) ((((long) V[i2 + i5]) ^ (((long) i5) * Z)) ^ ((long) c2));
        }
        String str = new String(cArr);
        int i8 = Code + 123;
        B = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 37 / 0;
        }
        return str;
    }

    public final byte[] Code(byte[] bArr) throws Exception {
        int i2 = 2 % 2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrCopyOfRange);
        Cipher cipher = Cipher.getInstance(V((char) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2, TextUtils.getCapsMode("", 0, 0) + 20).intern());
        cipher.init(2, this.I, ivParameterSpec);
        byte[] bArrZ = Z(cipher, bArrCopyOfRange2);
        int i3 = B + 23;
        Code = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
        }
        return bArrZ;
    }

    public final byte[] Z(byte[] bArr) {
        int i2 = 2 % 2;
        try {
            byte[] bArrI = I();
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrI);
            Cipher cipher = Cipher.getInstance(V((char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.argb(0, 0, 0, 0) + 3, 20 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
            cipher.init(1, this.I, ivParameterSpec);
            byte[] bArrV = V(cipher, bArr);
            byte[] bArr2 = new byte[bArrV.length + bArrI.length];
            System.arraycopy(bArrI, 0, bArr2, 0, bArrI.length);
            System.arraycopy(bArrV, 0, bArr2, bArrI.length, bArrV.length);
            int i3 = Code + 65;
            B = i3 % 128;
            int i4 = i3 % 2;
            return bArr2;
        } catch (Exception unused) {
            return null;
        }
    }
}
