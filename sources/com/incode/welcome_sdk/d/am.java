package com.incode.welcome_sdk.d;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeDividerView;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class am implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeTextView f6886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeButton f6887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f6888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f6889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f6890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConstraintLayout f6891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IncodeDividerView f6892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IncodeTextView f6893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IncodeDividerView f6894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IncodeTextView f6895j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IncodeTextView f6896l;

    private am(ConstraintLayout constraintLayout, IncodeTextView incodeTextView, ConstraintLayout constraintLayout2, IncodeButton incodeButton, IncodeTextView incodeTextView2, IncodeDividerView incodeDividerView, IncodeDividerView incodeDividerView2, ImageView imageView, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5) {
        this.f6891f = constraintLayout;
        this.f6890e = incodeTextView;
        this.f6888c = constraintLayout2;
        this.f6887b = incodeButton;
        this.f6886a = incodeTextView2;
        this.f6892g = incodeDividerView;
        this.f6894i = incodeDividerView2;
        this.f6889d = imageView;
        this.f6895j = incodeTextView3;
        this.f6893h = incodeTextView4;
        this.f6896l = incodeTextView5;
    }

    public static am b(View view) {
        int i2 = R.id.aesUploadAddDocTv;
        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
        if (incodeTextView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i2 = R.id.aesUploadContinueBtn;
            IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(view, i2);
            if (incodeButton != null) {
                i2 = R.id.aesUploadContractNameTv;
                IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                if (incodeTextView2 != null) {
                    i2 = R.id.aesUploadDivider1;
                    IncodeDividerView incodeDividerView = (IncodeDividerView) ViewBindings.findChildViewById(view, i2);
                    if (incodeDividerView != null) {
                        i2 = R.id.aesUploadDivider2;
                        IncodeDividerView incodeDividerView2 = (IncodeDividerView) ViewBindings.findChildViewById(view, i2);
                        if (incodeDividerView2 != null) {
                            i2 = R.id.aesUploadDocumentIcon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
                            if (imageView != null) {
                                i2 = R.id.aesUploadRemoveDocTv;
                                IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                if (incodeTextView3 != null) {
                                    i2 = R.id.aesUploadSubtitle;
                                    IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                    if (incodeTextView4 != null) {
                                        i2 = R.id.aesUploadTitle;
                                        IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(view, i2);
                                        if (incodeTextView5 != null) {
                                            return new am(constraintLayout, incodeTextView, constraintLayout, incodeButton, incodeTextView2, incodeDividerView, incodeDividerView2, imageView, incodeTextView3, incodeTextView4, incodeTextView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6891f;
    }
}
