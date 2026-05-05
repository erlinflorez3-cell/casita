package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;

/* JADX INFO: loaded from: classes5.dex */
public class ScaleDownAnimation extends ScaleAnimation {

    /* JADX INFO: renamed from: i */
    private static int f6113i = 1;

    /* JADX INFO: renamed from: j */
    private static int f6114j = 0;

    public ScaleDownAnimation(ValueController.UpdateListener updateListener) {
        super(updateListener);
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ScaleAnimation
    protected final PropertyValuesHolder b(boolean z2) {
        int i2;
        int i3;
        String str;
        int i4 = 2 % 2;
        int i5 = f6113i + 83;
        f6114j = i5 % 128;
        int i6 = i5 % 2;
        if (z2) {
            i2 = (int) (this.f6112h * ((ScaleAnimation) this).f6111g);
            i3 = this.f6112h;
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i2 = this.f6112h;
            i3 = (int) (this.f6112h * ((ScaleAnimation) this).f6111g);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i2, i3);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        int i7 = f6114j + 17;
        f6113i = i7 % 128;
        int i8 = i7 % 2;
        return propertyValuesHolderOfInt;
    }
}
