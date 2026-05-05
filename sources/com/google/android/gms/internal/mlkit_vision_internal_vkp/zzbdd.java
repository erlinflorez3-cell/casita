package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbdd implements Iterable, Serializable {
    public static final zzbdd zzb = new zzbdc(zzbeu.zzb);
    private int zza = 0;

    static {
        int i2 = zzbcn.zza;
    }

    zzbdd() {
    }

    private static zzbdd zzc(Iterator it, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return (zzbdd) it.next();
        }
        int i3 = i2 >>> 1;
        zzbdd zzbddVarZzc = zzc(it, i3);
        zzbdd zzbddVarZzc2 = zzc(it, i2 - i3);
        if (Integer.MAX_VALUE - zzbddVarZzc.zzd() >= zzbddVarZzc2.zzd()) {
            return zzbgl.zzt(zzbddVarZzc, zzbddVarZzc2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + zzbddVarZzc.zzd() + "+" + zzbddVarZzc2.zzd());
    }

    static int zzl(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((((-1) - (((-1) - (i2 | i3)) & ((-1) - i5))) | (i4 - i3)) >= 0) {
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

    public static zzbdd zzo(byte[] bArr, int i2, int i3) {
        zzl(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzbdc(bArr2);
    }

    public static zzbdd zzp(InputStream inputStream) throws IOException {
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
            zzbdd zzbddVarZzo = i2 == 0 ? null : zzo(bArr, 0, i2);
            if (zzbddVarZzo == null) {
                break;
            }
            arrayList.add(zzbddVarZzo);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    static void zzq(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
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
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzbgy.zza(this) : zzbgy.zza(zzj(0, 47)).concat("..."));
    }

    public abstract byte zza(int i2);

    abstract byte zzb(int i2);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i2, int i3, int i4);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int i2, int i3, int i4);

    public abstract zzbdd zzj(int i2, int i3);

    abstract void zzk(zzbcu zzbcuVar) throws IOException;

    protected final int zzm() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzn */
    public zzbcy iterator() {
        return new zzbcv(this);
    }

    @Deprecated
    public final void zzr(byte[] bArr, int i2, int i3, int i4) {
        zzl(0, i4, zzd());
        zzl(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            zze(bArr, 0, i3, i4);
        }
    }
}
