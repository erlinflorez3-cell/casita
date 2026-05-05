package com.incode.welcome_sdk.d;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bk implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IncodeTextView f7105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeButton f7106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConstraintLayout f7107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IncodeTextView f7108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IncodeTextView f7109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IncodeTextView f7110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IncodeTextView f7111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f7112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IncodeTextView f7113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private IncodeTextView f7114j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f7115n;

    private bk(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5, IncodeTextView incodeTextView6, IncodeTextView incodeTextView7, View view, View view2) {
        this.f7107c = constraintLayout;
        this.f7106b = incodeButton;
        this.f7109e = incodeTextView;
        this.f7105a = incodeTextView2;
        this.f7108d = incodeTextView3;
        this.f7111g = incodeTextView4;
        this.f7113i = incodeTextView5;
        this.f7114j = incodeTextView6;
        this.f7110f = incodeTextView7;
        this.f7112h = view;
        this.f7115n = view2;
    }

    public final ConstraintLayout c() {
        return this.f7107c;
    }

    public static bk c(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i2 = R.id.btnTryAgain;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(view, i2);
        if (incodeButton != null) {
            i2 = R.id.containerTextToSpeechFailureLine1;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
            if (incodeTextView != null) {
                i2 = R.id.containerTextToSpeechFailureLine2;
                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                if (incodeTextView2 != null) {
                    i2 = R.id.containerTextToSpeechFailureLine3;
                    IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                    if (incodeTextView3 != null) {
                        i2 = R.id.containerTextToSpeechFailureTitle;
                        IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                        if (incodeTextView4 != null) {
                            i2 = R.id.indicatorNumber1;
                            IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                            if (incodeTextView5 != null) {
                                i2 = R.id.indicatorNumber2;
                                IncodeTextView incodeTextView6 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                if (incodeTextView6 != null) {
                                    i2 = R.id.indicatorNumber3;
                                    IncodeTextView incodeTextView7 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                    if (incodeTextView7 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i2 = R.id.viewConnectorBottom))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i2 = R.id.viewConnectorBottom2))) != null) {
                                        return new bk((ConstraintLayout) view, incodeButton, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4, incodeTextView5, incodeTextView6, incodeTextView7, viewFindChildViewById, viewFindChildViewById2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7107c;
    }
}
