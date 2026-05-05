package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ae implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f6833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeButton f6834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f6835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IncodeTextView f6836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f6837e;

    private ae(ConstraintLayout constraintLayout, IncodeButton incodeButton, ImageView imageView, ImageView imageView2, IncodeTextView incodeTextView) {
        this.f6837e = constraintLayout;
        this.f6834b = incodeButton;
        this.f6833a = imageView;
        this.f6835c = imageView2;
        this.f6836d = incodeTextView;
    }

    public final ConstraintLayout d() {
        return this.f6837e;
    }

    public static ae b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_tutorial_document_scan, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.ivImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView != null) {
                i2 = R.id.ivLogoTop;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageView2 != null) {
                    i2 = R.id.tvTitle;
                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView != null) {
                        return new ae((ConstraintLayout) viewInflate, incodeButton, imageView, imageView2, incodeTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6837e;
    }
}
