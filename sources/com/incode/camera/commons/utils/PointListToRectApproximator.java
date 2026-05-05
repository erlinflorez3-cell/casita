package com.incode.camera.commons.utils;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/incode/camera/commons/utils/PointListToRectApproximator;", "", "()V", "getApproximatedRect", "Landroid/graphics/Rect;", "quad", "", "Landroid/graphics/Point;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointListToRectApproximator {
    private static int IncodeCamera = 1;
    private static int getAvailableCameraInternals = 0;

    public final Rect getApproximatedRect(List<? extends Point> quad) {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 65;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(quad, "");
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        for (Point point : quad) {
            int i9 = getAvailableCameraInternals + 95;
            IncodeCamera = i9 % 128;
            int i10 = i9 % 2;
            if (point.x < i6) {
                int i11 = IncodeCamera + 123;
                getAvailableCameraInternals = i11 % 128;
                if (i11 % 2 != 0) {
                    i6 = point.x;
                    int i12 = 55 / 0;
                } else {
                    i6 = point.x;
                }
            }
            if (point.x > i5) {
                i5 = point.x;
            }
            if (point.y < i7) {
                i7 = point.y;
            }
            if (point.y > i8) {
                i8 = point.y;
            }
        }
        return new Rect(i6, i7, i5, i8);
    }
}
