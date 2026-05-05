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
public final class av implements ViewBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f6967b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeTextView f6968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f6969e;

    private av(ConstraintLayout constraintLayout, ImageView imageView, IncodeTextView incodeTextView) {
        this.f6969e = constraintLayout;
        this.f6967b = imageView;
        this.f6968d = incodeTextView;
    }

    public final ConstraintLayout c() {
        return this.f6969e;
    }

    public static av c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_validating_curp, viewGroup, false);
        int i2 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
        if (imageView != null) {
            i2 = R.id.tvTitle;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView != null) {
                return new av((ConstraintLayout) viewInflate, imageView, incodeTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6969e;
    }
}
