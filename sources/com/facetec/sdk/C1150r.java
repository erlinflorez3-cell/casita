package com.facetec.sdk;

import com.google.common.base.Ascii;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.facetec.sdk.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C1150r {
    private static final char[] V = "0123456789ABCDEF".toCharArray();

    C1150r() {
    }

    static String B(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 << 1;
            char[] cArr2 = V;
            cArr[i3] = cArr2[(255 & b2) >>> 4];
            cArr[i3 + 1] = cArr2[(b2 + Ascii.SI) - (b2 | Ascii.SI)];
        }
        return new String(cArr);
    }

    static byte[] B(String str) throws Exception {
        return Code(str.getBytes(StandardCharsets.UTF_8));
    }

    static String Code(byte[] bArr, String str) throws Exception {
        return B(V(bArr, str.getBytes(StandardCharsets.UTF_8)));
    }

    static byte[] Code(byte[]... bArr) throws Exception {
        return MessageDigest.getInstance("SHA-256").digest(I(bArr));
    }

    static String I(String str) throws Exception {
        return B(Code(str.getBytes(StandardCharsets.UTF_8)));
    }

    static byte[] I(byte[] bArr, String str) throws Exception {
        return V(bArr, str.getBytes(StandardCharsets.UTF_8));
    }

    private static byte[] I(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    private static byte[] V(byte[] bArr, byte[]... bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return mac.doFinal(I(bArr2));
    }
}
