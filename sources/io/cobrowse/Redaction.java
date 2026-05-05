package io.cobrowse;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowId;
import android.webkit.WebView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import io.cobrowse.CobrowseIO;
import io.cobrowse.Selector;
import io.cobrowse.ViewTraversal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class Redaction {
    private final List<RedactionExternal> redactionsExternal;
    private final WebViewTrackerManager webViewTrackerManager;
    private final HashMap<View, Drawable> redactions = new HashMap<>();
    private SelectorIndex redactionSelectorIndex = new SelectorIndex(new ArrayList());
    private SelectorIndex unredactionSelectorIndex = new SelectorIndex(new ArrayList());

    public Redaction(WebViewTrackerManager webViewTrackerManager, List<RedactionExternal> list) {
        this.webViewTrackerManager = webViewTrackerManager;
        this.redactionsExternal = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Set<View> findRedactedViews(Activity activity) {
        List<View> listRedactedViews;
        List<View> listRedactedViews2;
        HashSet hashSet = new HashSet();
        if ((activity instanceof CobrowseIO.Redacted) && (listRedactedViews2 = ((CobrowseIO.Redacted) activity).redactedViews()) != null) {
            hashSet.addAll(validateViews(listRedactedViews2));
        }
        CobrowseIO.RedactionDelegate redactionDelegate = (CobrowseIO.RedactionDelegate) CobrowseIO.instance().getDelegate(CobrowseIO.RedactionDelegate.class);
        if (redactionDelegate != null && (listRedactedViews = redactionDelegate.redactedViews(activity)) != null) {
            hashSet.addAll(validateViews(listRedactedViews));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Set<View> findUnredactedViews(Activity activity) {
        List<View> listUnredactedViews;
        List<View> listUnredactedViews2;
        HashSet hashSet = new HashSet();
        if ((activity instanceof CobrowseIO.Unredacted) && (listUnredactedViews2 = ((CobrowseIO.Unredacted) activity).unredactedViews()) != null) {
            hashSet.addAll(validateViews(listUnredactedViews2));
        }
        CobrowseIO.UnredactionDelegate unredactionDelegate = (CobrowseIO.UnredactionDelegate) CobrowseIO.instance().getDelegate(CobrowseIO.UnredactionDelegate.class);
        if (unredactionDelegate != null && (listUnredactedViews = unredactionDelegate.unredactedViews(activity)) != null) {
            hashSet.addAll(validateViews(listUnredactedViews));
        }
        return hashSet;
    }

    private void hideOverlay(View view) {
        Drawable drawable = this.redactions.get(view);
        if (drawable != null) {
            view.getOverlay().remove(drawable);
            view.invalidate();
            drawable.invalidateSelf();
        }
    }

    private static boolean isScrollView(View view) {
        return view.isScrollContainer() || (view instanceof ScrollView) || (view instanceof HorizontalScrollView) || view.getClass().getName().equals("androidx.core.widget.NestedScrollView");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isSingleLineTextView(android.view.View r5) {
        /*
            boolean r0 = r5 instanceof android.widget.TextView
            r4 = 0
            if (r0 != 0) goto L6
            return r4
        L6:
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r3 = 1
            if (r1 < r0) goto L16
            boolean r0 = r5.isSingleLine()
        L13:
            if (r0 != 0) goto L20
            return r4
        L16:
            int r0 = r5.getMaxLines()
            if (r0 != r3) goto L1e
            r0 = r3
            goto L13
        L1e:
            r0 = r4
            goto L13
        L20:
            int r1 = r5.getGravity()
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 != r0) goto L39
            int r2 = r5.getGravity()
            r0 = 7
            int r1 = r2 + r0
            r2 = r2 | r0
            int r1 = r1 - r2
            r0 = 3
            if (r1 == r0) goto L54
        L39:
            r2 = r3
        L3a:
            int r1 = r5.getGravity()
            r0 = 112(0x70, float:1.57E-43)
            int r1 = (-1) - r1
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r1 = (-1) - r1
            r0 = 48
            if (r1 == r0) goto L52
            r0 = r3
        L4c:
            if (r2 != 0) goto L50
            if (r0 == 0) goto L51
        L50:
            r4 = r3
        L51:
            return r4
        L52:
            r0 = r4
            goto L4c
        L54:
            r2 = r4
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: io.cobrowse.Redaction.isSingleLineTextView(android.view.View):boolean");
    }

    static /* synthetic */ boolean lambda$redactedViewsForActivity$1(Set set, Set set2, View view) {
        return set.contains(view) || set2.contains(view);
    }

    private void redact(View view) {
        if (this.redactions.get(view) != null) {
            return;
        }
        String str = "Adding redaction for " + view;
        ColorDrawable colorDrawable = new ColorDrawable(ViewCompat.MEASURED_STATE_MASK);
        colorDrawable.setVisible(false, false);
        this.redactions.put(view, colorDrawable);
    }

    private Set<View> redactedViewsForActivity(Activity activity) {
        final Set<View> setFindRedactedViews = findRedactedViews(activity);
        final Set<View> setFindUnredactedViews = findUnredactedViews(activity);
        forEachView(new ViewTraversal.Visitor() { // from class: io.cobrowse.Redaction$$ExternalSyntheticLambda0
            @Override // io.cobrowse.ViewTraversal.Visitor
            public final boolean visit(View view) {
                return this.f$0.m8831lambda$redactedViewsForActivity$0$iocobrowseRedaction(setFindRedactedViews, setFindUnredactedViews, view);
            }
        });
        HashSet hashSet = new HashSet();
        for (View view : setFindUnredactedViews) {
            hashSet.add(view);
            hashSet.addAll(TreeUtils.allParents(view));
        }
        HashSet hashSet2 = new HashSet(setFindRedactedViews);
        hashSet2.retainAll(hashSet);
        HashSet hashSet3 = new HashSet(setFindRedactedViews);
        hashSet3.removeAll(hashSet2);
        HashSet hashSet4 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ViewParent parent = ((View) it.next()).getParent();
            if (parent instanceof ViewGroup) {
                hashSet4.addAll(TreeUtils.directChildren((ViewGroup) parent));
            }
        }
        HashSet<View> hashSet5 = new HashSet(hashSet4);
        hashSet5.removeAll(hashSet);
        for (View view2 : hashSet5) {
            if (setFindRedactedViews.contains(TreeUtils.closest(view2, new Predicate() { // from class: io.cobrowse.Redaction$$ExternalSyntheticLambda1
                @Override // io.cobrowse.Predicate
                public final boolean test(Object obj) {
                    return Redaction.lambda$redactedViewsForActivity$1(setFindRedactedViews, setFindUnredactedViews, (View) obj);
                }
            }))) {
                hashSet3.add(view2);
            }
        }
        for (View view3 : new HashSet(hashSet3)) {
            if ((view3 instanceof ViewGroup) && !(view3 instanceof WebView) && ((ViewGroup) view3).getChildCount() == 0) {
                hashSet3.remove(view3);
            }
        }
        hashSet3.addAll(this.webViewTrackerManager.getRedactedViewsForActivity(activity));
        return hashSet3;
    }

    private void showOverlay(View view) {
        int scrollX;
        int scrollY;
        int scrollY2;
        View childAt;
        Drawable drawable = this.redactions.get(view);
        if (drawable == null) {
            String str = "No overlay found for view " + view;
            return;
        }
        drawable.setVisible(true, true);
        int width = view.getWidth() == 0 ? Integer.MAX_VALUE : view.getWidth();
        int height = view.getHeight() != 0 ? view.getHeight() : Integer.MAX_VALUE;
        if (isScrollView(view)) {
            if ((view instanceof ViewGroup) && (childAt = ((ViewGroup) view).getChildAt(0)) != null) {
                width += childAt.getWidth();
                height += childAt.getHeight();
            }
            if (view instanceof WebView) {
                scrollY = view.getScrollY();
                scrollX = view.getScrollX();
                width += view.getScrollX();
                scrollY2 = view.getScrollY();
                height += scrollY2;
            }
            scrollY = 0;
            scrollX = 0;
        } else {
            if (isSingleLineTextView(view)) {
                scrollX = view.getScrollX();
                scrollY = view.getScrollY();
                width += view.getScrollX();
                scrollY2 = view.getScrollY();
                height += scrollY2;
            }
            scrollY = 0;
            scrollX = 0;
        }
        drawable.setBounds(scrollX, scrollY, width, height);
        view.getOverlay().add(drawable);
        view.setWillNotDraw(false);
    }

    private void unredact(View view) {
        String str = "Removing redaction for " + view;
        hideOverlay(view);
        this.redactions.remove(view);
    }

    private List<View> validateViews(List<View> list) {
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            if (view != null) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    void forEachView(ViewTraversal.Visitor visitor) {
        Iterator<View> it = Windows.getAll().iterator();
        while (it.hasNext()) {
            ViewTraversal.depthFirst(it.next(), visitor);
        }
    }

    Set<View> getRedactions() {
        return this.redactions.keySet();
    }

    List<Pair<Rect, WindowId>> getRedactionsExternal() {
        ArrayList arrayList = new ArrayList();
        Iterator<RedactionExternal> it = this.redactionsExternal.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getTrackedRedactions());
        }
        return arrayList;
    }

    void hide() {
        Iterator<RedactionExternal> it = this.redactionsExternal.iterator();
        while (it.hasNext()) {
            it.next().hide();
        }
        Iterator it2 = new HashMap(this.redactions).keySet().iterator();
        while (it2.hasNext()) {
            hideOverlay((View) it2.next());
        }
    }

    boolean isRedacted(View view) {
        if (view == null) {
            return false;
        }
        if (this.redactions.containsKey(view)) {
            return true;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return isRedacted((View) parent);
        }
        return false;
    }

    boolean isRedactionExternalFocused() {
        Iterator<RedactionExternal> it = this.redactionsExternal.iterator();
        while (it.hasNext()) {
            if (it.next().isRedactionFocused()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: lambda$redactedViewsForActivity$0$io-cobrowse-Redaction, reason: not valid java name */
    /* synthetic */ boolean m8831lambda$redactedViewsForActivity$0$iocobrowseRedaction(Set set, Set set2, View view) {
        if (matchesAnySelector(this.redactionSelectorIndex, view)) {
            set.add(view);
        }
        if (!matchesAnySelector(this.unredactionSelectorIndex, view)) {
            return true;
        }
        set2.add(view);
        return true;
    }

    boolean matchesAnySelector(SelectorIndex selectorIndex, View view) {
        Iterator<Selector> it = selectorIndex.possibleMatches(Selector.Part.tagFor(view), Selector.Part.idFor(view), Selector.Part.attributesFor(view, selectorIndex.getKnownAttributes())).iterator();
        while (it.hasNext()) {
            if (it.next().matches(view)) {
                return true;
            }
        }
        return false;
    }

    void redact(Set<Activity> set) {
        HashSet hashSet = new HashSet(this.redactions.keySet());
        Iterator<Activity> it = set.iterator();
        while (it.hasNext()) {
            for (View view : redactedViewsForActivity(it.next())) {
                redact(view);
                hashSet.remove(view);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            unredact((View) it2.next());
        }
    }

    void setSelectors(List<Selector> list, List<Selector> list2) {
        this.redactionSelectorIndex = new SelectorIndex(list);
        this.unredactionSelectorIndex = new SelectorIndex(list2);
        Iterator<RedactionExternal> it = this.redactionsExternal.iterator();
        while (it.hasNext()) {
            it.next().setRedactionIndexes(this.redactionSelectorIndex, this.unredactionSelectorIndex);
        }
    }

    void show() {
        Iterator<RedactionExternal> it = this.redactionsExternal.iterator();
        while (it.hasNext()) {
            it.next().show();
        }
        Iterator it2 = new HashMap(this.redactions).keySet().iterator();
        while (it2.hasNext()) {
            showOverlay((View) it2.next());
        }
    }

    void unredactAll() {
        Iterator it = new HashMap(this.redactions).keySet().iterator();
        while (it.hasNext()) {
            unredact((View) it.next());
        }
    }
}
