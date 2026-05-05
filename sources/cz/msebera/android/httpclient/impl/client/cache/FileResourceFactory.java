package cz.msebera.android.httpclient.impl.client.cache;

import cz.msebera.android.httpclient.client.cache.Resource;
import cz.msebera.android.httpclient.client.cache.ResourceFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes5.dex */
public class FileResourceFactory implements ResourceFactory {
    private final File cacheDir;
    private final BasicIdGenerator idgen = new BasicIdGenerator();

    public FileResourceFactory(File file) {
        this.cacheDir = file;
    }

    private File generateUniqueCacheFile(String str) {
        StringBuilder sb = new StringBuilder();
        this.idgen.generate(sb);
        sb.append('.');
        int iMin = Math.min(str.length(), 100);
        for (int i2 = 0; i2 < iMin; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isLetterOrDigit(cCharAt) || cCharAt == '.') {
                sb.append(cCharAt);
            } else {
                sb.append(Soundex.SILENT_MARKER);
            }
        }
        return new File(this.cacheDir, sb.toString());
    }

    @Override // cz.msebera.android.httpclient.client.cache.ResourceFactory
    public Resource copy(String str, Resource resource) throws IOException {
        File fileGenerateUniqueCacheFile = generateUniqueCacheFile(str);
        if (resource instanceof FileResource) {
            IOUtils.copyFile(((FileResource) resource).getFile(), fileGenerateUniqueCacheFile);
        } else {
            IOUtils.copyAndClose(resource.getInputStream(), new FileOutputStream(fileGenerateUniqueCacheFile));
        }
        return new FileResource(fileGenerateUniqueCacheFile);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r11.reached();
     */
    @Override // cz.msebera.android.httpclient.client.cache.ResourceFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cz.msebera.android.httpclient.client.cache.Resource generate(java.lang.String r9, java.io.InputStream r10, cz.msebera.android.httpclient.client.cache.InputLimit r11) throws java.io.IOException {
        /*
            r8 = this;
            java.io.File r6 = r8.generateUniqueCacheFile(r9)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r6)
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L32
            r3 = 0
        Lf:
            int r1 = r10.read(r7)     // Catch: java.lang.Throwable -> L32
            r0 = -1
            if (r1 == r0) goto L29
            r0 = 0
            r5.write(r7, r0, r1)     // Catch: java.lang.Throwable -> L32
            long r0 = (long) r1     // Catch: java.lang.Throwable -> L32
            long r3 = r3 + r0
            if (r11 == 0) goto Lf
            long r1 = r11.getValue()     // Catch: java.lang.Throwable -> L32
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lf
            r11.reached()     // Catch: java.lang.Throwable -> L32
        L29:
            r5.close()
            cz.msebera.android.httpclient.impl.client.cache.FileResource r0 = new cz.msebera.android.httpclient.impl.client.cache.FileResource
            r0.<init>(r6)
            return r0
        L32:
            r0 = move-exception
            r5.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.impl.client.cache.FileResourceFactory.generate(java.lang.String, java.io.InputStream, cz.msebera.android.httpclient.client.cache.InputLimit):cz.msebera.android.httpclient.client.cache.Resource");
    }
}
