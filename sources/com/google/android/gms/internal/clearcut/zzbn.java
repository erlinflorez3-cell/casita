package com.google.android.gms.internal.clearcut;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbn extends zzba {
    private static final Logger logger = Logger.getLogger(zzbn.class.getName());
    private static final boolean zzfy = zzfd.zzed();
    zzbp zzfz;

    static class zza extends zzbn {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i4 = i2 + i3;
            if ((((i2 + i3) - (i2 & i3)) | (bArr.length - i4)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.buffer = bArr;
            this.offset = i2;
            this.position = i2;
            this.limit = i4;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public void flush() {
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.buffer, this.position, i3);
                this.position += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b2) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, long j2) throws IOException {
            zzb(i2, 0);
            zzb(j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, zzbb zzbbVar) throws IOException {
            zzb(i2, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, zzdo zzdoVar) throws IOException {
            zzb(i2, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(int i2, zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzb(i2, 2);
            zzas zzasVar = (zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, String str) throws IOException {
            zzb(i2, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbbVar) throws IOException {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzas zzasVar = (zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            write(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.limit - this.position;
        }

        public final int zzai() {
            return this.position - this.offset;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, int i3) throws IOException {
            zzo((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, zzbb zzbbVar) throws IOException {
            zzb(1, 3);
            zzd(2, i2);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, zzdo zzdoVar) throws IOException {
            zzb(1, 3);
            zzd(2, i2);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, boolean z2) throws IOException {
            zzb(i2, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j2) throws IOException {
            if (zzbn.zzfy && zzag() >= 10) {
                while ((j2 - 128) - (j2 | (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    int i3 = ((int) j2) & 127;
                    zzfd.zza(bArr, i2, (byte) ((i3 + 128) - (i3 & 128)));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzfd.zza(bArr2, i4, (byte) j2);
                return;
            }
            while ((-1) - (((-1) - j2) | ((-1) - (-128))) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i5 = this.position;
                    this.position = i5 + 1;
                    int i6 = (int) j2;
                    bArr3[i5] = (byte) ((-1) - (((-1) - ((i6 + 127) - (i6 | 127))) & ((-1) - 128)));
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
                }
            }
            byte[] bArr4 = this.buffer;
            int i7 = this.position;
            this.position = i7 + 1;
            bArr4[i7] = (byte) j2;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdoVar) throws IOException {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i2, int i3) throws IOException {
            zzb(i2, 0);
            zzn(i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i2, long j2) throws IOException {
            zzb(i2, 1);
            zzd(j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i2, int i3) throws IOException {
            zzb(i2, 0);
            zzo(i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j2) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) j2;
                int i4 = i2 + 2;
                this.position = i4;
                bArr[i3] = (byte) (j2 >> 8);
                int i5 = i2 + 3;
                this.position = i5;
                bArr[i4] = (byte) (j2 >> 16);
                int i6 = i2 + 4;
                this.position = i6;
                bArr[i5] = (byte) (j2 >> 24);
                int i7 = i2 + 5;
                this.position = i7;
                bArr[i6] = (byte) (j2 >> 32);
                int i8 = i2 + 6;
                this.position = i8;
                bArr[i7] = (byte) (j2 >> 40);
                int i9 = i2 + 7;
                this.position = i9;
                bArr[i8] = (byte) (j2 >> 48);
                this.position = i2 + 8;
                bArr[i9] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] bArr, int i2, int i3) throws IOException {
            zzo(i3);
            write(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i2, int i3) throws IOException {
            zzb(i2, 5);
            zzq(i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String str) throws IOException {
            int i2 = this.position;
            try {
                int iZzt = zzt(str.length() * 3);
                int iZzt2 = zzt(str.length());
                if (iZzt2 != iZzt) {
                    zzo(zzff.zza(str));
                    this.position = zzff.zza(str, this.buffer, this.position, zzag());
                    return;
                }
                int i3 = i2 + iZzt2;
                this.position = i3;
                int iZza = zzff.zza(str, this.buffer, i3, zzag());
                this.position = i2;
                zzo((iZza - i2) - iZzt2);
                this.position = iZza;
            } catch (zzfi e2) {
                this.position = i2;
                zza(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i2) throws IOException {
            if (i2 >= 0) {
                zzo(i2);
            } else {
                zzb(i2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i2) throws IOException {
            if (zzbn.zzfy && zzag() >= 10) {
                while ((i2 - 128) - ((-128) | i2) != 0) {
                    byte[] bArr = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    zzfd.zza(bArr, i3, (byte) ((-1) - (((-1) - ((i2 + 127) - (127 | i2))) & ((-1) - 128))));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzfd.zza(bArr2, i4, (byte) i2);
                return;
            }
            while ((-1) - (((-1) - i2) | ((-1) - (-128))) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i5 = this.position;
                    this.position = i5 + 1;
                    int i6 = (i2 + 127) - (127 | i2);
                    bArr3[i5] = (byte) ((i6 + 128) - (i6 & 128));
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
                }
            }
            byte[] bArr4 = this.buffer;
            int i7 = this.position;
            this.position = i7 + 1;
            bArr4[i7] = (byte) i2;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i2) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i3 = this.position;
                int i4 = i3 + 1;
                this.position = i4;
                bArr[i3] = (byte) i2;
                int i5 = i3 + 2;
                this.position = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i3 + 3;
                this.position = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.position = i3 + 4;
                bArr[i6] = i2 >> Ascii.CAN;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
            }
        }
    }

    static final class zzb extends zza {
        private final ByteBuffer zzga;
        private int zzgb;

        zzb(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zzga = byteBuffer;
            this.zzgb = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn.zza, com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzga.position(this.zzgb + zzai());
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzc(String str) {
            String strValueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String strValueOf2 = String.valueOf(str);
            super(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzc(String str, Throwable th) {
            String strValueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String strValueOf2 = String.valueOf(str);
            super(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), th);
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    static final class zzd extends zzbn {
        private final int zzgb;
        private final ByteBuffer zzgc;
        private final ByteBuffer zzgd;

        zzd(ByteBuffer byteBuffer) {
            super();
            this.zzgc = byteBuffer;
            this.zzgd = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzgb = byteBuffer.position();
        }

        private final void zzi(String str) throws IOException {
            try {
                zzff.zza(str, this.zzgd);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzgc.position(this.zzgd.position());
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i2, int i3) throws IOException {
            try {
                this.zzgd.put(bArr, i2, i3);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            } catch (BufferOverflowException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b2) throws IOException {
            try {
                this.zzgd.put(b2);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, long j2) throws IOException {
            zzb(i2, 0);
            zzb(j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, zzbb zzbbVar) throws IOException {
            zzb(i2, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, zzdo zzdoVar) throws IOException {
            zzb(i2, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(int i2, zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzb(i2, 2);
            zza(zzdoVar, zzefVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, String str) throws IOException {
            zzb(i2, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbbVar) throws IOException {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzas zzasVar = (zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            write(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.zzgd.remaining();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, int i3) throws IOException {
            int i4 = i2 << 3;
            zzo((i4 + i3) - (i4 & i3));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, zzbb zzbbVar) throws IOException {
            zzb(1, 3);
            zzd(2, i2);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, zzdo zzdoVar) throws IOException {
            zzb(1, 3);
            zzd(2, i2);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, boolean z2) throws IOException {
            zzb(i2, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j2) throws IOException {
            while ((-1) - (((-1) - (-128)) | ((-1) - j2)) != 0) {
                try {
                    int i2 = (int) j2;
                    int i3 = (i2 + 127) - (i2 | 127);
                    this.zzgd.put((byte) ((i3 + 128) - (i3 & 128)));
                    j2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new zzc(e2);
                }
            }
            this.zzgd.put((byte) j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdoVar) throws IOException {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i2, int i3) throws IOException {
            zzb(i2, 0);
            zzn(i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i2, long j2) throws IOException {
            zzb(i2, 1);
            zzd(j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i2, int i3) throws IOException {
            zzb(i2, 0);
            zzo(i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j2) throws IOException {
            try {
                this.zzgd.putLong(j2);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] bArr, int i2, int i3) throws IOException {
            zzo(i3);
            write(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i2, int i3) throws IOException {
            zzb(i2, 5);
            zzq(i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String str) throws IOException {
            int iPosition = this.zzgd.position();
            try {
                int iZzt = zzt(str.length() * 3);
                int iZzt2 = zzt(str.length());
                if (iZzt2 != iZzt) {
                    zzo(zzff.zza(str));
                    zzi(str);
                    return;
                }
                int iPosition2 = this.zzgd.position() + iZzt2;
                this.zzgd.position(iPosition2);
                zzi(str);
                int iPosition3 = this.zzgd.position();
                this.zzgd.position(iPosition);
                zzo(iPosition3 - iPosition2);
                this.zzgd.position(iPosition3);
            } catch (zzfi e2) {
                this.zzgd.position(iPosition);
                zza(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i2) throws IOException {
            if (i2 >= 0) {
                zzo(i2);
            } else {
                zzb(i2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i2) throws IOException {
            while (((-128) & i2) != 0) {
                try {
                    this.zzgd.put((byte) ((-1) - (((-1) - (i2 & 127)) & ((-1) - 128))));
                    i2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new zzc(e2);
                }
            }
            this.zzgd.put((byte) i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i2) throws IOException {
            try {
                this.zzgd.putInt(i2);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }
    }

    static final class zze extends zzbn {
        private final ByteBuffer zzgc;
        private final ByteBuffer zzgd;
        private final long zzge;
        private final long zzgf;
        private final long zzgg;
        private final long zzgh;
        private long zzgi;

        zze(ByteBuffer byteBuffer) {
            super();
            this.zzgc = byteBuffer;
            this.zzgd = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jZzb = zzfd.zzb(byteBuffer);
            this.zzge = jZzb;
            long jPosition = ((long) byteBuffer.position()) + jZzb;
            this.zzgf = jPosition;
            long jLimit = jZzb + ((long) byteBuffer.limit());
            this.zzgg = jLimit;
            this.zzgh = jLimit - 10;
            this.zzgi = jPosition;
        }

        private final void zzk(long j2) {
            this.zzgd.position((int) (j2 - this.zzge));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzgc.position((int) (this.zzgi - this.zzge));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i2, int i3) throws IOException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = i3;
                long j3 = this.zzgg - j2;
                long j4 = this.zzgi;
                if (j3 >= j4) {
                    zzfd.zza(bArr, i2, j4, j2);
                    this.zzgi += j2;
                    return;
                }
            }
            if (bArr != null) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzgi), Long.valueOf(this.zzgg), Integer.valueOf(i3)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b2) throws IOException {
            long j2 = this.zzgi;
            if (j2 >= this.zzgg) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzgi), Long.valueOf(this.zzgg), 1));
            }
            this.zzgi = 1 + j2;
            zzfd.zza(j2, b2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, long j2) throws IOException {
            zzb(i2, 0);
            zzb(j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, zzbb zzbbVar) throws IOException {
            zzb(i2, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, zzdo zzdoVar) throws IOException {
            zzb(i2, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(int i2, zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzb(i2, 2);
            zza(zzdoVar, zzefVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i2, String str) throws IOException {
            zzb(i2, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbbVar) throws IOException {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzas zzasVar = (zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            write(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return (int) (this.zzgg - this.zzgi);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, int i3) throws IOException {
            int i4 = i2 << 3;
            zzo((i4 + i3) - (i4 & i3));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, zzbb zzbbVar) throws IOException {
            zzb(1, 3);
            zzd(2, i2);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, zzdo zzdoVar) throws IOException {
            zzb(1, 3);
            zzd(2, i2);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i2, boolean z2) throws IOException {
            zzb(i2, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j2) throws IOException {
            if (this.zzgi <= this.zzgh) {
                while ((-1) - (((-1) - j2) | ((-1) - (-128))) != 0) {
                    long j3 = this.zzgi;
                    this.zzgi = j3 + 1;
                    int i2 = (int) j2;
                    zzfd.zza(j3, (byte) ((-1) - (((-1) - ((i2 + 127) - (i2 | 127))) & ((-1) - 128))));
                    j2 >>>= 7;
                }
                long j4 = this.zzgi;
                this.zzgi = 1 + j4;
                zzfd.zza(j4, (byte) j2);
                return;
            }
            while (true) {
                long j5 = this.zzgi;
                if (j5 >= this.zzgg) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzgi), Long.valueOf(this.zzgg), 1));
                }
                if ((j2 & (-128)) == 0) {
                    this.zzgi = 1 + j5;
                    zzfd.zza(j5, (byte) j2);
                    return;
                } else {
                    this.zzgi = j5 + 1;
                    int i3 = (int) j2;
                    zzfd.zza(j5, (byte) (((i3 + 127) - (i3 | 127)) | 128));
                    j2 >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdoVar) throws IOException {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i2, int i3) throws IOException {
            zzb(i2, 0);
            zzn(i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i2, long j2) throws IOException {
            zzb(i2, 1);
            zzd(j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i2, int i3) throws IOException {
            zzb(i2, 0);
            zzo(i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j2) throws IOException {
            this.zzgd.putLong((int) (this.zzgi - this.zzge), j2);
            this.zzgi += 8;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] bArr, int i2, int i3) throws IOException {
            zzo(i3);
            write(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i2, int i3) throws IOException {
            zzb(i2, 5);
            zzq(i3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String str) throws IOException {
            long j2 = this.zzgi;
            try {
                int iZzt = zzt(str.length() * 3);
                int iZzt2 = zzt(str.length());
                if (iZzt2 != iZzt) {
                    int iZza = zzff.zza(str);
                    zzo(iZza);
                    zzk(this.zzgi);
                    zzff.zza(str, this.zzgd);
                    this.zzgi += (long) iZza;
                    return;
                }
                int i2 = ((int) (this.zzgi - this.zzge)) + iZzt2;
                this.zzgd.position(i2);
                zzff.zza(str, this.zzgd);
                int iPosition = this.zzgd.position() - i2;
                zzo(iPosition);
                this.zzgi += (long) iPosition;
            } catch (zzfi e2) {
                this.zzgi = j2;
                zzk(j2);
                zza(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new zzc(e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzc(e4);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i2) throws IOException {
            if (i2 >= 0) {
                zzo(i2);
            } else {
                zzb(i2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i2) throws IOException {
            long j2;
            if (this.zzgi <= this.zzgh) {
                while (true) {
                    int i3 = (-1) - (((-1) - i2) | ((-1) - (-128)));
                    j2 = this.zzgi;
                    if (i3 == 0) {
                        break;
                    }
                    this.zzgi = j2 + 1;
                    zzfd.zza(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            } else {
                while (true) {
                    j2 = this.zzgi;
                    if (j2 >= this.zzgg) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzgi), Long.valueOf(this.zzgg), 1));
                    }
                    if (((-128) & i2) == 0) {
                        break;
                    }
                    this.zzgi = j2 + 1;
                    zzfd.zza(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
            this.zzgi = 1 + j2;
            zzfd.zza(j2, (byte) i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i2) throws IOException {
            this.zzgd.putInt((int) (this.zzgi - this.zzge), i2);
            this.zzgi += 4;
        }
    }

    private zzbn() {
    }

    /* synthetic */ zzbn(zzbo zzboVar) {
        this();
    }

    public static int zza(int i2, zzcv zzcvVar) {
        int iZzr = zzr(i2);
        int iZzas = zzcvVar.zzas();
        return iZzr + zzt(iZzas) + iZzas;
    }

    public static int zza(zzcv zzcvVar) {
        int iZzas = zzcvVar.zzas();
        return zzt(iZzas) + iZzas;
    }

    public static zzbn zza(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zzb(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return zzfd.zzee() ? new zze(byteBuffer) : new zzd(byteBuffer);
    }

    public static int zzb(double d2) {
        return 8;
    }

    public static int zzb(float f2) {
        return 4;
    }

    public static int zzb(int i2, double d2) {
        return zzr(i2) + 8;
    }

    public static int zzb(int i2, float f2) {
        return zzr(i2) + 4;
    }

    public static int zzb(int i2, zzcv zzcvVar) {
        return (zzr(1) << 1) + zzh(2, i2) + zza(3, zzcvVar);
    }

    static int zzb(int i2, zzdo zzdoVar, zzef zzefVar) {
        return zzr(i2) + zzb(zzdoVar, zzefVar);
    }

    public static int zzb(int i2, String str) {
        return zzr(i2) + zzh(str);
    }

    public static int zzb(zzbb zzbbVar) {
        int size = zzbbVar.size();
        return zzt(size) + size;
    }

    static int zzb(zzdo zzdoVar, zzef zzefVar) {
        zzas zzasVar = (zzas) zzdoVar;
        int iZzs = zzasVar.zzs();
        if (iZzs == -1) {
            iZzs = zzefVar.zzm(zzasVar);
            zzasVar.zzf(iZzs);
        }
        return zzt(iZzs) + iZzs;
    }

    public static int zzb(boolean z2) {
        return 1;
    }

    public static int zzc(int i2, zzbb zzbbVar) {
        int iZzr = zzr(i2);
        int size = zzbbVar.size();
        return iZzr + zzt(size) + size;
    }

    public static int zzc(int i2, zzdo zzdoVar) {
        return zzr(i2) + zzc(zzdoVar);
    }

    @Deprecated
    static int zzc(int i2, zzdo zzdoVar, zzef zzefVar) {
        int iZzr = zzr(i2) << 1;
        zzas zzasVar = (zzas) zzdoVar;
        int iZzs = zzasVar.zzs();
        if (iZzs == -1) {
            iZzs = zzefVar.zzm(zzasVar);
            zzasVar.zzf(iZzs);
        }
        return iZzr + iZzs;
    }

    public static int zzc(int i2, boolean z2) {
        return zzr(i2) + 1;
    }

    public static int zzc(zzdo zzdoVar) {
        int iZzas = zzdoVar.zzas();
        return zzt(iZzas) + iZzas;
    }

    public static zzbn zzc(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzd(int i2, long j2) {
        return zzr(i2) + zzf(j2);
    }

    public static int zzd(int i2, zzbb zzbbVar) {
        return (zzr(1) << 1) + zzh(2, i2) + zzc(3, zzbbVar);
    }

    public static int zzd(int i2, zzdo zzdoVar) {
        return (zzr(1) << 1) + zzh(2, i2) + zzc(3, zzdoVar);
    }

    @Deprecated
    public static int zzd(zzdo zzdoVar) {
        return zzdoVar.zzas();
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        return zzt(length) + length;
    }

    public static int zze(int i2, long j2) {
        return zzr(i2) + zzf(j2);
    }

    public static int zze(long j2) {
        return zzf(j2);
    }

    public static int zzf(int i2, long j2) {
        return zzr(i2) + zzf(zzj(j2));
    }

    public static int zzf(long j2) {
        int i2;
        if (((-128) + j2) - ((-128) | j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) + j2) - ((-34359738368L) | j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) + j2) - ((-2097152) | j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int zzg(int i2, int i3) {
        return zzr(i2) + zzs(i3);
    }

    public static int zzg(int i2, long j2) {
        return zzr(i2) + 8;
    }

    public static int zzg(long j2) {
        return zzf(zzj(j2));
    }

    public static int zzh(int i2, int i3) {
        return zzr(i2) + zzt(i3);
    }

    public static int zzh(int i2, long j2) {
        return zzr(i2) + 8;
    }

    public static int zzh(long j2) {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int zzh(String str) {
        int length;
        try {
            str = zzff.zza(str);
            length = str;
        } catch (zzfi unused) {
            length = str.getBytes(zzci.UTF_8).length;
        }
        return zzt(length) + length;
    }

    public static int zzi(int i2, int i3) {
        return zzr(i2) + zzt(zzy(i3));
    }

    public static int zzi(long j2) {
        return 8;
    }

    public static int zzj(int i2, int i3) {
        return zzr(i2) + 4;
    }

    private static long zzj(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int zzk(int i2, int i3) {
        return zzr(i2) + 4;
    }

    public static int zzl(int i2, int i3) {
        return zzr(i2) + zzs(i3);
    }

    public static int zzr(int i2) {
        return zzt(i2 << 3);
    }

    public static int zzs(int i2) {
        if (i2 >= 0) {
            return zzt(i2);
        }
        return 10;
    }

    public static int zzt(int i2) {
        if ((-1) - (((-1) - i2) | ((-1) - (-128))) == 0) {
            return 1;
        }
        if ((i2 - 16384) - ((-16384) | i2) == 0) {
            return 2;
        }
        if (((-2097152) + i2) - ((-2097152) | i2) == 0) {
            return 3;
        }
        return (-1) - (((-1) - i2) | ((-1) - (-268435456))) == 0 ? 4 : 5;
    }

    public static int zzu(int i2) {
        return zzt(zzy(i2));
    }

    public static int zzv(int i2) {
        return 4;
    }

    public static int zzw(int i2) {
        return 4;
    }

    public static int zzx(int i2) {
        return zzs(i2);
    }

    private static int zzy(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    @Deprecated
    public static int zzz(int i2) {
        return zzt(i2);
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zza(byte b2) throws IOException;

    public final void zza(double d2) throws IOException {
        zzd(Double.doubleToRawLongBits(d2));
    }

    public final void zza(float f2) throws IOException {
        zzq(Float.floatToRawIntBits(f2));
    }

    public final void zza(int i2, double d2) throws IOException {
        zzc(i2, Double.doubleToRawLongBits(d2));
    }

    public final void zza(int i2, float f2) throws IOException {
        zzf(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void zza(int i2, long j2) throws IOException;

    public abstract void zza(int i2, zzbb zzbbVar) throws IOException;

    public abstract void zza(int i2, zzdo zzdoVar) throws IOException;

    abstract void zza(int i2, zzdo zzdoVar, zzef zzefVar) throws IOException;

    public abstract void zza(int i2, String str) throws IOException;

    public abstract void zza(zzbb zzbbVar) throws IOException;

    abstract void zza(zzdo zzdoVar, zzef zzefVar) throws IOException;

    final void zza(String str, zzfi zzfiVar) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzfiVar);
        byte[] bytes = str.getBytes(zzci.UTF_8);
        try {
            zzo(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzc e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new zzc(e3);
        }
    }

    public final void zza(boolean z2) throws IOException {
        zza(z2 ? (byte) 1 : (byte) 0);
    }

    public abstract int zzag();

    public abstract void zzb(int i2, int i3) throws IOException;

    public final void zzb(int i2, long j2) throws IOException {
        zza(i2, zzj(j2));
    }

    public abstract void zzb(int i2, zzbb zzbbVar) throws IOException;

    public abstract void zzb(int i2, zzdo zzdoVar) throws IOException;

    public abstract void zzb(int i2, boolean z2) throws IOException;

    public abstract void zzb(long j2) throws IOException;

    public abstract void zzb(zzdo zzdoVar) throws IOException;

    public abstract void zzc(int i2, int i3) throws IOException;

    public abstract void zzc(int i2, long j2) throws IOException;

    public final void zzc(long j2) throws IOException {
        zzb(zzj(j2));
    }

    public abstract void zzd(int i2, int i3) throws IOException;

    public abstract void zzd(long j2) throws IOException;

    abstract void zzd(byte[] bArr, int i2, int i3) throws IOException;

    public final void zze(int i2, int i3) throws IOException {
        zzd(i2, zzy(i3));
    }

    public abstract void zzf(int i2, int i3) throws IOException;

    public abstract void zzg(String str) throws IOException;

    public abstract void zzn(int i2) throws IOException;

    public abstract void zzo(int i2) throws IOException;

    public final void zzp(int i2) throws IOException {
        zzo(zzy(i2));
    }

    public abstract void zzq(int i2) throws IOException;
}
