package com.incode.welcome_sdk.d;

import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bm implements ViewBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f7121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f7122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f7123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f7124e;

    private bm(View view, ImageView imageView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f7123d = view;
        this.f7122c = imageView;
        this.f7124e = incodeTextView;
        this.f7121b = incodeTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f7123d;
    }

    public static bm a(View view) {
        int i2 = R.id.ivStatus;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            i2 = R.id.tvIndex;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
            if (incodeTextView != null) {
                i2 = R.id.tvName;
                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                if (incodeTextView2 != null) {
                    return new bm(view, imageView, incodeTextView, incodeTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
