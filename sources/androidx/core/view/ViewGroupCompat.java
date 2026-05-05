package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ReplaceWith;
import androidx.core.R;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
    private static final WindowInsets CONSUMED = WindowInsetsCompat.CONSUMED.toWindowInsets();
    static boolean sCompatInsetsDispatchInstalled = false;

    private ViewGroupCompat() {
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u000b<&(\u000e.lW*B;+UGD\u0012\u0010}`(F+\u0018dQK0##\u0004|}6;d[Mw\u001f \r\u0003v,\f\b\u0006_c=n", imports = {})
    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u000b<&(\u000e.pNL*9*YC>\u0004!tj[68\u001fZRV7(\u001e_veS1dQ\u0001C,$\r\u000b;", imports = {})
    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z2) {
        viewGroup.setMotionEventSplittingEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u000b<&(\u000e.dNL)+/_ID\f\u001asa\u000f\f", imports = {})
    @Deprecated
    public static int getLayoutMode(ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u000b<&(\u000e.pNL)+/_ID\f\u001asa\u000fP7\u0017V\u0007", imports = {})
    @Deprecated
    public static void setLayoutMode(ViewGroup viewGroup, int i2) {
        viewGroup.setLayoutMode(i2);
    }

    public static void setTransitionGroup(ViewGroup viewGroup, boolean z2) {
        Api21Impl.setTransitionGroup(viewGroup, z2);
    }

    public static boolean isTransitionGroup(ViewGroup viewGroup) {
        return Api21Impl.isTransitionGroup(viewGroup);
    }

    public static int getNestedScrollAxes(ViewGroup viewGroup) {
        return Api21Impl.getNestedScrollAxes(viewGroup);
    }

    public static void installCompatInsetsDispatch(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return;
        }
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return ViewGroupCompat.lambda$installCompatInsetsDispatch$0(view2, windowInsets);
            }
        };
        view.setTag(R.id.tag_compat_insets_dispatch, onApplyWindowInsetsListener);
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        sCompatInsetsDispatchInstalled = true;
    }

    static /* synthetic */ WindowInsets lambda$installCompatInsetsDispatch$0(View view, WindowInsets windowInsets) {
        dispatchApplyWindowInsets(view, windowInsets);
        return CONSUMED;
    }

    static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets windowInsets) {
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        Object tag2 = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag;
        } else {
            onApplyWindowInsetsListener = tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        }
        final WindowInsets[] windowInsetsArr = new WindowInsets[1];
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return ViewGroupCompat.lambda$dispatchApplyWindowInsets$1(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(R.id.tag_compat_insets_dispatch);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                dispatchApplyWindowInsets(viewGroup.getChildAt(i2), windowInsetsArr[0]);
            }
        }
        return windowInsetsArr[0];
    }

    static /* synthetic */ WindowInsets lambda$dispatchApplyWindowInsets$1(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets;
        if (onApplyWindowInsetsListener != null) {
            windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        } else {
            windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        }
        windowInsetsArr[0] = windowInsetsOnApplyWindowInsets;
        return CONSUMED;
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void setTransitionGroup(ViewGroup viewGroup, boolean z2) {
            viewGroup.setTransitionGroup(z2);
        }

        static boolean isTransitionGroup(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static int getNestedScrollAxes(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }
    }
}
