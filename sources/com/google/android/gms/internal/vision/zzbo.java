package com.google.android.gms.internal.vision;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbo {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;

    @Nullable
    final zzcw<Context, Boolean> zzi;

    public zzbo(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzbo(String str, Uri uri, String str2, String str3, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable zzcw<Context, Boolean> zzcwVar) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z2;
        this.zzf = z3;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = zzcwVar;
    }

    public final <T> zzbi<T> zza(String str, T t2, zzbp<T> zzbpVar) {
        return zzbi.zzb(this, str, t2, zzbpVar, true);
    }

    public final zzbo zza(String str) {
        boolean z2 = this.zze;
        if (z2) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzbo(this.zza, this.zzb, str, this.zzd, z2, this.zzf, this.zzg, this.zzh, this.zzi);
    }
}
