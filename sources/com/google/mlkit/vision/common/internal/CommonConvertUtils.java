package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.android.gms.internal.mlkit_vision_common.zzmw;
import com.google.android.odml.image.BitmapExtractor;
import com.google.android.odml.image.ByteBufferExtractor;
import com.google.android.odml.image.ImageProperties;
import com.google.android.odml.image.MediaImageExtractor;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class CommonConvertUtils {
    public static InputImage convertMlImagetoInputImage(MlImage mlImage) {
        InputImage inputImageFromBitmap;
        ImageProperties imageProperties = mlImage.getContainedImageProperties().get(0);
        int storageType = imageProperties.getStorageType();
        if (storageType != 1) {
            inputImageFromBitmap = null;
            if (storageType == 2) {
                ByteBuffer byteBufferExtract = ByteBufferExtractor.extract(mlImage);
                int imageFormat = imageProperties.getImageFormat();
                Integer numValueOf = imageFormat != 4 ? imageFormat != 5 ? null : Integer.valueOf(InputImage.IMAGE_FORMAT_YV12) : 17;
                if (numValueOf != null) {
                    zza(numValueOf.intValue(), 3, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), byteBufferExtract.limit(), mlImage.getRotation());
                    inputImageFromBitmap = InputImage.fromByteBuffer(byteBufferExtract, mlImage.getWidth(), mlImage.getHeight(), mlImage.getRotation(), numValueOf.intValue());
                }
            } else if (storageType == 3) {
                Image imageExtract = MediaImageExtractor.extract(mlImage);
                zza(imageExtract.getFormat(), 5, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), imageExtract.getFormat() == 256 ? imageExtract.getPlanes()[0].getBuffer().limit() : (imageExtract.getPlanes()[0].getBuffer().limit() * 3) / 2, mlImage.getRotation());
                inputImageFromBitmap = InputImage.fromMediaImage(imageExtract, mlImage.getRotation());
            }
        } else {
            Bitmap bitmapExtract = BitmapExtractor.extract(mlImage);
            zza(-1, 1, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), bitmapExtract.getAllocationByteCount(), mlImage.getRotation());
            inputImageFromBitmap = InputImage.fromBitmap(bitmapExtract, mlImage.getRotation());
        }
        if (inputImageFromBitmap != null) {
            zzmw.zza();
        }
        return inputImageFromBitmap;
    }

    public static int convertToAndroidImageFormat(int i2) {
        int i3 = 17;
        if (i2 != 17) {
            i3 = 35;
            if (i2 != 35) {
                i3 = InputImage.IMAGE_FORMAT_YV12;
                if (i2 != 842094169) {
                    return 0;
                }
            }
        }
        return i3;
    }

    public static int convertToMVRotation(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 90) {
            return 1;
        }
        if (i2 == 180) {
            return 2;
        }
        if (i2 == 270) {
            return 3;
        }
        throw new IllegalArgumentException("Invalid rotation: " + i2);
    }

    public static void transformPointArray(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i2 = 0; i2 < pointArr.length; i2++) {
            int i3 = i2 + i2;
            fArr[i3] = pointArr[i2].x;
            fArr[i3 + 1] = pointArr[i2].y;
        }
        matrix.mapPoints(fArr);
        for (int i4 = 0; i4 < pointArr.length; i4++) {
            int i5 = i4 + i4;
            pointArr[i4].set((int) fArr[i5], (int) fArr[i5 + 1]);
        }
    }

    public static void transformPointF(PointF pointF, Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    public static void transformPointList(List<PointF> list, Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = i2 + i2;
            fArr[i3] = list.get(i2).x;
            fArr[i3 + 1] = list.get(i2).y;
        }
        matrix.mapPoints(fArr);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = i4 + i4;
            list.get(i4).set(fArr[i5], fArr[i5 + 1]);
        }
    }

    public static void transformRect(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    private static void zza(int i2, int i3, long j2, int i4, int i5, int i6, int i7) {
        zzmu.zzb(zzms.zzb("vision-common"), i2, i3, j2, i4, i5, i6, i7);
    }
}
