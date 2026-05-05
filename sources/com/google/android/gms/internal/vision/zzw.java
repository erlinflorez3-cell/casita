package com.google.android.gms.internal.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class zzw {
    public static Bitmap zza(Bitmap bitmap, zzs zzsVar) {
        int i2;
        Bitmap bitmapCreateBitmap = bitmap;
        int width = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        if (zzsVar.zze != 0) {
            Matrix matrix = new Matrix();
            int i3 = zzsVar.zze;
            if (i3 == 0) {
                i2 = 0;
            } else if (i3 == 1) {
                i2 = 90;
            } else if (i3 == 2) {
                i2 = 180;
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException("Unsupported rotation degree.");
                }
                i2 = 270;
            }
            matrix.postRotate(i2);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, width, height, matrix, false);
        }
        if (zzsVar.zze == 1 || zzsVar.zze == 3) {
            zzsVar.zza = height;
            zzsVar.zzb = width;
        }
        return bitmapCreateBitmap;
    }

    public static ByteBuffer zza(Bitmap bitmap, boolean z2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width * height;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((((width + 1) / 2) * ((height + 1) / 2)) << 1) + i2);
        int i3 = i2;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i4 % width;
            int i6 = i4 / width;
            int pixel = bitmap.getPixel(i5, i6);
            float fRed = Color.red(pixel);
            float fGreen = Color.green(pixel);
            float fBlue = Color.blue(pixel);
            byteBufferAllocateDirect.put(i4, (byte) ((0.299f * fRed) + (0.587f * fGreen) + (0.114f * fBlue)));
            if (i6 % 2 == 0 && i5 % 2 == 0) {
                int i7 = i3 + 1;
                byteBufferAllocateDirect.put(i3, (byte) (((-0.169f) * fRed) + ((-0.331f) * fGreen) + (fBlue * 0.5f) + 128.0f));
                i3 += 2;
                byteBufferAllocateDirect.put(i7, (byte) ((fRed * 0.5f) + (fGreen * (-0.419f)) + (fBlue * (-0.081f)) + 128.0f));
            }
        }
        return byteBufferAllocateDirect;
    }
}
