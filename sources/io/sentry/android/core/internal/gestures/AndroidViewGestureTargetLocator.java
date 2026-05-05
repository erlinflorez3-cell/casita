package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.internal.util.ClassUtil;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;

/* JADX INFO: loaded from: classes6.dex */
public final class AndroidViewGestureTargetLocator implements GestureTargetLocator {
    private static final String ORIGIN = "old_view_system";
    private final boolean isAndroidXAvailable;

    public AndroidViewGestureTargetLocator(boolean z2) {
        this.isAndroidXAvailable = z2;
    }

    private UiElement createUiElement(View view) throws Throwable {
        try {
            return new UiElement(view, ClassUtil.getClassName(view), ViewUtils.getResourceId(view), null, ORIGIN);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static boolean isJetpackScrollingView(View view, boolean z2) {
        if (z2) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    private static boolean isViewScrollable(View view, boolean z2) {
        return (isJetpackScrollingView(view, z2) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    private static boolean isViewTappable(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // io.sentry.internal.gestures.GestureTargetLocator
    public UiElement locate(Object obj, float f2, float f3, UiElement.Type type) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (type == UiElement.Type.CLICKABLE && isViewTappable(view)) {
            return createUiElement(view);
        }
        if (type == UiElement.Type.SCROLLABLE && isViewScrollable(view, this.isAndroidXAvailable)) {
            return createUiElement(view);
        }
        return null;
    }
}
