package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzig {
    private static volatile int zza = 100;

    static double zza(byte[] bArr, int i2) {
        return Double.longBitsToDouble(zzd(bArr, i2));
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzij zzijVar) throws zzkb {
        if ((i2 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i5 = (i2 + 7) - (7 | i2);
        if (i5 == 0) {
            return zzd(bArr, i3, zzijVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zzc(bArr, i3, zzijVar) + zzijVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw zzkb.zzc();
        }
        int i6 = (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - (-8))))) & ((-1) - 4));
        int i7 = 0;
        while (i3 < i4) {
            i3 = zzc(bArr, i3, zzijVar);
            i7 = zzijVar.zza;
            if (i7 == i6) {
                break;
            }
            i3 = zza(i7, bArr, i3, i4, zzijVar);
        }
        if (i3 > i4 || i7 != i6) {
            throw zzkb.zzg();
        }
        return i3;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzkc<?> zzkcVar, zzij zzijVar) {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int iZzc = zzc(bArr, i3, zzijVar);
        zzjwVar.zzd(zzijVar.zza);
        while (iZzc < i4) {
            int iZzc2 = zzc(bArr, iZzc, zzijVar);
            if (i2 != zzijVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        return iZzc;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzmj zzmjVar, zzij zzijVar) throws zzkb {
        int iZzc = i3;
        if ((i2 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i5 = (-1) - (((-1) - i2) | ((-1) - 7));
        if (i5 == 0) {
            int iZzd = zzd(bArr, iZzc, zzijVar);
            zzmjVar.zza(i2, Long.valueOf(zzijVar.zzb));
            return iZzd;
        }
        if (i5 == 1) {
            zzmjVar.zza(i2, Long.valueOf(zzd(bArr, iZzc)));
            return iZzc + 8;
        }
        if (i5 == 2) {
            int iZzc2 = zzc(bArr, iZzc, zzijVar);
            int i6 = zzijVar.zza;
            if (i6 < 0) {
                throw zzkb.zzf();
            }
            if (i6 > bArr.length - iZzc2) {
                throw zzkb.zzi();
            }
            if (i6 == 0) {
                zzmjVar.zza(i2, zzik.zza);
            } else {
                zzmjVar.zza(i2, zzik.zza(bArr, iZzc2, i6));
            }
            return iZzc2 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzkb.zzc();
            }
            zzmjVar.zza(i2, Integer.valueOf(zzc(bArr, iZzc)));
            return iZzc + 4;
        }
        zzmj zzmjVarZzd = zzmj.zzd();
        int i7 = (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - (-8))))) & ((-1) - 4));
        zzijVar.zze++;
        zza(zzijVar.zze);
        int i8 = 0;
        while (iZzc < i4) {
            iZzc = zzc(bArr, iZzc, zzijVar);
            i8 = zzijVar.zza;
            if (i8 == i7) {
                break;
            }
            iZzc = zza(i8, bArr, iZzc, i4, zzmjVarZzd, zzijVar);
        }
        zzijVar.zze--;
        if (iZzc > i4 || i8 != i7) {
            throw zzkb.zzg();
        }
        zzmjVar.zza(i2, zzmjVarZzd);
        return iZzc;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, Object obj, zzlc zzlcVar, zzmk<zzmj, zzmj> zzmkVar, zzij zzijVar) throws IOException {
        if (zzijVar.zzd.zza(zzlcVar, i2 >>> 3) == null) {
            return zza(i2, bArr, i3, i4, zzlg.zzc(obj), zzijVar);
        }
        zzjt.zzd zzdVar = (zzjt.zzd) obj;
        zzdVar.zza();
        zzjm<zzjt.zzc> zzjmVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    static int zza(int i2, byte[] bArr, int i3, zzij zzijVar) {
        int i4 = (i2 + 127) - (i2 | 127);
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzijVar.zza = i4 | (b2 << 7);
            return i5;
        }
        int i6 = ((b2 + 127) - (b2 | 127)) << 7;
        int i7 = (i4 + i6) - (i4 & i6);
        int i8 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            zzijVar.zza = i7 | (b3 << Ascii.SO);
            return i8;
        }
        int i9 = (-1) - (((-1) - i7) & ((-1) - (((b3 + 127) - (b3 | 127)) << 14)));
        int i10 = i3 + 3;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzijVar.zza = i9 | (b4 << Ascii.NAK);
            return i10;
        }
        int i11 = (b4 & 127) << 21;
        int i12 = (i9 + i11) - (i9 & i11);
        int i13 = i3 + 4;
        byte b5 = bArr[i10];
        if (b5 >= 0) {
            int i14 = b5 << Ascii.FS;
            zzijVar.zza = (i12 + i14) - (i12 & i14);
            return i13;
        }
        int i15 = ((b5 + 127) - (b5 | 127)) << 28;
        int i16 = (i12 + i15) - (i12 & i15);
        while (true) {
            int i17 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzijVar.zza = i16;
                return i17;
            }
            i13 = i17;
        }
    }

    static int zza(zzlu zzluVar, int i2, byte[] bArr, int i3, int i4, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int i5 = (-1) - (((-1) - ((i2 - 8) - ((-8) | i2))) & ((-1) - 4));
        int iZza = zza(zzluVar, bArr, i3, i4, i5, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (iZza < i4) {
            int iZzc = zzc(bArr, iZza, zzijVar);
            if (i2 != zzijVar.zza) {
                break;
            }
            iZza = zza(zzluVar, bArr, iZzc, i4, i5, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return iZza;
    }

    private static int zza(zzlu zzluVar, byte[] bArr, int i2, int i3, int i4, zzij zzijVar) throws IOException {
        Object objZza = zzluVar.zza();
        int iZza = zza(objZza, zzluVar, bArr, i2, i3, i4, zzijVar);
        zzluVar.zzd(objZza);
        zzijVar.zzc = objZza;
        return iZza;
    }

    static int zza(zzlu zzluVar, byte[] bArr, int i2, int i3, zzij zzijVar) throws IOException {
        Object objZza = zzluVar.zza();
        int iZza = zza(objZza, zzluVar, bArr, i2, i3, zzijVar);
        zzluVar.zzd(objZza);
        zzijVar.zzc = objZza;
        return iZza;
    }

    static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i2, int i3, int i4, zzij zzijVar) throws IOException {
        zzijVar.zze++;
        zza(zzijVar.zze);
        int iZza = ((zzlg) zzluVar).zza(obj, bArr, i2, i3, i4, zzijVar);
        zzijVar.zze--;
        zzijVar.zzc = obj;
        return iZza;
    }

    static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i2, int i3, zzij zzijVar) throws IOException {
        int iZza = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZza = zza(i4, bArr, iZza, zzijVar);
            i4 = zzijVar.zza;
        }
        if (i4 < 0 || i4 > i3 - iZza) {
            throw zzkb.zzi();
        }
        zzijVar.zze++;
        zza(zzijVar.zze);
        int i5 = i4 + iZza;
        zzluVar.zza(obj, bArr, iZza, i5, zzijVar);
        zzijVar.zze--;
        zzijVar.zzc = obj;
        return i5;
    }

    static int zza(byte[] bArr, int i2, zzij zzijVar) throws zzkb {
        int iZzc = zzc(bArr, i2, zzijVar);
        int i3 = zzijVar.zza;
        if (i3 < 0) {
            throw zzkb.zzf();
        }
        if (i3 > bArr.length - iZzc) {
            throw zzkb.zzi();
        }
        if (i3 == 0) {
            zzijVar.zzc = zzik.zza;
            return iZzc;
        }
        zzijVar.zzc = zzik.zza(bArr, iZzc, i3);
        return iZzc + i3;
    }

    static int zza(byte[] bArr, int i2, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int iZzc = zzc(bArr, i2, zzijVar);
        int i3 = zzijVar.zza + iZzc;
        while (iZzc < i3) {
            iZzc = zzc(bArr, iZzc, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        if (iZzc == i3) {
            return iZzc;
        }
        throw zzkb.zzi();
    }

    private static void zza(int i2) throws zzkb {
        if (i2 >= zza) {
            throw zzkb.zzh();
        }
    }

    static float zzb(byte[] bArr, int i2) {
        return Float.intBitsToFloat(zzc(bArr, i2));
    }

    static int zzb(zzlu<?> zzluVar, int i2, byte[] bArr, int i3, int i4, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int iZza = zza(zzluVar, bArr, i3, i4, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (iZza < i4) {
            int iZzc = zzc(bArr, iZza, zzijVar);
            if (i2 != zzijVar.zza) {
                break;
            }
            iZza = zza(zzluVar, bArr, iZzc, i4, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return iZza;
    }

    static int zzb(byte[] bArr, int i2, zzij zzijVar) throws zzkb {
        int iZzc = zzc(bArr, i2, zzijVar);
        int i3 = zzijVar.zza;
        if (i3 < 0) {
            throw zzkb.zzf();
        }
        if (i3 == 0) {
            zzijVar.zzc = "";
            return iZzc;
        }
        zzijVar.zzc = zzmp.zzb(bArr, iZzc, i3);
        return iZzc + i3;
    }

    static int zzc(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        int i3 = ((b2 + 255) - (b2 | 255)) | ((bArr[i2 + 1] & 255) << 8);
        int i4 = ((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16;
        int i5 = (i3 + i4) - (i3 & i4);
        byte b3 = bArr[i2 + 3];
        return (((b3 + 255) - (b3 | 255)) << 24) | i5;
    }

    static int zzc(byte[] bArr, int i2, zzij zzijVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zza(b2, bArr, i3, zzijVar);
        }
        zzijVar.zza = b2;
        return i3;
    }

    static int zzd(byte[] bArr, int i2, zzij zzijVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzijVar.zzb = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (-1) - (((-1) - (j2 & 127)) & ((-1) - (((long) ((-1) - (((-1) - b2) | ((-1) - 127)))) << 7)));
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            long j4 = ((long) (127 & b2)) << i5;
            j3 = (j3 + j4) - (j3 & j4);
            i4++;
        }
        zzijVar.zzb = j3;
        return i4;
    }

    static long zzd(byte[] bArr, int i2) {
        long j2 = bArr[i2];
        long j3 = (j2 + 255) - (j2 | 255);
        long j4 = bArr[i2 + 1];
        long j5 = (-1) - (((-1) - ((-1) - (((-1) - j3) & ((-1) - (((j4 + 255) - (j4 | 255)) << 8))))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 2])) | ((-1) - 255))) << 16)));
        long j6 = ((-1) - (((-1) - ((long) bArr[i2 + 3])) | ((-1) - 255))) << 24;
        long j7 = (-1) - (((-1) - ((j5 + j6) - (j5 & j6))) & ((-1) - ((((long) bArr[i2 + 4]) & 255) << 32)));
        long j8 = bArr[i2 + 5];
        long j9 = ((-1) - (((-1) - j7) & ((-1) - (((j8 + 255) - (j8 | 255)) << 40)))) | (((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 48);
        long j10 = (((long) bArr[i2 + 7]) & 255) << 56;
        return (j10 + j9) - (j10 & j9);
    }
}
