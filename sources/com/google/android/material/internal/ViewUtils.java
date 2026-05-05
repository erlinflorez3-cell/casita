package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;

/* JADX INFO: loaded from: classes9.dex */
public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    /* JADX INFO: renamed from: com.google.android.material.internal.ViewUtils$1 */
    class AnonymousClass1 implements OnApplyWindowInsetsListener {
        final /* synthetic */ OnApplyWindowInsetsListener val$listener;
        final /* synthetic */ boolean val$paddingBottomSystemWindowInsets;
        final /* synthetic */ boolean val$paddingLeftSystemWindowInsets;
        final /* synthetic */ boolean val$paddingRightSystemWindowInsets;

        AnonymousClass1(boolean z2, boolean z3, boolean z4, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            z = z2;
            z = z3;
            z = z4;
            onApplyWindowInsetsListener = onApplyWindowInsetsListener;
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding) {
            if (z) {
                relativePadding.bottom += windowInsetsCompat.getSystemWindowInsetBottom();
            }
            boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view);
            if (z) {
                if (zIsLayoutRtl) {
                    relativePadding.end += windowInsetsCompat.getSystemWindowInsetLeft();
                } else {
                    relativePadding.start += windowInsetsCompat.getSystemWindowInsetLeft();
                }
            }
            if (z) {
                if (zIsLayoutRtl) {
                    relativePadding.start += windowInsetsCompat.getSystemWindowInsetRight();
                } else {
                    relativePadding.end += windowInsetsCompat.getSystemWindowInsetRight();
                }
            }
            relativePadding.applyToView(view);
            OnApplyWindowInsetsListener onApplyWindowInsetsListener = onApplyWindowInsetsListener;
            return onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompat, relativePadding) : windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.ViewUtils$2 */
    class AnonymousClass2 implements androidx.core.view.OnApplyWindowInsetsListener {
        final /* synthetic */ RelativePadding val$initialPadding;

        AnonymousClass2(RelativePadding relativePadding) {
            relativePadding = relativePadding;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompat, new RelativePadding(relativePadding));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.ViewUtils$3 */
    class AnonymousClass3 implements View.OnAttachStateChangeListener {
        AnonymousClass3() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding);
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i2, int i3, int i4, int i5) {
            this.start = i2;
            this.top = i3;
            this.end = i4;
            this.bottom = i5;
        }

        public RelativePadding(RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(View view) {
            ViewCompat.setPaddingRelative(view, this.start, this.top, this.end, this.bottom);
        }
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static Rect calculateOffsetRectFromBounds(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i4 = i2 - iArr2[0];
        int i5 = i3 - iArr2[1];
        return new Rect(i4, i5, view2.getWidth() + i4, view2.getHeight() + i5);
    }

    public static Rect calculateRectFromBounds(View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static Rect calculateRectFromBounds(View view, int i2) {
        return new Rect(view.getLeft(), view.getTop() + i2, view.getRight(), view.getBottom() + i2);
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        doOnApplyWindowInsets(view, attributeSet, i2, i3, null);
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i2, int i3, OnApplyWindowInsetsListener onApplyWindowInsetsListener) throws Throwable {
        Context context = view.getContext();
        int[] iArr = R.styleable.Insets;
        Class<?> cls = Class.forName(C1561oA.ud("2>3@<5/w,75:*27o\u0004/-2\"4/", (short) (C1499aX.Xd() ^ (-6334))));
        Class<?>[] clsArr = {Class.forName(C1561oA.yd("#/(5-&$l?=57s\u0006<;D:6HB2#4N", (short) (Od.Xd() ^ (-26000)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(C1561oA.Yd("\u0015\t\u001c\n\u0013\u0019~!'\u001b\u0015\u0015r'('\u001f\u0019--\u001f.", (short) (C1499aX.Xd() ^ (-518))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            boolean z2 = typedArray.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
            boolean z3 = typedArray.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
            boolean z4 = typedArray.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
            typedArray.recycle();
            doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
                final /* synthetic */ OnApplyWindowInsetsListener val$listener;
                final /* synthetic */ boolean val$paddingBottomSystemWindowInsets;
                final /* synthetic */ boolean val$paddingLeftSystemWindowInsets;
                final /* synthetic */ boolean val$paddingRightSystemWindowInsets;

                AnonymousClass1(boolean z22, boolean z32, boolean z42, OnApplyWindowInsetsListener onApplyWindowInsetsListener2) {
                    z = z22;
                    z = z32;
                    z = z42;
                    onApplyWindowInsetsListener = onApplyWindowInsetsListener2;
                }

                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding) {
                    if (z) {
                        relativePadding.bottom += windowInsetsCompat.getSystemWindowInsetBottom();
                    }
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                    if (z) {
                        if (zIsLayoutRtl) {
                            relativePadding.end += windowInsetsCompat.getSystemWindowInsetLeft();
                        } else {
                            relativePadding.start += windowInsetsCompat.getSystemWindowInsetLeft();
                        }
                    }
                    if (z) {
                        if (zIsLayoutRtl) {
                            relativePadding.start += windowInsetsCompat.getSystemWindowInsetRight();
                        } else {
                            relativePadding.end += windowInsetsCompat.getSystemWindowInsetRight();
                        }
                    }
                    relativePadding.applyToView(view2);
                    OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                    return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, windowInsetsCompat, relativePadding) : windowInsetsCompat;
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void doOnApplyWindowInsets(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            final /* synthetic */ RelativePadding val$initialPadding;

            AnonymousClass2(RelativePadding relativePadding) {
                relativePadding = relativePadding;
            }

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    public static float dpToPx(Context context, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("We\\kid`+annugqx3Ivv}o\u0004\u0001", (short) (C1499aX.Xd() ^ (-26697)), (short) (C1499aX.Xd() ^ (-19132)))).getMethod(Jg.Wd("ud!sD5^Ys\bx<", (short) (OY.Xd() ^ 13436), (short) (OY.Xd() ^ 14362)), new Class[0]);
        try {
            method.setAccessible(true);
            return TypedValue.applyDimension(1, i2, ((Resources) method.invoke(context, objArr)).getDisplayMetrics());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Integer getBackgroundColor(View view) {
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(view.getBackground());
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    public static List<View> getChildren(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                arrayList.add(viewGroup.getChildAt(i2));
            }
        }
        return arrayList;
    }

    public static ViewGroup getContentView(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlayImpl getContentViewOverlay(View view) {
        return getOverlay(getContentView(view));
    }

    private static InputMethodManager getInputMethodManager(View view) {
        return (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static ViewOverlayImpl getOverlay(View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static float getParentAbsoluteElevation(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ViewCompat.getElevation((View) parent);
        }
        return elevation;
    }

    public static void hideKeyboard(View view) {
        hideKeyboard(view, true);
    }

    public static void hideKeyboard(View view, boolean z2) {
        WindowInsetsControllerCompat windowInsetsController;
        if (z2 && (windowInsetsController = ViewCompat.getWindowInsetsController(view)) != null) {
            windowInsetsController.hide(WindowInsetsCompat.Type.ime());
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean isLayoutRtl(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void removeOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void requestApplyInsetsWhenAttached(View view) {
        if (ViewCompat.isAttachedToWindow(view)) {
            ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                AnonymousClass3() {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewCompat.requestApplyInsets(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void requestFocusAndShowKeyboard(final View view, final boolean z2) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtils.showKeyboard(view, z2);
            }
        });
    }

    public static void setBoundsFromRect(View view, Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static void showKeyboard(View view) {
        showKeyboard(view, true);
    }

    public static void showKeyboard(View view, boolean z2) {
        WindowInsetsControllerCompat windowInsetsController;
        if (!z2 || (windowInsetsController = ViewCompat.getWindowInsetsController(view)) == null) {
            getInputMethodManager(view).showSoftInput(view, 1);
        } else {
            windowInsetsController.show(WindowInsetsCompat.Type.ime());
        }
    }
}
