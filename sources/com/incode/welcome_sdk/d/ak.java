package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeDividerView;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ak implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f6874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IncodeDividerView f6875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConstraintLayout f6876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeTextView f6877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f6878e;

    private ak(ConstraintLayout constraintLayout, IncodeDividerView incodeDividerView, ImageView imageView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f6876c = constraintLayout;
        this.f6875b = incodeDividerView;
        this.f6874a = imageView;
        this.f6877d = incodeTextView;
        this.f6878e = incodeTextView2;
    }

    public final ConstraintLayout e() {
        return this.f6876c;
    }

    public static ak e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_aes_docs_rv_item, viewGroup, false);
        int i2 = R.id.dividerBottom;
        IncodeDividerView incodeDividerView = (IncodeDividerView) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeDividerView != null) {
            i2 = R.id.ivDocumentIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView != null) {
                i2 = R.id.tvContractName;
                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeTextView != null) {
                    i2 = R.id.tvViewDoc;
                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeTextView2 != null) {
                        return new ak((ConstraintLayout) viewInflate, incodeDividerView, imageView, incodeTextView, incodeTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6876c;
    }
}
