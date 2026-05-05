package com.rnmaps.maps;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class MapCalloutManager extends ViewGroupManager<MapCallout> {
    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new SizeReportingShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapCallout createViewInstance(ThemedReactContext themedReactContext) {
        return new MapCallout(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("onPress", MapBuilder.of("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapCallout";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0015^n\u0006\u00101\u001e")
    public void setTooltip(MapCallout mapCallout, boolean z2) {
        mapCallout.setTooltip(z2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(MapCallout mapCallout, Object obj) {
        Map map = (Map) obj;
        float fFloatValue = ((Float) map.get("width")).floatValue();
        float fFloatValue2 = ((Float) map.get("height")).floatValue();
        mapCallout.width = (int) fFloatValue;
        mapCallout.height = (int) fFloatValue2;
    }
}
