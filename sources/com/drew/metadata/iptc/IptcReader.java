package com.drew.metadata.iptc;

import androidx.compose.ui.layout.LayoutKt;
import com.drew.imaging.jpeg.JpegSegmentMetadataReader;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.lang.SequentialReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class IptcReader implements JpegSegmentMetadataReader {
    private static final byte IptcMarkerByte = 28;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processTag(com.drew.lang.SequentialReader r8, com.drew.metadata.Directory r9, int r10, int r11, int r12) throws java.io.IOException {
        /*
            r7 = this;
            int r6 = r10 << 8
            r6 = r6 | r11
            if (r12 != 0) goto Lb
            java.lang.String r0 = ""
            r9.setString(r6, r0)
            return
        Lb:
            r0 = 256(0x100, float:3.59E-43)
            r1 = 346(0x15a, float:4.85E-43)
            r5 = 1
            if (r6 == r0) goto L30
            r0 = 278(0x116, float:3.9E-43)
            if (r6 == r0) goto L30
            if (r6 == r1) goto L93
            r0 = 378(0x17a, float:5.3E-43)
            if (r6 == r0) goto L30
            r0 = 512(0x200, float:7.17E-43)
            if (r6 == r0) goto L30
            r0 = 522(0x20a, float:7.31E-43)
            if (r6 == r0) goto L86
            r0 = 582(0x246, float:8.16E-43)
            if (r6 == r0) goto L30
        L28:
            java.lang.String r1 = r9.getString(r1)
            r2 = 0
            if (r1 == 0) goto L45
            goto L40
        L30:
            r0 = 2
            if (r12 < r0) goto L28
            int r2 = r8.getUInt16()
            int r12 = r12 - r0
            long r0 = (long) r12
            r8.skip(r0)
            r9.setInt(r6, r2)
            return
        L40:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r1)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r0 = r2
        L46:
            if (r1 == 0) goto L70
            com.drew.metadata.StringValue r4 = r8.getStringValue(r12, r0)
        L4c:
            boolean r0 = r9.containsTag(r6)
            if (r0 == 0) goto L6c
            com.drew.metadata.StringValue[] r3 = r9.getStringValueArray(r6)
            if (r3 != 0) goto L62
            com.drew.metadata.StringValue[] r2 = new com.drew.metadata.StringValue[r5]
        L5a:
            int r0 = r2.length
            int r0 = r0 - r5
            r2[r0] = r4
            r9.setStringValueArray(r6, r2)
        L61:
            return
        L62:
            int r0 = r3.length
            int r0 = r0 + r5
            com.drew.metadata.StringValue[] r2 = new com.drew.metadata.StringValue[r0]
            int r1 = r3.length
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r2, r0, r1)
            goto L5a
        L6c:
            r9.setStringValue(r6, r4)
            goto L61
        L70:
            byte[] r1 = r8.getBytes(r12)
            java.nio.charset.Charset r0 = com.drew.metadata.iptc.Iso2022Converter.guessCharSet(r1)
            if (r0 == 0) goto L80
            com.drew.metadata.StringValue r4 = new com.drew.metadata.StringValue
            r4.<init>(r1, r0)
            goto L4c
        L80:
            com.drew.metadata.StringValue r4 = new com.drew.metadata.StringValue
            r4.<init>(r1, r2)
            goto L4c
        L86:
            short r0 = r8.getUInt8()
            r9.setInt(r6, r0)
            int r12 = r12 - r5
            long r0 = (long) r12
            r8.skip(r0)
            return
        L93:
            byte[] r1 = r8.getBytes(r12)
            java.lang.String r0 = com.drew.metadata.iptc.Iso2022Converter.convertISO2022CharsetToJavaCharset(r1)
            if (r0 != 0) goto La2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        La2:
            r9.setString(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.drew.metadata.iptc.IptcReader.processTag(com.drew.lang.SequentialReader, com.drew.metadata.Directory, int, int, int):void");
    }

    public void extract(SequentialReader sequentialReader, Metadata metadata, long j2) {
        extract(sequentialReader, metadata, j2, null);
    }

    public void extract(SequentialReader sequentialReader, Metadata metadata, long j2, Directory directory) {
        IptcDirectory iptcDirectory = new IptcDirectory();
        metadata.addDirectory(iptcDirectory);
        if (directory != null) {
            iptcDirectory.setParent(directory);
        }
        int i2 = 0;
        while (i2 < j2) {
            try {
                short uInt8 = sequentialReader.getUInt8();
                int i3 = i2 + 1;
                if (uInt8 != 28) {
                    if (i3 != j2) {
                        iptcDirectory.addError("Invalid IPTC tag marker at offset " + i2 + ". Expected '0x" + Integer.toHexString(28) + "' but got '0x" + Integer.toHexString(uInt8) + "'.");
                        return;
                    }
                    return;
                }
                if (i2 + 5 > j2) {
                    iptcDirectory.addError("Too few bytes remain for a valid IPTC tag");
                    return;
                }
                try {
                    short uInt82 = sequentialReader.getUInt8();
                    short uInt83 = sequentialReader.getUInt8();
                    int uInt16 = sequentialReader.getUInt16();
                    if (uInt16 > 32767) {
                        int i4 = ((-1) - (((-1) - uInt16) | ((-1) - LayoutKt.LargeDimension))) << 16;
                        int uInt162 = sequentialReader.getUInt16();
                        uInt16 = (i4 + uInt162) - (i4 & uInt162);
                        i3 = i2 + 3;
                    }
                    i2 = i3 + 4 + uInt16;
                    if (i2 > j2) {
                        iptcDirectory.addError("Data for tag extends beyond end of IPTC segment");
                        return;
                    } else {
                        try {
                            processTag(sequentialReader, iptcDirectory, uInt82, uInt83, uInt16);
                        } catch (IOException unused) {
                            iptcDirectory.addError("Error processing IPTC tag");
                            return;
                        }
                    }
                } catch (IOException unused2) {
                    iptcDirectory.addError("IPTC data segment ended mid-way through tag descriptor");
                    return;
                }
            } catch (IOException unused3) {
                iptcDirectory.addError("Unable to read starting byte of IPTC tag");
                return;
            }
        }
    }

    @Override // com.drew.imaging.jpeg.JpegSegmentMetadataReader
    public Iterable<JpegSegmentType> getSegmentTypes() {
        return Collections.singletonList(JpegSegmentType.APPD);
    }

    @Override // com.drew.imaging.jpeg.JpegSegmentMetadataReader
    public void readJpegSegments(Iterable<byte[]> iterable, Metadata metadata, JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            if (bArr.length != 0 && bArr[0] == 28) {
                extract(new SequentialByteArrayReader(bArr), metadata, bArr.length);
            }
        }
    }
}
