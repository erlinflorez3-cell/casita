package com.google.maps.android.data.kml;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Geometry;
import com.google.maps.android.data.MultiGeometry;
import com.google.maps.android.data.Renderer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class KmlRenderer extends Renderer {
    private static final String LOG_TAG = "KmlRenderer";
    private ArrayList<KmlContainer> mContainers;
    private boolean mGroundOverlayImagesDownloaded;
    private final Set<String> mGroundOverlayUrls;
    private boolean mMarkerIconsDownloaded;

    private class GroundOverlayImageDownload extends AsyncTask<String, Void, Bitmap> {
        private final String mGroundOverlayUrl;

        public GroundOverlayImageDownload(String str) {
            this.mGroundOverlayUrl = str;
            KmlRenderer.this.downloadStarted();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.getBitmapFromUrl(this.mGroundOverlayUrl);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.mGroundOverlayUrl);
            } catch (IOException e2) {
                String str = "Image [" + this.mGroundOverlayUrl + "] download issue";
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                String str = "Image at this URL could not be found " + this.mGroundOverlayUrl;
            } else {
                KmlRenderer.this.cacheBitmap(this.mGroundOverlayUrl, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.addGroundOverlayToMap(this.mGroundOverlayUrl, kmlRenderer.getGroundOverlayMap(), true);
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.addGroundOverlayInContainerGroups(this.mGroundOverlayUrl, kmlRenderer2.mContainers, true);
                }
            }
            KmlRenderer.this.downloadFinished();
        }
    }

    private class MarkerIconImageDownload extends AsyncTask<String, Void, Bitmap> {
        private final String mIconUrl;

        public MarkerIconImageDownload(String str) {
            this.mIconUrl = str;
            KmlRenderer.this.downloadStarted();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.getBitmapFromUrl(this.mIconUrl);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.mIconUrl);
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                String str = "Image at this URL could not be found " + this.mIconUrl;
            } else {
                KmlRenderer.this.cacheBitmap(this.mIconUrl, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.addIconToMarkers(this.mIconUrl, kmlRenderer.getAllFeatures());
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.addContainerGroupIconsToMarkers(this.mIconUrl, kmlRenderer2.mContainers);
                }
            }
            KmlRenderer.this.downloadFinished();
        }
    }

    KmlRenderer(GoogleMap googleMap, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) {
        super(googleMap, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
        this.mGroundOverlayUrls = new HashSet();
        this.mMarkerIconsDownloaded = false;
        this.mGroundOverlayImagesDownloaded = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContainerGroupIconsToMarkers(String str, Iterable<KmlContainer> iterable) {
        for (KmlContainer kmlContainer : iterable) {
            addIconToMarkers(str, kmlContainer.getPlacemarksHashMap());
            if (kmlContainer.hasContainers()) {
                addContainerGroupIconsToMarkers(str, kmlContainer.getContainers());
            }
        }
    }

    private void addContainerGroupToMap(Iterable<KmlContainer> iterable, boolean z2) {
        for (KmlContainer kmlContainer : iterable) {
            boolean containerVisibility = getContainerVisibility(kmlContainer, z2);
            if (kmlContainer.getStyles() != null) {
                putStyles(kmlContainer.getStyles());
            }
            if (kmlContainer.getStyleMap() != null) {
                super.assignStyleMap(kmlContainer.getStyleMap(), getStylesRenderer());
            }
            addContainerObjectToMap(kmlContainer, containerVisibility);
            if (kmlContainer.hasContainers()) {
                addContainerGroupToMap(kmlContainer.getContainers(), containerVisibility);
            }
        }
    }

    private void addContainerObjectToMap(KmlContainer kmlContainer, boolean z2) {
        for (KmlPlacemark kmlPlacemark : kmlContainer.getPlacemarks()) {
            boolean z3 = z2 && getPlacemarkVisibility(kmlPlacemark);
            if (kmlPlacemark.getGeometry() != null) {
                KmlPlacemark kmlPlacemark2 = kmlPlacemark;
                Object objAddKmlPlacemarkToMap = addKmlPlacemarkToMap(kmlPlacemark2, kmlPlacemark.getGeometry(), getPlacemarkStyle(kmlPlacemark.getId()), kmlPlacemark2.getInlineStyle(), z3);
                kmlContainer.setPlacemark(kmlPlacemark2, objAddKmlPlacemarkToMap);
                putContainerFeature(objAddKmlPlacemarkToMap, kmlPlacemark);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroundOverlayInContainerGroups(String str, Iterable<KmlContainer> iterable, boolean z2) {
        for (KmlContainer kmlContainer : iterable) {
            boolean containerVisibility = getContainerVisibility(kmlContainer, z2);
            addGroundOverlayToMap(str, kmlContainer.getGroundOverlayHashMap(), containerVisibility);
            if (kmlContainer.hasContainers()) {
                addGroundOverlayInContainerGroups(str, kmlContainer.getContainers(), containerVisibility);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroundOverlayToMap(String str, HashMap<KmlGroundOverlay, GroundOverlay> map, boolean z2) {
        BitmapDescriptor cachedGroundOverlayImage = getCachedGroundOverlayImage(str);
        for (KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            if (kmlGroundOverlay.getImageUrl().equals(str)) {
                GroundOverlay groundOverlayAttachGroundOverlay = attachGroundOverlay(kmlGroundOverlay.getGroundOverlayOptions().image(cachedGroundOverlayImage));
                if (!z2) {
                    groundOverlayAttachGroundOverlay.setVisible(false);
                }
                map.put(kmlGroundOverlay, groundOverlayAttachGroundOverlay);
            }
        }
    }

    private void addGroundOverlays(HashMap<KmlGroundOverlay, GroundOverlay> map) {
        for (KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            String imageUrl = kmlGroundOverlay.getImageUrl();
            if (imageUrl != null && kmlGroundOverlay.getLatLngBox() != null) {
                if (getCachedGroundOverlayImage(imageUrl) != null) {
                    addGroundOverlayToMap(imageUrl, map, true);
                } else {
                    this.mGroundOverlayUrls.add(imageUrl);
                }
            }
        }
    }

    private void addGroundOverlays(HashMap<KmlGroundOverlay, GroundOverlay> map, Iterable<KmlContainer> iterable) {
        addGroundOverlays(map);
        for (KmlContainer kmlContainer : iterable) {
            addGroundOverlays(kmlContainer.getGroundOverlayHashMap(), kmlContainer.getContainers());
        }
    }

    private void addIconToGeometry(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, Geometry geometry, Object obj) {
        if (geometry == null) {
            return;
        }
        if ("Point".equals(geometry.getGeometryType())) {
            addIconToMarker(str, kmlStyle, kmlStyle2, (Marker) obj);
        } else if ("MultiGeometry".equals(geometry.getGeometryType())) {
            addIconToMultiGeometry(str, kmlStyle, kmlStyle2, (MultiGeometry) geometry, (List) obj);
        }
    }

    private void addIconToMarker(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, Marker marker) {
        boolean z2 = kmlStyle2 != null && str.equals(kmlStyle2.getIconUrl());
        boolean z3 = kmlStyle != null && str.equals(kmlStyle.getIconUrl());
        if (z2) {
            scaleBitmap(kmlStyle2, marker);
        } else if (z3) {
            scaleBitmap(kmlStyle, marker);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIconToMarkers(String str, HashMap<KmlPlacemark, Object> map) {
        for (KmlPlacemark kmlPlacemark : map.keySet()) {
            addIconToGeometry(str, getStylesRenderer().get(kmlPlacemark.getId()), kmlPlacemark.getInlineStyle(), kmlPlacemark.getGeometry(), map.get(kmlPlacemark));
        }
    }

    private void addIconToMultiGeometry(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, MultiGeometry multiGeometry, List<Object> list) {
        Iterator<Geometry> it = multiGeometry.getGeometryObject().iterator();
        Iterator<Object> it2 = list.iterator();
        while (it.hasNext() && it2.hasNext()) {
            addIconToGeometry(str, kmlStyle, kmlStyle2, it.next(), it2.next());
        }
    }

    private void addPlacemarksToMap(HashMap<? extends Feature, Object> map) {
        Iterator<? extends Feature> it = map.keySet().iterator();
        while (it.hasNext()) {
            addFeature(it.next());
        }
    }

    private void downloadGroundOverlays() {
        this.mGroundOverlayImagesDownloaded = true;
        Iterator<String> it = this.mGroundOverlayUrls.iterator();
        while (it.hasNext()) {
            new GroundOverlayImageDownload(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    private void downloadMarkerIcons() {
        this.mMarkerIconsDownloaded = true;
        Iterator<String> it = getMarkerIconUrls().iterator();
        while (it.hasNext()) {
            new MarkerIconImageDownload(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getBitmapFromUrl(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        return BitmapFactory.decodeStream(openConnectionCheckRedirects(uRLConnectionOpenConnection));
    }

    static boolean getContainerVisibility(KmlContainer kmlContainer, boolean z2) {
        return z2 && (!kmlContainer.hasProperty("visibility") || Integer.parseInt(kmlContainer.getProperty("visibility")) != 0);
    }

    private InputStream openConnectionCheckRedirects(URLConnection uRLConnection) throws Exception {
        InputStream inputStream;
        boolean z2;
        HttpURLConnection httpURLConnection;
        int responseCode;
        int i2 = 0;
        do {
            boolean z3 = uRLConnection instanceof HttpURLConnection;
            if (z3) {
                ((HttpURLConnection) uRLConnection).setInstanceFollowRedirects(false);
            }
            inputStream = Callback.getInputStream(uRLConnection);
            if (!z3 || (responseCode = Callback.getResponseCode((httpURLConnection = (HttpURLConnection) uRLConnection))) < 300 || responseCode > 307 || responseCode == 306 || responseCode == 304) {
                z2 = false;
            } else {
                URL url = httpURLConnection.getURL();
                String headerField = Callback.getHeaderField(httpURLConnection, "Location");
                URL url2 = headerField != null ? new URL(url, headerField) : null;
                httpURLConnection.disconnect();
                if (url2 == null || (!(url2.getProtocol().equals("http") || url2.getProtocol().equals("https")) || i2 >= 5)) {
                    throw new SecurityException("illegal URL redirect");
                }
                uRLConnection = url2.openConnection();
                Callback.openConnection(uRLConnection);
                i2++;
                z2 = true;
            }
        } while (z2);
        return inputStream;
    }

    private void removeContainers(Iterable<KmlContainer> iterable) {
        for (KmlContainer kmlContainer : iterable) {
            removePlacemarks(kmlContainer.getPlacemarksHashMap());
            removeGroundOverlays(kmlContainer.getGroundOverlayHashMap());
            removeContainers(kmlContainer.getContainers());
        }
    }

    private void removePlacemarks(HashMap<? extends Feature, Object> map) {
        removeFeatures(map);
    }

    private void scaleBitmap(KmlStyle kmlStyle, Marker marker) {
        marker.setIcon(getCachedMarkerImage(kmlStyle.getIconUrl(), kmlStyle.getIconScale()));
    }

    public void addLayerToMap() {
        setLayerVisibility(true);
        this.mContainers = getContainerList();
        putStyles();
        assignStyleMap(getStyleMaps(), getStylesRenderer());
        addGroundOverlays(getGroundOverlayMap(), this.mContainers);
        addContainerGroupToMap(this.mContainers, true);
        addPlacemarksToMap(getAllFeatures());
        if (!this.mGroundOverlayImagesDownloaded) {
            downloadGroundOverlays();
        }
        if (!this.mMarkerIconsDownloaded) {
            downloadMarkerIcons();
        }
        checkClearBitmapCache();
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return getGroundOverlayMap().keySet();
    }

    Iterable<? extends Feature> getKmlPlacemarks() {
        return getFeatures();
    }

    public Iterable<KmlContainer> getNestedContainers() {
        return this.mContainers;
    }

    boolean hasKmlPlacemarks() {
        return hasFeatures();
    }

    public boolean hasNestedContainers() {
        return this.mContainers.size() > 0;
    }

    public void removeLayerFromMap() {
        removePlacemarks(getAllFeatures());
        removeGroundOverlays(getGroundOverlayMap());
        if (hasNestedContainers()) {
            removeContainers(getNestedContainers());
        }
        setLayerVisibility(false);
        clearStylesRenderer();
    }

    @Override // com.google.maps.android.data.Renderer
    public void setMap(GoogleMap googleMap) {
        removeLayerFromMap();
        super.setMap(googleMap);
        addLayerToMap();
    }

    void storeKmlData(HashMap<String, KmlStyle> map, HashMap<String, String> map2, HashMap<KmlPlacemark, Object> map3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, GroundOverlay> map4) {
        storeData(map, map2, map3, arrayList, map4);
    }

    void storeKmzData(HashMap<String, KmlStyle> map, HashMap<String, String> map2, HashMap<KmlPlacemark, Object> map3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, GroundOverlay> map4, HashMap<String, Bitmap> map5) {
        storeData(map, map2, map3, arrayList, map4);
        for (Map.Entry<String, Bitmap> entry : map5.entrySet()) {
            cacheBitmap(entry.getKey(), entry.getValue());
        }
    }
}
