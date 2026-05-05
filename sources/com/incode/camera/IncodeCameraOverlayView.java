package com.incode.camera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/incode/camera/IncodeCameraOverlayView;", "Landroid/view/View;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "circleRadius", "", "fadeOut", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "focusPoint", "Landroid/graphics/PointF;", "getFocusPoint", "()Landroid/graphics/PointF;", "setFocusPoint", "(Landroid/graphics/PointF;)V", "paintFocus", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IncodeCameraOverlayView extends View {
    private static int CameraConstants = 0;
    private static int getConfig = 1;
    private final ValueAnimator IncodeCamera;
    private PointF ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private float f3567e1;
    private final Paint getAvailableCameraInternals;

    public /* synthetic */ IncodeCameraOverlayView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public static final /* synthetic */ void access$setCircleRadius$p(IncodeCameraOverlayView incodeCameraOverlayView, float f2) {
        int i2 = 2 % 2;
        int i3 = getConfig + 89;
        int i4 = i3 % 128;
        CameraConstants = i4;
        int i5 = i3 % 2;
        incodeCameraOverlayView.f3567e1 = f2;
        if (i5 != 0) {
            int i6 = 86 / 0;
        }
        int i7 = i4 + 93;
        getConfig = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeCameraOverlayView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.camera.IncodeCameraOverlayView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IncodeCameraOverlayView.ProcessCameraProviderExtensionsKt(this.f$0, valueAnimatorOfFloat, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.incode.camera.IncodeCameraOverlayView$fadeOut$1$2
            private static int IncodeCamera = 0;

            /* JADX INFO: renamed from: e1, reason: collision with root package name */
            private static int f3568e1 = 1;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                IncodeCameraOverlayView incodeCameraOverlayView;
                int i3;
                int i4 = 2 % 2;
                int i5 = f3568e1 + 65;
                IncodeCamera = i5 % 128;
                if (i5 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(animation, "");
                    incodeCameraOverlayView = this.ProcessCameraProviderExtensionsKt;
                    i3 = 3;
                } else {
                    Intrinsics.checkNotNullParameter(animation, "");
                    incodeCameraOverlayView = this.ProcessCameraProviderExtensionsKt;
                    i3 = 4;
                }
                incodeCameraOverlayView.setVisibility(i3);
                IncodeCameraOverlayView.access$setCircleRadius$p(this.ProcessCameraProviderExtensionsKt, 30.0f);
            }
        });
        this.IncodeCamera = valueAnimatorOfFloat;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAlpha(160);
        this.getAvailableCameraInternals = paint;
        this.f3567e1 = 30.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ProcessCameraProviderExtensionsKt(com.incode.camera.IncodeCameraOverlayView r7, android.animation.ValueAnimator r8, android.animation.ValueAnimator r9) {
        /*
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.camera.IncodeCameraOverlayView.getConfig
            int r5 = r0 + 113
            int r0 = r5 % 128
            com.incode.camera.IncodeCameraOverlayView.CameraConstants = r0
            int r5 = r5 % r6
            r4 = 1101004800(0x41a00000, float:20.0)
            r3 = 1106247680(0x41f00000, float:30.0)
            r1 = 1112014848(0x42480000, float:50.0)
            java.lang.String r2 = ""
            if (r5 == 0) goto L44
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            float r0 = r8.getAnimatedFraction()
            float r0 = r0 % r4
            float r0 = r0 + r3
            r7.f3567e1 = r0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L57
        L28:
            r7.f3567e1 = r1
            int r0 = com.incode.camera.IncodeCameraOverlayView.CameraConstants
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.camera.IncodeCameraOverlayView.getConfig = r0
            int r1 = r1 % r6
        L33:
            java.lang.Object r0 = r9.getAnimatedValue()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r7.setAlpha(r0)
            return
        L44:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            float r0 = r8.getAnimatedFraction()
            float r0 = r0 * r4
            float r0 = r0 + r3
            r7.f3567e1 = r0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L57
            goto L28
        L57:
            r7.invalidate()
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.IncodeCameraOverlayView.ProcessCameraProviderExtensionsKt(com.incode.camera.IncodeCameraOverlayView, android.animation.ValueAnimator, android.animation.ValueAnimator):void");
    }

    public final PointF getFocusPoint() {
        int i2 = 2 % 2;
        int i3 = getConfig;
        int i4 = i3 + 31;
        CameraConstants = i4 % 128;
        int i5 = i4 % 2;
        PointF pointF = this.ProcessCameraProviderExtensionsKt;
        int i6 = i3 + 31;
        CameraConstants = i6 % 128;
        int i7 = i6 % 2;
        return pointF;
    }

    public final void setFocusPoint(PointF pointF) {
        int i2 = 2 % 2;
        int i3 = getConfig + 29;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        this.ProcessCameraProviderExtensionsKt = pointF;
        this.IncodeCamera.end();
        setVisibility(0);
        this.IncodeCamera.start();
        int i5 = getConfig + 11;
        CameraConstants = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = getConfig + 83;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        PointF pointF = this.ProcessCameraProviderExtensionsKt;
        if (pointF != null) {
            canvas.drawCircle(pointF.x, pointF.y, this.f3567e1, this.getAvailableCameraInternals);
            int i5 = CameraConstants + 23;
            getConfig = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeCameraOverlayView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeCameraOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
