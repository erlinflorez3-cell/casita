package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaal {
    private static final zzaal zza = new zzaal(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzaal() {
        this(0, new int[8], new Object[8], true);
    }

    private zzaal(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzaal zzc() {
        return zza;
    }

    static zzaal zze(zzaal zzaalVar, zzaal zzaalVar2) {
        int i2 = zzaalVar.zzb + zzaalVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzaalVar.zzc, i2);
        System.arraycopy(zzaalVar2.zzc, 0, iArrCopyOf, zzaalVar.zzb, zzaalVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzaalVar.zzd, i2);
        System.arraycopy(zzaalVar2.zzd, 0, objArrCopyOf, zzaalVar.zzb, zzaalVar2.zzb);
        return new zzaal(i2, iArrCopyOf, objArrCopyOf, true);
    }

    static zzaal zzf() {
        return new zzaal(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzaal)) {
            return false;
        }
        zzaal zzaalVar = (zzaal) obj;
        int i2 = this.zzb;
        if (i2 == zzaalVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzaalVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzaalVar.zzd;
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
        int iZzE;
        int iZzD;
        int iZzD2;
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
                    iZzD2 = zzuq.zzD(i6 << 3) + 8;
                } else if (i7 == 2) {
                    zzud zzudVar = (zzud) this.zzd[i4];
                    int i8 = zzuq.zzf;
                    int iZzd = zzudVar.zzd();
                    iZzD2 = zzuq.zzD(i6 << 3) + zzuq.zzD(iZzd) + iZzd;
                } else if (i7 == 3) {
                    int i9 = zzuq.zzf;
                    iZzE = ((zzaal) this.zzd[i4]).zza();
                    int iZzD3 = zzuq.zzD(i6 << 3);
                    iZzD = iZzD3 + iZzD3;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzyg.zza());
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    iZzD2 = zzuq.zzD(i6 << 3) + 4;
                }
                i3 += iZzD2;
            } else {
                iZzE = zzuq.zzE(((Long) this.zzd[i4]).longValue());
                iZzD = zzuq.zzD(i6 << 3);
            }
            iZzD2 = iZzD + iZzE;
            i3 += iZzD2;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzD = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzud zzudVar = (zzud) this.zzd[i3];
            int i5 = zzuq.zzf;
            int iZzd = zzudVar.zzd();
            int iZzD2 = zzuq.zzD(iZzd) + iZzd;
            int iZzD3 = zzuq.zzD(16);
            int iZzD4 = zzuq.zzD(i4);
            int iZzD5 = zzuq.zzD(8);
            iZzD += iZzD5 + iZzD5 + iZzD3 + iZzD4 + zzuq.zzD(24) + iZzD2;
        }
        this.zze = iZzD;
        return iZzD;
    }

    final zzaal zzd(zzaal zzaalVar) {
        if (zzaalVar.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzaalVar.zzb;
        zzm(i2);
        System.arraycopy(zzaalVar.zzc, 0, this.zzc, this.zzb, zzaalVar.zzb);
        System.arraycopy(zzaalVar.zzd, 0, this.zzd, this.zzb, zzaalVar.zzb);
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
            zzzi.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
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

    final void zzk(zzur zzurVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzurVar.zzw(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzl(zzur zzurVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzurVar.zzt(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzurVar.zzm(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzurVar.zzd(i5, (zzud) obj);
                } else if (i4 == 3) {
                    zzurVar.zzF(i5);
                    ((zzaal) obj).zzl(zzurVar);
                    zzurVar.zzh(i5);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(zzyg.zza());
                    }
                    zzurVar.zzk(i5, ((Integer) obj).intValue());
                }
            }
        }
    }
}
