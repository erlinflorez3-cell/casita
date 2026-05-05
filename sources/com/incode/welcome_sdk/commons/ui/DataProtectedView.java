package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.utils.LayoutUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.views.IncodeTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DataProtectedView extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5781c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5782d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageView f5783b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IncodeTextView f5784e;

    private /* synthetic */ DataProtectedView(Context context, AttributeSet attributeSet, int i2, byte b2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataProtectedView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        ImageView imageView = new ImageView(context);
        this.f5783b = imageView;
        imageView.setId(View.generateViewId());
        IncodeTextView incodeTextView = new IncodeTextView(context, null, 0, 6, null);
        this.f5784e = incodeTextView;
        incodeTextView.setId(View.generateViewId());
        int iConvertDpToPx = (int) LayoutUtils.convertDpToPx(context, context.getResources().getDimension(R.dimen.onboard_sdk_standard_margins));
        int iConvertDpToPx2 = (int) LayoutUtils.convertDpToPx(context, 10.0f);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(iConvertDpToPx);
        layoutParams.horizontalChainStyle = 2;
        layoutParams.startToStart = 0;
        layoutParams.endToStart = incodeTextView.getId();
        imageView.setAdjustViewBounds(true);
        imageView.setImageResource(R.drawable.onboard_sdk_intro_data_protection);
        imageView.setContentDescription(null);
        imageView.setImportantForAccessibility(2);
        addView(imageView, layoutParams);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginEnd(iConvertDpToPx);
        layoutParams2.startToEnd = imageView.getId();
        layoutParams2.endToEnd = 0;
        layoutParams2.topToTop = imageView.getId();
        layoutParams2.bottomToBottom = imageView.getId();
        TextViewCompat.setTextAppearance(incodeTextView, R.style.onboard_sdk_LabelBig);
        incodeTextView.setPaddingRelative(iConvertDpToPx2, 0, iConvertDpToPx2, 0);
        incodeTextView.setText(c(context));
        addView(incodeTextView, layoutParams2);
    }

    private static SpannableString c(Context context) {
        String string;
        String string2;
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        int i5 = f5782d + 87;
        f5781c = i5 % 128;
        if (i5 % 2 != 0) {
            string = context.getString(R.string.onboard_sdk_intro_data_protected_highlighted_text);
            Intrinsics.checkNotNullExpressionValue(string, "");
            string2 = context.getString(R.string.onboard_sdk_intro_data_protected_label);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            i2 = 63;
            obj = null;
            i3 = 1;
        } else {
            string = context.getString(R.string.onboard_sdk_intro_data_protected_highlighted_text);
            Intrinsics.checkNotNullExpressionValue(string, "");
            string2 = context.getString(R.string.onboard_sdk_intro_data_protected_label);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            i2 = 8;
            obj = null;
            i3 = 0;
        }
        SpannableString spannableStringWithHighlightedSection$default = StringUtils.getSpannableStringWithHighlightedSection$default(string2, string, context, i3, i2, obj);
        int i6 = f5782d + 43;
        f5781c = i6 % 128;
        if (i6 % 2 == 0) {
            return spannableStringWithHighlightedSection$default;
        }
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataProtectedView(Context context) {
        this(context, null, 6, (byte) 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataProtectedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
