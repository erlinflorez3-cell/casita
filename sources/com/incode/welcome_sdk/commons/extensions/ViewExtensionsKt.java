package com.incode.welcome_sdk.commons.extensions;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import com.incode.welcome_sdk.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ViewExtensionsKt {
    private static final long PREVENT_DOUBLE_CLICK_DELAY_MS = 3000;
    private static final long PREVENT_DOUBLE_CLICK_SHORT_DELAY_MS = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5105a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5106c = 1;

    public static final void preventDoubleClick(View view) {
        int i2 = 2 % 2;
        int i3 = f5106c + 11;
        f5105a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            preventDoubleClick(view, 3000L);
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        preventDoubleClick(view, 3000L);
        int i4 = f5105a + 25;
        f5106c = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final void preventDoubleClickShort(View view) {
        int i2 = 2 % 2;
        int i3 = f5106c + 103;
        f5105a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            preventDoubleClick(view, 1000L);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            preventDoubleClick(view, 1000L);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void preventDoubleClick$lambda$0(View view) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f5105a + 39;
        f5106c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            z2 = false;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            z2 = true;
        }
        view.setEnabled(z2);
    }

    public static final void preventDoubleClick(final View view, long j2) {
        int i2 = 2 % 2;
        int i3 = f5105a + 63;
        f5106c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int i4 = 7 / 0;
            if (!view.isEnabled()) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            if (!view.isEnabled()) {
                return;
            }
        }
        view.setEnabled(false);
        view.postDelayed(new Runnable() { // from class: com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ViewExtensionsKt.preventDoubleClick$lambda$0(view);
            }
        }, j2);
        int i5 = f5105a + 89;
        f5106c = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void setRotationEnabled(View view, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f5106c + 15;
        f5105a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (!z2) {
            view.clearAnimation();
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.onboard_sdk_rotate);
        animationLoadAnimation.setFillAfter(true);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        view.startAnimation(animationLoadAnimation);
        int i5 = f5106c + 105;
        f5105a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    public static final void hideKeyboard(View view) {
        int i2 = 2 % 2;
        int i3 = f5105a + 111;
        f5106c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        int i5 = f5105a + 97;
        f5106c = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final boolean isOverlapping(View view, View view2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        int i3 = iArr[0];
        Rect rect = new Rect(i3, iArr[1], view.getMeasuredWidth() + i3, iArr[1] + view.getMeasuredHeight());
        int i4 = iArr2[0];
        boolean zIntersect = rect.intersect(new Rect(i4, iArr2[1], view2.getMeasuredWidth() + i4, iArr2[1] + view2.getMeasuredHeight()));
        int i5 = f5106c + 25;
        f5105a = i5 % 128;
        int i6 = i5 % 2;
        return zIntersect;
    }

    public static /* synthetic */ void visible$default(View view, boolean z2, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 2) != 0) {
            int i5 = f5105a + 79;
            f5106c = i5 % 128;
            i2 = i5 % 2 == 0 ? 5 : 4;
        }
        visible(view, z2, i2);
        int i6 = f5106c + 23;
        f5105a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 77 / 0;
        }
    }

    public static final void visible(View view, boolean z2, int i2) {
        int i3 = 2 % 2;
        int i4 = f5106c + 7;
        f5105a = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (z2) {
            i2 = 0;
        }
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        int i6 = f5106c + 21;
        f5105a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }
}
