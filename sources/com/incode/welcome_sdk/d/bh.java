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
import com.incode.welcome_sdk.commons.ui.RoundedCornersFixedWidthSquareImage;
import com.incode.welcome_sdk.ui.results.common.PropertyViewBold;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bh implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f7078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PropertyViewBold f7079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f7080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f7081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f7082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IncodeTextView f7083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f7084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final NestedScrollView f7085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IncodeTextView f7086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LinearLayout f7087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IncodeTextView f7088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f7089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IncodeTextView f7090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f7091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IncodeTextView f7092o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f7093r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f7094t;

    private bh(NestedScrollView nestedScrollView, LinearLayout linearLayout, View view, View view2, View view3, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage, ImageView imageView, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage2, PropertyViewBold propertyViewBold, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5, IncodeTextView incodeTextView6, View view4, View view5) {
        this.f7085h = nestedScrollView;
        this.f7087j = linearLayout;
        this.f7084g = view;
        this.f7089l = view2;
        this.f7091n = view3;
        this.f7078a = roundedCornersFixedWidthSquareImage;
        this.f7081d = imageView;
        this.f7080c = roundedCornersFixedWidthSquareImage2;
        this.f7079b = propertyViewBold;
        this.f7088k = incodeTextView;
        this.f7092o = incodeTextView2;
        this.f7082e = incodeTextView3;
        this.f7090m = incodeTextView4;
        this.f7083f = incodeTextView5;
        this.f7086i = incodeTextView6;
        this.f7094t = view4;
        this.f7093r = view5;
    }

    public final NestedScrollView e() {
        return this.f7085h;
    }

    public static bh b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_results_fragment_facial_recognition, viewGroup, false);
        int i2 = R.id.containerFacialRecognitionResults;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.corner1))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.corner2))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.horizontalLine))) != null) {
            i2 = R.id.ivIdPhoto;
            RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
            if (roundedCornersFixedWidthSquareImage != null) {
                i2 = R.id.ivOverallStatus;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageView != null) {
                    i2 = R.id.ivSelfie;
                    RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage2 = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
                    if (roundedCornersFixedWidthSquareImage2 != null) {
                        i2 = R.id.pvUserAlreadyInDatabase;
                        PropertyViewBold propertyViewBold = (PropertyViewBold) ViewBindings.findChildViewById(viewInflate, i2);
                        if (propertyViewBold != null) {
                            i2 = R.id.title;
                            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView != null) {
                                i2 = R.id.tvLabelIdPhoto;
                                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView2 != null) {
                                    i2 = R.id.tvLabelMatchingResults;
                                    IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView3 != null) {
                                        i2 = R.id.tvLabelSelfie;
                                        IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (incodeTextView4 != null) {
                                            i2 = R.id.tvOverallStatus;
                                            IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (incodeTextView5 != null) {
                                                i2 = R.id.txtCardUnknown;
                                                IncodeTextView incodeTextView6 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (incodeTextView6 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.verticalLine1))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.verticalLine2))) != null) {
                                                    return new bh((NestedScrollView) viewInflate, linearLayout, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, roundedCornersFixedWidthSquareImage, imageView, roundedCornersFixedWidthSquareImage2, propertyViewBold, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4, incodeTextView5, incodeTextView6, viewFindChildViewById4, viewFindChildViewById5);
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
        return this.f7085h;
    }
}
