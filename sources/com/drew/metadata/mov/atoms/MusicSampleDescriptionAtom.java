package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.media.QuickTimeMusicDirectory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class MusicSampleDescriptionAtom extends SampleDescriptionAtom<MusicSampleDescription> {

    static class MusicSampleDescription extends SampleDescription {
        long flags;

        public MusicSampleDescription(SequentialReader sequentialReader) throws IOException {
            super(sequentialReader);
            this.flags = sequentialReader.getUInt32();
        }
    }

    public MusicSampleDescriptionAtom(SequentialReader sequentialReader, Atom atom) throws IOException {
        super(sequentialReader, atom);
    }

    public void addMetadata(QuickTimeMusicDirectory quickTimeMusicDirectory) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.drew.metadata.mov.atoms.SampleDescriptionAtom
    public MusicSampleDescription getSampleDescription(SequentialReader sequentialReader) throws IOException {
        return new MusicSampleDescription(sequentialReader);
    }
}
