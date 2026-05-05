package com.incode.welcome_sdk.views;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSpinner;
import com.airbnb.paris.extensions.ViewGroupStyleExtensionsKt;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ThemeConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeSpinner extends AppCompatSpinner {
    public static final int $stable = 0;

    public /* synthetic */ IncodeSpinner(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.spinnerStyle : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeSpinner(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        if (isInEditMode()) {
            return;
        }
        initCustomView();
    }

    private final void initCustomView() {
        if (IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getIncodeRepository().isDynamicStylingAvailable()) {
            ThemeConfiguration themeConfiguration = IncodeWelcome.Companion.getInstance().getInternalConfig().getThemeConfiguration();
            if (themeConfiguration.getSpinnerStyle() != -1) {
                ViewGroupStyleExtensionsKt.style(this, themeConfiguration.getSpinnerStyle());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeSpinner(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
