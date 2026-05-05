package io.cobrowse;

import android.graphics.Rect;
import android.view.WindowId;
import androidx.core.util.Pair;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
interface RedactionExternal {
    List<Pair<Rect, WindowId>> getTrackedRedactions();

    void hide();

    boolean isRedactionFocused();

    void setRedactionIndexes(SelectorIndex selectorIndex, SelectorIndex selectorIndex2);

    void show();
}
