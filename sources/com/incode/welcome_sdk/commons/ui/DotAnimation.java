package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsDateInputScreenKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class DotAnimation extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f5804i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f5805k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f5806n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f5808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<DotView> f5809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f5813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Random f5814h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5815j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5816o;

    public static /* synthetic */ Object c(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~(i8 | i4);
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i7));
        int i12 = (~(i4 | i7)) | (~((~i7) | i8 | i10));
        int i13 = i8 | i7 | i10;
        int i14 = i7 + i6 + i5 + (1362283521 * i3) + ((-853422242) * i2);
        int i15 = i14 * i14;
        int i16 = ((1713903284 * i7) - 1228931072) + ((-782767794) * i6) + (i11 * 1248335539) + (1248335539 * i12) + ((-1248335539) * i13) + (i5 * 465567744) + (465567744 * i3) + (1887436800 * i2) + ((-1154482176) * i15);
        int i17 = ((i7 * 722868660) - 41817558) + (i6 * 722869710) + (i11 * (-525)) + (i12 * (-525)) + (i13 * OlympusMakernoteDirectory.TAG_ORIGINAL_MANUFACTURER_MODEL) + (i5 * 722869185) + (i3 * 1172694977) + (i2 * (-747618338)) + (i15 * 791674880);
        return i16 + ((i17 * i17) * 751828992) != 1 ? d(objArr) : a(objArr);
    }

    public DotAnimation(Context context) {
        super(context);
        this.f5810d = 6;
        this.f5813g = new AtomicBoolean(false);
        c();
    }

    public DotAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5810d = 6;
        this.f5813g = new AtomicBoolean(false);
        c();
    }

    public DotAnimation(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f5810d = 6;
        this.f5813g = new AtomicBoolean(false);
        c();
    }

    private void c() {
        int i2 = 2 % 2;
        setClipToPadding(false);
        this.f5814h = new Random();
        f5804i = AnimationUtils.loadAnimation(getContext(), R.anim.onboard_sdk_pop_out).computeDurationHint();
        this.f5808b = getResources().getDrawable(R.drawable.onboard_sdk_animation_dot);
        this.f5809c = new ArrayList();
        int i3 = f5806n + 51;
        f5805k = i3 % 128;
        int i4 = i3 % 2;
    }

    private synchronized void e() {
        int i2 = 2 % 2;
        if (this.f5816o) {
            return;
        }
        this.f5816o = true;
        int i3 = 0;
        while (i3 < this.f5810d) {
            int i4 = f5806n + 85;
            f5805k = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = {this, this.f5809c, Integer.valueOf(this.f5812f), Integer.valueOf(this.f5815j)};
                int iB = FormsDateInputScreenKt.a.b();
                int iB2 = FormsDateInputScreenKt.a.b();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = {this, this.f5809c, Integer.valueOf(this.f5812f), Integer.valueOf(this.f5815j)};
            int iB3 = FormsDateInputScreenKt.a.b();
            int iB4 = FormsDateInputScreenKt.a.b();
            DotView dotView = (DotView) c(FormsDateInputScreenKt.a.b(), FormsDateInputScreenKt.a.b(), objArr2, iB3, iB4, -714573265, 714573266);
            if (dotView == null) {
                break;
            }
            int i5 = f5806n + 15;
            f5805k = i5 % 128;
            if (i5 % 2 == 0) {
                this.f5809c.add(dotView);
                addView(dotView);
                i3 += 73;
            } else {
                this.f5809c.add(dotView);
                addView(dotView);
                i3++;
            }
            int i6 = 2 % 2;
        }
    }

    private synchronized void f() {
        int i2 = 2 % 2;
        int i3 = f5806n + 121;
        f5805k = i3 % 128;
        int i4 = i3 % 2;
        Iterator<DotView> it = this.f5809c.iterator();
        int i5 = f5806n + 49;
        f5805k = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            int i7 = 2 % 2;
            if (it.hasNext()) {
                int i8 = f5806n + 111;
                f5805k = i8 % 128;
                if (i8 % 2 == 0) {
                    DotView next = it.next();
                    next.clearAnimation();
                    removeView(next);
                    throw null;
                }
                DotView next2 = it.next();
                next2.clearAnimation();
                removeView(next2);
            } else {
                this.f5809c.clear();
                this.f5816o = false;
            }
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        DotAnimation dotAnimation = (DotAnimation) objArr[0];
        List<DotView> list = (List) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = f5805k + 1;
        f5806n = i3 % 128;
        int i4 = i3 % 2;
        Point pointE = dotAnimation.e(list, iIntValue, iIntValue2);
        if (pointE != null) {
            DotView dotView = new DotView(dotAnimation.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dotAnimation.f5807a, dotAnimation.f5811e);
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = pointE.x;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = pointE.y;
            dotView.setLayoutParams(layoutParams);
            return dotView;
        }
        int i5 = f5805k + 105;
        f5806n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return null;
    }

    private Point e(List<DotView> list, int i2, int i3) {
        int i4 = 2 % 2;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int i5 = 0;
        do {
            if (i2 > 0) {
                int i6 = f5806n + 99;
                f5805k = i6 % 128;
                int i7 = i6 % 2;
                iNextInt = this.f5814h.nextInt(i2);
            }
            if (i3 > 0) {
                int i8 = f5806n + 51;
                f5805k = i8 % 128;
                int i9 = i8 % 2;
                iNextInt2 = this.f5814h.nextInt(i3);
            }
            i5++;
            if (!a(list, iNextInt, iNextInt2)) {
                break;
            }
        } while (i5 < 30);
        if (i5 >= 30) {
            int i10 = f5805k + 17;
            f5806n = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        Point point = new Point(iNextInt, iNextInt2);
        int i11 = f5805k + 7;
        f5806n = i11 % 128;
        int i12 = i11 % 2;
        return point;
    }

    private static boolean a(List<DotView> list, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f5805k + 85;
        f5806n = i5 % 128;
        int i6 = i5 % 2;
        Iterator<DotView> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(i2, i3)) {
                int i7 = f5805k;
                int i8 = i7 + 45;
                f5806n = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 29;
                f5806n = i10 % 128;
                int i11 = i10 % 2;
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f5805k + 33;
        f5806n = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f5813g.get();
        int i5 = f5805k + 57;
        f5806n = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final void b() {
        int i2 = 2 % 2;
        int i3 = f5806n + 53;
        f5805k = i3 % 128;
        int i4 = i3 % 2;
        if (this.f5813g.compareAndSet(false, true)) {
            int i5 = f5806n + 101;
            f5805k = i5 % 128;
            int i6 = i5 % 2;
            i();
        }
        int i7 = f5805k + 57;
        f5806n = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(DotView dotView) {
        int i2 = 2 % 2;
        int i3 = f5805k + 7;
        f5806n = i3 % 128;
        int i4 = i3 % 2;
        dotView.b();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f5805k + 79;
        f5806n = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(DotView dotView) {
        int i2 = 2 % 2;
        int i3 = f5806n + 11;
        f5805k = i3 % 128;
        int i4 = i3 % 2;
        dotView.c();
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        int i2 = 2 % 2;
        int i3 = f5806n + 53;
        f5805k = i3 % 128;
        int i4 = i3 % 2;
        i();
        if (i4 == 0) {
            int i5 = 26 / 0;
        }
    }

    private void i() {
        int i2 = 2 % 2;
        if (!this.f5813g.get()) {
            f();
            return;
        }
        int i3 = f5806n + 5;
        f5805k = i3 % 128;
        int i4 = i3 % 2;
        f();
        e();
        int i5 = f5806n + 99;
        f5805k = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        for (final DotView dotView : this.f5809c) {
            int i8 = f5806n + 39;
            f5805k = i8 % 128;
            int i9 = i8 % 2;
            dotView.postDelayed(new Runnable() { // from class: com.incode.welcome_sdk.commons.ui.DotAnimation$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DotAnimation.e(dotView);
                }
            }, (this.f5814h.nextInt(50) + 50) * i7);
            dotView.postDelayed(new Runnable() { // from class: com.incode.welcome_sdk.commons.ui.DotAnimation$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DotAnimation.a(dotView);
                }
            }, r3 + 1400);
            i7++;
        }
        postDelayed(new Runnable() { // from class: com.incode.welcome_sdk.commons.ui.DotAnimation$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.h();
            }
        }, ((long) ((i7 * 100) + 1300)) + f5804i);
    }

    public final void d() {
        AtomicBoolean atomicBoolean;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f5806n + 83;
        f5805k = i3 % 128;
        if (i3 % 2 == 0) {
            atomicBoolean = this.f5813g;
            z2 = true;
        } else {
            atomicBoolean = this.f5813g;
            z2 = false;
        }
        atomicBoolean.set(z2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = f5805k + 5;
        f5806n = i7 % 128;
        int i8 = i7 % 2;
        super.onLayout(z2, i2, i3, i4, i5);
        this.f5812f = Math.max((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd(), 0);
        this.f5815j = Math.max((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 0);
        int iB = FormsDateInputScreenKt.a.b();
        int iB2 = FormsDateInputScreenKt.a.b();
        int iB3 = FormsDateInputScreenKt.a.b();
        c(FormsDateInputScreenKt.a.b(), iB3, new Object[]{this}, iB, iB2, -682507620, 682507620);
        this.f5812f = Math.max(this.f5812f - this.f5807a, 0);
        this.f5815j = Math.max(this.f5815j - this.f5811e, 0);
        int i9 = f5805k + 47;
        f5806n = i9 % 128;
        int i10 = i9 % 2;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        DotAnimation dotAnimation = (DotAnimation) objArr[0];
        int i2 = 2 % 2;
        int i3 = f5806n + 15;
        f5805k = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Drawable drawable = dotAnimation.f5808b;
            if (drawable != null) {
                dotAnimation.f5807a = drawable.getIntrinsicWidth();
                int intrinsicHeight = dotAnimation.f5808b.getIntrinsicHeight();
                dotAnimation.f5811e = intrinsicHeight;
                int i4 = dotAnimation.f5812f;
                int i5 = dotAnimation.f5807a;
                if (i4 < i5) {
                    float f2 = i4 / i5;
                    dotAnimation.f5807a = (int) (i5 * f2);
                    dotAnimation.f5811e = (int) (intrinsicHeight * f2);
                }
                int i6 = dotAnimation.f5815j;
                int i7 = dotAnimation.f5811e;
                if (i6 < i7) {
                    int i8 = f5805k + 11;
                    f5806n = i8 % 128;
                    int i9 = i8 % 2;
                    float f3 = i6 / i7;
                    dotAnimation.f5807a = (int) (dotAnimation.f5807a * f3);
                    dotAnimation.f5811e = (int) (i7 * f3);
                }
            }
            return null;
        }
        Drawable drawable2 = dotAnimation.f5808b;
        obj.hashCode();
        throw null;
    }

    private void j() {
        int iB = FormsDateInputScreenKt.a.b();
        int iB2 = FormsDateInputScreenKt.a.b();
        int iB3 = FormsDateInputScreenKt.a.b();
        c(FormsDateInputScreenKt.a.b(), iB3, new Object[]{this}, iB, iB2, -682507620, 682507620);
    }

    private DotView c(List<DotView> list, int i2, int i3) {
        Object[] objArr = {this, list, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iB = FormsDateInputScreenKt.a.b();
        int iB2 = FormsDateInputScreenKt.a.b();
        return (DotView) c(FormsDateInputScreenKt.a.b(), FormsDateInputScreenKt.a.b(), objArr, iB, iB2, -714573265, 714573266);
    }
}
