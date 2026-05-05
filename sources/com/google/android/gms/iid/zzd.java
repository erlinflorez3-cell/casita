package com.google.android.gms.iid;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd {
    public static KeyPair zzl() throws Throwable {
        String strOd = C1561oA.od("\u0017\u0017\u0004", (short) (ZN.Xd() ^ 6655));
        try {
            Class<?> cls = Class.forName(C1561oA.Kd("7/E1~E87JH@LR\b&AV.@IS)HRJXH\\X\\", (short) (ZN.Xd() ^ 6567)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Wg.Zd("<\f\"%r)?D>]\u0007A?/TF", (short) (C1633zX.Xd() ^ (-30009)), (short) (C1633zX.Xd() ^ (-10799))));
            Object[] objArr = {strOd};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Xd("\r\f\u001cq\u0018\u001e \u000e\u001c\u0012\u0015", (short) (FB.Xd() ^ 21533)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr);
                Object[] objArr2 = {2048};
                Method method = Class.forName(Wg.vd("wo\u0002m?\u0006tszxlx\u00038Rm\u0017n|\u0006\u0014i\u0005\u000fz\tt\t\t\r", (short) (Od.Xd() ^ (-17728)))).getMethod(Qg.kd("593=1(2.>(", (short) (ZN.Xd() ^ 17362), (short) (ZN.Xd() ^ 3833)), Integer.TYPE);
                try {
                    method.setAccessible(true);
                    method.invoke(keyPairGenerator, objArr2);
                    Object[] objArr3 = new Object[0];
                    Method method2 = Class.forName(hg.Vd("h^r\\(l]Zkg]gk\u001f;Tg=MT\\0MUKWEWQS", (short) (ZN.Xd() ^ 18503), (short) (ZN.Xd() ^ 11979))).getMethod(C1561oA.ud("\u0005\u0002\n\u007f\fy\f{`y\rbry\u0002", (short) (FB.Xd() ^ 25078)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        return (KeyPair) method2.invoke(keyPairGenerator, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (NoSuchAlgorithmException e5) {
            throw new AssertionError(e5);
        }
    }
}
