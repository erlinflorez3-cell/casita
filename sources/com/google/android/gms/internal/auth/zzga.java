package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i2, int i3, zzfx zzfxVar, int i4, boolean z2, int[] iArr2, int i5, int i6, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzh = iArr2;
        this.zzi = i5;
        this.zzj = i6;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i2, int i3) {
        int iZzl = zzl(i3);
        zzhj.zzn(obj, (iZzl + 1048575) - (iZzl | 1048575), i2);
    }

    private final void zzB(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, (-1) - (((-1) - zzo(i2)) | ((-1) - 1048575)), obj2);
        zzz(obj, i2);
    }

    private final void zzC(Object obj, int i2, int i3, Object obj2) {
        Unsafe unsafe = zzb;
        int iZzo = zzo(i3);
        unsafe.putObject(obj, (iZzo + 1048575) - (iZzo | 1048575), obj2);
        zzA(obj, i2, i3);
    }

    private final boolean zzD(Object obj, Object obj2, int i2) {
        return zzE(obj, i2) == zzE(obj2, i2);
    }

    private final boolean zzE(Object obj, int i2) {
        int iZzl = zzl(i2);
        long j2 = (iZzl + 1048575) - (iZzl | 1048575);
        if (j2 != 1048575) {
            return (-1) - (((-1) - zzhj.zzc(obj, j2)) | ((-1) - (1 << (iZzl >>> 20)))) != 0;
        }
        int iZzo = zzo(i2);
        long j3 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j3)) != 0;
            case 2:
                return zzhj.zzd(obj, j3) != 0;
            case 3:
                return zzhj.zzd(obj, j3) != 0;
            case 4:
                return zzhj.zzc(obj, j3) != 0;
            case 5:
                return zzhj.zzd(obj, j3) != 0;
            case 6:
                return zzhj.zzc(obj, j3) != 0;
            case 7:
                return zzhj.zzt(obj, j3);
            case 8:
                Object objZzf = zzhj.zzf(obj, j3);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j3) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j3));
            case 11:
                return zzhj.zzc(obj, j3) != 0;
            case 12:
                return zzhj.zzc(obj, j3) != 0;
            case 13:
                return zzhj.zzc(obj, j3) != 0;
            case 14:
                return zzhj.zzd(obj, j3) != 0;
            case 15:
                return zzhj.zzc(obj, j3) != 0;
            case 16:
                return zzhj.zzd(obj, j3) != 0;
            case 17:
                return zzhj.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzE(obj, i2) : (i4 & i5) != 0;
    }

    private static boolean zzG(Object obj, int i2, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, (i2 + 1048575) - (i2 | 1048575)));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i2, int i3) {
        return zzhj.zzc(obj, (long) (zzl(i3) & 1048575)) == i2;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:331:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.auth.zzga zzj(java.lang.Class r29, com.google.android.gms.internal.auth.zzfu r30, com.google.android.gms.internal.auth.zzgc r31, com.google.android.gms.internal.auth.zzfl r32, com.google.android.gms.internal.auth.zzgz r33, com.google.android.gms.internal.auth.zzem r34, com.google.android.gms.internal.auth.zzfs r35) {
        /*
            Method dump skipped, instruction units count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzj(java.lang.Class, com.google.android.gms.internal.auth.zzfu, com.google.android.gms.internal.auth.zzgc, com.google.android.gms.internal.auth.zzfl, com.google.android.gms.internal.auth.zzgz, com.google.android.gms.internal.auth.zzem, com.google.android.gms.internal.auth.zzfs):com.google.android.gms.internal.auth.zzga");
    }

    private static int zzk(Object obj, long j2) {
        return ((Integer) zzhj.zzf(obj, j2)).intValue();
    }

    private final int zzl(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzm(int i2, int i3) {
        int length = (this.zzc.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.zzc[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i2) {
        return (-1) - (((-1) - (i2 >>> 20)) | ((-1) - 255));
    }

    private final int zzo(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzp(Object obj, long j2) {
        return ((Long) zzhj.zzf(obj, j2)).longValue();
    }

    private final zzey zzq(int i2) {
        int i3 = i2 / 3;
        return (zzey) this.zzd[i3 + i3 + 1];
    }

    private final zzgi zzr(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzgi zzgiVar = (zzgi) this.zzd[i4];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private final Object zzt(Object obj, int i2) {
        zzgi zzgiVarZzr = zzr(i2);
        int iZzo = zzo(i2) & 1048575;
        if (!zzE(obj, i2)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i2, int i3) {
        zzgi zzgiVarZzr = zzr(i3);
        if (!zzI(obj, i2, i3)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i3) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzx(Object obj, Object obj2, int i2) {
        if (zzE(obj2, i2)) {
            int iZzo = (-1) - (((-1) - zzo(i2)) | ((-1) - 1048575));
            Unsafe unsafe = zzb;
            long j2 = iZzo;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i2);
            if (!zzE(obj, i2)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j2, objZzd);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzz(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j2, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzI(obj2, i3, i2)) {
            int iZzo = zzo(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = iZzo;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i2);
            if (!zzI(obj, i3, i2)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j2, objZzd);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzA(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j2, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i2) {
        int iZzl = zzl(i2);
        long j2 = 1048575 & iZzl;
        if (j2 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j2, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i2;
        int iHashCode;
        long jZzp;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzo = zzo(i4);
            int i5 = this.zzc[i4];
            long j2 = 1048575 & iZzo;
            int iHashCode2 = 37;
            switch (zzn(iZzo)) {
                case 0:
                    i2 = i3 * 53;
                    jZzp = Double.doubleToLongBits(zzhj.zza(obj, j2));
                    byte[] bArr = zzfa.zzd;
                    iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                    i3 = i2 + iHashCode;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iHashCode = Float.floatToIntBits(zzhj.zzb(obj, j2));
                    i3 = i2 + iHashCode;
                    break;
                case 2:
                    i2 = i3 * 53;
                    jZzp = zzhj.zzd(obj, j2);
                    byte[] bArr2 = zzfa.zzd;
                    iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                    i3 = i2 + iHashCode;
                    break;
                case 3:
                    i2 = i3 * 53;
                    jZzp = zzhj.zzd(obj, j2);
                    byte[] bArr3 = zzfa.zzd;
                    iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                    i3 = i2 + iHashCode;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iHashCode = zzhj.zzc(obj, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 5:
                    i2 = i3 * 53;
                    jZzp = zzhj.zzd(obj, j2);
                    byte[] bArr4 = zzfa.zzd;
                    iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                    i3 = i2 + iHashCode;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iHashCode = zzhj.zzc(obj, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iHashCode = zzfa.zza(zzhj.zzt(obj, j2));
                    i3 = i2 + iHashCode;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iHashCode = ((String) zzhj.zzf(obj, j2)).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 9:
                    Object objZzf = zzhj.zzf(obj, j2);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode2;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iHashCode = zzhj.zzf(obj, j2).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iHashCode = zzhj.zzc(obj, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iHashCode = zzhj.zzc(obj, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iHashCode = zzhj.zzc(obj, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 14:
                    i2 = i3 * 53;
                    jZzp = zzhj.zzd(obj, j2);
                    byte[] bArr5 = zzfa.zzd;
                    iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                    i3 = i2 + iHashCode;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iHashCode = zzhj.zzc(obj, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 16:
                    i2 = i3 * 53;
                    jZzp = zzhj.zzd(obj, j2);
                    byte[] bArr6 = zzfa.zzd;
                    iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                    i3 = i2 + iHashCode;
                    break;
                case 17:
                    Object objZzf2 = zzhj.zzf(obj, j2);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    iHashCode = zzhj.zzf(obj, j2).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iHashCode = zzhj.zzf(obj, j2).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 51:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jZzp = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j2)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 52:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Float.floatToIntBits(((Float) zzhj.zzf(obj, j2)).floatValue());
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 53:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jZzp = zzp(obj, j2);
                        byte[] bArr8 = zzfa.zzd;
                        iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 54:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jZzp = zzp(obj, j2);
                        byte[] bArr9 = zzfa.zzd;
                        iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 55:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzk(obj, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 56:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jZzp = zzp(obj, j2);
                        byte[] bArr10 = zzfa.zzd;
                        iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 57:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzk(obj, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 58:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzfa.zza(((Boolean) zzhj.zzf(obj, j2)).booleanValue());
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 59:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = ((String) zzhj.zzf(obj, j2)).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 60:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzhj.zzf(obj, j2).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 61:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzhj.zzf(obj, j2).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 62:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzk(obj, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 63:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzk(obj, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 64:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzk(obj, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 65:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jZzp = zzp(obj, j2);
                        byte[] bArr11 = zzfa.zzd;
                        iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 66:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzk(obj, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 67:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        jZzp = zzp(obj, j2);
                        byte[] bArr12 = zzfa.zzd;
                        iHashCode = (int) (jZzp ^ (jZzp >>> 32));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 68:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzhj.zzf(obj, j2).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
            }
        }
        return (i3 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:1284:0x0ae7, code lost:
    
        if (r20 == 1048575) goto L1286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1285:0x0ae9, code lost:
    
        r18.putInt(r39, r20, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1286:0x0af7, code lost:
    
        r5 = r11.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1288:0x0afb, code lost:
    
        if (r5 >= r11.zzj) goto L1404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1289:0x0afd, code lost:
    
        r3 = r11.zzh[r5];
        r0 = r11.zzc[r3];
        r2 = r11.zzo(r3);
        r1 = com.google.android.gms.internal.auth.zzhj.zzf(r39, (r2 + 1048575) - (r2 | 1048575));
     */
    /* JADX WARN: Code restructure failed: missing block: B:1290:0x0b15, code lost:
    
        if (r1 != null) goto L1292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1291:0x0b17, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1293:0x0b1e, code lost:
    
        if (r11.zzq(r3) != null) goto L1405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1295:0x0b21, code lost:
    
        r1 = (com.google.android.gms.internal.auth.zzfr) r1;
        r0 = (com.google.android.gms.internal.auth.zzfq) r11.zzs(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1296:0x0b29, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1297:0x0b2a, code lost:
    
        if (r4 != 0) goto L1301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1299:0x0b2e, code lost:
    
        if (r7 != r30) goto L1305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1300:0x0b30, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1302:0x0b33, code lost:
    
        if (r7 > r30) goto L1307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1303:0x0b35, code lost:
    
        if (r15 != r4) goto L1307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1306:0x0b3c, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1308:0x0b41, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Removed duplicated region for block: B:1136:0x0803 A[PHI: r3 r11
  0x0803: PHI (r3v153 int) = 
  (r3v58 int)
  (r3v66 int)
  (r3v76 int)
  (r3v101 int)
  (r3v146 int)
  (r3v150 int)
  (r3v151 int)
  (r3v152 int)
  (r3v156 int)
 binds: [B:1135:0x0802, B:1119:0x07b7, B:1104:0x0769, B:1074:0x06d9, B:1048:0x066f, B:942:0x04af, B:928:0x0467, B:913:0x041a, B:896:0x03b9] A[DONT_GENERATE, DONT_INLINE]
  0x0803: PHI (r11v12 com.google.android.gms.internal.auth.zzga<T>) = 
  (r11v1 com.google.android.gms.internal.auth.zzga<T>)
  (r11v1 com.google.android.gms.internal.auth.zzga<T>)
  (r11v5 com.google.android.gms.internal.auth.zzga<T>)
  (r11v10 com.google.android.gms.internal.auth.zzga<T>)
  (r11v1 com.google.android.gms.internal.auth.zzga<T>)
  (r11v1 com.google.android.gms.internal.auth.zzga<T>)
  (r11v1 com.google.android.gms.internal.auth.zzga<T>)
  (r11v1 com.google.android.gms.internal.auth.zzga<T>)
  (r11v1 com.google.android.gms.internal.auth.zzga<T>)
 binds: [B:1135:0x0802, B:1119:0x07b7, B:1104:0x0769, B:1074:0x06d9, B:1048:0x066f, B:942:0x04af, B:928:0x0467, B:913:0x041a, B:896:0x03b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1155:0x085f A[PHI: r0 r30
  0x085f: PHI (r0v62 com.google.android.gms.internal.auth.zzdt) = 
  (r0v1 com.google.android.gms.internal.auth.zzdt)
  (r0v57 com.google.android.gms.internal.auth.zzdt)
  (r0v1 com.google.android.gms.internal.auth.zzdt)
  (r0v1 com.google.android.gms.internal.auth.zzdt)
  (r0v1 com.google.android.gms.internal.auth.zzdt)
  (r0v1 com.google.android.gms.internal.auth.zzdt)
  (r0v1 com.google.android.gms.internal.auth.zzdt)
  (r0v1 com.google.android.gms.internal.auth.zzdt)
  (r0v1 com.google.android.gms.internal.auth.zzdt)
  (r0v1 com.google.android.gms.internal.auth.zzdt)
  (r0v1 com.google.android.gms.internal.auth.zzdt)
 binds: [B:1214:0x09f7, B:1198:0x0984, B:1184:0x091c, B:1177:0x08fa, B:1174:0x08e4, B:1171:0x08ce, B:1168:0x08b8, B:1165:0x089f, B:1162:0x0886, B:1159:0x086c, B:1154:0x085d] A[DONT_GENERATE, DONT_INLINE]
  0x085f: PHI (r30v35 int) = 
  (r30v22 int)
  (r30v24 int)
  (r30v26 int)
  (r30v27 int)
  (r30v28 int)
  (r30v29 int)
  (r30v30 int)
  (r30v31 int)
  (r30v32 int)
  (r30v33 int)
  (r30v36 int)
 binds: [B:1214:0x09f7, B:1198:0x0984, B:1184:0x091c, B:1177:0x08fa, B:1174:0x08e4, B:1171:0x08ce, B:1168:0x08b8, B:1165:0x089f, B:1162:0x0886, B:1159:0x086c, B:1154:0x085d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1323:0x080a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1325:0x0862 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1365:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1390:0x0812 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1395:0x0a26 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:764:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzb(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, com.google.android.gms.internal.auth.zzdt r44) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x006e  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zze(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzo = zzo(i2);
            int i3 = this.zzc[i2];
            long j2 = (1048575 + iZzo) - (1048575 | iZzo);
            switch (zzn(iZzo)) {
                case 0:
                    if (zzE(obj2, i2)) {
                        zzhj.zzl(obj, j2, zzhj.zza(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 1:
                    if (zzE(obj2, i2)) {
                        zzhj.zzm(obj, j2, zzhj.zzb(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 2:
                    if (zzE(obj2, i2)) {
                        zzhj.zzo(obj, j2, zzhj.zzd(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 3:
                    if (zzE(obj2, i2)) {
                        zzhj.zzo(obj, j2, zzhj.zzd(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 4:
                    if (zzE(obj2, i2)) {
                        zzhj.zzn(obj, j2, zzhj.zzc(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 5:
                    if (zzE(obj2, i2)) {
                        zzhj.zzo(obj, j2, zzhj.zzd(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 6:
                    if (zzE(obj2, i2)) {
                        zzhj.zzn(obj, j2, zzhj.zzc(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 7:
                    if (zzE(obj2, i2)) {
                        zzhj.zzk(obj, j2, zzhj.zzt(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 8:
                    if (zzE(obj2, i2)) {
                        zzhj.zzp(obj, j2, zzhj.zzf(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 9:
                    zzx(obj, obj2, i2);
                    break;
                case 10:
                    if (zzE(obj2, i2)) {
                        zzhj.zzp(obj, j2, zzhj.zzf(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 11:
                    if (zzE(obj2, i2)) {
                        zzhj.zzn(obj, j2, zzhj.zzc(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 12:
                    if (zzE(obj2, i2)) {
                        zzhj.zzn(obj, j2, zzhj.zzc(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 13:
                    if (zzE(obj2, i2)) {
                        zzhj.zzn(obj, j2, zzhj.zzc(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 14:
                    if (zzE(obj2, i2)) {
                        zzhj.zzo(obj, j2, zzhj.zzd(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 15:
                    if (zzE(obj2, i2)) {
                        zzhj.zzn(obj, j2, zzhj.zzc(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 16:
                    if (zzE(obj2, i2)) {
                        zzhj.zzo(obj, j2, zzhj.zzd(obj2, j2));
                        zzz(obj, i2);
                    }
                    break;
                case 17:
                    zzx(obj, obj2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzk.zzb(obj, obj2, j2);
                    break;
                case 50:
                    int i4 = zzgk.zza;
                    zzhj.zzp(obj, j2, zzfs.zza(zzhj.zzf(obj, j2), zzhj.zzf(obj2, j2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzI(obj2, i3, i2)) {
                        zzhj.zzp(obj, j2, zzhj.zzf(obj2, j2));
                        zzA(obj, i3, i2);
                    }
                    break;
                case 60:
                    zzy(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i3, i2)) {
                        zzhj.zzp(obj, j2, zzhj.zzf(obj2, j2));
                        zzA(obj, i3, i2);
                    }
                    break;
                case 68:
                    zzy(obj, obj2, i2);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i2, int i3, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i2, i3, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzf;
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iZzo = zzo(i2);
            long j2 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i2) || Double.doubleToLongBits(zzhj.zza(obj, j2)) != Double.doubleToLongBits(zzhj.zza(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i2) || Float.floatToIntBits(zzhj.zzb(obj, j2)) != Float.floatToIntBits(zzhj.zzb(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i2) || zzhj.zzd(obj, j2) != zzhj.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i2) || zzhj.zzd(obj, j2) != zzhj.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i2) || zzhj.zzc(obj, j2) != zzhj.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i2) || zzhj.zzd(obj, j2) != zzhj.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i2) || zzhj.zzc(obj, j2) != zzhj.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i2) || zzhj.zzt(obj, j2) != zzhj.zzt(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i2) || !zzgk.zzf(zzhj.zzf(obj, j2), zzhj.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i2) || !zzgk.zzf(zzhj.zzf(obj, j2), zzhj.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i2) || !zzgk.zzf(zzhj.zzf(obj, j2), zzhj.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i2) || zzhj.zzc(obj, j2) != zzhj.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i2) || zzhj.zzc(obj, j2) != zzhj.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i2) || zzhj.zzc(obj, j2) != zzhj.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i2) || zzhj.zzd(obj, j2) != zzhj.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i2) || zzhj.zzc(obj, j2) != zzhj.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i2) || zzhj.zzd(obj, j2) != zzhj.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i2) || !zzgk.zzf(zzhj.zzf(obj, j2), zzhj.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j2), zzhj.zzf(obj2, j2));
                    break;
                case 50:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j2), zzhj.zzf(obj2, j2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    int iZzl = zzl(i2);
                    long j3 = (iZzl + 1048575) - (iZzl | 1048575);
                    if (zzhj.zzc(obj, j3) != zzhj.zzc(obj2, j3) || !zzgk.zzf(zzhj.zzf(obj, j2), zzhj.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x008a  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzi(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzi(java.lang.Object):boolean");
    }
}
