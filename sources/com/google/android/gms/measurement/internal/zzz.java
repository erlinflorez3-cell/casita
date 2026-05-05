package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;

/* JADX INFO: loaded from: classes8.dex */
final class zzz extends zzaa {
    private zzfo.zze zzg;
    private final /* synthetic */ zzt zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzz(zzt zztVar, String str, int i2, zzfo.zze zzeVar) {
        super(str, i2);
        this.zzh = zztVar;
        this.zzg = zzeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    final int zza() {
        return this.zzg.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean zza(Long l2, Long l3, zzfy.zzo zzoVar, boolean z2) {
        byte b2 = com.google.android.gms.internal.measurement.zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbn);
        boolean zZzf = this.zzg.zzf();
        boolean zZzg = this.zzg.zzg();
        boolean zZzh = this.zzg.zzh();
        byte b3 = zZzf || zZzg || zZzh;
        Boolean boolZza = null;
        boolZza = null;
        boolZza = null;
        boolZza = null;
        boolZza = null;
        if (z2 && b3 != true) {
            this.zzh.zzj().zzp().zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zzi() ? Integer.valueOf(this.zzg.zza()) : null);
            return true;
        }
        zzfo.zzc zzcVarZzb = this.zzg.zzb();
        boolean zZzf2 = zzcVarZzb.zzf();
        if (zzoVar.zzk()) {
            if (zzcVarZzb.zzh()) {
                boolZza = zza(zza(zzoVar.zzc(), zzcVarZzb.zzc()), zZzf2);
            } else {
                this.zzh.zzj().zzu().zza("No number filter for long property. property", this.zzh.zzi().zzc(zzoVar.zzg()));
            }
        } else if (zzoVar.zzi()) {
            if (zzcVarZzb.zzh()) {
                boolZza = zza(zza(zzoVar.zza(), zzcVarZzb.zzc()), zZzf2);
            } else {
                this.zzh.zzj().zzu().zza("No number filter for double property. property", this.zzh.zzi().zzc(zzoVar.zzg()));
            }
        } else if (!zzoVar.zzm()) {
            this.zzh.zzj().zzu().zza("User property has no value, property", this.zzh.zzi().zzc(zzoVar.zzg()));
        } else if (zzcVarZzb.zzj()) {
            boolZza = zza(zza(zzoVar.zzh(), zzcVarZzb.zzd(), this.zzh.zzj()), zZzf2);
        } else if (!zzcVarZzb.zzh()) {
            this.zzh.zzj().zzu().zza("No string or number filter defined. property", this.zzh.zzi().zzc(zzoVar.zzg()));
        } else if (zzoo.zzb(zzoVar.zzh())) {
            boolZza = zza(zza(zzoVar.zzh(), zzcVarZzb.zzc()), zZzf2);
        } else {
            this.zzh.zzj().zzu().zza("Invalid user property value for Numeric number filter. property, value", this.zzh.zzi().zzc(zzoVar.zzg()), zzoVar.zzh());
        }
        this.zzh.zzj().zzp().zza("Property filter result", boolZza == null ? "null" : boolZza);
        if (boolZza == null) {
            return false;
        }
        this.zzc = true;
        if (zZzh && !boolZza.booleanValue()) {
            return true;
        }
        if (!z2 || this.zzg.zzf()) {
            this.zzd = boolZza;
        }
        if (boolZza.booleanValue() && b3 != false && zzoVar.zzl()) {
            long jZzd = zzoVar.zzd();
            if (l2 != null) {
                jZzd = l2.longValue();
            }
            if (b2 != false && this.zzg.zzf() && !this.zzg.zzg() && l3 != null) {
                jZzd = l3.longValue();
            }
            if (this.zzg.zzg()) {
                this.zzf = Long.valueOf(jZzd);
            } else {
                this.zze = Long.valueOf(jZzd);
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    final boolean zzc() {
        return true;
    }
}
