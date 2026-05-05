package com.drew.metadata.mp4;

import com.drew.imaging.mp4.Mp4Handler;
import com.drew.lang.DateUtil;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mp4.media.Mp4MediaDirectory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Mp4MediaHandler<T extends Mp4MediaDirectory> extends Mp4Handler<T> {
    public Mp4MediaHandler(Metadata metadata, Mp4Context mp4Context) {
        super(metadata);
        if (mp4Context.creationTime != null) {
            ((Mp4MediaDirectory) this.directory).setDate(101, DateUtil.get1Jan1904EpochDate(mp4Context.creationTime.longValue()));
        }
        if (mp4Context.modificationTime != null) {
            ((Mp4MediaDirectory) this.directory).setDate(102, DateUtil.get1Jan1904EpochDate(mp4Context.modificationTime.longValue()));
        }
        if (mp4Context.language != null) {
            ((Mp4MediaDirectory) this.directory).setString(104, mp4Context.language);
        }
    }

    protected abstract String getMediaInformation();

    @Override // com.drew.imaging.mp4.Mp4Handler
    public Mp4Handler<?> processBox(String str, byte[] bArr, long j2, Mp4Context mp4Context) throws IOException {
        if (bArr != null) {
            SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr);
            if (str.equals(getMediaInformation())) {
                processMediaInformation(sequentialByteArrayReader);
            } else if (str.equals("stsd")) {
                processSampleDescription(sequentialByteArrayReader);
            } else if (str.equals("stts")) {
                processTimeToSample(sequentialByteArrayReader, mp4Context);
            }
        }
        return this;
    }

    protected abstract void processMediaInformation(SequentialReader sequentialReader) throws IOException;

    protected abstract void processSampleDescription(SequentialReader sequentialReader) throws IOException;

    protected abstract void processTimeToSample(SequentialReader sequentialReader, Mp4Context mp4Context) throws IOException;

    @Override // com.drew.imaging.mp4.Mp4Handler
    public boolean shouldAcceptBox(String str) {
        return str.equals(getMediaInformation()) || str.equals("stsd") || str.equals("stts");
    }

    @Override // com.drew.imaging.mp4.Mp4Handler
    public boolean shouldAcceptContainer(String str) {
        return str.equals("stbl") || str.equals("minf");
    }
}
