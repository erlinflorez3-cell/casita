package com.drew.metadata.mp4.media;

import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mp4.Mp4Context;
import com.drew.metadata.mp4.Mp4MediaHandler;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class Mp4MetaHandler extends Mp4MediaHandler<Mp4MetaDirectory> {
    public Mp4MetaHandler(Metadata metadata, Mp4Context mp4Context) {
        super(metadata, mp4Context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.drew.imaging.mp4.Mp4Handler
    public Mp4MetaDirectory getDirectory() {
        return new Mp4MetaDirectory();
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    protected String getMediaInformation() {
        return "nmhd";
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    protected void processMediaInformation(SequentialReader sequentialReader) throws IOException {
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    protected void processSampleDescription(SequentialReader sequentialReader) throws IOException {
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    protected void processTimeToSample(SequentialReader sequentialReader, Mp4Context mp4Context) throws IOException {
    }
}
