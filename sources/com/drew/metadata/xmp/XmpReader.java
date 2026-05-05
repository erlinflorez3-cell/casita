package com.drew.metadata.xmp;

import com.adobe.internal.xmp.XMPException;
import com.adobe.internal.xmp.XMPIterator;
import com.adobe.internal.xmp.XMPMetaFactory;
import com.adobe.internal.xmp.options.ParseOptions;
import com.adobe.internal.xmp.properties.XMPPropertyInfo;
import com.drew.imaging.jpeg.JpegSegmentMetadataReader;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.StringValue;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class XmpReader implements JpegSegmentMetadataReader {
    private static final String ATTRIBUTE_EXTENDED_XMP = "xmpNote:HasExtendedXMP";
    private static final int EXTENDED_XMP_GUID_LENGTH = 32;
    private static final int EXTENDED_XMP_INT_LENGTH = 4;
    private static final ParseOptions PARSE_OPTIONS = new ParseOptions().setXMPNodesToLimit(Collections.singletonMap("photoshop:DocumentAncestors", 1000));
    private static final String SCHEMA_XMP_NOTES = "http://ns.adobe.com/xmp/note/";
    private static final String XMP_EXTENSION_JPEG_PREAMBLE = "http://ns.adobe.com/xmp/extension/\u0000";
    private static final String XMP_JPEG_PREAMBLE = "http://ns.adobe.com/xap/1.0/\u0000";

    private static String getExtendedXMPGUID(Metadata metadata) {
        Iterator it = metadata.getDirectoriesOfType(XmpDirectory.class).iterator();
        while (it.hasNext()) {
            try {
                XMPIterator it2 = ((XmpDirectory) it.next()).getXMPMeta().iterator("http://ns.adobe.com/xmp/note/", null, null);
                if (it2 != null) {
                    while (it2.hasNext()) {
                        XMPPropertyInfo xMPPropertyInfo = (XMPPropertyInfo) it2.next();
                        if (ATTRIBUTE_EXTENDED_XMP.equals(xMPPropertyInfo.getPath())) {
                            return xMPPropertyInfo.getValue();
                        }
                    }
                }
            } catch (XMPException unused) {
            }
        }
        return null;
    }

    private static byte[] processExtendedXMPChunk(Metadata metadata, byte[] bArr, String str, byte[] bArr2) {
        int length = XMP_EXTENSION_JPEG_PREAMBLE.length();
        int length2 = bArr.length;
        int i2 = length + 40;
        if (length2 >= i2) {
            try {
                SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr);
                sequentialByteArrayReader.skip(length);
                if (str.equals(sequentialByteArrayReader.getString(32))) {
                    int uInt32 = (int) sequentialByteArrayReader.getUInt32();
                    int uInt322 = (int) sequentialByteArrayReader.getUInt32();
                    if (bArr2 == null) {
                        bArr2 = new byte[uInt32];
                    }
                    if (bArr2.length == uInt32) {
                        System.arraycopy(bArr, i2, bArr2, uInt322, length2 - i2);
                    } else {
                        XmpDirectory xmpDirectory = new XmpDirectory();
                        xmpDirectory.addError(String.format("Inconsistent length for the Extended XMP buffer: %d instead of %d", Integer.valueOf(uInt32), Integer.valueOf(bArr2.length)));
                        metadata.addDirectory(xmpDirectory);
                    }
                }
            } catch (IOException e2) {
                XmpDirectory xmpDirectory2 = new XmpDirectory();
                xmpDirectory2.addError(e2.getMessage());
                metadata.addDirectory(xmpDirectory2);
            }
        }
        return bArr2;
    }

    public void extract(StringValue stringValue, Metadata metadata) {
        extract(stringValue.getBytes(), metadata, (Directory) null);
    }

    public void extract(String str, Metadata metadata) {
        extract(str, metadata, (Directory) null);
    }

    public void extract(String str, Metadata metadata, Directory directory) {
        XmpDirectory xmpDirectory = new XmpDirectory();
        if (directory != null) {
            xmpDirectory.setParent(directory);
        }
        try {
            xmpDirectory.setXMPMeta(XMPMetaFactory.parseFromString(str, PARSE_OPTIONS));
        } catch (XMPException e2) {
            xmpDirectory.addError("Error processing XMP data: " + e2.getMessage());
        }
        if (xmpDirectory.isEmpty()) {
            return;
        }
        metadata.addDirectory(xmpDirectory);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x000d A[Catch: XMPException -> 0x002a, TRY_ENTER, TryCatch #0 {XMPException -> 0x002a, blocks: (B:28:0x000d, B:32:0x0026, B:29:0x001d, B:31:0x0020), top: B:39:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void extract(byte[] r5, int r6, int r7, com.drew.metadata.Metadata r8, com.drew.metadata.Directory r9) {
        /*
            r4 = this;
            com.drew.metadata.xmp.XmpDirectory r3 = new com.drew.metadata.xmp.XmpDirectory
            r3.<init>()
            if (r9 == 0) goto La
            r3.setParent(r9)
        La:
            if (r6 != 0) goto Ld
            goto L1d
        Ld:
            com.adobe.internal.xmp.impl.ByteBuffer r0 = new com.adobe.internal.xmp.impl.ByteBuffer     // Catch: com.adobe.internal.xmp.XMPException -> L2a
            r0.<init>(r5, r6, r7)     // Catch: com.adobe.internal.xmp.XMPException -> L2a
            java.io.InputStream r1 = r0.getByteStream()     // Catch: com.adobe.internal.xmp.XMPException -> L2a
            com.adobe.internal.xmp.options.ParseOptions r0 = com.drew.metadata.xmp.XmpReader.PARSE_OPTIONS     // Catch: com.adobe.internal.xmp.XMPException -> L2a
            com.adobe.internal.xmp.XMPMeta r0 = com.adobe.internal.xmp.XMPMetaFactory.parse(r1, r0)     // Catch: com.adobe.internal.xmp.XMPException -> L2a
            goto L26
        L1d:
            int r0 = r5.length     // Catch: com.adobe.internal.xmp.XMPException -> L2a
            if (r7 != r0) goto Ld
            com.adobe.internal.xmp.options.ParseOptions r0 = com.drew.metadata.xmp.XmpReader.PARSE_OPTIONS     // Catch: com.adobe.internal.xmp.XMPException -> L2a
            com.adobe.internal.xmp.XMPMeta r0 = com.adobe.internal.xmp.XMPMetaFactory.parseFromBuffer(r5, r0)     // Catch: com.adobe.internal.xmp.XMPException -> L2a
        L26:
            r3.setXMPMeta(r0)     // Catch: com.adobe.internal.xmp.XMPException -> L2a
            goto L41
        L2a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Error processing XMP data: "
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.addError(r0)
        L41:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L4a
            r8.addDirectory(r3)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.drew.metadata.xmp.XmpReader.extract(byte[], int, int, com.drew.metadata.Metadata, com.drew.metadata.Directory):void");
    }

    public void extract(byte[] bArr, Metadata metadata) {
        extract(bArr, metadata, (Directory) null);
    }

    public void extract(byte[] bArr, Metadata metadata, Directory directory) {
        extract(bArr, 0, bArr.length, metadata, directory);
    }

    @Override // com.drew.imaging.jpeg.JpegSegmentMetadataReader
    public Iterable<JpegSegmentType> getSegmentTypes() {
        return Collections.singletonList(JpegSegmentType.APP1);
    }

    @Override // com.drew.imaging.jpeg.JpegSegmentMetadataReader
    public void readJpegSegments(Iterable<byte[]> iterable, Metadata metadata, JpegSegmentType jpegSegmentType) {
        int length = XMP_JPEG_PREAMBLE.length();
        int length2 = XMP_EXTENSION_JPEG_PREAMBLE.length();
        byte[] bArrProcessExtendedXMPChunk = null;
        String extendedXMPGUID = null;
        for (byte[] bArr : iterable) {
            if (bArr.length >= length && (XMP_JPEG_PREAMBLE.equalsIgnoreCase(new String(bArr, 0, length)) || "XMP".equalsIgnoreCase(new String(bArr, 0, 3)))) {
                int length3 = bArr.length - length;
                byte[] bArr2 = new byte[length3];
                System.arraycopy(bArr, length, bArr2, 0, length3);
                extract(bArr2, metadata);
                extendedXMPGUID = getExtendedXMPGUID(metadata);
            } else if (extendedXMPGUID != null && bArr.length >= length2 && XMP_EXTENSION_JPEG_PREAMBLE.equalsIgnoreCase(new String(bArr, 0, length2))) {
                bArrProcessExtendedXMPChunk = processExtendedXMPChunk(metadata, bArr, extendedXMPGUID, bArrProcessExtendedXMPChunk);
            }
        }
        if (bArrProcessExtendedXMPChunk != null) {
            extract(bArrProcessExtendedXMPChunk, metadata);
        }
    }
}
