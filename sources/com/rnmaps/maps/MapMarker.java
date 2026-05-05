package com.rnmaps.maps;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.braze.models.IBrazeLocation;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.collections.MarkerManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class MapMarker extends MapFeature {
    private boolean anchorIsSet;
    private float anchorX;
    private float anchorY;
    private boolean calloutAnchorIsSet;
    private float calloutAnchorX;
    private float calloutAnchorY;
    private MapCallout calloutView;
    private final Context context;
    private DataSource<CloseableReference<CloseableImage>> dataSource;
    private boolean draggable;
    private boolean flat;
    private boolean hasCustomMarkerView;
    private int height;
    private Bitmap iconBitmap;
    private BitmapDescriptor iconBitmapDescriptor;
    private String identifier;
    private String imageUri;
    private final DraweeHolder<?> logoHolder;
    private Bitmap mLastBitmapCreated;
    private final ControllerListener<ImageInfo> mLogoControllerListener;
    private Marker marker;
    private float markerHue;
    private final MapMarkerManager markerManager;
    private MarkerOptions markerOptions;
    private float opacity;
    private LatLng position;
    private float rotation;
    private String snippet;
    private String title;
    private boolean tracksViewChanges;
    private boolean tracksViewChangesActive;
    private int width;
    private View wrappedCalloutView;
    private int zIndex;

    public MapMarker(Context context, MarkerOptions markerOptions, MapMarkerManager mapMarkerManager) {
        super(context);
        this.markerHue = 0.0f;
        this.rotation = 0.0f;
        this.flat = false;
        this.draggable = false;
        this.zIndex = 0;
        this.opacity = 1.0f;
        this.tracksViewChanges = true;
        this.tracksViewChangesActive = false;
        this.hasCustomMarkerView = false;
        this.mLogoControllerListener = new BaseControllerListener<ImageInfo>() { // from class: com.rnmaps.maps.MapMarker.1
            @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
            public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) throws Throwable {
                CloseableReference closeableReference;
                Bitmap underlyingBitmap;
                try {
                    closeableReference = (CloseableReference) MapMarker.this.dataSource.getResult();
                    if (closeableReference != null) {
                        try {
                            CloseableImage closeableImage = (CloseableImage) closeableReference.get();
                            if ((closeableImage instanceof CloseableStaticBitmap) && (underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap()) != null) {
                                Bitmap bitmapCopy = underlyingBitmap.copy(Bitmap.Config.ARGB_8888, true);
                                MapMarker.this.iconBitmap = bitmapCopy;
                                MapMarker.this.iconBitmapDescriptor = BitmapDescriptorFactory.fromBitmap(bitmapCopy);
                            }
                        } catch (Throwable th) {
                            th = th;
                            MapMarker.this.dataSource.close();
                            if (closeableReference != null) {
                                CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
                            }
                            throw th;
                        }
                    }
                    MapMarker.this.dataSource.close();
                    if (closeableReference != null) {
                        CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
                    }
                    if (MapMarker.this.markerManager != null && MapMarker.this.imageUri != null) {
                        MapMarker.this.markerManager.getSharedIcon(MapMarker.this.imageUri).updateIcon(MapMarker.this.iconBitmapDescriptor, MapMarker.this.iconBitmap);
                    }
                    MapMarker.this.update(true);
                } catch (Throwable th2) {
                    th = th2;
                    closeableReference = null;
                }
            }
        };
        this.mLastBitmapCreated = null;
        this.context = context;
        this.markerManager = mapMarkerManager;
        DraweeHolder<?> draweeHolderCreate = DraweeHolder.create(createDraweeHierarchy(), context);
        this.logoHolder = draweeHolderCreate;
        draweeHolderCreate.onAttach();
        this.position = markerOptions.getPosition();
        setAnchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        setCalloutAnchor(markerOptions.getInfoWindowAnchorU(), markerOptions.getInfoWindowAnchorV());
        setTitle(markerOptions.getTitle());
        setSnippet(markerOptions.getSnippet());
        setRotation(markerOptions.getRotation());
        setFlat(markerOptions.isFlat());
        setDraggable(markerOptions.isDraggable());
        setZIndex(Math.round(markerOptions.getZIndex()));
        setAlpha(markerOptions.getAlpha());
        this.iconBitmapDescriptor = markerOptions.getIcon();
    }

    public MapMarker(Context context, MapMarkerManager mapMarkerManager) {
        super(context);
        this.markerHue = 0.0f;
        this.rotation = 0.0f;
        this.flat = false;
        this.draggable = false;
        this.zIndex = 0;
        this.opacity = 1.0f;
        this.tracksViewChanges = true;
        this.tracksViewChangesActive = false;
        this.hasCustomMarkerView = false;
        this.mLogoControllerListener = new BaseControllerListener<ImageInfo>() { // from class: com.rnmaps.maps.MapMarker.1
            @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
            public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) throws Throwable {
                CloseableReference closeableReference;
                Bitmap underlyingBitmap;
                try {
                    closeableReference = (CloseableReference) MapMarker.this.dataSource.getResult();
                    if (closeableReference != null) {
                        try {
                            CloseableImage closeableImage = (CloseableImage) closeableReference.get();
                            if ((closeableImage instanceof CloseableStaticBitmap) && (underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap()) != null) {
                                Bitmap bitmapCopy = underlyingBitmap.copy(Bitmap.Config.ARGB_8888, true);
                                MapMarker.this.iconBitmap = bitmapCopy;
                                MapMarker.this.iconBitmapDescriptor = BitmapDescriptorFactory.fromBitmap(bitmapCopy);
                            }
                        } catch (Throwable th) {
                            th = th;
                            MapMarker.this.dataSource.close();
                            if (closeableReference != null) {
                                CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
                            }
                            throw th;
                        }
                    }
                    MapMarker.this.dataSource.close();
                    if (closeableReference != null) {
                        CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
                    }
                    if (MapMarker.this.markerManager != null && MapMarker.this.imageUri != null) {
                        MapMarker.this.markerManager.getSharedIcon(MapMarker.this.imageUri).updateIcon(MapMarker.this.iconBitmapDescriptor, MapMarker.this.iconBitmap);
                    }
                    MapMarker.this.update(true);
                } catch (Throwable th2) {
                    th = th2;
                    closeableReference = null;
                }
            }
        };
        this.mLastBitmapCreated = null;
        this.context = context;
        this.markerManager = mapMarkerManager;
        DraweeHolder<?> draweeHolderCreate = DraweeHolder.create(createDraweeHierarchy(), context);
        this.logoHolder = draweeHolderCreate;
        draweeHolderCreate.onAttach();
    }

    private void clearDrawableCache() {
        this.mLastBitmapCreated = null;
    }

    private Bitmap createDrawable() {
        int i2 = this.width;
        if (i2 <= 0) {
            i2 = 100;
        }
        int i3 = this.height;
        int i4 = i3 > 0 ? i3 : 100;
        buildDrawingCache();
        Bitmap bitmapCreateBitmap = this.mLastBitmapCreated;
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || bitmapCreateBitmap.getWidth() != i2 || bitmapCreateBitmap.getHeight() != i4) {
            bitmapCreateBitmap = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
            this.mLastBitmapCreated = bitmapCreateBitmap;
        } else {
            bitmapCreateBitmap.eraseColor(0);
        }
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private GenericDraweeHierarchy createDraweeHierarchy() {
        return new GenericDraweeHierarchyBuilder(getResources()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER).setFadeDuration(0).build();
    }

    private MarkerOptions fillMarkerOptions(MarkerOptions markerOptions) {
        markerOptions.position(this.position);
        if (this.anchorIsSet) {
            markerOptions.anchor(this.anchorX, this.anchorY);
        }
        if (this.calloutAnchorIsSet) {
            markerOptions.infoWindowAnchor(this.calloutAnchorX, this.calloutAnchorY);
        }
        markerOptions.title(this.title);
        markerOptions.snippet(this.snippet);
        markerOptions.rotation(this.rotation);
        markerOptions.flat(this.flat);
        markerOptions.draggable(this.draggable);
        markerOptions.zIndex(this.zIndex);
        markerOptions.alpha(this.opacity);
        markerOptions.icon(getIcon());
        return markerOptions;
    }

    private BitmapDescriptor getBitmapDescriptorByName(String str) {
        return BitmapDescriptorFactory.fromResource(getDrawableResourceByName(str));
    }

    private int getDrawableResourceByName(String str) throws Throwable {
        Resources resources = getResources();
        Context context = getContext();
        short sXd = (short) (C1607wl.Xd() ^ 31117);
        int[] iArr = new int["4@5B>71y.97<,49q\u00061/4$61".length()];
        QB qb = new QB("4@5B>71y.97<,49q\u00061/4$61");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("\u0017\u0014&\u0001\u0015\u0016!\u0016\u001f\u001c\b\u001a) ", (short) (C1607wl.Xd() ^ 9499)), new Class[0]);
        try {
            method.setAccessible(true);
            return resources.getIdentifier(str, C1561oA.Yd("bqaxcepj", (short) (C1499aX.Xd() ^ (-13242))), (String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private BitmapDescriptor getIcon() {
        if (!this.hasCustomMarkerView) {
            BitmapDescriptor bitmapDescriptor = this.iconBitmapDescriptor;
            return bitmapDescriptor != null ? bitmapDescriptor : BitmapDescriptorFactory.defaultMarker(this.markerHue);
        }
        if (this.iconBitmapDescriptor == null) {
            return BitmapDescriptorFactory.fromBitmap(createDrawable());
        }
        Bitmap bitmapCreateDrawable = createDrawable();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(this.iconBitmap.getWidth(), bitmapCreateDrawable.getWidth()), Math.max(this.iconBitmap.getHeight(), bitmapCreateDrawable.getHeight()), this.iconBitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(this.iconBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapCreateDrawable, 0.0f, 0.0f, (Paint) null);
        return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
    }

    private void updateTracksViewChanges() throws Throwable {
        boolean z2 = this.tracksViewChanges && this.hasCustomMarkerView && this.marker != null;
        if (z2 == this.tracksViewChangesActive) {
            return;
        }
        this.tracksViewChangesActive = z2;
        if (z2) {
            ViewChangesTracker.getInstance().addMarker(this);
        } else {
            ViewChangesTracker.getInstance().removeMarker(this);
            updateMarkerIcon();
        }
    }

    private void wrapCalloutView() {
        MapCallout mapCallout = this.calloutView;
        if (mapCallout == null || mapCallout.getChildCount() == 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(this.calloutView.width, this.calloutView.height, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(this.calloutView.width, this.calloutView.height, 0.0f));
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(this.calloutView);
        this.wrappedCalloutView = linearLayout;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void addToMap(Object obj) throws Throwable {
        this.marker = ((MarkerManager.Collection) obj).addMarker(getMarkerOptions());
        updateTracksViewChanges();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) throws Throwable {
        super.addView(view, i2);
        if (!(view instanceof MapCallout)) {
            this.hasCustomMarkerView = true;
            updateTracksViewChanges();
        }
        update(true);
    }

    public void animateToCoodinate(LatLng latLng, Integer num) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.marker, (Property<Marker, V>) Property.of(Marker.class, LatLng.class, ViewProps.POSITION), new TypeEvaluator<LatLng>() { // from class: com.rnmaps.maps.MapMarker.2
            @Override // android.animation.TypeEvaluator
            public LatLng evaluate(float f2, LatLng latLng2, LatLng latLng3) {
                return MapMarker.this.interpolate(f2, latLng2, latLng3);
            }
        }, latLng);
        objectAnimatorOfObject.setDuration(num.intValue());
        objectAnimatorOfObject.start();
    }

    public View getCallout() {
        if (this.calloutView == null) {
            return null;
        }
        if (this.wrappedCalloutView == null) {
            wrapCalloutView();
        }
        if (this.calloutView.getTooltip()) {
            return this.wrappedCalloutView;
        }
        return null;
    }

    public MapCallout getCalloutView() {
        return this.calloutView;
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.marker;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public View getInfoContents() {
        if (this.calloutView == null) {
            return null;
        }
        if (this.wrappedCalloutView == null) {
            wrapCalloutView();
        }
        if (this.calloutView.getTooltip()) {
            return null;
        }
        return this.wrappedCalloutView;
    }

    public MarkerOptions getMarkerOptions() {
        if (this.markerOptions == null) {
            this.markerOptions = new MarkerOptions();
        }
        fillMarkerOptions(this.markerOptions);
        return this.markerOptions;
    }

    public LatLng getPosition() {
        return this.position;
    }

    public LatLng interpolate(float f2, LatLng latLng, LatLng latLng2) {
        double d2 = f2;
        return new LatLng(((latLng2.latitude - latLng.latitude) * d2) + latLng.latitude, ((latLng2.longitude - latLng.longitude) * d2) + latLng.longitude);
    }

    @Override // com.rnmaps.maps.MapFeature
    public void removeFromMap(Object obj) throws Throwable {
        Marker marker = this.marker;
        if (marker == null) {
            return;
        }
        ((MarkerManager.Collection) obj).remove(marker);
        this.marker = null;
        updateTracksViewChanges();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View, android.view.ViewParent
    public void requestLayout() throws Throwable {
        super.requestLayout();
        if (getChildCount() == 0 && this.hasCustomMarkerView) {
            this.hasCustomMarkerView = false;
            clearDrawableCache();
            updateTracksViewChanges();
            update(true);
        }
    }

    public void setAnchor(double d2, double d3) {
        this.anchorIsSet = true;
        float f2 = (float) d2;
        this.anchorX = f2;
        float f3 = (float) d3;
        this.anchorY = f3;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setAnchor(f2, f3);
        }
        update(false);
    }

    public void setCalloutAnchor(double d2, double d3) {
        this.calloutAnchorIsSet = true;
        float f2 = (float) d2;
        this.calloutAnchorX = f2;
        float f3 = (float) d3;
        this.calloutAnchorY = f3;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setInfoWindowAnchor(f2, f3);
        }
        update(false);
    }

    public void setCalloutView(MapCallout mapCallout) {
        this.calloutView = mapCallout;
    }

    public void setCoordinate(ReadableMap readableMap) {
        LatLng latLng = new LatLng(readableMap.getDouble(IBrazeLocation.LATITUDE), readableMap.getDouble(IBrazeLocation.LONGITUDE));
        this.position = latLng;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setPosition(latLng);
        }
        update(false);
    }

    public void setDraggable(boolean z2) {
        this.draggable = z2;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setDraggable(z2);
        }
        update(false);
    }

    public void setFlat(boolean z2) {
        this.flat = z2;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setFlat(z2);
        }
        update(false);
    }

    public void setIconBitmap(Bitmap bitmap) {
        this.iconBitmap = bitmap;
    }

    public void setIconBitmapDescriptor(BitmapDescriptor bitmapDescriptor, Bitmap bitmap) {
        this.iconBitmapDescriptor = bitmapDescriptor;
        this.iconBitmap = bitmap;
        update(true);
    }

    public void setIdentifier(String str) {
        this.identifier = str;
        update(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setImage(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnmaps.maps.MapMarker.setImage(java.lang.String):void");
    }

    public void setMarkerHue(float f2) {
        this.markerHue = f2;
        update(false);
    }

    public void setOpacity(float f2) {
        this.opacity = f2;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setAlpha(f2);
        }
        update(false);
    }

    @Override // android.view.View
    public void setRotation(float f2) {
        this.rotation = f2;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setRotation(f2);
        }
        update(false);
    }

    public void setSnippet(String str) {
        this.snippet = str;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setSnippet(str);
        }
        update(false);
    }

    public void setTitle(String str) {
        this.title = str;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setTitle(str);
        }
        update(false);
    }

    public void setTracksViewChanges(boolean z2) {
        this.tracksViewChanges = z2;
        updateTracksViewChanges();
    }

    public void setZIndex(int i2) {
        this.zIndex = i2;
        Marker marker = this.marker;
        if (marker != null) {
            marker.setZIndex(i2);
        }
        update(false);
    }

    public void update(int i2, int i3) {
        this.width = i2;
        this.height = i3;
        update(true);
    }

    public void update(boolean z2) {
        if (this.marker == null) {
            return;
        }
        if (z2) {
            updateMarkerIcon();
        }
        if (this.anchorIsSet) {
            this.marker.setAnchor(this.anchorX, this.anchorY);
        } else {
            this.marker.setAnchor(0.5f, 1.0f);
        }
        if (this.calloutAnchorIsSet) {
            this.marker.setInfoWindowAnchor(this.calloutAnchorX, this.calloutAnchorY);
        } else {
            this.marker.setInfoWindowAnchor(0.5f, 0.0f);
        }
    }

    public boolean updateCustomForTracking() {
        if (!this.tracksViewChangesActive) {
            return false;
        }
        updateMarkerIcon();
        return true;
    }

    public void updateMarkerIcon() {
        Marker marker = this.marker;
        if (marker == null) {
            return;
        }
        marker.setIcon(getIcon());
    }
}
