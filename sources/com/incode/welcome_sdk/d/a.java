package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.RoundedCornersFixedWidthSquareImage;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f6759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f6760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f6761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f6762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f6763e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConstraintLayout f6764h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IncodeTextView f6765j;

    private a(ConstraintLayout constraintLayout, IncodeButton incodeButton, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage, ImageView imageView, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage2, ConstraintLayout constraintLayout2, IncodeTextView incodeTextView) {
        this.f6764h = constraintLayout;
        this.f6763e = incodeButton;
        this.f6762d = roundedCornersFixedWidthSquareImage;
        this.f6759a = imageView;
        this.f6761c = roundedCornersFixedWidthSquareImage2;
        this.f6760b = constraintLayout2;
        this.f6765j = incodeTextView;
    }

    public static a c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_approve, (ViewGroup) null, false);
        int i2 = R.id.btnTryAgain;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.ivSelfie;
            RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
            if (roundedCornersFixedWidthSquareImage != null) {
                i2 = R.id.ivState;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageView != null) {
                    i2 = R.id.ivStateContainer;
                    RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage2 = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
                    if (roundedCornersFixedWidthSquareImage2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i2 = R.id.tvMessage;
                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView != null) {
                            return new a(constraintLayout, incodeButton, roundedCornersFixedWidthSquareImage, imageView, roundedCornersFixedWidthSquareImage2, constraintLayout, incodeTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6764h;
    }
}
