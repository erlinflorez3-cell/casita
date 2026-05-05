package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
final class zzgq {
    static String zza(zzdf zzdfVar) {
        StringBuilder sb = new StringBuilder(zzdfVar.zzd());
        for (int i2 = 0; i2 < zzdfVar.zzd(); i2++) {
            byte bZza = zzdfVar.zza(i2);
            if (bZza == 34) {
                sb.append("\\\"");
            } else if (bZza == 39) {
                sb.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZza >>> 6) & 3) + 48));
                            int i3 = bZza >>> 3;
                            sb.append((char) (((i3 + 7) - (i3 | 7)) + 48));
                            sb.append((char) (((-1) - (((-1) - bZza) | ((-1) - 7))) + 48));
                        } else {
                            sb.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
