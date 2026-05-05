package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbze extends zzbel implements zzbft {
    private static final zzbze zzb;
    private zzbet zzd = zzL();

    static {
        zzbze zzbzeVar = new zzbze();
        zzb = zzbzeVar;
        zzbel.zzR(zzbze.class, zzbzeVar);
    }

    private zzbze() {
    }

    public static zzbzd zzc() {
        return (zzbzd) zzb.zzB();
    }

    static /* synthetic */ void zzg(zzbze zzbzeVar, zzbzb zzbzbVar) {
        zzbzbVar.getClass();
        zzbet zzbetVar = zzbzeVar.zzd;
        if (!zzbetVar.zzc()) {
            zzbzeVar.zzd = zzbel.zzM(zzbetVar);
        }
        zzbzeVar.zzd.add(zzbzbVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzbzb.class});
        }
        if (i3 == 3) {
            return new zzbze();
        }
        if (i3 == 4) {
            return new zzbzd(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzf() {
        return this.zzd;
    }
}
