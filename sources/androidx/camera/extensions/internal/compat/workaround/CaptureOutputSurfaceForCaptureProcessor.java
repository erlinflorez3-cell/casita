package androidx.camera.extensions.internal.compat.workaround;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

/* JADX INFO: loaded from: classes.dex */
public class CaptureOutputSurfaceForCaptureProcessor {
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "CaptureOutputSurface";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    private final ImageWriter mImageWriter;
    private final ImageReaderProxy mIntermediateImageReader;
    private final boolean mNeedIntermediaSurface;
    private final boolean mNeedOverrideTimestamp;
    private final Surface mOutputSurface;
    private final Object mLock = new Object();
    private boolean mIsClosed = false;
    long mOutputImageTimeStamp = -1;

    public CaptureOutputSurfaceForCaptureProcessor(Surface surface, Size size, boolean z2) {
        this.mNeedOverrideTimestamp = z2;
        boolean z3 = DeviceQuirks.get(CaptureOutputSurfaceOccupiedQuirk.class) != null || z2;
        this.mNeedIntermediaSurface = z3;
        if (Build.VERSION.SDK_INT >= 29 && z3) {
            Logger.d(TAG, "Enabling intermediate surface");
            ImageReaderProxy imageReaderProxyCreateIsolatedReader = ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), 35, 2);
            this.mIntermediateImageReader = imageReaderProxyCreateIsolatedReader;
            this.mOutputSurface = imageReaderProxyCreateIsolatedReader.getSurface();
            this.mImageWriter = ImageWriterCompat.newInstance(surface, 2, 35);
            imageReaderProxyCreateIsolatedReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    this.f$0.m254x105434bb(imageReaderProxy);
                }
            }, CameraXExecutors.directExecutor());
            return;
        }
        this.mOutputSurface = surface;
        this.mIntermediateImageReader = null;
        this.mImageWriter = null;
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-camera-extensions-internal-compat-workaround-CaptureOutputSurfaceForCaptureProcessor, reason: not valid java name */
    /* synthetic */ void m254x105434bb(ImageReaderProxy imageReaderProxy) {
        Image image;
        synchronized (this.mLock) {
            if (this.mIsClosed) {
                return;
            }
            ImageProxy imageProxyAcquireNextImage = imageReaderProxy.acquireNextImage();
            if (imageProxyAcquireNextImage != null && (image = imageProxyAcquireNextImage.getImage()) != null) {
                if (this.mNeedOverrideTimestamp) {
                    long j2 = this.mOutputImageTimeStamp;
                    if (j2 != -1) {
                        Api23Impl.setImageTimestamp(image, j2);
                    }
                }
                ImageWriterCompat.queueInputImage(this.mImageWriter, image);
            }
        }
    }

    public void setOutputImageTimestamp(long j2) {
        if (this.mNeedOverrideTimestamp) {
            this.mOutputImageTimeStamp = j2;
        }
    }

    public Surface getSurface() {
        return this.mOutputSurface;
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            if (Build.VERSION.SDK_INT >= 29 && this.mNeedIntermediaSurface) {
                this.mIntermediateImageReader.clearOnImageAvailableListener();
                this.mIntermediateImageReader.close();
                ImageWriterCompat.close(this.mImageWriter);
            }
        }
    }

    static final class ImageWriterCompat {
        private ImageWriterCompat() {
        }

        static ImageWriter newInstance(Surface surface, int i2, int i3) {
            return ImageWriter.newInstance(surface, i2, i3);
        }

        static void queueInputImage(ImageWriter imageWriter, Image image) {
            imageWriter.queueInputImage(image);
        }

        static void close(ImageWriter imageWriter) {
            imageWriter.close();
        }
    }

    static final class Api23Impl {
        private Api23Impl() {
        }

        static void setImageTimestamp(Image image, long j2) {
            image.setTimestamp(j2);
        }
    }
}
