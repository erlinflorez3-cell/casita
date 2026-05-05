package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzfp<T> implements zzge<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzgs zzl;
    private final zzdt zzm;

    private zzfp(int[] iArr, Object[] objArr, int i2, int i3, zzfm zzfmVar, boolean z2, int[] iArr2, int i4, int i5, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        boolean z3 = false;
        if (zzdtVar != null && (zzfmVar instanceof zzed)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzl = zzgsVar;
        this.zzm = zzdtVar;
        this.zzg = zzfmVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i2) {
        if (zzI(obj2, i2)) {
            int iZzs = zzs(i2);
            Unsafe unsafe = zzb;
            long j2 = (iZzs + 1048575) - (iZzs | 1048575);
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzge zzgeVarZzv = zzv(i2);
            if (!zzI(obj, i2)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j2, objZze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzD(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j2, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzM(obj2, i3, i2)) {
            int iZzs = zzs(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = iZzs;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzge zzgeVarZzv = zzv(i2);
            if (!zzM(obj, i3, i2)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j2, objZze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzE(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j2, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i2) {
        int iZzp = zzp(i2);
        long j2 = 1048575 & iZzp;
        if (j2 == 1048575) {
            return;
        }
        zzgz.zzq(obj, j2, (1 << (iZzp >>> 20)) | zzgz.zzc(obj, j2));
    }

    private final void zzE(Object obj, int i2, int i3) {
        zzgz.zzq(obj, zzp(i3) & 1048575, i2);
    }

    private final void zzF(Object obj, int i2, Object obj2) {
        Unsafe unsafe = zzb;
        int iZzs = zzs(i2);
        unsafe.putObject(obj, (iZzs + 1048575) - (iZzs | 1048575), obj2);
        zzD(obj, i2);
    }

    private final void zzG(Object obj, int i2, int i3, Object obj2) {
        Unsafe unsafe = zzb;
        int iZzs = zzs(i3);
        unsafe.putObject(obj, (iZzs + 1048575) - (iZzs | 1048575), obj2);
        zzE(obj, i2, i3);
    }

    private final boolean zzH(Object obj, Object obj2, int i2) {
        return zzI(obj, i2) == zzI(obj2, i2);
    }

    private final boolean zzI(Object obj, int i2) {
        int iZzp = zzp(i2);
        long j2 = (iZzp + 1048575) - (iZzp | 1048575);
        if (j2 != 1048575) {
            return (-1) - (((-1) - zzgz.zzc(obj, j2)) | ((-1) - (1 << (iZzp >>> 20)))) != 0;
        }
        int iZzs = zzs(i2);
        long j3 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzgz.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgz.zzb(obj, j3)) != 0;
            case 2:
                return zzgz.zzd(obj, j3) != 0;
            case 3:
                return zzgz.zzd(obj, j3) != 0;
            case 4:
                return zzgz.zzc(obj, j3) != 0;
            case 5:
                return zzgz.zzd(obj, j3) != 0;
            case 6:
                return zzgz.zzc(obj, j3) != 0;
            case 7:
                return zzgz.zzw(obj, j3);
            case 8:
                Object objZzf = zzgz.zzf(obj, j3);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzdf) {
                    return !zzdf.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.zzf(obj, j3) != null;
            case 10:
                return !zzdf.zzb.equals(zzgz.zzf(obj, j3));
            case 11:
                return zzgz.zzc(obj, j3) != 0;
            case 12:
                return zzgz.zzc(obj, j3) != 0;
            case 13:
                return zzgz.zzc(obj, j3) != 0;
            case 14:
                return zzgz.zzd(obj, j3) != 0;
            case 15:
                return zzgz.zzc(obj, j3) != 0;
            case 16:
                return zzgz.zzd(obj, j3) != 0;
            case 17:
                return zzgz.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzI(obj, i2) : (i4 & i5) != 0;
    }

    private static boolean zzK(Object obj, int i2, zzge zzgeVar) {
        return zzgeVar.zzk(zzgz.zzf(obj, (i2 + 1048575) - (i2 | 1048575)));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzY();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i2, int i3) {
        return zzgz.zzc(obj, (long) ((-1) - (((-1) - zzp(i3)) | ((-1) - 1048575)))) == i2;
    }

    private static boolean zzN(Object obj, long j2) {
        return ((Boolean) zzgz.zzf(obj, j2)).booleanValue();
    }

    private static final void zzO(int i2, Object obj, zzhh zzhhVar) throws IOException {
        if (obj instanceof String) {
            zzhhVar.zzG(i2, (String) obj);
        } else {
            zzhhVar.zzd(i2, (zzdf) obj);
        }
    }

    static zzgt zzd(Object obj) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar != zzgt.zzc()) {
            return zzgtVar;
        }
        zzgt zzgtVarZzf = zzgt.zzf();
        zzehVar.zzc = zzgtVarZzf;
        return zzgtVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp zzl(java.lang.Class r37, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj r38, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfs r39, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez r40, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs r41, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt r42, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh r43) {
        /*
            Method dump skipped, instruction units count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzl(java.lang.Class, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfs, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh):com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp");
    }

    private static double zzm(Object obj, long j2) {
        return ((Double) zzgz.zzf(obj, j2)).doubleValue();
    }

    private static float zzn(Object obj, long j2) {
        return ((Float) zzgz.zzf(obj, j2)).floatValue();
    }

    private static int zzo(Object obj, long j2) {
        return ((Integer) zzgz.zzf(obj, j2)).intValue();
    }

    private final int zzp(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzq(int i2, int i3) {
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

    private static int zzr(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzs(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzt(Object obj, long j2) {
        return ((Long) zzgz.zzf(obj, j2)).longValue();
    }

    private final zzel zzu(int i2) {
        int i3 = i2 / 3;
        return (zzel) this.zzd[i3 + i3 + 1];
    }

    private final zzge zzv(int i2) {
        Object[] objArr = this.zzd;
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzge zzgeVar = (zzge) objArr[i4];
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzgeVarZzb = zzfu.zza().zzb((Class) objArr[i4 + 1]);
        this.zzd[i4] = zzgeVarZzb;
        return zzgeVarZzb;
    }

    private final Object zzw(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private final Object zzx(Object obj, int i2) {
        zzge zzgeVarZzv = zzv(i2);
        int iZzs = zzs(i2);
        int i3 = (iZzs + 1048575) - (iZzs | 1048575);
        if (!zzI(obj, i2)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, i3);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i2, int i3) {
        zzge zzgeVarZzv = zzv(i3);
        if (!zzM(obj, i2, i3)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i3) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b7  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v42, types: [int] */
    /* JADX WARN: Type inference failed for: r5v44, types: [int] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51, types: [int] */
    /* JADX WARN: Type inference failed for: r5v53, types: [int] */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v11, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13, types: [int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v32, types: [int] */
    /* JADX WARN: Type inference failed for: r8v40, types: [int] */
    /* JADX WARN: Type inference failed for: r8v43, types: [int] */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v78, types: [int] */
    /* JADX WARN: Type inference failed for: r8v80 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v86 */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Type inference failed for: r8v90 */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int i2;
        int iHashCode;
        long jZzt;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzs = zzs(i5);
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i6 = iArr[i5];
            long j2 = 1048575 & iZzs;
            int iHashCode2 = 37;
            switch (iZzr) {
                case 0:
                    i2 = i4 * 53;
                    jZzt = Double.doubleToLongBits(zzgz.zza(obj, j2));
                    byte[] bArr = zzep.zzb;
                    iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iHashCode = Float.floatToIntBits(zzgz.zzb(obj, j2));
                    i4 = i2 + iHashCode;
                    break;
                case 2:
                    i2 = i4 * 53;
                    jZzt = zzgz.zzd(obj, j2);
                    byte[] bArr2 = zzep.zzb;
                    iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 3:
                    i2 = i4 * 53;
                    jZzt = zzgz.zzd(obj, j2);
                    byte[] bArr3 = zzep.zzb;
                    iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 4:
                    i2 = i4 * 53;
                    iHashCode = zzgz.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 5:
                    i2 = i4 * 53;
                    jZzt = zzgz.zzd(obj, j2);
                    byte[] bArr4 = zzep.zzb;
                    iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 6:
                    i2 = i4 * 53;
                    iHashCode = zzgz.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iHashCode = zzep.zza(zzgz.zzw(obj, j2));
                    i4 = i2 + iHashCode;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iHashCode = ((String) zzgz.zzf(obj, j2)).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzgz.zzf(obj, j2);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode2;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iHashCode = zzgz.zzf(obj, j2).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 11:
                    i2 = i4 * 53;
                    iHashCode = zzgz.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iHashCode = zzgz.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iHashCode = zzgz.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 14:
                    i2 = i4 * 53;
                    jZzt = zzgz.zzd(obj, j2);
                    byte[] bArr5 = zzep.zzb;
                    iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 15:
                    i2 = i4 * 53;
                    iHashCode = zzgz.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 16:
                    i2 = i4 * 53;
                    jZzt = zzgz.zzd(obj, j2);
                    byte[] bArr6 = zzep.zzb;
                    iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzgz.zzf(obj, j2);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i4 = i3 + iHashCode2;
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
                    i2 = i4 * 53;
                    iHashCode = zzgz.zzf(obj, j2).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iHashCode = zzgz.zzf(obj, j2).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 51:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzt = Double.doubleToLongBits(zzm(obj, j2));
                        byte[] bArr7 = zzep.zzb;
                        iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 52:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = Float.floatToIntBits(zzn(obj, j2));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 53:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzt = zzt(obj, j2);
                        byte[] bArr8 = zzep.zzb;
                        iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 54:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzt = zzt(obj, j2);
                        byte[] bArr9 = zzep.zzb;
                        iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 55:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzo(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 56:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzt = zzt(obj, j2);
                        byte[] bArr10 = zzep.zzb;
                        iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 57:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzo(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 58:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzep.zza(zzN(obj, j2));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 59:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = ((String) zzgz.zzf(obj, j2)).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 60:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzgz.zzf(obj, j2).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 61:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzgz.zzf(obj, j2).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 62:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzo(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 63:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzo(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 64:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzo(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 65:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzt = zzt(obj, j2);
                        byte[] bArr11 = zzep.zzb;
                        iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 66:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzo(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 67:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzt = zzt(obj, j2);
                        byte[] bArr12 = zzep.zzb;
                        iHashCode = (int) (jZzt ^ (jZzt >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 68:
                    if (zzM(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzgz.zzf(obj, j2).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
            }
        }
        int iHashCode3 = (i4 * 53) + ((zzeh) obj).zzc.hashCode();
        return this.zzh ? (iHashCode3 * 53) + ((zzed) obj).zzb.zza.hashCode() : iHashCode3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r19 == 1048575) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        r17.putInt(r38, r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        r6 = r9.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r6 >= r9.zzk) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        r2 = r9.zzi;
        r1 = r9.zzc;
        r3 = r2[r6];
        r1 = r1[r3];
        r2 = r9.zzs(r3);
        r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r38, (r2 + 1048575) - (r2 | 1048575));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt) null;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r9.zzu(r3) != null) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0bc4, code lost:
    
        r2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg) r2;
        r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzff) r9.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0bcc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0bcf, code lost:
    
        if (r4 != 0) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0bd3, code lost:
    
        if (r0 != r36) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0bd5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0bd8, code lost:
    
        if (r0 > r36) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0bdc, code lost:
    
        if (r18 != r4) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0be4, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0bea, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0940 A[PHI: r3 r9
  0x0940: PHI (r3v110 int) = 
  (r3v34 int)
  (r3v53 int)
  (r3v58 int)
  (r3v60 int)
  (r3v104 int)
  (r3v107 int)
  (r3v108 int)
  (r3v109 int)
  (r3v112 int)
 binds: [B:408:0x093e, B:394:0x08eb, B:349:0x07fc, B:324:0x078c, B:284:0x06d5, B:217:0x05a8, B:204:0x055b, B:190:0x0509, B:174:0x049d] A[DONT_GENERATE, DONT_INLINE]
  0x0940: PHI (r9v19 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>) = 
  (r9v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r9v6 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r9v17 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r9v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r9v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r9v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r9v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r9v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r9v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
 binds: [B:408:0x093e, B:394:0x08eb, B:349:0x07fc, B:324:0x078c, B:284:0x06d5, B:217:0x05a8, B:204:0x055b, B:190:0x0509, B:174:0x049d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x09a1 A[PHI: r1 r27
  0x09a1: PHI (r1v73 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu) = 
  (r1v58 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v61 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v63 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v65 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v66 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v67 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v68 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v69 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v70 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v71 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r1v74 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
 binds: [B:474:0x0ae4, B:488:0x0b68, B:457:0x0a6e, B:450:0x0a4d, B:447:0x0a35, B:444:0x0a1c, B:441:0x0a04, B:438:0x09ed, B:435:0x09d2, B:432:0x09b6, B:427:0x099d] A[DONT_GENERATE, DONT_INLINE]
  0x09a1: PHI (r27v52 int) = 
  (r27v38 int)
  (r27v39 int)
  (r27v42 int)
  (r27v43 int)
  (r27v44 int)
  (r27v45 int)
  (r27v46 int)
  (r27v47 int)
  (r27v48 int)
  (r27v49 int)
  (r27v53 int)
 binds: [B:474:0x0ae4, B:488:0x0b68, B:457:0x0a6e, B:450:0x0a4d, B:447:0x0a35, B:444:0x0a1c, B:441:0x0a04, B:438:0x09ed, B:435:0x09d2, B:432:0x09b6, B:427:0x099d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0948 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x09a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x094f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0ba2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzc(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu r43) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        return ((zzeh) this.zzg).zzK();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzs = zzs(i2);
            int i3 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i2)) {
                        zzgz.zzo(obj, j2, zzgz.zza(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i2)) {
                        zzgz.zzp(obj, j2, zzgz.zzb(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i2)) {
                        zzgz.zzr(obj, j2, zzgz.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i2)) {
                        zzgz.zzr(obj, j2, zzgz.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i2)) {
                        zzgz.zzq(obj, j2, zzgz.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i2)) {
                        zzgz.zzr(obj, j2, zzgz.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i2)) {
                        zzgz.zzq(obj, j2, zzgz.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i2)) {
                        zzgz.zzm(obj, j2, zzgz.zzw(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i2)) {
                        zzgz.zzs(obj, j2, zzgz.zzf(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i2);
                    break;
                case 10:
                    if (zzI(obj2, i2)) {
                        zzgz.zzs(obj, j2, zzgz.zzf(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i2)) {
                        zzgz.zzq(obj, j2, zzgz.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i2)) {
                        zzgz.zzq(obj, j2, zzgz.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i2)) {
                        zzgz.zzq(obj, j2, zzgz.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i2)) {
                        zzgz.zzr(obj, j2, zzgz.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i2)) {
                        zzgz.zzq(obj, j2, zzgz.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i2)) {
                        zzgz.zzr(obj, j2, zzgz.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i2);
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
                    zzeo zzeoVarZzd = (zzeo) zzgz.zzf(obj, j2);
                    zzeo zzeoVar = (zzeo) zzgz.zzf(obj2, j2);
                    int size = zzeoVarZzd.size();
                    int size2 = zzeoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzeoVarZzd.zzc()) {
                            zzeoVarZzd = zzeoVarZzd.zzd(size2 + size);
                        }
                        zzeoVarZzd.addAll(zzeoVar);
                    }
                    if (size > 0) {
                        zzeoVar = zzeoVarZzd;
                    }
                    zzgz.zzs(obj, j2, zzeoVar);
                    break;
                case 50:
                    int i5 = zzgg.zza;
                    zzgz.zzs(obj, j2, zzfh.zza(zzgz.zzf(obj, j2), zzgz.zzf(obj2, j2)));
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
                    if (zzM(obj2, i4, i2)) {
                        zzgz.zzs(obj, j2, zzgz.zzf(obj2, j2));
                        zzE(obj, i4, i2);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i4, i2)) {
                        zzgz.zzs(obj, j2, zzgz.zzf(obj2, j2));
                        zzE(obj, i4, i2);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i2);
                    break;
            }
        }
        zzgg.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzgg.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i2, int i3, zzcu zzcuVar) throws IOException {
        zzc(obj, bArr, i2, i3, 0, zzcuVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05d3  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r22, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzi(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzs = zzs(i2);
            long j2 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i2) || Double.doubleToLongBits(zzgz.zza(obj, j2)) != Double.doubleToLongBits(zzgz.zza(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i2) || Float.floatToIntBits(zzgz.zzb(obj, j2)) != Float.floatToIntBits(zzgz.zzb(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i2) || zzgz.zzd(obj, j2) != zzgz.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i2) || zzgz.zzd(obj, j2) != zzgz.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i2) || zzgz.zzc(obj, j2) != zzgz.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i2) || zzgz.zzd(obj, j2) != zzgz.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i2) || zzgz.zzc(obj, j2) != zzgz.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i2) || zzgz.zzw(obj, j2) != zzgz.zzw(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i2) || !zzgg.zzE(zzgz.zzf(obj, j2), zzgz.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i2) || !zzgg.zzE(zzgz.zzf(obj, j2), zzgz.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i2) || !zzgg.zzE(zzgz.zzf(obj, j2), zzgz.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i2) || zzgz.zzc(obj, j2) != zzgz.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i2) || zzgz.zzc(obj, j2) != zzgz.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i2) || zzgz.zzc(obj, j2) != zzgz.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i2) || zzgz.zzd(obj, j2) != zzgz.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i2) || zzgz.zzc(obj, j2) != zzgz.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i2) || zzgz.zzd(obj, j2) != zzgz.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i2) || !zzgg.zzE(zzgz.zzf(obj, j2), zzgz.zzf(obj2, j2))) {
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
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j2), zzgz.zzf(obj2, j2));
                    break;
                case 50:
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j2), zzgz.zzf(obj2, j2));
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
                    long jZzp = zzp(i2) & 1048575;
                    if (zzgz.zzc(obj, jZzp) != zzgz.zzc(obj2, jZzp) || !zzgg.zzE(zzgz.zzf(obj, j2), zzgz.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzk(java.lang.Object):boolean");
    }
}
