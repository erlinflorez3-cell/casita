package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.QuickTimeContext;
import com.drew.metadata.mov.media.QuickTimeVideoDirectory;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class TimeToSampleAtom extends FullAtom {
    private final ArrayList<Entry> entries;

    static class Entry {
        long sampleCount;
        long sampleDuration;

        public Entry(SequentialReader sequentialReader) throws IOException {
            this.sampleCount = sequentialReader.getUInt32();
            this.sampleDuration = sequentialReader.getUInt32();
        }
    }

    public TimeToSampleAtom(SequentialReader sequentialReader, Atom atom) throws IOException {
        super(sequentialReader, atom);
        long uInt32 = sequentialReader.getUInt32();
        if (uInt32 >= 2147483647L) {
            this.entries = new ArrayList<>();
            return;
        }
        this.entries = new ArrayList<>((int) uInt32);
        for (int i2 = 0; i2 < uInt32; i2++) {
            this.entries.add(new Entry(sequentialReader));
        }
    }

    public void addMetadata(QuickTimeVideoDirectory quickTimeVideoDirectory, QuickTimeContext quickTimeContext) {
        if (quickTimeContext.timeScale == null || this.entries.size() <= 0) {
            return;
        }
        quickTimeVideoDirectory.setFloat(14, quickTimeContext.timeScale.longValue() / this.entries.get(0).sampleDuration);
    }
}
