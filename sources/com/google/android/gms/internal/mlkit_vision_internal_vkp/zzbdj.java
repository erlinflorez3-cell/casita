package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbdj {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzbdk zzc;

    private zzbdj() {
    }

    /* synthetic */ zzbdj(zzbdi zzbdiVar) {
    }

    public static int zzF(int i2) {
        return (i2 >>> 1) ^ (-((-1) - (((-1) - i2) | ((-1) - 1))));
    }

    public static long zzG(long j2) {
        return (j2 >>> 1) ^ (-((-1) - (((-1) - 1) | ((-1) - j2))));
    }

    static zzbdj zzH(byte[] bArr, int i2, int i3, boolean z2) {
        zzbdf zzbdfVar = new zzbdf(bArr, 0, i3, z2, null);
        try {
            zzbdfVar.zze(i3);
            return zzbdfVar;
        } catch (zzbew e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract void zzA(int i2);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i2) throws IOException;

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i2) throws zzbew;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zzbdd zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i2) throws zzbew;
}
