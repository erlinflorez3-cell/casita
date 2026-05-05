package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.Random;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class zzul {
    static final Random zza;
    public static final /* synthetic */ int zzb = 0;

    static {
        short sXd = (short) (ZN.Xd() ^ 17358);
        short sXd2 = (short) (ZN.Xd() ^ 20226);
        int[] iArr = new int["0{\\#;]\u001btR+rY*:,\u001acQ\u001ai\"\re8\u000fh".length()];
        QB qb = new QB("0{\\#;]\u001btR+rY*:,\u001acQ\u001ai\"\re8\u000fh");
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
            zza = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
