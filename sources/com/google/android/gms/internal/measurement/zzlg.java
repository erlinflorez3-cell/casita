package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzlg<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzml.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlk zzn;
    private final zzkm zzo;
    private final zzmk<?, ?> zzp;
    private final zzji<?> zzq;
    private final zzkv zzr;

    private zzlg(int[] iArr, Object[] objArr, int i2, int i3, zzlc zzlcVar, boolean z2, int[] iArr2, int i4, int i5, zzlk zzlkVar, zzkm zzkmVar, zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzkv zzkvVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = zzlcVar instanceof zzjt;
        this.zzh = zzjiVar != null && zzjiVar.zza(zzlcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i4;
        this.zzm = i5;
        this.zzn = zzlkVar;
        this.zzo = zzkmVar;
        this.zzp = zzmkVar;
        this.zzq = zzjiVar;
        this.zzg = zzlcVar;
        this.zzr = zzkvVar;
    }

    private static <T> double zza(T t2, long j2) {
        return ((Double) zzml.zze(t2, j2)).doubleValue();
    }

    private final int zza(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zza(i2, 0);
    }

    private final int zza(int i2, int i3) {
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

    private static int zza(byte[] bArr, int i2, int i3, zzms zzmsVar, Class<?> cls, zzij zzijVar) throws IOException {
        switch (zzlf.zza[zzmsVar.ordinal()]) {
            case 1:
                int iZzd = zzig.zzd(bArr, i2, zzijVar);
                zzijVar.zzc = Boolean.valueOf(zzijVar.zzb != 0);
                return iZzd;
            case 2:
                return zzig.zza(bArr, i2, zzijVar);
            case 3:
                zzijVar.zzc = Double.valueOf(zzig.zza(bArr, i2));
                return i2 + 8;
            case 4:
            case 5:
                zzijVar.zzc = Integer.valueOf(zzig.zzc(bArr, i2));
                return i2 + 4;
            case 6:
            case 7:
                zzijVar.zzc = Long.valueOf(zzig.zzd(bArr, i2));
                return i2 + 8;
            case 8:
                zzijVar.zzc = Float.valueOf(zzig.zzb(bArr, i2));
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzig.zzc(bArr, i2, zzijVar);
                zzijVar.zzc = Integer.valueOf(zzijVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzig.zzd(bArr, i2, zzijVar);
                zzijVar.zzc = Long.valueOf(zzijVar.zzb);
                return iZzd2;
            case 14:
                return zzig.zza(zzlq.zza().zza((Class) cls), bArr, i2, i3, zzijVar);
            case 15:
                int iZzc2 = zzig.zzc(bArr, i2, zzijVar);
                zzijVar.zzc = Integer.valueOf(zziw.zza(zzijVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzig.zzd(bArr, i2, zzijVar);
                zzijVar.zzc = Long.valueOf(zziw.zza(zzijVar.zzb));
                return iZzd3;
            case 17:
                return zzig.zzb(bArr, i2, zzijVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:326:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.android.gms.internal.measurement.zzlg<T> zza(java.lang.Class<T> r36, com.google.android.gms.internal.measurement.zzla r37, com.google.android.gms.internal.measurement.zzlk r38, com.google.android.gms.internal.measurement.zzkm r39, com.google.android.gms.internal.measurement.zzmk<?, ?> r40, com.google.android.gms.internal.measurement.zzji<?> r41, com.google.android.gms.internal.measurement.zzkv r42) {
        /*
            Method dump skipped, instruction units count: 1212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzla, com.google.android.gms.internal.measurement.zzlk, com.google.android.gms.internal.measurement.zzkm, com.google.android.gms.internal.measurement.zzmk, com.google.android.gms.internal.measurement.zzji, com.google.android.gms.internal.measurement.zzkv):com.google.android.gms.internal.measurement.zzlg");
    }

    private final <K, V, UT, UB> UB zza(int i2, int i3, Map<K, V> map, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar, Object obj) {
        zzkt<?, ?> zzktVarZza = this.zzr.zza(zzf(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjxVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmkVar.zzc(obj);
                }
                zzit zzitVarZzc = zzik.zzc(zzku.zza(zzktVarZza, next.getKey(), next.getValue()));
                try {
                    zzku.zza(zzitVarZzc.zzb(), zzktVarZza, next.getKey(), next.getValue());
                    zzmkVar.zza(ub, i3, zzitVarZzc.zza());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t2, int i2) {
        zzlu zzluVarZze = zze(i2);
        int iZzc = zzc(i2);
        long j2 = (iZzc + 1048575) - (iZzc | 1048575);
        if (!zzc((Object) t2, i2)) {
            return zzluVarZze.zza();
        }
        Object object = zzb.getObject(t2, j2);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzluVarZze.zza();
        if (object != null) {
            zzluVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t2, int i2, int i3) {
        zzlu zzluVarZze = zze(i3);
        if (!zzc(t2, i2, i3)) {
            return zzluVarZze.zza();
        }
        Object object = zzb.getObject(t2, (-1) - (((-1) - zzc(i3)) | ((-1) - 1048575)));
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzluVarZze.zza();
        if (object != null) {
            zzluVarZze.zza(objZza, object);
        }
        return objZza;
    }

    private final <UT, UB> UB zza(Object obj, int i2, UB ub, zzmk<UT, UB> zzmkVar, Object obj2) {
        zzjx zzjxVarZzd;
        int i3 = this.zzc[i2];
        Object objZze = zzml.zze(obj, (-1) - (((-1) - zzc(i2)) | ((-1) - 1048575)));
        return (objZze == null || (zzjxVarZzd = zzd(i2)) == null) ? ub : (UB) zza(i2, i3, this.zzr.zze(objZze), zzjxVarZzd, ub, zzmkVar, obj2);
    }

    private static Field zza(Class<?> cls, String str) {
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

    private static void zza(int i2, Object obj, zznb zznbVar) throws IOException {
        if (obj instanceof String) {
            zznbVar.zza(i2, (String) obj);
        } else {
            zznbVar.zza(i2, (zzik) obj);
        }
    }

    private static <UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t2, zznb zznbVar) throws IOException {
        zzmkVar.zzb(zzmkVar.zzd(t2), zznbVar);
    }

    private final <K, V> void zza(zznb zznbVar, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            zznbVar.zza(i2, this.zzr.zza(zzf(i3)), this.zzr.zzd(obj));
        }
    }

    private final void zza(T t2, int i2, int i3, Object obj) {
        zzb.putObject(t2, zzc(i3) & 1048575, obj);
        zzb(t2, i2, i3);
    }

    private final void zza(Object obj, int i2, zzlr zzlrVar) throws IOException {
        if (zzg(i2)) {
            zzml.zza(obj, (i2 + 1048575) - (i2 | 1048575), zzlrVar.zzr());
        } else if (this.zzi) {
            zzml.zza(obj, (-1) - (((-1) - i2) | ((-1) - 1048575)), zzlrVar.zzq());
        } else {
            zzml.zza(obj, i2 & 1048575, zzlrVar.zzp());
        }
    }

    private final void zza(T t2, int i2, Object obj) {
        zzb.putObject(t2, (-1) - (((-1) - zzc(i2)) | ((-1) - 1048575)), obj);
        zzb((Object) t2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t2, T t3, int i2) {
        if (zzc((Object) t3, i2)) {
            int iZzc = zzc(i2);
            long j2 = (iZzc + 1048575) - (iZzc | 1048575);
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t3, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + String.valueOf(t3));
            }
            zzlu zzluVarZze = zze(i2);
            if (!zzc((Object) t2, i2)) {
                if (zzg(object)) {
                    Object objZza = zzluVarZze.zza();
                    zzluVarZze.zza(objZza, object);
                    unsafe.putObject(t2, j2, objZza);
                } else {
                    unsafe.putObject(t2, j2, object);
                }
                zzb((Object) t2, i2);
                return;
            }
            Object object2 = unsafe.getObject(t2, j2);
            if (!zzg(object2)) {
                Object objZza2 = zzluVarZze.zza();
                zzluVarZze.zza(objZza2, object2);
                unsafe.putObject(t2, j2, objZza2);
                object2 = objZza2;
            }
            zzluVarZze.zza(object2, object);
        }
    }

    private final boolean zza(T t2, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzc((Object) t2, i2) : (i4 + i5) - (i4 | i5) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i2, zzlu zzluVar) {
        return zzluVar.zze(zzml.zze(obj, i2 & 1048575));
    }

    private static <T> float zzb(T t2, long j2) {
        return ((Float) zzml.zze(t2, j2)).floatValue();
    }

    private final int zzb(int i2) {
        return this.zzc[i2 + 2];
    }

    private final void zzb(T t2, int i2) {
        int iZzb = zzb(i2);
        long j2 = (1048575 + iZzb) - (1048575 | iZzb);
        if (j2 == 1048575) {
            return;
        }
        int i3 = 1 << (iZzb >>> 20);
        int iZzc = zzml.zzc(t2, j2);
        zzml.zza((Object) t2, j2, (i3 + iZzc) - (i3 & iZzc));
    }

    private final void zzb(T t2, int i2, int i3) {
        zzml.zza((Object) t2, (-1) - (((-1) - zzb(i3)) | ((-1) - 1048575)), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t2, T t3, int i2) {
        int i3 = this.zzc[i2];
        if (zzc(t3, i3, i2)) {
            long jZzc = (-1) - (((-1) - zzc(i2)) | ((-1) - 1048575));
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t3, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + String.valueOf(t3));
            }
            zzlu zzluVarZze = zze(i2);
            if (!zzc(t2, i3, i2)) {
                if (zzg(object)) {
                    Object objZza = zzluVarZze.zza();
                    zzluVarZze.zza(objZza, object);
                    unsafe.putObject(t2, jZzc, objZza);
                } else {
                    unsafe.putObject(t2, jZzc, object);
                }
                zzb(t2, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(t2, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzluVarZze.zza();
                zzluVarZze.zza(objZza2, object2);
                unsafe.putObject(t2, jZzc, objZza2);
                object2 = objZza2;
            }
            zzluVarZze.zza(object2, object);
        }
    }

    private final int zzc(int i2) {
        return this.zzc[i2 + 1];
    }

    private static <T> int zzc(T t2, long j2) {
        return ((Integer) zzml.zze(t2, j2)).intValue();
    }

    static zzmj zzc(Object obj) {
        zzjt zzjtVar = (zzjt) obj;
        zzmj zzmjVar = zzjtVar.zzb;
        if (zzmjVar != zzmj.zzc()) {
            return zzmjVar;
        }
        zzmj zzmjVarZzd = zzmj.zzd();
        zzjtVar.zzb = zzmjVarZzd;
        return zzmjVarZzd;
    }

    private final boolean zzc(T t2, int i2) {
        int iZzb = zzb(i2);
        long j2 = (iZzb + 1048575) - (iZzb | 1048575);
        if (j2 != 1048575) {
            int i3 = 1 << (iZzb >>> 20);
            int iZzc = zzml.zzc(t2, j2);
            return (iZzc + i3) - (iZzc | i3) != 0;
        }
        int iZzc2 = zzc(i2);
        long j3 = iZzc2 & 1048575;
        switch (((-1) - (((-1) - iZzc2) | ((-1) - 267386880))) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzml.zza(t2, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzml.zzb(t2, j3)) != 0;
            case 2:
                return zzml.zzd(t2, j3) != 0;
            case 3:
                return zzml.zzd(t2, j3) != 0;
            case 4:
                return zzml.zzc(t2, j3) != 0;
            case 5:
                return zzml.zzd(t2, j3) != 0;
            case 6:
                return zzml.zzc(t2, j3) != 0;
            case 7:
                return zzml.zzh(t2, j3);
            case 8:
                Object objZze = zzml.zze(t2, j3);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzik) {
                    return !zzik.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzml.zze(t2, j3) != null;
            case 10:
                return !zzik.zza.equals(zzml.zze(t2, j3));
            case 11:
                return zzml.zzc(t2, j3) != 0;
            case 12:
                return zzml.zzc(t2, j3) != 0;
            case 13:
                return zzml.zzc(t2, j3) != 0;
            case 14:
                return zzml.zzd(t2, j3) != 0;
            case 15:
                return zzml.zzc(t2, j3) != 0;
            case 16:
                return zzml.zzd(t2, j3) != 0;
            case 17:
                return zzml.zze(t2, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzc(T t2, int i2, int i3) {
        return zzml.zzc(t2, (long) (zzb(i3) & 1048575)) == i2;
    }

    private final boolean zzc(T t2, T t3, int i2) {
        return zzc((Object) t2, i2) == zzc((Object) t3, i2);
    }

    private static <T> long zzd(T t2, long j2) {
        return ((Long) zzml.zze(t2, j2)).longValue();
    }

    private final zzjx zzd(int i2) {
        return (zzjx) this.zzd[((i2 / 3) << 1) + 1];
    }

    private final zzlu zze(int i2) {
        int i3 = (i2 / 3) << 1;
        zzlu zzluVar = (zzlu) this.zzd[i3];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu<T> zzluVarZza = zzlq.zza().zza((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzluVarZza;
        return zzluVarZza;
    }

    private static <T> boolean zze(T t2, long j2) {
        return ((Boolean) zzml.zze(t2, j2)).booleanValue();
    }

    private final Object zzf(int i2) {
        return this.zzd[(i2 / 3) << 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean zzg(int i2) {
        return (i2 + 536870912) - (i2 | 536870912) != 0;
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjt) {
            return ((zzjt) obj).zzco();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.gms.internal.measurement.zzlv, com.google.android.gms.internal.measurement.zzlv<T extends com.google.android.gms.internal.measurement.zzjo<T>, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [int] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(T t2) {
        ?? r21;
        ?? r20;
        int iZzb;
        int iZzh;
        int iZzi;
        int iZzj;
        int iZzb2;
        int iZzf;
        Unsafe unsafe = zzb;
        ?? r8 = 0;
        int i2 = 1048575;
        ?? r202 = 0;
        int i3 = 0;
        int iZzh2 = 0;
        int i4 = 1048575;
        while (i3 < this.zzc.length) {
            int iZzc = zzc(i3);
            int i5 = ((-1) - (((-1) - 267386880) | ((-1) - iZzc))) >>> 20;
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = (i7 + i2) - (i7 | i2);
            ?? r203 = r202;
            if (i5 <= 17) {
                if (i8 != i4) {
                    i4 = i8;
                    r203 = i8 == i2 ? r8 : unsafe.getInt(t2, i8);
                }
                r20 = r203;
                r21 = 1 << (i7 >>> 20);
            } else {
                r21 = r8;
                r20 = r202;
            }
            long j2 = iZzc & i2;
            if (i5 >= zzjn.DOUBLE_LIST_PACKED.zza()) {
                zzjn.SINT64_LIST_PACKED.zza();
            }
            switch (i5) {
                case 0:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzf = zzjc.zza(i6, 0.0d);
                        r8 = r8;
                        iZzh2 += iZzf;
                    }
                    break;
                case 1:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzf = zzjc.zza(i6, 0.0f);
                        r8 = r8;
                        iZzh2 += iZzf;
                    }
                    break;
                case 2:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzf = zzjc.zzd(i6, unsafe.getLong(t2, j2));
                        r8 = r8;
                        iZzh2 += iZzf;
                    }
                    break;
                case 3:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzf = zzjc.zzg(i6, unsafe.getLong(t2, j2));
                        r8 = r8;
                        iZzh2 += iZzf;
                    }
                    break;
                case 4:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzf = zzjc.zzg(i6, unsafe.getInt(t2, j2));
                        r8 = r8;
                        iZzh2 += iZzf;
                    }
                    break;
                case 5:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzf = zzjc.zzc(i6, 0L);
                        r8 = r8;
                        iZzh2 += iZzf;
                    }
                    break;
                case 6:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        r8 = 0;
                        iZzf = zzjc.zzf(i6, 0);
                        iZzh2 += iZzf;
                    }
                    r8 = 0;
                    break;
                case 7:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzb2 = zzjc.zzb(i6, true);
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 8:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        Object object = unsafe.getObject(t2, j2);
                        iZzb2 = object instanceof zzik ? zzjc.zzc(i6, (zzik) object) : zzjc.zzb(i6, (String) object);
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 9:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzb2 = zzlw.zza(i6, unsafe.getObject(t2, j2), (zzlu<?>) zze(i3));
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 10:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzb2 = zzjc.zzc(i6, (zzik) unsafe.getObject(t2, j2));
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 11:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzb2 = zzjc.zzj(i6, unsafe.getInt(t2, j2));
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 12:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzb2 = zzjc.zze(i6, unsafe.getInt(t2, j2));
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 13:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzh2 += zzjc.zzh(i6, 0);
                    }
                    r8 = 0;
                    break;
                case 14:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzb2 = zzjc.zze(i6, 0L);
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 15:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzb2 = zzjc.zzi(i6, unsafe.getInt(t2, j2));
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 16:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzb2 = zzjc.zzf(i6, unsafe.getLong(t2, j2));
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 17:
                    if (zza(t2, i3, i4, r20 == true ? 1 : 0, (int) r21)) {
                        iZzb2 = zzjc.zzb(i6, (zzlc) unsafe.getObject(t2, j2), zze(i3));
                        iZzh2 += iZzb2;
                    }
                    r8 = 0;
                    break;
                case 18:
                    iZzb = zzlw.zzd(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 19:
                    iZzb = zzlw.zzc(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 20:
                    iZzb = zzlw.zzf(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 21:
                    iZzb = zzlw.zzj(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 22:
                    iZzb = zzlw.zze(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 23:
                    iZzb = zzlw.zzd(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 24:
                    iZzb = zzlw.zzc(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 25:
                    iZzb = zzlw.zza(i6, (List<?>) unsafe.getObject(t2, j2), (boolean) r8);
                    iZzh2 += iZzb;
                    break;
                case 26:
                    iZzb = zzlw.zzb(i6, (List) unsafe.getObject(t2, j2));
                    iZzh2 += iZzb;
                    break;
                case 27:
                    iZzb = zzlw.zzb(i6, (List<?>) unsafe.getObject(t2, j2), (zzlu<?>) zze(i3));
                    iZzh2 += iZzb;
                    break;
                case 28:
                    iZzb = zzlw.zza(i6, (List<zzik>) unsafe.getObject(t2, j2));
                    iZzh2 += iZzb;
                    break;
                case 29:
                    iZzb = zzlw.zzi(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 30:
                    iZzb = zzlw.zzb(i6, (List<Integer>) unsafe.getObject(t2, j2), (boolean) r8);
                    iZzh2 += iZzb;
                    break;
                case 31:
                    iZzb = zzlw.zzc(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 32:
                    iZzb = zzlw.zzd(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 33:
                    iZzb = zzlw.zzg(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 34:
                    iZzb = zzlw.zzh(i6, (List) unsafe.getObject(t2, j2), r8);
                    iZzh2 += iZzb;
                    break;
                case 35:
                    iZzh = zzlw.zzd((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 36:
                    iZzh = zzlw.zzc((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 37:
                    iZzh = zzlw.zzf((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 38:
                    iZzh = zzlw.zzj((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 39:
                    iZzh = zzlw.zze((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 40:
                    iZzh = zzlw.zzd((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 41:
                    iZzh = zzlw.zzc((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 42:
                    iZzh = zzlw.zza((List<?>) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 43:
                    iZzh = zzlw.zzi((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 44:
                    iZzh = zzlw.zzb((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 45:
                    iZzh = zzlw.zzc((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 46:
                    iZzh = zzlw.zzd((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 47:
                    iZzh = zzlw.zzg((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 48:
                    iZzh = zzlw.zzh((List) unsafe.getObject(t2, j2));
                    if (iZzh > 0) {
                        iZzi = zzjc.zzi(i6);
                        iZzj = zzjc.zzj(iZzh);
                        iZzh2 += iZzi + iZzj + iZzh;
                    }
                    break;
                case 49:
                    iZzb = zzlw.zza(i6, (List<zzlc>) unsafe.getObject(t2, j2), (zzlu<?>) zze(i3));
                    iZzh2 += iZzb;
                    break;
                case 50:
                    iZzb = this.zzr.zza(i6, unsafe.getObject(t2, j2), zzf(i3));
                    iZzh2 += iZzb;
                    break;
                case 51:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zza(i6, 0.0d);
                        iZzh2 += iZzb;
                    }
                    break;
                case 52:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zza(i6, 0.0f);
                        iZzh2 += iZzb;
                    }
                    break;
                case 53:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzd(i6, zzd(t2, j2));
                        iZzh2 += iZzb;
                    }
                    break;
                case 54:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzg(i6, zzd(t2, j2));
                        iZzh2 += iZzb;
                    }
                    break;
                case 55:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzg(i6, zzc(t2, j2));
                        iZzh2 += iZzb;
                    }
                    break;
                case 56:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzc(i6, 0L);
                        iZzh2 += iZzb;
                    }
                    break;
                case 57:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzf(i6, (int) r8);
                        iZzh2 += iZzb;
                    }
                    break;
                case 58:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzb(i6, true);
                        iZzh2 += iZzb;
                    }
                    break;
                case 59:
                    if (zzc(t2, i6, i3)) {
                        Object object2 = unsafe.getObject(t2, j2);
                        iZzb = object2 instanceof zzik ? zzjc.zzc(i6, (zzik) object2) : zzjc.zzb(i6, (String) object2);
                        iZzh2 += iZzb;
                    }
                    break;
                case 60:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzlw.zza(i6, unsafe.getObject(t2, j2), (zzlu<?>) zze(i3));
                        iZzh2 += iZzb;
                    }
                    break;
                case 61:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzc(i6, (zzik) unsafe.getObject(t2, j2));
                        iZzh2 += iZzb;
                    }
                    break;
                case 62:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzj(i6, zzc(t2, j2));
                        iZzh2 += iZzb;
                    }
                    break;
                case 63:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zze(i6, zzc(t2, j2));
                        iZzh2 += iZzb;
                    }
                    break;
                case 64:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzh(i6, (int) r8);
                        iZzh2 += iZzb;
                    }
                    break;
                case 65:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zze(i6, 0L);
                        iZzh2 += iZzb;
                    }
                    break;
                case 66:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzi(i6, zzc(t2, j2));
                        iZzh2 += iZzb;
                    }
                    break;
                case 67:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzf(i6, zzd(t2, j2));
                        iZzh2 += iZzb;
                    }
                    break;
                case 68:
                    if (zzc(t2, i6, i3)) {
                        iZzb = zzjc.zzb(i6, (zzlc) unsafe.getObject(t2, j2), zze(i3));
                        iZzh2 += iZzb;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
            r8 = r8;
            r202 = r20;
        }
        zzmk<?, ?> zzmkVar = this.zzp;
        int iZza = iZzh2 + zzmkVar.zza(zzmkVar.zzd(t2));
        if (!this.zzh) {
            return iZza;
        }
        zzjm zzjmVarZza = this.zzq.zza(t2);
        int iZza2 = zzjmVarZza.zza.zza();
        ?? r2 = r8;
        ?? Zza = r8;
        while (r2 < iZza2) {
            Map.Entry entryZza = zzjmVarZza.zza.zza(r2);
            r2++;
            Zza += zzjm.zza((zzjo<?>) entryZza.getKey(), entryZza.getValue());
        }
        ?? Zza2 = Zza;
        for (Map.Entry entry : zzjmVarZza.zza.zzb()) {
            Zza2 += zzjm.zza((zzjo<?>) entry.getKey(), entry.getValue());
        }
        return iZza + Zza2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1220:0x0aa4, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1226:0x0ab2, code lost:
    
        if (r19 == 1048575) goto L1228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1227:0x0ab4, code lost:
    
        r16.putInt(r35, r19, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1228:0x0ac2, code lost:
    
        r3 = r8.zzl;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1230:0x0ac7, code lost:
    
        if (r3 >= r8.zzm) goto L1357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1231:0x0ac9, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.zzmj) zza(r35, r8.zzk[r3], r1, (com.google.android.gms.internal.measurement.zzmk<UT, com.google.android.gms.internal.measurement.zzmj>) r8.zzp, r35);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1232:0x0ae1, code lost:
    
        if (r1 == null) goto L1234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1233:0x0ae3, code lost:
    
        r8.zzp.zzb(r35, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1234:0x0ae8, code lost:
    
        if (r13 != 0) goto L1238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1236:0x0aec, code lost:
    
        if (r7 != r38) goto L1242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1237:0x0aee, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1239:0x0af1, code lost:
    
        if (r7 > r38) goto L1244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1240:0x0af3, code lost:
    
        if (r2 != r13) goto L1244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1243:0x0afa, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1245:0x0aff, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:1073:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:1085:0x07f8 A[PHI: r8
  0x07f8: PHI (r8v22 com.google.android.gms.internal.measurement.zzlg<T>) = 
  (r8v8 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v9 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v10 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v11 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v12 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v13 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v14 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v15 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v16 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v17 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v18 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v19 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v20 com.google.android.gms.internal.measurement.zzlg<T>)
  (r8v23 com.google.android.gms.internal.measurement.zzlg<T>)
 binds: [B:1145:0x096f, B:1141:0x0956, B:1133:0x0924, B:1130:0x0913, B:1127:0x08f3, B:1116:0x08a4, B:1108:0x0885, B:1104:0x086f, B:1101:0x0859, B:1098:0x0843, B:1095:0x082e, B:1092:0x0819, B:1089:0x0803, B:1084:0x07f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1252:0x09b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1275:0x09f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1336:0x07fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1344:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:835:0x032f A[PHI: r5 r13
  0x032f: PHI (r5v90 int) = (r5v69 int), (r5v76 int), (r5v77 int), (r5v83 int), (r5v86 int), (r5v87 int), (r5v88 int), (r5v91 int) binds: [B:1047:0x070f, B:989:0x05f5, B:986:0x05d6, B:984:0x05cd, B:877:0x03f4, B:864:0x03b4, B:848:0x0364, B:834:0x032d] A[DONT_GENERATE, DONT_INLINE]
  0x032f: PHI (r13v67 int) = (r13v39 int), (r13v45 int), (r13v46 int), (r13v60 int), (r13v63 int), (r13v64 int), (r13v65 int), (r13v68 int) binds: [B:1047:0x070f, B:989:0x05f5, B:986:0x05d6, B:984:0x05cd, B:877:0x03f4, B:864:0x03b4, B:848:0x0364, B:834:0x032d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zza(T r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.zzij r40) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzij):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0647 A[LOOP:2: B:446:0x0643->B:448:0x0647, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x065c  */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.measurement.zzlr] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r28, com.google.android.gms.internal.measurement.zzlr r29, com.google.android.gms.internal.measurement.zzjg r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlr, com.google.android.gms.internal.measurement.zzjg):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:700:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:880:0x0b86  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.measurement.zznb r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zznb):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t2, T t3) {
        zzf(t2);
        t3.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzc = zzc(i2);
            long j2 = (1048575 + iZzc) - (1048575 | iZzc);
            int i3 = this.zzc[i2];
            switch (((-1) - (((-1) - iZzc) | ((-1) - 267386880))) >>> 20) {
                case 0:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza(t2, j2, zzml.zza(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 1:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzb(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 2:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 3:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 4:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 5:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 6:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 7:
                    if (zzc((Object) t3, i2)) {
                        zzml.zzc(t2, j2, zzml.zzh(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 8:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza(t2, j2, zzml.zze(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 9:
                    zza(t2, t3, i2);
                    break;
                case 10:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza(t2, j2, zzml.zze(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 11:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 12:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 13:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 14:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 15:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 16:
                    if (zzc((Object) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((Object) t2, i2);
                    }
                    break;
                case 17:
                    zza(t2, t3, i2);
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
                    this.zzo.zza(t2, t3, j2);
                    break;
                case 50:
                    zzlw.zza(this.zzr, t2, t3, j2);
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
                    if (zzc(t3, i3, i2)) {
                        zzml.zza(t2, j2, zzml.zze(t3, j2));
                        zzb(t2, i3, i2);
                    }
                    break;
                case 60:
                    zzb(t2, t3, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc(t3, i3, i2)) {
                        zzml.zza(t2, j2, zzml.zze(t3, j2));
                        zzb(t2, i3, i2);
                    }
                    break;
                case 68:
                    zzb(t2, t3, i2);
                    break;
            }
        }
        zzlw.zza(this.zzp, t2, t3);
        if (this.zzh) {
            zzlw.zza(this.zzq, t2, t3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t2, byte[] bArr, int i2, int i3, zzij zzijVar) throws IOException {
        zza(t2, bArr, i2, i3, 0, zzijVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(T t2) {
        int i2;
        int iHashCode;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzc = zzc(i4);
            int i5 = this.zzc[i4];
            long j2 = 1048575 & iZzc;
            int iHashCode2 = 37;
            switch (((-1) - (((-1) - iZzc) | ((-1) - 267386880))) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    iHashCode = zzjv.zza(Double.doubleToLongBits(zzml.zza(t2, j2)));
                    i3 = i2 + iHashCode;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iHashCode = Float.floatToIntBits(zzml.zzb(t2, j2));
                    i3 = i2 + iHashCode;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iHashCode = zzjv.zza(zzml.zzd(t2, j2));
                    i3 = i2 + iHashCode;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iHashCode = zzjv.zza(zzml.zzd(t2, j2));
                    i3 = i2 + iHashCode;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iHashCode = zzml.zzc(t2, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iHashCode = zzjv.zza(zzml.zzd(t2, j2));
                    i3 = i2 + iHashCode;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iHashCode = zzml.zzc(t2, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iHashCode = zzjv.zza(zzml.zzh(t2, j2));
                    i3 = i2 + iHashCode;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iHashCode = ((String) zzml.zze(t2, j2)).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 9:
                    Object objZze = zzml.zze(t2, j2);
                    if (objZze != null) {
                        iHashCode2 = objZze.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode2;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iHashCode = zzml.zze(t2, j2).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iHashCode = zzml.zzc(t2, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iHashCode = zzml.zzc(t2, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iHashCode = zzml.zzc(t2, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iHashCode = zzjv.zza(zzml.zzd(t2, j2));
                    i3 = i2 + iHashCode;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iHashCode = zzml.zzc(t2, j2);
                    i3 = i2 + iHashCode;
                    break;
                case 16:
                    i2 = i3 * 53;
                    iHashCode = zzjv.zza(zzml.zzd(t2, j2));
                    i3 = i2 + iHashCode;
                    break;
                case 17:
                    Object objZze2 = zzml.zze(t2, j2);
                    if (objZze2 != null) {
                        iHashCode2 = objZze2.hashCode();
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
                    iHashCode = zzml.zze(t2, j2).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iHashCode = zzml.zze(t2, j2).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 51:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzjv.zza(Double.doubleToLongBits(zza(t2, j2)));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 52:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Float.floatToIntBits(zzb(t2, j2));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 53:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzjv.zza(zzd(t2, j2));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 54:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzjv.zza(zzd(t2, j2));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 55:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzc(t2, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 56:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzjv.zza(zzd(t2, j2));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 57:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzc(t2, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 58:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzjv.zza(zze(t2, j2));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 59:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = ((String) zzml.zze(t2, j2)).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 60:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzml.zze(t2, j2).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 61:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzml.zze(t2, j2).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 62:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzc(t2, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 63:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzc(t2, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 64:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzc(t2, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 65:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzjv.zza(zzd(t2, j2));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 66:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzc(t2, j2);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 67:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzjv.zza(zzd(t2, j2));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 68:
                    if (zzc(t2, i5, i4)) {
                        i2 = i3 * 53;
                        iHashCode = zzml.zze(t2, j2).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
            }
        }
        int iHashCode3 = (i3 * 53) + this.zzp.zzd(t2).hashCode();
        return this.zzh ? (iHashCode3 * 53) + this.zzq.zza(t2).hashCode() : iHashCode3;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x01d4  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r11, T r12) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0078  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(T r8) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zzd(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00db  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.google.android.gms.internal.measurement.zzlu] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.measurement.zzlu] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(T r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zze(java.lang.Object):boolean");
    }
}
