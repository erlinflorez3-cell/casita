package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzay extends zzaq implements Set {

    @CheckForNull
    private transient zzav zza;

    zzay() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzbr.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzbt iterator();

    public final zzav zzf() {
        zzav zzavVar = this.zza;
        if (zzavVar != null) {
            return zzavVar;
        }
        zzav zzavVarZzg = zzg();
        this.zza = zzavVarZzg;
        return zzavVarZzg;
    }

    zzav zzg() {
        Object[] array = toArray();
        int i2 = zzav.zzd;
        return zzav.zzg(array, array.length);
    }
}
