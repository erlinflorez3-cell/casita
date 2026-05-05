package io.cobrowse;

import android.app.Activity;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
final class AnnotationOverlay extends BaseAnnotationOverlay {
    private final Activity activity;

    public AnnotationOverlay(Activity activity) {
        super(activity.getApplicationContext());
        this.activity = activity;
        bringToFront();
    }

    @Override // io.cobrowse.BaseAnnotationOverlay
    protected WindowManager getWindowManager() {
        return this.activity.getWindowManager();
    }

    @Override // io.cobrowse.BaseAnnotationOverlay
    public void hide() {
        clear();
        if (getParent() != null) {
            this.activity.getWindowManager().removeViewImmediate(this);
        }
    }

    @Override // io.cobrowse.BaseAnnotationOverlay
    void show() {
        if (this.activity.isChangingConfigurations() || this.activity.isDestroyed() || this.activity.isFinishing()) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.activity.getWindow().getDecorView().getLayoutParams();
        if (layoutParams != null) {
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
            layoutParams2.copyFrom(layoutParams);
            layoutParams2.flags |= 131992;
            layoutParams2.format = -3;
            layoutParams2.type = 2;
            layoutParams2.setTitle("Cobrowse Overlay");
            if (getParent() != null) {
                this.activity.getWindowManager().removeViewImmediate(this);
            }
            this.activity.getWindowManager().addView(this, layoutParams2);
        }
        bringToFront();
    }
}
