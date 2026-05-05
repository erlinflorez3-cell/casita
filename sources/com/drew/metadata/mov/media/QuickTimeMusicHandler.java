package com.drew.metadata.mov.media;

import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mov.QuickTimeContext;
import com.drew.metadata.mov.QuickTimeMediaHandler;
import com.drew.metadata.mov.atoms.Atom;
import com.drew.metadata.mov.atoms.MusicSampleDescriptionAtom;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeMusicHandler extends QuickTimeMediaHandler<QuickTimeMusicDirectory> {
    public QuickTimeMusicHandler(Metadata metadata, QuickTimeContext quickTimeContext) {
        super(metadata, quickTimeContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.drew.imaging.quicktime.QuickTimeHandler
    public QuickTimeMusicDirectory createDirectory() {
        return new QuickTimeMusicDirectory();
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    protected String getMediaInformation() {
        return null;
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    protected void processMediaInformation(SequentialReader sequentialReader, Atom atom) throws IOException {
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    protected void processSampleDescription(SequentialReader sequentialReader, Atom atom) throws IOException {
        new MusicSampleDescriptionAtom(sequentialReader, atom).addMetadata((QuickTimeMusicDirectory) this.directory);
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    protected void processTimeToSample(SequentialReader sequentialReader, Atom atom, QuickTimeContext quickTimeContext) throws IOException {
    }
}
