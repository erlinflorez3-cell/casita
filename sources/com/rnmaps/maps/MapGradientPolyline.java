package com.rnmaps.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import com.google.maps.android.SphericalUtil;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.Wg;

/* JADX INFO: loaded from: classes5.dex */
public class MapGradientPolyline extends MapFeature {
    private int[] colors;
    protected final Context context;
    private GoogleMap map;
    private List<LatLng> points;
    private TileOverlay tileOverlay;
    private float width;
    private float zIndex;

    public class AirMapGradientPolylineProvider implements TileProvider {
        public static final int BASE_TILE_SIZE = 256;
        protected final int[] colors;
        protected final float density;
        protected final List<LatLng> points;
        protected Point[] projectedPtMids;
        protected Point[] projectedPts;
        protected final SphericalMercatorProjection projection;
        protected final int tileDimension;
        protected LatLng[] trailLatLngs;
        protected final float width;

        public AirMapGradientPolylineProvider(Context context, List<LatLng> list, int[] iArr, float f2) throws Throwable {
            this.points = list;
            this.colors = iArr;
            this.width = f2;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019Si\u0017\u0017\u001e\u0010$!", (short) (C1580rY.Xd() ^ (-2759)))).getMethod(Wg.vd("\u0006\u0005\u0011o\u007f\u000f\b\u000f\tzy\t", (short) (OY.Xd() ^ 16153)), new Class[0]);
            try {
                method.setAccessible(true);
                float f3 = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
                this.density = f3;
                this.tileDimension = (int) (f3 * 256.0f);
                this.projection = new SphericalMercatorProjection(256.0d);
                calculatePoints();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public void calculatePoints() {
            this.trailLatLngs = new LatLng[this.points.size()];
            this.projectedPts = new Point[this.points.size()];
            this.projectedPtMids = new Point[Math.max(this.points.size() - 1, 0)];
            for (int i2 = 0; i2 < this.points.size(); i2++) {
                LatLng latLng = this.points.get(i2);
                this.trailLatLngs[i2] = latLng;
                this.projectedPts[i2] = this.projection.toPoint(latLng);
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    this.projectedPtMids[i3] = this.projection.toPoint(SphericalUtil.interpolate(this.points.get(i3), latLng, 0.5d));
                }
            }
        }

        public void drawLine(Canvas canvas, Matrix matrix, Paint paint, Paint paint2, MutPoint mutPoint, MutPoint mutPoint2, float f2, float f3) {
            if (f2 == f3) {
                drawLine(canvas, paint2, mutPoint, mutPoint2, f2);
                return;
            }
            matrix.reset();
            matrix.preRotate((float) Math.toDegrees(Math.atan2(mutPoint2.f18204y - mutPoint.f18204y, mutPoint2.f18203x - mutPoint.f18203x)), (float) mutPoint.f18203x, (float) mutPoint.f18204y);
            matrix.preTranslate((float) mutPoint.f18203x, (float) mutPoint.f18204y);
            float fSqrt = (float) Math.sqrt(Math.pow(mutPoint2.f18203x - mutPoint.f18203x, 2.0d) + Math.pow(mutPoint2.f18204y - mutPoint.f18204y, 2.0d));
            matrix.preScale(fSqrt, fSqrt);
            float f4 = 1.0f / (f3 - f2);
            matrix.preScale(f4, f4);
            matrix.preTranslate(-f2, 0.0f);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawLine((float) mutPoint.f18203x, (float) mutPoint.f18204y, (float) mutPoint2.f18203x, (float) mutPoint2.f18204y, paint);
        }

        public void drawLine(Canvas canvas, Paint paint, MutPoint mutPoint, MutPoint mutPoint2, float f2) {
            paint.setColor(MapGradientPolyline.interpolateColor(this.colors, f2));
            canvas.drawLine((float) mutPoint.f18203x, (float) mutPoint.f18204y, (float) mutPoint2.f18203x, (float) mutPoint2.f18204y, paint);
        }

        @Override // com.google.android.gms.maps.model.TileProvider
        public Tile getTile(int i2, int i3, int i4) {
            int i5 = this.tileDimension;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Matrix matrix = new Matrix();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.width);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setFlags(1);
            paint.setShader(new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, this.colors, (float[]) null, Shader.TileMode.CLAMP));
            paint.getShader().setLocalMatrix(matrix);
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(this.width);
            paint2.setStrokeCap(Paint.Cap.BUTT);
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setFlags(1);
            renderTrail(canvas, matrix, paint, paint2, (float) (Math.pow(2.0d, i4) * ((double) this.density)), i2, i3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int i6 = this.tileDimension;
            return new Tile(i6, i6, byteArrayOutputStream.toByteArray());
        }

        public void renderTrail(Canvas canvas, Matrix matrix, Paint paint, Paint paint2, float f2, int i2, int i3) {
            MutPoint mutPoint = new MutPoint();
            MutPoint mutPoint2 = new MutPoint();
            MutPoint mutPoint3 = new MutPoint();
            MutPoint mutPoint4 = new MutPoint();
            MutPoint mutPoint5 = new MutPoint();
            Canvas canvas2 = canvas;
            if (this.points.size() == 1) {
                mutPoint.set(this.projectedPts[0], f2, i2, i3, this.tileDimension);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(MapGradientPolyline.interpolateColor(this.colors, 1.0f));
                canvas2.drawCircle((float) mutPoint.f18203x, (float) mutPoint.f18204y, paint2.getStrokeWidth() / 2.0f, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                return;
            }
            int i4 = 2;
            if (this.points.size() == 2) {
                mutPoint.set(this.projectedPts[0], f2, i2, i3, this.tileDimension);
                mutPoint2.set(this.projectedPts[1], f2, i2, i3, this.tileDimension);
                drawLine(canvas2, paint2, mutPoint, mutPoint2, 0.0f);
                return;
            }
            while (i4 < this.points.size()) {
                int i5 = i4 - 2;
                mutPoint.set(this.projectedPts[i5], f2, i2, i3, this.tileDimension);
                int i6 = i4 - 1;
                mutPoint2.set(this.projectedPts[i6], f2, i2, i3, this.tileDimension);
                mutPoint3.set(this.projectedPts[i4], f2, i2, i3, this.tileDimension);
                mutPoint4.set(this.projectedPtMids[i5], f2, i2, i3, this.tileDimension);
                mutPoint5.set(this.projectedPtMids[i6], f2, i2, i3, this.tileDimension);
                float f3 = i4;
                float size = (f3 - 2.0f) / this.points.size();
                float size2 = (f3 - 1.0f) / this.points.size();
                float f4 = (size + size2) / 2.0f;
                String.valueOf(f4);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(MapGradientPolyline.interpolateColor(this.colors, f4));
                canvas2.drawCircle((float) mutPoint2.f18203x, (float) mutPoint2.f18204y, paint2.getStrokeWidth() / 2.0f, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                drawLine(canvas2, matrix, paint, paint2, i5 == 0 ? mutPoint : mutPoint4, mutPoint2, size, f4);
                canvas2 = canvas2;
                drawLine(canvas2, matrix, paint, paint2, mutPoint2, i4 == this.points.size() + (-1) ? mutPoint3 : mutPoint5, f4, size2);
                i4++;
            }
        }
    }

    public static class MutPoint {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public double f18203x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public double f18204y;

        public MutPoint set(Point point, float f2, int i2, int i3, int i4) {
            double d2 = f2;
            this.f18203x = (point.f3534x * d2) - ((double) (i2 * i4));
            this.f18204y = (point.f3535y * d2) - ((double) (i3 * i4));
            return this;
        }
    }

    public MapGradientPolyline(Context context) {
        super(context);
        this.context = context;
    }

    private TileOverlayOptions createTileOverlayOptions() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.zIndex);
        tileOverlayOptions.tileProvider(new AirMapGradientPolylineProvider(this.context, this.points, this.colors, this.width));
        return tileOverlayOptions;
    }

    public static int interpolateColor(int[] iArr, float f2) {
        float length = f2 * (iArr.length - 1);
        int iRed = 0;
        int iGreen = 0;
        int iBlue = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float fMax = Math.max(1.0f - Math.abs(length - i2), 0.0f);
            iRed += (int) (Color.red(iArr[i2]) * fMax);
            iGreen += (int) (Color.green(iArr[i2]) * fMax);
            iBlue += (int) (Color.blue(iArr[i2]) * fMax);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    @Override // com.rnmaps.maps.MapFeature
    public void addToMap(Object obj) {
        GoogleMap googleMap = (GoogleMap) obj;
        this.map = googleMap;
        this.tileOverlay = googleMap.addTileOverlay(createTileOverlayOptions());
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.tileOverlay;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void removeFromMap(Object obj) {
        this.tileOverlay.remove();
    }

    public void setCoordinates(List<LatLng> list) {
        this.points = list;
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.map;
        if (googleMap != null) {
            this.tileOverlay = googleMap.addTileOverlay(createTileOverlayOptions());
        }
    }

    public void setStrokeColors(int[] iArr) {
        this.colors = iArr;
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.map;
        if (googleMap != null) {
            this.tileOverlay = googleMap.addTileOverlay(createTileOverlayOptions());
        }
    }

    public void setWidth(float f2) {
        this.width = f2;
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.map;
        if (googleMap != null) {
            this.tileOverlay = googleMap.addTileOverlay(createTileOverlayOptions());
        }
    }

    public void setZIndex(float f2) {
        this.zIndex = f2;
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f2);
        }
    }
}
