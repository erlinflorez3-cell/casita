package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class bo implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeImageView f7125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConstraintLayout f7126b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConstraintLayout f7127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeImageView f7128e;

    private bo(ConstraintLayout constraintLayout, IncodeImageView incodeImageView, IncodeImageView incodeImageView2, ConstraintLayout constraintLayout2) {
        this.f7127d = constraintLayout;
        this.f7128e = incodeImageView;
        this.f7125a = incodeImageView2;
        this.f7126b = constraintLayout2;
    }

    public final ConstraintLayout b() {
        return this.f7127d;
    }

    public static bo c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_video_selfie_progress_item, viewGroup, false);
        int i2 = R.id.ivVsProgressBar;
        IncodeImageView incodeImageView = (IncodeImageView) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeImageView != null) {
            i2 = R.id.ivVsProgressItemIcon;
            IncodeImageView incodeImageView2 = (IncodeImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeImageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                return new bo(constraintLayout, incodeImageView, incodeImageView2, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7127d;
    }
}
