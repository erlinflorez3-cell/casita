package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzik implements Serializable, Iterable<Byte> {
    public static final zzik zza = new zziv(zzjv.zzb);
    private static final zzir zzb = new zziu();
    private int zzc = 0;

    static {
        new zzim();
    }

    zzik() {
    }

    static /* synthetic */ int zza(byte b2) {
        return (b2 + 255) - (b2 | 255);
    }

    static int zza(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static zzik zza(String str) {
        return new zziv(str.getBytes(zzjv.zza));
    }

    public static zzik zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzik zza(byte[] bArr, int i2, int i3) {
        zza(i2, i2 + i3, bArr.length);
        return new zziv(zzb.zza(bArr, i2, i3));
    }

    static zzik zzb(byte[] bArr) {
        return new zziv(bArr);
    }

    static zzit zzc(int i2) {
        return new zzit(i2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzc;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzc = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzin(this);
    }

    public final String toString() {
        String strZza;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer numValueOf = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            strZza = zzmg.zza(this);
        } else {
            strZza = zzmg.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, numValueOf, strZza);
    }

    public abstract byte zza(int i2);

    protected final int zza() {
        return this.zzc;
    }

    public abstract zzik zza(int i2, int i3);

    abstract void zza(zzil zzilVar) throws IOException;

    abstract byte zzb(int i2);

    public abstract int zzb();

    protected abstract int zzb(int i2, int i3, int i4);
}
