package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public class MapUrlTile extends MapFeature {
    protected Context context;
    protected boolean customTileProviderNeeded;
    protected boolean doubleTileSize;
    protected boolean flipY;
    protected float maximumNativeZ;
    protected float maximumZ;
    protected float minimumZ;
    protected boolean offlineMode;
    protected float opacity;
    protected float tileCacheMaxAge;
    protected String tileCachePath;
    protected TileOverlay tileOverlay;
    protected TileOverlayOptions tileOverlayOptions;
    protected MapTileProvider tileProvider;
    protected float tileSize;
    protected String urlTemplate;
    protected float zIndex;

    public MapUrlTile(Context context) {
        super(context);
        this.maximumNativeZ = 100.0f;
        this.flipY = false;
        this.tileSize = 256.0f;
        this.doubleTileSize = false;
        this.offlineMode = false;
        this.opacity = 1.0f;
        this.customTileProviderNeeded = false;
        this.context = context;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void addToMap(Object obj) {
        this.tileOverlay = ((GoogleMap) obj).addTileOverlay(getTileOverlayOptions());
    }

    protected TileOverlayOptions createTileOverlayOptions() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.zIndex);
        tileOverlayOptions.transparency(1.0f - this.opacity);
        MapTileProvider mapTileProvider = new MapTileProvider((int) this.tileSize, this.doubleTileSize, this.urlTemplate, (int) this.maximumZ, (int) this.maximumNativeZ, (int) this.minimumZ, this.flipY, this.tileCachePath, (int) this.tileCacheMaxAge, this.offlineMode, this.context, this.customTileProviderNeeded);
        this.tileProvider = mapTileProvider;
        tileOverlayOptions.tileProvider(mapTileProvider);
        return tileOverlayOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.tileOverlay;
    }

    public TileOverlayOptions getTileOverlayOptions() {
        if (this.tileOverlayOptions == null) {
            this.tileOverlayOptions = createTileOverlayOptions();
        }
        return this.tileOverlayOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void removeFromMap(Object obj) {
        this.tileOverlay.remove();
    }

    protected void setCustomTileProviderMode() {
        this.customTileProviderNeeded = true;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setCustomMode();
        }
    }

    public void setDoubleTileSize(boolean z2) {
        this.doubleTileSize = z2;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setDoubleTileSize(z2);
        }
        setCustomTileProviderMode();
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setFlipY(boolean z2) {
        this.flipY = z2;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setFlipY(z2);
        }
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMaximumNativeZ(float f2) {
        this.maximumNativeZ = f2;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setMaximumNativeZ((int) f2);
        }
        setCustomTileProviderMode();
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMaximumZ(float f2) {
        this.maximumZ = f2;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setMaximumZ((int) f2);
        }
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMinimumZ(float f2) {
        this.minimumZ = f2;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setMinimumZ((int) f2);
        }
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOfflineMode(boolean z2) {
        this.offlineMode = z2;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setOfflineMode(z2);
        }
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOpacity(float f2) {
        this.opacity = f2;
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.setTransparency(1.0f - f2);
        }
    }

    public void setTileCacheMaxAge(float f2) {
        this.tileCacheMaxAge = f2;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setTileCacheMaxAge((int) f2);
        }
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileCachePath(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.tileCachePath = new URL(str).getPath();
        } catch (MalformedURLException unused) {
            this.tileCachePath = str;
        } catch (Exception unused2) {
            return;
        }
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setTileCachePath(str);
        }
        setCustomTileProviderMode();
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileSize(float f2) {
        this.tileSize = f2;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setTileSize((int) f2);
        }
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setUrlTemplate(String str) {
        this.urlTemplate = str;
        MapTileProvider mapTileProvider = this.tileProvider;
        if (mapTileProvider != null) {
            mapTileProvider.setUrlTemplate(str);
        }
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
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
