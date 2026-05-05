package com.incode.welcome_sdk.d;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bj implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeTextView f7102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f7103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f7104c;

    private bj(View view, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f7104c = view;
        this.f7102a = incodeTextView;
        this.f7103b = incodeTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f7104c;
    }

    public static bj c(View view) {
        int i2 = R.id.tvName;
        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
        if (incodeTextView != null) {
            i2 = R.id.tvValue;
            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
            if (incodeTextView2 != null) {
                return new bj(view, incodeTextView, incodeTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
