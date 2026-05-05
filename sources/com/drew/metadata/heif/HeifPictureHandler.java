package com.drew.metadata.heif;

import com.drew.imaging.heif.HeifHandler;
import com.drew.lang.RandomAccessStreamReader;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifReader;
import com.drew.metadata.heif.boxes.AuxiliaryTypeProperty;
import com.drew.metadata.heif.boxes.Box;
import com.drew.metadata.heif.boxes.ColourInformationBox;
import com.drew.metadata.heif.boxes.ImageRotationBox;
import com.drew.metadata.heif.boxes.ImageSpatialExtentsProperty;
import com.drew.metadata.heif.boxes.ItemInfoBox;
import com.drew.metadata.heif.boxes.ItemLocationBox;
import com.drew.metadata.heif.boxes.ItemProtectionBox;
import com.drew.metadata.heif.boxes.PixelInformationBox;
import com.drew.metadata.heif.boxes.PrimaryItemBox;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class HeifPictureHandler extends HeifHandler<HeifDirectory> {
    ItemInfoBox itemInfoBox;
    ItemLocationBox itemLocationBox;
    ItemProtectionBox itemProtectionBox;
    PrimaryItemBox primaryItemBox;
    private static final Set<String> boxesCanProcess = new HashSet(Arrays.asList(HeifBoxTypes.BOX_ITEM_PROTECTION, HeifBoxTypes.BOX_PRIMARY_ITEM, HeifBoxTypes.BOX_ITEM_INFO, HeifBoxTypes.BOX_ITEM_LOCATION, HeifBoxTypes.BOX_IMAGE_SPATIAL_EXTENTS, HeifBoxTypes.BOX_AUXILIARY_TYPE_PROPERTY, HeifBoxTypes.BOX_IMAGE_ROTATION, HeifBoxTypes.BOX_COLOUR_INFO, HeifBoxTypes.BOX_PIXEL_INFORMATION));
    private static final Set<String> itemsCanProcess = new HashSet(Collections.singletonList(HeifItemTypes.ITEM_EXIF));
    private static final Set<String> containersCanProcess = new HashSet(Arrays.asList(HeifContainerTypes.BOX_IMAGE_PROPERTY, HeifContainerTypes.BOX_ITEM_PROPERTY, HeifContainerTypes.BOX_MEDIA_DATA));

    public HeifPictureHandler(Metadata metadata) {
        super(metadata);
    }

    private void handleItem(ItemInfoBox.ItemInfoEntry itemInfoEntry, SequentialByteArrayReader sequentialByteArrayReader) throws IOException {
        if (itemInfoEntry.getItemType().equals(HeifItemTypes.ITEM_EXIF)) {
            long uInt32 = sequentialByteArrayReader.getUInt32();
            if (uInt32 > sequentialByteArrayReader.available()) {
                return;
            }
            sequentialByteArrayReader.skip(uInt32);
            new ExifReader().extract(new RandomAccessStreamReader(new ByteArrayInputStream(sequentialByteArrayReader.getBytes(sequentialByteArrayReader.available()))), this.metadata);
        }
    }

    private boolean shouldHandleItem(ItemInfoBox.ItemInfoEntry itemInfoEntry) {
        return itemsCanProcess.contains(itemInfoEntry.getItemType());
    }

    @Override // com.drew.imaging.heif.HeifHandler
    protected HeifDirectory getDirectory() {
        return new HeifDirectory();
    }

    @Override // com.drew.imaging.heif.HeifHandler
    protected HeifHandler<?> processBox(Box box, byte[] bArr) throws IOException {
        SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr);
        if (box.type.equals(HeifBoxTypes.BOX_ITEM_PROTECTION)) {
            this.itemProtectionBox = new ItemProtectionBox(sequentialByteArrayReader, box);
        } else if (box.type.equals(HeifBoxTypes.BOX_PRIMARY_ITEM)) {
            this.primaryItemBox = new PrimaryItemBox(sequentialByteArrayReader, box);
        } else if (box.type.equals(HeifBoxTypes.BOX_ITEM_INFO)) {
            ItemInfoBox itemInfoBox = new ItemInfoBox(sequentialByteArrayReader, box);
            this.itemInfoBox = itemInfoBox;
            itemInfoBox.addMetadata(this.directory);
        } else if (box.type.equals(HeifBoxTypes.BOX_ITEM_LOCATION)) {
            this.itemLocationBox = new ItemLocationBox(sequentialByteArrayReader, box);
        } else if (box.type.equals(HeifBoxTypes.BOX_IMAGE_SPATIAL_EXTENTS)) {
            new ImageSpatialExtentsProperty(sequentialByteArrayReader, box).addMetadata(this.directory);
        } else if (box.type.equals(HeifBoxTypes.BOX_AUXILIARY_TYPE_PROPERTY)) {
            new AuxiliaryTypeProperty(sequentialByteArrayReader, box);
        } else if (box.type.equals(HeifBoxTypes.BOX_IMAGE_ROTATION)) {
            new ImageRotationBox(sequentialByteArrayReader, box).addMetadata(this.directory);
        } else if (box.type.equals(HeifBoxTypes.BOX_COLOUR_INFO)) {
            new ColourInformationBox(sequentialByteArrayReader, box, this.metadata).addMetadata(this.directory);
        } else if (box.type.equals(HeifBoxTypes.BOX_PIXEL_INFORMATION)) {
            new PixelInformationBox(sequentialByteArrayReader, box).addMetadata(this.directory);
        }
        return this;
    }

    @Override // com.drew.imaging.heif.HeifHandler
    protected void processContainer(Box box, SequentialReader sequentialReader) throws IOException {
        ItemLocationBox itemLocationBox;
        if (!box.type.equals(HeifContainerTypes.BOX_MEDIA_DATA) || this.itemInfoBox == null || (itemLocationBox = this.itemLocationBox) == null) {
            return;
        }
        for (ItemLocationBox.Extent extent : itemLocationBox.getExtents()) {
            ItemInfoBox.ItemInfoEntry entry = this.itemInfoBox.getEntry(extent.getItemId());
            long offset = extent.getOffset() - sequentialReader.getPosition();
            if (offset > 0) {
                sequentialReader.skip(offset);
            }
            if (shouldHandleItem(entry)) {
                handleItem(entry, new SequentialByteArrayReader(sequentialReader.getBytes((int) extent.getLength())));
            }
        }
    }

    @Override // com.drew.imaging.heif.HeifHandler
    protected boolean shouldAcceptBox(Box box) {
        return boxesCanProcess.contains(box.type);
    }

    @Override // com.drew.imaging.heif.HeifHandler
    protected boolean shouldAcceptContainer(Box box) {
        return containersCanProcess.contains(box.type);
    }
}
