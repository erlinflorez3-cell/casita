package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeImageView;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bp implements ViewBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f7129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConstraintLayout f7130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f7131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeImageView f7132e;

    private bp(ConstraintLayout constraintLayout, IncodeImageView incodeImageView, IncodeTextView incodeTextView, View view) {
        this.f7130c = constraintLayout;
        this.f7132e = incodeImageView;
        this.f7129b = incodeTextView;
        this.f7131d = view;
    }

    public final ConstraintLayout b() {
        return this.f7130c;
    }

    public static bp d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_video_selfie_checks_item, viewGroup, false);
        int i2 = R.id.ivVsChecksIcon;
        IncodeImageView incodeImageView = (IncodeImageView) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeImageView != null) {
            i2 = R.id.tvVsChecksItemTitle;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.viewConnectorBottom))) != null) {
                return new bp((ConstraintLayout) viewInflate, incodeImageView, incodeTextView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7130c;
    }
}
