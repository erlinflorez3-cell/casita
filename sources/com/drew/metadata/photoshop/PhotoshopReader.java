package com.drew.metadata.photoshop;

import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegSegmentMetadataReader;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.ByteArrayReader;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.lang.SequentialReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifReader;
import com.drew.metadata.icc.IccReader;
import com.drew.metadata.iptc.IptcReader;
import com.drew.metadata.xmp.XmpReader;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class PhotoshopReader implements JpegSegmentMetadataReader {
    private static final String JPEG_SEGMENT_PREAMBLE = "Photoshop 3.0";

    public void extract(SequentialReader sequentialReader, int i2, Metadata metadata) {
        extract(sequentialReader, i2, metadata, null);
    }

    public void extract(SequentialReader sequentialReader, int i2, Metadata metadata, Directory directory) {
        int i3;
        PhotoshopDirectory photoshopDirectory = new PhotoshopDirectory();
        metadata.addDirectory(photoshopDirectory);
        if (directory != null) {
            photoshopDirectory.setParent(directory);
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            try {
                String string = sequentialReader.getString(4);
                int uInt16 = sequentialReader.getUInt16();
                short uInt8 = sequentialReader.getUInt8();
                int i6 = i4 + 7;
                if (uInt8 < 0 || (i3 = uInt8 + i6) > i2) {
                    throw new ImageProcessingException("Invalid string length");
                }
                StringBuilder sb = new StringBuilder();
                while (i6 < i3) {
                    sb.append((char) sequentialReader.getUInt8());
                    i6++;
                }
                if (i6 % 2 != 0) {
                    sequentialReader.skip(1L);
                    i6++;
                }
                int int32 = sequentialReader.getInt32();
                byte[] bytes = sequentialReader.getBytes(int32);
                i4 = i6 + 4 + int32;
                if (i4 % 2 != 0) {
                    sequentialReader.skip(1L);
                    i4++;
                }
                if (string.equals("8BIM")) {
                    if (uInt16 == 1028) {
                        new IptcReader().extract(new SequentialByteArrayReader(bytes), metadata, bytes.length, photoshopDirectory);
                    } else if (uInt16 == 1039) {
                        new IccReader().extract(new ByteArrayReader(bytes), metadata, photoshopDirectory);
                    } else if (uInt16 == 1058 || uInt16 == 1059) {
                        new ExifReader().extract(new ByteArrayReader(bytes), metadata, 0, photoshopDirectory);
                    } else if (uInt16 == 1060) {
                        new XmpReader().extract(bytes, metadata, photoshopDirectory);
                    } else if (uInt16 < 2000 || uInt16 > 2998) {
                        photoshopDirectory.setByteArray(uInt16, bytes);
                    } else {
                        int i7 = i5 + 1;
                        byte[] bArrCopyOf = Arrays.copyOf(bytes, bytes.length + sb.length() + 1);
                        for (int length = (bArrCopyOf.length - sb.length()) - 1; length < bArrCopyOf.length; length++) {
                            if (length % (((bArrCopyOf.length - sb.length()) - 1) + sb.length()) == 0) {
                                bArrCopyOf[length] = (byte) sb.length();
                            } else {
                                bArrCopyOf[length] = (byte) sb.charAt(length - ((bArrCopyOf.length - sb.length()) - 1));
                            }
                        }
                        int i8 = i5 + 2000;
                        PhotoshopDirectory._tagNameMap.put(Integer.valueOf(i8), "Path Info " + i7);
                        photoshopDirectory.setByteArray(i8, bArrCopyOf);
                        i5 = i7;
                    }
                    if (uInt16 >= 4000 && uInt16 <= 4999) {
                        PhotoshopDirectory._tagNameMap.put(Integer.valueOf(uInt16), String.format("Plug-in %d Data", Integer.valueOf(uInt16 - 3999)));
                    }
                }
            } catch (Exception e2) {
                photoshopDirectory.addError(e2.getMessage());
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
        int length = JPEG_SEGMENT_PREAMBLE.length();
        for (byte[] bArr : iterable) {
            int i2 = length + 1;
            if (bArr.length >= i2 && JPEG_SEGMENT_PREAMBLE.equals(new String(bArr, 0, length))) {
                extract(new SequentialByteArrayReader(bArr, i2), (bArr.length - length) - 1, metadata);
            }
        }
    }
}
