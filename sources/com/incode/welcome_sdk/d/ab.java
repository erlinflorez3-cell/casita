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
public final class ab implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f6792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConstraintLayout f6793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeButton f6794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeTextView f6795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeLottieAnimationView f6796e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IncodeTextView f6797h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private IncodeTextView f6798j;

    private ab(ConstraintLayout constraintLayout, IncodeButton incodeButton, ImageView imageView, IncodeLottieAnimationView incodeLottieAnimationView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3) {
        this.f6793b = constraintLayout;
        this.f6794c = incodeButton;
        this.f6792a = imageView;
        this.f6796e = incodeLottieAnimationView;
        this.f6798j = incodeTextView;
        this.f6797h = incodeTextView2;
        this.f6795d = incodeTextView3;
    }

    public final ConstraintLayout a() {
        return this.f6793b;
    }

    public static ab d(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_tutorial_back, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.ivLogoTop;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView != null) {
                i2 = R.id.lottieAnimationView;
                IncodeLottieAnimationView incodeLottieAnimationView = (IncodeLottieAnimationView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeLottieAnimationView != null) {
                    i2 = R.id.tvSubtitle1;
                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView != null) {
                        i2 = R.id.tvSubtitle2;
                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView2 != null) {
                            i2 = R.id.tvTitle;
                            IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView3 != null) {
                                return new ab((ConstraintLayout) viewInflate, incodeButton, imageView, incodeLottieAnimationView, incodeTextView, incodeTextView2, incodeTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6793b;
    }
}
