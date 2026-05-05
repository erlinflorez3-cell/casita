package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class Frame {
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    private final Metadata zza;

    @Nullable
    private ByteBuffer zzb;

    @Nullable
    private zza zzc;

    @Nullable
    private Bitmap zzd;

    public static class Builder {
        private final Frame zza = new Frame();

        public Frame build() {
            if (this.zza.zzb == null && this.zza.zzd == null && this.zza.zzc == null) {
                throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            }
            return this.zza;
        }

        public Builder setBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.zza.zzd = bitmap;
            Metadata metadata = this.zza.getMetadata();
            metadata.zza = width;
            metadata.zzb = height;
            return this;
        }

        public Builder setId(int i2) {
            this.zza.getMetadata().zzc = i2;
            return this;
        }

        public Builder setImageData(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if (byteBuffer.capacity() < i2 * i3) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            if (i4 != 16 && i4 != 17 && i4 != 842094169) {
                throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported image format: ").append(i4).toString());
            }
            this.zza.zzb = byteBuffer;
            Metadata metadata = this.zza.getMetadata();
            metadata.zza = i2;
            metadata.zzb = i3;
            metadata.zzf = i4;
            return this;
        }

        public Builder setPlanes(Image.Plane[] planeArr, int i2, int i3, int i4) {
            if (planeArr == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if (planeArr.length != 3) {
                throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
            }
            if (planeArr[0].getBuffer().capacity() < i2 * i3) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            this.zza.zzc = new zza(planeArr);
            Metadata metadata = this.zza.getMetadata();
            metadata.zza = i2;
            metadata.zzb = i3;
            metadata.zzf = i4;
            return this;
        }

        public Builder setRotation(int i2) {
            this.zza.getMetadata().zze = i2;
            return this;
        }

        public Builder setTimestampMillis(long j2) {
            this.zza.getMetadata().zzd = j2;
            return this;
        }
    }

    public static class Metadata {
        private int zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private int zze;
        private int zzf;

        public Metadata() {
            this.zzf = -1;
        }

        public Metadata(Metadata metadata) {
            this.zzf = -1;
            this.zza = metadata.getWidth();
            this.zzb = metadata.getHeight();
            this.zzc = metadata.getId();
            this.zzd = metadata.getTimestampMillis();
            this.zze = metadata.getRotation();
            this.zzf = metadata.getFormat();
        }

        public int getFormat() {
            return this.zzf;
        }

        public int getHeight() {
            return this.zzb;
        }

        public int getId() {
            return this.zzc;
        }

        public int getRotation() {
            return this.zze;
        }

        public long getTimestampMillis() {
            return this.zzd;
        }

        public int getWidth() {
            return this.zza;
        }

        public final void zza() {
            if (this.zze % 2 != 0) {
                int i2 = this.zza;
                this.zza = this.zzb;
                this.zzb = i2;
            }
            this.zze = 0;
        }
    }

    private static class zza {
        private final Image.Plane[] zza;

        zza(Image.Plane[] planeArr) {
            this.zza = planeArr;
        }

        final Image.Plane[] zza() {
            return this.zza;
        }
    }

    private Frame() {
        this.zza = new Metadata();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    /* synthetic */ Frame(zzb zzbVar) {
        this();
    }

    public Bitmap getBitmap() {
        return this.zzd;
    }

    public ByteBuffer getGrayscaleImageData() {
        Bitmap bitmap = this.zzd;
        if (bitmap == null) {
            return this.zzb;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = this.zzd.getHeight();
        int i2 = width * height;
        this.zzd.getPixels(new int[i2], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((Color.red(r6[i3]) * 0.299f) + (Color.green(r6[i3]) * 0.587f) + (Color.blue(r6[i3]) * 0.114f));
        }
        return ByteBuffer.wrap(bArr);
    }

    public Metadata getMetadata() {
        return this.zza;
    }

    public Image.Plane[] getPlanes() {
        zza zzaVar = this.zzc;
        if (zzaVar == null) {
            return null;
        }
        return zzaVar.zza();
    }
}
