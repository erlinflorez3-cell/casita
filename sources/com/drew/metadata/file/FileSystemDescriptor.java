package com.drew.metadata.file;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class FileSystemDescriptor extends TagDescriptor<FileSystemDirectory> {
    public FileSystemDescriptor(FileSystemDirectory fileSystemDirectory) {
        super(fileSystemDirectory);
    }

    private String getFileSizeDescription() {
        Long longObject = ((FileSystemDirectory) this._directory).getLongObject(2);
        if (longObject == null) {
            return null;
        }
        return Long.toString(longObject.longValue()) + " bytes";
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 2 ? super.getDescription(i2) : getFileSizeDescription();
    }
}
