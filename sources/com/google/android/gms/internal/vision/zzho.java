package com.google.android.gms.internal.vision;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzho extends zzhm {
    private final boolean zza;
    private final byte[] zzb;
    private int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public zzho(ByteBuffer byteBuffer, boolean z2) {
        super(null);
        this.zza = true;
        this.zzb = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        this.zzc = iArrayOffset;
        this.zzd = iArrayOffset;
        this.zze = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final Object zza(zzml zzmlVar, Class<?> cls, zzio zzioVar) throws IOException {
        switch (zzhp.zza[zzmlVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzk());
            case 2:
                return zzn();
            case 3:
                return Double.valueOf(zzd());
            case 4:
                return Integer.valueOf(zzp());
            case 5:
                return Integer.valueOf(zzj());
            case 6:
                return Long.valueOf(zzi());
            case 7:
                return Float.valueOf(zze());
            case 8:
                return Integer.valueOf(zzh());
            case 9:
                return Long.valueOf(zzg());
            case 10:
                return zza(cls, zzioVar);
            case 11:
                return Integer.valueOf(zzq());
            case 12:
                return Long.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Long.valueOf(zzt());
            case 15:
                return zza(true);
            case 16:
                return Integer.valueOf(zzo());
            case 17:
                return Long.valueOf(zzf());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final String zza(boolean z2) throws IOException {
        zzc(2);
        int iZzv = zzv();
        if (iZzv == 0) {
            return "";
        }
        zzb(iZzv);
        if (z2) {
            byte[] bArr = this.zzb;
            int i2 = this.zzc;
            if (!zzmd.zza(bArr, i2, i2 + iZzv)) {
                throw zzjk.zzh();
            }
        }
        String str = new String(this.zzb, this.zzc, iZzv, zzjf.zza);
        this.zzc += iZzv;
        return str;
    }

    private final void zza(int i2) throws IOException {
        zzb(i2);
        this.zzc += i2;
    }

    private final void zza(List<String> list, boolean z2) throws IOException {
        int i2;
        int i3;
        if ((this.zzf & 7) != 2) {
            throw zzjk.zzf();
        }
        if (!(list instanceof zzjv) || z2) {
            do {
                list.add(zza(z2));
                if (zzu()) {
                    return;
                } else {
                    i2 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i2;
            return;
        }
        zzjv zzjvVar = (zzjv) list;
        do {
            zzjvVar.zza(zzn());
            if (zzu()) {
                return;
            } else {
                i3 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i3;
    }

    private final long zzaa() throws IOException {
        zzb(8);
        return zzac();
    }

    private final int zzab() {
        int i2 = this.zzc;
        byte[] bArr = this.zzb;
        this.zzc = i2 + 4;
        int i3 = (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - bArr[i2]) | ((-1) - 255)))) & ((-1) - (((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 8))))) & ((-1) - (((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16)));
        byte b2 = bArr[i2 + 3];
        return (-1) - (((-1) - (((b2 + 255) - (b2 | 255)) << 24)) & ((-1) - i3));
    }

    private final long zzac() {
        int i2 = this.zzc;
        byte[] bArr = this.zzb;
        this.zzc = i2 + 8;
        long j2 = ((long) bArr[i2]) & 255;
        long j3 = bArr[i2 + 1];
        long j4 = ((j3 + 255) - (j3 | 255)) << 8;
        long j5 = (j2 + j4) - (j2 & j4);
        long j6 = (((long) bArr[i2 + 2]) & 255) << 16;
        long j7 = (-1) - (((-1) - ((j5 + j6) - (j5 & j6))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 3])) | ((-1) - 255))) << 24)));
        long j8 = bArr[i2 + 4];
        long j9 = (-1) - (((-1) - ((-1) - (((-1) - j7) & ((-1) - (((j8 + 255) - (j8 | 255)) << 32))))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 5])) | ((-1) - 255))) << 40)));
        long j10 = bArr[i2 + 6];
        long j11 = (-1) - (((-1) - j9) & ((-1) - (((j10 + 255) - (j10 | 255)) << 48)));
        long j12 = (((long) bArr[i2 + 7]) & 255) << 56;
        return (j12 + j11) - (j12 & j11);
    }

    private final void zzb(int i2) throws IOException {
        if (i2 < 0 || i2 > this.zze - this.zzc) {
            throw zzjk.zza();
        }
    }

    private final <T> T zzc(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int iZzv = zzv();
        zzb(iZzv);
        int i2 = this.zze;
        int i3 = this.zzc + iZzv;
        this.zze = i3;
        try {
            T tZza = zzlcVar.zza();
            zzlcVar.zza(tZza, this, zzioVar);
            zzlcVar.zzc(tZza);
            if (this.zzc == i3) {
                return tZza;
            }
            throw zzjk.zzg();
        } finally {
            this.zze = i2;
        }
    }

    private final void zzc(int i2) throws IOException {
        if ((this.zzf & 7) != i2) {
            throw zzjk.zzf();
        }
    }

    private final <T> T zzd(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int i2 = this.zzg;
        this.zzg = (-1) - (((-1) - ((this.zzf >>> 3) << 3)) & ((-1) - 4));
        try {
            T tZza = zzlcVar.zza();
            zzlcVar.zza(tZza, this, zzioVar);
            zzlcVar.zzc(tZza);
            if (this.zzf == this.zzg) {
                return tZza;
            }
            throw zzjk.zzg();
        } finally {
            this.zzg = i2;
        }
    }

    private final void zzd(int i2) throws IOException {
        zzb(i2);
        if ((-1) - (((-1) - i2) | ((-1) - 7)) != 0) {
            throw zzjk.zzg();
        }
    }

    private final void zze(int i2) throws IOException {
        zzb(i2);
        if ((i2 & 3) != 0) {
            throw zzjk.zzg();
        }
    }

    private final void zzf(int i2) throws IOException {
        if (this.zzc != i2) {
            throw zzjk.zza();
        }
    }

    private final boolean zzu() {
        return this.zzc == this.zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0072 A[PHI: r1
  0x0072: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:72:0x0056, B:76:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzv() throws java.io.IOException {
        /*
            r7 = this;
            int r5 = r7.zzc
            int r1 = r7.zze
            if (r1 == r5) goto L7b
            byte[] r4 = r7.zzb
            int r3 = r5 + 1
            r2 = r4[r5]
            if (r2 < 0) goto L11
            r7.zzc = r3
            return r2
        L11:
            int r1 = r1 - r3
            r0 = 9
            if (r1 >= r0) goto L1c
            long r1 = r7.zzx()
            int r0 = (int) r1
            return r0
        L1c:
            int r1 = r5 + 2
            r0 = r4[r3]
            int r6 = r0 << 7
            r6 = r6 ^ r2
            if (r6 >= 0) goto L2a
            r0 = r6 ^ (-128(0xffffffffffffff80, float:NaN))
        L27:
            r7.zzc = r1
            return r0
        L2a:
            int r3 = r5 + 3
            r0 = r4[r1]
            int r2 = r0 << 14
            r2 = r2 ^ r6
            if (r2 < 0) goto L37
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L35:
            r1 = r3
            goto L27
        L37:
            int r1 = r5 + 4
            r0 = r4[r3]
            int r0 = r0 << 21
            r2 = r2 ^ r0
            if (r2 >= 0) goto L45
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
        L44:
            goto L27
        L45:
            int r3 = r5 + 5
            r1 = r4[r1]
            int r0 = r1 << 28
            r2 = r2 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r0
            if (r1 >= 0) goto L74
            int r1 = r5 + 6
            r0 = r4[r3]
            if (r0 >= 0) goto L72
            int r3 = r5 + 7
            r0 = r4[r1]
            if (r0 >= 0) goto L74
            int r1 = r5 + 8
            r0 = r4[r3]
            if (r0 >= 0) goto L72
            int r3 = r5 + 9
            r0 = r4[r1]
            if (r0 >= 0) goto L74
            int r1 = r5 + 10
            r0 = r4[r3]
            if (r0 < 0) goto L76
            r0 = r2
            goto L27
        L72:
            r0 = r2
            goto L44
        L74:
            r0 = r2
            goto L35
        L76:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzc()
            throw r0
        L7b:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzho.zzv():int");
    }

    private final long zzw() throws IOException {
        long j2;
        long j3;
        long j4;
        int i2 = this.zzc;
        int i3 = this.zze;
        if (i3 == i2) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzb;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            this.zzc = i4;
            return b2;
        }
        if (i3 - i4 < 9) {
            return zzx();
        }
        int i5 = i2 + 2;
        int i6 = (bArr[i4] << 7) ^ b2;
        if (i6 < 0) {
            j2 = i6 ^ (-128);
        } else {
            int i7 = i2 + 3;
            int i8 = (bArr[i5] << Ascii.SO) ^ i6;
            if (i8 >= 0) {
                j2 = i8 ^ 16256;
                i5 = i7;
            } else {
                int i9 = i2 + 4;
                int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                if (i10 < 0) {
                    j2 = (-2080896) ^ i10;
                    i5 = i9;
                } else {
                    i5 = i2 + 5;
                    long j5 = ((long) i10) ^ (((long) bArr[i9]) << 28);
                    if (j5 >= 0) {
                        j4 = 266354560;
                    } else {
                        int i11 = i2 + 6;
                        long j6 = j5 ^ (((long) bArr[i5]) << 35);
                        if (j6 < 0) {
                            j3 = -34093383808L;
                        } else {
                            i5 = i2 + 7;
                            j5 = j6 ^ (((long) bArr[i11]) << 42);
                            if (j5 >= 0) {
                                j4 = 4363953127296L;
                            } else {
                                i11 = i2 + 8;
                                j6 = j5 ^ (((long) bArr[i5]) << 49);
                                if (j6 < 0) {
                                    j3 = -558586000294016L;
                                } else {
                                    i5 = i2 + 9;
                                    j2 = (j6 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                    if (j2 < 0) {
                                        int i12 = i2 + 10;
                                        if (bArr[i5] < 0) {
                                            throw zzjk.zzc();
                                        }
                                        i5 = i12;
                                    }
                                }
                            }
                        }
                        j2 = j6 ^ j3;
                        i5 = i11;
                    }
                    j2 = j5 ^ j4;
                }
            }
        }
        this.zzc = i5;
        return j2;
    }

    private final long zzx() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bZzy = zzy();
            j2 |= ((long) (127 & bZzy)) << i2;
            if ((-1) - (((-1) - bZzy) | ((-1) - 128)) == 0) {
                return j2;
            }
        }
        throw zzjk.zzc();
    }

    private final byte zzy() throws IOException {
        int i2 = this.zzc;
        if (i2 == this.zze) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzb;
        this.zzc = i2 + 1;
        return bArr[i2];
    }

    private final int zzz() throws IOException {
        zzb(4);
        return zzab();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zza() throws IOException {
        if (zzu()) {
            return Integer.MAX_VALUE;
        }
        int iZzv = zzv();
        this.zzf = iZzv;
        if (iZzv == this.zzg) {
            return Integer.MAX_VALUE;
        }
        return iZzv >>> 3;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zza(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        zzc(2);
        return (T) zzc(zzlcVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zza(Class<T> cls, zzio zzioVar) throws IOException {
        zzc(2);
        return (T) zzc(zzky.zza().zza((Class) cls), zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zza(List<Double> list) throws IOException {
        int i2;
        int i3;
        if (!(list instanceof zzin)) {
            int i4 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
            if (i4 == 1) {
                do {
                    list.add(Double.valueOf(zzd()));
                    if (zzu()) {
                        return;
                    } else {
                        i2 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i2;
                return;
            }
            if (i4 != 2) {
                throw zzjk.zzf();
            }
            int iZzv = zzv();
            zzd(iZzv);
            int i5 = this.zzc + iZzv;
            while (this.zzc < i5) {
                list.add(Double.valueOf(Double.longBitsToDouble(zzac())));
            }
            return;
        }
        zzin zzinVar = (zzin) list;
        int i6 = this.zzf;
        int i7 = (i6 + 7) - (i6 | 7);
        if (i7 == 1) {
            do {
                zzinVar.zza(zzd());
                if (zzu()) {
                    return;
                } else {
                    i3 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i3;
            return;
        }
        if (i7 != 2) {
            throw zzjk.zzf();
        }
        int iZzv2 = zzv();
        zzd(iZzv2);
        int i8 = this.zzc + iZzv2;
        while (this.zzc < i8) {
            zzinVar.zza(Double.longBitsToDouble(zzac()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> void zza(List<T> list, zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int i2;
        int i3 = this.zzf;
        if ((-1) - (((-1) - i3) | ((-1) - 7)) != 2) {
            throw zzjk.zzf();
        }
        do {
            list.add(zzc(zzlcVar, zzioVar));
            if (zzu()) {
                return;
            } else {
                i2 = this.zzc;
            }
        } while (zzv() == i3);
        this.zzc = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzld
    public final <K, V> void zza(Map<K, V> map, zzkf<K, V> zzkfVar, zzio zzioVar) throws IOException {
        zzc(2);
        int iZzv = zzv();
        zzb(iZzv);
        int i2 = this.zze;
        this.zze = this.zzc + iZzv;
        try {
            Object objZza = zzkfVar.zzb;
            Object objZza2 = zzkfVar.zzd;
            while (true) {
                int iZza = zza();
                if (iZza == Integer.MAX_VALUE) {
                    map.put(objZza, objZza2);
                    return;
                }
                if (iZza == 1) {
                    objZza = zza(zzkfVar.zza, (Class<?>) null, (zzio) null);
                } else if (iZza != 2) {
                    try {
                        if (!zzc()) {
                            throw new zzjk("Unable to parse map entry.");
                        }
                    } catch (zzjn unused) {
                        if (!zzc()) {
                            throw new zzjk("Unable to parse map entry.");
                        }
                    }
                } else {
                    objZza2 = zza(zzkfVar.zzc, zzkfVar.zzd.getClass(), zzioVar);
                }
            }
        } finally {
            this.zze = i2;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zzb(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        zzc(3);
        return (T) zzd(zzlcVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zzb(Class<T> cls, zzio zzioVar) throws IOException {
        zzc(3);
        return (T) zzd(zzky.zza().zza((Class) cls), zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzb(List<Float> list) throws IOException {
        int i2;
        int i3;
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i4 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
            if (i4 == 2) {
                int iZzv = zzv();
                zze(iZzv);
                int i5 = this.zzc + iZzv;
                while (this.zzc < i5) {
                    zzjaVar.zza(Float.intBitsToFloat(zzab()));
                }
                return;
            }
            if (i4 != 5) {
                throw zzjk.zzf();
            }
            do {
                zzjaVar.zza(zze());
                if (zzu()) {
                    return;
                } else {
                    i3 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i3;
            return;
        }
        int i6 = this.zzf;
        int i7 = (i6 + 7) - (i6 | 7);
        if (i7 == 2) {
            int iZzv2 = zzv();
            zze(iZzv2);
            int i8 = this.zzc + iZzv2;
            while (this.zzc < i8) {
                list.add(Float.valueOf(Float.intBitsToFloat(zzab())));
            }
            return;
        }
        if (i7 != 5) {
            throw zzjk.zzf();
        }
        do {
            list.add(Float.valueOf(zze()));
            if (zzu()) {
                return;
            } else {
                i2 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> void zzb(List<T> list, zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int i2;
        int i3 = this.zzf;
        if ((i3 & 7) != 3) {
            throw zzjk.zzf();
        }
        do {
            list.add(zzd(zzlcVar, zzioVar));
            if (zzu()) {
                return;
            } else {
                i2 = this.zzc;
            }
        } while (zzv() == i3);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzc(List<Long> list) throws IOException {
        int i2;
        int i3;
        if (!(list instanceof zzjy)) {
            int i4 = this.zzf;
            int i5 = (i4 + 7) - (i4 | 7);
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(zzf()));
                    if (zzu()) {
                        return;
                    } else {
                        i2 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i2;
                return;
            }
            if (i5 != 2) {
                throw zzjk.zzf();
            }
            int iZzv = this.zzc + zzv();
            while (this.zzc < iZzv) {
                list.add(Long.valueOf(zzw()));
            }
            zzf(iZzv);
            return;
        }
        zzjy zzjyVar = (zzjy) list;
        int i6 = this.zzf;
        int i7 = (i6 + 7) - (i6 | 7);
        if (i7 == 0) {
            do {
                zzjyVar.zza(zzf());
                if (zzu()) {
                    return;
                } else {
                    i3 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i3;
            return;
        }
        if (i7 != 2) {
            throw zzjk.zzf();
        }
        int iZzv2 = this.zzc + zzv();
        while (this.zzc < iZzv2) {
            zzjyVar.zza(zzw());
        }
        zzf(iZzv2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0081  */
    @Override // com.google.android.gms.internal.vision.zzld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc() throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.zzu()
            r6 = 0
            if (r0 != 0) goto Ld
            int r4 = r7.zzf
            int r3 = r7.zzg
            if (r4 != r3) goto Le
        Ld:
            return r6
        Le:
            r0 = 7
            int r1 = (-1) - r4
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r1 = (-1) - r1
            r5 = 1
            if (r1 == 0) goto L64
            if (r1 == r5) goto L5e
            r0 = 2
            if (r1 == r0) goto L56
            r2 = 4
            r0 = 3
            if (r1 == r0) goto L2e
            r0 = 5
            if (r1 != r0) goto L29
            r7.zza(r2)
            return r5
        L29:
            com.google.android.gms.internal.vision.zzjn r0 = com.google.android.gms.internal.vision.zzjk.zzf()
            throw r0
        L2e:
            int r4 = r4 >>> r0
            int r4 = r4 << r0
            int r1 = (-1) - r4
            int r0 = (-1) - r2
            r1 = r1 & r0
            int r0 = (-1) - r1
            r7.zzg = r0
        L39:
            int r1 = r7.zza()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L48
            boolean r0 = r7.zzc()
            if (r0 != 0) goto L39
        L48:
            int r1 = r7.zzf
            int r0 = r7.zzg
            if (r1 != r0) goto L51
            r7.zzg = r3
            return r5
        L51:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzg()
            throw r0
        L56:
            int r0 = r7.zzv()
            r7.zza(r0)
            return r5
        L5e:
            r0 = 8
            r7.zza(r0)
            return r5
        L64:
            int r1 = r7.zze
            int r0 = r7.zzc
            int r1 = r1 - r0
            r4 = 10
            if (r1 < r4) goto L7f
            byte[] r3 = r7.zzb
            r2 = r6
        L70:
            if (r2 >= r4) goto L7f
            int r1 = r0 + 1
            r0 = r3[r0]
            if (r0 < 0) goto L7b
            r7.zzc = r1
        L7a:
            return r5
        L7b:
            int r2 = r2 + 1
            r0 = r1
            goto L70
        L7f:
            if (r6 >= r4) goto L8a
            byte r0 = r7.zzy()
            if (r0 >= 0) goto L7a
            int r6 = r6 + 1
            goto L7f
        L8a:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzc()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzho.zzc():boolean");
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final double zzd() throws IOException {
        zzc(1);
        return Double.longBitsToDouble(zzaa());
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzd(List<Long> list) throws IOException {
        int i2;
        int i3;
        if (!(list instanceof zzjy)) {
            int i4 = this.zzf;
            int i5 = (i4 + 7) - (i4 | 7);
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(zzg()));
                    if (zzu()) {
                        return;
                    } else {
                        i2 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i2;
                return;
            }
            if (i5 != 2) {
                throw zzjk.zzf();
            }
            int iZzv = this.zzc + zzv();
            while (this.zzc < iZzv) {
                list.add(Long.valueOf(zzw()));
            }
            zzf(iZzv);
            return;
        }
        zzjy zzjyVar = (zzjy) list;
        int i6 = this.zzf;
        int i7 = (i6 + 7) - (i6 | 7);
        if (i7 == 0) {
            do {
                zzjyVar.zza(zzg());
                if (zzu()) {
                    return;
                } else {
                    i3 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i3;
            return;
        }
        if (i7 != 2) {
            throw zzjk.zzf();
        }
        int iZzv2 = this.zzc + zzv();
        while (this.zzc < iZzv2) {
            zzjyVar.zza(zzw());
        }
        zzf(iZzv2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final float zze() throws IOException {
        zzc(5);
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zze(List<Integer> list) throws IOException {
        int i2;
        int i3;
        if (!(list instanceof zzjd)) {
            int i4 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(zzh()));
                    if (zzu()) {
                        return;
                    } else {
                        i2 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i2;
                return;
            }
            if (i4 != 2) {
                throw zzjk.zzf();
            }
            int iZzv = this.zzc + zzv();
            while (this.zzc < iZzv) {
                list.add(Integer.valueOf(zzv()));
            }
            zzf(iZzv);
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i5 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
        if (i5 == 0) {
            do {
                zzjdVar.zzc(zzh());
                if (zzu()) {
                    return;
                } else {
                    i3 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i3;
            return;
        }
        if (i5 != 2) {
            throw zzjk.zzf();
        }
        int iZzv2 = this.zzc + zzv();
        while (this.zzc < iZzv2) {
            zzjdVar.zzc(zzv());
        }
        zzf(iZzv2);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzf() throws IOException {
        zzc(0);
        return zzw();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzf(List<Long> list) throws IOException {
        int i2;
        int i3;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i4 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
            if (i4 == 1) {
                do {
                    zzjyVar.zza(zzi());
                    if (zzu()) {
                        return;
                    } else {
                        i3 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i3;
                return;
            }
            if (i4 != 2) {
                throw zzjk.zzf();
            }
            int iZzv = zzv();
            zzd(iZzv);
            int i5 = this.zzc + iZzv;
            while (this.zzc < i5) {
                zzjyVar.zza(zzac());
            }
            return;
        }
        int i6 = this.zzf;
        int i7 = (i6 + 7) - (i6 | 7);
        if (i7 == 1) {
            do {
                list.add(Long.valueOf(zzi()));
                if (zzu()) {
                    return;
                } else {
                    i2 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i2;
            return;
        }
        if (i7 != 2) {
            throw zzjk.zzf();
        }
        int iZzv2 = zzv();
        zzd(iZzv2);
        int i8 = this.zzc + iZzv2;
        while (this.zzc < i8) {
            list.add(Long.valueOf(zzac()));
        }
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzg() throws IOException {
        zzc(0);
        return zzw();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzg(List<Integer> list) throws IOException {
        int i2;
        int i3;
        if (!(list instanceof zzjd)) {
            int i4 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
            if (i4 == 2) {
                int iZzv = zzv();
                zze(iZzv);
                int i5 = this.zzc + iZzv;
                while (this.zzc < i5) {
                    list.add(Integer.valueOf(zzab()));
                }
                return;
            }
            if (i4 != 5) {
                throw zzjk.zzf();
            }
            do {
                list.add(Integer.valueOf(zzj()));
                if (zzu()) {
                    return;
                } else {
                    i2 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i2;
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i6 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
        if (i6 == 2) {
            int iZzv2 = zzv();
            zze(iZzv2);
            int i7 = this.zzc + iZzv2;
            while (this.zzc < i7) {
                zzjdVar.zzc(zzab());
            }
            return;
        }
        if (i6 != 5) {
            throw zzjk.zzf();
        }
        do {
            zzjdVar.zzc(zzj());
            if (zzu()) {
                return;
            } else {
                i3 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzh() throws IOException {
        zzc(0);
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzh(List<Boolean> list) throws IOException {
        int i2;
        int i3;
        if (list instanceof zzhr) {
            zzhr zzhrVar = (zzhr) list;
            int i4 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
            if (i4 != 0) {
                if (i4 != 2) {
                    throw zzjk.zzf();
                }
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    zzhrVar.zza(zzv() != 0);
                }
                zzf(iZzv);
                return;
            }
            do {
                zzhrVar.zza(zzk());
                if (zzu()) {
                    return;
                } else {
                    i3 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i3;
            return;
        }
        int i5 = this.zzf;
        int i6 = (i5 + 7) - (i5 | 7);
        if (i6 != 0) {
            if (i6 != 2) {
                throw zzjk.zzf();
            }
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                list.add(Boolean.valueOf(zzv() != 0));
            }
            zzf(iZzv2);
            return;
        }
        do {
            list.add(Boolean.valueOf(zzk()));
            if (zzu()) {
                return;
            } else {
                i2 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzi() throws IOException {
        zzc(1);
        return zzaa();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzi(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzj() throws IOException {
        zzc(5);
        return zzz();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzj(List<String> list) throws IOException {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzk(List<zzht> list) throws IOException {
        int i2;
        if ((-1) - (((-1) - this.zzf) | ((-1) - 7)) != 2) {
            throw zzjk.zzf();
        }
        do {
            list.add(zzn());
            if (zzu()) {
                return;
            } else {
                i2 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final boolean zzk() throws IOException {
        zzc(0);
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final String zzl() throws IOException {
        return zza(false);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzl(List<Integer> list) throws IOException {
        int i2;
        int i3;
        if (!(list instanceof zzjd)) {
            int i4 = this.zzf & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw zzjk.zzf();
                }
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    list.add(Integer.valueOf(zzv()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zzo()));
                if (zzu()) {
                    return;
                } else {
                    i2 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i2;
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i5 = this.zzf & 7;
        if (i5 != 0) {
            if (i5 != 2) {
                throw zzjk.zzf();
            }
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                zzjdVar.zzc(zzv());
            }
            return;
        }
        do {
            zzjdVar.zzc(zzo());
            if (zzu()) {
                return;
            } else {
                i3 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final String zzm() throws IOException {
        return zza(true);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzm(List<Integer> list) throws IOException {
        int i2;
        int i3;
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            int i4 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
            if (i4 != 0) {
                if (i4 != 2) {
                    throw zzjk.zzf();
                }
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    zzjdVar.zzc(zzv());
                }
                return;
            }
            do {
                zzjdVar.zzc(zzp());
                if (zzu()) {
                    return;
                } else {
                    i3 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i3;
            return;
        }
        int i5 = this.zzf;
        int i6 = (i5 + 7) - (i5 | 7);
        if (i6 != 0) {
            if (i6 != 2) {
                throw zzjk.zzf();
            }
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                list.add(Integer.valueOf(zzv()));
            }
            return;
        }
        do {
            list.add(Integer.valueOf(zzp()));
            if (zzu()) {
                return;
            } else {
                i2 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final zzht zzn() throws IOException {
        zzc(2);
        int iZzv = zzv();
        if (iZzv == 0) {
            return zzht.zza;
        }
        zzb(iZzv);
        zzht zzhtVarZzb = this.zza ? zzht.zzb(this.zzb, this.zzc, iZzv) : zzht.zza(this.zzb, this.zzc, iZzv);
        this.zzc += iZzv;
        return zzhtVarZzb;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzn(List<Integer> list) throws IOException {
        int i2;
        int i3;
        if (!(list instanceof zzjd)) {
            int i4 = this.zzf & 7;
            if (i4 == 2) {
                int iZzv = zzv();
                zze(iZzv);
                int i5 = this.zzc + iZzv;
                while (this.zzc < i5) {
                    list.add(Integer.valueOf(zzab()));
                }
                return;
            }
            if (i4 != 5) {
                throw zzjk.zzf();
            }
            do {
                list.add(Integer.valueOf(zzq()));
                if (zzu()) {
                    return;
                } else {
                    i2 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i2;
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i6 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
        if (i6 == 2) {
            int iZzv2 = zzv();
            zze(iZzv2);
            int i7 = this.zzc + iZzv2;
            while (this.zzc < i7) {
                zzjdVar.zzc(zzab());
            }
            return;
        }
        if (i6 != 5) {
            throw zzjk.zzf();
        }
        do {
            zzjdVar.zzc(zzq());
            if (zzu()) {
                return;
            } else {
                i3 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzo() throws IOException {
        zzc(0);
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzo(List<Long> list) throws IOException {
        int i2;
        int i3;
        if (!(list instanceof zzjy)) {
            int i4 = this.zzf & 7;
            if (i4 == 1) {
                do {
                    list.add(Long.valueOf(zzr()));
                    if (zzu()) {
                        return;
                    } else {
                        i2 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i2;
                return;
            }
            if (i4 != 2) {
                throw zzjk.zzf();
            }
            int iZzv = zzv();
            zzd(iZzv);
            int i5 = this.zzc + iZzv;
            while (this.zzc < i5) {
                list.add(Long.valueOf(zzac()));
            }
            return;
        }
        zzjy zzjyVar = (zzjy) list;
        int i6 = this.zzf;
        int i7 = (i6 + 7) - (i6 | 7);
        if (i7 == 1) {
            do {
                zzjyVar.zza(zzr());
                if (zzu()) {
                    return;
                } else {
                    i3 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i3;
            return;
        }
        if (i7 != 2) {
            throw zzjk.zzf();
        }
        int iZzv2 = zzv();
        zzd(iZzv2);
        int i8 = this.zzc + iZzv2;
        while (this.zzc < i8) {
            zzjyVar.zza(zzac());
        }
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzp() throws IOException {
        zzc(0);
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzp(List<Integer> list) throws IOException {
        int i2;
        int i3;
        if (!(list instanceof zzjd)) {
            int i4 = this.zzf & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw zzjk.zzf();
                }
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    list.add(Integer.valueOf(zzif.zze(zzv())));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zzs()));
                if (zzu()) {
                    return;
                } else {
                    i2 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i2;
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i5 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
        if (i5 != 0) {
            if (i5 != 2) {
                throw zzjk.zzf();
            }
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                zzjdVar.zzc(zzif.zze(zzv()));
            }
            return;
        }
        do {
            zzjdVar.zzc(zzs());
            if (zzu()) {
                return;
            } else {
                i3 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzq() throws IOException {
        zzc(5);
        return zzz();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzq(List<Long> list) throws IOException {
        int i2;
        int i3;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i4 = (-1) - (((-1) - this.zzf) | ((-1) - 7));
            if (i4 != 0) {
                if (i4 != 2) {
                    throw zzjk.zzf();
                }
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    zzjyVar.zza(zzif.zza(zzw()));
                }
                return;
            }
            do {
                zzjyVar.zza(zzt());
                if (zzu()) {
                    return;
                } else {
                    i3 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i3;
            return;
        }
        int i5 = this.zzf;
        int i6 = (i5 + 7) - (i5 | 7);
        if (i6 != 0) {
            if (i6 != 2) {
                throw zzjk.zzf();
            }
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                list.add(Long.valueOf(zzif.zza(zzw())));
            }
            return;
        }
        do {
            list.add(Long.valueOf(zzt()));
            if (zzu()) {
                return;
            } else {
                i2 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzr() throws IOException {
        zzc(1);
        return zzaa();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzs() throws IOException {
        zzc(0);
        return zzif.zze(zzv());
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzt() throws IOException {
        zzc(0);
        return zzif.zza(zzw());
    }
}
