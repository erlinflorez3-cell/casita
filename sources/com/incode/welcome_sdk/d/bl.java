package com.incode.welcome_sdk.d;

import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bl implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeTextView f7116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f7117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f7118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f7119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f7120e;

    private bl(View view, ImageView imageView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3) {
        this.f7120e = view;
        this.f7119d = imageView;
        this.f7116a = incodeTextView;
        this.f7117b = incodeTextView2;
        this.f7118c = incodeTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f7120e;
    }

    public static bl d(View view) {
        int i2 = R.id.ivStatus;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            i2 = R.id.tvIndex;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
            if (incodeTextView != null) {
                i2 = R.id.tvName;
                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                if (incodeTextView2 != null) {
                    i2 = R.id.tvValue;
                    IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                    if (incodeTextView3 != null) {
                        return new bl(view, imageView, incodeTextView, incodeTextView2, incodeTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
