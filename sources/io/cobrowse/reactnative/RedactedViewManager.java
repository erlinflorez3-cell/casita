package io.cobrowse.reactnative;

import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class RedactedViewManager extends ViewGroupManager<RedactedView> {
    static WeakHashMap<View, String> redactedViews = new WeakHashMap<>();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public RedactedView createViewInstance(ThemedReactContext themedReactContext) {
        RedactedView redactedView = new RedactedView(themedReactContext);
        redactedViews.put(redactedView, null);
        return redactedView;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CBIOCobrowseRedacted";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(RedactedView redactedView) {
        super.onDropViewInstance(redactedView);
        redactedViews.remove(redactedView);
    }
}
