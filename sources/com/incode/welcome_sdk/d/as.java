package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class as implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f6942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f6943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f6944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeButton f6945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f6946e;

    private as(LinearLayout linearLayout, IncodeButton incodeButton, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3) {
        this.f6942a = linearLayout;
        this.f6945d = incodeButton;
        this.f6943b = incodeTextView;
        this.f6946e = incodeTextView2;
        this.f6944c = incodeTextView3;
    }

    public final LinearLayout b() {
        return this.f6942a;
    }

    public static as e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_dialog_recog_data, viewGroup, false);
        int i2 = R.id.btnOk;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.txtBlurriness;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView != null) {
                i2 = R.id.txtBrightness;
                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeTextView2 != null) {
                    i2 = R.id.txtSpoofConfidence;
                    IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView3 != null) {
                        return new as((LinearLayout) viewInflate, incodeButton, incodeTextView, incodeTextView2, incodeTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6942a;
    }
}
