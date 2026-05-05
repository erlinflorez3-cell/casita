package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@UnstableReactNativeAPI
public class CSSBackgroundDrawable extends Drawable {
    private static final int ALL_BITS_SET = -1;
    private static final int ALL_BITS_UNSET = 0;
    private static final int DEFAULT_BORDER_ALPHA = 255;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_RGB = 0;
    private Path mBackgroundColorRenderPath;
    private Spacing mBorderAlpha;
    private Spacing mBorderRGB;
    private BorderStyle mBorderStyle;
    private Spacing mBorderWidth;
    private Path mCenterDrawPath;
    private final Context mContext;
    private PointF mInnerBottomLeftCorner;
    private PointF mInnerBottomRightCorner;
    private Path mInnerClipPathForBorderRadius;
    private RectF mInnerClipTempRectForBorderRadius;
    private PointF mInnerTopLeftCorner;
    private PointF mInnerTopRightCorner;
    private Path mOuterClipPathForBorderRadius;
    private RectF mOuterClipTempRectForBorderRadius;
    private Path mPathForBorder;
    private Path mPathForBorderRadiusOutline;
    private RectF mTempRectForBorderRadiusOutline;
    private RectF mTempRectForCenterDrawPath;
    private final Path mPathForSingleBorder = new Path();
    private boolean mNeedUpdatePathForBorderRadius = false;
    private final Paint mPaint = new Paint(1);
    private int mColor = 0;
    private List<BackgroundImageLayer> mBackgroundImageLayers = null;
    private int mAlpha = 255;
    private final float mGapBetweenPaths = 0.8f;
    private BorderRadiusStyle mBorderRadius = new BorderRadiusStyle();
    private ComputedBorderRadius mComputedBorderRadius = new ComputedBorderRadius();
    private int mLayoutDirectionOverride = -1;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.drawable.CSSBackgroundDrawable$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$style$BorderStyle;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            $SwitchMap$com$facebook$react$uimanager$style$BorderStyle = iArr;
            try {
                iArr[BorderStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$BorderStyle[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$BorderStyle[BorderStyle.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CSSBackgroundDrawable(Context context) {
        this.mContext = context;
    }

    private static int colorFromAlphaAndRGBComponents(float f2, float f3) {
        int i2 = ((int) f2) << 24;
        return (-1) - (((-1) - ((i2 - 16777216) - (i2 | (-16777216)))) & ((-1) - (((int) f3) & ViewCompat.MEASURED_SIZE_MASK)));
    }

    private void drawQuadrilateral(Canvas canvas, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (i2 == 0) {
            return;
        }
        if (this.mPathForBorder == null) {
            this.mPathForBorder = new Path();
        }
        this.mPaint.setColor(i2);
        this.mPathForBorder.reset();
        this.mPathForBorder.moveTo(f2, f3);
        this.mPathForBorder.lineTo(f4, f5);
        this.mPathForBorder.lineTo(f6, f7);
        this.mPathForBorder.lineTo(f8, f9);
        this.mPathForBorder.lineTo(f2, f3);
        canvas.drawPath(this.mPathForBorder, this.mPaint);
    }

    private void drawRectangularBackgroundWithBorders(Canvas canvas) {
        int i2;
        this.mPaint.setStyle(Paint.Style.FILL);
        int iMultiplyColorAlpha = multiplyColorAlpha(this.mColor, this.mAlpha);
        if (Color.alpha(iMultiplyColorAlpha) != 0) {
            this.mPaint.setColor(iMultiplyColorAlpha);
            canvas.drawRect(getBounds(), this.mPaint);
        }
        List<BackgroundImageLayer> list = this.mBackgroundImageLayers;
        if (list != null && !list.isEmpty()) {
            this.mPaint.setShader(getBackgroundImageShader());
            canvas.drawRect(getBounds(), this.mPaint);
            this.mPaint.setShader(null);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int iRound = Math.round(directionAwareBorderInsets.left);
        int iRound2 = Math.round(directionAwareBorderInsets.top);
        int iRound3 = Math.round(directionAwareBorderInsets.right);
        int iRound4 = Math.round(directionAwareBorderInsets.bottom);
        if (iRound > 0 || iRound3 > 0 || iRound2 > 0 || iRound4 > 0) {
            Rect bounds = getBounds();
            int borderColor = getBorderColor(0);
            int borderColor2 = getBorderColor(1);
            int borderColor3 = getBorderColor(2);
            int borderColor4 = getBorderColor(3);
            int borderColor5 = getBorderColor(9);
            int borderColor6 = getBorderColor(11);
            int borderColor7 = getBorderColor(10);
            if (isBorderColorDefined(9)) {
                borderColor2 = borderColor5;
                borderColor4 = borderColor2;
            }
            if (!isBorderColorDefined(10)) {
                borderColor7 = borderColor4;
            }
            if (!isBorderColorDefined(11)) {
                borderColor6 = borderColor2;
            }
            boolean z2 = getLayoutDirection() == 1;
            int borderColor8 = getBorderColor(4);
            int borderColor9 = getBorderColor(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (isBorderColorDefined(4)) {
                    borderColor = borderColor8;
                }
                if (isBorderColorDefined(5)) {
                    borderColor3 = borderColor9;
                }
                i2 = z2 ? borderColor3 : borderColor;
                if (!z2) {
                    borderColor = borderColor3;
                }
            } else {
                int i3 = z2 ? borderColor9 : borderColor8;
                if (!z2) {
                    borderColor8 = borderColor9;
                }
                boolean zIsBorderColorDefined = isBorderColorDefined(4);
                boolean zIsBorderColorDefined2 = isBorderColorDefined(5);
                boolean z3 = z2 ? zIsBorderColorDefined2 : zIsBorderColorDefined;
                if (!z2) {
                    zIsBorderColorDefined = zIsBorderColorDefined2;
                }
                if (z3) {
                    borderColor = i3;
                }
                i2 = borderColor;
                borderColor = zIsBorderColorDefined ? borderColor8 : borderColor3;
            }
            int i4 = bounds.left;
            int i5 = bounds.top;
            int i6 = i2;
            int iFastBorderCompatibleColorOrZero = fastBorderCompatibleColorOrZero(iRound, iRound2, iRound3, iRound4, i2, borderColor6, borderColor, borderColor7);
            if (iFastBorderCompatibleColorOrZero == 0) {
                this.mPaint.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (iRound > 0) {
                    float f2 = i4;
                    float f3 = i4 + iRound;
                    drawQuadrilateral(canvas, i6, f2, i5, f3, i5 + iRound2, f3, r0 - iRound4, f2, i5 + iHeight);
                }
                if (iRound2 > 0) {
                    float f4 = i5;
                    float f5 = i5 + iRound2;
                    drawQuadrilateral(canvas, borderColor6, i4, f4, i4 + iRound, f5, r0 - iRound3, f5, i4 + iWidth, f4);
                }
                if (iRound3 > 0) {
                    int i7 = i4 + iWidth;
                    float f6 = i7;
                    float f7 = i7 - iRound3;
                    drawQuadrilateral(canvas, borderColor, f6, i5, f6, i5 + iHeight, f7, r0 - iRound4, f7, i5 + iRound2);
                }
                if (iRound4 > 0) {
                    int i8 = i5 + iHeight;
                    float f8 = i8;
                    float f9 = i8 - iRound4;
                    drawQuadrilateral(canvas, borderColor7, i4, f8, i4 + iWidth, f8, r0 - iRound3, f9, i4 + iRound, f9);
                }
                this.mPaint.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iFastBorderCompatibleColorOrZero) != 0) {
                int i9 = bounds.right;
                int i10 = bounds.bottom;
                this.mPaint.setColor(iFastBorderCompatibleColorOrZero);
                this.mPaint.setStyle(Paint.Style.STROKE);
                if (iRound > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound5 = Math.round(directionAwareBorderInsets.left);
                    updatePathEffect(iRound5);
                    this.mPaint.setStrokeWidth(iRound5);
                    float f10 = (iRound5 / 2) + i4;
                    this.mPathForSingleBorder.moveTo(f10, i5);
                    this.mPathForSingleBorder.lineTo(f10, i10);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (iRound2 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound6 = Math.round(directionAwareBorderInsets.top);
                    updatePathEffect(iRound6);
                    this.mPaint.setStrokeWidth(iRound6);
                    float f11 = (iRound6 / 2) + i5;
                    this.mPathForSingleBorder.moveTo(i4, f11);
                    this.mPathForSingleBorder.lineTo(i9, f11);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (iRound3 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound7 = Math.round(directionAwareBorderInsets.right);
                    updatePathEffect(iRound7);
                    this.mPaint.setStrokeWidth(iRound7);
                    float f12 = i9 - (iRound7 / 2);
                    this.mPathForSingleBorder.moveTo(f12, i5);
                    this.mPathForSingleBorder.lineTo(f12, i10);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (iRound4 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound8 = Math.round(directionAwareBorderInsets.bottom);
                    updatePathEffect(iRound8);
                    this.mPaint.setStrokeWidth(iRound8);
                    float f13 = i10 - (iRound8 / 2);
                    this.mPathForSingleBorder.moveTo(i4, f13);
                    this.mPathForSingleBorder.lineTo(i9, f13);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
            }
        }
    }

    private void drawRoundedBackgroundWithBorders(Canvas canvas) {
        int i2;
        float f2;
        updatePath();
        canvas.save();
        canvas.clipPath((Path) Preconditions.checkNotNull(this.mOuterClipPathForBorderRadius), Region.Op.INTERSECT);
        int alphaComponent = ColorUtils.setAlphaComponent(this.mColor, getOpacity());
        if (Color.alpha(alphaComponent) != 0) {
            this.mPaint.setColor(alphaComponent);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) Preconditions.checkNotNull(this.mBackgroundColorRenderPath), this.mPaint);
        }
        List<BackgroundImageLayer> list = this.mBackgroundImageLayers;
        if (list != null && !list.isEmpty()) {
            this.mPaint.setShader(getBackgroundImageShader());
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) Preconditions.checkNotNull(this.mBackgroundColorRenderPath), this.mPaint);
            this.mPaint.setShader(null);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int borderColor = getBorderColor(0);
        int borderColor2 = getBorderColor(1);
        int borderColor3 = getBorderColor(2);
        int borderColor4 = getBorderColor(3);
        int borderColor5 = getBorderColor(9);
        int borderColor6 = getBorderColor(11);
        int borderColor7 = getBorderColor(10);
        if (isBorderColorDefined(9)) {
            borderColor2 = borderColor5;
            borderColor4 = borderColor2;
        }
        if (!isBorderColorDefined(10)) {
            borderColor7 = borderColor4;
        }
        if (!isBorderColorDefined(11)) {
            borderColor6 = borderColor2;
        }
        if (directionAwareBorderInsets.top > 0.0f || directionAwareBorderInsets.bottom > 0.0f || directionAwareBorderInsets.left > 0.0f || directionAwareBorderInsets.right > 0.0f) {
            float fullBorderWidth = getFullBorderWidth();
            int borderColor8 = getBorderColor(8);
            if (directionAwareBorderInsets.top != fullBorderWidth || directionAwareBorderInsets.bottom != fullBorderWidth || directionAwareBorderInsets.left != fullBorderWidth || directionAwareBorderInsets.right != fullBorderWidth || borderColor != borderColor8 || borderColor6 != borderColor8 || borderColor3 != borderColor8 || borderColor7 != borderColor8) {
                this.mPaint.setStyle(Paint.Style.FILL);
                canvas.clipPath((Path) Preconditions.checkNotNull(this.mInnerClipPathForBorderRadius), Region.Op.DIFFERENCE);
                boolean z2 = getLayoutDirection() == 1;
                int borderColor9 = getBorderColor(4);
                int borderColor10 = getBorderColor(5);
                if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                    if (isBorderColorDefined(4)) {
                        borderColor = borderColor9;
                    }
                    if (isBorderColorDefined(5)) {
                        borderColor3 = borderColor10;
                    }
                    i2 = z2 ? borderColor3 : borderColor;
                    if (!z2) {
                        borderColor = borderColor3;
                    }
                } else {
                    int i3 = z2 ? borderColor10 : borderColor9;
                    if (!z2) {
                        borderColor9 = borderColor10;
                    }
                    boolean zIsBorderColorDefined = isBorderColorDefined(4);
                    boolean zIsBorderColorDefined2 = isBorderColorDefined(5);
                    boolean z3 = z2 ? zIsBorderColorDefined2 : zIsBorderColorDefined;
                    if (!z2) {
                        zIsBorderColorDefined = zIsBorderColorDefined2;
                    }
                    if (z3) {
                        borderColor = i3;
                    }
                    if (zIsBorderColorDefined) {
                        i2 = borderColor;
                        borderColor = borderColor9;
                    } else {
                        i2 = borderColor;
                        borderColor = borderColor3;
                    }
                }
                RectF rectF = (RectF) Preconditions.checkNotNull(this.mOuterClipTempRectForBorderRadius);
                float f3 = rectF.left;
                float f4 = rectF.right;
                float f5 = rectF.top;
                float f6 = rectF.bottom;
                PointF pointF = (PointF) Preconditions.checkNotNull(this.mInnerTopLeftCorner);
                PointF pointF2 = (PointF) Preconditions.checkNotNull(this.mInnerTopRightCorner);
                PointF pointF3 = (PointF) Preconditions.checkNotNull(this.mInnerBottomLeftCorner);
                PointF pointF4 = (PointF) Preconditions.checkNotNull(this.mInnerBottomRightCorner);
                if (directionAwareBorderInsets.left > 0.0f) {
                    f2 = f3;
                    drawQuadrilateral(canvas, i2, f3, f5 - 0.8f, pointF.x, pointF.y - 0.8f, pointF3.x, pointF3.y + 0.8f, f3, f6 + 0.8f);
                } else {
                    f2 = f3;
                }
                if (directionAwareBorderInsets.top > 0.0f) {
                    drawQuadrilateral(canvas, borderColor6, f2 - 0.8f, f5, pointF.x - 0.8f, pointF.y, pointF2.x + 0.8f, pointF2.y, f4 + 0.8f, f5);
                }
                if (directionAwareBorderInsets.right > 0.0f) {
                    drawQuadrilateral(canvas, borderColor, f4, f5 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF4.x, pointF4.y + 0.8f, f4, f6 + 0.8f);
                }
                if (directionAwareBorderInsets.bottom > 0.0f) {
                    drawQuadrilateral(canvas, borderColor7, f2 - 0.8f, f6, pointF3.x - 0.8f, pointF3.y, pointF4.x + 0.8f, pointF4.y, f4 + 0.8f, f6);
                }
            } else if (fullBorderWidth > 0.0f) {
                this.mPaint.setColor(multiplyColorAlpha(borderColor8, this.mAlpha));
                this.mPaint.setStyle(Paint.Style.STROKE);
                this.mPaint.setStrokeWidth(fullBorderWidth);
                canvas.drawPath((Path) Preconditions.checkNotNull(this.mCenterDrawPath), this.mPaint);
            }
        }
        canvas.restore();
    }

    private static int fastBorderCompatibleColorOrZero(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i2 > 0 ? i6 : -1;
        int i11 = i3 > 0 ? i7 : -1;
        int i12 = (-1) - (((-1) - (i5 > 0 ? i9 : -1)) | ((-1) - (((i10 + i11) - (i10 | i11)) & (i4 > 0 ? i8 : -1))));
        if (i2 <= 0) {
            i6 = 0;
        }
        if (i3 <= 0) {
            i7 = 0;
        }
        int i13 = (i6 + i7) - (i6 & i7);
        if (i4 <= 0) {
            i8 = 0;
        }
        int i14 = (i13 + i8) - (i13 & i8);
        if (i5 <= 0) {
            i9 = 0;
        }
        if (i12 == (i14 | i9)) {
            return i12;
        }
        return 0;
    }

    private Shader getBackgroundImageShader() {
        List<BackgroundImageLayer> list = this.mBackgroundImageLayers;
        Shader composeShader = null;
        if (list == null) {
            return null;
        }
        Iterator<BackgroundImageLayer> it = list.iterator();
        while (it.hasNext()) {
            Shader shader = it.next().getShader(getBounds());
            if (shader != null) {
                composeShader = composeShader == null ? shader : new ComposeShader(shader, composeShader, PorterDuff.Mode.SRC_OVER);
            }
        }
        return composeShader;
    }

    private static void getEllipseIntersectionWithLine(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, PointF pointF) {
        double d10 = (d2 + d4) / 2.0d;
        double d11 = (d3 + d5) / 2.0d;
        double d12 = d6 - d10;
        double d13 = d7 - d11;
        double dAbs = Math.abs(d4 - d2) / 2.0d;
        double dAbs2 = Math.abs(d5 - d3) / 2.0d;
        double d14 = ((d9 - d11) - d13) / ((d8 - d10) - d12);
        double d15 = d13 - (d12 * d14);
        double d16 = dAbs2 * dAbs2;
        double d17 = dAbs * dAbs;
        double d18 = d16 + (d17 * d14 * d14);
        double d19 = dAbs * 2.0d * dAbs * d15 * d14;
        double d20 = (-(d17 * ((d15 * d15) - d16))) / d18;
        double d21 = d18 * 2.0d;
        double dSqrt = ((-d19) / d21) - Math.sqrt(d20 + Math.pow(d19 / d21, 2.0d));
        double d22 = (d14 * dSqrt) + d15;
        double d23 = dSqrt + d10;
        double d24 = d22 + d11;
        if (Double.isNaN(d23) || Double.isNaN(d24)) {
            return;
        }
        pointF.x = (float) d23;
        pointF.y = (float) d24;
    }

    private static PathEffect getPathEffect(BorderStyle borderStyle, float f2) {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$uimanager$style$BorderStyle[borderStyle.ordinal()];
        if (i2 == 2) {
            float f3 = f2 * 3.0f;
            return new DashPathEffect(new float[]{f3, f3, f3, f3}, 0.0f);
        }
        if (i2 != 3) {
            return null;
        }
        return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
    }

    private boolean isBorderColorDefined(int i2) {
        Spacing spacing = this.mBorderRGB;
        float f2 = spacing != null ? spacing.get(i2) : Float.NaN;
        Spacing spacing2 = this.mBorderAlpha;
        return (Float.isNaN(f2) || Float.isNaN(spacing2 != null ? spacing2.get(i2) : Float.NaN)) ? false : true;
    }

    private static int multiplyColorAlpha(int i2, int i3) {
        if (i3 == 255) {
            return i2;
        }
        if (i3 == 0) {
            return (-1) - (((-1) - i2) | ((-1) - ViewCompat.MEASURED_SIZE_MASK));
        }
        return (-1) - (((-1) - ((i2 + ViewCompat.MEASURED_SIZE_MASK) - (i2 | ViewCompat.MEASURED_SIZE_MASK))) & ((-1) - ((((i2 >>> 24) * (i3 + (i3 >> 7))) >> 8) << 24)));
    }

    private void setBorderAlpha(int i2, float f2) {
        if (this.mBorderAlpha == null) {
            this.mBorderAlpha = new Spacing(255.0f);
        }
        if (FloatUtil.floatsEqual(this.mBorderAlpha.getRaw(i2), f2)) {
            return;
        }
        this.mBorderAlpha.set(i2, f2);
        invalidateSelf();
    }

    private void setBorderRGB(int i2, float f2) {
        if (this.mBorderRGB == null) {
            this.mBorderRGB = new Spacing(0.0f);
        }
        if (FloatUtil.floatsEqual(this.mBorderRGB.getRaw(i2), f2)) {
            return;
        }
        this.mBorderRGB.set(i2, f2);
        invalidateSelf();
    }

    private void updatePath() {
        float f2;
        if (this.mNeedUpdatePathForBorderRadius) {
            this.mNeedUpdatePathForBorderRadius = false;
            if (this.mInnerClipPathForBorderRadius == null) {
                this.mInnerClipPathForBorderRadius = new Path();
            }
            if (this.mBackgroundColorRenderPath == null) {
                this.mBackgroundColorRenderPath = new Path();
            }
            if (this.mOuterClipPathForBorderRadius == null) {
                this.mOuterClipPathForBorderRadius = new Path();
            }
            if (this.mPathForBorderRadiusOutline == null) {
                this.mPathForBorderRadiusOutline = new Path();
            }
            if (this.mCenterDrawPath == null) {
                this.mCenterDrawPath = new Path();
            }
            if (this.mInnerClipTempRectForBorderRadius == null) {
                this.mInnerClipTempRectForBorderRadius = new RectF();
            }
            if (this.mOuterClipTempRectForBorderRadius == null) {
                this.mOuterClipTempRectForBorderRadius = new RectF();
            }
            if (this.mTempRectForBorderRadiusOutline == null) {
                this.mTempRectForBorderRadiusOutline = new RectF();
            }
            if (this.mTempRectForCenterDrawPath == null) {
                this.mTempRectForCenterDrawPath = new RectF();
            }
            this.mInnerClipPathForBorderRadius.reset();
            this.mBackgroundColorRenderPath.reset();
            this.mOuterClipPathForBorderRadius.reset();
            this.mPathForBorderRadiusOutline.reset();
            this.mCenterDrawPath.reset();
            this.mInnerClipTempRectForBorderRadius.set(getBounds());
            this.mOuterClipTempRectForBorderRadius.set(getBounds());
            this.mTempRectForBorderRadiusOutline.set(getBounds());
            this.mTempRectForCenterDrawPath.set(getBounds());
            RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
            int borderColor = getBorderColor(0);
            int borderColor2 = getBorderColor(1);
            int borderColor3 = getBorderColor(2);
            int borderColor4 = getBorderColor(3);
            int borderColor5 = getBorderColor(8);
            int borderColor6 = getBorderColor(9);
            int borderColor7 = getBorderColor(11);
            int borderColor8 = getBorderColor(10);
            if (isBorderColorDefined(9)) {
                borderColor2 = borderColor6;
                borderColor4 = borderColor2;
            }
            if (!isBorderColorDefined(10)) {
                borderColor8 = borderColor4;
            }
            if (!isBorderColorDefined(11)) {
                borderColor7 = borderColor2;
            }
            if (Color.alpha(borderColor) == 0 || Color.alpha(borderColor7) == 0 || Color.alpha(borderColor3) == 0 || Color.alpha(borderColor8) == 0 || Color.alpha(borderColor5) == 0) {
                f2 = 0.0f;
            } else {
                this.mInnerClipTempRectForBorderRadius.top += directionAwareBorderInsets.top;
                this.mInnerClipTempRectForBorderRadius.bottom -= directionAwareBorderInsets.bottom;
                this.mInnerClipTempRectForBorderRadius.left += directionAwareBorderInsets.left;
                this.mInnerClipTempRectForBorderRadius.right -= directionAwareBorderInsets.right;
                f2 = 0.8f;
            }
            this.mTempRectForCenterDrawPath.top += directionAwareBorderInsets.top * 0.5f;
            this.mTempRectForCenterDrawPath.bottom -= directionAwareBorderInsets.bottom * 0.5f;
            this.mTempRectForCenterDrawPath.left += directionAwareBorderInsets.left * 0.5f;
            this.mTempRectForCenterDrawPath.right -= directionAwareBorderInsets.right * 0.5f;
            ComputedBorderRadius computedBorderRadiusResolve = this.mBorderRadius.resolve(getLayoutDirection(), this.mContext, PixelUtil.toDIPFromPixel(this.mOuterClipTempRectForBorderRadius.width()), PixelUtil.toDIPFromPixel(this.mOuterClipTempRectForBorderRadius.height()));
            this.mComputedBorderRadius = computedBorderRadiusResolve;
            CornerRadii pixelFromDIP = computedBorderRadiusResolve.getTopLeft().toPixelFromDIP();
            CornerRadii pixelFromDIP2 = this.mComputedBorderRadius.getTopRight().toPixelFromDIP();
            CornerRadii pixelFromDIP3 = this.mComputedBorderRadius.getBottomLeft().toPixelFromDIP();
            CornerRadii pixelFromDIP4 = this.mComputedBorderRadius.getBottomRight().toPixelFromDIP();
            float innerBorderRadius = getInnerBorderRadius(pixelFromDIP.getHorizontal(), directionAwareBorderInsets.left);
            float innerBorderRadius2 = getInnerBorderRadius(pixelFromDIP.getVertical(), directionAwareBorderInsets.top);
            float innerBorderRadius3 = getInnerBorderRadius(pixelFromDIP2.getHorizontal(), directionAwareBorderInsets.right);
            float innerBorderRadius4 = getInnerBorderRadius(pixelFromDIP2.getVertical(), directionAwareBorderInsets.top);
            float innerBorderRadius5 = getInnerBorderRadius(pixelFromDIP4.getHorizontal(), directionAwareBorderInsets.right);
            float innerBorderRadius6 = getInnerBorderRadius(pixelFromDIP4.getVertical(), directionAwareBorderInsets.bottom);
            float innerBorderRadius7 = getInnerBorderRadius(pixelFromDIP3.getHorizontal(), directionAwareBorderInsets.left);
            float innerBorderRadius8 = getInnerBorderRadius(pixelFromDIP3.getVertical(), directionAwareBorderInsets.bottom);
            this.mInnerClipPathForBorderRadius.addRoundRect(this.mInnerClipTempRectForBorderRadius, new float[]{innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, innerBorderRadius8}, Path.Direction.CW);
            this.mBackgroundColorRenderPath.addRoundRect(this.mInnerClipTempRectForBorderRadius.left - f2, this.mInnerClipTempRectForBorderRadius.top - f2, this.mInnerClipTempRectForBorderRadius.right + f2, this.mInnerClipTempRectForBorderRadius.bottom + f2, new float[]{innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, innerBorderRadius8}, Path.Direction.CW);
            this.mOuterClipPathForBorderRadius.addRoundRect(this.mOuterClipTempRectForBorderRadius, new float[]{pixelFromDIP.getHorizontal(), pixelFromDIP.getVertical(), pixelFromDIP2.getHorizontal(), pixelFromDIP2.getVertical(), pixelFromDIP4.getHorizontal(), pixelFromDIP4.getVertical(), pixelFromDIP3.getHorizontal(), pixelFromDIP3.getVertical()}, Path.Direction.CW);
            Spacing spacing = this.mBorderWidth;
            float f3 = spacing != null ? spacing.get(8) / 2.0f : 0.0f;
            this.mPathForBorderRadiusOutline.addRoundRect(this.mTempRectForBorderRadiusOutline, new float[]{pixelFromDIP.getHorizontal() + f3, pixelFromDIP.getVertical() + f3, pixelFromDIP2.getHorizontal() + f3, pixelFromDIP2.getVertical() + f3, pixelFromDIP4.getHorizontal() + f3, pixelFromDIP4.getVertical() + f3, pixelFromDIP3.getHorizontal() + f3, pixelFromDIP3.getVertical() + f3}, Path.Direction.CW);
            this.mCenterDrawPath.addRoundRect(this.mTempRectForCenterDrawPath, new float[]{pixelFromDIP.getHorizontal() - (directionAwareBorderInsets.left * 0.5f), pixelFromDIP.getVertical() - (directionAwareBorderInsets.top * 0.5f), pixelFromDIP2.getHorizontal() - (directionAwareBorderInsets.right * 0.5f), pixelFromDIP2.getVertical() - (directionAwareBorderInsets.top * 0.5f), pixelFromDIP4.getHorizontal() - (directionAwareBorderInsets.right * 0.5f), pixelFromDIP4.getVertical() - (directionAwareBorderInsets.bottom * 0.5f), pixelFromDIP3.getHorizontal() - (directionAwareBorderInsets.left * 0.5f), pixelFromDIP3.getVertical() - (directionAwareBorderInsets.bottom * 0.5f)}, Path.Direction.CW);
            if (this.mInnerTopLeftCorner == null) {
                this.mInnerTopLeftCorner = new PointF();
            }
            this.mInnerTopLeftCorner.x = this.mInnerClipTempRectForBorderRadius.left;
            this.mInnerTopLeftCorner.y = this.mInnerClipTempRectForBorderRadius.top;
            getEllipseIntersectionWithLine(this.mInnerClipTempRectForBorderRadius.left, this.mInnerClipTempRectForBorderRadius.top, this.mInnerClipTempRectForBorderRadius.left + (innerBorderRadius * 2.0f), this.mInnerClipTempRectForBorderRadius.top + (innerBorderRadius2 * 2.0f), this.mOuterClipTempRectForBorderRadius.left, this.mOuterClipTempRectForBorderRadius.top, this.mInnerClipTempRectForBorderRadius.left, this.mInnerClipTempRectForBorderRadius.top, this.mInnerTopLeftCorner);
            if (this.mInnerBottomLeftCorner == null) {
                this.mInnerBottomLeftCorner = new PointF();
            }
            this.mInnerBottomLeftCorner.x = this.mInnerClipTempRectForBorderRadius.left;
            this.mInnerBottomLeftCorner.y = this.mInnerClipTempRectForBorderRadius.bottom;
            getEllipseIntersectionWithLine(this.mInnerClipTempRectForBorderRadius.left, this.mInnerClipTempRectForBorderRadius.bottom - (innerBorderRadius8 * 2.0f), this.mInnerClipTempRectForBorderRadius.left + (innerBorderRadius7 * 2.0f), this.mInnerClipTempRectForBorderRadius.bottom, this.mOuterClipTempRectForBorderRadius.left, this.mOuterClipTempRectForBorderRadius.bottom, this.mInnerClipTempRectForBorderRadius.left, this.mInnerClipTempRectForBorderRadius.bottom, this.mInnerBottomLeftCorner);
            if (this.mInnerTopRightCorner == null) {
                this.mInnerTopRightCorner = new PointF();
            }
            this.mInnerTopRightCorner.x = this.mInnerClipTempRectForBorderRadius.right;
            this.mInnerTopRightCorner.y = this.mInnerClipTempRectForBorderRadius.top;
            getEllipseIntersectionWithLine(this.mInnerClipTempRectForBorderRadius.right - (innerBorderRadius3 * 2.0f), this.mInnerClipTempRectForBorderRadius.top, this.mInnerClipTempRectForBorderRadius.right, this.mInnerClipTempRectForBorderRadius.top + (innerBorderRadius4 * 2.0f), this.mOuterClipTempRectForBorderRadius.right, this.mOuterClipTempRectForBorderRadius.top, this.mInnerClipTempRectForBorderRadius.right, this.mInnerClipTempRectForBorderRadius.top, this.mInnerTopRightCorner);
            if (this.mInnerBottomRightCorner == null) {
                this.mInnerBottomRightCorner = new PointF();
            }
            this.mInnerBottomRightCorner.x = this.mInnerClipTempRectForBorderRadius.right;
            this.mInnerBottomRightCorner.y = this.mInnerClipTempRectForBorderRadius.bottom;
            getEllipseIntersectionWithLine(this.mInnerClipTempRectForBorderRadius.right - (innerBorderRadius5 * 2.0f), this.mInnerClipTempRectForBorderRadius.bottom - (2.0f * innerBorderRadius6), this.mInnerClipTempRectForBorderRadius.right, this.mInnerClipTempRectForBorderRadius.bottom, this.mOuterClipTempRectForBorderRadius.right, this.mOuterClipTempRectForBorderRadius.bottom, this.mInnerClipTempRectForBorderRadius.right, this.mInnerClipTempRectForBorderRadius.bottom, this.mInnerBottomRightCorner);
        }
    }

    private void updatePathEffect() {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? getPathEffect(borderStyle, getFullBorderWidth()) : null);
    }

    private void updatePathEffect(int i2) {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? getPathEffect(borderStyle, i2) : null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        updatePathEffect();
        if (hasRoundedBorders()) {
            drawRoundedBackgroundWithBorders(canvas);
        } else {
            drawRectangularBackgroundWithBorders(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    public Path getBorderBoxPath() {
        if (!hasRoundedBorders()) {
            return null;
        }
        updatePath();
        return new Path((Path) Preconditions.checkNotNull(this.mOuterClipPathForBorderRadius));
    }

    public RectF getBorderBoxRect() {
        return new RectF(getBounds());
    }

    public int getBorderColor(int i2) {
        Spacing spacing = this.mBorderRGB;
        float f2 = spacing != null ? spacing.get(i2) : 0.0f;
        Spacing spacing2 = this.mBorderAlpha;
        return colorFromAlphaAndRGBComponents(spacing2 != null ? spacing2.get(i2) : 255.0f, f2);
    }

    public BorderRadiusStyle getBorderRadius() {
        return this.mBorderRadius;
    }

    public BorderStyle getBorderStyle() {
        return this.mBorderStyle;
    }

    public Float getBorderWidth(int i2) {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null) {
            return null;
        }
        float raw = spacing.getRaw(i2);
        if (Float.isNaN(raw)) {
            return null;
        }
        return Float.valueOf(raw);
    }

    public float getBorderWidthOrDefaultTo(float f2, int i2) {
        Float borderWidth = getBorderWidth(i2);
        return borderWidth == null ? f2 : borderWidth.floatValue();
    }

    @VisibleForTesting
    public int getColor() {
        return this.mColor;
    }

    @Deprecated(forRemoval = true, since = "0.76.0")
    public ComputedBorderRadius getComputedBorderRadius() {
        return this.mComputedBorderRadius;
    }

    public RectF getDirectionAwareBorderInsets() {
        float borderWidthOrDefaultTo = getBorderWidthOrDefaultTo(0.0f, 8);
        float borderWidthOrDefaultTo2 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 1);
        float borderWidthOrDefaultTo3 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 3);
        float borderWidthOrDefaultTo4 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 0);
        float borderWidthOrDefaultTo5 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 2);
        if (this.mBorderWidth != null) {
            boolean z2 = getLayoutDirection() == 1;
            float raw = this.mBorderWidth.getRaw(4);
            float raw2 = this.mBorderWidth.getRaw(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (!Float.isNaN(raw)) {
                    borderWidthOrDefaultTo4 = raw;
                }
                if (!Float.isNaN(raw2)) {
                    borderWidthOrDefaultTo5 = raw2;
                }
                float f2 = z2 ? borderWidthOrDefaultTo5 : borderWidthOrDefaultTo4;
                if (z2) {
                    borderWidthOrDefaultTo5 = borderWidthOrDefaultTo4;
                }
                borderWidthOrDefaultTo4 = f2;
            } else {
                float f3 = z2 ? raw2 : raw;
                if (!z2) {
                    raw = raw2;
                }
                if (!Float.isNaN(f3)) {
                    borderWidthOrDefaultTo4 = f3;
                }
                if (!Float.isNaN(raw)) {
                    borderWidthOrDefaultTo5 = raw;
                }
            }
        }
        return new RectF(borderWidthOrDefaultTo4, borderWidthOrDefaultTo2, borderWidthOrDefaultTo5, borderWidthOrDefaultTo3);
    }

    public float getFullBorderWidth() {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null || Float.isNaN(spacing.getRaw(8))) {
            return 0.0f;
        }
        return this.mBorderWidth.getRaw(8);
    }

    public float getInnerBorderRadius(float f2, float f3) {
        return Math.max(f2 - f3, 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        int i2 = this.mLayoutDirectionOverride;
        return i2 == -1 ? super.getLayoutDirection() : i2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (Color.alpha(this.mColor) * this.mAlpha) >> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (!hasRoundedBorders()) {
            outline.setRect(getBounds());
        } else {
            updatePath();
            outline.setConvexPath((Path) Preconditions.checkNotNull(this.mPathForBorderRadiusOutline));
        }
    }

    public Path getPaddingBoxPath() {
        if (!hasRoundedBorders()) {
            return null;
        }
        updatePath();
        return new Path((Path) Preconditions.checkNotNull(this.mInnerClipPathForBorderRadius));
    }

    public RectF getPaddingBoxRect() {
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        return directionAwareBorderInsets == null ? new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height()) : new RectF(directionAwareBorderInsets.left, directionAwareBorderInsets.top, getBounds().width() - directionAwareBorderInsets.right, getBounds().height() - directionAwareBorderInsets.bottom);
    }

    public boolean hasRoundedBorders() {
        return this.mBorderRadius.hasRoundedBorders();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 != this.mAlpha) {
            this.mAlpha = i2;
            invalidateSelf();
        }
    }

    public void setBackgroundImage(List<BackgroundImageLayer> list) {
        this.mBackgroundImageLayers = list;
        invalidateSelf();
    }

    public void setBorderColor(int i2, Integer num) {
        float fIntValue = num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK;
        float fIntValue2 = num != null ? num.intValue() >>> 24 : Float.NaN;
        setBorderRGB(i2, fIntValue);
        setBorderAlpha(i2, fIntValue2);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public void setBorderRadius(BorderRadiusProp borderRadiusProp, LengthPercentage lengthPercentage) {
        if (Objects.equals(lengthPercentage, this.mBorderRadius.get(borderRadiusProp))) {
            return;
        }
        this.mBorderRadius.set(borderRadiusProp, lengthPercentage);
        this.mNeedUpdatePathForBorderRadius = true;
        invalidateSelf();
    }

    public void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.mBorderRadius = borderRadiusStyle;
    }

    public void setBorderStyle(BorderStyle borderStyle) {
        if (this.mBorderStyle != borderStyle) {
            this.mBorderStyle = borderStyle;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public void setBorderStyle(String str) {
        setBorderStyle(str == null ? null : BorderStyle.valueOf(str.toUpperCase(Locale.US)));
    }

    public void setBorderWidth(int i2, float f2) {
        if (this.mBorderWidth == null) {
            this.mBorderWidth = new Spacing();
        }
        if (FloatUtil.floatsEqual(this.mBorderWidth.getRaw(i2), f2)) {
            return;
        }
        this.mBorderWidth.set(i2, f2);
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8) {
            this.mNeedUpdatePathForBorderRadius = true;
        }
        invalidateSelf();
    }

    public void setColor(int i2) {
        this.mColor = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Deprecated
    public void setLayoutDirectionOverride(int i2) {
        if (this.mLayoutDirectionOverride != i2) {
            this.mLayoutDirectionOverride = i2;
        }
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setRadius(float f2) {
        Float fValueOf = Float.isNaN(f2) ? null : Float.valueOf(f2);
        if (fValueOf == null) {
            setBorderRadius(BorderRadiusProp.BORDER_RADIUS, null);
        } else {
            setBorderRadius(BorderRadiusProp.BORDER_RADIUS, new LengthPercentage(fValueOf.floatValue(), LengthPercentageType.POINT));
        }
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setRadius(float f2, int i2) {
        Float fValueOf = Float.isNaN(f2) ? null : Float.valueOf(f2);
        if (fValueOf != null) {
            setBorderRadius(BorderRadiusProp.values()[i2], new LengthPercentage(fValueOf.floatValue(), LengthPercentageType.POINT));
        } else {
            this.mBorderRadius.set(BorderRadiusProp.values()[i2], null);
            invalidateSelf();
        }
    }
}
