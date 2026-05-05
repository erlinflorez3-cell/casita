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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeDividerView;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Button f7156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckBox f7157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckBox f7158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f7159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckBox f7160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScrollView f7161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f7162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f7163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f7164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RecyclerView f7165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IncodeTextView f7166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IncodeTextView f7167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ConstraintLayout f7168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final IncodeTextView f7169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final am f7170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f7171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ProgressBar f7172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageView f7173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private IncodeTextView f7174s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private IncodeDividerView f7175t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private IncodeTextView f7176u;

    private c(ConstraintLayout constraintLayout, Button button, Button button2, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, IncodeDividerView incodeDividerView, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, ScrollView scrollView, ConstraintLayout constraintLayout3, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3, IncodeTextView incodeTextView4, IncodeTextView incodeTextView5, am amVar) {
        this.f7168m = constraintLayout;
        this.f7156a = button;
        this.f7159d = button2;
        this.f7157b = checkBox;
        this.f7160e = checkBox2;
        this.f7158c = checkBox3;
        this.f7175t = incodeDividerView;
        this.f7162g = constraintLayout2;
        this.f7173r = imageView;
        this.f7171p = imageView2;
        this.f7163h = linearLayout;
        this.f7172q = progressBar;
        this.f7165j = recyclerView;
        this.f7161f = scrollView;
        this.f7164i = constraintLayout3;
        this.f7166k = incodeTextView;
        this.f7169n = incodeTextView2;
        this.f7174s = incodeTextView3;
        this.f7176u = incodeTextView4;
        this.f7167l = incodeTextView5;
        this.f7170o = amVar;
    }

    public final ConstraintLayout a() {
        return this.f7168m;
    }

    public static c e(LayoutInflater layoutInflater) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_aes, (ViewGroup) null, false);
        int i2 = R.id.btnContinue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, i2);
        if (button != null) {
            i2 = R.id.btnContinueAndFinish;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, i2);
            if (button2 != null) {
                i2 = R.id.checkBoxSignGenerateCert;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewInflate, i2);
                if (checkBox != null) {
                    i2 = R.id.checkBoxSignLegalBinding;
                    CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(viewInflate, i2);
                    if (checkBox2 != null) {
                        i2 = R.id.checkBoxTermsAndConditions;
                        CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(viewInflate, i2);
                        if (checkBox3 != null) {
                            i2 = R.id.divider;
                            IncodeDividerView incodeDividerView = (IncodeDividerView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (incodeDividerView != null) {
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
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (linearLayout != null) {
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
                                                                i2 = R.id.txtAesConfirmDocumentsListTitle;
                                                                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                if (incodeTextView != null) {
                                                                    i2 = R.id.txtAesConfirmTitle;
                                                                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                    if (incodeTextView2 != null) {
                                                                        i2 = R.id.txtAesFail;
                                                                        IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                        if (incodeTextView3 != null) {
                                                                            i2 = R.id.txtAesSuccess;
                                                                            IncodeTextView incodeTextView4 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                            if (incodeTextView4 != null) {
                                                                                i2 = R.id.txtSigning;
                                                                                IncodeTextView incodeTextView5 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                if (incodeTextView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.upload_layout))) != null) {
                                                                                    return new c((ConstraintLayout) viewInflate, button, button2, checkBox, checkBox2, checkBox3, incodeDividerView, constraintLayout, imageView, imageView2, linearLayout, progressBar, recyclerView, scrollView, constraintLayout2, incodeTextView, incodeTextView2, incodeTextView3, incodeTextView4, incodeTextView5, am.b(viewFindChildViewById));
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
        return this.f7168m;
    }
}
