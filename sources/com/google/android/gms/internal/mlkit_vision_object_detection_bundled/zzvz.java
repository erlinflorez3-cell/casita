package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.net.HttpURLConnection;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class zzvz implements zzwi {
    final /* synthetic */ zzwa zza;
    private final String zzb;
    private final Date zzc;
    private final zzum zzd;
    private zzat zze;
    private zzvt zzf;

    zzvz(zzwa zzwaVar, String str, Date date, zzum zzumVar) {
        this.zza = zzwaVar;
        this.zzb = str;
        this.zzc = date;
        this.zzd = zzumVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwi
    public final boolean zza() throws zzwc {
        try {
            HttpURLConnection httpURLConnectionZzb = this.zza.zzh.zzb();
            zzwa zzwaVar = this.zza;
            zzvu zzvuVar = zzwaVar.zzh;
            String strZza = zzwaVar.zzg.zza().zza();
            String str = this.zzb;
            Date date = this.zzc;
            zzwa zzwaVar2 = this.zza;
            zzvt zzvtVarZza = zzvuVar.zza(httpURLConnectionZzb, strZza, str, zzat.zzc(), null, zzat.zzc(), date, "o:a:mlkit:1.0.0", zzwaVar2.zzn, this.zzd).zza();
            this.zzf = zzvtVarZza;
            JSONObject jSONObjectZzc = zzvtVarZza.zzc();
            try {
                this.zze = zzwa.zzm(jSONObjectZzc);
                return true;
            } catch (JSONException e2) {
                this.zzd.zzb(zzsw.RPC_RETURNED_MALFORMED_RESULT);
                "Fetched remote config setting has invalid format: ".concat(String.valueOf(String.valueOf(jSONObjectZzc)));
                return false;
            }
        } catch (zzwc e3) {
            this.zzd.zzb(zzsw.NO_CONNECTION);
            return false;
        }
    }

    public final zzat zzb() {
        return this.zze;
    }

    public final zzvt zzc() {
        return this.zzf;
    }
}
