package com.google.android.gms.internal.mlkit_vision_common;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
final class zzz extends zzr {
    static final zzr zza = new zzz(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    private zzz(@CheckForNull Object obj, Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    static zzz zzg(int i2, Object[] objArr, zzq zzqVar) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        zzi.zza(obj, obj2);
        return new zzz(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r3 = r4.zzb
            int r0 = r4.zzc
            r2 = 0
            if (r5 != 0) goto Lb
        L7:
            r0 = r2
        L8:
            if (r0 != 0) goto L20
            return r2
        Lb:
            r1 = 1
            if (r0 != r1) goto L7
            r0 = 0
            r0 = r3[r0]
            r0.getClass()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L7
            r0 = r3[r1]
            r0.getClass()
            goto L8
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzz.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    final zzl zza() {
        return new zzy(this.zzb, 1, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    final zzs zzd() {
        return new zzw(this, this.zzb, 0, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    final zzs zze() {
        return new zzx(this, new zzy(this.zzb, 0, this.zzc));
    }
}
