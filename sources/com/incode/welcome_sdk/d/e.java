package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IncodeTextView f7185a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProgressBar f7186c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f7187e;

    private e(ConstraintLayout constraintLayout, ProgressBar progressBar, IncodeTextView incodeTextView) {
        this.f7187e = constraintLayout;
        this.f7186c = progressBar;
        this.f7185a = incodeTextView;
    }

    public final ConstraintLayout b() {
        return this.f7187e;
    }

    public static e c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_antifraud, (ViewGroup) null, false);
        int i2 = R.id.loader;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
        if (progressBar != null) {
            i2 = R.id.tvTitle;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView != null) {
                return new e((ConstraintLayout) viewInflate, progressBar, incodeTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7187e;
    }
}
