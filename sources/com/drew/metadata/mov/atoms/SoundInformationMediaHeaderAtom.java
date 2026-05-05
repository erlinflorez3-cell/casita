package com.drew.metadata.mov.atoms;

import androidx.core.internal.view.SupportMenu;
import com.drew.lang.SequentialReader;
import com.drew.metadata.mov.media.QuickTimeSoundDirectory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class SoundInformationMediaHeaderAtom extends FullAtom {
    int balance;

    public SoundInformationMediaHeaderAtom(SequentialReader sequentialReader, Atom atom) throws IOException {
        super(sequentialReader, atom);
        this.balance = sequentialReader.getInt16();
        sequentialReader.skip(2L);
    }

    public void addMetadata(QuickTimeSoundDirectory quickTimeSoundDirectory) {
        int i2 = this.balance;
        quickTimeSoundDirectory.setDouble(773, ((double) ((-1) - (((-1) - SupportMenu.CATEGORY_MASK) | ((-1) - i2)))) + (((double) ((i2 + 65535) - (i2 | 65535))) / Math.pow(2.0d, 4.0d)));
    }
}
