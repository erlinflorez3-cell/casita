package com.incode.camera.commons.utils;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.SizeF;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.IncodeCameraSelector;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/incode/camera/commons/utils/CameraXUtils;", "", "()V", "getHorizontalViewAngle", "", "context", "Landroid/content/Context;", "lensFacing", "", "isNarrow", "", "cameraSelector", "Lcom/incode/camera/IncodeCameraSelector;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CameraXUtils {
    private static int CameraConstants = 1;
    public static final CameraXUtils INSTANCE = new CameraXUtils();
    private static int ProcessCameraProviderExtensionsKt = 1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3631e1 = 0;
    private static int getAvailableCameraInternals = 0;

    private CameraXUtils() {
    }

    public final boolean isNarrow(Context context, IncodeCameraSelector cameraSelector) throws CameraAccessException {
        boolean z2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cameraSelector, "");
        int iCamXLensFacing = cameraSelector.camXLensFacing();
        float fE1 = e1(context, iCamXLensFacing);
        if (fE1 == -1.0f) {
            int i3 = f3631e1 + 103;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            int i5 = f3631e1 + 43;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        return !z2 && iCamXLensFacing == 0 && fE1 <= 60.0f;
    }

    private static float e1(Context context, int i2) throws CameraAccessException {
        CameraManager cameraManager;
        String[] cameraIdList;
        int length;
        float fFloatValue;
        int i3 = 2 % 2;
        int i4 = f3631e1 + 51;
        ProcessCameraProviderExtensionsKt = i4 % 128;
        if (i4 % 2 == 0) {
            Object systemService = context.getSystemService("camera");
            Intrinsics.checkNotNull(systemService, "");
            cameraManager = (CameraManager) systemService;
            cameraIdList = cameraManager.getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
            length = cameraIdList.length;
        } else {
            Object systemService2 = context.getSystemService("camera");
            Intrinsics.checkNotNull(systemService2, "");
            cameraManager = (CameraManager) systemService2;
            cameraIdList = cameraManager.getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
            length = cameraIdList.length;
        }
        for (int i5 = 0; i5 < length; i5++) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraIdList[i5]);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null) {
                int i6 = f3631e1 + 125;
                ProcessCameraProviderExtensionsKt = i6 % 128;
                int i7 = i6 % 2;
            } else if (num.intValue() == i2) {
                if (((SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)) == null) {
                    int i8 = f3631e1 + 53;
                    ProcessCameraProviderExtensionsKt = i8 % 128;
                    int i9 = i8 % 2;
                    return -1.0f;
                }
                float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                if (fArr != null) {
                    int i10 = ProcessCameraProviderExtensionsKt + 113;
                    f3631e1 = i10 % 128;
                    if (i10 % 2 != 0) {
                        ArraysKt.firstOrNull(fArr);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Float fFirstOrNull = ArraysKt.firstOrNull(fArr);
                    if (fFirstOrNull != null) {
                        int i11 = ProcessCameraProviderExtensionsKt + 71;
                        f3631e1 = i11 % 128;
                        if (i11 % 2 != 0) {
                            fFloatValue = fFirstOrNull.floatValue();
                            int i12 = 78 / 0;
                        } else {
                            fFloatValue = fFirstOrNull.floatValue();
                        }
                        return ((((float) Math.atan(r3.getWidth() / (fFloatValue * 2.0f))) * 2.0f) * 180.0f) / 3.1415927f;
                    }
                }
                return -1.0f;
            }
        }
        return -1.0f;
    }

    static {
        int i2 = CameraConstants + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        getAvailableCameraInternals = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
