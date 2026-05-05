package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor, GradientColor> {
    public AnimatableGradientColorValue(List<Keyframe<GradientColor>> list) {
        super((List) ensureInterpolatableKeyframes(list));
    }

    private static Keyframe<GradientColor> ensureInterpolatableKeyframe(Keyframe<GradientColor> keyframe) {
        GradientColor gradientColor = keyframe.startValue;
        GradientColor gradientColor2 = keyframe.endValue;
        if (gradientColor == null || gradientColor2 == null || gradientColor.getPositions().length == gradientColor2.getPositions().length) {
            return keyframe;
        }
        float[] fArrMergePositions = mergePositions(gradientColor.getPositions(), gradientColor2.getPositions());
        return keyframe.copyWith(gradientColor.copyWithPositions(fArrMergePositions), gradientColor2.copyWithPositions(fArrMergePositions));
    }

    private static List<Keyframe<GradientColor>> ensureInterpolatableKeyframes(List<Keyframe<GradientColor>> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, ensureInterpolatableKeyframe(list.get(i2)));
        }
        return list;
    }

    static float[] mergePositions(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f2 = Float.NaN;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            float f3 = fArr3[i3];
            if (f3 != f2) {
                fArr3[i2] = f3;
                i2++;
                f2 = fArr3[i3];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i2);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
        return new GradientColorKeyframeAnimation(this.keyframes);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
