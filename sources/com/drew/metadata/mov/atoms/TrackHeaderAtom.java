package com.drew.metadata.mov.atoms;

import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.QuickTimeDirectory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class TrackHeaderAtom extends FullAtom {
    long height;
    int[] matrix;
    long width;

    public TrackHeaderAtom(SequentialReader sequentialReader, Atom atom) throws IOException {
        super(sequentialReader, atom);
        this.matrix = new int[9];
        if (this.version == 1) {
            sequentialReader.skip(48L);
        } else {
            sequentialReader.skip(36L);
        }
        for (int i2 = 0; i2 < 9; i2++) {
            this.matrix[i2] = sequentialReader.getInt32();
        }
        this.width = sequentialReader.getInt32();
        this.height = sequentialReader.getInt32();
    }

    public void addMetadata(QuickTimeDirectory quickTimeDirectory) {
        if (this.width == 0 || this.height == 0 || quickTimeDirectory.getDoubleObject(512) != null) {
            return;
        }
        int[] iArr = this.matrix;
        quickTimeDirectory.setDouble(270, Math.toDegrees(Math.atan2(iArr[0] + iArr[3], iArr[1] + iArr[4])) - 45.0d);
    }
}
