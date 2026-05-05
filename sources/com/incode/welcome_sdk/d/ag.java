package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ag implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f6845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ToggleButton f6846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f6847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeTextView f6848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f6849e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinearLayout f6850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f6851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f6852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ConstraintLayout f6853j;

    private ag(ConstraintLayout constraintLayout, IncodeButton incodeButton, LinearLayout linearLayout, ToggleButton toggleButton, IncodeTextView incodeTextView, View view, View view2, IncodeTextView incodeTextView2, WebView webView) {
        this.f6853j = constraintLayout;
        this.f6849e = incodeButton;
        this.f6850g = linearLayout;
        this.f6846b = toggleButton;
        this.f6848d = incodeTextView;
        this.f6851h = view;
        this.f6852i = view2;
        this.f6847c = incodeTextView2;
        this.f6845a = webView;
    }

    public final ConstraintLayout e() {
        return this.f6853j;
    }

    public static ag a(LayoutInflater layoutInflater) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_user_consent, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.checkBoxConsentWrapper;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
            if (linearLayout != null) {
                i2 = R.id.consent_checkbox;
                ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(viewInflate, i2);
                if (toggleButton != null) {
                    i2 = R.id.consent_text;
                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.dividerBottom))) != null) {
                        i2 = R.id.textViewTitle;
                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView2 != null) {
                            i2 = R.id.webView;
                            WebView webView = (WebView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (webView != null) {
                                return new ag((ConstraintLayout) viewInflate, incodeButton, linearLayout, toggleButton, incodeTextView, viewFindChildViewById, viewFindChildViewById2, incodeTextView2, webView);
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
        return this.f6853j;
    }
}
