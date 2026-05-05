package com.google.maps.android.data.kml;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Style;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public class KmlStyle extends Style {
    private static final int HSV_VALUES = 3;
    private static final int HUE_VALUE = 0;
    private static final int INITIAL_SCALE = 1;
    private String mIconUrl;
    private boolean mFill = true;
    private boolean mOutline = true;
    private String mStyleId = null;
    private final HashMap<String, String> mBalloonOptions = new HashMap<>();
    private final HashSet<String> mStylesSet = new HashSet<>();
    private double mScale = 1.0d;
    float mMarkerColor = 0.0f;
    private boolean mIconRandomColorMode = false;
    private boolean mLineRandomColorMode = false;
    private boolean mPolyRandomColorMode = false;

    KmlStyle() {
    }

    public static int computeRandomColor(int i2) {
        Random random = new Random();
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        if (iRed != 0) {
            iRed = random.nextInt(iRed);
        }
        if (iBlue != 0) {
            iBlue = random.nextInt(iBlue);
        }
        if (iGreen != 0) {
            iGreen = random.nextInt(iGreen);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    private static String convertColor(String str) {
        String strTrim = str.trim();
        return strTrim.length() > 6 ? strTrim.substring(0, 2) + strTrim.substring(6, 8) + strTrim.substring(4, 6) + strTrim.substring(2, 4) : strTrim.substring(4, 6) + strTrim.substring(2, 4) + strTrim.substring(0, 2);
    }

    private static MarkerOptions createMarkerOptions(MarkerOptions markerOptions, boolean z2, float f2) {
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.rotation(markerOptions.getRotation());
        markerOptions2.anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        if (z2) {
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(getHueValue(computeRandomColor((int) f2))));
        }
        markerOptions2.icon(markerOptions.getIcon());
        return markerOptions2;
    }

    private static PolygonOptions createPolygonOptions(PolygonOptions polygonOptions, boolean z2, boolean z3) {
        float strokeWidth;
        PolygonOptions polygonOptions2 = new PolygonOptions();
        if (z2) {
            polygonOptions2.fillColor(polygonOptions.getFillColor());
        }
        if (z3) {
            polygonOptions2.strokeColor(polygonOptions.getStrokeColor());
            strokeWidth = polygonOptions.getStrokeWidth();
        } else {
            strokeWidth = 0.0f;
        }
        polygonOptions2.strokeWidth(strokeWidth);
        polygonOptions2.clickable(polygonOptions.isClickable());
        return polygonOptions2;
    }

    private static PolylineOptions createPolylineOptions(PolylineOptions polylineOptions) {
        PolylineOptions polylineOptions2 = new PolylineOptions();
        polylineOptions2.color(polylineOptions.getColor());
        polylineOptions2.width(polylineOptions.getWidth());
        polylineOptions2.clickable(polylineOptions.isClickable());
        return polylineOptions2;
    }

    private static float getHueValue(int i2) {
        float[] fArr = new float[3];
        Color.colorToHSV(i2, fArr);
        return fArr[0];
    }

    public HashMap<String, String> getBalloonOptions() {
        return this.mBalloonOptions;
    }

    public double getIconScale() {
        return this.mScale;
    }

    public String getIconUrl() {
        return this.mIconUrl;
    }

    public MarkerOptions getMarkerOptions() {
        return createMarkerOptions(this.mMarkerOptions, isIconRandomColorMode(), this.mMarkerColor);
    }

    public PolygonOptions getPolygonOptions() {
        return createPolygonOptions(this.mPolygonOptions, this.mFill, this.mOutline);
    }

    public PolylineOptions getPolylineOptions() {
        return createPolylineOptions(this.mPolylineOptions);
    }

    String getStyleId() {
        return this.mStyleId;
    }

    public boolean hasBalloonStyle() {
        return this.mBalloonOptions.size() > 0;
    }

    public boolean hasFill() {
        return this.mFill;
    }

    public boolean hasOutline() {
        return this.mOutline;
    }

    boolean isIconRandomColorMode() {
        return this.mIconRandomColorMode;
    }

    public boolean isLineRandomColorMode() {
        return this.mLineRandomColorMode;
    }

    public boolean isPolyRandomColorMode() {
        return this.mPolyRandomColorMode;
    }

    public boolean isStyleSet(String str) {
        return this.mStylesSet.contains(str);
    }

    public void setFill(boolean z2) {
        this.mFill = z2;
    }

    void setFillColor(String str) {
        setPolygonFillColor(Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add("fillColor");
    }

    void setHeading(float f2) {
        setMarkerRotation(f2);
        this.mStylesSet.add("heading");
    }

    void setHotSpot(float f2, float f3, String str, String str2) {
        setMarkerHotSpot(f2, f3, str, str2);
        this.mStylesSet.add("hotSpot");
    }

    void setIconColorMode(String str) {
        this.mIconRandomColorMode = str.equals("random");
        this.mStylesSet.add("iconColorMode");
    }

    void setIconScale(double d2) {
        this.mScale = d2;
        this.mStylesSet.add("iconScale");
    }

    void setIconUrl(String str) {
        this.mIconUrl = str;
        this.mStylesSet.add("iconUrl");
    }

    void setInfoWindowText(String str) {
        this.mBalloonOptions.put("text", str);
    }

    void setLineColorMode(String str) {
        this.mLineRandomColorMode = str.equals("random");
        this.mStylesSet.add("lineColorMode");
    }

    void setMarkerColor(String str) {
        this.mMarkerColor = getHueValue(Color.parseColor("#" + convertColor(str)));
        this.mMarkerOptions.icon(BitmapDescriptorFactory.defaultMarker(this.mMarkerColor));
        this.mStylesSet.add("markerColor");
    }

    void setOutline(boolean z2) {
        this.mOutline = z2;
        this.mStylesSet.add("outline");
    }

    void setOutlineColor(String str) {
        this.mPolylineOptions.color(Color.parseColor("#" + convertColor(str)));
        this.mPolygonOptions.strokeColor(Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add("outlineColor");
    }

    void setPolyColorMode(String str) {
        this.mPolyRandomColorMode = str.equals("random");
        this.mStylesSet.add("polyColorMode");
    }

    void setStyleId(String str) {
        this.mStyleId = str;
    }

    void setWidth(Float f2) {
        setLineStringWidth(f2.floatValue());
        setPolygonStrokeWidth(f2.floatValue());
        this.mStylesSet.add("width");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Style{\n balloon options=");
        sb.append(this.mBalloonOptions);
        sb.append(",\n fill=").append(this.mFill);
        sb.append(",\n outline=").append(this.mOutline);
        sb.append(",\n icon url=").append(this.mIconUrl);
        sb.append(",\n scale=").append(this.mScale);
        sb.append(",\n style id=").append(this.mStyleId);
        sb.append("\n}\n");
        return sb.toString();
    }
}
