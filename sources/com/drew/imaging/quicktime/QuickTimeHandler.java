package com.drew.imaging.quicktime;

import com.drew.metadata.Metadata;
import com.drew.metadata.mov.QuickTimeContext;
import com.drew.metadata.mov.QuickTimeDirectory;
import com.drew.metadata.mov.atoms.Atom;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QuickTimeHandler<T extends QuickTimeDirectory> {
    protected T directory;
    protected Metadata metadata;

    public QuickTimeHandler(Metadata metadata) {
        this.metadata = metadata;
        T t2 = (T) createDirectory();
        this.directory = t2;
        metadata.addDirectory(t2);
    }

    public void addError(String str) {
        this.directory.addError(str);
    }

    protected abstract T createDirectory();

    protected abstract QuickTimeHandler<?> processAtom(Atom atom, byte[] bArr, QuickTimeContext quickTimeContext) throws IOException;

    protected QuickTimeHandler<?> processContainer(Atom atom, QuickTimeContext quickTimeContext) throws IOException {
        return processAtom(atom, null, quickTimeContext);
    }

    protected abstract boolean shouldAcceptAtom(Atom atom);

    protected abstract boolean shouldAcceptContainer(Atom atom);
}
