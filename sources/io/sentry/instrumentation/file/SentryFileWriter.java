package io.sentry.instrumentation.file;

import io.sentry.IHub;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryFileWriter extends OutputStreamWriter {
    public SentryFileWriter(File file) throws FileNotFoundException {
        super(new SentryFileOutputStream(file));
    }

    public SentryFileWriter(File file, boolean z2) throws FileNotFoundException {
        super(new SentryFileOutputStream(file, z2));
    }

    SentryFileWriter(File file, boolean z2, IHub iHub) throws FileNotFoundException {
        super(new SentryFileOutputStream(file, z2, iHub));
    }

    public SentryFileWriter(FileDescriptor fileDescriptor) {
        super(new SentryFileOutputStream(fileDescriptor));
    }

    public SentryFileWriter(String str) throws FileNotFoundException {
        super(new SentryFileOutputStream(str));
    }

    public SentryFileWriter(String str, boolean z2) throws FileNotFoundException {
        super(new SentryFileOutputStream(str, z2));
    }
}
