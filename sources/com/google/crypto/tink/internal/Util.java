package com.google.crypto.tink.internal;

import com.google.crypto.tink.util.Bytes;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public final class Util {
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private Util() {
    }

    @Nullable
    public static Integer getAndroidApiLevel() {
        if (isAndroid()) {
            return BuildDispatchedCode.getApiLevel();
        }
        return null;
    }

    public static boolean isAndroid() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int randKeyId() throws Throwable {
        short sXd = (short) (OY.Xd() ^ 15963);
        short sXd2 = (short) (OY.Xd() ^ 5665);
        int[] iArr = new int["I\u0016?\"z4BPu\u0005q\u0017\u0006TOr\u0005\u0007 \u0007 'G7P`".length()];
        QB qb = new QB("I\u0016?\"z4BPu\u0005q\u0017\u0006TOr\u0005\u0007 \u0007 'G7P`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            byte[] bArr = new byte[4];
            int i3 = 0;
            while (i3 == 0) {
                Object[] objArr2 = {bArr};
                Method method = Class.forName(C1561oA.Xd("A9O;\tOBATRJV\\\u00128KJ][O=M[R^]", (short) (C1499aX.Xd() ^ (-25821)))).getMethod(Wg.vd("mcyt=sqaj", (short) (FB.Xd() ^ 24657)), byte[].class);
                try {
                    method.setAccessible(true);
                    method.invoke(secureRandom, objArr2);
                    int i4 = (bArr[0] & 127) << 24;
                    int i5 = ((-1) - (((-1) - bArr[1]) | ((-1) - 255))) << 16;
                    int i6 = ((i4 + i5) - (i4 & i5)) | (((-1) - (((-1) - bArr[2]) | ((-1) - 255))) << 8);
                    byte b2 = bArr[3];
                    i3 = i6 | ((b2 + 255) - (b2 | 255));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return i3;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static final byte toByteFromPrintableAscii(char c2) {
        if (c2 < '!' || c2 > '~') {
            throw new TinkBugException("Not a printable ASCII character: " + c2);
        }
        return (byte) c2;
    }

    public static final Bytes toBytesFromPrintableAscii(String s2) {
        byte[] bArr = new byte[s2.length()];
        for (int i2 = 0; i2 < s2.length(); i2++) {
            bArr[i2] = toByteFromPrintableAscii(s2.charAt(i2));
        }
        return Bytes.copyFrom(bArr);
    }
}
