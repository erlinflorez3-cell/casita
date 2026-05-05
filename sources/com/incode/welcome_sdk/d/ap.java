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
public final class ap implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f6925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConstraintLayout f6926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IncodeTextView f6927c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeEditText f6928e;

    private ap(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeEditText incodeEditText, IncodeTextView incodeTextView) {
        this.f6926b = constraintLayout;
        this.f6925a = incodeButton;
        this.f6928e = incodeEditText;
        this.f6927c = incodeTextView;
    }

    public final ConstraintLayout b() {
        return this.f6926b;
    }

    public static ap c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_enter_tax_id, viewGroup, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.editTextTaxId;
            IncodeEditText incodeEditText = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeEditText != null) {
                i2 = R.id.tvTitle;
                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeTextView != null) {
                    return new ap((ConstraintLayout) viewInflate, incodeButton, incodeEditText, incodeTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6926b;
    }
}
