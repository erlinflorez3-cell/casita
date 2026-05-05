package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.RoundedCornersFixedWidthSquareImage;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class aa implements ViewBinding {
    private IncodeTextView A;
    private Guideline B;
    private Guideline C;
    private Guideline D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f6766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f6767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f6768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f6769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeTextView f6770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f6771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f6772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Group f6773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IncodeTextView f6774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f6775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IncodeTextView f6776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IncodeTextView f6777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinearLayout f6778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinearLayout f6779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IncodeTextView f6780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final IncodeTextView f6781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f6782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinearLayout f6783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final IncodeTextView f6784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f6785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ConstraintLayout f6786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f6787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Guideline f6788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f6789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final IncodeTextView f6790y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ImageView f6791z;

    private aa(ConstraintLayout constraintLayout, LinearLayout linearLayout, IncodeTextView incodeTextView, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage, ImageView imageView, IncodeTextView incodeTextView2, ConstraintLayout constraintLayout2, Group group, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ImageView imageView2, LinearLayout linearLayout2, IncodeTextView incodeTextView3, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage2, IncodeTextView incodeTextView4, LinearLayout linearLayout3, IncodeTextView incodeTextView5, LinearLayout linearLayout4, IncodeTextView incodeTextView6, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage3, ImageView imageView3, IncodeTextView incodeTextView7, IncodeTextView incodeTextView8, LinearLayout linearLayout5, ImageView imageView4, IncodeTextView incodeTextView9, ImageView imageView5, IncodeTextView incodeTextView10) {
        this.f6786u = constraintLayout;
        this.f6766a = linearLayout;
        this.f6770e = incodeTextView;
        this.f6769d = roundedCornersFixedWidthSquareImage;
        this.f6768c = imageView;
        this.f6767b = incodeTextView2;
        this.f6772g = constraintLayout2;
        this.f6773h = group;
        this.f6788w = guideline;
        this.B = guideline2;
        this.D = guideline3;
        this.C = guideline4;
        this.f6791z = imageView2;
        this.f6771f = linearLayout2;
        this.f6774i = incodeTextView3;
        this.f6775j = roundedCornersFixedWidthSquareImage2;
        this.f6776k = incodeTextView4;
        this.f6779n = linearLayout3;
        this.f6777l = incodeTextView5;
        this.f6778m = linearLayout4;
        this.f6780o = incodeTextView6;
        this.f6785t = roundedCornersFixedWidthSquareImage3;
        this.f6782q = imageView3;
        this.f6781p = incodeTextView7;
        this.f6784s = incodeTextView8;
        this.f6783r = linearLayout5;
        this.f6789x = imageView4;
        this.f6790y = incodeTextView9;
        this.f6787v = imageView5;
        this.A = incodeTextView10;
    }

    public final ConstraintLayout d() {
        return this.f6786u;
    }

    public static aa b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_selfie_result, (ViewGroup) null, false);
        int i2 = R.id.bottomContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
        if (linearLayout != null) {
            i2 = R.id.bottomHeader;
            IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeTextView != null) {
                i2 = R.id.bottomPhoto;
                RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
                if (roundedCornersFixedWidthSquareImage != null) {
                    i2 = R.id.bottomResultMark;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                    if (imageView != null) {
                        i2 = R.id.bottomUnknown;
                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView2 != null) {
                            i2 = R.id.containerMatchingImages;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                            if (constraintLayout != null) {
                                i2 = R.id.containerUserAlreadyExists;
                                Group group = (Group) ViewBindings.findChildViewById(viewInflate, i2);
                                if (group != null) {
                                    i2 = R.id.guidelineH93;
                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (guideline != null) {
                                        i2 = R.id.guidelineV25;
                                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (guideline2 != null) {
                                            i2 = R.id.guidelineV50;
                                            Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (guideline3 != null) {
                                                i2 = R.id.guidelineV75;
                                                Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (guideline4 != null) {
                                                    i2 = R.id.ivLogoTop;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (imageView2 != null) {
                                                        i2 = R.id.leftContainer;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (linearLayout2 != null) {
                                                            i2 = R.id.leftHeader;
                                                            IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (incodeTextView3 != null) {
                                                                i2 = R.id.leftPhoto;
                                                                RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage2 = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
                                                                if (roundedCornersFixedWidthSquareImage2 != null) {
                                                                    i2 = R.id.leftUnknown;
                                                                    IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                    if (incodeTextView4 != null) {
                                                                        i2 = R.id.progressBarContainer;
                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                                        if (linearLayout3 != null) {
                                                                            i2 = R.id.progressText;
                                                                            IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                            if (incodeTextView5 != null) {
                                                                                i2 = R.id.rightContainer;
                                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                if (linearLayout4 != null) {
                                                                                    i2 = R.id.rightHeader;
                                                                                    IncodeTextView incodeTextView6 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                    if (incodeTextView6 != null) {
                                                                                        i2 = R.id.rightPhoto;
                                                                                        RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage3 = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                        if (roundedCornersFixedWidthSquareImage3 != null) {
                                                                                            i2 = R.id.rightResultMark;
                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                            if (imageView3 != null) {
                                                                                                i2 = R.id.rightUnknown;
                                                                                                IncodeTextView incodeTextView7 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                if (incodeTextView7 != null) {
                                                                                                    i2 = R.id.spoofWarning;
                                                                                                    IncodeTextView incodeTextView8 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                    if (incodeTextView8 != null) {
                                                                                                        i2 = R.id.spoofWarningContainer;
                                                                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                        if (linearLayout5 != null) {
                                                                                                            i2 = R.id.submitOnlyState;
                                                                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                            if (imageView4 != null) {
                                                                                                                i2 = R.id.topHeader;
                                                                                                                IncodeTextView incodeTextView9 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                                if (incodeTextView9 != null) {
                                                                                                                    i2 = R.id.userAlreadyExistsBalloon;
                                                                                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                                    if (imageView5 != null) {
                                                                                                                        i2 = R.id.userAlreadyExistsText;
                                                                                                                        IncodeTextView incodeTextView10 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                                        if (incodeTextView10 != null) {
                                                                                                                            return new aa((ConstraintLayout) viewInflate, linearLayout, incodeTextView, roundedCornersFixedWidthSquareImage, imageView, incodeTextView2, constraintLayout, group, guideline, guideline2, guideline3, guideline4, imageView2, linearLayout2, incodeTextView3, roundedCornersFixedWidthSquareImage2, incodeTextView4, linearLayout3, incodeTextView5, linearLayout4, incodeTextView6, roundedCornersFixedWidthSquareImage3, imageView3, incodeTextView7, incodeTextView8, linearLayout5, imageView4, incodeTextView9, imageView5, incodeTextView10);
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
        return this.f6786u;
    }
}
