package com.google.android.gms.internal.auth;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzdu {
    static int zza(byte[] bArr, int i2, zzdt zzdtVar) throws zzfb {
        int iZzh = zzh(bArr, i2, zzdtVar);
        int i3 = zzdtVar.zza;
        if (i3 < 0) {
            throw zzfb.zzc();
        }
        if (i3 > bArr.length - iZzh) {
            throw zzfb.zzf();
        }
        if (i3 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return iZzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, iZzh, i3);
        return iZzh + i3;
    }

    static int zzb(byte[] bArr, int i2) {
        int i3 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
        int i4 = bArr[i2 + 1] & 255;
        byte b2 = bArr[i2 + 2];
        int i5 = (b2 + 255) - (b2 | 255);
        int i6 = (i4 << 8) | i3 | (i5 << 16);
        int i7 = ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 24;
        return (i7 + i6) - (i7 & i6);
    }

    static int zzc(zzgi zzgiVar, byte[] bArr, int i2, int i3, int i4, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzl = zzl(objZzd, zzgiVar, bArr, i2, i3, i4, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzl;
    }

    static int zzd(zzgi zzgiVar, byte[] bArr, int i2, int i3, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzm = zzm(objZzd, zzgiVar, bArr, i2, i3, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzm;
    }

    static int zze(zzgi zzgiVar, int i2, byte[] bArr, int i3, int i4, zzez zzezVar, zzdt zzdtVar) throws IOException {
        int iZzd = zzd(zzgiVar, bArr, i3, i4, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (iZzd < i4) {
            int iZzh = zzh(bArr, iZzd, zzdtVar);
            if (i2 != zzdtVar.zza) {
                break;
            }
            iZzd = zzd(zzgiVar, bArr, iZzh, i4, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i2, zzez zzezVar, zzdt zzdtVar) throws IOException {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i2, zzdtVar);
        int i3 = zzdtVar.zza + iZzh;
        while (iZzh < i3) {
            iZzh = zzh(bArr, iZzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (iZzh == i3) {
            return iZzh;
        }
        throw zzfb.zzf();
    }

    static int zzg(int i2, byte[] bArr, int i3, int i4, zzha zzhaVar, zzdt zzdtVar) throws zzfb {
        int iZzh = i3;
        if ((i2 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i5 = (-1) - (((-1) - i2) | ((-1) - 7));
        if (i5 == 0) {
            int iZzk = zzk(bArr, iZzh, zzdtVar);
            zzhaVar.zzh(i2, Long.valueOf(zzdtVar.zzb));
            return iZzk;
        }
        if (i5 == 1) {
            zzhaVar.zzh(i2, Long.valueOf(zzn(bArr, iZzh)));
            return iZzh + 8;
        }
        if (i5 == 2) {
            int iZzh2 = zzh(bArr, iZzh, zzdtVar);
            int i6 = zzdtVar.zza;
            if (i6 < 0) {
                throw zzfb.zzc();
            }
            if (i6 > bArr.length - iZzh2) {
                throw zzfb.zzf();
            }
            if (i6 == 0) {
                zzhaVar.zzh(i2, zzef.zzb);
            } else {
                zzhaVar.zzh(i2, zzef.zzk(bArr, iZzh2, i6));
            }
            return iZzh2 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i2, Integer.valueOf(zzb(bArr, iZzh)));
            return iZzh + 4;
        }
        int i7 = ((i2 - 8) - ((-8) | i2)) | 4;
        zzha zzhaVarZzd = zzha.zzd();
        int i8 = 0;
        while (iZzh < i4) {
            iZzh = zzh(bArr, iZzh, zzdtVar);
            i8 = zzdtVar.zza;
            if (i8 == i7) {
                break;
            }
            iZzh = zzg(i8, bArr, iZzh, i4, zzhaVarZzd, zzdtVar);
        }
        if (iZzh > i4 || i8 != i7) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i2, zzhaVarZzd);
        return iZzh;
    }

    static int zzh(byte[] bArr, int i2, zzdt zzdtVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzi(b2, bArr, i3, zzdtVar);
        }
        zzdtVar.zza = b2;
        return i3;
    }

    static int zzi(int i2, byte[] bArr, int i3, zzdt zzdtVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = (i2 + 127) - (i2 | 127);
        if (b2 >= 0) {
            zzdtVar.zza = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & 127) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            int i8 = b3 << Ascii.SO;
            zzdtVar.zza = (i6 + i8) - (i6 & i8);
            return i7;
        }
        int i9 = ((-1) - (((-1) - b3) | ((-1) - 127))) << 14;
        int i10 = (i6 + i9) - (i6 & i9);
        int i11 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            int i12 = b4 << Ascii.NAK;
            zzdtVar.zza = (i10 + i12) - (i10 & i12);
            return i11;
        }
        int i13 = (-1) - (((-1) - i10) & ((-1) - (((b4 + 127) - (b4 | 127)) << 21)));
        int i14 = i3 + 4;
        byte b5 = bArr[i11];
        if (b5 >= 0) {
            zzdtVar.zza = (-1) - (((-1) - i13) & ((-1) - (b5 << Ascii.FS)));
            return i14;
        }
        int i15 = ((-1) - (((-1) - b5) | ((-1) - 127))) << 28;
        int i16 = (i13 + i15) - (i13 & i15);
        while (true) {
            int i17 = i14 + 1;
            if (bArr[i14] >= 0) {
                zzdtVar.zza = i16;
                return i17;
            }
            i14 = i17;
        }
    }

    static int zzj(int i2, byte[] bArr, int i3, int i4, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i3, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (iZzh < i4) {
            int iZzh2 = zzh(bArr, iZzh, zzdtVar);
            if (i2 != zzdtVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i2, zzdt zzdtVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzdtVar.zzb = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = ((-1) - (((-1) - j2) | ((-1) - 127))) | (((long) ((b2 + 127) - (127 | b2))) << 7);
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            long j4 = ((long) (127 & b2)) << i5;
            j3 = (j3 + j4) - (j3 & j4);
            i4++;
        }
        zzdtVar.zzb = j3;
        return i4;
    }

    static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i2, int i3, int i4, zzdt zzdtVar) throws IOException {
        int iZzb = ((zzga) zzgiVar).zzb(obj, bArr, i2, i3, i4, zzdtVar);
        zzdtVar.zzc = obj;
        return iZzb;
    }

    static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i2, int i3, zzdt zzdtVar) throws IOException {
        int iZzi = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZzi = zzi(i4, bArr, iZzi, zzdtVar);
            i4 = zzdtVar.zza;
        }
        if (i4 < 0 || i4 > i3 - iZzi) {
            throw zzfb.zzf();
        }
        int i5 = i4 + iZzi;
        zzgiVar.zzg(obj, bArr, iZzi, i5, zzdtVar);
        zzdtVar.zzc = obj;
        return i5;
    }

    static long zzn(byte[] bArr, int i2) {
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 1];
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        long j6 = bArr[i2 + 4];
        long j7 = bArr[i2 + 5];
        long j8 = (-1) - (((-1) - ((j2 + 255) - (j2 | 255))) & ((-1) - (((-1) - (((-1) - j3) | ((-1) - 255))) << 8)));
        long j9 = (j4 & 255) << 16;
        long j10 = ((-1) - (((-1) - ((-1) - (((-1) - (((j8 + j9) - (j8 & j9)) | (((-1) - (((-1) - j5) | ((-1) - 255))) << 24))) & ((-1) - ((j6 & 255) << 32))))) & ((-1) - (((j7 + 255) - (j7 | 255)) << 40)))) | ((((long) bArr[i2 + 6]) & 255) << 48);
        long j11 = (((long) bArr[i2 + 7]) & 255) << 56;
        return (j10 + j11) - (j10 & j11);
    }
}
