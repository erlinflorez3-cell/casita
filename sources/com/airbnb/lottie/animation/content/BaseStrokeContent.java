package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.DropShadow;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, DrawingContent {
    private BaseKeyframeAnimation<Float, Float> blurAnimation;
    float blurMaskFilterRadius;
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> colorFilterAnimation;
    private final List<BaseKeyframeAnimation<?, Float>> dashPatternAnimations;
    private final BaseKeyframeAnimation<?, Float> dashPatternOffsetAnimation;
    private final float[] dashPatternValues;
    protected final BaseLayer layer;
    private final LottieDrawable lottieDrawable;
    private final BaseKeyframeAnimation<?, Integer> opacityAnimation;
    final Paint paint;
    private final BaseKeyframeAnimation<?, Float> widthAnimation;
    private final PathMeasure pm = new PathMeasure();
    private final Path path = new Path();
    private final Path trimPathPath = new Path();
    private final RectF rect = new RectF();
    private final List<PathGroup> pathGroups = new ArrayList();

    private static final class PathGroup {
        private final List<PathContent> paths;
        private final TrimPathContent trimPath;

        private PathGroup(TrimPathContent trimPathContent) {
            this.paths = new ArrayList();
            this.trimPath = trimPathContent;
        }
    }

    BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f2, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.paint = lPaint;
        this.blurMaskFilterRadius = 0.0f;
        this.lottieDrawable = lottieDrawable;
        this.layer = baseLayer;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f2);
        this.opacityAnimation = animatableIntegerValue.createAnimation();
        this.widthAnimation = animatableFloatValue.createAnimation();
        if (animatableFloatValue2 == null) {
            this.dashPatternOffsetAnimation = null;
        } else {
            this.dashPatternOffsetAnimation = animatableFloatValue2.createAnimation();
        }
        this.dashPatternAnimations = new ArrayList(list.size());
        this.dashPatternValues = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.dashPatternAnimations.add(list.get(i2).createAnimation());
        }
        baseLayer.addAnimation(this.opacityAnimation);
        baseLayer.addAnimation(this.widthAnimation);
        for (int i3 = 0; i3 < this.dashPatternAnimations.size(); i3++) {
            baseLayer.addAnimation(this.dashPatternAnimations.get(i3));
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.dashPatternOffsetAnimation;
        if (baseKeyframeAnimation != null) {
            baseLayer.addAnimation(baseKeyframeAnimation);
        }
        this.opacityAnimation.addUpdateListener(this);
        this.widthAnimation.addUpdateListener(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.dashPatternAnimations.get(i4).addUpdateListener(this);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.dashPatternOffsetAnimation;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(this);
        }
        if (baseLayer.getBlurEffect() != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.blurAnimation = floatKeyframeAnimationCreateAnimation;
            floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.blurAnimation);
        }
    }

    private void applyDashPatternIfNeeded() {
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#applyDashPattern");
        }
        if (this.dashPatternAnimations.isEmpty()) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < this.dashPatternAnimations.size(); i2++) {
            this.dashPatternValues[i2] = this.dashPatternAnimations.get(i2).getValue().floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.dashPatternValues;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.dashPatternValues;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.dashPatternOffsetAnimation;
        this.paint.setPathEffect(new DashPathEffect(this.dashPatternValues, baseKeyframeAnimation == null ? 0.0f : baseKeyframeAnimation.getValue().floatValue()));
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#applyDashPattern");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void applyTrimPath(android.graphics.Canvas r14, com.airbnb.lottie.animation.content.BaseStrokeContent.PathGroup r15) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.BaseStrokeContent.applyTrimPath(android.graphics.Canvas, com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup):void");
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t2, LottieValueCallback<T> lottieValueCallback) {
        if (t2 == LottieProperty.OPACITY) {
            this.opacityAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.STROKE_WIDTH) {
            this.widthAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
            if (baseKeyframeAnimation != null) {
                this.layer.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.colorFilterAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorFilterAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.colorFilterAnimation);
            return;
        }
        if (t2 == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.blurAnimation = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.blurAnimation);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i2, DropShadow dropShadow) {
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#draw");
        }
        if (Utils.hasZeroScaleAxis(matrix)) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.opacityAnimation.getValue().intValue() / 100.0f;
        this.paint.setAlpha(MiscUtils.clamp((int) (i2 * fIntValue), 0, 255));
        this.paint.setStrokeWidth(((FloatKeyframeAnimation) this.widthAnimation).getFloatValue());
        if (this.paint.getStrokeWidth() <= 0.0f) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        applyDashPatternIfNeeded();
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
        if (baseKeyframeAnimation != null) {
            this.paint.setColorFilter(baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
        if (baseKeyframeAnimation2 != null) {
            float fFloatValue = baseKeyframeAnimation2.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                this.paint.setMaskFilter(null);
            } else if (fFloatValue != this.blurMaskFilterRadius) {
                this.paint.setMaskFilter(this.layer.getBlurMaskFilter(fFloatValue));
            }
            this.blurMaskFilterRadius = fFloatValue;
        }
        if (dropShadow != null) {
            dropShadow.applyWithAlpha((int) (fIntValue * 255.0f), this.paint);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i3 = 0; i3 < this.pathGroups.size(); i3++) {
            PathGroup pathGroup = this.pathGroups.get(i3);
            if (pathGroup.trimPath != null) {
                applyTrimPath(canvas, pathGroup);
            } else {
                if (L.isTraceEnabled()) {
                    L.beginSection("StrokeContent#buildPath");
                }
                this.path.reset();
                for (int size = pathGroup.paths.size() - 1; size >= 0; size--) {
                    this.path.addPath(((PathContent) pathGroup.paths.get(size)).getPath());
                }
                if (L.isTraceEnabled()) {
                    L.endSection("StrokeContent#buildPath");
                    L.beginSection("StrokeContent#drawPath");
                }
                canvas.drawPath(this.path, this.paint);
                if (L.isTraceEnabled()) {
                    L.endSection("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z2) {
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#getBounds");
        }
        this.path.reset();
        for (int i2 = 0; i2 < this.pathGroups.size(); i2++) {
            PathGroup pathGroup = this.pathGroups.get(i2);
            for (int i3 = 0; i3 < pathGroup.paths.size(); i3++) {
                this.path.addPath(((PathContent) pathGroup.paths.get(i3)).getPath(), matrix);
            }
        }
        this.path.computeBounds(this.rect, false);
        float floatValue = ((FloatKeyframeAnimation) this.widthAnimation).getFloatValue();
        RectF rectF2 = this.rect;
        float f2 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f2, this.rect.top - f2, this.rect.right + f2, this.rect.bottom + f2);
        rectF.set(this.rect);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#getBounds");
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() throws Throwable {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i2, list, keyPath2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // com.airbnb.lottie.animation.content.Content
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> r9, java.util.List<com.airbnb.lottie.animation.content.Content> r10) {
        /*
            r8 = this;
            int r0 = r9.size()
            int r3 = r0 + (-1)
            r7 = 0
            r6 = r7
        L8:
            if (r3 < 0) goto L22
            java.lang.Object r2 = r9.get(r3)
            com.airbnb.lottie.animation.content.Content r2 = (com.airbnb.lottie.animation.content.Content) r2
            boolean r0 = r2 instanceof com.airbnb.lottie.animation.content.TrimPathContent
            if (r0 == 0) goto L1f
            com.airbnb.lottie.animation.content.TrimPathContent r2 = (com.airbnb.lottie.animation.content.TrimPathContent) r2
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r1 = r2.getType()
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r0 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.INDIVIDUALLY
            if (r1 != r0) goto L1f
            r6 = r2
        L1f:
            int r3 = r3 + (-1)
            goto L8
        L22:
            if (r6 == 0) goto L27
            r6.addListener(r8)
        L27:
            int r0 = r10.size()
            int r5 = r0 + (-1)
            r4 = r7
        L2e:
            if (r5 < 0) goto L6c
            java.lang.Object r3 = r10.get(r5)
            com.airbnb.lottie.animation.content.Content r3 = (com.airbnb.lottie.animation.content.Content) r3
            boolean r0 = r3 instanceof com.airbnb.lottie.animation.content.TrimPathContent
            if (r0 == 0) goto L57
            r2 = r3
            com.airbnb.lottie.animation.content.TrimPathContent r2 = (com.airbnb.lottie.animation.content.TrimPathContent) r2
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r1 = r2.getType()
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r0 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.INDIVIDUALLY
            if (r1 != r0) goto L57
            if (r4 == 0) goto L4c
            java.util.List<com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup> r0 = r8.pathGroups
            r0.add(r4)
        L4c:
            com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup r4 = new com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup
            r4.<init>(r2)
            r2.addListener(r8)
        L54:
            int r5 = r5 + (-1)
            goto L2e
        L57:
            boolean r0 = r3 instanceof com.airbnb.lottie.animation.content.PathContent
            if (r0 == 0) goto L54
            if (r4 != 0) goto L62
            com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup r4 = new com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup
            r4.<init>(r6)
        L62:
            java.util.List r0 = com.airbnb.lottie.animation.content.BaseStrokeContent.PathGroup.access$100(r4)
            com.airbnb.lottie.animation.content.PathContent r3 = (com.airbnb.lottie.animation.content.PathContent) r3
            r0.add(r3)
            goto L54
        L6c:
            if (r4 == 0) goto L73
            java.util.List<com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup> r0 = r8.pathGroups
            r0.add(r4)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.BaseStrokeContent.setContents(java.util.List, java.util.List):void");
    }
}
