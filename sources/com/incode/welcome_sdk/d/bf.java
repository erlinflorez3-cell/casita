package com.incode.welcome_sdk.d;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bf implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f7054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeButton f7056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f7057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f7058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f7059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IncodeTextView f7060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IncodeTextView f7061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f7062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private IncodeTextView f7063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IncodeTextView f7064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IncodeTextView f7065l;

    private bf(View view, IncodeButton incodeButton, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, FrameLayout frameLayout, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5) {
        this.f7054a = view;
        this.f7056c = incodeButton;
        this.f7058e = imageView;
        this.f7055b = imageView2;
        this.f7062i = imageView3;
        this.f7059f = imageView4;
        this.f7057d = frameLayout;
        this.f7061h = incodeTextView;
        this.f7060g = incodeTextView2;
        this.f7063j = incodeTextView3;
        this.f7064k = incodeTextView4;
        this.f7065l = incodeTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f7054a;
    }

    public static bf b(View view) {
        int i2 = R.id.btnHelpQrScanContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(view, i2);
        if (incodeButton != null) {
            i2 = R.id.ivIssue1;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                i2 = R.id.ivIssue2;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i2);
                if (imageView2 != null) {
                    i2 = R.id.ivIssue3;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i2);
                    if (imageView3 != null) {
                        i2 = R.id.ivIssue4;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i2);
                        if (imageView4 != null) {
                            i2 = R.id.qrScanHelp;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i2);
                            if (frameLayout != null) {
                                i2 = R.id.tvCommonIssues;
                                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                if (incodeTextView != null) {
                                    i2 = R.id.tvIssue1;
                                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                    if (incodeTextView2 != null) {
                                        i2 = R.id.tvIssue2;
                                        IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                        if (incodeTextView3 != null) {
                                            i2 = R.id.tvIssue3;
                                            IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                            if (incodeTextView4 != null) {
                                                i2 = R.id.tvIssue4;
                                                IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                                if (incodeTextView5 != null) {
                                                    return new bf(view, incodeButton, imageView, imageView2, imageView3, imageView4, frameLayout, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4, incodeTextView5);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
