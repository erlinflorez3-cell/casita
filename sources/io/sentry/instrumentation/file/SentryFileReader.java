package io.sentry.instrumentation.file;

import io.sentry.IHub;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryFileReader extends InputStreamReader {
    public SentryFileReader(File file) throws FileNotFoundException {
        super(new SentryFileInputStream(file));
    }

    SentryFileReader(File file, IHub iHub) throws FileNotFoundException {
        super(new SentryFileInputStream(file, iHub));
    }

    public SentryFileReader(FileDescriptor fileDescriptor) {
        super(new SentryFileInputStream(fileDescriptor));
    }

    public SentryFileReader(String str) throws FileNotFoundException {
        super(new SentryFileInputStream(str));
    }
}
