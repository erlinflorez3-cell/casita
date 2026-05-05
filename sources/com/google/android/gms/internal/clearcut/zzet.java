package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes8.dex */
final class zzet {
    static String zzc(zzbb zzbbVar) {
        String str;
        zzeu zzeuVar = new zzeu(zzbbVar);
        StringBuilder sb = new StringBuilder(zzeuVar.size());
        for (int i2 = 0; i2 < zzeuVar.size(); i2++) {
            int iZzj = zzeuVar.zzj(i2);
            if (iZzj == 34) {
                str = "\\\"";
            } else if (iZzj == 39) {
                str = "\\'";
            } else if (iZzj != 92) {
                switch (iZzj) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iZzj < 32 || iZzj > 126) {
                            sb.append('\\');
                            sb.append((char) (((-1) - (((-1) - (iZzj >>> 6)) | ((-1) - 3))) + 48));
                            int i3 = iZzj >>> 3;
                            sb.append((char) (((i3 + 7) - (i3 | 7)) + 48));
                            iZzj = ((-1) - (((-1) - iZzj) | ((-1) - 7))) + 48;
                        }
                        sb.append((char) iZzj);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
