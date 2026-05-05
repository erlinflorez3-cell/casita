package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class RoundedCornersFixedWidthSquareImage extends ShapeableImageView {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5885b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5886c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5887d = 29 % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5888e = 1;

    public /* synthetic */ RoundedCornersFixedWidthSquareImage(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornersFixedWidthSquareImage(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.google.android.material.imageview.ShapeableImageView, android.widget.ImageView, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f5888e + 59;
        f5886c = i5 % 128;
        int i6 = i5 % 2;
        super.onMeasure(i2, i3);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        int i7 = f5888e + 19;
        f5886c = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 49 / 0;
        }
    }

    static {
        int i2 = 29 % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedCornersFixedWidthSquareImage(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedCornersFixedWidthSquareImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
