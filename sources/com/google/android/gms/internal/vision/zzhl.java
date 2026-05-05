package com.google.android.gms.internal.vision;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzhl {
    static int zza(int i2, byte[] bArr, int i3, int i4, zzhn zzhnVar) throws zzjk {
        if ((i2 >>> 3) == 0) {
            throw zzjk.zzd();
        }
        int i5 = (-1) - (((-1) - i2) | ((-1) - 7));
        if (i5 == 0) {
            return zzb(bArr, i3, zzhnVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zza(bArr, i3, zzhnVar) + zzhnVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw zzjk.zzd();
        }
        int i6 = i2 & (-8);
        int i7 = (i6 + 4) - (i6 & 4);
        int i8 = 0;
        while (i3 < i4) {
            i3 = zza(bArr, i3, zzhnVar);
            i8 = zzhnVar.zza;
            if (i8 == i7) {
                break;
            }
            i3 = zza(i8, bArr, i3, i4, zzhnVar);
        }
        if (i3 > i4 || i8 != i7) {
            throw zzjk.zzg();
        }
        return i3;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzjl<?> zzjlVar, zzhn zzhnVar) {
        zzjd zzjdVar = (zzjd) zzjlVar;
        int iZza = zza(bArr, i3, zzhnVar);
        zzjdVar.zzc(zzhnVar.zza);
        while (iZza < i4) {
            int iZza2 = zza(bArr, iZza, zzhnVar);
            if (i2 != zzhnVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzhnVar);
            zzjdVar.zzc(zzhnVar.zza);
        }
        return iZza;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzlx zzlxVar, zzhn zzhnVar) throws zzjk {
        int iZza = i3;
        if ((i2 >>> 3) == 0) {
            throw zzjk.zzd();
        }
        int i5 = (i2 + 7) - (7 | i2);
        if (i5 == 0) {
            int iZzb = zzb(bArr, iZza, zzhnVar);
            zzlxVar.zza(i2, Long.valueOf(zzhnVar.zzb));
            return iZzb;
        }
        if (i5 == 1) {
            zzlxVar.zza(i2, Long.valueOf(zzb(bArr, iZza)));
            return iZza + 8;
        }
        if (i5 == 2) {
            int iZza2 = zza(bArr, iZza, zzhnVar);
            int i6 = zzhnVar.zza;
            if (i6 < 0) {
                throw zzjk.zzb();
            }
            if (i6 > bArr.length - iZza2) {
                throw zzjk.zza();
            }
            if (i6 == 0) {
                zzlxVar.zza(i2, zzht.zza);
            } else {
                zzlxVar.zza(i2, zzht.zza(bArr, iZza2, i6));
            }
            return iZza2 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzjk.zzd();
            }
            zzlxVar.zza(i2, Integer.valueOf(zza(bArr, iZza)));
            return iZza + 4;
        }
        zzlx zzlxVarZzb = zzlx.zzb();
        int i7 = (-1) - (((-1) - i2) | ((-1) - (-8)));
        int i8 = (i7 + 4) - (i7 & 4);
        int i9 = 0;
        while (iZza < i4) {
            iZza = zza(bArr, iZza, zzhnVar);
            i9 = zzhnVar.zza;
            if (i9 == i8) {
                break;
            }
            iZza = zza(i9, bArr, iZza, i4, zzlxVarZzb, zzhnVar);
        }
        if (iZza > i4 || i9 != i8) {
            throw zzjk.zzg();
        }
        zzlxVar.zza(i2, zzlxVarZzb);
        return iZza;
    }

    static int zza(int i2, byte[] bArr, int i3, zzhn zzhnVar) {
        int i4 = (-1) - (((-1) - i2) | ((-1) - 127));
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            int i6 = b2 << 7;
            zzhnVar.zza = (i4 + i6) - (i4 & i6);
            return i5;
        }
        int i7 = i4 | (((b2 + 127) - (b2 | 127)) << 7);
        int i8 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            zzhnVar.zza = i7 | (b3 << Ascii.SO);
            return i8;
        }
        int i9 = (-1) - (((-1) - i7) & ((-1) - ((b3 & 127) << 14)));
        int i10 = i3 + 3;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzhnVar.zza = (-1) - (((-1) - i9) & ((-1) - (b4 << Ascii.NAK)));
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 21);
        int i12 = i3 + 4;
        byte b5 = bArr[i10];
        if (b5 >= 0) {
            zzhnVar.zza = i11 | (b5 << Ascii.FS);
            return i12;
        }
        int i13 = (-1) - (((-1) - i11) & ((-1) - (((-1) - (((-1) - b5) | ((-1) - 127))) << 28)));
        while (true) {
            int i14 = i12 + 1;
            if (bArr[i12] >= 0) {
                zzhnVar.zza = i13;
                return i14;
            }
            i12 = i14;
        }
    }

    static int zza(zzlc<?> zzlcVar, int i2, byte[] bArr, int i3, int i4, zzjl<?> zzjlVar, zzhn zzhnVar) throws IOException {
        int iZza = zza(zzlcVar, bArr, i3, i4, zzhnVar);
        zzjlVar.add(zzhnVar.zzc);
        while (iZza < i4) {
            int iZza2 = zza(bArr, iZza, zzhnVar);
            if (i2 != zzhnVar.zza) {
                break;
            }
            iZza = zza(zzlcVar, bArr, iZza2, i4, zzhnVar);
            zzjlVar.add(zzhnVar.zzc);
        }
        return iZza;
    }

    static int zza(zzlc zzlcVar, byte[] bArr, int i2, int i3, int i4, zzhn zzhnVar) throws IOException {
        zzko zzkoVar = (zzko) zzlcVar;
        Object objZza = zzkoVar.zza();
        int iZza = zzkoVar.zza(objZza, bArr, i2, i3, i4, zzhnVar);
        zzkoVar.zzc(objZza);
        zzhnVar.zzc = objZza;
        return iZza;
    }

    static int zza(zzlc zzlcVar, byte[] bArr, int i2, int i3, zzhn zzhnVar) throws IOException {
        int iZza = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZza = zza(i4, bArr, iZza, zzhnVar);
            i4 = zzhnVar.zza;
        }
        if (i4 < 0 || i4 > i3 - iZza) {
            throw zzjk.zza();
        }
        Object objZza = zzlcVar.zza();
        int i5 = i4 + iZza;
        zzlcVar.zza(objZza, bArr, iZza, i5, zzhnVar);
        zzlcVar.zzc(objZza);
        zzhnVar.zzc = objZza;
        return i5;
    }

    static int zza(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        return (-1) - (((-1) - ((bArr[i2 + 3] & 255) << 24)) & ((-1) - ((-1) - (((-1) - (((b2 + 255) - (b2 | 255)) | (((b3 + 255) - (b3 | 255)) << 8))) & ((-1) - (((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16))))));
    }

    static int zza(byte[] bArr, int i2, zzhn zzhnVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zza(b2, bArr, i3, zzhnVar);
        }
        zzhnVar.zza = b2;
        return i3;
    }

    static int zza(byte[] bArr, int i2, zzjl<?> zzjlVar, zzhn zzhnVar) throws IOException {
        zzjd zzjdVar = (zzjd) zzjlVar;
        int iZza = zza(bArr, i2, zzhnVar);
        int i3 = zzhnVar.zza + iZza;
        while (iZza < i3) {
            iZza = zza(bArr, iZza, zzhnVar);
            zzjdVar.zzc(zzhnVar.zza);
        }
        if (iZza == i3) {
            return iZza;
        }
        throw zzjk.zza();
    }

    static int zzb(byte[] bArr, int i2, zzhn zzhnVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzhnVar.zzb = j2;
            return i3;
        }
        long j3 = j2 & 127;
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j4 = ((long) ((b2 + 127) - (127 | b2))) << 7;
        long j5 = (j3 + j4) - (j3 & j4);
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            long j6 = ((long) ((b2 + 127) - (127 | b2))) << i5;
            j5 = (j5 + j6) - (j5 & j6);
            i4++;
        }
        zzhnVar.zzb = j5;
        return i4;
    }

    static long zzb(byte[] bArr, int i2) {
        long j2 = (-1) - (((-1) - ((-1) - (((-1) - ((long) bArr[i2])) | ((-1) - 255)))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 1])) | ((-1) - 255))) << 8)));
        long j3 = bArr[i2 + 2];
        long j4 = bArr[i2 + 3];
        long j5 = ((-1) - (((-1) - (j2 | (((j3 + 255) - (j3 | 255)) << 16))) & ((-1) - (((j4 + 255) - (j4 | 255)) << 24)))) | (((-1) - (((-1) - ((long) bArr[i2 + 4])) | ((-1) - 255))) << 32);
        long j6 = (((long) bArr[i2 + 5]) & 255) << 40;
        long j7 = bArr[i2 + 6];
        long j8 = ((j5 + j6) - (j5 & j6)) | (((j7 + 255) - (j7 | 255)) << 48);
        long j9 = bArr[i2 + 7];
        return (-1) - (((-1) - (((j9 + 255) - (j9 | 255)) << 56)) & ((-1) - j8));
    }

    static double zzc(byte[] bArr, int i2) {
        return Double.longBitsToDouble(zzb(bArr, i2));
    }

    static int zzc(byte[] bArr, int i2, zzhn zzhnVar) throws zzjk {
        int iZza = zza(bArr, i2, zzhnVar);
        int i3 = zzhnVar.zza;
        if (i3 < 0) {
            throw zzjk.zzb();
        }
        if (i3 == 0) {
            zzhnVar.zzc = "";
            return iZza;
        }
        zzhnVar.zzc = new String(bArr, iZza, i3, zzjf.zza);
        return iZza + i3;
    }

    static float zzd(byte[] bArr, int i2) {
        return Float.intBitsToFloat(zza(bArr, i2));
    }

    static int zzd(byte[] bArr, int i2, zzhn zzhnVar) throws zzjk {
        int iZza = zza(bArr, i2, zzhnVar);
        int i3 = zzhnVar.zza;
        if (i3 < 0) {
            throw zzjk.zzb();
        }
        if (i3 == 0) {
            zzhnVar.zzc = "";
            return iZza;
        }
        zzhnVar.zzc = zzmd.zzb(bArr, iZza, i3);
        return iZza + i3;
    }

    static int zze(byte[] bArr, int i2, zzhn zzhnVar) throws zzjk {
        int iZza = zza(bArr, i2, zzhnVar);
        int i3 = zzhnVar.zza;
        if (i3 < 0) {
            throw zzjk.zzb();
        }
        if (i3 > bArr.length - iZza) {
            throw zzjk.zza();
        }
        if (i3 == 0) {
            zzhnVar.zzc = zzht.zza;
            return iZza;
        }
        zzhnVar.zzc = zzht.zza(bArr, iZza, i3);
        return iZza + i3;
    }
}
