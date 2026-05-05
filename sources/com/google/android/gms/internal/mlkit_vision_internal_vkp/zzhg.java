package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhg extends zzbel implements zzbft {
    private static final zzhg zzb;
    private zzbet zzd = zzL();

    static {
        zzhg zzhgVar = new zzhg();
        zzb = zzhgVar;
        zzbel.zzR(zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    public static zzhf zza() {
        return (zzhf) zzb.zzB();
    }

    static /* synthetic */ void zzd(zzhg zzhgVar, zzhd zzhdVar) {
        zzhdVar.getClass();
        zzbet zzbetVar = zzhgVar.zzd;
        if (!zzbetVar.zzc()) {
            zzhgVar.zzd = zzbel.zzM(zzbetVar);
        }
        zzhgVar.zzd.add(zzhdVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzhd.class});
        }
        if (i3 == 3) {
            return new zzhg();
        }
        zzhe zzheVar = null;
        if (i3 == 4) {
            return new zzhf(zzheVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
