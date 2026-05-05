package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class an implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f6897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScrollView f6898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScrollView f6899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeButton f6900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f6901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f6902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f6903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f6904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IncodeTextView f6905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ImageView f6906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IncodeTextView f6907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IncodeTextView f6908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IncodeTextView f6909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IncodeTextView f6910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IncodeTextView f6911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private IncodeTextView f6912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private IncodeTextView f6913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private IncodeTextView f6914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private IncodeTextView f6915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private IncodeTextView f6916t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private IncodeTextView f6917v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private IncodeTextView f6918w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private IncodeTextView f6919y;

    private an(ScrollView scrollView, IncodeButton incodeButton, ScrollView scrollView2, View view, View view2, View view3, View view4, ImageView imageView, ImageView imageView2, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5, IncodeTextView incodeTextView6, IncodeTextView incodeTextView7, IncodeTextView incodeTextView8, IncodeTextView incodeTextView9, IncodeTextView incodeTextView10, IncodeTextView incodeTextView11, IncodeTextView incodeTextView12, IncodeTextView incodeTextView13, IncodeTextView incodeTextView14) {
        this.f6899c = scrollView;
        this.f6900d = incodeButton;
        this.f6898b = scrollView2;
        this.f6897a = view;
        this.f6901e = view2;
        this.f6903g = view3;
        this.f6902f = view4;
        this.f6906j = imageView;
        this.f6904h = imageView2;
        this.f6905i = incodeTextView;
        this.f6907k = incodeTextView2;
        this.f6910n = incodeTextView3;
        this.f6911o = incodeTextView4;
        this.f6909m = incodeTextView5;
        this.f6908l = incodeTextView6;
        this.f6912p = incodeTextView7;
        this.f6913q = incodeTextView8;
        this.f6915s = incodeTextView9;
        this.f6916t = incodeTextView10;
        this.f6914r = incodeTextView11;
        this.f6918w = incodeTextView12;
        this.f6917v = incodeTextView13;
        this.f6919y = incodeTextView14;
    }

    public final ScrollView c() {
        return this.f6899c;
    }

    public static an c(LayoutInflater layoutInflater) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_audio_permissions_mandatory, (ViewGroup) null, false);
        int i2 = R.id.btnOpenSettings;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            ScrollView scrollView = (ScrollView) viewInflate;
            i2 = R.id.horizontalLine1;
            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, i2);
            if (viewFindChildViewById4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.horizontalLine2))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.horizontalLine3))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.horizontalLine4))) != null) {
                i2 = R.id.imgSettings;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageView != null) {
                    i2 = R.id.imgSwitchToggle;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (imageView2 != null) {
                        i2 = R.id.tvDisclaimer;
                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView != null) {
                            i2 = R.id.tvInstructionsListItem1;
                            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView2 != null) {
                                i2 = R.id.tvInstructionsListItem2;
                                IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView3 != null) {
                                    i2 = R.id.tvInstructionsListItem3;
                                    IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView4 != null) {
                                        i2 = R.id.tvInstructionsListItem4;
                                        IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (incodeTextView5 != null) {
                                            i2 = R.id.tvInstructionsListItem5;
                                            IncodeTextView incodeTextView6 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (incodeTextView6 != null) {
                                                i2 = R.id.tvInstructionsListItemOrderNumber1;
                                                IncodeTextView incodeTextView7 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (incodeTextView7 != null) {
                                                    i2 = R.id.tvInstructionsListItemOrderNumber2;
                                                    IncodeTextView incodeTextView8 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (incodeTextView8 != null) {
                                                        i2 = R.id.tvInstructionsListItemOrderNumber3;
                                                        IncodeTextView incodeTextView9 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (incodeTextView9 != null) {
                                                            i2 = R.id.tvInstructionsListItemOrderNumber4;
                                                            IncodeTextView incodeTextView10 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (incodeTextView10 != null) {
                                                                i2 = R.id.tvInstructionsListItemOrderNumber5;
                                                                IncodeTextView incodeTextView11 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                if (incodeTextView11 != null) {
                                                                    i2 = R.id.tvInstructionsListTitle;
                                                                    IncodeTextView incodeTextView12 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                    if (incodeTextView12 != null) {
                                                                        i2 = R.id.tvSubtitle;
                                                                        IncodeTextView incodeTextView13 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                        if (incodeTextView13 != null) {
                                                                            i2 = R.id.tvTitle;
                                                                            IncodeTextView incodeTextView14 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                            if (incodeTextView14 != null) {
                                                                                return new an(scrollView, incodeButton, scrollView, viewFindChildViewById4, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, imageView, imageView2, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4, incodeTextView5, incodeTextView6, incodeTextView7, incodeTextView8, incodeTextView9, incodeTextView10, incodeTextView11, incodeTextView12, incodeTextView13, incodeTextView14);
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
        return this.f6899c;
    }
}
