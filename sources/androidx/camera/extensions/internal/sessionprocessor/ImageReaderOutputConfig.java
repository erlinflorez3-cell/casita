package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageReaderOutputConfig implements Camera2OutputConfig {
    abstract int getImageFormat();

    abstract int getMaxImages();

    abstract Size getSize();

    static ImageReaderOutputConfig create(int i2, int i3, String str, List<Camera2OutputConfig> list, Size size, int i4, int i5) {
        return new AutoValue_ImageReaderOutputConfig(i2, i3, str, list, size, i4, i5);
    }

    static ImageReaderOutputConfig create(int i2, Size size, int i3, int i4) {
        return new AutoValue_ImageReaderOutputConfig(i2, -1, null, Collections.emptyList(), size, i3, i4);
    }
}
