package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes.dex */
public class TintTypedArray {
    private final Context mContext;
    private TypedValue mTypedValue;
    private final TypedArray mWrapped;

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        Object[] objArr = {attributeSet, iArr};
        Method method = Class.forName(C1561oA.od("YeZgc\\V\u001fS^\\aQY^\u0017+VTYI[V", (short) (C1499aX.Xd() ^ (-10130)))).getMethod(Wg.Zd("\u0006o\fQ|\u001a)a\tDX O\nd\u000b\u00156s\n=c", (short) (OY.Xd() ^ 9082), (short) (OY.Xd() ^ 725)), Class.forName(C1561oA.Kd("KYP_]XT\u001fgg]a$8lmld^rrdSfv", (short) (C1607wl.Xd() ^ 3308))), int[].class);
        try {
            method.setAccessible(true);
            return new TintTypedArray(context, (TypedArray) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        short sXd = (short) (OY.Xd() ^ 32746);
        int[] iArr2 = new int["SaXge`\\']jjqcmt/Erryk\u007f|".length()];
        QB qb = new QB("SaXge`\\']jjqcmt/Erryk\u007f|");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd + i4));
            i4++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i4));
        Class<?>[] clsArr = {Class.forName(Wg.vd("\u001d+\"1'\"\u001eh99/3m\u000267\u001e\u0016\u0010$\u001c\u000e|\u0010(", (short) (Od.Xd() ^ (-14242)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        short sXd2 = (short) (Od.Xd() ^ (-28100));
        short sXd3 = (short) (Od.Xd() ^ (-8754));
        int[] iArr3 = new int[")\u001b,\u0018\u001f#\u0007'+\u001d\u0015\u0013n! \u001d\u0013\u000b\u001d\u001b\u000b\u0018".length()];
        QB qb2 = new QB(")\u001b,\u0018\u001f#\u0007'+\u001d\u0015\u0013n! \u001d\u0013\u000b\u001d\u001b\u000b\u0018");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr3[i5] = xuXd2.fK(((sXd2 + i5) + xuXd2.CK(iKK2)) - sXd3);
            i5++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            return new TintTypedArray(context, (TypedArray) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static TintTypedArray obtainStyledAttributes(Context context, int i2, int[] iArr) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Qd("r~s\u0001|uo8lwuzjrw0Domrbto", (short) (C1580rY.Xd() ^ (-443))));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(i2), iArr};
        Method method = cls.getMethod(C1593ug.zd("ZNaOX^Dfl`ZZ8lmld^rrds", (short) (C1580rY.Xd() ^ (-19312)), (short) (C1580rY.Xd() ^ (-14189))), clsArr);
        try {
            method.setAccessible(true);
            return new TintTypedArray(context, (TypedArray) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private TintTypedArray(Context context, TypedArray typedArray) {
        this.mContext = context;
        this.mWrapped = typedArray;
    }

    public TypedArray getWrappedTypeArray() {
        return this.mWrapped;
    }

    public Drawable getDrawable(int i2) {
        int resourceId;
        if (this.mWrapped.hasValue(i2) && (resourceId = this.mWrapped.getResourceId(i2, 0)) != 0) {
            return AppCompatResources.getDrawable(this.mContext, resourceId);
        }
        return this.mWrapped.getDrawable(i2);
    }

    public Drawable getDrawableIfKnown(int i2) {
        int resourceId;
        if (!this.mWrapped.hasValue(i2) || (resourceId = this.mWrapped.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return AppCompatDrawableManager.get().getDrawable(this.mContext, resourceId, true);
    }

    public Typeface getFont(int i2, int i3, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.mWrapped.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        return ResourcesCompat.getFont(this.mContext, resourceId, this.mTypedValue, i3, fontCallback);
    }

    public int length() {
        return this.mWrapped.length();
    }

    public int getIndexCount() {
        return this.mWrapped.getIndexCount();
    }

    public int getIndex(int i2) {
        return this.mWrapped.getIndex(i2);
    }

    public Resources getResources() {
        return this.mWrapped.getResources();
    }

    public CharSequence getText(int i2) {
        return this.mWrapped.getText(i2);
    }

    public String getString(int i2) {
        return this.mWrapped.getString(i2);
    }

    public String getNonResourceString(int i2) {
        return this.mWrapped.getNonResourceString(i2);
    }

    public boolean getBoolean(int i2, boolean z2) {
        return this.mWrapped.getBoolean(i2, z2);
    }

    public int getInt(int i2, int i3) {
        return this.mWrapped.getInt(i2, i3);
    }

    public float getFloat(int i2, float f2) {
        return this.mWrapped.getFloat(i2, f2);
    }

    public int getColor(int i2, int i3) {
        return this.mWrapped.getColor(i2, i3);
    }

    public ColorStateList getColorStateList(int i2) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.mWrapped.hasValue(i2) || (resourceId = this.mWrapped.getResourceId(i2, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(this.mContext, resourceId)) == null) ? this.mWrapped.getColorStateList(i2) : colorStateList;
    }

    public int getInteger(int i2, int i3) {
        return this.mWrapped.getInteger(i2, i3);
    }

    public float getDimension(int i2, float f2) {
        return this.mWrapped.getDimension(i2, f2);
    }

    public int getDimensionPixelOffset(int i2, int i3) {
        return this.mWrapped.getDimensionPixelOffset(i2, i3);
    }

    public int getDimensionPixelSize(int i2, int i3) {
        return this.mWrapped.getDimensionPixelSize(i2, i3);
    }

    public int getLayoutDimension(int i2, String str) {
        return this.mWrapped.getLayoutDimension(i2, str);
    }

    public int getLayoutDimension(int i2, int i3) {
        return this.mWrapped.getLayoutDimension(i2, i3);
    }

    public float getFraction(int i2, int i3, int i4, float f2) {
        return this.mWrapped.getFraction(i2, i3, i4, f2);
    }

    public int getResourceId(int i2, int i3) {
        return this.mWrapped.getResourceId(i2, i3);
    }

    public CharSequence[] getTextArray(int i2) {
        return this.mWrapped.getTextArray(i2);
    }

    public boolean getValue(int i2, TypedValue typedValue) {
        return this.mWrapped.getValue(i2, typedValue);
    }

    public int getType(int i2) {
        return Api21Impl.getType(this.mWrapped, i2);
    }

    public boolean hasValue(int i2) {
        return this.mWrapped.hasValue(i2);
    }

    public TypedValue peekValue(int i2) {
        return this.mWrapped.peekValue(i2);
    }

    public String getPositionDescription() {
        return this.mWrapped.getPositionDescription();
    }

    public void recycle() {
        this.mWrapped.recycle();
    }

    public int getChangingConfigurations() {
        return Api21Impl.getChangingConfigurations(this.mWrapped);
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static int getType(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }

        static int getChangingConfigurations(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }
    }
}
