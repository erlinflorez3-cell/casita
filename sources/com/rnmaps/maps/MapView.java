package com.rnmaps.maps;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.location.Location;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.content.PermissionChecker;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;
import com.braze.models.IBrazeLocation;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.OnMapsSdkInitializedCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.IndoorLevel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.maps.android.collections.CircleManager;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Renderer;
import com.google.maps.android.data.kml.KmlContainer;
import com.google.maps.android.data.kml.KmlLayer;
import com.google.maps.android.data.kml.KmlPlacemark;
import com.npmdavi.davinotification.Constant;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class MapView extends com.google.android.gms.maps.MapView implements GoogleMap.InfoWindowAdapter, GoogleMap.OnMarkerDragListener, OnMapReadyCallback, GoogleMap.OnPoiClickListener, GoogleMap.OnIndoorStateChangeListener {
    private static final String[] PERMISSIONS = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    private final ViewAttacherGroup attacherGroup;
    int baseBottomMapPadding;
    int baseLeftMapPadding;
    private final int baseMapPadding;
    int baseRightMapPadding;
    int baseTopMapPadding;
    private LatLngBounds boundsToMove;
    private boolean cacheEnabled;
    private ImageView cacheImageView;
    private ReadableMap camera;
    private LatLngBounds cameraLastIdleBounds;
    private int cameraMoveReason;
    private CameraUpdate cameraToSet;
    private CircleManager.Collection circleCollection;
    private final ThemedReactContext context;
    private String customMapStyleString;
    private boolean destroyed;
    private final EventDispatcher eventDispatcher;
    private final List<MapFeature> features;
    private final FusedLocationSource fusedLocationSource;
    private final GestureDetectorCompat gestureDetector;
    private final Map<TileOverlay, MapGradientPolyline> gradientPolylineMap;
    private GroundOverlayManager.Collection groundOverlayCollection;
    private GroundOverlayManager groundOverlayManager;
    private boolean handlePanDrag;
    private final Map<TileOverlay, MapHeatmap> heatmapMap;
    private ReadableMap initialRegion;
    private boolean initialRegionSet;
    private Boolean isMapLoaded;
    private LifecycleEventListener lifecycleListener;
    private Integer loadingBackgroundColor;
    private Integer loadingIndicatorColor;
    private final MapManager manager;
    public GoogleMap map;
    private RelativeLayout mapLoadingLayout;
    private ProgressBar mapLoadingProgressBar;
    private MarkerManager.Collection markerCollection;
    private MarkerManager markerManager;
    private final Map<Marker, MapMarker> markerMap;
    private final Runnable measureAndLayout;
    private boolean moveOnMarkerPress;
    private final Map<GroundOverlay, MapOverlay> overlayMap;
    private boolean paused;
    private PolygonManager.Collection polygonCollection;
    private PolygonManager polygonManager;
    private final Map<Polygon, MapPolygon> polygonMap;
    private PolylineManager.Collection polylineCollection;
    private PolylineManager polylineManager;
    private final Map<Polyline, MapPolyline> polylineMap;
    private ReadableMap region;
    private MapMarker selectedMarker;
    private boolean showUserLocation;
    private LatLng tapLocation;

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$1 */
    class AnonymousClass1 extends GestureDetector.SimpleOnGestureListener {
        AnonymousClass1() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            MapView.this.onDoublePress(motionEvent);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!MapView.this.handlePanDrag) {
                return false;
            }
            MapView.this.onPanDrag(motionEvent2);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$10 */
    class AnonymousClass10 implements GoogleMap.OnGroundOverlayClickListener {
        AnonymousClass10() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
        public void onGroundOverlayClick(GroundOverlay groundOverlay) {
            WritableMap writableMapMakeClickEventData = MapView.this.makeClickEventData(groundOverlay.getPosition());
            writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "overlay-press");
            MapView.this.manager.pushEvent(MapView.this.context, (View) MapView.this.overlayMap.get(groundOverlay), "onPress", writableMapMakeClickEventData);
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$11 */
    class AnonymousClass11 implements GoogleMap.OnCameraMoveStartedListener {
        AnonymousClass11() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
        public void onCameraMoveStarted(int i2) {
            MapView.this.cameraMoveReason = i2;
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$12 */
    class AnonymousClass12 implements GoogleMap.OnCameraMoveListener {
        final /* synthetic */ GoogleMap val$map;

        AnonymousClass12(GoogleMap googleMap) {
            googleMap = googleMap;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
        public void onCameraMove() {
            LatLngBounds latLngBounds = googleMap.getProjection().getVisibleRegion().latLngBounds;
            MapView.this.cameraLastIdleBounds = null;
            MapView.this.eventDispatcher.dispatchEvent(new RegionChangeEvent(MapView.this.getId(), latLngBounds, true, 1 == MapView.this.cameraMoveReason));
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$13 */
    class AnonymousClass13 implements GoogleMap.OnCameraIdleListener {
        final /* synthetic */ GoogleMap val$map;

        AnonymousClass13(GoogleMap googleMap) {
            googleMap = googleMap;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
        public void onCameraIdle() {
            LatLngBounds latLngBounds = googleMap.getProjection().getVisibleRegion().latLngBounds;
            if (MapView.this.cameraMoveReason != 0) {
                if (MapView.this.cameraLastIdleBounds == null || LatLngBoundsUtils.BoundsAreDifferent(latLngBounds, MapView.this.cameraLastIdleBounds)) {
                    MapView.this.cameraLastIdleBounds = latLngBounds;
                    MapView.this.eventDispatcher.dispatchEvent(new RegionChangeEvent(MapView.this.getId(), latLngBounds, false, 1 == MapView.this.cameraMoveReason));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$14 */
    class AnonymousClass14 implements GoogleMap.OnMapLoadedCallback {
        final /* synthetic */ MapView val$view;

        AnonymousClass14(MapView mapView) {
            mapView = mapView;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
        public void onMapLoaded() {
            MapView.this.isMapLoaded = true;
            MapView.this.manager.pushEvent(MapView.this.context, mapView, "onMapLoaded", new WritableNativeMap());
            MapView.this.cacheView();
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$15 */
    class AnonymousClass15 implements LifecycleEventListener {
        final /* synthetic */ GoogleMap val$map;

        AnonymousClass15(GoogleMap googleMap) {
            googleMap = googleMap;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            MapView.this.doDestroy();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
            GoogleMap googleMap;
            if (MapView.this.hasPermissions() && (googleMap = googleMap) != null) {
                googleMap.setMyLocationEnabled(false);
            }
            synchronized (MapView.this) {
                if (!MapView.this.destroyed) {
                    MapView.this.onPause();
                }
                MapView.this.paused = true;
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            GoogleMap googleMap;
            if (MapView.this.hasPermissions() && (googleMap = googleMap) != null) {
                googleMap.setMyLocationEnabled(MapView.this.showUserLocation);
                googleMap.setLocationSource(MapView.this.fusedLocationSource);
            }
            synchronized (MapView.this) {
                if (!MapView.this.destroyed) {
                    MapView.this.onResume();
                }
                MapView.this.paused = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$16 */
    class AnonymousClass16 implements GoogleMap.SnapshotReadyCallback {
        final /* synthetic */ ImageView val$cacheImageView;
        final /* synthetic */ RelativeLayout val$mapLoadingLayout;

        AnonymousClass16(ImageView imageView, RelativeLayout relativeLayout) {
            imageView = imageView;
            relativeLayout = relativeLayout;
        }

        @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
        public void onSnapshotReady(Bitmap bitmap) {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
            relativeLayout.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$17 */
    class AnonymousClass17 implements Runnable {
        AnonymousClass17() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MapView mapView = MapView.this;
            mapView.measure(View.MeasureSpec.makeMeasureSpec(mapView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(MapView.this.getHeight(), 1073741824));
            MapView mapView2 = MapView.this;
            mapView2.layout(mapView2.getLeft(), MapView.this.getTop(), MapView.this.getRight(), MapView.this.getBottom());
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$2 */
    class AnonymousClass2 implements View.OnLayoutChangeListener {
        AnonymousClass2() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (MapView.this.paused) {
                return;
            }
            MapView.this.cacheView();
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$3 */
    class AnonymousClass3 implements GoogleMap.OnMyLocationChangeListener {
        final /* synthetic */ MapView val$view;

        AnonymousClass3(MapView mapView) {
            mapView = mapView;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener
        public void onMyLocationChange(Location location) {
            WritableMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putDouble(IBrazeLocation.LATITUDE, location.getLatitude());
            writableNativeMap2.putDouble(IBrazeLocation.LONGITUDE, location.getLongitude());
            writableNativeMap2.putDouble(IBrazeLocation.ALTITUDE, location.getAltitude());
            writableNativeMap2.putDouble("timestamp", location.getTime());
            writableNativeMap2.putDouble("accuracy", location.getAccuracy());
            writableNativeMap2.putDouble("speed", location.getSpeed());
            writableNativeMap2.putDouble("heading", location.getBearing());
            writableNativeMap2.putBoolean("isFromMockProvider", location.isFromMockProvider());
            writableNativeMap.putMap("coordinate", writableNativeMap2);
            MapView.this.manager.pushEvent(MapView.this.context, mapView, "onUserLocationChange", writableNativeMap);
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$4 */
    class AnonymousClass4 implements GoogleMap.OnMarkerClickListener {
        final /* synthetic */ MapView val$view;

        AnonymousClass4(MapView mapView) {
            mapView = mapView;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
        public boolean onMarkerClick(Marker marker) {
            MapMarker markerMap = MapView.this.getMarkerMap(marker);
            WritableMap writableMapMakeClickEventData = MapView.this.makeClickEventData(marker.getPosition());
            writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "marker-press");
            writableMapMakeClickEventData.putString("id", markerMap.getIdentifier());
            MapView.this.manager.pushEvent(MapView.this.context, mapView, "onMarkerPress", writableMapMakeClickEventData);
            WritableMap writableMapMakeClickEventData2 = MapView.this.makeClickEventData(marker.getPosition());
            writableMapMakeClickEventData2.putString(Constant.NOTIFICATION_DETAILS_ACTION, "marker-press");
            writableMapMakeClickEventData2.putString("id", markerMap.getIdentifier());
            MapView.this.manager.pushEvent(MapView.this.context, markerMap, "onPress", writableMapMakeClickEventData2);
            MapView.this.handleMarkerSelection(markerMap);
            if (mapView.moveOnMarkerPress) {
                return false;
            }
            marker.showInfoWindow();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$5 */
    class AnonymousClass5 implements GoogleMap.OnPolygonClickListener {
        AnonymousClass5() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
        public void onPolygonClick(Polygon polygon) {
            MapView mapView = MapView.this;
            WritableMap writableMapMakeClickEventData = mapView.makeClickEventData(mapView.tapLocation);
            writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "polygon-press");
            MapView.this.manager.pushEvent(MapView.this.context, (View) MapView.this.polygonMap.get(polygon), "onPress", writableMapMakeClickEventData);
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$6 */
    class AnonymousClass6 implements GoogleMap.OnPolylineClickListener {
        AnonymousClass6() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
        public void onPolylineClick(Polyline polyline) {
            MapView mapView = MapView.this;
            WritableMap writableMapMakeClickEventData = mapView.makeClickEventData(mapView.tapLocation);
            writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "polyline-press");
            MapView.this.manager.pushEvent(MapView.this.context, (View) MapView.this.polylineMap.get(polyline), "onPress", writableMapMakeClickEventData);
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$7 */
    class AnonymousClass7 implements GoogleMap.OnInfoWindowClickListener {
        final /* synthetic */ MapView val$view;

        AnonymousClass7(MapView mapView) {
            mapView = mapView;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
        public void onInfoWindowClick(Marker marker) {
            WritableMap writableMapMakeClickEventData = MapView.this.makeClickEventData(marker.getPosition());
            writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "callout-press");
            MapView.this.manager.pushEvent(MapView.this.context, mapView, "onCalloutPress", writableMapMakeClickEventData);
            WritableMap writableMapMakeClickEventData2 = MapView.this.makeClickEventData(marker.getPosition());
            writableMapMakeClickEventData2.putString(Constant.NOTIFICATION_DETAILS_ACTION, "callout-press");
            MapMarker markerMap = MapView.this.getMarkerMap(marker);
            MapView.this.manager.pushEvent(MapView.this.context, markerMap, "onCalloutPress", writableMapMakeClickEventData2);
            WritableMap writableMapMakeClickEventData3 = MapView.this.makeClickEventData(marker.getPosition());
            writableMapMakeClickEventData3.putString(Constant.NOTIFICATION_DETAILS_ACTION, "callout-press");
            MapCallout calloutView = markerMap.getCalloutView();
            if (calloutView != null) {
                MapView.this.manager.pushEvent(MapView.this.context, calloutView, "onPress", writableMapMakeClickEventData3);
            }
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$8 */
    class AnonymousClass8 implements GoogleMap.OnMapClickListener {
        final /* synthetic */ MapView val$view;

        AnonymousClass8(MapView mapView) {
            mapView = mapView;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
        public void onMapClick(LatLng latLng) {
            WritableMap writableMapMakeClickEventData = MapView.this.makeClickEventData(latLng);
            writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "press");
            MapView.this.manager.pushEvent(MapView.this.context, mapView, "onPress", writableMapMakeClickEventData);
            MapView.this.handleMarkerSelection(null);
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.MapView$9 */
    class AnonymousClass9 implements GoogleMap.OnMapLongClickListener {
        final /* synthetic */ MapView val$view;

        AnonymousClass9(MapView mapView) {
            mapView = mapView;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
        public void onMapLongClick(LatLng latLng) {
            MapView.this.makeClickEventData(latLng).putString(Constant.NOTIFICATION_DETAILS_ACTION, "long-press");
            MapView.this.manager.pushEvent(MapView.this.context, mapView, "onLongPress", MapView.this.makeClickEventData(latLng));
        }
    }

    public MapView(ThemedReactContext themedReactContext, ReactApplicationContext reactApplicationContext, MapManager mapManager, GoogleMapOptions googleMapOptions) {
        super(getNonBuggyContext(themedReactContext, reactApplicationContext), googleMapOptions);
        this.isMapLoaded = false;
        this.loadingBackgroundColor = null;
        this.loadingIndicatorColor = null;
        this.baseMapPadding = 50;
        this.showUserLocation = false;
        this.handlePanDrag = false;
        this.moveOnMarkerPress = true;
        this.cacheEnabled = false;
        this.initialRegionSet = false;
        this.cameraMoveReason = 0;
        this.features = new ArrayList();
        this.markerMap = new HashMap();
        this.polylineMap = new HashMap();
        this.polygonMap = new HashMap();
        this.overlayMap = new HashMap();
        this.heatmapMap = new HashMap();
        this.gradientPolylineMap = new HashMap();
        this.paused = false;
        this.destroyed = false;
        this.measureAndLayout = new Runnable() { // from class: com.rnmaps.maps.MapView.17
            AnonymousClass17() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MapView mapView = MapView.this;
                mapView.measure(View.MeasureSpec.makeMeasureSpec(mapView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(MapView.this.getHeight(), 1073741824));
                MapView mapView2 = MapView.this;
                mapView2.layout(mapView2.getLeft(), MapView.this.getTop(), MapView.this.getRight(), MapView.this.getBottom());
            }
        };
        this.manager = mapManager;
        this.context = themedReactContext;
        MapsInitializer.initialize(themedReactContext, mapManager.renderer, new OnMapsSdkInitializedCallback() { // from class: com.rnmaps.maps.MapView$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.maps.OnMapsSdkInitializedCallback
            public final void onMapsSdkInitialized(MapsInitializer.Renderer renderer) {
                renderer.toString();
            }
        });
        super.onCreate(null);
        super.onResume();
        super.getMapAsync(this);
        this.fusedLocationSource = new FusedLocationSource(themedReactContext);
        this.gestureDetector = new GestureDetectorCompat(themedReactContext, new GestureDetector.SimpleOnGestureListener() { // from class: com.rnmaps.maps.MapView.1
            AnonymousClass1() {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                MapView.this.onDoublePress(motionEvent);
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                if (!MapView.this.handlePanDrag) {
                    return false;
                }
                MapView.this.onPanDrag(motionEvent2);
                return false;
            }
        });
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.rnmaps.maps.MapView.2
            AnonymousClass2() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (MapView.this.paused) {
                    return;
                }
                MapView.this.cacheView();
            }
        });
        this.eventDispatcher = UIManagerHelper.getUIManager(themedReactContext, 1).getEventDispatcher();
        ViewAttacherGroup viewAttacherGroup = new ViewAttacherGroup(themedReactContext);
        this.attacherGroup = viewAttacherGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.width = 0;
        layoutParams.height = 0;
        layoutParams.leftMargin = 99999999;
        layoutParams.topMargin = 99999999;
        viewAttacherGroup.setLayoutParams(layoutParams);
        addView(viewAttacherGroup);
    }

    private void appendMapPadding(int i2, int i3, int i4, int i5) {
        double d2 = getResources().getDisplayMetrics().density;
        this.map.setPadding(((int) (((double) i2) * d2)) + this.baseLeftMapPadding, ((int) (((double) i3) * d2)) + this.baseTopMapPadding, ((int) (((double) i4) * d2)) + this.baseRightMapPadding, ((int) (((double) i5) * d2)) + this.baseBottomMapPadding);
    }

    private void applyBridgedProps() {
        ReadableMap readableMap = this.initialRegion;
        if (readableMap != null) {
            moveToRegion(readableMap);
            this.initialRegionSet = true;
        } else {
            ReadableMap readableMap2 = this.region;
            if (readableMap2 != null) {
                moveToRegion(readableMap2);
            } else {
                moveToCamera(this.camera);
            }
        }
        if (this.customMapStyleString != null) {
            this.map.setMapStyle(new MapStyleOptions(this.customMapStyleString));
        }
    }

    public void cacheView() {
        if (!this.cacheEnabled) {
            removeCacheImageView();
            if (this.isMapLoaded.booleanValue()) {
                removeMapLoadingLayoutView();
                return;
            }
            return;
        }
        ImageView cacheImageView = getCacheImageView();
        RelativeLayout mapLoadingLayoutView = getMapLoadingLayoutView();
        cacheImageView.setVisibility(4);
        mapLoadingLayoutView.setVisibility(0);
        if (this.isMapLoaded.booleanValue()) {
            this.map.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.rnmaps.maps.MapView.16
                final /* synthetic */ ImageView val$cacheImageView;
                final /* synthetic */ RelativeLayout val$mapLoadingLayout;

                AnonymousClass16(ImageView cacheImageView2, RelativeLayout mapLoadingLayoutView2) {
                    imageView = cacheImageView2;
                    relativeLayout = mapLoadingLayoutView2;
                }

                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public void onSnapshotReady(Bitmap bitmap) {
                    imageView.setImageBitmap(bitmap);
                    imageView.setVisibility(0);
                    relativeLayout.setVisibility(4);
                }
            });
        }
    }

    public static CameraPosition cameraPositionFromMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        CameraPosition.Builder builder = new CameraPosition.Builder();
        ReadableMap map = readableMap.getMap("center");
        if (map != null) {
            builder.target(new LatLng(map.getDouble(IBrazeLocation.LATITUDE), map.getDouble(IBrazeLocation.LONGITUDE)));
        }
        builder.tilt((float) readableMap.getDouble("pitch"));
        builder.bearing((float) readableMap.getDouble("heading"));
        builder.zoom((float) readableMap.getDouble("zoom"));
        return builder.build();
    }

    private static boolean contextHasBug(Context context) throws Throwable {
        if (context != null) {
            short sXd = (short) (C1580rY.Xd() ^ (-28140));
            short sXd2 = (short) (C1580rY.Xd() ^ (-20300));
            int[] iArr = new int["v\tc\u0013!$\u001cr5BfiO\u0002\u0001Km3#\"@HY".length()];
            QB qb = new QB("v\tc\u0013!$\u001cr5BfiO\u0002\u0001Km3#\"@HY");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Xd("#\"2\u0011%4186(+:", (short) (C1499aX.Xd() ^ (-867))), new Class[0]);
            try {
                method.setAccessible(true);
                if (((Resources) method.invoke(context, objArr)) != null) {
                    short sXd3 = (short) (C1580rY.Xd() ^ (-24019));
                    int[] iArr2 = new int["\u0001\r\u0002\u000f\u0013\f\u0006N\u000b\u0016\u0014\u0019\u0011\u0019\u001eVR}{\u0001x\u000b\u0006".length()];
                    QB qb2 = new QB("\u0001\r\u0002\u000f\u0013\f\u0006N\u000b\u0016\u0014\u0019\u0011\u0019\u001eVR}{\u0001x\u000b\u0006");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((sXd3 ^ i3) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd4 = (short) (ZN.Xd() ^ 1681);
                    short sXd5 = (short) (ZN.Xd() ^ 15863);
                    int[] iArr3 = new int["\"\u001f-\n\u001c)$)%\u0015\u0016#".length()];
                    QB qb3 = new QB("\"\u001f-\n\u001c)$)%\u0015\u0016#");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                        i4++;
                    }
                    Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                    try {
                        method2.setAccessible(true);
                        if (((Resources) method2.invoke(context, objArr2)).getConfiguration() != null) {
                            return false;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return true;
    }

    private ImageView getCacheImageView() {
        if (this.cacheImageView == null) {
            ImageView imageView = new ImageView(getContext());
            this.cacheImageView = imageView;
            addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            this.cacheImageView.setVisibility(4);
        }
        return this.cacheImageView;
    }

    private RelativeLayout getMapLoadingLayoutView() {
        if (this.mapLoadingLayout == null) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            this.mapLoadingLayout = relativeLayout;
            relativeLayout.setBackgroundColor(-3355444);
            addView(this.mapLoadingLayout, new ViewGroup.LayoutParams(-1, -1));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.mapLoadingLayout.addView(getMapLoadingProgressBar(), layoutParams);
            this.mapLoadingLayout.setVisibility(4);
        }
        setLoadingBackgroundColor(this.loadingBackgroundColor);
        return this.mapLoadingLayout;
    }

    private ProgressBar getMapLoadingProgressBar() {
        if (this.mapLoadingProgressBar == null) {
            ProgressBar progressBar = new ProgressBar(getContext());
            this.mapLoadingProgressBar = progressBar;
            progressBar.setIndeterminate(true);
        }
        Integer num = this.loadingIndicatorColor;
        if (num != null) {
            setLoadingIndicatorColor(num);
        }
        return this.mapLoadingProgressBar;
    }

    public MapMarker getMarkerMap(Marker marker) {
        MapMarker mapMarker = this.markerMap.get(marker);
        if (mapMarker != null) {
            return mapMarker;
        }
        for (Map.Entry<Marker, MapMarker> entry : this.markerMap.entrySet()) {
            if (entry.getKey().getPosition().equals(marker.getPosition()) && entry.getKey().getTitle().equals(marker.getTitle())) {
                return entry.getValue();
            }
        }
        return mapMarker;
    }

    private static Context getNonBuggyContext(ThemedReactContext themedReactContext, ReactApplicationContext reactApplicationContext) {
        return !contextHasBug(reactApplicationContext.getCurrentActivity()) ? reactApplicationContext.getCurrentActivity() : contextHasBug(themedReactContext) ? !contextHasBug(themedReactContext.getCurrentActivity()) ? themedReactContext.getCurrentActivity() : !contextHasBug(themedReactContext.getApplicationContext()) ? themedReactContext.getApplicationContext() : themedReactContext : themedReactContext;
    }

    public synchronized void handleMarkerSelection(MapMarker mapMarker) {
        MapMarker mapMarker2 = this.selectedMarker;
        if (mapMarker2 == mapMarker) {
            return;
        }
        if (mapMarker2 != null) {
            WritableMap writableMapMakeClickEventData = makeClickEventData(mapMarker2.getPosition());
            writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "marker-deselect");
            writableMapMakeClickEventData.putString("id", this.selectedMarker.getIdentifier());
            this.manager.pushEvent(this.context, this.selectedMarker, "onDeselect", writableMapMakeClickEventData);
            WritableMap writableMapMakeClickEventData2 = makeClickEventData(this.selectedMarker.getPosition());
            writableMapMakeClickEventData2.putString(Constant.NOTIFICATION_DETAILS_ACTION, "marker-deselect");
            writableMapMakeClickEventData2.putString("id", this.selectedMarker.getIdentifier());
            this.manager.pushEvent(this.context, this, "onMarkerDeselect", writableMapMakeClickEventData2);
        }
        if (mapMarker != null) {
            WritableMap writableMapMakeClickEventData3 = makeClickEventData(mapMarker.getPosition());
            writableMapMakeClickEventData3.putString(Constant.NOTIFICATION_DETAILS_ACTION, "marker-select");
            writableMapMakeClickEventData3.putString("id", mapMarker.getIdentifier());
            this.manager.pushEvent(this.context, mapMarker, "onSelect", writableMapMakeClickEventData3);
            WritableMap writableMapMakeClickEventData4 = makeClickEventData(mapMarker.getPosition());
            writableMapMakeClickEventData4.putString(Constant.NOTIFICATION_DETAILS_ACTION, "marker-select");
            writableMapMakeClickEventData4.putString("id", mapMarker.getIdentifier());
            this.manager.pushEvent(this.context, this, "onMarkerSelect", writableMapMakeClickEventData4);
        }
        this.selectedMarker = mapMarker;
    }

    public boolean hasPermissions() {
        Context context = getContext();
        String[] strArr = PERMISSIONS;
        return PermissionChecker.checkSelfPermission(context, strArr[0]) == 0 || PermissionChecker.checkSelfPermission(getContext(), strArr[1]) == 0;
    }

    private void moveToRegion(ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        double d2 = readableMap.getDouble(IBrazeLocation.LONGITUDE);
        double d3 = readableMap.getDouble(IBrazeLocation.LATITUDE);
        double d4 = readableMap.getDouble("longitudeDelta");
        double d5 = readableMap.getDouble("latitudeDelta") / 2.0d;
        double d6 = d4 / 2.0d;
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(d3 - d5, d2 - d6), new LatLng(d5 + d3, d6 + d2));
        if (super.getHeight() <= 0 || super.getWidth() <= 0) {
            this.map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d3, d2), 10.0f));
            this.boundsToMove = latLngBounds;
        } else {
            this.map.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0));
            this.boundsToMove = null;
        }
    }

    private void removeCacheImageView() {
        ImageView imageView = this.cacheImageView;
        if (imageView != null) {
            ((ViewGroup) imageView.getParent()).removeView(this.cacheImageView);
            this.cacheImageView = null;
        }
    }

    private void removeMapLoadingLayoutView() {
        removeMapLoadingProgressBar();
        RelativeLayout relativeLayout = this.mapLoadingLayout;
        if (relativeLayout != null) {
            ((ViewGroup) relativeLayout.getParent()).removeView(this.mapLoadingLayout);
            this.mapLoadingLayout = null;
        }
    }

    private void removeMapLoadingProgressBar() {
        ProgressBar progressBar = this.mapLoadingProgressBar;
        if (progressBar != null) {
            ((ViewGroup) progressBar.getParent()).removeView(this.mapLoadingProgressBar);
            this.mapLoadingProgressBar = null;
        }
    }

    public void addFeature(View view, int i2) throws Throwable {
        if (view instanceof MapMarker) {
            MapMarker mapMarker = (MapMarker) view;
            mapMarker.addToMap(this.markerCollection);
            this.features.add(i2, mapMarker);
            int visibility = mapMarker.getVisibility();
            mapMarker.setVisibility(4);
            ViewGroup viewGroup = (ViewGroup) mapMarker.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(mapMarker);
            }
            this.attacherGroup.addView(mapMarker);
            mapMarker.setVisibility(visibility);
            this.markerMap.put((Marker) mapMarker.getFeature(), mapMarker);
            return;
        }
        if (view instanceof MapPolyline) {
            MapPolyline mapPolyline = (MapPolyline) view;
            mapPolyline.addToMap(this.polylineCollection);
            this.features.add(i2, mapPolyline);
            this.polylineMap.put((Polyline) mapPolyline.getFeature(), mapPolyline);
            return;
        }
        if (view instanceof MapGradientPolyline) {
            MapGradientPolyline mapGradientPolyline = (MapGradientPolyline) view;
            mapGradientPolyline.addToMap(this.map);
            this.features.add(i2, mapGradientPolyline);
            this.gradientPolylineMap.put((TileOverlay) mapGradientPolyline.getFeature(), mapGradientPolyline);
            return;
        }
        if (view instanceof MapPolygon) {
            MapPolygon mapPolygon = (MapPolygon) view;
            mapPolygon.addToMap(this.polygonCollection);
            this.features.add(i2, mapPolygon);
            this.polygonMap.put((Polygon) mapPolygon.getFeature(), mapPolygon);
            return;
        }
        if (view instanceof MapCircle) {
            MapCircle mapCircle = (MapCircle) view;
            mapCircle.addToMap(this.circleCollection);
            this.features.add(i2, mapCircle);
            return;
        }
        if (view instanceof MapUrlTile) {
            MapUrlTile mapUrlTile = (MapUrlTile) view;
            mapUrlTile.addToMap(this.map);
            this.features.add(i2, mapUrlTile);
            return;
        }
        if (view instanceof MapWMSTile) {
            MapWMSTile mapWMSTile = (MapWMSTile) view;
            mapWMSTile.addToMap(this.map);
            this.features.add(i2, mapWMSTile);
            return;
        }
        if (view instanceof MapLocalTile) {
            MapLocalTile mapLocalTile = (MapLocalTile) view;
            mapLocalTile.addToMap(this.map);
            this.features.add(i2, mapLocalTile);
            return;
        }
        if (view instanceof MapOverlay) {
            MapOverlay mapOverlay = (MapOverlay) view;
            mapOverlay.addToMap(this.groundOverlayCollection);
            this.features.add(i2, mapOverlay);
            this.overlayMap.put((GroundOverlay) mapOverlay.getFeature(), mapOverlay);
            return;
        }
        if (view instanceof MapHeatmap) {
            MapHeatmap mapHeatmap = (MapHeatmap) view;
            mapHeatmap.addToMap(this.map);
            this.features.add(i2, mapHeatmap);
            this.heatmapMap.put((TileOverlay) mapHeatmap.getFeature(), mapHeatmap);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            addView(view, i2);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        for (int i3 = 0; i3 < viewGroup2.getChildCount(); i3++) {
            addFeature(viewGroup2.getChildAt(i3), i2);
        }
    }

    public void animateToCamera(ReadableMap readableMap, int i2) {
        if (this.map == null) {
            return;
        }
        CameraPosition.Builder builder = new CameraPosition.Builder(this.map.getCameraPosition());
        if (readableMap.hasKey("zoom")) {
            builder.zoom((float) readableMap.getDouble("zoom"));
        }
        if (readableMap.hasKey("heading")) {
            builder.bearing((float) readableMap.getDouble("heading"));
        }
        if (readableMap.hasKey("pitch")) {
            builder.tilt((float) readableMap.getDouble("pitch"));
        }
        if (readableMap.hasKey("center")) {
            ReadableMap map = readableMap.getMap("center");
            builder.target(new LatLng(map.getDouble(IBrazeLocation.LATITUDE), map.getDouble(IBrazeLocation.LONGITUDE)));
        }
        CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(builder.build());
        if (i2 <= 0) {
            this.map.moveCamera(cameraUpdateNewCameraPosition);
        } else {
            this.map.animateCamera(cameraUpdateNewCameraPosition, i2, null);
        }
    }

    public void animateToRegion(LatLngBounds latLngBounds, int i2) {
        GoogleMap googleMap = this.map;
        if (googleMap == null) {
            return;
        }
        if (i2 <= 0) {
            googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0));
        } else {
            googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0), i2, null);
        }
    }

    public void applyBaseMapPadding(int i2, int i3, int i4, int i5) {
        this.map.setPadding(i2, i3, i4, i5);
        this.baseLeftMapPadding = i2;
        this.baseRightMapPadding = i4;
        this.baseTopMapPadding = i3;
        this.baseBottomMapPadding = i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.gestureDetector.onTouchEvent(motionEvent);
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        GoogleMap googleMap = this.map;
        if (googleMap != null) {
            this.tapLocation = googleMap.getProjection().fromScreenLocation(new Point(x2, y2));
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean z2 = false;
        if (actionMasked == 0) {
            ViewParent parent = getParent();
            GoogleMap googleMap2 = this.map;
            if (googleMap2 != null && googleMap2.getUiSettings().isScrollGesturesEnabled()) {
                z2 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z2);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public synchronized void doDestroy() {
        ThemedReactContext themedReactContext;
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        LifecycleEventListener lifecycleEventListener = this.lifecycleListener;
        if (lifecycleEventListener != null && (themedReactContext = this.context) != null) {
            themedReactContext.removeLifecycleEventListener(lifecycleEventListener);
            this.lifecycleListener = null;
        }
        if (!this.paused) {
            onPause();
            this.paused = true;
        }
        onDestroy();
    }

    public void enableMapLoading(boolean z2) {
        if (!z2 || this.isMapLoaded.booleanValue()) {
            return;
        }
        getMapLoadingLayoutView().setVisibility(0);
    }

    public void fitToCoordinates(ReadableArray readableArray, ReadableMap readableMap, boolean z2) {
        if (this.map == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            builder.include(new LatLng(map.getDouble(IBrazeLocation.LATITUDE), map.getDouble(IBrazeLocation.LONGITUDE)));
        }
        CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 50);
        if (readableMap != null) {
            appendMapPadding(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt(ViewProps.RIGHT), readableMap.getInt(ViewProps.BOTTOM));
        }
        if (z2) {
            this.map.animateCamera(cameraUpdateNewLatLngBounds);
        } else {
            this.map.moveCamera(cameraUpdateNewLatLngBounds);
        }
        this.map.setPadding(this.baseLeftMapPadding, this.baseTopMapPadding, this.baseRightMapPadding, this.baseBottomMapPadding);
    }

    public void fitToElements(ReadableMap readableMap, boolean z2) {
        if (this.map == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        boolean z3 = false;
        for (MapFeature mapFeature : this.features) {
            if (mapFeature instanceof MapMarker) {
                builder.include(((Marker) mapFeature.getFeature()).getPosition());
                z3 = true;
            }
        }
        if (z3) {
            CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 50);
            if (readableMap != null) {
                this.map.setPadding(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt(ViewProps.RIGHT), readableMap.getInt(ViewProps.BOTTOM));
            }
            if (z2) {
                this.map.animateCamera(cameraUpdateNewLatLngBounds);
            } else {
                this.map.moveCamera(cameraUpdateNewLatLngBounds);
            }
        }
    }

    public void fitToSuppliedMarkers(ReadableArray readableArray, ReadableMap readableMap, boolean z2) {
        if (this.map == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        String[] strArr = new String[readableArray.size()];
        boolean z3 = false;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            strArr[i2] = readableArray.getString(i2);
        }
        List listAsList = Arrays.asList(strArr);
        for (MapFeature mapFeature : this.features) {
            if (mapFeature instanceof MapMarker) {
                String identifier = ((MapMarker) mapFeature).getIdentifier();
                Marker marker = (Marker) mapFeature.getFeature();
                if (listAsList.contains(identifier)) {
                    builder.include(marker.getPosition());
                    z3 = true;
                }
            }
        }
        if (z3) {
            CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 50);
            if (readableMap != null) {
                this.map.setPadding(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt(ViewProps.RIGHT), readableMap.getInt(ViewProps.BOTTOM));
            }
            if (z2) {
                this.map.animateCamera(cameraUpdateNewLatLngBounds);
            } else {
                this.map.moveCamera(cameraUpdateNewLatLngBounds);
            }
        }
    }

    public View getFeatureAt(int i2) {
        return this.features.get(i2);
    }

    public int getFeatureCount() {
        return this.features.size();
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(Marker marker) {
        return getMarkerMap(marker).getInfoContents();
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(Marker marker) {
        return getMarkerMap(marker).getCallout();
    }

    public double[][] getMapBoundaries() {
        LatLngBounds latLngBounds = this.map.getProjection().getVisibleRegion().latLngBounds;
        LatLng latLng = latLngBounds.northeast;
        LatLng latLng2 = latLngBounds.southwest;
        return new double[][]{new double[]{latLng.longitude, latLng.latitude}, new double[]{latLng2.longitude, latLng2.latitude}};
    }

    public WritableMap makeClickEventData(LatLng latLng) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble(IBrazeLocation.LATITUDE, latLng.latitude);
        writableNativeMap2.putDouble(IBrazeLocation.LONGITUDE, latLng.longitude);
        writableNativeMap.putMap("coordinate", writableNativeMap2);
        Point screenLocation = this.map.getProjection().toScreenLocation(latLng);
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        writableNativeMap3.putDouble("x", screenLocation.x);
        writableNativeMap3.putDouble("y", screenLocation.y);
        writableNativeMap.putMap(ViewProps.POSITION, writableNativeMap3);
        return writableNativeMap;
    }

    public void moveToCamera(ReadableMap readableMap) {
        CameraPosition cameraPositionCameraPositionFromMap = cameraPositionFromMap(readableMap);
        if (cameraPositionCameraPositionFromMap == null) {
            return;
        }
        CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(cameraPositionCameraPositionFromMap);
        if (super.getHeight() <= 0 || super.getWidth() <= 0) {
            this.cameraToSet = cameraUpdateNewCameraPosition;
        } else {
            this.map.moveCamera(cameraUpdateNewCameraPosition);
            this.cameraToSet = null;
        }
    }

    public void onDoublePress(MotionEvent motionEvent) {
        if (this.map == null) {
            return;
        }
        this.manager.pushEvent(this.context, this, "onDoublePress", makeClickEventData(this.map.getProjection().fromScreenLocation(new Point((int) motionEvent.getX(), (int) motionEvent.getY()))));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
    public void onIndoorBuildingFocused() {
        IndoorBuilding focusedBuilding = this.map.getFocusedBuilding();
        int i2 = 0;
        if (focusedBuilding == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putArray("levels", writableArrayCreateArray);
            writableMapCreateMap2.putInt("activeLevelIndex", 0);
            writableMapCreateMap2.putBoolean("underground", false);
            writableMapCreateMap.putMap("IndoorBuilding", writableMapCreateMap2);
            this.manager.pushEvent(this.context, this, "onIndoorBuildingFocused", writableMapCreateMap);
            return;
        }
        List<IndoorLevel> levels = focusedBuilding.getLevels();
        WritableArray writableArrayCreateArray2 = Arguments.createArray();
        for (IndoorLevel indoorLevel : levels) {
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            writableMapCreateMap3.putInt(FirebaseAnalytics.Param.INDEX, i2);
            writableMapCreateMap3.putString("name", indoorLevel.getName());
            writableMapCreateMap3.putString("shortName", indoorLevel.getShortName());
            writableArrayCreateArray2.pushMap(writableMapCreateMap3);
            i2++;
        }
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putArray("levels", writableArrayCreateArray2);
        writableMapCreateMap5.putInt("activeLevelIndex", focusedBuilding.getActiveLevelIndex());
        writableMapCreateMap5.putBoolean("underground", focusedBuilding.isUnderground());
        writableMapCreateMap4.putMap("IndoorBuilding", writableMapCreateMap5);
        this.manager.pushEvent(this.context, this, "onIndoorBuildingFocused", writableMapCreateMap4);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
    public void onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        int activeLevelIndex;
        if (indoorBuilding != null && (activeLevelIndex = indoorBuilding.getActiveLevelIndex()) >= 0 && activeLevelIndex < indoorBuilding.getLevels().size()) {
            IndoorLevel indoorLevel = indoorBuilding.getLevels().get(activeLevelIndex);
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt("activeLevelIndex", activeLevelIndex);
            writableMapCreateMap2.putString("name", indoorLevel.getName());
            writableMapCreateMap2.putString("shortName", indoorLevel.getShortName());
            writableMapCreateMap.putMap("IndoorLevel", writableMapCreateMap2);
            this.manager.pushEvent(this.context, this, "onIndoorLevelActivated", writableMapCreateMap);
        }
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        if (this.destroyed) {
            return;
        }
        this.map = googleMap;
        MarkerManager markerManager = new MarkerManager(googleMap);
        this.markerManager = markerManager;
        this.markerCollection = markerManager.newCollection();
        PolylineManager polylineManager = new PolylineManager(googleMap);
        this.polylineManager = polylineManager;
        this.polylineCollection = polylineManager.newCollection();
        PolygonManager polygonManager = new PolygonManager(googleMap);
        this.polygonManager = polygonManager;
        this.polygonCollection = polygonManager.newCollection();
        this.circleCollection = new CircleManager(googleMap).newCollection();
        GroundOverlayManager groundOverlayManager = new GroundOverlayManager(googleMap);
        this.groundOverlayManager = groundOverlayManager;
        this.groundOverlayCollection = groundOverlayManager.newCollection();
        this.markerCollection.setInfoWindowAdapter(this);
        this.markerCollection.setOnMarkerDragListener(this);
        this.map.setOnPoiClickListener(this);
        this.map.setOnIndoorStateChangeListener(this);
        applyBridgedProps();
        this.manager.pushEvent(this.context, this, "onMapReady", new WritableNativeMap());
        googleMap.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() { // from class: com.rnmaps.maps.MapView.3
            final /* synthetic */ MapView val$view;

            AnonymousClass3(MapView this) {
                mapView = this;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener
            public void onMyLocationChange(Location location) {
                WritableMap writableNativeMap = new WritableNativeMap();
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putDouble(IBrazeLocation.LATITUDE, location.getLatitude());
                writableNativeMap2.putDouble(IBrazeLocation.LONGITUDE, location.getLongitude());
                writableNativeMap2.putDouble(IBrazeLocation.ALTITUDE, location.getAltitude());
                writableNativeMap2.putDouble("timestamp", location.getTime());
                writableNativeMap2.putDouble("accuracy", location.getAccuracy());
                writableNativeMap2.putDouble("speed", location.getSpeed());
                writableNativeMap2.putDouble("heading", location.getBearing());
                writableNativeMap2.putBoolean("isFromMockProvider", location.isFromMockProvider());
                writableNativeMap.putMap("coordinate", writableNativeMap2);
                MapView.this.manager.pushEvent(MapView.this.context, mapView, "onUserLocationChange", writableNativeMap);
            }
        });
        this.markerCollection.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.rnmaps.maps.MapView.4
            final /* synthetic */ MapView val$view;

            AnonymousClass4(MapView this) {
                mapView = this;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(Marker marker) {
                MapMarker markerMap = MapView.this.getMarkerMap(marker);
                WritableMap writableMapMakeClickEventData = MapView.this.makeClickEventData(marker.getPosition());
                writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "marker-press");
                writableMapMakeClickEventData.putString("id", markerMap.getIdentifier());
                MapView.this.manager.pushEvent(MapView.this.context, mapView, "onMarkerPress", writableMapMakeClickEventData);
                WritableMap writableMapMakeClickEventData2 = MapView.this.makeClickEventData(marker.getPosition());
                writableMapMakeClickEventData2.putString(Constant.NOTIFICATION_DETAILS_ACTION, "marker-press");
                writableMapMakeClickEventData2.putString("id", markerMap.getIdentifier());
                MapView.this.manager.pushEvent(MapView.this.context, markerMap, "onPress", writableMapMakeClickEventData2);
                MapView.this.handleMarkerSelection(markerMap);
                if (mapView.moveOnMarkerPress) {
                    return false;
                }
                marker.showInfoWindow();
                return true;
            }
        });
        this.polygonCollection.setOnPolygonClickListener(new GoogleMap.OnPolygonClickListener() { // from class: com.rnmaps.maps.MapView.5
            AnonymousClass5() {
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
            public void onPolygonClick(Polygon polygon) {
                MapView mapView = MapView.this;
                WritableMap writableMapMakeClickEventData = mapView.makeClickEventData(mapView.tapLocation);
                writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "polygon-press");
                MapView.this.manager.pushEvent(MapView.this.context, (View) MapView.this.polygonMap.get(polygon), "onPress", writableMapMakeClickEventData);
            }
        });
        this.polylineCollection.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener() { // from class: com.rnmaps.maps.MapView.6
            AnonymousClass6() {
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
            public void onPolylineClick(Polyline polyline) {
                MapView mapView = MapView.this;
                WritableMap writableMapMakeClickEventData = mapView.makeClickEventData(mapView.tapLocation);
                writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "polyline-press");
                MapView.this.manager.pushEvent(MapView.this.context, (View) MapView.this.polylineMap.get(polyline), "onPress", writableMapMakeClickEventData);
            }
        });
        this.markerCollection.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.rnmaps.maps.MapView.7
            final /* synthetic */ MapView val$view;

            AnonymousClass7(MapView this) {
                mapView = this;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public void onInfoWindowClick(Marker marker) {
                WritableMap writableMapMakeClickEventData = MapView.this.makeClickEventData(marker.getPosition());
                writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "callout-press");
                MapView.this.manager.pushEvent(MapView.this.context, mapView, "onCalloutPress", writableMapMakeClickEventData);
                WritableMap writableMapMakeClickEventData2 = MapView.this.makeClickEventData(marker.getPosition());
                writableMapMakeClickEventData2.putString(Constant.NOTIFICATION_DETAILS_ACTION, "callout-press");
                MapMarker markerMap = MapView.this.getMarkerMap(marker);
                MapView.this.manager.pushEvent(MapView.this.context, markerMap, "onCalloutPress", writableMapMakeClickEventData2);
                WritableMap writableMapMakeClickEventData3 = MapView.this.makeClickEventData(marker.getPosition());
                writableMapMakeClickEventData3.putString(Constant.NOTIFICATION_DETAILS_ACTION, "callout-press");
                MapCallout calloutView = markerMap.getCalloutView();
                if (calloutView != null) {
                    MapView.this.manager.pushEvent(MapView.this.context, calloutView, "onPress", writableMapMakeClickEventData3);
                }
            }
        });
        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() { // from class: com.rnmaps.maps.MapView.8
            final /* synthetic */ MapView val$view;

            AnonymousClass8(MapView this) {
                mapView = this;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
            public void onMapClick(LatLng latLng) {
                WritableMap writableMapMakeClickEventData = MapView.this.makeClickEventData(latLng);
                writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "press");
                MapView.this.manager.pushEvent(MapView.this.context, mapView, "onPress", writableMapMakeClickEventData);
                MapView.this.handleMarkerSelection(null);
            }
        });
        googleMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() { // from class: com.rnmaps.maps.MapView.9
            final /* synthetic */ MapView val$view;

            AnonymousClass9(MapView this) {
                mapView = this;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
            public void onMapLongClick(LatLng latLng) {
                MapView.this.makeClickEventData(latLng).putString(Constant.NOTIFICATION_DETAILS_ACTION, "long-press");
                MapView.this.manager.pushEvent(MapView.this.context, mapView, "onLongPress", MapView.this.makeClickEventData(latLng));
            }
        });
        this.groundOverlayCollection.setOnGroundOverlayClickListener(new GoogleMap.OnGroundOverlayClickListener() { // from class: com.rnmaps.maps.MapView.10
            AnonymousClass10() {
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
            public void onGroundOverlayClick(GroundOverlay groundOverlay) {
                WritableMap writableMapMakeClickEventData = MapView.this.makeClickEventData(groundOverlay.getPosition());
                writableMapMakeClickEventData.putString(Constant.NOTIFICATION_DETAILS_ACTION, "overlay-press");
                MapView.this.manager.pushEvent(MapView.this.context, (View) MapView.this.overlayMap.get(groundOverlay), "onPress", writableMapMakeClickEventData);
            }
        });
        googleMap.setOnCameraMoveStartedListener(new GoogleMap.OnCameraMoveStartedListener() { // from class: com.rnmaps.maps.MapView.11
            AnonymousClass11() {
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
            public void onCameraMoveStarted(int i2) {
                MapView.this.cameraMoveReason = i2;
            }
        });
        googleMap.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() { // from class: com.rnmaps.maps.MapView.12
            final /* synthetic */ GoogleMap val$map;

            AnonymousClass12(GoogleMap googleMap2) {
                googleMap = googleMap2;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
            public void onCameraMove() {
                LatLngBounds latLngBounds = googleMap.getProjection().getVisibleRegion().latLngBounds;
                MapView.this.cameraLastIdleBounds = null;
                MapView.this.eventDispatcher.dispatchEvent(new RegionChangeEvent(MapView.this.getId(), latLngBounds, true, 1 == MapView.this.cameraMoveReason));
            }
        });
        googleMap2.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() { // from class: com.rnmaps.maps.MapView.13
            final /* synthetic */ GoogleMap val$map;

            AnonymousClass13(GoogleMap googleMap2) {
                googleMap = googleMap2;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
            public void onCameraIdle() {
                LatLngBounds latLngBounds = googleMap.getProjection().getVisibleRegion().latLngBounds;
                if (MapView.this.cameraMoveReason != 0) {
                    if (MapView.this.cameraLastIdleBounds == null || LatLngBoundsUtils.BoundsAreDifferent(latLngBounds, MapView.this.cameraLastIdleBounds)) {
                        MapView.this.cameraLastIdleBounds = latLngBounds;
                        MapView.this.eventDispatcher.dispatchEvent(new RegionChangeEvent(MapView.this.getId(), latLngBounds, false, 1 == MapView.this.cameraMoveReason));
                    }
                }
            }
        });
        googleMap2.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() { // from class: com.rnmaps.maps.MapView.14
            final /* synthetic */ MapView val$view;

            AnonymousClass14(MapView this) {
                mapView = this;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
            public void onMapLoaded() {
                MapView.this.isMapLoaded = true;
                MapView.this.manager.pushEvent(MapView.this.context, mapView, "onMapLoaded", new WritableNativeMap());
                MapView.this.cacheView();
            }
        });
        AnonymousClass15 anonymousClass15 = new LifecycleEventListener() { // from class: com.rnmaps.maps.MapView.15
            final /* synthetic */ GoogleMap val$map;

            AnonymousClass15(GoogleMap googleMap2) {
                googleMap = googleMap2;
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
                MapView.this.doDestroy();
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
                GoogleMap googleMap2;
                if (MapView.this.hasPermissions() && (googleMap2 = googleMap) != null) {
                    googleMap2.setMyLocationEnabled(false);
                }
                synchronized (MapView.this) {
                    if (!MapView.this.destroyed) {
                        MapView.this.onPause();
                    }
                    MapView.this.paused = true;
                }
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                GoogleMap googleMap2;
                if (MapView.this.hasPermissions() && (googleMap2 = googleMap) != null) {
                    googleMap2.setMyLocationEnabled(MapView.this.showUserLocation);
                    googleMap.setLocationSource(MapView.this.fusedLocationSource);
                }
                synchronized (MapView.this) {
                    if (!MapView.this.destroyed) {
                        MapView.this.onResume();
                    }
                    MapView.this.paused = false;
                }
            }
        };
        this.lifecycleListener = anonymousClass15;
        this.context.addLifecycleEventListener(anonymousClass15);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDrag(Marker marker) {
        this.manager.pushEvent(this.context, this, "onMarkerDrag", makeClickEventData(marker.getPosition()));
        this.manager.pushEvent(this.context, getMarkerMap(marker), "onDrag", makeClickEventData(marker.getPosition()));
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragEnd(Marker marker) {
        this.manager.pushEvent(this.context, this, "onMarkerDragEnd", makeClickEventData(marker.getPosition()));
        this.manager.pushEvent(this.context, getMarkerMap(marker), "onDragEnd", makeClickEventData(marker.getPosition()));
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragStart(Marker marker) {
        this.manager.pushEvent(this.context, this, "onMarkerDragStart", makeClickEventData(marker.getPosition()));
        this.manager.pushEvent(this.context, getMarkerMap(marker), "onDragStart", makeClickEventData(marker.getPosition()));
    }

    public void onPanDrag(MotionEvent motionEvent) {
        this.manager.pushEvent(this.context, this, "onPanDrag", makeClickEventData(this.map.getProjection().fromScreenLocation(new Point((int) motionEvent.getX(), (int) motionEvent.getY()))));
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPoiClickListener
    public void onPoiClick(PointOfInterest pointOfInterest) {
        WritableMap writableMapMakeClickEventData = makeClickEventData(pointOfInterest.latLng);
        writableMapMakeClickEventData.putString("placeId", pointOfInterest.placeId);
        writableMapMakeClickEventData.putString("name", pointOfInterest.name);
        this.manager.pushEvent(this.context, this, "onPoiClick", writableMapMakeClickEventData);
    }

    public void removeFeatureAt(int i2) {
        MapFeature mapFeatureRemove = this.features.remove(i2);
        if (mapFeatureRemove instanceof MapMarker) {
            this.markerMap.remove(mapFeatureRemove.getFeature());
            mapFeatureRemove.removeFromMap(this.markerCollection);
            this.attacherGroup.removeView(mapFeatureRemove);
            return;
        }
        if (mapFeatureRemove instanceof MapHeatmap) {
            this.heatmapMap.remove(mapFeatureRemove.getFeature());
            mapFeatureRemove.removeFromMap(this.map);
            return;
        }
        if (mapFeatureRemove instanceof MapCircle) {
            mapFeatureRemove.removeFromMap(this.circleCollection);
            return;
        }
        if (mapFeatureRemove instanceof MapOverlay) {
            mapFeatureRemove.removeFromMap(this.groundOverlayCollection);
            return;
        }
        if (mapFeatureRemove instanceof MapPolygon) {
            mapFeatureRemove.removeFromMap(this.polygonCollection);
        } else if (mapFeatureRemove instanceof MapPolyline) {
            mapFeatureRemove.removeFromMap(this.polylineCollection);
        } else {
            mapFeatureRemove.removeFromMap(this.map);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }

    public void setCacheEnabled(boolean z2) {
        this.cacheEnabled = z2;
        cacheView();
    }

    public void setCamera(ReadableMap readableMap) {
        this.camera = readableMap;
        if (readableMap == null || this.map == null) {
            return;
        }
        moveToCamera(readableMap);
    }

    public void setHandlePanDrag(boolean z2) {
        this.handlePanDrag = z2;
    }

    public void setIndoorActiveLevelIndex(int i2) {
        IndoorLevel indoorLevel;
        IndoorBuilding focusedBuilding = this.map.getFocusedBuilding();
        if (focusedBuilding == null || i2 < 0 || i2 >= focusedBuilding.getLevels().size() || (indoorLevel = focusedBuilding.getLevels().get(i2)) == null) {
            return;
        }
        indoorLevel.activate();
    }

    public void setInitialRegion(ReadableMap readableMap) {
        this.initialRegion = readableMap;
        if (this.initialRegionSet || this.map == null) {
            return;
        }
        moveToRegion(readableMap);
        this.initialRegionSet = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setKmlSrc(String str) {
        try {
            int i2 = 0;
            InputStream inputStream = new FileUtil(this.context).execute(str).get();
            if (inputStream == null) {
                return;
            }
            KmlLayer kmlLayer = new KmlLayer(this.map, inputStream, this.context, this.markerManager, this.polygonManager, this.polylineManager, this.groundOverlayManager, (Renderer.ImagesCache) null);
            kmlLayer.addLayerToMap();
            WritableMap writableNativeMap = new WritableNativeMap();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            if (kmlLayer.getContainers() == null) {
                this.manager.pushEvent(this.context, this, "onKmlReady", writableNativeMap);
                return;
            }
            KmlContainer next = kmlLayer.getContainers().iterator().next();
            if (next == null || next.getContainers() == null) {
                this.manager.pushEvent(this.context, this, "onKmlReady", writableNativeMap);
                return;
            }
            if (next.getContainers().iterator().hasNext()) {
                next = next.getContainers().iterator().next();
            }
            for (KmlPlacemark kmlPlacemark : next.getPlacemarks()) {
                MarkerOptions markerOptions = new MarkerOptions();
                if (kmlPlacemark.getInlineStyle() != null) {
                    markerOptions = kmlPlacemark.getMarkerOptions();
                } else {
                    markerOptions.icon(BitmapDescriptorFactory.defaultMarker());
                }
                LatLng latLng = (LatLng) kmlPlacemark.getGeometry().getGeometryObject();
                String property = kmlPlacemark.hasProperty("name") ? kmlPlacemark.getProperty("name") : "";
                String property2 = kmlPlacemark.hasProperty("description") ? kmlPlacemark.getProperty("description") : "";
                markerOptions.position(latLng);
                markerOptions.title(property);
                markerOptions.snippet(property2);
                MapMarker mapMarker = new MapMarker(this.context, markerOptions, this.manager.getMarkerManager());
                if (kmlPlacemark.getInlineStyle() != null && kmlPlacemark.getInlineStyle().getIconUrl() != null) {
                    mapMarker.setImage(kmlPlacemark.getInlineStyle().getIconUrl());
                } else if (next.getStyle(kmlPlacemark.getStyleId()) != null) {
                    mapMarker.setImage(next.getStyle(kmlPlacemark.getStyleId()).getIconUrl());
                }
                String str2 = property + " - " + i2;
                mapMarker.setIdentifier(str2);
                int i3 = i2 + 1;
                addFeature(mapMarker, i2);
                WritableMap writableMapMakeClickEventData = makeClickEventData(latLng);
                writableMapMakeClickEventData.putString("id", str2);
                writableMapMakeClickEventData.putString("title", property);
                writableMapMakeClickEventData.putString("description", property2);
                writableNativeArray.pushMap(writableMapMakeClickEventData);
                i2 = i3;
            }
            writableNativeMap.putArray("markers", writableNativeArray);
            this.manager.pushEvent(this.context, this, "onKmlReady", writableNativeMap);
        } catch (IOException | InterruptedException | ExecutionException | XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public void setLoadingBackgroundColor(Integer num) {
        this.loadingBackgroundColor = num;
        RelativeLayout relativeLayout = this.mapLoadingLayout;
        if (relativeLayout != null) {
            if (num == null) {
                relativeLayout.setBackgroundColor(-1);
            } else {
                relativeLayout.setBackgroundColor(num.intValue());
            }
        }
    }

    public void setLoadingIndicatorColor(Integer num) {
        this.loadingIndicatorColor = num;
        if (this.mapLoadingProgressBar != null) {
            if (num == null) {
                Integer.valueOf(Color.parseColor("#606060"));
            }
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(num.intValue());
            ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(num.intValue());
            ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(num.intValue());
            this.mapLoadingProgressBar.setProgressTintList(colorStateListValueOf);
            this.mapLoadingProgressBar.setSecondaryProgressTintList(colorStateListValueOf2);
            this.mapLoadingProgressBar.setIndeterminateTintList(colorStateListValueOf3);
        }
    }

    public void setMapBoundaries(ReadableMap readableMap, ReadableMap readableMap2) {
        if (this.map == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(new LatLng(readableMap.getDouble(IBrazeLocation.LATITUDE), readableMap.getDouble(IBrazeLocation.LONGITUDE)));
        builder.include(new LatLng(readableMap2.getDouble(IBrazeLocation.LATITUDE), readableMap2.getDouble(IBrazeLocation.LONGITUDE)));
        this.map.setLatLngBoundsForCameraTarget(builder.build());
    }

    public void setMapStyle(String str) {
        this.customMapStyleString = str;
        GoogleMap googleMap = this.map;
        if (googleMap == null || str == null) {
            return;
        }
        googleMap.setMapStyle(new MapStyleOptions(str));
    }

    public void setMoveOnMarkerPress(boolean z2) {
        this.moveOnMarkerPress = z2;
    }

    public void setRegion(ReadableMap readableMap) {
        this.region = readableMap;
        if (readableMap == null || this.map == null) {
            return;
        }
        moveToRegion(readableMap);
    }

    public void setShowsMyLocationButton(boolean z2) {
        if (hasPermissions() || !z2) {
            this.map.getUiSettings().setMyLocationButtonEnabled(z2);
        }
    }

    public void setShowsUserLocation(boolean z2) {
        this.showUserLocation = z2;
        if (hasPermissions()) {
            this.map.setLocationSource(this.fusedLocationSource);
            this.map.setMyLocationEnabled(z2);
        }
    }

    public void setToolbarEnabled(boolean z2) {
        if (hasPermissions() || !z2) {
            this.map.getUiSettings().setMapToolbarEnabled(z2);
        }
    }

    public void setUserLocationFastestInterval(int i2) {
        this.fusedLocationSource.setFastestInterval(i2);
    }

    public void setUserLocationPriority(int i2) {
        this.fusedLocationSource.setPriority(i2);
    }

    public void setUserLocationUpdateInterval(int i2) {
        this.fusedLocationSource.setInterval(i2);
    }

    public void updateExtraData(Object obj) {
        if (this.boundsToMove == null) {
            CameraUpdate cameraUpdate = this.cameraToSet;
            if (cameraUpdate != null) {
                this.map.moveCamera(cameraUpdate);
                this.cameraToSet = null;
                return;
            }
            return;
        }
        HashMap map = (HashMap) obj;
        int iIntValue = map.get("width") == null ? 0 : ((Float) map.get("width")).intValue();
        int iIntValue2 = map.get("height") == null ? 0 : ((Float) map.get("height")).intValue();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            this.map.moveCamera(CameraUpdateFactory.newLatLngBounds(this.boundsToMove, 0));
        } else {
            this.map.moveCamera(CameraUpdateFactory.newLatLngBounds(this.boundsToMove, iIntValue, iIntValue2, 0));
        }
        this.boundsToMove = null;
        this.cameraToSet = null;
    }
}
