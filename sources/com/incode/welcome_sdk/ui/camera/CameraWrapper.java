package com.incode.welcome_sdk.ui.camera;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraWrapper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11320d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11321e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11322a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Camera f11323c;

    public CameraWrapper(Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "");
        this.f11323c = camera;
        this.f11322a = 1;
    }

    public final Camera getCamera() {
        int i2 = 2 % 2;
        int i3 = f11320d + 19;
        int i4 = i3 % 128;
        f11321e = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Camera camera = this.f11323c;
        int i5 = i4 + 65;
        f11320d = i5 % 128;
        int i6 = i5 % 2;
        return camera;
    }

    public final synchronized int getUsageCount() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f11321e + 1;
        int i5 = i4 % 128;
        f11320d = i5;
        int i6 = i4 % 2;
        i2 = this.f11322a;
        int i7 = i5 + 125;
        f11321e = i7 % 128;
        if (i7 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return i2;
    }

    public final synchronized void incrementUsage() {
        int i2 = 2 % 2;
        int i3 = f11320d;
        int i4 = i3 + 89;
        f11321e = i4 % 128;
        int i5 = i4 % 2;
        this.f11322a++;
        int i6 = i3 + 21;
        f11321e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 79 / 0;
        }
    }

    public final synchronized void decrementUsage() {
        int i2 = 2 % 2;
        int i3 = f11320d;
        int i4 = i3 + 115;
        f11321e = i4 % 128;
        if (i4 % 2 == 0) {
            this.f11322a++;
        } else {
            this.f11322a--;
        }
        int i5 = i3 + 23;
        f11321e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
