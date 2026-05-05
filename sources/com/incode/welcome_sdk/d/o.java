package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeFormItem;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeFormItem f7296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeFormItem f7297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeFormItem f7298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeFormItem f7299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeButton f7300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IncodeTextView f7301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Group f7302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Group f7303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f7304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Group f7305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IncodeTextView f7306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private LinearLayout f7307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IncodeTextView f7308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f7309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ProgressBar f7310o;

    private o(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeFormItem incodeFormItem, IncodeFormItem incodeFormItem2, IncodeFormItem incodeFormItem3, IncodeFormItem incodeFormItem4, Group group, Group group2, Group group3, ImageView imageView, LinearLayout linearLayout, ProgressBar progressBar, IncodeTextView incodeTextView, IncodeTextView incodeTextView2, IncodeTextView incodeTextView3) {
        this.f7309n = constraintLayout;
        this.f7300e = incodeButton;
        this.f7298c = incodeFormItem;
        this.f7296a = incodeFormItem2;
        this.f7297b = incodeFormItem3;
        this.f7299d = incodeFormItem4;
        this.f7302g = group;
        this.f7303h = group2;
        this.f7305j = group3;
        this.f7304i = imageView;
        this.f7307l = linearLayout;
        this.f7310o = progressBar;
        this.f7301f = incodeTextView;
        this.f7308m = incodeTextView2;
        this.f7306k = incodeTextView3;
    }

    public final ConstraintLayout e() {
        return this.f7309n;
    }

    public static o a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_global_watchlist, (ViewGroup) null, false);
        int i2 = R.id.btnConfirm;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.countrySelector;
            IncodeFormItem incodeFormItem = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeFormItem != null) {
                i2 = R.id.dpDateOfBirth;
                IncodeFormItem incodeFormItem2 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeFormItem2 != null) {
                    i2 = R.id.etFirstName;
                    IncodeFormItem incodeFormItem3 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeFormItem3 != null) {
                        i2 = R.id.etSurname;
                        IncodeFormItem incodeFormItem4 = (IncodeFormItem) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeFormItem4 != null) {
                            i2 = R.id.groupForm;
                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, i2);
                            if (group != null) {
                                i2 = R.id.groupProcessing;
                                Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, i2);
                                if (group2 != null) {
                                    i2 = R.id.groupResult;
                                    Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (group3 != null) {
                                        i2 = R.id.ivResult;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (imageView != null) {
                                            i2 = R.id.layoutForm;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (linearLayout != null) {
                                                i2 = R.id.progressBar;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (progressBar != null) {
                                                    i2 = R.id.tvProcessing;
                                                    IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (incodeTextView != null) {
                                                        i2 = R.id.tvProcessingResultDescription;
                                                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (incodeTextView2 != null) {
                                                            i2 = R.id.tvTitle;
                                                            IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (incodeTextView3 != null) {
                                                                return new o((ConstraintLayout) viewInflate, incodeButton, incodeFormItem, incodeFormItem2, incodeFormItem3, incodeFormItem4, group, group2, group3, imageView, linearLayout, progressBar, incodeTextView, incodeTextView2, incodeTextView3);
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
        return this.f7309n;
    }
}
