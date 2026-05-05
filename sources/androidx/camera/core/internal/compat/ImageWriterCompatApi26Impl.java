package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.view.Surface;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class ImageWriterCompatApi26Impl {
    private static final String TAG = "ImageWriterCompatApi26";
    private static Method sNewInstanceMethod = null;

    static {
        try {
            sNewInstanceMethod = ImageWriter.class.getMethod("newInstance", Surface.class, Integer.TYPE, Integer.TYPE);
        } catch (NoSuchMethodException e2) {
        }
    }

    static ImageWriter newInstance(Surface surface, int i2, int i3) {
        try {
            return (ImageWriter) Preconditions.checkNotNull(sNewInstanceMethod.invoke(null, surface, Integer.valueOf(i2), Integer.valueOf(i3)));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", e2);
        }
    }

    private ImageWriterCompatApi26Impl() {
    }
}
