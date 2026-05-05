package io.cobrowse;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
final class AccessibilityAnnotationOverlay extends BaseAnnotationOverlay {
    private final WindowManager wm;

    public AccessibilityAnnotationOverlay(Context context, WindowManager windowManager) {
        super(context);
        this.wm = windowManager;
    }

    @Override // io.cobrowse.BaseAnnotationOverlay
    protected WindowManager getWindowManager() {
        return this.wm;
    }

    @Override // io.cobrowse.BaseAnnotationOverlay
    void hide() {
        clear();
        if (getParent() != null) {
            this.wm.removeViewImmediate(this);
        }
    }

    @Override // io.cobrowse.BaseAnnotationOverlay
    void show() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = 2032;
        layoutParams.format = -3;
        layoutParams.flags = (-1) - (((-1) - layoutParams.flags) & ((-1) - 792));
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 48;
        this.wm.addView(this, layoutParams);
    }
}
