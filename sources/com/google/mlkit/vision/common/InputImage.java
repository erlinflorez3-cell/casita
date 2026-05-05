package com.google.mlkit.vision.common;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public class InputImage implements MLTaskInput {
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;
    private volatile Bitmap zza;
    private volatile ByteBuffer zzb;
    private volatile zzb zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final Matrix zzh;

    @Retention(RetentionPolicy.CLASS)
    public @interface ImageFormat {
    }

    private InputImage(Bitmap bitmap, int i2) {
        this.zza = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.zzd = bitmap.getWidth();
        this.zze = bitmap.getHeight();
        zza(i2);
        this.zzf = i2;
        this.zzg = -1;
        this.zzh = null;
    }

    private InputImage(Image image, int i2, int i3, int i4, Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.zzc = new zzb(image);
        this.zzd = i2;
        this.zze = i3;
        zza(i4);
        this.zzf = i4;
        this.zzg = 35;
        this.zzh = matrix;
    }

    private InputImage(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        boolean z2;
        if (i5 == 842094169) {
            z2 = true;
        } else if (i5 == 17) {
            i5 = 17;
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        this.zzb = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.limit() > i2 * i3, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.zzd = i2;
        this.zze = i3;
        zza(i4);
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = null;
    }

    public static InputImage fromBitmap(Bitmap bitmap, int i2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap, i2);
        zzc(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i2);
        return inputImage;
    }

    public static InputImage fromByteArray(byte[] bArr, int i2, int i3, int i4, int i5) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), i2, i3, i4, i5);
        zzc(i5, 2, jElapsedRealtime, i3, i2, bArr.length, i4);
        return inputImage;
    }

    public static InputImage fromByteBuffer(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(byteBuffer, i2, i3, i4, i5);
        zzc(i5, 3, jElapsedRealtime, i3, i2, byteBuffer.limit(), i4);
        return inputImage;
    }

    public static InputImage fromFilePath(Context context, Uri uri) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-29488));
        short sXd2 = (short) (Od.Xd() ^ (-8215));
        int[] iArr = new int["\u0007N^\u00176\u001b\rF\u001c\"7`f\u0003\u0001\u000bz\u0012b&B:\u001c>8^p{\u0007\u0016".length()];
        QB qb = new QB("\u0007N^\u00176\u001b\rF\u001c\"7`f\u0003\u0001\u000bz\u0012b&B:\u001c>8^p{\u0007\u0016");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Preconditions.checkNotNull(context, new String(iArr, 0, i2));
        Preconditions.checkNotNull(uri, C1626yg.Ud("M3Fo\u00109FwM\f\u0014R|\u001bLuqgAl\u0012\u0004\r^Ib\u0002Az\u001f\u007f", (short) (Od.Xd() ^ (-321)), (short) (Od.Xd() ^ (-12781))));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ImageUtils imageUtils = ImageUtils.getInstance();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("v5[\u000f\u0013X=L_ps\u0016TUQ&\u0003Sw\u00042rN", (short) (C1580rY.Xd() ^ (-30290)))).getMethod(EO.Od("8\u0001\"\u0014X\u0015zS\u0018=\u0019N\f\u0012&\u000fB5", (short) (C1499aX.Xd() ^ (-6475))), new Class[0]);
        try {
            method.setAccessible(true);
            Bitmap bitmapZza = imageUtils.zza((ContentResolver) method.invoke(context, objArr), uri);
            InputImage inputImage = new InputImage(bitmapZza, 0);
            zzc(-1, 4, jElapsedRealtime, bitmapZza.getHeight(), bitmapZza.getWidth(), bitmapZza.getAllocationByteCount(), 0);
            return inputImage;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static InputImage fromMediaImage(Image image, int i2) {
        return zzb(image, i2, null);
    }

    public static InputImage fromMediaImage(Image image, int i2, Matrix matrix) {
        Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return zzb(image, i2, matrix);
    }

    private static int zza(int i2) {
        boolean z2 = true;
        if (i2 != 0 && i2 != 90 && i2 != 180) {
            if (i2 == 270) {
                i2 = 270;
            } else {
                z2 = false;
            }
        }
        Preconditions.checkArgument(z2, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i2;
    }

    private static InputImage zzb(Image image, int i2, Matrix matrix) {
        InputImage inputImage;
        int iLimit;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        zza(i2);
        boolean z2 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            inputImage = new InputImage(ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i2), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            inputImage = new InputImage(image, image.getWidth(), image.getHeight(), i2, matrix);
            iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        zzc(image.getFormat(), 5, jElapsedRealtime, image.getHeight(), image.getWidth(), iLimit, i2);
        return inputImage;
    }

    private static void zzc(int i2, int i3, long j2, int i4, int i5, int i6, int i7) {
        zzmu.zza(zzms.zzb("vision-common"), i2, i3, j2, i4, i5, i6, i7);
    }

    public Bitmap getBitmapInternal() {
        return this.zza;
    }

    public ByteBuffer getByteBuffer() {
        return this.zzb;
    }

    public Matrix getCoordinatesMatrix() {
        return this.zzh;
    }

    public int getFormat() {
        return this.zzg;
    }

    public int getHeight() {
        return this.zze;
    }

    public Image getMediaImage() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zza();
    }

    public Image.Plane[] getPlanes() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zzb();
    }

    public int getRotationDegrees() {
        return this.zzf;
    }

    public int getWidth() {
        return this.zzd;
    }
}
