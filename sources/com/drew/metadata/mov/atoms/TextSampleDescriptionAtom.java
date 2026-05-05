package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.media.QuickTimeTextDirectory;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class TextSampleDescriptionAtom extends SampleDescriptionAtom<TextSampleDescription> {

    static class TextSampleDescription extends SampleDescription {
        int[] backgroundColor;
        long defaultTextBox;
        int displayFlags;
        int fontFace;
        int fontNumber;
        int[] foregroundColor;
        int textJustification;
        String textName;

        public TextSampleDescription(SequentialReader sequentialReader) throws IOException {
            super(sequentialReader);
            this.displayFlags = sequentialReader.getInt32();
            this.textJustification = sequentialReader.getInt32();
            this.backgroundColor = new int[]{sequentialReader.getUInt16(), sequentialReader.getUInt16(), sequentialReader.getUInt16()};
            this.defaultTextBox = sequentialReader.getInt64();
            sequentialReader.skip(8L);
            this.fontNumber = sequentialReader.getUInt16();
            this.fontFace = sequentialReader.getUInt16();
            sequentialReader.skip(1L);
            sequentialReader.skip(2L);
            this.foregroundColor = new int[]{sequentialReader.getUInt16(), sequentialReader.getUInt16(), sequentialReader.getUInt16()};
            this.textName = sequentialReader.getString(sequentialReader.getUInt8());
        }
    }

    public TextSampleDescriptionAtom(SequentialReader sequentialReader, Atom atom) throws IOException {
        super(sequentialReader, atom);
    }

    public void addMetadata(QuickTimeTextDirectory quickTimeTextDirectory) {
        if (this.sampleDescriptions.size() == 0) {
            return;
        }
        TextSampleDescription textSampleDescription = (TextSampleDescription) this.sampleDescriptions.get(0);
        quickTimeTextDirectory.setBoolean(1, (textSampleDescription.displayFlags & 2) == 2);
        quickTimeTextDirectory.setBoolean(2, (-1) - (((-1) - textSampleDescription.displayFlags) | ((-1) - 8)) == 8);
        quickTimeTextDirectory.setBoolean(3, (textSampleDescription.displayFlags & 32) == 32);
        quickTimeTextDirectory.setBoolean(4, (textSampleDescription.displayFlags & 64) == 64);
        quickTimeTextDirectory.setString(5, (textSampleDescription.displayFlags & 128) == 128 ? "Horizontal" : "Vertical");
        int i2 = textSampleDescription.displayFlags;
        quickTimeTextDirectory.setString(6, (i2 + 256) - (i2 | 256) == 256 ? "Reverse" : ReactProgressBarViewManager.DEFAULT_STYLE);
        quickTimeTextDirectory.setBoolean(7, (-1) - (((-1) - textSampleDescription.displayFlags) | ((-1) - 512)) == 512);
        quickTimeTextDirectory.setBoolean(8, (-1) - (((-1) - textSampleDescription.displayFlags) | ((-1) - 4096)) == 4096);
        quickTimeTextDirectory.setBoolean(9, (-1) - (((-1) - textSampleDescription.displayFlags) | ((-1) - 8192)) == 8192);
        quickTimeTextDirectory.setBoolean(10, (-1) - (((-1) - textSampleDescription.displayFlags) | ((-1) - 16384)) == 16384);
        int i3 = textSampleDescription.textJustification;
        if (i3 == -1) {
            quickTimeTextDirectory.setString(11, "Right");
        } else if (i3 == 0) {
            quickTimeTextDirectory.setString(11, "Left");
        } else if (i3 == 1) {
            quickTimeTextDirectory.setString(11, "Center");
        }
        quickTimeTextDirectory.setIntArray(12, textSampleDescription.backgroundColor);
        quickTimeTextDirectory.setLong(13, textSampleDescription.defaultTextBox);
        quickTimeTextDirectory.setInt(14, textSampleDescription.fontNumber);
        int i4 = textSampleDescription.fontFace;
        if (i4 == 1) {
            quickTimeTextDirectory.setString(15, "Bold");
        } else if (i4 == 2) {
            quickTimeTextDirectory.setString(15, "Italic");
        } else if (i4 == 4) {
            quickTimeTextDirectory.setString(15, "Underline");
        } else if (i4 == 8) {
            quickTimeTextDirectory.setString(15, "Outline");
        } else if (i4 == 16) {
            quickTimeTextDirectory.setString(15, "Shadow");
        } else if (i4 == 32) {
            quickTimeTextDirectory.setString(15, "Condense");
        } else if (i4 == 64) {
            quickTimeTextDirectory.setString(15, "Extend");
        }
        quickTimeTextDirectory.setIntArray(16, textSampleDescription.foregroundColor);
        quickTimeTextDirectory.setString(17, textSampleDescription.textName);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.drew.metadata.mov.atoms.SampleDescriptionAtom
    public TextSampleDescription getSampleDescription(SequentialReader sequentialReader) throws IOException {
        return new TextSampleDescription(sequentialReader);
    }
}
