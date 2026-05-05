package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.TemplateModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ResponseInitFaceAuth {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9151a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9152b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9153c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9154d = 0;
    public final boolean enrolled;
    public final String name;
    public final TemplateModel template;
    public final String token;
    public final String uuid;

    public ResponseInitFaceAuth(String str, boolean z2, String str2, TemplateModel templateModel, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(templateModel, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.token = str;
        this.enrolled = z2;
        this.name = str2;
        this.template = templateModel;
        this.uuid = str3;
    }

    static {
        int i2 = 1 + 111;
        f9154d = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseInitFaceAuth)) {
            return false;
        }
        ResponseInitFaceAuth responseInitFaceAuth = (ResponseInitFaceAuth) obj;
        if (!Intrinsics.areEqual(this.token, responseInitFaceAuth.token)) {
            return false;
        }
        if (this.enrolled != responseInitFaceAuth.enrolled) {
            int i3 = f9151a + 105;
            f9153c = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.name, responseInitFaceAuth.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.template, responseInitFaceAuth.template)) {
            int i5 = f9151a;
            int i6 = i5 + 115;
            f9153c = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 61;
            f9153c = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.uuid, responseInitFaceAuth.uuid)) {
            return true;
        }
        int i10 = f9153c + 31;
        f9151a = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9151a + 117;
        f9153c = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((this.token.hashCode() * 31) + Boolean.hashCode(this.enrolled)) * 31) + this.name.hashCode()) * 31) + this.template.hashCode()) * 31) + this.uuid.hashCode();
        int i5 = f9153c + 85;
        f9151a = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9151a + 37;
        f9153c = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseInitFaceAuth(token=" + this.token + ", enrolled=" + this.enrolled + ", name=" + this.name + ", template=" + this.template + ", uuid=" + this.uuid + ")";
        int i5 = f9153c + 89;
        f9151a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ ResponseInitFaceAuth copy$default(ResponseInitFaceAuth responseInitFaceAuth, String str, boolean z2, String str2, TemplateModel templateModel, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f9153c;
        int i5 = i4 + 3;
        f9151a = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            str = responseInitFaceAuth.token;
        }
        if ((i2 & 2) != 0) {
            z2 = responseInitFaceAuth.enrolled;
        }
        if ((i2 & 4) != 0) {
            str2 = responseInitFaceAuth.name;
        }
        if ((i2 & 8) != 0) {
            templateModel = responseInitFaceAuth.template;
            int i7 = i4 + 25;
            f9151a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 3;
            }
        }
        if ((i2 & 16) != 0) {
            int i9 = i4 + 7;
            f9151a = i9 % 128;
            if (i9 % 2 != 0) {
                String str4 = responseInitFaceAuth.uuid;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = responseInitFaceAuth.uuid;
            int i10 = i4 + 23;
            f9151a = i10 % 128;
            int i11 = i10 % 2;
        }
        return responseInitFaceAuth.copy(str, z2, str2, templateModel, str3);
    }

    public final ResponseInitFaceAuth copy(String str, boolean z2, String str2, TemplateModel templateModel, String str3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(templateModel, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ResponseInitFaceAuth responseInitFaceAuth = new ResponseInitFaceAuth(str, z2, str2, templateModel, str3);
        int i3 = f9151a + 57;
        f9153c = i3 % 128;
        if (i3 % 2 != 0) {
            return responseInitFaceAuth;
        }
        throw null;
    }

    public final String component5() {
        int i2 = 2 % 2;
        int i3 = f9151a;
        int i4 = i3 + 121;
        f9153c = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.uuid;
        int i5 = i3 + 15;
        f9153c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TemplateModel component4() {
        int i2 = 2 % 2;
        int i3 = f9151a + 67;
        int i4 = i3 % 128;
        f9153c = i4;
        int i5 = i3 % 2;
        TemplateModel templateModel = this.template;
        int i6 = i4 + 27;
        f9151a = i6 % 128;
        if (i6 % 2 == 0) {
            return templateModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f9153c + 71;
        int i4 = i3 % 128;
        f9151a = i4;
        int i5 = i3 % 2;
        String str = this.name;
        int i6 = i4 + 19;
        f9153c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean component2() {
        int i2 = 2 % 2;
        int i3 = f9153c + 51;
        f9151a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.enrolled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f9151a;
        int i4 = i3 + 5;
        f9153c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.token;
        int i6 = i3 + 125;
        f9153c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 77 / 0;
        }
        return str;
    }
}
