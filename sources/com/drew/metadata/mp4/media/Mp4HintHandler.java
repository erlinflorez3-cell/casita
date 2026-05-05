package com.drew.metadata.mp4.media;

import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mp4.Mp4BoxTypes;
import com.drew.metadata.mp4.Mp4Context;
import com.drew.metadata.mp4.Mp4MediaHandler;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class Mp4HintHandler extends Mp4MediaHandler<Mp4HintDirectory> {
    public Mp4HintHandler(Metadata metadata, Mp4Context mp4Context) {
        super(metadata, mp4Context);
    }

    @Override // com.drew.imaging.mp4.Mp4Handler
    public Mp4HintDirectory getDirectory() {
        return new Mp4HintDirectory();
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    protected String getMediaInformation() {
        return Mp4BoxTypes.BOX_HINT_MEDIA_INFO;
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    protected void processMediaInformation(SequentialReader sequentialReader) throws IOException {
        sequentialReader.skip(4L);
        int uInt16 = sequentialReader.getUInt16();
        int uInt162 = sequentialReader.getUInt16();
        long uInt32 = sequentialReader.getUInt32();
        long uInt322 = sequentialReader.getUInt32();
        ((Mp4HintDirectory) this.directory).setInt(101, uInt16);
        ((Mp4HintDirectory) this.directory).setInt(102, uInt162);
        ((Mp4HintDirectory) this.directory).setLong(103, uInt32);
        ((Mp4HintDirectory) this.directory).setLong(104, uInt322);
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    protected void processSampleDescription(SequentialReader sequentialReader) {
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    protected void processTimeToSample(SequentialReader sequentialReader, Mp4Context mp4Context) throws IOException {
    }
}
