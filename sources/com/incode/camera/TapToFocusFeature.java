package com.incode.camera;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.camera.core.CameraControl;
import androidx.camera.view.PreviewView;
import androidx.core.view.GestureDetectorCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\rJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/incode/camera/TapToFocusFeature;", "", "previewView", "Landroidx/camera/view/PreviewView;", "(Landroidx/camera/view/PreviewView;)V", "cameraOverlay", "Lcom/incode/camera/IncodeCameraOverlayView;", "applyFeature", "", "cameraControl", "Landroidx/camera/core/CameraControl;", "autoCancelDuration", "", "(Landroidx/camera/core/CameraControl;Ljava/lang/Long;)V", "enableTapToFocus", "enabled", "", "(ZLandroidx/camera/core/CameraControl;Ljava/lang/Long;)V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TapToFocusFeature {
    private static int CameraConstants = 1;
    private static int IncodeCamera = 0;
    private final PreviewView ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1 */
    private final IncodeCameraOverlayView f3572e1;

    public TapToFocusFeature(PreviewView previewView) {
        Intrinsics.checkNotNullParameter(previewView, "");
        this.ProcessCameraProviderExtensionsKt = previewView;
        Context context = previewView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.f3572e1 = new IncodeCameraOverlayView(context, null, 0, 6, null);
    }

    public static final /* synthetic */ void access$applyFeature(TapToFocusFeature tapToFocusFeature, CameraControl cameraControl, Long l2) {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 105;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        tapToFocusFeature.ProcessCameraProviderExtensionsKt(cameraControl, l2);
        int i5 = IncodeCamera + 63;
        CameraConstants = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ IncodeCameraOverlayView access$getCameraOverlay$p(TapToFocusFeature tapToFocusFeature) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 55;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        IncodeCameraOverlayView incodeCameraOverlayView = tapToFocusFeature.f3572e1;
        if (i4 == 0) {
            int i5 = 84 / 0;
        }
        return incodeCameraOverlayView;
    }

    public static final /* synthetic */ PreviewView access$getPreviewView$p(TapToFocusFeature tapToFocusFeature) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera;
        int i4 = i3 + 115;
        CameraConstants = i4 % 128;
        int i5 = i4 % 2;
        PreviewView previewView = tapToFocusFeature.ProcessCameraProviderExtensionsKt;
        if (i5 == 0) {
            int i6 = 7 / 0;
        }
        int i7 = i3 + 91;
        CameraConstants = i7 % 128;
        int i8 = i7 % 2;
        return previewView;
    }

    public static /* synthetic */ void enableTapToFocus$default(TapToFocusFeature tapToFocusFeature, boolean z2, CameraControl cameraControl, Long l2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i4 = IncodeCamera + 1;
            CameraConstants = i4 % 128;
            int i5 = i4 % 2;
            l2 = 10L;
            int i6 = IncodeCamera + 59;
            CameraConstants = i6 % 128;
            int i7 = i6 % 2;
        }
        tapToFocusFeature.enableTapToFocus(z2, cameraControl, l2);
    }

    public final void enableTapToFocus(boolean enabled, final CameraControl cameraControl, final Long autoCancelDuration) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraControl, "");
        if (!enabled) {
            this.ProcessCameraProviderExtensionsKt.setOnTouchListener(null);
            return;
        }
        int i3 = CameraConstants + 99;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        final PreviewView previewView = this.ProcessCameraProviderExtensionsKt;
        if (previewView.getMeasuredWidth() <= 0 || previewView.getMeasuredHeight() <= 0) {
            previewView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.incode.camera.TapToFocusFeature$enableTapToFocus$$inlined$afterMeasured$1
                private static int getAvailableCameraInternals = 0;
                private static int getConfig = 1;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    int i5 = 2 % 2;
                    int i6 = getConfig + 9;
                    getAvailableCameraInternals = i6 % 128;
                    int i7 = i6 % 2;
                    if (previewView.getMeasuredWidth() > 0) {
                        int i8 = getAvailableCameraInternals + 117;
                        getConfig = i8 % 128;
                        if (i8 % 2 == 0) {
                            previewView.getMeasuredHeight();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (previewView.getMeasuredHeight() > 0) {
                            previewView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            TapToFocusFeature.access$applyFeature(this, cameraControl, autoCancelDuration);
                        }
                    }
                }
            });
            return;
        }
        int i5 = IncodeCamera + 31;
        CameraConstants = i5 % 128;
        if (i5 % 2 != 0) {
            access$applyFeature(this, cameraControl, autoCancelDuration);
        } else {
            access$applyFeature(this, cameraControl, autoCancelDuration);
            throw null;
        }
    }

    public static final boolean e1(TapToFocusFeature tapToFocusFeature, GestureDetectorCompat gestureDetectorCompat, View view, MotionEvent motionEvent) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tapToFocusFeature, "");
        Intrinsics.checkNotNullParameter(gestureDetectorCompat, "");
        if (motionEvent.getAction() == 1) {
            int i3 = IncodeCamera + 123;
            CameraConstants = i3 % 128;
            if (i3 % 2 == 0) {
                tapToFocusFeature.ProcessCameraProviderExtensionsKt.performClick();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            tapToFocusFeature.ProcessCameraProviderExtensionsKt.performClick();
        }
        boolean zOnTouchEvent = gestureDetectorCompat.onTouchEvent(motionEvent);
        int i4 = CameraConstants + 57;
        IncodeCamera = i4 % 128;
        int i5 = i4 % 2;
        return zOnTouchEvent;
    }

    private final void ProcessCameraProviderExtensionsKt(final CameraControl cameraControl, final Long l2) {
        int i2 = 2 % 2;
        this.f3572e1.layout(0, 0, this.ProcessCameraProviderExtensionsKt.getWidth(), this.ProcessCameraProviderExtensionsKt.getHeight());
        this.ProcessCameraProviderExtensionsKt.getOverlay().remove(this.f3572e1);
        this.ProcessCameraProviderExtensionsKt.getOverlay().add(this.f3572e1);
        final GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(this.ProcessCameraProviderExtensionsKt.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.incode.camera.TapToFocusFeature$applyFeature$detector$1
            private static int ProcessCameraProviderExtensionsKt = 1;

            /* JADX INFO: renamed from: e1, reason: collision with root package name */
            private static int f3573e1 = 0;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent e2) {
                int i3 = 2 % 2;
                int i4 = ProcessCameraProviderExtensionsKt + 9;
                f3573e1 = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(e2, "");
                int i6 = f3573e1 + 125;
                ProcessCameraProviderExtensionsKt = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent e2) {
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(e2, "");
                TapToFocusFeature.access$getCameraOverlay$p(this.CameraConstants).setFocusPoint(new PointF(e2.getX(), e2.getY()));
                getAvailableCameraInternals(e2);
                int i4 = ProcessCameraProviderExtensionsKt + 87;
                f3573e1 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private final void getAvailableCameraInternals(android.view.MotionEvent r7) {
                /*
                    r6 = this;
                    r5 = 2
                    int r0 = r5 % r5
                    com.incode.camera.TapToFocusFeature r0 = r6.CameraConstants
                    androidx.camera.view.PreviewView r0 = com.incode.camera.TapToFocusFeature.access$getPreviewView$p(r0)
                    androidx.camera.core.MeteringPointFactory r2 = r0.getMeteringPointFactory()
                    java.lang.String r4 = ""
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
                    float r1 = r7.getX()
                    float r0 = r7.getY()
                    androidx.camera.core.MeteringPoint r0 = r2.createPoint(r1, r0)
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
                    androidx.camera.core.FocusMeteringAction$Builder r3 = new androidx.camera.core.FocusMeteringAction$Builder
                    r3.<init>(r0)
                    java.lang.Long r2 = r3
                    if (r2 == 0) goto L44
                    int r0 = com.incode.camera.TapToFocusFeature$applyFeature$detector$1.ProcessCameraProviderExtensionsKt
                    int r1 = r0 + 51
                    int r0 = r1 % 128
                    com.incode.camera.TapToFocusFeature$applyFeature$detector$1.f3573e1 = r0
                    int r1 = r1 % r5
                    if (r1 != 0) goto L5d
                    r0 = r2
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r1 = r2.longValue()
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                    androidx.camera.core.FocusMeteringAction$Builder r0 = r3.setAutoCancelDuration(r1, r0)
                    if (r0 != 0) goto L50
                L44:
                    r3.disableAutoCancel()
                    int r0 = com.incode.camera.TapToFocusFeature$applyFeature$detector$1.f3573e1
                    int r1 = r0 + 117
                    int r0 = r1 % 128
                    com.incode.camera.TapToFocusFeature$applyFeature$detector$1.ProcessCameraProviderExtensionsKt = r0
                    int r1 = r1 % r5
                L50:
                    androidx.camera.core.FocusMeteringAction r1 = r3.build()
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
                    androidx.camera.core.CameraControl r0 = r2
                    r0.startFocusAndMetering(r1)
                    return
                L5d:
                    r0 = r2
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r1 = r2.longValue()
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                    r3.setAutoCancelDuration(r1, r0)
                    r0 = 0
                    r0.hashCode()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.TapToFocusFeature$applyFeature$detector$1.getAvailableCameraInternals(android.view.MotionEvent):void");
            }
        });
        this.ProcessCameraProviderExtensionsKt.setOnTouchListener(new View.OnTouchListener() { // from class: com.incode.camera.TapToFocusFeature$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return TapToFocusFeature.e1(this.f$0, gestureDetectorCompat, view, motionEvent);
            }
        });
        int i3 = IncodeCamera + 53;
        CameraConstants = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
