package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.IncodeLottieAnimationView;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ah implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final IncodeTextView f6854a;

    /* JADX INFO: renamed from: b */
    public final IncodeLottieAnimationView f6855b;

    /* JADX INFO: renamed from: c */
    public final TextView f6856c;

    /* JADX INFO: renamed from: d */
    public final IncodeButton f6857d;

    /* JADX INFO: renamed from: e */
    public final ImageView f6858e;

    /* JADX INFO: renamed from: f */
    public final IncodeTextView f6859f;

    /* JADX INFO: renamed from: h */
    private ImageView f6860h;

    /* JADX INFO: renamed from: i */
    private Guideline f6861i;

    /* JADX INFO: renamed from: j */
    private final ConstraintLayout f6862j;

    private ah(ConstraintLayout constraintLayout, IncodeButton incodeButton, ImageView imageView, ImageView imageView2, IncodeLottieAnimationView incodeLottieAnimationView, Guideline guideline, TextView textView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f6862j = constraintLayout;
        this.f6857d = incodeButton;
        this.f6858e = imageView;
        this.f6860h = imageView2;
        this.f6855b = incodeLottieAnimationView;
        this.f6861i = guideline;
        this.f6856c = textView;
        this.f6854a = incodeTextView;
        this.f6859f = incodeTextView2;
    }

    public final ConstraintLayout b() {
        return this.f6862j;
    }

    public static ah a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_tutorial_selfie, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.ivAge;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView != null) {
                i2 = R.id.ivLogoTop;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageView2 != null) {
                    i2 = R.id.lottieAnimationView;
                    IncodeLottieAnimationView incodeLottieAnimationView = (IncodeLottieAnimationView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeLottieAnimationView != null) {
                        i2 = R.id.onboard_sdk_guideline4;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                        if (guideline != null) {
                            i2 = R.id.tvInstructions;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (textView != null) {
                                i2 = R.id.tvSubtitle;
                                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView != null) {
                                    i2 = R.id.tvTitle;
                                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView2 != null) {
                                        return new ah((ConstraintLayout) viewInflate, incodeButton, imageView, imageView2, incodeLottieAnimationView, guideline, textView, incodeTextView, incodeTextView2);
                                    }
                                }
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
        return this.f6862j;
    }
}
