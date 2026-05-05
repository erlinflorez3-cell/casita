package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f7255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConstraintLayout f7257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f7258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f7259e;

    private k(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, IncodeTextView incodeTextView) {
        this.f7257c = constraintLayout;
        this.f7256b = imageView;
        this.f7255a = imageView2;
        this.f7258d = imageView3;
        this.f7259e = incodeTextView;
    }

    public final ConstraintLayout a() {
        return this.f7257c;
    }

    public static k b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_government_validation, (ViewGroup) null, false);
        int i2 = R.id.ivGovtIncode;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
        if (imageView != null) {
            i2 = R.id.ivIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView2 != null) {
                i2 = R.id.ivLogoTop;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageView3 != null) {
                    i2 = R.id.tvTitle;
                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView != null) {
                        return new k((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, incodeTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7257c;
    }
}
