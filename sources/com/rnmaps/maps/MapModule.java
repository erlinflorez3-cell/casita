package com.rnmaps.maps;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import com.appsflyer.AdRevenueScheme;
import com.braze.models.IBrazeLocation;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0001(0\n\u001d+\u0007(\u001c,\"\u001a")
public class MapModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AirMapModule";
    private static final String SNAPSHOT_FORMAT_JPG = "jpg";
    private static final String SNAPSHOT_FORMAT_PNG = "png";
    private static final String SNAPSHOT_RESULT_BASE64 = "base64";
    private static final String SNAPSHOT_RESULT_FILE = "file";

    public MapModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @ReactMethod
    public void coordinateForPoint(final int i2, ReadableMap readableMap, final Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        double d2 = reactApplicationContext.getResources().getDisplayMetrics().density;
        final Point point = new Point(readableMap.hasKey("x") ? (int) (readableMap.getDouble("x") * d2) : 0, readableMap.hasKey("y") ? (int) (readableMap.getDouble("y") * d2) : 0);
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new UIBlock() { // from class: com.rnmaps.maps.MapModule.5
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                MapView mapView = (MapView) nativeViewHierarchyManager.resolveView(i2);
                if (mapView == null) {
                    promise.reject("AirMapView not found");
                    return;
                }
                if (mapView.map == null) {
                    promise.reject("AirMapView.map is not valid");
                    return;
                }
                LatLng latLngFromScreenLocation = mapView.map.getProjection().fromScreenLocation(point);
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble(IBrazeLocation.LATITUDE, latLngFromScreenLocation.latitude);
                writableNativeMap.putDouble(IBrazeLocation.LONGITUDE, latLngFromScreenLocation.longitude);
                promise.resolve(writableNativeMap);
            }
        });
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    @ReactMethod
    public void getAddressFromCoordinates(final int i2, final ReadableMap readableMap, final Promise promise) {
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new UIBlock() { // from class: com.rnmaps.maps.MapModule.3
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                MapView mapView = (MapView) nativeViewHierarchyManager.resolveView(i2);
                if (mapView == null) {
                    promise.reject("AirMapView not found");
                    return;
                }
                if (mapView.map == null) {
                    promise.reject("AirMapView.map is not valid");
                    return;
                }
                ReadableMap readableMap2 = readableMap;
                if (readableMap2 == null || !readableMap2.hasKey(IBrazeLocation.LATITUDE) || !readableMap.hasKey(IBrazeLocation.LONGITUDE)) {
                    promise.reject("Invalid coordinate format");
                    return;
                }
                try {
                    List<Address> fromLocation = new Geocoder(reactApplicationContext).getFromLocation(readableMap.getDouble(IBrazeLocation.LATITUDE), readableMap.getDouble(IBrazeLocation.LONGITUDE), 1);
                    if (fromLocation.isEmpty()) {
                        promise.reject("Can not get address location");
                        return;
                    }
                    Address address = fromLocation.get(0);
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("name", address.getFeatureName());
                    writableNativeMap.putString("locality", address.getLocality());
                    writableNativeMap.putString("thoroughfare", address.getThoroughfare());
                    writableNativeMap.putString("subThoroughfare", address.getSubThoroughfare());
                    writableNativeMap.putString("subLocality", address.getSubLocality());
                    writableNativeMap.putString("administrativeArea", address.getAdminArea());
                    writableNativeMap.putString("subAdministrativeArea", address.getSubAdminArea());
                    writableNativeMap.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, address.getPostalCode());
                    writableNativeMap.putString("countryCode", address.getCountryCode());
                    writableNativeMap.putString(AdRevenueScheme.COUNTRY, address.getCountryName());
                    promise.resolve(writableNativeMap);
                } catch (IOException unused) {
                    promise.reject("Can not get address location");
                }
            }
        });
    }

    @ReactMethod
    public void getCamera(final int i2, final Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new UIBlock() { // from class: com.rnmaps.maps.MapModule.2
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                MapView mapView = (MapView) nativeViewHierarchyManager.resolveView(i2);
                if (mapView == null) {
                    promise.reject("AirMapView not found");
                    return;
                }
                if (mapView.map == null) {
                    promise.reject("AirMapView.map is not valid");
                    return;
                }
                CameraPosition cameraPosition = mapView.map.getCameraPosition();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble(IBrazeLocation.LATITUDE, cameraPosition.target.latitude);
                writableNativeMap.putDouble(IBrazeLocation.LONGITUDE, cameraPosition.target.longitude);
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putMap("center", writableNativeMap);
                writableNativeMap2.putDouble("heading", cameraPosition.bearing);
                writableNativeMap2.putDouble("zoom", cameraPosition.zoom);
                writableNativeMap2.putDouble("pitch", cameraPosition.tilt);
                promise.resolve(writableNativeMap2);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("legalNotice", "This license information is displayed in Settings > Google > Open Source on any device running Google Play services.");
        return map;
    }

    @ReactMethod
    public void getMapBoundaries(final int i2, final Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new UIBlock() { // from class: com.rnmaps.maps.MapModule.6
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
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                MapView mapView = (MapView) nativeViewHierarchyManager.resolveView(i2);
                if (mapView == null) {
                    promise.reject("AirMapView not found");
                    return;
                }
                if (mapView.map == null) {
                    promise.reject("AirMapView.map is not valid");
                    return;
                }
                double[][] mapBoundaries = mapView.getMapBoundaries();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                writableNativeMap2.putDouble(IBrazeLocation.LONGITUDE, mapBoundaries[0][0]);
                writableNativeMap2.putDouble(IBrazeLocation.LATITUDE, mapBoundaries[0][1]);
                writableNativeMap3.putDouble(IBrazeLocation.LONGITUDE, mapBoundaries[1][0]);
                writableNativeMap3.putDouble(IBrazeLocation.LATITUDE, mapBoundaries[1][1]);
                writableNativeMap.putMap("northEast", writableNativeMap2);
                writableNativeMap.putMap("southWest", writableNativeMap3);
                promise.resolve(writableNativeMap);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void pointForCoordinate(final int i2, ReadableMap readableMap, final Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        final double d2 = reactApplicationContext.getResources().getDisplayMetrics().density;
        final LatLng latLng = new LatLng(readableMap.hasKey(IBrazeLocation.LATITUDE) ? readableMap.getDouble(IBrazeLocation.LATITUDE) : 0.0d, readableMap.hasKey(IBrazeLocation.LONGITUDE) ? readableMap.getDouble(IBrazeLocation.LONGITUDE) : 0.0d);
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new UIBlock() { // from class: com.rnmaps.maps.MapModule.4
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                MapView mapView = (MapView) nativeViewHierarchyManager.resolveView(i2);
                if (mapView == null) {
                    promise.reject("AirMapView not found");
                    return;
                }
                if (mapView.map == null) {
                    promise.reject("AirMapView.map is not valid");
                    return;
                }
                Point screenLocation = mapView.map.getProjection().toScreenLocation(latLng);
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("x", ((double) screenLocation.x) / d2);
                writableNativeMap.putDouble("y", ((double) screenLocation.y) / d2);
                promise.resolve(writableNativeMap);
            }
        });
    }

    @ReactMethod
    public void takeSnapshot(final int i2, ReadableMap readableMap, final Promise promise) {
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        final String string = readableMap.hasKey("format") ? readableMap.getString("format") : SNAPSHOT_FORMAT_PNG;
        final Bitmap.CompressFormat compressFormat = string.equals(SNAPSHOT_FORMAT_PNG) ? Bitmap.CompressFormat.PNG : string.equals(SNAPSHOT_FORMAT_JPG) ? Bitmap.CompressFormat.JPEG : null;
        final double d2 = readableMap.hasKey("quality") ? readableMap.getDouble("quality") : 1.0d;
        DisplayMetrics displayMetrics = reactApplicationContext.getResources().getDisplayMetrics();
        final Integer numValueOf = Integer.valueOf(readableMap.hasKey("width") ? (int) (((double) displayMetrics.density) * readableMap.getDouble("width")) : 0);
        final Integer numValueOf2 = Integer.valueOf(readableMap.hasKey("height") ? (int) (((double) displayMetrics.density) * readableMap.getDouble("height")) : 0);
        final String string2 = readableMap.hasKey("result") ? readableMap.getString("result") : "file";
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new UIBlock() { // from class: com.rnmaps.maps.MapModule.1
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                MapView mapView = (MapView) nativeViewHierarchyManager.resolveView(i2);
                if (mapView == null) {
                    promise.reject("AirMapView not found");
                } else if (mapView.map == null) {
                    promise.reject("AirMapView.map is not valid");
                } else {
                    mapView.map.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.rnmaps.maps.MapModule.1.1
                        @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                        public void onSnapshotReady(Bitmap bitmap) throws Throwable {
                            String strQd = Xg.qd("^", (short) (FB.Xd() ^ 24298), (short) (FB.Xd() ^ 4642));
                            if (bitmap == null) {
                                promise.reject(Jg.Wd(" \u0016;J@[$u~H\u0010\u0017@0NUwd<\u000b\u000f\u0017\u001c\u000b*~sOkVv\u0014\u0016\u001a;s\r\rgiqi", (short) (C1633zX.Xd() ^ (-9214)), (short) (C1633zX.Xd() ^ (-21424))));
                                return;
                            }
                            if (numValueOf.intValue() != 0 && numValueOf2.intValue() != 0 && (numValueOf.intValue() != bitmap.getWidth() || numValueOf2.intValue() != bitmap.getHeight())) {
                                bitmap = Bitmap.createScaledBitmap(bitmap, numValueOf.intValue(), numValueOf2.intValue(), true);
                            }
                            if (string2.equals(ZO.xd("^:\rr", (short) (C1607wl.Xd() ^ 18840), (short) (C1607wl.Xd() ^ 18308)))) {
                                try {
                                    File fileCreateTempFile = File.createTempFile(C1626yg.Ud("\u000b\tezD\f[zb\bh\\Wx", (short) (FB.Xd() ^ 18813), (short) (FB.Xd() ^ 9723)), strQd + string, reactApplicationContext.getCacheDir());
                                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                                    bitmap.compress(compressFormat, (int) (d2 * 100.0d), fileOutputStream);
                                    MapModule.closeQuietly(fileOutputStream);
                                    promise.resolve(Uri.fromFile(fileCreateTempFile).toString());
                                    return;
                                } catch (Exception e2) {
                                    promise.reject(e2);
                                    return;
                                }
                            }
                            if (string2.equals(Ig.wd("\u0017HJ\u001bA\u0012", (short) (C1633zX.Xd() ^ (-9224))))) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                bitmap.compress(compressFormat, (int) (d2 * 100.0d), byteArrayOutputStream);
                                MapModule.closeQuietly(byteArrayOutputStream);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                Class<?> cls = Class.forName(EO.Od("|bf\u0011\u00164\u001fIGf]~(4eS\u0013O'", (short) (C1580rY.Xd() ^ (-20325))));
                                Class<?>[] clsArr = {byte[].class, Integer.TYPE};
                                Object[] objArr = {byteArray, 2};
                                short sXd = (short) (FB.Xd() ^ 19740);
                                int[] iArr = new int["\n\u0012\u0006\u0011\u0005\u0005r\ro\u0010\r\u0003\u0007~".length()];
                                QB qb = new QB("\n\u0012\u0006\u0011\u0005\u0005r\ro\u0010\r\u0003\u0007~");
                                int i3 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                                    i3++;
                                }
                                Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
                                try {
                                    declaredMethod.setAccessible(true);
                                    promise.resolve((String) declaredMethod.invoke(null, objArr));
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            }
                        }
                    });
                }
            }
        });
    }
}
