package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import yg.C1561oA;
import yg.C1607wl;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class TypedArrayUtils {
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";

    public static boolean hasAttribute(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(NAMESPACE, str) != null;
    }

    public static float getNamedFloat(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, float f2) {
        return !hasAttribute(xmlPullParser, str) ? f2 : typedArray.getFloat(i2, f2);
    }

    public static boolean getNamedBoolean(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, boolean z2) {
        return !hasAttribute(xmlPullParser, str) ? z2 : typedArray.getBoolean(i2, z2);
    }

    public static int getNamedInt(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !hasAttribute(xmlPullParser, str) ? i3 : typedArray.getInt(i2, i3);
    }

    public static int getNamedColor(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !hasAttribute(xmlPullParser, str) ? i3 : typedArray.getColor(i2, i3);
    }

    public static ComplexColorCompat getNamedComplexColor(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2, int i3) {
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return ComplexColorCompat.from(typedValue.data);
            }
            ComplexColorCompat complexColorCompatInflate = ComplexColorCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            if (complexColorCompatInflate != null) {
                return complexColorCompatInflate;
            }
        }
        return ComplexColorCompat.from(i3);
    }

    public static ColorStateList getNamedColorStateList(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        if (typedValue.type == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i2 + ": " + typedValue);
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return getNamedColorStateListFromInt(typedValue);
        }
        return ColorStateListInflaterCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
    }

    private static ColorStateList getNamedColorStateListFromInt(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static int getNamedResourceId(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !hasAttribute(xmlPullParser, str) ? i3 : typedArray.getResourceId(i2, i3);
    }

    public static String getNamedString(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    public static TypedValue peekNamedValue(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.peekValue(i2);
        }
        return null;
    }

    public static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean getBoolean(TypedArray typedArray, int i2, int i3, boolean z2) {
        return typedArray.getBoolean(i2, typedArray.getBoolean(i3, z2));
    }

    public static Drawable getDrawable(TypedArray typedArray, int i2, int i3) {
        Drawable drawable = typedArray.getDrawable(i2);
        return drawable == null ? typedArray.getDrawable(i3) : drawable;
    }

    public static int getInt(TypedArray typedArray, int i2, int i3, int i4) {
        return typedArray.getInt(i2, typedArray.getInt(i3, i4));
    }

    public static int getResourceId(TypedArray typedArray, int i2, int i3, int i4) {
        return typedArray.getResourceId(i2, typedArray.getResourceId(i3, i4));
    }

    public static String getString(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static CharSequence getText(TypedArray typedArray, int i2, int i3) {
        CharSequence text = typedArray.getText(i2);
        return text == null ? typedArray.getText(i3) : text;
    }

    public static CharSequence[] getTextArray(TypedArray typedArray, int i2, int i3) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        return textArray == null ? typedArray.getTextArray(i3) : textArray;
    }

    public static int getAttr(Context context, int i2, int i3) throws Throwable {
        TypedValue typedValue = new TypedValue();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("rB\u0006$w\u0002:\u0010\u0010,t\u000bF[/xtpm@K.8", (short) (ZN.Xd() ^ 29220), (short) (ZN.Xd() ^ 24993))).getMethod(C1561oA.Xd("zy\nj\u007f}\u0007\u007f", (short) (C1607wl.Xd() ^ 6177)), new Class[0]);
        try {
            method.setAccessible(true);
            ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(i2, typedValue, true);
            return typedValue.resourceId != 0 ? i2 : i3;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private TypedArrayUtils() {
    }
}
