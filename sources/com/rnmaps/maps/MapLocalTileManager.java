package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class MapLocalTileManager extends ViewGroupManager<MapLocalTile> {
    public MapLocalTileManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapLocalTile createViewInstance(ThemedReactContext themedReactContext) {
        return new MapLocalTile(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapLocalTile";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011Ps\u0002o-\u001b\tb7D\u001b")
    public void setPathTemplate(MapLocalTile mapLocalTile, String str) {
        mapLocalTile.setPathTemplate(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 256.0f, name = "\u0015Xk~n1(}")
    public void setTileSize(MapLocalTile mapLocalTile, float f2) {
        mapLocalTile.setTileSize(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0016bdZ\u000f;\u0013\ri")
    public void setUseAssets(MapLocalTile mapLocalTile, boolean z2) {
        mapLocalTile.setUseAssets(z2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = -1.0f, name = "\u001b8m}\u0001@")
    public void setZIndex(MapLocalTile mapLocalTile, float f2) {
        mapLocalTile.setZIndex(f2);
    }
}
