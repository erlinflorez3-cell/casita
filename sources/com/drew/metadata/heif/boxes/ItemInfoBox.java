package com.drew.metadata.heif.boxes;

import com.drew.lang.Charsets;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.lang.SequentialReader;
import com.drew.metadata.heif.HeifDirectory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ItemInfoBox extends FullBox {
    Map<Long, ItemInfoEntry> entries;
    long entryCount;

    public static class ItemInfoEntry extends FullBox {
        String contentEncoding;
        String contentType;
        String extensionType;
        long itemID;
        String itemName;
        long itemProtectionIndex;
        String itemType;
        String itemUriType;

        public ItemInfoEntry(SequentialReader sequentialReader, Box box) throws IOException {
            super(sequentialReader, box);
            if (this.version == 0 || this.version == 1) {
                this.itemID = sequentialReader.getUInt16();
                this.itemProtectionIndex = sequentialReader.getUInt16();
                long j2 = 8;
                this.itemName = sequentialReader.getNullTerminatedString((int) ((box.size - sequentialReader.getPosition()) - j2), Charsets.UTF_8);
                this.contentType = sequentialReader.getNullTerminatedString((int) ((box.size - sequentialReader.getPosition()) - j2), Charsets.UTF_8);
                if ((box.size - sequentialReader.getPosition()) - j2 > 0) {
                    this.extensionType = sequentialReader.getNullTerminatedString((int) ((box.size - sequentialReader.getPosition()) - j2), Charsets.UTF_8);
                }
            }
            if (this.version == 1 && box.size - 28 >= 4) {
                this.contentEncoding = sequentialReader.getString(4);
            }
            if (this.version >= 2) {
                if (this.version == 2) {
                    this.itemID = sequentialReader.getUInt16();
                } else if (this.version == 3) {
                    this.itemID = sequentialReader.getUInt32();
                }
                this.itemProtectionIndex = sequentialReader.getUInt16();
                this.itemType = sequentialReader.getString(4);
                long j3 = 8;
                this.itemName = sequentialReader.getNullTerminatedString((int) ((box.size - sequentialReader.getPosition()) - j3), Charsets.UTF_8);
                if (!this.itemType.equals("mime")) {
                    if (this.itemType.equals("uri ")) {
                        this.itemUriType = sequentialReader.getString((int) ((box.size - sequentialReader.getPosition()) - j3));
                    }
                } else {
                    this.contentType = sequentialReader.getNullTerminatedString((int) ((box.size - sequentialReader.getPosition()) - j3), Charsets.UTF_8);
                    if ((box.size - sequentialReader.getPosition()) - j3 > 0) {
                        this.contentEncoding = sequentialReader.getNullTerminatedString((int) ((box.size - sequentialReader.getPosition()) - j3), Charsets.UTF_8);
                    }
                }
            }
        }

        public String getItemType() {
            return this.itemType;
        }
    }

    public ItemInfoBox(SequentialReader sequentialReader, Box box) throws IOException {
        super(sequentialReader, box);
        if (this.version == 0) {
            this.entryCount = sequentialReader.getUInt16();
        } else {
            this.entryCount = sequentialReader.getUInt32();
        }
        this.entries = new HashMap();
        for (int i2 = 1; i2 <= this.entryCount; i2++) {
            ItemInfoEntry itemInfoEntry = new ItemInfoEntry(new SequentialByteArrayReader(sequentialReader.getBytes(((int) r5.size) - 8)), new Box(sequentialReader));
            this.entries.put(Long.valueOf(itemInfoEntry.itemID), itemInfoEntry);
        }
    }

    public void addMetadata(HeifDirectory heifDirectory) {
    }

    public ItemInfoEntry getEntry(long j2) {
        return this.entries.get(Long.valueOf(j2));
    }
}
