package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzp extends zzeh implements zzfn {
    private static final zzp zzb;
    private int zzd;
    private zzjv zzj;
    private byte zzk = 2;
    private zzen zze = zzO();
    private zzem zzf = zzM();
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        zzp zzpVar = new zzp();
        zzb = zzpVar;
        zzeh.zzV(zzp.class, zzpVar);
    }

    private zzp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzp();
        }
        if (i3 == 4) {
            return new zzo(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
