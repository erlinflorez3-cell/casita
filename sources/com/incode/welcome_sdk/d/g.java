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
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f7211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f7213c;

    private g(ConstraintLayout constraintLayout, ImageView imageView, IncodeTextView incodeTextView) {
        this.f7211a = constraintLayout;
        this.f7212b = imageView;
        this.f7213c = incodeTextView;
    }

    public final ConstraintLayout e() {
        return this.f7211a;
    }

    public static g b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_custom_watchlist, (ViewGroup) null, false);
        int i2 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
        if (imageView != null) {
            i2 = R.id.tvTitle;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView != null) {
                return new g((ConstraintLayout) viewInflate, imageView, incodeTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7211a;
    }
}
