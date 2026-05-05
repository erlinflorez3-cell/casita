package com.swmansion.reanimated;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.swmansion.reanimated.ReactNativeUtils;

/* JADX INFO: loaded from: classes5.dex */
public class BorderRadiiDrawableUtils {
    public static ReactNativeUtils.BorderRadii getBorderRadii(View view) {
        return new ReactNativeUtils.BorderRadii(getRadiusForCorner(view, BorderRadiusProp.BORDER_RADIUS, 0.0f), getRadiusForCorner(view, BorderRadiusProp.BORDER_TOP_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, BorderRadiusProp.BORDER_TOP_RIGHT_RADIUS, Float.NaN), getRadiusForCorner(view, BorderRadiusProp.BORDER_BOTTOM_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, BorderRadiusProp.BORDER_BOTTOM_RIGHT_RADIUS, Float.NaN));
    }

    private static float getRadiusForCorner(View view, BorderRadiusProp borderRadiusProp, float f2) {
        LengthPercentage borderRadius = BackgroundStyleApplicator.getBorderRadius(view, borderRadiusProp);
        if (borderRadius == null) {
            return f2;
        }
        Rect bounds = view.getBackground().getBounds();
        return borderRadius.resolve(bounds.width(), bounds.height()).toPixelFromDIP().getHorizontal();
    }
}
