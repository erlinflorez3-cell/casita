package com.google.android.gms.internal.clearcut;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzax {
    static int zza(int i2, byte[] bArr, int i3, int i4, zzay zzayVar) throws zzco {
        if ((i2 >>> 3) == 0) {
            throw zzco.zzbm();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return zzb(bArr, i3, zzayVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zza(bArr, i3, zzayVar) + zzayVar.zzfd;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw zzco.zzbm();
        }
        int i6 = (-1) - (((-1) - i2) | ((-1) - (-8)));
        int i7 = (i6 + 4) - (i6 & 4);
        int i8 = 0;
        while (i3 < i4) {
            i3 = zza(bArr, i3, zzayVar);
            i8 = zzayVar.zzfd;
            if (i8 == i7) {
                break;
            }
            i3 = zza(i8, bArr, i3, i4, zzayVar);
        }
        if (i3 > i4 || i8 != i7) {
            throw zzco.zzbo();
        }
        return i3;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzcn<?> zzcnVar, zzay zzayVar) {
        zzch zzchVar = (zzch) zzcnVar;
        int iZza = zza(bArr, i3, zzayVar);
        while (true) {
            zzchVar.zzac(zzayVar.zzfd);
            if (iZza >= i4) {
                break;
            }
            int iZza2 = zza(bArr, iZza, zzayVar);
            if (i2 != zzayVar.zzfd) {
                break;
            }
            iZza = zza(bArr, iZza2, zzayVar);
        }
        return iZza;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzey zzeyVar, zzay zzayVar) throws IOException {
        int iZza = i3;
        if ((i2 >>> 3) == 0) {
            throw zzco.zzbm();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iZzb = zzb(bArr, iZza, zzayVar);
            zzeyVar.zzb(i2, Long.valueOf(zzayVar.zzfe));
            return iZzb;
        }
        if (i5 == 1) {
            zzeyVar.zzb(i2, Long.valueOf(zzd(bArr, iZza)));
            return iZza + 8;
        }
        if (i5 == 2) {
            int iZza2 = zza(bArr, iZza, zzayVar);
            int i6 = zzayVar.zzfd;
            zzeyVar.zzb(i2, i6 == 0 ? zzbb.zzfi : zzbb.zzb(bArr, iZza2, i6));
            return iZza2 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzco.zzbm();
            }
            zzeyVar.zzb(i2, Integer.valueOf(zzc(bArr, iZza)));
            return iZza + 4;
        }
        zzey zzeyVarZzeb = zzey.zzeb();
        int i7 = i2 & (-8);
        int i8 = (i7 + 4) - (i7 & 4);
        int i9 = 0;
        while (iZza < i4) {
            iZza = zza(bArr, iZza, zzayVar);
            i9 = zzayVar.zzfd;
            if (i9 == i8) {
                break;
            }
            iZza = zza(i9, bArr, iZza, i4, zzeyVarZzeb, zzayVar);
        }
        if (iZza > i4 || i9 != i8) {
            throw zzco.zzbo();
        }
        zzeyVar.zzb(i2, zzeyVarZzeb);
        return iZza;
    }

    static int zza(int i2, byte[] bArr, int i3, zzay zzayVar) {
        int i4;
        int i5 = i2 & 127;
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i4 = b2 << 7;
        } else {
            int i7 = i5 | (((b2 + 127) - (b2 | 127)) << 7);
            int i8 = i3 + 2;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                zzayVar.zzfd = i7 | (b3 << Ascii.SO);
                return i8;
            }
            i5 = (-1) - (((-1) - i7) & ((-1) - (((b3 + 127) - (b3 | 127)) << 14)));
            i6 = i3 + 3;
            byte b4 = bArr[i8];
            if (b4 >= 0) {
                i4 = b4 << Ascii.NAK;
            } else {
                int i9 = (-1) - (((-1) - i5) & ((-1) - ((b4 & 127) << 21)));
                int i10 = i3 + 4;
                byte b5 = bArr[i6];
                if (b5 >= 0) {
                    zzayVar.zzfd = i9 | (b5 << Ascii.FS);
                    return i10;
                }
                int i11 = ((-1) - (((-1) - b5) | ((-1) - 127))) << 28;
                int i12 = (i9 + i11) - (i9 & i11);
                while (true) {
                    int i13 = i10 + 1;
                    if (bArr[i10] >= 0) {
                        zzayVar.zzfd = i12;
                        return i13;
                    }
                    i10 = i13;
                }
            }
        }
        zzayVar.zzfd = (i5 + i4) - (i5 & i4);
        return i6;
    }

    static int zza(byte[] bArr, int i2, zzay zzayVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zza(b2, bArr, i3, zzayVar);
        }
        zzayVar.zzfd = b2;
        return i3;
    }

    static int zza(byte[] bArr, int i2, zzcn<?> zzcnVar, zzay zzayVar) throws IOException {
        zzch zzchVar = (zzch) zzcnVar;
        int iZza = zza(bArr, i2, zzayVar);
        int i3 = zzayVar.zzfd + iZza;
        while (iZza < i3) {
            iZza = zza(bArr, iZza, zzayVar);
            zzchVar.zzac(zzayVar.zzfd);
        }
        if (iZza == i3) {
            return iZza;
        }
        throw zzco.zzbl();
    }

    static int zzb(byte[] bArr, int i2, zzay zzayVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzayVar.zzfe = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (127 & b2)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            j3 |= ((long) ((b2 + 127) - (127 | b2))) << i5;
            i4++;
        }
        zzayVar.zzfe = j3;
        return i4;
    }

    static int zzc(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        int i3 = (-1) - (((-1) - ((b2 + 255) - (b2 | 255))) & ((-1) - ((bArr[i2 + 1] & 255) << 8)));
        byte b3 = bArr[i2 + 2];
        int i4 = ((b3 + 255) - (b3 | 255)) << 16;
        int i5 = (i3 + i4) - (i3 & i4);
        byte b4 = bArr[i2 + 3];
        return (-1) - (((-1) - (((b4 + 255) - (b4 | 255)) << 24)) & ((-1) - i5));
    }

    static int zzc(byte[] bArr, int i2, zzay zzayVar) {
        int iZza = zza(bArr, i2, zzayVar);
        int i3 = zzayVar.zzfd;
        if (i3 == 0) {
            zzayVar.zzff = "";
            return iZza;
        }
        zzayVar.zzff = new String(bArr, iZza, i3, zzci.UTF_8);
        return iZza + i3;
    }

    static int zzd(byte[] bArr, int i2, zzay zzayVar) throws IOException {
        int iZza = zza(bArr, i2, zzayVar);
        int i3 = zzayVar.zzfd;
        if (i3 == 0) {
            zzayVar.zzff = "";
            return iZza;
        }
        int i4 = iZza + i3;
        if (!zzff.zze(bArr, iZza, i4)) {
            throw zzco.zzbp();
        }
        zzayVar.zzff = new String(bArr, iZza, i3, zzci.UTF_8);
        return i4;
    }

    static long zzd(byte[] bArr, int i2) {
        long j2 = bArr[i2];
        long j3 = (-1) - (((-1) - ((j2 + 255) - (j2 | 255))) & ((-1) - ((((long) bArr[i2 + 1]) & 255) << 8)));
        long j4 = bArr[i2 + 2];
        long j5 = j3 | (((j4 + 255) - (j4 | 255)) << 16);
        long j6 = bArr[i2 + 3];
        long j7 = ((j6 + 255) - (j6 | 255)) << 24;
        long j8 = (j5 + j7) - (j5 & j7);
        long j9 = bArr[i2 + 4];
        long j10 = ((j9 + 255) - (j9 | 255)) << 32;
        long j11 = (j8 + j10) - (j8 & j10);
        long j12 = ((-1) - (((-1) - ((long) bArr[i2 + 5])) | ((-1) - 255))) << 40;
        long j13 = ((j11 + j12) - (j11 & j12)) | (((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 48);
        long j14 = bArr[i2 + 7];
        return (-1) - (((-1) - (((j14 + 255) - (j14 | 255)) << 56)) & ((-1) - j13));
    }

    static double zze(byte[] bArr, int i2) {
        return Double.longBitsToDouble(zzd(bArr, i2));
    }

    static int zze(byte[] bArr, int i2, zzay zzayVar) {
        int iZza = zza(bArr, i2, zzayVar);
        int i3 = zzayVar.zzfd;
        if (i3 == 0) {
            zzayVar.zzff = zzbb.zzfi;
            return iZza;
        }
        zzayVar.zzff = zzbb.zzb(bArr, iZza, i3);
        return iZza + i3;
    }

    static float zzf(byte[] bArr, int i2) {
        return Float.intBitsToFloat(zzc(bArr, i2));
    }
}
