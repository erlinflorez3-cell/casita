package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.core.internal.view.SupportMenu;
import com.braze.models.IBrazeLocation;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.android.gms.maps.model.LatLng;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class MapCircleManager extends ViewGroupManager<MapCircle> {
    private final DisplayMetrics metrics;

    public MapCircleManager(ReactApplicationContext reactApplicationContext) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.metrics = displayMetrics;
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapCircle createViewInstance(ThemedReactContext themedReactContext) {
        return new MapCircle(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapCircle";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004Tm\u000e\u0001:")
    public void setCenter(MapCircle mapCircle, ReadableMap readableMap) {
        mapCircle.setCenter(new LatLng(readableMap.getDouble(IBrazeLocation.LATITUDE), readableMap.getDouble(IBrazeLocation.LONGITUDE)));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", defaultInt = SupportMenu.CATEGORY_MASK, name = "\u0007Xk\u0006^7\u001a\bh")
    public void setFillColor(MapCircle mapCircle, int i2) {
        mapCircle.setFillColor(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultDouble = 0.0d, name = "\u0013Pc\u0003\u0011;")
    public void setRadius(MapCircle mapCircle, double d2) {
        mapCircle.setRadius(d2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", defaultInt = SupportMenu.CATEGORY_MASK, name = "\u0014cq\t\u0007-p\bbEB")
    public void setStrokeColor(MapCircle mapCircle, int i2) {
        mapCircle.setStrokeColor(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
    public void setStrokeWidth(MapCircle mapCircle, float f2) {
        mapCircle.setStrokeWidth(this.metrics.density * f2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u001b8m}\u0001@")
    public void setZIndex(MapCircle mapCircle, float f2) {
        mapCircle.setZIndex(f2);
    }
}
