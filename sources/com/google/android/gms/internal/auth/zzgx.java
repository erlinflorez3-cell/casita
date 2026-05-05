package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes8.dex */
final class zzgx {
    static String zza(zzef zzefVar) {
        StringBuilder sb = new StringBuilder(zzefVar.zzd());
        for (int i2 = 0; i2 < zzefVar.zzd(); i2++) {
            byte bZza = zzefVar.zza(i2);
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
                            int i4 = bZza >>> 3;
                            sb.append((char) (((i4 + 7) - (i4 | 7)) + 48));
                            sb.append((char) (((bZza + 7) - (bZza | 7)) + 48));
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
