package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdk implements zzbge {
    private final zzbdj zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzbdk(zzbdj zzbdjVar) {
        byte[] bArr = zzbeu.zzb;
        this.zza = zzbdjVar;
        zzbdjVar.zzc = this;
    }

    private final Object zzS(zzbhq zzbhqVar, Class cls, zzbdv zzbdvVar) throws IOException {
        zzbhq zzbhqVar2 = zzbhq.DOUBLE;
        switch (zzbhqVar.ordinal()) {
            case 0:
                return Double.valueOf(zza());
            case 1:
                return Float.valueOf(zzb());
            case 2:
                return Long.valueOf(zzl());
            case 3:
                return Long.valueOf(zzo());
            case 4:
                return Integer.valueOf(zzg());
            case 5:
                return Long.valueOf(zzk());
            case 6:
                return Integer.valueOf(zzf());
            case 7:
                return Boolean.valueOf(zzQ());
            case 8:
                return zzu();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return zzs(cls, zzbdvVar);
            case 11:
                return zzp();
            case 12:
                return Integer.valueOf(zzj());
            case 13:
                return Integer.valueOf(zze());
            case 14:
                return Integer.valueOf(zzh());
            case 15:
                return Long.valueOf(zzm());
            case 16:
                return Integer.valueOf(zzi());
            case 17:
                return Long.valueOf(zzn());
        }
    }

    private final Object zzT(zzbgm zzbgmVar, zzbdv zzbdvVar) throws IOException {
        Object objZze = zzbgmVar.zze();
        zzV(objZze, zzbgmVar, zzbdvVar);
        zzbgmVar.zzf(objZze);
        return objZze;
    }

    private final Object zzU(zzbgm zzbgmVar, zzbdv zzbdvVar) throws IOException {
        Object objZze = zzbgmVar.zze();
        zzW(objZze, zzbgmVar, zzbdvVar);
        zzbgmVar.zzf(objZze);
        return objZze;
    }

    private final void zzV(Object obj, zzbgm zzbgmVar, zzbdv zzbdvVar) throws IOException {
        int i2 = this.zzc;
        int i3 = (this.zzb >>> 3) << 3;
        this.zzc = (i3 + 4) - (i3 & 4);
        try {
            zzbgmVar.zzh(obj, this, zzbdvVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzbew("Failed to parse the message.");
            }
        } finally {
            this.zzc = i2;
        }
    }

    private final void zzW(Object obj, zzbgm zzbgmVar, zzbdv zzbdvVar) throws IOException {
        zzbdj zzbdjVar = this.zza;
        int iZzn = zzbdjVar.zzn();
        if (zzbdjVar.zza >= zzbdjVar.zzb) {
            throw new zzbew("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZze = zzbdjVar.zze(iZzn);
        this.zza.zza++;
        zzbgmVar.zzh(obj, this, zzbdvVar);
        this.zza.zzz(0);
        r1.zza--;
        this.zza.zzA(iZze);
    }

    private final void zzX(int i2) throws IOException {
        if (this.zza.zzd() != i2) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzY(int i2) throws IOException {
        int i3 = this.zzb;
        if ((i3 + 7) - (i3 | 7) != i2) {
            throw new zzbev("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzZ(int i2) throws IOException {
        if ((i2 + 3) - (i2 | 3) != 0) {
            throw new zzbew("Failed to parse the message.");
        }
    }

    private static final void zzaa(int i2) throws IOException {
        if ((i2 + 7) - (i2 | 7) != 0) {
            throw new zzbew("Failed to parse the message.");
        }
    }

    public static zzbdk zzq(zzbdj zzbdjVar) {
        zzbdk zzbdkVar = zzbdjVar.zzc;
        return zzbdkVar != null ? zzbdkVar : new zzbdk(zzbdjVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzA(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar = this.zza;
                int iZzd = zzbdjVar.zzd() + zzbdjVar.zzn();
                do {
                    zzbemVar.zzg(this.zza.zzf());
                } while (this.zza.zzd() < iZzd);
                zzX(iZzd);
                return;
            }
            do {
                zzbemVar.zzg(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar2 = this.zza;
                int iZzd2 = zzbdjVar2.zzd() + zzbdjVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < iZzd2);
                zzX(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzB(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            int i2 = this.zzb;
            int i3 = (i2 + 7) - (i2 | 7);
            if (i3 == 2) {
                int iZzn = this.zza.zzn();
                zzZ(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzbemVar.zzg(this.zza.zzg());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i3 != 5) {
                throw new zzbev("Protocol message tag had invalid wire type.");
            }
            do {
                zzbemVar.zzg(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i4 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i4 == 2) {
                int iZzn2 = this.zza.zzn();
                zzZ(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i4 != 5) {
                throw new zzbev("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzC(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                int iZzn = this.zza.zzn();
                zzaa(iZzn);
                int iZzd = iZzn + this.zza.zzd();
                do {
                    zzbfgVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzbfgVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                int iZzn2 = this.zza.zzn();
                zzaa(iZzn2);
                int iZzd2 = iZzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzD(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbec) {
            zzbec zzbecVar = (zzbec) list;
            int i2 = this.zzb;
            int i3 = (i2 + 7) - (i2 | 7);
            if (i3 == 2) {
                int iZzn = this.zza.zzn();
                zzZ(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzbecVar.zzg(this.zza.zzc());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i3 != 5) {
                throw new zzbev("Protocol message tag had invalid wire type.");
            }
            do {
                zzbecVar.zzg(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i4 = this.zzb;
            int i5 = (i4 + 7) - (i4 | 7);
            if (i5 == 2) {
                int iZzn2 = this.zza.zzn();
                zzZ(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i5 != 5) {
                throw new zzbev("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    @Deprecated
    public final void zzE(List list, zzbgm zzbgmVar, zzbdv zzbdvVar) throws IOException {
        int iZzm;
        int i2 = this.zzb;
        if ((i2 & 7) != 3) {
            throw new zzbev("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzT(zzbgmVar, zzbdvVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i2);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzF(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar = this.zza;
                int iZzd = zzbdjVar.zzd() + zzbdjVar.zzn();
                do {
                    zzbemVar.zzg(this.zza.zzh());
                } while (this.zza.zzd() < iZzd);
                zzX(iZzd);
                return;
            }
            do {
                zzbemVar.zzg(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar2 = this.zza;
                int iZzd2 = zzbdjVar2.zzd() + zzbdjVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < iZzd2);
                zzX(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzG(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i2 = this.zzb;
            int i3 = (i2 + 7) - (i2 | 7);
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar = this.zza;
                int iZzd = zzbdjVar.zzd() + zzbdjVar.zzn();
                do {
                    zzbfgVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < iZzd);
                zzX(iZzd);
                return;
            }
            do {
                zzbfgVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i4 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar2 = this.zza;
                int iZzd2 = zzbdjVar2.zzd() + zzbdjVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < iZzd2);
                zzX(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x005a, code lost:
    
        r8.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0062, code lost:
    
        return;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzH(java.util.Map r8, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfk r9, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdv r10) throws java.io.IOException {
        /*
            r7 = this;
            r6 = 2
            r7.zzY(r6)
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj r1 = r7.zza
            int r0 = r1.zzn()
            int r2 = r1.zze(r0)
            java.lang.Object r5 = r9.zzd
            java.lang.Object r4 = r9.zzb
        L12:
            int r1 = r7.zzc()     // Catch: java.lang.Throwable -> L63
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L5a
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj r0 = r7.zza     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.zzC()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L24
            goto L5a
        L24:
            r0 = 1
            java.lang.String r3 = "Unable to parse map entry."
            if (r1 == r0) goto L45
            if (r1 == r6) goto L38
            boolean r0 = r7.zzR()     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
            if (r0 == 0) goto L32
            goto L12
        L32:
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew r0 = new com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
            r0.<init>(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
            throw r0     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
        L38:
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhq r1 = r9.zzc     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
            java.lang.Object r0 = r9.zzd     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
            java.lang.Class r0 = r0.getClass()     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
            java.lang.Object r5 = r7.zzS(r1, r0, r10)     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
            goto L12
        L45:
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhq r1 = r9.zza     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
            r0 = 0
            java.lang.Object r4 = r7.zzS(r1, r0, r0)     // Catch: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbev -> L4d java.lang.Throwable -> L63
            goto L12
        L4d:
            boolean r0 = r7.zzR()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L54
            goto L12
        L54:
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew r0 = new com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew     // Catch: java.lang.Throwable -> L63
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        L5a:
            r8.put(r4, r5)     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj r0 = r7.zza
            r0.zzA(r2)
            return
        L63:
            r1 = move-exception
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj r0 = r7.zza
            r0.zzA(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdk.zzH(java.util.Map, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfk, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdv):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzI(List list, zzbgm zzbgmVar, zzbdv zzbdvVar) throws IOException {
        int iZzm;
        int i2 = this.zzb;
        if ((-1) - (((-1) - i2) | ((-1) - 7)) != 2) {
            throw new zzbev("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzU(zzbgmVar, zzbdvVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i2);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzJ(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 == 2) {
                int iZzn = this.zza.zzn();
                zzZ(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzbemVar.zzg(this.zza.zzk());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i2 != 5) {
                throw new zzbev("Protocol message tag had invalid wire type.");
            }
            do {
                zzbemVar.zzg(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = this.zzb;
            int i4 = (i3 + 7) - (i3 | 7);
            if (i4 == 2) {
                int iZzn2 = this.zza.zzn();
                zzZ(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i4 != 5) {
                throw new zzbev("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzK(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                int iZzn = this.zza.zzn();
                zzaa(iZzn);
                int iZzd = iZzn + this.zza.zzd();
                do {
                    zzbfgVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzbfgVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = this.zzb;
            int i4 = (i3 + 7) - (i3 | 7);
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                int iZzn2 = this.zza.zzn();
                zzaa(iZzn2);
                int iZzd2 = iZzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzL(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar = this.zza;
                int iZzd = zzbdjVar.zzd() + zzbdjVar.zzn();
                do {
                    zzbemVar.zzg(this.zza.zzl());
                } while (this.zza.zzd() < iZzd);
                zzX(iZzd);
                return;
            }
            do {
                zzbemVar.zzg(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar2 = this.zza;
                int iZzd2 = zzbdjVar2.zzd() + zzbdjVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < iZzd2);
                zzX(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzM(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar = this.zza;
                int iZzd = zzbdjVar.zzd() + zzbdjVar.zzn();
                do {
                    zzbfgVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < iZzd);
                zzX(iZzd);
                return;
            }
            do {
                zzbfgVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = this.zzb;
            int i4 = (i3 + 7) - (i3 | 7);
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar2 = this.zza;
                int iZzd2 = zzbdjVar2.zzd() + zzbdjVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < iZzd2);
                zzX(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    public final void zzN(List list, boolean z2) throws IOException {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw new zzbev("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzbfd) && !z2) {
            zzbfd zzbfdVar = (zzbfd) list;
            do {
                zzp();
                zzbfdVar.zzb();
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            do {
                list.add(z2 ? zzu() : zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzO(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            int i2 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar = this.zza;
                int iZzd = zzbdjVar.zzd() + zzbdjVar.zzn();
                do {
                    zzbemVar.zzg(this.zza.zzn());
                } while (this.zza.zzd() < iZzd);
                zzX(iZzd);
                return;
            }
            do {
                zzbemVar.zzg(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = this.zzb;
            int i4 = (i3 + 7) - (i3 | 7);
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar2 = this.zza;
                int iZzd2 = zzbdjVar2.zzd() + zzbdjVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < iZzd2);
                zzX(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzP(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar = this.zza;
                int iZzd = zzbdjVar.zzd() + zzbdjVar.zzn();
                do {
                    zzbfgVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < iZzd);
                zzX(iZzd);
                return;
            }
            do {
                zzbfgVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = (-1) - (((-1) - this.zzb) | ((-1) - 7));
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar2 = this.zza;
                int iZzd2 = zzbdjVar2.zzd() + zzbdjVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < iZzd2);
                zzX(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final boolean zzQ() throws IOException {
        zzY(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final boolean zzR() throws IOException {
        int i2;
        if (this.zza.zzC() || (i2 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final double zza() throws IOException {
        zzY(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final float zzb() throws IOException {
        zzY(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final int zzc() throws IOException {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        if (iZzm == 0 || iZzm == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzm >>> 3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final int zze() throws IOException {
        zzY(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final int zzf() throws IOException {
        zzY(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final int zzg() throws IOException {
        zzY(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final int zzh() throws IOException {
        zzY(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final int zzi() throws IOException {
        zzY(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final int zzj() throws IOException {
        zzY(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final long zzk() throws IOException {
        zzY(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final long zzl() throws IOException {
        zzY(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final long zzm() throws IOException {
        zzY(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final long zzn() throws IOException {
        zzY(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final long zzo() throws IOException {
        zzY(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final zzbdd zzp() throws IOException {
        zzY(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    @Deprecated
    public final Object zzr(Class cls, zzbdv zzbdvVar) throws IOException {
        zzY(3);
        return zzT(zzbgb.zza().zzb(cls), zzbdvVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final Object zzs(Class cls, zzbdv zzbdvVar) throws IOException {
        zzY(2);
        return zzU(zzbgb.zza().zzb(cls), zzbdvVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final String zzt() throws IOException {
        zzY(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final String zzu() throws IOException {
        zzY(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzv(Object obj, zzbgm zzbgmVar, zzbdv zzbdvVar) throws IOException {
        zzY(3);
        zzV(obj, zzbgmVar, zzbdvVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzw(Object obj, zzbgm zzbgmVar, zzbdv zzbdvVar) throws IOException {
        zzY(2);
        zzW(obj, zzbgmVar, zzbdvVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzx(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbct) {
            zzbct zzbctVar = (zzbct) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar = this.zza;
                int iZzd = zzbdjVar.zzd() + zzbdjVar.zzn();
                do {
                    zzbctVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < iZzd);
                zzX(iZzd);
                return;
            }
            do {
                zzbctVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i3 = this.zzb;
            int i4 = (i3 + 7) - (i3 | 7);
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                zzbdj zzbdjVar2 = this.zza;
                int iZzd2 = zzbdjVar2.zzd() + zzbdjVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < iZzd2);
                zzX(iZzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzy(List list) throws IOException {
        int iZzm;
        int i2 = this.zzb;
        if ((i2 + 7) - (i2 | 7) != 2) {
            throw new zzbev("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbge
    public final void zzz(List list) throws IOException {
        int iZzm;
        if (list instanceof zzbds) {
            zzbds zzbdsVar = (zzbds) list;
            int i2 = this.zzb;
            int i3 = (i2 + 7) - (i2 | 7);
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                int iZzn = this.zza.zzn();
                zzaa(iZzn);
                int iZzd = iZzn + this.zza.zzd();
                do {
                    zzbdsVar.zzf(this.zza.zzb());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzbdsVar.zzf(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        } else {
            int i4 = this.zzb;
            int i5 = (i4 + 7) - (i4 | 7);
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new zzbev("Protocol message tag had invalid wire type.");
                }
                int iZzn2 = this.zza.zzn();
                zzaa(iZzn2);
                int iZzd2 = iZzn2 + this.zza.zzd();
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
        }
        this.zzd = iZzm;
    }
}
