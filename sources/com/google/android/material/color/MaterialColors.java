package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes8.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    public static int compositeARGBWithAlpha(int i2, int i3) {
        return ColorUtils.setAlphaComponent(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static int getColor(Context context, int i2, int i3) throws Throwable {
        Integer colorOrNull = getColorOrNull(context, i2);
        return colorOrNull != null ? colorOrNull.intValue() : i3;
    }

    public static int getColor(Context context, int i2, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i2, str));
    }

    public static int getColor(View view, int i2) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i2));
    }

    public static int getColor(View view, int i2, int i3) {
        return getColor(view.getContext(), i2, i3);
    }

    public static Integer getColorOrNull(Context context, int i2) throws Throwable {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i2);
        if (typedValueResolve != null) {
            return Integer.valueOf(resolveColor(context, typedValueResolve));
        }
        return null;
    }

    private static int getColorRole(int i2, int i3) {
        Hct hctFromInt = Hct.fromInt(i2);
        hctFromInt.setTone(i3);
        return hctFromInt.toInt();
    }

    private static int getColorRole(int i2, int i3, int i4) {
        Hct hctFromInt = Hct.fromInt(getColorRole(i2, i3));
        hctFromInt.setChroma(i4);
        return hctFromInt.toInt();
    }

    public static ColorRoles getColorRoles(int i2, boolean z2) {
        return z2 ? new ColorRoles(getColorRole(i2, 40), getColorRole(i2, 100), getColorRole(i2, 90), getColorRole(i2, 10)) : new ColorRoles(getColorRole(i2, 80), getColorRole(i2, 20), getColorRole(i2, 30), getColorRole(i2, 90));
    }

    public static ColorRoles getColorRoles(Context context, int i2) {
        return getColorRoles(i2, isLightTheme(context));
    }

    public static ColorStateList getColorStateList(Context context, int i2, ColorStateList colorStateList) throws Throwable {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i2);
        ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    public static ColorStateList getColorStateListOrNull(Context context, int i2) throws Throwable {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i2);
        if (typedValueResolve == null) {
            return null;
        }
        if (typedValueResolve.resourceId != 0) {
            return ContextCompat.getColorStateList(context, typedValueResolve.resourceId);
        }
        if (typedValueResolve.data != 0) {
            return ColorStateList.valueOf(typedValueResolve.data);
        }
        return null;
    }

    public static int getSurfaceContainerFromSeed(Context context, int i2) {
        return getColorRole(i2, isLightTheme(context) ? 94 : 12, 6);
    }

    public static int getSurfaceContainerHighFromSeed(Context context, int i2) {
        return getColorRole(i2, isLightTheme(context) ? 92 : 17, 6);
    }

    public static int harmonize(int i2, int i3) {
        return Blend.harmonize(i2, i3);
    }

    public static int harmonizeWithPrimary(Context context, int i2) {
        return harmonize(i2, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(int i2) {
        return i2 != 0 && ColorUtils.calculateLuminance(i2) > 0.5d;
    }

    static boolean isLightTheme(Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true);
    }

    public static int layer(int i2, int i3) {
        return ColorUtils.compositeColors(i3, i2);
    }

    public static int layer(int i2, int i3, float f2) {
        return layer(i2, ColorUtils.setAlphaComponent(i3, Math.round(Color.alpha(i3) * f2)));
    }

    public static int layer(View view, int i2, int i3) {
        return layer(view, i2, i3, 1.0f);
    }

    public static int layer(View view, int i2, int i3, float f2) {
        return layer(getColor(view, i2), getColor(view, i3), f2);
    }

    private static int resolveColor(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? ContextCompat.getColor(context, typedValue.resourceId) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? ContextCompat.getColorStateList(context, typedValue.resourceId) : ColorStateList.valueOf(typedValue.data);
    }
}
