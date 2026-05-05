package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.braze.models.IBrazeLocation;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class MapGradientPolylineManager extends ViewGroupManager<MapGradientPolyline> {
    private final DisplayMetrics metrics;

    public MapGradientPolylineManager(ReactApplicationContext reactApplicationContext) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.metrics = displayMetrics;
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapGradientPolyline createViewInstance(ThemedReactContext themedReactContext) {
        return new MapGradientPolyline(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapGradientPolyline";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^n\f\u007f1\u001cyj;C")
    public void setCoordinates(MapGradientPolyline mapGradientPolyline, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            arrayList.add(new LatLng(map.getDouble(IBrazeLocation.LATITUDE), map.getDouble(IBrazeLocation.LONGITUDE)));
        }
        mapGradientPolyline.setCoordinates(arrayList);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKUG\\Dh ", name = "\u0014cq\t\u0007-p\bbEB)")
    public void setStrokeColors(MapGradientPolyline mapGradientPolyline, ReadableArray readableArray) {
        if (readableArray == null) {
            mapGradientPolyline.setStrokeColors(new int[]{0, 0});
            return;
        }
        if (readableArray.size() == 0) {
            mapGradientPolyline.setStrokeColors(new int[]{0, 0});
            return;
        }
        if (readableArray.size() == 1) {
            mapGradientPolyline.setStrokeColors(new int[]{readableArray.getInt(0), readableArray.getInt(0)});
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            iArr[i2] = readableArray.getInt(i2);
        }
        mapGradientPolyline.setStrokeColors(iArr);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
    public void setStrokeWidth(MapGradientPolyline mapGradientPolyline, float f2) {
        mapGradientPolyline.setWidth(this.metrics.density * f2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u001b8m}\u0001@")
    public void setZIndex(MapGradientPolyline mapGradientPolyline, float f2) {
        mapGradientPolyline.setZIndex(f2);
    }
}
