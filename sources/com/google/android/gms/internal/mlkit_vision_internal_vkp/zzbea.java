package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbea {
    private static final zzbea zzb = new zzbea(true);
    final zzbgw zza = new zzbgp();
    private boolean zzc;
    private boolean zzd;

    private zzbea() {
    }

    private zzbea(boolean z2) {
        zzh();
        zzh();
    }

    static int zza(zzbhq zzbhqVar, int i2, Object obj) {
        int length;
        int iZzF;
        int iZzF2 = zzbdq.zzF(i2 << 3);
        if (zzbhqVar == zzbhq.GROUP) {
            zzbeu.zzd((zzbfs) obj);
            iZzF2 += iZzF2;
        }
        zzbhr zzbhrVar = zzbhr.INT;
        int iZzG = 4;
        switch (zzbhqVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iZzG = 8;
                return iZzF2 + iZzG;
            case FLOAT:
                ((Float) obj).floatValue();
                return iZzF2 + iZzG;
            case INT64:
                iZzG = zzbdq.zzG(((Long) obj).longValue());
                return iZzF2 + iZzG;
            case UINT64:
                iZzG = zzbdq.zzG(((Long) obj).longValue());
                return iZzF2 + iZzG;
            case INT32:
                iZzG = zzbdq.zzG(((Integer) obj).intValue());
                return iZzF2 + iZzG;
            case FIXED64:
                ((Long) obj).longValue();
                iZzG = 8;
                return iZzF2 + iZzG;
            case FIXED32:
                ((Integer) obj).intValue();
                return iZzF2 + iZzG;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iZzG = 1;
                return iZzF2 + iZzG;
            case STRING:
                if (!(obj instanceof zzbdd)) {
                    iZzG = zzbdq.zzE((String) obj);
                    return iZzF2 + iZzG;
                }
                length = ((zzbdd) obj).zzd();
                iZzF = zzbdq.zzF(length);
                iZzG = iZzF + length;
                return iZzF2 + iZzG;
            case GROUP:
                iZzG = ((zzbfs) obj).zzz();
                return iZzF2 + iZzG;
            case MESSAGE:
                if (!(obj instanceof zzbfb)) {
                    iZzG = zzbdq.zzC((zzbfs) obj);
                    return iZzF2 + iZzG;
                }
                length = ((zzbfb) obj).zza();
                iZzF = zzbdq.zzF(length);
                iZzG = iZzF + length;
                return iZzF2 + iZzG;
            case BYTES:
                if (obj instanceof zzbdd) {
                    length = ((zzbdd) obj).zzd();
                    iZzF = zzbdq.zzF(length);
                } else {
                    length = ((byte[]) obj).length;
                    iZzF = zzbdq.zzF(length);
                }
                iZzG = iZzF + length;
                return iZzF2 + iZzG;
            case UINT32:
                iZzG = zzbdq.zzF(((Integer) obj).intValue());
                return iZzF2 + iZzG;
            case ENUM:
                iZzG = obj instanceof zzben ? zzbdq.zzG(((zzben) obj).zza()) : zzbdq.zzG(((Integer) obj).intValue());
                return iZzF2 + iZzG;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iZzF2 + iZzG;
            case SFIXED64:
                ((Long) obj).longValue();
                iZzG = 8;
                return iZzF2 + iZzG;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                iZzG = zzbdq.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzF2 + iZzG;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                iZzG = zzbdq.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzF2 + iZzG;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzbdz zzbdzVar, Object obj) {
        zzbhq zzbhqVarZzd = zzbdzVar.zzd();
        zzbdzVar.zza();
        zzbdzVar.zzg();
        return zza(zzbhqVarZzd, 32149011, obj);
    }

    public static zzbea zze() {
        return zzb;
    }

    static void zzk(zzbdq zzbdqVar, zzbhq zzbhqVar, int i2, Object obj) throws IOException {
        if (zzbhqVar == zzbhq.GROUP) {
            zzbfs zzbfsVar = (zzbfs) obj;
            zzbeu.zzd(zzbfsVar);
            zzbdqVar.zzv(i2, 3);
            zzbfsVar.zzX(zzbdqVar);
            zzbdqVar.zzv(i2, 4);
            return;
        }
        zzbdqVar.zzv(i2, zzbhqVar.zza());
        zzbhr zzbhrVar = zzbhr.INT;
        switch (zzbhqVar) {
            case DOUBLE:
                zzbdqVar.zzm(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case FLOAT:
                zzbdqVar.zzk(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case INT64:
                zzbdqVar.zzz(((Long) obj).longValue());
                break;
            case UINT64:
                zzbdqVar.zzz(((Long) obj).longValue());
                break;
            case INT32:
                zzbdqVar.zzo(((Integer) obj).intValue());
                break;
            case FIXED64:
                zzbdqVar.zzm(((Long) obj).longValue());
                break;
            case FIXED32:
                zzbdqVar.zzk(((Integer) obj).intValue());
                break;
            case BOOL:
                zzbdqVar.zzN(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof zzbdd)) {
                    zzbdqVar.zzu((String) obj);
                } else {
                    zzbdqVar.zzi((zzbdd) obj);
                }
                break;
            case GROUP:
                ((zzbfs) obj).zzX(zzbdqVar);
                break;
            case MESSAGE:
                zzbdqVar.zzq((zzbfs) obj);
                break;
            case BYTES:
                if (!(obj instanceof zzbdd)) {
                    byte[] bArr = (byte[]) obj;
                    zzbdqVar.zzP(bArr, 0, bArr.length);
                } else {
                    zzbdqVar.zzi((zzbdd) obj);
                }
                break;
            case UINT32:
                zzbdqVar.zzx(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof zzben)) {
                    zzbdqVar.zzo(((Integer) obj).intValue());
                } else {
                    zzbdqVar.zzo(((zzben) obj).zza());
                }
                break;
            case SFIXED32:
                zzbdqVar.zzk(((Integer) obj).intValue());
                break;
            case SFIXED64:
                zzbdqVar.zzm(((Long) obj).longValue());
                break;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                zzbdqVar.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                zzbdqVar.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    private static Object zzn(Object obj) {
        if (obj instanceof zzbfx) {
            return ((zzbfx) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzo(Map.Entry entry) {
        zzbdz zzbdzVar = (zzbdz) entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof zzbfb;
        zzbdzVar.zzg();
        if (zzbdzVar.zze() != zzbhr.MESSAGE) {
            if (z2) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzbdzVar, zzn(value));
            return;
        }
        Object objZzf = zzf(zzbdzVar);
        if (objZzf == null) {
            this.zza.put(zzbdzVar, zzn(value));
            if (z2) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z2) {
            throw null;
        }
        this.zza.put(zzbdzVar, objZzf instanceof zzbfx ? zzbdzVar.zzc((zzbfx) objZzf, (zzbfx) value) : zzbdzVar.zzb(((zzbfs) objZzf).zzW(), (zzbfs) value).zzv());
    }

    private static boolean zzp(Map.Entry entry) {
        zzbdz zzbdzVar = (zzbdz) entry.getKey();
        if (zzbdzVar.zze() != zzbhr.MESSAGE) {
            return true;
        }
        zzbdzVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzbft) {
            return ((zzbft) value).zzA();
        }
        if (value instanceof zzbfb) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzq(Map.Entry entry) {
        int i2;
        int iZzF;
        int iZzF2;
        zzbdz zzbdzVar = (zzbdz) entry.getKey();
        Object value = entry.getValue();
        if (zzbdzVar.zze() != zzbhr.MESSAGE) {
            return zzb(zzbdzVar, value);
        }
        zzbdzVar.zzg();
        zzbdzVar.zzf();
        if (value instanceof zzbfb) {
            ((zzbdz) entry.getKey()).zza();
            int iZzF3 = zzbdq.zzF(8);
            i2 = iZzF3 + iZzF3;
            iZzF = zzbdq.zzF(16) + zzbdq.zzF(32149011);
            int iZzF4 = zzbdq.zzF(24);
            int iZza = ((zzbfb) value).zza();
            iZzF2 = iZzF4 + zzbdq.zzF(iZza) + iZza;
        } else {
            ((zzbdz) entry.getKey()).zza();
            int iZzF5 = zzbdq.zzF(8);
            i2 = iZzF5 + iZzF5;
            iZzF = zzbdq.zzF(16) + zzbdq.zzF(32149011);
            iZzF2 = zzbdq.zzF(24) + zzbdq.zzC((zzbfs) value);
        }
        return i2 + iZzF + iZzF2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbea) {
            return this.zza.equals(((zzbea) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int iZzc = this.zza.zzc();
        int iZzq = 0;
        for (int i2 = 0; i2 < iZzc; i2++) {
            iZzq += zzq(this.zza.zzg(i2));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzq += zzq((Map.Entry) it.next());
        }
        return iZzq;
    }

    /* JADX INFO: renamed from: zzd */
    public final zzbea clone() {
        zzbea zzbeaVar = new zzbea();
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            zzbeaVar.zzj((zzbdz) ((zzbgq) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzbeaVar.zzj((zzbdz) entry.getKey(), entry.getValue());
        }
        zzbeaVar.zzd = this.zzd;
        return zzbeaVar;
    }

    public final Object zzf(zzbdz zzbdzVar) {
        Object obj = this.zza.get(zzbdzVar);
        if (!(obj instanceof zzbfb)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzg() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzbfa(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzh() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            if (entryZzg.getValue() instanceof zzbel) {
                ((zzbel) entryZzg.getValue()).zzP();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzi(zzbea zzbeaVar) {
        int iZzc = zzbeaVar.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            zzo(zzbeaVar.zza.zzg(i2));
        }
        Iterator it = zzbeaVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzo((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0056, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005f, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0068, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.zzben) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0071, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfb) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdz r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.zzg()
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhq r1 = r5.zzd()
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbeu.zzb
            r6.getClass()
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhq r0 = com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhq.DOUBLE
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhr r0 = com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhr.INT
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhr r0 = r1.zzb()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L45;
                case 1: goto L48;
                case 2: goto L4b;
                case 3: goto L4e;
                case 4: goto L51;
                case 5: goto L54;
                case 6: goto L59;
                case 7: goto L62;
                case 8: goto L6b;
                default: goto L1b;
            }
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r5.zza()
            r0 = 32149011(0x1ea8e13, float:8.616189E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhq r0 = r5.zzd()
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhr r1 = r0.zzb()
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r3.<init>(r0)
            throw r3
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
            goto L56
        L48:
            boolean r0 = r6 instanceof java.lang.Long
            goto L56
        L4b:
            boolean r0 = r6 instanceof java.lang.Float
            goto L56
        L4e:
            boolean r0 = r6 instanceof java.lang.Double
            goto L56
        L51:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L56
        L54:
            boolean r0 = r6 instanceof java.lang.String
        L56:
            if (r0 == 0) goto L1b
            goto L73
        L59:
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
            if (r0 != 0) goto L73
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L1b
            goto L73
        L62:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L73
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.zzben
            if (r0 == 0) goto L1b
            goto L73
        L6b:
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfs
            if (r0 != 0) goto L73
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfb
            if (r0 == 0) goto L1b
        L73:
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfb
            if (r0 == 0) goto L7a
            r0 = 1
            r4.zzd = r0
        L7a:
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgw r0 = r4.zza
            r0.put(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbea.zzj(com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdz, java.lang.Object):void");
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final boolean zzm() {
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            if (!zzp(this.zza.zzg(i2))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzp((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
