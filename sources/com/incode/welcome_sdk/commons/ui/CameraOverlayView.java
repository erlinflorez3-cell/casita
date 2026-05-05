package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.incode.welcome_sdk.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraOverlayView extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5767a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5768b = 107 % 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5769c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5770e = 0;
    private PointF focusPoint;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private PointF f5771p0;
    private PointF p1;
    private PointF p2;
    private PointF p3;
    private final Paint paintBarcode;
    private final Paint paintFocus;

    public /* synthetic */ CameraOverlayView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraOverlayView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAlpha(160);
        this.paintFocus = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(ContextCompat.getColor(context, R.color.onboard_sdk_colorPrimary));
        paint2.setAlpha(80);
        this.paintBarcode = paint2;
    }

    public final Paint getPaintFocus() {
        int i2 = 2 % 2;
        int i3 = f5770e + 111;
        f5767a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.paintFocus;
        }
        throw null;
    }

    public final PointF getFocusPoint() {
        int i2 = 2 % 2;
        int i3 = f5767a + 53;
        f5770e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.focusPoint;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFocusPoint(PointF pointF) {
        int i2 = 2 % 2;
        int i3 = f5767a + 89;
        f5770e = i3 % 128;
        int i4 = i3 % 2;
        this.focusPoint = pointF;
        invalidate();
        int i5 = f5770e + 55;
        f5767a = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Paint getPaintBarcode() {
        int i2 = 2 % 2;
        int i3 = f5767a;
        int i4 = i3 + 55;
        f5770e = i4 % 128;
        int i5 = i4 % 2;
        Paint paint = this.paintBarcode;
        int i6 = i3 + 53;
        f5770e = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 71 / 0;
        }
        return paint;
    }

    public final void showQuadOverlay(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        int i2 = 2 % 2;
        int i3 = f5770e + 15;
        f5767a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(pointF, "");
        Intrinsics.checkNotNullParameter(pointF2, "");
        Intrinsics.checkNotNullParameter(pointF3, "");
        Intrinsics.checkNotNullParameter(pointF4, "");
        this.f5771p0 = pointF;
        this.p1 = pointF2;
        this.p2 = pointF3;
        this.p3 = pointF4;
        invalidate();
        int i5 = f5770e + 103;
        f5767a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void clearQuadOverlay() {
        int i2 = 2 % 2;
        int i3 = f5770e + 103;
        f5767a = i3 % 128;
        if (i3 % 2 != 0) {
            this.f5771p0 = null;
            this.p1 = null;
            this.p2 = null;
            this.p3 = null;
            invalidate();
            return;
        }
        this.f5771p0 = null;
        this.p1 = null;
        this.p2 = null;
        this.p3 = null;
        invalidate();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f A[PHI: r4
  0x001f: PHI (r4v1 android.graphics.PointF) = (r4v0 android.graphics.PointF), (r4v2 android.graphics.PointF) binds: [B:24:0x0098, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5770e
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5767a = r0
            int r1 = r1 % r6
            java.lang.String r0 = ""
            r5 = 0
            if (r1 != 0) goto L90
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            super.onDraw(r8)
            android.graphics.PointF r4 = r7.f5771p0
            r0 = 58
            int r0 = r0 / 0
            if (r4 == 0) goto L75
        L1f:
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            float r1 = r4.x
            float r0 = r4.y
            r3.moveTo(r1, r0)
            android.graphics.PointF r0 = r7.p1
            if (r0 == 0) goto L36
            float r1 = r0.x
            float r0 = r0.y
            r3.lineTo(r1, r0)
        L36:
            android.graphics.PointF r2 = r7.p2
            if (r2 == 0) goto L4a
            int r0 = com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5770e
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5767a = r0
            int r1 = r1 % r6
            float r1 = r2.x
            float r0 = r2.y
            r3.lineTo(r1, r0)
        L4a:
            android.graphics.PointF r2 = r7.p3
            if (r2 == 0) goto L60
            int r0 = com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5767a
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5770e = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L9d
            float r1 = r2.x
            float r0 = r2.y
            r3.lineTo(r1, r0)
        L60:
            float r1 = r4.x
            float r0 = r4.y
            r3.lineTo(r1, r0)
            android.graphics.Paint r0 = r7.paintBarcode
            r8.drawPath(r3, r0)
            int r0 = com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5770e
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5767a = r0
            int r1 = r1 % r6
        L75:
            android.graphics.PointF r0 = r7.focusPoint
            if (r0 == 0) goto L9c
            float r3 = r0.x
            float r2 = r0.y
            r1 = 1112014848(0x42480000, float:50.0)
            android.graphics.Paint r0 = r7.paintFocus
            r8.drawCircle(r3, r2, r1, r0)
            int r0 = com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5770e
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.CameraOverlayView.f5767a = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L9b
            return
        L90:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            super.onDraw(r8)
            android.graphics.PointF r4 = r7.f5771p0
            if (r4 == 0) goto L75
            goto L1f
        L9b:
            throw r5
        L9c:
            return
        L9d:
            float r1 = r2.x
            float r0 = r2.y
            r3.lineTo(r1, r0)
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.CameraOverlayView.onDraw(android.graphics.Canvas):void");
    }

    static {
        int i2 = 107 % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraOverlayView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
