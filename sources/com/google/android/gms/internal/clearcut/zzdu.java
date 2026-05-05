package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzdu<T> implements zzef<T> {
    private final zzdo zzmn;
    private final boolean zzmo;
    private final zzex<?, ?> zzmx;
    private final zzbu<?> zzmy;

    private zzdu(zzex<?, ?> zzexVar, zzbu<?> zzbuVar, zzdo zzdoVar) {
        this.zzmx = zzexVar;
        this.zzmo = zzbuVar.zze(zzdoVar);
        this.zzmy = zzbuVar;
        this.zzmn = zzdoVar;
    }

    static <T> zzdu<T> zza(zzex<?, ?> zzexVar, zzbu<?> zzbuVar, zzdo zzdoVar) {
        return new zzdu<>(zzexVar, zzbuVar, zzdoVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean equals(T t2, T t3) {
        if (!this.zzmx.zzq(t2).equals(this.zzmx.zzq(t3))) {
            return false;
        }
        if (this.zzmo) {
            return this.zzmy.zza(t2).equals(this.zzmy.zza(t3));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final int hashCode(T t2) {
        int iHashCode = this.zzmx.zzq(t2).hashCode();
        return this.zzmo ? (iHashCode * 53) + this.zzmy.zza(t2).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final T newInstance() {
        return (T) this.zzmn.zzbd().zzbi();
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zza(T t2, zzfr zzfrVar) throws IOException {
        for (T t3 : this.zzmy.zza(t2)) {
            zzca zzcaVar = (zzca) t3.getKey();
            if (zzcaVar.zzav() != zzfq.MESSAGE || zzcaVar.zzaw() || zzcaVar.zzax()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzfrVar.zza(zzcaVar.zzc(), t3 instanceof zzct ? ((zzct) t3).zzbs().zzr() : t3.getValue());
        }
        zzex<?, ?> zzexVar = this.zzmx;
        zzexVar.zzc(zzexVar.zzq(t2), zzfrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0067 A[EDGE_INSN: B:106:0x0067->B:84:0x0067 BREAK  A[LOOP:1: B:72:0x0036->B:112:0x0036], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004e  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r13, byte[] r14, int r15, int r16, com.google.android.gms.internal.clearcut.zzay r17) throws java.io.IOException {
        /*
            r12 = this;
            r8 = r15
            com.google.android.gms.internal.clearcut.zzcg r13 = (com.google.android.gms.internal.clearcut.zzcg) r13
            com.google.android.gms.internal.clearcut.zzey r10 = r13.zzjp
            com.google.android.gms.internal.clearcut.zzey r0 = com.google.android.gms.internal.clearcut.zzey.zzea()
            if (r10 != r0) goto L11
            com.google.android.gms.internal.clearcut.zzey r10 = com.google.android.gms.internal.clearcut.zzey.zzeb()
            r13.zzjp = r10
        L11:
            r9 = r16
            if (r8 >= r9) goto L73
            r7 = r14
            r11 = r17
            int r8 = com.google.android.gms.internal.clearcut.zzax.zza(r7, r8, r11)
            int r6 = r11.zzfd
            r0 = 11
            r4 = 2
            if (r6 == r0) goto L34
            r0 = 7
            int r1 = r6 + r0
            r0 = r0 | r6
            int r1 = r1 - r0
            if (r1 != r4) goto L2f
            int r8 = com.google.android.gms.internal.clearcut.zzax.zza(r6, r7, r8, r9, r10, r11)
            goto L11
        L2f:
            int r8 = com.google.android.gms.internal.clearcut.zzax.zza(r6, r7, r8, r9, r11)
            goto L11
        L34:
            r6 = 0
            r2 = 0
        L36:
            if (r8 >= r9) goto L67
            int r8 = com.google.android.gms.internal.clearcut.zzax.zza(r7, r8, r11)
            int r5 = r11.zzfd
            int r3 = r5 >>> 3
            r0 = 7
            int r1 = r5 + r0
            r0 = r0 | r5
            int r1 = r1 - r0
            if (r3 == r4) goto L5e
            r0 = 3
            if (r3 == r0) goto L53
        L4a:
            r0 = 12
            if (r5 == r0) goto L67
            int r8 = com.google.android.gms.internal.clearcut.zzax.zza(r5, r7, r8, r9, r11)
            goto L36
        L53:
            if (r1 != r4) goto L4a
            int r8 = com.google.android.gms.internal.clearcut.zzax.zze(r7, r8, r11)
            java.lang.Object r2 = r11.zzff
            com.google.android.gms.internal.clearcut.zzbb r2 = (com.google.android.gms.internal.clearcut.zzbb) r2
            goto L36
        L5e:
            if (r1 != 0) goto L4a
            int r8 = com.google.android.gms.internal.clearcut.zzax.zza(r7, r8, r11)
            int r6 = r11.zzfd
            goto L36
        L67:
            if (r2 == 0) goto L72
            int r1 = r6 << 3
            int r0 = r1 + r4
            r1 = r1 & r4
            int r0 = r0 - r1
            r10.zzb(r0, r2)
        L72:
            goto L11
        L73:
            if (r8 != r9) goto L76
            return
        L76:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.zzbo()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzdu.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.zzay):void");
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t2) {
        this.zzmx.zzc(t2);
        this.zzmy.zzc(t2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t2, T t3) {
        zzeh.zza(this.zzmx, t2, t3);
        if (this.zzmo) {
            zzeh.zza(this.zzmy, t2, t3);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final int zzm(T t2) {
        zzex<?, ?> zzexVar = this.zzmx;
        int iZzr = zzexVar.zzr(zzexVar.zzq(t2));
        return this.zzmo ? iZzr + this.zzmy.zza(t2).zzat() : iZzr;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean zzo(T t2) {
        return this.zzmy.zza(t2).isInitialized();
    }
}
