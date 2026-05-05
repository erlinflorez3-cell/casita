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
import com.google.android.gms.maps.model.ButtCap;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.maps.model.SquareCap;
import java.util.Map;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class MapPolylineManager extends ViewGroupManager<MapPolyline> {
    private final DisplayMetrics metrics;

    public MapPolylineManager(ReactApplicationContext reactApplicationContext) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.metrics = displayMetrics;
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapPolyline createViewInstance(ThemedReactContext themedReactContext) {
        return new MapPolyline(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("onPress", MapBuilder.of("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapPolyline";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^n\f\u007f1\u001cyj;C")
    public void setCoordinate(MapPolyline mapPolyline, ReadableArray readableArray) {
        mapPolyline.setCoordinates(readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\bTn}\u0001;\u0017{")
    public void setGeodesic(MapPolyline mapPolyline, boolean z2) {
        mapPolyline.setGeodesic(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\rXm~_)!\u0001F7D*fqi")
    public void setLineDashPattern(MapPolyline mapPolyline, ReadableArray readableArray) {
        mapPolyline.setLineDashPattern(readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", defaultInt = SupportMenu.CATEGORY_MASK, name = "\u0014cq\t\u0007-p\bbEB")
    public void setStrokeColor(MapPolyline mapPolyline, int i2) {
        mapPolyline.setColor(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
    public void setStrokeWidth(MapPolyline mapPolyline, float f2) {
        mapPolyline.setWidth(this.metrics.density * f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0015Po\n|*\u001a}")
    public void setTappable(MapPolyline mapPolyline, boolean z2) {
        mapPolyline.setTappable(z2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u001b8m}\u0001@")
    public void setZIndex(MapPolyline mapPolyline, float f2) {
        mapPolyline.setZIndex(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\rXm~^)\u001e")
    public void setlineCap(MapPolyline mapPolyline, String str) {
        Cap roundCap;
        str.hashCode();
        switch (str) {
            case "square":
                roundCap = new SquareCap();
                break;
            case "butt":
                roundCap = new ButtCap();
                break;
            case "round":
                roundCap = new RoundCap();
                break;
            default:
                roundCap = new RoundCap();
                break;
        }
        mapPolyline.setLineCap(roundCap);
    }
}
