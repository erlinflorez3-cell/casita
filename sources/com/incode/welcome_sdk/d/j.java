package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeFormItem;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements ViewBinding {
    private IncodeTextView B;
    private IncodeTextView C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f7230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeFormItem f7231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeFormItem f7232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeFormItem f7233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeFormItem f7234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IncodeFormItem f7235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IncodeFormItem f7236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IncodeFormItem f7237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IncodeFormItem f7238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IncodeFormItem f7239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IncodeFormItem f7240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IncodeFormItem f7241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ConstraintLayout f7242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinearLayout f7243n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IncodeFormItem f7244o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ConstraintLayout f7245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final IncodeFormItem f7246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageView f7247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f7248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f7249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ScrollView f7250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LinearLayout f7251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ProgressBar f7252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IncodeTextView f7253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private IncodeTextView f7254y;

    private j(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeFormItem incodeFormItem, IncodeFormItem incodeFormItem2, IncodeFormItem incodeFormItem3, IncodeFormItem incodeFormItem4, IncodeFormItem incodeFormItem5, IncodeFormItem incodeFormItem6, IncodeFormItem incodeFormItem7, IncodeFormItem incodeFormItem8, IncodeFormItem incodeFormItem9, IncodeFormItem incodeFormItem10, IncodeFormItem incodeFormItem11, IncodeFormItem incodeFormItem12, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, IncodeFormItem incodeFormItem13, ProgressBar progressBar, ConstraintLayout constraintLayout3, ScrollView scrollView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4) {
        this.f7245p = constraintLayout;
        this.f7230a = incodeButton;
        this.f7233d = incodeFormItem;
        this.f7232c = incodeFormItem2;
        this.f7231b = incodeFormItem3;
        this.f7234e = incodeFormItem4;
        this.f7237h = incodeFormItem5;
        this.f7238i = incodeFormItem6;
        this.f7235f = incodeFormItem7;
        this.f7239j = incodeFormItem8;
        this.f7236g = incodeFormItem9;
        this.f7244o = incodeFormItem10;
        this.f7241l = incodeFormItem11;
        this.f7240k = incodeFormItem12;
        this.f7242m = constraintLayout2;
        this.f7248s = imageView;
        this.f7247r = imageView2;
        this.f7251v = linearLayout;
        this.f7243n = linearLayout2;
        this.f7246q = incodeFormItem13;
        this.f7252w = progressBar;
        this.f7249t = constraintLayout3;
        this.f7250u = scrollView;
        this.f7253x = incodeTextView;
        this.f7254y = incodeTextView2;
        this.B = incodeTextView3;
        this.C = incodeTextView4;
    }

    public final ConstraintLayout b() {
        return this.f7245p;
    }

    public static j c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_ekyc, (ViewGroup) null, false);
        int i2 = R.id.btnConfirm;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.countrySelector;
            IncodeFormItem incodeFormItem = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeFormItem != null) {
                i2 = R.id.dpDateOfBirth;
                IncodeFormItem incodeFormItem2 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeFormItem2 != null) {
                    i2 = R.id.etCity;
                    IncodeFormItem incodeFormItem3 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeFormItem3 != null) {
                        i2 = R.id.etEmail;
                        IncodeFormItem incodeFormItem4 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeFormItem4 != null) {
                            i2 = R.id.etFirstName;
                            IncodeFormItem incodeFormItem5 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeFormItem5 != null) {
                                i2 = R.id.etHouseNumber;
                                IncodeFormItem incodeFormItem6 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeFormItem6 != null) {
                                    i2 = R.id.etPhone;
                                    IncodeFormItem incodeFormItem7 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeFormItem7 != null) {
                                        i2 = R.id.etPostalCode;
                                        IncodeFormItem incodeFormItem8 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (incodeFormItem8 != null) {
                                            i2 = R.id.etState;
                                            IncodeFormItem incodeFormItem9 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (incodeFormItem9 != null) {
                                                i2 = R.id.etStreet;
                                                IncodeFormItem incodeFormItem10 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (incodeFormItem10 != null) {
                                                    i2 = R.id.etSurname;
                                                    IncodeFormItem incodeFormItem11 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (incodeFormItem11 != null) {
                                                        i2 = R.id.etTaxId;
                                                        IncodeFormItem incodeFormItem12 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (incodeFormItem12 != null) {
                                                            i2 = R.id.fail_layout;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (constraintLayout != null) {
                                                                i2 = R.id.imgFail;
                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                if (imageView != null) {
                                                                    i2 = R.id.imgSuccess;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                    if (imageView2 != null) {
                                                                        i2 = R.id.layoutAddress;
                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                                        if (linearLayout != null) {
                                                                            i2 = R.id.loading_layout;
                                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                                            if (linearLayout2 != null) {
                                                                                i2 = R.id.nationalitySelector;
                                                                                IncodeFormItem incodeFormItem13 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                if (incodeFormItem13 != null) {
                                                                                    i2 = R.id.progressBar;
                                                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                    if (progressBar != null) {
                                                                                        i2 = R.id.success_layout;
                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                        if (constraintLayout2 != null) {
                                                                                            i2 = R.id.svForm;
                                                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                            if (scrollView != null) {
                                                                                                i2 = R.id.tvTitle;
                                                                                                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                if (incodeTextView != null) {
                                                                                                    i2 = R.id.txtEKYCFail;
                                                                                                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                    if (incodeTextView2 != null) {
                                                                                                        i2 = R.id.txtEKYCSuccess;
                                                                                                        IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                        if (incodeTextView3 != null) {
                                                                                                            i2 = R.id.txtSigning;
                                                                                                            IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                            if (incodeTextView4 != null) {
                                                                                                                return new j((ConstraintLayout) viewInflate, incodeButton, incodeFormItem, incodeFormItem2, incodeFormItem3, incodeFormItem4, incodeFormItem5, incodeFormItem6, incodeFormItem7, incodeFormItem8, incodeFormItem9, incodeFormItem10, incodeFormItem11, incodeFormItem12, constraintLayout, imageView, imageView2, linearLayout, linearLayout2, incodeFormItem13, progressBar, constraintLayout2, scrollView, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4);
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
        return this.f7245p;
    }
}
