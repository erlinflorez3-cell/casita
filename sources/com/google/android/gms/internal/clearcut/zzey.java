package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzey {
    private static final zzey zzoz = new zzey(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzfa;
    private int zzjq;
    private Object[] zzmj;
    private int[] zzpa;

    private zzey() {
        this(0, new int[8], new Object[8], true);
    }

    private zzey(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zzjq = -1;
        this.count = i2;
        this.zzpa = iArr;
        this.zzmj = objArr;
        this.zzfa = z2;
    }

    static zzey zza(zzey zzeyVar, zzey zzeyVar2) {
        int i2 = zzeyVar.count + zzeyVar2.count;
        int[] iArrCopyOf = Arrays.copyOf(zzeyVar.zzpa, i2);
        System.arraycopy(zzeyVar2.zzpa, 0, iArrCopyOf, zzeyVar.count, zzeyVar2.count);
        Object[] objArrCopyOf = Arrays.copyOf(zzeyVar.zzmj, i2);
        System.arraycopy(zzeyVar2.zzmj, 0, objArrCopyOf, zzeyVar.count, zzeyVar2.count);
        return new zzey(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private static void zzb(int i2, Object obj, zzfr zzfrVar) throws IOException {
        int i3 = i2 >>> 3;
        int i4 = (-1) - (((-1) - i2) | ((-1) - 7));
        if (i4 == 0) {
            zzfrVar.zzi(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            zzfrVar.zzc(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            zzfrVar.zza(i3, (zzbb) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(zzco.zzbn());
            }
            zzfrVar.zzf(i3, ((Integer) obj).intValue());
        } else if (zzfrVar.zzaj() == zzcg.zzg.zzko) {
            zzfrVar.zzaa(i3);
            ((zzey) obj).zzb(zzfrVar);
            zzfrVar.zzab(i3);
        } else {
            zzfrVar.zzab(i3);
            ((zzey) obj).zzb(zzfrVar);
            zzfrVar.zzaa(i3);
        }
    }

    public static zzey zzea() {
        return zzoz;
    }

    static zzey zzeb() {
        return new zzey();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzey)) {
            return false;
        }
        zzey zzeyVar = (zzey) obj;
        int i2 = this.count;
        if (i2 == zzeyVar.count) {
            int[] iArr = this.zzpa;
            int[] iArr2 = zzeyVar.zzpa;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzmj;
                    Object[] objArr2 = zzeyVar.zzmj;
                    int i4 = this.count;
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
        int i2 = this.count;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.zzpa;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.zzmj;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    final void zza(zzfr zzfrVar) throws IOException {
        if (zzfrVar.zzaj() == zzcg.zzg.zzkp) {
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                zzfrVar.zza(this.zzpa[i2] >>> 3, this.zzmj[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.count; i3++) {
            zzfrVar.zza(this.zzpa[i3] >>> 3, this.zzmj[i3]);
        }
    }

    final void zza(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.count; i3++) {
            zzdr.zza(sb, i2, String.valueOf(this.zzpa[i3] >>> 3), this.zzmj[i3]);
        }
    }

    public final int zzas() {
        int iZze;
        int i2 = this.zzjq;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            int i5 = this.zzpa[i4];
            int i6 = i5 >>> 3;
            int i7 = (-1) - (((-1) - i5) | ((-1) - 7));
            if (i7 == 0) {
                iZze = zzbn.zze(i6, ((Long) this.zzmj[i4]).longValue());
            } else if (i7 == 1) {
                iZze = zzbn.zzg(i6, ((Long) this.zzmj[i4]).longValue());
            } else if (i7 == 2) {
                iZze = zzbn.zzc(i6, (zzbb) this.zzmj[i4]);
            } else if (i7 == 3) {
                iZze = (zzbn.zzr(i6) << 1) + ((zzey) this.zzmj[i4]).zzas();
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(zzco.zzbn());
                }
                iZze = zzbn.zzj(i6, ((Integer) this.zzmj[i4]).intValue());
            }
            i3 += iZze;
        }
        this.zzjq = i3;
        return i3;
    }

    final void zzb(int i2, Object obj) {
        if (!this.zzfa) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.count;
        int[] iArr = this.zzpa;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.zzpa = Arrays.copyOf(iArr, i4);
            this.zzmj = Arrays.copyOf(this.zzmj, i4);
        }
        int[] iArr2 = this.zzpa;
        int i5 = this.count;
        iArr2[i5] = i2;
        this.zzmj[i5] = obj;
        this.count = i5 + 1;
    }

    public final void zzb(zzfr zzfrVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzfrVar.zzaj() == zzcg.zzg.zzko) {
            for (int i2 = 0; i2 < this.count; i2++) {
                zzb(this.zzpa[i2], this.zzmj[i2], zzfrVar);
            }
            return;
        }
        for (int i3 = this.count - 1; i3 >= 0; i3--) {
            zzb(this.zzpa[i3], this.zzmj[i3], zzfrVar);
        }
    }

    public final int zzec() {
        int i2 = this.zzjq;
        if (i2 != -1) {
            return i2;
        }
        int iZzd = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            iZzd += zzbn.zzd(this.zzpa[i3] >>> 3, (zzbb) this.zzmj[i3]);
        }
        this.zzjq = iZzd;
        return iZzd;
    }

    public final void zzv() {
        this.zzfa = false;
    }
}
