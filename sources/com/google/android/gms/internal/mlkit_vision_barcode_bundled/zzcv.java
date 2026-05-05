package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzcv {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i2, zzcu zzcuVar) throws zzer {
        int iZzj = zzj(bArr, i2, zzcuVar);
        int i3 = zzcuVar.zza;
        if (i3 < 0) {
            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iZzj) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            zzcuVar.zzc = zzdf.zzb;
            return iZzj;
        }
        zzcuVar.zzc = zzdf.zzr(bArr, iZzj, i3);
        return iZzj + i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int zzb(int i2, byte[] bArr, int i3, int i4, zzed zzedVar, zzef zzefVar, zzgs zzgsVar, zzcu zzcuVar) throws IOException {
        int i5;
        int iZzm = i3;
        zzdx zzdxVar = zzedVar.zzb;
        zzhf zzhfVar = zzefVar.zzb.zzb;
        Object objValueOf = null;
        if (zzhfVar == zzhf.ENUM) {
            zzj(bArr, iZzm, zzcuVar);
            throw null;
        }
        switch (zzhfVar) {
            case DOUBLE:
                i5 = iZzm + 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(zzq(bArr, iZzm)));
                break;
            case FLOAT:
                i5 = iZzm + 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(zzc(bArr, iZzm)));
                break;
            case INT64:
            case UINT64:
                iZzm = zzm(bArr, iZzm, zzcuVar);
                objValueOf = Long.valueOf(zzcuVar.zzb);
                zzdxVar.zzi(zzefVar.zzb, objValueOf);
                return iZzm;
            case INT32:
            case UINT32:
                iZzm = zzj(bArr, iZzm, zzcuVar);
                objValueOf = Integer.valueOf(zzcuVar.zza);
                zzdxVar.zzi(zzefVar.zzb, objValueOf);
                return iZzm;
            case FIXED64:
            case SFIXED64:
                i5 = iZzm + 8;
                objValueOf = Long.valueOf(zzq(bArr, iZzm));
                break;
            case FIXED32:
            case SFIXED32:
                i5 = iZzm + 4;
                objValueOf = Integer.valueOf(zzc(bArr, iZzm));
                break;
            case BOOL:
                iZzm = zzm(bArr, iZzm, zzcuVar);
                objValueOf = Boolean.valueOf(zzcuVar.zzb != 0);
                zzdxVar.zzi(zzefVar.zzb, objValueOf);
                return iZzm;
            case STRING:
                iZzm = zzh(bArr, iZzm, zzcuVar);
                objValueOf = zzcuVar.zzc;
                zzdxVar.zzi(zzefVar.zzb, objValueOf);
                return iZzm;
            case GROUP:
                int i6 = ((i2 >>> 3) << 3) | 4;
                zzge zzgeVarZzb = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object objZze = zzdxVar.zze(zzefVar.zzb);
                if (objZze == null) {
                    objZze = zzgeVarZzb.zze();
                    zzdxVar.zzi(zzefVar.zzb, objZze);
                }
                return zzn(objZze, zzgeVarZzb, bArr, iZzm, i4, i6, zzcuVar);
            case MESSAGE:
                zzge zzgeVarZzb2 = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object objZze2 = zzdxVar.zze(zzefVar.zzb);
                if (objZze2 == null) {
                    objZze2 = zzgeVarZzb2.zze();
                    zzdxVar.zzi(zzefVar.zzb, objZze2);
                }
                return zzo(objZze2, zzgeVarZzb2, bArr, iZzm, i4, zzcuVar);
            case BYTES:
                iZzm = zza(bArr, iZzm, zzcuVar);
                objValueOf = zzcuVar.zzc;
                zzdxVar.zzi(zzefVar.zzb, objValueOf);
                return iZzm;
            case ENUM:
                throw new IllegalStateException("Shouldn't reach here.");
            case SINT32:
                iZzm = zzj(bArr, iZzm, zzcuVar);
                objValueOf = Integer.valueOf(zzdj.zzb(zzcuVar.zza));
                zzdxVar.zzi(zzefVar.zzb, objValueOf);
                return iZzm;
            case SINT64:
                iZzm = zzm(bArr, iZzm, zzcuVar);
                objValueOf = Long.valueOf(zzdj.zzc(zzcuVar.zzb));
                zzdxVar.zzi(zzefVar.zzb, objValueOf);
                return iZzm;
            default:
                zzdxVar.zzi(zzefVar.zzb, objValueOf);
                return iZzm;
        }
        iZzm = i5;
        zzdxVar.zzi(zzefVar.zzb, objValueOf);
        return iZzm;
    }

    static int zzc(byte[] bArr, int i2) {
        int i3 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
        byte b2 = bArr[i2 + 1];
        int i4 = (b2 + 255) - (b2 | 255);
        int i5 = bArr[i2 + 2] & 255;
        byte b3 = bArr[i2 + 3];
        int i6 = (b3 + 255) - (b3 | 255);
        int i7 = (i4 << 8) | i3;
        int i8 = i5 << 16;
        int i9 = (i7 + i8) - (i7 & i8);
        int i10 = i6 << 24;
        return (i10 + i9) - (i10 & i9);
    }

    static int zzd(zzge zzgeVar, byte[] bArr, int i2, int i3, int i4, zzcu zzcuVar) throws IOException {
        Object objZze = zzgeVar.zze();
        int iZzn = zzn(objZze, zzgeVar, bArr, i2, i3, i4, zzcuVar);
        zzgeVar.zzf(objZze);
        zzcuVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzge zzgeVar, byte[] bArr, int i2, int i3, zzcu zzcuVar) throws IOException {
        Object objZze = zzgeVar.zze();
        int iZzo = zzo(objZze, zzgeVar, bArr, i2, i3, zzcuVar);
        zzgeVar.zzf(objZze);
        zzcuVar.zzc = objZze;
        return iZzo;
    }

    static int zzf(zzge zzgeVar, int i2, byte[] bArr, int i3, int i4, zzeo zzeoVar, zzcu zzcuVar) throws IOException {
        int iZze = zze(zzgeVar, bArr, i3, i4, zzcuVar);
        zzeoVar.add(zzcuVar.zzc);
        while (iZze < i4) {
            int iZzj = zzj(bArr, iZze, zzcuVar);
            if (i2 != zzcuVar.zza) {
                break;
            }
            iZze = zze(zzgeVar, bArr, iZzj, i4, zzcuVar);
            zzeoVar.add(zzcuVar.zzc);
        }
        return iZze;
    }

    static int zzg(byte[] bArr, int i2, zzeo zzeoVar, zzcu zzcuVar) throws IOException {
        zzei zzeiVar = (zzei) zzeoVar;
        int iZzj = zzj(bArr, i2, zzcuVar);
        int i3 = zzcuVar.zza + iZzj;
        while (iZzj < i3) {
            iZzj = zzj(bArr, iZzj, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        if (iZzj == i3) {
            return iZzj;
        }
        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzh(byte[] bArr, int i2, zzcu zzcuVar) throws zzer {
        int iZzj = zzj(bArr, i2, zzcuVar);
        int i3 = zzcuVar.zza;
        if (i3 < 0) {
            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            zzcuVar.zzc = "";
            return iZzj;
        }
        zzcuVar.zzc = new String(bArr, iZzj, i3, zzep.zza);
        return iZzj + i3;
    }

    static int zzi(int i2, byte[] bArr, int i3, int i4, zzgt zzgtVar, zzcu zzcuVar) throws zzer {
        int iZzj = i3;
        if ((i2 >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (-1) - (((-1) - i2) | ((-1) - 7));
        if (i5 == 0) {
            int iZzm = zzm(bArr, iZzj, zzcuVar);
            zzgtVar.zzj(i2, Long.valueOf(zzcuVar.zzb));
            return iZzm;
        }
        if (i5 == 1) {
            zzgtVar.zzj(i2, Long.valueOf(zzq(bArr, iZzj)));
            return iZzj + 8;
        }
        if (i5 == 2) {
            int iZzj2 = zzj(bArr, iZzj, zzcuVar);
            int i6 = zzcuVar.zza;
            if (i6 < 0) {
                throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - iZzj2) {
                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                zzgtVar.zzj(i2, zzdf.zzb);
            } else {
                zzgtVar.zzj(i2, zzdf.zzr(bArr, iZzj2, i6));
            }
            return iZzj2 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzer("Protocol message contained an invalid tag (zero).");
            }
            zzgtVar.zzj(i2, Integer.valueOf(zzc(bArr, iZzj)));
            return iZzj + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzgt zzgtVarZzf = zzgt.zzf();
        int i8 = zzcuVar.zze + 1;
        zzcuVar.zze = i8;
        zzr(i8);
        int i9 = 0;
        while (iZzj < i4) {
            iZzj = zzj(bArr, iZzj, zzcuVar);
            i9 = zzcuVar.zza;
            if (i9 == i7) {
                break;
            }
            iZzj = zzi(i9, bArr, iZzj, i4, zzgtVarZzf, zzcuVar);
        }
        zzcuVar.zze--;
        if (iZzj > i4 || i9 != i7) {
            throw new zzer("Failed to parse the message.");
        }
        zzgtVar.zzj(i2, zzgtVarZzf);
        return iZzj;
    }

    static int zzj(byte[] bArr, int i2, zzcu zzcuVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzk(b2, bArr, i3, zzcuVar);
        }
        zzcuVar.zza = b2;
        return i3;
    }

    static int zzk(int i2, byte[] bArr, int i3, zzcu zzcuVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = (-1) - (((-1) - i2) | ((-1) - 127));
        if (b2 >= 0) {
            int i6 = b2 << 7;
            zzcuVar.zza = (i5 + i6) - (i5 & i6);
            return i4;
        }
        int i7 = (-1) - (((-1) - i5) & ((-1) - (((b2 + 127) - (b2 | 127)) << 7)));
        int i8 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            zzcuVar.zza = i7 | (b3 << Ascii.SO);
            return i8;
        }
        int i9 = ((b3 + 127) - (b3 | 127)) << 14;
        int i10 = (i7 + i9) - (i7 & i9);
        int i11 = i3 + 3;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            int i12 = b4 << Ascii.NAK;
            zzcuVar.zza = (i10 + i12) - (i10 & i12);
            return i11;
        }
        int i13 = ((b4 + 127) - (b4 | 127)) << 21;
        int i14 = (i10 + i13) - (i10 & i13);
        int i15 = i3 + 4;
        byte b5 = bArr[i11];
        if (b5 >= 0) {
            zzcuVar.zza = i14 | (b5 << Ascii.FS);
            return i15;
        }
        int i16 = (-1) - (((-1) - i14) & ((-1) - ((b5 & 127) << 28)));
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                zzcuVar.zza = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    static int zzl(int i2, byte[] bArr, int i3, int i4, zzeo zzeoVar, zzcu zzcuVar) {
        zzei zzeiVar = (zzei) zzeoVar;
        int iZzj = zzj(bArr, i3, zzcuVar);
        zzeiVar.zzg(zzcuVar.zza);
        while (iZzj < i4) {
            int iZzj2 = zzj(bArr, iZzj, zzcuVar);
            if (i2 != zzcuVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        return iZzj;
    }

    static int zzm(byte[] bArr, int i2, zzcu zzcuVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzcuVar.zzb = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (-1) - (((-1) - j2) | ((-1) - 127));
        long j4 = ((long) (b2 & 127)) << 7;
        long j5 = (j3 + j4) - (j3 & j4);
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            j5 = (-1) - (((-1) - j5) & ((-1) - (((long) (127 & b2)) << i5)));
            i4++;
        }
        zzcuVar.zzb = j5;
        return i4;
    }

    static int zzn(Object obj, zzge zzgeVar, byte[] bArr, int i2, int i3, int i4, zzcu zzcuVar) throws IOException {
        int i5 = zzcuVar.zze + 1;
        zzcuVar.zze = i5;
        zzr(i5);
        int iZzc = ((zzfp) zzgeVar).zzc(obj, bArr, i2, i3, i4, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return iZzc;
    }

    static int zzo(Object obj, zzge zzgeVar, byte[] bArr, int i2, int i3, zzcu zzcuVar) throws IOException {
        int iZzk = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZzk = zzk(i4, bArr, iZzk, zzcuVar);
            i4 = zzcuVar.zza;
        }
        if (i4 < 0 || i4 > i3 - iZzk) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = zzcuVar.zze + 1;
        zzcuVar.zze = i5;
        zzr(i5);
        int i6 = i4 + iZzk;
        zzgeVar.zzh(obj, bArr, iZzk, i6, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return i6;
    }

    static int zzp(int i2, byte[] bArr, int i3, int i4, zzcu zzcuVar) throws zzer {
        if ((i2 >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i2 + 7) - (7 | i2);
        if (i5 == 0) {
            return zzm(bArr, i3, zzcuVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zzj(bArr, i3, zzcuVar) + zzcuVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i6 = (-1) - (((-1) - i2) | ((-1) - (-8)));
        int i7 = (i6 + 4) - (i6 & 4);
        int i8 = 0;
        while (i3 < i4) {
            i3 = zzj(bArr, i3, zzcuVar);
            i8 = zzcuVar.zza;
            if (i8 == i7) {
                break;
            }
            i3 = zzp(i8, bArr, i3, i4, zzcuVar);
        }
        if (i3 > i4 || i8 != i7) {
            throw new zzer("Failed to parse the message.");
        }
        return i3;
    }

    static long zzq(byte[] bArr, int i2) {
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 1];
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        long j6 = bArr[i2 + 4];
        long j7 = (j4 + 255) - (j4 | 255);
        long j8 = (-1) - (((-1) - (j2 & 255)) & ((-1) - (((-1) - (((-1) - j3) | ((-1) - 255))) << 8)));
        long j9 = j7 << 16;
        long j10 = (-1) - (((-1) - ((j8 + j9) - (j8 & j9))) & ((-1) - (((j5 + 255) - (j5 | 255)) << 24)));
        long j11 = ((j6 + 255) - (j6 | 255)) << 32;
        return ((-1) - (((-1) - ((-1) - (((-1) - ((j10 + j11) - (j10 & j11))) & ((-1) - (((-1) - (((-1) - bArr[i2 + 5]) | ((-1) - 255))) << 40))))) & ((-1) - ((((long) bArr[i2 + 6]) & 255) << 48)))) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    private static void zzr(int i2) throws zzer {
        if (i2 >= zzb) {
            throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
