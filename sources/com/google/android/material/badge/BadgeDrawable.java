package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.Locale;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;
    static final int BADGE_RADIUS_NOT_SPECIFIED = -1;

    @Deprecated
    public static final int BOTTOM_END = 8388693;

    @Deprecated
    public static final int BOTTOM_START = 8388691;
    static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    static final String DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX = "…";
    private static final int DEFAULT_STYLE = R.style.Widget_MaterialComponents_Badge;
    private static final int DEFAULT_THEME_ATTR = R.attr.badgeStyle;
    private static final float FONT_SCALE_THRESHOLD = 0.3f;
    static final int OFFSET_ALIGNMENT_MODE_EDGE = 0;
    static final int OFFSET_ALIGNMENT_MODE_LEGACY = 1;
    private static final String TAG = "Badge";
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    private WeakReference<View> anchorViewRef;
    private final Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final WeakReference<Context> contextRef;
    private float cornerRadius;
    private WeakReference<FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final MaterialShapeDrawable shapeDrawable;
    private final BadgeState state;
    private final TextDrawableHelper textDrawableHelper;

    /* JADX INFO: renamed from: com.google.android.material.badge.BadgeDrawable$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ View val$anchorView;
        final /* synthetic */ FrameLayout val$frameLayout;

        AnonymousClass1(View view, FrameLayout frameLayout) {
            view = view;
            frameLayout = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.updateBadgeCoordinates(view, frameLayout);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    private BadgeDrawable(Context context, int i2, int i3, int i4, BadgeState.State state) {
        this.contextRef = new WeakReference<>(context);
        ThemeEnforcement.checkMaterialTheme(context);
        this.badgeBounds = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i2, i3, i4, state);
        this.state = badgeState;
        this.shapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context, hasBadgeContent() ? badgeState.getBadgeWithTextShapeAppearanceResId() : badgeState.getBadgeShapeAppearanceResId(), hasBadgeContent() ? badgeState.getBadgeWithTextShapeAppearanceOverlayResId() : badgeState.getBadgeShapeAppearanceOverlayResId()).build());
        restoreState();
    }

    private void autoAdjustWithinGrandparentBounds(View view) {
        float y2;
        float x2;
        View customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            y2 = view.getY();
            x2 = view.getX();
            customBadgeParent = (View) view.getParent();
        } else if (!isAnchorViewWrappedInCompatParent()) {
            y2 = 0.0f;
            x2 = 0.0f;
        } else {
            if (!(customBadgeParent.getParent() instanceof View)) {
                return;
            }
            y2 = customBadgeParent.getY();
            x2 = customBadgeParent.getX();
            customBadgeParent = (View) customBadgeParent.getParent();
        }
        float topCutOff = getTopCutOff(customBadgeParent, y2);
        float leftCutOff = getLeftCutOff(customBadgeParent, x2);
        float bottomCutOff = getBottomCutOff(customBadgeParent, y2);
        float rightCutoff = getRightCutoff(customBadgeParent, x2);
        if (topCutOff < 0.0f) {
            this.badgeCenterY += Math.abs(topCutOff);
        }
        if (leftCutOff < 0.0f) {
            this.badgeCenterX += Math.abs(leftCutOff);
        }
        if (bottomCutOff > 0.0f) {
            this.badgeCenterY -= Math.abs(bottomCutOff);
        }
        if (rightCutoff > 0.0f) {
            this.badgeCenterX -= Math.abs(rightCutoff);
        }
    }

    private void calculateCenterAndBounds(Rect rect, View view) {
        float f2 = hasBadgeContent() ? this.state.badgeWithTextRadius : this.state.badgeRadius;
        this.cornerRadius = f2;
        if (f2 != -1.0f) {
            this.halfBadgeWidth = f2;
            this.halfBadgeHeight = f2;
        } else {
            this.halfBadgeWidth = Math.round((hasBadgeContent() ? this.state.badgeWithTextWidth : this.state.badgeWidth) / 2.0f);
            this.halfBadgeHeight = Math.round((hasBadgeContent() ? this.state.badgeWithTextHeight : this.state.badgeHeight) / 2.0f);
        }
        if (hasBadgeContent()) {
            String badgeContent = getBadgeContent();
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, (this.textDrawableHelper.getTextWidth(badgeContent) / 2.0f) + this.state.getBadgeHorizontalPadding());
            float fMax = Math.max(this.halfBadgeHeight, (this.textDrawableHelper.getTextHeight(badgeContent) / 2.0f) + this.state.getBadgeVerticalPadding());
            this.halfBadgeHeight = fMax;
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, fMax);
        }
        int totalVerticalOffsetForState = getTotalVerticalOffsetForState();
        int badgeGravity = this.state.getBadgeGravity();
        if (badgeGravity == 8388691 || badgeGravity == 8388693) {
            this.badgeCenterY = rect.bottom - totalVerticalOffsetForState;
        } else {
            this.badgeCenterY = rect.top + totalVerticalOffsetForState;
        }
        int totalHorizontalOffsetForState = getTotalHorizontalOffsetForState();
        int badgeGravity2 = this.state.getBadgeGravity();
        if (badgeGravity2 == 8388659 || badgeGravity2 == 8388691) {
            this.badgeCenterX = ViewCompat.getLayoutDirection(view) == 0 ? (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState : (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
        } else {
            this.badgeCenterX = ViewCompat.getLayoutDirection(view) == 0 ? (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState : (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState;
        }
        if (this.state.isAutoAdjustedToGrandparentBounds()) {
            autoAdjustWithinGrandparentBounds(view);
        }
    }

    public static BadgeDrawable create(Context context) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public static BadgeDrawable createFromResource(Context context, int i2) {
        return new BadgeDrawable(context, i2, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    static BadgeDrawable createFromSavedState(Context context, BadgeState.State state) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, state);
    }

    private void drawBadgeContent(Canvas canvas) {
        String badgeContent = getBadgeContent();
        if (badgeContent != null) {
            Rect rect = new Rect();
            this.textDrawableHelper.getTextPaint().getTextBounds(badgeContent, 0, badgeContent.length(), rect);
            float fExactCenterY = this.badgeCenterY - rect.exactCenterY();
            canvas.drawText(badgeContent, this.badgeCenterX, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.textDrawableHelper.getTextPaint());
        }
    }

    private String getBadgeContent() {
        if (hasText()) {
            return getTextBadgeText();
        }
        if (hasNumber()) {
            return getNumberBadgeText();
        }
        return null;
    }

    private float getBottomCutOff(View view, float f2) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.badgeCenterY + this.halfBadgeHeight) - (((View) view.getParent()).getHeight() - view.getY())) + f2;
    }

    private CharSequence getEmptyContentDescription() {
        return this.state.getContentDescriptionNumberless();
    }

    private float getLeftCutOff(View view, float f2) {
        return (this.badgeCenterX - this.halfBadgeWidth) + view.getX() + f2;
    }

    private String getNumberBadgeText() throws Throwable {
        if (this.maxBadgeNumber == -2 || getNumber() <= this.maxBadgeNumber) {
            return NumberFormat.getInstance(this.state.getNumberLocale()).format(getNumber());
        }
        Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        Locale numberLocale = this.state.getNumberLocale();
        int i2 = R.string.mtrl_exceed_max_badge_number_suffix;
        Class<?> cls = Class.forName(C1561oA.Kd("7E<KID@\u000bANNUGQX\u0013)VV]Oc`", (short) (C1499aX.Xd() ^ (-15393))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(Wg.Zd("\u007fBk\r\t1tT\u0010", (short) (C1633zX.Xd() ^ (-20944)), (short) (C1633zX.Xd() ^ (-4336))), clsArr);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            Integer numValueOf = Integer.valueOf(this.maxBadgeNumber);
            short sXd = (short) (OY.Xd() ^ 16331);
            int[] iArr = new int["=".length()];
            QB qb = new QB("=");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                i3++;
            }
            return String.format(numberLocale, str, numValueOf, new String(iArr, 0, i3));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private String getNumberContentDescription() throws Throwable {
        Context context;
        if (this.state.getContentDescriptionQuantityStrings() == 0 || (context = this.contextRef.get()) == null) {
            return null;
        }
        if (this.maxBadgeNumber != -2 && getNumber() > this.maxBadgeNumber) {
            int contentDescriptionExceedsMaxBadgeNumberStringResource = this.state.getContentDescriptionExceedsMaxBadgeNumberStringResource();
            Object[] objArr = {Integer.valueOf(this.maxBadgeNumber)};
            Class<?> cls = Class.forName(Wg.vd("/;4AA:8\u0001)46;/7@x!LNSGYX", (short) (C1580rY.Xd() ^ (-22921))));
            Class<?>[] clsArr = {Integer.TYPE, Object[].class};
            Object[] objArr2 = {Integer.valueOf(contentDescriptionExceedsMaxBadgeNumberStringResource), objArr};
            Method method = cls.getMethod(Qg.kd("mjxVvsime", (short) (ZN.Xd() ^ 12890), (short) (ZN.Xd() ^ 19603)), clsArr);
            try {
                method.setAccessible(true);
                return (String) method.invoke(context, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        short sXd = (short) (C1580rY.Xd() ^ (-5043));
        short sXd2 = (short) (C1580rY.Xd() ^ (-32165));
        int[] iArr = new int["\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014".length()];
        QB qb = new QB("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Object[] objArr3 = new Object[0];
        Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.ud("c`nK]jejfVWd", (short) (C1607wl.Xd() ^ 24125)), new Class[0]);
        try {
            method2.setAccessible(true);
            return ((Resources) method2.invoke(context, objArr3)).getQuantityString(this.state.getContentDescriptionQuantityStrings(), getNumber(), Integer.valueOf(getNumber()));
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private float getRightCutoff(View view, float f2) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.badgeCenterX + this.halfBadgeWidth) - (((View) view.getParent()).getWidth() - view.getX())) + f2;
    }

    private String getTextBadgeText() throws Throwable {
        String text = getText();
        int maxCharacterCount = getMaxCharacterCount();
        if (maxCharacterCount == -2 || text == null || text.length() <= maxCharacterCount) {
            return text;
        }
        Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        String strSubstring = text.substring(0, maxCharacterCount - 1);
        int i2 = R.string.m3_exceed_max_badge_text_suffix;
        Class<?> cls = Class.forName(C1561oA.yd("s\u007fx\u0006\u0006~|E}\t\u000b\u0010\u0004\f\u0015MEprwk}|", (short) (C1633zX.Xd() ^ (-29766))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(C1561oA.Yd("|{\fk\u000e\r\u0005\u000b\u0005", (short) (C1580rY.Xd() ^ (-16175))), clsArr);
        try {
            method.setAccessible(true);
            return String.format((String) method.invoke(context, objArr), strSubstring, Xg.qd("掀", (short) (Od.Xd() ^ (-1636)), (short) (Od.Xd() ^ (-16838))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private CharSequence getTextContentDescription() {
        CharSequence contentDescriptionForText = this.state.getContentDescriptionForText();
        return contentDescriptionForText != null ? contentDescriptionForText : getText();
    }

    private float getTopCutOff(View view, float f2) {
        return (this.badgeCenterY - this.halfBadgeHeight) + view.getY() + f2;
    }

    private int getTotalHorizontalOffsetForState() {
        int horizontalOffsetWithText = hasBadgeContent() ? this.state.getHorizontalOffsetWithText() : this.state.getHorizontalOffsetWithoutText();
        if (this.state.offsetAlignmentMode == 1) {
            horizontalOffsetWithText += hasBadgeContent() ? this.state.horizontalInsetWithText : this.state.horizontalInset;
        }
        return horizontalOffsetWithText + this.state.getAdditionalHorizontalOffset();
    }

    private int getTotalVerticalOffsetForState() {
        int verticalOffsetWithoutText = this.state.getVerticalOffsetWithoutText();
        if (hasBadgeContent()) {
            verticalOffsetWithoutText = this.state.getVerticalOffsetWithText();
            Context context = this.contextRef.get();
            if (context != null) {
                verticalOffsetWithoutText = AnimationUtils.lerp(verticalOffsetWithoutText, verticalOffsetWithoutText - this.state.getLargeFontVerticalOffsetAdjustment(), AnimationUtils.lerp(0.0f, 1.0f, FONT_SCALE_THRESHOLD, 1.0f, MaterialResources.getFontScale(context) - 1.0f));
            }
        }
        if (this.state.offsetAlignmentMode == 0) {
            verticalOffsetWithoutText -= Math.round(this.halfBadgeHeight);
        }
        return verticalOffsetWithoutText + this.state.getAdditionalVerticalOffset();
    }

    private boolean hasBadgeContent() {
        return hasText() || hasNumber();
    }

    private boolean isAnchorViewWrappedInCompatParent() {
        FrameLayout customBadgeParent = getCustomBadgeParent();
        return customBadgeParent != null && customBadgeParent.getId() == R.id.mtrl_anchor_parent;
    }

    private void onAlphaUpdated() {
        this.textDrawableHelper.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void onBackgroundColorUpdated() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.state.getBackgroundColor());
        if (this.shapeDrawable.getFillColor() != colorStateListValueOf) {
            this.shapeDrawable.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void onBadgeContentUpdated() {
        this.textDrawableHelper.setTextSizeDirty(true);
        onBadgeShapeAppearanceUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onBadgeGravityUpdated() {
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.anchorViewRef.get();
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        updateBadgeCoordinates(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void onBadgeShapeAppearanceUpdated() {
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        this.shapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder(context, hasBadgeContent() ? this.state.getBadgeWithTextShapeAppearanceResId() : this.state.getBadgeShapeAppearanceResId(), hasBadgeContent() ? this.state.getBadgeWithTextShapeAppearanceOverlayResId() : this.state.getBadgeShapeAppearanceOverlayResId()).build());
        invalidateSelf();
    }

    private void onBadgeTextAppearanceUpdated() {
        TextAppearance textAppearance;
        Context context = this.contextRef.get();
        if (context == null || this.textDrawableHelper.getTextAppearance() == (textAppearance = new TextAppearance(context, this.state.getTextAppearanceResId()))) {
            return;
        }
        this.textDrawableHelper.setTextAppearance(textAppearance, context);
        onBadgeTextColorUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onBadgeTextColorUpdated() {
        this.textDrawableHelper.getTextPaint().setColor(this.state.getBadgeTextColor());
        invalidateSelf();
    }

    private void onMaxBadgeLengthUpdated() {
        updateMaxBadgeNumber();
        this.textDrawableHelper.setTextSizeDirty(true);
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onNumberUpdated() {
        if (hasText()) {
            return;
        }
        onBadgeContentUpdated();
    }

    private void onTextUpdated() {
        onBadgeContentUpdated();
    }

    private void onVisibilityUpdated() {
        boolean zIsVisible = this.state.isVisible();
        setVisible(zIsVisible, false);
        if (!BadgeUtils.USE_COMPAT_PARENT || getCustomBadgeParent() == null || zIsVisible) {
            return;
        }
        ((ViewGroup) getCustomBadgeParent().getParent()).invalidate();
    }

    private void restoreState() {
        onBadgeShapeAppearanceUpdated();
        onBadgeTextAppearanceUpdated();
        onMaxBadgeLengthUpdated();
        onBadgeContentUpdated();
        onAlphaUpdated();
        onBackgroundColorUpdated();
        onBadgeTextColorUpdated();
        onBadgeGravityUpdated();
        updateCenterAndBounds();
        onVisibilityUpdated();
    }

    private void tryWrapAnchorInCompatParent(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
            if (weakReference == null || weakReference.get() != viewGroup) {
                updateAnchorParentToNotClip(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.customBadgeParentRef = new WeakReference<>(frameLayout);
                frameLayout.post(new Runnable() { // from class: com.google.android.material.badge.BadgeDrawable.1
                    final /* synthetic */ View val$anchorView;
                    final /* synthetic */ FrameLayout val$frameLayout;

                    AnonymousClass1(View view2, FrameLayout frameLayout2) {
                        view = view2;
                        frameLayout = frameLayout2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        BadgeDrawable.this.updateBadgeCoordinates(view, frameLayout);
                    }
                });
            }
        }
    }

    private static void updateAnchorParentToNotClip(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void updateCenterAndBounds() {
        Context context = this.contextRef.get();
        WeakReference<View> weakReference = this.anchorViewRef;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.badgeBounds);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || BadgeUtils.USE_COMPAT_PARENT) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        calculateCenterAndBounds(rect2, view);
        BadgeUtils.updateBadgeBounds(this.badgeBounds, this.badgeCenterX, this.badgeCenterY, this.halfBadgeWidth, this.halfBadgeHeight);
        float f2 = this.cornerRadius;
        if (f2 != -1.0f) {
            this.shapeDrawable.setCornerSize(f2);
        }
        if (rect.equals(this.badgeBounds)) {
            return;
        }
        this.shapeDrawable.setBounds(this.badgeBounds);
    }

    private void updateMaxBadgeNumber() {
        if (getMaxCharacterCount() != -2) {
            this.maxBadgeNumber = ((int) Math.pow(10.0d, ((double) getMaxCharacterCount()) - 1.0d)) - 1;
        } else {
            this.maxBadgeNumber = getMaxNumber();
        }
    }

    public void clearNumber() {
        if (this.state.hasNumber()) {
            this.state.clearNumber();
            onNumberUpdated();
        }
    }

    public void clearText() {
        if (this.state.hasText()) {
            this.state.clearText();
            onTextUpdated();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.shapeDrawable.draw(canvas);
        if (hasBadgeContent()) {
            drawBadgeContent(canvas);
        }
    }

    int getAdditionalHorizontalOffset() {
        return this.state.getAdditionalHorizontalOffset();
    }

    int getAdditionalVerticalOffset() {
        return this.state.getAdditionalVerticalOffset();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.state.getAlpha();
    }

    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.state.getBadgeGravity();
    }

    public Locale getBadgeNumberLocale() {
        return this.state.getNumberLocale();
    }

    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    public CharSequence getContentDescription() {
        if (isVisible()) {
            return hasText() ? getTextContentDescription() : hasNumber() ? getNumberContentDescription() : getEmptyContentDescription();
        }
        return null;
    }

    public FrameLayout getCustomBadgeParent() {
        WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public int getHorizontalOffsetWithText() {
        return this.state.getHorizontalOffsetWithText();
    }

    public int getHorizontalOffsetWithoutText() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public int getHorizontalPadding() {
        return this.state.getBadgeHorizontalPadding();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    public int getLargeFontVerticalOffsetAdjustment() {
        return this.state.getLargeFontVerticalOffsetAdjustment();
    }

    public int getMaxCharacterCount() {
        return this.state.getMaxCharacterCount();
    }

    public int getMaxNumber() {
        return this.state.getMaxNumber();
    }

    public int getNumber() {
        if (this.state.hasNumber()) {
            return this.state.getNumber();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    BadgeState.State getSavedState() {
        return this.state.getOverridingState();
    }

    public String getText() {
        return this.state.getText();
    }

    public int getVerticalOffset() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public int getVerticalOffsetWithText() {
        return this.state.getVerticalOffsetWithText();
    }

    public int getVerticalOffsetWithoutText() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public int getVerticalPadding() {
        return this.state.getBadgeVerticalPadding();
    }

    public boolean hasNumber() {
        return !this.state.hasText() && this.state.hasNumber();
    }

    public boolean hasText() {
        return this.state.hasText();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    void setAdditionalHorizontalOffset(int i2) {
        this.state.setAdditionalHorizontalOffset(i2);
        updateCenterAndBounds();
    }

    void setAdditionalVerticalOffset(int i2) {
        this.state.setAdditionalVerticalOffset(i2);
        updateCenterAndBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.state.setAlpha(i2);
        onAlphaUpdated();
    }

    public void setAutoAdjustToWithinGrandparentBounds(boolean z2) {
        if (this.state.isAutoAdjustedToGrandparentBounds() == z2) {
            return;
        }
        this.state.setAutoAdjustToGrandparentBounds(z2);
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        autoAdjustWithinGrandparentBounds(this.anchorViewRef.get());
    }

    public void setBackgroundColor(int i2) {
        this.state.setBackgroundColor(i2);
        onBackgroundColorUpdated();
    }

    public void setBadgeGravity(int i2) {
        if (i2 == 8388691 || i2 == 8388693) {
        }
        if (this.state.getBadgeGravity() != i2) {
            this.state.setBadgeGravity(i2);
            onBadgeGravityUpdated();
        }
    }

    public void setBadgeNumberLocale(Locale locale) {
        if (locale.equals(this.state.getNumberLocale())) {
            return;
        }
        this.state.setNumberLocale(locale);
        invalidateSelf();
    }

    public void setBadgeTextColor(int i2) {
        if (this.textDrawableHelper.getTextPaint().getColor() != i2) {
            this.state.setBadgeTextColor(i2);
            onBadgeTextColorUpdated();
        }
    }

    public void setBadgeWithTextShapeAppearance(int i2) {
        this.state.setBadgeWithTextShapeAppearanceResId(i2);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(int i2) {
        this.state.setBadgeWithTextShapeAppearanceOverlayResId(i2);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearance(int i2) {
        this.state.setBadgeShapeAppearanceResId(i2);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(int i2) {
        this.state.setBadgeShapeAppearanceOverlayResId(i2);
        onBadgeShapeAppearanceUpdated();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i2) {
        this.state.setContentDescriptionExceedsMaxBadgeNumberStringResource(i2);
    }

    public void setContentDescriptionForText(CharSequence charSequence) {
        this.state.setContentDescriptionForText(charSequence);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.state.setContentDescriptionNumberless(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(int i2) {
        this.state.setContentDescriptionQuantityStringsResource(i2);
    }

    public void setHorizontalOffset(int i2) {
        setHorizontalOffsetWithoutText(i2);
        setHorizontalOffsetWithText(i2);
    }

    public void setHorizontalOffsetWithText(int i2) {
        this.state.setHorizontalOffsetWithText(i2);
        updateCenterAndBounds();
    }

    public void setHorizontalOffsetWithoutText(int i2) {
        this.state.setHorizontalOffsetWithoutText(i2);
        updateCenterAndBounds();
    }

    public void setHorizontalPadding(int i2) {
        if (i2 != this.state.getBadgeHorizontalPadding()) {
            this.state.setBadgeHorizontalPadding(i2);
            updateCenterAndBounds();
        }
    }

    public void setLargeFontVerticalOffsetAdjustment(int i2) {
        this.state.setLargeFontVerticalOffsetAdjustment(i2);
        updateCenterAndBounds();
    }

    public void setMaxCharacterCount(int i2) {
        if (this.state.getMaxCharacterCount() != i2) {
            this.state.setMaxCharacterCount(i2);
            onMaxBadgeLengthUpdated();
        }
    }

    public void setMaxNumber(int i2) {
        if (this.state.getMaxNumber() != i2) {
            this.state.setMaxNumber(i2);
            onMaxBadgeLengthUpdated();
        }
    }

    public void setNumber(int i2) {
        int iMax = Math.max(0, i2);
        if (this.state.getNumber() != iMax) {
            this.state.setNumber(iMax);
            onNumberUpdated();
        }
    }

    public void setText(String str) {
        if (TextUtils.equals(this.state.getText(), str)) {
            return;
        }
        this.state.setText(str);
        onTextUpdated();
    }

    public void setTextAppearance(int i2) {
        this.state.setTextAppearanceResId(i2);
        onBadgeTextAppearanceUpdated();
    }

    public void setVerticalOffset(int i2) {
        setVerticalOffsetWithoutText(i2);
        setVerticalOffsetWithText(i2);
    }

    public void setVerticalOffsetWithText(int i2) {
        this.state.setVerticalOffsetWithText(i2);
        updateCenterAndBounds();
    }

    public void setVerticalOffsetWithoutText(int i2) {
        this.state.setVerticalOffsetWithoutText(i2);
        updateCenterAndBounds();
    }

    public void setVerticalPadding(int i2) {
        if (i2 != this.state.getBadgeVerticalPadding()) {
            this.state.setBadgeVerticalPadding(i2);
            updateCenterAndBounds();
        }
    }

    public void setVisible(boolean z2) {
        this.state.setVisible(z2);
        onVisibilityUpdated();
    }

    public void updateBadgeCoordinates(View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    @Deprecated
    public void updateBadgeCoordinates(View view, ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        updateBadgeCoordinates(view, (FrameLayout) viewGroup);
    }

    public void updateBadgeCoordinates(View view, FrameLayout frameLayout) {
        this.anchorViewRef = new WeakReference<>(view);
        if (BadgeUtils.USE_COMPAT_PARENT && frameLayout == null) {
            tryWrapAnchorInCompatParent(view);
        } else {
            this.customBadgeParentRef = new WeakReference<>(frameLayout);
        }
        if (!BadgeUtils.USE_COMPAT_PARENT) {
            updateAnchorParentToNotClip(view);
        }
        updateCenterAndBounds();
        invalidateSelf();
    }
}
