package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzdf implements Iterable, Serializable {
    public static final zzdf zzb = new zzde(zzep.zzb);
    private int zza = 0;

    static {
        int i2 = zzct.zza;
    }

    zzdf() {
    }

    private static zzdf zzc(Iterator it, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return (zzdf) it.next();
        }
        int i3 = i2 >>> 1;
        zzdf zzdfVarZzc = zzc(it, i3);
        zzdf zzdfVarZzc2 = zzc(it, i2 - i3);
        if (Integer.MAX_VALUE - zzdfVarZzc.zzd() >= zzdfVarZzc2.zzd()) {
            return zzgd.zzy(zzdfVarZzc, zzdfVarZzc2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + zzdfVarZzc.zzd() + "+" + zzdfVarZzc2.zzd());
    }

    static int zzo(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((-1) - (((-1) - (((-1) - (((-1) - i2) & ((-1) - i3))) | i5)) & ((-1) - (i4 - i3))) >= 0) {
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

    public static zzdf zzr(byte[] bArr, int i2, int i3) {
        zzo(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzde(bArr2);
    }

    public static zzdf zzs(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = inputStream.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            }
            zzdf zzdfVarZzr = i2 == 0 ? null : zzr(bArr, 0, i2);
            if (zzdfVarZzr == null) {
                break;
            }
            arrayList.add(zzdfVarZzr);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    static void zzu(int i2, int i3) {
        int i4 = i3 - (i2 + 1);
        if ((i4 + i2) - (i4 & i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzgq.zza(this) : zzgq.zza(zzk(0, 47)).concat("..."));
    }

    public abstract byte zza(int i2);

    abstract byte zzb(int i2);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i2, int i3, int i4);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int i2, int i3, int i4);

    protected abstract int zzj(int i2, int i3, int i4);

    public abstract zzdf zzk(int i2, int i3);

    protected abstract String zzl(Charset charset);

    abstract void zzm(zzcx zzcxVar) throws IOException;

    public abstract boolean zzn();

    protected final int zzp() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzq */
    public zzdb iterator() {
        return new zzcy(this);
    }

    public final String zzt() {
        return zzd() == 0 ? "" : zzl(zzep.zza);
    }

    @Deprecated
    public final void zzv(byte[] bArr, int i2, int i3, int i4) {
        zzo(0, i4, zzd());
        zzo(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            zze(bArr, 0, i3, i4);
        }
    }

    public final byte[] zzw() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzep.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
