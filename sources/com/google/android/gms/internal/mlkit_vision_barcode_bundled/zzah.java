package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzah extends zzeh implements zzfn {
    private static final zzah zzb;
    private int zzd;
    private zzx zzj;
    private zzjv zzk;
    private byte zzl = 2;
    private String zze = "";
    private String zzf = "";
    private zzen zzg = zzO();
    private String zzh = "";
    private String zzi = "";

    static {
        zzah zzahVar = new zzah();
        zzb = zzahVar;
        zzeh.zzV(zzah.class, zzahVar);
        zzeh.zzI(zzjv.zzf(), zzahVar, zzahVar, null, 308676116, zzhf.MESSAGE, zzah.class);
    }

    private zzah() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", zzag.zza, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i3 == 3) {
            return new zzah();
        }
        if (i3 == 4) {
            return new zzaf(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
