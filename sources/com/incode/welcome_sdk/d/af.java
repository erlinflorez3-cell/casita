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
public final class af implements ViewBinding {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f6838a;

    /* JADX INFO: renamed from: b */
    public final ViewPager f6839b;

    /* JADX INFO: renamed from: c */
    private Guideline f6840c;

    /* JADX INFO: renamed from: d */
    public final IncodeButton f6841d;

    /* JADX INFO: renamed from: e */
    public final IncodeButton f6842e;

    /* JADX INFO: renamed from: h */
    private PageIndicatorView f6843h;

    /* JADX INFO: renamed from: j */
    private ImageView f6844j;

    private af(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeButton incodeButton2, Guideline guideline, ImageView imageView, PageIndicatorView pageIndicatorView, ViewPager viewPager) {
        this.f6838a = constraintLayout;
        this.f6842e = incodeButton;
        this.f6841d = incodeButton2;
        this.f6840c = guideline;
        this.f6844j = imageView;
        this.f6843h = pageIndicatorView;
        this.f6839b = viewPager;
    }

    public final ConstraintLayout b() {
        return this.f6838a;
    }

    public static af c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_tutorial_front, (ViewGroup) null, false);
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
                                return new af((ConstraintLayout) viewInflate, incodeButton, incodeButton2, guideline, imageView, pageIndicatorView, viewPager);
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
        return this.f6838a;
    }
}
