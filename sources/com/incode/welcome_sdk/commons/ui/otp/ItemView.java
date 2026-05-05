package com.incode.welcome_sdk.commons.ui.otp;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.incode.welcome_sdk.R;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class ItemView extends FrameLayout {

    /* JADX INFO: renamed from: m */
    private static int f5947m = 0;

    /* JADX INFO: renamed from: o */
    private static int f5948o = 1;

    /* JADX INFO: renamed from: p */
    private static int f5949p = 0;

    /* JADX INFO: renamed from: t */
    private static int f5950t = 1;

    /* JADX INFO: renamed from: a */
    private int f5951a;

    /* JADX INFO: renamed from: b */
    private TextView f5952b;

    /* JADX INFO: renamed from: c */
    private int f5953c;

    /* JADX INFO: renamed from: d */
    private View f5954d;

    /* JADX INFO: renamed from: e */
    private int f5955e;

    /* JADX INFO: renamed from: f */
    private int f5956f;

    /* JADX INFO: renamed from: g */
    private int f5957g;

    /* JADX INFO: renamed from: h */
    private int f5958h;

    /* JADX INFO: renamed from: i */
    private int f5959i;

    /* JADX INFO: renamed from: j */
    private int f5960j;

    /* JADX INFO: renamed from: k */
    private int f5961k;

    /* JADX INFO: renamed from: l */
    private int f5962l;

    /* JADX INFO: renamed from: n */
    private boolean f5963n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemView(Context context) throws Throwable {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        b(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        b(attributeSet);
    }

    private final void b(AttributeSet attributeSet) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f5947m + 111;
        f5948o = i3 % 128;
        if (i3 % 2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_OtpTextView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            int i4 = f5947m + 11;
            f5948o = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_OtpTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
        a(typedArrayObtainStyledAttributes2);
        typedArrayObtainStyledAttributes2.recycle();
        throw null;
    }

    private final void a(TypedArray typedArray) throws Throwable {
        int i2 = 2 % 2;
        Utils utils = Utils.f5977a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fC = Utils.c(context, 2.0f);
        Utils utils2 = Utils.f5977a;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fC2 = Utils.c(context2, 24.0f);
        int color = typedArray.getColor(R.styleable.onboard_sdk_OtpTextView_android_textColor, ResourcesCompat.getColor(getContext().getResources(), android.R.color.black, null));
        float dimension = typedArray.getDimension(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_height, fC);
        int i3 = R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_margin;
        Utils utils3 = Utils.f5977a;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        float dimension2 = typedArray.getDimension(i3, Utils.c(r0, 0));
        float dimension3 = typedArray.getDimension(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_margin_bottom, 2.0f);
        float dimension4 = typedArray.getDimension(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_margin_right, 2.0f);
        float dimension5 = typedArray.getDimension(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_margin_left, 2.0f);
        float dimension6 = typedArray.getDimension(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_margin_top, 2.0f);
        this.f5963n = typedArray.getBoolean(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_hide_otp, false);
        this.f5961k = typedArray.getResourceId(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_hide_otp_drawable, R.drawable.onboard_sdk_bg_otp);
        this.f5962l = ResourcesCompat.getColor(getContext().getResources(), android.R.color.transparent, null);
        boolean z2 = typedArray.getBoolean(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_enabled, false);
        float dimension7 = typedArray.getDimension(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_otp_text_size, fC2);
        int resourceId = typedArray.getResourceId(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_otp_box_background, ResourcesCompat.getColor(getContext().getResources(), android.R.color.transparent, null));
        this.f5958h = typedArray.getResourceId(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_otp_box_background_active, resourceId);
        this.f5957g = typedArray.getResourceId(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_otp_box_background_inactive, resourceId);
        this.f5959i = typedArray.getResourceId(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_otp_box_background_success, resourceId);
        this.f5956f = typedArray.getResourceId(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_otp_box_background_error, resourceId);
        this.f5953c = typedArray.getColor(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_active_color, ResourcesCompat.getColor(getContext().getResources(), android.R.color.black, null));
        this.f5955e = typedArray.getColor(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_inactive_color, ResourcesCompat.getColor(getContext().getResources(), R.color.onboard_sdk_IconColorDisabled, null));
        this.f5951a = typedArray.getColor(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_error_color, ResourcesCompat.getColor(getContext().getResources(), R.color.onboard_sdk_state_destructive, null));
        this.f5960j = typedArray.getColor(R.styleable.onboard_sdk_OtpTextView_onboard_sdk_bar_success_color, ResourcesCompat.getColor(getContext().getResources(), android.R.color.black, null));
        setBackgroundResource(resourceId);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        this.f5952b = textView;
        textView.setGravity(17);
        try {
            Typeface font = ResourcesCompat.getFont(getContext(), R.font.onboard_sdk_InputSpecial_FontFamily);
            TextView textView2 = this.f5952b;
            if (textView2 != null) {
                textView2.setTypeface(font);
            }
        } catch (Resources.NotFoundException e2) {
            Timber.Forest.e(e2, "Font not found for OTPView", new Object[0]);
        }
        TextView textView3 = this.f5952b;
        if (textView3 != null) {
            int i4 = f5947m + 43;
            f5948o = i4 % 128;
            int i5 = i4 % 2;
            textView3.setTextColor(color);
            int i6 = f5947m + 89;
            f5948o = i6 % 128;
            int i7 = i6 % 2;
        }
        TextView textView4 = this.f5952b;
        if (textView4 != null) {
            textView4.setTextSize(0, dimension7);
        }
        addView(this.f5952b, layoutParams);
        if (z2) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) dimension);
            layoutParams2.gravity = 80;
            if (dimension2 == 0.0f) {
                dimension2 = dimension5;
            } else {
                int i8 = f5948o + 87;
                f5947m = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                dimension6 = dimension2;
                dimension3 = dimension6;
                dimension4 = dimension3;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) dimension2;
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) dimension4;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) dimension3;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) dimension6;
            View view = new View(getContext());
            this.f5954d = view;
            addView(view, layoutParams2);
        }
    }

    public final void setText(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.f5963n) {
            TextView textView = this.f5952b;
            if (textView == null) {
                int i3 = f5948o + 105;
                int i4 = i3 % 128;
                f5947m = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 73;
                f5948o = i6 % 128;
                int i7 = i6 % 2;
            } else {
                textView.setText("");
            }
            if (Intrinsics.areEqual(str, "")) {
                int i8 = f5948o + 79;
                f5947m = i8 % 128;
                int i9 = i8 % 2;
                TextView textView2 = this.f5952b;
                if (textView2 != null) {
                    textView2.setBackgroundResource(this.f5962l);
                    return;
                }
                return;
            }
            TextView textView3 = this.f5952b;
            if (textView3 != null) {
                int i10 = f5947m + 115;
                f5948o = i10 % 128;
                if (i10 % 2 != 0) {
                    textView3.setBackgroundResource(this.f5961k);
                    return;
                } else {
                    textView3.setBackgroundResource(this.f5961k);
                    int i11 = 42 / 0;
                    return;
                }
            }
        } else {
            TextView textView4 = this.f5952b;
            if (textView4 != null) {
                if (textView4 != null) {
                    textView4.setText(str);
                    return;
                }
                int i12 = f5947m + 61;
                f5948o = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
        }
        int i14 = f5948o + 113;
        f5947m = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 44 / 0;
        }
    }

    public final void setViewState(int i2) {
        int i3 = 2 % 2;
        int i4 = f5947m;
        int i5 = i4 + 7;
        f5948o = i5 % 128;
        int i6 = i5 % 2;
        if (i2 == -1) {
            View view = this.f5954d;
            if (view != null) {
                view.setBackgroundColor(this.f5951a);
            }
            setBackgroundResource(this.f5956f);
            int i7 = f5947m + 5;
            f5948o = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        if (i2 == 0) {
            View view2 = this.f5954d;
            if (view2 != null) {
                int i9 = i4 + 41;
                f5948o = i9 % 128;
                int i10 = i9 % 2;
                view2.setBackgroundColor(this.f5955e);
            }
            setBackgroundResource(this.f5957g);
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            View view3 = this.f5954d;
            if (view3 != null) {
                view3.setBackgroundColor(this.f5960j);
            }
            setBackgroundResource(this.f5959i);
            return;
        }
        View view4 = this.f5954d;
        if (view4 != null) {
            view4.setBackgroundColor(this.f5953c);
            int i11 = f5947m + 107;
            f5948o = i11 % 128;
            int i12 = i11 % 2;
        }
        setBackgroundResource(this.f5958h);
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
        int i2 = f5949p + 41;
        f5950t = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
