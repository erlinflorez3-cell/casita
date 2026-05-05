package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.QuickTimeContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class MediaHeaderAtom extends FullAtom {
    public MediaHeaderAtom(SequentialReader sequentialReader, Atom atom, QuickTimeContext quickTimeContext) throws IOException {
        super(sequentialReader, atom);
        quickTimeContext.creationTime = Long.valueOf(sequentialReader.getUInt32());
        quickTimeContext.modificationTime = Long.valueOf(sequentialReader.getUInt32());
        quickTimeContext.timeScale = Long.valueOf(sequentialReader.getUInt32());
        quickTimeContext.duration = Long.valueOf(sequentialReader.getUInt32());
        sequentialReader.getUInt16();
        sequentialReader.getUInt16();
    }
}
