package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
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
public final class z implements ViewBinding {
    public final IncodeTextView A;
    public final IncodeTextView B;
    public final IncodeTextView C;
    public final IncodeTextView D;
    private LinearLayout E;
    private ConstraintLayout F;
    private View G;
    private ConstraintLayout H;
    private final ConstraintLayout I;
    private ImageView J;
    private FrameLayout K;
    private IncodeTextView N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f7418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f7419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f7420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeButton f7421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageButton f7422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f7423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f7424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final OverlayWithHoleImageView f7425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f7426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f7427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f7428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f7430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f7431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f7432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f7433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f7434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ba f7435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f7436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f7437t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Guideline f7438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final IncodeTextView f7439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final IncodeLottieAnimationView f7440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ProgressBar f7441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ba f7442y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final IncodeTextView f7443z;

    private z(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, IncodeButton incodeButton, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, View view, IncodeTextView incodeTextView, FrameLayout frameLayout, ImageView imageView, OverlayWithHoleImageView overlayWithHoleImageView, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageView imageView12, ImageView imageView13, ba baVar, ba baVar2, IncodeTextView incodeTextView2, Guideline guideline, ProgressBar progressBar, IncodeLottieAnimationView incodeLottieAnimationView, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5, IncodeTextView incodeTextView6, IncodeTextView incodeTextView7, IncodeTextView incodeTextView8) {
        this.I = constraintLayout;
        this.E = linearLayout;
        this.f7419b = linearLayout2;
        this.f7422e = imageButton;
        this.f7421d = incodeButton;
        this.H = constraintLayout2;
        this.F = constraintLayout3;
        this.G = view;
        this.f7420c = incodeTextView;
        this.K = frameLayout;
        this.f7418a = imageView;
        this.f7425h = overlayWithHoleImageView;
        this.f7424g = constraintLayout4;
        this.f7423f = constraintLayout5;
        this.f7426i = imageView2;
        this.J = imageView3;
        this.f7427j = imageView4;
        this.f7432o = imageView5;
        this.f7430m = imageView6;
        this.f7431n = imageView7;
        this.f7429l = imageView8;
        this.f7428k = imageView9;
        this.f7433p = imageView10;
        this.f7434q = imageView11;
        this.f7436s = imageView12;
        this.f7437t = imageView13;
        this.f7435r = baVar;
        this.f7442y = baVar2;
        this.f7439v = incodeTextView2;
        this.f7438u = guideline;
        this.f7441x = progressBar;
        this.f7440w = incodeLottieAnimationView;
        this.B = incodeTextView3;
        this.C = incodeTextView4;
        this.A = incodeTextView5;
        this.D = incodeTextView6;
        this.f7443z = incodeTextView7;
        this.N = incodeTextView8;
    }

    public final ConstraintLayout c() {
        return this.I;
    }

    public static z e(LayoutInflater layoutInflater) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_selfie_circle_camera, (ViewGroup) null, false);
        int i2 = R.id.bgSpoofWarning;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (linearLayout != null) {
            i2 = R.id.bottomContainer;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
            if (linearLayout2 != null) {
                i2 = R.id.btnShutter;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(viewInflate, i2);
                if (imageButton != null) {
                    i2 = R.id.btnTryAgain;
                    IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeButton != null) {
                        i2 = R.id.buttonContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                        if (constraintLayout != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                            i2 = R.id.camera_lid_background;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, i2);
                            if (viewFindChildViewById2 != null) {
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
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (constraintLayout3 != null) {
                                                    i2 = R.id.errorFeedbackViewContent;
                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (constraintLayout4 != null) {
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
                                                                        i2 = R.id.ivLogoTopV2;
                                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                        if (imageView7 != null) {
                                                                            i2 = R.id.ivLogoTopV2ErrorFeedback;
                                                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                            if (imageView8 != null) {
                                                                                i2 = R.id.ivOvalFaceFrame;
                                                                                ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                if (imageView9 != null) {
                                                                                    i2 = R.id.ivOvalFaceFrameDarkOverlay;
                                                                                    ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                    if (imageView10 != null) {
                                                                                        i2 = R.id.ivSelfieLogoTop;
                                                                                        ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                        if (imageView11 != null) {
                                                                                            i2 = R.id.ivSuccessCameraOutline;
                                                                                            ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                            if (imageView12 != null) {
                                                                                                i2 = R.id.ivTitleIcon;
                                                                                                ImageView imageView13 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                if (imageView13 != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.ivVerifiedByIncode))) != null) {
                                                                                                    ba baVarB = ba.b(viewFindChildViewById);
                                                                                                    i2 = R.id.ivVerifiedByIncodeErrorFeedback;
                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                        ba baVarB2 = ba.b(viewFindChildViewById3);
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
                                                                                                                                            return new z(constraintLayout2, linearLayout, linearLayout2, imageButton, incodeButton, constraintLayout, constraintLayout2, viewFindChildViewById2, incodeTextView, frameLayout, imageView, overlayWithHoleImageView, constraintLayout3, constraintLayout4, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, baVarB, baVarB2, incodeTextView2, guideline, progressBar, incodeLottieAnimationView, incodeTextView3, incodeTextView4, incodeTextView5, incodeTextView6, incodeTextView7, incodeTextView8);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.I;
    }
}
