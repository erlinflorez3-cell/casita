package com.google.mlkit.vision.common;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Triangle<T> {
    private final zzp zza;

    public Triangle(T t2, T t3, T t4) {
        this.zza = zzp.zzj(t2, t3, t4);
    }

    public List<T> getAllPoints() {
        return this.zza;
    }
}
