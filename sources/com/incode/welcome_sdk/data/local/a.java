package com.incode.welcome_sdk.data.local;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7693c = new b(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f7694g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f7695h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f7696i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f7697j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7699b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7702f;

    public a(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.f7699b = str;
        this.f7700d = str2;
        this.f7698a = str3;
        this.f7701e = str4;
        this.f7702f = str5;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f7695h;
        int i4 = i3 + 121;
        f7697j = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f7699b;
        int i5 = i3 + 47;
        f7697j = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f7695h + 1;
        f7697j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f7700d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f7695h + 49;
        int i4 = i3 % 128;
        f7697j = i4;
        int i5 = i3 % 2;
        String str = this.f7698a;
        int i6 = i4 + 71;
        f7695h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String e() {
        String str;
        int i2 = 2 % 2;
        int i3 = f7697j;
        int i4 = i3 + 29;
        f7695h = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.f7701e;
            int i5 = 82 / 0;
        } else {
            str = this.f7701e;
        }
        int i6 = i3 + 103;
        f7695h = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f7703a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f7704b = 0;

        private b() {
        }

        @JvmStatic
        public static List<a> e(JSONArray jSONArray) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(jSONArray, "");
            ArrayList arrayList = new ArrayList();
            try {
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i3);
                    String string = jSONObject.getString("codeAlpha2");
                    String string2 = jSONObject.getString("codeAlpha3");
                    String string3 = jSONObject.getString("name");
                    String string4 = jSONObject.getString("flag");
                    String string5 = jSONObject.getString("prefix");
                    Intrinsics.checkNotNull(string);
                    Intrinsics.checkNotNull(string2);
                    Intrinsics.checkNotNull(string3);
                    Intrinsics.checkNotNull(string4);
                    Intrinsics.checkNotNull(string5);
                    arrayList.add(new a(string, string2, string3, string4, string5));
                }
            } catch (Exception e2) {
                Timber.Forest.e(e2);
            }
            int i4 = f7704b + 115;
            f7703a = i4 % 128;
            int i5 = i4 % 2;
            return arrayList;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        int i2 = f7696i + 83;
        f7694g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof com.incode.welcome_sdk.data.local.a) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r4 + 63;
        com.incode.welcome_sdk.data.local.a.f7697j = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r7 = (com.incode.welcome_sdk.data.local.a) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r6.f7699b, r7.f7699b)) == true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.f7700d, r7.f7700d) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.f7698a, r7.f7698a) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.f7701e, r7.f7701e) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.f7702f, r7.f7702f) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = com.incode.welcome_sdk.data.local.a.f7695h + 55;
        com.incode.welcome_sdk.data.local.a.f7697j = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if ((r1 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        r1 = com.incode.welcome_sdk.data.local.a.f7697j + 95;
        com.incode.welcome_sdk.data.local.a.f7695h = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r4 = com.incode.welcome_sdk.data.local.a.f7695h
            int r1 = r4 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.a.f7697j = r0
            int r1 = r1 % r5
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r0 = 94
            int r0 = r0 / r3
            if (r6 != r7) goto L19
        L15:
            return r2
        L16:
            if (r6 != r7) goto L19
            goto L15
        L19:
            boolean r0 = r7 instanceof com.incode.welcome_sdk.data.local.a
            if (r0 != 0) goto L25
            int r1 = r4 + 63
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.a.f7697j = r0
            int r1 = r1 % r5
            return r3
        L25:
            com.incode.welcome_sdk.data.local.a r7 = (com.incode.welcome_sdk.data.local.a) r7
            java.lang.String r1 = r6.f7699b
            java.lang.String r0 = r7.f7699b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            r0 = r0 ^ r2
            if (r0 == r2) goto L6b
            java.lang.String r1 = r6.f7700d
            java.lang.String r0 = r7.f7700d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L3d
            return r3
        L3d:
            java.lang.String r1 = r6.f7698a
            java.lang.String r0 = r7.f7698a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L48
            return r3
        L48:
            java.lang.String r1 = r6.f7701e
            java.lang.String r0 = r7.f7701e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L53
            return r3
        L53:
            java.lang.String r1 = r6.f7702f
            java.lang.String r0 = r7.f7702f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L6a
            int r0 = com.incode.welcome_sdk.data.local.a.f7695h
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.a.f7697j = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L69
            return r2
        L69:
            return r3
        L6a:
            return r2
        L6b:
            int r0 = com.incode.welcome_sdk.data.local.a.f7697j
            int r1 = r0 + 95
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.a.f7695h = r0
            int r1 = r1 % r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f7695h + 37;
        f7697j = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((this.f7699b.hashCode() * 31) + this.f7700d.hashCode()) * 31) + this.f7698a.hashCode()) * 31) + this.f7701e.hashCode()) * 31) + this.f7702f.hashCode();
        int i5 = f7697j + 79;
        f7695h = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7695h + 37;
        f7697j = i3 % 128;
        int i4 = i3 % 2;
        String str = "CountryIso2(codeAlpha2=" + this.f7699b + ", codeAlpha3=" + this.f7700d + ", name=" + this.f7698a + ", flag=" + this.f7701e + ", phonePrefix=" + this.f7702f + ")";
        int i5 = f7695h + 31;
        f7697j = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
