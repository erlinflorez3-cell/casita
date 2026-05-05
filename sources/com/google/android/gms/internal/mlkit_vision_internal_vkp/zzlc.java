package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlc extends zzkt {
    public zzlc() {
        super(4);
    }

    public final zzlc zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    public final zzld zzc() {
        int i2 = this.zzb;
        if (i2 == 0) {
            return zzlm.zza;
        }
        if (i2 == 1) {
            return new zzlo(Objects.requireNonNull(this.zza[0]));
        }
        zzld zzldVarZzl = zzld.zzl(i2, this.zza);
        this.zzb = zzldVarZzl.size();
        this.zzc = true;
        return zzldVarZzl;
    }
}
