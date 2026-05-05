package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f7319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IncodeTextView f7320b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConstraintLayout f7321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f7322e;

    private q(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeButton incodeButton2, IncodeTextView incodeTextView) {
        this.f7321d = constraintLayout;
        this.f7322e = incodeButton;
        this.f7319a = incodeButton2;
        this.f7320b = incodeTextView;
    }

    public final ConstraintLayout e() {
        return this.f7321d;
    }

    public static q e(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_idtype_chooser, (ViewGroup) null, false);
        int i2 = R.id.btnID;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.btnPassport;
            IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton2 != null) {
                i2 = R.id.tvTitle;
                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeTextView != null) {
                    return new q((ConstraintLayout) viewInflate, incodeButton, incodeButton2, incodeTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7321d;
    }
}
