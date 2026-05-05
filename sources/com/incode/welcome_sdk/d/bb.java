package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;

/* JADX INFO: loaded from: classes5.dex */
public final class bb implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f6998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f6999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f7000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeButton f7001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f7002e;

    private bb(ConstraintLayout constraintLayout, IncodeButton incodeButton, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, LinearLayout linearLayout) {
        this.f7002e = constraintLayout;
        this.f7001d = incodeButton;
        this.f7000c = constraintLayout2;
        this.f6999b = constraintLayout3;
        this.f6998a = linearLayout;
    }

    public final ConstraintLayout a() {
        return this.f7002e;
    }

    public static bb c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_video_upload, viewGroup, false);
        int i2 = R.id.btnTryAgain;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.containerFailure;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
            if (constraintLayout != null) {
                i2 = R.id.containerNetworkError;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                if (constraintLayout2 != null) {
                    i2 = R.id.containerUploading;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                    if (linearLayout != null) {
                        return new bb((ConstraintLayout) viewInflate, incodeButton, constraintLayout, constraintLayout2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7002e;
    }
}
