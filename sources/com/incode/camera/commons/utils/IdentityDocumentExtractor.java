package com.incode.camera.commons.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004J\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\u000f"}, d2 = {"Lcom/incode/camera/commons/utils/IdentityDocumentExtractor;", "", "()V", "extract", "Landroid/graphics/Bitmap;", "coordinates", "", "Landroid/graphics/Point;", "input", "rectangleCenter", "Lkotlin/Pair;", "", "rectangleRotationAngle", "rectangleSideLengths", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IdentityDocumentExtractor {
    private static int CameraConstants = 0;
    public static final IdentityDocumentExtractor INSTANCE = new IdentityDocumentExtractor();
    private static int IncodeCamera = 1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3635e1 = 1;
    private static int getAvailableCameraInternals = 0;

    private IdentityDocumentExtractor() {
    }

    public final Bitmap extract(List<? extends Point> coordinates, Bitmap input) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        if (input.isRecycled()) {
            int i3 = CameraConstants + 1;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e("Tried to extract from bitmap that was recycled!", new Object[0]);
            return null;
        }
        List<? extends Point> list = coordinates;
        if (list == null || list.isEmpty()) {
            int i5 = IncodeCamera + 43;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            Timber.Forest.e("Tried to extract from bitmap while coordinates were empty or null", new Object[0]);
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(input.getWidth(), input.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Pair<Integer, Integer> pairE1 = e1(coordinates);
        int iIntValue = pairE1.component1().intValue();
        int iIntValue2 = pairE1.component2().intValue();
        Pair<Float, Float> availableCameraInternals = getAvailableCameraInternals(coordinates);
        float fFloatValue = availableCameraInternals.component1().floatValue();
        float fFloatValue2 = availableCameraInternals.component2().floatValue();
        canvas.rotate(-IncodeCamera(coordinates), fFloatValue, fFloatValue2);
        canvas.drawBitmap(input, 0.0f, 0.0f, new Paint());
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, (int) (fFloatValue - (iIntValue / 2)), (int) (fFloatValue2 - (iIntValue2 / 2)), iIntValue, iIntValue2, new Matrix(), false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "");
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }

    private static float IncodeCamera(List<? extends Point> list) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 41;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        Point point = list.get(0);
        int i5 = point.x;
        int i6 = point.y;
        int i7 = list.get(1).x;
        float degrees = (float) Math.toDegrees(Math.atan2(r0.y - i6, i7 - i5));
        int i8 = CameraConstants + 53;
        IncodeCamera = i8 % 128;
        int i9 = i8 % 2;
        return degrees;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "xStart", "xEnd", "yStart", "yEnd", "invoke", "(IIII)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class IncodeCamera extends Lambda implements Function4<Integer, Integer, Integer, Integer, Integer> {
        private static int CameraConstants = 0;
        public static final IncodeCamera IncodeCamera = new IncodeCamera();
        private static int ProcessCameraProviderExtensionsKt = 1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3636e1 = 1;
        private static int getAvailableCameraInternals = 0;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Integer invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            int i2 = 2 % 2;
            int i3 = CameraConstants + 105;
            f3636e1 = i3 % 128;
            int i4 = i3 % 2;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            int iIntValue3 = num3.intValue();
            int iIntValue4 = num4.intValue();
            if (i4 != 0) {
                return ProcessCameraProviderExtensionsKt(iIntValue, iIntValue2, iIntValue3, iIntValue4);
            }
            ProcessCameraProviderExtensionsKt(iIntValue, iIntValue2, iIntValue3, iIntValue4);
            throw null;
        }

        private static Integer ProcessCameraProviderExtensionsKt(int i2, int i3, int i4, int i5) {
            int i6 = 2 % 2;
            int i7 = f3636e1 + 1;
            CameraConstants = i7 % 128;
            Integer numValueOf = Integer.valueOf((int) Math.sqrt(i7 % 2 != 0 ? Math.pow(i2 + i3, 2.0d) / Math.pow(i4 << i5, 2.0d) : Math.pow(i2 - i3, 2.0d) + Math.pow(i4 - i5, 2.0d)));
            int i8 = CameraConstants + 35;
            f3636e1 = i8 % 128;
            int i9 = i8 % 2;
            return numValueOf;
        }

        static {
            int i2 = ProcessCameraProviderExtensionsKt + 79;
            getAvailableCameraInternals = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        IncodeCamera() {
            super(4);
        }
    }

    private static Pair<Integer, Integer> e1(List<? extends Point> list) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 103;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        Point point = list.get(0);
        int i5 = point.x;
        int i6 = point.y;
        Point point2 = list.get(1);
        int i7 = point2.x;
        int i8 = point2.y;
        Point point3 = list.get(2);
        int i9 = point3.x;
        int i10 = point3.y;
        IncodeCamera incodeCamera = IncodeCamera.IncodeCamera;
        Pair<Integer, Integer> pair = TuplesKt.to(incodeCamera.invoke(Integer.valueOf(i7), Integer.valueOf(i5), Integer.valueOf(i8), Integer.valueOf(i6)), incodeCamera.invoke(Integer.valueOf(i7), Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(i10)));
        int i11 = IncodeCamera + 63;
        CameraConstants = i11 % 128;
        if (i11 % 2 == 0) {
            return pair;
        }
        throw null;
    }

    private static Pair<Float, Float> getAvailableCameraInternals(List<? extends Point> list) {
        Iterator it;
        int i2;
        int i3 = 2 % 2;
        int i4 = IncodeCamera + 107;
        CameraConstants = i4 % 128;
        int i5 = 0;
        if (i4 % 2 != 0) {
            it = list.iterator();
            i2 = 1;
        } else {
            it = list.iterator();
            i2 = 0;
        }
        while (it.hasNext()) {
            i2 += ((Point) it.next()).x;
            int i6 = CameraConstants + 65;
            IncodeCamera = i6 % 128;
            int i7 = i6 % 2;
        }
        Float fValueOf = Float.valueOf(i2 / list.size());
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            i5 += ((Point) it2.next()).y;
        }
        return TuplesKt.to(fValueOf, Float.valueOf(i5 / list.size()));
    }

    static {
        int i2 = getAvailableCameraInternals + 23;
        f3635e1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
