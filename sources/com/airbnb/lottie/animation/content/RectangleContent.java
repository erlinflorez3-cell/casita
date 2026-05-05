package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RectangleContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, PathContent {
    private final BaseKeyframeAnimation<?, Float> cornerRadiusAnimation;
    private final boolean hidden;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final BaseKeyframeAnimation<?, PointF> sizeAnimation;
    private final Path path = new Path();
    private final RectF rect = new RectF();
    private final CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();
    private BaseKeyframeAnimation<Float, Float> roundedCornersAnimation = null;

    public RectangleContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RectangleShape rectangleShape) {
        this.name = rectangleShape.getName();
        this.hidden = rectangleShape.isHidden();
        this.lottieDrawable = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation = rectangleShape.getPosition().createAnimation();
        this.positionAnimation = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = rectangleShape.getSize().createAnimation();
        this.sizeAnimation = baseKeyframeAnimationCreateAnimation2;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = rectangleShape.getCornerRadius().createAnimation();
        this.cornerRadiusAnimation = floatKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
    }

    private void invalidate() throws Throwable {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t2, LottieValueCallback<T> lottieValueCallback) {
        if (t2 == LottieProperty.RECTANGLE_SIZE) {
            this.sizeAnimation.setValueCallback(lottieValueCallback);
        } else if (t2 == LottieProperty.POSITION) {
            this.positionAnimation.setValueCallback(lottieValueCallback);
        } else if (t2 == LottieProperty.CORNER_RADIUS) {
            this.cornerRadiusAnimation.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation;
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        PointF value = this.sizeAnimation.getValue();
        float f2 = value.x / 2.0f;
        float f3 = value.y / 2.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.cornerRadiusAnimation;
        float floatValue = baseKeyframeAnimation2 == null ? 0.0f : ((FloatKeyframeAnimation) baseKeyframeAnimation2).getFloatValue();
        if (floatValue == 0.0f && (baseKeyframeAnimation = this.roundedCornersAnimation) != null) {
            floatValue = Math.min(baseKeyframeAnimation.getValue().floatValue(), Math.min(f2, f3));
        }
        float fMin = Math.min(f2, f3);
        if (floatValue > fMin) {
            floatValue = fMin;
        }
        PointF value2 = this.positionAnimation.getValue();
        this.path.moveTo(value2.x + f2, (value2.y - f3) + floatValue);
        this.path.lineTo(value2.x + f2, (value2.y + f3) - floatValue);
        if (floatValue > 0.0f) {
            float f4 = floatValue * 2.0f;
            this.rect.set((value2.x + f2) - f4, (value2.y + f3) - f4, value2.x + f2, value2.y + f3);
            this.path.arcTo(this.rect, 0.0f, 90.0f, false);
        }
        this.path.lineTo((value2.x - f2) + floatValue, value2.y + f3);
        if (floatValue > 0.0f) {
            float f5 = floatValue * 2.0f;
            this.rect.set(value2.x - f2, (value2.y + f3) - f5, (value2.x - f2) + f5, value2.y + f3);
            this.path.arcTo(this.rect, 90.0f, 90.0f, false);
        }
        this.path.lineTo(value2.x - f2, (value2.y - f3) + floatValue);
        if (floatValue > 0.0f) {
            float f6 = floatValue * 2.0f;
            this.rect.set(value2.x - f2, value2.y - f3, (value2.x - f2) + f6, (value2.y - f3) + f6);
            this.path.arcTo(this.rect, 180.0f, 90.0f, false);
        }
        this.path.lineTo((value2.x + f2) - floatValue, value2.y - f3);
        if (floatValue > 0.0f) {
            float f7 = floatValue * 2.0f;
            this.rect.set((value2.x + f2) - f7, value2.y - f3, value2.x + f2, (value2.y - f3) + f7);
            this.path.arcTo(this.rect, 270.0f, 90.0f, false);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // com.airbnb.lottie.animation.content.Content
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> r6, java.util.List<com.airbnb.lottie.animation.content.Content> r7) {
        /*
            r5 = this;
            r4 = 0
        L1:
            int r0 = r6.size()
            if (r4 >= r0) goto L34
            java.lang.Object r3 = r6.get(r4)
            com.airbnb.lottie.animation.content.Content r3 = (com.airbnb.lottie.animation.content.Content) r3
            boolean r0 = r3 instanceof com.airbnb.lottie.animation.content.TrimPathContent
            if (r0 == 0) goto L27
            r2 = r3
            com.airbnb.lottie.animation.content.TrimPathContent r2 = (com.airbnb.lottie.animation.content.TrimPathContent) r2
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r1 = r2.getType()
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r0 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.SIMULTANEOUSLY
            if (r1 != r0) goto L27
            com.airbnb.lottie.animation.content.CompoundTrimPathContent r0 = r5.trimPaths
            r0.addTrimPath(r2)
            r2.addListener(r5)
        L24:
            int r4 = r4 + 1
            goto L1
        L27:
            boolean r0 = r3 instanceof com.airbnb.lottie.animation.content.RoundedCornersContent
            if (r0 == 0) goto L24
            com.airbnb.lottie.animation.content.RoundedCornersContent r3 = (com.airbnb.lottie.animation.content.RoundedCornersContent) r3
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation r0 = r3.getRoundedCorners()
            r5.roundedCornersAnimation = r0
            goto L24
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.RectangleContent.setContents(java.util.List, java.util.List):void");
    }
}
