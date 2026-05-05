package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.IncodeLottieAnimationView;
import com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ad implements ViewBinding {
    public final IncodeTextView A;
    private LinearLayout B;
    private final ConstraintLayout C;
    public final IncodeTextView D;
    private FrameLayout E;
    private IncodeTextView F;
    private ConstraintLayout G;
    private View H;
    private ImageView I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f6807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeButton f6808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f6809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeTextView f6810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f6811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f6812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OverlayWithHoleImageView f6813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f6814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f6815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f6816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f6817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f6818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f6819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f6820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f6821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f6822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final IncodeTextView f6823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f6824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f6825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Guideline f6826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final IncodeLottieAnimationView f6827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final IncodeTextView f6828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ProgressBar f6829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final IncodeTextView f6830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final IncodeTextView f6831y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final IncodeTextView f6832z;

    private ad(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, IncodeButton incodeButton, IncodeButton incodeButton2, ConstraintLayout constraintLayout2, View view, IncodeTextView incodeTextView, FrameLayout frameLayout, ImageView imageView, OverlayWithHoleImageView overlayWithHoleImageView, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageView imageView12, IncodeTextView incodeTextView2, Guideline guideline, ProgressBar progressBar, IncodeLottieAnimationView incodeLottieAnimationView, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5, IncodeTextView incodeTextView6, IncodeTextView incodeTextView7, IncodeTextView incodeTextView8, IncodeTextView incodeTextView9) {
        this.C = constraintLayout;
        this.B = linearLayout;
        this.f6809c = linearLayout2;
        this.f6808b = incodeButton;
        this.f6811e = incodeButton2;
        this.G = constraintLayout2;
        this.H = view;
        this.f6810d = incodeTextView;
        this.E = frameLayout;
        this.f6807a = imageView;
        this.f6813g = overlayWithHoleImageView;
        this.f6815i = constraintLayout3;
        this.f6812f = constraintLayout4;
        this.f6816j = imageView2;
        this.I = imageView3;
        this.f6814h = imageView4;
        this.f6820n = imageView5;
        this.f6817k = imageView6;
        this.f6818l = imageView7;
        this.f6819m = imageView8;
        this.f6821o = imageView9;
        this.f6822p = imageView10;
        this.f6825s = imageView11;
        this.f6824r = imageView12;
        this.f6823q = incodeTextView2;
        this.f6826t = guideline;
        this.f6829w = progressBar;
        this.f6827u = incodeLottieAnimationView;
        this.f6830x = incodeTextView3;
        this.f6831y = incodeTextView4;
        this.f6828v = incodeTextView5;
        this.D = incodeTextView6;
        this.f6832z = incodeTextView7;
        this.F = incodeTextView8;
        this.A = incodeTextView9;
    }

    public final ConstraintLayout c() {
        return this.C;
    }

    public static ad c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_selfie_circle_camera_v1, (ViewGroup) null, false);
        int i2 = R.id.bgSpoofWarning;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (linearLayout != null) {
            i2 = R.id.bottomContainer;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
            if (linearLayout2 != null) {
                i2 = R.id.btnShutter;
                IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeButton != null) {
                    i2 = R.id.btnTryAgain;
                    IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeButton2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i2 = R.id.camera_lid_background;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, i2);
                        if (viewFindChildViewById != null) {
                            i2 = R.id.camera_lid_text;
                            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeTextView != null) {
                                i2 = R.id.camera_preview;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                if (frameLayout != null) {
                                    i2 = R.id.circleMainAnchor;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (imageView != null) {
                                        i2 = R.id.circularCameraOverlay;
                                        OverlayWithHoleImageView overlayWithHoleImageView = (OverlayWithHoleImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (overlayWithHoleImageView != null) {
                                            i2 = R.id.errorFeedbackView;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (constraintLayout2 != null) {
                                                i2 = R.id.errorFeedbackViewContent;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (constraintLayout3 != null) {
                                                    i2 = R.id.ivBaseGrayCircleCameraOutline;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (imageView2 != null) {
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.ivDetectingCameraOutline);
                                                        i2 = R.id.ivFailCameraOutline;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (imageView4 != null) {
                                                            i2 = R.id.ivGetReadyCameraOutline;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (imageView5 != null) {
                                                                i2 = R.id.ivGrayCircleCameraOutline;
                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                if (imageView6 != null) {
                                                                    i2 = R.id.ivLogoTop;
                                                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                    if (imageView7 != null) {
                                                                        i2 = R.id.ivOvalFaceFrame;
                                                                        ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                        if (imageView8 != null) {
                                                                            i2 = R.id.ivOvalFaceFrameDarkOverlay;
                                                                            ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                            if (imageView9 != null) {
                                                                                i2 = R.id.ivSelfieLogoTop;
                                                                                ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                if (imageView10 != null) {
                                                                                    i2 = R.id.ivSuccessCameraOutline;
                                                                                    ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                    if (imageView11 != null) {
                                                                                        i2 = R.id.ivTitleIcon;
                                                                                        ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                        if (imageView12 != null) {
                                                                                            i2 = R.id.manualCaptureInstructions;
                                                                                            IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                            if (incodeTextView2 != null) {
                                                                                                i2 = R.id.onboard_sdk_guideline;
                                                                                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                if (guideline != null) {
                                                                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.progressBar);
                                                                                                    i2 = R.id.tutorialAnimationView;
                                                                                                    IncodeLottieAnimationView incodeLottieAnimationView = (IncodeLottieAnimationView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                    if (incodeLottieAnimationView != null) {
                                                                                                        i2 = R.id.tvAttemptsRemaining;
                                                                                                        IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                        if (incodeTextView3 != null) {
                                                                                                            i2 = R.id.tvCustom;
                                                                                                            IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                            if (incodeTextView4 != null) {
                                                                                                                i2 = R.id.tvFeedback;
                                                                                                                IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                                if (incodeTextView5 != null) {
                                                                                                                    i2 = R.id.tvScanFailedHint;
                                                                                                                    IncodeTextView incodeTextView6 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                                    if (incodeTextView6 != null) {
                                                                                                                        i2 = R.id.tvScanFailedTitle;
                                                                                                                        IncodeTextView incodeTextView7 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                                        if (incodeTextView7 != null) {
                                                                                                                            i2 = R.id.txtSpoofWarning;
                                                                                                                            IncodeTextView incodeTextView8 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                                            if (incodeTextView8 != null) {
                                                                                                                                i2 = R.id.txtTopMessage;
                                                                                                                                IncodeTextView incodeTextView9 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                                                if (incodeTextView9 != null) {
                                                                                                                                    return new ad(constraintLayout, linearLayout, linearLayout2, incodeButton, incodeButton2, constraintLayout, viewFindChildViewById, incodeTextView, frameLayout, imageView, overlayWithHoleImageView, constraintLayout2, constraintLayout3, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, incodeTextView2, guideline, progressBar, incodeLottieAnimationView, incodeTextView3, incodeTextView4, incodeTextView5, incodeTextView6, incodeTextView7, incodeTextView8, incodeTextView9);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.C;
    }
}
