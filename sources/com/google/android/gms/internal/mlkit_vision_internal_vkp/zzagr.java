package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public enum zzagr implements zznp {
    DELEGATE_NONE(0),
    NNAPI(1),
    GPU(2),
    HEXAGON(3),
    EDGETPU(4),
    EDGETPU_CORAL(5),
    XNNPACK(6),
    CORE_ML(7),
    ARMNN(8),
    MTK_NEURON(9);

    private final int zzl;

    zzagr(int i2) {
        this.zzl = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zznp
    public final int zza() {
        return this.zzl;
    }
}
