package io.sentry.instrumentation.file;

import io.sentry.HubAdapter;
import io.sentry.IHub;
import io.sentry.ISpan;
import io.sentry.instrumentation.file.FileIOSpanManager;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryFileOutputStream extends FileOutputStream {
    private final FileOutputStream delegate;
    private final FileIOSpanManager spanManager;

    public static final class Factory {
        public static FileOutputStream create(FileOutputStream fileOutputStream, File file) throws FileNotFoundException {
            HubAdapter hubAdapter = HubAdapter.getInstance();
            return isTracingEnabled(hubAdapter) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, hubAdapter)) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file, IHub iHub) throws FileNotFoundException {
            return isTracingEnabled(iHub) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, iHub)) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file, boolean z2) throws FileNotFoundException {
            HubAdapter hubAdapter = HubAdapter.getInstance();
            return isTracingEnabled(hubAdapter) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, z2, fileOutputStream, hubAdapter)) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
            HubAdapter hubAdapter = HubAdapter.getInstance();
            return isTracingEnabled(hubAdapter) ? new SentryFileOutputStream(SentryFileOutputStream.init(fileDescriptor, fileOutputStream, hubAdapter), fileDescriptor) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, String str) throws FileNotFoundException {
            HubAdapter hubAdapter = HubAdapter.getInstance();
            if (isTracingEnabled(hubAdapter)) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, false, fileOutputStream, hubAdapter));
            }
            return fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, String str, boolean z2) throws FileNotFoundException {
            HubAdapter hubAdapter = HubAdapter.getInstance();
            if (isTracingEnabled(hubAdapter)) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, z2, fileOutputStream, hubAdapter));
            }
            return fileOutputStream;
        }

        private static boolean isTracingEnabled(IHub iHub) {
            return iHub.getOptions().isTracingEnabled();
        }
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData) throws FileNotFoundException {
        super(getFileDescriptor(fileOutputStreamInitData.delegate));
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }

    public SentryFileOutputStream(File file) throws FileNotFoundException {
        this(file, false, (IHub) HubAdapter.getInstance());
    }

    public SentryFileOutputStream(File file, boolean z2) throws FileNotFoundException {
        this(init(file, z2, null, HubAdapter.getInstance()));
    }

    SentryFileOutputStream(File file, boolean z2, IHub iHub) throws FileNotFoundException {
        this(init(file, z2, null, iHub));
    }

    public SentryFileOutputStream(FileDescriptor fileDescriptor) {
        this(init(fileDescriptor, null, HubAdapter.getInstance()), fileDescriptor);
    }

    public SentryFileOutputStream(String str) throws FileNotFoundException {
        this(str != null ? new File(str) : null, false, (IHub) HubAdapter.getInstance());
    }

    public SentryFileOutputStream(String str, boolean z2) throws FileNotFoundException {
        this(init(str != null ? new File(str) : null, z2, null, HubAdapter.getInstance()));
    }

    private static FileDescriptor getFileDescriptor(FileOutputStream fileOutputStream) throws FileNotFoundException {
        try {
            return fileOutputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileOutputStreamInitData init(File file, boolean z2, FileOutputStream fileOutputStream, IHub iHub) throws FileNotFoundException {
        FileOutputStream fileOutputStream2 = fileOutputStream;
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iHub, "file.write");
        if (fileOutputStream2 == null) {
            fileOutputStream2 = new FileOutputStream(file, z2);
        }
        return new FileOutputStreamInitData(file, z2, iSpanStartSpan, fileOutputStream2, iHub.getOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileOutputStreamInitData init(FileDescriptor fileDescriptor, FileOutputStream fileOutputStream, IHub iHub) {
        FileOutputStream fileOutputStream2 = fileOutputStream;
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iHub, "file.write");
        if (fileOutputStream2 == null) {
            fileOutputStream2 = new FileOutputStream(fileDescriptor);
        }
        return new FileOutputStreamInitData(null, false, iSpanStartSpan, fileOutputStream2, iHub.getOptions());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.spanManager.finish(this.delegate);
    }

    /* JADX INFO: renamed from: lambda$write$0$io-sentry-instrumentation-file-SentryFileOutputStream, reason: not valid java name */
    /* synthetic */ Integer m8967x4f861af1(int i2) throws IOException {
        this.delegate.write(i2);
        return 1;
    }

    /* JADX INFO: renamed from: lambda$write$1$io-sentry-instrumentation-file-SentryFileOutputStream, reason: not valid java name */
    /* synthetic */ Integer m8968x78da7032(byte[] bArr) throws IOException {
        this.delegate.write(bArr);
        return Integer.valueOf(bArr.length);
    }

    /* JADX INFO: renamed from: lambda$write$2$io-sentry-instrumentation-file-SentryFileOutputStream, reason: not valid java name */
    /* synthetic */ Integer m8969xa22ec573(byte[] bArr, int i2, int i3) throws IOException {
        this.delegate.write(bArr, i2, i3);
        return Integer.valueOf(i3);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final int i2) throws IOException {
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.SentryFileOutputStream$$ExternalSyntheticLambda1
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f$0.m8967x4f861af1(i2);
            }
        });
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final byte[] bArr) throws IOException {
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.SentryFileOutputStream$$ExternalSyntheticLambda2
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f$0.m8968x78da7032(bArr);
            }
        });
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final byte[] bArr, final int i2, final int i3) throws IOException {
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.SentryFileOutputStream$$ExternalSyntheticLambda0
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f$0.m8969xa22ec573(bArr, i2, i3);
            }
        });
    }
}
