package com.drew.metadata.mov;

import com.drew.imaging.quicktime.QuickTimeHandler;
import com.drew.lang.DateUtil;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mov.QuickTimeDirectory;
import com.drew.metadata.mov.atoms.Atom;
import com.drew.metadata.mov.media.QuickTimeMediaDirectory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QuickTimeMediaHandler<T extends QuickTimeDirectory> extends QuickTimeHandler<T> {
    public QuickTimeMediaHandler(Metadata metadata, QuickTimeContext quickTimeContext) {
        super(metadata);
        if (quickTimeContext.creationTime == null || quickTimeContext.modificationTime == null) {
            return;
        }
        this.directory.setDate(QuickTimeMediaDirectory.TAG_CREATION_TIME, DateUtil.get1Jan1904EpochDate(quickTimeContext.creationTime.longValue()));
        this.directory.setDate(QuickTimeMediaDirectory.TAG_MODIFICATION_TIME, DateUtil.get1Jan1904EpochDate(quickTimeContext.modificationTime.longValue()));
    }

    protected abstract String getMediaInformation();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.drew.imaging.quicktime.QuickTimeHandler
    public QuickTimeMediaHandler<?> processAtom(Atom atom, byte[] bArr, QuickTimeContext quickTimeContext) throws IOException {
        if (bArr != null) {
            SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr);
            if (atom.type.equals(getMediaInformation())) {
                processMediaInformation(sequentialByteArrayReader, atom);
            } else if (atom.type.equals("stsd")) {
                processSampleDescription(sequentialByteArrayReader, atom);
            } else if (atom.type.equals("stts")) {
                processTimeToSample(sequentialByteArrayReader, atom, quickTimeContext);
            }
        }
        return this;
    }

    protected abstract void processMediaInformation(SequentialReader sequentialReader, Atom atom) throws IOException;

    protected abstract void processSampleDescription(SequentialReader sequentialReader, Atom atom) throws IOException;

    protected abstract void processTimeToSample(SequentialReader sequentialReader, Atom atom, QuickTimeContext quickTimeContext) throws IOException;

    @Override // com.drew.imaging.quicktime.QuickTimeHandler
    public boolean shouldAcceptAtom(Atom atom) {
        return atom.type.equals(getMediaInformation()) || atom.type.equals("stsd") || atom.type.equals("stts");
    }

    @Override // com.drew.imaging.quicktime.QuickTimeHandler
    public boolean shouldAcceptContainer(Atom atom) {
        return atom.type.equals("stbl") || atom.type.equals("minf") || atom.type.equals("gmhd") || atom.type.equals("tmcd");
    }
}
