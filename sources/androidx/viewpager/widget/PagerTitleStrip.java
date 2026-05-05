package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {
    private static final float SIDE_ALPHA = 0.6f;
    private static final int TEXT_SPACING = 16;
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference<PagerAdapter> mWatchingAdapter;
    private static final int[] ATTRS = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] TEXT_ATTRS = {R.attr.textAllCaps};

    private static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        private Locale mLocale;

        SingleLineAllCapsTransform(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd("SaXge`\\']jjqcmt/Erryk\u007f|", (short) (C1499aX.Xd() ^ (-22724)))).getMethod(Xg.qd("ihxWkzw~|nq\u0001", (short) (ZN.Xd() ^ 22379), (short) (ZN.Xd() ^ 16543)), new Class[0]);
            try {
                method.setAccessible(true);
                this.mLocale = ((Resources) method.invoke(context, objArr)).getConfiguration().locale;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.mLocale);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.mLastKnownCurrentPage = -1;
        this.mLastKnownPositionOffset = -1.0f;
        this.mPageListener = new PageListener();
        TextView textView = new TextView(context);
        this.mPrevText = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.mCurrText = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.mNextText = textView3;
        addView(textView3);
        Object[] objArr = {attributeSet, ATTRS};
        Method method = Class.forName(C1561oA.od(".:/<81+s(316&.3k\u007f+).\u001e0+", (short) (FB.Xd() ^ 1851))).getMethod(Wg.Zd("LiP!\u001e\u0007@EzA\u000fqCZ/\u0011@|tg=\u001f", (short) (C1633zX.Xd() ^ (-20749)), (short) (C1633zX.Xd() ^ (-23020))), Class.forName(C1561oA.Kd("1?6EC>:\u0005MMCG\n\u001eRSRJDXXJ9L\\", (short) (ZN.Xd() ^ 7766))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            boolean z2 = false;
            int resourceId = typedArray.getResourceId(0, 0);
            if (resourceId != 0) {
                TextViewCompat.setTextAppearance(this.mPrevText, resourceId);
                TextViewCompat.setTextAppearance(this.mCurrText, resourceId);
                TextViewCompat.setTextAppearance(this.mNextText, resourceId);
            }
            int dimensionPixelSize = typedArray.getDimensionPixelSize(1, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, dimensionPixelSize);
            }
            if (typedArray.hasValue(2)) {
                int color = typedArray.getColor(2, 0);
                this.mPrevText.setTextColor(color);
                this.mCurrText.setTextColor(color);
                this.mNextText.setTextColor(color);
            }
            this.mGravity = typedArray.getInteger(3, 80);
            typedArray.recycle();
            this.mTextColor = this.mCurrText.getTextColors().getDefaultColor();
            setNonPrimaryAlpha(0.6f);
            this.mPrevText.setEllipsize(TextUtils.TruncateAt.END);
            this.mCurrText.setEllipsize(TextUtils.TruncateAt.END);
            this.mNextText.setEllipsize(TextUtils.TruncateAt.END);
            if (resourceId != 0) {
                int[] iArr = TEXT_ATTRS;
                Class<?> cls = Class.forName(C1561oA.Xd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u000b\u0018\u0018\u001f\u0011\u001b\"\\r  '\u0019-*", (short) (FB.Xd() ^ 31041)));
                Class<?>[] clsArr = {Integer.TYPE, int[].class};
                Object[] objArr2 = {Integer.valueOf(resourceId), iArr};
                Method method2 = cls.getMethod(Wg.vd("OAVBMQ9YQC?=\u001dOROYQgeYf", (short) (FB.Xd() ^ 27173)), clsArr);
                try {
                    method2.setAccessible(true);
                    TypedArray typedArray2 = (TypedArray) method2.invoke(context, objArr2);
                    z2 = typedArray2.getBoolean(0, false);
                    typedArray2.recycle();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (z2) {
                setSingleLineAllCaps(this.mPrevText);
                setSingleLineAllCaps(this.mCurrText);
                setSingleLineAllCaps(this.mNextText);
            } else {
                this.mPrevText.setSingleLine();
                this.mCurrText.setSingleLine();
                this.mNextText.setSingleLine();
            }
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(Qg.kd("htivrke.bmkp`hm&:echXje", (short) (C1580rY.Xd() ^ (-26001)), (short) (C1580rY.Xd() ^ (-23929)))).getMethod(hg.Vd("A>L);HCHD45B", (short) (C1633zX.Xd() ^ (-19584)), (short) (C1633zX.Xd() ^ (-11587))), new Class[0]);
            try {
                method3.setAccessible(true);
                this.mScaledTextSpacing = (int) (((Resources) method3.invoke(context, objArr3)).getDisplayMetrics().density * 16.0f);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public void setTextSpacing(int i2) {
        this.mScaledTextSpacing = i2;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }

    public void setNonPrimaryAlpha(float f2) {
        int i2 = (-1) - (((-1) - ((int) (f2 * 255.0f))) | ((-1) - 255));
        this.mNonPrimaryAlpha = i2;
        int i3 = i2 << 24;
        int i4 = (-1) - (((-1) - this.mTextColor) | ((-1) - ViewCompat.MEASURED_SIZE_MASK));
        int i5 = (i3 + i4) - (i3 & i4);
        this.mPrevText.setTextColor(i5);
        this.mNextText.setTextColor(i5);
    }

    public void setTextColor(int i2) {
        this.mTextColor = i2;
        this.mCurrText.setTextColor(i2);
        int i3 = (this.mNonPrimaryAlpha << 24) | (this.mTextColor & ViewCompat.MEASURED_SIZE_MASK);
        this.mPrevText.setTextColor(i3);
        this.mNextText.setTextColor(i3);
    }

    public void setTextSize(int i2, float f2) {
        this.mPrevText.setTextSize(i2, f2);
        this.mCurrText.setTextSize(i2, f2);
        this.mNextText.setTextSize(i2, f2);
    }

    public void setGravity(int i2) {
        this.mGravity = i2;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(this.mPageListener);
        viewPager.addOnAdapterChangeListener(this.mPageListener);
        this.mPager = viewPager;
        WeakReference<PagerAdapter> weakReference = this.mWatchingAdapter;
        updateAdapter(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            updateAdapter(viewPager.getAdapter(), null);
            this.mPager.setInternalPageChangeListener(null);
            this.mPager.removeOnAdapterChangeListener(this.mPageListener);
            this.mPager = null;
        }
    }

    void updateText(int i2, PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.mUpdatingText = true;
        CharSequence pageTitle = null;
        this.mPrevText.setText((i2 < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i2 - 1));
        this.mCurrText.setText((pagerAdapter == null || i2 >= count) ? null : pagerAdapter.getPageTitle(i2));
        int i3 = i2 + 1;
        if (i3 < count && pagerAdapter != null) {
            pageTitle = pagerAdapter.getPageTitle(i3);
        }
        this.mNextText.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.mPrevText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mCurrText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mNextText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mLastKnownCurrentPage = i2;
        if (!this.mUpdatingPositions) {
            updateTextPositions(i2, this.mLastKnownPositionOffset, false);
        }
        this.mUpdatingText = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mUpdatingText) {
            return;
        }
        super.requestLayout();
    }

    void updateAdapter(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            this.mLastKnownCurrentPage = -1;
            this.mLastKnownPositionOffset = -1.0f;
            updateText(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    void updateTextPositions(int i2, float f2, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (i2 != this.mLastKnownCurrentPage) {
            updateText(i2, this.mPager.getAdapter());
        } else if (!z2 && f2 == this.mLastKnownPositionOffset) {
            return;
        }
        this.mUpdatingPositions = true;
        int measuredWidth = this.mPrevText.getMeasuredWidth();
        int measuredWidth2 = this.mCurrText.getMeasuredWidth();
        int measuredWidth3 = this.mNextText.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i10 = ((width - i8) - ((int) (i9 * f3))) - i7;
        int i11 = measuredWidth2 + i10;
        int baseline = this.mPrevText.getBaseline();
        int baseline2 = this.mCurrText.getBaseline();
        int baseline3 = this.mNextText.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i12 = iMax - baseline;
        int i13 = iMax - baseline2;
        int i14 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.mPrevText.getMeasuredHeight() + i12, this.mCurrText.getMeasuredHeight() + i13), this.mNextText.getMeasuredHeight() + i14);
        int i15 = this.mGravity;
        int i16 = (i15 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i15 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        if (i16 == 16) {
            i3 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else if (i16 == 80) {
            i3 = (height - paddingBottom) - iMax2;
        } else {
            i4 = i12 + paddingTop;
            i5 = i13 + paddingTop;
            i6 = paddingTop + i14;
            TextView textView = this.mCurrText;
            textView.layout(i10, i5, i11, textView.getMeasuredHeight() + i5);
            int iMin = Math.min(paddingLeft, (i10 - this.mScaledTextSpacing) - measuredWidth);
            TextView textView2 = this.mPrevText;
            textView2.layout(iMin, i4, measuredWidth + iMin, textView2.getMeasuredHeight() + i4);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i11 + this.mScaledTextSpacing);
            TextView textView3 = this.mNextText;
            textView3.layout(iMax3, i6, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i6);
            this.mLastKnownPositionOffset = f2;
            this.mUpdatingPositions = false;
        }
        i4 = i12 + i3;
        i5 = i13 + i3;
        i6 = i3 + i14;
        TextView textView4 = this.mCurrText;
        textView4.layout(i10, i5, i11, textView4.getMeasuredHeight() + i5);
        int iMin2 = Math.min(paddingLeft, (i10 - this.mScaledTextSpacing) - measuredWidth);
        TextView textView22 = this.mPrevText;
        textView22.layout(iMin2, i4, measuredWidth + iMin2, textView22.getMeasuredHeight() + i4);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i11 + this.mScaledTextSpacing);
        TextView textView32 = this.mNextText;
        textView32.layout(iMax32, i6, iMax32 + measuredWidth3, textView32.getMeasuredHeight() + i6);
        this.mLastKnownPositionOffset = f2;
        this.mUpdatingPositions = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMax;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i3, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i2);
        int childMeasureSpec2 = getChildMeasureSpec(i2, (int) (size * 0.2f), -2);
        this.mPrevText.measure(childMeasureSpec2, childMeasureSpec);
        this.mCurrText.measure(childMeasureSpec2, childMeasureSpec);
        this.mNextText.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i3);
        } else {
            iMax = Math.max(getMinHeight(), this.mCurrText.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i3, this.mCurrText.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.mPager != null) {
            float f2 = this.mLastKnownPositionOffset;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            updateTextPositions(this.mLastKnownCurrentPage, f2, true);
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    private class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        private int mScrollState;

        PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
            if (f2 > 0.5f) {
                i2++;
            }
            PagerTitleStrip.this.updateTextPositions(i2, f2, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
            Callback.onPageSelected_enter(i2);
            try {
                if (this.mScrollState == 0) {
                    PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                    pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
                    float f2 = PagerTitleStrip.this.mLastKnownPositionOffset >= 0.0f ? PagerTitleStrip.this.mLastKnownPositionOffset : 0.0f;
                    PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                    pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f2, true);
                }
            } finally {
                Callback.onPageSelected_exit();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
            this.mScrollState = i2;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.updateAdapter(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
            float f2 = PagerTitleStrip.this.mLastKnownPositionOffset >= 0.0f ? PagerTitleStrip.this.mLastKnownPositionOffset : 0.0f;
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f2, true);
        }
    }
}
