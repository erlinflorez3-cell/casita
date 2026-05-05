package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.SignatureView;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ac implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ProgressBar f6799a;

    /* JADX INFO: renamed from: b */
    public final IncodeButton f6800b;

    /* JADX INFO: renamed from: c */
    public final IncodeTextView f6801c;

    /* JADX INFO: renamed from: d */
    public final IncodeButton f6802d;

    /* JADX INFO: renamed from: e */
    public final SignatureView f6803e;

    /* JADX INFO: renamed from: h */
    private final ConstraintLayout f6804h;

    /* JADX INFO: renamed from: i */
    public final IncodeTextView f6805i;

    /* JADX INFO: renamed from: j */
    public final IncodeTextView f6806j;

    private ac(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeButton incodeButton2, ProgressBar progressBar, SignatureView signatureView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3) {
        this.f6804h = constraintLayout;
        this.f6800b = incodeButton;
        this.f6802d = incodeButton2;
        this.f6799a = progressBar;
        this.f6803e = signatureView;
        this.f6801c = incodeTextView;
        this.f6805i = incodeTextView2;
        this.f6806j = incodeTextView3;
    }

    public final ConstraintLayout a() {
        return this.f6804h;
    }

    public static ac a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_signature_form, (ViewGroup) null, false);
        int i2 = R.id.btnClear;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.btnDone;
            IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton2 != null) {
                i2 = R.id.loader;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
                if (progressBar != null) {
                    i2 = R.id.signature;
                    SignatureView signatureView = (SignatureView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (signatureView != null) {
                        i2 = R.id.tvDescription;
                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView != null) {
                            i2 = R.id.tvSignHere;
                            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView2 != null) {
                                i2 = R.id.tvTitle;
                                IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView3 != null) {
                                    return new ac((ConstraintLayout) viewInflate, incodeButton, incodeButton2, progressBar, signatureView, incodeTextView, incodeTextView2, incodeTextView3);
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
        return this.f6804h;
    }
}
