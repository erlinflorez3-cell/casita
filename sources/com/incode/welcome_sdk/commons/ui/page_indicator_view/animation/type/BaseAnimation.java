package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseAnimation<T extends Animator> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6074c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6075e = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ValueController.UpdateListener f6078d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f6077b = 350;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected T f6076a = (T) d();

    public abstract BaseAnimation b(float f2);

    public abstract T d();

    public BaseAnimation(ValueController.UpdateListener updateListener) {
        this.f6078d = updateListener;
    }

    public BaseAnimation a(long j2) {
        int i2 = 2 % 2;
        int i3 = f6075e + 37;
        int i4 = i3 % 128;
        f6074c = i4;
        int i5 = i3 % 2;
        this.f6077b = j2;
        T t2 = this.f6076a;
        if (t2 instanceof ValueAnimator) {
            int i6 = i4 + 43;
            f6075e = i6 % 128;
            if (i6 % 2 == 0) {
                t2.setDuration(j2);
                throw null;
            }
            t2.setDuration(j2);
        }
        return this;
    }

    public final void c() {
        int i2 = 2 % 2;
        T t2 = this.f6076a;
        if (t2 != null) {
            int i3 = f6074c + 81;
            f6075e = i3 % 128;
            int i4 = i3 % 2;
            if (t2.isRunning()) {
                return;
            }
            int i5 = f6074c + 115;
            f6075e = i5 % 128;
            if (i5 % 2 != 0) {
                this.f6076a.start();
            } else {
                this.f6076a.start();
                throw null;
            }
        }
    }

    public final void a() {
        int i2 = 2 % 2;
        T t2 = this.f6076a;
        if (t2 != null) {
            int i3 = f6074c + 77;
            f6075e = i3 % 128;
            int i4 = i3 % 2;
            if (t2.isStarted()) {
                this.f6076a.end();
            }
        }
        int i5 = f6074c + 57;
        f6075e = i5 % 128;
        int i6 = i5 % 2;
    }
}
