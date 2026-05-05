package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class ConstraintAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    private static int clamp(int c2) {
        int i2 = ((-1) - (((-1) - c2) | ((-1) - (~(c2 >> 31))))) - 255;
        return ((-1) - (((-1) - i2) | ((-1) - (i2 >> 31)))) + 255;
    }

    public String getName() {
        return this.mName;
    }

    public boolean isMethod() {
        return this.mMethod;
    }

    public int getIntegerValue() {
        return this.mIntegerValue;
    }

    public float getFloatValue() {
        return this.mFloatValue;
    }

    public String getStringValue() {
        return this.mStringValue;
    }

    public boolean isBooleanValue() {
        return this.mBooleanValue;
    }

    public int getColorValue() {
        return this.mColorValue;
    }

    public AttributeType getType() {
        return this.mType;
    }

    public boolean isContinuous() {
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()];
        return (i2 == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    public void setFloatValue(float value) {
        this.mFloatValue = value;
    }

    public void setColorValue(int value) {
        this.mColorValue = value;
    }

    public void setIntValue(int value) {
        this.mIntegerValue = value;
    }

    public void setStringValue(String value) {
        this.mStringValue = value;
    }

    public int numberOfInterpolatedValues() {
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()];
        return (i2 == 4 || i2 == 5) ? 4 : 1;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case BOOLEAN_TYPE:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue;
            case DIMENSION_TYPE:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] ret) {
        switch (this.mType) {
            case BOOLEAN_TYPE:
                ret[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i2 = this.mColorValue;
                int i3 = i2 >> 24;
                int i4 = (i3 + 255) - (i3 | 255);
                int i5 = i2 >> 8;
                float fPow = (float) Math.pow(((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i5 + 255) - (i5 | 255)) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow(((-1) - (((-1) - i2) | ((-1) - 255))) / 255.0f, 2.2d);
                ret[0] = fPow;
                ret[1] = fPow2;
                ret[2] = fPow3;
                ret[3] = i4 / 255.0f;
                return;
            case INT_TYPE:
                ret[0] = this.mIntegerValue;
                return;
            case FLOAT_TYPE:
                ret[0] = this.mFloatValue;
                return;
            case DIMENSION_TYPE:
                ret[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] value) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = (int) value[0];
                return;
            case 2:
                this.mBooleanValue = ((double) value[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int iHSVToColor = Color.HSVToColor(value);
                this.mColorValue = iHSVToColor;
                int i2 = (-1) - (((-1) - iHSVToColor) | ((-1) - ViewCompat.MEASURED_SIZE_MASK));
                int iClamp = clamp((int) (value[3] * 255.0f)) << 24;
                this.mColorValue = (iClamp + i2) - (iClamp & i2);
                return;
            case 7:
                this.mFloatValue = value[0];
                return;
            case 8:
                this.mFloatValue = value[0];
                return;
            default:
                return;
        }
    }

    public boolean diff(ConstraintAttribute constraintAttribute) {
        if (constraintAttribute == null || this.mType != constraintAttribute.mType) {
            return false;
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                return this.mIntegerValue == constraintAttribute.mIntegerValue;
            case 2:
                return this.mBooleanValue == constraintAttribute.mBooleanValue;
            case 3:
                return this.mIntegerValue == constraintAttribute.mIntegerValue;
            case 4:
            case 5:
                return this.mColorValue == constraintAttribute.mColorValue;
            case 7:
                return this.mFloatValue == constraintAttribute.mFloatValue;
            case 8:
                return this.mFloatValue == constraintAttribute.mFloatValue;
            default:
                return false;
        }
    }

    public ConstraintAttribute(String name, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = name;
        this.mType = attributeType;
    }

    public ConstraintAttribute(String name, AttributeType attributeType, Object value, boolean method) {
        this.mName = name;
        this.mType = attributeType;
        this.mMethod = method;
        setValue(value);
    }

    public ConstraintAttribute(ConstraintAttribute source, Object value) {
        this.mMethod = false;
        this.mName = source.mName;
        this.mType = source.mType;
        setValue(value);
    }

    public void setValue(Object value) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = ((Integer) value).intValue();
                break;
            case 2:
                this.mBooleanValue = ((Boolean) value).booleanValue();
                break;
            case 3:
                this.mStringValue = (String) value;
                break;
            case 4:
            case 5:
                this.mColorValue = ((Integer) value).intValue();
                break;
            case 7:
                this.mFloatValue = ((Float) value).floatValue();
                break;
            case 8:
                this.mFloatValue = ((Float) value).floatValue();
                break;
        }
    }

    public static HashMap<String, ConstraintAttribute> extractAttributes(HashMap<String, ConstraintAttribute> base, View view) {
        HashMap<String, ConstraintAttribute> map = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : base.keySet()) {
            ConstraintAttribute constraintAttribute = base.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return map;
    }

    public static void setAttributes(View view, HashMap<String, ConstraintAttribute> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            String str2 = !constraintAttribute.mMethod ? "set" + str : str;
            try {
                switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[constraintAttribute.mType.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.mBooleanValue));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, constraintAttribute.mStringValue);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.mColorValue));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.mColorValue);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                }
            } catch (IllegalAccessException e2) {
                String str3 = " Custom Attribute \"" + str + "\" not found on " + cls.getName();
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.getMessage();
                String str4 = " Custom Attribute \"" + str + "\" not found on " + cls.getName();
                String str5 = cls.getName() + " must have a method " + str2;
            } catch (InvocationTargetException e4) {
                String str6 = " Custom Attribute \"" + str + "\" not found on " + cls.getName();
                e4.printStackTrace();
            }
        }
    }

    public void applyCustom(View view) {
        Class<?> cls = view.getClass();
        String str = this.mName;
        String str2 = !this.mMethod ? "set" + str : str;
        try {
            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[this.mType.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(this.mIntegerValue));
                    break;
                case 2:
                    cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(this.mBooleanValue));
                    break;
                case 3:
                    cls.getMethod(str2, CharSequence.class).invoke(view, this.mStringValue);
                    break;
                case 4:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(this.mColorValue));
                    break;
                case 5:
                    Method method = cls.getMethod(str2, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.mColorValue);
                    method.invoke(view, colorDrawable);
                    break;
                case 7:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(this.mFloatValue));
                    break;
                case 8:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(this.mFloatValue));
                    break;
            }
        } catch (IllegalAccessException e2) {
            String str3 = " Custom Attribute \"" + str + "\" not found on " + cls.getName();
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.getMessage();
            String str4 = " Custom Attribute \"" + str + "\" not found on " + cls.getName();
            String str5 = cls.getName() + " must have a method " + str2;
        } catch (InvocationTargetException e4) {
            String str6 = " Custom Attribute \"" + str + "\" not found on " + cls.getName();
            e4.printStackTrace();
        }
    }

    public static void parse(Context context, XmlPullParser parser, HashMap<String, ConstraintAttribute> custom) throws Throwable {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(parser);
        int[] iArr = R.styleable.CustomAttribute;
        Class<?> cls = Class.forName(C1561oA.Yd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=", (short) (Od.Xd() ^ (-8835))));
        Class<?>[] clsArr = {Class.forName(Xg.qd("Q_Vec^Z%mmcg*>rsrjdxxjYl|", (short) (C1633zX.Xd() ^ (-16301)), (short) (C1633zX.Xd() ^ (-14094)))), int[].class};
        Object[] objArr = {attributeSetAsAttributeSet, iArr};
        short sXd = (short) (FB.Xd() ^ 13089);
        short sXd2 = (short) (FB.Xd() ^ 2243);
        int[] iArr2 = new int[";=\u0011\u0001JQu\u0018`U\u0010\u000e,a%$ZU*,^n".length()];
        QB qb = new QB(";=\u0011\u0001JQu\u0018`U\u0010\u000e,a%$ZU*,^n");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int indexCount = typedArray.getIndexCount();
            String string = null;
            Object objValueOf = null;
            AttributeType attributeType = null;
            boolean z2 = false;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArray.getIndex(i3);
                if (index == R.styleable.CustomAttribute_attributeName) {
                    string = typedArray.getString(index);
                    if (string != null && string.length() > 0) {
                        string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                    }
                } else if (index == R.styleable.CustomAttribute_methodName) {
                    string = typedArray.getString(index);
                    z2 = true;
                } else if (index == R.styleable.CustomAttribute_customBoolean) {
                    objValueOf = Boolean.valueOf(typedArray.getBoolean(index, false));
                    attributeType = AttributeType.BOOLEAN_TYPE;
                } else if (index == R.styleable.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArray.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArray.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customPixelDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    float dimension = typedArray.getDimension(index, 0.0f);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(ZO.xd("b(M&\u0019hu-K\fsaED^\u0011]C\u0007\u0001y< ", (short) (C1633zX.Xd() ^ (-26836)), (short) (C1633zX.Xd() ^ (-23380)))).getMethod(C1626yg.Ud("L\u001cE'/dCK_\u0007h:", (short) (C1607wl.Xd() ^ 13476), (short) (C1607wl.Xd() ^ 5514)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        objValueOf = Float.valueOf(TypedValue.applyDimension(1, dimension, ((Resources) method2.invoke(context, objArr2)).getDisplayMetrics()));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else if (index == R.styleable.CustomAttribute_customDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArray.getDimension(index, 0.0f));
                } else if (index == R.styleable.CustomAttribute_customFloatValue) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArray.getFloat(index, Float.NaN));
                } else if (index == R.styleable.CustomAttribute_customIntegerValue) {
                    attributeType = AttributeType.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArray.getInteger(index, -1));
                } else if (index == R.styleable.CustomAttribute_customStringValue) {
                    attributeType = AttributeType.STRING_TYPE;
                    objValueOf = typedArray.getString(index);
                } else if (index == R.styleable.CustomAttribute_customReference) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = typedArray.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArray.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
            }
            if (string != null && objValueOf != null) {
                custom.put(string, new ConstraintAttribute(string, attributeType, objValueOf, z2));
            }
            typedArray.recycle();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
