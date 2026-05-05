package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.otp.OtpTextView;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class au implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeTextView f6956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f6957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeButton f6958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f6959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OtpTextView f6960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IncodeTextView f6961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IncodeTextView f6962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f6963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConstraintLayout f6964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ProgressBar f6965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IncodeTextView f6966k;

    private au(ConstraintLayout constraintLayout, IncodeButton incodeButton, ImageView imageView, ProgressBar progressBar, OtpTextView otpTextView, LinearLayout linearLayout, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5) {
        this.f6964i = constraintLayout;
        this.f6958c = incodeButton;
        this.f6963h = imageView;
        this.f6965j = progressBar;
        this.f6960e = otpTextView;
        this.f6959d = linearLayout;
        this.f6956a = incodeTextView;
        this.f6957b = incodeTextView2;
        this.f6966k = incodeTextView3;
        this.f6961f = incodeTextView4;
        this.f6962g = incodeTextView5;
    }

    public final ConstraintLayout d() {
        return this.f6964i;
    }

    public static au e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_otp, viewGroup, false);
        int i2 = R.id.btnSubmit;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.ivLogoTop;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView != null) {
                i2 = R.id.loader;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
                if (progressBar != null) {
                    i2 = R.id.otpInput;
                    OtpTextView otpTextView = (OtpTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (otpTextView != null) {
                        i2 = R.id.progressContainer;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                        if (linearLayout != null) {
                            i2 = R.id.txtBottom;
                            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView != null) {
                                i2 = R.id.txtError;
                                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView2 != null) {
                                    i2 = R.id.txtProgress;
                                    IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView3 != null) {
                                        i2 = R.id.txtSubtitle;
                                        IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (incodeTextView4 != null) {
                                            i2 = R.id.txtTitle;
                                            IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (incodeTextView5 != null) {
                                                return new au((ConstraintLayout) viewInflate, incodeButton, imageView, progressBar, otpTextView, linearLayout, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4, incodeTextView5);
                                            }
                                        }
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
        return this.f6964i;
    }
}
