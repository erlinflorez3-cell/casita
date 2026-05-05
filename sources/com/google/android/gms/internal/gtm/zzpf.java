package com.google.android.gms.internal.gtm;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpf extends zzjy {
    private final zzhc zza;

    public zzpf(zzhc zzhcVar) {
        this.zza = zzhcVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2 = true;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0);
        zzqz zzqzVar = zzqzVarArr[0];
        Preconditions.checkArgument(!(zzqzVar instanceof zzrd));
        zzqz zzqzVar2 = length > 1 ? zzqzVarArr[1] : zzrd.zze;
        Preconditions.checkArgument(zzqzVar2 == zzrd.zze || (zzqzVar2 instanceof zzrg));
        zzqz zzqzVar3 = length > 2 ? zzqzVarArr[2] : zzrd.zze;
        if (zzqzVar3 != zzrd.zze && (zzqzVar3 instanceof zzrd)) {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Uri.Builder builderBuildUpon = Uri.parse(zzjx.zzd(zzqzVar)).buildUpon();
        if (zzqzVar2 != zzrd.zze) {
            for (zzqz zzqzVar4 : ((zzrg) zzqzVar2).zzk()) {
                Preconditions.checkArgument(zzqzVar4 instanceof zzrh);
                for (Map.Entry entry : ((zzrh) zzqzVar4).zzi().entrySet()) {
                    builderBuildUpon.appendQueryParameter(((String) entry.getKey()).toString(), zzjx.zzd(zzrl.zzc(zzieVar, (zzqz) entry.getValue())));
                }
            }
        }
        String string = builderBuildUpon.build().toString();
        if (zzqzVar3 == zzrd.zze) {
            ((zzgx) this.zza).zzb(string, null, null, null, null);
            zzho.zzd("SendPixel: url = ".concat(String.valueOf(string)));
        } else {
            String strZzd = zzjx.zzd(zzqzVar3);
            ((zzgx) this.zza).zzb(string, null, strZzd, null, null);
            zzho.zzd("SendPixel: url = " + string + ", uniqueId = " + strZzd);
        }
        return zzrd.zze;
    }
}
