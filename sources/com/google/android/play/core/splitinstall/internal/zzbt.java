package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import yg.C1499aX;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbt {
    public static String zza(byte[] bArr) throws Throwable {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(EO.Od("AnW\u001e\fS\u0003", (short) (C1499aX.Xd() ^ (-21554))));
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            short sXd = (short) (C1633zX.Xd() ^ (-23031));
            int[] iArr = new int["&2'40)#k20$&fy\u0018)\u001aif".length()];
            QB qb = new QB("&2'40)#k20$&fy\u0018)\u001aif");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {bArrDigest, 11};
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1593ug.zd("'1'4*,\u001c8\u001d?>6<6", (short) (FB.Xd() ^ 16375), (short) (FB.Xd() ^ 6362)), byte[].class, Integer.TYPE);
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
