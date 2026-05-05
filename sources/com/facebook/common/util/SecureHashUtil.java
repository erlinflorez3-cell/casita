package com.facebook.common.util;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.Xg;

/* JADX INFO: loaded from: classes3.dex */
public class SecureHashUtil {
    private static final int BUFFER_SIZE = 4096;
    static final byte[] HEX_CHAR_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    public static String convertToHex(byte[] bArr) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            byte[] bArr2 = HEX_CHAR_TABLE;
            sb.append((char) bArr2[((-1) - (((-1) - b2) | ((-1) - 255))) >>> 4]);
            sb.append((char) bArr2[b2 & Ascii.SI]);
        }
        return sb.toString();
    }

    private static String makeHash(InputStream inputStream, String str) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            byte[] bArr = new byte[4096];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 <= 0) {
                    return convertToHex(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, i2);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static String makeHash(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr, 0, bArr.length);
            return convertToHex(messageDigest.digest());
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static String makeMD5Hash(InputStream inputStream) throws IOException {
        return makeHash(inputStream, MessageDigestAlgorithms.MD5);
    }

    public static String makeMD5Hash(String str) {
        try {
            return makeMD5Hash(str.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String makeMD5Hash(byte[] bArr) {
        return makeHash(bArr, MessageDigestAlgorithms.MD5);
    }

    public static String makeSHA1Hash(String str) {
        try {
            return makeSHA1Hash(str.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String makeSHA1Hash(byte[] bArr) {
        return makeHash(bArr, "SHA-1");
    }

    public static String makeSHA1HashBase64(byte[] bArr) throws Throwable {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C1561oA.yd("@60\u001d\u001a", (short) (C1607wl.Xd() ^ 918)));
            messageDigest.update(bArr, 0, bArr.length);
            Object[] objArr = {messageDigest.digest(), 11};
            Method declaredMethod = Class.forName(C1561oA.Yd("R`Wfd_[&nndh+@`sf87", (short) (C1499aX.Xd() ^ (-1964)))).getDeclaredMethod(Xg.qd("7A7D:<,H-ONFLF", (short) (Od.Xd() ^ (-2709)), (short) (Od.Xd() ^ (-29654))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static String makeSHA256Hash(byte[] bArr) {
        return makeHash(bArr, "SHA-256");
    }
}
