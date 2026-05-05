package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.RoundedCornersFixedWidthSquareImage;
import com.incode.welcome_sdk.ui.results.common.PropertyViewBold;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bd implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f7029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f7031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PropertyViewBold f7032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f7033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IncodeTextView f7034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NestedScrollView f7035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IncodeTextView f7036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IncodeTextView f7037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IncodeTextView f7038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LinearLayout f7039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f7040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f7041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f7042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RoundedCornersFixedWidthSquareImage f7043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private IncodeTextView f7044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private IncodeTextView f7045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f7046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f7047s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private IncodeTextView f7048t;

    private bd(NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, View view, View view2, View view3, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage, ImageView imageView, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage2, PropertyViewBold propertyViewBold, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5, IncodeTextView incodeTextView6, IncodeTextView incodeTextView7, View view4, View view5) {
        this.f7035g = nestedScrollView;
        this.f7029a = constraintLayout;
        this.f7031c = linearLayout;
        this.f7039k = linearLayout2;
        this.f7042n = view;
        this.f7041m = view2;
        this.f7040l = view3;
        this.f7043o = roundedCornersFixedWidthSquareImage;
        this.f7030b = imageView;
        this.f7033e = roundedCornersFixedWidthSquareImage2;
        this.f7032d = propertyViewBold;
        this.f7045q = incodeTextView;
        this.f7037i = incodeTextView2;
        this.f7048t = incodeTextView3;
        this.f7038j = incodeTextView4;
        this.f7044p = incodeTextView5;
        this.f7036h = incodeTextView6;
        this.f7034f = incodeTextView7;
        this.f7046r = view4;
        this.f7047s = view5;
    }

    public final NestedScrollView b() {
        return this.f7035g;
    }

    public static bd b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_results_fragment_government_validation, viewGroup, false);
        int i2 = R.id.containerData;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (constraintLayout != null) {
            i2 = R.id.containerOcrValidation;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
            if (linearLayout != null) {
                i2 = R.id.containerRecognitionConfidence;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                if (linearLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.corner1))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.corner2))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.horizontalLine))) != null) {
                    i2 = R.id.ivInePhoto;
                    RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
                    if (roundedCornersFixedWidthSquareImage != null) {
                        i2 = R.id.ivOverallStatus;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (imageView != null) {
                            i2 = R.id.ivSelfie;
                            RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage2 = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
                            if (roundedCornersFixedWidthSquareImage2 != null) {
                                i2 = R.id.pvRecognitionConfidence;
                                PropertyViewBold propertyViewBold = (PropertyViewBold) ViewBindings.findChildViewById(viewInflate, i2);
                                if (propertyViewBold != null) {
                                    i2 = R.id.title;
                                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView != null) {
                                        i2 = R.id.tvError;
                                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (incodeTextView2 != null) {
                                            i2 = R.id.tvLabelInePhoto;
                                            IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (incodeTextView3 != null) {
                                                i2 = R.id.tvLabelMatchingResults;
                                                IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (incodeTextView4 != null) {
                                                    i2 = R.id.tvLabelSelfie;
                                                    IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (incodeTextView5 != null) {
                                                        i2 = R.id.tvOverallStatus;
                                                        IncodeTextView incodeTextView6 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (incodeTextView6 != null) {
                                                            i2 = R.id.tvTitleOcrValidation;
                                                            IncodeTextView incodeTextView7 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (incodeTextView7 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.verticalLine1))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.verticalLine3))) != null) {
                                                                return new bd((NestedScrollView) viewInflate, constraintLayout, linearLayout, linearLayout2, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, roundedCornersFixedWidthSquareImage, imageView, roundedCornersFixedWidthSquareImage2, propertyViewBold, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4, incodeTextView5, incodeTextView6, incodeTextView7, viewFindChildViewById4, viewFindChildViewById5);
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
        return this.f7035g;
    }
}
