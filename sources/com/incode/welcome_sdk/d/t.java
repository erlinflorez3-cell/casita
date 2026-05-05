package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeDividerView;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements ViewBinding {
    private IncodeTextView A;
    private IncodeTextView B;
    private IncodeTextView C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Button f7333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckBox f7334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeButton f7335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f7336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f7337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f7338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f7339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f7340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CheckBox f7341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f7342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IncodeTextView f7343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Guideline f7344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ScrollView f7346n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConstraintLayout f7347o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final am f7348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final IncodeTextView f7349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ConstraintLayout f7350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private LinearLayout f7351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private IncodeDividerView f7352t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f7353u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private IncodeTextView f7354v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ProgressBar f7355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IncodeTextView f7356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ImageView f7357y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private IncodeTextView f7358z;

    private t(ConstraintLayout constraintLayout, Button button, Button button2, IncodeButton incodeButton, IncodeButton incodeButton2, CheckBox checkBox, CheckBox checkBox2, LinearLayout linearLayout, IncodeDividerView incodeDividerView, LinearLayout linearLayout2, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout3, ProgressBar progressBar, RecyclerView recyclerView, ScrollView scrollView, ConstraintLayout constraintLayout3, Guideline guideline, TextView textView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5, IncodeTextView incodeTextView6, IncodeTextView incodeTextView7, IncodeTextView incodeTextView8, am amVar) {
        this.f7350r = constraintLayout;
        this.f7333a = button;
        this.f7336d = button2;
        this.f7335c = incodeButton;
        this.f7337e = incodeButton2;
        this.f7334b = checkBox;
        this.f7341i = checkBox2;
        this.f7351s = linearLayout;
        this.f7352t = incodeDividerView;
        this.f7340h = linearLayout2;
        this.f7338f = constraintLayout2;
        this.f7353u = imageView;
        this.f7357y = imageView2;
        this.f7342j = linearLayout3;
        this.f7355w = progressBar;
        this.f7339g = recyclerView;
        this.f7346n = scrollView;
        this.f7347o = constraintLayout3;
        this.f7344l = guideline;
        this.f7345m = textView;
        this.f7343k = incodeTextView;
        this.f7356x = incodeTextView2;
        this.f7354v = incodeTextView3;
        this.A = incodeTextView4;
        this.B = incodeTextView5;
        this.C = incodeTextView6;
        this.f7358z = incodeTextView7;
        this.f7349q = incodeTextView8;
        this.f7348p = amVar;
    }

    public final ConstraintLayout c() {
        return this.f7350r;
    }

    public static t a(LayoutInflater layoutInflater) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_qes, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, i2);
        if (button != null) {
            i2 = R.id.btnContinueAndFinish;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, i2);
            if (button2 != null) {
                i2 = R.id.btnDownload;
                IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeButton != null) {
                    i2 = R.id.btnFinish;
                    IncodeButton incodeButton2 = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeButton2 != null) {
                        i2 = R.id.checkBoxSignGenerateCert;
                        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewInflate, i2);
                        if (checkBox != null) {
                            i2 = R.id.checkBoxTermsAndConditions;
                            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(viewInflate, i2);
                            if (checkBox2 != null) {
                                i2 = R.id.checkboxLayout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                if (linearLayout != null) {
                                    i2 = R.id.divider;
                                    IncodeDividerView incodeDividerView = (IncodeDividerView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeDividerView != null) {
                                        i2 = R.id.downloadLayout;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (linearLayout2 != null) {
                                            i2 = R.id.fail_layout;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (constraintLayout != null) {
                                                i2 = R.id.imgFail;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (imageView != null) {
                                                    i2 = R.id.imgSuccess;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (imageView2 != null) {
                                                        i2 = R.id.loading_layout;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (linearLayout3 != null) {
                                                            i2 = R.id.progressBar;
                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (progressBar != null) {
                                                                i2 = R.id.rvDocuments;
                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                if (recyclerView != null) {
                                                                    i2 = R.id.signature_layout;
                                                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                    if (scrollView != null) {
                                                                        i2 = R.id.success_layout;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                                        if (constraintLayout2 != null) {
                                                                            i2 = R.id.title_guideline;
                                                                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, i2);
                                                                            if (guideline != null) {
                                                                                i2 = R.id.tvTermsAndConditions;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                if (textView != null) {
                                                                                    i2 = R.id.txtDocumentInfo;
                                                                                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                    if (incodeTextView != null) {
                                                                                        i2 = R.id.txtDownloadDescription;
                                                                                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                        if (incodeTextView2 != null) {
                                                                                            i2 = R.id.txtDownloadTitle;
                                                                                            IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                            if (incodeTextView3 != null) {
                                                                                                i2 = R.id.txtQesConfirmDocumentsListTitle;
                                                                                                IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                if (incodeTextView4 != null) {
                                                                                                    i2 = R.id.txtQesConfirmTitle;
                                                                                                    IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                    if (incodeTextView5 != null) {
                                                                                                        i2 = R.id.txtQesFail;
                                                                                                        IncodeTextView incodeTextView6 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                        if (incodeTextView6 != null) {
                                                                                                            i2 = R.id.txtQesSuccess;
                                                                                                            IncodeTextView incodeTextView7 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                            if (incodeTextView7 != null) {
                                                                                                                i2 = R.id.txtSigning;
                                                                                                                IncodeTextView incodeTextView8 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                                                if (incodeTextView8 != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.upload_layout))) != null) {
                                                                                                                    return new t((ConstraintLayout) viewInflate, button, button2, incodeButton, incodeButton2, checkBox, checkBox2, linearLayout, incodeDividerView, linearLayout2, constraintLayout, imageView, imageView2, linearLayout3, progressBar, recyclerView, scrollView, constraintLayout2, guideline, textView, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4, incodeTextView5, incodeTextView6, incodeTextView7, incodeTextView8, am.b(viewFindChildViewById));
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
        return this.f7350r;
    }
}
