package com.incode.welcome_sdk.ui.id_capture.view;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes5.dex */
public final class OverlayImagePainter extends Painter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f15682g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f15683j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageBitmap f15685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageBitmap f15686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f15687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f15688e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f15689i;

    public /* synthetic */ OverlayImagePainter(ImageBitmap imageBitmap, ImageBitmap imageBitmap2, long j2, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, imageBitmap2, (i2 & 4) != 0 ? IntOffset.Companion.m6776getZeronOccac() : j2, (i2 & 8) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j3, (i2 & 16) != 0 ? IntSizeKt.IntSize(imageBitmap2.getWidth(), imageBitmap2.getHeight()) : j4, null);
    }

    private OverlayImagePainter(ImageBitmap imageBitmap, ImageBitmap imageBitmap2, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(imageBitmap, "");
        Intrinsics.checkNotNullParameter(imageBitmap2, "");
        this.f15686c = imageBitmap;
        this.f15685b = imageBitmap2;
        this.f15687d = j2;
        this.f15684a = j3;
        this.f15688e = j4;
        this.f15689i = d(j2, j3);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected final void onDraw(DrawScope drawScope) {
        int i2 = 2 % 2;
        int i3 = f15682g + 23;
        f15683j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(drawScope, "");
        DrawScope.m4717drawImageAZ2fEMs$default(drawScope, this.f15686c, this.f15687d, this.f15684a, 0L, IntSizeKt.IntSize(MathKt.roundToInt(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc())), MathKt.roundToInt(Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()))), 0.0f, null, null, 0, 0, 1000, null);
        DrawScope.m4717drawImageAZ2fEMs$default(drawScope, this.f15685b, this.f15687d, this.f15688e, 0L, IntSizeKt.IntSize(MathKt.roundToInt(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc())), MathKt.roundToInt(Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()))), 0.0f, null, null, BlendMode.Companion.m4111getOverlay0nO6VwU(), 0, 744, null);
        int i5 = f15682g + 29;
        f15683j = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo4855getIntrinsicSizeNHjbRc() {
        long jM6820toSizeozmzZPI;
        int i2 = 2 % 2;
        int i3 = f15682g + 89;
        f15683j = i3 % 128;
        if (i3 % 2 != 0) {
            jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(this.f15689i);
            int i4 = 41 / 0;
        } else {
            jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(this.f15689i);
        }
        int i5 = f15683j + 43;
        f15682g = i5 % 128;
        int i6 = i5 % 2;
        return jM6820toSizeozmzZPI;
    }

    private final long d(long j2, long j3) {
        int i2 = 2 % 2;
        int i3 = f15683j + 117;
        f15682g = i3 % 128;
        if (i3 % 2 != 0) {
            if (IntOffset.m6766getXimpl(j2) >= 0) {
                int i4 = f15682g + 93;
                f15683j = i4 % 128;
                int i5 = i4 % 2;
                if (IntOffset.m6767getYimpl(j2) >= 0 && IntSize.m6808getWidthimpl(j3) >= 0 && IntSize.m6807getHeightimpl(j3) >= 0) {
                    int i6 = f15683j + 65;
                    f15682g = i6 % 128;
                    int i7 = i6 % 2;
                    if (IntSize.m6808getWidthimpl(j3) <= this.f15686c.getWidth()) {
                        int i8 = f15683j + 61;
                        f15682g = i8 % 128;
                        if (i8 % 2 == 0) {
                            IntSize.m6807getHeightimpl(j3);
                            this.f15686c.getHeight();
                            throw null;
                        }
                        if (IntSize.m6807getHeightimpl(j3) <= this.f15686c.getHeight()) {
                            return j3;
                        }
                    }
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        IntOffset.m6766getXimpl(j2);
        throw null;
    }

    public /* synthetic */ OverlayImagePainter(ImageBitmap imageBitmap, ImageBitmap imageBitmap2, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, imageBitmap2, j2, j3, j4);
    }
}
