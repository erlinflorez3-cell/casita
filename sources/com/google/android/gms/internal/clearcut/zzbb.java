package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbb implements Serializable, Iterable<Byte> {
    public static final zzbb zzfi = new zzbi(zzci.zzkt);
    private static final zzbf zzfj;
    private int zzfk = 0;

    static {
        zzfj = zzaw.zzx() ? new zzbj(null) : new zzbd(null);
    }

    zzbb() {
    }

    static int zzb(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((-1) - (((-1) - ((i2 | i3) | i5)) & ((-1) - (i4 - i3))) >= 0) {
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

    public static zzbb zzb(byte[] bArr, int i2, int i3) {
        return new zzbi(zzfj.zzc(bArr, i2, i3));
    }

    public static zzbb zzf(String str) {
        return new zzbi(str.getBytes(zzci.UTF_8));
    }

    static zzbg zzk(int i2) {
        return new zzbg(i2, null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZza = this.zzfk;
        if (iZza == 0) {
            int size = size();
            iZza = zza(size, 0, size);
            if (iZza == 0) {
                iZza = 1;
            }
            this.zzfk = iZza;
        }
        return iZza;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzbc(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract int zza(int i2, int i3, int i4);

    public abstract zzbb zza(int i2, int i3);

    protected abstract String zza(Charset charset);

    abstract void zza(zzba zzbaVar) throws IOException;

    public abstract boolean zzaa();

    protected final int zzab() {
        return this.zzfk;
    }

    public abstract byte zzj(int i2);

    public final String zzz() {
        return size() == 0 ? "" : zza(zzci.UTF_8);
    }
}
