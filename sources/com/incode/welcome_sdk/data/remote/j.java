package com.incode.welcome_sdk.data.remote;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends RequestBody {

    /* JADX INFO: renamed from: b */
    private static int f10193b = 0;

    /* JADX INFO: renamed from: g */
    private static int f10194g = 1;

    /* JADX INFO: renamed from: a */
    b f10195a;

    /* JADX INFO: renamed from: c */
    int f10196c = 0;

    /* JADX INFO: renamed from: d */
    private RequestBody f10197d;

    /* JADX INFO: renamed from: e */
    int f10198e;

    @FunctionalInterface
    public interface b {
        void onRequestProgress(long j2, long j3);
    }

    public j(RequestBody requestBody, b bVar, boolean z2) {
        b(requestBody, bVar, z2 ? 1 : 0);
    }

    private void b(RequestBody requestBody, b bVar, int i2) {
        int i3 = 2 % 2;
        int i4 = f10193b + 49;
        f10194g = i4 % 128;
        if (i4 % 2 == 0) {
            this.f10197d = requestBody;
            this.f10195a = bVar;
            this.f10198e = i2;
            int i5 = 11 / 0;
            return;
        }
        this.f10197d = requestBody;
        this.f10195a = bVar;
        this.f10198e = i2;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        int i2 = 2 % 2;
        int i3 = f10193b + 39;
        f10194g = i3 % 128;
        int i4 = i3 % 2;
        RequestBody requestBody = this.f10197d;
        if (i4 != 0) {
            return requestBody.contentType();
        }
        requestBody.contentType();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        int i2 = 2 % 2;
        int i3 = f10194g + 105;
        f10193b = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                long jContentLength = this.f10197d.contentLength();
                int i4 = f10194g + 65;
                f10193b = i4 % 128;
                if (i4 % 2 == 0) {
                    return jContentLength;
                }
                obj.hashCode();
                throw null;
            }
            this.f10197d.contentLength();
            obj.hashCode();
            throw null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1L;
        }
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        int i2 = 2 % 2;
        this.f10196c++;
        BufferedSink bufferedSinkBuffer = Okio.buffer(new a(bufferedSink));
        this.f10197d.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
        int i3 = f10193b + 63;
        f10194g = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final class a extends ForwardingSink {

        /* JADX INFO: renamed from: a */
        private static int f10199a = 1;

        /* JADX INFO: renamed from: d */
        private static int f10200d = 0;

        /* JADX INFO: renamed from: c */
        private long f10201c;

        a(Sink sink) {
            super(sink);
            this.f10201c = 0L;
        }

        @Override // okio.ForwardingSink, okio.Sink
        public final void write(Buffer buffer, long j2) throws IOException {
            int i2 = 2 % 2;
            int i3 = f10199a + 29;
            f10200d = i3 % 128;
            if (i3 % 2 != 0) {
                super.write(buffer, j2);
                int i4 = 7 / 0;
                if (j.this.f10196c <= j.this.f10198e) {
                    return;
                }
            } else {
                super.write(buffer, j2);
                if (j.this.f10196c <= j.this.f10198e) {
                    return;
                }
            }
            int i5 = f10200d + 49;
            f10199a = i5 % 128;
            if (i5 % 2 == 0) {
                this.f10201c /= j2;
                if (j.this.f10195a == null) {
                    return;
                }
            } else {
                this.f10201c += j2;
                if (j.this.f10195a == null) {
                    return;
                }
            }
            j.this.f10195a.onRequestProgress(this.f10201c, j.this.contentLength());
        }
    }
}
