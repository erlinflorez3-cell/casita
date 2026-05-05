package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f6993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IncodeTextView f6994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeButton f6995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IncodeTextView f6996d;

    private b(ScrollView scrollView, IncodeButton incodeButton, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f6993a = scrollView;
        this.f6995c = incodeButton;
        this.f6994b = incodeTextView;
        this.f6996d = incodeTextView2;
    }

    public final ScrollView e() {
        return this.f6993a;
    }

    public static b c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_accept_video_selfie, (ViewGroup) null, false);
        int i2 = R.id.btnAccept;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.tvContent;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView != null) {
                i2 = R.id.tvTitle;
                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeTextView2 != null) {
                    return new b((ScrollView) viewInflate, incodeButton, incodeTextView, incodeTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6993a;
    }
}
