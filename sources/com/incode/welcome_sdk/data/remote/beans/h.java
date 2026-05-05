package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f9677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9678f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ h[] f9679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9680h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9681i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9682j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9683a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f9675c = new h("SINGLE_FRAME", 0, "SINGLE_FRAME");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f9674b = new h("MULTIMODAL", 1, "MULTIMODAL");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f9676d = new h("VIDEO_LIVENESS", 2, "VIDEOLIVENESS");

    private h(String str, int i2, String str2) {
        this.f9683a = str2;
    }

    public final String a() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9678f + 123;
        int i4 = i3 % 128;
        f9682j = i4;
        if (i3 % 2 == 0) {
            str = this.f9683a;
            int i5 = 35 / 0;
        } else {
            str = this.f9683a;
        }
        int i6 = i4 + 97;
        f9678f = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        h[] hVarArrE = e();
        f9679g = hVarArrE;
        EnumEntriesKt.enumEntries(hVarArrE);
        f9677e = new d((byte) 0);
        int i2 = f9681i + 123;
        f9680h = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9684d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9685e = 0;

        private d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4, com.incode.welcome_sdk.data.remote.beans.h.f9674b.a()) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            r1 = com.incode.welcome_sdk.data.remote.beans.h.d.f9684d + 57;
            com.incode.welcome_sdk.data.remote.beans.h.d.f9685e = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if ((r1 % 2) != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            r2 = com.incode.welcome_sdk.data.remote.beans.h.f9674b;
            r1 = com.incode.welcome_sdk.data.remote.beans.h.d.f9685e + 117;
            com.incode.welcome_sdk.data.remote.beans.h.d.f9684d = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            if ((r1 % 2) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            r0 = 45 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            r0 = com.incode.welcome_sdk.data.remote.beans.h.f9674b;
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(r4, com.incode.welcome_sdk.data.remote.beans.h.f9676d.a())) == true) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        
            r1 = com.incode.welcome_sdk.data.remote.beans.h.d.f9685e + 81;
            com.incode.welcome_sdk.data.remote.beans.h.d.f9684d = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        
            return com.incode.welcome_sdk.data.remote.beans.h.f9676d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4, com.incode.welcome_sdk.data.remote.beans.h.f9675c.a()) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        
            return com.incode.welcome_sdk.data.remote.beans.h.f9675c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4, com.incode.welcome_sdk.data.remote.beans.h.f9675c.a()) != false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.incode.welcome_sdk.data.remote.beans.h a(java.lang.String r4) {
            /*
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.data.remote.beans.h.d.f9685e
                int r1 = r0 + 37
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.h.d.f9684d = r0
                int r1 = r1 % r3
                java.lang.String r0 = ""
                if (r1 != 0) goto L26
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                com.incode.welcome_sdk.data.remote.beans.h r0 = com.incode.welcome_sdk.data.remote.beans.h.f9675c
                java.lang.String r0 = r0.a()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
                r0 = 63
                int r0 = r0 / 0
                if (r1 == 0) goto L36
            L23:
                com.incode.welcome_sdk.data.remote.beans.h r0 = com.incode.welcome_sdk.data.remote.beans.h.f9675c
                return r0
            L26:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                com.incode.welcome_sdk.data.remote.beans.h r0 = com.incode.welcome_sdk.data.remote.beans.h.f9675c
                java.lang.String r0 = r0.a()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
                if (r0 == 0) goto L36
                goto L23
            L36:
                com.incode.welcome_sdk.data.remote.beans.h r0 = com.incode.welcome_sdk.data.remote.beans.h.f9674b
                java.lang.String r0 = r0.a()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
                r2 = 0
                if (r0 == 0) goto L66
                int r0 = com.incode.welcome_sdk.data.remote.beans.h.d.f9684d
                int r1 = r0 + 57
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.h.d.f9685e = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L60
                com.incode.welcome_sdk.data.remote.beans.h r2 = com.incode.welcome_sdk.data.remote.beans.h.f9674b
                int r0 = com.incode.welcome_sdk.data.remote.beans.h.d.f9685e
                int r1 = r0 + 117
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.h.d.f9684d = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L5f
                r0 = 45
                int r0 = r0 / 0
            L5f:
                return r2
            L60:
                com.incode.welcome_sdk.data.remote.beans.h r0 = com.incode.welcome_sdk.data.remote.beans.h.f9674b
                r2.hashCode()
                throw r2
            L66:
                com.incode.welcome_sdk.data.remote.beans.h r0 = com.incode.welcome_sdk.data.remote.beans.h.f9676d
                java.lang.String r0 = r0.a()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
                r0 = 1
                r1 = r1 ^ r0
                if (r1 == r0) goto L80
                int r0 = com.incode.welcome_sdk.data.remote.beans.h.d.f9685e
                int r1 = r0 + 81
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.h.d.f9684d = r0
                int r1 = r1 % r3
                com.incode.welcome_sdk.data.remote.beans.h r0 = com.incode.welcome_sdk.data.remote.beans.h.f9676d
                return r0
            L80:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.h.d.a(java.lang.String):com.incode.welcome_sdk.data.remote.beans.h");
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    private static final /* synthetic */ h[] e() {
        h[] hVarArr;
        int i2 = 2 % 2;
        int i3 = f9678f + 51;
        int i4 = i3 % 128;
        f9682j = i4;
        if (i3 % 2 == 0) {
            hVarArr = new h[3];
            hVarArr[0] = f9675c;
            hVarArr[1] = f9674b;
            hVarArr[3] = f9676d;
        } else {
            hVarArr = new h[]{f9675c, f9674b, f9676d};
        }
        int i5 = i4 + 107;
        f9678f = i5 % 128;
        if (i5 % 2 == 0) {
            return hVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static h valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9678f + 33;
        f9682j = i3 % 128;
        int i4 = i3 % 2;
        h hVar = (h) Enum.valueOf(h.class, str);
        if (i4 == 0) {
            int i5 = 36 / 0;
        }
        return hVar;
    }

    public static h[] values() {
        h[] hVarArr;
        int i2 = 2 % 2;
        int i3 = f9678f + 79;
        f9682j = i3 % 128;
        if (i3 % 2 == 0) {
            hVarArr = (h[]) f9679g.clone();
            int i4 = 32 / 0;
        } else {
            hVarArr = (h[]) f9679g.clone();
        }
        int i5 = f9678f + 63;
        f9682j = i5 % 128;
        int i6 = i5 % 2;
        return hVarArr;
    }
}
