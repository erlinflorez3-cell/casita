package com.incode.welcome_sdk.d;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes5.dex */
public final class ba implements ViewBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinearLayout f6997e;

    private ba(LinearLayout linearLayout) {
        this.f6997e = linearLayout;
    }

    public final LinearLayout e() {
        return this.f6997e;
    }

    public static ba b(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ba((LinearLayout) view);
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6997e;
    }
}
