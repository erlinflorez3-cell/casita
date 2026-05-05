package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextViewAutoSizeHelper {
    private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
    private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
    private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
    private static final String TAG = "ACTVAutoSizeHelper";
    static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1.0f;
    private static final int VERY_WIDE = 1048576;
    private final Context mContext;
    private final Impl mImpl;
    private TextPaint mTempTextPaint;
    private final TextView mTextView;
    private static final RectF TEMP_RECTF = new RectF();
    private static ConcurrentHashMap<String, Method> sTextViewMethodByNameCache = new ConcurrentHashMap<>();
    private int mAutoSizeTextType = 0;
    private boolean mNeedsAutoSizeText = false;
    private float mAutoSizeStepGranularityInPx = -1.0f;
    private float mAutoSizeMinTextSizeInPx = -1.0f;
    private float mAutoSizeMaxTextSizeInPx = -1.0f;
    private int[] mAutoSizeTextSizesInPx = new int[0];
    private boolean mHasPresetAutoSizeValues = false;

    /* JADX INFO: loaded from: classes2.dex */
    private static class Impl {
        void computeAndSetTextDirection(StaticLayout.Builder builder, TextView textView) {
        }

        Impl() {
        }

        boolean isHorizontallyScrollable(TextView textView) {
            return ((Boolean) AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(textView, "getHorizontallyScrolling", false)).booleanValue();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    private static class Impl23 extends Impl {
        Impl23() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class Impl29 extends Impl23 {
        Impl29() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        boolean isHorizontallyScrollable(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    AppCompatTextViewAutoSizeHelper(TextView textView) {
        this.mTextView = textView;
        this.mContext = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.mImpl = new Impl29();
        } else {
            this.mImpl = new Impl23();
        }
    }

    void loadFromAttributes(AttributeSet attributeSet, int i2) throws Throwable {
        int resourceId;
        Context context = this.mContext;
        int[] iArr = R.styleable.AppCompatTextView;
        Class<?> cls = Class.forName(Qg.kd("\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b Xl\u0018\u0016\u001b\u000b\u001d\u0018", (short) (C1633zX.Xd() ^ (-10260)), (short) (C1633zX.Xd() ^ (-7729))));
        Class<?>[] clsArr = {Class.forName(hg.Vd("\u0012\u001e\u0013 \u001c\u0015\u000fW\u001e\u001c\u0010\u0012Rd\u0017\u0016\u0013\t\u0001\u0013\u0011\u0001m~\r", (short) (C1633zX.Xd() ^ (-13970)), (short) (C1633zX.Xd() ^ (-20250)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), 0};
        Method method = cls.getMethod(C1561oA.ud("E7H4;?#CG91/\u000b=<9/'97'4", (short) (Od.Xd() ^ (-765))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            TextView textView = this.mTextView;
            ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), R.styleable.AppCompatTextView, attributeSet, typedArray, i2, 0);
            if (typedArray.hasValue(R.styleable.AppCompatTextView_autoSizeTextType)) {
                this.mAutoSizeTextType = typedArray.getInt(R.styleable.AppCompatTextView_autoSizeTextType, 0);
            }
            float dimension = typedArray.hasValue(R.styleable.AppCompatTextView_autoSizeStepGranularity) ? typedArray.getDimension(R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
            float dimension2 = typedArray.hasValue(R.styleable.AppCompatTextView_autoSizeMinTextSize) ? typedArray.getDimension(R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
            float dimension3 = typedArray.hasValue(R.styleable.AppCompatTextView_autoSizeMaxTextSize) ? typedArray.getDimension(R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
            if (typedArray.hasValue(R.styleable.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArray.getResourceId(R.styleable.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
                TypedArray typedArrayObtainTypedArray = typedArray.getResources().obtainTypedArray(resourceId);
                setupAutoSizeUniformPresetSizes(typedArrayObtainTypedArray);
                typedArrayObtainTypedArray.recycle();
            }
            typedArray.recycle();
            if (supportsAutoSizeText()) {
                if (this.mAutoSizeTextType == 1) {
                    if (!this.mHasPresetAutoSizeValues) {
                        Context context2 = this.mContext;
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(C1561oA.yd("\u001c(\u001d*&\u001f\u0019a\u0016!\u001f$\u0014\u001c!Y\u000e97<,>9", (short) (FB.Xd() ^ 19036))).getMethod(C1561oA.Yd("\u0019\u0018(\u0007\u001b*'.,\u001e!0", (short) (C1633zX.Xd() ^ (-16426))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            DisplayMetrics displayMetrics = ((Resources) method2.invoke(context2, objArr2)).getDisplayMetrics();
                            if (dimension2 == -1.0f) {
                                dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                            }
                            if (dimension3 == -1.0f) {
                                dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                            }
                            if (dimension == -1.0f) {
                                dimension = 1.0f;
                            }
                            validateAndSetAutoSizeTextTypeUniformConfiguration(dimension2, dimension3, dimension);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    setupAutoSizeText();
                    return;
                }
                return;
            }
            this.mAutoSizeTextType = 0;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    void setAutoSizeTextTypeWithDefaults(int i2) throws Throwable {
        if (supportsAutoSizeText()) {
            if (i2 == 0) {
                clearAutoSizeConfiguration();
                return;
            }
            if (i2 == 1) {
                Context context = this.mContext;
                Object[] objArr = new Object[0];
                Method method = Class.forName(EO.Od("z-\u0017\f\u0013i~RbA@\"av\u0003\u001dV\u001bT0[-\u0005", (short) (OY.Xd() ^ 16457))).getMethod(C1561oA.Qd("NKY6HUPUQABO", (short) (FB.Xd() ^ 19367)), new Class[0]);
                try {
                    method.setAccessible(true);
                    DisplayMetrics displayMetrics = ((Resources) method.invoke(context, objArr)).getDisplayMetrics();
                    validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (!setupAutoSizeText()) {
                        return;
                    }
                    autoSizeText();
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            short sXd = (short) (Od.Xd() ^ (-10374));
            short sXd2 = (short) (Od.Xd() ^ (-5113));
            int[] iArr = new int["Pjhlnwo\"dyyu4{r\u0005p,\u0002s\b\u00051\u0007\r\u0005zP7".length()];
            QB qb = new QB("Pjhlnwo\"dyyu4{r\u0005p,\u0002s\b\u00051\u0007\r\u0005zP7");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                i3++;
            }
            throw new IllegalArgumentException(new String(iArr, 0, i3) + i2);
        }
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws Throwable {
        if (supportsAutoSizeText()) {
            Context context = this.mContext;
            Class<?> cls = Class.forName(Xg.qd("'5,;940z1>>E7AH\u0003\u0019FFM?SP", (short) (ZN.Xd() ^ 9556), (short) (ZN.Xd() ^ 17003)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (OY.Xd() ^ 7521);
            short sXd2 = (short) (OY.Xd() ^ 7832);
            int[] iArr = new int["\u001cfQZHyA\"J\u0019>\u0017".length()];
            QB qb = new QB("\u001cfQZHyA\"J\u0019>\u0017");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(xuXd.CK(iKK) - ((i6 * sXd2) ^ sXd));
                i6++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i6), clsArr);
            try {
                method.setAccessible(true);
                DisplayMetrics displayMetrics = ((Resources) method.invoke(context, objArr)).getDisplayMetrics();
                validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
                if (setupAutoSizeText()) {
                    autoSizeText();
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) throws Throwable {
        if (supportsAutoSizeText()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    Context context = this.mContext;
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(ZO.xd("{j\u0002Ab|trO\u001c(#\u0016PL)\u0006\u0001L\u007fI\u0014t", (short) (ZN.Xd() ^ 24232), (short) (ZN.Xd() ^ 17126))).getMethod(C1626yg.Ud("\u0007Prm\u000bn]'O\u001e?\b", (short) (ZN.Xd() ^ 18864), (short) (ZN.Xd() ^ 31370)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        DisplayMetrics displayMetrics = ((Resources) method.invoke(context, objArr)).getDisplayMetrics();
                        for (int i3 = 0; i3 < length; i3++) {
                            iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArrCopyOf);
                if (!setupAutoSizeUniformPresetSizesConfiguration()) {
                    throw new IllegalArgumentException(Ig.wd("XB\u0013mOZaZX<7SYe4(mbUM\ri.@FWCCVQr\u00145/;", (short) (C1499aX.Xd() ^ (-30200))) + Arrays.toString(iArr));
                }
            } else {
                this.mHasPresetAutoSizeValues = false;
            }
            if (setupAutoSizeText()) {
                autoSizeText();
            }
        }
    }

    int getAutoSizeTextType() {
        return this.mAutoSizeTextType;
    }

    int getAutoSizeStepGranularity() {
        return Math.round(this.mAutoSizeStepGranularityInPx);
    }

    int getAutoSizeMinTextSize() {
        return Math.round(this.mAutoSizeMinTextSizeInPx);
    }

    int getAutoSizeMaxTextSize() {
        return Math.round(this.mAutoSizeMaxTextSizeInPx);
    }

    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextSizesInPx;
    }

    private void setupAutoSizeUniformPresetSizes(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr);
            setupAutoSizeUniformPresetSizesConfiguration();
        }
    }

    private boolean setupAutoSizeUniformPresetSizesConfiguration() {
        boolean z2 = this.mAutoSizeTextSizesInPx.length > 0;
        this.mHasPresetAutoSizeValues = z2;
        if (z2) {
            this.mAutoSizeTextType = 1;
            this.mAutoSizeMinTextSizeInPx = r4[0];
            this.mAutoSizeMaxTextSizeInPx = r4[r3 - 1];
            this.mAutoSizeStepGranularityInPx = -1.0f;
        }
        return z2;
    }

    private int[] cleanupAutoSizePresetSizes(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void validateAndSetAutoSizeTextTypeUniformConfiguration(float f2, float f3, float f4) throws IllegalArgumentException {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.mAutoSizeTextType = 1;
        this.mAutoSizeMinTextSizeInPx = f2;
        this.mAutoSizeMaxTextSizeInPx = f3;
        this.mAutoSizeStepGranularityInPx = f4;
        this.mHasPresetAutoSizeValues = false;
    }

    private boolean setupAutoSizeText() {
        if (supportsAutoSizeText() && this.mAutoSizeTextType == 1) {
            if (!this.mHasPresetAutoSizeValues || this.mAutoSizeTextSizesInPx.length == 0) {
                int iFloor = ((int) Math.floor((this.mAutoSizeMaxTextSizeInPx - this.mAutoSizeMinTextSizeInPx) / this.mAutoSizeStepGranularityInPx)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round(this.mAutoSizeMinTextSizeInPx + (i2 * this.mAutoSizeStepGranularityInPx));
                }
                this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr);
            }
            this.mNeedsAutoSizeText = true;
        } else {
            this.mNeedsAutoSizeText = false;
        }
        return this.mNeedsAutoSizeText;
    }

    void autoSizeText() {
        if (isAutoSizeEnabled()) {
            if (this.mNeedsAutoSizeText) {
                if (this.mTextView.getMeasuredHeight() > 0 && this.mTextView.getMeasuredWidth() > 0) {
                    int measuredWidth = this.mImpl.isHorizontallyScrollable(this.mTextView) ? 1048576 : (this.mTextView.getMeasuredWidth() - this.mTextView.getTotalPaddingLeft()) - this.mTextView.getTotalPaddingRight();
                    int height = (this.mTextView.getHeight() - this.mTextView.getCompoundPaddingBottom()) - this.mTextView.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = TEMP_RECTF;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float fFindLargestTextSizeWhichFits = findLargestTextSizeWhichFits(rectF);
                            if (fFindLargestTextSizeWhichFits != this.mTextView.getTextSize()) {
                                setTextSizeInternal(0, fFindLargestTextSizeWhichFits);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.mNeedsAutoSizeText = true;
        }
    }

    private void clearAutoSizeConfiguration() {
        this.mAutoSizeTextType = 0;
        this.mAutoSizeMinTextSizeInPx = -1.0f;
        this.mAutoSizeMaxTextSizeInPx = -1.0f;
        this.mAutoSizeStepGranularityInPx = -1.0f;
        this.mAutoSizeTextSizesInPx = new int[0];
        this.mNeedsAutoSizeText = false;
    }

    void setTextSizeInternal(int i2, float f2) {
        Resources system;
        Context context = this.mContext;
        if (context == null) {
            system = Resources.getSystem();
        } else {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("S_Ta]VP\u0019MXV[KSX\u0011%PNSCUP", (short) (FB.Xd() ^ 32597))).getMethod(C1561oA.Kd("\"!1\u0010$3075'*9", (short) (C1607wl.Xd() ^ 15254)), new Class[0]);
            try {
                method.setAccessible(true);
                system = (Resources) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        setRawTextSize(TypedValue.applyDimension(i2, f2, system.getDisplayMetrics()));
    }

    private void setRawTextSize(float f2) {
        if (f2 != this.mTextView.getPaint().getTextSize()) {
            this.mTextView.getPaint().setTextSize(f2);
            boolean zIsInLayout = this.mTextView.isInLayout();
            if (this.mTextView.getLayout() != null) {
                this.mNeedsAutoSizeText = false;
                try {
                    Method textViewMethod = getTextViewMethod("nullLayouts");
                    if (textViewMethod != null) {
                        textViewMethod.invoke(this.mTextView, new Object[0]);
                    }
                } catch (Exception e2) {
                }
                if (!zIsInLayout) {
                    this.mTextView.requestLayout();
                } else {
                    this.mTextView.forceLayout();
                }
                this.mTextView.invalidate();
            }
        }
    }

    private int findLargestTextSizeWhichFits(RectF rectF) {
        int length = this.mAutoSizeTextSizesInPx.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = 1;
        int i3 = length - 1;
        int i4 = 0;
        while (i2 <= i3) {
            int i5 = (i2 + i3) / 2;
            if (suggestedSizeFitsInSpace(this.mAutoSizeTextSizesInPx[i5], rectF)) {
                int i6 = i5 + 1;
                i4 = i2;
                i2 = i6;
            } else {
                i4 = i5 - 1;
                i3 = i4;
            }
        }
        return this.mAutoSizeTextSizesInPx[i4];
    }

    void initTempTextPaint(int i2) {
        TextPaint textPaint = this.mTempTextPaint;
        if (textPaint == null) {
            this.mTempTextPaint = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.mTempTextPaint.set(this.mTextView.getPaint());
        this.mTempTextPaint.setTextSize(i2);
    }

    StaticLayout createLayout(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        return Api23Impl.createStaticLayoutForMeasuring(charSequence, alignment, i2, i3, this.mTextView, this.mTempTextPaint, this.mImpl);
    }

    private boolean suggestedSizeFitsInSpace(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.mTextView.getText();
        TransformationMethod transformationMethod = this.mTextView.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.mTextView)) != null) {
            text = transformation;
        }
        int maxLines = this.mTextView.getMaxLines();
        initTempTextPaint(i2);
        StaticLayout staticLayoutCreateLayout = createLayout(text, (Layout.Alignment) invokeAndReturnWithDefault(this.mTextView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutCreateLayout.getLineCount() <= maxLines && staticLayoutCreateLayout.getLineEnd(staticLayoutCreateLayout.getLineCount() - 1) == text.length())) && ((float) staticLayoutCreateLayout.getHeight()) <= rectF.bottom;
    }

    static <T> T invokeAndReturnWithDefault(Object obj, String str, T t2) {
        try {
            t2 = (T) getTextViewMethod(str).invoke(obj, new Object[0]);
            return t2;
        } catch (Exception e2) {
            String str2 = "Failed to invoke TextView#" + str + "() method";
            return t2;
        }
    }

    private static Method getTextViewMethod(String str) {
        try {
            Method declaredMethod = sTextViewMethodByNameCache.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                sTextViewMethodByNameCache.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            String str2 = "Failed to retrieve TextView#" + str + "() method";
            return null;
        }
    }

    boolean isAutoSizeEnabled() {
        return supportsAutoSizeText() && this.mAutoSizeTextType != 0;
    }

    private boolean supportsAutoSizeText() {
        return !(this.mTextView instanceof AppCompatEditText);
    }

    private static final class Api23Impl {
        private Api23Impl() {
        }

        static StaticLayout createStaticLayoutForMeasuring(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3, TextView textView, TextPaint textPaint, Impl impl) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i3 == -1) {
                i3 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i3);
            try {
                impl.computeAndSetTextDirection(builderObtain, textView);
            } catch (ClassCastException unused) {
            }
            return builderObtain.build();
        }
    }
}
