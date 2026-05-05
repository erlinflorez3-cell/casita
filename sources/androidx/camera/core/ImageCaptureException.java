package androidx.camera.core;

/* JADX INFO: loaded from: classes2.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i2, String str, Throwable th) {
        super(str, th);
        this.mImageCaptureError = i2;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
