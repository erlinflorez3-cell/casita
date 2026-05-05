package com.incode.recogkitandroid;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes7.dex */
public class FaceAttributes {
    private static int IncodeCamera = 0;
    private static int ProcessCameraProviderExtensionsKt = 1;
    public boolean closedEyes;
    public boolean eyeglasses;
    public boolean headwear;
    public boolean mask;

    public FaceAttributes(boolean z2, boolean z3, boolean z4, boolean z5) {
        this.headwear = z2;
        this.eyeglasses = z3;
        this.closedEyes = z4;
        this.mask = z5;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("headwear: ").append(this.headwear).append("; eyeglasses: ").append(this.eyeglasses).append("; closed eyes: ").append(this.closedEyes).append("; mask: ").append(this.mask).append(Global.SEMICOLON).toString();
        int i3 = ProcessCameraProviderExtensionsKt + 31;
        IncodeCamera = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
