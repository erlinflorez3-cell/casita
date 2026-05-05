package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean useSoftwareRendering(int i2, boolean z2, int i3) {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal != 2) {
            return (z2 && i2 < 28) || i3 > 4 || i2 <= 25;
        }
        return true;
    }
}
