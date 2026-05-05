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
public final class be implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeTextView f7049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f7050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f7051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IncodeDividerView f7052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f7053e;

    private be(ConstraintLayout constraintLayout, IncodeDividerView incodeDividerView, ImageView imageView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f7053e = constraintLayout;
        this.f7052d = incodeDividerView;
        this.f7051c = imageView;
        this.f7049a = incodeTextView;
        this.f7050b = incodeTextView2;
    }

    public final ConstraintLayout b() {
        return this.f7053e;
    }

    public static be d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_qes_docs_rv_item, viewGroup, false);
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
                        return new be((ConstraintLayout) viewInflate, incodeDividerView, imageView, incodeTextView, incodeTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7053e;
    }
}
