package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzbfv<T> implements zzbgm<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzbhk.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzbfs zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzbhd zzm;
    private final zzbdw zzn;

    private zzbfv(int[] iArr, Object[] objArr, int i2, int i3, zzbfs zzbfsVar, boolean z2, int[] iArr2, int i4, int i5, zzbfy zzbfyVar, zzbfe zzbfeVar, zzbhd zzbhdVar, zzbdw zzbdwVar, zzbfn zzbfnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = zzbfsVar instanceof zzbel;
        boolean z3 = false;
        if (zzbdwVar != null && (zzbfsVar instanceof zzbeh)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzm = zzbhdVar;
        this.zzn = zzbdwVar;
        this.zzg = zzbfsVar;
    }

    private final Object zzA(Object obj, int i2) {
        zzbgm zzbgmVarZzx = zzx(i2);
        int iZzu = zzu(i2);
        int i3 = (iZzu + 1048575) - (iZzu | 1048575);
        if (!zzN(obj, i2)) {
            return zzbgmVarZzx.zze();
        }
        Object object = zzb.getObject(obj, i3);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzbgmVarZzx.zze();
        if (object != null) {
            zzbgmVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i2, int i3) {
        zzbgm zzbgmVarZzx = zzx(i3);
        if (!zzR(obj, i2, i3)) {
            return zzbgmVarZzx.zze();
        }
        Unsafe unsafe = zzb;
        int iZzu = zzu(i3);
        Object object = unsafe.getObject(obj, (iZzu + 1048575) - (iZzu | 1048575));
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzbgmVarZzx.zze();
        if (object != null) {
            zzbgmVarZzx.zzg(objZze, object);
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
            int iZzu = zzu(i2);
            Unsafe unsafe = zzb;
            long j2 = (iZzu + 1048575) - (iZzu | 1048575);
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzbgm zzbgmVarZzx = zzx(i2);
            if (!zzN(obj, i2)) {
                if (zzQ(object)) {
                    Object objZze = zzbgmVarZzx.zze();
                    zzbgmVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j2, objZze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzH(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzQ(object2)) {
                Object objZze2 = zzbgmVarZzx.zze();
                zzbgmVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j2, objZze2);
                object2 = objZze2;
            }
            zzbgmVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzR(obj2, i3, i2)) {
            int iZzu = zzu(i2);
            Unsafe unsafe = zzb;
            long j2 = (iZzu + 1048575) - (iZzu | 1048575);
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzbgm zzbgmVarZzx = zzx(i2);
            if (!zzR(obj, i3, i2)) {
                if (zzQ(object)) {
                    Object objZze = zzbgmVarZzx.zze();
                    zzbgmVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j2, objZze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzI(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzQ(object2)) {
                Object objZze2 = zzbgmVarZzx.zze();
                zzbgmVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j2, objZze2);
                object2 = objZze2;
            }
            zzbgmVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i2, zzbge zzbgeVar) throws IOException {
        long j2 = i2 & 1048575;
        if (zzM(i2)) {
            zzbhk.zzs(obj, j2, zzbgeVar.zzu());
        } else if (this.zzi) {
            zzbhk.zzs(obj, j2, zzbgeVar.zzt());
        } else {
            zzbhk.zzs(obj, j2, zzbgeVar.zzp());
        }
    }

    private final void zzH(Object obj, int i2) {
        int iZzr = zzr(i2);
        long j2 = (-1) - (((-1) - 1048575) | ((-1) - iZzr));
        if (j2 == 1048575) {
            return;
        }
        zzbhk.zzq(obj, j2, (1 << (iZzr >>> 20)) | zzbhk.zzc(obj, j2));
    }

    private final void zzI(Object obj, int i2, int i3) {
        zzbhk.zzq(obj, zzr(i3) & 1048575, i2);
    }

    private final void zzJ(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, (-1) - (((-1) - zzu(i2)) | ((-1) - 1048575)), obj2);
        zzH(obj, i2);
    }

    private final void zzK(Object obj, int i2, int i3, Object obj2) {
        Unsafe unsafe = zzb;
        int iZzu = zzu(i3);
        unsafe.putObject(obj, (iZzu + 1048575) - (iZzu | 1048575), obj2);
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
            int iZzc = zzbhk.zzc(obj, j2);
            return (iZzc + i3) - (iZzc | i3) != 0;
        }
        int iZzu = zzu(i2);
        long j3 = (-1) - (((-1) - iZzu) | ((-1) - 1048575));
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzbhk.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzbhk.zzb(obj, j3)) != 0;
            case 2:
                return zzbhk.zzd(obj, j3) != 0;
            case 3:
                return zzbhk.zzd(obj, j3) != 0;
            case 4:
                return zzbhk.zzc(obj, j3) != 0;
            case 5:
                return zzbhk.zzd(obj, j3) != 0;
            case 6:
                return zzbhk.zzc(obj, j3) != 0;
            case 7:
                return zzbhk.zzw(obj, j3);
            case 8:
                Object objZzf = zzbhk.zzf(obj, j3);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzbdd) {
                    return !zzbdd.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzbhk.zzf(obj, j3) != null;
            case 10:
                return !zzbdd.zzb.equals(zzbhk.zzf(obj, j3));
            case 11:
                return zzbhk.zzc(obj, j3) != 0;
            case 12:
                return zzbhk.zzc(obj, j3) != 0;
            case 13:
                return zzbhk.zzc(obj, j3) != 0;
            case 14:
                return zzbhk.zzd(obj, j3) != 0;
            case 15:
                return zzbhk.zzc(obj, j3) != 0;
            case 16:
                return zzbhk.zzd(obj, j3) != 0;
            case 17:
                return zzbhk.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzN(obj, i2) : (i4 & i5) != 0;
    }

    private static boolean zzP(Object obj, int i2, zzbgm zzbgmVar) {
        return zzbgmVar.zzl(zzbhk.zzf(obj, (-1) - (((-1) - i2) | ((-1) - 1048575))));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzbel) {
            return ((zzbel) obj).zzU();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i2, int i3) {
        return zzbhk.zzc(obj, (long) ((-1) - (((-1) - zzr(i3)) | ((-1) - 1048575)))) == i2;
    }

    private static boolean zzS(Object obj, long j2) {
        return ((Boolean) zzbhk.zzf(obj, j2)).booleanValue();
    }

    private static final int zzT(byte[] bArr, int i2, int i3, zzbhq zzbhqVar, Class cls, zzbcr zzbcrVar) throws IOException {
        zzbhq zzbhqVar2 = zzbhq.DOUBLE;
        switch (zzbhqVar) {
            case DOUBLE:
                int i4 = i2 + 8;
                zzbcrVar.zzc = Double.valueOf(Double.longBitsToDouble(zzbcs.zzq(bArr, i2)));
                return i4;
            case FLOAT:
                int i5 = i2 + 4;
                zzbcrVar.zzc = Float.valueOf(Float.intBitsToFloat(zzbcs.zzb(bArr, i2)));
                return i5;
            case INT64:
            case UINT64:
                int iZzm = zzbcs.zzm(bArr, i2, zzbcrVar);
                zzbcrVar.zzc = Long.valueOf(zzbcrVar.zzb);
                return iZzm;
            case INT32:
            case UINT32:
            case ENUM:
                int iZzj = zzbcs.zzj(bArr, i2, zzbcrVar);
                zzbcrVar.zzc = Integer.valueOf(zzbcrVar.zza);
                return iZzj;
            case FIXED64:
            case SFIXED64:
                int i6 = i2 + 8;
                zzbcrVar.zzc = Long.valueOf(zzbcs.zzq(bArr, i2));
                return i6;
            case FIXED32:
            case SFIXED32:
                int i7 = i2 + 4;
                zzbcrVar.zzc = Integer.valueOf(zzbcs.zzb(bArr, i2));
                return i7;
            case BOOL:
                int iZzm2 = zzbcs.zzm(bArr, i2, zzbcrVar);
                zzbcrVar.zzc = Boolean.valueOf(zzbcrVar.zzb != 0);
                return iZzm2;
            case STRING:
                return zzbcs.zzh(bArr, i2, zzbcrVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzbcs.zzd(zzbgb.zza().zzb(cls), bArr, i2, i3, zzbcrVar);
            case BYTES:
                return zzbcs.zza(bArr, i2, zzbcrVar);
            case SINT32:
                int iZzj2 = zzbcs.zzj(bArr, i2, zzbcrVar);
                zzbcrVar.zzc = Integer.valueOf(zzbdj.zzF(zzbcrVar.zza));
                return iZzj2;
            case SINT64:
                int iZzm3 = zzbcs.zzm(bArr, i2, zzbcrVar);
                zzbcrVar.zzc = Long.valueOf(zzbdj.zzG(zzbcrVar.zzb));
                return iZzm3;
        }
    }

    private static final void zzU(int i2, Object obj, zzbhs zzbhsVar) throws IOException {
        if (obj instanceof String) {
            zzbhsVar.zzH(i2, (String) obj);
        } else {
            zzbhsVar.zzd(i2, (zzbdd) obj);
        }
    }

    static zzbhe zzd(Object obj) {
        zzbel zzbelVar = (zzbel) obj;
        zzbhe zzbheVar = zzbelVar.zzc;
        if (zzbheVar != zzbhe.zzc()) {
            return zzbheVar;
        }
        zzbhe zzbheVarZzf = zzbhe.zzf();
        zzbelVar.zzc = zzbheVarZzf;
        return zzbheVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfv zzm(java.lang.Class r38, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfp r39, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfy r40, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfe r41, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd r42, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdw r43, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfn r44) {
        /*
            Method dump skipped, instruction units count: 1179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfv.zzm(java.lang.Class, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfp, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfy, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfe, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdw, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfn):com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfv");
    }

    private static double zzn(Object obj, long j2) {
        return ((Double) zzbhk.zzf(obj, j2)).doubleValue();
    }

    private static float zzo(Object obj, long j2) {
        return ((Float) zzbhk.zzf(obj, j2)).floatValue();
    }

    private static int zzp(Object obj, long j2) {
        return ((Integer) zzbhk.zzf(obj, j2)).intValue();
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
        return (-1) - (((-1) - (i2 >>> 20)) | ((-1) - 255));
    }

    private final int zzu(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzv(Object obj, long j2) {
        return ((Long) zzbhk.zzf(obj, j2)).longValue();
    }

    private final zzbep zzw(int i2) {
        int i3 = i2 / 3;
        return (zzbep) this.zzd[i3 + i3 + 1];
    }

    private final zzbgm zzx(int i2) {
        Object[] objArr = this.zzd;
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzbgm zzbgmVar = (zzbgm) objArr[i4];
        if (zzbgmVar != null) {
            return zzbgmVar;
        }
        zzbgm zzbgmVarZzb = zzbgb.zza().zzb((Class) objArr[i4 + 1]);
        this.zzd[i4] = zzbgmVarZzb;
        return zzbgmVarZzb;
    }

    private final Object zzy(Object obj, int i2, Object obj2, zzbhd zzbhdVar, Object obj3) {
        zzbep zzbepVarZzw;
        int i3 = this.zzc[i2];
        Object objZzf = zzbhk.zzf(obj, (-1) - (((-1) - zzu(i2)) | ((-1) - 1048575)));
        if (objZzf == null || (zzbepVarZzw = zzw(i2)) == null) {
            return obj2;
        }
        zzbfk zzbfkVarZzc = ((zzbfl) zzz(i2)).zzc();
        Iterator it = ((zzbfm) objZzf).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzbepVarZzw.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzbhdVar.zza(obj3);
                }
                int iZzb = zzbfl.zzb(zzbfkVarZzc, entry.getKey(), entry.getValue());
                zzbdd zzbddVar = zzbdd.zzb;
                byte[] bArr = new byte[iZzb];
                zzbdm zzbdmVar = new zzbdm(bArr, 0, iZzb);
                try {
                    zzbfl.zze(zzbdmVar, zzbfkVarZzc, entry.getKey(), entry.getValue());
                    zzbhdVar.zzg(obj2, i3, zzbcz.zza(zzbdmVar, bArr));
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return obj2;
    }

    private final Object zzz(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0589  */
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
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [int] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v45, types: [int] */
    /* JADX WARN: Type inference failed for: r5v47, types: [int] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54, types: [int] */
    /* JADX WARN: Type inference failed for: r5v56, types: [int] */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
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
    /* JADX WARN: Type inference failed for: r8v33, types: [int] */
    /* JADX WARN: Type inference failed for: r8v41, types: [int] */
    /* JADX WARN: Type inference failed for: r8v44, types: [int] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v80, types: [int] */
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
    /* JADX WARN: Type inference failed for: r8v98 */
    /* JADX WARN: Type inference failed for: r8v99 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfv.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final int zzb(Object obj) {
        int i2;
        int iHashCode;
        long jZzv;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = (-1) - (((-1) - 1048575) | ((-1) - iZzu));
            int iZzt = zzt(iZzu);
            int i7 = iArr[i5];
            long j2 = i6;
            int iHashCode2 = 37;
            switch (iZzt) {
                case 0:
                    i2 = i4 * 53;
                    jZzv = Double.doubleToLongBits(zzbhk.zza(obj, j2));
                    byte[] bArr = zzbeu.zzb;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iHashCode = Float.floatToIntBits(zzbhk.zzb(obj, j2));
                    i4 = i2 + iHashCode;
                    break;
                case 2:
                    i2 = i4 * 53;
                    jZzv = zzbhk.zzd(obj, j2);
                    byte[] bArr2 = zzbeu.zzb;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 3:
                    i2 = i4 * 53;
                    jZzv = zzbhk.zzd(obj, j2);
                    byte[] bArr3 = zzbeu.zzb;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 4:
                    i2 = i4 * 53;
                    iHashCode = zzbhk.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 5:
                    i2 = i4 * 53;
                    jZzv = zzbhk.zzd(obj, j2);
                    byte[] bArr4 = zzbeu.zzb;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 6:
                    i2 = i4 * 53;
                    iHashCode = zzbhk.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iHashCode = zzbeu.zza(zzbhk.zzw(obj, j2));
                    i4 = i2 + iHashCode;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iHashCode = ((String) zzbhk.zzf(obj, j2)).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzbhk.zzf(obj, j2);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode2;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iHashCode = zzbhk.zzf(obj, j2).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 11:
                    i2 = i4 * 53;
                    iHashCode = zzbhk.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iHashCode = zzbhk.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iHashCode = zzbhk.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 14:
                    i2 = i4 * 53;
                    jZzv = zzbhk.zzd(obj, j2);
                    byte[] bArr5 = zzbeu.zzb;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 15:
                    i2 = i4 * 53;
                    iHashCode = zzbhk.zzc(obj, j2);
                    i4 = i2 + iHashCode;
                    break;
                case 16:
                    i2 = i4 * 53;
                    jZzv = zzbhk.zzd(obj, j2);
                    byte[] bArr6 = zzbeu.zzb;
                    iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                    i4 = i2 + iHashCode;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzbhk.zzf(obj, j2);
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
                    iHashCode = zzbhk.zzf(obj, j2).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iHashCode = zzbhk.zzf(obj, j2).hashCode();
                    i4 = i2 + iHashCode;
                    break;
                case 51:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        jZzv = Double.doubleToLongBits(zzn(obj, j2));
                        byte[] bArr7 = zzbeu.zzb;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 52:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = Float.floatToIntBits(zzo(obj, j2));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 53:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr8 = zzbeu.zzb;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 54:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr9 = zzbeu.zzb;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 55:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr10 = zzbeu.zzb;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzbeu.zza(zzS(obj, j2));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 59:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = ((String) zzbhk.zzf(obj, j2)).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 60:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzbhk.zzf(obj, j2).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 61:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzbhk.zzf(obj, j2).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 63:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 65:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr11 = zzbeu.zzb;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 66:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzp(obj, j2);
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 67:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        jZzv = zzv(obj, j2);
                        byte[] bArr12 = zzbeu.zzb;
                        iHashCode = (int) (jZzv ^ (jZzv >>> 32));
                        i4 = i2 + iHashCode;
                    }
                    break;
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iHashCode = zzbhk.zzf(obj, j2).hashCode();
                        i4 = i2 + iHashCode;
                    }
                    break;
            }
        }
        int iHashCode3 = (i4 * 53) + ((zzbel) obj).zzc.hashCode();
        return this.zzh ? (iHashCode3 * 53) + ((zzbeh) obj).zzb.zza.hashCode() : iHashCode3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r20 == 1048575) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r10 = r10;
        r24.putInt(r10, r20, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r3 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r3 >= r6.zzl) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r18 = (com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhe) zzy(r39, r6.zzj[r3], r18, r6.zzm, r39);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0be3, code lost:
    
        if (r18 == null) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0be5, code lost:
    
        r6.zzm.zzj(r10, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0bec, code lost:
    
        if (r4 != 0) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0bf0, code lost:
    
        if (r0 != r42) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0bf2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0bf5, code lost:
    
        if (r0 > r42) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0bf7, code lost:
    
        if (r14 != r4) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0c01, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0c09, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0c93, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Removed duplicated region for block: B:598:0x08e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:603:0x09f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x08ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0bd1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzc(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcr r44) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfv.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcr):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final Object zze() {
        return ((zzbel) this.zzg).zzF();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfv.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzu = zzu(i2);
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i2];
            long j2 = (-1) - (((-1) - 1048575) | ((-1) - iZzu));
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzo(obj, j2, zzbhk.zza(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzp(obj, j2, zzbhk.zzb(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzr(obj, j2, zzbhk.zzd(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzr(obj, j2, zzbhk.zzd(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzq(obj, j2, zzbhk.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzr(obj, j2, zzbhk.zzd(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzq(obj, j2, zzbhk.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzm(obj, j2, zzbhk.zzw(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzs(obj, j2, zzbhk.zzf(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i2);
                    break;
                case 10:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzs(obj, j2, zzbhk.zzf(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzq(obj, j2, zzbhk.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzq(obj, j2, zzbhk.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzq(obj, j2, zzbhk.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzr(obj, j2, zzbhk.zzd(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzq(obj, j2, zzbhk.zzc(obj2, j2));
                        zzH(obj, i2);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i2)) {
                        zzbhk.zzr(obj, j2, zzbhk.zzd(obj2, j2));
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
                    zzbet zzbetVarZzd = (zzbet) zzbhk.zzf(obj, j2);
                    zzbet zzbetVar = (zzbet) zzbhk.zzf(obj2, j2);
                    int size = zzbetVarZzd.size();
                    int size2 = zzbetVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzbetVarZzd.zzc()) {
                            zzbetVarZzd = zzbetVarZzd.zzd(size2 + size);
                        }
                        zzbetVarZzd.addAll(zzbetVar);
                    }
                    if (size > 0) {
                        zzbetVar = zzbetVarZzd;
                    }
                    zzbhk.zzs(obj, j2, zzbetVar);
                    break;
                case 50:
                    int i4 = zzbgo.zza;
                    zzbhk.zzs(obj, j2, zzbfn.zzb(zzbhk.zzf(obj, j2), zzbhk.zzf(obj2, j2)));
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
                    if (zzR(obj2, i3, i2)) {
                        zzbhk.zzs(obj, j2, zzbhk.zzf(obj2, j2));
                        zzI(obj, i3, i2);
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
                    if (zzR(obj2, i3, i2)) {
                        zzbhk.zzs(obj, j2, zzbhk.zzf(obj2, j2));
                        zzI(obj, i3, i2);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i2);
                    break;
            }
        }
        zzbgo.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzbgo.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:390:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c A[Catch: all -> 0x0734, TryCatch #0 {all -> 0x0734, blocks: (B:3:0x0011, B:11:0x003b, B:18:0x004c, B:19:0x0053, B:21:0x005e, B:22:0x0066, B:53:0x016b, B:61:0x0196, B:58:0x017c, B:60:0x0184, B:24:0x006c, B:25:0x0076, B:26:0x0080, B:27:0x008a, B:28:0x0094, B:29:0x009e, B:30:0x00a8, B:31:0x00b2, B:32:0x00bc, B:33:0x00c2, B:35:0x00cc, B:37:0x00e1, B:38:0x00ee, B:39:0x00f3, B:40:0x00fe, B:42:0x0108, B:44:0x011d, B:45:0x012a, B:46:0x012f, B:47:0x013a, B:48:0x013f, B:49:0x0148, B:50:0x0151, B:51:0x015a, B:52:0x0163, B:177:0x0722, B:178:0x0729, B:179:0x072a, B:180:0x072d, B:63:0x019f, B:64:0x01a3, B:14:0x0040, B:70:0x01c1, B:71:0x01c5, B:72:0x01cc, B:74:0x01d1, B:75:0x01d5, B:81:0x01f3, B:82:0x0201, B:83:0x0215, B:84:0x0226, B:85:0x0234, B:86:0x0245, B:87:0x0253, B:88:0x0267, B:89:0x027b, B:90:0x0283, B:91:0x0295, B:92:0x02a9, B:93:0x02b7, B:95:0x02c1, B:98:0x02d7, B:97:0x02c7, B:99:0x02dd, B:100:0x02ee, B:101:0x0302, B:102:0x0316, B:103:0x032a, B:104:0x033c, B:105:0x034d, B:106:0x035b, B:107:0x036c, B:108:0x037d, B:109:0x038e, B:110:0x039f, B:111:0x03b0, B:112:0x03c1, B:114:0x03c7, B:115:0x03d9, B:116:0x03ea, B:117:0x03f9, B:118:0x040a, B:119:0x0418, B:120:0x043a, B:121:0x0448, B:122:0x0453, B:123:0x0461, B:124:0x046c, B:125:0x047d, B:126:0x0488, B:127:0x0493, B:128:0x04a1, B:129:0x04b2, B:130:0x04c3, B:131:0x04ce, B:132:0x04d9, B:133:0x04e7, B:134:0x0506, B:135:0x0511, B:136:0x051f, B:137:0x052d, B:138:0x0538, B:139:0x0547, B:141:0x0557, B:142:0x0562, B:143:0x056f, B:145:0x0575, B:146:0x0585, B:147:0x059d, B:148:0x05b2, B:149:0x05c7, B:150:0x05df, B:151:0x05f4, B:152:0x0609, B:153:0x061b, B:154:0x0630, B:155:0x0638, B:156:0x064a, B:157:0x065e, B:158:0x0670, B:160:0x067a, B:163:0x068e, B:162:0x0680, B:164:0x0694, B:165:0x06ac, B:166:0x06c4, B:167:0x06d9, B:168:0x06ee, B:170:0x0702, B:171:0x0706), top: B:192:0x0011, inners: #1 }] */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r22, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge r23, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdv r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfv.zzh(java.lang.Object, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdv):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final void zzi(Object obj, byte[] bArr, int i2, int i3, zzbcr zzbcrVar) throws IOException {
        zzc(obj, bArr, i2, i3, 0, zzbcrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d1  */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r22, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfv.zzj(java.lang.Object, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzu = zzu(i2);
            long j2 = (-1) - (((-1) - iZzu) | ((-1) - 1048575));
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i2) || Double.doubleToLongBits(zzbhk.zza(obj, j2)) != Double.doubleToLongBits(zzbhk.zza(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i2) || Float.floatToIntBits(zzbhk.zzb(obj, j2)) != Float.floatToIntBits(zzbhk.zzb(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzd(obj, j2) != zzbhk.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzd(obj, j2) != zzbhk.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzc(obj, j2) != zzbhk.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzd(obj, j2) != zzbhk.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzc(obj, j2) != zzbhk.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzw(obj, j2) != zzbhk.zzw(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i2) || !zzbgo.zzF(zzbhk.zzf(obj, j2), zzbhk.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i2) || !zzbgo.zzF(zzbhk.zzf(obj, j2), zzbhk.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i2) || !zzbgo.zzF(zzbhk.zzf(obj, j2), zzbhk.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzc(obj, j2) != zzbhk.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzc(obj, j2) != zzbhk.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzc(obj, j2) != zzbhk.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzd(obj, j2) != zzbhk.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzc(obj, j2) != zzbhk.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i2) || zzbhk.zzd(obj, j2) != zzbhk.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i2) || !zzbgo.zzF(zzbhk.zzf(obj, j2), zzbhk.zzf(obj2, j2))) {
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
                    zZzF = zzbgo.zzF(zzbhk.zzf(obj, j2), zzbhk.zzf(obj2, j2));
                    break;
                case 50:
                    zZzF = zzbgo.zzF(zzbhk.zzf(obj, j2), zzbhk.zzf(obj2, j2));
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
                    int iZzr = zzr(i2);
                    long j3 = (iZzr + 1048575) - (iZzr | 1048575);
                    if (zzbhk.zzc(obj, j3) != zzbhk.zzc(obj2, j3) || !zzbgo.zzF(zzbhk.zzf(obj, j2), zzbhk.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zzbel) obj).zzc.equals(((zzbel) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzbeh) obj).zzb.equals(((zzbeh) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfv.zzl(java.lang.Object):boolean");
    }
}
