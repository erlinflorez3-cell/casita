package io.cobrowse;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
class Frame {
    private final Bitmap bitmap;
    private boolean isDirty;
    private float scale;

    Frame(Bitmap bitmap) {
        this(bitmap, true);
    }

    private Frame(Bitmap bitmap, boolean z2) {
        this(bitmap, z2, 1.0f);
    }

    private Frame(Bitmap bitmap, boolean z2, float f2) {
        this.bitmap = bitmap;
        this.isDirty = z2;
        this.scale = f2;
    }

    Bitmap getBitmap() {
        return this.bitmap;
    }

    float getScale() {
        return this.scale;
    }

    boolean isDirty() {
        return this.isDirty;
    }

    boolean sameSizeAs(Frame frame) {
        return frame != null && frame.bitmap.getWidth() == this.bitmap.getWidth() && frame.bitmap.getHeight() == this.bitmap.getHeight() && frame.scale == this.scale;
    }

    void setDirty(boolean z2) {
        this.isDirty = z2;
    }

    void setScale(float f2) {
        this.scale = f2;
    }
}
