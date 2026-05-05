package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors;

import java.io.IOException;
import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;

/* JADX INFO: loaded from: classes5.dex */
class ProgressRequestBody extends RequestBody {
    private Listener listener;
    private final RequestBody requestBody;

    interface Listener {
        void onUploadProgressChanged(long j2, long j3);
    }

    protected final class ProgressStream extends OutputStream {
        private long bytesSent;
        private final OutputStream stream;
        private long totalBytes;

        ProgressStream(OutputStream outputStream, long j2) {
            this.stream = outputStream;
            this.totalBytes = j2;
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.stream.write(i2);
            this.bytesSent++;
            ProgressRequestBody.this.listener.onUploadProgressChanged(this.bytesSent, this.totalBytes);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.stream.write(bArr, i2, i3);
            if (i3 < bArr.length) {
                this.bytesSent += (long) i3;
            } else {
                this.bytesSent += (long) bArr.length;
            }
            ProgressRequestBody.this.listener.onUploadProgressChanged(this.bytesSent, this.totalBytes);
        }
    }

    ProgressRequestBody(RequestBody requestBody, Listener listener) {
        this.requestBody = requestBody;
        this.listener = listener;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.requestBody.contentLength();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.requestBody.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(new ProgressStream(bufferedSink.outputStream(), contentLength())));
        this.requestBody.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
    }
}
