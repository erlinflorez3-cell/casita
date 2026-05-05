package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbfw implements zzbgm {
    private final zzbfs zza;
    private final zzbhd zzb;
    private final boolean zzc;
    private final zzbdw zzd;

    private zzbfw(zzbhd zzbhdVar, zzbdw zzbdwVar, zzbfs zzbfsVar) {
        this.zzb = zzbhdVar;
        this.zzc = zzbfsVar instanceof zzbeh;
        this.zzd = zzbdwVar;
        this.zza = zzbfsVar;
    }

    static zzbfw zzc(zzbhd zzbhdVar, zzbdw zzbdwVar, zzbfs zzbfsVar) {
        return new zzbfw(zzbhdVar, zzbdwVar, zzbfsVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final int zza(Object obj) {
        int iZzb = ((zzbel) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzbeh) obj).zzb.zzc() : iZzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final int zzb(Object obj) {
        int iHashCode = ((zzbel) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzbeh) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final Object zze() {
        zzbfs zzbfsVar = this.zza;
        return zzbfsVar instanceof zzbel ? ((zzbel) zzbfsVar).zzF() : zzbfsVar.zzV().zzw();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final void zzg(Object obj, Object obj2) {
        zzbgo.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzbgo.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final void zzh(Object obj, zzbge zzbgeVar, zzbdv zzbdvVar) throws IOException {
        boolean zZzR;
        zzbhd zzbhdVar = this.zzb;
        Object objZza = zzbhdVar.zza(obj);
        zzbea zzbeaVarZzn = ((zzbeh) obj).zzn();
        while (zzbgeVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzbgeVar.zzd();
                zzbdw zzbdwVar = this.zzd;
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        zzbej zzbejVarZzc = zzbdvVar.zzc(this.zza, iZzd >>> 3);
                        if (zzbejVarZzc != null) {
                            zzbdwVar.zzb(zzbgeVar, zzbejVarZzc, zzbdvVar, zzbeaVarZzn);
                        } else {
                            zZzR = zzbhdVar.zzk(objZza, zzbgeVar, 0);
                        }
                    } else {
                        zZzR = zzbgeVar.zzR();
                    }
                    if (!zZzR) {
                        break;
                    }
                } else {
                    zzbej zzbejVarZzc2 = null;
                    zzbdd zzbddVarZzp = null;
                    int iZzj = 0;
                    while (zzbgeVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzbgeVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzbgeVar.zzj();
                            zzbejVarZzc2 = zzbdvVar.zzc(this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zzbejVarZzc2 != null) {
                                zzbdwVar.zzb(zzbgeVar, zzbejVarZzc2, zzbdvVar, zzbeaVarZzn);
                            } else {
                                zzbddVarZzp = zzbgeVar.zzp();
                            }
                        } else if (!zzbgeVar.zzR()) {
                            break;
                        }
                    }
                    if (zzbgeVar.zzd() != 12) {
                        throw new zzbew("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzbddVarZzp != null) {
                        if (zzbejVarZzc2 != null) {
                            zzbej zzbejVar = zzbejVarZzc2;
                            zzbef zzbefVar = (zzbef) ((zzbel) zzbejVarZzc2.zza).zzb(5, null, null);
                            zzbdj zzbdjVarZzH = zzbdj.zzH(((zzbdc) zzbddVarZzp).zza, 0, ((zzbdc) zzbddVarZzp).zzd(), true);
                            zzbefVar.zzq(zzbdjVarZzH, zzbdvVar);
                            zzbeaVarZzn.zzj(zzbejVarZzc2.zzb, zzbefVar.zzw());
                            zzbdjVarZzH.zzz(0);
                        } else {
                            zzbhdVar.zzg(objZza, iZzj, zzbddVarZzp);
                        }
                    }
                }
            } finally {
                zzbhdVar.zzj(obj, objZza);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0 A[EDGE_INSN: B:55:0x00d0->B:33:0x00d0 BREAK  A[LOOP:1: B:19:0x007a->B:65:0x007a], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcr r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfw.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcr):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final void zzj(Object obj, zzbhs zzbhsVar) throws IOException {
        Iterator itZzg = ((zzbeh) obj).zzb.zzg();
        while (itZzg.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzg.next();
            zzbdz zzbdzVar = (zzbdz) entry.getKey();
            if (zzbdzVar.zze() != zzbhr.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzbdzVar.zzg();
            zzbdzVar.zzf();
            if (entry instanceof zzbez) {
                zzbdzVar.zza();
                zzbhsVar.zzx(32149011, ((zzbez) entry).zza().zzb());
            } else {
                zzbdzVar.zza();
                zzbhsVar.zzx(32149011, entry.getValue());
            }
        }
        ((zzbel) obj).zzc.zzk(zzbhsVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzbel) obj).zzc.equals(((zzbel) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzbeh) obj).zzb.equals(((zzbeh) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgm
    public final boolean zzl(Object obj) {
        return ((zzbeh) obj).zzb.zzm();
    }
}
