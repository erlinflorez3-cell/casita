package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzaai {
    static String zza(zzud zzudVar) {
        StringBuilder sb = new StringBuilder(zzudVar.zzd());
        for (int i2 = 0; i2 < zzudVar.zzd(); i2++) {
            byte bZza = zzudVar.zza(i2);
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
                            sb.append((char) (((-1) - (((-1) - (bZza >>> 3)) | ((-1) - 7))) + 48));
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
