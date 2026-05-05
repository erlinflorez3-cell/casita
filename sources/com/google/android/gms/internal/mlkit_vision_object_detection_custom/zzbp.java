package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
final class zzbp extends zzax {
    final transient Object[] zza;

    private zzbp(@CheckForNull Object obj, Object[] objArr, int i2) {
        this.zza = objArr;
    }

    static zzbp zzg(int i2, Object[] objArr, zzaw zzawVar) {
        zzab.zzb(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
        return new zzbp(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzax, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L7
        L3:
            r0 = r2
        L4:
            if (r0 != 0) goto L1e
            return r2
        L7:
            java.lang.Object[] r1 = r3.zza
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L3
            r0 = 1
            r0 = r1[r0]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            goto L4
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzbp.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzax
    final zzaq zza() {
        return new zzbo(this.zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzax
    final zzay zzd() {
        return new zzbm(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzax
    final zzay zze() {
        return new zzbn(this, new zzbo(this.zza, 0, 1));
    }
}
