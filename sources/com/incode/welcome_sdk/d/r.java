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
public final class r implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IncodeTextView f7323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConstraintLayout f7325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeEditText f7326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f7327e;

    private r(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeEditText incodeEditText, View view, IncodeTextView incodeTextView) {
        this.f7325c = constraintLayout;
        this.f7327e = incodeButton;
        this.f7326d = incodeEditText;
        this.f7324b = view;
        this.f7323a = incodeTextView;
    }

    public final ConstraintLayout e() {
        return this.f7325c;
    }

    public static r a(LayoutInflater layoutInflater) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_name, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.etName;
            IncodeEditText incodeEditText = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeEditText != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.separator))) != null) {
                i2 = R.id.tvTitle;
                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeTextView != null) {
                    return new r((ConstraintLayout) viewInflate, incodeButton, incodeEditText, viewFindChildViewById, incodeTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7325c;
    }
}
