package com.incode.welcome_sdk.data.remote;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends ResponseBody {

    /* JADX INFO: renamed from: a */
    public static int f10121a = 0;

    /* JADX INFO: renamed from: d */
    public static int f10122d = 0;

    /* JADX INFO: renamed from: h */
    private static int f10123h = 1;

    /* JADX INFO: renamed from: i */
    private static int f10124i = 0;

    /* JADX INFO: renamed from: b */
    int f10125b;

    /* JADX INFO: renamed from: c */
    ResponseBody f10126c;

    /* JADX INFO: renamed from: e */
    InterfaceC0239e f10127e;

    /* JADX INFO: renamed from: j */
    private BufferedSource f10128j;

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.remote.e$e */
    public interface InterfaceC0239e {
        void onResponseProgress(int i2, long j2, long j3, boolean z2);
    }

    public e(ResponseBody responseBody, int i2, InterfaceC0239e interfaceC0239e) {
        this.f10126c = responseBody;
        this.f10125b = i2;
        this.f10127e = interfaceC0239e;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        int i2 = 2 % 2;
        int i3 = f10123h + 97;
        f10124i = i3 % 128;
        if (i3 % 2 != 0) {
            this.f10126c.contentType();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MediaType mediaTypeContentType = this.f10126c.contentType();
        int i4 = f10123h + 91;
        f10124i = i4 % 128;
        int i5 = i4 % 2;
        return mediaTypeContentType;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        long jContentLength;
        int i2 = 2 % 2;
        int i3 = f10123h + 27;
        f10124i = i3 % 128;
        if (i3 % 2 != 0) {
            jContentLength = this.f10126c.contentLength();
            int i4 = 22 / 0;
        } else {
            jContentLength = this.f10126c.contentLength();
        }
        int i5 = f10123h + 53;
        f10124i = i5 % 128;
        if (i5 % 2 == 0) {
            return jContentLength;
        }
        throw null;
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        int i2 = 2 % 2;
        if (this.f10128j == null) {
            int i3 = f10124i + 69;
            f10123h = i3 % 128;
            if (i3 % 2 == 0) {
                this.f10128j = Okio.buffer(c(this.f10126c.source()));
                throw null;
            }
            this.f10128j = Okio.buffer(c(this.f10126c.source()));
        }
        BufferedSource bufferedSource = this.f10128j;
        int i4 = f10123h + 37;
        f10124i = i4 % 128;
        if (i4 % 2 == 0) {
            return bufferedSource;
        }
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.remote.e$1 */
    final class AnonymousClass1 extends ForwardingSource {

        /* JADX INFO: renamed from: a */
        private static int f10129a = 0;

        /* JADX INFO: renamed from: d */
        private static int f10130d = 1;

        /* JADX INFO: renamed from: c */
        private long f10132c = 0;

        AnonymousClass1(Source source) {
            super(source);
            this.f10132c = 0L;
        }

        @Override // okio.ForwardingSource, okio.Source
        public final long read(Buffer buffer, long j2) throws IOException {
            int i2 = 2 % 2;
            int i3 = f10129a + 125;
            f10130d = i3 % 128;
            int i4 = i3 % 2;
            long j3 = super.read(buffer, j2);
            this.f10132c += j3 != -1 ? j3 : 0L;
            if (e.this.f10127e != null) {
                int i5 = f10129a + 101;
                f10130d = i5 % 128;
                if (i5 % 2 != 0) {
                    e.this.f10127e.onResponseProgress(e.this.f10125b, this.f10132c, e.this.f10126c.contentLength(), !(j3 != -1));
                    int i6 = f10129a + 9;
                    f10130d = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    InterfaceC0239e interfaceC0239e = e.this.f10127e;
                    int i8 = e.this.f10125b;
                    e.this.f10126c.contentLength();
                    throw null;
                }
            }
            return j3;
        }
    }

    private Source c(Source source) {
        int i2 = 2 % 2;
        AnonymousClass1 anonymousClass1 = new ForwardingSource(source) { // from class: com.incode.welcome_sdk.data.remote.e.1

            /* JADX INFO: renamed from: a */
            private static int f10129a = 0;

            /* JADX INFO: renamed from: d */
            private static int f10130d = 1;

            /* JADX INFO: renamed from: c */
            private long f10132c = 0;

            AnonymousClass1(Source source2) {
                super(source2);
                this.f10132c = 0L;
            }

            @Override // okio.ForwardingSource, okio.Source
            public final long read(Buffer buffer, long j2) throws IOException {
                int i22 = 2 % 2;
                int i3 = f10129a + 125;
                f10130d = i3 % 128;
                int i4 = i3 % 2;
                long j3 = super.read(buffer, j2);
                this.f10132c += j3 != -1 ? j3 : 0L;
                if (e.this.f10127e != null) {
                    int i5 = f10129a + 101;
                    f10130d = i5 % 128;
                    if (i5 % 2 != 0) {
                        e.this.f10127e.onResponseProgress(e.this.f10125b, this.f10132c, e.this.f10126c.contentLength(), !(j3 != -1));
                        int i6 = f10129a + 9;
                        f10130d = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        InterfaceC0239e interfaceC0239e = e.this.f10127e;
                        int i8 = e.this.f10125b;
                        e.this.f10126c.contentLength();
                        throw null;
                    }
                }
                return j3;
            }
        };
        int i3 = f10123h + 123;
        f10124i = i3 % 128;
        if (i3 % 2 == 0) {
            return anonymousClass1;
        }
        throw null;
    }

    public static int d() {
        int i2 = f10122d;
        int i3 = i2 % 6793462;
        f10122d = i2 + 1;
        if (i3 != 0) {
            return f10121a;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        f10121a = iFreeMemory;
        return iFreeMemory;
    }
}
