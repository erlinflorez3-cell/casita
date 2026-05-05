package androidx.camera.video.internal.utils;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class OutputUtil {
    private static final String TAG = "OutputUtil";

    private OutputUtil() {
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x004b: MOVE (r5 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:21:0x004b */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getAbsolutePathFromUri(android.content.ContentResolver r12, android.net.Uri r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r0 = 1
            r5 = 0
            r7 = r13
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch: java.lang.RuntimeException -> L2b java.lang.Throwable -> L4d
            r0 = 0
            r8[r0] = r14     // Catch: java.lang.RuntimeException -> L2b java.lang.Throwable -> L4d
            r10 = 0
            r11 = 0
            r9 = 0
            r6 = r12
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.RuntimeException -> L2b java.lang.Throwable -> L4d
            if (r4 != 0) goto L18
            if (r4 == 0) goto L17
            r4.close()
        L17:
            return r5
        L18:
            int r0 = r4.getColumnIndexOrThrow(r14)     // Catch: java.lang.RuntimeException -> L29 java.lang.Throwable -> L4a
            r4.moveToFirst()     // Catch: java.lang.RuntimeException -> L29 java.lang.Throwable -> L4a
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.RuntimeException -> L29 java.lang.Throwable -> L4a
            if (r4 == 0) goto L28
            r4.close()
        L28:
            return r0
        L29:
            r0 = move-exception
            goto L2d
        L2b:
            r0 = move-exception
            r4 = r5
        L2d:
            java.lang.String r3 = "OutputUtil"
            java.lang.String r2 = "Failed in getting absolute path for Uri %s with Exception %s"
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch: java.lang.Throwable -> L4a
            androidx.camera.core.Logger.e(r3, r0)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L49
            r4.close()
        L49:
            return r5
        L4a:
            r0 = move-exception
            r5 = r4
            goto L4e
        L4d:
            r0 = move-exception
        L4e:
            if (r5 == 0) goto L53
            r5.close()
        L53:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.utils.OutputUtil.getAbsolutePathFromUri(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }

    public static boolean createParentFolder(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
    }
}
