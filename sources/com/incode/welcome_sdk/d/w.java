package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f7387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeButton f7388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f7389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeTextView f7390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f7391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Guideline f7392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConstraintLayout f7393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Guideline f7394h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private IncodeTextView f7395j;

    private w(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeButton incodeButton2, Guideline guideline, Guideline guideline2, ImageView imageView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3) {
        this.f7393g = constraintLayout;
        this.f7388b = incodeButton;
        this.f7387a = incodeButton2;
        this.f7392f = guideline;
        this.f7394h = guideline2;
        this.f7389c = imageView;
        this.f7395j = incodeTextView;
        this.f7391e = incodeTextView2;
        this.f7390d = incodeTextView3;
    }

    public final ConstraintLayout e() {
        return this.f7393g;
    }

    public static w b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_review_photo, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.btnScanAgain;
            IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton2 != null) {
                i2 = R.id.buttonsGuideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                if (guideline != null) {
                    i2 = R.id.guideline2;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                    if (guideline2 != null) {
                        i2 = R.id.imageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (imageView != null) {
                            i2 = R.id.title;
                            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView != null) {
                                i2 = R.id.tvHint1;
                                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView2 != null) {
                                    i2 = R.id.tvHint2;
                                    IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView3 != null) {
                                        return new w((ConstraintLayout) viewInflate, incodeButton, incodeButton2, guideline, guideline2, imageView, incodeTextView, incodeTextView2, incodeTextView3);
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
        return this.f7393g;
    }
}
