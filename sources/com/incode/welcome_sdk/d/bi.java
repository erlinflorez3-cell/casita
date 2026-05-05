package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ui.results.common.PropertyViewBold;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bi implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PropertyViewBold f7095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NestedScrollView f7096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f7097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PropertyViewBold f7098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f7099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IncodeTextView f7100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinearLayout f7101g;

    private bi(NestedScrollView nestedScrollView, LinearLayout linearLayout, ImageView imageView, PropertyViewBold propertyViewBold, PropertyViewBold propertyViewBold2, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f7096b = nestedScrollView;
        this.f7101g = linearLayout;
        this.f7097c = imageView;
        this.f7098d = propertyViewBold;
        this.f7095a = propertyViewBold2;
        this.f7100f = incodeTextView;
        this.f7099e = incodeTextView2;
    }

    public final NestedScrollView c() {
        return this.f7096b;
    }

    public static bi b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_results_fragment_liveness_check, viewGroup, false);
        int i2 = R.id.containerLivenessCheckResults;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (linearLayout != null) {
            i2 = R.id.ivOverallStatus;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView != null) {
                i2 = R.id.pvLivenessScore;
                PropertyViewBold propertyViewBold = (PropertyViewBold) ViewBindings.findChildViewById(viewInflate, i2);
                if (propertyViewBold != null) {
                    i2 = R.id.pvPhotoQuality;
                    PropertyViewBold propertyViewBold2 = (PropertyViewBold) ViewBindings.findChildViewById(viewInflate, i2);
                    if (propertyViewBold2 != null) {
                        i2 = R.id.title;
                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView != null) {
                            i2 = R.id.tvOverallStatus;
                            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView2 != null) {
                                return new bi((NestedScrollView) viewInflate, linearLayout, imageView, propertyViewBold, propertyViewBold2, incodeTextView, incodeTextView2);
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
        return this.f7096b;
    }
}
