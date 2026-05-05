package com.drew.imaging.mp4;

import com.drew.metadata.Metadata;
import com.drew.metadata.mp4.Mp4Context;
import com.drew.metadata.mp4.Mp4Directory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Mp4Handler<T extends Mp4Directory> {
    protected T directory;
    protected Metadata metadata;

    public Mp4Handler(Metadata metadata) {
        this.metadata = metadata;
        T t2 = (T) getDirectory();
        this.directory = t2;
        metadata.addDirectory(t2);
    }

    public void addError(String str) {
        this.directory.addError(str);
    }

    protected abstract T getDirectory();

    protected abstract Mp4Handler<?> processBox(String str, byte[] bArr, long j2, Mp4Context mp4Context) throws IOException;

    protected Mp4Handler<?> processContainer(String str, long j2, Mp4Context mp4Context) throws IOException {
        return processBox(str, null, j2, mp4Context);
    }

    protected abstract boolean shouldAcceptBox(String str);

    protected abstract boolean shouldAcceptContainer(String str);
}
