package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ColorProtection extends Protection {
    private int mColor;
    private final ColorDrawable mDrawable;
    private boolean mHasColor;

    @Override // androidx.core.view.insets.Protection
    boolean occupiesCorners() {
        return true;
    }

    public ColorProtection(int i2) {
        super(i2);
        this.mDrawable = new ColorDrawable();
        this.mColor = 0;
    }

    public ColorProtection(int i2, int i3) {
        this(i2);
        setColor(i3);
    }

    @Override // androidx.core.view.insets.Protection
    void dispatchColorHint(int i2) {
        if (this.mHasColor) {
            return;
        }
        setColorInner(i2);
    }

    private void setColorInner(int i2) {
        if (this.mColor != i2) {
            this.mColor = i2;
            this.mDrawable.setColor(i2);
            setDrawable(this.mDrawable);
        }
    }

    public void setColor(int i2) {
        this.mHasColor = true;
        setColorInner(i2);
    }

    public int getColor() {
        return this.mColor;
    }
}
