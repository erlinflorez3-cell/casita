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
public final class aw implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeTextView f6970a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f6971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConstraintLayout f6972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f6973e;

    private aw(ConstraintLayout constraintLayout, ImageView imageView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f6972d = constraintLayout;
        this.f6971c = imageView;
        this.f6973e = incodeTextView;
        this.f6970a = incodeTextView2;
    }

    public final ConstraintLayout c() {
        return this.f6972d;
    }

    public static aw e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_generating_curp, viewGroup, false);
        int i2 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
        if (imageView != null) {
            i2 = R.id.tvSubtitle;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView != null) {
                i2 = R.id.tvTitle;
                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeTextView2 != null) {
                    return new aw((ConstraintLayout) viewInflate, imageView, incodeTextView, incodeTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6972d;
    }
}
