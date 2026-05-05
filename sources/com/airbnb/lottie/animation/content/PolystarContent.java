package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PolystarContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final float POLYGON_MAGIC_NUMBER = 0.25f;
    private static final float POLYSTAR_MAGIC_NUMBER = 0.47829f;
    private final boolean hidden;
    private final BaseKeyframeAnimation<?, Float> innerRadiusAnimation;
    private final BaseKeyframeAnimation<?, Float> innerRoundednessAnimation;
    private boolean isPathValid;
    private final boolean isReversed;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<?, Float> outerRadiusAnimation;
    private final BaseKeyframeAnimation<?, Float> outerRoundednessAnimation;
    private final BaseKeyframeAnimation<?, Float> pointsAnimation;
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final BaseKeyframeAnimation<?, Float> rotationAnimation;
    private final PolystarShape.Type type;
    private final Path path = new Path();
    private final Path lastSegmentPath = new Path();
    private final PathMeasure lastSegmentPathMeasure = new PathMeasure();
    private final float[] lastSegmentPosition = new float[2];
    private final CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.content.PolystarContent$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.lottieDrawable = lottieDrawable;
        this.name = polystarShape.getName();
        PolystarShape.Type type = polystarShape.getType();
        this.type = type;
        this.hidden = polystarShape.isHidden();
        this.isReversed = polystarShape.isReversed();
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = polystarShape.getPoints().createAnimation();
        this.pointsAnimation = floatKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation = polystarShape.getPosition().createAnimation();
        this.positionAnimation = baseKeyframeAnimationCreateAnimation;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation2 = polystarShape.getRotation().createAnimation();
        this.rotationAnimation = floatKeyframeAnimationCreateAnimation2;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation3 = polystarShape.getOuterRadius().createAnimation();
        this.outerRadiusAnimation = floatKeyframeAnimationCreateAnimation3;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation4 = polystarShape.getOuterRoundedness().createAnimation();
        this.outerRoundednessAnimation = floatKeyframeAnimationCreateAnimation4;
        if (type == PolystarShape.Type.STAR) {
            this.innerRadiusAnimation = polystarShape.getInnerRadius().createAnimation();
            this.innerRoundednessAnimation = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            this.innerRadiusAnimation = null;
            this.innerRoundednessAnimation = null;
        }
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation3);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation4);
        if (type == PolystarShape.Type.STAR) {
            baseLayer.addAnimation(this.innerRadiusAnimation);
            baseLayer.addAnimation(this.innerRoundednessAnimation);
        }
        floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        if (type == PolystarShape.Type.STAR) {
            this.innerRadiusAnimation.addUpdateListener(this);
            this.innerRoundednessAnimation.addUpdateListener(this);
        }
    }

    private void createPolygonPath() {
        PolystarContent polystarContent = this;
        int iFloor = (int) Math.floor(polystarContent.pointsAnimation.getValue().floatValue());
        double radians = Math.toRadians((polystarContent.rotationAnimation == null ? 0.0d : r1.getValue().floatValue()) - 90.0d);
        double d2 = iFloor;
        float fFloatValue = polystarContent.outerRoundednessAnimation.getValue().floatValue() / 100.0f;
        float fFloatValue2 = polystarContent.outerRadiusAnimation.getValue().floatValue();
        double d3 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d3);
        float fSin = (float) (Math.sin(radians) * d3);
        polystarContent.path.moveTo(fCos, fSin);
        double d4 = (float) (6.283185307179586d / d2);
        double d5 = radians + d4;
        double dCeil = Math.ceil(d2);
        int i2 = 0;
        while (true) {
            double d6 = i2;
            if (d6 >= dCeil) {
                PointF value = polystarContent.positionAnimation.getValue();
                polystarContent.path.offset(value.x, value.y);
                polystarContent.path.close();
                return;
            }
            float fCos2 = (float) (d3 * Math.cos(d5));
            float fSin2 = (float) (d3 * Math.sin(d5));
            if (fFloatValue != 0.0f) {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f2 = fFloatValue2 * fFloatValue * 0.25f;
                float f3 = fCos3 * f2;
                float f4 = fSin3 * f2;
                float fCos4 = ((float) Math.cos(dAtan22)) * f2;
                float fSin4 = f2 * ((float) Math.sin(dAtan22));
                if (d6 == dCeil - 1.0d) {
                    polystarContent = this;
                    polystarContent.lastSegmentPath.reset();
                    polystarContent.lastSegmentPath.moveTo(fCos, fSin);
                    float f5 = fCos - f3;
                    float f6 = fSin - f4;
                    float f7 = fCos2 + fCos4;
                    float f8 = fSin4 + fSin2;
                    polystarContent.lastSegmentPath.cubicTo(f5, f6, f7, f8, fCos2, fSin2);
                    polystarContent.lastSegmentPathMeasure.setPath(polystarContent.lastSegmentPath, false);
                    PathMeasure pathMeasure = polystarContent.lastSegmentPathMeasure;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, polystarContent.lastSegmentPosition, null);
                    Path path = polystarContent.path;
                    float[] fArr = polystarContent.lastSegmentPosition;
                    path.cubicTo(f5, f6, f7, f8, fArr[0], fArr[1]);
                } else {
                    polystarContent = this;
                    polystarContent.path.cubicTo(fCos - f3, fSin - f4, fCos2 + fCos4, fSin2 + fSin4, fCos2, fSin2);
                }
            } else if (d6 == dCeil - 1.0d) {
                i2++;
                fSin = fSin2;
                fCos = fCos2;
            } else {
                polystarContent.path.lineTo(fCos2, fSin2);
            }
            d5 += d4;
            i2++;
            fSin = fSin2;
            fCos = fCos2;
        }
    }

    private void createStarPath() {
        float fCos;
        float fSin;
        double d2;
        float f2;
        float f3;
        float fFloatValue = this.pointsAnimation.getValue().floatValue();
        double radians = Math.toRadians((this.rotationAnimation == null ? 0.0d : r0.getValue().floatValue()) - 90.0d);
        double d3 = fFloatValue;
        float f4 = (float) (6.283185307179586d / d3);
        if (this.isReversed) {
            f4 *= -1.0f;
        }
        float f5 = f4 / 2.0f;
        float f6 = fFloatValue - ((int) fFloatValue);
        if (f6 != 0.0f) {
            radians += (double) ((1.0f - f6) * f5);
        }
        float fFloatValue2 = this.outerRadiusAnimation.getValue().floatValue();
        float fFloatValue3 = this.innerRadiusAnimation.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.innerRoundednessAnimation;
        float fFloatValue4 = baseKeyframeAnimation != null ? baseKeyframeAnimation.getValue().floatValue() / 100.0f : 0.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.outerRoundednessAnimation;
        float fFloatValue5 = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.getValue().floatValue() / 100.0f : 0.0f;
        if (f6 != 0.0f) {
            f2 = ((fFloatValue2 - fFloatValue3) * f6) + fFloatValue3;
            double d4 = f2;
            fCos = (float) (d4 * Math.cos(radians));
            fSin = (float) (d4 * Math.sin(radians));
            this.path.moveTo(fCos, fSin);
            d2 = radians + ((double) ((f4 * f6) / 2.0f));
        } else {
            double d5 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d5);
            fSin = (float) (d5 * Math.sin(radians));
            this.path.moveTo(fCos, fSin);
            d2 = radians + ((double) f5);
            f2 = 0.0f;
        }
        double dCeil = Math.ceil(d3) * 2.0d;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            double d6 = i2;
            if (d6 >= dCeil) {
                PointF value = this.positionAnimation.getValue();
                this.path.offset(value.x, value.y);
                this.path.close();
                return;
            }
            float f7 = z2 ? fFloatValue2 : fFloatValue3;
            float f8 = (f2 == 0.0f || d6 != dCeil - 2.0d) ? f5 : (f4 * f6) / 2.0f;
            if (f2 == 0.0f || d6 != dCeil - 1.0d) {
                f3 = f2;
                f2 = f7;
            } else {
                f3 = f2;
            }
            double d7 = f2;
            float fCos2 = (float) (d7 * Math.cos(d2));
            float fSin2 = (float) (d7 * Math.sin(d2));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.path.lineTo(fCos2, fSin2);
            } else {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f9 = z2 ? fFloatValue4 : fFloatValue5;
                float f10 = z2 ? fFloatValue5 : fFloatValue4;
                float f11 = z2 ? fFloatValue3 : fFloatValue2;
                float f12 = z2 ? fFloatValue2 : fFloatValue3;
                float f13 = f11 * f9 * POLYSTAR_MAGIC_NUMBER;
                float f14 = fCos3 * f13;
                float f15 = f13 * fSin3;
                float f16 = f12 * f10 * POLYSTAR_MAGIC_NUMBER;
                float f17 = fCos4 * f16;
                float f18 = f16 * fSin4;
                if (f6 != 0.0f) {
                    if (i2 == 0) {
                        f14 *= f6;
                        f15 *= f6;
                    } else if (d6 == dCeil - 1.0d) {
                        f17 *= f6;
                        f18 *= f6;
                    }
                }
                this.path.cubicTo(fCos - f14, fSin - f15, fCos2 + f17, fSin2 + f18, fCos2, fSin2);
            }
            d2 += (double) f8;
            z2 = !z2;
            i2++;
            fCos = fCos2;
            fSin = fSin2;
            f2 = f3;
        }
    }

    private void invalidate() throws Throwable {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t2, LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t2 == LottieProperty.POLYSTAR_POINTS) {
            this.pointsAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POLYSTAR_ROTATION) {
            this.rotationAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POSITION) {
            this.positionAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POLYSTAR_INNER_RADIUS && (baseKeyframeAnimation2 = this.innerRadiusAnimation) != null) {
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POLYSTAR_OUTER_RADIUS) {
            this.outerRadiusAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POLYSTAR_INNER_ROUNDEDNESS && (baseKeyframeAnimation = this.innerRoundednessAnimation) != null) {
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
        } else if (t2 == LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.outerRoundednessAnimation.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[this.type.ordinal()];
        if (i2 == 1) {
            createStarPath();
        } else if (i2 == 2) {
            createPolygonPath();
        }
        this.path.close();
        this.trimPaths.apply(this.path);
        this.isPathValid = true;
        return this.path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() throws Throwable {
        invalidate();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i2, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Content content = list.get(i2);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.trimPaths.addTrimPath(trimPathContent);
                    trimPathContent.addListener(this);
                }
            }
        }
    }
}
