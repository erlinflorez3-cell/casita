package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzacq implements zzbep {
    static final zzbep zza = new zzacq();

    private zzacq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbep
    public final boolean zza(int i2) {
        if (i2 == 400 || i2 == 401 || i2 == 403 || i2 == 404 || i2 == 408 || i2 == 409 || i2 == 429 || i2 == 511 || i2 == 503 || i2 == 504) {
            return true;
        }
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            default:
                switch (i2) {
                    case 499:
                    case 500:
                    case 501:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
