package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzig implements zzld {
    private final zzif zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzig(zzif zzifVar) {
        zzif zzifVar2 = (zzif) zzjf.zza(zzifVar, "input");
        this.zza = zzifVar2;
        zzifVar2.zzc = this;
    }

    public static zzig zza(zzif zzifVar) {
        return zzifVar.zzc != null ? zzifVar.zzc : new zzig(zzifVar);
    }

    private final Object zza(zzml zzmlVar, Class<?> cls, zzio zzioVar) throws IOException {
        switch (zzij.zza[zzmlVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzk());
            case 2:
                return zzn();
            case 3:
                return Double.valueOf(zzd());
            case 4:
                return Integer.valueOf(zzp());
            case 5:
                return Integer.valueOf(zzj());
            case 6:
                return Long.valueOf(zzi());
            case 7:
                return Float.valueOf(zze());
            case 8:
                return Integer.valueOf(zzh());
            case 9:
                return Long.valueOf(zzg());
            case 10:
                return zza(cls, zzioVar);
            case 11:
                return Integer.valueOf(zzq());
            case 12:
                return Long.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Long.valueOf(zzt());
            case 15:
                return zzm();
            case 16:
                return Integer.valueOf(zzo());
            case 17:
                return Long.valueOf(zzf());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final void zza(int i2) throws IOException {
        if ((-1) - (((-1) - this.zzb) | ((-1) - 7)) != i2) {
            throw zzjk.zzf();
        }
    }

    private final void zza(List<String> list, boolean z2) throws IOException {
        int iZza;
        int iZza2;
        int i2 = this.zzb;
        if ((i2 + 7) - (i2 | 7) != 2) {
            throw zzjk.zzf();
        }
        if (!(list instanceof zzjv) || z2) {
            do {
                list.add(z2 ? zzm() : zzl());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        zzjv zzjvVar = (zzjv) list;
        do {
            zzjvVar.zza(zzn());
            if (this.zza.zzt()) {
                return;
            } else {
                iZza2 = this.zza.zza();
            }
        } while (iZza2 == this.zzb);
        this.zzd = iZza2;
    }

    private static void zzb(int i2) throws IOException {
        if ((i2 + 7) - (i2 | 7) != 0) {
            throw zzjk.zzg();
        }
    }

    private final <T> T zzc(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int iZzm = this.zza.zzm();
        if (this.zza.zza >= this.zza.zzb) {
            throw new zzjk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZzc = this.zza.zzc(iZzm);
        T tZza = zzlcVar.zza();
        this.zza.zza++;
        zzlcVar.zza(tZza, this, zzioVar);
        zzlcVar.zzc(tZza);
        this.zza.zza(0);
        zzif zzifVar = this.zza;
        zzifVar.zza--;
        this.zza.zzd(iZzc);
        return tZza;
    }

    private static void zzc(int i2) throws IOException {
        if ((i2 + 3) - (i2 | 3) != 0) {
            throw zzjk.zzg();
        }
    }

    private final <T> T zzd(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int i2 = this.zzc;
        int i3 = (this.zzb >>> 3) << 3;
        this.zzc = (i3 + 4) - (i3 & 4);
        try {
            T tZza = zzlcVar.zza();
            zzlcVar.zza(tZza, this, zzioVar);
            zzlcVar.zzc(tZza);
            if (this.zzb == this.zzc) {
                return tZza;
            }
            throw zzjk.zzg();
        } finally {
            this.zzc = i2;
        }
    }

    private final void zzd(int i2) throws IOException {
        if (this.zza.zzu() != i2) {
            throw zzjk.zza();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zza() throws IOException {
        int i2 = this.zzd;
        if (i2 != 0) {
            this.zzb = i2;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zza();
        }
        int i3 = this.zzb;
        if (i3 == 0 || i3 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zza(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        zza(2);
        return (T) zzc(zzlcVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zza(Class<T> cls, zzio zzioVar) throws IOException {
        zza(2);
        return (T) zzc(zzky.zza().zza((Class) cls), zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zza(List<Double> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzin)) {
            int i2 = this.zzb;
            int i3 = (i2 + 7) - (i2 | 7);
            if (i3 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza = this.zza.zza();
                    }
                } while (iZza == this.zzb);
                this.zzd = iZza;
                return;
            }
            if (i3 != 2) {
                throw zzjk.zzf();
            }
            int iZzm = this.zza.zzm();
            zzb(iZzm);
            int iZzu = this.zza.zzu() + iZzm;
            do {
                list.add(Double.valueOf(this.zza.zzb()));
            } while (this.zza.zzu() < iZzu);
            return;
        }
        zzin zzinVar = (zzin) list;
        int i4 = this.zzb;
        int i5 = (i4 + 7) - (i4 | 7);
        if (i5 == 1) {
            do {
                zzinVar.zza(this.zza.zzb());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        if (i5 != 2) {
            throw zzjk.zzf();
        }
        int iZzm2 = this.zza.zzm();
        zzb(iZzm2);
        int iZzu2 = this.zza.zzu() + iZzm2;
        do {
            zzinVar.zza(this.zza.zzb());
        } while (this.zza.zzu() < iZzu2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> void zza(List<T> list, zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int iZza;
        int i2 = this.zzb;
        if ((-1) - (((-1) - i2) | ((-1) - 7)) != 2) {
            throw zzjk.zzf();
        }
        do {
            list.add(zzc(zzlcVar, zzioVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZza = this.zza.zza();
            }
        } while (iZza == i2);
        this.zzd = iZza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r8.put(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.vision.zzkf<K, V> r9, com.google.android.gms.internal.vision.zzio r10) throws java.io.IOException {
        /*
            r7 = this;
            r6 = 2
            r7.zza(r6)
            com.google.android.gms.internal.vision.zzif r0 = r7.zza
            int r1 = r0.zzm()
            com.google.android.gms.internal.vision.zzif r0 = r7.zza
            int r2 = r0.zzc(r1)
            K r5 = r9.zzb
            V r4 = r9.zzd
        L14:
            int r1 = r7.zza()     // Catch: java.lang.Throwable -> L64
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L5b
            com.google.android.gms.internal.vision.zzif r0 = r7.zza     // Catch: java.lang.Throwable -> L64
            boolean r0 = r0.zzt()     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L5b
            r0 = 1
            java.lang.String r3 = "Unable to parse map entry."
            if (r1 == r0) goto L46
            if (r1 == r6) goto L39
            boolean r0 = r7.zzc()     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
            if (r0 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.vision.zzjk r0 = new com.google.android.gms.internal.vision.zzjk     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
            r0.<init>(r3)     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
            throw r0     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.vision.zzml r1 = r9.zzc     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
            V r0 = r9.zzd     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
            java.lang.Class r0 = r0.getClass()     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
            java.lang.Object r4 = r7.zza(r1, r0, r10)     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.vision.zzml r1 = r9.zza     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
            r0 = 0
            java.lang.Object r5 = r7.zza(r1, r0, r0)     // Catch: com.google.android.gms.internal.vision.zzjn -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r0 = r7.zzc()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.vision.zzjk r0 = new com.google.android.gms.internal.vision.zzjk     // Catch: java.lang.Throwable -> L64
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r5, r4)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.vision.zzif r0 = r7.zza
            r0.zzd(r2)
            return
        L64:
            r1 = move-exception
            com.google.android.gms.internal.vision.zzif r0 = r7.zza
            r0.zzd(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzig.zza(java.util.Map, com.google.android.gms.internal.vision.zzkf, com.google.android.gms.internal.vision.zzio):void");
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zzb(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        zza(3);
        return (T) zzd(zzlcVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zzb(Class<T> cls, zzio zzioVar) throws IOException {
        zza(3);
        return (T) zzd(zzky.zza().zza((Class) cls), zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzb(List<Float> list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzm = this.zza.zzm();
                zzc(iZzm);
                int iZzu = this.zza.zzu() + iZzm;
                do {
                    zzjaVar.zza(this.zza.zzc());
                } while (this.zza.zzu() < iZzu);
                return;
            }
            if (i2 != 5) {
                throw zzjk.zzf();
            }
            do {
                zzjaVar.zza(this.zza.zzc());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 2) {
            int iZzm2 = this.zza.zzm();
            zzc(iZzm2);
            int iZzu2 = this.zza.zzu() + iZzm2;
            do {
                list.add(Float.valueOf(this.zza.zzc()));
            } while (this.zza.zzu() < iZzu2);
            return;
        }
        if (i4 != 5) {
            throw zzjk.zzf();
        }
        do {
            list.add(Float.valueOf(this.zza.zzc()));
            if (this.zza.zzt()) {
                return;
            } else {
                iZza = this.zza.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> void zzb(List<T> list, zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int iZza;
        int i2 = this.zzb;
        if ((i2 & 7) != 3) {
            throw zzjk.zzf();
        }
        do {
            list.add(zzd(zzlcVar, zzioVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZza = this.zza.zza();
            }
        } while (iZza == i2);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzc(List<Long> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzjy)) {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzd()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza = this.zza.zza();
                    }
                } while (iZza == this.zzb);
                this.zzd = iZza;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzu = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Long.valueOf(this.zza.zzd()));
            } while (this.zza.zzu() < iZzu);
            zzd(iZzu);
            return;
        }
        zzjy zzjyVar = (zzjy) list;
        int i3 = this.zzb & 7;
        if (i3 == 0) {
            do {
                zzjyVar.zza(this.zza.zzd());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        if (i3 != 2) {
            throw zzjk.zzf();
        }
        int iZzu2 = this.zza.zzu() + this.zza.zzm();
        do {
            zzjyVar.zza(this.zza.zzd());
        } while (this.zza.zzu() < iZzu2);
        zzd(iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final boolean zzc() throws IOException {
        int i2;
        if (this.zza.zzt() || (i2 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzb(i2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final double zzd() throws IOException {
        zza(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzd(List<Long> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzjy)) {
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zze()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza = this.zza.zza();
                    }
                } while (iZza == this.zzb);
                this.zzd = iZza;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzu = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Long.valueOf(this.zza.zze()));
            } while (this.zza.zzu() < iZzu);
            zzd(iZzu);
            return;
        }
        zzjy zzjyVar = (zzjy) list;
        int i3 = this.zzb & 7;
        if (i3 == 0) {
            do {
                zzjyVar.zza(this.zza.zze());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        if (i3 != 2) {
            throw zzjk.zzf();
        }
        int iZzu2 = this.zza.zzu() + this.zza.zzm();
        do {
            zzjyVar.zza(this.zza.zze());
        } while (this.zza.zzu() < iZzu2);
        zzd(iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final float zze() throws IOException {
        zza(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zze(List<Integer> list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 0) {
                do {
                    zzjdVar.zzc(this.zza.zzf());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzu = this.zza.zzu() + this.zza.zzm();
            do {
                zzjdVar.zzc(this.zza.zzf());
            } while (this.zza.zzu() < iZzu);
            zzd(iZzu);
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
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i4 != 2) {
            throw zzjk.zzf();
        }
        int iZzu2 = this.zza.zzu() + this.zza.zzm();
        do {
            list.add(Integer.valueOf(this.zza.zzf()));
        } while (this.zza.zzu() < iZzu2);
        zzd(iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzf() throws IOException {
        zza(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzf(List<Long> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzjy)) {
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzg()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza = this.zza.zza();
                    }
                } while (iZza == this.zzb);
                this.zzd = iZza;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzm = this.zza.zzm();
            zzb(iZzm);
            int iZzu = this.zza.zzu() + iZzm;
            do {
                list.add(Long.valueOf(this.zza.zzg()));
            } while (this.zza.zzu() < iZzu);
            return;
        }
        zzjy zzjyVar = (zzjy) list;
        int i3 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
        if (i3 == 1) {
            do {
                zzjyVar.zza(this.zza.zzg());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        if (i3 != 2) {
            throw zzjk.zzf();
        }
        int iZzm2 = this.zza.zzm();
        zzb(iZzm2);
        int iZzu2 = this.zza.zzu() + iZzm2;
        do {
            zzjyVar.zza(this.zza.zzg());
        } while (this.zza.zzu() < iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzg() throws IOException {
        zza(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzg(List<Integer> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzjd)) {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzm = this.zza.zzm();
                zzc(iZzm);
                int iZzu = this.zza.zzu() + iZzm;
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzu() < iZzu);
                return;
            }
            if (i2 != 5) {
                throw zzjk.zzf();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 2) {
            int iZzm2 = this.zza.zzm();
            zzc(iZzm2);
            int iZzu2 = this.zza.zzu() + iZzm2;
            do {
                zzjdVar.zzc(this.zza.zzh());
            } while (this.zza.zzu() < iZzu2);
            return;
        }
        if (i4 != 5) {
            throw zzjk.zzf();
        }
        do {
            zzjdVar.zzc(this.zza.zzh());
            if (this.zza.zzt()) {
                return;
            } else {
                iZza2 = this.zza.zza();
            }
        } while (iZza2 == this.zzb);
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzh() throws IOException {
        zza(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzh(List<Boolean> list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzhr) {
            zzhr zzhrVar = (zzhr) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzhrVar.zza(this.zza.zzi());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzu = this.zza.zzu() + this.zza.zzm();
            do {
                zzhrVar.zza(this.zza.zzi());
            } while (this.zza.zzu() < iZzu);
            zzd(iZzu);
            return;
        }
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzi()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i4 != 2) {
            throw zzjk.zzf();
        }
        int iZzu2 = this.zza.zzu() + this.zza.zzm();
        do {
            list.add(Boolean.valueOf(this.zza.zzi()));
        } while (this.zza.zzu() < iZzu2);
        zzd(iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzi() throws IOException {
        zza(1);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzi(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzj() throws IOException {
        zza(5);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzj(List<String> list) throws IOException {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzk(List<zzht> list) throws IOException {
        int iZza;
        if ((this.zzb & 7) != 2) {
            throw zzjk.zzf();
        }
        do {
            list.add(zzn());
            if (this.zza.zzt()) {
                return;
            } else {
                iZza = this.zza.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final boolean zzk() throws IOException {
        zza(0);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final String zzl() throws IOException {
        zza(2);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzl(List<Integer> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzjd)) {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza = this.zza.zza();
                    }
                } while (iZza == this.zzb);
                this.zzd = iZza;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzu = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
            } while (this.zza.zzu() < iZzu);
            zzd(iZzu);
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i3 = this.zzb & 7;
        if (i3 == 0) {
            do {
                zzjdVar.zzc(this.zza.zzm());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        if (i3 != 2) {
            throw zzjk.zzf();
        }
        int iZzu2 = this.zza.zzu() + this.zza.zzm();
        do {
            zzjdVar.zzc(this.zza.zzm());
        } while (this.zza.zzu() < iZzu2);
        zzd(iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final String zzm() throws IOException {
        zza(2);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzm(List<Integer> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzjd)) {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza = this.zza.zza();
                    }
                } while (iZza == this.zzb);
                this.zzd = iZza;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzu = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
            } while (this.zza.zzu() < iZzu);
            zzd(iZzu);
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i3 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
        if (i3 == 0) {
            do {
                zzjdVar.zzc(this.zza.zzn());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        if (i3 != 2) {
            throw zzjk.zzf();
        }
        int iZzu2 = this.zza.zzu() + this.zza.zzm();
        do {
            zzjdVar.zzc(this.zza.zzn());
        } while (this.zza.zzu() < iZzu2);
        zzd(iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final zzht zzn() throws IOException {
        zza(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzn(List<Integer> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzjd)) {
            int i2 = this.zzb;
            int i3 = (i2 + 7) - (i2 | 7);
            if (i3 == 2) {
                int iZzm = this.zza.zzm();
                zzc(iZzm);
                int iZzu = this.zza.zzu() + iZzm;
                do {
                    list.add(Integer.valueOf(this.zza.zzo()));
                } while (this.zza.zzu() < iZzu);
                return;
            }
            if (i3 != 5) {
                throw zzjk.zzf();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzo()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i4 = this.zzb;
        int i5 = (i4 + 7) - (i4 | 7);
        if (i5 == 2) {
            int iZzm2 = this.zza.zzm();
            zzc(iZzm2);
            int iZzu2 = this.zza.zzu() + iZzm2;
            do {
                zzjdVar.zzc(this.zza.zzo());
            } while (this.zza.zzu() < iZzu2);
            return;
        }
        if (i5 != 5) {
            throw zzjk.zzf();
        }
        do {
            zzjdVar.zzc(this.zza.zzo());
            if (this.zza.zzt()) {
                return;
            } else {
                iZza2 = this.zza.zza();
            }
        } while (iZza2 == this.zzb);
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzo() throws IOException {
        zza(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzo(List<Long> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzjy)) {
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza = this.zza.zza();
                    }
                } while (iZza == this.zzb);
                this.zzd = iZza;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzm = this.zza.zzm();
            zzb(iZzm);
            int iZzu = this.zza.zzu() + iZzm;
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzu() < iZzu);
            return;
        }
        zzjy zzjyVar = (zzjy) list;
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 1) {
            do {
                zzjyVar.zza(this.zza.zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        if (i4 != 2) {
            throw zzjk.zzf();
        }
        int iZzm2 = this.zza.zzm();
        zzb(iZzm2);
        int iZzu2 = this.zza.zzu() + iZzm2;
        do {
            zzjyVar.zza(this.zza.zzp());
        } while (this.zza.zzu() < iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzp() throws IOException {
        zza(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzp(List<Integer> list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzjdVar.zzc(this.zza.zzq());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzu = this.zza.zzu() + this.zza.zzm();
            do {
                zzjdVar.zzc(this.zza.zzq());
            } while (this.zza.zzu() < iZzu);
            zzd(iZzu);
            return;
        }
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzq()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i4 != 2) {
            throw zzjk.zzf();
        }
        int iZzu2 = this.zza.zzu() + this.zza.zzm();
        do {
            list.add(Integer.valueOf(this.zza.zzq()));
        } while (this.zza.zzu() < iZzu2);
        zzd(iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzq() throws IOException {
        zza(5);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzq(List<Long> list) throws IOException {
        int iZza;
        int iZza2;
        if (!(list instanceof zzjy)) {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzr()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza = this.zza.zza();
                    }
                } while (iZza == this.zzb);
                this.zzd = iZza;
                return;
            }
            if (i2 != 2) {
                throw zzjk.zzf();
            }
            int iZzu = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Long.valueOf(this.zza.zzr()));
            } while (this.zza.zzu() < iZzu);
            zzd(iZzu);
            return;
        }
        zzjy zzjyVar = (zzjy) list;
        int i3 = this.zzb;
        int i4 = (i3 + 7) - (i3 | 7);
        if (i4 == 0) {
            do {
                zzjyVar.zza(this.zza.zzr());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        if (i4 != 2) {
            throw zzjk.zzf();
        }
        int iZzu2 = this.zza.zzu() + this.zza.zzm();
        do {
            zzjyVar.zza(this.zza.zzr());
        } while (this.zza.zzu() < iZzu2);
        zzd(iZzu2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzr() throws IOException {
        zza(1);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzs() throws IOException {
        zza(0);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzt() throws IOException {
        zza(0);
        return this.zza.zzr();
    }
}
