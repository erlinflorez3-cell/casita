package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Group f7265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Group f7266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f7267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f7268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f7269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f7270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConstraintLayout f7271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IncodeTextView f7272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IncodeTextView f7273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IncodeTextView f7274j;

    private m(ConstraintLayout constraintLayout, IncodeButton incodeButton, ImageView imageView, ImageView imageView2, Group group, Group group2, ProgressBar progressBar, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3) {
        this.f7271g = constraintLayout;
        this.f7269e = incodeButton;
        this.f7267c = imageView;
        this.f7270f = imageView2;
        this.f7266b = group;
        this.f7265a = group2;
        this.f7268d = progressBar;
        this.f7274j = incodeTextView;
        this.f7273i = incodeTextView2;
        this.f7272h = incodeTextView3;
    }

    public final ConstraintLayout e() {
        return this.f7271g;
    }

    public static m b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_geolocation, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.ivLocation;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageView != null) {
                i2 = R.id.ivLogoTop;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageView2 != null) {
                    i2 = R.id.locationDisabledGroup;
                    Group group = (Group) ViewBindings.findChildViewById(viewInflate, i2);
                    if (group != null) {
                        i2 = R.id.locationEnabledGroup;
                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, i2);
                        if (group2 != null) {
                            i2 = R.id.progressBar;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
                            if (progressBar != null) {
                                i2 = R.id.tvLocationDisabledLabel;
                                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView != null) {
                                    i2 = R.id.tvLocationEnabledLabel;
                                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView2 != null) {
                                        i2 = R.id.tvLocationValue;
                                        IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (incodeTextView3 != null) {
                                            return new m((ConstraintLayout) viewInflate, incodeButton, imageView, imageView2, group, group2, progressBar, incodeTextView, incodeTextView2, incodeTextView3);
                                        }
                                    }
                                }
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
        return this.f7271g;
    }
}
