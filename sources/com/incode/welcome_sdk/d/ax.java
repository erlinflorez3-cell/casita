package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeEditText;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ax implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeEditText f6974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConstraintLayout f6975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f6976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckBox f6977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f6978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IncodeTextView f6979f;

    private ax(ConstraintLayout constraintLayout, IncodeButton incodeButton, CheckBox checkBox, IncodeEditText incodeEditText, View view, IncodeTextView incodeTextView) {
        this.f6975b = constraintLayout;
        this.f6978e = incodeButton;
        this.f6977d = checkBox;
        this.f6974a = incodeEditText;
        this.f6976c = view;
        this.f6979f = incodeTextView;
    }

    public final ConstraintLayout d() {
        return this.f6975b;
    }

    public static ax b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_input_phone_number, viewGroup, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.checkBoxOptIn;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewInflate, i2);
            if (checkBox != null) {
                i2 = R.id.editTextPhoneNumber;
                IncodeEditText incodeEditText = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeEditText != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.separator))) != null) {
                    i2 = R.id.tvTitle;
                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView != null) {
                        return new ax((ConstraintLayout) viewInflate, incodeButton, checkBox, incodeEditText, viewFindChildViewById, incodeTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6975b;
    }
}
