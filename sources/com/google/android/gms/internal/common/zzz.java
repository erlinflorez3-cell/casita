package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzz extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    protected zzz(zzaa zzaaVar, CharSequence charSequence) {
        this.zzc = zzaaVar.zza;
        this.zzd = zzaaVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzm
    @CheckForNull
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int iZzc;
        int i2 = this.zze;
        while (true) {
            int i3 = this.zze;
            if (i3 == -1) {
                zzb();
                return null;
            }
            iZzd = zzd(i3);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i2) {
                int i4 = iZzc + 1;
                this.zze = i4;
                if (i4 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i2 < iZzd) {
                    this.zzb.charAt(i2);
                }
                if (i2 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i2 != iZzd) {
                    break;
                }
                i2 = this.zze;
            }
        }
        int i5 = this.zzf;
        if (i5 == 1) {
            iZzd = this.zzb.length();
            this.zze = -1;
            if (iZzd > i2) {
                this.zzb.charAt(iZzd - 1);
            }
        } else {
            this.zzf = i5 - 1;
        }
        return this.zzb.subSequence(i2, iZzd).toString();
    }

    abstract int zzc(int i2);

    abstract int zzd(int i2);
}
