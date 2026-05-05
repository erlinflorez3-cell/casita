package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzwq implements zzbep {
    static final zzbep zza = new zzwq();

    private zzwq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbep
    public final boolean zza(int i2) {
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            switch (i2) {
                case 4:
                case 8:
                case 16:
                case 32:
                case 64:
                case 128:
                case 256:
                case 512:
                case 1024:
                case 2048:
                case 4096:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
