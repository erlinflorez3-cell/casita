package io.cobrowse;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dynatrace.android.agent.Global;
import com.facebook.react.uimanager.ViewProps;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.Xg;

/* JADX INFO: loaded from: classes3.dex */
final class WebViewRedactionManager {
    private final float mDensity;
    private final WeakReference<WebView> mWebViewRef;
    private final Map<String, View> mRectViewMap = new HashMap();
    private WeakReference<ViewGroup> mRedactedViewsHolder = new WeakReference<>(null);
    private final HashSet<View> mOverlayViews = new HashSet<>();

    WebViewRedactionManager(WebView webView) throws Throwable {
        this.mWebViewRef = new WeakReference<>(webView);
        Context context = webView.getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("gul{ytp;q~~\u0006w\u0002\tCY\u0007\u0007\u000e\u007f\u0014\u0011", (short) (Od.Xd() ^ (-6196)))).getMethod(Xg.qd("kjzYm|y\u0001~ps\u0003", (short) (C1580rY.Xd() ^ (-8601)), (short) (C1580rY.Xd() ^ (-10478))), new Class[0]);
        try {
            method.setAccessible(true);
            this.mDensity = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void clearRedactedViews() {
        ViewGroup viewGroup = this.mRedactedViewsHolder.get();
        if (viewGroup != null) {
            Iterator<View> it = this.mOverlayViews.iterator();
            while (it.hasNext()) {
                viewGroup.removeView(it.next());
            }
        }
        this.mOverlayViews.clear();
    }

    private static View createOverlayView(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        view.setDrawingCacheEnabled(false);
        view.setClickable(false);
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
        view.setOnTouchListener(null);
        view.setLongClickable(false);
        view.setHapticFeedbackEnabled(false);
        return view;
    }

    private static ViewGroup findParentViewGroup(View view) {
        Object parent = view.getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        if (parent.getClass().getName().startsWith("androidx.compose")) {
            return findParentViewGroup((View) parent);
        }
        if (parent instanceof ViewGroup) {
            return (ViewGroup) view.getParent();
        }
        return null;
    }

    private static ViewGroup.LayoutParams getLayoutParamsForRect(ViewGroup viewGroup, Rect rect) {
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = rect.left;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = rect.top;
            return layoutParams;
        }
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(rect.width(), rect.height());
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = rect.left;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = rect.top;
            return layoutParams2;
        }
        if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(rect.width(), rect.height());
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = rect.left;
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = rect.top;
            return layoutParams3;
        }
        if (!(viewGroup instanceof ConstraintLayout)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(rect.width(), rect.height());
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.topMargin = rect.top;
            return marginLayoutParams;
        }
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(rect.width(), rect.height());
        layoutParams4.leftToLeft = 0;
        layoutParams4.topToTop = 0;
        layoutParams4.leftMargin = rect.left;
        layoutParams4.topMargin = rect.top;
        return layoutParams4;
    }

    private Rect getRectForPosition(JSONObject jSONObject, Rect rect, int i2, int i3) throws JSONException {
        return new Rect((mapPropertyToInt(jSONObject, "left") + rect.left) - (Math.abs(Math.max(0, i2)) * 3), (mapPropertyToInt(jSONObject, "top") + rect.top) - (Math.abs(Math.max(0, i3)) * 3), mapPropertyToInt(jSONObject, ViewProps.RIGHT) + rect.left + (Math.abs(Math.min(0, i2)) * 3), mapPropertyToInt(jSONObject, ViewProps.BOTTOM) + rect.top + (Math.abs(Math.min(0, i3)) * 3));
    }

    private Rect getRelativeRect(WebView webView, ViewGroup viewGroup) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        webView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationInWindow(iArr2);
        rect.left = iArr[0] - iArr2[0];
        rect.top = iArr[1] - iArr2[1];
        rect.right = rect.left + webView.getWidth();
        rect.bottom = rect.top + webView.getHeight();
        return rect;
    }

    private static void layoutViewForReactNative(View view, ViewGroup viewGroup, Rect rect) {
        if (viewGroup.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    private int mapPropertyToInt(JSONObject jSONObject, String str) throws JSONException {
        return (int) Math.ceil(jSONObject.getDouble(str) * ((double) this.mDensity));
    }

    Set<View> getRedactedViews() {
        if (this.mRedactedViewsHolder.get() == null) {
            return null;
        }
        Iterator<View> it = this.mOverlayViews.iterator();
        while (it.hasNext()) {
            if (!it.next().isLaidOut()) {
                return null;
            }
        }
        return this.mOverlayViews;
    }

    void reset() {
        clearRedactedViews();
        this.mOverlayViews.clear();
        this.mRectViewMap.clear();
    }

    void updateOverlay(JSONArray jSONArray, int i2, int i3) throws JSONException {
        WebView webView = this.mWebViewRef.get();
        ViewGroup viewGroupFindParentViewGroup = findParentViewGroup(webView);
        if (viewGroupFindParentViewGroup == null) {
            this.mRedactedViewsHolder = new WeakReference<>(null);
            return;
        }
        Rect relativeRect = getRelativeRect(webView, viewGroupFindParentViewGroup);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            Rect rectForPosition = getRectForPosition(jSONArray.getJSONObject(i4), relativeRect, i2, i3);
            String str = rectForPosition.left + Global.HYPHEN + rectForPosition.top + Global.HYPHEN + rectForPosition.right + Global.HYPHEN + rectForPosition.bottom;
            if (this.mRectViewMap.containsKey(str)) {
                hashSet.add(this.mRectViewMap.get(str));
            } else {
                View viewCreateOverlayView = createOverlayView(viewGroupFindParentViewGroup);
                viewCreateOverlayView.setLayoutParams(getLayoutParamsForRect(viewGroupFindParentViewGroup, rectForPosition));
                viewCreateOverlayView.bringToFront();
                map.put(str, new Pair(viewCreateOverlayView, rectForPosition));
            }
        }
        Iterator<Map.Entry<String, View>> it = this.mRectViewMap.entrySet().iterator();
        while (it.hasNext()) {
            View value = it.next().getValue();
            if (!hashSet.contains(value)) {
                it.remove();
                this.mOverlayViews.remove(value);
                viewGroupFindParentViewGroup.removeView(value);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Pair pair = (Pair) entry.getValue();
            View view = (View) pair.first;
            this.mOverlayViews.add(view);
            viewGroupFindParentViewGroup.addView(view);
            layoutViewForReactNative(view, viewGroupFindParentViewGroup, (Rect) pair.second);
            this.mRectViewMap.put(str2, view);
        }
        this.mRedactedViewsHolder = new WeakReference<>(viewGroupFindParentViewGroup);
    }
}
