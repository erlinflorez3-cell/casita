package com.google.android.gms.internal.gtm;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zztq {
    static int zza(byte[] bArr, int i2, zztp zztpVar) throws zzyg {
        int iZzi = zzi(bArr, i2, zztpVar);
        int i3 = zztpVar.zza;
        if (i3 < 0) {
            throw zzyg.zzf();
        }
        if (i3 > bArr.length - iZzi) {
            throw zzyg.zzj();
        }
        if (i3 == 0) {
            zztpVar.zzc = zzud.zzb;
            return iZzi;
        }
        zztpVar.zzc = zzud.zzl(bArr, iZzi, i3);
        return iZzi + i3;
    }

    static int zzb(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        int i4 = (-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255));
        int i5 = bArr[i2 + 2] & 255;
        byte b2 = bArr[i2 + 3];
        return (-1) - (((-1) - (((b2 + 255) - (b2 | 255)) << 24)) & ((-1) - (((i4 << 8) | i3) | (i5 << 16))));
    }

    static int zzc(zzzt zzztVar, byte[] bArr, int i2, int i3, int i4, zztp zztpVar) throws IOException {
        Object objZze = zzztVar.zze();
        int iZzm = zzm(objZze, zzztVar, bArr, i2, i3, i4, zztpVar);
        zzztVar.zzf(objZze);
        zztpVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(zzzt zzztVar, byte[] bArr, int i2, int i3, zztp zztpVar) throws IOException {
        Object objZze = zzztVar.zze();
        int iZzn = zzn(objZze, zzztVar, bArr, i2, i3, zztpVar);
        zzztVar.zzf(objZze);
        zztpVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzzt zzztVar, int i2, byte[] bArr, int i3, int i4, zzyd zzydVar, zztp zztpVar) throws IOException {
        int iZzd = zzd(zzztVar, bArr, i3, i4, zztpVar);
        zzydVar.add(zztpVar.zzc);
        while (iZzd < i4) {
            int iZzi = zzi(bArr, iZzd, zztpVar);
            if (i2 != zztpVar.zza) {
                break;
            }
            iZzd = zzd(zzztVar, bArr, iZzi, i4, zztpVar);
            zzydVar.add(zztpVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i2, zzyd zzydVar, zztp zztpVar) throws IOException {
        zzxw zzxwVar = (zzxw) zzydVar;
        int iZzi = zzi(bArr, i2, zztpVar);
        int i3 = zztpVar.zza + iZzi;
        while (iZzi < i3) {
            iZzi = zzi(bArr, iZzi, zztpVar);
            zzxwVar.zzh(zztpVar.zza);
        }
        if (iZzi == i3) {
            return iZzi;
        }
        throw zzyg.zzj();
    }

    static int zzg(byte[] bArr, int i2, zztp zztpVar) throws zzyg {
        int iZzi = zzi(bArr, i2, zztpVar);
        int i3 = zztpVar.zza;
        if (i3 < 0) {
            throw zzyg.zzf();
        }
        if (i3 == 0) {
            zztpVar.zzc = "";
            return iZzi;
        }
        zztpVar.zzc = new String(bArr, iZzi, i3, zzye.zzb);
        return iZzi + i3;
    }

    static int zzh(int i2, byte[] bArr, int i3, int i4, zzaal zzaalVar, zztp zztpVar) throws zzyg {
        int iZzi = i3;
        if ((i2 >>> 3) == 0) {
            throw zzyg.zzc();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iZzl = zzl(bArr, iZzi, zztpVar);
            zzaalVar.zzj(i2, Long.valueOf(zztpVar.zzb));
            return iZzl;
        }
        if (i5 == 1) {
            zzaalVar.zzj(i2, Long.valueOf(zzp(bArr, iZzi)));
            return iZzi + 8;
        }
        if (i5 == 2) {
            int iZzi2 = zzi(bArr, iZzi, zztpVar);
            int i6 = zztpVar.zza;
            if (i6 < 0) {
                throw zzyg.zzf();
            }
            if (i6 > bArr.length - iZzi2) {
                throw zzyg.zzj();
            }
            if (i6 == 0) {
                zzaalVar.zzj(i2, zzud.zzb);
            } else {
                zzaalVar.zzj(i2, zzud.zzl(bArr, iZzi2, i6));
            }
            return iZzi2 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzyg.zzc();
            }
            zzaalVar.zzj(i2, Integer.valueOf(zzb(bArr, iZzi)));
            return iZzi + 4;
        }
        int i7 = (-1) - (((-1) - ((i2 - 8) - ((-8) | i2))) & ((-1) - 4));
        zzaal zzaalVarZzf = zzaal.zzf();
        int i8 = 0;
        while (iZzi < i4) {
            iZzi = zzi(bArr, iZzi, zztpVar);
            i8 = zztpVar.zza;
            if (i8 == i7) {
                break;
            }
            iZzi = zzh(i8, bArr, iZzi, i4, zzaalVarZzf, zztpVar);
        }
        if (iZzi > i4 || i8 != i7) {
            throw zzyg.zzg();
        }
        zzaalVar.zzj(i2, zzaalVarZzf);
        return iZzi;
    }

    static int zzi(byte[] bArr, int i2, zztp zztpVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzj(b2, bArr, i3, zztpVar);
        }
        zztpVar.zza = b2;
        return i3;
    }

    static int zzj(int i2, byte[] bArr, int i3, zztp zztpVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = (i2 + 127) - (i2 | 127);
        if (b2 >= 0) {
            int i6 = b2 << 7;
            zztpVar.zza = (i5 + i6) - (i5 & i6);
            return i4;
        }
        int i7 = ((-1) - (((-1) - b2) | ((-1) - 127))) << 7;
        int i8 = (i5 + i7) - (i5 & i7);
        int i9 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            int i10 = b3 << Ascii.SO;
            zztpVar.zza = (i8 + i10) - (i8 & i10);
            return i9;
        }
        int i11 = i8 | (((-1) - (((-1) - b3) | ((-1) - 127))) << 14);
        int i12 = i3 + 3;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            int i13 = b4 << Ascii.NAK;
            zztpVar.zza = (i11 + i13) - (i11 & i13);
            return i12;
        }
        int i14 = (-1) - (((-1) - i11) & ((-1) - ((b4 & 127) << 21)));
        int i15 = i3 + 4;
        byte b5 = bArr[i12];
        if (b5 >= 0) {
            int i16 = b5 << Ascii.FS;
            zztpVar.zza = (i14 + i16) - (i14 & i16);
            return i15;
        }
        int i17 = (-1) - (((-1) - i14) & ((-1) - (((b5 + 127) - (b5 | 127)) << 28)));
        while (true) {
            int i18 = i15 + 1;
            if (bArr[i15] >= 0) {
                zztpVar.zza = i17;
                return i18;
            }
            i15 = i18;
        }
    }

    static int zzk(int i2, byte[] bArr, int i3, int i4, zzyd zzydVar, zztp zztpVar) {
        zzxw zzxwVar = (zzxw) zzydVar;
        int iZzi = zzi(bArr, i3, zztpVar);
        zzxwVar.zzh(zztpVar.zza);
        while (iZzi < i4) {
            int iZzi2 = zzi(bArr, iZzi, zztpVar);
            if (i2 != zztpVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zztpVar);
            zzxwVar.zzh(zztpVar.zza);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i2, zztp zztpVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zztpVar.zzb = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (-1) - (((-1) - ((-1) - (((-1) - j2) | ((-1) - 127)))) & ((-1) - (((long) (b2 & 127)) << 7)));
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            j3 |= ((long) ((-1) - (((-1) - b2) | ((-1) - 127)))) << i5;
            i4++;
        }
        zztpVar.zzb = j3;
        return i4;
    }

    static int zzm(Object obj, zzzt zzztVar, byte[] bArr, int i2, int i3, int i4, zztp zztpVar) throws IOException {
        int iZzc = ((zzzj) zzztVar).zzc(obj, bArr, i2, i3, i4, zztpVar);
        zztpVar.zzc = obj;
        return iZzc;
    }

    static int zzn(Object obj, zzzt zzztVar, byte[] bArr, int i2, int i3, zztp zztpVar) throws IOException {
        int iZzj = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZzj = zzj(i4, bArr, iZzj, zztpVar);
            i4 = zztpVar.zza;
        }
        if (i4 < 0 || i4 > i3 - iZzj) {
            throw zzyg.zzj();
        }
        int i5 = i4 + iZzj;
        zzztVar.zzi(obj, bArr, iZzj, i5, zztpVar);
        zztpVar.zzc = obj;
        return i5;
    }

    static int zzo(int i2, byte[] bArr, int i3, int i4, zztp zztpVar) throws zzyg {
        if ((i2 >>> 3) == 0) {
            throw zzyg.zzc();
        }
        int i5 = (i2 + 7) - (7 | i2);
        if (i5 == 0) {
            return zzl(bArr, i3, zztpVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zzi(bArr, i3, zztpVar) + zztpVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw zzyg.zzc();
        }
        int i6 = (-1) - (((-1) - (i2 & (-8))) & ((-1) - 4));
        int i7 = 0;
        while (i3 < i4) {
            i3 = zzi(bArr, i3, zztpVar);
            i7 = zztpVar.zza;
            if (i7 == i6) {
                break;
            }
            i3 = zzo(i7, bArr, i3, i4, zztpVar);
        }
        if (i3 > i4 || i7 != i6) {
            throw zzyg.zzg();
        }
        return i3;
    }

    static long zzp(byte[] bArr, int i2) {
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 1];
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        long j6 = bArr[i2 + 4];
        long j7 = (j6 + 255) - (j6 | 255);
        long j8 = (j2 + 255) - (j2 | 255);
        long j9 = (j3 & 255) << 8;
        long j10 = (-1) - (((-1) - ((-1) - (((-1) - ((j8 + j9) - (j8 & j9))) & ((-1) - (((-1) - (((-1) - j4) | ((-1) - 255))) << 16))))) & ((-1) - ((j5 & 255) << 24)));
        long j11 = j7 << 32;
        return ((j10 + j11) - (j10 & j11)) | ((((long) bArr[i2 + 5]) & 255) << 40) | (((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 48) | (((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56);
    }
}
