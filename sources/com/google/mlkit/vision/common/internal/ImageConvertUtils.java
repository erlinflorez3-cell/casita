package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class ImageConvertUtils {
    private static final ImageConvertUtils zza = new ImageConvertUtils();

    private ImageConvertUtils() {
    }

    public static ByteBuffer bufferWithBackingArray(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static ImageConvertUtils getInstance() {
        return zza;
    }

    public static Bitmap yv12ToBitmap(ByteBuffer byteBuffer, int i2, int i3, int i4) throws MlKitException {
        byte[] bArrZzb = zzb(yv12ToNv21Buffer(byteBuffer, true).array(), i2, i3);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
        return zza(bitmapDecodeByteArray, i4, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public static ByteBuffer yv12ToNv21Buffer(ByteBuffer byteBuffer, boolean z2) {
        int i2;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z2 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i4 = 0;
        while (true) {
            i2 = i3 * 4;
            if (i4 >= i2) {
                break;
            }
            byteBufferAllocate.put(i4, byteBuffer.get(i4));
            i4++;
        }
        for (int i5 = 0; i5 < i3 + i3; i5++) {
            byteBufferAllocate.put(i2 + i5, byteBuffer.get(((i5 % 2) * i3) + i2 + (i5 / 2)));
        }
        return byteBufferAllocate;
    }

    public static Bitmap zza(Bitmap bitmap, int i2, int i3, int i4) {
        if (i2 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i3, i4);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i2);
        return Bitmap.createBitmap(bitmap, 0, 0, i3, i4, matrix, true);
    }

    private static byte[] zzb(byte[] bArr, int i2, int i3) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i2, i3, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i2, i3), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new MlKitException("Image conversion error from NV21 format", 13, e2);
        }
    }

    private static final void zzc(Image.Plane plane, int i2, int i3, byte[] bArr, int i4, int i5) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit == 0) {
            return;
        }
        int i6 = i2 / (i3 / iLimit);
        int rowStride = 0;
        for (int i7 = 0; i7 < iLimit; i7++) {
            int pixelStride = rowStride;
            for (int i8 = 0; i8 < i6; i8++) {
                bArr[i4] = buffer.get(pixelStride);
                i4 += i5;
                pixelStride += plane.getPixelStride();
            }
            rowStride += plane.getRowStride();
        }
    }

    public byte[] byteBufferToByteArray(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    public ByteBuffer cloneByteBuffer(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        ByteBuffer byteBufferAllocateDirect = byteBuffer.isDirect() ? ByteBuffer.allocateDirect(iCapacity) : ByteBuffer.allocate(iCapacity);
        byteBufferAllocateDirect.limit(byteBuffer.limit());
        byteBufferAllocateDirect.put((ByteBuffer) byteBuffer.rewind());
        byteBufferAllocateDirect.position(iPosition);
        byteBuffer.position(iPosition);
        return byteBufferAllocateDirect;
    }

    public Bitmap convertJpegToUpRightBitmap(Image image, int i2) {
        Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return zza(bitmapDecodeByteArray, i2, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer convertToNv21Buffer(InputImage inputImage, boolean z2) throws MlKitException {
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format == 17) {
                return z2 ? bufferWithBackingArray((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())) : (ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer());
            }
            if (format == 35) {
                return yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight());
            }
            if (format == 842094169) {
                return yv12ToNv21Buffer((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), z2);
            }
            throw new MlKitException("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal());
        if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i2;
        ByteBuffer byteBufferAllocate = z2 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < height; i5++) {
            int i6 = 0;
            while (i6 < width) {
                int i7 = iArr[i4];
                int i8 = i7 >> 8;
                int i9 = (i7 + 255) - (i7 | 255);
                int i10 = i3 + 1;
                int i11 = (-1) - (((-1) - (i7 >> 16)) | ((-1) - 255));
                int i12 = (i8 + 255) - (i8 | 255);
                byteBufferAllocate.put(i3, (byte) Math.min(255, (((((i11 * 66) + (i12 * 129)) + (i9 * 25)) + 128) >> 8) + 16));
                if (i5 % 2 == 0 && i4 % 2 == 0) {
                    int i13 = i12 * 94;
                    int i14 = (((((i11 * (-38)) - (i12 * 74)) + (i9 * PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) + 128) >> 8) + 128;
                    int i15 = i2 + 1;
                    byteBufferAllocate.put(i2, (byte) Math.min(255, (((((i11 * PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - i13) - (i9 * 18)) + 128) >> 8) + 128));
                    i2 += 2;
                    byteBufferAllocate.put(i15, (byte) Math.min(255, i14));
                }
                i4++;
                i6++;
                i3 = i10;
            }
        }
        return byteBufferAllocate;
    }

    public Bitmap convertToUpRightBitmap(InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return zza((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()), inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight());
        }
        if (format == 17) {
            return nv21ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        if (format == 35) {
            return nv21ToBitmap(yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        if (format == 842094169) {
            return yv12ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        throw new MlKitException("Unsupported image format", 13);
    }

    public Bitmap getUpRightBitmap(InputImage inputImage) throws MlKitException {
        Bitmap bitmapInternal = inputImage.getBitmapInternal();
        return bitmapInternal != null ? zza(bitmapInternal, inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight()) : convertToUpRightBitmap(inputImage);
    }

    public Bitmap nv21ToBitmap(ByteBuffer byteBuffer, int i2, int i3, int i4) throws MlKitException {
        byte[] bArrZzb = zzb(byteBufferToByteArray(byteBuffer), i2, i3);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
        return zza(bitmapDecodeByteArray, i4, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer yuv420ThreePlanesToNV21(Image.Plane[] planeArr, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = i4 / 4;
        byte[] bArr = new byte[i5 + i5 + i4];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i6 = (i4 + i4) / 4;
        boolean z2 = buffer2.remaining() == i6 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z2) {
            planeArr[0].getBuffer().get(bArr, 0, i4);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i4, 1);
            buffer3.get(bArr, i4 + 1, i6 - 1);
        } else {
            zzc(planeArr[0], i2, i3, bArr, 0, 1);
            zzc(planeArr[1], i2, i3, bArr, i4 + 1, 2);
            zzc(planeArr[2], i2, i3, bArr, i4, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
