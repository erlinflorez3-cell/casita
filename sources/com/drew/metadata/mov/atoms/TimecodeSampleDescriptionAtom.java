package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.media.QuickTimeTimecodeDirectory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class TimecodeSampleDescriptionAtom extends SampleDescriptionAtom<TimecodeSampleDescription> {

    static class TimecodeSampleDescription extends SampleDescription {
        int flags;
        int frameDuration;
        int numberOfFrames;
        int timeScale;

        public TimecodeSampleDescription(SequentialReader sequentialReader) throws IOException {
            super(sequentialReader);
            sequentialReader.skip(4L);
            this.flags = sequentialReader.getInt32();
            this.timeScale = sequentialReader.getInt32();
            this.frameDuration = sequentialReader.getInt32();
            this.numberOfFrames = sequentialReader.getInt8();
            sequentialReader.skip(1L);
        }
    }

    public TimecodeSampleDescriptionAtom(SequentialReader sequentialReader, Atom atom) throws IOException {
        super(sequentialReader, atom);
    }

    public void addMetadata(QuickTimeTimecodeDirectory quickTimeTimecodeDirectory) {
        if (this.sampleDescriptions.size() > 0) {
            TimecodeSampleDescription timecodeSampleDescription = (TimecodeSampleDescription) this.sampleDescriptions.get(0);
            int i2 = timecodeSampleDescription.flags;
            quickTimeTimecodeDirectory.setBoolean(1, (i2 + 1) - (i2 | 1) == 1);
            quickTimeTimecodeDirectory.setBoolean(2, (-1) - (((-1) - timecodeSampleDescription.flags) | ((-1) - 2)) == 2);
            quickTimeTimecodeDirectory.setBoolean(3, (timecodeSampleDescription.flags & 4) == 4);
            int i3 = timecodeSampleDescription.flags;
            quickTimeTimecodeDirectory.setBoolean(4, (i3 + 8) - (i3 | 8) == 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.drew.metadata.mov.atoms.SampleDescriptionAtom
    public TimecodeSampleDescription getSampleDescription(SequentialReader sequentialReader) throws IOException {
        return new TimecodeSampleDescription(sequentialReader);
    }
}
