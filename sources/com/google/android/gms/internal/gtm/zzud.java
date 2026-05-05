package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzud implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzud zzb = new zzua(zzye.zzd);
    private static final zzuc zzd;
    private int zzc = 0;

    static {
        int i2 = zzto.zza;
        zzd = new zzuc(null);
        zza = new zztv();
    }

    zzud() {
    }

    static int zzj(int i2, int i3, int i4) {
        int i5 = (-1) - (((-1) - i2) & ((-1) - i3));
        int i6 = i3 - i2;
        if ((((i5 + i6) - (i5 & i6)) | (i4 - i3)) >= 0) {
            return i6;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static zzud zzl(byte[] bArr, int i2, int i3) {
        zzj(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzua(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zztu(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzaai.zza(this) : zzaai.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i2);

    abstract byte zzb(int i2);

    public abstract int zzd();

    protected abstract int zze(int i2, int i3, int i4);

    public abstract zzud zzf(int i2, int i3);

    protected abstract String zzg(Charset charset);

    abstract void zzh(zztt zzttVar) throws IOException;

    public abstract boolean zzi();

    protected final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
