package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
final class ImageWriterCompatApi29Impl {
    static ImageWriter newInstance(Surface surface, int i2, int i3) {
        return ImageWriter.newInstance(surface, i2, i3);
    }

    private ImageWriterCompatApi29Impl() {
    }
}
