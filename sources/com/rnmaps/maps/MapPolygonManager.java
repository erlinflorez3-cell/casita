package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.core.internal.view.SupportMenu;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class MapPolygonManager extends ViewGroupManager<MapPolygon> {
    private final DisplayMetrics metrics;

    public MapPolygonManager(ReactApplicationContext reactApplicationContext) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.metrics = displayMetrics;
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapPolygon createViewInstance(ThemedReactContext themedReactContext) {
        return new MapPolygon(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("onPress", MapBuilder.of("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapPolygon";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^n\f\u007f1\u001cyj;C")
    public void setCoordinate(MapPolygon mapPolygon, ReadableArray readableArray) {
        mapPolygon.setCoordinates(readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", defaultInt = SupportMenu.CATEGORY_MASK, name = "\u0007Xk\u0006^7\u001a\bh")
    public void setFillColor(MapPolygon mapPolygon, int i2) {
        mapPolygon.setFillColor(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\bTn}\u0001;\u0017{")
    public void setGeodesic(MapPolygon mapPolygon, boolean z2) {
        mapPolygon.setGeodesic(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\t^k~\u000f")
    public void setHoles(MapPolygon mapPolygon, ReadableArray readableArray) {
        mapPolygon.setHoles(readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", defaultInt = SupportMenu.CATEGORY_MASK, name = "\u0014cq\t\u0007-p\bbEB")
    public void setStrokeColor(MapPolygon mapPolygon, int i2) {
        mapPolygon.setStrokeColor(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
    public void setStrokeWidth(MapPolygon mapPolygon, float f2) {
        mapPolygon.setStrokeWidth(this.metrics.density * f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0015Po\n|*\u001a}")
    public void setTappable(MapPolygon mapPolygon, boolean z2) {
        mapPolygon.setTappable(z2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u001b8m}\u0001@")
    public void setZIndex(MapPolygon mapPolygon, float f2) {
        mapPolygon.setZIndex(f2);
    }
}
