package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzzj<T> implements zzzt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaau.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzzg zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzyu zzm;
    private final zzaak zzn;
    private final zzxg zzo;
    private final zzzm zzp;
    private final zzzb zzq;

    private zzzj(int[] iArr, Object[] objArr, int i2, int i3, zzzg zzzgVar, int i4, boolean z2, int[] iArr2, int i5, int i6, zzzm zzzmVar, zzyu zzyuVar, zzaak zzaakVar, zzxg zzxgVar, zzzb zzzbVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = zzzgVar instanceof zzxv;
        boolean z3 = false;
        if (zzxgVar != null && zzxgVar.zzi(zzzgVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i5;
        this.zzl = i6;
        this.zzp = zzzmVar;
        this.zzm = zzyuVar;
        this.zzn = zzaakVar;
        this.zzo = zzxgVar;
        this.zzg = zzzgVar;
        this.zzq = zzzbVar;
    }

    private final Object zzA(Object obj, int i2) {
        zzzt zzztVarZzx = zzx(i2);
        int iZzu = zzu(i2) & 1048575;
        if (!zzN(obj, i2)) {
            return zzztVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzztVarZzx.zze();
        if (object != null) {
            zzztVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i2, int i3) {
        zzzt zzztVarZzx = zzx(i3);
        if (!zzR(obj, i2, i3)) {
            return zzztVarZzx.zze();
        }
        Object object = zzb.getObject(obj, (-1) - (((-1) - zzu(i3)) | ((-1) - 1048575)));
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzztVarZzx.zze();
        if (object != null) {
            zzztVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i2) {
        if (zzN(obj2, i2)) {
            int iZzu = (-1) - (((-1) - zzu(i2)) | ((-1) - 1048575));
            Unsafe unsafe = zzb;
            long j2 = iZzu;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzzt zzztVarZzx = zzx(i2);
            if (!zzN(obj, i2)) {
                if (zzQ(object)) {
                    Object objZze = zzztVarZzx.zze();
                    zzztVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j2, objZze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzH(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzQ(object2)) {
                Object objZze2 = zzztVarZzx.zze();
                zzztVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j2, objZze2);
                object2 = objZze2;
            }
            zzztVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzR(obj2, i3, i2)) {
            int iZzu = zzu(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = iZzu;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzzt zzztVarZzx = zzx(i2);
            if (!zzR(obj, i3, i2)) {
                if (zzQ(object)) {
                    Object objZze = zzztVarZzx.zze();
                    zzztVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j2, objZze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzI(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzQ(object2)) {
                Object objZze2 = zzztVarZzx.zze();
                zzztVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j2, objZze2);
                object2 = objZze2;
            }
            zzztVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i2, zzzs zzzsVar) throws IOException {
        long j2 = (-1) - (((-1) - i2) | ((-1) - 1048575));
        if (zzM(i2)) {
            zzaau.zzs(obj, j2, zzzsVar.zzu());
        } else if (this.zzi) {
            zzaau.zzs(obj, j2, zzzsVar.zzt());
        } else {
            zzaau.zzs(obj, j2, zzzsVar.zzp());
        }
    }

    private final void zzH(Object obj, int i2) {
        int iZzr = zzr(i2);
        long j2 = (1048575 + iZzr) - (1048575 | iZzr);
        if (j2 == 1048575) {
            return;
        }
        zzaau.zzq(obj, j2, (1 << (iZzr >>> 20)) | zzaau.zzc(obj, j2));
    }

    private final void zzI(Object obj, int i2, int i3) {
        zzaau.zzq(obj, (-1) - (((-1) - zzr(i3)) | ((-1) - 1048575)), i2);
    }

    private final void zzJ(Object obj, int i2, Object obj2) {
        Unsafe unsafe = zzb;
        int iZzu = zzu(i2);
        unsafe.putObject(obj, (iZzu + 1048575) - (iZzu | 1048575), obj2);
        zzH(obj, i2);
    }

    private final void zzK(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, (-1) - (((-1) - zzu(i3)) | ((-1) - 1048575)), obj2);
        zzI(obj, i2, i3);
    }

    private final boolean zzL(Object obj, Object obj2, int i2) {
        return zzN(obj, i2) == zzN(obj2, i2);
    }

    private static boolean zzM(int i2) {
        return (i2 + 536870912) - (i2 | 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i2) {
        int iZzr = zzr(i2);
        long j2 = iZzr & 1048575;
        if (j2 != 1048575) {
            int i3 = 1 << (iZzr >>> 20);
            int iZzc = zzaau.zzc(obj, j2);
            return (iZzc + i3) - (iZzc | i3) != 0;
        }
        int iZzu = zzu(i2);
        long j3 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzaau.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzaau.zzb(obj, j3)) != 0;
            case 2:
                return zzaau.zzd(obj, j3) != 0;
            case 3:
                return zzaau.zzd(obj, j3) != 0;
            case 4:
                return zzaau.zzc(obj, j3) != 0;
            case 5:
                return zzaau.zzd(obj, j3) != 0;
            case 6:
                return zzaau.zzc(obj, j3) != 0;
            case 7:
                return zzaau.zzw(obj, j3);
            case 8:
                Object objZzf = zzaau.zzf(obj, j3);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzud) {
                    return !zzud.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzaau.zzf(obj, j3) != null;
            case 10:
                return !zzud.zzb.equals(zzaau.zzf(obj, j3));
            case 11:
                return zzaau.zzc(obj, j3) != 0;
            case 12:
                return zzaau.zzc(obj, j3) != 0;
            case 13:
                return zzaau.zzc(obj, j3) != 0;
            case 14:
                return zzaau.zzd(obj, j3) != 0;
            case 15:
                return zzaau.zzc(obj, j3) != 0;
            case 16:
                return zzaau.zzd(obj, j3) != 0;
            case 17:
                return zzaau.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzN(obj, i2) : (i4 + i5) - (i4 | i5) != 0;
    }

    private static boolean zzP(Object obj, int i2, zzzt zzztVar) {
        return zzztVar.zzk(zzaau.zzf(obj, i2 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzxv) {
            return ((zzxv) obj).zzaq();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i2, int i3) {
        return zzaau.zzc(obj, (long) (zzr(i3) & 1048575)) == i2;
    }

    private static boolean zzS(Object obj, long j2) {
        return ((Boolean) zzaau.zzf(obj, j2)).booleanValue();
    }

    private static final void zzT(int i2, Object obj, zzur zzurVar) throws IOException {
        if (obj instanceof String) {
            zzurVar.zzG(i2, (String) obj);
        } else {
            zzurVar.zzd(i2, (zzud) obj);
        }
    }

    static zzaal zzd(Object obj) {
        zzxv zzxvVar = (zzxv) obj;
        zzaal zzaalVar = zzxvVar.zzc;
        if (zzaalVar != zzaal.zzc()) {
            return zzaalVar;
        }
        zzaal zzaalVarZzf = zzaal.zzf();
        zzxvVar.zzc = zzaalVarZzf;
        return zzaalVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:334:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.gtm.zzzj zzl(java.lang.Class r39, com.google.android.gms.internal.gtm.zzzd r40, com.google.android.gms.internal.gtm.zzzm r41, com.google.android.gms.internal.gtm.zzyu r42, com.google.android.gms.internal.gtm.zzaak r43, com.google.android.gms.internal.gtm.zzxg r44, com.google.android.gms.internal.gtm.zzzb r45) {
        /*
            Method dump skipped, instruction units count: 1187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzl(java.lang.Class, com.google.android.gms.internal.gtm.zzzd, com.google.android.gms.internal.gtm.zzzm, com.google.android.gms.internal.gtm.zzyu, com.google.android.gms.internal.gtm.zzaak, com.google.android.gms.internal.gtm.zzxg, com.google.android.gms.internal.gtm.zzzb):com.google.android.gms.internal.gtm.zzzj");
    }

    private static double zzn(Object obj, long j2) {
        return ((Double) zzaau.zzf(obj, j2)).doubleValue();
    }

    private static float zzo(Object obj, long j2) {
        return ((Float) zzaau.zzf(obj, j2)).floatValue();
    }

    private static int zzp(Object obj, long j2) {
        return ((Integer) zzaau.zzf(obj, j2)).intValue();
    }

    private final int zzq(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzs(i2, 0);
    }

    private final int zzr(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzs(int i2, int i3) {
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

    private static int zzt(int i2) {
        int i3 = i2 >>> 20;
        return (i3 + 255) - (i3 | 255);
    }

    private final int zzu(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzv(Object obj, long j2) {
        return ((Long) zzaau.zzf(obj, j2)).longValue();
    }

    private final zzxz zzw(int i2) {
        int i3 = i2 / 3;
        return (zzxz) this.zzd[i3 + i3 + 1];
    }

    private final zzzt zzx(int i2) {
        Object[] objArr = this.zzd;
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzzt zzztVar = (zzzt) objArr[i4];
        if (zzztVar != null) {
            return zzztVar;
        }
        zzzt zzztVarZzb = zzzp.zza().zzb((Class) objArr[i4 + 1]);
        this.zzd[i4] = zzztVarZzb;
        return zzztVarZzb;
    }

    private final Object zzy(Object obj, int i2, Object obj2, zzaak zzaakVar, Object obj3) {
        int i3 = this.zzc[i2];
        int iZzu = zzu(i2);
        Object objZzf = zzaau.zzf(obj, (iZzu + 1048575) - (iZzu | 1048575));
        if (objZzf == null || zzw(i2) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:456:0x02be  */
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
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r3v129, types: [int] */
    /* JADX WARN: Type inference failed for: r3v132 */
    /* JADX WARN: Type inference failed for: r3v133 */
    /* JADX WARN: Type inference failed for: r3v134 */
    /* JADX WARN: Type inference failed for: r3v135 */
    /* JADX WARN: Type inference failed for: r3v136 */
    /* JADX WARN: Type inference failed for: r3v137 */
    /* JADX WARN: Type inference failed for: r3v138 */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v141 */
    /* JADX WARN: Type inference failed for: r3v142 */
    /* JADX WARN: Type inference failed for: r3v143 */
    /* JADX WARN: Type inference failed for: r3v144 */
    /* JADX WARN: Type inference failed for: r3v145 */
    /* JADX WARN: Type inference failed for: r3v146 */
    /* JADX WARN: Type inference failed for: r3v147 */
    /* JADX WARN: Type inference failed for: r3v148 */
    /* JADX WARN: Type inference failed for: r3v149 */
    /* JADX WARN: Type inference failed for: r3v150 */
    /* JADX WARN: Type inference failed for: r3v151 */
    /* JADX WARN: Type inference failed for: r3v152 */
    /* JADX WARN: Type inference failed for: r3v153 */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v67, types: [int] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v71, types: [int] */
    /* JADX WARN: Type inference failed for: r3v73, types: [int] */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84, types: [int] */
    /* JADX WARN: Type inference failed for: r3v86, types: [int] */
    /* JADX WARN: Type inference failed for: r5v28, types: [int] */
    /* JADX WARN: Type inference failed for: r5v34, types: [int] */
    /* JADX WARN: Type inference failed for: r5v37, types: [int] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.google.android.gms.internal.gtm.zzyo] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.gtm.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final int zzb(Object obj) {
        int i2;
        int iHashCode;
        long jZzv;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzu = zzu(i5);
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i6 = iArr[i5];
            long j2 = 1048575 & iZzu;
            int iHashCode2 = 37;
            switch (iZzt) {
                case 0:
                    i2 = i4 * 53;
                    jZzv = Double.doubleToLongBits(zzaau.zza(obj, j2));
                    byte[] bArr = zzye.zzd;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iHashCode = Float.floatToIntBits(zzaau.zzb(obj, j2));
                    i4 = i2 + iHashCode;
                    break;
                case 2:
                    i2 = i4 * 53;
                    jZzv = zzaau.zzd(obj, j2);
                    byte[] bArr2 = zzye.zzd;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 3:
                    i2 = i4 * 53;
                    jZzv = zzaau.zzd(obj, j2);
                    byte[] bArr3 = zzye.zzd;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 4:
                    i2 = i4 * 53;
                    iHashCode = zzaau.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 5:
                    i2 = i4 * 53;
                    jZzv = zzaau.zzd(obj, j2);
                    byte[] bArr4 = zzye.zzd;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 6:
                    i2 = i4 * 53;
                    iHashCode = zzaau.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iHashCode = zzye.zza(zzaau.zzw(obj, j2));
                    i4 = i2 + iHashCode;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iHashCode = ((String) zzaau.zzf(obj, j2)).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzaau.zzf(obj, j2);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode2;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iHashCode = zzaau.zzf(obj, j2).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 11:
                    i2 = i4 * 53;
                    iHashCode = zzaau.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iHashCode = zzaau.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iHashCode = zzaau.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 14:
                    i2 = i4 * 53;
                    jZzv = zzaau.zzd(obj, j2);
                    byte[] bArr5 = zzye.zzd;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 15:
                    i2 = i4 * 53;
                    iHashCode = zzaau.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 16:
                    i2 = i4 * 53;
                    jZzv = zzaau.zzd(obj, j2);
                    byte[] bArr6 = zzye.zzd;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzaau.zzf(obj, j2);
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
                    iHashCode = zzaau.zzf(obj, j2).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iHashCode = zzaau.zzf(obj, j2).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 51:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzv = Double.doubleToLongBits(zzn(obj, j2));
                        byte[] bArr7 = zzye.zzd;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 52:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = Float.floatToIntBits(zzo(obj, j2));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 53:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr8 = zzye.zzd;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 54:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr9 = zzye.zzd;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 55:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 56:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr10 = zzye.zzd;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 57:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 58:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzye.zza(zzS(obj, j2));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 59:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = ((String) zzaau.zzf(obj, j2)).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 60:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzaau.zzf(obj, j2).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 61:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzaau.zzf(obj, j2).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 62:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 63:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 64:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 65:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr11 = zzye.zzd;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 66:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 67:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr12 = zzye.zzd;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 68:
                    if (zzR(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzaau.zzf(obj, j2).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
            }
        }
        int iHashCode3 = (i4 * 53) + this.zzn.zzd(obj).hashCode();
        return this.zzh ? (iHashCode3 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1160:0x0b5c, code lost:
    
        if (r3 != 0) goto L1164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1162:0x0b60, code lost:
    
        if (r4 != r36) goto L1169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1163:0x0b62, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1165:0x0b65, code lost:
    
        if (r4 > r36) goto L1171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1167:0x0b69, code lost:
    
        if (r21 != r3) goto L1171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1170:0x0b70, code lost:
    
        throw com.google.android.gms.internal.gtm.zzyg.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1172:0x0b75, code lost:
    
        throw com.google.android.gms.internal.gtm.zzyg.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x005e, code lost:
    
        if (r20 == 1048575) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0060, code lost:
    
        r22.putInt(r38, r20, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x006c, code lost:
    
        r2 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0070, code lost:
    
        if (r2 >= r12.zzl) goto L1305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x0072, code lost:
    
        zzy(r38, r12.zzj[r2], null, r12.zzn, r38);
        r2 = r2 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:1064:0x091e A[PHI: r2 r6
  0x091e: PHI (r2v81 int) = 
  (r2v64 int)
  (r2v71 int)
  (r2v72 int)
  (r2v73 int)
  (r2v74 int)
  (r2v75 int)
  (r2v76 int)
  (r2v77 int)
  (r2v78 int)
  (r2v79 int)
  (r2v80 int)
  (r2v83 int)
 binds: [B:1063:0x091d, B:1007:0x0802, B:1004:0x07e1, B:965:0x0733, B:950:0x06fc, B:935:0x06b6, B:921:0x066b, B:912:0x0634, B:903:0x05fd, B:889:0x05ad, B:875:0x0556, B:860:0x04e8] A[DONT_GENERATE, DONT_INLINE]
  0x091e: PHI (r6v82 boolean) = 
  (r6v68 boolean)
  (r6v72 boolean)
  (r6v73 boolean)
  (r6v74 boolean)
  (r6v75 boolean)
  (r6v76 boolean)
  (r6v77 boolean)
  (r6v78 boolean)
  (r6v79 boolean)
  (r6v80 boolean)
  (r6v81 boolean)
  (r6v85 boolean)
 binds: [B:1063:0x091d, B:1007:0x0802, B:1004:0x07e1, B:965:0x0733, B:950:0x06fc, B:935:0x06b6, B:921:0x066b, B:912:0x0634, B:903:0x05fd, B:889:0x05ad, B:875:0x0556, B:860:0x04e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1220:0x0927 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1222:0x0980 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1291:0x092c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1296:0x0b46 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzc(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.gtm.zztp r43) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.gtm.zztp):int");
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final Object zze() {
        return ((zzxv) this.zzg).zzad();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0071  */
    @Override // com.google.android.gms.internal.gtm.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzu = zzu(i2);
            int i3 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i2)) {
                        zzaau.zzo(obj, j2, zzaau.zza(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i2)) {
                        zzaau.zzp(obj, j2, zzaau.zzb(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i2)) {
                        zzaau.zzr(obj, j2, zzaau.zzd(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i2)) {
                        zzaau.zzr(obj, j2, zzaau.zzd(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i2)) {
                        zzaau.zzq(obj, j2, zzaau.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i2)) {
                        zzaau.zzr(obj, j2, zzaau.zzd(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i2)) {
                        zzaau.zzq(obj, j2, zzaau.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i2)) {
                        zzaau.zzm(obj, j2, zzaau.zzw(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i2)) {
                        zzaau.zzs(obj, j2, zzaau.zzf(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i2);
                    break;
                case 10:
                    if (zzN(obj2, i2)) {
                        zzaau.zzs(obj, j2, zzaau.zzf(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i2)) {
                        zzaau.zzq(obj, j2, zzaau.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i2)) {
                        zzaau.zzq(obj, j2, zzaau.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i2)) {
                        zzaau.zzq(obj, j2, zzaau.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i2)) {
                        zzaau.zzr(obj, j2, zzaau.zzd(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i2)) {
                        zzaau.zzq(obj, j2, zzaau.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i2)) {
                        zzaau.zzr(obj, j2, zzaau.zzd(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i2);
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
                    this.zzm.zzc(obj, obj2, j2);
                    break;
                case 50:
                    int i5 = zzzv.zza;
                    zzaau.zzs(obj, j2, zzzb.zzb(zzaau.zzf(obj, j2), zzaau.zzf(obj2, j2)));
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
                    if (zzR(obj2, i4, i2)) {
                        zzaau.zzs(obj, j2, zzaau.zzf(obj2, j2));
                        zzI(obj, i4, i2);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i4, i2)) {
                        zzaau.zzs(obj, j2, zzaau.zzf(obj2, j2));
                        zzI(obj, i4, i2);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i2);
                    break;
            }
        }
        zzzv.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzzv.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:524:0x063e A[LOOP:3: B:522:0x063a->B:524:0x063e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0650  */
    @Override // com.google.android.gms.internal.gtm.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r27, com.google.android.gms.internal.gtm.zzzs r28, com.google.android.gms.internal.gtm.zzxf r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzh(java.lang.Object, com.google.android.gms.internal.gtm.zzzs, com.google.android.gms.internal.gtm.zzxf):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzi(Object obj, byte[] bArr, int i2, int i3, zztp zztpVar) throws IOException {
        zzc(obj, bArr, i2, i3, 0, zztpVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzt;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzu = zzu(i2);
            long j2 = (iZzu + 1048575) - (iZzu | 1048575);
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i2) || Double.doubleToLongBits(zzaau.zza(obj, j2)) != Double.doubleToLongBits(zzaau.zza(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i2) || Float.floatToIntBits(zzaau.zzb(obj, j2)) != Float.floatToIntBits(zzaau.zzb(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i2) || zzaau.zzd(obj, j2) != zzaau.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i2) || zzaau.zzd(obj, j2) != zzaau.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i2) || zzaau.zzc(obj, j2) != zzaau.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i2) || zzaau.zzd(obj, j2) != zzaau.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i2) || zzaau.zzc(obj, j2) != zzaau.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i2) || zzaau.zzw(obj, j2) != zzaau.zzw(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i2) || !zzzv.zzt(zzaau.zzf(obj, j2), zzaau.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i2) || !zzzv.zzt(zzaau.zzf(obj, j2), zzaau.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i2) || !zzzv.zzt(zzaau.zzf(obj, j2), zzaau.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i2) || zzaau.zzc(obj, j2) != zzaau.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i2) || zzaau.zzc(obj, j2) != zzaau.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i2) || zzaau.zzc(obj, j2) != zzaau.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i2) || zzaau.zzd(obj, j2) != zzaau.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i2) || zzaau.zzc(obj, j2) != zzaau.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i2) || zzaau.zzd(obj, j2) != zzaau.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i2) || !zzzv.zzt(zzaau.zzf(obj, j2), zzaau.zzf(obj2, j2))) {
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
                    zZzt = zzzv.zzt(zzaau.zzf(obj, j2), zzaau.zzf(obj2, j2));
                    break;
                case 50:
                    zZzt = zzzv.zzt(zzaau.zzf(obj, j2), zzaau.zzf(obj2, j2));
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
                    long jZzr = (-1) - (((-1) - zzr(i2)) | ((-1) - 1048575));
                    if (zzaau.zzc(obj, jZzr) != zzaau.zzc(obj2, jZzr) || !zzzv.zzt(zzaau.zzf(obj, j2), zzaau.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzt) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x008d  */
    @Override // com.google.android.gms.internal.gtm.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzk(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0533  */
    @Override // com.google.android.gms.internal.gtm.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(java.lang.Object r19, com.google.android.gms.internal.gtm.zzur r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzm(java.lang.Object, com.google.android.gms.internal.gtm.zzur):void");
    }
}
