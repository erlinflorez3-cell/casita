package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* JADX INFO: loaded from: classes.dex */
public final class CameraUnavailableExceptionHelper {
    private CameraUnavailableExceptionHelper() {
    }

    public static CameraUnavailableException createFrom(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i2 = 1;
        if (reason != 1) {
            i2 = 2;
            if (reason != 2) {
                i2 = 3;
                if (reason != 3) {
                    i2 = 4;
                    if (reason != 4) {
                        i2 = 5;
                        if (reason != 5) {
                            i2 = reason != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i2, cameraAccessExceptionCompat);
    }
}
