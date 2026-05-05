package com.drew.imaging.raf;

import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.metadata.Metadata;
import com.drew.metadata.file.FileSystemMetadataReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class RafMetadataReader {
    private RafMetadataReader() throws Exception {
        throw new Exception("Not intended for instantiation");
    }

    public static Metadata readMetadata(File file) throws IOException, JpegProcessingException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Metadata metadata = readMetadata(fileInputStream);
            fileInputStream.close();
            new FileSystemMetadataReader().read(file, metadata);
            return metadata;
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return com.drew.imaging.jpeg.JpegMetadataReader.readMetadata(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.drew.metadata.Metadata readMetadata(java.io.InputStream r6) throws java.io.IOException, com.drew.imaging.jpeg.JpegProcessingException {
        /*
            boolean r0 = r6.markSupported()
            if (r0 == 0) goto L4f
            r0 = 512(0x200, float:7.17E-43)
            r6.mark(r0)
            byte[] r5 = new byte[r0]
            int r4 = r6.read(r5)
            r3 = -1
            if (r4 == r3) goto L47
            r6.reset()
            r2 = 0
        L18:
            int r0 = r4 + (-2)
            if (r2 >= r0) goto L37
            r0 = r5[r2]
            if (r0 != r3) goto L3c
            int r0 = r2 + 1
            r1 = r5[r0]
            r0 = -40
            if (r1 != r0) goto L3c
            int r0 = r2 + 2
            r0 = r5[r0]
            if (r0 != r3) goto L3c
            long r3 = (long) r2
            long r1 = r6.skip(r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L3f
        L37:
            com.drew.metadata.Metadata r0 = com.drew.imaging.jpeg.JpegMetadataReader.readMetadata(r6)
            return r0
        L3c:
            int r2 = r2 + 1
            goto L18
        L3f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "Skipping stream bytes failed"
            r1.<init>(r0)
            throw r1
        L47:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "Stream is empty"
            r1.<init>(r0)
            throw r1
        L4f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "Stream must support mark/reset"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.drew.imaging.raf.RafMetadataReader.readMetadata(java.io.InputStream):com.drew.metadata.Metadata");
    }
}
