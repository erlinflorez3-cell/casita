package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgt {
    private static final zzgt zza = new zzgt(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgt() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgt(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzgt zzc() {
        return zza;
    }

    static zzgt zze(zzgt zzgtVar, zzgt zzgtVar2) {
        int i2 = zzgtVar.zzb + zzgtVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgtVar.zzc, i2);
        System.arraycopy(zzgtVar2.zzc, 0, iArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgtVar.zzd, i2);
        System.arraycopy(zzgtVar2.zzd, 0, objArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        return new zzgt(i2, iArrCopyOf, objArrCopyOf, true);
    }

    static zzgt zzf() {
        return new zzgt(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzgt)) {
            return false;
        }
        zzgt zzgtVar = (zzgt) obj;
        int i2 = this.zzb;
        if (i2 == zzgtVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgtVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgtVar.zzd;
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
        int iZzA;
        int iZzB;
        int iZzA2;
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
                    iZzA2 = zzdn.zzA(i6 << 3) + 8;
                } else if (i7 == 2) {
                    zzdf zzdfVar = (zzdf) this.zzd[i4];
                    int iZzA3 = zzdn.zzA(i6 << 3);
                    int iZzd = zzdfVar.zzd();
                    iZzA2 = iZzA3 + zzdn.zzA(iZzd) + iZzd;
                } else if (i7 == 3) {
                    int iZzA4 = zzdn.zzA(i6 << 3);
                    iZzA = iZzA4 + iZzA4;
                    iZzB = ((zzgt) this.zzd[i4]).zza();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzeq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    iZzA2 = zzdn.zzA(i6 << 3) + 4;
                }
                i3 += iZzA2;
            } else {
                long jLongValue = ((Long) this.zzd[i4]).longValue();
                iZzA = zzdn.zzA(i6 << 3);
                iZzB = zzdn.zzB(jLongValue);
            }
            iZzA2 = iZzA + iZzB;
            i3 += iZzA2;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzA = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzdf zzdfVar = (zzdf) this.zzd[i3];
            int iZzA2 = zzdn.zzA(8);
            int iZzA3 = zzdn.zzA(16) + zzdn.zzA(i4);
            int iZzA4 = zzdn.zzA(24);
            int iZzd = zzdfVar.zzd();
            iZzA += iZzA2 + iZzA2 + iZzA3 + iZzA4 + zzdn.zzA(iZzd) + iZzd;
        }
        this.zze = iZzA;
        return iZzA;
    }

    final zzgt zzd(zzgt zzgtVar) {
        if (zzgtVar.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzgtVar.zzb;
        zzm(i2);
        System.arraycopy(zzgtVar.zzc, 0, this.zzc, this.zzb, zzgtVar.zzb);
        System.arraycopy(zzgtVar.zzd, 0, this.zzd, this.zzb, zzgtVar.zzb);
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
            zzfo.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
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

    final void zzk(zzhh zzhhVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzhhVar.zzw(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzl(zzhh zzhhVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzhhVar.zzt(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzhhVar.zzm(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzhhVar.zzd(i5, (zzdf) obj);
                } else if (i4 == 3) {
                    zzhhVar.zzF(i5);
                    ((zzgt) obj).zzl(zzhhVar);
                    zzhhVar.zzh(i5);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new zzeq("Protocol message tag had invalid wire type."));
                    }
                    zzhhVar.zzk(i5, ((Integer) obj).intValue());
                }
            }
        }
    }
}
