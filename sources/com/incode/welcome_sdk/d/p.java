package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f7311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f7312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f7313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckBox f7314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f7315e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScrollView f7316g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f7317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f7318j;

    private p(ConstraintLayout constraintLayout, IncodeButton incodeButton, CheckBox checkBox, View view, View view2, ScrollView scrollView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f7315e = constraintLayout;
        this.f7311a = incodeButton;
        this.f7314d = checkBox;
        this.f7318j = view;
        this.f7317i = view2;
        this.f7316g = scrollView;
        this.f7312b = incodeTextView;
        this.f7313c = incodeTextView2;
    }

    public final ConstraintLayout e() {
        return this.f7315e;
    }

    public static p d(LayoutInflater layoutInflater) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_machine_learning_consent, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.checkBoxSign;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewInflate, i2);
            if (checkBox != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.dividerBottom))) != null) {
                i2 = R.id.scrollContent;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, i2);
                if (scrollView != null) {
                    i2 = R.id.textViewConsent;
                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView != null) {
                        i2 = R.id.textViewTitle;
                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView2 != null) {
                            return new p((ConstraintLayout) viewInflate, incodeButton, checkBox, viewFindChildViewById, viewFindChildViewById2, scrollView, incodeTextView, incodeTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7315e;
    }
}
