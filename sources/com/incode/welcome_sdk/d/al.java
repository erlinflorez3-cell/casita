package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeImageView;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class al implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f6879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f6880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeImageView f6881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f6882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f6883e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConstraintLayout f6884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private FrameLayout f6885i;

    private al(ConstraintLayout constraintLayout, FrameLayout frameLayout, IncodeImageView incodeImageView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, IncodeTextView incodeTextView) {
        this.f6884h = constraintLayout;
        this.f6885i = frameLayout;
        this.f6881c = incodeImageView;
        this.f6879a = linearLayout;
        this.f6883e = constraintLayout2;
        this.f6882d = recyclerView;
        this.f6880b = incodeTextView;
    }

    public final ConstraintLayout d() {
        return this.f6884h;
    }

    public static al e(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_video_selfie, (ViewGroup) null, false);
        int i2 = R.id.fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (frameLayout != null) {
            i2 = R.id.ivFeedbackIcon;
            IncodeImageView incodeImageView = (IncodeImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeImageView != null) {
                i2 = R.id.layoutUploadSuccess;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                if (linearLayout != null) {
                    i2 = R.id.layoutVideoSelfieProgress;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                    if (constraintLayout != null) {
                        i2 = R.id.rvProgressBar;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (recyclerView != null) {
                            i2 = R.id.tvFeedbackCenter;
                            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView != null) {
                                return new al((ConstraintLayout) viewInflate, frameLayout, incodeImageView, linearLayout, constraintLayout, recyclerView, incodeTextView);
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
        return this.f6884h;
    }
}
