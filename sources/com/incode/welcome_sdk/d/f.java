package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeFormItem;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeFormItem f7188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeFormItem f7189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeButton f7190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeFormItem f7191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f7192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IncodeFormItem f7193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IncodeFormItem f7194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IncodeFormItem f7195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IncodeFormItem f7196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IncodeFormItem f7197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f7198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Group f7199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Group f7200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final IncodeFormItem f7201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Group f7202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Guideline f7203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ProgressBar f7204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Guideline f7205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final IncodeTextView f7206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ConstraintLayout f7207t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ScrollView f7208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Guideline f7209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IncodeTextView f7210x;

    private f(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeButton incodeButton2, IncodeFormItem incodeFormItem, IncodeFormItem incodeFormItem2, IncodeFormItem incodeFormItem3, IncodeFormItem incodeFormItem4, IncodeFormItem incodeFormItem5, IncodeFormItem incodeFormItem6, IncodeFormItem incodeFormItem7, IncodeFormItem incodeFormItem8, Group group, Group group2, Group group3, Guideline guideline, ImageView imageView, Guideline guideline2, ProgressBar progressBar, Guideline guideline3, IncodeFormItem incodeFormItem9, ScrollView scrollView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f7207t = constraintLayout;
        this.f7190c = incodeButton;
        this.f7192e = incodeButton2;
        this.f7191d = incodeFormItem;
        this.f7188a = incodeFormItem2;
        this.f7189b = incodeFormItem3;
        this.f7194g = incodeFormItem4;
        this.f7196i = incodeFormItem5;
        this.f7193f = incodeFormItem6;
        this.f7195h = incodeFormItem7;
        this.f7197j = incodeFormItem8;
        this.f7199l = group;
        this.f7200m = group2;
        this.f7202o = group3;
        this.f7205r = guideline;
        this.f7198k = imageView;
        this.f7203p = guideline2;
        this.f7204q = progressBar;
        this.f7209w = guideline3;
        this.f7201n = incodeFormItem9;
        this.f7208v = scrollView;
        this.f7206s = incodeTextView;
        this.f7210x = incodeTextView2;
    }

    public final ConstraintLayout d() {
        return this.f7207t;
    }

    public static f e(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_ekyb, (ViewGroup) null, false);
        int i2 = R.id.btnConfirm;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.btnRetry;
            IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton2 != null) {
                i2 = R.id.etBusinessAddress2;
                IncodeFormItem incodeFormItem = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeFormItem != null) {
                    i2 = R.id.etBusinessName;
                    IncodeFormItem incodeFormItem2 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeFormItem2 != null) {
                        i2 = R.id.etCity;
                        IncodeFormItem incodeFormItem3 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeFormItem3 != null) {
                            i2 = R.id.etHouseNumber;
                            IncodeFormItem incodeFormItem4 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeFormItem4 != null) {
                                i2 = R.id.etState;
                                IncodeFormItem incodeFormItem5 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeFormItem5 != null) {
                                    i2 = R.id.etStreet;
                                    IncodeFormItem incodeFormItem6 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeFormItem6 != null) {
                                        i2 = R.id.etTaxId;
                                        IncodeFormItem incodeFormItem7 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (incodeFormItem7 != null) {
                                            i2 = R.id.etZipCode;
                                            IncodeFormItem incodeFormItem8 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (incodeFormItem8 != null) {
                                                i2 = R.id.groupForm;
                                                Group group = (Group) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (group != null) {
                                                    i2 = R.id.groupProcessing;
                                                    Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (group2 != null) {
                                                        i2 = R.id.groupResult;
                                                        Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (group3 != null) {
                                                            i2 = R.id.halfHorizontalGuideline;
                                                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (guideline != null) {
                                                                i2 = R.id.ivResult;
                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                if (imageView != null) {
                                                                    i2 = R.id.leftAlignGuideline;
                                                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                                                                    if (guideline2 != null) {
                                                                        i2 = R.id.progressBar;
                                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
                                                                        if (progressBar != null) {
                                                                            i2 = R.id.rightAlignGuideline;
                                                                            Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                                                                            if (guideline3 != null) {
                                                                                i2 = R.id.spinnerCountry;
                                                                                IncodeFormItem incodeFormItem9 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                if (incodeFormItem9 != null) {
                                                                                    i2 = R.id.svForm;
                                                                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                    if (scrollView != null) {
                                                                                        i2 = R.id.tvProcessingResult;
                                                                                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                        if (incodeTextView != null) {
                                                                                            i2 = R.id.tvTitle;
                                                                                            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                            if (incodeTextView2 != null) {
                                                                                                return new f((ConstraintLayout) viewInflate, incodeButton, incodeButton2, incodeFormItem, incodeFormItem2, incodeFormItem3, incodeFormItem4, incodeFormItem5, incodeFormItem6, incodeFormItem7, incodeFormItem8, group, group2, group3, guideline, imageView, guideline2, progressBar, guideline3, incodeFormItem9, scrollView, incodeTextView, incodeTextView2);
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
        return this.f7207t;
    }
}
