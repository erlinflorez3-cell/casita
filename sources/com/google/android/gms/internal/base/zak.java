package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes8.dex */
public final class zak extends Drawable implements Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private zaj zai;
    private Drawable zaj;
    private Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    public zak(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? zai.zaa : drawable;
        this.zaj = drawable;
        drawable.setCallback(this);
        zaj zajVar = this.zai;
        int i2 = zajVar.zab;
        int changingConfigurations = drawable.getChangingConfigurations();
        zajVar.zab = (changingConfigurations + i2) - (changingConfigurations & i2);
        drawable2 = drawable2 == null ? zai.zaa : drawable2;
        this.zak = drawable2;
        drawable2.setCallback(this);
        zaj zajVar2 = this.zai;
        zajVar2.zab = (-1) - (((-1) - drawable2.getChangingConfigurations()) & ((-1) - zajVar2.zab));
    }

    zak(zaj zajVar) {
        this.zaa = 0;
        this.zad = 255;
        this.zaf = 0;
        this.zag = true;
        this.zai = new zaj(zajVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.zaa
            r2 = 2
            r5 = 0
            r4 = 1
            if (r0 == r4) goto L58
            if (r0 == r2) goto L29
        L9:
            r6 = r4
        La:
            int r3 = r8.zaf
            boolean r0 = r8.zag
            android.graphics.drawable.Drawable r2 = r8.zaj
            android.graphics.drawable.Drawable r1 = r8.zak
            if (r6 == 0) goto L62
            if (r0 == 0) goto L27
            if (r3 != 0) goto L1c
        L18:
            r2.draw(r9)
            r3 = r5
        L1c:
            int r0 = r8.zad
            if (r3 != r0) goto L26
            r1.setAlpha(r0)
            r1.draw(r9)
        L26:
            return
        L27:
            r5 = r3
            goto L18
        L29:
            long r1 = r8.zab
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L9
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r8.zab
            long r0 = r0 - r2
            int r2 = r8.zae
            float r3 = (float) r2
            float r2 = (float) r0
            float r2 = r2 / r3
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L56
            r6 = r4
        L44:
            if (r6 == 0) goto L48
            r8.zaa = r5
        L48:
            float r2 = java.lang.Math.min(r2, r1)
            int r0 = r8.zac
            float r1 = (float) r0
            float r1 = r1 * r2
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r8.zaf = r0
            goto La
        L56:
            r6 = r5
            goto L44
        L58:
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.zab = r0
            r8.zaa = r2
            r6 = r5
            goto La
        L62:
            if (r0 == 0) goto L6b
            int r0 = r8.zad
            int r0 = r0 - r3
            r2.setAlpha(r0)
            r5 = r4
        L6b:
            r2.draw(r9)
            if (r5 == 0) goto L75
            int r0 = r8.zad
            r2.setAlpha(r0)
        L75:
            if (r3 <= 0) goto L82
            r1.setAlpha(r3)
            r1.draw(r9)
            int r0 = r8.zad
            r1.setAlpha(r0)
        L82:
            r8.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zak.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zaj zajVar = this.zai;
        int i2 = (-1) - (((-1) - changingConfigurations) & ((-1) - zajVar.zaa));
        int i3 = zajVar.zab;
        return (i2 + i3) - (i2 & i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!zac()) {
            return null;
        }
        this.zai.zaa = getChangingConfigurations();
        return this.zai;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.zan) {
            this.zao = Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
            this.zan = true;
        }
        return this.zao;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.zah && super.mutate() == this) {
            if (!zac()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.zaj.mutate();
            this.zak.mutate();
            this.zah = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.zaj.setBounds(rect);
        this.zak.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.zaf == this.zad) {
            this.zaf = i2;
        }
        this.zad = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.zaj.setColorFilter(colorFilter);
        this.zak.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.zak;
    }

    public final void zab(int i2) {
        this.zac = this.zad;
        this.zaf = 0;
        this.zae = 250;
        this.zaa = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.zal) {
            boolean z2 = false;
            if (this.zaj.getConstantState() != null && this.zak.getConstantState() != null) {
                z2 = true;
            }
            this.zam = z2;
            this.zal = true;
        }
        return this.zam;
    }
}
