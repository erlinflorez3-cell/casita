package com.rnmaps.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.android.gms.maps.model.UrlTileProvider;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class MapTileProvider implements TileProvider {
    protected static final int BUFFER_SIZE = 16384;
    protected static final int TARGET_TILE_SIZE = 512;
    protected Context context;
    protected boolean customMode;
    protected boolean doubleTileSize;
    protected boolean flipY;
    protected int maximumNativeZ;
    protected int maximumZ;
    protected int minimumZ;
    protected boolean offlineMode;
    protected int tileCacheMaxAge;
    protected String tileCachePath;
    protected UrlTileProvider tileProvider;
    protected int tileSize;
    protected String urlTemplate;

    class AIRMapUrlTileProvider extends UrlTileProvider {
        private String urlTemplate;

        public AIRMapUrlTileProvider(int i2, int i3, String str) {
            super(i2, i3);
            this.urlTemplate = str;
        }

        @Override // com.google.android.gms.maps.model.UrlTileProvider
        public URL getTileUrl(int i2, int i3, int i4) {
            if (MapTileProvider.this.flipY) {
                i3 = ((1 << i4) - i3) - 1;
            }
            String strReplace = this.urlTemplate.replace("{x}", Integer.toString(i2)).replace("{y}", Integer.toString(i3)).replace("{z}", Integer.toString(i4));
            if (MapTileProvider.this.maximumZ > 0 && i4 > MapTileProvider.this.maximumZ) {
                return null;
            }
            if (MapTileProvider.this.minimumZ > 0 && i4 < MapTileProvider.this.minimumZ) {
                return null;
            }
            try {
                return new URL(strReplace);
            } catch (MalformedURLException e2) {
                throw new AssertionError(e2);
            }
        }

        public void setUrlTemplate(String str) {
            this.urlTemplate = str;
        }
    }

    public MapTileProvider(int i2, boolean z2, String str, int i3, int i4, int i5, boolean z3, String str2, int i6, boolean z4, Context context, boolean z5) {
        this.tileProvider = new AIRMapUrlTileProvider(i2, i2, str);
        this.tileSize = i2;
        this.doubleTileSize = z2;
        this.urlTemplate = str;
        this.maximumZ = i3;
        this.maximumNativeZ = i4;
        this.minimumZ = i5;
        this.flipY = z3;
        this.tileCachePath = str2;
        this.tileCacheMaxAge = i6;
        this.offlineMode = z4;
        this.context = context;
        this.customMode = z5;
    }

    byte[] bitmapToByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return byteArray;
    }

    void checkForRefresh(int i2, int i3, int i4) throws Throwable {
        String tileFilename = getTileFilename(i2, i3, i4);
        if ((System.currentTimeMillis() - new File(tileFilename).lastModified()) / 1000 > this.tileCacheMaxAge) {
            short sXd = (short) (ZN.Xd() ^ 2677);
            short sXd2 = (short) (ZN.Xd() ^ 27295);
            int[] iArr = new int["}{v_uys".length()];
            QB qb = new QB("}{v_uys");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK((xuXd.CK(iKK) - (sXd + i5)) - sXd2);
                i5++;
            }
            new String(iArr, 0, i5);
            C1561oA.od("\u0007\u0019\u0019$\u0016#\u0017\u0017\u001b\u0013", (short) (ZN.Xd() ^ 25308));
            OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(MapTileWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).addTag(tileFilename).setInputData(new Data.Builder().putString(C1561oA.Kd("\u0004\u0002|", (short) (ZN.Xd() ^ 6084)), getTileUrl(i2, i3, i4).toString()).putString(Wg.Zd("(TVkw\u0015\u0012@", (short) (Od.Xd() ^ (-14643)), (short) (Od.Xd() ^ (-22024))), tileFilename).putInt(C1561oA.Xd("\u0015\n\"k\u0013\u0012", (short) (C1580rY.Xd() ^ (-30804))), this.tileCacheMaxAge).build()).build();
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("\u0003\u0011\b\u0017\r\b\u0004N\r\u001a\u001a!\u000b\u0015\u001cVT\u0002\u0002\tr\u0007\u0004", (short) (C1607wl.Xd() ^ 27441))).getMethod(Qg.kd("KHV\"POJF?<NBGE\u0019DBG7ID", (short) (Od.Xd() ^ (-30548)), (short) (Od.Xd() ^ (-29129))), new Class[0]);
            try {
                method.setAccessible(true);
                WorkManager.getInstance((Context) method.invoke(context, objArr)).enqueueUniqueWork(tileFilename, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    byte[] fetchTile(int r9, int r10, int r11) throws java.lang.Throwable {
        /*
            r8 = this;
            java.net.URL r0 = r8.getTileUrl(r9, r10, r11)
            r7 = 0
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42 java.lang.OutOfMemoryError -> L44
            com.dynatrace.android.callback.Callback.openConnection(r0)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42 java.lang.OutOfMemoryError -> L44
            java.io.InputStream r6 = com.dynatrace.android.callback.Callback.getInputStream(r0)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42 java.lang.OutOfMemoryError -> L44
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L39 java.lang.OutOfMemoryError -> L3b java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.io.IOException -> L39 java.lang.OutOfMemoryError -> L3b java.lang.Throwable -> L57
            r4 = 16384(0x4000, float:2.2959E-41)
            byte[] r3 = new byte[r4]     // Catch: java.lang.OutOfMemoryError -> L35 java.io.IOException -> L37 java.lang.Throwable -> L55
        L19:
            r2 = 0
            int r1 = r6.read(r3, r2, r4)     // Catch: java.lang.OutOfMemoryError -> L35 java.io.IOException -> L37 java.lang.Throwable -> L55
            r0 = -1
            if (r1 == r0) goto L25
            r5.write(r3, r2, r1)     // Catch: java.lang.OutOfMemoryError -> L35 java.io.IOException -> L37 java.lang.Throwable -> L55
            goto L19
        L25:
            r5.flush()     // Catch: java.lang.OutOfMemoryError -> L35 java.io.IOException -> L37 java.lang.Throwable -> L55
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.OutOfMemoryError -> L35 java.io.IOException -> L37 java.lang.Throwable -> L55
            if (r6 == 0) goto L31
            r6.close()     // Catch: java.lang.Exception -> L31
        L31:
            r5.close()     // Catch: java.lang.Exception -> L34
        L34:
            return r0
        L35:
            r0 = move-exception
            goto L47
        L37:
            r0 = move-exception
            goto L47
        L39:
            r0 = move-exception
            goto L3c
        L3b:
            r0 = move-exception
        L3c:
            r5 = r7
            goto L47
        L3e:
            r0 = move-exception
            r5 = r7
            r6 = r5
            goto L59
        L42:
            r0 = move-exception
            goto L45
        L44:
            r0 = move-exception
        L45:
            r6 = r7
            r5 = r6
        L47:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L4f
            r6.close()     // Catch: java.lang.Exception -> L4f
        L4f:
            if (r5 == 0) goto L54
            r5.close()     // Catch: java.lang.Exception -> L54
        L54:
            return r7
        L55:
            r0 = move-exception
            goto L59
        L57:
            r0 = move-exception
            r5 = r7
        L59:
            if (r6 == 0) goto L5e
            r6.close()     // Catch: java.lang.Exception -> L5e
        L5e:
            if (r5 == 0) goto L63
            r5.close()     // Catch: java.lang.Exception -> L63
        L63:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnmaps.maps.MapTileProvider.fetchTile(int, int, int):byte[]");
    }

    Bitmap getNewBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        return bitmapCreateBitmap;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public Tile getTile(int i2, int i3, int i4) throws Throwable {
        int i5;
        if (!this.customMode) {
            return this.tileProvider.getTile(i2, i3, i4);
        }
        int i6 = this.maximumZ;
        if (i6 <= 0) {
            i6 = Integer.MAX_VALUE;
        }
        byte[] bArrPullTilesFromHigherZoom = (this.tileSize != 256 || !this.doubleTileSize || (i5 = i4 + 1) > this.maximumNativeZ || i5 > i6) ? null : pullTilesFromHigherZoom(i2, i3, i4);
        if (i4 > this.maximumNativeZ) {
            bArrPullTilesFromHigherZoom = scaleLowerZoomTile(i2, i3, i4, this.maximumNativeZ);
        }
        if (bArrPullTilesFromHigherZoom == null && i4 <= i6) {
            bArrPullTilesFromHigherZoom = getTileImage(i2, i3, i4);
        }
        if (bArrPullTilesFromHigherZoom == null && this.tileCachePath != null && this.offlineMode) {
            int i7 = this.maximumNativeZ;
            int iMax = Math.max(this.minimumZ, i4 - 3);
            for (int i8 = i4 > i7 ? i7 - 1 : i4 - 1; i8 >= iMax; i8--) {
                bArrPullTilesFromHigherZoom = scaleLowerZoomTile(i2, i3, i4, i8);
                if (bArrPullTilesFromHigherZoom != null) {
                    break;
                }
            }
        }
        if (bArrPullTilesFromHigherZoom == null) {
            return null;
        }
        int i9 = this.tileSize;
        return new Tile(i9, i9, bArrPullTilesFromHigherZoom);
    }

    String getTileFilename(int i2, int i3, int i4) {
        if (this.tileCachePath == null) {
            return null;
        }
        return this.tileCachePath + '/' + i4 + RemoteSettings.FORWARD_SLASH_STRING + i2 + RemoteSettings.FORWARD_SLASH_STRING + i3;
    }

    byte[] getTileImage(int i2, int i3, int i4) throws Throwable {
        byte[] bArrFetchTile;
        String strVd = hg.Vd("znph\"dabfb\u001ca_m[_\u0016==G\u0012W_a\u000e", (short) (C1499aX.Xd() ^ (-14345)), (short) (C1499aX.Xd() ^ (-8579)));
        String strUd = C1561oA.ud("\u000b~\u0001x2tqrvr,qo}ko&RMVU!fnp\u001d", (short) (C1580rY.Xd() ^ (-6141)));
        String str = this.tileCachePath;
        C1561oA.yd("?;4\u001b/1)", (short) (C1633zX.Xd() ^ (-76)));
        String strYd = C1561oA.Yd("[", (short) (Od.Xd() ^ (-11909)));
        if (str != null) {
            bArrFetchTile = readTileImage(i2, i3, i4);
            if (bArrFetchTile != null) {
                String str2 = Xg.qd("LBF@{@?BHF\u0002+-9\u0006MW[\n", (short) (C1607wl.Xd() ^ 2881), (short) (C1607wl.Xd() ^ 4276)) + i4 + strYd + i2 + strYd + i3;
            } else {
                String str3 = Jg.Wd("5U\u0004H/>g5D\rrL\u0014I\u0015\f}2\u0002Z", (short) (C1633zX.Xd() ^ (-25478)), (short) (C1633zX.Xd() ^ (-18343))) + i4 + strYd + i2 + strYd + i3;
            }
            if (bArrFetchTile != null && !this.offlineMode) {
                checkForRefresh(i2, i3, i4);
            }
        } else {
            bArrFetchTile = null;
        }
        if (bArrFetchTile == null && !this.offlineMode && this.tileCachePath != null) {
            String tileFilename = getTileFilename(i2, i3, i4);
            OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(MapTileWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).addTag(tileFilename).setInputData(new Data.Builder().putString(ZO.xd("3X\u000b", (short) (C1499aX.Xd() ^ (-19836)), (short) (C1499aX.Xd() ^ (-32733))), getTileUrl(i2, i3, i4).toString()).putString(C1626yg.Ud("lw@\u0017DXe\u0007", (short) (Od.Xd() ^ (-14060)), (short) (Od.Xd() ^ (-20991))), tileFilename).putInt(Ig.wd(">\u0005i\u0013X\t", (short) (FB.Xd() ^ 31898)), -1).build()).build();
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("([\u00022h/\u0010, je\u0010+44\u0012S\u00109y)r\u001b", (short) (C1633zX.Xd() ^ (-28673)))).getMethod(C1561oA.Qd("\u0014\u0011\u001fj\u0019\u0018\u0013\u000f\b\u0005\u0017\u000b\u0010\u000ea\r\u000b\u0010\u007f\u0012\r", (short) (Od.Xd() ^ (-9604))), new Class[0]);
            try {
                method.setAccessible(true);
                WorkManager workManager = WorkManager.getInstance((Context) method.invoke(context, objArr));
                try {
                    workManager.enqueueUniqueWork(tileFilename, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild).getResult().get(1L, TimeUnit.SECONDS);
                    Thread.sleep(500L);
                    List<WorkInfo> list = workManager.getWorkInfosByTag(tileFilename).get(1L, TimeUnit.SECONDS);
                    C1593ug.zd("~|w`vztJ1", (short) (Od.Xd() ^ (-501)), (short) (Od.Xd() ^ (-1747)));
                    list.get(0).toString();
                    if (this.tileCachePath != null) {
                        bArrFetchTile = readTileImage(i2, i3, i4);
                        if (bArrFetchTile != null) {
                            String str4 = strVd + i4 + strYd + i2 + strYd + i3;
                        } else {
                            String str5 = strUd + i4 + strYd + i2 + strYd + i3;
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } else if (bArrFetchTile == null && !this.offlineMode) {
            C1561oA.od("HhjdWa\u0014YWeSW", (short) (C1633zX.Xd() ^ (-23718)));
            bArrFetchTile = fetchTile(i2, i3, i4);
            if (bArrFetchTile == null) {
                String str6 = C1561oA.Kd("\u001c\u0012\u0016\u0010K\u0013\u0013#\u0013\u0019Q\u0007|\u0002z\u0006\r\rYi[\u0003~\b\f`(26d", (short) (Od.Xd() ^ (-14338))) + i4 + strYd + i2 + strYd + i3;
            }
        }
        return bArrFetchTile;
    }

    protected URL getTileUrl(int i2, int i3, int i4) {
        return this.tileProvider.getTileUrl(i2, i3, i4);
    }

    byte[] pullTilesFromHigherZoom(int i2, int i3, int i4) throws Throwable {
        Bitmap newBitmap = getNewBitmap();
        Canvas canvas = new Canvas(newBitmap);
        Paint paint = new Paint();
        int i5 = i2 * 2;
        int i6 = i3 * 2;
        int i7 = i4 + 1;
        byte[] tileImage = getTileImage(i5, i6, i7);
        int i8 = i6 + 1;
        byte[] tileImage2 = getTileImage(i5, i8, i7);
        int i9 = i5 + 1;
        byte[] tileImage3 = getTileImage(i9, i6, i7);
        byte[] tileImage4 = getTileImage(i9, i8, i7);
        if (tileImage == null || tileImage2 == null || tileImage3 == null || tileImage4 == null) {
            return null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(tileImage, 0, tileImage.length);
        canvas.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, paint);
        bitmapDecodeByteArray.recycle();
        Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(tileImage2, 0, tileImage2.length);
        canvas.drawBitmap(bitmapDecodeByteArray2, 0.0f, 256.0f, paint);
        bitmapDecodeByteArray2.recycle();
        Bitmap bitmapDecodeByteArray3 = BitmapFactory.decodeByteArray(tileImage3, 0, tileImage3.length);
        canvas.drawBitmap(bitmapDecodeByteArray3, 256.0f, 0.0f, paint);
        bitmapDecodeByteArray3.recycle();
        Bitmap bitmapDecodeByteArray4 = BitmapFactory.decodeByteArray(tileImage4, 0, tileImage4.length);
        canvas.drawBitmap(bitmapDecodeByteArray4, 256.0f, 256.0f, paint);
        bitmapDecodeByteArray4.recycle();
        byte[] bArrBitmapToByteArray = bitmapToByteArray(newBitmap);
        newBitmap.recycle();
        return bArrBitmapToByteArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    byte[] readTileImage(int r10, int r11, int r12) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = r9.getTileFilename(r10, r11, r12)
            r8 = 0
            if (r0 != 0) goto L8
            return r8
        L8:
            java.io.File r7 = new java.io.File
            r7.<init>(r0)
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d java.lang.OutOfMemoryError -> L4f
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d java.lang.OutOfMemoryError -> L4f
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L44 java.lang.OutOfMemoryError -> L46 java.lang.Throwable -> L62
            r5.<init>()     // Catch: java.io.IOException -> L44 java.lang.OutOfMemoryError -> L46 java.lang.Throwable -> L62
            r4 = 16384(0x4000, float:2.2959E-41)
            byte[] r3 = new byte[r4]     // Catch: java.lang.OutOfMemoryError -> L40 java.io.IOException -> L42 java.lang.Throwable -> L60
        L1b:
            r2 = 0
            int r1 = r6.read(r3, r2, r4)     // Catch: java.lang.OutOfMemoryError -> L40 java.io.IOException -> L42 java.lang.Throwable -> L60
            r0 = -1
            if (r1 == r0) goto L27
            r5.write(r3, r2, r1)     // Catch: java.lang.OutOfMemoryError -> L40 java.io.IOException -> L42 java.lang.Throwable -> L60
            goto L1b
        L27:
            r5.flush()     // Catch: java.lang.OutOfMemoryError -> L40 java.io.IOException -> L42 java.lang.Throwable -> L60
            int r0 = r9.tileCacheMaxAge     // Catch: java.lang.OutOfMemoryError -> L40 java.io.IOException -> L42 java.lang.Throwable -> L60
            if (r0 != 0) goto L35
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.OutOfMemoryError -> L40 java.io.IOException -> L42 java.lang.Throwable -> L60
            r7.setLastModified(r0)     // Catch: java.lang.OutOfMemoryError -> L40 java.io.IOException -> L42 java.lang.Throwable -> L60
        L35:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.OutOfMemoryError -> L40 java.io.IOException -> L42 java.lang.Throwable -> L60
            r6.close()     // Catch: java.lang.Exception -> L3c
        L3c:
            r5.close()     // Catch: java.lang.Exception -> L3f
        L3f:
            return r0
        L40:
            r0 = move-exception
            goto L52
        L42:
            r0 = move-exception
            goto L52
        L44:
            r0 = move-exception
            goto L47
        L46:
            r0 = move-exception
        L47:
            r5 = r8
            goto L52
        L49:
            r0 = move-exception
            r5 = r8
            r6 = r5
            goto L64
        L4d:
            r0 = move-exception
            goto L50
        L4f:
            r0 = move-exception
        L50:
            r6 = r8
            r5 = r6
        L52:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L5a
            r6.close()     // Catch: java.lang.Exception -> L5a
        L5a:
            if (r5 == 0) goto L5f
            r5.close()     // Catch: java.lang.Exception -> L5f
        L5f:
            return r8
        L60:
            r0 = move-exception
            goto L64
        L62:
            r0 = move-exception
            r5 = r8
        L64:
            if (r6 == 0) goto L69
            r6.close()     // Catch: java.lang.Exception -> L69
        L69:
            if (r5 == 0) goto L6e
            r5.close()     // Catch: java.lang.Exception -> L6e
        L6e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnmaps.maps.MapTileProvider.readTileImage(int, int, int):byte[]");
    }

    byte[] scaleLowerZoomTile(int i2, int i3, int i4, int i5) throws Throwable {
        int i6 = i4 - i5;
        int i7 = 1 << i6;
        int i8 = i2 % i7;
        int i9 = i3 % i7;
        Bitmap newBitmap = getNewBitmap();
        Canvas canvas = new Canvas(newBitmap);
        Paint paint = new Paint();
        byte[] tileImage = getTileImage(i2 >> i6, i3 >> i6, i4 - i6);
        if (tileImage == null) {
            return null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(tileImage, 0, tileImage.length);
        int i10 = this.tileSize / i7;
        int i11 = i8 * i10;
        int i12 = i9 * i10;
        canvas.drawBitmap(bitmapDecodeByteArray, new Rect(i11, i12, i11 + i10, i10 + i12), new Rect(0, 0, 512, 512), paint);
        bitmapDecodeByteArray.recycle();
        byte[] bArrBitmapToByteArray = bitmapToByteArray(newBitmap);
        newBitmap.recycle();
        return bArrBitmapToByteArray;
    }

    public void setCustomMode() {
    }

    public void setDoubleTileSize(boolean z2) {
        this.doubleTileSize = z2;
    }

    public void setFlipY(boolean z2) {
        this.flipY = z2;
    }

    public void setMaximumNativeZ(int i2) {
        this.maximumNativeZ = i2;
    }

    public void setMaximumZ(int i2) {
        this.maximumZ = i2;
    }

    public void setMinimumZ(int i2) {
        this.minimumZ = i2;
    }

    public void setOfflineMode(boolean z2) {
        this.offlineMode = z2;
    }

    public void setTileCacheMaxAge(int i2) {
        this.tileCacheMaxAge = i2;
    }

    public void setTileCachePath(String str) {
        this.tileCachePath = str;
    }

    public void setTileSize(int i2) {
        if (this.tileSize != i2) {
            this.tileProvider = new AIRMapUrlTileProvider(i2, i2, this.urlTemplate);
        }
        this.tileSize = i2;
    }

    public void setUrlTemplate(String str) {
        this.urlTemplate = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean writeTileImage(byte[] r6, int r7, int r8, int r9) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = r5.getTileFilename(r7, r8, r9)
            r4 = 0
            if (r0 != 0) goto L8
            return r4
        L8:
            r3 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.OutOfMemoryError -> L27 java.io.IOException -> L29 java.lang.Throwable -> L33
            r2.<init>(r0)     // Catch: java.lang.OutOfMemoryError -> L27 java.io.IOException -> L29 java.lang.Throwable -> L33
            java.io.File r0 = r2.getParentFile()     // Catch: java.lang.OutOfMemoryError -> L27 java.io.IOException -> L29 java.lang.Throwable -> L33
            r0.mkdirs()     // Catch: java.lang.OutOfMemoryError -> L27 java.io.IOException -> L29 java.lang.Throwable -> L33
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.OutOfMemoryError -> L27 java.io.IOException -> L29 java.lang.Throwable -> L33
            r1.<init>(r2)     // Catch: java.lang.OutOfMemoryError -> L27 java.io.IOException -> L29 java.lang.Throwable -> L33
            r1.write(r6)     // Catch: java.io.IOException -> L22 java.lang.OutOfMemoryError -> L24 java.lang.Throwable -> L35
            r1.close()     // Catch: java.lang.Exception -> L20
        L20:
            r0 = 1
            return r0
        L22:
            r0 = move-exception
            goto L25
        L24:
            r0 = move-exception
        L25:
            r3 = r1
            goto L2a
        L27:
            r0 = move-exception
            goto L2a
        L29:
            r0 = move-exception
        L2a:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L32
            r3.close()     // Catch: java.lang.Exception -> L32
        L32:
            return r4
        L33:
            r0 = move-exception
            goto L37
        L35:
            r0 = move-exception
            r3 = r1
        L37:
            if (r3 == 0) goto L3c
            r3.close()     // Catch: java.lang.Exception -> L3c
        L3c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnmaps.maps.MapTileProvider.writeTileImage(byte[], int, int, int):boolean");
    }
}
