package com.rnmaps.maps;

import android.view.View;
import com.braze.models.IBrazeLocation;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import fr.antelop.sdk.authentication.CustomerAuthenticationPattern;
import java.util.Map;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class MapManager extends ViewGroupManager<MapView> {
    private static final String REACT_CLASS = "AIRMap";
    private final Map<String, Integer> MAP_TYPES = MapBuilder.of("standard", 1, "satellite", 2, "hybrid", 4, "terrain", 3, "none", 0);
    private final Map<String, Integer> MY_LOCATION_PRIORITY = MapBuilder.of("balanced", 102, "high", 100, CustomerAuthenticationPattern.LOW, 104, "passive", 105);
    private final ReactApplicationContext appContext;
    protected GoogleMapOptions googleMapOptions;
    private MapMarkerManager markerManager;
    protected MapsInitializer.Renderer renderer;

    public MapManager(ReactApplicationContext reactApplicationContext) {
        this.appContext = reactApplicationContext;
    }

    private void emitMapError(ThemedReactContext themedReactContext, String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str);
        writableMapCreateMap.putString("type", str2);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) themedReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onError", writableMapCreateMap);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(MapView mapView, View view, int i2) throws Throwable {
        mapView.addFeature(view, i2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new SizeReportingShadowNode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public MapView createViewInstance(int i2, ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        CameraPosition cameraPositionCameraPositionFromMap;
        this.googleMapOptions = new GoogleMapOptions();
        if (reactStylesDiffMap != null) {
            if (reactStylesDiffMap.getString("googleMapId") != null) {
                this.googleMapOptions.mapId(reactStylesDiffMap.getString("googleMapId"));
            }
            if (reactStylesDiffMap.hasKey("liteMode")) {
                this.googleMapOptions.liteMode(reactStylesDiffMap.getBoolean("liteMode", false));
            }
            if (reactStylesDiffMap.hasKey("initialCamera")) {
                CameraPosition cameraPositionCameraPositionFromMap2 = MapView.cameraPositionFromMap(reactStylesDiffMap.getMap("initialCamera"));
                if (cameraPositionCameraPositionFromMap2 != null) {
                    this.googleMapOptions.camera(cameraPositionCameraPositionFromMap2);
                }
            } else if (reactStylesDiffMap.hasKey("camera") && (cameraPositionCameraPositionFromMap = MapView.cameraPositionFromMap(reactStylesDiffMap.getMap("camera"))) != null) {
                this.googleMapOptions.camera(cameraPositionCameraPositionFromMap);
            }
            if (reactStylesDiffMap.hasKey("googleRenderer") && "LEGACY".equals(reactStylesDiffMap.getString("googleRenderer"))) {
                this.renderer = MapsInitializer.Renderer.LEGACY;
            } else {
                this.renderer = MapsInitializer.Renderer.LATEST;
            }
        }
        return (MapView) super.createViewInstance(i2, themedReactContext, reactStylesDiffMap, stateWrapper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public MapView createViewInstance(ThemedReactContext themedReactContext) {
        return new MapView(themedReactContext, this.appContext, this, this.googleMapOptions);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(MapView mapView, int i2) {
        return mapView.getFeatureAt(i2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(MapView mapView) {
        return mapView.getFeatureCount();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map mapOf = MapBuilder.of("onMapReady", MapBuilder.of("registrationName", "onMapReady"), "onPress", MapBuilder.of("registrationName", "onPress"), "onLongPress", MapBuilder.of("registrationName", "onLongPress"), "onMarkerPress", MapBuilder.of("registrationName", "onMarkerPress"), "onCalloutPress", MapBuilder.of("registrationName", "onCalloutPress"));
        mapOf.putAll(MapBuilder.of("onUserLocationChange", MapBuilder.of("registrationName", "onUserLocationChange"), "onMarkerDragStart", MapBuilder.of("registrationName", "onMarkerDragStart"), "onMarkerDrag", MapBuilder.of("registrationName", "onMarkerDrag"), "onMarkerDragEnd", MapBuilder.of("registrationName", "onMarkerDragEnd"), "onPanDrag", MapBuilder.of("registrationName", "onPanDrag"), "onKmlReady", MapBuilder.of("registrationName", "onKmlReady"), "onPoiClick", MapBuilder.of("registrationName", "onPoiClick")));
        mapOf.putAll(MapBuilder.of("onIndoorLevelActivated", MapBuilder.of("registrationName", "onIndoorLevelActivated"), "onIndoorBuildingFocused", MapBuilder.of("registrationName", "onIndoorBuildingFocused"), "onDoublePress", MapBuilder.of("registrationName", "onDoublePress"), "onMapLoaded", MapBuilder.of("registrationName", "onMapLoaded"), "onMarkerSelect", MapBuilder.of("registrationName", "onMarkerSelect"), "onMarkerDeselect", MapBuilder.of("registrationName", "onMarkerDeselect")));
        return mapOf;
    }

    public MapMarkerManager getMarkerManager() {
        return this.markerManager;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(MapView mapView) {
        mapView.doDestroy();
        super.onDropViewInstance(mapView);
    }

    void pushEvent(ThemedReactContext themedReactContext, View view, String str, WritableMap writableMap) {
        ((RCTEventEmitter) themedReactContext.getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), str, writableMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(MapView mapView, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "fitToSuppliedMarkers":
                if (readableArray != null) {
                    mapView.fitToSuppliedMarkers(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                    break;
                }
                break;
            case "setIndoorActiveLevelIndex":
                if (readableArray != null) {
                    mapView.setIndoorActiveLevelIndex(readableArray.getInt(0));
                    break;
                }
                break;
            case "setCamera":
                if (readableArray != null) {
                    mapView.animateToCamera(readableArray.getMap(0), 0);
                    break;
                }
                break;
            case "setMapBoundaries":
                if (readableArray != null) {
                    mapView.setMapBoundaries(readableArray.getMap(0), readableArray.getMap(1));
                    break;
                }
                break;
            case "fitToElements":
                if (readableArray != null) {
                    mapView.fitToElements(readableArray.getMap(0), readableArray.getBoolean(1));
                    break;
                }
                break;
            case "animateCamera":
                if (readableArray != null) {
                    mapView.animateToCamera(readableArray.getMap(0), readableArray.getInt(1));
                    break;
                }
                break;
            case "animateToRegion":
                if (readableArray != null) {
                    ReadableMap map = readableArray.getMap(0);
                    int i2 = readableArray.getInt(1);
                    double d2 = map.getDouble(IBrazeLocation.LONGITUDE);
                    double d3 = map.getDouble(IBrazeLocation.LATITUDE);
                    double d4 = map.getDouble("longitudeDelta");
                    double d5 = map.getDouble("latitudeDelta") / 2.0d;
                    double d6 = d4 / 2.0d;
                    mapView.animateToRegion(new LatLngBounds(new LatLng(d3 - d5, d2 - d6), new LatLng(d3 + d5, d2 + d6)), i2);
                    break;
                }
                break;
            case "fitToCoordinates":
                if (readableArray != null) {
                    mapView.fitToCoordinates(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                    break;
                }
                break;
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(MapView mapView, int i2) {
        mapView.removeFeatureAt(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0004Pb\u0002\u0001\r\u001cyXB5\u001a")
    public void setCacheEnabled(MapView mapView, boolean z2) {
        mapView.setCacheEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004Pl~\u000e)")
    public void setCamera(MapView mapView, ReadableMap readableMap) {
        mapView.setCamera(readableMap);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\b^n\u0001\b-zyf\u001f4")
    public void setGoogleMapId(MapView mapView, String str) {
        if (str != null) {
            this.googleMapOptions.mapId(str);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\b^n\u0001\b-\u007f}d:5(fq")
    public void setGoogleRenderer(MapView mapView, String str) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\tPm}\b-}yd\u001aB\u0017h")
    public void setHandlePanDrag(MapView mapView, boolean z2) {
        mapView.setHandlePanDrag(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]h\u000e\u0005)\u001a[WC5(b")
    public void setInitialCamera(MapView mapView, ReadableMap readableMap) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]h\u000e\u0005)\u001aj[=9%o")
    public void setInitialRegion(MapView mapView, ReadableMap readableMap) {
        mapView.setInitialRegion(readableMap);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\f\\kl\u000e+")
    public void setKmlSrc(MapView mapView, String str) {
        if (str != null) {
            mapView.setKmlSrc(str);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\rXs~h7\u0012}")
    public void setLiteMode(MapView mapView, boolean z2) {
        this.googleMapOptions.liteMode(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\r^`}\u00056\u0015ZW9;\u001dsnpK\u000fg[\u0014V-")
    public void setLoadingBackgroundColor(MapView mapView, Integer num) {
        mapView.setLoadingBackgroundColor(num);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\r^`}\u00056\u0015]d72\"fc")
    public void setLoadingEnabled(MapView mapView, boolean z2) {
        mapView.enableMapLoading(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\r^`}\u00056\u0015ad:9\u0019bsjOm\u0014X\u0017Y")
    public void setLoadingIndicatorColor(MapView mapView, Integer num) {
        mapView.setLoadingIndicatorColor(num);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePoi|,\u0012\u0002d=")
    public void setMapPadding(MapView mapView, ReadableMap readableMap) {
        int i2;
        int i3;
        int i4;
        double d2 = mapView.getResources().getDisplayMetrics().density;
        if (readableMap != null) {
            int i5 = readableMap.hasKey("left") ? (int) (readableMap.getDouble("left") * d2) : 0;
            i3 = readableMap.hasKey("top") ? (int) (readableMap.getDouble("top") * d2) : 0;
            i4 = readableMap.hasKey(ViewProps.RIGHT) ? (int) (readableMap.getDouble(ViewProps.RIGHT) * d2) : 0;
            i2 = readableMap.hasKey(ViewProps.BOTTOM) ? (int) (readableMap.getDouble(ViewProps.BOTTOM) * d2) : 0;
            i = i5;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        mapView.applyBaseMapPadding(i, i3, i4, i2);
        mapView.map.setPadding(i, i3, i4, i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004dr\u000e\u000b5zyf)D/mdNQ\u001d\u000eZ\u000f")
    public void setMapStyle(MapView mapView, String str) {
        mapView.setMapStyle(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePom\u00158\u0013")
    public void setMapType(MapView mapView, String str) {
        mapView.map.setMapType(this.MAP_TYPES.get(str).intValue());
    }

    public void setMarkerManager(MapMarkerManager mapMarkerManager) {
        this.markerManager = mapMarkerManager;
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePws\u000b7\u001bd[L5\"")
    public void setMaxZoomLevel(MapView mapView, float f2) {
        mapView.map.setMaxZoomPreference(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXms\u000b7\u001bd[L5\"")
    public void setMinZoomLevel(MapView mapView, float f2) {
        mapView.map.setMinZoomPreference(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u000e^u~j6zyhA5(Qq`P\u001e")
    public void setMoveOnMarkerPress(MapView mapView, boolean z2) {
        mapView.setMoveOnMarkerPress(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0011Xs|\u0004\r\u001cyXB5\u001a")
    public void setPitchEnabled(MapView mapView, boolean z2) {
        mapView.map.getUiSettings().setTiltGesturesEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tf\u0003\u000b6")
    public void setRegion(MapView mapView, ReadableMap readableMap) {
        mapView.setRegion(readableMap);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0013^sz\u0010-r\u0007W8<\u001be")
    public void setRotateEnabled(MapView mapView, boolean z2) {
        mapView.map.getUiSettings().setRotateGesturesEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u0014Rq\t\b4q\u000eh?>\u001dSno>\u001f\n;\u001aA*\u0018\u0012IR#Y]$\u000b")
    public void setScrollDuringRotateOrZoomEnabled(MapView mapView, boolean z2) {
        mapView.map.getUiSettings().setScrollGesturesEnabledDuringRotateOrZoom(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0014Rq\t\b4r\u0007W8<\u001be")
    public void setScrollEnabled(MapView mapView, boolean z2) {
        mapView.map.getUiSettings().setScrollGesturesEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0014Wn\u0011\u000f\n#\u0002b:9$hr")
    public void setShowBuildings(MapView mapView, boolean z2) {
        mapView.map.setBuildingsEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0014Wn\u0011\u000f\u0011\u001c|eEB)")
    public void setShowIndoors(MapView mapView, boolean z2) {
        mapView.map.setIndoorEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0014Wn\u0011\u000f\u001c y\\<9\u0019")
    public void setShowTraffic(MapView mapView, boolean z2) {
        mapView.map.setTrafficEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0014Wn\u0011\u000f\u000b\u001d\u0006f7C)")
    public void setShowsCompass(MapView mapView, boolean z2) {
        mapView.map.getUiSettings().setCompassEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0014Wn\u0011\u000f\u0011\u001c|eEB\u0002fu`Iz\u000eO\u0013L-")
    public void setShowsIndoorLevelPicker(MapView mapView, boolean z2) {
        mapView.map.getUiSettings().setIndoorLevelPickerEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u0014Wn\u0011\u000f\u0015'de91*jni\u001f \u0019`\u0017U")
    public void setShowsMyLocationButton(MapView mapView, boolean z2) {
        mapView.setShowsMyLocationButton(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0014Wn\u0011\u000f\u001d!}h\"?\u0019bsdL\u0019")
    public void setShowsUserLocation(MapView mapView, boolean z2) {
        mapView.setShowsUserLocation(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u0015^n\u0006}) ]d72\"fc")
    public void setToolbarEnabled(MapView mapView, boolean z2) {
        mapView.setToolbarEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 5000, name = "\u0016bd\fg7\u0011yj??$G`nQ\u0010\u0018`pU/\u000e\u0017zE.")
    public void setUserLocationFastestInterval(MapView mapView, int i2) {
        mapView.setUserLocationFastestInterval(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0016bd\fg7\u0011yj??$QqdL\u001d\u000e`!")
    public void setUserLocationPriority(MapView mapView, String str) {
        mapView.setUserLocationPriority(this.MY_LOCATION_PRIORITY.get(str).intValue());
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 5000, name = "\u0016bd\fg7\u0011yj??$Vo_>\u001f\n5\u0016[ \u001b\u001beP")
    public void setUserLocationUpdateInterval(MapView mapView, int i2) {
        mapView.setUserLocationUpdateInterval(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u001b^n\u0007^7\u001c\rhE<zo`]I\u0010\t")
    public void setZoomControlEnabled(MapView mapView, boolean z2) {
        mapView.map.getUiSettings().setZoomControlsEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u001b^n\u0007`6\u000fzb;4")
    public void setZoomEnabled(MapView mapView, boolean z2) {
        mapView.map.getUiSettings().setZoomGesturesEnabled(z2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(MapView mapView, Object obj) {
        mapView.updateExtraData(obj);
    }
}
