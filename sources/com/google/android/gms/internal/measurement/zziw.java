package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zziw {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzjb zzc;

    /* JADX INFO: Access modifiers changed from: private */
    zziw() {
        this.zzb = zzd;
    }

    /* synthetic */ zziw(zziy zziyVar) {
        this();
    }

    public static int zza(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long zza(long j2) {
        return (-((j2 + 1) - (j2 | 1))) ^ (j2 >>> 1);
    }

    static zziw zza(byte[] bArr, int i2, int i3, boolean z2) {
        zziz zzizVar = new zziz(bArr, i3);
        try {
            zzizVar.zzb(i3);
            return zzizVar;
        } catch (zzkb e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzb(int i2) throws zzkb;

    public abstract int zzc();

    public abstract void zzc(int i2) throws zzkb;

    public abstract int zzd() throws IOException;

    public abstract void zzd(int i2);

    public abstract int zze() throws IOException;

    public abstract boolean zze(int i2) throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzik zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;
}
