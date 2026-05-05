package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzkn extends zzka {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    protected zzkn(zzko zzkoVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzka
    @CheckForNull
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i2 = this.zzc;
        while (true) {
            int i3 = this.zzc;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i3);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzc = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzc = iZzc;
            }
            if (iZzc != i2) {
                if (i2 < iZzd) {
                    this.zzb.charAt(i2);
                }
                if (i2 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                int i4 = this.zzd;
                if (i4 == 1) {
                    iZzd = this.zzb.length();
                    this.zzc = -1;
                    if (iZzd > i2) {
                        this.zzb.charAt(iZzd - 1);
                    }
                } else {
                    this.zzd = i4 - 1;
                }
                return this.zzb.subSequence(i2, iZzd).toString();
            }
            int i5 = iZzc + 1;
            this.zzc = i5;
            if (i5 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    abstract int zzc(int i2);

    abstract int zzd(int i2);
}
