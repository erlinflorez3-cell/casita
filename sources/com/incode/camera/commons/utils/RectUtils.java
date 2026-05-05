package com.incode.camera.commons.utils;

import android.graphics.Point;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/incode/camera/commons/utils/RectUtils;", "", "()V", "getApproximatedRect", "Landroid/graphics/Rect;", "quad", "", "Landroid/graphics/Point;", "([Landroid/graphics/Point;)Landroid/graphics/Rect;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RectUtils {
    public static final RectUtils INSTANCE = new RectUtils();
    private static int IncodeCamera = 1;
    private static int ProcessCameraProviderExtensionsKt = 1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3637e1 = 0;
    private static int getAvailableCameraInternals = 0;

    private RectUtils() {
    }

    @JvmStatic
    public static final Rect getApproximatedRect(Point[] quad) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quad, "");
        int length = quad.length;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = IncodeCamera + 41;
            f3637e1 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = quad[i7].x;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Point point = quad[i7];
            if (point.x < i6) {
                i6 = point.x;
            }
            if (point.x > i3) {
                i3 = point.x;
            }
            if (point.y < i4) {
                i4 = point.y;
            }
            if (point.y > i5) {
                int i10 = IncodeCamera + 5;
                f3637e1 = i10 % 128;
                int i11 = i10 % 2;
                i5 = point.y;
                int i12 = IncodeCamera + 43;
                f3637e1 = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        return new Rect(i6, i4, i3, i5);
    }

    static {
        int i2 = getAvailableCameraInternals + 37;
        ProcessCameraProviderExtensionsKt = i2 % 128;
        int i3 = i2 % 2;
    }
}
