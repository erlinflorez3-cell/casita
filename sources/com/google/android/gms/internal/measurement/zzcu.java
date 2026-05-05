package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Od;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcu {
    private static final ThreadLocal<Boolean> zza = new zzct();

    public static SharedPreferences zza(Context context, String str, int i2, zzcm zzcmVar) {
        zzcp zzcpVar = zzcf.zza().zza(str, zzcmVar, zzcj.SHARED_PREFS_TYPE).equals("") ? new zzcp() : null;
        if (zzcpVar != null) {
            return zzcpVar;
        }
        ThreadLocal<Boolean> threadLocal = zza;
        Preconditions.checkArgument(threadLocal.get().booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            Class<?> cls = Class.forName(hg.Vd("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002", (short) (C1499aX.Xd() ^ (-17674)), (short) (C1499aX.Xd() ^ (-13382))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.ud("\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMq\u0012\u000f\u0005\t\u0001", (short) (Od.Xd() ^ (-19136))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 0};
            Method method = cls.getMethod(C1561oA.yd("\n\t\u0015t\u0007\u0001\u000f\u0003\u000f{\u001b\u000f\r\r\u0017\u000b!\u0017\u0016%", (short) (C1633zX.Xd() ^ (-31187))), clsArr);
            try {
                method.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
                threadLocal.set(Boolean.TRUE);
                return sharedPreferences;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            zza.set(Boolean.TRUE);
            throw th;
        }
    }
}
