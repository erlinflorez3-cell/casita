package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class CustomSupport {
    private static final String TAG = "CustomSupport";

    private static int clamp(int c2) {
        int i2 = (c2 & (~(c2 >> 31))) - 255;
        return ((-1) - (((-1) - i2) | ((-1) - (i2 >> 31)))) + 255;
    }

    public static void setInterpolatedValue(ConstraintAttribute att, View view, float[] value) {
        Class<?> cls = view.getClass();
        String str = "set" + att.getName();
        try {
            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[att.getType().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) value[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(value[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iClamp = clamp((int) (((float) Math.pow(value[0], 0.45454545454545453d)) * 255.0f));
                    int iClamp2 = clamp((int) (((float) Math.pow(value[1], 0.45454545454545453d)) * 255.0f));
                    int iClamp3 = clamp((int) (((float) Math.pow(value[2], 0.45454545454545453d)) * 255.0f));
                    int iClamp4 = (-1) - (((-1) - (iClamp << 16)) & ((-1) - (clamp((int) (value[3] * 255.0f)) << 24)));
                    int i2 = iClamp2 << 8;
                    int i3 = ((iClamp4 + i2) - (iClamp4 & i2)) | iClamp3;
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(i3);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    Method method2 = cls.getMethod(str, Integer.TYPE);
                    int iClamp5 = clamp((int) (((float) Math.pow(value[0], 0.45454545454545453d)) * 255.0f));
                    int iClamp6 = clamp((int) (((float) Math.pow(value[1], 0.45454545454545453d)) * 255.0f));
                    int iClamp7 = clamp((int) (((float) Math.pow(value[2], 0.45454545454545453d)) * 255.0f));
                    int iClamp8 = clamp((int) (value[3] * 255.0f)) << 24;
                    int i4 = iClamp5 << 16;
                    method2.invoke(view, Integer.valueOf(((-1) - (((-1) - ((i4 + iClamp8) - (i4 & iClamp8))) & ((-1) - (iClamp6 << 8)))) | iClamp7));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + att.getName());
                case 6:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(value[0] > 0.5f));
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(value[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e2) {
            String str2 = "cannot access method " + str + " on View \"" + Debug.getName(view) + "\"";
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            String str3 = "no method " + str + " on View \"" + Debug.getName(view) + "\"";
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = iArr;
            try {
                iArr[ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
