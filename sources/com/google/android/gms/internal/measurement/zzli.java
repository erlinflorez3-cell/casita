package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzli<T> implements zzlu<T> {
    private final zzlc zza;
    private final zzmk<?, ?> zzb;
    private final boolean zzc;
    private final zzji<?> zzd;

    private zzli(zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzlc zzlcVar) {
        this.zzb = zzmkVar;
        this.zzc = zzjiVar.zza(zzlcVar);
        this.zzd = zzjiVar;
        this.zza = zzlcVar;
    }

    static <T> zzli<T> zza(zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzlc zzlcVar) {
        return new zzli<>(zzmkVar, zzjiVar, zzlcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(T t2) {
        zzmk<?, ?> zzmkVar = this.zzb;
        int iZzb = zzmkVar.zzb(zzmkVar.zzd(t2));
        return this.zzc ? iZzb + this.zzd.zza(t2).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final T zza() {
        zzlc zzlcVar = this.zza;
        return zzlcVar instanceof zzjt ? (T) ((zzjt) zzlcVar).zzce() : (T) zzlcVar.zzci().zzaj();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[LOOP:0: B:110:0x000c->B:118:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r11, com.google.android.gms.internal.measurement.zzlr r12, com.google.android.gms.internal.measurement.zzjg r13) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.zzmk<?, ?> r5 = r10.zzb
            com.google.android.gms.internal.measurement.zzji<?> r7 = r10.zzd
            java.lang.Object r4 = r5.zzc(r11)
            com.google.android.gms.internal.measurement.zzjm r6 = r7.zzb(r11)
        Lc:
            int r0 = r12.zzc()     // Catch: java.lang.Throwable -> L8f
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L19
            r5.zzb(r11, r4)
            return
        L19:
            int r2 = r12.zzd()     // Catch: java.lang.Throwable -> L8f
            r0 = 11
            r3 = 0
            if (r2 == r0) goto L40
            r0 = 7
            r1 = r2 & r0
            r0 = 2
            if (r1 != r0) goto L3b
            com.google.android.gms.internal.measurement.zzlc r1 = r10.zza     // Catch: java.lang.Throwable -> L8f
            int r0 = r2 >>> 3
            java.lang.Object r0 = r7.zza(r13, r1, r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L36
            r7.zza(r12, r0, r13, r6)     // Catch: java.lang.Throwable -> L8f
            goto L83
        L36:
            boolean r0 = r5.zza(r4, r12, r3)     // Catch: java.lang.Throwable -> L8f
            goto L84
        L3b:
            boolean r0 = r12.zzt()     // Catch: java.lang.Throwable -> L8f
            goto L84
        L40:
            r8 = 0
            r2 = r8
        L42:
            int r0 = r12.zzc()     // Catch: java.lang.Throwable -> L8f
            if (r0 == r1) goto L70
            int r9 = r12.zzd()     // Catch: java.lang.Throwable -> L8f
            r0 = 16
            if (r9 != r0) goto L5b
            int r3 = r12.zzj()     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.zzlc r0 = r10.zza     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r8 = r7.zza(r13, r0, r3)     // Catch: java.lang.Throwable -> L8f
            goto L42
        L5b:
            r0 = 26
            if (r9 != r0) goto L6a
            if (r8 == 0) goto L65
            r7.zza(r12, r8, r13, r6)     // Catch: java.lang.Throwable -> L8f
            goto L42
        L65:
            com.google.android.gms.internal.measurement.zzik r2 = r12.zzp()     // Catch: java.lang.Throwable -> L8f
            goto L42
        L6a:
            boolean r0 = r12.zzt()     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L42
        L70:
            int r1 = r12.zzd()     // Catch: java.lang.Throwable -> L8f
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
            com.google.android.gms.internal.measurement.zzkb r0 = com.google.android.gms.internal.measurement.zzkb.zzb()     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L8f:
            r0 = move-exception
            r5.zzb(r11, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzli.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlr, com.google.android.gms.internal.measurement.zzjg):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t2, zznb zznbVar) throws IOException {
        Iterator itZzd = this.zzd.zza(t2).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzjo zzjoVar = (zzjo) entry.getKey();
            if (zzjoVar.zzc() != zzmz.MESSAGE || zzjoVar.zze() || zzjoVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzkf) {
                zznbVar.zza(zzjoVar.zza(), (Object) ((zzkf) entry).zza().zzb());
            } else {
                zznbVar.zza(zzjoVar.zza(), entry.getValue());
            }
        }
        zzmk<?, ?> zzmkVar = this.zzb;
        zzmkVar.zza(zzmkVar.zzd(t2), zznbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t2, T t3) {
        zzlw.zza(this.zzb, t2, t3);
        if (this.zzc) {
            zzlw.zza(this.zzd, t2, t3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008e A[EDGE_INSN: B:122:0x008e->B:97:0x008e BREAK  A[LOOP:1: B:84:0x004f->B:130:0x004f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0067  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r16, byte[] r17, int r18, int r19, com.google.android.gms.internal.measurement.zzij r20) throws java.io.IOException {
        /*
            r15 = this;
            r11 = r18
            r2 = r16
            r1 = r2
            com.google.android.gms.internal.measurement.zzjt r1 = (com.google.android.gms.internal.measurement.zzjt) r1
            com.google.android.gms.internal.measurement.zzmj r13 = r1.zzb
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmj.zzc()
            if (r13 != r0) goto L15
            com.google.android.gms.internal.measurement.zzmj r13 = com.google.android.gms.internal.measurement.zzmj.zzd()
            r1.zzb = r13
        L15:
            com.google.android.gms.internal.measurement.zzjt$zzd r2 = (com.google.android.gms.internal.measurement.zzjt.zzd) r2
            r2.zza()
            r8 = 0
            r2 = r8
        L1c:
            r12 = r19
            if (r11 >= r12) goto Laf
            r14 = r20
            r10 = r17
            int r11 = com.google.android.gms.internal.measurement.zzig.zzc(r10, r11, r14)
            int r9 = r14.zza
            r0 = 11
            r4 = 2
            if (r9 == r0) goto L4d
            r0 = 7
            r0 = r0 & r9
            if (r0 != r4) goto L48
            com.google.android.gms.internal.measurement.zzji<?> r3 = r15.zzd
            com.google.android.gms.internal.measurement.zzjg r2 = r14.zzd
            com.google.android.gms.internal.measurement.zzlc r1 = r15.zza
            int r0 = r9 >>> 3
            java.lang.Object r2 = r3.zza(r2, r1, r0)
            com.google.android.gms.internal.measurement.zzjt$zzf r2 = (com.google.android.gms.internal.measurement.zzjt.zzf) r2
            if (r2 != 0) goto L9d
            int r11 = com.google.android.gms.internal.measurement.zzig.zza(r9, r10, r11, r12, r13, r14)
            goto L1c
        L48:
            int r11 = com.google.android.gms.internal.measurement.zzig.zza(r9, r10, r11, r12, r14)
            goto L1c
        L4d:
            r5 = 0
            r3 = r8
        L4f:
            if (r11 >= r12) goto L8e
            int r11 = com.google.android.gms.internal.measurement.zzig.zzc(r10, r11, r14)
            int r6 = r14.zza
            int r7 = r6 >>> 3
            r0 = 7
            int r1 = r6 + r0
            r0 = r0 | r6
            int r1 = r1 - r0
            if (r7 == r4) goto L79
            r0 = 3
            if (r7 == r0) goto L6c
        L63:
            r0 = 12
            if (r6 == r0) goto L8e
            int r11 = com.google.android.gms.internal.measurement.zzig.zza(r6, r10, r11, r12, r14)
            goto L4f
        L6c:
            if (r2 != 0) goto La6
            if (r1 != r4) goto L63
            int r11 = com.google.android.gms.internal.measurement.zzig.zza(r10, r11, r14)
            java.lang.Object r3 = r14.zzc
            com.google.android.gms.internal.measurement.zzik r3 = (com.google.android.gms.internal.measurement.zzik) r3
            goto L4f
        L79:
            if (r1 != 0) goto L63
            int r11 = com.google.android.gms.internal.measurement.zzig.zzc(r10, r11, r14)
            int r5 = r14.zza
            com.google.android.gms.internal.measurement.zzji<?> r2 = r15.zzd
            com.google.android.gms.internal.measurement.zzjg r1 = r14.zzd
            com.google.android.gms.internal.measurement.zzlc r0 = r15.zza
            java.lang.Object r2 = r2.zza(r1, r0, r5)
            com.google.android.gms.internal.measurement.zzjt$zzf r2 = (com.google.android.gms.internal.measurement.zzjt.zzf) r2
            goto L4f
        L8e:
            if (r3 == 0) goto L9c
            int r0 = r5 << 3
            int r1 = (-1) - r0
            int r0 = (-1) - r4
            r1 = r1 & r0
            int r0 = (-1) - r1
            r13.zza(r0, r3)
        L9c:
            goto L1c
        L9d:
            com.google.android.gms.internal.measurement.zzlq.zza()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        La6:
            com.google.android.gms.internal.measurement.zzlq.zza()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        Laf:
            if (r11 != r12) goto Lb2
            return
        Lb2:
            com.google.android.gms.internal.measurement.zzkb r0 = com.google.android.gms.internal.measurement.zzkb.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzli.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzij):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(T t2) {
        int iHashCode = this.zzb.zzd(t2).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t2).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzb(T t2, T t3) {
        if (!this.zzb.zzd(t2).equals(this.zzb.zzd(t3))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t2).equals(this.zzd.zza(t3));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzd(T t2) {
        this.zzb.zzf(t2);
        this.zzd.zzc(t2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zze(T t2) {
        return this.zzd.zza(t2).zzg();
    }
}
