package com.drew.metadata.mov.metadata;

import com.drew.metadata.mov.QuickTimeDescriptor;
import com.drew.metadata.mov.QuickTimeDirectory;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeMetadataDescriptor extends QuickTimeDescriptor {
    public QuickTimeMetadataDescriptor(QuickTimeDirectory quickTimeDirectory) {
        super(quickTimeDirectory);
    }

    private String getArtworkDescription() {
        return getByteLengthDescription(1282);
    }

    @Override // com.drew.metadata.mov.QuickTimeDescriptor, com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 1282 ? i2 != 1303 ? super.getDescription(i2) : getLocationRoleDescription() : getArtworkDescription();
    }

    public String getLocationRoleDescription() {
        return getIndexedDescription(QuickTimeMetadataDirectory.TAG_LOCATION_ROLE, 0, "Shooting location", "Real location", "Fictional location");
    }
}
