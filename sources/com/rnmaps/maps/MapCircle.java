package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.collections.CircleManager;

/* JADX INFO: loaded from: classes5.dex */
public class MapCircle extends MapFeature {
    private LatLng center;
    private Circle circle;
    private CircleOptions circleOptions;
    private int fillColor;
    private double radius;
    private int strokeColor;
    private float strokeWidth;
    private float zIndex;

    public MapCircle(Context context) {
        super(context);
    }

    private CircleOptions createCircleOptions() {
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.center(this.center);
        circleOptions.radius(this.radius);
        circleOptions.fillColor(this.fillColor);
        circleOptions.strokeColor(this.strokeColor);
        circleOptions.strokeWidth(this.strokeWidth);
        circleOptions.zIndex(this.zIndex);
        return circleOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void addToMap(Object obj) {
        this.circle = ((CircleManager.Collection) obj).addCircle(getCircleOptions());
    }

    public CircleOptions getCircleOptions() {
        if (this.circleOptions == null) {
            this.circleOptions = createCircleOptions();
        }
        return this.circleOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.circle;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void removeFromMap(Object obj) {
        ((CircleManager.Collection) obj).remove(this.circle);
    }

    public void setCenter(LatLng latLng) {
        this.center = latLng;
        Circle circle = this.circle;
        if (circle != null) {
            circle.setCenter(latLng);
        }
    }

    public void setFillColor(int i2) {
        this.fillColor = i2;
        Circle circle = this.circle;
        if (circle != null) {
            circle.setFillColor(i2);
        }
    }

    public void setRadius(double d2) {
        this.radius = d2;
        Circle circle = this.circle;
        if (circle != null) {
            circle.setRadius(d2);
        }
    }

    public void setStrokeColor(int i2) {
        this.strokeColor = i2;
        Circle circle = this.circle;
        if (circle != null) {
            circle.setStrokeColor(i2);
        }
    }

    public void setStrokeWidth(float f2) {
        this.strokeWidth = f2;
        Circle circle = this.circle;
        if (circle != null) {
            circle.setStrokeWidth(f2);
        }
    }

    public void setZIndex(float f2) {
        this.zIndex = f2;
        Circle circle = this.circle;
        if (circle != null) {
            circle.setZIndex(f2);
        }
    }
}
