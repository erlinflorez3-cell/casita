package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public abstract class CharSink {
    protected CharSink() {
    }

    public Writer openBufferedStream() throws IOException {
        Writer writerOpenStream = openStream();
        return writerOpenStream instanceof BufferedWriter ? (BufferedWriter) writerOpenStream : new BufferedWriter(writerOpenStream);
    }

    public abstract Writer openStream() throws IOException;

    public void write(CharSequence charSequence) throws Throwable {
        Preconditions.checkNotNull(charSequence);
        try {
            Writer writer = (Writer) Closer.create().register(openStream());
            writer.append(charSequence);
            writer.flush();
        } finally {
        }
    }

    public long writeFrom(Readable readable) throws Throwable {
        Preconditions.checkNotNull(readable);
        try {
            Writer writer = (Writer) Closer.create().register(openStream());
            long jCopy = CharStreams.copy(readable, writer);
            writer.flush();
            return jCopy;
        } finally {
        }
    }

    public void writeLines(Iterable<? extends CharSequence> lines) throws Throwable {
        writeLines(lines, System.getProperty("line.separator"));
    }

    public void writeLines(Iterable<? extends CharSequence> lines, String lineSeparator) throws Throwable {
        Preconditions.checkNotNull(lines);
        Preconditions.checkNotNull(lineSeparator);
        try {
            Writer writer = (Writer) Closer.create().register(openBufferedStream());
            Iterator<? extends CharSequence> it = lines.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) lineSeparator);
            }
            writer.flush();
        } finally {
        }
    }
}
