package com.rnmaps.maps;

import android.content.Context;
import com.braze.models.IBrazeLocation;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.collections.PolygonManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MapPolygon extends MapFeature {
    private List<LatLng> coordinates;
    private int fillColor;
    private boolean geodesic;
    private List<List<LatLng>> holes;
    private Polygon polygon;
    private PolygonOptions polygonOptions;
    private int strokeColor;
    private float strokeWidth;
    private boolean tappable;
    private float zIndex;

    public MapPolygon(Context context) {
        super(context);
    }

    private PolygonOptions createPolygonOptions() {
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.addAll(this.coordinates);
        polygonOptions.fillColor(this.fillColor);
        polygonOptions.strokeColor(this.strokeColor);
        polygonOptions.strokeWidth(this.strokeWidth);
        polygonOptions.geodesic(this.geodesic);
        polygonOptions.zIndex(this.zIndex);
        if (this.holes != null) {
            for (int i2 = 0; i2 < this.holes.size(); i2++) {
                polygonOptions.addHole(this.holes.get(i2));
            }
        }
        return polygonOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void addToMap(Object obj) {
        Polygon polygonAddPolygon = ((PolygonManager.Collection) obj).addPolygon(getPolygonOptions());
        this.polygon = polygonAddPolygon;
        polygonAddPolygon.setClickable(this.tappable);
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.polygon;
    }

    public PolygonOptions getPolygonOptions() {
        if (this.polygonOptions == null) {
            this.polygonOptions = createPolygonOptions();
        }
        return this.polygonOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void removeFromMap(Object obj) {
        ((PolygonManager.Collection) obj).remove(this.polygon);
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.coordinates = new ArrayList(readableArray.size());
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            this.coordinates.add(i2, new LatLng(map.getDouble(IBrazeLocation.LATITUDE), map.getDouble(IBrazeLocation.LONGITUDE)));
        }
        Polygon polygon = this.polygon;
        if (polygon != null) {
            polygon.setPoints(this.coordinates);
        }
    }

    public void setFillColor(int i2) {
        this.fillColor = i2;
        Polygon polygon = this.polygon;
        if (polygon != null) {
            polygon.setFillColor(i2);
        }
    }

    public void setGeodesic(boolean z2) {
        this.geodesic = z2;
        Polygon polygon = this.polygon;
        if (polygon != null) {
            polygon.setGeodesic(z2);
        }
    }

    public void setHoles(ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        this.holes = new ArrayList(readableArray.size());
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableArray array = readableArray.getArray(i2);
            if (array.size() >= 3) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < array.size(); i3++) {
                    ReadableMap map = array.getMap(i3);
                    arrayList.add(new LatLng(map.getDouble(IBrazeLocation.LATITUDE), map.getDouble(IBrazeLocation.LONGITUDE)));
                }
                if (arrayList.size() == 3) {
                    arrayList.add((LatLng) arrayList.get(0));
                }
                this.holes.add(arrayList);
            }
        }
        Polygon polygon = this.polygon;
        if (polygon != null) {
            polygon.setHoles(this.holes);
        }
    }

    public void setStrokeColor(int i2) {
        this.strokeColor = i2;
        Polygon polygon = this.polygon;
        if (polygon != null) {
            polygon.setStrokeColor(i2);
        }
    }

    public void setStrokeWidth(float f2) {
        this.strokeWidth = f2;
        Polygon polygon = this.polygon;
        if (polygon != null) {
            polygon.setStrokeWidth(f2);
        }
    }

    public void setTappable(boolean z2) {
        this.tappable = z2;
        Polygon polygon = this.polygon;
        if (polygon != null) {
            polygon.setClickable(z2);
        }
    }

    public void setZIndex(float f2) {
        this.zIndex = f2;
        Polygon polygon = this.polygon;
        if (polygon != null) {
            polygon.setZIndex(f2);
        }
    }
}
