package com.google.maps.android.data;

import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Observable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Style extends Observable {
    private static final String LOG_TAG = "Style";
    protected MarkerOptions mMarkerOptions = new MarkerOptions();
    protected PolygonOptions mPolygonOptions;
    protected PolylineOptions mPolylineOptions;

    public Style() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.mPolylineOptions = polylineOptions;
        polylineOptions.clickable(true);
        PolygonOptions polygonOptions = new PolygonOptions();
        this.mPolygonOptions = polygonOptions;
        polygonOptions.clickable(true);
    }

    public float getRotation() {
        return this.mMarkerOptions.getRotation();
    }

    public void setLineStringWidth(float f2) {
        this.mPolylineOptions.width(f2);
    }

    public void setMarkerHotSpot(float f2, float f3, String str, String str2) {
        if (!str.equals("fraction")) {
            f2 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            f3 = 1.0f;
        }
        this.mMarkerOptions.anchor(f2, f3);
    }

    public void setMarkerRotation(float f2) {
        this.mMarkerOptions.rotation(f2);
    }

    public void setPolygonFillColor(int i2) {
        this.mPolygonOptions.fillColor(i2);
    }

    public void setPolygonStrokeWidth(float f2) {
        this.mPolygonOptions.strokeWidth(f2);
    }
}
