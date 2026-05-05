package o.v;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26858g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static c f26859h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26860j = 0;

    private c(Context context) {
        super(context);
    }

    private static synchronized void a(Context context) {
        int i2 = 2 % 2;
        f26859h = new c(context);
        int i3 = f26860j + 117;
        f26858g = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized o.v.c e(android.content.Context r7) {
        /*
            java.lang.Class<o.v.c> r6 = o.v.c.class
            monitor-enter(r6)
            r5 = 2
            int r0 = r5 % r5
            int r3 = o.v.c.f26860j     // Catch: java.lang.Throwable -> L5d
            r2 = r3 ^ 31
            r0 = 31
            int r1 = r3 + r0
            r0 = r0 | r3
            int r1 = r1 - r0
            int r0 = r1 << 1
            int r2 = r2 + r0
            int r0 = r2 % 128
            o.v.c.f26858g = r0     // Catch: java.lang.Throwable -> L5d
            int r2 = r2 % r5
            o.v.c r0 = o.v.c.f26859h     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L36
            r2 = r3 ^ 9
            r0 = 9
            int r1 = (-1) - r3
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r0 = r0 << 1
            int r2 = r2 + r0
            int r0 = r2 % 128
            o.v.c.f26858g = r0     // Catch: java.lang.Throwable -> L5d
            int r2 = r2 % r5
            if (r2 == 0) goto L56
            a(r7)     // Catch: java.lang.Throwable -> L5d
            int r0 = r5 % r5
        L36:
            o.v.c r4 = o.v.c.f26859h     // Catch: java.lang.Throwable -> L5d
            int r3 = o.v.c.f26860j     // Catch: java.lang.Throwable -> L5d
            r2 = r3 ^ 37
            r1 = 37
            int r0 = r3 + r1
            r3 = r3 | r1
            int r0 = r0 - r3
            int r0 = r0 << 1
            int r2 = r2 + r0
            int r0 = r2 % 128
            o.v.c.f26858g = r0     // Catch: java.lang.Throwable -> L5d
            int r2 = r2 % r5
            if (r2 != 0) goto L54
            r0 = 43
            int r0 = r0 / 0
            monitor-exit(r6)
            return r4
        L52:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5d
        L54:
            monitor-exit(r6)
            return r4
        L56:
            a(r7)     // Catch: java.lang.Throwable -> L5d
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L5b
        L5b:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v.c.e(android.content.Context):o.v.c");
    }
}
