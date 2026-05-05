package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Style;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class GeoJsonLineStringStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"LineString", "MultiLineString", "GeometryCollection"};

    public GeoJsonLineStringStyle() {
        this.mPolylineOptions = new PolylineOptions();
        this.mPolylineOptions.clickable(true);
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public int getColor() {
        return this.mPolylineOptions.getColor();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public List<PatternItem> getPattern() {
        return this.mPolylineOptions.getPattern();
    }

    public float getWidth() {
        return this.mPolylineOptions.getWidth();
    }

    public float getZIndex() {
        return this.mPolylineOptions.getZIndex();
    }

    public boolean isClickable() {
        return this.mPolylineOptions.isClickable();
    }

    public boolean isGeodesic() {
        return this.mPolylineOptions.isGeodesic();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolylineOptions.isVisible();
    }

    public void setClickable(boolean z2) {
        this.mPolylineOptions.clickable(z2);
        styleChanged();
    }

    public void setColor(int i2) {
        this.mPolylineOptions.color(i2);
        styleChanged();
    }

    public void setGeodesic(boolean z2) {
        this.mPolylineOptions.geodesic(z2);
        styleChanged();
    }

    public void setPattern(List<PatternItem> list) {
        this.mPolylineOptions.pattern(list);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z2) {
        this.mPolylineOptions.visible(z2);
        styleChanged();
    }

    public void setWidth(float f2) {
        setLineStringWidth(f2);
        styleChanged();
    }

    public void setZIndex(float f2) {
        this.mPolylineOptions.zIndex(f2);
        styleChanged();
    }

    public PolylineOptions toPolylineOptions() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.mPolylineOptions.getColor());
        polylineOptions.clickable(this.mPolylineOptions.isClickable());
        polylineOptions.geodesic(this.mPolylineOptions.isGeodesic());
        polylineOptions.visible(this.mPolylineOptions.isVisible());
        polylineOptions.width(this.mPolylineOptions.getWidth());
        polylineOptions.zIndex(this.mPolylineOptions.getZIndex());
        polylineOptions.pattern(getPattern());
        return polylineOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineStringStyle{\n geometry type=");
        sb.append(Arrays.toString(GEOMETRY_TYPE));
        sb.append(",\n color=").append(getColor());
        sb.append(",\n clickable=").append(isClickable());
        sb.append(",\n geodesic=").append(isGeodesic());
        sb.append(",\n visible=").append(isVisible());
        sb.append(",\n width=").append(getWidth());
        sb.append(",\n z index=").append(getZIndex());
        sb.append(",\n pattern=").append(getPattern());
        sb.append("\n}\n");
        return sb.toString();
    }
}
