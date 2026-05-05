package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] EMPTY_STATE_SET = new int[0];
    public static final Rect INSETS_NONE = new Rect();

    @Deprecated
    public static boolean canSafelyMutateDrawable(Drawable drawable) {
        return true;
    }

    private DrawableUtils() {
    }

    public static Rect getOpticalBounds(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = Api29Impl.getOpticalInsets(drawable);
            return new Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
        }
        return Api18Impl.getOpticalInsets(DrawableCompat.unwrap(drawable));
    }

    static void fixDrawable(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT < 29 || Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        forceDrawableStateChange(drawable);
    }

    private static void forceDrawableStateChange(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode parseTintMode(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    static class Api18Impl {
        private static final Field sBottom;
        private static final Method sGetOpticalInsets;
        private static final Field sLeft;
        private static final boolean sReflectionSuccessful;
        private static final Field sRight;
        private static final Field sTop;

        /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        static {
            /*
                r9 = 1
                r8 = 0
                r7 = 0
                java.lang.String r0 = "android.graphics.Insets"
                java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L3a java.lang.NoSuchMethodException -> L40
                java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
                java.lang.String r1 = "getOpticalInsets"
                java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L3a java.lang.NoSuchMethodException -> L40
                java.lang.reflect.Method r5 = r2.getMethod(r1, r0)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L3a java.lang.NoSuchMethodException -> L40
                java.lang.String r0 = "left"
                java.lang.reflect.Field r4 = r6.getField(r0)     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3d java.lang.NoSuchMethodException -> L43
                java.lang.String r0 = "top"
                java.lang.reflect.Field r3 = r6.getField(r0)     // Catch: java.lang.ClassNotFoundException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.NoSuchFieldException -> L46
                java.lang.String r0 = "right"
                java.lang.reflect.Field r2 = r6.getField(r0)     // Catch: java.lang.Throwable -> L49
                java.lang.String r0 = "bottom"
                java.lang.reflect.Field r1 = r6.getField(r0)     // Catch: java.lang.Throwable -> L4a
                goto L4d
            L30:
                r3 = r8
                goto L47
            L32:
                r3 = r8
                goto L47
            L34:
                r5 = r8
                r4 = r5
                goto L38
            L37:
                r4 = r8
            L38:
                r3 = r4
                goto L47
            L3a:
                r5 = r8
                r4 = r5
                goto L3e
            L3d:
                r4 = r8
            L3e:
                r3 = r4
                goto L47
            L40:
                r5 = r8
                r4 = r5
                goto L44
            L43:
                r4 = r8
            L44:
                r3 = r4
                goto L47
            L46:
                r3 = r8
            L47:
                r2 = r3
                goto L4a
            L49:
                r2 = r8
            L4a:
                r1 = r8
                r0 = r7
                goto L4e
            L4d:
                r0 = r9
            L4e:
                if (r0 == 0) goto L5d
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r5
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r4
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r3
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r9
            L5c:
                return
            L5d:
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r8
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r8
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r8
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r8
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r8
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r7
                goto L5c
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.Api18Impl.<clinit>():void");
        }

        private Api18Impl() {
        }

        static Rect getOpticalInsets(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && sReflectionSuccessful) {
                try {
                    Object objInvoke = sGetOpticalInsets.invoke(drawable, new Object[0]);
                    if (objInvoke != null) {
                        return new Rect(sLeft.getInt(objInvoke), sTop.getInt(objInvoke), sRight.getInt(objInvoke), sBottom.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return DrawableUtils.INSETS_NONE;
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static Insets getOpticalInsets(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }
}
