package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class DraweeHolder<DH extends DraweeHierarchy> implements VisibilityCallback {

    @Nullable
    private DH mHierarchy;
    private boolean mIsControllerAttached = false;
    private boolean mIsHolderAttached = false;
    private boolean mIsVisible = true;

    @Nullable
    private DraweeController mController = null;
    private final DraweeEventTracker mEventTracker = DraweeEventTracker.newInstance();

    public DraweeHolder(@Nullable DH dh) {
        if (dh != null) {
            setHierarchy(dh);
        }
    }

    private void attachController() {
        if (this.mIsControllerAttached) {
            return;
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.mIsControllerAttached = true;
        DraweeController draweeController = this.mController;
        if (draweeController == null || draweeController.getHierarchy() == null) {
            return;
        }
        this.mController.onAttach();
    }

    private void attachOrDetachController() {
        if (this.mIsHolderAttached && this.mIsVisible) {
            attachController();
        } else {
            detachController();
        }
    }

    public static <DH extends DraweeHierarchy> DraweeHolder<DH> create(@Nullable DH dh, Context context) {
        DraweeHolder<DH> draweeHolder = new DraweeHolder<>(dh);
        draweeHolder.registerWithContext(context);
        return draweeHolder;
    }

    private void detachController() {
        if (this.mIsControllerAttached) {
            this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.mIsControllerAttached = false;
            if (isControllerValid()) {
                this.mController.onDetach();
            }
        }
    }

    private void setVisibilityCallback(@Nullable VisibilityCallback visibilityCallback) {
        Object topLevelDrawable = getTopLevelDrawable();
        if (topLevelDrawable instanceof VisibilityAwareDrawable) {
            ((VisibilityAwareDrawable) topLevelDrawable).setVisibilityCallback(visibilityCallback);
        }
    }

    @Nullable
    public DraweeController getController() {
        return this.mController;
    }

    protected DraweeEventTracker getDraweeEventTracker() {
        return this.mEventTracker;
    }

    public DH getHierarchy() {
        return (DH) Preconditions.checkNotNull(this.mHierarchy);
    }

    @Nullable
    public Drawable getTopLevelDrawable() {
        DH dh = this.mHierarchy;
        if (dh == null) {
            return null;
        }
        return dh.getTopLevelDrawable();
    }

    public boolean hasHierarchy() {
        return this.mHierarchy != null;
    }

    public boolean isAttached() {
        return this.mIsHolderAttached;
    }

    public boolean isControllerValid() {
        DraweeController draweeController = this.mController;
        return draweeController != null && draweeController.getHierarchy() == this.mHierarchy;
    }

    public void onAttach() {
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.mIsHolderAttached = true;
        attachOrDetachController();
    }

    public void onDetach() {
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.mIsHolderAttached = false;
        attachOrDetachController();
    }

    @Override // com.facebook.drawee.drawable.VisibilityCallback
    public void onDraw() {
        if (this.mIsControllerAttached) {
            return;
        }
        FLog.w((Class<?>) DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.mController)), toString());
        this.mIsHolderAttached = true;
        this.mIsVisible = true;
        attachOrDetachController();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isControllerValid()) {
            return this.mController.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.facebook.drawee.drawable.VisibilityCallback
    public void onVisibilityChange(boolean z2) {
        if (this.mIsVisible == z2) {
            return;
        }
        this.mEventTracker.recordEvent(z2 ? DraweeEventTracker.Event.ON_DRAWABLE_SHOW : DraweeEventTracker.Event.ON_DRAWABLE_HIDE);
        this.mIsVisible = z2;
        attachOrDetachController();
    }

    public void registerWithContext(Context context) {
    }

    public void resetActualImage() {
        setController(null);
    }

    public void setController(@Nullable DraweeController draweeController) {
        boolean z2 = this.mIsControllerAttached;
        if (z2) {
            detachController();
        }
        if (isControllerValid()) {
            this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.mController.setHierarchy(null);
        }
        this.mController = draweeController;
        if (draweeController != null) {
            this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.mController.setHierarchy(this.mHierarchy);
        } else {
            this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z2) {
            attachController();
        }
    }

    public void setHierarchy(DH dh) {
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean zIsControllerValid = isControllerValid();
        setVisibilityCallback(null);
        DH dh2 = (DH) Preconditions.checkNotNull(dh);
        this.mHierarchy = dh2;
        Drawable topLevelDrawable = dh2.getTopLevelDrawable();
        onVisibilityChange(topLevelDrawable == null || topLevelDrawable.isVisible());
        setVisibilityCallback(this);
        if (zIsControllerValid) {
            this.mController.setHierarchy(dh);
        }
    }

    public String toString() {
        return Objects.toStringHelper(this).add("controllerAttached", this.mIsControllerAttached).add("holderAttached", this.mIsHolderAttached).add("drawableVisible", this.mIsVisible).add("events", this.mEventTracker.toString()).toString();
    }
}
