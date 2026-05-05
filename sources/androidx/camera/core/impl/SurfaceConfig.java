package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.internal.utils.SizeUtil;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SurfaceConfig {
    public static final long DEFAULT_STREAM_USE_CASE_VALUE = 0;

    /* JADX INFO: loaded from: classes.dex */
    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    public abstract ConfigSize getConfigSize();

    public abstract ConfigType getConfigType();

    public abstract long getStreamUseCase();

    SurfaceConfig() {
    }

    public static SurfaceConfig create(ConfigType configType, ConfigSize configSize) {
        return new AutoValue_SurfaceConfig(configType, configSize, 0L);
    }

    public static SurfaceConfig create(ConfigType configType, ConfigSize configSize, long j2) {
        return new AutoValue_SurfaceConfig(configType, configSize, j2);
    }

    public final boolean isSupported(SurfaceConfig surfaceConfig) {
        return surfaceConfig.getConfigSize().getId() <= getConfigSize().getId() && surfaceConfig.getConfigType() == getConfigType();
    }

    public static ConfigType getConfigType(int i2) {
        if (i2 == 35) {
            return ConfigType.YUV;
        }
        if (i2 == 256) {
            return ConfigType.JPEG;
        }
        if (i2 == 4101) {
            return ConfigType.JPEG_R;
        }
        if (i2 == 32) {
            return ConfigType.RAW;
        }
        return ConfigType.PRIV;
    }

    public static SurfaceConfig transformSurfaceConfig(int i2, int i3, Size size, SurfaceSizeDefinition surfaceSizeDefinition) {
        ConfigType configType = getConfigType(i3);
        ConfigSize configSize = ConfigSize.NOT_SUPPORT;
        int area = SizeUtil.getArea(size);
        if (i2 == 1) {
            if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS720pSize(i3))) {
                configSize = ConfigSize.s720p;
            } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS1440pSize(i3))) {
                configSize = ConfigSize.s1440p;
            }
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getAnalysisSize())) {
            configSize = ConfigSize.VGA;
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getPreviewSize())) {
            configSize = ConfigSize.PREVIEW;
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getRecordSize())) {
            configSize = ConfigSize.RECORD;
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getMaximumSize(i3))) {
            configSize = ConfigSize.MAXIMUM;
        } else {
            Size ultraMaximumSize = surfaceSizeDefinition.getUltraMaximumSize(i3);
            if (ultraMaximumSize != null && area <= SizeUtil.getArea(ultraMaximumSize)) {
                configSize = ConfigSize.ULTRA_MAXIMUM;
            }
        }
        return create(configType, configSize);
    }

    public enum ConfigSize {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        ConfigSize(int i2) {
            this.mId = i2;
        }

        int getId() {
            return this.mId;
        }
    }
}
