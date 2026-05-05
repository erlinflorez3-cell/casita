package com.airbnb.lottie.utils;

/* JADX INFO: loaded from: classes.dex */
public class MeanCalculator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2583n;
    private float sum;

    public void add(float f2) {
        float f3 = this.sum + f2;
        this.sum = f3;
        int i2 = this.f2583n + 1;
        this.f2583n = i2;
        if (i2 == Integer.MAX_VALUE) {
            this.sum = f3 / 2.0f;
            this.f2583n = i2 / 2;
        }
    }

    public float getMean() {
        int i2 = this.f2583n;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.sum / i2;
    }
}
