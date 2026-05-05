package com.incode.welcome_sdk.ui.camera.video_selfie;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes5.dex */
public class Something<T, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f12144a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12145e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f12146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f12147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S f12148d;

    public static Something empty() {
        int i2 = 2 % 2;
        Something something = new Something();
        int i3 = f12144a + 97;
        f12145e = i3 % 128;
        if (i3 % 2 != 0) {
            return something;
        }
        throw null;
    }

    public static <T, S> Something<T, S> empty(S s2) {
        int i2 = 2 % 2;
        Something<T, S> something = new Something<>();
        something.f12148d = s2;
        int i3 = f12144a + 59;
        f12145e = i3 % 128;
        if (i3 % 2 != 0) {
            return something;
        }
        throw null;
    }

    public static <T, S> Something<T, S> from(T t2, Rect rect, S s2) {
        int i2 = 2 % 2;
        Something<T, S> something = new Something<>();
        something.f12147c = t2;
        something.f12146b = rect;
        something.f12148d = s2;
        int i3 = f12144a + 101;
        f12145e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
        return something;
    }
}
