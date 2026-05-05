package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes8.dex */
public final class ToneDeltaPair {
    private final double delta;
    private final TonePolarity polarity;
    private final DynamicColor roleA;
    private final DynamicColor roleB;
    private final boolean stayTogether;

    public ToneDeltaPair(DynamicColor dynamicColor, DynamicColor dynamicColor2, double d2, TonePolarity tonePolarity, boolean z2) {
        this.roleA = dynamicColor;
        this.roleB = dynamicColor2;
        this.delta = d2;
        this.polarity = tonePolarity;
        this.stayTogether = z2;
    }

    public double getDelta() {
        return this.delta;
    }

    public TonePolarity getPolarity() {
        return this.polarity;
    }

    public DynamicColor getRoleA() {
        return this.roleA;
    }

    public DynamicColor getRoleB() {
        return this.roleB;
    }

    public boolean getStayTogether() {
        return this.stayTogether;
    }
}
