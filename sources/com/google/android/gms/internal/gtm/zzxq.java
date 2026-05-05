package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public class zzxq extends zzxp implements zzzh {
    protected zzxq(zzxr zzxrVar) {
        super(zzxrVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzxp
    protected final void zzH() {
        super.zzH();
        if (((zzxr) this.zza).zza != zzxk.zze()) {
            zzxr zzxrVar = (zzxr) this.zza;
            zzxrVar.zza = zzxrVar.zza.clone();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzxp, com.google.android.gms.internal.gtm.zzzf
    /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzxr zzE() {
        if (!((zzxr) this.zza).zzaq()) {
            return (zzxr) this.zza;
        }
        ((zzxr) this.zza).zza.zzi();
        return (zzxr) super.zzE();
    }
}
