package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class MapUrlTileManager extends ViewGroupManager<MapUrlTile> {
    public MapUrlTileManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapUrlTile createViewInstance(ThemedReactContext themedReactContext) {
        return new MapUrlTile(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapUrlTile";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0005^t{\b-\u0002\u0002b;#\u001f{d")
    public void setDoubleTileSize(MapUrlTile mapUrlTile, boolean z2) {
        mapUrlTile.setDoubleTileSize(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0007[h\nt")
    public void setFlipY(MapUrlTile mapUrlTile, boolean z2) {
        mapUrlTile.setFlipY(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 100.0f, name = "\u000ePw\u0003\t=\u001bfWJ9,fY")
    public void setMaximumNativeZ(MapUrlTile mapUrlTile, float f2) {
        mapUrlTile.setMaximumNativeZ(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 100.0f, name = "\u000ePw\u0003\t=\u001br")
    public void setMaximumZ(MapUrlTile mapUrlTile, float f2) {
        mapUrlTile.setMaximumZ(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\u000eXm\u0003\t=\u001br")
    public void setMinimumZ(MapUrlTile mapUrlTile, float f2) {
        mapUrlTile.setMinimumZ(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0010Ue\u0006\u00056\u0013ee:5")
    public void setOfflineMode(MapUrlTile mapUrlTile, boolean z2) {
        mapUrlTile.setOfflineMode(z2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
    public void setOpacity(MapUrlTile mapUrlTile, float f2) {
        mapUrlTile.setOpacity(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\u0015Xk~^)\u0011\u0001[#1.Bf`")
    public void setTileCacheMaxAge(MapUrlTile mapUrlTile, float f2) {
        mapUrlTile.setTileCacheMaxAge(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Xk~^)\u0011\u0001[&1*i")
    public void setTileCachePath(MapUrlTile mapUrlTile, String str) {
        mapUrlTile.setTileCachePath(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 256.0f, name = "\u0015Xk~n1(}")
    public void setTileSize(MapUrlTile mapUrlTile, float f2) {
        mapUrlTile.setTileSize(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0016akm\u00015\u001e\u0005WJ5")
    public void setUrlTemplate(MapUrlTile mapUrlTile, String str) {
        mapUrlTile.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = -1.0f, name = "\u001b8m}\u0001@")
    public void setZIndex(MapUrlTile mapUrlTile, float f2) {
        mapUrlTile.setZIndex(f2);
    }
}
