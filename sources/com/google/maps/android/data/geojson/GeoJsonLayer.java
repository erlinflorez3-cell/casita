package com.google.maps.android.data.geojson;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Layer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public class GeoJsonLayer extends Layer {
    private LatLngBounds mBoundingBox;

    public interface GeoJsonOnFeatureClickListener extends Layer.OnFeatureClickListener {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GeoJsonLayer(GoogleMap googleMap, int i2, Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("\u0013!\u0018'% \u001cf\u001d**1#-4n\u0005229+?<", (short) (Od.Xd() ^ (-17174)), (short) (Od.Xd() ^ (-8093)))).getMethod(C1561oA.od("TQ_<N[V[WGHU", (short) (Od.Xd() ^ (-4735))), new Class[0]);
        try {
            method.setAccessible(true);
            this(googleMap, createJsonFileObject(((Resources) method.invoke(context, objArr)).openRawResource(i2)), null, null, null, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public GeoJsonLayer(GoogleMap googleMap, int i2, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 28814);
        int[] iArr = new int["[i`omhd/erryku|7Mzz\u0002s\b\u0005".length()];
        QB qb = new QB("[i`omhd/erryku|7Mzz\u0002s\b\u0005");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Wg.Zd("\u000bx8\u0005(&p'r\u0014\u0006b", (short) (C1607wl.Xd() ^ 15318), (short) (C1607wl.Xd() ^ 19038)), new Class[0]);
        try {
            method.setAccessible(true);
            this(googleMap, createJsonFileObject(((Resources) method.invoke(context, objArr)).openRawResource(i2)), markerManager, polygonManager, polylineManager, groundOverlayManager);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public GeoJsonLayer(GoogleMap googleMap, JSONObject jSONObject) {
        this(googleMap, jSONObject, null, null, null, null);
    }

    public GeoJsonLayer(GoogleMap googleMap, JSONObject jSONObject, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("GeoJSON file cannot be null");
        }
        this.mBoundingBox = null;
        GeoJsonParser geoJsonParser = new GeoJsonParser(jSONObject);
        this.mBoundingBox = geoJsonParser.getBoundingBox();
        HashMap map = new HashMap();
        Iterator<GeoJsonFeature> it = geoJsonParser.getFeatures().iterator();
        while (it.hasNext()) {
            map.put(it.next(), null);
        }
        storeRenderer(new GeoJsonRenderer(googleMap, map, markerManager, polygonManager, polylineManager, groundOverlayManager));
    }

    private static JSONObject createJsonFileObject(InputStream inputStream) throws JSONException, IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return new JSONObject(sb.toString());
            }
            sb.append(line);
        }
    }

    public void addFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        super.addFeature((Feature) geoJsonFeature);
    }

    @Override // com.google.maps.android.data.Layer
    public void addLayerToMap() {
        super.addGeoJsonToMap();
    }

    public LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<GeoJsonFeature> getFeatures() {
        return super.getFeatures();
    }

    public void removeFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        super.removeFeature((Feature) geoJsonFeature);
    }

    public String toString() {
        return "Collection{\n Bounding box=" + this.mBoundingBox + "\n}\n";
    }
}
