package com.google.maps.android.heatmaps;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.collection.LongSparseArray;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class HeatmapTileProvider implements TileProvider {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.7d;
    public static final int DEFAULT_RADIUS = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 22;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 512;
    static final double WORLD_WIDTH = 1.0d;
    private Bounds mBounds;
    private int[] mColorMap;
    private double mCustomMaxIntensity;
    private Collection<WeightedLatLng> mData;
    private Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private PointQuadTree<WeightedLatLng> mTree;

    public static class Builder {
        private Collection<WeightedLatLng> data;
        private int radius = 20;
        private Gradient gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.7d;
        private double intensity = 0.0d;

        public HeatmapTileProvider build() {
            if (this.data != null) {
                return new HeatmapTileProvider(this);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.wrapData(collection));
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder maxIntensity(double d2) {
            this.intensity = d2;
            return this;
        }

        public Builder opacity(double d2) {
            this.opacity = d2;
            if (d2 < 0.0d || d2 > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public Builder radius(int i2) {
            this.radius = i2;
            if (i2 < 10 || i2 > 50) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.data = collection;
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            return this;
        }
    }

    static {
        int[] iArr = {Color.rgb(102, JfifUtil.MARKER_APP1, 0), Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    private HeatmapTileProvider(Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        this.mGradient = builder.gradient;
        this.mOpacity = builder.opacity;
        this.mCustomMaxIntensity = builder.intensity;
        int i2 = this.mRadius;
        this.mKernel = generateKernel(i2, ((double) i2) / 3.0d);
        setGradient(this.mGradient);
        setWeightedData(this.mData);
    }

    static Bitmap colorize(double[][] dArr, int[] iArr, double d2) {
        int i2 = iArr[iArr.length - 1];
        double length = ((double) (iArr.length - 1)) / d2;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i3 = 0; i3 < length2; i3++) {
            for (int i4 = 0; i4 < length2; i4++) {
                double d3 = dArr[i4][i3];
                int i5 = (i3 * length2) + i4;
                int i6 = (int) (d3 * length);
                if (d3 == 0.0d) {
                    iArr2[i5] = 0;
                } else if (i6 < iArr.length) {
                    iArr2[i5] = iArr[i6];
                } else {
                    iArr2[i5] = i2;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return bitmapCreateBitmap;
    }

    private static Tile convertBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    static double[][] convolve(double[][] dArr, double[] dArr2) {
        int iFloor = (int) Math.floor(((double) dArr2.length) / 2.0d);
        int length = dArr.length;
        int i2 = length - (iFloor * 2);
        int i3 = iFloor + i2;
        int i4 = i3 - 1;
        int i5 = 1;
        int i6 = 0;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length);
        int i7 = 0;
        while (true) {
            double d2 = 0.0d;
            if (i7 >= length) {
                break;
            }
            int i8 = 0;
            while (i8 < length) {
                double d3 = dArr[i7][i8];
                if (d3 != d2) {
                    int i9 = i7 + iFloor;
                    if (i4 < i9) {
                        i9 = i4;
                    }
                    int i10 = i9 + 1;
                    int i11 = i7 - iFloor;
                    for (int i12 = iFloor > i11 ? iFloor : i11; i12 < i10; i12++) {
                        double[] dArr4 = dArr3[i12];
                        dArr4[i8] = dArr4[i8] + (dArr2[i12 - i11] * d3);
                    }
                }
                i8++;
                d2 = 0.0d;
            }
            i7++;
        }
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i2, i2);
        int i13 = iFloor;
        while (i13 < i3) {
            while (i6 < length) {
                double d4 = dArr3[i13][i6];
                if (d4 != 0.0d) {
                    int i14 = i6 + iFloor;
                    if (i4 < i14) {
                        i14 = i4;
                    }
                    int i15 = i14 + i5;
                    int i16 = i6 - iFloor;
                    for (int i17 = iFloor > i16 ? iFloor : i16; i17 < i15; i17++) {
                        double[] dArr6 = dArr5[i13 - iFloor];
                        int i18 = i17 - iFloor;
                        dArr6[i18] = dArr6[i18] + (dArr2[i17 - i16] * d4);
                    }
                }
                i6++;
                i5 = 1;
            }
            i13++;
            i5 = 1;
            i6 = 0;
        }
        return dArr5;
    }

    static double[] generateKernel(int i2, double d2) {
        double[] dArr = new double[(i2 * 2) + 1];
        for (int i3 = -i2; i3 <= i2; i3++) {
            dArr[i3 + i2] = Math.exp(((double) ((-i3) * i3)) / ((2.0d * d2) * d2));
        }
        return dArr;
    }

    static Bounds getBounds(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d2 = next.getPoint().f3534x;
        double d3 = next.getPoint().f3534x;
        double d4 = next.getPoint().f3535y;
        double d5 = next.getPoint().f3535y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d6 = next2.getPoint().f3534x;
            double d7 = next2.getPoint().f3535y;
            if (d6 < d2) {
                d2 = d6;
            }
            if (d6 > d3) {
                d3 = d6;
            }
            if (d7 < d4) {
                d4 = d7;
            }
            if (d7 > d5) {
                d5 = d7;
            }
        }
        return new Bounds(d2, d3, d4, d5);
    }

    private double[] getMaxIntensities(int i2) {
        int i3;
        double[] dArr = new double[22];
        if (this.mCustomMaxIntensity != 0.0d) {
            for (int i4 = 0; i4 < 22; i4++) {
                dArr[i4] = this.mCustomMaxIntensity;
            }
            return dArr;
        }
        int i5 = 5;
        while (true) {
            if (i5 >= 11) {
                break;
            }
            dArr[i5] = getMaxValue(this.mData, this.mBounds, i2, (int) (Math.pow(2.0d, i5 - 3) * 1280.0d));
            if (i5 == 5) {
                for (int i6 = 0; i6 < i5; i6++) {
                    dArr[i6] = dArr[i5];
                }
            }
            i5++;
        }
        for (i3 = 11; i3 < 22; i3++) {
            dArr[i3] = dArr[10];
        }
        return dArr;
    }

    static double getMaxValue(Collection<WeightedLatLng> collection, Bounds bounds, int i2, int i3) {
        double d2 = bounds.minX;
        double d3 = bounds.maxX;
        double d4 = bounds.minY;
        double d5 = d3 - d2;
        double d6 = bounds.maxY - d4;
        if (d5 <= d6) {
            d5 = d6;
        }
        double d7 = ((double) ((int) (((double) (i3 / (i2 * 2))) + 0.5d))) / d5;
        LongSparseArray longSparseArray = new LongSparseArray();
        double dDoubleValue = 0.0d;
        for (WeightedLatLng weightedLatLng : collection) {
            int i4 = (int) ((weightedLatLng.getPoint().f3534x - d2) * d7);
            int i5 = (int) ((weightedLatLng.getPoint().f3535y - d4) * d7);
            long j2 = i4;
            LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j2);
            if (longSparseArray2 == null) {
                longSparseArray2 = new LongSparseArray();
                longSparseArray.put(j2, longSparseArray2);
            }
            long j3 = i5;
            Double dValueOf = (Double) longSparseArray2.get(j3);
            if (dValueOf == null) {
                dValueOf = Double.valueOf(0.0d);
            }
            Double dValueOf2 = Double.valueOf(dValueOf.doubleValue() + weightedLatLng.getIntensity());
            longSparseArray2.put(j3, dValueOf2);
            if (dValueOf2.doubleValue() > dDoubleValue) {
                dDoubleValue = dValueOf2.doubleValue();
            }
        }
        return dDoubleValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> wrapData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public Tile getTile(int i2, int i3, int i4) {
        double d2;
        double dPow = 1.0d / Math.pow(2.0d, i4);
        int i5 = this.mRadius;
        double d3 = (((double) i5) * dPow) / 512.0d;
        double d4 = ((2.0d * d3) + dPow) / ((double) ((i5 * 2) + 512));
        double d5 = (((double) i2) * dPow) - d3;
        double d6 = (((double) (i2 + 1)) * dPow) + d3;
        double d7 = (((double) i3) * dPow) - d3;
        double d8 = (((double) (i3 + 1)) * dPow) + d3;
        Collection<WeightedLatLng> arrayList = new ArrayList();
        if (d5 < 0.0d) {
            arrayList = this.mTree.search(new Bounds(d5 + 1.0d, 1.0d, d7, d8));
            d2 = -1.0d;
        } else {
            d2 = 1.0d;
            if (d6 > 1.0d) {
                arrayList = this.mTree.search(new Bounds(0.0d, d6 - 1.0d, d7, d8));
            } else {
                d2 = 0.0d;
            }
        }
        Bounds bounds = new Bounds(d5, d6, d7, d8);
        if (!bounds.intersects(new Bounds(this.mBounds.minX - d3, this.mBounds.maxX + d3, this.mBounds.minY - d3, this.mBounds.maxY + d3))) {
            return TileProvider.NO_TILE;
        }
        Collection<T> collectionSearch = this.mTree.search(bounds);
        if (collectionSearch.isEmpty()) {
            return TileProvider.NO_TILE;
        }
        int i6 = this.mRadius;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i6 * 2) + 512, (i6 * 2) + 512);
        for (T t2 : collectionSearch) {
            Point point = t2.getPoint();
            int i7 = (int) ((point.f3534x - d5) / d4);
            int i8 = (int) ((point.f3535y - d7) / d4);
            double[] dArr2 = dArr[i7];
            dArr2[i8] = dArr2[i8] + t2.getIntensity();
        }
        for (WeightedLatLng weightedLatLng : arrayList) {
            Point point2 = weightedLatLng.getPoint();
            int i9 = (int) (((point2.f3534x + d2) - d5) / d4);
            int i10 = (int) ((point2.f3535y - d7) / d4);
            double[] dArr3 = dArr[i9];
            dArr3[i10] = dArr3[i10] + weightedLatLng.getIntensity();
        }
        return convertBitmap(colorize(convolve(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i4]));
    }

    public void setData(Collection<LatLng> collection) {
        setWeightedData(wrapData(collection));
    }

    public void setGradient(Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    public void setMaxIntensity(double d2) {
        this.mCustomMaxIntensity = d2;
        setWeightedData(this.mData);
    }

    public void setOpacity(double d2) {
        this.mOpacity = d2;
        setGradient(this.mGradient);
    }

    public void setRadius(int i2) {
        this.mRadius = i2;
        this.mKernel = generateKernel(i2, ((double) i2) / 3.0d);
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public void setWeightedData(Collection<WeightedLatLng> collection) {
        this.mData = collection;
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("No input points.");
        }
        this.mBounds = getBounds(this.mData);
        this.mTree = new PointQuadTree<>(this.mBounds);
        Iterator<WeightedLatLng> it = this.mData.iterator();
        while (it.hasNext()) {
            this.mTree.add(it.next());
        }
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }
}
