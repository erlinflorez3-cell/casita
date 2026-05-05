package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.SystraceSection;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import com.facebook.yoga.YogaMeasureMode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class ReactTextView extends AppCompatTextView implements ReactCompoundView {
    private static final int DEFAULT_GRAVITY = 8388659;
    private static final ViewGroup.LayoutParams EMPTY_LAYOUT_PARAMS = new ViewGroup.LayoutParams(0, 0);
    private boolean mAdjustsFontSizeToFit;
    private boolean mContainsImages;
    private TextUtils.TruncateAt mEllipsizeLocation;
    private float mFontSize;
    private float mLetterSpacing;
    private int mLinkifyMaskType;
    private float mMinimumFontSize;
    private boolean mNotifyOnInlineViewLayout;
    private int mNumberOfLines;
    private Overflow mOverflow;
    private ReactViewBackgroundManager mReactBackgroundManager;
    private boolean mShouldAdjustSpannableFontSize;
    private Spannable mSpanned;
    private boolean mTextIsSelectable;

    /* JADX INFO: renamed from: com.facebook.react.views.text.ReactTextView$1 */
    class AnonymousClass1 implements Comparator {
        AnonymousClass1() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt(FirebaseAnalytics.Param.INDEX) - ((WritableMap) obj2).getInt(FirebaseAnalytics.Param.INDEX);
        }
    }

    public ReactTextView(Context context) {
        super(context);
        this.mOverflow = Overflow.VISIBLE;
        initView();
    }

    private void applyTextAttributes() {
        if (!Float.isNaN(this.mFontSize)) {
            setTextSize(0, this.mFontSize);
        }
        if (Float.isNaN(this.mLetterSpacing)) {
            return;
        }
        super.setLetterSpacing(this.mLetterSpacing);
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof TintContextWrapper ? (ReactContext) ((TintContextWrapper) context).getBaseContext() : (ReactContext) context;
    }

    private void initView() {
        ReactViewBackgroundManager reactViewBackgroundManager = this.mReactBackgroundManager;
        if (reactViewBackgroundManager != null) {
            reactViewBackgroundManager.cleanup();
        }
        this.mReactBackgroundManager = new ReactViewBackgroundManager(this);
        this.mNumberOfLines = Integer.MAX_VALUE;
        this.mAdjustsFontSizeToFit = false;
        this.mLinkifyMaskType = 0;
        this.mNotifyOnInlineViewLayout = false;
        this.mTextIsSelectable = false;
        this.mShouldAdjustSpannableFontSize = false;
        this.mEllipsizeLocation = TextUtils.TruncateAt.END;
        this.mFontSize = Float.NaN;
        this.mMinimumFontSize = Float.NaN;
        this.mLetterSpacing = 0.0f;
        this.mOverflow = Overflow.VISIBLE;
        this.mSpanned = null;
    }

    private static WritableMap inlineViewJson(int i2, int i3, int i4, int i5, int i6, int i7) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i2 == 8) {
            writableMapCreateMap.putString("visibility", "gone");
            writableMapCreateMap.putInt(FirebaseAnalytics.Param.INDEX, i3);
        } else if (i2 == 0) {
            writableMapCreateMap.putString("visibility", ViewProps.VISIBLE);
            writableMapCreateMap.putInt(FirebaseAnalytics.Param.INDEX, i3);
            writableMapCreateMap.putDouble("left", PixelUtil.toDIPFromPixel(i4));
            writableMapCreateMap.putDouble("top", PixelUtil.toDIPFromPixel(i5));
            writableMapCreateMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(i6));
            writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(i7));
        } else {
            writableMapCreateMap.putString("visibility", "unknown");
            writableMapCreateMap.putInt(FirebaseAnalytics.Param.INDEX, i3);
        }
        return writableMapCreateMap;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (ViewCompat.hasAccessibilityDelegate(this)) {
            AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(this);
            if (accessibilityDelegate instanceof ExploreByTouchHelper) {
                return ((ExploreByTouchHelper) accessibilityDelegate).dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    int getGravityHorizontal() {
        int gravity = getGravity();
        return (gravity + GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) - (gravity | GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK);
    }

    public Spannable getSpanned() {
        return this.mSpanned;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.mTextIsSelectable);
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onAttachedToWindow();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() throws Throwable {
        super.onDetachedFromWindow();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onDetachedFromWindow();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onDraw");
        try {
            if (this.mAdjustsFontSizeToFit && getSpanned() != null && this.mShouldAdjustSpannableFontSize) {
                this.mShouldAdjustSpannableFontSize = false;
                TextLayoutManager.adjustSpannableFontToFit(getSpanned(), getWidth(), YogaMeasureMode.EXACTLY, getHeight(), YogaMeasureMode.EXACTLY, this.mMinimumFontSize, this.mNumberOfLines, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL);
                setText(getSpanned());
            }
            if (!ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
                this.mReactBackgroundManager.maybeClipToPaddingBox(canvas);
            } else if (this.mOverflow != Overflow.VISIBLE) {
                BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
            }
            super.onDraw(canvas);
            systraceSection.close();
        } catch (Throwable th) {
            try {
                systraceSection.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onFinishTemporaryDetach();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x009f A[SYNTHETIC] */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r27, int r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onMeasure");
        try {
            super.onMeasure(i2, i3);
            systraceSection.close();
        } catch (Throwable th) {
            try {
                systraceSection.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onStartTemporaryDetach();
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float f2, float f3) {
        int i2;
        CharSequence text = getText();
        int id = getId();
        int i3 = (int) f2;
        int i4 = (int) f3;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i4);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i3 >= lineLeft && i3 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i3);
                ReactTagSpan[] reactTagSpanArr = (ReactTagSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ReactTagSpan.class);
                if (reactTagSpanArr != null) {
                    int length = text.length();
                    for (int i5 = 0; i5 < reactTagSpanArr.length; i5++) {
                        int spanStart = spanned.getSpanStart(reactTagSpanArr[i5]);
                        int spanEnd = spanned.getSpanEnd(reactTagSpanArr[i5]);
                        if (spanEnd >= offsetForHorizontal && (i2 = spanEnd - spanStart) <= length) {
                            id = reactTagSpanArr[i5].getReactTag();
                            length = i2;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                FLog.e(ReactConstants.TAG, "Crash in HorizontalMeasurementProvider: " + e2.getMessage());
            }
        }
        return id;
    }

    void recycleView() {
        initView();
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.reset(this);
        }
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        setJustificationMode(0);
        setLayoutParams(EMPTY_LAYOUT_PARAMS);
        super.setText((CharSequence) null);
        applyTextAttributes();
        setGravity(8388659);
        setNumberOfLines(this.mNumberOfLines);
        setAdjustFontSizeToFit(this.mAdjustsFontSizeToFit);
        setLinkifyMask(this.mLinkifyMaskType);
        setTextIsSelectable(this.mTextIsSelectable);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.mEllipsizeLocation);
        setEnabled(true);
        setFocusable(16);
        setHyphenationFrequency(0);
        updateView();
    }

    public void setAdjustFontSizeToFit(boolean z2) {
        this.mAdjustsFontSizeToFit = z2;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i2));
        } else {
            this.mReactBackgroundManager.setBackgroundColor(i2);
        }
    }

    public void setBorderColor(int i2, Integer num) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i2], num);
        } else {
            this.mReactBackgroundManager.setBorderColor(i2, num);
        }
    }

    public void setBorderRadius(float f2) {
        setBorderRadius(f2, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    public void setBorderRadius(float f2, int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i2], Float.isNaN(f2) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f2), LengthPercentageType.POINT));
        } else {
            this.mReactBackgroundManager.setBorderRadius(f2, i2);
        }
    }

    public void setBorderStyle(String str) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
        } else {
            this.mReactBackgroundManager.setBorderStyle(str);
        }
    }

    public void setBorderWidth(int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i2], Float.valueOf(PixelUtil.toDIPFromPixel(f2)));
        } else {
            this.mReactBackgroundManager.setBorderWidth(i2, f2);
        }
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i2) {
        super.setBreakStrategy(i2);
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.mEllipsizeLocation = truncateAt;
    }

    public void setFontSize(float f2) {
        this.mFontSize = (float) (this.mAdjustsFontSizeToFit ? Math.ceil(PixelUtil.toPixelFromSP(f2)) : Math.ceil(PixelUtil.toPixelFromDIP(f2)));
        applyTextAttributes();
    }

    void setGravityHorizontal(int i2) {
        if (i2 == 0) {
            i2 = GravityCompat.START;
        }
        int gravity = getGravity() & (-8388616);
        setGravity((i2 + gravity) - (i2 & gravity));
    }

    void setGravityVertical(int i2) {
        if (i2 == 0) {
            i2 = 48;
        }
        int gravity = getGravity();
        setGravity(i2 | ((gravity - 113) - (gravity | (-113))));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i2) {
        super.setHyphenationFrequency(i2);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z2) {
        super.setIncludeFontPadding(z2);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        this.mLetterSpacing = PixelUtil.toPixelFromDIP(f2) / this.mFontSize;
        applyTextAttributes();
    }

    public void setLinkifyMask(int i2) {
        this.mLinkifyMaskType = i2;
    }

    public void setMinimumFontSize(float f2) {
        this.mMinimumFontSize = f2;
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z2) {
        this.mNotifyOnInlineViewLayout = z2;
    }

    public void setNumberOfLines(int i2) {
        if (i2 == 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.mNumberOfLines = i2;
        setMaxLines(i2);
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.mOverflow = Overflow.VISIBLE;
        } else {
            Overflow overflowFromString = Overflow.fromString(str);
            if (overflowFromString == null) {
                overflowFromString = Overflow.VISIBLE;
            }
            this.mOverflow = overflowFromString;
        }
        this.mReactBackgroundManager.setOverflow(str);
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.mSpanned = spannable;
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setText(ReactTextUpdate reactTextUpdate) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.setText(ReactTextUpdate)");
        try {
            this.mContainsImages = reactTextUpdate.containsImages();
            if (getLayoutParams() == null) {
                setLayoutParams(EMPTY_LAYOUT_PARAMS);
            }
            Spannable text = reactTextUpdate.getText();
            int i2 = this.mLinkifyMaskType;
            if (i2 > 0) {
                Linkify.addLinks(text, i2);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(text);
            float paddingLeft = reactTextUpdate.getPaddingLeft();
            float paddingTop = reactTextUpdate.getPaddingTop();
            float paddingRight = reactTextUpdate.getPaddingRight();
            float paddingBottom = reactTextUpdate.getPaddingBottom();
            if (paddingLeft != -1.0f && paddingTop != -1.0f && paddingRight != -1.0f && paddingBottom != -1.0f) {
                setPadding((int) Math.floor(paddingLeft), (int) Math.floor(paddingTop), (int) Math.floor(paddingRight), (int) Math.floor(paddingBottom));
            }
            int textAlign = reactTextUpdate.getTextAlign();
            if (textAlign != getGravityHorizontal()) {
                setGravityHorizontal(textAlign);
            }
            if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
            }
            if (getJustificationMode() != reactTextUpdate.getJustificationMode()) {
                setJustificationMode(reactTextUpdate.getJustificationMode());
            }
            requestLayout();
            systraceSection.close();
        } catch (Throwable th) {
            try {
                systraceSection.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z2) {
        this.mTextIsSelectable = z2;
        super.setTextIsSelectable(z2);
    }

    public void updateView() {
        setEllipsize((this.mNumberOfLines == Integer.MAX_VALUE || this.mAdjustsFontSizeToFit) ? null : this.mEllipsizeLocation);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
