package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class BarcodeEncoder {
    private static final int BLACK = -16777216;
    private static final int WHITE = -1;

    public Bitmap createBitmap(BitMatrix bitMatrix) {
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        int[] iArr = new int[width * height];
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = i2 * width;
            for (int i4 = 0; i4 < width; i4++) {
                iArr[i3 + i4] = bitMatrix.get(i4, i2) ? -16777216 : -1;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3) throws WriterException {
        try {
            return new MultiFormatWriter().encode(str, barcodeFormat, i2, i3);
        } catch (WriterException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new WriterException(e3);
        }
    }

    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) throws WriterException {
        try {
            return new MultiFormatWriter().encode(str, barcodeFormat, i2, i3, map);
        } catch (WriterException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new WriterException(e3);
        }
    }

    public Bitmap encodeBitmap(String str, BarcodeFormat barcodeFormat, int i2, int i3) throws WriterException {
        return createBitmap(encode(str, barcodeFormat, i2, i3));
    }

    public Bitmap encodeBitmap(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) throws WriterException {
        return createBitmap(encode(str, barcodeFormat, i2, i3, map));
    }
}
