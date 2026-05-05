package com.google.android.gms.internal.gtm;

import com.dynatrace.android.agent.Global;
import com.google.android.gms.analytics.Logger;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class zzfc {
    private static volatile Logger zza = new zzcw();

    public static Logger zza() {
        return zza;
    }

    public static void zzb(String str, Object obj) {
        zzfd zzfdVarZza = zzfd.zza();
        if (zzfdVarZza != null) {
            zzfdVarZza.zzJ(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str2 = str + Global.COLON + ((String) obj);
            }
        }
        Logger logger = zza;
        if (logger != null) {
            logger.error(str);
        }
    }

    public static void zzc(Logger logger) {
        zza = logger;
    }

    public static void zzd(String str) {
        zzfd zzfdVarZza = zzfd.zza();
        if (zzfdVarZza != null) {
            zzfdVarZza.zzN(str);
        } else if (zzf(0)) {
        }
        Logger logger = zza;
        if (logger != null) {
            logger.verbose(str);
        }
    }

    public static void zze(String str) {
        zzfd zzfdVarZza = zzfd.zza();
        if (zzfdVarZza != null) {
            zzfdVarZza.zzQ(str);
        } else if (zzf(2)) {
        }
        Logger logger = zza;
        if (logger != null) {
            logger.warn(str);
        }
    }

    public static boolean zzf(int i2) {
        return zza != null && zza.getLogLevel() <= i2;
    }
}
