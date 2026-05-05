package com.drew.metadata.mov.media;

import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mov.QuickTimeContext;
import com.drew.metadata.mov.QuickTimeMediaHandler;
import com.drew.metadata.mov.atoms.Atom;
import com.drew.metadata.mov.atoms.TimeToSampleAtom;
import com.drew.metadata.mov.atoms.VideoInformationMediaHeaderAtom;
import com.drew.metadata.mov.atoms.VideoSampleDescriptionAtom;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeVideoHandler extends QuickTimeMediaHandler<QuickTimeVideoDirectory> {
    public QuickTimeVideoHandler(Metadata metadata, QuickTimeContext quickTimeContext) {
        super(metadata, quickTimeContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.drew.imaging.quicktime.QuickTimeHandler
    public QuickTimeVideoDirectory createDirectory() {
        return new QuickTimeVideoDirectory();
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    protected String getMediaInformation() {
        return "vmhd";
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    public void processMediaInformation(SequentialReader sequentialReader, Atom atom) throws IOException {
        new VideoInformationMediaHeaderAtom(sequentialReader, atom).addMetadata((QuickTimeVideoDirectory) this.directory);
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    public void processSampleDescription(SequentialReader sequentialReader, Atom atom) throws IOException {
        new VideoSampleDescriptionAtom(sequentialReader, atom).addMetadata((QuickTimeVideoDirectory) this.directory);
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    public void processTimeToSample(SequentialReader sequentialReader, Atom atom, QuickTimeContext quickTimeContext) throws IOException {
        new TimeToSampleAtom(sequentialReader, atom).addMetadata((QuickTimeVideoDirectory) this.directory, quickTimeContext);
    }
}
