package com.incode.welcome_sdk.ui.camera;

import android.graphics.Point;
import android.hardware.Camera;
import com.incode.welcome_sdk.commons.utils.e;
import com.incode.welcome_sdk.commons.utils.f;
import com.incode.welcome_sdk.ui.camera.CameraContract;
import com.incode.welcome_sdk.ui.camera.CameraPreview;
import io.reactivex.Scheduler;
import java.util.Iterator;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class FixedWidthCameraPreview extends CameraPreview {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f11480k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f11481n = 1;

    public FixedWidthCameraPreview(CameraContract.View view, CameraContract.Presenter presenter, Camera camera, Scheduler scheduler, int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, int i8, boolean z3) {
        super(view, presenter, camera, scheduler, i2, i3, i4, i5, i6, z2, i7, i8, z3);
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPreview
    protected void layoutCameraPreview(int i2, int i3) {
        int i4 = 2 % 2;
        if (getChildCount() > 0) {
            Timber.d("Camera: onLayout, width: %s, height %s", Integer.valueOf(i2), Integer.valueOf(i3));
            int i5 = this.f11295f.width;
            int i6 = this.f11295f.height;
            if (e.a(this.f11299j)) {
                int i7 = f11481n + 109;
                f11480k = i7 % 128;
                int i8 = i7 % 2;
                i5 = this.f11295f.height;
                i6 = this.f11295f.width;
            }
            this.f11292c = i5;
            this.f11291b = i6;
            int i9 = (i6 * i2) / i5;
            Timber.d("Camera: child dimensions, width: %s, height: %s, aspectRatio: %s", Integer.valueOf(i2), Integer.valueOf(i9), Float.valueOf(i2 / i9));
            int i10 = (i3 - i9) / 2;
            int i11 = (i9 + i3) / 2;
            Timber.d("Camera: child layout, left: %s, top: %s, right: %s, bottom: %s", 0, Integer.valueOf(i10), Integer.valueOf(i2), Integer.valueOf(i11));
            this.f11297h.layout(0, i10, i2, i11);
            if (this.f11304o != null) {
                Iterator<CameraPreview.OnLayoutCameraPreviewListener> it = this.f11304o.iterator();
                int i12 = f11481n + 7;
                f11480k = i12 % 128;
                int i13 = i12 % 2;
                while (it.hasNext()) {
                    it.next().layoutCameraPreview(i2, i3, i5, i6);
                }
            }
            this.f11296g.onCameraSizeParamsChanged(this.f11295f.width, this.f11295f.height, i5, i6, f.c.CROP_HEIGHT, this.f11302m);
            Point pointC = f.c(i5, i6, i2, i3, f.c.CROP_HEIGHT);
            this.f11293d = (pointC.x - i2) / 2.0f;
            this.f11294e = (pointC.y - i3) / 2.0f;
            this.f11290a = pointC.y / i6;
            this.f11298i.onPreviewLayoutChanged(pointC.x, pointC.y, i5, i6);
        }
    }
}
