package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {
    private static final int DEFAULT_STYLE = R.style.Widget_MaterialComponents_Tooltip;
    private static final int DEFAULT_THEME_ATTR = R.attr.tooltipStyle;
    private int arrowSize;
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    private final Context context;
    private final Rect displayFrame;
    private final Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private boolean showMarker;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    /* JADX INFO: renamed from: com.google.android.material.tooltip.TooltipDrawable$1 */
    class AnonymousClass1 implements View.OnLayoutChangeListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            TooltipDrawable.this.updateLocationOnScreen(view);
        }
    }

    private TooltipDrawable(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        super(context, attributeSet, i2, i3);
        this.fontMetrics = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.attachedViewLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            AnonymousClass1() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i22, int i32, int i4, int i5, int i6, int i7, int i8, int i9) {
                TooltipDrawable.this.updateLocationOnScreen(view);
            }
        };
        this.displayFrame = new Rect();
        this.tooltipScaleX = 1.0f;
        this.tooltipScaleY = 1.0f;
        this.tooltipPivotX = 0.5f;
        this.tooltipPivotY = 0.5f;
        this.labelOpacity = 1.0f;
        this.context = context;
        TextPaint textPaint = textDrawableHelper.getTextPaint();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?", (short) (C1607wl.Xd() ^ 29636))).getMethod(C1593ug.zd("\u0007\u0006\u0016t\t\u0018\u0015\u001c\u001a\f\u000f\u001e", (short) (C1607wl.Xd() ^ 8793), (short) (C1607wl.Xd() ^ 8972)), new Class[0]);
        try {
            method.setAccessible(true);
            textPaint.density = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
            textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private float calculatePointerOffset() {
        int i2;
        if (((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin < 0) {
            i2 = ((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        } else {
            if (((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin <= 0) {
                return 0.0f;
            }
            i2 = ((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin;
        }
        return i2;
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        return (this.fontMetrics.descent + this.fontMetrics.ascent) / 2.0f;
    }

    private float calculateTextOriginAndAlignment(Rect rect) {
        return rect.centerY() - calculateTextCenterFromBaseline();
    }

    public static TooltipDrawable create(Context context) {
        return createFromAttributes(context, null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i2, i3);
        tooltipDrawable.loadFromAttributes(attributeSet, i2, i3);
        return tooltipDrawable;
    }

    private EdgeTreatment createMarkerEdge() {
        float f2 = -calculatePointerOffset();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.arrowSize) * Math.sqrt(2.0d)))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.arrowSize), Math.min(Math.max(f2, -fWidth), fWidth));
    }

    private void drawText(Canvas canvas) throws Throwable {
        if (this.text == null) {
            return;
        }
        int iCalculateTextOriginAndAlignment = (int) calculateTextOriginAndAlignment(getBounds());
        if (this.textDrawableHelper.getTextAppearance() != null) {
            this.textDrawableHelper.getTextPaint().drawableState = getState();
            this.textDrawableHelper.updateTextPaintDrawState(this.context);
            this.textDrawableHelper.getTextPaint().setAlpha((int) (this.labelOpacity * 255.0f));
        }
        CharSequence charSequence = this.text;
        canvas.drawText(charSequence, 0, charSequence.length(), r4.centerX(), iCalculateTextOriginAndAlignment, this.textDrawableHelper.getTextPaint());
    }

    private float getTextWidth() {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textDrawableHelper.getTextWidth(charSequence.toString());
    }

    private void loadFromAttributes(AttributeSet attributeSet, int i2, int i3) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, R.styleable.Tooltip, i2, i3, new int[0]);
        Context context = this.context;
        short sXd = (short) (FB.Xd() ^ 23961);
        int[] iArr = new int["AMBOKD>\u0007;FDI9AF~\u0013><A1C>".length()];
        QB qb = new QB("AMBOKD>\u0007;FDI9AF~\u0013><A1C>");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(sXd + sXd + i4 + xuXd.CK(iKK));
            i4++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i4)).getMethod(C1561oA.Kd("ts\u0004bv\u0006\u0003\n\by|\f", (short) (C1499aX.Xd() ^ (-29748))), new Class[0]);
        try {
            method.setAccessible(true);
            this.arrowSize = ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Tooltip_showMarker, true);
            this.showMarker = z2;
            if (z2) {
                setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
            } else {
                this.arrowSize = 0;
            }
            setText(typedArrayObtainStyledAttributes.getText(R.styleable.Tooltip_android_text));
            TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, R.styleable.Tooltip_android_textAppearance);
            if (textAppearance != null && typedArrayObtainStyledAttributes.hasValue(R.styleable.Tooltip_android_textColor)) {
                textAppearance.setTextColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, R.styleable.Tooltip_android_textColor));
            }
            setTextAppearance(textAppearance);
            setFillColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R.styleable.Tooltip_backgroundTint, MaterialColors.layer(ColorUtils.setAlphaComponent(MaterialColors.getColor(this.context, android.R.attr.colorBackground, TooltipDrawable.class.getCanonicalName()), 229), ColorUtils.setAlphaComponent(MaterialColors.getColor(this.context, R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
            setStrokeColor(ColorStateList.valueOf(MaterialColors.getColor(this.context, R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
            this.padding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
            this.minWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
            this.minHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
            this.layoutMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
            typedArrayObtainStyledAttributes.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void updateLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.locationOnScreenX = iArr[0];
        view.getWindowVisibleDisplayFrame(this.displayFrame);
    }

    public void detachView(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) throws Throwable {
        canvas.save();
        float fCalculatePointerOffset = calculatePointerOffset();
        float f2 = (float) (-((((double) this.arrowSize) * Math.sqrt(2.0d)) - ((double) this.arrowSize)));
        canvas.scale(this.tooltipScaleX, this.tooltipScaleY, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.tooltipPivotY));
        canvas.translate(fCalculatePointerOffset, f2);
        super.draw(canvas);
        drawText(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.textDrawableHelper.getTextPaint().getTextSize(), this.minHeight);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.padding * 2) + getTextWidth(), this.minWidth);
    }

    public int getLayoutMargin() {
        return this.layoutMargin;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public CharSequence getText() {
        return this.text;
    }

    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public int getTextPadding() {
        return this.padding;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.showMarker) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(int i2) {
        this.layoutMargin = i2;
        invalidateSelf();
    }

    public void setMinHeight(int i2) {
        this.minHeight = i2;
        invalidateSelf();
    }

    public void setMinWidth(int i2) {
        this.minWidth = i2;
        invalidateSelf();
    }

    public void setRelativeToView(View view) {
        if (view == null) {
            return;
        }
        updateLocationOnScreen(view);
        view.addOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    public void setRevealFraction(float f2) {
        this.tooltipPivotY = 1.2f;
        this.tooltipScaleX = f2;
        this.tooltipScaleY = f2;
        this.labelOpacity = AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f2);
        invalidateSelf();
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(new TextAppearance(this.context, i2));
    }

    public void setTextPadding(int i2) {
        this.padding = i2;
        invalidateSelf();
    }

    public void setTextResource(int i2) throws Throwable {
        Context context = this.context;
        short sXd = (short) (C1499aX.Xd() ^ (-23131));
        short sXd2 = (short) (C1499aX.Xd() ^ (-11570));
        int[] iArr = new int["\u001d\u0013\u0003y~aV\u0007(\u001d\u0016\u0005}mm\u0010\t/\u0017\u0013|\nn".length()];
        QB qb = new QB("\u001d\u0013\u0003y~aV\u0007(\u001d\u0016\u0005}mm\u0010\t/\u0017\u0013|\nn");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (ZN.Xd() ^ 3371);
        int[] iArr2 = new int["+*:\u0019-<9@>03B".length()];
        QB qb2 = new QB("+*:\u0019-<9@>03B");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i4));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            setText(((Resources) method.invoke(context, objArr)).getString(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
