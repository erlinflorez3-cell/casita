package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ReplaceWith;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
public final class DrawableCompat {
    private static final String TAG = "DrawableCompat";
    private static Method sGetLayoutDirectionMethod = null;
    private static boolean sGetLayoutDirectionMethodFetched = false;
    private static Method sSetLayoutDirectionMethod = null;
    private static boolean sSetLayoutDirectionMethodFetched = false;

    public static Drawable wrap(Drawable drawable) {
        return drawable;
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\b<\u0018*~biN\u0006G?#`(?\u0002 \u0002nLQ<\u0006e?V3a_", imports = {})
    @Deprecated
    public static void jumpToCurrentState(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\b<\u0018*~biN\u0006P/*1ID.wxnYR:\u0018U\u0006O7,)\nziUm", imports = {})
    @Deprecated
    public static void setAutoMirrored(Drawable drawable, boolean z2) {
        drawable.setAutoMirrored(z2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\b<\u0018*~biN\u0006F=veH?\f\u0014\u0002nVU-\u0017\u0019\u0007", imports = {})
    @Deprecated
    public static boolean isAutoMirrored(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void setHotspot(Drawable drawable, float f2, float f3) {
        Api21Impl.setHotspot(drawable, f2, f3);
    }

    public static void setHotspotBounds(Drawable drawable, int i2, int i3, int i4, int i5) {
        Api21Impl.setHotspotBounds(drawable, i2, i3, i4, i5);
    }

    public static void setTint(Drawable drawable, int i2) {
        Api21Impl.setTint(drawable, i2);
    }

    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        Api21Impl.setTintList(drawable, colorStateList);
    }

    public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
        Api21Impl.setTintMode(drawable, mode);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\b<\u0018*~biN\u0006D/*1@@'\f7%", imports = {})
    @Deprecated
    public static int getAlpha(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static void applyTheme(Drawable drawable, Resources.Theme theme) {
        Api21Impl.applyTheme(drawable, theme);
    }

    public static boolean canApplyTheme(Drawable drawable) {
        return Api21Impl.canApplyTheme(drawable);
    }

    public static ColorFilter getColorFilter(Drawable drawable) {
        return Api21Impl.getColorFilter(drawable);
    }

    public static void clearColorFilter(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Api21Impl.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(Drawable drawable) {
        return drawable instanceof WrappedDrawable ? (T) ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    public static boolean setLayoutDirection(Drawable drawable, int i2) {
        return Api23Impl.setLayoutDirection(drawable, i2);
    }

    public static int getLayoutDirection(Drawable drawable) {
        return Api23Impl.getLayoutDirection(drawable);
    }

    private DrawableCompat() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void setHotspot(Drawable drawable, float f2, float f3) {
            drawable.setHotspot(f2, f3);
        }

        static void setTint(Drawable drawable, int i2) {
            drawable.setTint(i2);
        }

        static void setTintList(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        static void applyTheme(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean canApplyTheme(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter getColorFilter(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void setHotspotBounds(Drawable drawable, int i2, int i3, int i4, int i5) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean setLayoutDirection(Drawable drawable, int i2) {
            return drawable.setLayoutDirection(i2);
        }

        static int getLayoutDirection(Drawable drawable) {
            return drawable.getLayoutDirection();
        }
    }
}
