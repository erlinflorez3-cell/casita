package com.drew.metadata.exif;

/* JADX INFO: loaded from: classes3.dex */
public class ExifThumbnailDescriptor extends ExifDescriptorBase<ExifThumbnailDirectory> {
    public ExifThumbnailDescriptor(ExifThumbnailDirectory exifThumbnailDirectory) {
        super(exifThumbnailDirectory);
    }

    @Override // com.drew.metadata.exif.ExifDescriptorBase, com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 513 ? i2 != 514 ? super.getDescription(i2) : getThumbnailLengthDescription() : getThumbnailOffsetDescription();
    }

    public String getThumbnailLengthDescription() {
        String string = ((ExifThumbnailDirectory) this._directory).getString(514);
        if (string == null) {
            return null;
        }
        return string + " bytes";
    }

    public String getThumbnailOffsetDescription() {
        String string = ((ExifThumbnailDirectory) this._directory).getString(513);
        if (string == null) {
            return null;
        }
        return string + " bytes";
    }
}
