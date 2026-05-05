package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.ResultPoint;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class SourceData {
    private Rect cropRect;
    private RawImageData data;
    private int imageFormat;
    private boolean previewMirrored;
    private int rotation;
    private int scalingFactor = 1;

    public SourceData(byte[] bArr, int i2, int i3, int i4, int i5) {
        this.data = new RawImageData(bArr, i2, i3);
        this.rotation = i5;
        this.imageFormat = i4;
        if (i2 * i3 > bArr.length) {
            throw new IllegalArgumentException("Image data does not match the resolution. " + i2 + "x" + i3 + " > " + bArr.length);
        }
    }

    public PlanarYUVLuminanceSource createSource() {
        RawImageData rawImageDataCropAndScale = this.data.rotateCameraPreview(this.rotation).cropAndScale(this.cropRect, this.scalingFactor);
        return new PlanarYUVLuminanceSource(rawImageDataCropAndScale.getData(), rawImageDataCropAndScale.getWidth(), rawImageDataCropAndScale.getHeight(), 0, 0, rawImageDataCropAndScale.getWidth(), rawImageDataCropAndScale.getHeight(), false);
    }

    public Bitmap getBitmap() {
        return getBitmap(1);
    }

    public Bitmap getBitmap(int i2) {
        return getBitmap(this.cropRect, i2);
    }

    public Bitmap getBitmap(Rect rect, int i2) {
        if (rect == null) {
            rect = new Rect(0, 0, this.data.getWidth(), this.data.getHeight());
        } else if (isRotated()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.data.getData(), this.imageFormat, this.data.getWidth(), this.data.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i2;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.rotation == 0) {
            return bitmapDecodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.rotation);
        return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
    }

    public Rect getCropRect() {
        return this.cropRect;
    }

    public byte[] getData() {
        return this.data.getData();
    }

    public int getDataHeight() {
        return this.data.getHeight();
    }

    public int getDataWidth() {
        return this.data.getWidth();
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getScalingFactor() {
        return this.scalingFactor;
    }

    public boolean isPreviewMirrored() {
        return this.previewMirrored;
    }

    public boolean isRotated() {
        return this.rotation % 180 != 0;
    }

    public void setCropRect(Rect rect) {
        this.cropRect = rect;
    }

    public void setPreviewMirrored(boolean z2) {
        this.previewMirrored = z2;
    }

    public void setScalingFactor(int i2) {
        this.scalingFactor = i2;
    }

    public ResultPoint translateResultPoint(ResultPoint resultPoint) {
        float x2 = (resultPoint.getX() * this.scalingFactor) + this.cropRect.left;
        float y2 = (resultPoint.getY() * this.scalingFactor) + this.cropRect.top;
        if (this.previewMirrored) {
            x2 = this.data.getWidth() - x2;
        }
        return new ResultPoint(x2, y2);
    }
}
