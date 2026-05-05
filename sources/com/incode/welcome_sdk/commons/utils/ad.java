package com.incode.welcome_sdk.commons.utils;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6360a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6361b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6362c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6363d = 1;

    private ad() {
    }

    @JvmStatic
    public static final Rect b(Rect rect, float f2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        Rect rect2 = new Rect();
        new RectF(rect.left * f2, rect.top * f2, rect.right * f2, rect.bottom * f2).round(rect2);
        int i3 = f6362c + 123;
        f6360a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
        return rect2;
    }

    @JvmStatic
    public static final Rect a(IdCaptureKitAndroid.Result result) {
        int i2 = 2 % 2;
        int i3 = f6360a + 47;
        f6362c = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if ((result != null ? result.quad : null) == null) {
            return new Rect();
        }
        Point[] pointArr = result.quad;
        Intrinsics.checkNotNullExpressionValue(pointArr, "");
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (Point point : pointArr) {
            int i8 = f6360a + 41;
            f6362c = i8 % 128;
            int i9 = i8 % 2;
            if (point.x < i5) {
                i5 = point.x;
                int i10 = f6360a + 3;
                f6362c = i10 % 128;
                int i11 = i10 % 2;
            }
            if (point.x > i4) {
                i4 = point.x;
            }
            if (point.y < i6) {
                int i12 = f6362c + 49;
                f6360a = i12 % 128;
                if (i12 % 2 != 0) {
                    i6 = point.y;
                    int i13 = 16 / 0;
                } else {
                    i6 = point.y;
                }
            }
            if (point.y > i7) {
                int i14 = f6360a + 3;
                f6362c = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = point.y;
                    obj.hashCode();
                    throw null;
                }
                i7 = point.y;
            }
        }
        return new Rect(i5, i6, i4, i7);
    }

    @JvmStatic
    public static final Rect b(PointF pointF) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(pointF, "");
        int i3 = 50 / 2;
        Rect rect = new Rect((int) (pointF.x - 25.0f), (int) (pointF.y - 25.0f), (int) (pointF.x + 25.0f), (int) (pointF.y + 25.0f));
        int i4 = f6362c + 1;
        f6360a = i4 % 128;
        if (i4 % 2 == 0) {
            return rect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final Rect c(Rect rect, Rect rect2) {
        int i2 = 2 % 2;
        int i3 = f6362c + 59;
        f6360a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(rect2, "");
        rect.intersect(rect2);
        int i5 = f6362c + 91;
        f6360a = i5 % 128;
        int i6 = i5 % 2;
        return rect;
    }

    @JvmStatic
    public static final Rect c(RectF rectF) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rectF, "");
        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        int i3 = f6360a + 63;
        f6362c = i3 % 128;
        if (i3 % 2 != 0) {
            return rect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        new ad();
        int i2 = f6363d + 39;
        f6361b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
    }
}
