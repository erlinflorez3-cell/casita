package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeEditText;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ao implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f6920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IncodeTextView f6921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConstraintLayout f6922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f6923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeEditText f6924e;

    private ao(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeEditText incodeEditText, View view, IncodeTextView incodeTextView) {
        this.f6922c = constraintLayout;
        this.f6920a = incodeButton;
        this.f6924e = incodeEditText;
        this.f6923d = view;
        this.f6921b = incodeTextView;
    }

    public final ConstraintLayout d() {
        return this.f6922c;
    }

    public static ao b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_email_address, viewGroup, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.editTextEmailAddress;
            IncodeEditText incodeEditText = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeEditText != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.separator))) != null) {
                i2 = R.id.tvTitle;
                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeTextView != null) {
                    return new ao((ConstraintLayout) viewInflate, incodeButton, incodeEditText, viewFindChildViewById, incodeTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6922c;
    }
}
