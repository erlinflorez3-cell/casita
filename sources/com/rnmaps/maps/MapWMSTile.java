package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public class MapWMSTile extends MapUrlTile {
    private static final double FULL = 4.007501669578488E7d;
    private static final double[] mapBound = {-2.003750834789244E7d, 2.003750834789244E7d};

    class AIRMapGSUrlTileProvider extends MapTileProvider {

        class AIRMapWMSTileProvider extends UrlTileProvider {
            private final int tileSize;
            private String urlTemplate;

            public AIRMapWMSTileProvider(int i2, int i3, String str) {
                super(i2, i3);
                this.urlTemplate = str;
                this.tileSize = i2;
            }

            private double[] getBoundingBox(int i2, int i3, int i4) {
                double dPow = MapWMSTile.FULL / Math.pow(2.0d, i4);
                return new double[]{MapWMSTile.mapBound[0] + (((double) i2) * dPow), MapWMSTile.mapBound[1] - (((double) (i3 + 1)) * dPow), MapWMSTile.mapBound[0] + (((double) (i2 + 1)) * dPow), MapWMSTile.mapBound[1] - (((double) i3) * dPow)};
            }

            @Override // com.google.android.gms.maps.model.UrlTileProvider
            public URL getTileUrl(int i2, int i3, int i4) {
                if (MapWMSTile.this.maximumZ > 0.0f && i4 > AIRMapGSUrlTileProvider.this.maximumZ) {
                    return null;
                }
                if (MapWMSTile.this.minimumZ > 0.0f && i4 < AIRMapGSUrlTileProvider.this.minimumZ) {
                    return null;
                }
                double[] boundingBox = getBoundingBox(i2, i3, i4);
                try {
                    return new URL(this.urlTemplate.replace("{minX}", Double.toString(boundingBox[0])).replace("{minY}", Double.toString(boundingBox[1])).replace("{maxX}", Double.toString(boundingBox[2])).replace("{maxY}", Double.toString(boundingBox[3])).replace("{width}", Integer.toString(this.tileSize)).replace("{height}", Integer.toString(this.tileSize)));
                } catch (MalformedURLException e2) {
                    throw new AssertionError(e2);
                }
            }

            public void setUrlTemplate(String str) {
                this.urlTemplate = str;
            }
        }

        public AIRMapGSUrlTileProvider(int i2, String str, int i3, int i4, int i5, String str2, int i6, boolean z2, Context context, boolean z3) {
            super(i2, false, str, i3, i4, i5, false, str2, i6, z2, context, z3);
            this.tileProvider = new AIRMapWMSTileProvider(i2, i2, str);
        }
    }

    public MapWMSTile(Context context) {
        super(context);
    }

    @Override // com.rnmaps.maps.MapUrlTile
    protected TileOverlayOptions createTileOverlayOptions() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.zIndex);
        tileOverlayOptions.transparency(1.0f - this.opacity);
        tileOverlayOptions.tileProvider(new AIRMapGSUrlTileProvider((int) this.tileSize, this.urlTemplate, (int) this.maximumZ, (int) this.maximumNativeZ, (int) this.minimumZ, this.tileCachePath, (int) this.tileCacheMaxAge, this.offlineMode, this.context, this.customTileProviderNeeded));
        return tileOverlayOptions;
    }
}
