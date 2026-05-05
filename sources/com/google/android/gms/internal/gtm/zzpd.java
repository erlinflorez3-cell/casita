package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpd extends zzjy {
    private static final zzsx zza = zzsx.zzj("GET", "HEAD", HttpPost.METHOD_NAME, "PUT");
    private final zzhc zzb;

    public zzpd(zzhc zzhcVar) {
        this.zzb = zzhcVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2 = true;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 1);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrh);
        zzqz zzqzVarZzb = zzqzVarArr[0].zzb("url");
        Preconditions.checkArgument(zzqzVarZzb instanceof zzrk);
        String strZzk = ((zzrk) zzqzVarZzb).zzk();
        zzqz zzqzVarZzb2 = zzqzVarArr[0].zzb("method");
        if (zzqzVarZzb2 == zzrd.zze) {
            zzqzVarZzb2 = new zzrk("GET");
        }
        Preconditions.checkArgument(zzqzVarZzb2 instanceof zzrk);
        String strZzk2 = ((zzrk) zzqzVarZzb2).zzk();
        Preconditions.checkArgument(zza.contains(strZzk2));
        zzqz zzqzVarZzb3 = zzqzVarArr[0].zzb("uniqueId");
        Preconditions.checkArgument(zzqzVarZzb3 == zzrd.zze || zzqzVarZzb3 == zzrd.zzd || (zzqzVarZzb3 instanceof zzrk));
        String strZzk3 = (zzqzVarZzb3 == zzrd.zze || zzqzVarZzb3 == zzrd.zzd) ? null : ((zzrk) zzqzVarZzb3).zzk();
        zzqz zzqzVarZzb4 = zzqzVarArr[0].zzb("headers");
        Preconditions.checkArgument(zzqzVarZzb4 == zzrd.zze || (zzqzVarZzb4 instanceof zzrh));
        HashMap map = new HashMap();
        if (zzqzVarZzb4 == zzrd.zze) {
            map = null;
        } else {
            for (Map.Entry entry : ((zzrh) zzqzVarZzb4).zzi().entrySet()) {
                String str = (String) entry.getKey();
                zzqz zzqzVar = (zzqz) entry.getValue();
                if (zzqzVar instanceof zzrk) {
                    map.put(str, ((zzrk) zzqzVar).zzk());
                } else {
                    zzho.zze(String.format("Ignore the non-string value of header key %s.", str));
                }
            }
        }
        zzqz zzqzVarZzb5 = zzqzVarArr[0].zzb("body");
        if (zzqzVarZzb5 != zzrd.zze && !(zzqzVarZzb5 instanceof zzrk)) {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        String strZzk4 = zzqzVarZzb5 != zzrd.zze ? ((zzrk) zzqzVarZzb5).zzk() : null;
        if ((strZzk2.equals("GET") || strZzk2.equals("HEAD")) && strZzk4 != null) {
            zzho.zze(String.format("Body of %s hit will be ignored: %s.", strZzk2, strZzk4));
        }
        this.zzb.zzb(strZzk, strZzk2, strZzk3, map, strZzk4);
        zzho.zzd(String.format("QueueRequest:\n  url = %s,\n  method = %s,\n  uniqueId = %s,\n  headers = %s,\n  body = %s", strZzk, strZzk2, strZzk3, map, strZzk4));
        return zzrd.zze;
    }
}
