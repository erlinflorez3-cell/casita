package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrd extends zzqz {
    public static final zzrd zzb = new zzrd("BREAK");
    public static final zzrd zzc = new zzrd("CONTINUE");
    public static final zzrd zzd = new zzrd("NULL");
    public static final zzrd zze = new zzrd("UNDEFINED");
    private final String zzf;
    private final boolean zzg;
    private final zzqz zzh;

    public zzrd(zzqz zzqzVar) {
        Preconditions.checkNotNull(zzqzVar);
        this.zzf = "RETURN";
        this.zzg = true;
        this.zzh = zzqzVar;
    }

    private zzrd(String str) {
        this.zzf = str;
        this.zzg = false;
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final String toString() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final /* synthetic */ Object zzc() {
        return this.zzh;
    }

    public final zzqz zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return this.zzg;
    }
}
