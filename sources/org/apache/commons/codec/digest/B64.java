package org.apache.commons.codec.digest;

import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.Random;
import yg.C1593ug;
import yg.Od;

/* JADX INFO: loaded from: classes6.dex */
final class B64 {
    static final String B64T_STRING = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final char[] B64T_ARRAY = B64T_STRING.toCharArray();

    B64() {
    }

    static void b64from24bit(byte b2, byte b3, byte b4, int i2, StringBuilder sb) {
        int i3 = ((-1) - (((-1) - (b2 << 16)) | ((-1) - ViewCompat.MEASURED_SIZE_MASK))) | ((-1) - (((-1) - (b3 << 8)) | ((-1) - 65535))) | ((-1) - (((-1) - b4) | ((-1) - 255)));
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return;
            }
            sb.append(B64T_ARRAY[(i3 + 63) - (63 | i3)]);
            i3 >>= 6;
            i2 = i4;
        }
    }

    static String getRandomSalt(int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1593ug.zd("\n\u0002\u0018\u0004Q\u0018\u000b\n\u001d\u001b\u0013\u001f%Z\u0001\u0014\u0013&$\u0018\u0006\u0016$\u001b'&", (short) (Od.Xd() ^ (-10490)), (short) (Od.Xd() ^ (-15242)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            return getRandomSalt(i2, (SecureRandom) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static String getRandomSalt(int i2, Random random) {
        StringBuilder sb = new StringBuilder(i2);
        for (int i3 = 1; i3 <= i2; i3++) {
            sb.append(B64T_STRING.charAt(random.nextInt(B64T_STRING.length())));
        }
        return sb.toString();
    }
}
