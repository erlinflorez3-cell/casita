package com.google.android.play.integrity.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public final class ah {
    public static String a(byte[] bArr) throws Throwable {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C1561oA.yd(".$\u001e\u000b\u0011\u0015\u0017", (short) (ZN.Xd() ^ 23136)));
            messageDigest.update(bArr);
            Object[] objArr = {messageDigest.digest(), 11};
            Method declaredMethod = Class.forName(C1561oA.Yd("1?6EC>:\u0005MMCG\n\u001f?RE\u0017\u0016", (short) (FB.Xd() ^ 18966))).getDeclaredMethod(Xg.qd("T^TaWYIeJlkcic", (short) (C1580rY.Xd() ^ (-7804)), (short) (C1580rY.Xd() ^ (-18302))), byte[].class, Integer.TYPE);
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
