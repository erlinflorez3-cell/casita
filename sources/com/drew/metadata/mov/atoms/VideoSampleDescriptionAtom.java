package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.QuickTimeDictionary;
import com.drew.metadata.mov.media.QuickTimeVideoDirectory;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public class VideoSampleDescriptionAtom extends SampleDescriptionAtom<VideoSampleDescription> {

    static class VideoSampleDescription extends SampleDescription {
        int colorTableID;
        String compressorName;
        long dataSize;
        int depth;
        int frameCount;
        int height;
        long horizontalResolution;
        int revisionLevel;
        long spatialQuality;
        long temporalQuality;
        String vendor;
        int version;
        long verticalResolution;
        int width;

        public VideoSampleDescription(SequentialReader sequentialReader) throws IOException {
            super(sequentialReader);
            this.version = sequentialReader.getUInt16();
            this.revisionLevel = sequentialReader.getUInt16();
            this.vendor = sequentialReader.getString(4);
            this.temporalQuality = sequentialReader.getUInt32();
            this.spatialQuality = sequentialReader.getUInt32();
            this.width = sequentialReader.getUInt16();
            this.height = sequentialReader.getUInt16();
            this.horizontalResolution = sequentialReader.getUInt32();
            this.verticalResolution = sequentialReader.getUInt32();
            this.dataSize = sequentialReader.getUInt32();
            this.frameCount = sequentialReader.getUInt16();
            this.compressorName = sequentialReader.getString(32);
            this.depth = sequentialReader.getUInt16();
            this.colorTableID = sequentialReader.getInt16();
        }
    }

    public VideoSampleDescriptionAtom(SequentialReader sequentialReader, Atom atom) throws IOException {
        super(sequentialReader, atom);
    }

    public void addMetadata(QuickTimeVideoDirectory quickTimeVideoDirectory) {
        if (this.sampleDescriptions.size() == 0) {
            return;
        }
        VideoSampleDescription videoSampleDescription = (VideoSampleDescription) this.sampleDescriptions.get(0);
        QuickTimeDictionary.setLookup(1, videoSampleDescription.vendor, quickTimeVideoDirectory);
        QuickTimeDictionary.setLookup(10, videoSampleDescription.dataFormat, quickTimeVideoDirectory);
        quickTimeVideoDirectory.setLong(2, videoSampleDescription.temporalQuality);
        quickTimeVideoDirectory.setLong(3, videoSampleDescription.spatialQuality);
        quickTimeVideoDirectory.setInt(4, videoSampleDescription.width);
        quickTimeVideoDirectory.setInt(5, videoSampleDescription.height);
        String strTrim = videoSampleDescription.compressorName.trim();
        if (!strTrim.isEmpty()) {
            quickTimeVideoDirectory.setString(8, strTrim);
        }
        quickTimeVideoDirectory.setInt(9, videoSampleDescription.depth);
        quickTimeVideoDirectory.setInt(13, videoSampleDescription.colorTableID);
        long j2 = videoSampleDescription.horizontalResolution;
        double d2 = ((j2 - 65536) - (j2 | (-65536))) >> 16;
        long j3 = videoSampleDescription.horizontalResolution;
        quickTimeVideoDirectory.setDouble(6, d2 + (((j3 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j3 | WebSocketProtocol.PAYLOAD_SHORT_MAX)) / Math.pow(2.0d, 4.0d)));
        long j4 = videoSampleDescription.verticalResolution;
        double d3 = ((j4 - 65536) - (j4 | (-65536))) >> 16;
        long j5 = videoSampleDescription.verticalResolution;
        quickTimeVideoDirectory.setDouble(7, d3 + (((j5 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j5 | WebSocketProtocol.PAYLOAD_SHORT_MAX)) / Math.pow(2.0d, 4.0d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.drew.metadata.mov.atoms.SampleDescriptionAtom
    public VideoSampleDescription getSampleDescription(SequentialReader sequentialReader) throws IOException {
        return new VideoSampleDescription(sequentialReader);
    }
}
