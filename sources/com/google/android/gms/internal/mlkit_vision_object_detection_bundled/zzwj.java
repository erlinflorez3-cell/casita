package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import com.biocatch.android.commonsdk.core.Utils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.Random;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwj {
    public static final Random zza;
    private static final int[] zzb = {0, 0, 1, 2, 4, 8, 16};

    static {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Wg.Zd("&w\\\"|\u0019^pR,1\u0015i6+\u0014$\u0011Y'%\tgvQ(", (short) (Od.Xd() ^ (-15113)), (short) (Od.Xd() ^ (-15329)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            zza = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean zza(zzwi zzwiVar) throws InterruptedException {
        int[] iArr = zzb;
        for (int i2 = 0; i2 < 7; i2++) {
            int i3 = iArr[i2];
            if (i3 > 0) {
                int i4 = i3 * Utils.miliSecondsInMinute;
                Thread.sleep((i4 / 2) + zza.nextInt(i4));
            }
            try {
            } catch (zzwh e2) {
                e = e2;
                "retryWithRandomizedExponentialBackoff: ".concat(String.valueOf(e.getMessage()));
            } catch (IOException e3) {
                e = e3;
                "retryWithRandomizedExponentialBackoff: ".concat(String.valueOf(e.getMessage()));
            } catch (InterruptedException e4) {
                throw e4;
            }
            if (zzwiVar.zza()) {
                return true;
            }
        }
        return false;
    }
}
