package com.dynatrace.android.lifecycle.activitytracking;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsCollector;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsUtility;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityScreenMetricsCollector implements ScreenMetricsCollector {
    static DisplayAccessor accessor = new DisplayAccessor() { // from class: com.dynatrace.android.lifecycle.activitytracking.ActivityScreenMetricsCollector$$ExternalSyntheticLambda0
        @Override // com.dynatrace.android.lifecycle.activitytracking.ActivityScreenMetricsCollector.DisplayAccessor
        public final Display getDisplay(Activity activity) {
            return ActivityScreenMetricsCollector.lambda$static$0(activity);
        }
    };

    @FunctionalInterface
    interface DisplayAccessor {
        Display getDisplay(Activity activity);
    }

    @Deprecated(since = "Android API level 30")
    public static ScreenMetrics calculateMetrics(Display display, int i2) {
        ScreenMetrics.Builder builder = new ScreenMetrics.Builder();
        DisplayMetrics displayMetricsFromDisplay = ScreenMetricsUtility.getDisplayMetricsFromDisplay(display);
        builder.withScreenDensityFactor(displayMetricsFromDisplay.density);
        builder.withScreenDensityDpi(displayMetricsFromDisplay.densityDpi);
        Point dimensionsFromDisplay = ScreenMetricsUtility.getDimensionsFromDisplay(display);
        if (isLandscapeNaturalOrientation(display.getRotation(), i2)) {
            builder.withScreenWidth(Math.max(dimensionsFromDisplay.x, dimensionsFromDisplay.y));
            builder.withScreenHeight(Math.min(dimensionsFromDisplay.x, dimensionsFromDisplay.y));
        } else {
            builder.withScreenWidth(Math.min(dimensionsFromDisplay.x, dimensionsFromDisplay.y));
            builder.withScreenHeight(Math.max(dimensionsFromDisplay.x, dimensionsFromDisplay.y));
        }
        return builder.build();
    }

    private static boolean isLandscapeNaturalOrientation(int i2, int i3) {
        if (i3 == 2) {
            return i2 == 0 || i2 == 2;
        }
        if (i3 == 1) {
            return i2 == 1 || i2 == 3;
        }
        return false;
    }

    static /* synthetic */ Display lambda$static$0(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            return activity.getDisplay();
        }
        return null;
    }

    @Override // com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsCollector
    public ScreenMetrics collectMetrics(Activity activity) {
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        Configuration configuration = activity.getResources().getConfiguration();
        int i2 = configuration.orientation;
        if (Build.VERSION.SDK_INT <= 29) {
            return calculateMetrics(windowManager.getDefaultDisplay(), i2);
        }
        ScreenMetrics.Builder builder = new ScreenMetrics.Builder();
        Display display = accessor.getDisplay(activity);
        int rotation = display != null ? display.getRotation() : 0;
        Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
        if (isLandscapeNaturalOrientation(rotation, i2)) {
            builder.withScreenWidth(Math.max(bounds.width(), bounds.height()));
            builder.withScreenHeight(Math.min(bounds.width(), bounds.height()));
        } else {
            builder.withScreenWidth(Math.min(bounds.width(), bounds.height()));
            builder.withScreenHeight(Math.max(bounds.width(), bounds.height()));
        }
        int i3 = configuration.densityDpi;
        builder.withScreenDensityFactor(i3 / 160.0f);
        builder.withScreenDensityDpi(i3);
        return builder.build();
    }
}
