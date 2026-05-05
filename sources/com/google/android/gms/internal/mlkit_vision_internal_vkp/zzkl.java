package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzkl extends zzkn {
    final /* synthetic */ zzkm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzkl(zzkm zzkmVar, zzko zzkoVar, CharSequence charSequence) {
        super(zzkoVar, charSequence);
        this.zza = zzkmVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzkn
    public final int zzc(int i2) {
        return i2 + this.zza.zza.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r7 = r7 + 1;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(int r7) {
        /*
            r6 = this;
            java.lang.CharSequence r0 = r6.zzb
            int r5 = r0.length()
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzkm r0 = r6.zza
            java.lang.String r0 = r0.zza
            int r4 = r0.length()
            int r5 = r5 - r4
        Lf:
            if (r7 > r5) goto L2d
            r3 = 0
        L12:
            if (r3 >= r4) goto L2c
            java.lang.CharSequence r2 = r6.zzb
            int r1 = r3 + r7
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzkm r0 = r6.zza
            java.lang.String r0 = r0.zza
            char r1 = r2.charAt(r1)
            char r0 = r0.charAt(r3)
            if (r1 == r0) goto L29
            int r7 = r7 + 1
            goto Lf
        L29:
            int r3 = r3 + 1
            goto L12
        L2c:
            return r7
        L2d:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzkl.zzd(int):int");
    }
}
