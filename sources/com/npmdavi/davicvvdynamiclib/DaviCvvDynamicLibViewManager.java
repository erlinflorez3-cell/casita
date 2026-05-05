package com.npmdavi.davicvvdynamiclib;

import android.graphics.Color;
import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class DaviCvvDynamicLibViewManager extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "DaviCvvDynamicLibView";

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ThemedReactContext themedReactContext) {
        return new View(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^k\t\u000e")
    public void setColor(View view, String str) {
        view.setBackgroundColor(Color.parseColor(str));
    }
}
