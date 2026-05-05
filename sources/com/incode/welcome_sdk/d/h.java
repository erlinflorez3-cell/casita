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
import com.incode.welcome_sdk.views.IncodeButton;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f7214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConstraintLayout f7216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Guideline f7217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f7218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f7219f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f7220j;

    private h(ConstraintLayout constraintLayout, ImageView imageView, IncodeButton incodeButton, ImageView imageView2, Guideline guideline, TextView textView, TextView textView2) {
        this.f7216c = constraintLayout;
        this.f7214a = imageView;
        this.f7218e = incodeButton;
        this.f7215b = imageView2;
        this.f7217d = guideline;
        this.f7220j = textView;
        this.f7219f = textView2;
    }

    public final ConstraintLayout b() {
        return this.f7216c;
    }

    public static h e(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_delayed_onboarding_intro, (ViewGroup) null, false);
        int i2 = R.id.btnClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
        if (imageView != null) {
            i2 = R.id.btnContinue;
            IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton != null) {
                i2 = R.id.ivNoInternet;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageView2 != null) {
                    i2 = R.id.onboard_sdk_guideline;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                    if (guideline != null) {
                        i2 = R.id.tvNoInternet;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (textView != null) {
                            i2 = R.id.tvNoInternetDescription;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (textView2 != null) {
                                return new h((ConstraintLayout) viewInflate, imageView, incodeButton, imageView2, guideline, textView, textView2);
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
        return this.f7216c;
    }
}
