package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    private static class OutlineCompatL {
        private OutlineCompatL() {
        }

        static void setConvexPath(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    private static class OutlineCompatR {
        private OutlineCompatR() {
        }

        static void setPath(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    private DrawableUtils() {
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable drawable, Drawable drawable2) {
        return compositeTwoLayeredDrawable(drawable, drawable2, -1, -1);
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable drawable, Drawable drawable2, int i2, int i3) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i2 == -1) {
            i2 = getTopLayerIntrinsicWidth(drawable, drawable2);
        }
        if (i3 == -1) {
            i3 = getTopLayerIntrinsicHeight(drawable, drawable2);
        }
        if (i2 > drawable.getIntrinsicWidth() || i3 > drawable.getIntrinsicHeight()) {
            float f2 = i2 / i3;
            if (f2 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                i2 = drawable.getIntrinsicWidth();
                i3 = (int) (i2 / f2);
            } else {
                i3 = drawable.getIntrinsicHeight();
                i2 = (int) (f2 * i3);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i2, i3);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable createTintableDrawableIfNeeded(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    public static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    private static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z2) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (mode != null) {
                DrawableCompat.setTintMode(drawable, mode);
            }
        } else if (z2) {
            drawable.mutate();
        }
        return drawable;
    }

    public static int[] getCheckedState(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 == 16842912) {
                return iArr;
            }
            if (i3 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i2] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static ColorStateList getColorStateListOrNull(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    private static int getTopLayerIntrinsicHeight(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int getTopLayerIntrinsicWidth(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    public static int[] getUncheckedState(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != 16842912) {
                iArr2[i2] = i3;
                i2++;
            }
        }
        return iArr2;
    }

    public static AttributeSet parseDrawableXml(Context context, int i2, CharSequence charSequence) {
        int next;
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd(".<3B@;7\u00028EEL>HO\n MMTFZW", (short) (C1607wl.Xd() ^ 28925))).getMethod(Xg.qd("+*:\u0019-<9@>03B", (short) (C1499aX.Xd() ^ (-7667)), (short) (C1499aX.Xd() ^ (-13923))), new Class[0]);
            try {
                method.setAccessible(true);
                XmlResourceParser xml = ((Resources) method.invoke(context, objArr)).getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), charSequence)) {
                        return Xml.asAttributeSet(xml);
                    }
                    throw new XmlPullParserException(Jg.Wd("T~|\u000exQJ\u000f](\tW\u0014", (short) (OY.Xd() ^ 9176), (short) (OY.Xd() ^ 13571)) + ((Object) charSequence) + ZO.xd("tD-i\u001bv\u001f&\u001c#T", (short) (FB.Xd() ^ 20032), (short) (FB.Xd() ^ 7197)));
                }
                short sXd = (short) (FB.Xd() ^ 32174);
                short sXd2 = (short) (FB.Xd() ^ 27533);
                int[] iArr = new int["Ijt\u001a[A\u000f%n\u000fTO\u0012#[{\rP".length()];
                QB qb = new QB("Ijt\u001a[A\u000f%n\u000fTO\u0012#[{\rP");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
                    i3++;
                }
                throw new XmlPullParserException(new String(iArr, 0, i3));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException | XmlPullParserException e3) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(Ig.wd("a83C\u0018\u0007w\u0012I(e\nZS!?4\u001b4x9u\u0013\u0006<x>o\u007f\u000fN7", (short) (C1499aX.Xd() ^ (-29410))) + Integer.toHexString(i2));
            notFoundException.initCause(e3);
            throw notFoundException;
        }
    }

    public static void setOutlineToPath(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            OutlineCompatR.setPath(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                OutlineCompatL.setConvexPath(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            OutlineCompatL.setConvexPath(outline, path);
        }
    }

    public static void setRippleDrawableRadius(RippleDrawable rippleDrawable, int i2) {
        rippleDrawable.setRadius(i2);
    }

    public static void setTint(Drawable drawable, int i2) {
        if (i2 != 0) {
            DrawableCompat.setTint(drawable, i2);
        } else {
            DrawableCompat.setTintList(drawable, null);
        }
    }

    public static PorterDuffColorFilter updateTintFilter(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
