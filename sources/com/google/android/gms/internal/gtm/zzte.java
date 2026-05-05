package com.google.android.gms.internal.gtm;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
final class zzte extends zzsw {
    static final zzsw zza = new zzte(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzte(@CheckForNull Object obj, Object[] objArr, int i2) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i2;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r9v0 ??, r9v2 ??, r9v1 short[], r9v3 byte[]]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:676)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    static com.google.android.gms.internal.gtm.zzte zzg(int r16, java.lang.Object[] r17, com.google.android.gms.internal.gtm.zzsv r18) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzte.zzg(int, java.lang.Object[], com.google.android.gms.internal.gtm.zzsv):com.google.android.gms.internal.gtm.zzte");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:18:0x0037->B:24:0x0050], EDGE_INSN: B:47:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:28:0x0064->B:34:0x007b], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:36:0x008a->B:42:0x00a2]] */
    @Override // com.google.android.gms.internal.gtm.zzsw, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 != 0) goto L7
        L3:
            r0 = r7
        L4:
            if (r0 != 0) goto La5
            return r7
        L7:
            int r0 = r8.zzd
            java.lang.Object[] r4 = r8.zzb
            r1 = 1
            if (r0 != r1) goto L20
            r0 = 0
            r0 = r4[r0]
            r0.getClass()
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L3
            r0 = r4[r1]
            r0.getClass()
            goto L4
        L20:
            java.lang.Object r5 = r8.zzc
            if (r5 != 0) goto L25
            goto L3
        L25:
            boolean r0 = r5 instanceof byte[]
            r6 = -1
            if (r0 == 0) goto L53
            byte[] r5 = (byte[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.gtm.zzsp.zza(r0)
        L37:
            int r2 = r0 + r3
            r0 = r0 | r3
            int r2 = r2 - r0
            r1 = r5[r2]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L43
            goto L3
        L43:
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L50
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L4
        L50:
            int r0 = r2 + 1
            goto L37
        L53:
            boolean r0 = r5 instanceof short[]
            if (r0 == 0) goto L7e
            short[] r5 = (short[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r2 = com.google.android.gms.internal.gtm.zzsp.zza(r0)
        L64:
            r2 = r2 & r3
            short r0 = r5[r2]
            char r1 = (char) r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L6e
            goto L3
        L6e:
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L7b
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L4
        L7b:
            int r2 = r2 + 1
            goto L64
        L7e:
            int[] r5 = (int[]) r5
            int r3 = r5.length
            int r3 = r3 + r6
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.gtm.zzsp.zza(r0)
        L8a:
            int r2 = r0 + r3
            r0 = r0 | r3
            int r2 = r2 - r0
            r1 = r5[r2]
            if (r1 != r6) goto L94
            goto L3
        L94:
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto La2
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L4
        La2:
            int r0 = r2 + 1
            goto L8a
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzte.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzsw
    final zzsq zza() {
        return new zztd(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.gtm.zzsw
    final zzsx zzd() {
        return new zztb(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.gtm.zzsw
    final zzsx zze() {
        return new zztc(this, new zztd(this.zzb, 0, this.zzd));
    }
}
