package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
final class zzbn extends zzay {
    private final transient zzax zza;
    private final transient zzav zzb;

    zzbn(zzax zzaxVar, zzav zzavVar) {
        this.zza = zzaxVar;
        this.zzb = zzavVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzay, com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq
    final int zza(Object[] objArr, int i2) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzay, com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq
    /* JADX INFO: renamed from: zzd */
    public final zzbt iterator() {
        return this.zzb.listIterator(0);
    }
}
