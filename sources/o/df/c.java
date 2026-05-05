package o.df;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes6.dex */
final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22935a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f22936b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22937c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22938d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22939e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r0 = r8 * 4
            int r0 = 120 - r0
            int r1 = r7 * 2
            int r8 = 4 - r1
            byte[] r7 = o.df.c.$$a
            int r2 = r6 * 3
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2d
            r3 = r4
            r2 = r5
        L17:
            int r0 = -r0
            int r0 = r0 + r3
            int r8 = r8 + 1
        L1b:
            byte r1 = (byte) r0
            r6[r2] = r1
            if (r2 != r4) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L26:
            int r2 = r2 + 1
            r1 = r7[r8]
            r3 = r0
            r0 = r1
            goto L17
        L2d:
            r2 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.c.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22937c = 0;
        f22938d = 1;
        f22939e = 0;
        f22935a = 1;
        b();
        int i2 = f22937c + 69;
        f22938d = i2 % 128;
        int i3 = i2 % 2;
    }

    c() {
    }

    static void b() {
        f22936b = new char[]{56482, 56524, 56528, 56520, 56546, 56388, 56386, 56331, 56720, 56709, 56421, 56428, 56718, 56726, 56725, 56718, 56724, 56734, 56728, 56723, 56715, 56420, 56407, 56441, 56727};
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static o.df.a d(java.lang.String r9) throws java.lang.Throwable {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.df.c.f22935a
            int r1 = r0 + 65
            int r0 = r1 % 128
            o.df.c.f22939e = r0
            int r1 = r1 % r4
            r8 = 4
            r5 = 2361477(0x240885, float:3.309134E-39)
            r2 = 85333(0x14d55, float:1.19577E-40)
            r3 = -1
            r7 = 1
            r6 = 0
            if (r1 == 0) goto L2d
            int r1 = r9.hashCode()
            r0 = 95
            int r0 = r0 / r6
            if (r1 == r2) goto L5b
            if (r1 == r5) goto L36
        L23:
            if (r3 == 0) goto Laa
            if (r3 != r7) goto L79
            o.df.b r0 = new o.df.b
            r0.<init>()
            return r0
        L2d:
            int r0 = r9.hashCode()
            if (r0 == r2) goto L5b
            if (r0 == r5) goto L36
            goto L23
        L36:
            int[] r2 = new int[]{r6, r8, r6, r4}
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "\u0001\u0000\u0000\u0001"
            f(r0, r2, r6, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r9.equals(r0)
            r0 = r0 ^ r7
            if (r0 == r7) goto L23
            int r0 = o.df.c.f22935a
            int r1 = r0 + 113
            int r0 = r1 % 128
            o.df.c.f22939e = r0
            int r1 = r1 % r4
            r3 = r6
            goto L23
        L5b:
            r1 = 3
            r0 = 111(0x6f, float:1.56E-43)
            int[] r2 = new int[]{r8, r1, r0, r6}
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "\u0001\u0000\u0001"
            f(r0, r2, r6, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L23
            r3 = r7
            goto L23
        L79:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 170(0xaa, float:2.38E-43)
            r2 = 14
            r1 = 7
            r0 = 18
            int[] r2 = new int[]{r1, r0, r3, r2}
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000"
            f(r0, r2, r7, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        Laa:
            o.df.d r0 = new o.df.d
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.c.d(java.lang.String):o.df.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01b2 A[Catch: all -> 0x01f4, TryCatch #0 {all -> 0x01f4, blocks: (B:13:0x003a, B:15:0x004b, B:16:0x0080, B:29:0x00c5, B:31:0x00de, B:32:0x0111, B:44:0x01a1, B:46:0x01b2, B:47:0x01e9, B:34:0x0126, B:36:0x013f, B:37:0x017a), top: B:70:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(java.lang.String r25, int[] r26, boolean r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.c.f(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{67, Ascii.SI, 99, -76};
        $$b = 179;
    }
}
