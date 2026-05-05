package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzii extends zzhq {
    private static final Logger zzb = Logger.getLogger(zzii.class.getName());
    private static final boolean zzc = zzma.zza();
    zzil zza;

    private static class zza extends zzii {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        zza(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((-1) - (((-1) - (bArr.length - i3)) & ((-1) - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
            }
            this.zzb = bArr;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = i3;
        }

        private final void zzc(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.zzb, this.zze, i3);
                this.zze += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(byte b2) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zze;
                this.zze = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i2) throws IOException {
            if (i2 >= 0) {
                zzb(i2);
            } else {
                zza(i2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i2, int i3) throws IOException {
            zzb((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i2, long j2) throws IOException {
            zza(i2, 0);
            zza(j2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i2, zzht zzhtVar) throws IOException {
            zza(i2, 2);
            zza(zzhtVar);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i2, zzkk zzkkVar) throws IOException {
            zza(1, 3);
            zzc(2, i2);
            zza(3, 2);
            zza(zzkkVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        final void zza(int i2, zzkk zzkkVar, zzlc zzlcVar) throws IOException {
            zza(i2, 2);
            zzhf zzhfVar = (zzhf) zzkkVar;
            int iZzi = zzhfVar.zzi();
            if (iZzi == -1) {
                iZzi = zzlcVar.zzb(zzhfVar);
                zzhfVar.zzb(iZzi);
            }
            zzb(iZzi);
            zzlcVar.zza(zzkkVar, this.zza);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i2, String str) throws IOException {
            zza(i2, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i2, boolean z2) throws IOException {
            zza(i2, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(long j2) throws IOException {
            if (zzii.zzc && zza() >= 10) {
                while ((-1) - (((-1) - j2) | ((-1) - (-128))) != 0) {
                    byte[] bArr = this.zzb;
                    int i2 = this.zze;
                    this.zze = i2 + 1;
                    zzma.zza(bArr, i2, (byte) ((-1) - (((-1) - ((-1) - (((-1) - ((int) j2)) | ((-1) - 127)))) & ((-1) - 128))));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i3 = this.zze;
                this.zze = i3 + 1;
                zzma.zza(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 - 128) - (j2 | (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i4 = this.zze;
                    this.zze = i4 + 1;
                    int i5 = ((int) j2) & 127;
                    bArr3[i4] = (byte) ((i5 + 128) - (i5 & 128));
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
                }
            }
            byte[] bArr4 = this.zzb;
            int i6 = this.zze;
            this.zze = i6 + 1;
            bArr4[i6] = (byte) j2;
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(zzht zzhtVar) throws IOException {
            zzb(zzhtVar.zza());
            zzhtVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(zzkk zzkkVar) throws IOException {
            zzb(zzkkVar.zzm());
            zzkkVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(String str) throws IOException {
            int i2 = this.zze;
            try {
                int iZzg = zzg(str.length() * 3);
                int iZzg2 = zzg(str.length());
                if (iZzg2 != iZzg) {
                    zzb(zzmd.zza(str));
                    this.zze = zzmd.zza(str, this.zzb, this.zze, zza());
                    return;
                }
                int i3 = i2 + iZzg2;
                this.zze = i3;
                int iZza = zzmd.zza(str, this.zzb, i3, zza());
                this.zze = i2;
                zzb((iZza - i2) - iZzg2);
                this.zze = iZza;
            } catch (zzmg e2) {
                this.zze = i2;
                zza(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(e3);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzhq
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            zzc(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(int i2) throws IOException {
            if (!zzii.zzc || zzhi.zza() || zza() < 5) {
                while ((i2 - 128) - ((-128) | i2) != 0) {
                    try {
                        byte[] bArr = this.zzb;
                        int i3 = this.zze;
                        this.zze = i3 + 1;
                        int i4 = (-1) - (((-1) - i2) | ((-1) - 127));
                        bArr[i3] = (byte) ((i4 + 128) - (i4 & 128));
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
                    }
                }
                byte[] bArr2 = this.zzb;
                int i5 = this.zze;
                this.zze = i5 + 1;
                bArr2[i5] = (byte) i2;
                return;
            }
            if ((-1) - (((-1) - i2) | ((-1) - (-128))) == 0) {
                byte[] bArr3 = this.zzb;
                int i6 = this.zze;
                this.zze = i6 + 1;
                zzma.zza(bArr3, i6, (byte) i2);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i7 = this.zze;
            this.zze = i7 + 1;
            zzma.zza(bArr4, i7, (byte) (128 | i2));
            int i8 = i2 >>> 7;
            if ((i8 - 128) - ((-128) | i8) == 0) {
                byte[] bArr5 = this.zzb;
                int i9 = this.zze;
                this.zze = i9 + 1;
                zzma.zza(bArr5, i9, (byte) i8);
                return;
            }
            byte[] bArr6 = this.zzb;
            int i10 = this.zze;
            this.zze = i10 + 1;
            zzma.zza(bArr6, i10, (byte) (i8 | 128));
            int i11 = i2 >>> 14;
            if ((i11 - 128) - ((-128) | i11) == 0) {
                byte[] bArr7 = this.zzb;
                int i12 = this.zze;
                this.zze = i12 + 1;
                zzma.zza(bArr7, i12, (byte) i11);
                return;
            }
            byte[] bArr8 = this.zzb;
            int i13 = this.zze;
            this.zze = i13 + 1;
            zzma.zza(bArr8, i13, (byte) (i11 | 128));
            int i14 = i2 >>> 21;
            if ((i14 - 128) - ((-128) | i14) == 0) {
                byte[] bArr9 = this.zzb;
                int i15 = this.zze;
                this.zze = i15 + 1;
                zzma.zza(bArr9, i15, (byte) i14);
                return;
            }
            byte[] bArr10 = this.zzb;
            int i16 = this.zze;
            this.zze = i16 + 1;
            zzma.zza(bArr10, i16, (byte) (i14 | 128));
            byte[] bArr11 = this.zzb;
            int i17 = this.zze;
            this.zze = i17 + 1;
            zzma.zza(bArr11, i17, (byte) (i2 >>> 28));
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(int i2, int i3) throws IOException {
            zza(i2, 0);
            zza(i3);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(int i2, zzht zzhtVar) throws IOException {
            zza(1, 3);
            zzc(2, i2);
            zza(3, zzhtVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(byte[] bArr, int i2, int i3) throws IOException {
            zzb(i3);
            zzc(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzc(int i2, int i3) throws IOException {
            zza(i2, 0);
            zzb(i3);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzc(int i2, long j2) throws IOException {
            zza(i2, 1);
            zzc(j2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzc(long j2) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zze;
                int i3 = i2 + 1;
                this.zze = i3;
                bArr[i2] = (byte) j2;
                int i4 = i2 + 2;
                this.zze = i4;
                bArr[i3] = (byte) (j2 >> 8);
                int i5 = i2 + 3;
                this.zze = i5;
                bArr[i4] = (byte) (j2 >> 16);
                int i6 = i2 + 4;
                this.zze = i6;
                bArr[i5] = (byte) (j2 >> 24);
                int i7 = i2 + 5;
                this.zze = i7;
                bArr[i6] = (byte) (j2 >> 32);
                int i8 = i2 + 6;
                this.zze = i8;
                bArr[i7] = (byte) (j2 >> 40);
                int i9 = i2 + 7;
                this.zze = i9;
                bArr[i8] = (byte) (j2 >> 48);
                this.zze = i2 + 8;
                bArr[i9] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzd(int i2) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i3 = this.zze;
                int i4 = i3 + 1;
                this.zze = i4;
                bArr[i3] = (byte) i2;
                int i5 = i3 + 2;
                this.zze = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i3 + 3;
                this.zze = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.zze = i3 + 4;
                bArr[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zze(int i2, int i3) throws IOException {
            zza(i2, 5);
            zzd(i3);
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzb(String str, Throwable th) {
            String strValueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String strValueOf2 = String.valueOf(str);
            super(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), th);
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzii() {
    }

    public static int zza(int i2, zzjt zzjtVar) {
        int iZzg = zzg(i2 << 3);
        int iZzb = zzjtVar.zzb();
        return iZzg + zzg(iZzb) + iZzb;
    }

    public static int zza(zzjt zzjtVar) {
        int iZzb = zzjtVar.zzb();
        return zzg(iZzb) + iZzb;
    }

    static int zza(zzkk zzkkVar, zzlc zzlcVar) {
        zzhf zzhfVar = (zzhf) zzkkVar;
        int iZzi = zzhfVar.zzi();
        if (iZzi == -1) {
            iZzi = zzlcVar.zzb(zzhfVar);
            zzhfVar.zzb(iZzi);
        }
        return zzg(iZzi) + iZzi;
    }

    public static zzii zza(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzb(double d2) {
        return 8;
    }

    public static int zzb(float f2) {
        return 4;
    }

    public static int zzb(int i2, double d2) {
        return zzg(i2 << 3) + 8;
    }

    public static int zzb(int i2, float f2) {
        return zzg(i2 << 3) + 4;
    }

    public static int zzb(int i2, zzjt zzjtVar) {
        return (zzg(8) << 1) + zzg(2, i2) + zza(3, zzjtVar);
    }

    public static int zzb(int i2, zzkk zzkkVar) {
        return (zzg(8) << 1) + zzg(2, i2) + zzg(24) + zzb(zzkkVar);
    }

    static int zzb(int i2, zzkk zzkkVar, zzlc zzlcVar) {
        return zzg(i2 << 3) + zza(zzkkVar, zzlcVar);
    }

    public static int zzb(int i2, String str) {
        return zzg(i2 << 3) + zzb(str);
    }

    public static int zzb(int i2, boolean z2) {
        return zzg(i2 << 3) + 1;
    }

    public static int zzb(zzht zzhtVar) {
        int iZza = zzhtVar.zza();
        return zzg(iZza) + iZza;
    }

    public static int zzb(zzkk zzkkVar) {
        int iZzm = zzkkVar.zzm();
        return zzg(iZzm) + iZzm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int zzb(String str) {
        int length;
        try {
            str = zzmd.zza(str);
            length = str;
        } catch (zzmg unused) {
            length = str.getBytes(zzjf.zza).length;
        }
        return zzg(length) + length;
    }

    public static int zzb(boolean z2) {
        return 1;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return zzg(length) + length;
    }

    public static int zzc(int i2, zzht zzhtVar) {
        int iZzg = zzg(i2 << 3);
        int iZza = zzhtVar.zza();
        return iZzg + zzg(iZza) + iZza;
    }

    @Deprecated
    static int zzc(int i2, zzkk zzkkVar, zzlc zzlcVar) {
        int iZzg = zzg(i2 << 3) << 1;
        zzhf zzhfVar = (zzhf) zzkkVar;
        int iZzi = zzhfVar.zzi();
        if (iZzi == -1) {
            iZzi = zzlcVar.zzb(zzhfVar);
            zzhfVar.zzb(iZzi);
        }
        return iZzg + iZzi;
    }

    @Deprecated
    public static int zzc(zzkk zzkkVar) {
        return zzkkVar.zzm();
    }

    public static int zzd(int i2, long j2) {
        return zzg(i2 << 3) + zze(j2);
    }

    public static int zzd(int i2, zzht zzhtVar) {
        return (zzg(8) << 1) + zzg(2, i2) + zzc(3, zzhtVar);
    }

    public static int zzd(long j2) {
        return zze(j2);
    }

    public static int zze(int i2) {
        return zzg(i2 << 3);
    }

    public static int zze(int i2, long j2) {
        return zzg(i2 << 3) + zze(j2);
    }

    public static int zze(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if ((-1) - (((-1) - (-2097152)) | ((-1) - j2)) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (-1) - (((-1) - j2) | ((-1) - (-16384))) != 0 ? i2 + 1 : i2;
    }

    public static int zzf(int i2) {
        if (i2 >= 0) {
            return zzg(i2);
        }
        return 10;
    }

    public static int zzf(int i2, int i3) {
        return zzg(i2 << 3) + zzf(i3);
    }

    public static int zzf(int i2, long j2) {
        return zzg(i2 << 3) + zze(zzi(j2));
    }

    public static int zzf(long j2) {
        return zze(zzi(j2));
    }

    public static int zzg(int i2) {
        if ((-1) - (((-1) - i2) | ((-1) - (-128))) == 0) {
            return 1;
        }
        if ((-1) - (((-1) - i2) | ((-1) - (-16384))) == 0) {
            return 2;
        }
        if (((-2097152) + i2) - ((-2097152) | i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzg(int i2, int i3) {
        return zzg(i2 << 3) + zzg(i3);
    }

    public static int zzg(int i2, long j2) {
        return zzg(i2 << 3) + 8;
    }

    public static int zzg(long j2) {
        return 8;
    }

    public static int zzh(int i2) {
        return zzg(zzm(i2));
    }

    public static int zzh(int i2, int i3) {
        return zzg(i2 << 3) + zzg(zzm(i3));
    }

    public static int zzh(int i2, long j2) {
        return zzg(i2 << 3) + 8;
    }

    public static int zzh(long j2) {
        return 8;
    }

    public static int zzi(int i2) {
        return 4;
    }

    public static int zzi(int i2, int i3) {
        return zzg(i2 << 3) + 4;
    }

    private static long zzi(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int zzj(int i2) {
        return 4;
    }

    public static int zzj(int i2, int i3) {
        return zzg(i2 << 3) + 4;
    }

    public static int zzk(int i2) {
        return zzf(i2);
    }

    public static int zzk(int i2, int i3) {
        return zzg(i2 << 3) + zzf(i3);
    }

    @Deprecated
    public static int zzl(int i2) {
        return zzg(i2);
    }

    private static int zzm(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b2) throws IOException;

    public final void zza(double d2) throws IOException {
        zzc(Double.doubleToRawLongBits(d2));
    }

    public final void zza(float f2) throws IOException {
        zzd(Float.floatToRawIntBits(f2));
    }

    public abstract void zza(int i2) throws IOException;

    public final void zza(int i2, double d2) throws IOException {
        zzc(i2, Double.doubleToRawLongBits(d2));
    }

    public final void zza(int i2, float f2) throws IOException {
        zze(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void zza(int i2, int i3) throws IOException;

    public abstract void zza(int i2, long j2) throws IOException;

    public abstract void zza(int i2, zzht zzhtVar) throws IOException;

    public abstract void zza(int i2, zzkk zzkkVar) throws IOException;

    abstract void zza(int i2, zzkk zzkkVar, zzlc zzlcVar) throws IOException;

    public abstract void zza(int i2, String str) throws IOException;

    public abstract void zza(int i2, boolean z2) throws IOException;

    public abstract void zza(long j2) throws IOException;

    public abstract void zza(zzht zzhtVar) throws IOException;

    public abstract void zza(zzkk zzkkVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    final void zza(String str, zzmg zzmgVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmgVar);
        byte[] bytes = str.getBytes(zzjf.zza);
        try {
            zzb(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzb e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new zzb(e3);
        }
    }

    public final void zza(boolean z2) throws IOException {
        zza(z2 ? (byte) 1 : (byte) 0);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzb(int i2) throws IOException;

    public abstract void zzb(int i2, int i3) throws IOException;

    public final void zzb(int i2, long j2) throws IOException {
        zza(i2, zzi(j2));
    }

    public abstract void zzb(int i2, zzht zzhtVar) throws IOException;

    public final void zzb(long j2) throws IOException {
        zza(zzi(j2));
    }

    abstract void zzb(byte[] bArr, int i2, int i3) throws IOException;

    public final void zzc(int i2) throws IOException {
        zzb(zzm(i2));
    }

    public abstract void zzc(int i2, int i3) throws IOException;

    public abstract void zzc(int i2, long j2) throws IOException;

    public abstract void zzc(long j2) throws IOException;

    public abstract void zzd(int i2) throws IOException;

    public final void zzd(int i2, int i3) throws IOException {
        zzc(i2, zzm(i3));
    }

    public abstract void zze(int i2, int i3) throws IOException;
}
