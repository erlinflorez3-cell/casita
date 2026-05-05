package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.data.Style;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class GeoJsonPointStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"Point", "MultiPoint", "GeometryCollection"};

    public GeoJsonPointStyle() {
        this.mMarkerOptions = new MarkerOptions();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public float getAlpha() {
        return this.mMarkerOptions.getAlpha();
    }

    public float getAnchorU() {
        return this.mMarkerOptions.getAnchorU();
    }

    public float getAnchorV() {
        return this.mMarkerOptions.getAnchorV();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public BitmapDescriptor getIcon() {
        return this.mMarkerOptions.getIcon();
    }

    public float getInfoWindowAnchorU() {
        return this.mMarkerOptions.getInfoWindowAnchorU();
    }

    public float getInfoWindowAnchorV() {
        return this.mMarkerOptions.getInfoWindowAnchorV();
    }

    @Override // com.google.maps.android.data.Style
    public float getRotation() {
        return this.mMarkerOptions.getRotation();
    }

    public String getSnippet() {
        return this.mMarkerOptions.getSnippet();
    }

    public String getTitle() {
        return this.mMarkerOptions.getTitle();
    }

    public float getZIndex() {
        return this.mMarkerOptions.getZIndex();
    }

    public boolean isDraggable() {
        return this.mMarkerOptions.isDraggable();
    }

    public boolean isFlat() {
        return this.mMarkerOptions.isFlat();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mMarkerOptions.isVisible();
    }

    public void setAlpha(float f2) {
        this.mMarkerOptions.alpha(f2);
        styleChanged();
    }

    public void setAnchor(float f2, float f3) {
        setMarkerHotSpot(f2, f3, "fraction", "fraction");
        styleChanged();
    }

    public void setDraggable(boolean z2) {
        this.mMarkerOptions.draggable(z2);
        styleChanged();
    }

    public void setFlat(boolean z2) {
        this.mMarkerOptions.flat(z2);
        styleChanged();
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        this.mMarkerOptions.icon(bitmapDescriptor);
        styleChanged();
    }

    public void setInfoWindowAnchor(float f2, float f3) {
        this.mMarkerOptions.infoWindowAnchor(f2, f3);
        styleChanged();
    }

    public void setRotation(float f2) {
        setMarkerRotation(f2);
        styleChanged();
    }

    public void setSnippet(String str) {
        this.mMarkerOptions.snippet(str);
        styleChanged();
    }

    public void setTitle(String str) {
        this.mMarkerOptions.title(str);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z2) {
        this.mMarkerOptions.visible(z2);
        styleChanged();
    }

    public void setZIndex(float f2) {
        this.mMarkerOptions.zIndex(f2);
        styleChanged();
    }

    public MarkerOptions toMarkerOptions() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.alpha(this.mMarkerOptions.getAlpha());
        markerOptions.anchor(this.mMarkerOptions.getAnchorU(), this.mMarkerOptions.getAnchorV());
        markerOptions.draggable(this.mMarkerOptions.isDraggable());
        markerOptions.flat(this.mMarkerOptions.isFlat());
        markerOptions.icon(this.mMarkerOptions.getIcon());
        markerOptions.infoWindowAnchor(this.mMarkerOptions.getInfoWindowAnchorU(), this.mMarkerOptions.getInfoWindowAnchorV());
        markerOptions.rotation(this.mMarkerOptions.getRotation());
        markerOptions.snippet(this.mMarkerOptions.getSnippet());
        markerOptions.title(this.mMarkerOptions.getTitle());
        markerOptions.visible(this.mMarkerOptions.isVisible());
        markerOptions.zIndex(this.mMarkerOptions.getZIndex());
        return markerOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PointStyle{\n geometry type=");
        sb.append(Arrays.toString(GEOMETRY_TYPE));
        sb.append(",\n alpha=").append(getAlpha());
        sb.append(",\n anchor U=").append(getAnchorU());
        sb.append(",\n anchor V=").append(getAnchorV());
        sb.append(",\n draggable=").append(isDraggable());
        sb.append(",\n flat=").append(isFlat());
        sb.append(",\n info window anchor U=").append(getInfoWindowAnchorU());
        sb.append(",\n info window anchor V=").append(getInfoWindowAnchorV());
        sb.append(",\n rotation=").append(getRotation());
        sb.append(",\n snippet=").append(getSnippet());
        sb.append(",\n title=").append(getTitle());
        sb.append(",\n visible=").append(isVisible());
        sb.append(",\n z index=").append(getZIndex());
        sb.append("\n}\n");
        return sb.toString();
    }
}
