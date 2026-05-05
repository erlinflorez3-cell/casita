package com.google.android.gms.vision.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import com.google.android.gms.internal.vision.zzfe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class zzb {
    public static Bitmap zza(Bitmap bitmap, int i2, int i3, int i4) {
        if (i2 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i2);
        return Bitmap.createBitmap(bitmap, 0, 0, i3, i4, matrix, true);
    }

    public static Bitmap zza(ByteBuffer byteBuffer, int i2, int i3, int i4) throws IOException {
        byte[] bArrArray;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArrArray = byteBuffer.array();
        } else {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit();
            bArrArray = new byte[iLimit];
            byteBuffer.get(bArrArray, 0, iLimit);
        }
        byte[] bArrZza = zza(bArrArray, i2, i3);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZza, 0, bArrZza.length);
        return zza(bitmapDecodeByteArray, i4, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public static ByteBuffer zza(Image.Plane[] planeArr, int i2, int i3) {
        int i4 = i2 * i3;
        byte[] bArr = new byte[((i4 / 4) * 2) + i4];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i5 = (i4 * 2) / 4;
        boolean z2 = buffer2.remaining() == i5 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z2) {
            planeArr[0].getBuffer().get(bArr, 0, i4);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i4, 1);
            buffer3.get(bArr, i4 + 1, i5 - 1);
        } else {
            zza(planeArr[0], i2, i3, bArr, 0, 1);
            zza(planeArr[1], i2, i3, bArr, i4 + 1, 2);
            zza(planeArr[2], i2, i3, bArr, i4, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    private static void zza(Image.Plane plane, int i2, int i3, byte[] bArr, int i4, int i5) {
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

    private static byte[] zza(byte[] bArr, int i2, int i3) throws IOException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i2, i3, null);
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
                zzfe.zza(th, th2);
            }
            throw th;
        }
    }
}
