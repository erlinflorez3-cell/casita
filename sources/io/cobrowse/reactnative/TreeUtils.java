package io.cobrowse.reactnative;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.util.Predicate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class TreeUtils {
    TreeUtils() {
    }

    public static List<View> allParents(View view) {
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                arrayList.add(0, (View) parent);
            }
        }
        return arrayList;
    }

    public static View closest(View view, Predicate<View> predicate) {
        if (predicate.test(view)) {
            return view;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return closest((ViewGroup) parent, predicate);
        }
        return null;
    }

    public static Set<View> directChildren(View view) {
        HashSet hashSet = new HashSet();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                hashSet.add(viewGroup.getChildAt(i2));
            }
        }
        return hashSet;
    }
}
