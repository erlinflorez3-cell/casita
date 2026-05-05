package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private final boolean hidden;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final ShapeKeyframeAnimation shapeAnimation;
    private List<ShapeModifierContent> shapeModifierContents;
    private final Path path = new Path();
    private final CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();

    public ShapeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapePath shapePath) {
        this.name = shapePath.getName();
        this.hidden = shapePath.isHidden();
        this.lottieDrawable = lottieDrawable;
        ShapeKeyframeAnimation shapeKeyframeAnimationCreateAnimation = shapePath.getShapePath().createAnimation();
        this.shapeAnimation = shapeKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(shapeKeyframeAnimationCreateAnimation);
        shapeKeyframeAnimationCreateAnimation.addUpdateListener(this);
    }

    private void invalidate() throws Throwable {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t2, LottieValueCallback<T> lottieValueCallback) {
        if (t2 == LottieProperty.PATH) {
            this.shapeAnimation.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        if (this.isPathValid && !this.shapeAnimation.hasValueCallback()) {
            return this.path;
        }
        this.path.reset();
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        Path value = this.shapeAnimation.getValue();
        if (value == null) {
            return this.path;
        }
        this.path.set(value);
        this.path.setFillType(Path.FillType.EVEN_ODD);
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x0028  */
    @Override // com.airbnb.lottie.animation.content.Content
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> r7, java.util.List<com.airbnb.lottie.animation.content.Content> r8) {
        /*
            r6 = this;
            r5 = 0
            r4 = 0
        L2:
            int r0 = r7.size()
            if (r4 >= r0) goto L3c
            java.lang.Object r3 = r7.get(r4)
            com.airbnb.lottie.animation.content.Content r3 = (com.airbnb.lottie.animation.content.Content) r3
            boolean r0 = r3 instanceof com.airbnb.lottie.animation.content.TrimPathContent
            if (r0 == 0) goto L28
            r2 = r3
            com.airbnb.lottie.animation.content.TrimPathContent r2 = (com.airbnb.lottie.animation.content.TrimPathContent) r2
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r1 = r2.getType()
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r0 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.SIMULTANEOUSLY
            if (r1 != r0) goto L28
            com.airbnb.lottie.animation.content.CompoundTrimPathContent r0 = r6.trimPaths
            r0.addTrimPath(r2)
            r2.addListener(r6)
        L25:
            int r4 = r4 + 1
            goto L2
        L28:
            boolean r0 = r3 instanceof com.airbnb.lottie.animation.content.ShapeModifierContent
            if (r0 == 0) goto L25
            if (r5 != 0) goto L33
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L33:
            com.airbnb.lottie.animation.content.ShapeModifierContent r3 = (com.airbnb.lottie.animation.content.ShapeModifierContent) r3
            r3.addUpdateListener(r6)
            r5.add(r3)
            goto L25
        L3c:
            com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation r0 = r6.shapeAnimation
            r0.setShapeModifiers(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.ShapeContent.setContents(java.util.List, java.util.List):void");
    }
}
