package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeTextView f7177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeButton f7178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeButton f7179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckBox f7180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f7181e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinearLayout f7182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ScrollView f7183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private IncodeTextView f7184j;

    private d(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeButton incodeButton2, CheckBox checkBox, LinearLayout linearLayout, ScrollView scrollView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f7181e = constraintLayout;
        this.f7179c = incodeButton;
        this.f7178b = incodeButton2;
        this.f7180d = checkBox;
        this.f7182h = linearLayout;
        this.f7183i = scrollView;
        this.f7184j = incodeTextView;
        this.f7177a = incodeTextView2;
    }

    public final ConstraintLayout d() {
        return this.f7181e;
    }

    public static d c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_biometric_consent, (ViewGroup) null, false);
        int i2 = R.id.btnCancel;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.btnContinue;
            IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton2 != null) {
                i2 = R.id.checkBoxSign;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewInflate, i2);
                if (checkBox != null) {
                    i2 = R.id.consentContainer;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                    if (linearLayout != null) {
                        i2 = R.id.scrollContent;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (scrollView != null) {
                            i2 = R.id.textViewDesc;
                            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView != null) {
                                i2 = R.id.textViewTitle;
                                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView2 != null) {
                                    return new d((ConstraintLayout) viewInflate, incodeButton, incodeButton2, checkBox, linearLayout, scrollView, incodeTextView, incodeTextView2);
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
        return this.f7181e;
    }
}
