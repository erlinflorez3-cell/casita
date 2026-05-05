package com.google.android.gms.internal.gtm;

import android.content.Context;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgx implements zzhc {
    private static zzgx zza = null;
    private static final Object zzb = new Object();
    private static final Set zzc = new HashSet(Arrays.asList("GET", "HEAD", HttpPost.METHOD_NAME, "PUT"));
    private final zzhd zzd;
    private final zzif zze;

    private zzgx(Context context) {
        zzhf zzhfVarZzd = zzhf.zzd(context);
        zzif zzifVar = new zzif();
        this.zzd = zzhfVarZzd;
        this.zze = zzifVar;
    }

    public static zzhc zza(Context context) {
        zzgx zzgxVar;
        synchronized (zzb) {
            if (zza == null) {
                zza = new zzgx(context);
            }
            zzgxVar = zza;
        }
        return zzgxVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzhc
    public final boolean zzb(String str, String str2, String str3, Map map, String str4) {
        if (str2 != null && !zzc.contains(str2)) {
            zzho.zze(String.format("Unsupport http method %s. Drop the hit.", str2));
            return false;
        }
        if (zzhv.zza().zzd() || this.zze.zza()) {
            this.zzd.zzb(str, str2, str3, map, str4);
            return true;
        }
        zzho.zze("Too many hits sent too quickly (rate throttled).");
        return false;
    }
}
