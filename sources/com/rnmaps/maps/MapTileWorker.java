package com.rnmaps.maps;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public class MapTileWorker extends Worker {
    private static final int BUFFER_SIZE = 16384;

    public MapTileWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] fetchTile(java.net.URL r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r7 = 0
            java.io.InputStream r6 = r9.openStream()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L37 java.lang.OutOfMemoryError -> L39
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L2e java.lang.OutOfMemoryError -> L30 java.lang.Throwable -> L4c
            r5.<init>()     // Catch: java.io.IOException -> L2e java.lang.OutOfMemoryError -> L30 java.lang.Throwable -> L4c
            r4 = 16384(0x4000, float:2.2959E-41)
            byte[] r3 = new byte[r4]     // Catch: java.lang.OutOfMemoryError -> L2a java.io.IOException -> L2c java.lang.Throwable -> L4a
        Le:
            r2 = 0
            int r1 = r6.read(r3, r2, r4)     // Catch: java.lang.OutOfMemoryError -> L2a java.io.IOException -> L2c java.lang.Throwable -> L4a
            r0 = -1
            if (r1 == r0) goto L1a
            r5.write(r3, r2, r1)     // Catch: java.lang.OutOfMemoryError -> L2a java.io.IOException -> L2c java.lang.Throwable -> L4a
            goto Le
        L1a:
            r5.flush()     // Catch: java.lang.OutOfMemoryError -> L2a java.io.IOException -> L2c java.lang.Throwable -> L4a
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.OutOfMemoryError -> L2a java.io.IOException -> L2c java.lang.Throwable -> L4a
            if (r6 == 0) goto L26
            r6.close()     // Catch: java.lang.Exception -> L26
        L26:
            r5.close()     // Catch: java.lang.Exception -> L29
        L29:
            return r0
        L2a:
            r0 = move-exception
            goto L3c
        L2c:
            r0 = move-exception
            goto L3c
        L2e:
            r0 = move-exception
            goto L31
        L30:
            r0 = move-exception
        L31:
            r5 = r7
            goto L3c
        L33:
            r0 = move-exception
            r5 = r7
            r6 = r5
            goto L4e
        L37:
            r0 = move-exception
            goto L3a
        L39:
            r0 = move-exception
        L3a:
            r6 = r7
            r5 = r6
        L3c:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L44
            r6.close()     // Catch: java.lang.Exception -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.lang.Exception -> L49
        L49:
            return r7
        L4a:
            r0 = move-exception
            goto L4e
        L4c:
            r0 = move-exception
            r5 = r7
        L4e:
            if (r6 == 0) goto L53
            r6.close()     // Catch: java.lang.Exception -> L53
        L53:
            if (r5 == 0) goto L58
            r5.close()     // Catch: java.lang.Exception -> L58
        L58:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnmaps.maps.MapTileWorker.fetchTile(java.net.URL):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean writeTileImage(byte[] r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r4 = 0
            if (r7 != 0) goto L4
            return r4
        L4:
            r3 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.OutOfMemoryError -> L23 java.io.IOException -> L25 java.lang.Throwable -> L2f
            r2.<init>(r7)     // Catch: java.lang.OutOfMemoryError -> L23 java.io.IOException -> L25 java.lang.Throwable -> L2f
            java.io.File r0 = r2.getParentFile()     // Catch: java.lang.OutOfMemoryError -> L23 java.io.IOException -> L25 java.lang.Throwable -> L2f
            r0.mkdirs()     // Catch: java.lang.OutOfMemoryError -> L23 java.io.IOException -> L25 java.lang.Throwable -> L2f
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.OutOfMemoryError -> L23 java.io.IOException -> L25 java.lang.Throwable -> L2f
            r1.<init>(r2)     // Catch: java.lang.OutOfMemoryError -> L23 java.io.IOException -> L25 java.lang.Throwable -> L2f
            r1.write(r6)     // Catch: java.io.IOException -> L1e java.lang.OutOfMemoryError -> L20 java.lang.Throwable -> L31
            r1.close()     // Catch: java.lang.Exception -> L1c
        L1c:
            r0 = 1
            return r0
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            r3 = r1
            goto L26
        L23:
            r0 = move-exception
            goto L26
        L25:
            r0 = move-exception
        L26:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L2e
            r3.close()     // Catch: java.lang.Exception -> L2e
        L2e:
            return r4
        L2f:
            r0 = move-exception
            goto L33
        L31:
            r0 = move-exception
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            r3.close()     // Catch: java.lang.Exception -> L38
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnmaps.maps.MapTileWorker.writeTileImage(byte[], java.lang.String):boolean");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() throws Throwable {
        String string = getInputData().getString("filename");
        try {
            int i2 = getInputData().getInt("maxAge", 0);
            if (i2 >= 0) {
                if ((System.currentTimeMillis() - new File(string).lastModified()) / 1000 < i2) {
                    return ListenableWorker.Result.failure();
                }
            }
            try {
                byte[] bArrFetchTile = fetchTile(new URL(getInputData().getString("url")));
                if (bArrFetchTile == null) {
                    return ListenableWorker.Result.retry();
                }
                if (!writeTileImage(bArrFetchTile, string)) {
                    return ListenableWorker.Result.failure();
                }
                String str = "Worker fetched " + string;
                return ListenableWorker.Result.success();
            } catch (MalformedURLException e2) {
                throw new AssertionError(e2);
            }
        } catch (Error unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
