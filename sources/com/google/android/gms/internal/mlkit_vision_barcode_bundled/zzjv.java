package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjv extends zzed implements zzfn {
    private static final zzjv zzd;
    private byte zze = 2;

    static {
        zzjv zzjvVar = new zzjv();
        zzd = zzjvVar;
        zzeh.zzV(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    public static zzjv zzf() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i3 == 2) {
            return zzS(zzd, "\u0003\u0000", null);
        }
        if (i3 == 3) {
            return new zzjv();
        }
        if (i3 == 4) {
            return new zzju(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
