package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.biocatch.android.commonsdk.core.Utils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.Random;
import yg.C1561oA;
import yg.FB;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaym {
    public static final Random zza;
    private static final int[] zzb = {0, 0, 1, 2, 4, 8, 16};

    static {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.ud("\u0011\u0007\u001b\u0005P\u0015\u0006\u0003\u0014\u0010\u0006\u0010\u0014Gk|y\u000b\u0007xdr~s}z", (short) (FB.Xd() ^ 1202))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            zza = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean zza(zzayl zzaylVar) throws InterruptedException {
        int[] iArr = zzb;
        for (int i2 = 0; i2 < 7; i2++) {
            int i3 = iArr[i2];
            if (i3 > 0) {
                int i4 = i3 * Utils.miliSecondsInMinute;
                Thread.sleep((i4 / 2) + zza.nextInt(i4));
            }
            try {
            } catch (zzayk e2) {
                e = e2;
                "retryWithRandomizedExponentialBackoff: ".concat(String.valueOf(e.getMessage()));
            } catch (IOException e3) {
                e = e3;
                "retryWithRandomizedExponentialBackoff: ".concat(String.valueOf(e.getMessage()));
            } catch (InterruptedException e4) {
                throw e4;
            }
            if (zzaylVar.zzb()) {
                return true;
            }
        }
        return false;
    }
}
