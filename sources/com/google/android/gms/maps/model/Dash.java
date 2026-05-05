package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes8.dex */
public final class Dash extends PatternItem {
    public final float length;

    public Dash(float f2) {
        super(0, Float.valueOf(Math.max(f2, 0.0f)));
        this.length = Math.max(f2, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    public String toString() {
        return "[Dash: length=" + this.length + "]";
    }
}
