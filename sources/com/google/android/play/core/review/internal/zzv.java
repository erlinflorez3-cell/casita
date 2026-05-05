package com.google.android.play.core.review.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public final class zzv {
    public static String zza(byte[] bArr) throws Throwable {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C1561oA.Xd("\u000b\u0001zgmqs", (short) (C1607wl.Xd() ^ 13744)));
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            Class<?> cls = Class.forName(Wg.vd("2@7FD?;\u0006>>48z\u00100C&wv", (short) (ZN.Xd() ^ 23959)));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE};
            Object[] objArr = {bArrDigest, 11};
            short sXd = (short) (OY.Xd() ^ 9142);
            short sXd2 = (short) (OY.Xd() ^ 27215);
            int[] iArr = new int["\u001e&\u001a%\u0019\u0019\u0007!\u0004$!\u0017\u001b\u0013".length()];
            QB qb = new QB("\u001e&\u001a%\u0019\u0019\u0007!\u0004$!\u0017\u001b\u0013");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
