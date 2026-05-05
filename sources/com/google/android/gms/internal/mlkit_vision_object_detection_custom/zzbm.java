package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
final class zzbm extends zzay {
    private final transient zzax zza;
    private final transient Object[] zzb;
    private final transient int zzc = 1;

    zzbm(zzax zzaxVar, Object[] objArr, int i2, int i3) {
        this.zza = zzaxVar;
        this.zzb = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzay, com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq
    final int zza(Object[] objArr, int i2) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzay, com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq
    /* JADX INFO: renamed from: zzd */
    public final zzbt iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzay
    final zzav zzg() {
        return new zzbl(this);
    }
}
