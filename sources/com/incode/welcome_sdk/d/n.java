package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.RoundedCornersFixedWidthSquareImage;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeEditText;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeTextView f7275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeButton f7276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncodeTextView f7277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeEditText f7278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IncodeEditText f7279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IncodeEditText f7280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RadioButton f7281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RadioGroup f7282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RoundedCornersFixedWidthSquareImage f7283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RadioButton f7284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f7285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f7286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f7287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ConstraintLayout f7288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ConstraintLayout f7289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f7290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f7291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private NestedScrollView f7292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private LinearLayout f7293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f7294t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private IncodeTextView f7295w;

    private n(ConstraintLayout constraintLayout, IncodeEditText incodeEditText, TextView textView, IncodeButton incodeButton, ConstraintLayout constraintLayout2, IncodeTextView incodeTextView, TextView textView2, IncodeEditText incodeEditText2, TextView textView3, IncodeTextView incodeTextView2, TextView textView4, LinearLayout linearLayout, IncodeEditText incodeEditText3, TextView textView5, RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage, NestedScrollView nestedScrollView, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, TextView textView6, IncodeTextView incodeTextView3) {
        this.f7289o = constraintLayout;
        this.f7279e = incodeEditText;
        this.f7285k = textView;
        this.f7276b = incodeButton;
        this.f7288n = constraintLayout2;
        this.f7275a = incodeTextView;
        this.f7286l = textView2;
        this.f7278d = incodeEditText2;
        this.f7287m = textView3;
        this.f7277c = incodeTextView2;
        this.f7294t = textView4;
        this.f7293s = linearLayout;
        this.f7280f = incodeEditText3;
        this.f7291q = textView5;
        this.f7283i = roundedCornersFixedWidthSquareImage;
        this.f7292r = nestedScrollView;
        this.f7284j = radioButton;
        this.f7281g = radioButton2;
        this.f7282h = radioGroup;
        this.f7290p = textView6;
        this.f7295w = incodeTextView3;
    }

    public final ConstraintLayout b() {
        return this.f7289o;
    }

    public static n a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_activity_id_info, (ViewGroup) null, false);
        int i2 = R.id.address;
        IncodeEditText incodeEditText = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeEditText != null) {
            i2 = R.id.addressLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
            if (textView != null) {
                i2 = R.id.btnContinue;
                IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeButton != null) {
                    i2 = R.id.buttonContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i2);
                    if (constraintLayout != null) {
                        i2 = R.id.dateOfBirth;
                        IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (incodeTextView != null) {
                            i2 = R.id.dateOfBirthLabel;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (textView2 != null) {
                                i2 = R.id.documentNumber;
                                IncodeEditText incodeEditText2 = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeEditText2 != null) {
                                    i2 = R.id.documentNumberLabel;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (textView3 != null) {
                                        i2 = R.id.expiryDate;
                                        IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                        if (incodeTextView2 != null) {
                                            i2 = R.id.expiryDateLabel;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
                                            if (textView4 != null) {
                                                i2 = R.id.formContainer;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i2);
                                                if (linearLayout != null) {
                                                    i2 = R.id.fullName;
                                                    IncodeEditText incodeEditText3 = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
                                                    if (incodeEditText3 != null) {
                                                        i2 = R.id.fullNameLabel;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                        if (textView5 != null) {
                                                            i2 = R.id.idPhoto;
                                                            RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage = (RoundedCornersFixedWidthSquareImage) ViewBindings.findChildViewById(viewInflate, i2);
                                                            if (roundedCornersFixedWidthSquareImage != null) {
                                                                i2 = R.id.onboard_sdk_nestedscrollview;
                                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                if (nestedScrollView != null) {
                                                                    i2 = R.id.rbFemale;
                                                                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(viewInflate, i2);
                                                                    if (radioButton != null) {
                                                                        i2 = R.id.rbMale;
                                                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(viewInflate, i2);
                                                                        if (radioButton2 != null) {
                                                                            i2 = R.id.rgSex;
                                                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(viewInflate, i2);
                                                                            if (radioGroup != null) {
                                                                                i2 = R.id.sexLabel;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                if (textView6 != null) {
                                                                                    i2 = R.id.tvTitle;
                                                                                    IncodeTextView incodeTextView3 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                                                                    if (incodeTextView3 != null) {
                                                                                        return new n((ConstraintLayout) viewInflate, incodeEditText, textView, incodeButton, constraintLayout, incodeTextView, textView2, incodeEditText2, textView3, incodeTextView2, textView4, linearLayout, incodeEditText3, textView5, roundedCornersFixedWidthSquareImage, nestedScrollView, radioButton, radioButton2, radioGroup, textView6, incodeTextView3);
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
        return this.f7289o;
    }
}
