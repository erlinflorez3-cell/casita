package io.cobrowse;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
final class ViewTraversal {

    public interface Visitor {
        boolean visit(View view);
    }

    ViewTraversal() {
    }

    static void depthFirst(View view, Visitor visitor) {
        if (visitor.visit(view) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                depthFirst(viewGroup.getChildAt(i2), visitor);
            }
        }
    }
}
