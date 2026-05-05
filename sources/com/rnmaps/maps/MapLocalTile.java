package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;

/* JADX INFO: loaded from: classes5.dex */
public class MapLocalTile extends MapFeature {
    private String pathTemplate;
    private TileOverlay tileOverlay;
    private TileOverlayOptions tileOverlayOptions;
    private AIRMapLocalTileProvider tileProvider;
    private float tileSize;
    private boolean useAssets;
    private float zIndex;

    class AIRMapLocalTileProvider implements TileProvider {
        private static final int BUFFER_SIZE = 16384;
        private String pathTemplate;
        private int tileSize;
        private final boolean useAssets;

        public AIRMapLocalTileProvider(int i2, String str, boolean z2) {
            this.tileSize = i2;
            this.pathTemplate = str;
            this.useAssets = z2;
        }

        private String getTileFilename(int i2, int i3, int i4) {
            return this.pathTemplate.replace("{x}", Integer.toString(i2)).replace("{y}", Integer.toString(i3)).replace("{z}", Integer.toString(i4));
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private byte[] readTileImage(int r11, int r12, int r13) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.String r5 = r10.getTileFilename(r11, r12, r13)
                r9 = 0
                boolean r0 = r10.useAssets     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                if (r0 == 0) goto L5e
                com.rnmaps.maps.MapLocalTile r0 = com.rnmaps.maps.MapLocalTile.this     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                android.content.Context r7 = r0.getContext()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                java.lang.String r3 = "\u001d)\u001e+' \u001ab\u0017\" %\u0015\u001d\"Zn\u001a\u0018\u001d\r\u001f\u001a"
                r1 = -28624(0xffffffffffff9030, float:NaN)
                r2 = -3655(0xfffffffffffff1b9, float:NaN)
                int r0 = yg.C1499aX.Xd()
                r0 = r0 ^ r1
                short r1 = (short) r0
                int r0 = yg.C1499aX.Xd()
                r0 = r0 ^ r2
                short r0 = (short) r0
                java.lang.String r0 = yg.Qg.kd(r3, r1, r0)
                java.lang.Class r8 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                r0 = 0
                java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                r0 = 0
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                java.lang.String r3 = "VSa-^]N\\Z"
                r1 = -19833(0xffffffffffffb287, float:NaN)
                r2 = -25797(0xffffffffffff9b3b, float:NaN)
                int r0 = yg.C1633zX.Xd()
                r0 = r0 ^ r1
                short r1 = (short) r0
                int r0 = yg.C1633zX.Xd()
                r0 = r0 ^ r2
                short r0 = (short) r0
                java.lang.String r0 = yg.hg.Vd(r3, r1, r0)
                java.lang.reflect.Method r1 = r8.getMethod(r0, r6)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                r0 = 1
                r1.setAccessible(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L58 java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                java.lang.Object r0 = r1.invoke(r7, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L58 java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                android.content.res.AssetManager r0 = (android.content.res.AssetManager) r0     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                java.io.InputStream r6 = r0.open(r5)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                goto L63
            L58:
                r0 = move-exception
                java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                throw r0     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
            L5e:
                java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
                r6.<init>(r5)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98 java.lang.OutOfMemoryError -> L9a
            L63:
                java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L90 java.lang.OutOfMemoryError -> L92
                r5.<init>()     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L90 java.lang.OutOfMemoryError -> L92
                r4 = 16384(0x4000, float:2.2959E-41)
                byte[] r3 = new byte[r4]     // Catch: java.io.IOException -> L88 java.lang.OutOfMemoryError -> L8a java.lang.Throwable -> Lae
            L6c:
                r2 = 0
                int r1 = r6.read(r3, r2, r4)     // Catch: java.io.IOException -> L88 java.lang.OutOfMemoryError -> L8a java.lang.Throwable -> Lae
                r0 = -1
                if (r1 == r0) goto L78
                r5.write(r3, r2, r1)     // Catch: java.io.IOException -> L88 java.lang.OutOfMemoryError -> L8a java.lang.Throwable -> Lae
                goto L6c
            L78:
                r5.flush()     // Catch: java.io.IOException -> L88 java.lang.OutOfMemoryError -> L8a java.lang.Throwable -> Lae
                byte[] r0 = r5.toByteArray()     // Catch: java.io.IOException -> L88 java.lang.OutOfMemoryError -> L8a java.lang.Throwable -> Lae
                if (r6 == 0) goto L84
                r6.close()     // Catch: java.lang.Exception -> L84
            L84:
                r5.close()     // Catch: java.lang.Exception -> L87
            L87:
                return r0
            L88:
                r0 = move-exception
                goto L8b
            L8a:
                r0 = move-exception
            L8b:
                goto L9d
            L8c:
                r0 = move-exception
                r5 = r9
                r9 = r6
                goto Lb0
            L90:
                r0 = move-exception
                goto L93
            L92:
                r0 = move-exception
            L93:
                r5 = r9
                goto L9d
            L95:
                r0 = move-exception
                r5 = r9
                goto Lb0
            L98:
                r0 = move-exception
                goto L9b
            L9a:
                r0 = move-exception
            L9b:
                r6 = r9
                r5 = r6
            L9d:
                r0.printStackTrace()     // Catch: java.lang.Throwable -> Lab
                if (r6 == 0) goto La5
                r6.close()     // Catch: java.lang.Exception -> La5
            La5:
                if (r5 == 0) goto Laa
                r5.close()     // Catch: java.lang.Exception -> Laa
            Laa:
                return r9
            Lab:
                r0 = move-exception
                r9 = r6
                goto Lb0
            Lae:
                r0 = move-exception
                r9 = r6
            Lb0:
                if (r9 == 0) goto Lb5
                r9.close()     // Catch: java.lang.Exception -> Lb5
            Lb5:
                if (r5 == 0) goto Lba
                r5.close()     // Catch: java.lang.Exception -> Lba
            Lba:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rnmaps.maps.MapLocalTile.AIRMapLocalTileProvider.readTileImage(int, int, int):byte[]");
        }

        @Override // com.google.android.gms.maps.model.TileProvider
        public Tile getTile(int i2, int i3, int i4) throws Throwable {
            byte[] tileImage = readTileImage(i2, i3, i4);
            if (tileImage == null) {
                return TileProvider.NO_TILE;
            }
            int i5 = this.tileSize;
            return new Tile(i5, i5, tileImage);
        }

        public void setPathTemplate(String str) {
            this.pathTemplate = str;
        }

        public void setTileSize(int i2) {
            this.tileSize = i2;
        }
    }

    public MapLocalTile(Context context) {
        super(context);
    }

    private TileOverlayOptions createTileOverlayOptions() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.zIndex);
        AIRMapLocalTileProvider aIRMapLocalTileProvider = new AIRMapLocalTileProvider((int) this.tileSize, this.pathTemplate, this.useAssets);
        this.tileProvider = aIRMapLocalTileProvider;
        tileOverlayOptions.tileProvider(aIRMapLocalTileProvider);
        return tileOverlayOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void addToMap(Object obj) {
        this.tileOverlay = ((GoogleMap) obj).addTileOverlay(getTileOverlayOptions());
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

    public void setPathTemplate(String str) {
        this.pathTemplate = str;
        AIRMapLocalTileProvider aIRMapLocalTileProvider = this.tileProvider;
        if (aIRMapLocalTileProvider != null) {
            aIRMapLocalTileProvider.setPathTemplate(str);
        }
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileSize(float f2) {
        this.tileSize = f2;
        AIRMapLocalTileProvider aIRMapLocalTileProvider = this.tileProvider;
        if (aIRMapLocalTileProvider != null) {
            aIRMapLocalTileProvider.setTileSize((int) f2);
        }
    }

    public void setUseAssets(boolean z2) {
        this.useAssets = z2;
    }

    public void setZIndex(float f2) {
        this.zIndex = f2;
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f2);
        }
    }
}
