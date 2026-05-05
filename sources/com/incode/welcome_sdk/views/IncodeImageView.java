package com.incode.welcome_sdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.ImageViewCompat;
import com.airbnb.paris.extensions.ImageViewStyleExtensionsKt;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ThemeConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeImageView extends AppCompatImageView {
    public static final int $stable = 0;

    public /* synthetic */ IncodeImageView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.style.onboard_sdk_ImageViewDefault : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        if (isInEditMode()) {
            return;
        }
        initCustomView(attributeSet);
    }

    static /* synthetic */ void initCustomView$default(IncodeImageView incodeImageView, AttributeSet attributeSet, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            attributeSet = null;
        }
        incodeImageView.initCustomView(attributeSet);
    }

    private final void initCustomView(AttributeSet attributeSet) {
        if (IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getIncodeRepository().isDynamicStylingAvailable()) {
            ThemeConfiguration themeConfiguration = IncodeWelcome.Companion.getInstance().getInternalConfig().getThemeConfiguration();
            if (attributeSet == null || attributeSet.getStyleAttribute() != R.style.onboard_sdk_CountdownAnimationBackground || themeConfiguration.getCountdownAnimationBackgroundStyle() == -1) {
                return;
            }
            IncodeImageView incodeImageView = this;
            ImageViewStyleExtensionsKt.style(incodeImageView, themeConfiguration.getCountdownAnimationBackgroundStyle());
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(themeConfiguration.getCountdownAnimationBackgroundStyle(), new int[]{android.R.attr.tint});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            ImageViewCompat.setImageTintList(incodeImageView, typedArrayObtainStyledAttributes.getColorStateList(0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeImageView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
