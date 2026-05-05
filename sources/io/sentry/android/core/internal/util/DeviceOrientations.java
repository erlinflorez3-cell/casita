package io.sentry.android.core.internal.util;

import io.sentry.protocol.Device;

/* JADX INFO: loaded from: classes6.dex */
public final class DeviceOrientations {
    private DeviceOrientations() {
    }

    public static Device.DeviceOrientation getOrientation(int i2) {
        if (i2 == 1) {
            return Device.DeviceOrientation.PORTRAIT;
        }
        if (i2 != 2) {
            return null;
        }
        return Device.DeviceOrientation.LANDSCAPE;
    }
}
