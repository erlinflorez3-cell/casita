package org.springframework.util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Base64Utils {
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private static final Base64Delegate delegate = new AndroidBase64Delegate();

    private static class AndroidBase64Delegate implements Base64Delegate {
        private AndroidBase64Delegate() {
        }

        @Override // org.springframework.util.Base64Utils.Base64Delegate
        public byte[] decode(byte[] bArr) throws Throwable {
            if (bArr == null || bArr.length == 0) {
                return bArr;
            }
            Object[] objArr = {bArr, 2};
            Method declaredMethod = Class.forName(C1626yg.Ud("0;<=\r},P\u001ax\u007f.\u0015EqeR\u0001\u0011", (short) (C1633zX.Xd() ^ (-18088)), (short) (C1633zX.Xd() ^ (-1757)))).getDeclaredMethod(Ig.wd("e4Px\u001eY", (short) (Od.Xd() ^ (-5933))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                return (byte[]) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // org.springframework.util.Base64Utils.Base64Delegate
        public byte[] encode(byte[] bArr) throws Throwable {
            if (bArr == null || bArr.length == 0) {
                return bArr;
            }
            Object[] objArr = {bArr, 2};
            Method declaredMethod = Class.forName(EO.Od("U:>lB`Gqo#\u001a7`l}k+[3", (short) (C1580rY.Xd() ^ (-4581)))).getDeclaredMethod(C1561oA.Qd("EMAL@@", (short) (OY.Xd() ^ 15524)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                return (byte[]) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private interface Base64Delegate {
        byte[] decode(byte[] bArr);

        byte[] encode(byte[] bArr);
    }

    @Deprecated
    public static byte[] decode(String str) {
        return decodeFromString(str);
    }

    public static byte[] decode(byte[] bArr) {
        return delegate.decode(bArr);
    }

    public static byte[] decodeFromString(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        try {
            return delegate.decode(str.getBytes(DEFAULT_CHARSET.displayName()));
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static byte[] encode(byte[] bArr) {
        return delegate.encode(bArr);
    }

    public static String encodeToString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        try {
            return new String(delegate.encode(bArr), DEFAULT_CHARSET.displayName());
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
