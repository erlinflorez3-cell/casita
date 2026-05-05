package com.drew.metadata.mov.media;

import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mov.QuickTimeContext;
import com.drew.metadata.mov.QuickTimeMediaHandler;
import com.drew.metadata.mov.atoms.Atom;
import com.drew.metadata.mov.atoms.SoundInformationMediaHeaderAtom;
import com.drew.metadata.mov.atoms.SoundSampleDescriptionAtom;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeSoundHandler extends QuickTimeMediaHandler<QuickTimeSoundDirectory> {
    public QuickTimeSoundHandler(Metadata metadata, QuickTimeContext quickTimeContext) {
        super(metadata, quickTimeContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.drew.imaging.quicktime.QuickTimeHandler
    public QuickTimeSoundDirectory createDirectory() {
        return new QuickTimeSoundDirectory();
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    protected String getMediaInformation() {
        return "smhd";
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    public void processMediaInformation(SequentialReader sequentialReader, Atom atom) throws IOException {
        new SoundInformationMediaHeaderAtom(sequentialReader, atom).addMetadata((QuickTimeSoundDirectory) this.directory);
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    public void processSampleDescription(SequentialReader sequentialReader, Atom atom) throws IOException {
        new SoundSampleDescriptionAtom(sequentialReader, atom).addMetadata((QuickTimeSoundDirectory) this.directory);
    }

    @Override // com.drew.metadata.mov.QuickTimeMediaHandler
    protected void processTimeToSample(SequentialReader sequentialReader, Atom atom, QuickTimeContext quickTimeContext) throws IOException {
        if (quickTimeContext.timeScale != null) {
            ((QuickTimeSoundDirectory) this.directory).setDouble(772, quickTimeContext.timeScale.longValue());
        }
    }
}
