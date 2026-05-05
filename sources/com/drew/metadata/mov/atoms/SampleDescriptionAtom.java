package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.atoms.SampleDescription;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SampleDescriptionAtom<T extends SampleDescription> extends FullAtom {
    protected long numberOfEntries;
    protected ArrayList<T> sampleDescriptions;

    public SampleDescriptionAtom(SequentialReader sequentialReader, Atom atom) throws IOException {
        super(sequentialReader, atom);
        long uInt32 = sequentialReader.getUInt32();
        this.numberOfEntries = uInt32;
        if (uInt32 > 2147483647L) {
            this.numberOfEntries = 0L;
            this.sampleDescriptions = new ArrayList<>();
        } else {
            this.sampleDescriptions = new ArrayList<>((int) this.numberOfEntries);
            for (long j2 = 0; j2 < this.numberOfEntries; j2++) {
                this.sampleDescriptions.add((T) getSampleDescription(sequentialReader));
            }
        }
    }

    abstract T getSampleDescription(SequentialReader sequentialReader) throws IOException;
}
