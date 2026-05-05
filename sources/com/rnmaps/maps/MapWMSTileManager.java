package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class MapWMSTileManager extends ViewGroupManager<MapWMSTile> {
    public MapWMSTileManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapWMSTile createViewInstance(ThemedReactContext themedReactContext) {
        return new MapWMSTile(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapWMSTile";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 100.0f, name = "\u000ePw\u0003\t=\u001bfWJ9,fY")
    public void setMaximumNativeZ(MapWMSTile mapWMSTile, float f2) {
        mapWMSTile.setMaximumNativeZ(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 100.0f, name = "\u000ePw\u0003\t=\u001br")
    public void setMaximumZ(MapWMSTile mapWMSTile, float f2) {
        mapWMSTile.setMaximumZ(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\u000eXm\u0003\t=\u001br")
    public void setMinimumZ(MapWMSTile mapWMSTile, float f2) {
        mapWMSTile.setMinimumZ(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0010Ue\u0006\u00056\u0013ee:5")
    public void setOfflineMode(MapWMSTile mapWMSTile, boolean z2) {
        mapWMSTile.setOfflineMode(z2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
    public void setOpacity(MapWMSTile mapWMSTile, float f2) {
        mapWMSTile.setOpacity(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\u0015Xk~^)\u0011\u0001[#1.Bf`")
    public void setTileCacheMaxAge(MapWMSTile mapWMSTile, float f2) {
        mapWMSTile.setTileCacheMaxAge(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Xk~^)\u0011\u0001[&1*i")
    public void setTileCachePath(MapWMSTile mapWMSTile, String str) {
        mapWMSTile.setTileCachePath(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 256.0f, name = "\u0015Xk~n1(}")
    public void setTileSize(MapWMSTile mapWMSTile, float f2) {
        mapWMSTile.setTileSize(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0016akm\u00015\u001e\u0005WJ5")
    public void setUrlTemplate(MapWMSTile mapWMSTile, String str) {
        mapWMSTile.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = -1.0f, name = "\u001b8m}\u0001@")
    public void setZIndex(MapWMSTile mapWMSTile, float f2) {
        mapWMSTile.setZIndex(f2);
    }
}
