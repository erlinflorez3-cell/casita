package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlx {
    private static final zzlx zza = new zzlx(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzlx() {
        this(0, new int[8], new Object[8], true);
    }

    private zzlx(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzlx zza() {
        return zza;
    }

    static zzlx zza(zzlx zzlxVar, zzlx zzlxVar2) {
        int i2 = zzlxVar.zzb + zzlxVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzlxVar.zzc, i2);
        System.arraycopy(zzlxVar2.zzc, 0, iArrCopyOf, zzlxVar.zzb, zzlxVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzlxVar.zzd, i2);
        System.arraycopy(zzlxVar2.zzd, 0, objArrCopyOf, zzlxVar.zzb, zzlxVar2.zzb);
        return new zzlx(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private static void zza(int i2, Object obj, zzmr zzmrVar) throws IOException {
        int i3 = i2 >>> 3;
        int i4 = (-1) - (((-1) - i2) | ((-1) - 7));
        if (i4 == 0) {
            zzmrVar.zza(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            zzmrVar.zzd(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            zzmrVar.zza(i3, (zzht) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(zzjk.zzf());
            }
            zzmrVar.zzd(i3, ((Integer) obj).intValue());
        } else if (zzmrVar.zza() == zzmq.zza) {
            zzmrVar.zza(i3);
            ((zzlx) obj).zzb(zzmrVar);
            zzmrVar.zzb(i3);
        } else {
            zzmrVar.zzb(i3);
            ((zzlx) obj).zzb(zzmrVar);
            zzmrVar.zza(i3);
        }
    }

    static zzlx zzb() {
        return new zzlx();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzlx)) {
            return false;
        }
        zzlx zzlxVar = (zzlx) obj;
        int i2 = this.zzb;
        if (i2 == zzlxVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzlxVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzlxVar.zzd;
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
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    final void zza(int i2, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.zzb;
        int[] iArr = this.zzc;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.zzc = Arrays.copyOf(iArr, i4);
            this.zzd = Arrays.copyOf(this.zzd, i4);
        }
        int[] iArr2 = this.zzc;
        int i5 = this.zzb;
        iArr2[i5] = i2;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    final void zza(zzmr zzmrVar) throws IOException {
        if (zzmrVar.zza() == zzmq.zzb) {
            for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
                zzmrVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzmrVar.zza(this.zzc[i3] >>> 3, this.zzd[i3]);
        }
    }

    final void zza(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzkp.zza(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final void zzb(zzmr zzmrVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzmrVar.zza() == zzmq.zza) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                zza(this.zzc[i2], this.zzd[i2], zzmrVar);
            }
            return;
        }
        for (int i3 = this.zzb - 1; i3 >= 0; i3--) {
            zza(this.zzc[i3], this.zzd[i3], zzmrVar);
        }
    }

    public final void zzc() {
        this.zzf = false;
    }

    public final int zzd() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzd = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            iZzd += zzii.zzd(this.zzc[i3] >>> 3, (zzht) this.zzd[i3]);
        }
        this.zze = iZzd;
        return iZzd;
    }

    public final int zze() {
        int iZze;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                iZze = zzii.zze(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 1) {
                iZze = zzii.zzg(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 2) {
                iZze = zzii.zzc(i6, (zzht) this.zzd[i4]);
            } else if (i7 == 3) {
                iZze = (zzii.zze(i6) << 1) + ((zzlx) this.zzd[i4]).zze();
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(zzjk.zzf());
                }
                iZze = zzii.zzi(i6, ((Integer) this.zzd[i4]).intValue());
            }
            i3 += iZze;
        }
        this.zze = i3;
        return i3;
    }
}
