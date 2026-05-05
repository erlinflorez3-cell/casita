package com.incode.welcome_sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.paris.extensions.ViewStyleExtensionsKt;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ThemeConfiguration;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeDividerView extends View {
    public static final int $stable = 0;

    public /* synthetic */ IncodeDividerView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.style.onboard_sdk_Divider : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeDividerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        if (isInEditMode()) {
            return;
        }
        initCustomView(attributeSet);
    }

    static /* synthetic */ void initCustomView$default(IncodeDividerView incodeDividerView, AttributeSet attributeSet, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            attributeSet = null;
        }
        incodeDividerView.initCustomView(attributeSet);
    }

    private final void initCustomView(AttributeSet attributeSet) {
        ThemeConfiguration themeConfiguration = IncodeWelcome.Companion.getInstance().getInternalConfig().getThemeConfiguration();
        IncodeWelcomeRepository incodeRepository = IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getIncodeRepository();
        if (themeConfiguration.getDividerStyle() == -1 || !incodeRepository.isDynamicStylingAvailable()) {
            return;
        }
        ViewStyleExtensionsKt.style(this, themeConfiguration.getDividerStyle());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeDividerView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeDividerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
