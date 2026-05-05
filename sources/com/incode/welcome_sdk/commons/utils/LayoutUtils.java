package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class LayoutUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6318b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6319d = 1;

    static /* synthetic */ void lambda$setFixedWidth$0(View view) {
        int i2 = 2 % 2;
        int i3 = f6318b + 75;
        f6319d = i3 % 128;
        int i4 = i3 % 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = view.getWidth();
        view.setLayoutParams(layoutParams);
        int i5 = f6319d + 61;
        f6318b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void setFixedWidth(final View view) {
        int i2 = 2 % 2;
        int i3 = f6319d + 95;
        f6318b = i3 % 128;
        if (i3 % 2 != 0) {
            view.post(new Runnable() { // from class: com.incode.welcome_sdk.commons.utils.LayoutUtils$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LayoutUtils.lambda$setFixedWidth$0(view);
                }
            });
            int i4 = 85 / 0;
        } else {
            view.post(new Runnable() { // from class: com.incode.welcome_sdk.commons.utils.LayoutUtils$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LayoutUtils.lambda$setFixedWidth$0(view);
                }
            });
        }
        int i5 = f6318b + 19;
        f6319d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void equalizeWidths(View... viewArr) {
        int i2 = 2 % 2;
        int i3 = f6319d + 25;
        f6318b = i3 % 128;
        int i4 = i3 % 2;
        int maxWidth = getMaxWidth(viewArr);
        int i5 = f6319d + 55;
        f6318b = i5 % 128;
        int i6 = i5 % 2;
        for (View view : viewArr) {
            addPaddingToMatchWidth(view, maxWidth);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[PHI: r1
  0x0023: PHI (r1v5 android.view.View) = (r1v4 android.view.View), (r1v8 android.view.View) binds: [B:13:0x0038, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getMaxWidth(android.view.View... r8) {
        /*
            r7 = 2
            int r0 = r7 % r7
            int r6 = r8.length
            int r0 = com.incode.welcome_sdk.commons.utils.LayoutUtils.f6319d
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.LayoutUtils.f6318b = r0
            int r1 = r1 % r7
            r5 = 0
            r4 = r5
            r3 = r4
        L10:
            if (r4 >= r6) goto L3b
            int r0 = com.incode.welcome_sdk.commons.utils.LayoutUtils.f6319d
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.LayoutUtils.f6318b = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L36
            r1 = r8[r4]
            r0 = 6
            int r0 = r0 / r5
            if (r1 == 0) goto L33
        L23:
            int r2 = r1.getWidth()
            if (r2 <= r3) goto L33
            int r0 = com.incode.welcome_sdk.commons.utils.LayoutUtils.f6319d
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.LayoutUtils.f6318b = r0
            int r1 = r1 % r7
            r3 = r2
        L33:
            int r4 = r4 + 1
            goto L10
        L36:
            r1 = r8[r4]
            if (r1 == 0) goto L33
            goto L23
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.LayoutUtils.getMaxWidth(android.view.View[]):int");
    }

    public static void addPaddingToMatchWidth(View view, int i2) {
        int width;
        int i3 = 2 % 2;
        int i4 = f6318b + 125;
        f6319d = i4 % 128;
        int i5 = i4 % 2;
        if (view == null || i2 == (width = view.getWidth())) {
            return;
        }
        int i6 = i2 - width;
        if (i6 > 0) {
            int i7 = f6319d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f6318b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 / 2;
            view.setPadding(view.getPaddingLeft() + i9, view.getPaddingTop(), view.getPaddingRight() + i9, view.getPaddingBottom());
            int i10 = f6318b + 17;
            f6319d = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 / 4;
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i2;
        view.setLayoutParams(layoutParams);
    }

    public static float convertDpToPx(Context context, float f2) {
        int i2 = 2 % 2;
        int i3 = f6319d + 101;
        f6318b = i3 % 128;
        int i4 = i3 % 2;
        float f3 = context.getResources().getDisplayMetrics().density;
        return i4 != 0 ? f2 / f3 : f2 * f3;
    }

    public static float convertPxToDp(Context context, float f2) {
        int i2 = 2 % 2;
        int i3 = f6318b + 27;
        f6319d = i3 % 128;
        int i4 = i3 % 2;
        float f3 = f2 / context.getResources().getDisplayMetrics().density;
        int i5 = f6319d + 81;
        f6318b = i5 % 128;
        if (i5 % 2 == 0) {
            return f3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean isRunningOnTablet(Context context) {
        int i2 = 2 % 2;
        int i3 = f6319d + 35;
        f6318b = i3 % 128;
        int i4 = i3 % 2;
        Resources resources = context.getResources();
        int i5 = R.bool.onboard_sdk_isTablet;
        if (i4 == 0) {
            return resources.getBoolean(i5);
        }
        resources.getBoolean(i5);
        throw null;
    }
}
