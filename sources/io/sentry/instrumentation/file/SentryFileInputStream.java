package io.sentry.instrumentation.file;

import io.sentry.HubAdapter;
import io.sentry.IHub;
import io.sentry.ISpan;
import io.sentry.instrumentation.file.FileIOSpanManager;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryFileInputStream extends FileInputStream {
    private final FileInputStream delegate;
    private final FileIOSpanManager spanManager;

    public static final class Factory {
        public static FileInputStream create(FileInputStream fileInputStream, File file) throws FileNotFoundException {
            HubAdapter hubAdapter = HubAdapter.getInstance();
            return isTracingEnabled(hubAdapter) ? new SentryFileInputStream(SentryFileInputStream.init(file, fileInputStream, hubAdapter)) : fileInputStream;
        }

        static FileInputStream create(FileInputStream fileInputStream, File file, IHub iHub) throws FileNotFoundException {
            return isTracingEnabled(iHub) ? new SentryFileInputStream(SentryFileInputStream.init(file, fileInputStream, iHub)) : fileInputStream;
        }

        public static FileInputStream create(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
            HubAdapter hubAdapter = HubAdapter.getInstance();
            return isTracingEnabled(hubAdapter) ? new SentryFileInputStream(SentryFileInputStream.init(fileDescriptor, fileInputStream, hubAdapter), fileDescriptor) : fileInputStream;
        }

        public static FileInputStream create(FileInputStream fileInputStream, String str) throws FileNotFoundException {
            HubAdapter hubAdapter = HubAdapter.getInstance();
            if (isTracingEnabled(hubAdapter)) {
                return new SentryFileInputStream(SentryFileInputStream.init(str != null ? new File(str) : null, fileInputStream, hubAdapter));
            }
            return fileInputStream;
        }

        private static boolean isTracingEnabled(IHub iHub) {
            return iHub.getOptions().isTracingEnabled();
        }
    }

    private SentryFileInputStream(FileInputStreamInitData fileInputStreamInitData) throws FileNotFoundException {
        super(getFileDescriptor(fileInputStreamInitData.delegate));
        this.spanManager = new FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.options);
        this.delegate = fileInputStreamInitData.delegate;
    }

    private SentryFileInputStream(FileInputStreamInitData fileInputStreamInitData, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.options);
        this.delegate = fileInputStreamInitData.delegate;
    }

    public SentryFileInputStream(File file) throws FileNotFoundException {
        this(file, HubAdapter.getInstance());
    }

    SentryFileInputStream(File file, IHub iHub) throws FileNotFoundException {
        this(init(file, (FileInputStream) null, iHub));
    }

    public SentryFileInputStream(FileDescriptor fileDescriptor) {
        this(fileDescriptor, HubAdapter.getInstance());
    }

    SentryFileInputStream(FileDescriptor fileDescriptor, IHub iHub) {
        this(init(fileDescriptor, (FileInputStream) null, iHub), fileDescriptor);
    }

    public SentryFileInputStream(String str) throws FileNotFoundException {
        this(str != null ? new File(str) : null, HubAdapter.getInstance());
    }

    private static FileDescriptor getFileDescriptor(FileInputStream fileInputStream) throws FileNotFoundException {
        try {
            return fileInputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileInputStreamInitData init(File file, FileInputStream fileInputStream, IHub iHub) throws FileNotFoundException {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iHub, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new FileInputStreamInitData(file, iSpanStartSpan, fileInputStream, iHub.getOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileInputStreamInitData init(FileDescriptor fileDescriptor, FileInputStream fileInputStream, IHub iHub) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iHub, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(fileDescriptor);
        }
        return new FileInputStreamInitData(null, iSpanStartSpan, fileInputStream, iHub.getOptions());
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.spanManager.finish(this.delegate);
    }

    /* JADX INFO: renamed from: lambda$read$0$io-sentry-instrumentation-file-SentryFileInputStream, reason: not valid java name */
    /* synthetic */ Integer m8963xfe779029(AtomicInteger atomicInteger) throws IOException {
        int i2 = this.delegate.read();
        atomicInteger.set(i2);
        return Integer.valueOf(i2 != -1 ? 1 : 0);
    }

    /* JADX INFO: renamed from: lambda$read$1$io-sentry-instrumentation-file-SentryFileInputStream, reason: not valid java name */
    /* synthetic */ Integer m8964x18930ec8(byte[] bArr) throws IOException {
        return Integer.valueOf(this.delegate.read(bArr));
    }

    /* JADX INFO: renamed from: lambda$read$2$io-sentry-instrumentation-file-SentryFileInputStream, reason: not valid java name */
    /* synthetic */ Integer m8965x32ae8d67(byte[] bArr, int i2, int i3) throws IOException {
        return Integer.valueOf(this.delegate.read(bArr, i2, i3));
    }

    /* JADX INFO: renamed from: lambda$skip$3$io-sentry-instrumentation-file-SentryFileInputStream, reason: not valid java name */
    /* synthetic */ Long m8966xe63a8dfd(long j2) throws IOException {
        return Long.valueOf(this.delegate.skip(j2));
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read() throws IOException {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.SentryFileInputStream$$ExternalSyntheticLambda3
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f$0.m8963xfe779029(atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(final byte[] bArr) throws IOException {
        return ((Integer) this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.SentryFileInputStream$$ExternalSyntheticLambda2
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f$0.m8964x18930ec8(bArr);
            }
        })).intValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(final byte[] bArr, final int i2, final int i3) throws IOException {
        return ((Integer) this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.SentryFileInputStream$$ExternalSyntheticLambda1
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f$0.m8965x32ae8d67(bArr, i2, i3);
            }
        })).intValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public long skip(final long j2) throws IOException {
        return ((Long) this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.SentryFileInputStream$$ExternalSyntheticLambda0
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f$0.m8966xe63a8dfd(j2);
            }
        })).longValue();
    }
}
