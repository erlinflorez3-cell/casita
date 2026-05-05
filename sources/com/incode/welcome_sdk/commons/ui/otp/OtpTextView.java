package com.incode.welcome_sdk.commons.ui.otp;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter_Factory;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class OtpTextView extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5966d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f5967f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f5968h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f5969i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OTPChildEditText f5971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OTPListener f5972c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<ItemView> f5973e;

    public static /* synthetic */ Object a(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~((~i7) | i2 | i6);
        int i9 = ~((~i2) | i7);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i7));
        int i12 = ~(i10 | i2);
        int i13 = i7 + i2 + i4 + ((-1568348280) * i3) + (1617068012 * i5);
        int i14 = i13 * i13;
        int i15 = (((-430874860) * i7) - 739508224) + (1544986862 * i2) + (i8 * 987930861) + ((-987930861) * i11) + (987930861 * i12) + (557056000 * i4) + ((-1885339648) * i3) + (1743781888 * i5) + (858456064 * i14);
        int i16 = (i7 * (-973781596)) + 539565670 + (i2 * (-973779706)) + (i8 * 945) + (i11 * (-945)) + (i12 * 945) + ((-973780651) * i4) + (424585256 * i3) + (537576796 * i5) + (i14 * 1078394880);
        if (i15 + (i16 * i16 * 192741376) != 1) {
            return c(objArr);
        }
        OtpTextView otpTextView = (OtpTextView) objArr[0];
        TypedArray typedArray = (TypedArray) objArr[1];
        AttributeSet attributeSet = (AttributeSet) objArr[2];
        int i17 = 2 % 2;
        otpTextView.f5973e = new ArrayList();
        if (otpTextView.f5970a <= 0) {
            throw new IllegalStateException("Please specify the length of the otp view");
        }
        String string = typedArray.getString(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_otp);
        int i18 = R.styleable.onboard_sdk_OtpTextView_onboard_sdk_width;
        Utils utils = Utils.f5977a;
        Intrinsics.checkNotNullExpressionValue(otpTextView.getContext(), "");
        int dimension = (int) typedArray.getDimension(i18, Utils.c(r0, 48));
        int i19 = R.styleable.onboard_sdk_OtpTextView_onboard_sdk_height;
        Utils utils2 = Utils.f5977a;
        Intrinsics.checkNotNullExpressionValue(otpTextView.getContext(), "");
        int dimension2 = (int) typedArray.getDimension(i19, Utils.c(r0, 48));
        int i20 = R.styleable.onboard_sdk_OtpTextView_onboard_sdk_box_margin;
        Utils utils3 = Utils.f5977a;
        Intrinsics.checkNotNullExpressionValue(otpTextView.getContext(), "");
        int dimension3 = (int) typedArray.getDimension(i20, Utils.c(r0, -1));
        int i21 = R.styleable.onboard_sdk_OtpTextView_onboard_sdk_box_margin_left;
        Utils utils4 = Utils.f5977a;
        Intrinsics.checkNotNullExpressionValue(otpTextView.getContext(), "");
        int dimension4 = (int) typedArray.getDimension(i21, Utils.c(r0, 4));
        int i22 = R.styleable.onboard_sdk_OtpTextView_onboard_sdk_box_margin_right;
        Utils utils5 = Utils.f5977a;
        Intrinsics.checkNotNullExpressionValue(otpTextView.getContext(), "");
        int dimension5 = (int) typedArray.getDimension(i22, Utils.c(r0, 4));
        int i23 = R.styleable.onboard_sdk_OtpTextView_onboard_sdk_box_margin_top;
        Utils utils6 = Utils.f5977a;
        Intrinsics.checkNotNullExpressionValue(otpTextView.getContext(), "");
        int dimension6 = (int) typedArray.getDimension(i23, Utils.c(r0, 4));
        int i24 = R.styleable.onboard_sdk_OtpTextView_onboard_sdk_box_margin_bottom;
        Utils utils7 = Utils.f5977a;
        Intrinsics.checkNotNullExpressionValue(otpTextView.getContext(), "");
        int dimension7 = (int) typedArray.getDimension(i24, Utils.c(r0, 4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension2);
        if (dimension3 > 0) {
            int i25 = f5966d + 111;
            f5968h = i25 % 128;
            int i26 = i25 % 2;
            layoutParams.setMargins(dimension3, dimension3, dimension3, dimension3);
            int i27 = f5968h + 5;
            f5966d = i27 % 128;
            int i28 = i27 % 2;
        } else {
            layoutParams.setMargins(dimension4, dimension6, dimension5, dimension7);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        otpTextView.f5971b.setFilters(new InputFilter[]{b(), new InputFilter.LengthFilter(otpTextView.f5970a), new InputFilter.AllCaps()});
        otpTextView.c(otpTextView.f5971b);
        otpTextView.addView(otpTextView.f5971b, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(otpTextView.getContext());
        otpTextView.addView(linearLayout, layoutParams3);
        int i29 = otpTextView.f5970a;
        for (int i30 = 0; i30 < i29; i30++) {
            Context context = otpTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ItemView itemView = new ItemView(context, attributeSet);
            itemView.setViewState(0);
            linearLayout.addView(itemView, i30, layoutParams);
            List<ItemView> list = otpTextView.f5973e;
            if (list != null) {
                list.add(itemView);
            }
        }
        if (string != null) {
            otpTextView.setOTP(string);
        } else {
            otpTextView.setOTP("");
        }
        return null;
    }

    public static final /* synthetic */ int a(OtpTextView otpTextView) {
        int i2 = 2 % 2;
        int i3 = f5968h + 29;
        int i4 = i3 % 128;
        f5966d = i4;
        int i5 = i3 % 2;
        int i6 = otpTextView.f5970a;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i4 + 45;
        f5968h = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public static final /* synthetic */ void d(OtpTextView otpTextView, int i2) {
        int i3 = 2 % 2;
        int i4 = f5966d + 113;
        f5968h = i4 % 128;
        int i5 = i4 % 2;
        otpTextView.e(i2);
        int i6 = f5968h + 65;
        f5966d = i6 % 128;
        int i7 = i6 % 2;
    }

    public final OTPListener a() {
        int i2 = 2 % 2;
        int i3 = f5966d;
        int i4 = i3 + 25;
        f5968h = i4 % 128;
        int i5 = i4 % 2;
        OTPListener oTPListener = this.f5972c;
        int i6 = i3 + 75;
        f5968h = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
        return oTPListener;
    }

    public final void setOtpListener(OTPListener oTPListener) {
        int i2 = 2 % 2;
        int i3 = f5968h + 91;
        f5966d = i3 % 128;
        int i4 = i3 % 2;
        this.f5972c = oTPListener;
        if (i4 != 0) {
            int i5 = 18 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        int i6 = 2 % 2;
        while (true) {
            Object obj = null;
            if (i2 >= i3) {
                return null;
            }
            int i7 = f5968h + 103;
            f5966d = i7 % 128;
            int i8 = i7 % 2;
            if (!Pattern.compile("[0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]*").matcher(String.valueOf(charSequence.charAt(i2))).matches()) {
                int i9 = f5968h + 73;
                f5966d = i9 % 128;
                if (i9 % 2 == 0) {
                    return "";
                }
                obj.hashCode();
                throw null;
            }
            i2++;
        }
    }

    private static InputFilter b() {
        int i2 = 2 % 2;
        int i3 = f5966d + 25;
        f5968h = i3 % 128;
        if (i3 % 2 != 0) {
            return new InputFilter() { // from class: com.incode.welcome_sdk.commons.ui.otp.OtpTextView$$ExternalSyntheticLambda0
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                    return OtpTextView.b(charSequence, i4, i5, spanned, i6, i7);
                }
            };
        }
        new InputFilter() { // from class: com.incode.welcome_sdk.commons.ui.otp.OtpTextView$$ExternalSyntheticLambda0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                return OtpTextView.b(charSequence, i4, i5, spanned, i6, i7);
            }
        };
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        OtpTextView otpTextView = (OtpTextView) objArr[0];
        int i2 = 2 % 2;
        int i3 = f5968h + 61;
        f5966d = i3 % 128;
        int i4 = i3 % 2;
        String strValueOf = String.valueOf(otpTextView.f5971b.getText());
        if (i4 != 0) {
            int i5 = 89 / 0;
        }
        int i6 = f5966d + 91;
        f5968h = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
        return strValueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.f5971b = new OTPChildEditText(context2);
        c((AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.f5971b = new OTPChildEditText(context2);
        c(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.f5971b = new OTPChildEditText(context2);
        c(attributeSet);
    }

    private final void c(AttributeSet attributeSet) {
        int i2 = 2 % 2;
        int i3 = f5966d + 87;
        f5968h = i3 % 128;
        if (i3 % 2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_OtpTextView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            a(typedArrayObtainStyledAttributes, attributeSet);
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_OtpTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
        a(typedArrayObtainStyledAttributes2, attributeSet);
        typedArrayObtainStyledAttributes2.recycle();
        throw null;
    }

    private final void a(TypedArray typedArray, AttributeSet attributeSet) {
        int i2 = 2 % 2;
        int i3 = f5966d + 113;
        f5968h = i3 % 128;
        if (i3 % 2 == 0) {
            this.f5970a = typedArray.getInt(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_length, 2);
            int iE = BaseValidationPresenter_Factory.e();
            int iE2 = BaseValidationPresenter_Factory.e();
            a(657558967, BaseValidationPresenter_Factory.e(), new Object[]{this, typedArray, attributeSet}, iE2, BaseValidationPresenter_Factory.e(), iE, -657558966);
        } else {
            this.f5970a = typedArray.getInt(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_length, 4);
            int iE3 = BaseValidationPresenter_Factory.e();
            int iE4 = BaseValidationPresenter_Factory.e();
            a(657558967, BaseValidationPresenter_Factory.e(), new Object[]{this, typedArray, attributeSet}, iE4, BaseValidationPresenter_Factory.e(), iE3, -657558966);
        }
        int i4 = f5966d + 99;
        f5968h = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }

    private final void c(OTPChildEditText oTPChildEditText) {
        int i2 = 2 % 2;
        oTPChildEditText.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.commons.ui.otp.OtpTextView$setTextWatcher$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5974a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f5975c = 0;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                int i6 = 2 % 2;
                int i7 = f5974a + 57;
                f5975c = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.checkNotNullParameter(charSequence, "");
                int i9 = f5975c + 3;
                f5974a = i9 % 128;
                int i10 = i9 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
                /*
                    r4 = this;
                    r3 = 2
                    int r0 = r3 % r3
                    java.lang.String r0 = ""
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    com.incode.welcome_sdk.commons.ui.otp.OtpTextView r0 = r4.f5976b
                    com.incode.welcome_sdk.commons.ui.otp.OTPListener r2 = r0.a()
                    if (r2 == 0) goto L49
                    com.incode.welcome_sdk.commons.ui.otp.OtpTextView r0 = r4.f5976b
                    r2.onInteractionListener()
                    int r1 = r5.length()
                    int r0 = com.incode.welcome_sdk.commons.ui.otp.OtpTextView.a(r0)
                    if (r1 != r0) goto L2f
                    java.lang.String r0 = r5.toString()
                    r2.onOTPComplete(r0)
                    int r0 = com.incode.welcome_sdk.commons.ui.otp.OtpTextView$setTextWatcher$1.f5975c
                    int r1 = r0 + 87
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.commons.ui.otp.OtpTextView$setTextWatcher$1.f5974a = r0
                L2e:
                    int r1 = r1 % r3
                L2f:
                    com.incode.welcome_sdk.commons.ui.otp.OtpTextView r0 = r4.f5976b
                    r0.setOTP(r5)
                    com.incode.welcome_sdk.commons.ui.otp.OtpTextView r1 = r4.f5976b
                    int r0 = r5.length()
                    com.incode.welcome_sdk.commons.ui.otp.OtpTextView.d(r1, r0)
                    int r0 = com.incode.welcome_sdk.commons.ui.otp.OtpTextView$setTextWatcher$1.f5975c
                    int r1 = r0 + 33
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.commons.ui.otp.OtpTextView$setTextWatcher$1.f5974a = r0
                    int r1 = r1 % r3
                    if (r1 == 0) goto L52
                    return
                L49:
                    int r0 = com.incode.welcome_sdk.commons.ui.otp.OtpTextView$setTextWatcher$1.f5974a
                    int r1 = r0 + 43
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.commons.ui.otp.OtpTextView$setTextWatcher$1.f5975c = r0
                    goto L2e
                L52:
                    r0 = 0
                    r0.hashCode()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.otp.OtpTextView$setTextWatcher$1.onTextChanged(java.lang.CharSequence, int, int, int):void");
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int i3 = 2 % 2;
                int i4 = f5975c + 105;
                f5974a = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(editable, "");
                int i6 = f5975c + 65;
                f5974a = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = f5968h + 71;
        f5966d = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void e(int i2) {
        int i3 = 2 % 2;
        List<ItemView> list = this.f5973e;
        if (list != null) {
            int size = list.size();
            int i4 = f5966d + 91;
            f5968h = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < size; i6++) {
                int i7 = f5968h;
                int i8 = i7 + 109;
                f5966d = i8 % 128;
                int i9 = i8 % 2;
                if (i6 == i2) {
                    int i10 = i7 + 85;
                    f5966d = i10 % 128;
                    int i11 = i10 % 2;
                    list.get(i6).setViewState(1);
                } else {
                    list.get(i6).setViewState(0);
                }
            }
            if (i2 == list.size()) {
                int i12 = f5966d + 5;
                f5968h = i12 % 128;
                if (i12 % 2 == 0) {
                    list.get(list.size() % 1).setViewState(0);
                } else {
                    list.get(list.size() - 1).setViewState(1);
                }
            }
        }
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f5966d + 33;
        f5968h = i3 % 128;
        if (i3 % 2 != 0) {
            Editable text = this.f5971b.getText();
            if (text != null) {
                text.clear();
                int i4 = f5968h + 25;
                f5966d = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        this.f5971b.getText();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOTP(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f5968h + 23;
        f5966d = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        List<ItemView> list = this.f5973e;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                int i5 = f5968h + 83;
                f5966d = i5 % 128;
                if (i5 % 2 != 0) {
                    charSequence.length();
                    throw null;
                }
                if (i4 < charSequence.length()) {
                    list.get(i4).setText(String.valueOf(charSequence.charAt(i4)));
                    int i6 = f5966d + 93;
                    f5968h = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    list.get(i4).setText("");
                }
            }
        }
    }

    public final void d() {
        int i2 = 2 % 2;
        int i3 = f5966d + 3;
        f5968h = i3 % 128;
        if (i3 % 2 != 0) {
            this.f5971b.requestFocus();
            int i4 = f5968h + 37;
            f5966d = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f5971b.requestFocus();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOTP(String str) {
        int i2 = 2 % 2;
        int i3 = f5968h + 95;
        f5966d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.f5971b.setText(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.f5971b.setText(str);
            int i4 = 29 / 0;
        }
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        int i2 = 2 % 2;
        int i3 = f5968h + 37;
        f5966d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onTouchListener, "");
            super.setOnTouchListener(onTouchListener);
            this.f5971b.setOnTouchListener(onTouchListener);
        } else {
            Intrinsics.checkNotNullParameter(onTouchListener, "");
            super.setOnTouchListener(onTouchListener);
            this.f5971b.setOnTouchListener(onTouchListener);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        int i2 = 2 % 2;
        int i3 = f5966d + 25;
        f5968h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onEditorActionListener, "");
            this.f5971b.setOnEditorActionListener(onEditorActionListener);
        } else {
            Intrinsics.checkNotNullParameter(onEditorActionListener, "");
            this.f5971b.setOnEditorActionListener(onEditorActionListener);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setImeOptions(int i2) {
        int i3 = 2 % 2;
        int i4 = f5968h + 49;
        f5966d = i4 % 128;
        int i5 = i4 % 2;
        this.f5971b.setImeOptions(i2);
        int i6 = f5966d + 3;
        f5968h = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b2) {
            this();
        }
    }

    static {
        new Companion((byte) 0);
        int i2 = f5969i + 93;
        f5967f = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void c(TypedArray typedArray, AttributeSet attributeSet) {
        int iE = BaseValidationPresenter_Factory.e();
        int iE2 = BaseValidationPresenter_Factory.e();
        a(657558967, BaseValidationPresenter_Factory.e(), new Object[]{this, typedArray, attributeSet}, iE2, BaseValidationPresenter_Factory.e(), iE, -657558966);
    }

    public final String e() {
        int iE = BaseValidationPresenter_Factory.e();
        int iE2 = BaseValidationPresenter_Factory.e();
        return (String) a(-53302256, BaseValidationPresenter_Factory.e(), new Object[]{this}, iE2, BaseValidationPresenter_Factory.e(), iE, 53302256);
    }
}
