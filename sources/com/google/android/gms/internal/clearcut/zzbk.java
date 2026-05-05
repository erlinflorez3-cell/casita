package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbk {
    private static volatile boolean zzft = true;
    private int zzfq;
    private int zzfr;
    private boolean zzfs;

    private zzbk() {
        this.zzfq = 100;
        this.zzfr = Integer.MAX_VALUE;
        this.zzfs = false;
    }

    public static long zza(long j2) {
        return (-((-1) - (((-1) - j2) | ((-1) - 1)))) ^ (j2 >>> 1);
    }

    static zzbk zza(byte[] bArr, int i2, int i3, boolean z2) {
        zzbm zzbmVar = new zzbm(bArr, 0, i3, false);
        try {
            zzbmVar.zzl(i3);
            return zzbmVar;
        } catch (zzco e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int zzm(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public abstract int zzaf();

    public abstract int zzl(int i2) throws zzco;
}
