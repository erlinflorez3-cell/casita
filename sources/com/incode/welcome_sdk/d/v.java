package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.RoundedCornersFixedWidthSquareImage;
import com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout;
import com.incode.welcome_sdk.ui.results.common.TextViewName;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f7372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeButton f7373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f7374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeButton f7375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoordinatorLayout f7376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PersistentIconsTabLayout f7377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f7378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IncodeTextView f7379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextViewName f7380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewPager f7381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f7382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ProgressBar f7383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AppBarLayout f7384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IncodeTextView f7385n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final FrameLayout f7386o;

    private v(FrameLayout frameLayout, AppBarLayout appBarLayout, IncodeButton incodeButton, IncodeButton incodeButton2, FrameLayout frameLayout2, CoordinatorLayout coordinatorLayout, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage, ImageView imageView, ProgressBar progressBar, LinearLayout linearLayout, PersistentIconsTabLayout persistentIconsTabLayout, TextViewName textViewName, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, ViewPager viewPager) {
        this.f7386o = frameLayout;
        this.f7384m = appBarLayout;
        this.f7373b = incodeButton;
        this.f7375d = incodeButton2;
        this.f7382k = frameLayout2;
        this.f7376e = coordinatorLayout;
        this.f7374c = roundedCornersFixedWidthSquareImage;
        this.f7372a = imageView;
        this.f7383l = progressBar;
        this.f7378g = linearLayout;
        this.f7377f = persistentIconsTabLayout;
        this.f7380i = textViewName;
        this.f7385n = incodeTextView;
        this.f7379h = incodeTextView2;
        this.f7381j = viewPager;
    }

    public final FrameLayout c() {
        return this.f7386o;
    }

    public static v c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_results, (ViewGroup) null, false);
        int i2 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (appBarLayout != null) {
            i2 = R.id.btnDone;
            IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton != null) {
                i2 = R.id.btnReport;
                IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeButton2 != null) {
                    i2 = R.id.containerAvatar;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
                    if (frameLayout != null) {
                        i2 = R.id.coordinatorLayout;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(viewInflate, i2);
                        if (coordinatorLayout != null) {
                            i2 = R.id.ivAvatar;
                            RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
                            if (roundedCornersFixedWidthSquareImage != null) {
                                i2 = R.id.ivAvatarStatus;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (imageView != null) {
                                    i2 = R.id.pb_preparing;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (progressBar != null) {
                                        i2 = R.id.progressContainer;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (linearLayout != null) {
                                            i2 = R.id.tabLayout;
                                            PersistentIconsTabLayout persistentIconsTabLayout = (PersistentIconsTabLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (persistentIconsTabLayout != null) {
                                                i2 = R.id.tvName;
                                                TextViewName textViewName = (TextViewName) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (textViewName != null) {
                                                    i2 = R.id.tv_progress;
                                                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (incodeTextView != null) {
                                                        i2 = R.id.tvScore;
                                                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (incodeTextView2 != null) {
                                                            i2 = R.id.viewPager;
                                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (viewPager != null) {
                                                                return new v((FrameLayout) viewInflate, appBarLayout, incodeButton, incodeButton2, frameLayout, coordinatorLayout, roundedCornersFixedWidthSquareImage, imageView, progressBar, linearLayout, persistentIconsTabLayout, textViewName, incodeTextView, incodeTextView2, viewPager);
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
        return this.f7386o;
    }
}
