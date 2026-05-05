package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzkq<T> implements zzlc<T> {
    private final zzkk zza;
    private final zzlu<?, ?> zzb;
    private final boolean zzc;
    private final zziq<?> zzd;

    private zzkq(zzlu<?, ?> zzluVar, zziq<?> zziqVar, zzkk zzkkVar) {
        this.zzb = zzluVar;
        this.zzc = zziqVar.zza(zzkkVar);
        this.zzd = zziqVar;
        this.zza = zzkkVar;
    }

    static <T> zzkq<T> zza(zzlu<?, ?> zzluVar, zziq<?> zziqVar, zzkk zzkkVar) {
        return new zzkq<>(zzluVar, zziqVar, zzkkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zza(T t2) {
        int iHashCode = this.zzb.zzb(t2).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t2).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final T zza() {
        return (T) this.zza.zzq().zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[LOOP:0: B:110:0x000c->B:118:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r11, com.google.android.gms.internal.vision.zzld r12, com.google.android.gms.internal.vision.zzio r13) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.vision.zzlu<?, ?> r5 = r10.zzb
            com.google.android.gms.internal.vision.zziq<?> r7 = r10.zzd
            java.lang.Object r4 = r5.zzc(r11)
            com.google.android.gms.internal.vision.zziu r6 = r7.zzb(r11)
        Lc:
            int r0 = r12.zza()     // Catch: java.lang.Throwable -> L8f
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L19
            r5.zzb(r11, r4)
            return
        L19:
            int r2 = r12.zzb()     // Catch: java.lang.Throwable -> L8f
            r0 = 11
            if (r2 == r0) goto L3f
            r0 = 7
            r1 = r2 & r0
            r0 = 2
            if (r1 != r0) goto L3a
            com.google.android.gms.internal.vision.zzkk r1 = r10.zza     // Catch: java.lang.Throwable -> L8f
            int r0 = r2 >>> 3
            java.lang.Object r0 = r7.zza(r13, r1, r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L35
            r7.zza(r12, r0, r13, r6)     // Catch: java.lang.Throwable -> L8f
            goto L83
        L35:
            boolean r0 = r5.zza(r4, r12)     // Catch: java.lang.Throwable -> L8f
            goto L84
        L3a:
            boolean r0 = r12.zzc()     // Catch: java.lang.Throwable -> L8f
            goto L84
        L3f:
            r8 = 0
            r3 = 0
            r2 = r8
        L42:
            int r0 = r12.zza()     // Catch: java.lang.Throwable -> L8f
            if (r0 == r1) goto L70
            int r9 = r12.zzb()     // Catch: java.lang.Throwable -> L8f
            r0 = 16
            if (r9 != r0) goto L5b
            int r3 = r12.zzo()     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.vision.zzkk r0 = r10.zza     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r8 = r7.zza(r13, r0, r3)     // Catch: java.lang.Throwable -> L8f
            goto L42
        L5b:
            r0 = 26
            if (r9 != r0) goto L6a
            if (r8 == 0) goto L65
            r7.zza(r12, r8, r13, r6)     // Catch: java.lang.Throwable -> L8f
            goto L42
        L65:
            com.google.android.gms.internal.vision.zzht r2 = r12.zzn()     // Catch: java.lang.Throwable -> L8f
            goto L42
        L6a:
            boolean r0 = r12.zzc()     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L42
        L70:
            int r1 = r12.zzb()     // Catch: java.lang.Throwable -> L8f
            r0 = 12
            if (r1 != r0) goto L8a
            if (r2 == 0) goto L83
            if (r8 == 0) goto L80
            r7.zza(r2, r8, r13, r6)     // Catch: java.lang.Throwable -> L8f
            goto L83
        L80:
            r5.zza(r4, r3, r2)     // Catch: java.lang.Throwable -> L8f
        L83:
            r0 = 1
        L84:
            if (r0 != 0) goto Lc
            r5.zzb(r11, r4)
            return
        L8a:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zze()     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L8f:
            r0 = move-exception
            r5.zzb(r11, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzkq.zza(java.lang.Object, com.google.android.gms.internal.vision.zzld, com.google.android.gms.internal.vision.zzio):void");
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zza(T t2, zzmr zzmrVar) throws IOException {
        Iterator itZzd = this.zzd.zza(t2).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zziw zziwVar = (zziw) entry.getKey();
            if (zziwVar.zzc() != zzmo.MESSAGE || zziwVar.zzd() || zziwVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzjr) {
                zzmrVar.zza(zziwVar.zza(), (Object) ((zzjr) entry).zza().zzc());
            } else {
                zzmrVar.zza(zziwVar.zza(), entry.getValue());
            }
        }
        zzlu<?, ?> zzluVar = this.zzb;
        zzluVar.zzb(zzluVar.zzb(t2), zzmrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d1 A[EDGE_INSN: B:128:0x00d1->B:103:0x00d1 BREAK  A[LOOP:1: B:89:0x0078->B:135:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0090  */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.vision.zzhn r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzkq.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.zzhn):void");
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final boolean zza(T t2, T t3) {
        if (!this.zzb.zzb(t2).equals(this.zzb.zzb(t3))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t2).equals(this.zzd.zza(t3));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zzb(T t2) {
        zzlu<?, ?> zzluVar = this.zzb;
        int iZze = zzluVar.zze(zzluVar.zzb(t2));
        return this.zzc ? iZze + this.zzd.zza(t2).zzg() : iZze;
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzb(T t2, T t3) {
        zzle.zza(this.zzb, t2, t3);
        if (this.zzc) {
            zzle.zza(this.zzd, t2, t3);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzc(T t2) {
        this.zzb.zzd(t2);
        this.zzd.zzc(t2);
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final boolean zzd(T t2) {
        return this.zzd.zza(t2).zzf();
    }
}
