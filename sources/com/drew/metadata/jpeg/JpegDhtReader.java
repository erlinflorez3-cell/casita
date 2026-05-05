package com.drew.metadata.jpeg;

import com.drew.imaging.jpeg.JpegSegmentMetadataReader;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.jpeg.HuffmanTablesDirectory;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class JpegDhtReader implements JpegSegmentMetadataReader {
    private byte[] getBytes(SequentialReader sequentialReader, int i2) throws IOException {
        byte b2;
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b3 = sequentialReader.getByte();
            if ((b3 + 255) - (255 | b3) == 255 && (b2 = sequentialReader.getByte()) != 0) {
                throw new IOException("Marker " + JpegSegmentType.fromByte(b2) + " found inside DHT segment");
            }
            bArr[i3] = b3;
        }
        return bArr;
    }

    public void extract(SequentialReader sequentialReader, Metadata metadata) {
        HuffmanTablesDirectory huffmanTablesDirectory = (HuffmanTablesDirectory) metadata.getFirstDirectoryOfType(HuffmanTablesDirectory.class);
        if (huffmanTablesDirectory == null) {
            huffmanTablesDirectory = new HuffmanTablesDirectory();
            metadata.addDirectory(huffmanTablesDirectory);
        }
        while (sequentialReader.available() > 0) {
            try {
                byte b2 = sequentialReader.getByte();
                HuffmanTablesDirectory.HuffmanTable.HuffmanTableClass huffmanTableClassTypeOf = HuffmanTablesDirectory.HuffmanTable.HuffmanTableClass.typeOf(((-1) - (((-1) - b2) | ((-1) - 240))) >> 4);
                int i2 = (-1) - (((-1) - b2) | ((-1) - 15));
                byte[] bytes = getBytes(sequentialReader, 16);
                int i3 = 0;
                for (byte b3 : bytes) {
                    i3 += b3 & 255;
                }
                huffmanTablesDirectory.getTables().add(new HuffmanTablesDirectory.HuffmanTable(huffmanTableClassTypeOf, i2, bytes, getBytes(sequentialReader, i3)));
            } catch (IOException e2) {
                huffmanTablesDirectory.addError(e2.getMessage());
            }
        }
        huffmanTablesDirectory.setInt(1, huffmanTablesDirectory.getTables().size());
    }

    @Override // com.drew.imaging.jpeg.JpegSegmentMetadataReader
    public Iterable<JpegSegmentType> getSegmentTypes() {
        return Collections.singletonList(JpegSegmentType.DHT);
    }

    @Override // com.drew.imaging.jpeg.JpegSegmentMetadataReader
    public void readJpegSegments(Iterable<byte[]> iterable, Metadata metadata, JpegSegmentType jpegSegmentType) {
        Iterator<byte[]> it = iterable.iterator();
        while (it.hasNext()) {
            extract(new SequentialByteArrayReader(it.next()), metadata);
        }
    }
}
