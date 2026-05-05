package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmj {
    private static final zzmj zza = new zzmj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmj() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmj(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    static zzmj zza(zzmj zzmjVar, zzmj zzmjVar2) {
        int i2 = zzmjVar.zzb + zzmjVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzmjVar.zzc, i2);
        System.arraycopy(zzmjVar2.zzc, 0, iArrCopyOf, zzmjVar.zzb, zzmjVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzmjVar.zzd, i2);
        System.arraycopy(zzmjVar2.zzd, 0, objArrCopyOf, zzmjVar.zzb, zzmjVar2.zzb);
        return new zzmj(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i2) {
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

    private static void zza(int i2, Object obj, zznb zznbVar) throws IOException {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zznbVar.zzb(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            zznbVar.zza(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            zznbVar.zza(i3, (zzik) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(zzkb.zza());
            }
            zznbVar.zzb(i3, ((Integer) obj).intValue());
        } else if (zznbVar.zza() == 1) {
            zznbVar.zzb(i3);
            ((zzmj) obj).zzb(zznbVar);
            zznbVar.zza(i3);
        } else {
            zznbVar.zza(i3);
            ((zzmj) obj).zzb(zznbVar);
            zznbVar.zzb(i3);
        }
    }

    public static zzmj zzc() {
        return zza;
    }

    static zzmj zzd() {
        return new zzmj();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmj)) {
            return false;
        }
        zzmj zzmjVar = (zzmj) obj;
        int i2 = this.zzb;
        if (i2 == zzmjVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmjVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmjVar.zzd;
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

    public final int zza() {
        int iZzg;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = (i5 + 7) - (i5 | 7);
            if (i7 == 0) {
                iZzg = zzjc.zzg(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 1) {
                iZzg = zzjc.zzc(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 2) {
                iZzg = zzjc.zzc(i6, (zzik) this.zzd[i4]);
            } else if (i7 == 3) {
                iZzg = (zzjc.zzi(i6) << 1) + ((zzmj) this.zzd[i4]).zza();
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(zzkb.zza());
                }
                iZzg = zzjc.zzf(i6, ((Integer) this.zzd[i4]).intValue());
            }
            i3 += iZzg;
        }
        this.zze = i3;
        return i3;
    }

    final zzmj zza(zzmj zzmjVar) {
        if (zzmjVar.equals(zza)) {
            return this;
        }
        zzf();
        int i2 = this.zzb + zzmjVar.zzb;
        zza(i2);
        System.arraycopy(zzmjVar.zzc, 0, this.zzc, this.zzb, zzmjVar.zzb);
        System.arraycopy(zzmjVar.zzd, 0, this.zzd, this.zzb, zzmjVar.zzb);
        this.zzb = i2;
        return this;
    }

    final void zza(int i2, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    final void zza(zznb zznbVar) throws IOException {
        if (zznbVar.zza() == 2) {
            for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
                zznbVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zznbVar.zza(this.zzc[i3] >>> 3, this.zzd[i3]);
        }
    }

    final void zza(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzld.zza(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzd = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            iZzd += zzjc.zzd(this.zzc[i3] >>> 3, (zzik) this.zzd[i3]);
        }
        this.zze = iZzd;
        return iZzd;
    }

    public final void zzb(zznb zznbVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zznbVar.zza() == 1) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                zza(this.zzc[i2], this.zzd[i2], zznbVar);
            }
            return;
        }
        for (int i3 = this.zzb - 1; i3 >= 0; i3--) {
            zza(this.zzc[i3], this.zzd[i3], zznbVar);
        }
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
