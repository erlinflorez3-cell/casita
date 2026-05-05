package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class bq implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f7133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageButton f7134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f7135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageButton f7136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageButton f7137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FrameLayout f7138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f7139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f7140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f7141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IncodeTextView f7142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f7143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private FrameLayout f7144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private FrameLayout f7145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IncodeTextView f7146n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IncodeTextView f7147o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private IncodeTextView f7148s;

    private bq(FrameLayout frameLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, FrameLayout frameLayout2, FrameLayout frameLayout3, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, FrameLayout frameLayout4, IncodeTextView incodeTextView3, ImageView imageView, FrameLayout frameLayout5, ConstraintLayout constraintLayout, FrameLayout frameLayout6, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5) {
        this.f7138f = frameLayout;
        this.f7136d = imageButton;
        this.f7134b = imageButton2;
        this.f7137e = imageButton3;
        this.f7144l = frameLayout2;
        this.f7143k = frameLayout3;
        this.f7147o = incodeTextView;
        this.f7146n = incodeTextView2;
        this.f7133a = frameLayout4;
        this.f7135c = incodeTextView3;
        this.f7139g = imageView;
        this.f7145m = frameLayout5;
        this.f7141i = constraintLayout;
        this.f7140h = frameLayout6;
        this.f7148s = incodeTextView4;
        this.f7142j = incodeTextView5;
    }

    public final FrameLayout b() {
        return this.f7138f;
    }

    public static bq d(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_video_conference, (ViewGroup) null, false);
        int i2 = R.id.btnChat;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (imageButton != null) {
            i2 = R.id.btnHangUp;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(viewInflate, i2);
            if (imageButton2 != null) {
                i2 = R.id.btnMute;
                ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageButton3 != null) {
                    i2 = R.id.container_chat_fragment;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
                    if (frameLayout != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                        i2 = R.id.hang_on;
                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView != null) {
                            i2 = R.id.interviewStatus;
                            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView2 != null) {
                                i2 = R.id.interviewerContainer;
                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                if (frameLayout3 != null) {
                                    i2 = R.id.interviewerName;
                                    IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView3 != null) {
                                        i2 = R.id.iv_loader;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (imageView != null) {
                                            i2 = R.id.loader_inside_circle;
                                            FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (frameLayout4 != null) {
                                                i2 = R.id.loading_layout;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (constraintLayout != null) {
                                                    i2 = R.id.myContainer;
                                                    FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (frameLayout5 != null) {
                                                        i2 = R.id.subtitle;
                                                        IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (incodeTextView4 != null) {
                                                            i2 = R.id.txtUnreadChatMessagesNumber;
                                                            IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (incodeTextView5 != null) {
                                                                return new bq(frameLayout2, imageButton, imageButton2, imageButton3, frameLayout, frameLayout2, incodeTextView, incodeTextView2, frameLayout3, incodeTextView3, imageView, frameLayout4, constraintLayout, frameLayout5, incodeTextView4, incodeTextView5);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
        return this.f7138f;
    }
}
