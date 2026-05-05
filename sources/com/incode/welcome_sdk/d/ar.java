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
public final class ar implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeEditText f6935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f6936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f6937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeButton f6938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f6939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConstraintLayout f6940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IncodeTextView f6941g;

    private ar(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeTextView incodeTextView, IncodeEditText incodeEditText, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4) {
        this.f6940f = constraintLayout;
        this.f6938d = incodeButton;
        this.f6936b = incodeTextView;
        this.f6935a = incodeEditText;
        this.f6939e = incodeTextView2;
        this.f6937c = incodeTextView3;
        this.f6941g = incodeTextView4;
    }

    public final ConstraintLayout c() {
        return this.f6940f;
    }

    public static ar b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_enter_curp, viewGroup, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.btnGenerate;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView != null) {
                i2 = R.id.editTextCurp;
                IncodeEditText incodeEditText = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeEditText != null) {
                    i2 = R.id.tvError;
                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView2 != null) {
                        i2 = R.id.tvNoCurp;
                        IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView3 != null) {
                            i2 = R.id.tvTitle;
                            IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView4 != null) {
                                return new ar((ConstraintLayout) viewInflate, incodeButton, incodeTextView, incodeEditText, incodeTextView2, incodeTextView3, incodeTextView4);
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
        return this.f6940f;
    }
}
