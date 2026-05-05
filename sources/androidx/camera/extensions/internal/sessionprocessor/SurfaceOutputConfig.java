package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceOutputConfig implements Camera2OutputConfig {
    abstract Surface getSurface();

    static SurfaceOutputConfig create(int i2, int i3, String str, List<Camera2OutputConfig> list, Surface surface) {
        return new AutoValue_SurfaceOutputConfig(i2, i3, str, list, surface);
    }

    static SurfaceOutputConfig create(int i2, Surface surface) {
        return create(i2, -1, null, Collections.emptyList(), surface);
    }
}
