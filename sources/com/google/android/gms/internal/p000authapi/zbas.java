package com.google.android.gms.internal.p000authapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zbas {
    private static final SecureRandom zba;

    static {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Jg.Wd("E\u0007>}t}%l%t\u000ee\\W'\f/\u000b;s\u0012o\u001f'`\u001f", (short) (C1580rY.Xd() ^ (-17964)), (short) (C1580rY.Xd() ^ (-9591)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            zba = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String zba() throws Throwable {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = zba;
        short sXd = (short) (FB.Xd() ^ 32196);
        short sXd2 = (short) (FB.Xd() ^ 26002);
        int[] iArr = new int["\bn*&s]4\u000fD;HI1D4hCW\u0005IAF}\u000bE8".length()];
        QB qb = new QB("\bn*&s]4\u000fD;HI1D4hCW\u0005IAF}\u000bE8");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = {bArr};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud("h)F[ -?C#", (short) (OY.Xd() ^ 5806), (short) (OY.Xd() ^ 17795)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            Class<?> cls = Class.forName(Ig.wd("*\u0007N<a\u0007.\u001f$\u0003}^M[\u000f~\u0018f,", (short) (FB.Xd() ^ 7404)));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE};
            Object[] objArr2 = {bArr, 11};
            short sXd3 = (short) (OY.Xd() ^ 29483);
            int[] iArr2 = new int["l0\u0007r\u001fex\u001bR7K(\\G".length()];
            QB qb2 = new QB("l0\u0007r\u001fex\u001bR7K(\\G");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
