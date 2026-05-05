package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class aj implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeTextView f6870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f6871b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConstraintLayout f6872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f6873e;

    private aj(ConstraintLayout constraintLayout, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3) {
        this.f6872d = constraintLayout;
        this.f6870a = incodeTextView;
        this.f6873e = incodeTextView2;
        this.f6871b = incodeTextView3;
    }

    public final ConstraintLayout a() {
        return this.f6872d;
    }

    public static aj e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_bottom_sheet_select_document_source_options, viewGroup, false);
        int i2 = R.id.btnBrowse;
        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeTextView != null) {
            i2 = R.id.btnPhotoLibrary;
            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView2 != null) {
                i2 = R.id.btnTakePhoto;
                IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeTextView3 != null) {
                    return new aj((ConstraintLayout) viewInflate, incodeTextView, incodeTextView2, incodeTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6872d;
    }
}
