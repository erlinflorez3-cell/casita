package androidx.camera.extensions.internal.sessionprocessor;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MultiResolutionImageReaderOutputConfig implements Camera2OutputConfig {
    abstract int getImageFormat();

    abstract int getMaxImages();

    static MultiResolutionImageReaderOutputConfig create(int i2, int i3, String str, List<Camera2OutputConfig> list, int i4, int i5) {
        return new AutoValue_MultiResolutionImageReaderOutputConfig(i2, i3, str, list, i4, i5);
    }
}
