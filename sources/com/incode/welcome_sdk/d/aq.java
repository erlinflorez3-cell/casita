package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class aq implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f6929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeButton f6930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f6931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Guideline f6932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f6933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IncodeTextView f6934f;

    private aq(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeButton incodeButton2, Guideline guideline, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f6933e = constraintLayout;
        this.f6930b = incodeButton;
        this.f6929a = incodeButton2;
        this.f6932d = guideline;
        this.f6931c = incodeTextView;
        this.f6934f = incodeTextView2;
    }

    public final ConstraintLayout e() {
        return this.f6933e;
    }

    public static aq c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_dialog_voice_consent, (ViewGroup) null, false);
        int i2 = R.id.btnDone;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.btnTryAgain;
            IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeButton2 != null) {
                i2 = R.id.onboard_sdk_guideline3;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                if (guideline != null) {
                    i2 = R.id.tvVoiceConsentDialogDescription;
                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView != null) {
                        i2 = R.id.tvVoiceConsentDialogTitle;
                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView2 != null) {
                            return new aq((ConstraintLayout) viewInflate, incodeButton, incodeButton2, guideline, incodeTextView, incodeTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6933e;
    }
}
