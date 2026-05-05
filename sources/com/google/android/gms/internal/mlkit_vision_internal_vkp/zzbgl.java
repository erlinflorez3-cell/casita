package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzbgl extends zzbdd {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzbdd zzd;
    private final zzbdd zze;
    private final int zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: private */
    zzbgl(zzbdd zzbddVar, zzbdd zzbddVar2) {
        this.zzd = zzbddVar;
        this.zze = zzbddVar2;
        int iZzd = zzbddVar.zzd();
        this.zzf = iZzd;
        this.zzc = iZzd + zzbddVar2.zzd();
        this.zzg = Math.max(zzbddVar.zzf(), zzbddVar2.zzf()) + 1;
    }

    /* synthetic */ zzbgl(zzbdd zzbddVar, zzbdd zzbddVar2, zzbgk zzbgkVar) {
        this(zzbddVar, zzbddVar2);
    }

    static int zzc(int i2) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    static zzbdd zzt(zzbdd zzbddVar, zzbdd zzbddVar2) {
        if (zzbddVar2.zzd() == 0) {
            return zzbddVar;
        }
        if (zzbddVar.zzd() == 0) {
            return zzbddVar2;
        }
        int iZzd = zzbddVar.zzd() + zzbddVar2.zzd();
        if (iZzd < 128) {
            return zzu(zzbddVar, zzbddVar2);
        }
        if (zzbddVar instanceof zzbgl) {
            zzbgl zzbglVar = (zzbgl) zzbddVar;
            if (zzbglVar.zze.zzd() + zzbddVar2.zzd() < 128) {
                return new zzbgl(zzbglVar.zzd, zzu(zzbglVar.zze, zzbddVar2));
            }
            if (zzbglVar.zzd.zzf() > zzbglVar.zze.zzf() && zzbglVar.zzg > zzbddVar2.zzf()) {
                return new zzbgl(zzbglVar.zzd, new zzbgl(zzbglVar.zze, zzbddVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzbddVar.zzf(), zzbddVar2.zzf()) + 1) ? new zzbgl(zzbddVar, zzbddVar2) : zzbgh.zza(new zzbgh(null), zzbddVar, zzbddVar2);
    }

    private static zzbdd zzu(zzbdd zzbddVar, zzbdd zzbddVar2) {
        int iZzd = zzbddVar.zzd();
        int iZzd2 = zzbddVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzbddVar.zzr(bArr, 0, 0, iZzd);
        zzbddVar2.zzr(bArr, 0, iZzd, iZzd2);
        return new zzbdc(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbdd)) {
            return false;
        }
        zzbdd zzbddVar = (zzbdd) obj;
        if (this.zzc != zzbddVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzm = zzm();
        int iZzm2 = zzbddVar.zzm();
        if (iZzm != 0 && iZzm2 != 0 && iZzm != iZzm2) {
            return false;
        }
        zzbgj zzbgjVar = new zzbgj(this, null);
        zzbdb next = zzbgjVar.next();
        zzbgj zzbgjVar2 = new zzbgj(zzbddVar, null);
        zzbdb next2 = zzbgjVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iZzd = next.zzd() - i2;
            int iZzd2 = next2.zzd() - i3;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i2 == 0 ? next.zzg(next2, i3, iMin) : next2.zzg(next, i2, iMin))) {
                return false;
            }
            i4 += iMin;
            int i5 = this.zzc;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                i2 = 0;
                next = zzbgjVar.next();
            } else {
                i2 += iMin;
                next = next;
            }
            if (iMin == iZzd2) {
                next2 = zzbgjVar2.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzbgf(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public final byte zza(int i2) {
        zzq(i2, this.zzc);
        return zzb(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    final byte zzb(int i2) {
        int i3 = this.zzf;
        return i2 < i3 ? this.zzd.zzb(i2) : this.zze.zzb(i2 - i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    protected final void zze(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.zzf;
        if (i5 <= i6) {
            this.zzd.zze(bArr, i2, i3, i4);
        } else {
            if (i2 >= i6) {
                this.zze.zze(bArr, i2 - i6, i3, i4);
                return;
            }
            int i7 = i6 - i2;
            this.zzd.zze(bArr, i2, i3, i7);
            this.zze.zze(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    protected final int zzi(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.zzf;
        if (i5 <= i6) {
            return this.zzd.zzi(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.zze.zzi(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.zze.zzi(this.zzd.zzi(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public final zzbdd zzj(int i2, int i3) {
        int iZzl = zzl(i2, i3, this.zzc);
        if (iZzl == 0) {
            return zzbdd.zzb;
        }
        if (iZzl == this.zzc) {
            return this;
        }
        int i4 = this.zzf;
        if (i3 <= i4) {
            return this.zzd.zzj(i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzj(i2 - i4, i3 - i4);
        }
        zzbdd zzbddVar = this.zzd;
        return new zzbgl(zzbddVar.zzj(i2, zzbddVar.zzd()), this.zze.zzj(0, i3 - this.zzf));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    final void zzk(zzbcu zzbcuVar) throws IOException {
        this.zzd.zzk(zzbcuVar);
        this.zze.zzk(zzbcuVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    /* JADX INFO: renamed from: zzn */
    public final zzbcy iterator() {
        return new zzbgf(this);
    }
}
