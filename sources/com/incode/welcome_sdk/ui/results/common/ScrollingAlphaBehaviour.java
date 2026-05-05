package com.incode.welcome_sdk.ui.results.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes5.dex */
public class ScrollingAlphaBehaviour<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17270e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f17271g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private V f17272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppBarLayout.OnOffsetChangedListener f17274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppBarLayout f17275d;

    public ScrollingAlphaBehaviour() {
        this.f17273b = -1;
        e();
    }

    public ScrollingAlphaBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17273b = -1;
        e();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3 = 2 % 2;
        int i4 = f17270e + 113;
        f17271g = i4 % 128;
        int i5 = i4 % 2;
        this.f17272a = v2;
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v2, i2);
        int i6 = f17270e + 77;
        f17271g = i6 % 128;
        int i7 = i6 % 2;
        return zOnLayoutChild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void c(com.google.android.material.appbar.AppBarLayout r7, int r8) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.results.common.ScrollingAlphaBehaviour.f17271g
            int r0 = r0 + 47
            int r3 = r0 % 128
            com.incode.welcome_sdk.ui.results.common.ScrollingAlphaBehaviour.f17270e = r3
            int r0 = r0 % r5
            r2 = -1
            if (r0 == 0) goto L5c
            int r1 = r6.f17273b
            r0 = 8
            int r0 = r0 / 0
            if (r1 != r2) goto L24
        L17:
            int r1 = r3 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.common.ScrollingAlphaBehaviour.f17271g = r0
            int r1 = r1 % r5
            int r0 = r7.getTotalScrollRange()
            r6.f17273b = r0
        L24:
            V extends android.view.View r3 = r6.f17272a
            if (r3 == 0) goto L54
            int r4 = com.incode.welcome_sdk.ui.results.common.ScrollingAlphaBehaviour.f17271g
            int r1 = r4 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.common.ScrollingAlphaBehaviour.f17270e = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L55
            int r1 = r6.f17273b
            r0 = 57
            int r0 = r0 / 0
            if (r1 <= 0) goto L5a
        L3b:
            int r0 = -r8
            float r2 = (float) r0
            int r0 = r6.f17273b
            float r0 = (float) r0
            float r2 = r2 / r0
            int r1 = r4 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.common.ScrollingAlphaBehaviour.f17270e = r0
            int r1 = r1 % r5
        L48:
            int r0 = -r8
            r3.setScrollY(r0)
            V extends android.view.View r1 = r6.f17272a
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r2
            r1.setAlpha(r0)
        L54:
            return
        L55:
            int r0 = r6.f17273b
            if (r0 <= 0) goto L5a
            goto L3b
        L5a:
            r2 = 0
            goto L48
        L5c:
            int r0 = r6.f17273b
            if (r0 != r2) goto L24
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.results.common.ScrollingAlphaBehaviour.c(com.google.android.material.appbar.AppBarLayout, int):void");
    }

    private void e() {
        int i2 = 2 % 2;
        int i3 = f17270e + 27;
        f17271g = i3 % 128;
        int i4 = i3 % 2;
        this.f17274c = new AppBarLayout.OnOffsetChangedListener() { // from class: com.incode.welcome_sdk.ui.results.common.ScrollingAlphaBehaviour$$ExternalSyntheticLambda0
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i5) {
                this.f$0.c(appBarLayout, i5);
            }
        };
        int i5 = f17271g + 93;
        f17270e = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i2 = 2 % 2;
        int i3 = f17270e + 89;
        f17271g = i3 % 128;
        int i4 = i3 % 2;
        if ((!(view instanceof AppBarLayout)) || this.f17275d != null) {
            return false;
        }
        AppBarLayout appBarLayout = (AppBarLayout) view;
        this.f17275d = appBarLayout;
        appBarLayout.addOnOffsetChangedListener(this.f17274c);
        int i5 = f17270e + 105;
        f17271g = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i2 = 2 % 2;
        if (view == this.f17275d) {
            int i3 = f17271g + 51;
            f17270e = i3 % 128;
            int i4 = i3 % 2;
            this.f17275d = null;
            this.f17273b = -1;
        }
        int i5 = f17270e + 11;
        f17271g = i5 % 128;
        int i6 = i5 % 2;
    }
}
