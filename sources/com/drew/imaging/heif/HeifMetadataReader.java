package com.drew.imaging.heif;

import com.drew.metadata.Metadata;
import com.drew.metadata.heif.HeifBoxHandler;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class HeifMetadataReader {
    public static Metadata readMetadata(InputStream inputStream) {
        Metadata metadata = new Metadata();
        new HeifReader().extract(inputStream, new HeifBoxHandler(metadata));
        return metadata;
    }
}
