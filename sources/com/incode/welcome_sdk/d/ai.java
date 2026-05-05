package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView;
import com.incode.welcome_sdk.views.IncodeButton;

/* JADX INFO: loaded from: classes5.dex */
public final class ai implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final IncodeButton f6863a;

    /* JADX INFO: renamed from: b */
    private final ConstraintLayout f6864b;

    /* JADX INFO: renamed from: c */
    public final ViewPager f6865c;

    /* JADX INFO: renamed from: d */
    public final IncodeButton f6866d;

    /* JADX INFO: renamed from: e */
    private Guideline f6867e;

    /* JADX INFO: renamed from: g */
    private ImageView f6868g;

    /* JADX INFO: renamed from: h */
    private PageIndicatorView f6869h;

    private ai(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeButton incodeButton2, Guideline guideline, ImageView imageView, PageIndicatorView pageIndicatorView, ViewPager viewPager) {
        this.f6864b = constraintLayout;
        this.f6866d = incodeButton;
        this.f6863a = incodeButton2;
        this.f6867e = guideline;
        this.f6868g = imageView;
        this.f6869h = pageIndicatorView;
        this.f6865c = viewPager;
    }

    public final ConstraintLayout d() {
        return this.f6864b;
    }

    public static ai c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_tutorial_passport, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.btnSkip;
            IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton2 != null) {
                i2 = R.id.buttonsGuideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                if (guideline != null) {
                    i2 = R.id.ivLogoTop;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (imageView != null) {
                        i2 = R.id.pageIndicatorView;
                        PageIndicatorView pageIndicatorView = (PageIndicatorView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (pageIndicatorView != null) {
                            i2 = R.id.viewPager;
                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, i2);
                            if (viewPager != null) {
                                return new ai((ConstraintLayout) viewInflate, incodeButton, incodeButton2, guideline, imageView, pageIndicatorView, viewPager);
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
        return this.f6864b;
    }
}
