package com.incode.camera;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/incode/camera/CameraConstants;", "", "()V", "CAMERA_HORIZONTAL_VIEW_ANGLE_NARROW_WIDE_THRESHOLD", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CameraConstants {
    public static final int CAMERA_HORIZONTAL_VIEW_ANGLE_NARROW_WIDE_THRESHOLD = 60;
    public static final CameraConstants INSTANCE = new CameraConstants();
    private static int ProcessCameraProviderExtensionsKt = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3551e1 = 1;

    private CameraConstants() {
    }

    static {
        int i2 = ProcessCameraProviderExtensionsKt + 9;
        f3551e1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
