package com.drew.metadata.exif;

import com.drew.imaging.jpeg.JpegSegmentMetadataReader;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.imaging.tiff.TiffReader;
import com.drew.lang.ByteArrayReader;
import com.drew.lang.RandomAccessReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class ExifReader implements JpegSegmentMetadataReader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String JPEG_SEGMENT_PREAMBLE = "Exif\u0000\u0000";

    public static boolean startsWithJpegExifPreamble(byte[] bArr) {
        return bArr.length >= JPEG_SEGMENT_PREAMBLE.length() && new String(bArr, 0, JPEG_SEGMENT_PREAMBLE.length()).equals(JPEG_SEGMENT_PREAMBLE);
    }

    public void extract(RandomAccessReader randomAccessReader, Metadata metadata) {
        extract(randomAccessReader, metadata, 0);
    }

    public void extract(RandomAccessReader randomAccessReader, Metadata metadata, int i2) {
        extract(randomAccessReader, metadata, i2, null);
    }

    public void extract(RandomAccessReader randomAccessReader, Metadata metadata, int i2, Directory directory) {
        ExifTiffHandler exifTiffHandler = new ExifTiffHandler(metadata, directory);
        try {
            new TiffReader().processTiff(randomAccessReader, exifTiffHandler, i2);
        } catch (TiffProcessingException e2) {
            exifTiffHandler.error("Exception processing TIFF data: " + e2.getMessage());
        } catch (IOException e3) {
            exifTiffHandler.error("Exception processing TIFF data: " + e3.getMessage());
        }
    }

    @Override // com.drew.imaging.jpeg.JpegSegmentMetadataReader
    public Iterable<JpegSegmentType> getSegmentTypes() {
        return Collections.singletonList(JpegSegmentType.APP1);
    }

    @Override // com.drew.imaging.jpeg.JpegSegmentMetadataReader
    public void readJpegSegments(Iterable<byte[]> iterable, Metadata metadata, JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            if (startsWithJpegExifPreamble(bArr)) {
                extract(new ByteArrayReader(bArr), metadata, JPEG_SEGMENT_PREAMBLE.length());
            }
        }
    }
}
