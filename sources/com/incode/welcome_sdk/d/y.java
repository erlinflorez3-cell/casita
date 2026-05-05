package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.IncodeLottieAnimationView;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IncodeTextView f7412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConstraintLayout f7414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeButton f7415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IncodeLottieAnimationView f7416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IncodeTextView f7417f;

    private y(ConstraintLayout constraintLayout, IncodeButton incodeButton, ImageView imageView, IncodeLottieAnimationView incodeLottieAnimationView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f7414c = constraintLayout;
        this.f7415d = incodeButton;
        this.f7413b = imageView;
        this.f7416e = incodeLottieAnimationView;
        this.f7412a = incodeTextView;
        this.f7417f = incodeTextView2;
    }

    public final ConstraintLayout b() {
        return this.f7414c;
    }

    public static y a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_qr_tip, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.ivLogoTop;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView != null) {
                i2 = R.id.lottieAnimationView;
                IncodeLottieAnimationView incodeLottieAnimationView = (IncodeLottieAnimationView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeLottieAnimationView != null) {
                    i2 = R.id.subtitle;
                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView != null) {
                        i2 = R.id.title;
                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView2 != null) {
                            return new y((ConstraintLayout) viewInflate, incodeButton, imageView, incodeLottieAnimationView, incodeTextView, incodeTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7414c;
    }
}
