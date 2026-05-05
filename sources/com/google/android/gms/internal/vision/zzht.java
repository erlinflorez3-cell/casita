package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzht implements Serializable, Iterable<Byte> {
    public static final zzht zza = new zzid(zzjf.zzb);
    private static final zzhz zzb;
    private static final Comparator<zzht> zzd;
    private int zzc = 0;

    static {
        zzb = zzhi.zza() ? new zzic(null) : new zzhx(null);
        zzd = new zzhv();
    }

    zzht() {
    }

    public static zzht zza(String str) {
        return new zzid(str.getBytes(zzjf.zza));
    }

    static zzht zza(byte[] bArr) {
        return new zzid(bArr);
    }

    public static zzht zza(byte[] bArr, int i2, int i3) {
        zzb(i2, i2 + i3, bArr.length);
        return new zzid(zzb.zza(bArr, i2, i3));
    }

    public static int zzb(byte b2) {
        return (-1) - (((-1) - b2) | ((-1) - 255));
    }

    static int zzb(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((-1) - (((-1) - ((-1) - (((-1) - ((i2 + i3) - (i2 & i3))) & ((-1) - i5)))) & ((-1) - (i4 - i3))) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(new StringBuilder(32).append("Beginning index: ").append(i2).append(" < 0").toString());
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(new StringBuilder(66).append("Beginning index larger than ending index: ").append(i2).append(", ").append(i3).toString());
        }
        throw new IndexOutOfBoundsException(new StringBuilder(37).append("End index: ").append(i3).append(" >= ").append(i4).toString());
    }

    static zzht zzb(byte[] bArr, int i2, int i3) {
        return new zzhw(bArr, i2, i3);
    }

    static zzib zzc(int i2) {
        return new zzib(i2, null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZza = this.zzc;
        if (iZza == 0) {
            int iZza2 = zza();
            iZza = zza(iZza2, 0, iZza2);
            if (iZza == 0) {
                iZza = 1;
            }
            this.zzc = iZza;
        }
        return iZza;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzhs(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()), zza() <= 50 ? zzlq.zza(this) : String.valueOf(zzlq.zza(zza(0, 47))).concat("..."));
    }

    public abstract byte zza(int i2);

    public abstract int zza();

    protected abstract int zza(int i2, int i3, int i4);

    public abstract zzht zza(int i2, int i3);

    protected abstract String zza(Charset charset);

    abstract void zza(zzhq zzhqVar) throws IOException;

    protected abstract void zza(byte[] bArr, int i2, int i3, int i4);

    abstract byte zzb(int i2);

    public final String zzb() {
        return zza() == 0 ? "" : zza(zzjf.zza);
    }

    public abstract boolean zzc();

    protected final int zzd() {
        return this.zzc;
    }
}
