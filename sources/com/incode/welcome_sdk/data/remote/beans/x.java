package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10088b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10089d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10090e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f10091i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10092a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10093c;

    public x(String str, String str2) {
        this.f10093c = str;
        this.f10092a = str2;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f10088b + 81;
        int i4 = i3 % 128;
        f10089d = i4;
        int i5 = i3 % 2;
        String str = this.f10093c;
        int i6 = i4 + 11;
        f10088b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f10088b + 59;
        int i4 = i3 % 128;
        f10089d = i4;
        int i5 = i3 % 2;
        String str = this.f10092a;
        int i6 = i4 + 17;
        f10088b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10094b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10095c = 0;

        private c() {
        }

        @JvmStatic
        public static x d(ResponseBody responseBody) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            x xVar = new x(jSONObject.optString("archiveUrl"), jSONObject.optString("signature"));
            int i3 = f10094b + 53;
            f10095c = i3 % 128;
            int i4 = i3 % 2;
            return xVar;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        new c((byte) 0);
        int i2 = f10090e + 91;
        f10091i = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final x e(ResponseBody responseBody) {
        int i2 = 2 % 2;
        int i3 = f10088b + 55;
        f10089d = i3 % 128;
        int i4 = i3 % 2;
        x xVarD = c.d(responseBody);
        if (i4 == 0) {
            int i5 = 73 / 0;
        }
        int i6 = f10089d + 7;
        f10088b = i6 % 128;
        int i7 = i6 % 2;
        return xVarD;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            int i3 = f10088b + 33;
            f10089d = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        x xVar = (x) obj;
        if ((!Intrinsics.areEqual(this.f10093c, xVar.f10093c)) || !Intrinsics.areEqual(this.f10092a, xVar.f10092a)) {
            return false;
        }
        int i5 = f10088b + 5;
        f10089d = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        String str = this.f10093c;
        int iHashCode2 = 1;
        if (str == null) {
            int i3 = f10088b + 39;
            f10089d = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = iHashCode * 31;
        String str2 = this.f10092a;
        if (str2 == null) {
            int i5 = f10088b + 81;
            f10089d = i5 % 128;
            if (i5 % 2 != 0) {
                iHashCode2 = 0;
            }
        } else {
            iHashCode2 = str2.hashCode();
        }
        return i4 + iHashCode2;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f10089d + 71;
        f10088b = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseAddNOM151Archive(archiveUrl=" + this.f10093c + ", signature=" + this.f10092a + ")";
        int i5 = f10089d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10088b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
