package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeEditText;
import com.incode.welcome_sdk.views.IncodeSpinner;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class at implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeEditText f6947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeSpinner f6948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeEditText f6949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeButton f6950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeSpinner f6951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IncodeTextView f6952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IncodeEditText f6953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScrollView f6954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IncodeTextView f6955i;

    private at(ScrollView scrollView, IncodeButton incodeButton, IncodeSpinner incodeSpinner, IncodeSpinner incodeSpinner2, IncodeEditText incodeEditText, IncodeEditText incodeEditText2, IncodeEditText incodeEditText3, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f6954h = scrollView;
        this.f6950d = incodeButton;
        this.f6948b = incodeSpinner;
        this.f6951e = incodeSpinner2;
        this.f6947a = incodeEditText;
        this.f6949c = incodeEditText2;
        this.f6953g = incodeEditText3;
        this.f6955i = incodeTextView;
        this.f6952f = incodeTextView2;
    }

    public final ScrollView a() {
        return this.f6954h;
    }

    public static at d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_generate_curp, viewGroup, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.dropDownGender;
            IncodeSpinner incodeSpinner = (IncodeSpinner) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeSpinner != null) {
                i2 = R.id.dropDownState;
                IncodeSpinner incodeSpinner2 = (IncodeSpinner) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeSpinner2 != null) {
                    i2 = R.id.editTextFirstLastName;
                    IncodeEditText incodeEditText = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeEditText != null) {
                        i2 = R.id.editTextName;
                        IncodeEditText incodeEditText2 = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeEditText2 != null) {
                            i2 = R.id.editTextSecondLastName;
                            IncodeEditText incodeEditText3 = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeEditText3 != null) {
                                i2 = R.id.textViewBirthDate;
                                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView != null) {
                                    i2 = R.id.tvTitle;
                                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView2 != null) {
                                        return new at((ScrollView) viewInflate, incodeButton, incodeSpinner, incodeSpinner2, incodeEditText, incodeEditText2, incodeEditText3, incodeTextView, incodeTextView2);
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
        return this.f6954h;
    }
}
