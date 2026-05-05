package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzds<T> implements zzef<T> {
    private static final Unsafe zzmh = zzfd.zzef();
    private final int[] zzmi;
    private final Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final zzdo zzmn;
    private final boolean zzmo;
    private final boolean zzmp;
    private final boolean zzmq;
    private final boolean zzmr;
    private final int[] zzms;
    private final int[] zzmt;
    private final int[] zzmu;
    private final zzdw zzmv;
    private final zzcy zzmw;
    private final zzex<?, ?> zzmx;
    private final zzbu<?> zzmy;
    private final zzdj zzmz;

    private zzds(int[] iArr, Object[] objArr, int i2, int i3, int i4, zzdo zzdoVar, boolean z2, boolean z3, int[] iArr2, int[] iArr3, int[] iArr4, zzdw zzdwVar, zzcy zzcyVar, zzex<?, ?> zzexVar, zzbu<?> zzbuVar, zzdj zzdjVar) {
        this.zzmi = iArr;
        this.zzmj = objArr;
        this.zzmk = i2;
        this.zzml = i3;
        this.zzmm = i4;
        this.zzmp = zzdoVar instanceof zzcg;
        this.zzmq = z2;
        this.zzmo = zzbuVar != null && zzbuVar.zze(zzdoVar);
        this.zzmr = false;
        this.zzms = iArr2;
        this.zzmt = iArr3;
        this.zzmu = iArr4;
        this.zzmv = zzdwVar;
        this.zzmw = zzcyVar;
        this.zzmx = zzexVar;
        this.zzmy = zzbuVar;
        this.zzmn = zzdoVar;
        this.zzmz = zzdjVar;
    }

    private static int zza(int i2, byte[] bArr, int i3, int i4, Object obj, zzay zzayVar) throws IOException {
        return zzax.zza(i2, bArr, i3, i4, zzn(obj), zzayVar);
    }

    private static int zza(zzef<?> zzefVar, int i2, byte[] bArr, int i3, int i4, zzcn<?> zzcnVar, zzay zzayVar) throws IOException {
        int iZza = zza((zzef) zzefVar, bArr, i3, i4, zzayVar);
        while (true) {
            zzcnVar.add(zzayVar.zzff);
            if (iZza >= i4) {
                break;
            }
            int iZza2 = zzax.zza(bArr, iZza, zzayVar);
            if (i2 != zzayVar.zzfd) {
                break;
            }
            iZza = zza((zzef) zzefVar, bArr, iZza2, i4, zzayVar);
        }
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzef zzefVar, byte[] bArr, int i2, int i3, int i4, zzay zzayVar) throws IOException {
        zzds zzdsVar = (zzds) zzefVar;
        Object objNewInstance = zzdsVar.newInstance();
        int iZza = zzdsVar.zza(objNewInstance, bArr, i2, i3, i4, zzayVar);
        zzdsVar.zzc(objNewInstance);
        zzayVar.zzff = objNewInstance;
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzef zzefVar, byte[] bArr, int i2, int i3, zzay zzayVar) throws IOException {
        int iZza = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZza = zzax.zza(i4, bArr, iZza, zzayVar);
            i4 = zzayVar.zzfd;
        }
        if (i4 < 0 || i4 > i3 - iZza) {
            throw zzco.zzbl();
        }
        Object objNewInstance = zzefVar.newInstance();
        int i5 = i4 + iZza;
        zzefVar.zza(objNewInstance, bArr, iZza, i5, zzayVar);
        zzefVar.zzc(objNewInstance);
        zzayVar.zzff = objNewInstance;
        return i5;
    }

    private static <UT, UB> int zza(zzex<UT, UB> zzexVar, T t2) {
        return zzexVar.zzm(zzexVar.zzq(t2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zza(T t2, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzay zzayVar) throws IOException {
        Object objZza;
        long jZza;
        int iZzm;
        int i10;
        Object objValueOf;
        Object objValueOf2;
        int iZza = i2;
        Unsafe unsafe = zzmh;
        long j3 = this.zzmi[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    objValueOf2 = Double.valueOf(zzax.zze(bArr, iZza));
                    unsafe.putObject(t2, j2, objValueOf2);
                    iZza += 8;
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 52:
                if (i6 == 5) {
                    objValueOf = Float.valueOf(zzax.zzf(bArr, iZza));
                    unsafe.putObject(t2, j2, objValueOf);
                    iZza += 4;
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 53:
            case 54:
                if (i6 == 0) {
                    iZza = zzax.zzb(bArr, iZza, zzayVar);
                    jZza = zzayVar.zzfe;
                    objZza = Long.valueOf(jZza);
                    unsafe.putObject(t2, j2, objZza);
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 55:
            case 62:
                if (i6 == 0) {
                    iZza = zzax.zza(bArr, iZza, zzayVar);
                    iZzm = zzayVar.zzfd;
                    objZza = Integer.valueOf(iZzm);
                    unsafe.putObject(t2, j2, objZza);
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 56:
            case 65:
                if (i6 == 1) {
                    objValueOf2 = Long.valueOf(zzax.zzd(bArr, iZza));
                    unsafe.putObject(t2, j2, objValueOf2);
                    iZza += 8;
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 57:
            case 64:
                if (i6 == 5) {
                    objValueOf = Integer.valueOf(zzax.zzc(bArr, iZza));
                    unsafe.putObject(t2, j2, objValueOf);
                    iZza += 4;
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 58:
                if (i6 == 0) {
                    iZza = zzax.zzb(bArr, iZza, zzayVar);
                    objZza = Boolean.valueOf(zzayVar.zzfe != 0);
                    unsafe.putObject(t2, j2, objZza);
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 59:
                if (i6 == 2) {
                    iZza = zzax.zza(bArr, iZza, zzayVar);
                    i10 = zzayVar.zzfd;
                    if (i10 == 0) {
                        objZza = "";
                        unsafe.putObject(t2, j2, objZza);
                        unsafe.putInt(t2, j3, i5);
                    } else {
                        if ((-1) - (((-1) - i7) | ((-1) - 536870912)) != 0 && !zzff.zze(bArr, iZza, iZza + i10)) {
                            throw zzco.zzbp();
                        }
                        unsafe.putObject(t2, j2, new String(bArr, iZza, i10, zzci.UTF_8));
                        iZza += i10;
                        unsafe.putInt(t2, j3, i5);
                    }
                }
                return iZza;
            case 60:
                if (i6 == 2) {
                    iZza = zza(zzad(i9), bArr, iZza, i3, zzayVar);
                    Object object = unsafe.getInt(t2, j3) == i5 ? unsafe.getObject(t2, j2) : null;
                    objZza = zzayVar.zzff;
                    if (object != null) {
                        objZza = zzci.zza(object, objZza);
                    }
                    unsafe.putObject(t2, j2, objZza);
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 61:
                if (i6 == 2) {
                    iZza = zzax.zza(bArr, iZza, zzayVar);
                    i10 = zzayVar.zzfd;
                    if (i10 == 0) {
                        objZza = zzbb.zzfi;
                        unsafe.putObject(t2, j2, objZza);
                        unsafe.putInt(t2, j3, i5);
                    } else {
                        unsafe.putObject(t2, j2, zzbb.zzb(bArr, iZza, i10));
                        iZza += i10;
                        unsafe.putInt(t2, j3, i5);
                    }
                }
                return iZza;
            case 63:
                if (i6 == 0) {
                    iZza = zzax.zza(bArr, iZza, zzayVar);
                    int i11 = zzayVar.zzfd;
                    zzck<?> zzckVarZzaf = zzaf(i9);
                    if (zzckVarZzaf == null || zzckVarZzaf.zzb(i11) != null) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i11));
                        unsafe.putInt(t2, j3, i5);
                    } else {
                        zzn(t2).zzb(i4, Long.valueOf(i11));
                    }
                }
                return iZza;
            case 66:
                if (i6 == 0) {
                    iZza = zzax.zza(bArr, iZza, zzayVar);
                    iZzm = zzbk.zzm(zzayVar.zzfd);
                    objZza = Integer.valueOf(iZzm);
                    unsafe.putObject(t2, j2, objZza);
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 67:
                if (i6 == 0) {
                    iZza = zzax.zzb(bArr, iZza, zzayVar);
                    jZza = zzbk.zza(zzayVar.zzfe);
                    objZza = Long.valueOf(jZza);
                    unsafe.putObject(t2, j2, objZza);
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            case 68:
                if (i6 == 3) {
                    iZza = zza(zzad(i9), bArr, iZza, i3, (i4 & (-8)) | 4, zzayVar);
                    Object object2 = unsafe.getInt(t2, j3) == i5 ? unsafe.getObject(t2, j2) : null;
                    objZza = zzayVar.zzff;
                    if (object2 != null) {
                        objZza = zzci.zza(object2, objZza);
                    }
                    unsafe.putObject(t2, j2, objZza);
                    unsafe.putInt(t2, j3, i5);
                }
                return iZza;
            default:
                return iZza;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:391:0x0194, code lost:
    
        if (r30.zzfe != 0) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0196, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0197, code lost:
    
        r14.addBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x019a, code lost:
    
        if (r12 >= r20) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x019c, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r18, r12, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01a2, code lost:
    
        if (r21 != r30.zzfd) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01a4, code lost:
    
        r12 = com.google.android.gms.internal.clearcut.zzax.zzb(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01ac, code lost:
    
        if (r30.zzfe == 0) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x01af, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x024c, code lost:
    
        if (r1 == 0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x024e, code lost:
    
        r14.add(com.google.android.gms.internal.clearcut.zzbb.zzfi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0253, code lost:
    
        if (r3 >= r20) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0255, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r18, r3, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x025b, code lost:
    
        if (r21 != r30.zzfd) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x025d, code lost:
    
        r3 = com.google.android.gms.internal.clearcut.zzax.zza(r18, r1, r30);
        r1 = r30.zzfd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0263, code lost:
    
        if (r1 != 0) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0266, code lost:
    
        r14.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r18, r3, r1));
        r3 = r3 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0197, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0253, code lost:
    
        r14.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r18, r3, r1));
        r3 = r3 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:408:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0203  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:398:0x01ac -> B:392:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:411:0x01df -> B:406:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:423:0x0211 -> B:418:0x01fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:442:0x0263 -> B:437:0x024e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.clearcut.zzay r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.zzay):int");
    }

    private final <K, V> int zza(T t2, byte[] bArr, int i2, int i3, int i4, int i5, long j2, zzay zzayVar) throws IOException {
        Unsafe unsafe = zzmh;
        Object objZzae = zzae(i4);
        Object object = unsafe.getObject(t2, j2);
        if (this.zzmz.zzi(object)) {
            Object objZzk = this.zzmz.zzk(objZzae);
            this.zzmz.zzb(objZzk, object);
            unsafe.putObject(t2, j2, objZzk);
            object = objZzk;
        }
        zzdh<?, ?> zzdhVarZzl = this.zzmz.zzl(objZzae);
        Map<?, ?> mapZzg = this.zzmz.zzg(object);
        int iZza = zzax.zza(bArr, i2, zzayVar);
        int i6 = zzayVar.zzfd;
        if (i6 < 0 || i6 > i3 - iZza) {
            throw zzco.zzbl();
        }
        int i7 = i6 + iZza;
        K k2 = zzdhVarZzl.zzmc;
        V v2 = zzdhVarZzl.zzdu;
        while (iZza < i7) {
            int iZza2 = iZza + 1;
            int i8 = bArr[iZza];
            if (i8 < 0) {
                iZza2 = zzax.zza(i8, bArr, iZza2, zzayVar);
                i8 = zzayVar.zzfd;
            }
            int i9 = i8 >>> 3;
            int i10 = (-1) - (((-1) - i8) | ((-1) - 7));
            if (i9 != 1) {
                if (i9 == 2 && i10 == zzdhVarZzl.zzmd.zzel()) {
                    iZza = zza(bArr, iZza2, i3, zzdhVarZzl.zzmd, zzdhVarZzl.zzdu.getClass(), zzayVar);
                    v2 = zzayVar.zzff;
                } else {
                    iZza = zzax.zza(i8, bArr, iZza2, i3, zzayVar);
                }
            } else if (i10 == zzdhVarZzl.zzmb.zzel()) {
                iZza = zza(bArr, iZza2, i3, zzdhVarZzl.zzmb, (Class<?>) null, zzayVar);
                k2 = (K) zzayVar.zzff;
            } else {
                iZza = zzax.zza(i8, bArr, iZza2, i3, zzayVar);
            }
        }
        if (iZza != i7) {
            throw zzco.zzbo();
        }
        mapZzg.put(k2, v2);
        return i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:225:0x008e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0097 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r49, byte[] r50, int r51, int r52, int r53, com.google.android.gms.internal.clearcut.zzay r54) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.zzay):int");
    }

    private static int zza(byte[] bArr, int i2, int i3, zzfl zzflVar, Class<?> cls, zzay zzayVar) throws IOException {
        int iZzb;
        long jZza;
        int iZzm;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        switch (zzdt.zzgq[zzflVar.ordinal()]) {
            case 1:
                iZzb = zzax.zzb(bArr, i2, zzayVar);
                objValueOf = Boolean.valueOf(zzayVar.zzfe != 0);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 2:
                return zzax.zze(bArr, i2, zzayVar);
            case 3:
                objValueOf3 = Double.valueOf(zzax.zze(bArr, i2));
                zzayVar.zzff = objValueOf3;
                return i2 + 8;
            case 4:
            case 5:
                objValueOf2 = Integer.valueOf(zzax.zzc(bArr, i2));
                zzayVar.zzff = objValueOf2;
                return i2 + 4;
            case 6:
            case 7:
                objValueOf3 = Long.valueOf(zzax.zzd(bArr, i2));
                zzayVar.zzff = objValueOf3;
                return i2 + 8;
            case 8:
                objValueOf2 = Float.valueOf(zzax.zzf(bArr, i2));
                zzayVar.zzff = objValueOf2;
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                iZzb = zzax.zza(bArr, i2, zzayVar);
                iZzm = zzayVar.zzfd;
                objValueOf = Integer.valueOf(iZzm);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 12:
            case 13:
                iZzb = zzax.zzb(bArr, i2, zzayVar);
                jZza = zzayVar.zzfe;
                objValueOf = Long.valueOf(jZza);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 14:
                return zza((zzef) zzea.zzcm().zze(cls), bArr, i2, i3, zzayVar);
            case 15:
                iZzb = zzax.zza(bArr, i2, zzayVar);
                iZzm = zzbk.zzm(zzayVar.zzfd);
                objValueOf = Integer.valueOf(iZzm);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 16:
                iZzb = zzax.zzb(bArr, i2, zzayVar);
                jZza = zzbk.zza(zzayVar.zzfe);
                objValueOf = Long.valueOf(jZza);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 17:
                return zzax.zzd(bArr, i2, zzayVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    static <T> zzds<T> zza(Class<T> cls, zzdm zzdmVar, zzdw zzdwVar, zzcy zzcyVar, zzex<?, ?> zzexVar, zzbu<?> zzbuVar, zzdj zzdjVar) {
        int iZzcp;
        int iZzcq;
        int iZzcu;
        int iZza;
        int iZza2;
        int iZzdg;
        if (!(zzdmVar instanceof zzec)) {
            ((zzes) zzdmVar).zzcf();
            throw new NoSuchMethodError();
        }
        zzec zzecVar = (zzec) zzdmVar;
        boolean z2 = zzecVar.zzcf() == zzcg.zzg.zzkm;
        if (zzecVar.getFieldCount() == 0) {
            iZzcu = 0;
            iZzcp = 0;
            iZzcq = 0;
        } else {
            iZzcp = zzecVar.zzcp();
            iZzcq = zzecVar.zzcq();
            iZzcu = zzecVar.zzcu();
        }
        int[] iArr = new int[iZzcu << 2];
        Object[] objArr = new Object[iZzcu << 1];
        int[] iArr2 = zzecVar.zzcr() > 0 ? new int[zzecVar.zzcr()] : null;
        int[] iArr3 = zzecVar.zzcs() > 0 ? new int[zzecVar.zzcs()] : null;
        zzed zzedVarZzco = zzecVar.zzco();
        if (zzedVarZzco.next()) {
            int iZzcx = zzedVarZzco.zzcx();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (iZzcx >= zzecVar.zzcv() || i2 >= ((iZzcx - iZzcp) << 2)) {
                    if (zzedVarZzco.zzda()) {
                        iZza = (int) zzfd.zza(zzedVarZzco.zzdb());
                        iZza2 = (int) zzfd.zza(zzedVarZzco.zzdc());
                        iZzdg = 0;
                    } else {
                        iZza = (int) zzfd.zza(zzedVarZzco.zzdd());
                        if (zzedVarZzco.zzde()) {
                            iZza2 = (int) zzfd.zza(zzedVarZzco.zzdf());
                            iZzdg = zzedVarZzco.zzdg();
                        } else {
                            iZza2 = 0;
                            iZzdg = 0;
                        }
                    }
                    iArr[i2] = zzedVarZzco.zzcx();
                    int i5 = i2 + 1;
                    iArr[i5] = (-1) - (((-1) - (((-1) - (((-1) - (zzedVarZzco.zzdi() ? 536870912 : 0)) & ((-1) - (zzedVarZzco.zzdh() ? 268435456 : 0)))) | (zzedVarZzco.zzcy() << 20))) & ((-1) - iZza));
                    iArr[i2 + 2] = iZza2 | (iZzdg << 20);
                    if (zzedVarZzco.zzdl() != null) {
                        int i6 = (i2 / 4) << 1;
                        objArr[i6] = zzedVarZzco.zzdl();
                        if (zzedVarZzco.zzdj() != null) {
                            objArr[i6 + 1] = zzedVarZzco.zzdj();
                        } else if (zzedVarZzco.zzdk() != null) {
                            objArr[i6 + 1] = zzedVarZzco.zzdk();
                        }
                    } else if (zzedVarZzco.zzdj() != null) {
                        objArr[((i2 / 4) << 1) + 1] = zzedVarZzco.zzdj();
                    } else if (zzedVarZzco.zzdk() != null) {
                        objArr[((i2 / 4) << 1) + 1] = zzedVarZzco.zzdk();
                    }
                    int iZzcy = zzedVarZzco.zzcy();
                    if (iZzcy == zzcb.MAP.ordinal()) {
                        iArr2[i3] = i2;
                        i3++;
                    } else if (iZzcy >= 18 && iZzcy <= 49) {
                        int i7 = iArr[i5];
                        iArr3[i4] = (i7 + 1048575) - (i7 | 1048575);
                        i4++;
                    }
                    if (!zzedVarZzco.next()) {
                        break;
                    }
                    iZzcx = zzedVarZzco.zzcx();
                } else {
                    for (int i8 = 0; i8 < 4; i8++) {
                        iArr[i2 + i8] = -1;
                    }
                }
                i2 += 4;
            }
        }
        return new zzds<>(iArr, objArr, iZzcp, iZzcq, zzecVar.zzcv(), zzecVar.zzch(), z2, false, zzecVar.zzct(), iArr2, iArr3, zzdwVar, zzcyVar, zzexVar, zzbuVar, zzdjVar);
    }

    private final <K, V, UT, UB> UB zza(int i2, int i3, Map<K, V> map, zzck<?> zzckVar, UB ub, zzex<UT, UB> zzexVar) {
        zzdh<?, ?> zzdhVarZzl = this.zzmz.zzl(zzae(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (zzckVar.zzb(((Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = zzexVar.zzdz();
                }
                zzbg zzbgVarZzk = zzbb.zzk(zzdg.zza(zzdhVarZzl, next.getKey(), next.getValue()));
                try {
                    zzdg.zza(zzbgVarZzk.zzae(), zzdhVarZzl, next.getKey(), next.getValue());
                    zzexVar.zza(ub, i3, zzbgVarZzk.zzad());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private static void zza(int i2, Object obj, zzfr zzfrVar) throws IOException {
        if (obj instanceof String) {
            zzfrVar.zza(i2, (String) obj);
        } else {
            zzfrVar.zza(i2, (zzbb) obj);
        }
    }

    private static <UT, UB> void zza(zzex<UT, UB> zzexVar, T t2, zzfr zzfrVar) throws IOException {
        zzexVar.zza(zzexVar.zzq(t2), zzfrVar);
    }

    private final <K, V> void zza(zzfr zzfrVar, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            zzfrVar.zza(i2, this.zzmz.zzl(zzae(i3)), this.zzmz.zzh(obj));
        }
    }

    private final void zza(T t2, T t3, int i2) {
        int iZzag = zzag(i2);
        long j2 = (iZzag + 1048575) - (iZzag | 1048575);
        if (zza(t3, i2)) {
            Object objZzo = zzfd.zzo(t2, j2);
            Object objZzo2 = zzfd.zzo(t3, j2);
            if (objZzo != null && objZzo2 != null) {
                zzfd.zza(t2, j2, zzci.zza(objZzo, objZzo2));
                zzb(t2, i2);
            } else if (objZzo2 != null) {
                zzfd.zza(t2, j2, objZzo2);
                zzb(t2, i2);
            }
        }
    }

    private final boolean zza(T t2, int i2) {
        if (!this.zzmq) {
            int iZzah = zzah(i2);
            return (-1) - (((-1) - zzfd.zzj(t2, (long) ((-1) - (((-1) - iZzah) | ((-1) - 1048575))))) | ((-1) - (1 << (iZzah >>> 20)))) != 0;
        }
        int iZzag = zzag(i2);
        long j2 = (iZzag + 1048575) - (iZzag | 1048575);
        switch (((iZzag + 267386880) - (iZzag | 267386880)) >>> 20) {
            case 0:
                return zzfd.zzn(t2, j2) != 0.0d;
            case 1:
                return zzfd.zzm(t2, j2) != 0.0f;
            case 2:
                return zzfd.zzk(t2, j2) != 0;
            case 3:
                return zzfd.zzk(t2, j2) != 0;
            case 4:
                return zzfd.zzj(t2, j2) != 0;
            case 5:
                return zzfd.zzk(t2, j2) != 0;
            case 6:
                return zzfd.zzj(t2, j2) != 0;
            case 7:
                return zzfd.zzl(t2, j2);
            case 8:
                Object objZzo = zzfd.zzo(t2, j2);
                if (objZzo instanceof String) {
                    return !((String) objZzo).isEmpty();
                }
                if (objZzo instanceof zzbb) {
                    return !zzbb.zzfi.equals(objZzo);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfd.zzo(t2, j2) != null;
            case 10:
                return !zzbb.zzfi.equals(zzfd.zzo(t2, j2));
            case 11:
                return zzfd.zzj(t2, j2) != 0;
            case 12:
                return zzfd.zzj(t2, j2) != 0;
            case 13:
                return zzfd.zzj(t2, j2) != 0;
            case 14:
                return zzfd.zzk(t2, j2) != 0;
            case 15:
                return zzfd.zzj(t2, j2) != 0;
            case 16:
                return zzfd.zzk(t2, j2) != 0;
            case 17:
                return zzfd.zzo(t2, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t2, int i2, int i3) {
        return zzfd.zzj(t2, (long) (zzah(i3) & 1048575)) == i2;
    }

    private final boolean zza(T t2, int i2, int i3, int i4) {
        return this.zzmq ? zza(t2, i2) : (-1) - (((-1) - i3) | ((-1) - i4)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i2, zzef zzefVar) {
        return zzefVar.zzo(zzfd.zzo(obj, (i2 + 1048575) - (i2 | 1048575)));
    }

    private final zzef zzad(int i2) {
        int i3 = (i2 / 4) << 1;
        zzef zzefVar = (zzef) this.zzmj[i3];
        if (zzefVar != null) {
            return zzefVar;
        }
        zzef<T> zzefVarZze = zzea.zzcm().zze((Class) this.zzmj[i3 + 1]);
        this.zzmj[i3] = zzefVarZze;
        return zzefVarZze;
    }

    private final Object zzae(int i2) {
        return this.zzmj[(i2 / 4) << 1];
    }

    private final zzck<?> zzaf(int i2) {
        return (zzck) this.zzmj[((i2 / 4) << 1) + 1];
    }

    private final int zzag(int i2) {
        return this.zzmi[i2 + 1];
    }

    private final int zzah(int i2) {
        return this.zzmi[i2 + 2];
    }

    private final int zzai(int i2) {
        int i3 = this.zzmk;
        if (i2 >= i3) {
            int i4 = this.zzmm;
            if (i2 < i4) {
                int i5 = (i2 - i3) << 2;
                if (this.zzmi[i5] == i2) {
                    return i5;
                }
                return -1;
            }
            if (i2 <= this.zzml) {
                int i6 = i4 - i3;
                int length = (this.zzmi.length / 4) - 1;
                while (i6 <= length) {
                    int i7 = (length + i6) >>> 1;
                    int i8 = i7 << 2;
                    int i9 = this.zzmi[i8];
                    if (i2 == i9) {
                        return i8;
                    }
                    if (i2 < i9) {
                        length = i7 - 1;
                    } else {
                        i6 = i7 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void zzb(T t2, int i2) {
        if (this.zzmq) {
            return;
        }
        int iZzah = zzah(i2);
        int i3 = 1 << (iZzah >>> 20);
        long j2 = (-1) - (((-1) - iZzah) | ((-1) - 1048575));
        zzfd.zza((Object) t2, j2, (-1) - (((-1) - zzfd.zzj(t2, j2)) & ((-1) - i3)));
    }

    private final void zzb(T t2, int i2, int i3) {
        zzfd.zza((Object) t2, (-1) - (((-1) - zzah(i3)) | ((-1) - 1048575)), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:418:0x04c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r19, com.google.android.gms.internal.clearcut.zzfr r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzb(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    private final void zzb(T t2, T t3, int i2) {
        int iZzag = zzag(i2);
        int i3 = this.zzmi[i2];
        long j2 = iZzag & 1048575;
        if (zza(t3, i3, i2)) {
            Object objZzo = zzfd.zzo(t2, j2);
            Object objZzo2 = zzfd.zzo(t3, j2);
            if (objZzo != null && objZzo2 != null) {
                zzfd.zza(t2, j2, zzci.zza(objZzo, objZzo2));
                zzb(t2, i3, i2);
            } else if (objZzo2 != null) {
                zzfd.zza(t2, j2, objZzo2);
                zzb(t2, i3, i2);
            }
        }
    }

    private final boolean zzc(T t2, T t3, int i2) {
        return zza(t2, i2) == zza(t3, i2);
    }

    private static <E> List<E> zzd(Object obj, long j2) {
        return (List) zzfd.zzo(obj, j2);
    }

    private static <T> double zze(T t2, long j2) {
        return ((Double) zzfd.zzo(t2, j2)).doubleValue();
    }

    private static <T> float zzf(T t2, long j2) {
        return ((Float) zzfd.zzo(t2, j2)).floatValue();
    }

    private static <T> int zzg(T t2, long j2) {
        return ((Integer) zzfd.zzo(t2, j2)).intValue();
    }

    private static <T> long zzh(T t2, long j2) {
        return ((Long) zzfd.zzo(t2, j2)).longValue();
    }

    private static <T> boolean zzi(T t2, long j2) {
        return ((Boolean) zzfd.zzo(t2, j2)).booleanValue();
    }

    private static zzey zzn(Object obj) {
        zzcg zzcgVar = (zzcg) obj;
        zzey zzeyVar = zzcgVar.zzjp;
        if (zzeyVar != zzey.zzea()) {
            return zzeyVar;
        }
        zzey zzeyVarZzeb = zzey.zzeb();
        zzcgVar.zzjp = zzeyVarZzeb;
        return zzeyVarZzeb;
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x01b5  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(T r11, T r12) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0056 A[PHI: r0
  0x0056: PHI (r0v43 java.lang.Object) = (r0v42 java.lang.Object), (r0v44 java.lang.Object) binds: [B:122:0x0054, B:119:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode(T r10) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.hashCode(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final T newInstance() {
        return (T) this.zzmv.newInstance(this.zzmn);
    }

    /* JADX WARN: Removed duplicated region for block: B:716:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:898:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:901:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:904:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:931:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x0adc  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.clearcut.zzfr r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x017b, code lost:
    
        if (r9 == r8) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x017d, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x019b, code lost:
    
        if (r9 == r10) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01bc, code lost:
    
        if (r9 == r10) goto L222;
     */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.clearcut.zzay r36) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.zzay):void");
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t2) {
        int[] iArr = this.zzmt;
        if (iArr != null) {
            for (int i2 : iArr) {
                long jZzag = zzag(i2) & 1048575;
                Object objZzo = zzfd.zzo(t2, jZzag);
                if (objZzo != null) {
                    zzfd.zza(t2, jZzag, this.zzmz.zzj(objZzo));
                }
            }
        }
        int[] iArr2 = this.zzmu;
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                this.zzmw.zza(t2, i3);
            }
        }
        this.zzmx.zzc(t2);
        if (this.zzmo) {
            this.zzmy.zzc(t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x00eb  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(T r7, T r8) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzc(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x048c, code lost:
    
        if ((r14 & r13) != 0) goto L928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x04a0, code lost:
    
        if ((r14 & r13) != 0) goto L937;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x04a6, code lost:
    
        if ((r14 & r13) != 0) goto L940;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x04c8, code lost:
    
        if ((r14 & r13) != 0) goto L952;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x04ce, code lost:
    
        if ((r14 & r13) != 0) goto L956;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x04ed, code lost:
    
        if ((r14 & r13) != 0) goto L967;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x072f, code lost:
    
        if (zza(r18, r4, r6) != false) goto L928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:928:0x0731, code lost:
    
        r0 = com.google.android.gms.internal.clearcut.zzbn.zzc(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x0752, code lost:
    
        if (zza(r18, r4, r6) != false) goto L937;
     */
    /* JADX WARN: Code restructure failed: missing block: B:937:0x0754, code lost:
    
        r0 = com.google.android.gms.internal.clearcut.zzeh.zzc(r4, r5.getObject(r18, r2), zzad(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:939:0x0765, code lost:
    
        if (zza(r18, r4, r6) != false) goto L940;
     */
    /* JADX WARN: Code restructure failed: missing block: B:940:0x0767, code lost:
    
        r1 = r5.getObject(r18, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:951:0x0794, code lost:
    
        if (zza(r18, r4, r6) != false) goto L952;
     */
    /* JADX WARN: Code restructure failed: missing block: B:952:0x0796, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.zzbn.zzk(r4, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:955:0x07a2, code lost:
    
        if (zza(r18, r4, r6) != false) goto L956;
     */
    /* JADX WARN: Code restructure failed: missing block: B:956:0x07a4, code lost:
    
        r0 = com.google.android.gms.internal.clearcut.zzbn.zzh(r4, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:966:0x07cd, code lost:
    
        if (zza(r18, r4, r6) != false) goto L967;
     */
    /* JADX WARN: Code restructure failed: missing block: B:967:0x07cf, code lost:
    
        r0 = com.google.android.gms.internal.clearcut.zzbn.zzc(r4, (com.google.android.gms.internal.clearcut.zzdo) r5.getObject(r18, r2), zzad(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:672:0x027f A[PHI: r12
  0x027f: PHI (r12v30 int) = 
  (r12v17 int)
  (r12v18 int)
  (r12v19 int)
  (r12v20 int)
  (r12v21 int)
  (r12v22 int)
  (r12v23 int)
  (r12v24 int)
  (r12v25 int)
  (r12v26 int)
  (r12v27 int)
  (r12v28 int)
  (r12v29 int)
  (r12v32 int)
 binds: [B:671:0x027d, B:666:0x026c, B:661:0x025b, B:656:0x024a, B:651:0x0239, B:646:0x0228, B:641:0x0217, B:636:0x0206, B:631:0x01f4, B:626:0x01e2, B:621:0x01d0, B:616:0x01be, B:611:0x01ac, B:606:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:708:0x032a A[PHI: r1
  0x032a: PHI (r1v100 java.lang.Object) = (r1v63 java.lang.Object), (r1v103 java.lang.Object) binds: [B:706:0x0327, B:561:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:715:0x034f A[PHI: r1
  0x034f: PHI (r1v97 java.lang.Object) = (r1v63 java.lang.Object), (r1v94 java.lang.Object), (r1v103 java.lang.Object) binds: [B:706:0x0327, B:714:0x034b, B:561:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0408 A[PHI: r15
  0x0408: PHI (r15v15 int) = 
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v5 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v1 int)
  (r15v6 int)
  (r15v1 int)
  (r15v1 int)
 binds: [B:754:0x0405, B:966:0x07cd, B:962:0x07be, B:958:0x07af, B:955:0x07a2, B:951:0x0794, B:947:0x0785, B:943:0x0776, B:939:0x0765, B:936:0x0752, B:930:0x073b, B:927:0x072f, B:924:0x0723, B:921:0x0715, B:918:0x0705, B:915:0x06f5, B:912:0x06e5, B:909:0x06d8, B:906:0x06ca, B:898:0x0690, B:893:0x067f, B:888:0x066e, B:883:0x065d, B:878:0x064c, B:873:0x063b, B:868:0x062a, B:863:0x0619, B:858:0x0607, B:853:0x05f5, B:848:0x05e3, B:843:0x05d1, B:838:0x05bf, B:833:0x05ad, B:815:0x04ed, B:812:0x04e3, B:809:0x04d4, B:806:0x04ce, B:953:0x079b, B:803:0x04c8, B:800:0x04be, B:797:0x04b1, B:794:0x04a6, B:791:0x04a0, B:786:0x0492, B:968:0x07dd, B:783:0x048c, B:780:0x0481] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:901:0x0696 A[PHI: r2
  0x0696: PHI (r2v16 int) = 
  (r2v3 int)
  (r2v4 int)
  (r2v5 int)
  (r2v6 int)
  (r2v7 int)
  (r2v8 int)
  (r2v9 int)
  (r2v10 int)
  (r2v11 int)
  (r2v12 int)
  (r2v13 int)
  (r2v14 int)
  (r2v15 int)
  (r2v18 int)
 binds: [B:900:0x0694, B:895:0x0683, B:890:0x0672, B:885:0x0661, B:880:0x0650, B:875:0x063f, B:870:0x062e, B:865:0x061d, B:860:0x060b, B:855:0x05f9, B:850:0x05e7, B:845:0x05d5, B:840:0x05c3, B:835:0x05b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:934:0x0746 A[PHI: r1
  0x0746: PHI (r1v48 java.lang.Object) = (r1v3 java.lang.Object), (r1v50 java.lang.Object) binds: [B:932:0x0743, B:788:0x049a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:941:0x076b A[PHI: r1
  0x076b: PHI (r1v46 java.lang.Object) = (r1v3 java.lang.Object), (r1v44 java.lang.Object), (r1v50 java.lang.Object) binds: [B:932:0x0743, B:940:0x0767, B:788:0x049a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzm(T r18) {
        /*
            Method dump skipped, instruction units count: 2360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzm(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00d3  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.gms.internal.clearcut.zzef] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.clearcut.zzef] */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzo(T r17) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzo(java.lang.Object):boolean");
    }
}
