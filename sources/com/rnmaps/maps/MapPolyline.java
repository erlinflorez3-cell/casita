package com.rnmaps.maps;

import android.content.Context;
import com.braze.models.IBrazeLocation;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.maps.android.collections.PolylineManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MapPolyline extends MapFeature {
    private int color;
    private List<LatLng> coordinates;
    private boolean geodesic;
    private Cap lineCap;
    private List<PatternItem> pattern;
    private ReadableArray patternValues;
    private Polyline polyline;
    private PolylineOptions polylineOptions;
    private boolean tappable;
    private float width;
    private float zIndex;

    public MapPolyline(Context context) {
        super(context);
        this.lineCap = new RoundCap();
    }

    private void applyPattern() {
        if (this.patternValues == null) {
            return;
        }
        this.pattern = new ArrayList(this.patternValues.size());
        for (int i2 = 0; i2 < this.patternValues.size(); i2++) {
            float f2 = (float) this.patternValues.getDouble(i2);
            if (i2 % 2 != 0) {
                this.pattern.add(new Gap(f2));
            } else {
                this.pattern.add(this.lineCap instanceof RoundCap ? new Dot() : new Dash(f2));
            }
        }
        Polyline polyline = this.polyline;
        if (polyline != null) {
            polyline.setPattern(this.pattern);
        }
    }

    private PolylineOptions createPolylineOptions() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.addAll(this.coordinates);
        polylineOptions.color(this.color);
        polylineOptions.width(this.width);
        polylineOptions.geodesic(this.geodesic);
        polylineOptions.zIndex(this.zIndex);
        polylineOptions.startCap(this.lineCap);
        polylineOptions.endCap(this.lineCap);
        polylineOptions.pattern(this.pattern);
        return polylineOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void addToMap(Object obj) {
        Polyline polylineAddPolyline = ((PolylineManager.Collection) obj).addPolyline(getPolylineOptions());
        this.polyline = polylineAddPolyline;
        polylineAddPolyline.setClickable(this.tappable);
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.polyline;
    }

    public PolylineOptions getPolylineOptions() {
        if (this.polylineOptions == null) {
            this.polylineOptions = createPolylineOptions();
        }
        return this.polylineOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void removeFromMap(Object obj) {
        ((PolylineManager.Collection) obj).remove(this.polyline);
    }

    public void setColor(int i2) {
        this.color = i2;
        Polyline polyline = this.polyline;
        if (polyline != null) {
            polyline.setColor(i2);
        }
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.coordinates = new ArrayList(readableArray.size());
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            this.coordinates.add(i2, new LatLng(map.getDouble(IBrazeLocation.LATITUDE), map.getDouble(IBrazeLocation.LONGITUDE)));
        }
        Polyline polyline = this.polyline;
        if (polyline != null) {
            polyline.setPoints(this.coordinates);
        }
    }

    public void setGeodesic(boolean z2) {
        this.geodesic = z2;
        Polyline polyline = this.polyline;
        if (polyline != null) {
            polyline.setGeodesic(z2);
        }
    }

    public void setLineCap(Cap cap) {
        this.lineCap = cap;
        Polyline polyline = this.polyline;
        if (polyline != null) {
            polyline.setStartCap(cap);
            this.polyline.setEndCap(cap);
        }
        applyPattern();
    }

    public void setLineDashPattern(ReadableArray readableArray) {
        this.patternValues = readableArray;
        applyPattern();
    }

    public void setTappable(boolean z2) {
        this.tappable = z2;
        Polyline polyline = this.polyline;
        if (polyline != null) {
            polyline.setClickable(z2);
        }
    }

    public void setWidth(float f2) {
        this.width = f2;
        Polyline polyline = this.polyline;
        if (polyline != null) {
            polyline.setWidth(f2);
        }
    }

    public void setZIndex(float f2) {
        this.zIndex = f2;
        Polyline polyline = this.polyline;
        if (polyline != null) {
            polyline.setZIndex(f2);
        }
    }
}
