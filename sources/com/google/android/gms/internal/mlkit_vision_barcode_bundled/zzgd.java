package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzgd extends zzdf {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzdf zzd;
    private final zzdf zze;
    private final int zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: private */
    zzgd(zzdf zzdfVar, zzdf zzdfVar2) {
        this.zzd = zzdfVar;
        this.zze = zzdfVar2;
        int iZzd = zzdfVar.zzd();
        this.zzf = iZzd;
        this.zzc = iZzd + zzdfVar2.zzd();
        this.zzg = Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1;
    }

    /* synthetic */ zzgd(zzdf zzdfVar, zzdf zzdfVar2, zzgc zzgcVar) {
        this(zzdfVar, zzdfVar2);
    }

    static int zzc(int i2) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    static zzdf zzy(zzdf zzdfVar, zzdf zzdfVar2) {
        if (zzdfVar2.zzd() == 0) {
            return zzdfVar;
        }
        if (zzdfVar.zzd() == 0) {
            return zzdfVar2;
        }
        int iZzd = zzdfVar.zzd() + zzdfVar2.zzd();
        if (iZzd < 128) {
            return zzz(zzdfVar, zzdfVar2);
        }
        if (zzdfVar instanceof zzgd) {
            zzgd zzgdVar = (zzgd) zzdfVar;
            if (zzgdVar.zze.zzd() + zzdfVar2.zzd() < 128) {
                return new zzgd(zzgdVar.zzd, zzz(zzgdVar.zze, zzdfVar2));
            }
            if (zzgdVar.zzd.zzf() > zzgdVar.zze.zzf() && zzgdVar.zzg > zzdfVar2.zzf()) {
                return new zzgd(zzgdVar.zzd, new zzgd(zzgdVar.zze, zzdfVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1) ? new zzgd(zzdfVar, zzdfVar2) : zzfz.zza(new zzfz(null), zzdfVar, zzdfVar2);
    }

    private static zzdf zzz(zzdf zzdfVar, zzdf zzdfVar2) {
        int iZzd = zzdfVar.zzd();
        int iZzd2 = zzdfVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzdfVar.zzv(bArr, 0, 0, iZzd);
        zzdfVar2.zzv(bArr, 0, iZzd, iZzd2);
        return new zzde(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        if (this.zzc != zzdfVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzp = zzp();
        int iZzp2 = zzdfVar.zzp();
        if (iZzp != 0 && iZzp2 != 0 && iZzp != iZzp2) {
            return false;
        }
        zzgb zzgbVar = new zzgb(this, null);
        zzdd next = zzgbVar.next();
        zzgb zzgbVar2 = new zzgb(zzdfVar, null);
        zzdd next2 = zzgbVar2.next();
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
                next = zzgbVar.next();
            } else {
                i2 += iMin;
                next = next;
            }
            if (iMin == iZzd2) {
                next2 = zzgbVar2.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfx(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zza(int i2) {
        zzu(i2, this.zzc);
        return zzb(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    final byte zzb(int i2) {
        int i3 = this.zzf;
        return i2 < i3 ? this.zzd.zzb(i2) : this.zze.zzb(i2 - i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final int zzj(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.zzf;
        if (i5 <= i6) {
            return this.zzd.zzj(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.zze.zzj(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.zze.zzj(this.zzd.zzj(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i2, int i3) {
        int iZzo = zzo(i2, i3, this.zzc);
        if (iZzo == 0) {
            return zzdf.zzb;
        }
        if (iZzo == this.zzc) {
            return this;
        }
        int i4 = this.zzf;
        if (i3 <= i4) {
            return this.zzd.zzk(i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzk(i2 - i4, i3 - i4);
        }
        zzdf zzdfVar = this.zzd;
        return new zzgd(zzdfVar.zzk(i2, zzdfVar.zzd()), this.zze.zzk(0, i3 - this.zzf));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final String zzl(Charset charset) {
        return new String(zzw(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    final void zzm(zzcx zzcxVar) throws IOException {
        this.zzd.zzm(zzcxVar);
        this.zze.zzm(zzcxVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        zzdf zzdfVar = this.zzd;
        zzdf zzdfVar2 = this.zze;
        return zzdfVar2.zzj(zzdfVar.zzj(0, 0, this.zzf), 0, zzdfVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    /* JADX INFO: renamed from: zzq */
    public final zzdb iterator() {
        return new zzfx(this);
    }
}
