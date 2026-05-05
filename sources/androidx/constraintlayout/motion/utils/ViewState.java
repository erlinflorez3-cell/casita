package androidx.constraintlayout.motion.utils;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class ViewState {
    public int bottom;
    public int left;
    public int right;
    public float rotation;
    public int top;

    public void getState(View v2) {
        this.left = v2.getLeft();
        this.top = v2.getTop();
        this.right = v2.getRight();
        this.bottom = v2.getBottom();
        this.rotation = v2.getRotation();
    }

    public int width() {
        return this.right - this.left;
    }

    public int height() {
        return this.bottom - this.top;
    }
}
