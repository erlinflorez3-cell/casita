package com.drew.metadata.mp4.media;

import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mp4.Mp4Context;
import com.drew.metadata.mp4.Mp4Dictionary;
import com.drew.metadata.mp4.Mp4MediaHandler;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public class Mp4VideoHandler extends Mp4MediaHandler<Mp4VideoDirectory> {
    public Mp4VideoHandler(Metadata metadata, Mp4Context mp4Context) {
        super(metadata, mp4Context);
    }

    @Override // com.drew.imaging.mp4.Mp4Handler
    public Mp4VideoDirectory getDirectory() {
        return new Mp4VideoDirectory();
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    protected String getMediaInformation() {
        return "vmhd";
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    public void processMediaInformation(SequentialReader sequentialReader) throws IOException {
        sequentialReader.skip(4L);
        int uInt16 = sequentialReader.getUInt16();
        ((Mp4VideoDirectory) this.directory).setIntArray(Mp4VideoDirectory.TAG_OPCOLOR, new int[]{sequentialReader.getUInt16(), sequentialReader.getUInt16(), sequentialReader.getUInt16()});
        ((Mp4VideoDirectory) this.directory).setInt(211, uInt16);
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    public void processSampleDescription(SequentialReader sequentialReader) throws IOException {
        sequentialReader.skip(4L);
        sequentialReader.getUInt32();
        sequentialReader.getUInt32();
        String string = sequentialReader.getString(4);
        sequentialReader.skip(6L);
        sequentialReader.getUInt16();
        sequentialReader.getInt16();
        sequentialReader.getInt16();
        sequentialReader.getString(4);
        sequentialReader.getInt32();
        sequentialReader.getInt32();
        int uInt16 = sequentialReader.getUInt16();
        int uInt162 = sequentialReader.getUInt16();
        long uInt32 = sequentialReader.getUInt32();
        long uInt322 = sequentialReader.getUInt32();
        sequentialReader.skip(4L);
        sequentialReader.getUInt16();
        String string2 = sequentialReader.getString(32);
        int uInt163 = sequentialReader.getUInt16();
        sequentialReader.skip(2L);
        Mp4Dictionary.setLookup(Mp4VideoDirectory.TAG_COMPRESSION_TYPE, string, this.directory);
        ((Mp4VideoDirectory) this.directory).setInt(204, uInt16);
        ((Mp4VideoDirectory) this.directory).setInt(205, uInt162);
        String strTrim = string2.trim();
        if (!strTrim.isEmpty()) {
            ((Mp4VideoDirectory) this.directory).setString(208, strTrim);
        }
        ((Mp4VideoDirectory) this.directory).setInt(Mp4VideoDirectory.TAG_DEPTH, uInt163);
        ((Mp4VideoDirectory) this.directory).setDouble(206, (((uInt32 - 65536) - (uInt32 | (-65536))) >> 16) + (((uInt32 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (uInt32 | WebSocketProtocol.PAYLOAD_SHORT_MAX)) / Math.pow(2.0d, 4.0d)));
        ((Mp4VideoDirectory) this.directory).setDouble(207, ((((-65536) + uInt322) - ((-65536) | uInt322)) >> 16) + (((WebSocketProtocol.PAYLOAD_SHORT_MAX + uInt322) - (WebSocketProtocol.PAYLOAD_SHORT_MAX | uInt322)) / Math.pow(2.0d, 4.0d)));
    }

    @Override // com.drew.metadata.mp4.Mp4MediaHandler
    public void processTimeToSample(SequentialReader sequentialReader, Mp4Context mp4Context) throws IOException {
        sequentialReader.skip(4L);
        long uInt32 = sequentialReader.getUInt32();
        float uInt322 = 0.0f;
        for (int i2 = 0; i2 < uInt32; i2++) {
            uInt322 += sequentialReader.getUInt32();
            sequentialReader.skip(4L);
        }
        if (mp4Context.timeScale == null || mp4Context.duration == null) {
            return;
        }
        ((Mp4VideoDirectory) this.directory).setFloat(Mp4VideoDirectory.TAG_FRAME_RATE, mp4Context.timeScale.longValue() / (mp4Context.duration.longValue() / uInt322));
    }
}
