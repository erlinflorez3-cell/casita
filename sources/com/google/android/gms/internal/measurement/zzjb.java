package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzjb implements zzlr {
    private final zziw zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzjb(zziw zziwVar) {
        zziw zziwVar2 = (zziw) zzjv.zza(zziwVar, "input");
        this.zza = zziwVar2;
        zziwVar2.zzc = this;
    }

    public static zzjb zza(zziw zziwVar) {
        return zziwVar.zzc != null ? zziwVar.zzc : new zzjb(zziwVar);
    }

    private final <T> T zza(zzlu<T> zzluVar, zzjg zzjgVar) throws IOException {
        T tZza = zzluVar.zza();
        zzc(tZza, zzluVar, zzjgVar);
        zzluVar.zzd(tZza);
        return tZza;
    }

    private final Object zza(zzms zzmsVar, Class<?> cls, zzjg zzjgVar) throws IOException {
        switch (zzja.zza[zzmsVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzlq.zza().zza((Class) cls), zzjgVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final void zza(int i2) throws IOException {
        if (this.zza.zzc() != i2) {
            throw zzkb.zzi();
        }
    }

    private final void zza(List<String> list, boolean z2) throws IOException {
        int iZzi;
        int iZzi2;
        if ((-1) - (((-1) - this.zzb) | ((-1) - 7)) != 2) {
            throw zzkb.zza();
        }
        if (!(list instanceof zzkj) || z2) {
            do {
                list.add(z2 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzkj zzkjVar = (zzkj) list;
        do {
            zzkjVar.zza(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    private final <T> T zzb(zzlu<T> zzluVar, zzjg zzjgVar) throws IOException {
        T tZza = zzluVar.zza();
        zzd(tZza, zzluVar, zzjgVar);
        zzluVar.zzd(tZza);
        return tZza;
    }

    private final void zzb(int i2) throws IOException {
        int i3 = this.zzb;
        if ((i3 + 7) - (i3 | 7) != i2) {
            throw zzkb.zza();
        }
    }

    private static void zzc(int i2) throws IOException {
        if ((i2 + 3) - (i2 | 3) != 0) {
            throw zzkb.zzg();
        }
    }

    private final <T> void zzc(T t2, zzlu<T> zzluVar, zzjg zzjgVar) throws IOException {
        int i2 = this.zzc;
        this.zzc = (-1) - (((-1) - ((this.zzb >>> 3) << 3)) & ((-1) - 4));
        try {
            zzluVar.zza(t2, this, zzjgVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzkb.zzg();
            }
        } finally {
            this.zzc = i2;
        }
    }

    private static void zzd(int i2) throws IOException {
        if ((i2 + 7) - (i2 | 7) != 0) {
            throw zzkb.zzg();
        }
    }

    private final <T> void zzd(T t2, zzlu<T> zzluVar, zzjg zzjgVar) throws IOException {
        int iZzj = this.zza.zzj();
        if (this.zza.zza >= this.zza.zzb) {
            throw zzkb.zzh();
        }
        int iZzb = this.zza.zzb(iZzj);
        this.zza.zza++;
        zzluVar.zza(t2, this, zzjgVar);
        this.zza.zzc(0);
        zziw zziwVar = this.zza;
        zziwVar.zza--;
        this.zza.zzd(iZzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final double zza() throws IOException {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final <T> void zza(T t2, zzlu<T> zzluVar, zzjg zzjgVar) throws IOException {
        zzb(3);
        zzc(t2, zzluVar, zzjgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zza(List<Boolean> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzii)) {
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzii zziiVar = (zzii) list;
        int i3 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
        if (i3 == 0) {
            do {
                zziiVar.zza(this.zza.zzu());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zziiVar.zza(this.zza.zzu());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlr
    @Deprecated
    public final <T> void zza(List<T> list, zzlu<T> zzluVar, zzjg zzjgVar) throws IOException {
        int iZzi;
        int i2 = this.zzb;
        if ((i2 & 7) != 3) {
            throw zzkb.zza();
        }
        do {
            list.add(zza(zzluVar, zzjgVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == i2);
        this.zzd = iZzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r8.put(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.zzkt<K, V> r9, com.google.android.gms.internal.measurement.zzjg r10) throws java.io.IOException {
        /*
            r7 = this;
            r6 = 2
            r7.zzb(r6)
            com.google.android.gms.internal.measurement.zziw r0 = r7.zza
            int r1 = r0.zzj()
            com.google.android.gms.internal.measurement.zziw r0 = r7.zza
            int r2 = r0.zzb(r1)
            K r5 = r9.zzb
            V r4 = r9.zzd
        L14:
            int r1 = r7.zzc()     // Catch: java.lang.Throwable -> L64
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L5b
            com.google.android.gms.internal.measurement.zziw r0 = r7.zza     // Catch: java.lang.Throwable -> L64
            boolean r0 = r0.zzt()     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L5b
            r0 = 1
            java.lang.String r3 = "Unable to parse map entry."
            if (r1 == r0) goto L46
            if (r1 == r6) goto L39
            boolean r0 = r7.zzt()     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
            if (r0 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.measurement.zzkb r0 = new com.google.android.gms.internal.measurement.zzkb     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
            r0.<init>(r3)     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
            throw r0     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.measurement.zzms r1 = r9.zzc     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
            V r0 = r9.zzd     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
            java.lang.Class r0 = r0.getClass()     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
            java.lang.Object r4 = r7.zza(r1, r0, r10)     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.measurement.zzms r1 = r9.zza     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
            r0 = 0
            java.lang.Object r5 = r7.zza(r1, r0, r0)     // Catch: com.google.android.gms.internal.measurement.zzke -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r0 = r7.zzt()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.measurement.zzkb r0 = new com.google.android.gms.internal.measurement.zzkb     // Catch: java.lang.Throwable -> L64
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r5, r4)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.measurement.zziw r0 = r7.zza
            r0.zzd(r2)
            return
        L64:
            r1 = move-exception
            com.google.android.gms.internal.measurement.zziw r0 = r7.zza
            r0.zzd(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjb.zza(java.util.Map, com.google.android.gms.internal.measurement.zzkt, com.google.android.gms.internal.measurement.zzjg):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final float zzb() throws IOException {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final <T> void zzb(T t2, zzlu<T> zzluVar, zzjg zzjgVar) throws IOException {
        zzb(2);
        zzd(t2, zzluVar, zzjgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzb(List<zzik> list) throws IOException {
        int iZzi;
        if ((-1) - (((-1) - this.zzb) | ((-1) - 7)) != 2) {
            throw zzkb.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == this.zzb);
        this.zzd = iZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlr
    public final <T> void zzb(List<T> list, zzlu<T> zzluVar, zzjg zzjgVar) throws IOException {
        int iZzi;
        int i2 = this.zzb;
        if ((i2 + 7) - (7 | i2) != 2) {
            throw zzkb.zza();
        }
        do {
            list.add(zzb(zzluVar, zzjgVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == i2);
        this.zzd = iZzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzc() throws IOException {
        int i2 = this.zzd;
        if (i2 != 0) {
            this.zzb = i2;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i3 = this.zzb;
        if (i3 == 0 || i3 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzc(List<Double> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (list instanceof zzje) {
            zzje zzjeVar = (zzje) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzjeVar.zza(this.zza.zza());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzj = this.zza.zzj();
            zzd(iZzj);
            int iZzc = this.zza.zzc() + iZzj;
            do {
                zzjeVar.zza(this.zza.zza());
            } while (this.zza.zzc() < iZzc);
            return;
        }
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 != 2) {
            throw zzkb.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc() + iZzj2;
        do {
            list.add(Double.valueOf(this.zza.zza()));
        } while (this.zza.zzc() < iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzd(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzjw)) {
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        int i3 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
        if (i3 == 0) {
            do {
                zzjwVar.zzd(this.zza.zzd());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzjwVar.zzd(this.zza.zzd());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zze() throws IOException {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zze(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzjw)) {
            int i2 = this.zzb;
            int i3 = (i2 + 7) - (i2 | 7);
            if (i3 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i3 != 5) {
                throw zzkb.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        int i4 = this.zzb;
        int i5 = (i4 + 7) - (i4 | 7);
        if (i5 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzjwVar.zzd(this.zza.zze());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i5 != 5) {
            throw zzkb.zza();
        }
        do {
            zzjwVar.zzd(this.zza.zze());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzf() throws IOException {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzf(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzknVar.zza(this.zza.zzk());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzj = this.zza.zzj();
            zzd(iZzj);
            int iZzc = this.zza.zzc() + iZzj;
            do {
                zzknVar.zza(this.zza.zzk());
            } while (this.zza.zzc() < iZzc);
            return;
        }
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 != 2) {
            throw zzkb.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc() + iZzj2;
        do {
            list.add(Long.valueOf(this.zza.zzk()));
        } while (this.zza.zzc() < iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzg() throws IOException {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzg(List<Float> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzjs)) {
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzjs zzjsVar = (zzjs) list;
        int i3 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
        if (i3 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzjsVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i3 != 5) {
            throw zzkb.zza();
        }
        do {
            zzjsVar.zza(this.zza.zzb());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzh() throws IOException {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzh(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 0) {
                do {
                    zzjwVar.zzd(this.zza.zzf());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                zzjwVar.zzd(this.zza.zzf());
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 != 2) {
            throw zzkb.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            list.add(Integer.valueOf(this.zza.zzf()));
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzi() throws IOException {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzi(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzkn)) {
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzkn zzknVar = (zzkn) list;
        int i3 = this.zzb & 7;
        if (i3 == 0) {
            do {
                zzknVar.zza(this.zza.zzl());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzknVar.zza(this.zza.zzl());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzj() throws IOException {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzj(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzjw)) {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        int i3 = this.zzb & 7;
        if (i3 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzjwVar.zzd(this.zza.zzg());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i3 != 5) {
            throw zzkb.zza();
        }
        do {
            zzjwVar.zzd(this.zza.zzg());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzk() throws IOException {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzk(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzkn)) {
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzj = this.zza.zzj();
            zzd(iZzj);
            int iZzc = this.zza.zzc() + iZzj;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < iZzc);
            return;
        }
        zzkn zzknVar = (zzkn) list;
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 1) {
            do {
                zzknVar.zza(this.zza.zzn());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i4 != 2) {
            throw zzkb.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc() + iZzj2;
        do {
            zzknVar.zza(this.zza.zzn());
        } while (this.zza.zzc() < iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzl() throws IOException {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzl(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzjw)) {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        int i3 = this.zzb & 7;
        if (i3 == 0) {
            do {
                zzjwVar.zzd(this.zza.zzh());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzjwVar.zzd(this.zza.zzh());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzm() throws IOException {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzm(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzkn)) {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzkn zzknVar = (zzkn) list;
        int i3 = this.zzb & 7;
        if (i3 == 0) {
            do {
                zzknVar.zza(this.zza.zzo());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzknVar.zza(this.zza.zzo());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzn() throws IOException {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzn(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzo() throws IOException {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzo(List<String> list) throws IOException {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final zzik zzp() throws IOException {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzp(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzjw)) {
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 0) {
            do {
                zzjwVar.zzd(this.zza.zzj());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i4 != 2) {
            throw zzkb.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzjwVar.zzd(this.zza.zzj());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final String zzq() throws IOException {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzq(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 0) {
                do {
                    zzknVar.zza(this.zza.zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                zzknVar.zza(this.zza.zzp());
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 != 2) {
            throw zzkb.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            list.add(Long.valueOf(this.zza.zzp()));
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final String zzr() throws IOException {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzs() throws IOException {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzt() throws IOException {
        int i2;
        if (this.zza.zzt() || (i2 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i2);
    }
}
