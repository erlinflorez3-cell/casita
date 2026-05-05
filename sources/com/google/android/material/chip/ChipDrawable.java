package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private int alpha;
    private boolean checkable;
    private Drawable checkedIcon;
    private ColorStateList checkedIconTint;
    private boolean checkedIconVisible;
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;
    private Drawable chipIcon;
    private float chipIconSize;
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;
    private ColorStateList chipSurfaceColor;
    private Drawable closeIcon;
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;
    private ColorFilter colorFilter;
    private ColorStateList compatRippleColor;
    private final Context context;
    private boolean currentChecked;
    private int currentChipBackgroundColor;
    private int currentChipStrokeColor;
    private int currentChipSurfaceColor;
    private int currentCompatRippleColor;
    private int currentCompositeSurfaceBackgroundColor;
    private int currentTextColor;
    private int currentTint;
    private final Paint debugPaint;
    private WeakReference<Delegate> delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;
    private MotionSpec showMotionSpec;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;
    private ColorStateList tint;
    private PorterDuffColorFilter tintFilter;
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;
    private static final int[] DEFAULT_STATE = {R.attr.state_enabled};
    private static final ShapeDrawable closeIconRippleMask = new ShapeDrawable(new OvalShape());

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private ChipDrawable(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        super(context, attributeSet, i2, i3);
        this.chipCornerRadius = -1.0f;
        this.chipPaint = new Paint(1);
        this.fontMetrics = new Paint.FontMetrics();
        this.rectF = new RectF();
        this.pointF = new PointF();
        this.shapePath = new Path();
        this.alpha = 255;
        this.tintMode = PorterDuff.Mode.SRC_IN;
        this.delegate = new WeakReference<>(null);
        initializeElevationOverlay(context);
        this.context = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.text = "";
        TextPaint textPaint = textDrawableHelper.getTextPaint();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("9G:IC>6\u00013@<C1;>x\u000b84;)=6", (short) (C1633zX.Xd() ^ (-14134)))).getMethod(Qg.kd("(%3\u0010\"/*/+\u001b\u001c)", (short) (ZN.Xd() ^ 7129), (short) (ZN.Xd() ^ 1715)), new Class[0]);
        try {
            method.setAccessible(true);
            textPaint.density = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
            this.debugPaint = null;
            int[] iArr = DEFAULT_STATE;
            setState(iArr);
            setCloseIconState(iArr);
            this.shouldDrawText = true;
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                closeIconRippleMask.setTint(-1);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void applyChildDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.closeIcon) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            DrawableCompat.setTintList(drawable, this.closeIconTint);
            return;
        }
        Drawable drawable2 = this.chipIcon;
        if (drawable == drawable2 && this.hasChipIconTint) {
            DrawableCompat.setTintList(drawable2, this.chipIconTint);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void calculateChipIconBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (showsChipIcon() || showsCheckedIcon()) {
            float f2 = this.chipStartPadding + this.iconStartPadding;
            float currentChipIconWidth = getCurrentChipIconWidth();
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + f2;
                rectF.right = rectF.left + currentChipIconWidth;
            } else {
                rectF.right = rect.right - f2;
                rectF.left = rectF.right - currentChipIconWidth;
            }
            float currentChipIconHeight = getCurrentChipIconHeight();
            rectF.top = rect.exactCenterY() - (currentChipIconHeight / 2.0f);
            rectF.bottom = rectF.top + currentChipIconHeight;
        }
    }

    private void calculateChipTouchBounds(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (showsCloseIcon()) {
            float f2 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = rect.right - f2;
            } else {
                rectF.left = rect.left + f2;
            }
        }
    }

    private void calculateCloseIconBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f2 = this.chipEndPadding + this.closeIconEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = rect.right - f2;
                rectF.left = rectF.right - this.closeIconSize;
            } else {
                rectF.left = rect.left + f2;
                rectF.right = rectF.left + this.closeIconSize;
            }
            rectF.top = rect.exactCenterY() - (this.closeIconSize / 2.0f);
            rectF.bottom = rectF.top + this.closeIconSize;
        }
    }

    private void calculateCloseIconTouchBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f2 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = rect.right;
                rectF.left = rectF.right - f2;
            } else {
                rectF.left = rect.left;
                rectF.right = rect.left + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void calculateTextBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.text != null) {
            float fCalculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            float fCalculateCloseIconWidth = this.chipEndPadding + calculateCloseIconWidth() + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + fCalculateChipIconWidth;
                rectF.right = rect.right - fCalculateCloseIconWidth;
            } else {
                rectF.left = rect.left + fCalculateCloseIconWidth;
                rectF.right = rect.right - fCalculateChipIconWidth;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        return (this.fontMetrics.descent + this.fontMetrics.ascent) / 2.0f;
    }

    private boolean canShowCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.checkable;
    }

    public static ChipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i2, int i3) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i2, i3);
        chipDrawable.loadFromAttributes(attributeSet, i2, i3);
        return chipDrawable;
    }

    public static ChipDrawable createFromResource(Context context, int i2) {
        AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i2, "chip");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, drawableXml, com.google.android.material.R.attr.chipStandaloneStyle, styleAttribute);
    }

    private void drawCheckedIcon(Canvas canvas, Rect rect) {
        if (showsCheckedIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            float f2 = this.rectF.left;
            float f3 = this.rectF.top;
            canvas.translate(f2, f3);
            this.checkedIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.checkedIcon.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void drawChipBackground(Canvas canvas, Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipBackgroundColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.chipPaint.setColorFilter(getTintColorFilter());
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawChipIcon(Canvas canvas, Rect rect) {
        if (showsChipIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            float f2 = this.rectF.left;
            float f3 = this.rectF.top;
            canvas.translate(f2, f3);
            this.chipIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.chipIcon.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void drawChipStroke(Canvas canvas, Rect rect) {
        if (this.chipStrokeWidth <= 0.0f || this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipStrokeColor);
        this.chipPaint.setStyle(Paint.Style.STROKE);
        if (!this.isShapeThemingEnabled) {
            this.chipPaint.setColorFilter(getTintColorFilter());
        }
        this.rectF.set(rect.left + (this.chipStrokeWidth / 2.0f), rect.top + (this.chipStrokeWidth / 2.0f), rect.right - (this.chipStrokeWidth / 2.0f), rect.bottom - (this.chipStrokeWidth / 2.0f));
        float f2 = this.chipCornerRadius - (this.chipStrokeWidth / 2.0f);
        canvas.drawRoundRect(this.rectF, f2, f2, this.chipPaint);
    }

    private void drawChipSurface(Canvas canvas, Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipSurfaceColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawCloseIcon(Canvas canvas, Rect rect) {
        if (showsCloseIcon()) {
            calculateCloseIconBounds(rect, this.rectF);
            float f2 = this.rectF.left;
            float f3 = this.rectF.top;
            canvas.translate(f2, f3);
            this.closeIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.closeIconRipple.setBounds(this.closeIcon.getBounds());
                this.closeIconRipple.jumpToCurrentState();
                this.closeIconRipple.draw(canvas);
            } else {
                this.closeIcon.draw(canvas);
            }
            canvas.translate(-f2, -f3);
        }
    }

    private void drawCompatRipple(Canvas canvas, Rect rect) {
        this.chipPaint.setColor(this.currentCompatRippleColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        if (!this.isShapeThemingEnabled) {
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        } else {
            calculatePathForSize(new RectF(rect), this.shapePath);
            super.drawShape(canvas, this.chipPaint, this.shapePath, getBoundsAsRectF());
        }
    }

    private void drawDebug(Canvas canvas, Rect rect) {
        Paint paint = this.debugPaint;
        if (paint != null) {
            paint.setColor(ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, 127));
            canvas.drawRect(rect, this.debugPaint);
            if (showsChipIcon() || showsCheckedIcon()) {
                calculateChipIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            if (this.text != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.debugPaint);
            }
            if (showsCloseIcon()) {
                calculateCloseIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(SupportMenu.CATEGORY_MASK, 127));
            calculateChipTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(-16711936, 127));
            calculateCloseIconTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
        }
    }

    private void drawText(Canvas canvas, Rect rect) throws Throwable {
        if (this.text != null) {
            Paint.Align alignCalculateTextOriginAndAlignment = calculateTextOriginAndAlignment(rect, this.pointF);
            calculateTextBounds(rect, this.rectF);
            if (this.textDrawableHelper.getTextAppearance() != null) {
                this.textDrawableHelper.getTextPaint().drawableState = getState();
                this.textDrawableHelper.updateTextPaintDrawState(this.context);
            }
            this.textDrawableHelper.getTextPaint().setTextAlign(alignCalculateTextOriginAndAlignment);
            int iSave = 0;
            boolean z2 = Math.round(this.textDrawableHelper.getTextWidth(getText().toString())) > Math.round(this.rectF.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(this.rectF);
            }
            CharSequence charSequenceEllipsize = this.text;
            if (z2 && this.truncateAt != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.textDrawableHelper.getTextPaint(), this.rectF.width(), this.truncateAt);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), this.pointF.x, this.pointF.y, this.textDrawableHelper.getTextPaint());
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private float getCurrentChipIconHeight() {
        Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
        float fCeil = this.chipIconSize;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(ViewUtils.dpToPx(this.context, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float getCurrentChipIconWidth() {
        Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
        float f2 = this.chipIconSize;
        return (f2 > 0.0f || drawable == null) ? f2 : drawable.getIntrinsicWidth();
    }

    private ColorFilter getTintColorFilter() {
        ColorFilter colorFilter = this.colorFilter;
        return colorFilter != null ? colorFilter : this.tintFilter;
    }

    private static boolean hasState(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStateful(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean isStateful(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean isStateful(TextAppearance textAppearance) {
        return (textAppearance == null || textAppearance.getTextColor() == null || !textAppearance.getTextColor().isStateful()) ? false : true;
    }

    private void loadFromAttributes(AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, com.google.android.material.R.styleable.Chip, i2, i3, new int[0]);
        this.isShapeThemingEnabled = typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        setChipSurfaceColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipSurfaceColor));
        setChipBackgroundColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        setChipMinHeight(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_chipCornerRadius)) {
            setChipCornerRadius(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        setChipStrokeColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        setChipStrokeWidth(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_rippleColor));
        setText(typedArrayObtainStyledAttributes.getText(com.google.android.material.R.styleable.Chip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_android_textAppearance);
        textAppearance.setTextSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_android_textSize, textAppearance.getTextSize()));
        setTextAppearance(textAppearance);
        int i4 = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            setEllipsize(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            setEllipsize(TextUtils.TruncateAt.END);
        }
        setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconVisible") == null) {
            setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIcon));
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_chipIconTint)) {
            setChipIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIconTint));
        }
        setChipIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, -1.0f));
        setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconVisible") == null) {
            setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
        }
        setCloseIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIcon));
        setCloseIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIconTint));
        setCloseIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        setCheckable(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconVisible") == null) {
            setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIcon));
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_checkedIconTint)) {
            setCheckedIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIconTint));
        }
        setShowMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_showMotionSpec));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_hideMotionSpec));
        setChipStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean onStateChange(int[] iArr, int[] iArr2) {
        byte b2;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.chipSurfaceColor;
        int iCompositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(colorStateList != null ? colorStateList.getColorForState(iArr, this.currentChipSurfaceColor) : 0);
        boolean z2 = true;
        if (this.currentChipSurfaceColor != iCompositeElevationOverlayIfNeeded) {
            this.currentChipSurfaceColor = iCompositeElevationOverlayIfNeeded;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.chipBackgroundColor;
        int iCompositeElevationOverlayIfNeeded2 = compositeElevationOverlayIfNeeded(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.currentChipBackgroundColor) : 0);
        if (this.currentChipBackgroundColor != iCompositeElevationOverlayIfNeeded2) {
            this.currentChipBackgroundColor = iCompositeElevationOverlayIfNeeded2;
            zOnStateChange = true;
        }
        int iLayer = MaterialColors.layer(iCompositeElevationOverlayIfNeeded, iCompositeElevationOverlayIfNeeded2);
        if (((this.currentCompositeSurfaceBackgroundColor != iLayer) | (getFillColor() == null)) != false) {
            this.currentCompositeSurfaceBackgroundColor = iLayer;
            setFillColor(ColorStateList.valueOf(iLayer));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.chipStrokeColor;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.currentChipStrokeColor) : 0;
        if (this.currentChipStrokeColor != colorForState) {
            this.currentChipStrokeColor = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.compatRippleColor == null || !RippleUtils.shouldDrawRippleCompat(iArr)) ? 0 : this.compatRippleColor.getColorForState(iArr, this.currentCompatRippleColor);
        if (this.currentCompatRippleColor != colorForState2) {
            this.currentCompatRippleColor = colorForState2;
            if (this.useCompatRipple) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.textDrawableHelper.getTextAppearance() == null || this.textDrawableHelper.getTextAppearance().getTextColor() == null) ? 0 : this.textDrawableHelper.getTextAppearance().getTextColor().getColorForState(iArr, this.currentTextColor);
        if (this.currentTextColor != colorForState3) {
            this.currentTextColor = colorForState3;
            zOnStateChange = true;
        }
        boolean z3 = hasState(getState(), R.attr.state_checked) && this.checkable;
        if (this.currentChecked == z3 || this.checkedIcon == null) {
            b2 = false;
        } else {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.currentChecked = z3;
            if (fCalculateChipIconWidth != calculateChipIconWidth()) {
                zOnStateChange = true;
                b2 = true;
            } else {
                b2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.tint;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.currentTint) : 0;
        if (this.currentTint != colorForState4) {
            this.currentTint = colorForState4;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, this.tintMode);
        } else {
            z2 = zOnStateChange;
        }
        if (isStateful(this.chipIcon)) {
            z2 = (z2 ? 1 : 0) | (this.chipIcon.setState(iArr) ? 1 : 0);
        }
        if (isStateful(this.checkedIcon)) {
            boolean state = this.checkedIcon.setState(iArr);
            int i2 = ((z2 ? 1 : 0) + (state ? 1 : 0)) - ((z2 ? 1 : 0) & (state ? 1 : 0));
            z2 = true;
            if (i2 != 1) {
                z2 = false;
            }
        }
        if (isStateful(this.closeIcon)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            int i3 = (-1) - (((-1) - (z2 ? 1 : 0)) & ((-1) - (this.closeIcon.setState(iArr3) ? 1 : 0)));
            z2 = true;
            if (i3 != 1) {
                z2 = false;
            }
        }
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && isStateful(this.closeIconRipple)) {
            int i4 = (-1) - (((-1) - (z2 ? 1 : 0)) & ((-1) - (this.closeIconRipple.setState(iArr2) ? 1 : 0)));
            z2 = true;
            if (i4 != 1) {
                z2 = false;
            }
        }
        if (z2) {
            invalidateSelf();
        }
        if (b2 != false) {
            onSizeChange();
        }
        return z2;
    }

    private void setChipSurfaceColor(ColorStateList colorStateList) {
        if (this.chipSurfaceColor != colorStateList) {
            this.chipSurfaceColor = colorStateList;
            onStateChange(getState());
        }
    }

    private boolean showsCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.currentChecked;
    }

    private boolean showsChipIcon() {
        return this.chipIconVisible && this.chipIcon != null;
    }

    private boolean showsCloseIcon() {
        return this.closeIconVisible && this.closeIcon != null;
    }

    private void unapplyChildDrawable(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void updateCompatRippleColor() {
        this.compatRippleColor = this.useCompatRipple ? RippleUtils.sanitizeRippleDrawableColor(this.rippleColor) : null;
    }

    private void updateFrameworkCloseIconRipple() {
        this.closeIconRipple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.closeIcon, closeIconRippleMask);
    }

    float calculateChipIconWidth() {
        if (showsChipIcon() || showsCheckedIcon()) {
            return this.iconStartPadding + getCurrentChipIconWidth() + this.iconEndPadding;
        }
        return 0.0f;
    }

    float calculateCloseIconWidth() {
        if (showsCloseIcon()) {
            return this.closeIconStartPadding + this.closeIconSize + this.closeIconEndPadding;
        }
        return 0.0f;
    }

    Paint.Align calculateTextOriginAndAlignment(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.text != null) {
            float fCalculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF.x = rect.left + fCalculateChipIconWidth;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fCalculateChipIconWidth;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - calculateTextCenterFromBaseline();
        }
        return align;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) throws Throwable {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int iSaveLayerAlpha = this.alpha < 255 ? CanvasCompat.saveLayerAlpha(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, this.alpha) : 0;
        drawChipSurface(canvas, bounds);
        drawChipBackground(canvas, bounds);
        if (this.isShapeThemingEnabled) {
            super.draw(canvas);
        }
        drawChipStroke(canvas, bounds);
        drawCompatRipple(canvas, bounds);
        drawChipIcon(canvas, bounds);
        drawCheckedIcon(canvas, bounds);
        if (this.shouldDrawText) {
            drawText(canvas, bounds);
        }
        drawCloseIcon(canvas, bounds);
        drawDebug(canvas, bounds);
        if (this.alpha < 255) {
            canvas.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    public ColorStateList getCheckedIconTint() {
        return this.checkedIconTint;
    }

    public ColorStateList getChipBackgroundColor() {
        return this.chipBackgroundColor;
    }

    public float getChipCornerRadius() {
        return this.isShapeThemingEnabled ? getTopLeftCornerResolvedSize() : this.chipCornerRadius;
    }

    public float getChipEndPadding() {
        return this.chipEndPadding;
    }

    public Drawable getChipIcon() {
        Drawable drawable = this.chipIcon;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.chipIconSize;
    }

    public ColorStateList getChipIconTint() {
        return this.chipIconTint;
    }

    public float getChipMinHeight() {
        return this.chipMinHeight;
    }

    public float getChipStartPadding() {
        return this.chipStartPadding;
    }

    public ColorStateList getChipStrokeColor() {
        return this.chipStrokeColor;
    }

    public float getChipStrokeWidth() {
        return this.chipStrokeWidth;
    }

    public void getChipTouchBounds(RectF rectF) {
        calculateChipTouchBounds(getBounds(), rectF);
    }

    public Drawable getCloseIcon() {
        Drawable drawable = this.closeIcon;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        return this.closeIconContentDescription;
    }

    public float getCloseIconEndPadding() {
        return this.closeIconEndPadding;
    }

    public float getCloseIconSize() {
        return this.closeIconSize;
    }

    public float getCloseIconStartPadding() {
        return this.closeIconStartPadding;
    }

    public int[] getCloseIconState() {
        return this.closeIconStateSet;
    }

    public ColorStateList getCloseIconTint() {
        return this.closeIconTint;
    }

    public void getCloseIconTouchBounds(RectF rectF) {
        calculateCloseIconTouchBounds(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.truncateAt;
    }

    public MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getIconEndPadding() {
        return this.iconEndPadding;
    }

    public float getIconStartPadding() {
        return this.iconStartPadding;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.chipMinHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding + this.textDrawableHelper.getTextWidth(getText().toString()) + this.textEndPadding + calculateCloseIconWidth() + this.chipEndPadding), this.maxWidth);
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.isShapeThemingEnabled) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.chipCornerRadius);
        } else {
            outline.setRoundRect(bounds, this.chipCornerRadius);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    public MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    public CharSequence getText() {
        return this.text;
    }

    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.textEndPadding;
    }

    public float getTextStartPadding() {
        return this.textStartPadding;
    }

    public boolean getUseCompatRipple() {
        return this.useCompatRipple;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.checkedIconVisible;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.chipIconVisible;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return isStateful(this.closeIcon);
    }

    public boolean isCloseIconVisible() {
        return this.closeIconVisible;
    }

    boolean isShapeThemingEnabled() {
        return this.isShapeThemingEnabled;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return isStateful(this.chipSurfaceColor) || isStateful(this.chipBackgroundColor) || isStateful(this.chipStrokeColor) || (this.useCompatRipple && isStateful(this.compatRippleColor)) || isStateful(this.textDrawableHelper.getTextAppearance()) || canShowCheckedIcon() || isStateful(this.chipIcon) || isStateful(this.checkedIcon) || isStateful(this.tint);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (showsChipIcon()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.chipIcon, i2);
        }
        if (showsCheckedIcon()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.checkedIcon, i2);
        }
        if (showsCloseIcon()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.closeIcon, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (showsChipIcon()) {
            zOnLevelChange = (zOnLevelChange ? 1 : 0) | (this.chipIcon.setLevel(i2) ? 1 : 0);
        }
        if (showsCheckedIcon()) {
            boolean level = this.checkedIcon.setLevel(i2);
            int i3 = ((zOnLevelChange ? 1 : 0) + (level ? 1 : 0)) - ((zOnLevelChange ? 1 : 0) & (level ? 1 : 0));
            zOnLevelChange = true;
            if (i3 != 1) {
                zOnLevelChange = false;
            }
        }
        if (showsCloseIcon()) {
            int i4 = (-1) - (((-1) - (zOnLevelChange ? 1 : 0)) & ((-1) - (this.closeIcon.setLevel(i2) ? 1 : 0)));
            zOnLevelChange = true;
            if (i4 != 1) {
                zOnLevelChange = false;
            }
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    protected void onSizeChange() {
        Delegate delegate = this.delegate.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        if (this.isShapeThemingEnabled) {
            super.onStateChange(iArr);
        }
        return onStateChange(iArr, getCloseIconState());
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        onSizeChange();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.alpha != i2) {
            this.alpha = i2;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z2) {
        if (this.checkable != z2) {
            this.checkable = z2;
            float fCalculateChipIconWidth = calculateChipIconWidth();
            if (!z2 && this.currentChecked) {
                this.currentChecked = false;
            }
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCheckableResource(int i2) {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("\u0006\u0012\u0007\u0014\u0010\t\u0003K\u007f\u000b\t\u000e}\u0006\u000bCW\u0003\u0001\u0006u\b\u0003", (short) (C1607wl.Xd() ^ 6014), (short) (C1607wl.Xd() ^ 13316))).getMethod(C1561oA.ud("$!/\f\u001e+&+'\u0017\u0018%", (short) (C1499aX.Xd() ^ (-20552))), new Class[0]);
        try {
            method.setAccessible(true);
            setCheckable(((Resources) method.invoke(context, objArr)).getBoolean(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        if (this.checkedIcon != drawable) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.checkedIcon = drawable;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(this.checkedIcon);
            applyChildDrawable(this.checkedIcon);
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) throws Throwable {
        Context context = this.context;
        short sXd = (short) (Od.Xd() ^ (-6281));
        int[] iArr = new int["kyl{}xp;u\u0003~\u0006{\u0006\tC]\u000b\u0007\u000e\u0004\u0018\u0011".length()];
        QB qb = new QB("kyl{}xp;u\u0003~\u0006{\u0006\tC]\u000b\u0007\u000e\u0004\u0018\u0011");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(C1561oA.Yd("+*:\u0019-<9@>03B", (short) (C1499aX.Xd() ^ (-12235))), new Class[0]);
        try {
            method.setAccessible(true);
            setCheckedIconVisible(((Resources) method.invoke(context, objArr)).getBoolean(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setCheckedIconResource(int i2) {
        setCheckedIcon(AppCompatResources.getDrawable(this.context, i2));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        if (this.checkedIconTint != colorStateList) {
            this.checkedIconTint = colorStateList;
            if (canShowCheckedIcon()) {
                DrawableCompat.setTintList(this.checkedIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(int i2) {
        setCheckedIconTint(AppCompatResources.getColorStateList(this.context, i2));
    }

    public void setCheckedIconVisible(int i2) {
        Context context = this.context;
        Class<?> cls = Class.forName(Xg.qd("(6-<:51{2??F8BI\u0004\u001aGGN@TQ", (short) (C1633zX.Xd() ^ (-15818)), (short) (C1633zX.Xd() ^ (-944))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-29245));
        short sXd2 = (short) (Od.Xd() ^ (-25059));
        int[] iArr = new int["1k\u0015/}H^\"a\r,T".length()];
        QB qb = new QB("1k\u0015/}H^\"a\r,T");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            setCheckedIconVisible(((Resources) method.invoke(context, objArr)).getBoolean(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setCheckedIconVisible(boolean z2) {
        if (this.checkedIconVisible != z2) {
            boolean zShowsCheckedIcon = showsCheckedIcon();
            this.checkedIconVisible = z2;
            boolean zShowsCheckedIcon2 = showsCheckedIcon();
            if (zShowsCheckedIcon != zShowsCheckedIcon2) {
                if (zShowsCheckedIcon2) {
                    applyChildDrawable(this.checkedIcon);
                } else {
                    unapplyChildDrawable(this.checkedIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        if (this.chipBackgroundColor != colorStateList) {
            this.chipBackgroundColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        setChipBackgroundColor(AppCompatResources.getColorStateList(this.context, i2));
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        if (this.chipCornerRadius != f2) {
            this.chipCornerRadius = f2;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f2));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("xj{ML\u000b,AD\u0002s2gc9_9]!ZO\u001a4", (short) (C1580rY.Xd() ^ (-32546)), (short) (C1580rY.Xd() ^ (-12371)))).getMethod(C1626yg.Ud("r7\b!Y\u001fp)R\u0014\b`", (short) (Od.Xd() ^ (-4720)), (short) (Od.Xd() ^ (-26657))), new Class[0]);
        try {
            method.setAccessible(true);
            setChipCornerRadius(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setChipEndPadding(float f2) {
        if (this.chipEndPadding != f2) {
            this.chipEndPadding = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipEndPaddingResource(int i2) {
        Context context = this.context;
        Class<?> cls = Class.forName(Ig.wd("\u000bR:$\u007fUhADCFl\n\u001bG\u001dh\u001dR\u00030m}", (short) (C1499aX.Xd() ^ (-32741))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 8901);
        int[] iArr = new int["Av42N\u0011h_\u00038<d".length()];
        QB qb = new QB("Av42N\u0011h_\u00038<d");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            setChipEndPadding(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setChipIcon(Drawable drawable) {
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.chipIcon = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(chipIcon);
            if (showsChipIcon()) {
                applyChildDrawable(this.chipIcon);
            }
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        setChipIcon(AppCompatResources.getDrawable(this.context, i2));
    }

    public void setChipIconSize(float f2) {
        if (this.chipIconSize != f2) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.chipIconSize = f2;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(int i2) {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRf\u0012\u0010\u0015\u0005\u0017\u0012", (short) (Od.Xd() ^ (-8946)))).getMethod(C1593ug.zd("43C\"6EBIG9<K", (short) (C1580rY.Xd() ^ (-30634)), (short) (C1580rY.Xd() ^ (-8770))), new Class[0]);
        try {
            method.setAccessible(true);
            setChipIconSize(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        this.hasChipIconTint = true;
        if (this.chipIconTint != colorStateList) {
            this.chipIconTint = colorStateList;
            if (showsChipIcon()) {
                DrawableCompat.setTintList(this.chipIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(int i2) {
        setChipIconTint(AppCompatResources.getColorStateList(this.context, i2));
    }

    public void setChipIconVisible(int i2) {
        Context context = this.context;
        Class<?> cls = Class.forName(C1561oA.od("\u0018$\u0019&\"\u001b\u0015]\u0012\u001d\u001b \u0010\u0018\u001dUi\u0015\u0013\u0018\b\u001a\u0015", (short) (Od.Xd() ^ (-20020))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-16890));
        int[] iArr = new int["\u0010\u000f\u001f}\u0012!\u001e%#\u0015\u0018'".length()];
        QB qb = new QB("\u0010\u000f\u001f}\u0012!\u001e%#\u0015\u0018'");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            setChipIconVisible(((Resources) method.invoke(context, objArr)).getBoolean(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setChipIconVisible(boolean z2) {
        if (this.chipIconVisible != z2) {
            boolean zShowsChipIcon = showsChipIcon();
            this.chipIconVisible = z2;
            boolean zShowsChipIcon2 = showsChipIcon();
            if (zShowsChipIcon != zShowsChipIcon2) {
                if (zShowsChipIcon2) {
                    applyChildDrawable(this.chipIcon);
                } else {
                    unapplyChildDrawable(this.chipIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipMinHeight(float f2) {
        if (this.chipMinHeight != f2) {
            this.chipMinHeight = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipMinHeightResource(int i2) {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("T\u00173h\u0014%V7\u001b]o,<k\u0019x<\u00105^}(Y", (short) (ZN.Xd() ^ 23860), (short) (ZN.Xd() ^ 13133))).getMethod(C1561oA.Xd("FEU4HWT[YKN]", (short) (C1633zX.Xd() ^ (-23642))), new Class[0]);
        try {
            method.setAccessible(true);
            setChipMinHeight(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setChipStartPadding(float f2) {
        if (this.chipStartPadding != f2) {
            this.chipStartPadding = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipStartPaddingResource(int i2) {
        Context context = this.context;
        short sXd = (short) (C1580rY.Xd() ^ (-12504));
        int[] iArr = new int["N\\O^XSK\u0016XeahV`c\u001e MIP>RK".length()];
        QB qb = new QB("N\\O^XSK\u0016XeahV`c\u001e MIP>RK");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (FB.Xd() ^ 32725);
        short sXd3 = (short) (FB.Xd() ^ 20868);
        int[] iArr2 = new int["\u0015\u0012 |\u000f\u001c\u0017\u001c\u0018\b\t\u0016".length()];
        QB qb2 = new QB("\u0015\u0012 |\u000f\u001c\u0017\u001c\u0018\b\t\u0016");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(((sXd2 + i4) + xuXd2.CK(iKK2)) - sXd3);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            setChipStartPadding(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        if (this.chipStrokeColor != colorStateList) {
            this.chipStrokeColor = colorStateList;
            if (this.isShapeThemingEnabled) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(int i2) {
        setChipStrokeColor(AppCompatResources.getColorStateList(this.context, i2));
    }

    public void setChipStrokeWidth(float f2) {
        if (this.chipStrokeWidth != f2) {
            this.chipStrokeWidth = f2;
            this.chipPaint.setStrokeWidth(f2);
            if (this.isShapeThemingEnabled) {
                super.setStrokeWidth(f2);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("VbWd`YS\u001cP[Y^NV[\u0014(SQVFXS", (short) (C1580rY.Xd() ^ (-13062)), (short) (C1580rY.Xd() ^ (-23956)))).getMethod(C1561oA.ud("ebpM_lglhXYf", (short) (C1580rY.Xd() ^ (-10117))), new Class[0]);
        try {
            method.setAccessible(true);
            setChipStrokeWidth(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setCloseIcon(Drawable drawable) {
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float fCalculateCloseIconWidth = calculateCloseIconWidth();
            this.closeIcon = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                updateFrameworkCloseIconRipple();
            }
            float fCalculateCloseIconWidth2 = calculateCloseIconWidth();
            unapplyChildDrawable(closeIcon);
            if (showsCloseIcon()) {
                applyChildDrawable(this.closeIcon);
            }
            invalidateSelf();
            if (fCalculateCloseIconWidth != fCalculateCloseIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        if (this.closeIconContentDescription != charSequence) {
            this.closeIconContentDescription = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) throws Throwable {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        if (this.closeIconEndPadding != f2) {
            this.closeIconEndPadding = f2;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("0<1>B;5}*53808=u\u0002-+0(:5", (short) (C1633zX.Xd() ^ (-15664)))).getMethod(C1561oA.Yd("HGW6JYV][MP_", (short) (C1633zX.Xd() ^ (-4099))), new Class[0]);
        try {
            method.setAccessible(true);
            setCloseIconEndPadding(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setCloseIconResource(int i2) {
        setCloseIcon(AppCompatResources.getDrawable(this.context, i2));
    }

    public void setCloseIconSize(float f2) {
        if (this.closeIconSize != f2) {
            this.closeIconSize = f2;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(int i2) {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("\u0018&\u001d,*%!k\"//6(29s\n77>0DA", (short) (C1580rY.Xd() ^ (-3379)), (short) (C1580rY.Xd() ^ (-30658)))).getMethod(Jg.Wd("%(F\u0018{=ID\u0011E8\u001a", (short) (C1499aX.Xd() ^ (-29830)), (short) (C1499aX.Xd() ^ (-2885))), new Class[0]);
        try {
            method.setAccessible(true);
            setCloseIconSize(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setCloseIconStartPadding(float f2) {
        if (this.closeIconStartPadding != f2) {
            this.closeIconStartPadding = f2;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        Context context = this.context;
        Class<?> cls = Class.forName(ZO.xd("QvA9%|\u001b\u001b&.XD\u000eT4;^\n\u0019p[3\u0019", (short) (C1633zX.Xd() ^ (-21302)), (short) (C1633zX.Xd() ^ (-18358))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-4743));
        short sXd2 = (short) (C1580rY.Xd() ^ (-30974));
        int[] iArr = new int["\u001d.\u0018KXLS 4hM\u001c".length()];
        QB qb = new QB("\u001d.\u0018KXLS 4hM\u001c");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            setCloseIconStartPadding(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean setCloseIconState(int[] iArr) {
        if (Arrays.equals(this.closeIconStateSet, iArr)) {
            return false;
        }
        this.closeIconStateSet = iArr;
        if (showsCloseIcon()) {
            return onStateChange(getState(), iArr);
        }
        return false;
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        if (this.closeIconTint != colorStateList) {
            this.closeIconTint = colorStateList;
            if (showsCloseIcon()) {
                DrawableCompat.setTintList(this.closeIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(int i2) {
        setCloseIconTint(AppCompatResources.getColorStateList(this.context, i2));
    }

    public void setCloseIconVisible(int i2) throws Throwable {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("!_A5p>S$\n:;_\u0001\u0010\u0016y5g\u001f)Z\u001a(", (short) (C1633zX.Xd() ^ (-1614)))).getMethod(EO.Od("\u000e[|uy5\u0001\u0017^  \u0010", (short) (ZN.Xd() ^ 31149)), new Class[0]);
        try {
            method.setAccessible(true);
            setCloseIconVisible(((Resources) method.invoke(context, objArr)).getBoolean(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setCloseIconVisible(boolean z2) {
        if (this.closeIconVisible != z2) {
            boolean zShowsCloseIcon = showsCloseIcon();
            this.closeIconVisible = z2;
            boolean zShowsCloseIcon2 = showsCloseIcon();
            if (zShowsCloseIcon != zShowsCloseIcon2) {
                if (zShowsCloseIcon2) {
                    applyChildDrawable(this.closeIcon);
                } else {
                    unapplyChildDrawable(this.closeIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.colorFilter != colorFilter) {
            this.colorFilter = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = new WeakReference<>(delegate);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.truncateAt = truncateAt;
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(MotionSpec.createFromResource(this.context, i2));
    }

    public void setIconEndPadding(float f2) {
        if (this.iconEndPadding != f2) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconEndPadding = f2;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(int i2) {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (FB.Xd() ^ 7160))).getMethod(C1593ug.zd("! 0\u000f#2/64&)8", (short) (C1499aX.Xd() ^ (-9779)), (short) (C1499aX.Xd() ^ (-6667))), new Class[0]);
        try {
            method.setAccessible(true);
            setIconEndPadding(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setIconStartPadding(float f2) {
        if (this.iconStartPadding != f2) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconStartPadding = f2;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(int i2) {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("\\h]jf_Y\"Va_dT\\a\u001a.YW\\L^Y", (short) (C1499aX.Xd() ^ (-28801)))).getMethod(C1561oA.Kd("65E$8GDKI;>M", (short) (OY.Xd() ^ 21891)), new Class[0]);
        try {
            method.setAccessible(true);
            setIconStartPadding(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setMaxWidth(int i2) {
        this.maxWidth = i2;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(int i2) {
        setRippleColor(AppCompatResources.getColorStateList(this.context, i2));
    }

    void setShouldDrawText(boolean z2) {
        this.shouldDrawText = z2;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(MotionSpec.createFromResource(this.context, i2));
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
        onSizeChange();
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(new TextAppearance(this.context, i2));
    }

    public void setTextColor(int i2) {
        setTextColor(ColorStateList.valueOf(i2));
    }

    public void setTextColor(ColorStateList colorStateList) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
    }

    public void setTextEndPadding(float f2) {
        if (this.textEndPadding != f2) {
            this.textEndPadding = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextEndPaddingResource(int i2) {
        Context context = this.context;
        Class<?> cls = Class.forName(Wg.Zd(".Pf)FXwqGo\u000fEZ{\"\u0010E\u000b.du%A", (short) (C1607wl.Xd() ^ 28143), (short) (C1607wl.Xd() ^ 18342)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-16495));
        int[] iArr = new int["\u0004\u0003\u0013q\u0006\u0015\u0012\u0019\u0017\t\f\u001b".length()];
        QB qb = new QB("\u0004\u0003\u0013q\u0006\u0015\u0012\u0019\u0017\t\f\u001b");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            setTextEndPadding(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setTextResource(int i2) throws Throwable {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("\u001a&\u001b($\u001d\u0017_$/-2\"*/gk\u0017\u0015\u001a\n\u001c\u0017", (short) (FB.Xd() ^ 28859))).getMethod(Qg.kd(">;I&8E@EA12?", (short) (FB.Xd() ^ 4804), (short) (FB.Xd() ^ 9606)), new Class[0]);
        try {
            method.setAccessible(true);
            setText(((Resources) method.invoke(context, objArr)).getString(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setTextSize(float f2) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f2);
            this.textDrawableHelper.getTextPaint().setTextSize(f2);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f2) {
        if (this.textStartPadding != f2) {
            this.textStartPadding = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextStartPaddingResource(int i2) {
        Context context = this.context;
        Class<?> cls = Class.forName(hg.Vd("8D9FB;5}2=;@08=u\n538(:5", (short) (FB.Xd() ^ 8320), (short) (FB.Xd() ^ 22226)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-22131));
        int[] iArr = new int["# .\u000b\u001d*%*&\u0016\u0017$".length()];
        QB qb = new QB("# .\u000b\u001d*%*&\u0016\u0017$");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            setTextStartPadding(((Resources) method.invoke(context, objArr)).getDimension(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.tint != colorStateList) {
            this.tint = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.tintMode != mode) {
            this.tintMode = mode;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z2) {
        if (this.useCompatRipple != z2) {
            this.useCompatRipple = z2;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (showsChipIcon()) {
            int i2 = (-1) - (((-1) - (visible ? 1 : 0)) & ((-1) - (this.chipIcon.setVisible(z2, z3) ? 1 : 0)));
            visible = true;
            if (i2 != 1) {
                visible = false;
            }
        }
        if (showsCheckedIcon()) {
            boolean visible2 = this.checkedIcon.setVisible(z2, z3);
            int i3 = ((visible ? 1 : 0) + (visible2 ? 1 : 0)) - ((visible ? 1 : 0) & (visible2 ? 1 : 0));
            visible = true;
            if (i3 != 1) {
                visible = false;
            }
        }
        if (showsCloseIcon()) {
            boolean visible3 = this.closeIcon.setVisible(z2, z3);
            int i4 = ((visible ? 1 : 0) + (visible3 ? 1 : 0)) - ((visible ? 1 : 0) & (visible3 ? 1 : 0));
            visible = true;
            if (i4 != 1) {
                visible = false;
            }
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    boolean shouldDrawText() {
        return this.shouldDrawText;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
