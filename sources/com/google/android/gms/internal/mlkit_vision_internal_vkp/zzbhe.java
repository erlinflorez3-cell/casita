package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbhe {
    private static final zzbhe zza = new zzbhe(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzbhe() {
        this(0, new int[8], new Object[8], true);
    }

    private zzbhe(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzbhe zzc() {
        return zza;
    }

    static zzbhe zze(zzbhe zzbheVar, zzbhe zzbheVar2) {
        int i2 = zzbheVar.zzb + zzbheVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzbheVar.zzc, i2);
        System.arraycopy(zzbheVar2.zzc, 0, iArrCopyOf, zzbheVar.zzb, zzbheVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzbheVar.zzd, i2);
        System.arraycopy(zzbheVar2.zzd, 0, objArrCopyOf, zzbheVar.zzb, zzbheVar2.zzb);
        return new zzbhe(i2, iArrCopyOf, objArrCopyOf, true);
    }

    static zzbhe zzf() {
        return new zzbhe(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i2) {
        int[] iArr = this.zzc;
        if (i2 > iArr.length) {
            int i3 = this.zzb;
            int i4 = i3 + (i3 / 2);
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i2);
            this.zzd = Arrays.copyOf(this.zzd, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbhe)) {
            return false;
        }
        zzbhe zzbheVar = (zzbhe) obj;
        int i2 = this.zzb;
        if (i2 == zzbheVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzbheVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzbheVar.zzd;
                    int i4 = this.zzb;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i3 = i2 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i3 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    public final int zza() {
        int iZzF;
        int iZzG;
        int iZzF2;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = (i5 + 7) - (i5 | 7);
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    iZzF2 = zzbdq.zzF(i6 << 3) + 8;
                } else if (i7 == 2) {
                    zzbdd zzbddVar = (zzbdd) this.zzd[i4];
                    int iZzF3 = zzbdq.zzF(i6 << 3);
                    int iZzd = zzbddVar.zzd();
                    iZzF2 = iZzF3 + zzbdq.zzF(iZzd) + iZzd;
                } else if (i7 == 3) {
                    int iZzF4 = zzbdq.zzF(i6 << 3);
                    iZzF = iZzF4 + iZzF4;
                    iZzG = ((zzbhe) this.zzd[i4]).zza();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzbev("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    iZzF2 = zzbdq.zzF(i6 << 3) + 4;
                }
                i3 += iZzF2;
            } else {
                long jLongValue = ((Long) this.zzd[i4]).longValue();
                iZzF = zzbdq.zzF(i6 << 3);
                iZzG = zzbdq.zzG(jLongValue);
            }
            iZzF2 = iZzF + iZzG;
            i3 += iZzF2;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzF = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzbdd zzbddVar = (zzbdd) this.zzd[i3];
            int iZzF2 = zzbdq.zzF(8);
            int iZzF3 = zzbdq.zzF(16) + zzbdq.zzF(i4);
            int iZzF4 = zzbdq.zzF(24);
            int iZzd = zzbddVar.zzd();
            iZzF += iZzF2 + iZzF2 + iZzF3 + iZzF4 + zzbdq.zzF(iZzd) + iZzd;
        }
        this.zze = iZzF;
        return iZzF;
    }

    final zzbhe zzd(zzbhe zzbheVar) {
        if (zzbheVar.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzbheVar.zzb;
        zzm(i2);
        System.arraycopy(zzbheVar.zzc, 0, this.zzc, this.zzb, zzbheVar.zzb);
        System.arraycopy(zzbheVar.zzd, 0, this.zzd, this.zzb, zzbheVar.zzb);
        this.zzb = i2;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzbfu.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    final void zzj(int i2, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    final void zzk(zzbhs zzbhsVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzbhsVar.zzx(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzl(zzbhs zzbhsVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzbhsVar.zzt(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzbhsVar.zzm(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzbhsVar.zzd(i5, (zzbdd) obj);
                } else if (i4 == 3) {
                    zzbhsVar.zzG(i5);
                    ((zzbhe) obj).zzl(zzbhsVar);
                    zzbhsVar.zzh(i5);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new zzbev("Protocol message tag had invalid wire type."));
                    }
                    zzbhsVar.zzk(i5, ((Integer) obj).intValue());
                }
            }
        }
    }
}
