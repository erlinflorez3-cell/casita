package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f7396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f7397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f7398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f7399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f7400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IncodeTextView f7401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f7402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f7403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f7404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IncodeTextView f7405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LinearLayout f7406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ConstraintLayout f7407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinearLayout f7408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IncodeTextView f7409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f7410o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private IncodeTextView f7411q;

    private x(ConstraintLayout constraintLayout, LinearLayout linearLayout, IncodeButton incodeButton, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, LinearLayout linearLayout4, FrameLayout frameLayout, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4) {
        this.f7407l = constraintLayout;
        this.f7398c = linearLayout;
        this.f7396a = incodeButton;
        this.f7399d = linearLayout2;
        this.f7410o = imageView;
        this.f7408m = linearLayout3;
        this.f7406k = linearLayout4;
        this.f7397b = frameLayout;
        this.f7400e = imageView2;
        this.f7402g = imageView3;
        this.f7403h = imageView4;
        this.f7404i = imageView5;
        this.f7401f = incodeTextView;
        this.f7405j = incodeTextView2;
        this.f7409n = incodeTextView3;
        this.f7411q = incodeTextView4;
    }

    public final ConstraintLayout d() {
        return this.f7407l;
    }

    public static x d(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_referred_to_executive, (ViewGroup) null, false);
        int i2 = R.id.backIdStatusContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (linearLayout != null) {
            i2 = R.id.btnContinue;
            IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton != null) {
                i2 = R.id.frontIdStatusContainer;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                if (linearLayout2 != null) {
                    i2 = R.id.ivTitleIcon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (imageView != null) {
                        i2 = R.id.layoutHeader;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                        if (linearLayout3 != null) {
                            i2 = R.id.layoutTitleContainer;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                            if (linearLayout4 != null) {
                                i2 = R.id.previewContainer;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                if (frameLayout != null) {
                                    i2 = R.id.previewIdBack;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (imageView2 != null) {
                                        i2 = R.id.previewIdFront;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (imageView3 != null) {
                                            i2 = R.id.totalFailureBackIdStatusIcon;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (imageView4 != null) {
                                                i2 = R.id.totalFailureFrontIdStatusIcon;
                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (imageView5 != null) {
                                                    i2 = R.id.tvTotalFailureBackIdStatus;
                                                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (incodeTextView != null) {
                                                        i2 = R.id.tvTotalFailureFrontIdStatus;
                                                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (incodeTextView2 != null) {
                                                            i2 = R.id.txtUploadFailedDesc;
                                                            IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (incodeTextView3 != null) {
                                                                i2 = R.id.txtUploadFailedSubtitle;
                                                                IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                if (incodeTextView4 != null) {
                                                                    return new x((ConstraintLayout) viewInflate, linearLayout, incodeButton, linearLayout2, imageView, linearLayout3, linearLayout4, frameLayout, imageView2, imageView3, imageView4, imageView5, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7407l;
    }
}
