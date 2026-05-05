package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.otp.OtpTextView;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f7221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f7222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeButton f7223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OtpTextView f7224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f7225e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IncodeTextView f7226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScrollView f7227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IncodeTextView f7228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ImageView f7229j;

    private i(ScrollView scrollView, IncodeButton incodeButton, ImageView imageView, ProgressBar progressBar, OtpTextView otpTextView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4) {
        this.f7227h = scrollView;
        this.f7223c = incodeButton;
        this.f7229j = imageView;
        this.f7221a = progressBar;
        this.f7224d = otpTextView;
        this.f7225e = incodeTextView;
        this.f7226g = incodeTextView2;
        this.f7222b = incodeTextView3;
        this.f7228i = incodeTextView4;
    }

    public final ScrollView a() {
        return this.f7227h;
    }

    public static i c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_captcha, (ViewGroup) null, false);
        int i2 = R.id.btnSubmit;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.ivLogoTop;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView != null) {
                i2 = R.id.loader;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
                if (progressBar != null) {
                    i2 = R.id.otpCaptcha;
                    OtpTextView otpTextView = (OtpTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (otpTextView != null) {
                        i2 = R.id.txtCaptcha;
                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView != null) {
                            i2 = R.id.txtCaptchaTitle;
                            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView2 != null) {
                                i2 = R.id.txtError;
                                IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView3 != null) {
                                    i2 = R.id.txtFeedback;
                                    IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView4 != null) {
                                        return new i((ScrollView) viewInflate, incodeButton, imageView, progressBar, otpTextView, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4);
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
        return this.f7227h;
    }
}
