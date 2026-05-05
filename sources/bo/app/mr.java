package bo.app;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class mr extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nr f1315a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(nr nrVar, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f1315a = nrVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f1315a.f1393c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f1315a.f1393c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i2) {
        try {
            ((FilterOutputStream) this).out.write(i2);
        } catch (IOException unused) {
            this.f1315a.f1393c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i2, i3);
        } catch (IOException unused) {
            this.f1315a.f1393c = true;
        }
    }
}
