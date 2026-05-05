package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class DotView extends AppCompatImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5817c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5818e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animation f5819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Animation f5820b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5821d;

    public DotView(Context context) {
        super(context);
        e();
    }

    public DotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public DotView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        e();
    }

    private void e() {
        int i2 = 2 % 2;
        int i3 = f5817c + 93;
        f5818e = i3 % 128;
        int i4 = i3 % 2;
        setVisibility(4);
        this.f5821d = getResources().getDisplayMetrics().density;
        setImageResource(R.drawable.onboard_sdk_animation_dot);
        this.f5820b = AnimationUtils.loadAnimation(getContext(), R.anim.onboard_sdk_pop_in);
        this.f5819a = AnimationUtils.loadAnimation(getContext(), R.anim.onboard_sdk_pop_out);
        int i5 = f5817c + 49;
        f5818e = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void b() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f5818e + 75;
        f5817c = i4 % 128;
        if (i4 % 2 != 0) {
            startAnimation(this.f5820b);
            i2 = 1;
        } else {
            startAnimation(this.f5820b);
            i2 = 0;
        }
        setVisibility(i2);
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f5817c + 7;
        f5818e = i3 % 128;
        int i4 = i3 % 2;
        startAnimation(this.f5819a);
        setVisibility(4);
        int i5 = f5818e + 51;
        f5817c = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean b(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f5817c + 25;
        f5818e = i5 % 128;
        int i6 = i5 % 2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (c(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i2, i3) < this.f5821d * 80.0f) {
            return true;
        }
        int i7 = f5817c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5818e = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static double c(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = f5818e + 35;
        f5817c = i7 % 128;
        int i8 = i7 % 2;
        double dHypot = Math.hypot(i2 - i4, i3 - i5);
        int i9 = f5818e + 69;
        f5817c = i9 % 128;
        int i10 = i9 % 2;
        return dHypot;
    }
}
