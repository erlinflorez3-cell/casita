package com.google.android.material.elevation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.EO;

/* JADX INFO: loaded from: classes8.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    /* JADX WARN: Illegal instructions before constructor call */
    public ElevationOverlayProvider(Context context) throws Throwable {
        boolean zResolveBoolean = MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false);
        int color = MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0);
        int color2 = MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0);
        int color3 = MaterialColors.getColor(context, R.attr.colorSurface, 0);
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("i.Ht,Z'kC\u0012\t3R_sU\u001fk\u0004\u00026%v", (short) (C1607wl.Xd() ^ 29293))).getMethod(C1561oA.Qd("iftQcpkpl\\]j", (short) (C1607wl.Xd() ^ 21131)), new Class[0]);
        try {
            method.setAccessible(true);
            this(zResolveBoolean, color, color2, color3, ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public ElevationOverlayProvider(boolean z2, int i2, int i3, int i4, float f2) {
        this.elevationOverlayEnabled = z2;
        this.elevationOverlayColor = i2;
        this.elevationOverlayAccentColor = i3;
        this.colorSurface = i4;
        this.displayDensity = f2;
    }

    private boolean isThemeSurfaceColor(int i2) {
        return ColorUtils.setAlphaComponent(i2, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f2) {
        return Math.round(calculateOverlayAlphaFraction(f2) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f2) {
        if (this.displayDensity <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r2)) * FORMULA_MULTIPLIER) + 2.0f) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i2, float f2) {
        int i3;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f2);
        int iAlpha = Color.alpha(i2);
        int iLayer = MaterialColors.layer(ColorUtils.setAlphaComponent(i2, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i3 = this.elevationOverlayAccentColor) != 0) {
            iLayer = MaterialColors.layer(iLayer, ColorUtils.setAlphaComponent(i3, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return ColorUtils.setAlphaComponent(iLayer, iAlpha);
    }

    public int compositeOverlay(int i2, float f2, View view) {
        return compositeOverlay(i2, f2 + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayIfNeeded(int i2, float f2) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i2)) ? compositeOverlay(i2, f2) : i2;
    }

    public int compositeOverlayIfNeeded(int i2, float f2, View view) {
        return compositeOverlayIfNeeded(i2, f2 + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f2) {
        return compositeOverlayIfNeeded(this.colorSurface, f2);
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f2, View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f2 + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }
}
