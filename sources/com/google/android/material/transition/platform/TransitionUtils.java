package com.google.android.material.transition.platform;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.PathParser;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
class TransitionUtils {
    static final int NO_ATTR_RES_ID = 0;
    static final int NO_DURATION = -1;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final RectF transformAlphaRectF = new RectF();

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.TransitionUtils$1 */
    class AnonymousClass1 implements CornerSizeBinaryOperator {
        final /* synthetic */ RectF val$endBounds;
        final /* synthetic */ float val$endFraction;
        final /* synthetic */ float val$fraction;
        final /* synthetic */ RectF val$startBounds;
        final /* synthetic */ float val$startFraction;

        AnonymousClass1(RectF rectF, RectF rectF2, float f2, float f3, float f4) {
            rectF = rectF;
            rectF = rectF2;
            f = f2;
            f = f3;
            f = f4;
        }

        @Override // com.google.android.material.transition.platform.TransitionUtils.CornerSizeBinaryOperator
        public CornerSize apply(CornerSize cornerSize, CornerSize cornerSize2) {
            return new AbsoluteCornerSize(TransitionUtils.lerp(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF), f, f, f));
        }
    }

    interface CornerSizeBinaryOperator {
        CornerSize apply(CornerSize cornerSize, CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    static float calculateArea(RectF rectF) {
        return rectF.width() * rectF.height();
    }

    static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.platform.TransitionUtils$$ExternalSyntheticLambda0
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
            }
        });
    }

    static Shader createColorShader(int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i2, i2, Shader.TileMode.CLAMP);
    }

    static <T> T defaultIfNull(T t2, T t3) {
        return t2 != null ? t2 : t3;
    }

    static View findAncestorById(View view, int i2) {
        String resourceName = view.getResources().getResourceName(i2);
        while (view != null) {
            if (view.getId() != i2) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    static View findDescendantOrAncestorById(View view, int i2) {
        View viewFindViewById = view.findViewById(i2);
        return viewFindViewById != null ? viewFindViewById : findAncestorById(view, i2);
    }

    static RectF getLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r3, view.getHeight() + r2);
    }

    static RectF getRelativeBounds(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static Rect getRelativeBoundsRect(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        return (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    static float lerp(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    static float lerp(float f2, float f3, float f4, float f5, float f6) {
        return lerp(f2, f3, f4, f5, f6, false);
    }

    static float lerp(float f2, float f3, float f4, float f5, float f6, boolean z2) {
        return (!z2 || (f6 >= 0.0f && f6 <= 1.0f)) ? f6 < f4 ? f2 : f6 > f5 ? f3 : lerp(f2, f3, (f6 - f4) / (f5 - f4)) : lerp(f2, f3, f6);
    }

    static int lerp(int i2, int i3, float f2, float f3, float f4) {
        return f4 < f2 ? i2 : f4 > f3 ? i3 : (int) lerp(i2, i3, (f4 - f2) / (f3 - f2));
    }

    static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, float f2, float f3, float f4) {
        return f4 < f2 ? shapeAppearanceModel : f4 > f3 ? shapeAppearanceModel2 : transformCornerSizes(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.platform.TransitionUtils.1
            final /* synthetic */ RectF val$endBounds;
            final /* synthetic */ float val$endFraction;
            final /* synthetic */ float val$fraction;
            final /* synthetic */ RectF val$startBounds;
            final /* synthetic */ float val$startFraction;

            AnonymousClass1(RectF rectF3, RectF rectF22, float f22, float f32, float f42) {
                rectF = rectF3;
                rectF = rectF22;
                f = f22;
                f = f32;
                f = f42;
            }

            @Override // com.google.android.material.transition.platform.TransitionUtils.CornerSizeBinaryOperator
            public CornerSize apply(CornerSize cornerSize, CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.lerp(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF), f, f, f));
            }
        });
    }

    static void maybeAddTransition(TransitionSet transitionSet, Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    static boolean maybeApplyThemeDuration(Transition transition, Context context, int i2) {
        int iResolveThemeDuration;
        if (i2 == 0 || transition.getDuration() != -1 || (iResolveThemeDuration = MotionUtils.resolveThemeDuration(context, i2, -1)) == -1) {
            return false;
        }
        transition.setDuration(iResolveThemeDuration);
        return true;
    }

    static boolean maybeApplyThemeInterpolator(Transition transition, Context context, int i2, TimeInterpolator timeInterpolator) {
        if (i2 == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i2, timeInterpolator));
        return true;
    }

    static boolean maybeApplyThemePath(Transition transition, Context context, int i2) {
        PathMotion pathMotionResolveThemePath;
        if (i2 == 0 || (pathMotionResolveThemePath = resolveThemePath(context, i2)) == null) {
            return false;
        }
        transition.setPathMotion(pathMotionResolveThemePath);
        return true;
    }

    static void maybeRemoveTransition(TransitionSet transitionSet, Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    static PathMotion resolveThemePath(Context context, int i2) throws Throwable {
        TypedValue typedValue = new TypedValue();
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (C1607wl.Xd() ^ 8763), (short) (C1607wl.Xd() ^ 13771))).getMethod(C1561oA.ud("}z\tgzv}t", (short) (ZN.Xd() ^ 25183)), new Class[0]);
        try {
            method.setAccessible(true);
            if (!((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(i2, typedValue, true)) {
                return null;
            }
            if (typedValue.type != 16) {
                if (typedValue.type == 3) {
                    return new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue.string)));
                }
                throw new IllegalArgumentException(C1561oA.Yd("5X^T[[\u000e_QeZ\u0013h][d]\u0019[opogauug#qzy{(ns\u007ftr\u0001/rv2t\u00035{\u0006\u000e\u0007:\u0012}\n\u0014\u0005@\u0011\u0015C\u0015\u0007\u001b\u0010H\u000e\f \u000eM\"$#\u001b!\u001b", (short) (C1499aX.Xd() ^ (-21023))));
            }
            int i3 = typedValue.data;
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return new MaterialArcMotion();
            }
            throw new IllegalArgumentException(C1561oA.yd("\u000b16\"20(d7:<2==k=3G8pJPD:\u0014z", (short) (C1607wl.Xd() ^ 23800)) + i3);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i2) {
        RectF rectF = transformAlphaRectF;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i2);
    }

    static void transform(Canvas canvas, Rect rect, float f2, float f3, float f4, int i2, CanvasCompat.CanvasOperation canvasOperation) {
        if (i2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        canvas.scale(f4, f4);
        if (i2 < 255) {
            saveLayerAlphaCompat(canvas, rect, i2);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(iSave);
    }

    static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        return (isShapeAppearanceSignificant(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }
}
