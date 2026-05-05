package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeImageView;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class br implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f7149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IncodeImageView f7150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeButton f7151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConstraintLayout f7152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f7153e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IncodeTextView f7154g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IncodeTextView f7155i;

    private br(ConstraintLayout constraintLayout, IncodeButton incodeButton, ConstraintLayout constraintLayout2, IncodeImageView incodeImageView, RecyclerView recyclerView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f7149a = constraintLayout;
        this.f7151c = incodeButton;
        this.f7152d = constraintLayout2;
        this.f7150b = incodeImageView;
        this.f7153e = recyclerView;
        this.f7155i = incodeTextView;
        this.f7154g = incodeTextView2;
    }

    public final ConstraintLayout c() {
        return this.f7149a;
    }

    public static br a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_video_selfie_checks, (ViewGroup) null, false);
        int i2 = R.id.btnStartVideoSelfie;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.buttonContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
            if (constraintLayout != null) {
                i2 = R.id.ivVsChecks;
                IncodeImageView incodeImageView = (IncodeImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeImageView != null) {
                    i2 = R.id.rvVsChecks;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (recyclerView != null) {
                        i2 = R.id.tvVsCheckDescription;
                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView != null) {
                            i2 = R.id.tvVsChecksTitle;
                            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView2 != null) {
                                return new br((ConstraintLayout) viewInflate, incodeButton, constraintLayout, incodeImageView, recyclerView, incodeTextView, incodeTextView2);
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
        return this.f7149a;
    }
}
