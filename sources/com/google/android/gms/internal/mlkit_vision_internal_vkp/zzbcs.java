package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzbcs {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i2, zzbcr zzbcrVar) throws zzbew {
        int iZzj = zzj(bArr, i2, zzbcrVar);
        int i3 = zzbcrVar.zza;
        if (i3 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iZzj) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            zzbcrVar.zzc = zzbdd.zzb;
            return iZzj;
        }
        zzbcrVar.zzc = zzbdd.zzo(bArr, iZzj, i3);
        return iZzj + i3;
    }

    static int zzb(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        int i4 = (-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255));
        byte b2 = bArr[i2 + 2];
        int i5 = (-1) - (((-1) - ((i4 << 8) | i3)) & ((-1) - (((b2 + 255) - (b2 | 255)) << 16)));
        int i6 = ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 24;
        return (i6 + i5) - (i6 & i5);
    }

    static int zzc(zzbgm zzbgmVar, byte[] bArr, int i2, int i3, int i4, zzbcr zzbcrVar) throws IOException {
        Object objZze = zzbgmVar.zze();
        int iZzn = zzn(objZze, zzbgmVar, bArr, i2, i3, i4, zzbcrVar);
        zzbgmVar.zzf(objZze);
        zzbcrVar.zzc = objZze;
        return iZzn;
    }

    static int zzd(zzbgm zzbgmVar, byte[] bArr, int i2, int i3, zzbcr zzbcrVar) throws IOException {
        Object objZze = zzbgmVar.zze();
        int iZzo = zzo(objZze, zzbgmVar, bArr, i2, i3, zzbcrVar);
        zzbgmVar.zzf(objZze);
        zzbcrVar.zzc = objZze;
        return iZzo;
    }

    static int zze(zzbgm zzbgmVar, int i2, byte[] bArr, int i3, int i4, zzbet zzbetVar, zzbcr zzbcrVar) throws IOException {
        int iZzd = zzd(zzbgmVar, bArr, i3, i4, zzbcrVar);
        zzbetVar.add(zzbcrVar.zzc);
        while (iZzd < i4) {
            int iZzj = zzj(bArr, iZzd, zzbcrVar);
            if (i2 != zzbcrVar.zza) {
                break;
            }
            iZzd = zzd(zzbgmVar, bArr, iZzj, i4, zzbcrVar);
            zzbetVar.add(zzbcrVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i2, zzbet zzbetVar, zzbcr zzbcrVar) throws IOException {
        zzbem zzbemVar = (zzbem) zzbetVar;
        int iZzj = zzj(bArr, i2, zzbcrVar);
        int i3 = zzbcrVar.zza + iZzj;
        while (iZzj < i3) {
            iZzj = zzj(bArr, iZzj, zzbcrVar);
            zzbemVar.zzg(zzbcrVar.zza);
        }
        if (iZzj == i3) {
            return iZzj;
        }
        throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i2, zzbcr zzbcrVar) throws zzbew {
        int iZzj = zzj(bArr, i2, zzbcrVar);
        int i3 = zzbcrVar.zza;
        if (i3 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            zzbcrVar.zzc = "";
            return iZzj;
        }
        zzbcrVar.zzc = new String(bArr, iZzj, i3, zzbeu.zza);
        return iZzj + i3;
    }

    static int zzh(byte[] bArr, int i2, zzbcr zzbcrVar) throws zzbew {
        int iZzj = zzj(bArr, i2, zzbcrVar);
        int i3 = zzbcrVar.zza;
        if (i3 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            zzbcrVar.zzc = "";
            return iZzj;
        }
        zzbcrVar.zzc = zzbhp.zzd(bArr, iZzj, i3);
        return iZzj + i3;
    }

    static int zzi(int i2, byte[] bArr, int i3, int i4, zzbhe zzbheVar, zzbcr zzbcrVar) throws zzbew {
        int iZzj = i3;
        if ((i2 >>> 3) == 0) {
            throw new zzbew("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i2 + 7) - (7 | i2);
        if (i5 == 0) {
            int iZzm = zzm(bArr, iZzj, zzbcrVar);
            zzbheVar.zzj(i2, Long.valueOf(zzbcrVar.zzb));
            return iZzm;
        }
        if (i5 == 1) {
            zzbheVar.zzj(i2, Long.valueOf(zzq(bArr, iZzj)));
            return iZzj + 8;
        }
        if (i5 == 2) {
            int iZzj2 = zzj(bArr, iZzj, zzbcrVar);
            int i6 = zzbcrVar.zza;
            if (i6 < 0) {
                throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - iZzj2) {
                throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                zzbheVar.zzj(i2, zzbdd.zzb);
            } else {
                zzbheVar.zzj(i2, zzbdd.zzo(bArr, iZzj2, i6));
            }
            return iZzj2 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzbew("Protocol message contained an invalid tag (zero).");
            }
            zzbheVar.zzj(i2, Integer.valueOf(zzb(bArr, iZzj)));
            return iZzj + 4;
        }
        int i7 = (-1) - (((-1) - ((i2 - 8) - ((-8) | i2))) & ((-1) - 4));
        zzbhe zzbheVarZzf = zzbhe.zzf();
        int i8 = zzbcrVar.zze + 1;
        zzbcrVar.zze = i8;
        zzr(i8);
        int i9 = 0;
        while (iZzj < i4) {
            iZzj = zzj(bArr, iZzj, zzbcrVar);
            i9 = zzbcrVar.zza;
            if (i9 == i7) {
                break;
            }
            iZzj = zzi(i9, bArr, iZzj, i4, zzbheVarZzf, zzbcrVar);
        }
        zzbcrVar.zze--;
        if (iZzj > i4 || i9 != i7) {
            throw new zzbew("Failed to parse the message.");
        }
        zzbheVar.zzj(i2, zzbheVarZzf);
        return iZzj;
    }

    static int zzj(byte[] bArr, int i2, zzbcr zzbcrVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzk(b2, bArr, i3, zzbcrVar);
        }
        zzbcrVar.zza = b2;
        return i3;
    }

    static int zzk(int i2, byte[] bArr, int i3, zzbcr zzbcrVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = (i2 + 127) - (i2 | 127);
        if (b2 >= 0) {
            zzbcrVar.zza = (-1) - (((-1) - i5) & ((-1) - (b2 << 7)));
            return i4;
        }
        int i6 = i5 | (((-1) - (((-1) - b2) | ((-1) - 127))) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            int i8 = b3 << Ascii.SO;
            zzbcrVar.zza = (i6 + i8) - (i6 & i8);
            return i7;
        }
        int i9 = i6 | (((b3 + 127) - (b3 | 127)) << 14);
        int i10 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzbcrVar.zza = (-1) - (((-1) - i9) & ((-1) - (b4 << Ascii.NAK)));
            return i10;
        }
        int i11 = i9 | (((b4 + 127) - (b4 | 127)) << 21);
        int i12 = i3 + 4;
        byte b5 = bArr[i10];
        if (b5 >= 0) {
            zzbcrVar.zza = i11 | (b5 << Ascii.FS);
            return i12;
        }
        int i13 = (-1) - (((-1) - i11) & ((-1) - (((b5 + 127) - (b5 | 127)) << 28)));
        while (true) {
            int i14 = i12 + 1;
            if (bArr[i12] >= 0) {
                zzbcrVar.zza = i13;
                return i14;
            }
            i12 = i14;
        }
    }

    static int zzl(int i2, byte[] bArr, int i3, int i4, zzbet zzbetVar, zzbcr zzbcrVar) {
        zzbem zzbemVar = (zzbem) zzbetVar;
        int iZzj = zzj(bArr, i3, zzbcrVar);
        zzbemVar.zzg(zzbcrVar.zza);
        while (iZzj < i4) {
            int iZzj2 = zzj(bArr, iZzj, zzbcrVar);
            if (i2 != zzbcrVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzbcrVar);
            zzbemVar.zzg(zzbcrVar.zza);
        }
        return iZzj;
    }

    static int zzm(byte[] bArr, int i2, zzbcr zzbcrVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzbcrVar.zzb = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = ((j2 + 127) - (j2 | 127)) | (((long) ((b2 + 127) - (127 | b2))) << 7);
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            long j4 = ((long) (127 & b2)) << i5;
            j3 = (j3 + j4) - (j3 & j4);
            i4++;
        }
        zzbcrVar.zzb = j3;
        return i4;
    }

    static int zzn(Object obj, zzbgm zzbgmVar, byte[] bArr, int i2, int i3, int i4, zzbcr zzbcrVar) throws IOException {
        int i5 = zzbcrVar.zze + 1;
        zzbcrVar.zze = i5;
        zzr(i5);
        int iZzc = ((zzbfv) zzbgmVar).zzc(obj, bArr, i2, i3, i4, zzbcrVar);
        zzbcrVar.zze--;
        zzbcrVar.zzc = obj;
        return iZzc;
    }

    static int zzo(Object obj, zzbgm zzbgmVar, byte[] bArr, int i2, int i3, zzbcr zzbcrVar) throws IOException {
        int iZzk = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZzk = zzk(i4, bArr, iZzk, zzbcrVar);
            i4 = zzbcrVar.zza;
        }
        if (i4 < 0 || i4 > i3 - iZzk) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = zzbcrVar.zze + 1;
        zzbcrVar.zze = i5;
        zzr(i5);
        int i6 = i4 + iZzk;
        zzbgmVar.zzi(obj, bArr, iZzk, i6, zzbcrVar);
        zzbcrVar.zze--;
        zzbcrVar.zzc = obj;
        return i6;
    }

    static int zzp(int i2, byte[] bArr, int i3, int i4, zzbcr zzbcrVar) throws zzbew {
        if ((i2 >>> 3) == 0) {
            throw new zzbew("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return zzm(bArr, i3, zzbcrVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zzj(bArr, i3, zzbcrVar) + zzbcrVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw new zzbew("Protocol message contained an invalid tag (zero).");
        }
        int i6 = (-1) - (((-1) - (i2 & (-8))) & ((-1) - 4));
        int i7 = 0;
        while (i3 < i4) {
            i3 = zzj(bArr, i3, zzbcrVar);
            i7 = zzbcrVar.zza;
            if (i7 == i6) {
                break;
            }
            i3 = zzp(i7, bArr, i3, i4, zzbcrVar);
        }
        if (i3 > i4 || i7 != i6) {
            throw new zzbew("Failed to parse the message.");
        }
        return i3;
    }

    static long zzq(byte[] bArr, int i2) {
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 1];
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        long j6 = bArr[i2 + 4];
        long j7 = (-1) - (((-1) - ((((j2 + 255) - (j2 | 255)) | ((j3 & 255) << 8)) | (((j4 + 255) - (j4 | 255)) << 16))) & ((-1) - (((j5 + 255) - (j5 | 255)) << 24)));
        long j8 = ((j6 + 255) - (j6 | 255)) << 32;
        return (-1) - (((-1) - (((-1) - (((-1) - ((j7 + j8) - (j7 & j8))) & ((-1) - (((-1) - (((-1) - bArr[i2 + 5]) | ((-1) - 255))) << 40)))) | ((((long) bArr[i2 + 6]) & 255) << 48))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56)));
    }

    private static void zzr(int i2) throws zzbew {
        if (i2 >= zzb) {
            throw new zzbew("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
