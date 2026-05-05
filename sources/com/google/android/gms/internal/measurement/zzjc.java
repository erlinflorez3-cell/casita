package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzjc extends zzil {
    private static final Logger zzb = Logger.getLogger(zzjc.class.getName());
    private static final boolean zzc = zzml.zzc();
    zzjf zza;

    private static class zza extends zzjc {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        zza(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int length = bArr.length - i3;
            if ((length + i3) - (length & i3) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i3;
        }

        private final void zzc(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.zzb, this.zzd, i3);
                this.zzd += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(byte b2) throws IOException {
            int i2 = this.zzd;
            try {
                int i3 = i2 + 1;
                try {
                    this.zzb[i2] = b2;
                    this.zzd = i3;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i2 = i3;
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i2), Integer.valueOf(this.zzc), 1), e);
                }
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                int i4 = i3 + 1;
                this.zzd = i4;
                bArr[i3] = (byte) i2;
                int i5 = i3 + 2;
                this.zzd = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i3 + 3;
                this.zzd = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.zzd = i3 + 4;
                bArr[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, int i3) throws IOException {
            zzc(i2, 5);
            zza(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, long j2) throws IOException {
            zzc(i2, 1);
            zza(j2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, zzik zzikVar) throws IOException {
            zzc(i2, 2);
            zza(zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, zzlc zzlcVar) throws IOException {
            zzc(1, 3);
            zzd(2, i2);
            zzc(3, 2);
            zza(zzlcVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        final void zza(int i2, zzlc zzlcVar, zzlu zzluVar) throws IOException {
            zzc(i2, 2);
            zzc(((zzib) zzlcVar).zza(zzluVar));
            zzluVar.zza(zzlcVar, this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, String str) throws IOException {
            zzc(i2, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, boolean z2) throws IOException {
            zzc(i2, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(long j2) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                int i3 = i2 + 1;
                this.zzd = i3;
                bArr[i2] = (byte) j2;
                int i4 = i2 + 2;
                this.zzd = i4;
                bArr[i3] = (byte) (j2 >> 8);
                int i5 = i2 + 3;
                this.zzd = i5;
                bArr[i4] = (byte) (j2 >> 16);
                int i6 = i2 + 4;
                this.zzd = i6;
                bArr[i5] = (byte) (j2 >> 24);
                int i7 = i2 + 5;
                this.zzd = i7;
                bArr[i6] = (byte) (j2 >> 32);
                int i8 = i2 + 6;
                this.zzd = i8;
                bArr[i7] = (byte) (j2 >> 40);
                int i9 = i2 + 7;
                this.zzd = i9;
                bArr[i8] = (byte) (j2 >> 48);
                this.zzd = i2 + 8;
                bArr[i9] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzik zzikVar) throws IOException {
            zzc(zzikVar.zzb());
            zzikVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzlc zzlcVar) throws IOException {
            zzc(zzlcVar.zzcb());
            zzlcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(String str) throws IOException {
            int i2 = this.zzd;
            try {
                int iZzj = zzj(str.length() * 3);
                int iZzj2 = zzj(str.length());
                if (iZzj2 != iZzj) {
                    zzc(zzmp.zza(str));
                    this.zzd = zzmp.zza(str, this.zzb, this.zzd, zza());
                    return;
                }
                int i3 = i2 + iZzj2;
                this.zzd = i3;
                int iZza = zzmp.zza(str, this.zzb, i3, zza());
                this.zzd = i2;
                zzc((iZza - i2) - iZzj2);
                this.zzd = iZza;
            } catch (zzmt e2) {
                this.zzd = i2;
                zza(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzil
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            zzc(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i2) throws IOException {
            if (i2 >= 0) {
                zzc(i2);
            } else {
                zzb(i2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i2, int i3) throws IOException {
            zzc(i2, 0);
            zzb(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i2, long j2) throws IOException {
            zzc(i2, 0);
            zzb(j2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i2, zzik zzikVar) throws IOException {
            zzc(1, 3);
            zzd(2, i2);
            zza(3, zzikVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(long j2) throws IOException {
            if (zzjc.zzc && zza() >= 10) {
                while ((j2 - 128) - (j2 | (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    zzml.zza(bArr, i2, (byte) ((-1) - (((-1) - ((int) j2)) & ((-1) - 128))));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                zzml.zza(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i4 = this.zzd;
                    this.zzd = i4 + 1;
                    bArr3[i4] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
                }
            }
            byte[] bArr4 = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(byte[] bArr, int i2, int i3) throws IOException {
            zzc(i3);
            zzc(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i2) throws IOException {
            while ((i2 - 128) - ((-128) | i2) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i3 = this.zzd;
                    this.zzd = i3 + 1;
                    bArr[i3] = (byte) ((-1) - (((-1) - i2) & ((-1) - 128)));
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
                }
            }
            byte[] bArr2 = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            bArr2[i4] = (byte) i2;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i2, int i3) throws IOException {
            int i4 = i2 << 3;
            zzc((i4 + i3) - (i4 & i3));
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzd(int i2, int i3) throws IOException {
            zzc(i2, 0);
            zzc(i3);
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzjc() {
    }

    public static int zza(double d2) {
        return 8;
    }

    public static int zza(float f2) {
        return 4;
    }

    public static int zza(int i2, double d2) {
        return zzj(i2 << 3) + 8;
    }

    public static int zza(int i2, float f2) {
        return zzj(i2 << 3) + 4;
    }

    public static int zza(int i2, zzkk zzkkVar) {
        return (zzj(8) << 1) + zzj(2, i2) + zzb(3, zzkkVar);
    }

    public static int zza(zzkk zzkkVar) {
        int iZza = zzkkVar.zza();
        return zzj(iZza) + iZza;
    }

    static int zza(zzlc zzlcVar, zzlu zzluVar) {
        int iZza = ((zzib) zzlcVar).zza(zzluVar);
        return zzj(iZza) + iZza;
    }

    public static int zza(boolean z2) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zzb(int i2, zzkk zzkkVar) {
        int iZzj = zzj(i2 << 3);
        int iZza = zzkkVar.zza();
        return iZzj + zzj(iZza) + iZza;
    }

    public static int zzb(int i2, zzlc zzlcVar) {
        return (zzj(8) << 1) + zzj(2, i2) + zzj(24) + zzc(zzlcVar);
    }

    @Deprecated
    static int zzb(int i2, zzlc zzlcVar, zzlu zzluVar) {
        return (zzj(i2 << 3) << 1) + ((zzib) zzlcVar).zza(zzluVar);
    }

    public static int zzb(int i2, String str) {
        return zzj(i2 << 3) + zzb(str);
    }

    public static int zzb(int i2, boolean z2) {
        return zzj(i2 << 3) + 1;
    }

    public static int zzb(zzik zzikVar) {
        int iZzb = zzikVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    @Deprecated
    public static int zzb(zzlc zzlcVar) {
        return zzlcVar.zzcb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int zzb(String str) {
        int length;
        try {
            str = zzmp.zza(str);
            length = str;
        } catch (zzmt unused) {
            length = str.getBytes(zzjv.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzjc zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzc(int i2, long j2) {
        return zzj(i2 << 3) + 8;
    }

    public static int zzc(int i2, zzik zzikVar) {
        int iZzj = zzj(i2 << 3);
        int iZzb = zzikVar.zzb();
        return iZzj + zzj(iZzb) + iZzb;
    }

    static int zzc(int i2, zzlc zzlcVar, zzlu zzluVar) {
        return zzj(i2 << 3) + zza(zzlcVar, zzluVar);
    }

    public static int zzc(long j2) {
        return 8;
    }

    public static int zzc(zzlc zzlcVar) {
        int iZzcb = zzlcVar.zzcb();
        return zzj(iZzcb) + iZzcb;
    }

    public static int zzd(int i2) {
        return zzg(i2);
    }

    public static int zzd(int i2, long j2) {
        return zzj(i2 << 3) + zzg(j2);
    }

    public static int zzd(int i2, zzik zzikVar) {
        return (zzj(8) << 1) + zzj(2, i2) + zzc(3, zzikVar);
    }

    public static int zzd(long j2) {
        return zzg(j2);
    }

    public static int zze(int i2) {
        return 4;
    }

    public static int zze(int i2, int i3) {
        return zzj(i2 << 3) + zzg(i3);
    }

    public static int zze(int i2, long j2) {
        return zzj(i2 << 3) + 8;
    }

    public static int zze(long j2) {
        return 8;
    }

    public static int zzf(int i2) {
        return zzg(i2);
    }

    public static int zzf(int i2, int i3) {
        return zzj(i2 << 3) + 4;
    }

    public static int zzf(int i2, long j2) {
        return zzj(i2 << 3) + zzg(zzi(j2));
    }

    public static int zzf(long j2) {
        return zzg(zzi(j2));
    }

    public static int zzg(int i2) {
        return 4;
    }

    public static int zzg(int i2, int i3) {
        return zzj(i2 << 3) + zzg(i3);
    }

    public static int zzg(int i2, long j2) {
        return zzj(i2 << 3) + zzg(j2);
    }

    public static int zzg(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int zzh(int i2) {
        return zzj(zzl(i2));
    }

    public static int zzh(int i2, int i3) {
        return zzj(i2 << 3) + 4;
    }

    public static int zzi(int i2) {
        return zzj(i2 << 3);
    }

    public static int zzi(int i2, int i3) {
        return zzj(i2 << 3) + zzj(zzl(i3));
    }

    private static long zzi(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int zzj(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int zzj(int i2, int i3) {
        return zzj(i2 << 3) + zzj(i3);
    }

    private static int zzl(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b2) throws IOException;

    public abstract void zza(int i2) throws IOException;

    public abstract void zza(int i2, int i3) throws IOException;

    public abstract void zza(int i2, long j2) throws IOException;

    public abstract void zza(int i2, zzik zzikVar) throws IOException;

    public abstract void zza(int i2, zzlc zzlcVar) throws IOException;

    abstract void zza(int i2, zzlc zzlcVar, zzlu zzluVar) throws IOException;

    public abstract void zza(int i2, String str) throws IOException;

    public abstract void zza(int i2, boolean z2) throws IOException;

    public abstract void zza(long j2) throws IOException;

    public abstract void zza(zzik zzikVar) throws IOException;

    public abstract void zza(zzlc zzlcVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    final void zza(String str, zzmt zzmtVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmtVar);
        byte[] bytes = str.getBytes(zzjv.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(double d2) throws IOException {
        zza(Double.doubleToRawLongBits(d2));
    }

    public final void zzb(float f2) throws IOException {
        zza(Float.floatToRawIntBits(f2));
    }

    public abstract void zzb(int i2) throws IOException;

    public final void zzb(int i2, double d2) throws IOException {
        zza(i2, Double.doubleToRawLongBits(d2));
    }

    public final void zzb(int i2, float f2) throws IOException {
        zza(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void zzb(int i2, int i3) throws IOException;

    public abstract void zzb(int i2, long j2) throws IOException;

    public abstract void zzb(int i2, zzik zzikVar) throws IOException;

    public abstract void zzb(long j2) throws IOException;

    public final void zzb(boolean z2) throws IOException {
        zza(z2 ? (byte) 1 : (byte) 0);
    }

    abstract void zzb(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzc(int i2) throws IOException;

    public abstract void zzc(int i2, int i3) throws IOException;

    public abstract void zzd(int i2, int i3) throws IOException;

    public final void zzh(int i2, long j2) throws IOException {
        zzb(i2, zzi(j2));
    }

    public final void zzh(long j2) throws IOException {
        zzb(zzi(j2));
    }

    public final void zzk(int i2) throws IOException {
        zzc(zzl(i2));
    }

    public final void zzk(int i2, int i3) throws IOException {
        zzd(i2, zzl(i3));
    }
}
