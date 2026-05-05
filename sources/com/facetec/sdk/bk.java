package com.facetec.sdk;

import android.graphics.Color;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import yg.C1561oA;
import yg.EO;
import yg.FB;
import yg.OY;

/* JADX INFO: loaded from: classes3.dex */
abstract class bk implements ZoomEncryptStrings {
    private static int Code = 1;
    private static int I = 0;
    private static long Z = -7285901723760033828L;

    protected bk() {
    }

    protected static byte[] I() throws Exception {
        int i2 = 2 % 2;
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(EO.Od("p\u0018\u001bmidr(aRK0`\u001bdP\f$H#'}\u001d\u00179k", (short) (OY.Xd() ^ 21038))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(Z(C1561oA.Qd("ｎ岘ꤜ", (short) (FB.Xd() ^ 5622)), Color.rgb(0, 0, 0) + 16821105).intern());
                keyGenerator.init(128, secureRandom);
                byte[] encoded = keyGenerator.generateKey().getEncoded();
                int i3 = Code + 35;
                I = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 70 / 0;
                }
                return encoded;
            } catch (NoSuchAlgorithmException e2) {
                throw new Exception(ce.I(e2.getMessage()));
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    protected static byte[] V(Cipher cipher, byte[] bArr) throws Exception {
        int i2 = 2 % 2;
        int i3 = Code + 73;
        I = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                cipher.doFinal(bArr);
                throw null;
            }
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            int i4 = I + 1;
            Code = i4 % 128;
            int i5 = i4 % 2;
            return bArrDoFinal;
        } catch (Exception e2) {
            L.V(e2);
            return null;
        }
    }

    private static String Z(String str, int i2) {
        int i3 = 2 % 2;
        int i4 = Code + 121;
        I = i4 % 128;
        Object charArray = str;
        if (i4 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        char[] cArr2 = new char[cArr.length];
        for (int i5 = 0; i5 < cArr.length; i5++) {
            cArr2[i5] = (char) (((long) (cArr[i5] ^ (i5 * i2))) ^ Z);
        }
        String str2 = new String(cArr2);
        int i6 = I + 71;
        Code = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 39 / 0;
        }
        return str2;
    }

    protected static byte[] Z(Cipher cipher, byte[] bArr) throws Exception {
        int i2 = 2 % 2;
        int i3 = Code + 107;
        I = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        try {
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            int i5 = I + 113;
            Code = i5 % 128;
            if (i5 % 2 != 0) {
                return bArrDoFinal;
            }
            super.hashCode();
            throw null;
        } catch (Exception e2) {
            L.V(e2);
            return null;
        }
    }
}
