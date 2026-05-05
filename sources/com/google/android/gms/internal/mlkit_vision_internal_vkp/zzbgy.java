package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzbgy {
    static String zza(zzbdd zzbddVar) {
        StringBuilder sb = new StringBuilder(zzbddVar.zzd());
        for (int i2 = 0; i2 < zzbddVar.zzd(); i2++) {
            byte bZza = zzbddVar.zza(i2);
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
                            int i3 = bZza >>> 6;
                            sb.append((char) (((i3 + 3) - (i3 | 3)) + 48));
                            sb.append((char) (((bZza >>> 3) & 7) + 48));
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
