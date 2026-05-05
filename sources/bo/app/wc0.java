package bo.app;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class wc0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f2130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f2131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f2132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2134e;

    public wc0(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(di0.f496a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f2130a = fileInputStream;
        this.f2131b = charset;
        this.f2132c = new byte[8192];
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r10 = this;
            java.io.InputStream r4 = r10.f2130a
            monitor-enter(r4)
            byte[] r2 = r10.f2132c     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto La3
            int r1 = r10.f2133d     // Catch: java.lang.Throwable -> Lab
            int r0 = r10.f2134e     // Catch: java.lang.Throwable -> Lab
            r8 = -1
            r7 = 0
            if (r1 < r0) goto L1c
            java.io.InputStream r1 = r10.f2130a     // Catch: java.lang.Throwable -> Lab
            int r0 = r2.length     // Catch: java.lang.Throwable -> Lab
            int r0 = r1.read(r2, r7, r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 == r8) goto L9d
            r10.f2133d = r7     // Catch: java.lang.Throwable -> Lab
            r10.f2134e = r0     // Catch: java.lang.Throwable -> Lab
        L1c:
            int r9 = r10.f2133d     // Catch: java.lang.Throwable -> Lab
        L1e:
            int r0 = r10.f2134e     // Catch: java.lang.Throwable -> Lab
            r6 = 10
            if (r9 == r0) goto L4e
            byte[] r5 = r10.f2132c     // Catch: java.lang.Throwable -> Lab
            r0 = r5[r9]     // Catch: java.lang.Throwable -> Lab
            if (r0 != r6) goto L4a
            int r3 = r10.f2133d     // Catch: java.lang.Throwable -> Lab
            if (r9 == r3) goto L48
            int r2 = r9 + (-1)
            r1 = r5[r2]     // Catch: java.lang.Throwable -> Lab
            r0 = 13
            if (r1 != r0) goto L48
        L36:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lab
            int r2 = r2 - r3
            java.nio.charset.Charset r0 = r10.f2131b     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> Lab
            r1.<init>(r5, r3, r2, r0)     // Catch: java.lang.Throwable -> Lab
            int r0 = r9 + 1
            r10.f2133d = r0     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            goto L4d
        L48:
            r2 = r9
            goto L36
        L4a:
            int r9 = r9 + 1
            goto L1e
        L4d:
            return r1
        L4e:
            bo.app.vc0 r5 = new bo.app.vc0     // Catch: java.lang.Throwable -> Lab
            int r1 = r10.f2134e     // Catch: java.lang.Throwable -> Lab
            int r0 = r10.f2133d     // Catch: java.lang.Throwable -> Lab
            int r1 = r1 - r0
            int r0 = r1 + 80
            r5.<init>(r10, r0)     // Catch: java.lang.Throwable -> Lab
        L5a:
            byte[] r2 = r10.f2132c     // Catch: java.lang.Throwable -> Lab
            int r1 = r10.f2133d     // Catch: java.lang.Throwable -> Lab
            int r0 = r10.f2134e     // Catch: java.lang.Throwable -> Lab
            int r0 = r0 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> Lab
            r10.f2134e = r8     // Catch: java.lang.Throwable -> Lab
            java.io.InputStream r2 = r10.f2130a     // Catch: java.lang.Throwable -> Lab
            byte[] r1 = r10.f2132c     // Catch: java.lang.Throwable -> Lab
            int r0 = r1.length     // Catch: java.lang.Throwable -> Lab
            int r0 = r2.read(r1, r7, r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 == r8) goto L97
            r10.f2133d = r7     // Catch: java.lang.Throwable -> Lab
            r10.f2134e = r0     // Catch: java.lang.Throwable -> Lab
            r3 = r7
        L76:
            int r0 = r10.f2134e     // Catch: java.lang.Throwable -> Lab
            if (r3 == r0) goto L5a
            byte[] r2 = r10.f2132c     // Catch: java.lang.Throwable -> Lab
            r0 = r2[r3]     // Catch: java.lang.Throwable -> Lab
            if (r0 != r6) goto L93
            int r1 = r10.f2133d     // Catch: java.lang.Throwable -> Lab
            if (r3 == r1) goto L89
            int r0 = r3 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> Lab
        L89:
            int r0 = r3 + 1
            r10.f2133d = r0     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            goto L96
        L93:
            int r3 = r3 + 1
            goto L76
        L96:
            return r0
        L97:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.lang.Throwable -> Lab
            r0.<init>()     // Catch: java.lang.Throwable -> Lab
            throw r0     // Catch: java.lang.Throwable -> Lab
        L9d:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.lang.Throwable -> Lab
            r0.<init>()     // Catch: java.lang.Throwable -> Lab
            throw r0     // Catch: java.lang.Throwable -> Lab
        La3:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "LineReader is closed"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lab
            throw r1     // Catch: java.lang.Throwable -> Lab
        Lab:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.wc0.a():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f2130a) {
            if (this.f2132c != null) {
                this.f2132c = null;
                this.f2130a.close();
            }
        }
    }
}
