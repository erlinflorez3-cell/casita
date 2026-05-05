package com.facebook.react.uimanager.layoutanimation;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class LayoutAnimationController {
    private Runnable mCompletionRunnable;
    private boolean mShouldAnimateLayout;
    private final AbstractLayoutAnimation mLayoutCreateAnimation = new LayoutCreateAnimation();
    private final AbstractLayoutAnimation mLayoutUpdateAnimation = new LayoutUpdateAnimation();
    private final AbstractLayoutAnimation mLayoutDeleteAnimation = new LayoutDeleteAnimation();
    private final SparseArray<LayoutHandlingAnimation> mLayoutHandlers = new SparseArray<>(0);
    private long mMaxAnimationDuration = -1;

    private void disableUserInteractions(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                disableUserInteractions(viewGroup.getChildAt(i2));
            }
        }
    }

    private void scheduleCompletionCallback(long j2) throws Throwable {
        if (this.mCompletionRunnable != null) {
            Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
            uiThreadHandler.removeCallbacks(this.mCompletionRunnable);
            Runnable runnable = this.mCompletionRunnable;
            short sXd = (short) (ZN.Xd() ^ 21309);
            int[] iArr = new int["\f\u0018\u0011\u001e\u0016\u000f\rU\u0012\u0015Rk\u007f\f\u0005\f ,".length()];
            QB qb = new QB("\f\u0018\u0011\u001e\u0016\u000f\rU\u0012\u0015Rk\u007f\f\u0005\f ,");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = {Class.forName(C1561oA.Yd(" \u0018.\u001ag'\u001d+%l\u0012601%'2,", (short) (OY.Xd() ^ 26419))), Long.TYPE};
            Object[] objArr = {runnable, Long.valueOf(j2)};
            short sXd2 = (short) (C1499aX.Xd() ^ (-16762));
            short sXd3 = (short) (C1499aX.Xd() ^ (-19229));
            int[] iArr2 = new int["@@EG\u0018:B8Q>>".length()];
            QB qb2 = new QB("@@EG\u0018:B8Q>>");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(uiThreadHandler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public void applyLayoutUpdate(View view, int i2, int i3, int i4, int i5) {
        UiThreadUtil.assertOnUiThread();
        final int id = view.getId();
        LayoutHandlingAnimation layoutHandlingAnimation = this.mLayoutHandlers.get(id);
        if (layoutHandlingAnimation != null) {
            layoutHandlingAnimation.onLayoutUpdate(i2, i3, i4, i5);
            return;
        }
        Animation animationCreateAnimation = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.mLayoutCreateAnimation : this.mLayoutUpdateAnimation).createAnimation(view, i2, i3, i4, i5);
        if (animationCreateAnimation instanceof LayoutHandlingAnimation) {
            animationCreateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.react.uimanager.layoutanimation.LayoutAnimationController.2
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    LayoutAnimationController.this.mLayoutHandlers.remove(id);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    LayoutAnimationController.this.mLayoutHandlers.put(id, (LayoutHandlingAnimation) animation);
                }
            });
        } else {
            view.layout(i2, i3, i4 + i2, i5 + i3);
        }
        if (animationCreateAnimation != null) {
            long duration = animationCreateAnimation.getDuration();
            if (duration > this.mMaxAnimationDuration) {
                this.mMaxAnimationDuration = duration;
                scheduleCompletionCallback(duration);
            }
            view.startAnimation(animationCreateAnimation);
        }
    }

    public void deleteView(View view, final LayoutAnimationListener layoutAnimationListener) throws Throwable {
        UiThreadUtil.assertOnUiThread();
        Animation animationCreateAnimation = this.mLayoutDeleteAnimation.createAnimation(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (animationCreateAnimation == null) {
            layoutAnimationListener.onAnimationEnd();
            return;
        }
        disableUserInteractions(view);
        animationCreateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.react.uimanager.layoutanimation.LayoutAnimationController.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                layoutAnimationListener.onAnimationEnd();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        long duration = animationCreateAnimation.getDuration();
        if (duration > this.mMaxAnimationDuration) {
            scheduleCompletionCallback(duration);
            this.mMaxAnimationDuration = duration;
        }
        view.startAnimation(animationCreateAnimation);
    }

    public void initializeFromConfig(ReadableMap readableMap, final Callback callback) {
        if (readableMap == null) {
            reset();
            return;
        }
        this.mShouldAnimateLayout = false;
        int i2 = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        if (readableMap.hasKey(LayoutAnimationType.toString(LayoutAnimationType.CREATE))) {
            this.mLayoutCreateAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.toString(LayoutAnimationType.CREATE)), i2);
            this.mShouldAnimateLayout = true;
        }
        if (readableMap.hasKey(LayoutAnimationType.toString(LayoutAnimationType.UPDATE))) {
            this.mLayoutUpdateAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.toString(LayoutAnimationType.UPDATE)), i2);
            this.mShouldAnimateLayout = true;
        }
        if (readableMap.hasKey(LayoutAnimationType.toString(LayoutAnimationType.DELETE))) {
            this.mLayoutDeleteAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.toString(LayoutAnimationType.DELETE)), i2);
            this.mShouldAnimateLayout = true;
        }
        if (!this.mShouldAnimateLayout || callback == null) {
            return;
        }
        this.mCompletionRunnable = new Runnable() { // from class: com.facebook.react.uimanager.layoutanimation.LayoutAnimationController.1
            @Override // java.lang.Runnable
            public void run() {
                callback.invoke(Boolean.TRUE);
            }
        };
    }

    public void reset() {
        this.mLayoutCreateAnimation.reset();
        this.mLayoutUpdateAnimation.reset();
        this.mLayoutDeleteAnimation.reset();
        this.mCompletionRunnable = null;
        this.mShouldAnimateLayout = false;
        this.mMaxAnimationDuration = -1L;
    }

    public boolean shouldAnimateLayout(View view) {
        if (view == null) {
            return false;
        }
        return (this.mShouldAnimateLayout && view.getParent() != null) || this.mLayoutHandlers.get(view.getId()) != null;
    }
}
