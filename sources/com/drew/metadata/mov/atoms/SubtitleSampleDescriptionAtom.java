package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.media.QuickTimeSubtitleDirectory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class SubtitleSampleDescriptionAtom extends SampleDescriptionAtom<SubtitleSampleDescription> {

    static class SubtitleSampleDescription extends SampleDescription {
        long defaultTextBox;
        int displayFlags;
        int fontFace;
        int fontIdentifier;
        int fontSize;
        int[] foregroundColor;

        public SubtitleSampleDescription(SequentialReader sequentialReader) throws IOException {
            super(sequentialReader);
            this.displayFlags = sequentialReader.getInt32();
            sequentialReader.skip(1L);
            sequentialReader.skip(1L);
            sequentialReader.skip(4L);
            this.defaultTextBox = sequentialReader.getInt64();
            sequentialReader.skip(4L);
            this.fontIdentifier = sequentialReader.getInt16();
            this.fontFace = sequentialReader.getInt8();
            this.fontSize = sequentialReader.getInt8();
            this.foregroundColor = new int[]{sequentialReader.getUInt16(), sequentialReader.getUInt16(), sequentialReader.getUInt16()};
        }
    }

    public SubtitleSampleDescriptionAtom(SequentialReader sequentialReader, Atom atom) throws IOException {
        super(sequentialReader, atom);
    }

    public void addMetadata(QuickTimeSubtitleDirectory quickTimeSubtitleDirectory) {
        if (this.sampleDescriptions.size() == 0) {
            return;
        }
        SubtitleSampleDescription subtitleSampleDescription = (SubtitleSampleDescription) this.sampleDescriptions.get(0);
        quickTimeSubtitleDirectory.setBoolean(1, (subtitleSampleDescription.displayFlags & 536870912) == 536870912);
        int i2 = subtitleSampleDescription.displayFlags;
        quickTimeSubtitleDirectory.setBoolean(2, (i2 + 1073741824) - (i2 | 1073741824) == 1073741824);
        quickTimeSubtitleDirectory.setBoolean(3, (-1) - (((-1) - subtitleSampleDescription.displayFlags) | ((-1) - (-1073741824))) == -1073741824);
        quickTimeSubtitleDirectory.setLong(4, subtitleSampleDescription.defaultTextBox);
        quickTimeSubtitleDirectory.setInt(5, subtitleSampleDescription.fontIdentifier);
        int i3 = subtitleSampleDescription.fontFace;
        if (i3 == 1) {
            quickTimeSubtitleDirectory.setString(6, "Bold");
        } else if (i3 == 2) {
            quickTimeSubtitleDirectory.setString(6, "Italic");
        } else if (i3 == 4) {
            quickTimeSubtitleDirectory.setString(6, "Underline");
        }
        quickTimeSubtitleDirectory.setInt(7, subtitleSampleDescription.fontSize);
        quickTimeSubtitleDirectory.setIntArray(8, subtitleSampleDescription.foregroundColor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.drew.metadata.mov.atoms.SampleDescriptionAtom
    public SubtitleSampleDescription getSampleDescription(SequentialReader sequentialReader) throws IOException {
        return new SubtitleSampleDescription(sequentialReader);
    }
}
