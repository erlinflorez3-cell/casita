package com.drew.metadata.heif.boxes;

import com.drew.lang.SequentialReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLocationBox extends FullBox {
    long baseOffset;
    int baseOffsetSize;
    int constructionMethod;
    int dataReferenceIndex;
    int extentCount;
    SortedSet<Extent> extents;
    int indexSize;
    long itemCount;
    long itemID;
    int lengthSize;
    int offsetSize;

    public static class Extent {
        Long index;
        long itemId;
        long length;
        long offset;

        public Extent(long j2, Long l2, long j3, long j4) {
            this.itemId = j2;
            this.index = l2;
            this.offset = j3;
            this.length = j4;
        }

        public long getItemId() {
            return this.itemId;
        }

        public long getLength() {
            return this.length;
        }

        public long getOffset() {
            return this.offset;
        }
    }

    public ItemLocationBox(SequentialReader sequentialReader, Box box) throws IOException {
        super(sequentialReader, box);
        this.extents = new TreeSet(new Comparator<Extent>() { // from class: com.drew.metadata.heif.boxes.ItemLocationBox.1
            @Override // java.util.Comparator
            public int compare(Extent extent, Extent extent2) {
                if (extent.offset < extent2.offset) {
                    return -1;
                }
                return extent.offset == extent2.offset ? 0 : 1;
            }
        });
        short uInt8 = sequentialReader.getUInt8();
        int i2 = 4;
        this.offsetSize = (240 & uInt8) >> 4;
        this.lengthSize = (uInt8 + 15) - (uInt8 | 15);
        short uInt82 = sequentialReader.getUInt8();
        this.baseOffsetSize = ((uInt82 + 240) - (240 | uInt82)) >> 4;
        int i3 = 2;
        int i4 = 1;
        if (this.version == 1 || this.version == 2) {
            this.indexSize = uInt82 & 15;
        }
        if (this.version < 2) {
            this.itemCount = sequentialReader.getUInt16();
        } else if (this.version == 2) {
            this.itemCount = sequentialReader.getUInt32();
        }
        int i5 = 0;
        while (i5 < this.itemCount) {
            if (this.version < i3) {
                this.itemID = sequentialReader.getUInt16();
            } else if (this.version == i3) {
                this.itemID = sequentialReader.getUInt32();
            }
            if (this.version == i4 || this.version == i3) {
                this.constructionMethod = (-1) - (((-1) - sequentialReader.getUInt16()) | ((-1) - 15));
            }
            this.dataReferenceIndex = sequentialReader.getUInt16();
            int i6 = this.baseOffsetSize;
            if (i6 == i2) {
                this.baseOffset = sequentialReader.getInt32();
            } else if (i6 == 8) {
                this.baseOffset = sequentialReader.getInt64();
            } else {
                this.baseOffset = 0L;
            }
            this.extentCount = sequentialReader.getUInt16();
            Long intFromUnknownByte = null;
            int i7 = 0;
            while (i7 < this.extentCount) {
                if (this.version == i4 || (this.version == i3 && this.indexSize > 0)) {
                    intFromUnknownByte = getIntFromUnknownByte(this.indexSize, sequentialReader);
                }
                this.extents.add(new Extent(this.itemID, intFromUnknownByte, this.baseOffset + getIntFromUnknownByte(this.offsetSize, sequentialReader).longValue(), getIntFromUnknownByte(this.lengthSize, sequentialReader).longValue()));
                i7++;
                i3 = 2;
                i4 = 1;
            }
            i5++;
            i2 = 4;
            i3 = 2;
            i4 = 1;
        }
    }

    public SortedSet<Extent> getExtents() {
        return this.extents;
    }

    public Long getIntFromUnknownByte(int i2, SequentialReader sequentialReader) throws IOException {
        if (i2 == 1) {
            return Long.valueOf(sequentialReader.getUInt8());
        }
        if (i2 == 2) {
            return Long.valueOf(sequentialReader.getUInt16());
        }
        if (i2 == 4) {
            return Long.valueOf(sequentialReader.getUInt32());
        }
        if (i2 != 8) {
            return null;
        }
        return Long.valueOf(sequentialReader.getInt64());
    }
}
