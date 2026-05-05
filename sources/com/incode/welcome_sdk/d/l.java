package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FrameLayout f7260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FrameLayout f7262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f7263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FrameLayout f7264e;

    private l(FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, ImageView imageView2, FrameLayout frameLayout3) {
        this.f7262c = frameLayout;
        this.f7261b = imageView;
        this.f7260a = frameLayout2;
        this.f7263d = imageView2;
        this.f7264e = frameLayout3;
    }

    public final FrameLayout b() {
        return this.f7262c;
    }

    public static l b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_fixed_size_camera, (ViewGroup) null, false);
        int i2 = R.id.btnClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
        if (imageView != null) {
            i2 = R.id.camera_preview;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
            if (frameLayout != null) {
                i2 = R.id.ivDocumentOverlay;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageView2 != null) {
                    FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                    return new l(frameLayout2, imageView, frameLayout, imageView2, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f7262c;
    }
}
