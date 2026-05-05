package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.Random;
import yg.C1561oA;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class zzaxh {
    static final Random zza;
    public static final /* synthetic */ int zzb = 0;

    static {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Xd("0(>*w>10CA9EK\u0001':9LJ>,<JAML", (short) (ZN.Xd() ^ 20240))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            zza = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
