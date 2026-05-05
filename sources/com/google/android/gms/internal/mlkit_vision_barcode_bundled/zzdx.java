package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzdx {
    private static final zzdx zzb = new zzdx(true);
    final zzgo zza = new zzgh();
    private boolean zzc;
    private boolean zzd;

    private zzdx() {
    }

    private zzdx(boolean z2) {
        zzg();
        zzg();
    }

    public static int zza(zzdw zzdwVar, Object obj) {
        int length;
        int iZzA;
        zzhf zzhfVarZzd = zzdwVar.zzd();
        int iZza = zzdwVar.zza();
        zzdwVar.zzg();
        int iZzA2 = zzdn.zzA(iZza << 3);
        if (zzhfVarZzd == zzhf.GROUP) {
            zzfm zzfmVar = (zzfm) obj;
            byte[] bArr = zzep.zzb;
            if (zzfmVar instanceof zzcr) {
                throw null;
            }
            iZzA2 += iZzA2;
        }
        zzhg zzhgVar = zzhg.INT;
        int iZzB = 4;
        switch (zzhfVarZzd) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iZzB = 8;
                return iZzA2 + iZzB;
            case FLOAT:
                ((Float) obj).floatValue();
                return iZzA2 + iZzB;
            case INT64:
                iZzB = zzdn.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case UINT64:
                iZzB = zzdn.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case INT32:
                iZzB = zzdn.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case FIXED64:
                ((Long) obj).longValue();
                iZzB = 8;
                return iZzA2 + iZzB;
            case FIXED32:
                ((Integer) obj).intValue();
                return iZzA2 + iZzB;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iZzB = 1;
                return iZzA2 + iZzB;
            case STRING:
                if (!(obj instanceof zzdf)) {
                    iZzB = zzdn.zzz((String) obj);
                    return iZzA2 + iZzB;
                }
                length = ((zzdf) obj).zzd();
                iZzA = zzdn.zzA(length);
                iZzB = iZzA + length;
                return iZzA2 + iZzB;
            case GROUP:
                iZzB = ((zzfm) obj).zzF();
                return iZzA2 + iZzB;
            case MESSAGE:
                if (!(obj instanceof zzew)) {
                    iZzB = zzdn.zzx((zzfm) obj);
                    return iZzA2 + iZzB;
                }
                length = ((zzew) obj).zza();
                iZzA = zzdn.zzA(length);
                iZzB = iZzA + length;
                return iZzA2 + iZzB;
            case BYTES:
                if (obj instanceof zzdf) {
                    length = ((zzdf) obj).zzd();
                    iZzA = zzdn.zzA(length);
                } else {
                    length = ((byte[]) obj).length;
                    iZzA = zzdn.zzA(length);
                }
                iZzB = iZzA + length;
                return iZzA2 + iZzB;
            case UINT32:
                iZzB = zzdn.zzA(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case ENUM:
                iZzB = obj instanceof zzej ? zzdn.zzB(((zzej) obj).zza()) : zzdn.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iZzA2 + iZzB;
            case SFIXED64:
                ((Long) obj).longValue();
                iZzB = 8;
                return iZzA2 + iZzB;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                iZzB = zzdn.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzA2 + iZzB;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                iZzB = zzdn.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzA2 + iZzB;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzdx zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzfr) {
            return ((zzfr) obj).zzc();
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

    private final void zzm(Map.Entry entry) {
        zzdw zzdwVar = (zzdw) entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof zzew;
        zzdwVar.zzg();
        if (zzdwVar.zze() != zzhg.MESSAGE) {
            if (z2) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzdwVar, zzl(value));
            return;
        }
        Object objZze = zze(zzdwVar);
        if (objZze == null) {
            this.zza.put(zzdwVar, zzl(value));
            if (z2) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z2) {
            throw null;
        }
        this.zza.put(zzdwVar, objZze instanceof zzfr ? zzdwVar.zzc((zzfr) objZze, (zzfr) value) : zzdwVar.zzb(((zzfm) objZze).zzaa(), (zzfm) value).zzj());
    }

    private static boolean zzn(Map.Entry entry) {
        zzdw zzdwVar = (zzdw) entry.getKey();
        if (zzdwVar.zze() != zzhg.MESSAGE) {
            return true;
        }
        zzdwVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzfn) {
            return ((zzfn) value).zzad();
        }
        if (value instanceof zzew) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i2;
        int iZzA;
        int iZzA2;
        zzdw zzdwVar = (zzdw) entry.getKey();
        Object value = entry.getValue();
        if (zzdwVar.zze() != zzhg.MESSAGE) {
            return zza(zzdwVar, value);
        }
        zzdwVar.zzg();
        zzdwVar.zzf();
        if (value instanceof zzew) {
            int iZza = ((zzdw) entry.getKey()).zza();
            int iZzA3 = zzdn.zzA(8);
            i2 = iZzA3 + iZzA3;
            iZzA = zzdn.zzA(16) + zzdn.zzA(iZza);
            int iZzA4 = zzdn.zzA(24);
            int iZza2 = ((zzew) value).zza();
            iZzA2 = iZzA4 + zzdn.zzA(iZza2) + iZza2;
        } else {
            int iZza3 = ((zzdw) entry.getKey()).zza();
            int iZzA5 = zzdn.zzA(8);
            i2 = iZzA5 + iZzA5;
            iZzA = zzdn.zzA(16) + zzdn.zzA(iZza3);
            iZzA2 = zzdn.zzA(24) + zzdn.zzx((zzfm) value);
        }
        return i2 + iZzA + iZzA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdx) {
            return this.zza.equals(((zzdx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzc = this.zza.zzc();
        int iZzo = 0;
        for (int i2 = 0; i2 < iZzc; i2++) {
            iZzo += zzo(this.zza.zzg(i2));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc */
    public final zzdx clone() {
        zzdx zzdxVar = new zzdx();
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            zzdxVar.zzi((zzdw) ((zzgi) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzdxVar.zzi((zzdw) entry.getKey(), entry.getValue());
        }
        zzdxVar.zzd = this.zzd;
        return zzdxVar;
    }

    public final Object zze(zzdw zzdwVar) {
        Object obj = this.zza.get(zzdwVar);
        if (!(obj instanceof zzew)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzev(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            if (entryZzg.getValue() instanceof zzeh) {
                ((zzeh) entryZzg.getValue()).zzT();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzdx zzdxVar) {
        int iZzc = zzdxVar.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            zzm(zzdxVar.zza.zzg(i2));
        }
        Iterator it = zzdxVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0054, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005d, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x006f, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.zzg()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r1 = r5.zzd()
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzep.zzb
            r6.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf.DOUBLE
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r0 = r1.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L46;
                case 2: goto L49;
                case 3: goto L4c;
                case 4: goto L4f;
                case 5: goto L52;
                case 6: goto L57;
                case 7: goto L60;
                case 8: goto L69;
                default: goto L1b;
            }
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            int r0 = r5.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r0 = r5.zzd()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r1 = r0.zza()
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r3.<init>(r0)
            throw r3
        L43:
            boolean r0 = r6 instanceof java.lang.Integer
            goto L54
        L46:
            boolean r0 = r6 instanceof java.lang.Long
            goto L54
        L49:
            boolean r0 = r6 instanceof java.lang.Float
            goto L54
        L4c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L54
        L4f:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L54
        L52:
            boolean r0 = r6 instanceof java.lang.String
        L54:
            if (r0 == 0) goto L1b
            goto L71
        L57:
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
            if (r0 != 0) goto L71
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L1b
            goto L71
        L60:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L71
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej
            if (r0 == 0) goto L1b
            goto L71
        L69:
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
            if (r0 != 0) goto L71
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
            if (r0 == 0) goto L1b
        L71:
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
            if (r0 == 0) goto L78
            r0 = 1
            r4.zzd = r0
        L78:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgo r0 = r4.zza
            r0.put(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx.zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            if (!zzn(this.zza.zzg(i2))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
