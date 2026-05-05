package com.google.android.gms.internal.auth;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.FB;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzdc {
    public static final /* synthetic */ int zzd = 0;

    @Nullable
    private static volatile zzda zze = null;
    private static volatile boolean zzf = false;
    final zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private static final Object zza = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzde zzh = new zzde(zzcu.zza);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z2, zzdb zzdbVar) {
        if (zzczVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzb = zzczVar;
        this.zzc = str;
        this.zzj = obj;
    }

    public static void zzc() {
        zzi.incrementAndGet();
    }

    public static void zzd(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zze == null) {
                synchronized (obj) {
                    zzda zzdaVar = zze;
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(C1561oA.od("Q]R_[TN\u0017KVTYIQV\u000f#NLQASN", (short) (ZN.Xd() ^ 10149))).getMethod(C1561oA.Kd("EDT\"RSPNIH\\RYY/\\\\cUif", (short) (FB.Xd() ^ 22733)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Context context2 = (Context) method.invoke(context, objArr);
                        if (context2 != null) {
                            context = context2;
                        }
                        if (zzdaVar == null || zzdaVar.zza() != context) {
                            zzcg.zzd();
                            zzdd.zzc();
                            zzco.zze();
                            zze = new zzcd(context, zzdo.zza(new zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                                @Override // com.google.android.gms.internal.auth.zzdj
                                public final Object zza() {
                                    Context context3 = context;
                                    int i2 = zzdc.zzd;
                                    return zzcp.zza(context3);
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:84:0x0092 A[PHI: r3
  0x0092: PHI (r3v1 com.google.android.gms.internal.auth.zzdh) = (r3v0 com.google.android.gms.internal.auth.zzdh), (r3v4 com.google.android.gms.internal.auth.zzdh) binds: [B:73:0x0016, B:75:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb() {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdc.zzb():java.lang.Object");
    }
}
