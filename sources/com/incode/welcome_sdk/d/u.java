package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.FlashingBorderView;
import com.incode.welcome_sdk.commons.ui.VignetteView;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f7359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f7360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f7361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeButton f7362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f7363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VignetteView f7364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f7365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlashingBorderView f7366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IncodeTextView f7367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f7368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f7369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ConstraintLayout f7370l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f7371o;

    private u(ConstraintLayout constraintLayout, ImageView imageView, IncodeButton incodeButton, IncodeButton incodeButton2, FrameLayout frameLayout, IncodeTextView incodeTextView, FrameLayout frameLayout2, ConstraintLayout constraintLayout2, View view, View view2, IncodeTextView incodeTextView2, VignetteView vignetteView, FlashingBorderView flashingBorderView) {
        this.f7370l = constraintLayout;
        this.f7371o = imageView;
        this.f7359a = incodeButton;
        this.f7362d = incodeButton2;
        this.f7369k = frameLayout;
        this.f7361c = incodeTextView;
        this.f7363e = frameLayout2;
        this.f7360b = constraintLayout2;
        this.f7368j = view;
        this.f7365g = view2;
        this.f7367i = incodeTextView2;
        this.f7364f = vignetteView;
        this.f7366h = flashingBorderView;
    }

    public final ConstraintLayout a() {
        return this.f7370l;
    }

    public static u e(LayoutInflater layoutInflater) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_qr_scan, (ViewGroup) null, false);
        int i2 = R.id.btnClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
        if (imageView != null) {
            i2 = R.id.btnNeedHelp;
            IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton != null) {
                i2 = R.id.btnTryAgain;
                IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeButton2 != null) {
                    i2 = R.id.camera_preview;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
                    if (frameLayout != null) {
                        i2 = R.id.feedbackTopMessage;
                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView != null) {
                            i2 = R.id.modalScreensContainer;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
                            if (frameLayout2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i2 = R.id.scanWindowBackground;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, i2);
                                if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.scanWindowOverlay))) != null) {
                                    i2 = R.id.tvStatus;
                                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView2 != null) {
                                        i2 = R.id.vignette;
                                        VignetteView vignetteView = (VignetteView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (vignetteView != null) {
                                            i2 = R.id.vignetteFlashingBorder;
                                            FlashingBorderView flashingBorderView = (FlashingBorderView) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (flashingBorderView != null) {
                                                return new u(constraintLayout, imageView, incodeButton, incodeButton2, frameLayout, incodeTextView, frameLayout2, constraintLayout, viewFindChildViewById2, viewFindChildViewById, incodeTextView2, vignetteView, flashingBorderView);
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
        return this.f7370l;
    }
}
