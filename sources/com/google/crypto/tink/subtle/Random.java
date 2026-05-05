package com.google.crypto.tink.subtle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public final class Random {
    private static final ThreadLocal<SecureRandom> localRandom = new ThreadLocal<SecureRandom>() { // from class: com.google.crypto.tink.subtle.Random.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SecureRandom initialValue() {
            return Random.newDefaultSecureRandom();
        }
    };

    private Random() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom newDefaultSecureRandom() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(hg.Vd("i_s])m^[lh^hl DURc_Q=KWLVS", (short) (FB.Xd() ^ 20582), (short) (FB.Xd() ^ 5897))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            secureRandom.nextLong();
            return secureRandom;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static byte[] randBytes(int size) throws Throwable {
        byte[] bArr = new byte[size];
        SecureRandom secureRandom = localRandom.get();
        Object[] objArr = {bArr};
        Method method = Class.forName(C1561oA.ud("oeyc/sdarndnr&J[XieWCQ]R\\Y", (short) (C1607wl.Xd() ^ 31731))).getMethod(C1561oA.yd("OGWT'_WIL", (short) (OY.Xd() ^ 14866)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            return bArr;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final int randInt() {
        return localRandom.get().nextInt();
    }

    public static final int randInt(int max) {
        return localRandom.get().nextInt(max);
    }
}
