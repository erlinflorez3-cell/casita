package com.incode.welcome_sdk.ui.results.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes5.dex */
public class ScrollingNameScoreBehaviour<V extends ViewGroup> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f17276f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f17277i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppBarLayout f17280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f17281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppBarLayout.OnOffsetChangedListener f17282e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private V f17283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f17284h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextViewName f17285j;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* synthetic */ boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i2 = 2 % 2;
        int i3 = f17276f + 57;
        f17277i = i3 % 128;
        int i4 = i3 % 2;
        boolean zLayoutDependsOn = layoutDependsOn(coordinatorLayout, (ViewGroup) view, view2);
        int i5 = f17276f + 45;
        f17277i = i5 % 128;
        if (i5 % 2 != 0) {
            return zLayoutDependsOn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* synthetic */ void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i2 = 2 % 2;
        int i3 = f17277i + 3;
        f17276f = i3 % 128;
        int i4 = i3 % 2;
        onDependentViewRemoved(coordinatorLayout, (ViewGroup) view, view2);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f17276f + 37;
        f17277i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3 = 2 % 2;
        int i4 = f17276f + 103;
        f17277i = i4 % 128;
        int i5 = i4 % 2;
        boolean zOnLayoutChild = onLayoutChild(coordinatorLayout, (ViewGroup) view, i2);
        int i6 = f17277i + 47;
        f17276f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 71 / 0;
        }
        return zOnLayoutChild;
    }

    public ScrollingNameScoreBehaviour() {
        this.f17278a = -1;
        d();
    }

    public ScrollingNameScoreBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17278a = -1;
        d();
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3 = 2 % 2;
        int i4 = f17276f + 103;
        f17277i = i4 % 128;
        int i5 = i4 % 2;
        this.f17283g = v2;
        if (v2 != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f17283g.getDisplay().getMetrics(displayMetrics);
            this.f17281d = displayMetrics.density;
        }
        this.f17285j = (TextViewName) this.f17283g.getChildAt(0);
        this.f17284h = (TextView) this.f17283g.getChildAt(1);
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v2, i2);
        int i6 = f17277i + 25;
        f17276f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 20 / 0;
        }
        return zOnLayoutChild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(AppBarLayout appBarLayout, int i2) {
        float f2;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = (int) (this.f17281d * 68.0f);
        if (this.f17278a == -1) {
            this.f17278a = appBarLayout.getTotalScrollRange();
        }
        int i5 = this.f17278a;
        if (i5 > 0) {
            f2 = (-i2) / i5;
            int i6 = f17277i + 81;
            f17276f = i6 % 128;
            int i7 = i6 % 2;
        } else {
            f2 = 0.0f;
        }
        int iMin = Math.min(-i2, i4);
        V v2 = this.f17283g;
        if (v2 != null) {
            v2.setScrollY(iMin);
        }
        if (iMin < i4) {
            int i8 = f17277i + 67;
            f17276f = i8 % 128;
            int i9 = i8 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f17285j != null) {
            if (z2 && !this.f17279b) {
                c();
                this.f17279b = true;
            } else if (!z2 && this.f17279b) {
                b();
                this.f17279b = false;
                int i10 = f17277i + 101;
                f17276f = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        TextView textView = this.f17284h;
        if (textView != null) {
            textView.setAlpha(1.0f - f2);
        }
    }

    private void d() {
        int i2 = 2 % 2;
        int i3 = f17276f + 59;
        f17277i = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f17282e = new AppBarLayout.OnOffsetChangedListener() { // from class: com.incode.welcome_sdk.ui.results.common.ScrollingNameScoreBehaviour$$ExternalSyntheticLambda0
                @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                public final void onOffsetChanged(AppBarLayout appBarLayout, int i4) {
                    this.f$0.d(appBarLayout, i4);
                }
            };
            int i4 = f17276f + 61;
            f17277i = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f17282e = new AppBarLayout.OnOffsetChangedListener() { // from class: com.incode.welcome_sdk.ui.results.common.ScrollingNameScoreBehaviour$$ExternalSyntheticLambda0
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i42) {
                this.f$0.d(appBarLayout, i42);
            }
        };
        throw null;
    }

    private void c() {
        TextView textView;
        int i2;
        int i3 = 2 % 2;
        int i4 = f17277i + 123;
        f17276f = i4 % 128;
        if (i4 % 2 != 0) {
            this.f17285j.showFullName();
            textView = this.f17284h;
            i2 = 1;
        } else {
            this.f17285j.showFullName();
            textView = this.f17284h;
            i2 = 0;
        }
        textView.setVisibility(i2);
    }

    private void b() {
        TextView textView;
        int i2;
        int i3 = 2 % 2;
        int i4 = f17277i + 61;
        f17276f = i4 % 128;
        if (i4 % 2 != 0) {
            this.f17285j.showShortName();
            textView = this.f17284h;
            i2 = 3;
        } else {
            this.f17285j.showShortName();
            textView = this.f17284h;
            i2 = 4;
        }
        textView.setVisibility(i2);
        int i5 = f17276f + 29;
        f17277i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i2 = 2 % 2;
        int i3 = f17277i + 61;
        int i4 = i3 % 128;
        f17276f = i4;
        int i5 = i3 % 2;
        if (!(view instanceof AppBarLayout) || this.f17280c != null) {
            return false;
        }
        int i6 = i4 + 27;
        f17277i = i6 % 128;
        int i7 = i6 % 2;
        AppBarLayout appBarLayout = (AppBarLayout) view;
        this.f17280c = appBarLayout;
        appBarLayout.addOnOffsetChangedListener(this.f17282e);
        int i8 = f17276f + 95;
        f17277i = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i2 = 2 % 2;
        int i3 = f17276f;
        int i4 = i3 + 9;
        f17277i = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (view == this.f17280c) {
            this.f17280c = null;
            this.f17278a = -1;
        }
        int i6 = i3 + 67;
        f17277i = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
