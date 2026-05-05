package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bg implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f7066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f7067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f7068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f7069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f7070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IncodeTextView f7071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IncodeTextView f7072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IncodeTextView f7073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IncodeTextView f7074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final NestedScrollView f7075j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IncodeTextView f7076l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Guideline f7077n;

    private bg(NestedScrollView nestedScrollView, LinearLayout linearLayout, LinearLayout linearLayout2, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5) {
        this.f7075j = nestedScrollView;
        this.f7067b = linearLayout;
        this.f7066a = linearLayout2;
        this.f7077n = guideline;
        this.f7069d = imageView;
        this.f7068c = imageView2;
        this.f7070e = imageView3;
        this.f7076l = incodeTextView;
        this.f7072g = incodeTextView2;
        this.f7073h = incodeTextView3;
        this.f7071f = incodeTextView4;
        this.f7074i = incodeTextView5;
    }

    public final NestedScrollView c() {
        return this.f7075j;
    }

    public static bg b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_results_fragment_id_verification, viewGroup, false);
        int i2 = R.id.containerIdSpecific;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (linearLayout != null) {
            i2 = R.id.containerPhotoSecurityAndQuality;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
            if (linearLayout2 != null) {
                i2 = R.id.guidelineV50;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                if (guideline != null) {
                    i2 = R.id.ivIdBack;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (imageView != null) {
                        i2 = R.id.ivIdFront;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (imageView2 != null) {
                            i2 = R.id.ivOverallStatus;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (imageView3 != null) {
                                i2 = R.id.title;
                                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView != null) {
                                    i2 = R.id.tvManualCheckNeeded;
                                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView2 != null) {
                                        i2 = R.id.tvOverallStatus;
                                        IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (incodeTextView3 != null) {
                                            i2 = R.id.tvTitleIdSpecific;
                                            IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (incodeTextView4 != null) {
                                                i2 = R.id.tvTitlePhotoSecurityAndQuality;
                                                IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (incodeTextView5 != null) {
                                                    return new bg((NestedScrollView) viewInflate, linearLayout, linearLayout2, guideline, imageView, imageView2, imageView3, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4, incodeTextView5);
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
        return this.f7075j;
    }
}
