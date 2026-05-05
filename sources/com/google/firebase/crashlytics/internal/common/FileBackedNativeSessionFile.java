package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
class FileBackedNativeSessionFile implements NativeSessionFile {
    private final String dataTransportFilename;
    private final File file;
    private final String reportsEndpointFilename;

    FileBackedNativeSessionFile(String str, String str2, File file) {
        this.dataTransportFilename = str;
        this.reportsEndpointFilename = str2;
        this.file = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] asGzippedBytes() {
        /*
            r7 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r6 = new byte[r0]
            r5 = 0
            java.io.InputStream r4 = r7.getStream()     // Catch: java.io.IOException -> L60
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L54
            r3.<init>()     // Catch: java.lang.Throwable -> L54
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4a
            if (r4 != 0) goto L16
            goto L3e
        L16:
            int r1 = r4.read(r6)     // Catch: java.lang.Throwable -> L34
            if (r1 <= 0) goto L21
            r0 = 0
            r2.write(r6, r0, r1)     // Catch: java.lang.Throwable -> L34
            goto L16
        L21:
            r2.finish()     // Catch: java.lang.Throwable -> L34
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L34
            r2.close()     // Catch: java.lang.Throwable -> L4a
            r3.close()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L33
            r4.close()     // Catch: java.io.IOException -> L60
        L33:
            return r0
        L34:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L4a
        L3d:
            throw r1     // Catch: java.lang.Throwable -> L4a
        L3e:
            r2.close()     // Catch: java.lang.Throwable -> L4a
            r3.close()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.io.IOException -> L60
        L49:
            return r5
        L4a:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L54
        L53:
            throw r1     // Catch: java.lang.Throwable -> L54
        L54:
            r1 = move-exception
            if (r4 == 0) goto L5f
            r4.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.io.IOException -> L60
        L5f:
            throw r1     // Catch: java.io.IOException -> L60
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile.asGzippedBytes():byte[]");
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] bArrAsGzippedBytes = asGzippedBytes();
        if (bArrAsGzippedBytes != null) {
            return CrashlyticsReport.FilesPayload.File.builder().setContents(bArrAsGzippedBytes).setFilename(this.dataTransportFilename).build();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public String getReportsEndpointFilename() {
        return this.reportsEndpointFilename;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public InputStream getStream() {
        if (this.file.exists() && this.file.isFile()) {
            try {
                return new FileInputStream(this.file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
