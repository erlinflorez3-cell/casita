package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes8.dex */
public final class zzba extends zzay {
    public zzba() {
        this.zza.add(zzbv.EQUALS);
        this.zza.add(zzbv.GREATER_THAN);
        this.zza.add(zzbv.GREATER_THAN_EQUALS);
        this.zza.add(zzbv.IDENTITY_EQUALS);
        this.zza.add(zzbv.IDENTITY_NOT_EQUALS);
        this.zza.add(zzbv.LESS_THAN);
        this.zza.add(zzbv.LESS_THAN_EQUALS);
        this.zza.add(zzbv.NOT_EQUALS);
    }

    private static boolean zza(zzaq zzaqVar, zzaq zzaqVar2) {
        zzaq zzaiVar;
        zzaq zzaiVar2;
        while (!zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            if (((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) && ((zzaqVar2 instanceof zzax) || (zzaqVar2 instanceof zzao))) {
                return true;
            }
            boolean z2 = zzaqVar instanceof zzai;
            if (z2 && (zzaqVar2 instanceof zzas)) {
                zzaiVar2 = new zzai(zzaqVar2.zze());
            } else {
                boolean z3 = zzaqVar instanceof zzas;
                if (z3 && (zzaqVar2 instanceof zzai)) {
                    zzaiVar = new zzai(zzaqVar.zze());
                } else if (zzaqVar instanceof zzag) {
                    zzaiVar = new zzai(zzaqVar.zze());
                } else if (zzaqVar2 instanceof zzag) {
                    zzaiVar2 = new zzai(zzaqVar2.zze());
                } else if ((z3 || z2) && (zzaqVar2 instanceof zzak)) {
                    zzaiVar2 = new zzas(zzaqVar2.zzf());
                } else {
                    if (!(zzaqVar instanceof zzak) || (!(zzaqVar2 instanceof zzas) && !(zzaqVar2 instanceof zzai))) {
                        return false;
                    }
                    zzaiVar = new zzas(zzaqVar.zzf());
                }
                zzaqVar = zzaiVar;
            }
            zzaqVar2 = zzaiVar2;
        }
        if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
            return true;
        }
        return zzaqVar instanceof zzai ? (Double.isNaN(zzaqVar.zze().doubleValue()) || Double.isNaN(zzaqVar2.zze().doubleValue()) || zzaqVar.zze().doubleValue() != zzaqVar2.zze().doubleValue()) ? false : true : zzaqVar instanceof zzas ? zzaqVar.zzf().equals(zzaqVar2.zzf()) : zzaqVar instanceof zzag ? zzaqVar.zzd().equals(zzaqVar2.zzd()) : zzaqVar == zzaqVar2;
    }

    private static boolean zzb(zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar instanceof zzak) {
            zzaqVar = new zzas(zzaqVar.zzf());
        }
        if (zzaqVar2 instanceof zzak) {
            zzaqVar2 = new zzas(zzaqVar2.zzf());
        }
        if ((zzaqVar instanceof zzas) && (zzaqVar2 instanceof zzas)) {
            return zzaqVar.zzf().compareTo(zzaqVar2.zzf()) < 0;
        }
        double dDoubleValue = zzaqVar.zze().doubleValue();
        double dDoubleValue2 = zzaqVar2.zze().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean zzc(zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar instanceof zzak) {
            zzaqVar = new zzas(zzaqVar.zzf());
        }
        if (zzaqVar2 instanceof zzak) {
            zzaqVar2 = new zzas(zzaqVar2.zzf());
        }
        return (((zzaqVar instanceof zzas) && (zzaqVar2 instanceof zzas)) || !(Double.isNaN(zzaqVar.zze().doubleValue()) || Double.isNaN(zzaqVar2.zze().doubleValue()))) && !zzb(zzaqVar2, zzaqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // com.google.android.gms.internal.measurement.zzay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r6, com.google.android.gms.internal.measurement.zzh r7, java.util.List<com.google.android.gms.internal.measurement.zzaq> r8) {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.zzbv r1 = com.google.android.gms.internal.measurement.zzg.zza(r6)
            r0 = 2
            com.google.android.gms.internal.measurement.zzg.zza(r1, r0, r8)
            r0 = 0
            java.lang.Object r0 = r8.get(r0)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r4 = r7.zza(r0)
            r3 = 1
            java.lang.Object r0 = r8.get(r3)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r2 = r7.zza(r0)
            int[] r1 = com.google.android.gms.internal.measurement.zzbd.zza
            com.google.android.gms.internal.measurement.zzbv r0 = com.google.android.gms.internal.measurement.zzg.zza(r6)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L37;
                case 3: goto L3c;
                case 4: goto L41;
                case 5: goto L46;
                case 6: goto L4b;
                case 7: goto L50;
                case 8: goto L55;
                default: goto L2d;
            }
        L2d:
            com.google.android.gms.internal.measurement.zzaq r0 = super.zza(r6)
            return r0
        L32:
            boolean r0 = zza(r4, r2)
            goto L5a
        L37:
            boolean r0 = zzb(r2, r4)
            goto L5a
        L3c:
            boolean r0 = zzc(r2, r4)
            goto L5a
        L41:
            boolean r0 = com.google.android.gms.internal.measurement.zzg.zza(r4, r2)
            goto L5a
        L46:
            boolean r0 = com.google.android.gms.internal.measurement.zzg.zza(r4, r2)
            goto L59
        L4b:
            boolean r0 = zzb(r4, r2)
            goto L5a
        L50:
            boolean r0 = zzc(r4, r2)
            goto L5a
        L55:
            boolean r0 = zza(r4, r2)
        L59:
            r0 = r0 ^ r3
        L5a:
            if (r0 == 0) goto L5f
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzh
            return r0
        L5f:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzi
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzba.zza(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }
}
